package com.onedelhi.secure;

public abstract class gj0 {

    /* renamed from: c */
    public static final int f29205c = 1;

    /* renamed from: d */
    public static final int f29206d = 256;

    /* renamed from: e */
    public static final int f29207e = 255;

    /* renamed from: a */
    public final int f29208a;

    /* renamed from: a */
    public final byte[] f29209a = new byte[256];

    /* renamed from: b */
    public int f29210b = 0;

    public gj0(int i) {
        if (i < 1 || i > 256) {
            throw new IllegalArgumentException();
        }
        this.f29208a = i;
    }
}
