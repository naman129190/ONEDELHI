package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.LatLng;

public final class od2 {

    /* renamed from: a */
    public final lb5 f17918a;

    public od2(lb5 lb5) {
        this.f17918a = (lb5) Preconditions.checkNotNull(lb5);
    }

    /* renamed from: A */
    public void mo21868A(float f) {
        try {
            this.f17918a.mo19422V(f);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: B */
    public void mo21869B() {
        try {
            this.f17918a.mo19427Y7();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: a */
    public float mo21870a() {
        try {
            return this.f17918a.mo19433k();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: b */
    public String mo21871b() {
        try {
            return this.f17918a.mo19412A();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: c */
    public LatLng mo21872c() {
        try {
            return this.f17918a.mo19424X1();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: d */
    public float mo21873d() {
        try {
            return this.f17918a.mo19431i();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @ts2
    /* renamed from: e */
    public String mo21874e() {
        try {
            return this.f17918a.mo19413D();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof od2)) {
            return false;
        }
        try {
            return this.f17918a.mo19419P3(((od2) obj).f17918a);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @ts2
    /* renamed from: f */
    public Object mo21876f() {
        try {
            return nt2.m23165k8(this.f17918a.mo19441z0());
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @ts2
    /* renamed from: g */
    public String mo21877g() {
        try {
            return this.f17918a.mo19415G();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: h */
    public float mo21878h() {
        try {
            return this.f17918a.mo19438u();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public int hashCode() {
        try {
            return this.f17918a.mo19434l();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: i */
    public void mo21880i() {
        try {
            this.f17918a.mo19426Y4();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: j */
    public boolean mo21881j() {
        try {
            return this.f17918a.mo19417M();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: k */
    public boolean mo21882k() {
        try {
            return this.f17918a.mo19436q();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: l */
    public boolean mo21883l() {
        try {
            return this.f17918a.mo19414D0();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: m */
    public boolean mo21884m() {
        try {
            return this.f17918a.mo19418M0();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: n */
    public void mo21885n() {
        try {
            this.f17918a.mo19440y();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: o */
    public void mo21886o(float f) {
        try {
            this.f17918a.mo19437q0(f);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: p */
    public void mo21887p(float f, float f2) {
        try {
            this.f17918a.mo19435o2(f, f2);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: q */
    public void mo21888q(boolean z) {
        try {
            this.f17918a.mo19439w0(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: r */
    public void mo21889r(boolean z) {
        try {
            this.f17918a.mo19429d0(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: s */
    public void mo21890s(@ts2 C3798vl vlVar) {
        if (vlVar == null) {
            try {
                this.f17918a.mo19430h0((tn1) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f17918a.mo19430h0(vlVar.mo26166a());
        }
    }

    /* renamed from: t */
    public void mo21891t(float f, float f2) {
        try {
            this.f17918a.mo19420Q4(f, f2);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: u */
    public void mo21892u(@mr2 LatLng latLng) {
        if (latLng != null) {
            try {
                this.f17918a.mo19425X2(latLng);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
    }

    /* renamed from: v */
    public void mo21893v(float f) {
        try {
            this.f17918a.mo19416J7(f);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: w */
    public void mo21894w(@ts2 String str) {
        try {
            this.f17918a.mo19428c8(str);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: x */
    public void mo21895x(@ts2 Object obj) {
        try {
            this.f17918a.mo19421Q6(nt2.m23166l8(obj));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: y */
    public void mo21896y(@ts2 String str) {
        try {
            this.f17918a.mo19432i6(str);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: z */
    public void mo21897z(boolean z) {
        try {
            this.f17918a.mo19423X(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }
}
