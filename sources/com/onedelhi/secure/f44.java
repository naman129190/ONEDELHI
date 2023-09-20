package com.onedelhi.secure;

import android.graphics.Bitmap;
import com.onedelhi.secure.oo0;
import java.io.IOException;
import java.io.InputStream;

public class f44 implements ik3<InputStream, Bitmap> {

    /* renamed from: a */
    public final oo0 f11820a;

    /* renamed from: a */
    public final C3131pa f11821a;

    /* renamed from: com.onedelhi.secure.f44$a */
    public static class C2117a implements oo0.C3078b {

        /* renamed from: a */
        public final kw0 f11822a;

        /* renamed from: a */
        public final ug3 f11823a;

        public C2117a(ug3 ug3, kw0 kw0) {
            this.f11823a = ug3;
            this.f11822a = kw0;
        }

        /* renamed from: a */
        public void mo15773a() {
            this.f11823a.mo25605b();
        }

        /* renamed from: b */
        public void mo15774b(C2355hm hmVar, Bitmap bitmap) throws IOException {
            IOException b = this.f11822a.mo19205b();
            if (b != null) {
                if (bitmap != null) {
                    hmVar.mo16798c(bitmap);
                }
                throw b;
            }
        }
    }

    public f44(oo0 oo0, C3131pa paVar) {
        this.f11820a = oo0;
        this.f11821a = paVar;
    }

    /* renamed from: c */
    public ck3<Bitmap> mo14336a(@mr2 InputStream inputStream, int i, int i2, @mr2 zw2 zw2) throws IOException {
        ug3 ug3;
        boolean z;
        if (inputStream instanceof ug3) {
            ug3 = (ug3) inputStream;
            z = false;
        } else {
            ug3 = new ug3(inputStream, this.f11821a);
            z = true;
        }
        kw0 c = kw0.m20055c(ug3);
        try {
            return this.f11820a.mo22039g(new md2(c), i, i2, zw2, new C2117a(ug3, c));
        } finally {
            c.release();
            if (z) {
                ug3.release();
            }
        }
    }

    /* renamed from: d */
    public boolean mo14337b(@mr2 InputStream inputStream, @mr2 zw2 zw2) {
        return this.f11820a.mo22042p(inputStream);
    }
}
