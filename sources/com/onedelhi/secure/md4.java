package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class md4 {

    /* renamed from: a */
    public final of5 f16082a;

    public md4(of5 of5) {
        this.f16082a = (of5) Preconditions.checkNotNull(of5);
    }

    /* renamed from: a */
    public void mo20311a() {
        try {
            this.f16082a.mo21913n4();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: b */
    public boolean mo20312b() {
        try {
            return this.f16082a.mo21903A1();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: c */
    public String mo20313c() {
        try {
            return this.f16082a.mo21904F3();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: d */
    public float mo20314d() {
        try {
            return this.f16082a.mo21911k();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: e */
    public float mo20315e() {
        try {
            return this.f16082a.mo21910i();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof md4)) {
            return false;
        }
        try {
            return this.f16082a.mo21905N6(((md4) obj).f16082a);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: f */
    public boolean mo20317f() {
        try {
            return this.f16082a.mo21914s2();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: g */
    public void mo20318g() {
        try {
            this.f16082a.mo21915w1();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: h */
    public void mo20319h(boolean z) {
        try {
            this.f16082a.mo21907R3(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public int hashCode() {
        try {
            return this.f16082a.mo21912n();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: i */
    public void mo20321i(float f) {
        try {
            this.f16082a.mo21908T1(f);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: j */
    public void mo20322j(boolean z) {
        try {
            this.f16082a.mo21906P(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: k */
    public void mo20323k(float f) {
        try {
            this.f16082a.mo21909c7(f);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }
}
