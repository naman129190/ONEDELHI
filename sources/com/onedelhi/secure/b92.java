package com.onedelhi.secure;

import java.io.File;

public class b92 {

    /* renamed from: a */
    public static final int f26233a = 65536;

    /* renamed from: a */
    public static final C4654b f26234a = new C4654b();

    /* renamed from: a */
    public static final String f26235a = "userlog";

    /* renamed from: a */
    public o21 f26236a;

    /* renamed from: a */
    public final t21 f26237a;

    /* renamed from: com.onedelhi.secure.b92$b */
    public static final class C4654b implements o21 {
        public C4654b() {
        }

        /* renamed from: a */
        public byte[] mo31465a() {
            return null;
        }

        /* renamed from: b */
        public void mo31466b() {
        }

        /* renamed from: c */
        public String mo31467c() {
            return null;
        }

        /* renamed from: d */
        public void mo31468d(long j, String str) {
        }

        /* renamed from: e */
        public void mo31469e() {
        }
    }

    public b92(t21 t21) {
        this.f26237a = t21;
        this.f26236a = f26234a;
    }

    public b92(t21 t21, String str) {
        this(t21);
        mo31462e(str);
    }

    /* renamed from: a */
    public void mo31458a() {
        this.f26236a.mo31466b();
    }

    /* renamed from: b */
    public byte[] mo31459b() {
        return this.f26236a.mo31465a();
    }

    @ts2
    /* renamed from: c */
    public String mo31460c() {
        return this.f26236a.mo31467c();
    }

    /* renamed from: d */
    public final File mo31461d(String str) {
        return this.f26237a.mo44770p(str, f26235a);
    }

    /* renamed from: e */
    public final void mo31462e(String str) {
        this.f26236a.mo31469e();
        this.f26236a = f26234a;
        if (str != null) {
            mo31463f(mo31461d(str), 65536);
        }
    }

    /* renamed from: f */
    public void mo31463f(File file, int i) {
        this.f26236a = new fa3(file, i);
    }

    /* renamed from: g */
    public void mo31464g(long j, String str) {
        this.f26236a.mo31468d(j, str);
    }
}
