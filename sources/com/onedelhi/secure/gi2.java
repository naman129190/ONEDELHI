package com.onedelhi.secure;

import com.onedelhi.secure.tt0;
import java.io.IOException;
import java.io.OutputStream;

public final class gi2 {

    /* renamed from: a */
    public static final gi2 f29201a = new C5435a().mo36749a();

    /* renamed from: a */
    public final fi2 f29202a;

    /* renamed from: com.onedelhi.secure.gi2$a */
    public static final class C5435a {

        /* renamed from: a */
        public fi2 f29203a = null;

        /* renamed from: a */
        public gi2 mo36749a() {
            return new gi2(this.f29203a);
        }

        /* renamed from: b */
        public C5435a mo36750b(fi2 fi2) {
            this.f29203a = fi2;
            return this;
        }
    }

    public gi2(fi2 fi2) {
        this.f29202a = fi2;
    }

    /* renamed from: a */
    public static gi2 m49505a() {
        return f29201a;
    }

    /* renamed from: d */
    public static C5435a m49506d() {
        return new C5435a();
    }

    @tt0.C6899b
    /* renamed from: b */
    public fi2 mo36745b() {
        fi2 fi2 = this.f29202a;
        return fi2 == null ? fi2.m47889f() : fi2;
    }

    @o63(tag = 1)
    @tt0.C6898a(name = "messagingClientEvent")
    /* renamed from: c */
    public fi2 mo36746c() {
        return this.f29202a;
    }

    /* renamed from: e */
    public byte[] mo36747e() {
        return k63.m54090b(this);
    }

    /* renamed from: f */
    public void mo36748f(OutputStream outputStream) throws IOException {
        k63.m54089a(this, outputStream);
    }
}
