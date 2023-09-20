package com.onedelhi.secure;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

public class l21 extends o62<ParcelFileDescriptor> {
    public l21(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @mr2
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo14075a() {
        return ParcelFileDescriptor.class;
    }

    /* renamed from: g */
    public void mo14076e(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    /* renamed from: h */
    public ParcelFileDescriptor mo14077f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
