package com.onedelhi.secure;

import android.graphics.Bitmap;

/* renamed from: com.onedelhi.secure.dc */
public class C1963dc implements ob2 {

    /* renamed from: a */
    public final C1965b f10699a = new C1965b();

    /* renamed from: a */
    public final yi1<C1964a, Bitmap> f10700a = new yi1<>();

    @hw4
    /* renamed from: com.onedelhi.secure.dc$a */
    public static class C1964a implements k33 {

        /* renamed from: a */
        public int f10701a;

        /* renamed from: a */
        public Bitmap.Config f10702a;

        /* renamed from: a */
        public final C1965b f10703a;

        /* renamed from: b */
        public int f10704b;

        public C1964a(C1965b bVar) {
            this.f10703a = bVar;
        }

        /* renamed from: a */
        public void mo14602a() {
            this.f10703a.mo19086c(this);
        }

        /* renamed from: b */
        public void mo14603b(int i, int i2, Bitmap.Config config) {
            this.f10701a = i;
            this.f10704b = i2;
            this.f10702a = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1964a)) {
                return false;
            }
            C1964a aVar = (C1964a) obj;
            return this.f10701a == aVar.f10701a && this.f10704b == aVar.f10704b && this.f10702a == aVar.f10702a;
        }

        public int hashCode() {
            int i = ((this.f10701a * 31) + this.f10704b) * 31;
            Bitmap.Config config = this.f10702a;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C1963dc.m13048g(this.f10701a, this.f10704b, this.f10702a);
        }
    }

    @hw4
    /* renamed from: com.onedelhi.secure.dc$b */
    public static class C1965b extends C2634kj<C1964a> {
        /* renamed from: d */
        public C1964a mo14607a() {
            return new C1964a(this);
        }

        /* renamed from: e */
        public C1964a mo14609e(int i, int i2, Bitmap.Config config) {
            C1964a aVar = (C1964a) mo19085b();
            aVar.mo14603b(i, i2, config);
            return aVar;
        }
    }

    /* renamed from: g */
    public static String m13048g(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    /* renamed from: h */
    public static String m13049h(Bitmap bitmap) {
        return m13048g(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* renamed from: a */
    public String mo14595a(int i, int i2, Bitmap.Config config) {
        return m13048g(i, i2, config);
    }

    /* renamed from: b */
    public String mo14596b(Bitmap bitmap) {
        return m13049h(bitmap);
    }

    /* renamed from: c */
    public void mo14597c(Bitmap bitmap) {
        this.f10700a.mo27503d(this.f10699a.mo14609e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    /* renamed from: d */
    public Bitmap mo14598d(int i, int i2, Bitmap.Config config) {
        return this.f10700a.mo27500a(this.f10699a.mo14609e(i, i2, config));
    }

    /* renamed from: e */
    public int mo14599e(Bitmap bitmap) {
        return oq4.m24020h(bitmap);
    }

    /* renamed from: f */
    public Bitmap mo14600f() {
        return this.f10700a.mo27504f();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f10700a;
    }
}
