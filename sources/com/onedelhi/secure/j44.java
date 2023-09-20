package com.onedelhi.secure;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class j44 extends o62<InputStream> {

    /* renamed from: a */
    public static final UriMatcher f14007a;

    /* renamed from: n */
    public static final int f14008n = 1;

    /* renamed from: o */
    public static final int f14009o = 2;

    /* renamed from: p */
    public static final int f14010p = 3;

    /* renamed from: q */
    public static final int f14011q = 4;

    /* renamed from: r */
    public static final int f14012r = 5;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f14007a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public j44(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @mr2
    /* renamed from: a */
    public Class<InputStream> mo14075a() {
        return InputStream.class;
    }

    /* renamed from: g */
    public void mo14076e(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* renamed from: h */
    public InputStream mo14077f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream i = mo18139i(uri, contentResolver);
        if (i != null) {
            return i;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    /* renamed from: i */
    public final InputStream mo18139i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f14007a.match(uri);
        if (match != 1) {
            if (match == 3) {
                return mo18140j(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return mo18140j(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: j */
    public final InputStream mo18140j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
