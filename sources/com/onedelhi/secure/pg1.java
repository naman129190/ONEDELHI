package com.onedelhi.secure;

import android.util.Log;
import java.io.File;
import java.io.IOException;

public class pg1 implements nk3<ng1> {

    /* renamed from: a */
    public static final String f18524a = "GifEncoder";

    @mr2
    /* renamed from: a */
    public vt0 mo14793a(@mr2 zw2 zw2) {
        return vt0.SOURCE;
    }

    /* renamed from: c */
    public boolean mo14384b(@mr2 ck3<ng1> ck3, @mr2 File file, @mr2 zw2 zw2) {
        try {
            C3733uq.m29495e(ck3.get().mo21233f(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable(f18524a, 5)) {
                Log.w(f18524a, "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
