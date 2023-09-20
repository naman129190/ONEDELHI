package com.onedelhi.secure;

import com.onedelhi.secure.mz0;
import com.onedelhi.secure.n33;

public final class r82<Z> implements ck3<Z>, mz0.C2908f {

    /* renamed from: a */
    public static final n33.C2922a<r82<?>> f19682a = mz0.m22232e(20, new C3381a());

    /* renamed from: a */
    public ck3<Z> f19683a;

    /* renamed from: a */
    public final k34 f19684a = k34.m19424a();

    /* renamed from: b */
    public boolean f19685b;

    /* renamed from: c */
    public boolean f19686c;

    /* renamed from: com.onedelhi.secure.r82$a */
    public class C3381a implements mz0.C2906d<r82<?>> {
        /* renamed from: b */
        public r82<?> mo20814a() {
            return new r82<>();
        }
    }

    @mr2
    /* renamed from: f */
    public static <Z> r82<Z> m26490f(ck3<Z> ck3) {
        r82<Z> r82 = (r82) g43.m15509d(f19682a.mo20818b());
        r82.mo23707e(ck3);
        return r82;
    }

    /* renamed from: a */
    public synchronized void mo13177a() {
        this.f19684a.mo18881c();
        this.f19686c = true;
        if (!this.f19685b) {
            this.f19683a.mo13177a();
            mo23708g();
        }
    }

    @mr2
    /* renamed from: b */
    public k34 mo20819b() {
        return this.f19684a;
    }

    /* renamed from: c */
    public int mo13179c() {
        return this.f19683a.mo13179c();
    }

    @mr2
    /* renamed from: d */
    public Class<Z> mo13180d() {
        return this.f19683a.mo13180d();
    }

    /* renamed from: e */
    public final void mo23707e(ck3<Z> ck3) {
        this.f19686c = false;
        this.f19685b = true;
        this.f19683a = ck3;
    }

    /* renamed from: g */
    public final void mo23708g() {
        this.f19683a = null;
        f19682a.mo20817a(this);
    }

    @mr2
    public Z get() {
        return this.f19683a.get();
    }

    /* renamed from: h */
    public synchronized void mo23709h() {
        this.f19684a.mo18881c();
        if (this.f19685b) {
            this.f19685b = false;
            if (this.f19686c) {
                mo13177a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}
