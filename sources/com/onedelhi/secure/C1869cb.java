package com.onedelhi.secure;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.onedelhi.secure.cb */
public final class C1869cb extends o62<AssetFileDescriptor> {
    public C1869cb(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @mr2
    /* renamed from: a */
    public Class<AssetFileDescriptor> mo14075a() {
        return AssetFileDescriptor.class;
    }

    /* renamed from: g */
    public void mo14076e(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* renamed from: h */
    public AssetFileDescriptor mo14077f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
