package com.onedelhi.secure;

import java.io.IOException;
import java.io.InputStream;

public abstract class i31 implements Cloneable {
    /* renamed from: b */
    public static int m51763b(i31[] i31Arr) {
        int i = 0;
        for (i31 a : i31Arr) {
            i += a.mo32375a();
        }
        return i;
    }

    /* renamed from: d */
    public static int m51764d(i31[] i31Arr) {
        int i = 0;
        for (i31 c : i31Arr) {
            i += c.mo32376c();
        }
        return i;
    }

    /* renamed from: a */
    public abstract int mo32375a();

    /* renamed from: c */
    public abstract int mo32376c();

    /* renamed from: e */
    public abstract h31 mo37820e();

    /* renamed from: f */
    public InputStream mo37821f(InputStream inputStream) throws IOException {
        return mo37822g(inputStream, C4477aa.m36107b());
    }

    /* renamed from: g */
    public abstract InputStream mo37822g(InputStream inputStream, C4477aa aaVar) throws IOException;

    /* renamed from: h */
    public q31 mo37823h(q31 q31) {
        return mo37824i(q31, C4477aa.m36107b());
    }

    /* renamed from: i */
    public abstract q31 mo37824i(q31 q31, C4477aa aaVar);
}
