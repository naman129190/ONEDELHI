package com.onedelhi.secure;

import android.graphics.PointF;
import com.onedelhi.secure.wv1;
import java.io.IOException;

public class w23 implements is4<PointF> {

    /* renamed from: a */
    public static final w23 f22042a = new w23();

    /* renamed from: b */
    public PointF mo13530a(wv1 wv1, float f) throws IOException {
        wv1.C3877b H = wv1.mo17955H();
        if (H == wv1.C3877b.BEGIN_ARRAY) {
            return jw1.m19225e(wv1, f);
        }
        if (H == wv1.C3877b.BEGIN_OBJECT) {
            return jw1.m19225e(wv1, f);
        }
        if (H == wv1.C3877b.NUMBER) {
            PointF pointF = new PointF(((float) wv1.mo17974m()) * f, ((float) wv1.mo17974m()) * f);
            while (wv1.mo17970h()) {
                wv1.mo17963Y();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + H);
    }
}
