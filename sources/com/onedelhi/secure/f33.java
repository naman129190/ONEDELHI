package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public final class f33 {

    /* renamed from: a */
    public final he5 f11817a;

    public f33(he5 he5) {
        this.f11817a = (he5) Preconditions.checkNotNull(he5);
    }

    /* renamed from: A */
    public void mo15741A(float f) {
        try {
            this.f11817a.mo17226Y6(f);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: B */
    public void mo15742B(float f) {
        try {
            this.f11817a.mo17215D7(f);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: a */
    public int mo15743a() {
        try {
            return this.f11817a.mo17231n();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: b */
    public C3952xu mo15744b() {
        try {
            return this.f11817a.mo17225W1().mo27100K2();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: c */
    public String mo15745c() {
        try {
            return this.f11817a.mo17218G();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: d */
    public int mo15746d() {
        try {
            return this.f11817a.mo17230l();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @ts2
    /* renamed from: e */
    public List<h03> mo15747e() {
        try {
            return h03.m16423K2(this.f11817a.mo17216E());
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof f33)) {
            return false;
        }
        try {
            return this.f11817a.mo17223Q5(((f33) obj).f11817a);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: f */
    public List<LatLng> mo15749f() {
        try {
            return this.f11817a.mo17210A0();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: g */
    public List<f64> mo15750g() {
        try {
            return this.f11817a.mo17239y5();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: h */
    public C3952xu mo15751h() {
        try {
            return this.f11817a.mo17214D6().mo27100K2();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public int hashCode() {
        try {
            return this.f11817a.mo17234t();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @ts2
    /* renamed from: i */
    public Object mo15753i() {
        try {
            return nt2.m23165k8(this.f11817a.mo17219J0());
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: j */
    public float mo15754j() {
        try {
            return this.f11817a.mo17229k();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: k */
    public float mo15755k() {
        try {
            return this.f11817a.mo17228i();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: l */
    public boolean mo15756l() {
        try {
            return this.f11817a.mo17233q();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: m */
    public boolean mo15757m() {
        try {
            return this.f11817a.mo17213D0();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: n */
    public boolean mo15758n() {
        try {
            return this.f11817a.mo17221M0();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: o */
    public void mo15759o() {
        try {
            this.f11817a.mo17222O3();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: p */
    public void mo15760p(boolean z) {
        try {
            this.f11817a.mo17236w0(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: q */
    public void mo15761q(int i) {
        try {
            this.f11817a.mo17235v7(i);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: r */
    public void mo15762r(@mr2 C3952xu xuVar) {
        Preconditions.checkNotNull(xuVar, "endCap must not be null");
        try {
            this.f11817a.mo17237x7(xuVar);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: s */
    public void mo15763s(boolean z) {
        try {
            this.f11817a.mo17227h1(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: t */
    public void mo15764t(int i) {
        try {
            this.f11817a.mo17211B0(i);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: u */
    public void mo15765u(@ts2 List<h03> list) {
        try {
            this.f11817a.mo17220K5(list);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: v */
    public void mo15766v(@mr2 List<LatLng> list) {
        Preconditions.checkNotNull(list, "points must not be null");
        try {
            this.f11817a.mo17232o0(list);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: w */
    public void mo15767w(@mr2 List<f64> list) {
        try {
            this.f11817a.mo17217F7(list);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: x */
    public void mo15768x(@mr2 C3952xu xuVar) {
        Preconditions.checkNotNull(xuVar, "startCap must not be null");
        try {
            this.f11817a.mo17212B3(xuVar);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: y */
    public void mo15769y(@ts2 Object obj) {
        try {
            this.f11817a.mo17224S4(nt2.m23166l8(obj));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: z */
    public void mo15770z(boolean z) {
        try {
            this.f11817a.mo17238y1(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }
}
