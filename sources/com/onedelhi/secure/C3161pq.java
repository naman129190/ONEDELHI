package com.onedelhi.secure;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.pq */
public class C3161pq implements cu0<ByteBuffer> {

    /* renamed from: a */
    public static final String f18642a = "ByteBufferEncoder";

    /* renamed from: c */
    public boolean mo14384b(@mr2 ByteBuffer byteBuffer, @mr2 File file, @mr2 zw2 zw2) {
        try {
            C3733uq.m29495e(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable(f18642a, 3)) {
                Log.d(f18642a, "Failed to write data", e);
            }
            return false;
        }
    }
}
