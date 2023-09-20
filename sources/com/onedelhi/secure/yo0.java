package com.onedelhi.secure;

import android.graphics.drawable.Drawable;

public class yo0 implements kh4<Drawable> {

    /* renamed from: a */
    public final int f23264a;

    /* renamed from: a */
    public zo0 f23265a;

    /* renamed from: a */
    public final boolean f23266a;

    /* renamed from: com.onedelhi.secure.yo0$a */
    public static class C4018a {

        /* renamed from: b */
        public static final int f23267b = 300;

        /* renamed from: a */
        public final int f23268a;

        /* renamed from: a */
        public boolean f23269a;

        public C4018a() {
            this(300);
        }

        public C4018a(int i) {
            this.f23268a = i;
        }

        /* renamed from: a */
        public yo0 mo27651a() {
            return new yo0(this.f23268a, this.f23269a);
        }

        /* renamed from: b */
        public C4018a mo27652b(boolean z) {
            this.f23269a = z;
            return this;
        }
    }

    public yo0(int i, boolean z) {
        this.f23264a = i;
        this.f23266a = z;
    }

    /* renamed from: a */
    public jh4<Drawable> mo16140a(vd0 vd0, boolean z) {
        return vd0 == vd0.MEMORY_CACHE ? fr2.m15244b() : mo27650b();
    }

    /* renamed from: b */
    public final jh4<Drawable> mo27650b() {
        if (this.f23265a == null) {
            this.f23265a = new zo0(this.f23264a, this.f23266a);
        }
        return this.f23265a;
    }
}
