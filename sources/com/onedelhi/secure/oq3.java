package com.onedelhi.secure;

import com.onedelhi.secure.mz0;
import com.onedelhi.secure.n33;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class oq3 {

    /* renamed from: a */
    public final lb2<ky1, String> f18068a = new lb2<>(1000);

    /* renamed from: a */
    public final n33.C2922a<C3084b> f18069a = mz0.m22232e(10, new C3083a());

    /* renamed from: com.onedelhi.secure.oq3$a */
    public class C3083a implements mz0.C2906d<C3084b> {
        public C3083a() {
        }

        /* renamed from: b */
        public C3084b mo20814a() {
            try {
                return new C3084b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.oq3$b */
    public static final class C3084b implements mz0.C2908f {

        /* renamed from: a */
        public final k34 f18071a = k34.m19424a();

        /* renamed from: a */
        public final MessageDigest f18072a;

        public C3084b(MessageDigest messageDigest) {
            this.f18072a = messageDigest;
        }

        @mr2
        /* renamed from: b */
        public k34 mo20819b() {
            return this.f18071a;
        }
    }

    /* renamed from: a */
    public final String mo22054a(ky1 ky1) {
        C3084b bVar = (C3084b) g43.m15509d(this.f18069a.mo20818b());
        try {
            ky1.mo13311a(bVar.f18072a);
            return oq4.m24038z(bVar.f18072a.digest());
        } finally {
            this.f18069a.mo20817a(bVar);
        }
    }

    /* renamed from: b */
    public String mo22055b(ky1 ky1) {
        String k;
        synchronized (this.f18068a) {
            k = this.f18068a.mo19405k(ky1);
        }
        if (k == null) {
            k = mo22054a(ky1);
        }
        synchronized (this.f18068a) {
            this.f18068a.mo19409o(ky1, k);
        }
        return k;
    }
}
