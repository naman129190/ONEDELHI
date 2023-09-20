package com.onedelhi.secure;

import java.io.File;
import java.io.IOException;

public class ha0 {

    /* renamed from: a */
    public final t21 f29568a;

    /* renamed from: a */
    public final String f29569a;

    public ha0(String str, t21 t21) {
        this.f29569a = str;
        this.f29568a = t21;
    }

    /* renamed from: a */
    public boolean mo37227a() {
        try {
            return mo37228b().createNewFile();
        } catch (IOException e) {
            o92 f = o92.m59120f();
            f.mo41616e("Error creating marker: " + this.f29569a, e);
            return false;
        }
    }

    /* renamed from: b */
    public final File mo37228b() {
        return this.f29568a.mo44760f(this.f29569a);
    }

    /* renamed from: c */
    public boolean mo37229c() {
        return mo37228b().exists();
    }

    /* renamed from: d */
    public boolean mo37230d() {
        return mo37228b().delete();
    }
}
