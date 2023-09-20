package com.onedelhi.secure;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

public class e44 extends C1949db<InputStream> {
    public e44(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @mr2
    /* renamed from: a */
    public Class<InputStream> mo14075a() {
        return InputStream.class;
    }

    /* renamed from: g */
    public void mo14573e(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* renamed from: h */
    public InputStream mo14574f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
