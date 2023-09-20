package com.onedelhi.secure;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

public class k21 extends C1949db<ParcelFileDescriptor> {
    public k21(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @mr2
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo14075a() {
        return ParcelFileDescriptor.class;
    }

    /* renamed from: g */
    public void mo14573e(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    /* renamed from: h */
    public ParcelFileDescriptor mo14574f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
