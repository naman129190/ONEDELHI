package com.onedelhi.secure;

import android.graphics.Bitmap;

public final class b43 {
    @hw4

    /* renamed from: b */
    public static final Bitmap.Config f9656b = Bitmap.Config.RGB_565;

    /* renamed from: a */
    public final int f9657a;

    /* renamed from: a */
    public final Bitmap.Config f9658a;

    /* renamed from: b */
    public final int f9659b;

    /* renamed from: c */
    public final int f9660c;

    /* renamed from: com.onedelhi.secure.b43$a */
    public static class C1747a {

        /* renamed from: a */
        public final int f9661a;

        /* renamed from: a */
        public Bitmap.Config f9662a;

        /* renamed from: b */
        public final int f9663b;

        /* renamed from: c */
        public int f9664c;

        public C1747a(int i) {
            this(i, i);
        }

        public C1747a(int i, int i2) {
            this.f9664c = 1;
            if (i <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            } else if (i2 > 0) {
                this.f9661a = i;
                this.f9663b = i2;
            } else {
                throw new IllegalArgumentException("Height must be > 0");
            }
        }

        /* renamed from: a */
        public b43 mo13405a() {
            return new b43(this.f9661a, this.f9663b, this.f9662a, this.f9664c);
        }

        /* renamed from: b */
        public Bitmap.Config mo13406b() {
            return this.f9662a;
        }

        /* renamed from: c */
        public C1747a mo13407c(@ts2 Bitmap.Config config) {
            this.f9662a = config;
            return this;
        }

        /* renamed from: d */
        public C1747a mo13408d(int i) {
            if (i > 0) {
                this.f9664c = i;
                return this;
            }
            throw new IllegalArgumentException("Weight must be > 0");
        }
    }

    public b43(int i, int i2, Bitmap.Config config, int i3) {
        this.f9658a = (Bitmap.Config) g43.m15510e(config, "Config must not be null");
        this.f9657a = i;
        this.f9659b = i2;
        this.f9660c = i3;
    }

    /* renamed from: a */
    public Bitmap.Config mo13398a() {
        return this.f9658a;
    }

    /* renamed from: b */
    public int mo13399b() {
        return this.f9659b;
    }

    /* renamed from: c */
    public int mo13400c() {
        return this.f9660c;
    }

    /* renamed from: d */
    public int mo13401d() {
        return this.f9657a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b43)) {
            return false;
        }
        b43 b43 = (b43) obj;
        return this.f9659b == b43.f9659b && this.f9657a == b43.f9657a && this.f9660c == b43.f9660c && this.f9658a == b43.f9658a;
    }

    public int hashCode() {
        return (((((this.f9657a * 31) + this.f9659b) * 31) + this.f9658a.hashCode()) * 31) + this.f9660c;
    }

    public String toString() {
        return "PreFillSize{width=" + this.f9657a + ", height=" + this.f9659b + ", config=" + this.f9658a + ", weight=" + this.f9660c + '}';
    }
}
