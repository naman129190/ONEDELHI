package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* renamed from: com.onedelhi.secure.zx */
public final class C4141zx {

    /* renamed from: a */
    public final op6 f23938a;

    public C4141zx(op6 op6) {
        this.f23938a = (op6) Preconditions.checkNotNull(op6);
    }

    @mr2
    /* renamed from: a */
    public LatLng mo28162a() {
        try {
            return this.f23938a.mo14186k0();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: b */
    public int mo28163b() {
        try {
            return this.f23938a.mo14187l();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: c */
    public String mo28164c() {
        try {
            return this.f23938a.mo14175G();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: d */
    public double mo28165d() {
        try {
            return this.f23938a.mo14172B1();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: e */
    public int mo28166e() {
        try {
            return this.f23938a.mo14190t();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public final boolean equals(@ts2 Object obj) {
        if (!(obj instanceof C4141zx)) {
            return false;
        }
        try {
            return this.f23938a.mo14191t5(((C4141zx) obj).f23938a);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @ts2
    /* renamed from: f */
    public List<h03> mo28168f() {
        try {
            return h03.m16423K2(this.f23938a.mo14173E());
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: g */
    public float mo28169g() {
        try {
            return this.f23938a.mo14185i();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @ts2
    /* renamed from: h */
    public Object mo28170h() {
        try {
            return nt2.m23165k8(this.f23938a.mo14176H());
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f23938a.mo14188p();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: i */
    public float mo28172i() {
        try {
            return this.f23938a.mo14192u();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: j */
    public boolean mo28173j() {
        try {
            return this.f23938a.mo14178K0();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: k */
    public boolean mo28174k() {
        try {
            return this.f23938a.mo14195z();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: l */
    public void mo28175l() {
        try {
            this.f23938a.mo14194y();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: m */
    public void mo28176m(@mr2 LatLng latLng) {
        try {
            Preconditions.checkNotNull(latLng, "center must not be null.");
            this.f23938a.mo14181S7(latLng);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: n */
    public void mo28177n(boolean z) {
        try {
            this.f23938a.mo14193w(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: o */
    public void mo28178o(int i) {
        try {
            this.f23938a.mo14174E0(i);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: p */
    public void mo28179p(double d) {
        try {
            this.f23938a.mo14182U5(d);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: q */
    public void mo28180q(int i) {
        try {
            this.f23938a.mo14183e8(i);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: r */
    public void mo28181r(@ts2 List<h03> list) {
        try {
            this.f23938a.mo14184g0(list);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: s */
    public void mo28182s(float f) {
        try {
            this.f23938a.mo14177J6(f);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: t */
    public void mo28183t(@ts2 Object obj) {
        try {
            this.f23938a.mo14179N(nt2.m23166l8(obj));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: u */
    public void mo28184u(boolean z) {
        try {
            this.f23938a.mo14180N0(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: v */
    public void mo28185v(float f) {
        try {
            this.f23938a.mo14189r0(f);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }
}
