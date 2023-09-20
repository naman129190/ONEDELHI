package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public final class d33 {

    /* renamed from: a */
    public final yc5 f10607a;

    public d33(yc5 yc5) {
        this.f10607a = (yc5) Preconditions.checkNotNull(yc5);
    }

    /* renamed from: a */
    public int mo14461a() {
        try {
            return this.f10607a.mo27337n();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: b */
    public List<List<LatLng>> mo14462b() {
        try {
            return this.f10607a.mo27331a8();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: c */
    public String mo14463c() {
        try {
            return this.f10607a.mo27319D();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: d */
    public List<LatLng> mo14464d() {
        try {
            return this.f10607a.mo27320E();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: e */
    public int mo14465e() {
        try {
            return this.f10607a.mo27336l();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof d33)) {
            return false;
        }
        try {
            return this.f10607a.mo27342r2(((d33) obj).f10607a);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: f */
    public int mo14467f() {
        try {
            return this.f10607a.mo27343t();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @ts2
    /* renamed from: g */
    public List<h03> mo14468g() {
        try {
            return h03.m16423K2(this.f10607a.mo27317A0());
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: h */
    public float mo14469h() {
        try {
            return this.f10607a.mo27335k();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public int hashCode() {
        try {
            return this.f10607a.mo27339p();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @ts2
    /* renamed from: i */
    public Object mo14471i() {
        try {
            return nt2.m23165k8(this.f10607a.mo27323H());
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: j */
    public float mo14472j() {
        try {
            return this.f10607a.mo27334i();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: k */
    public boolean mo14473k() {
        try {
            return this.f10607a.mo27328W3();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: l */
    public boolean mo14474l() {
        try {
            return this.f10607a.mo27325M();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: m */
    public boolean mo14475m() {
        try {
            return this.f10607a.mo27340q();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: n */
    public void mo14476n() {
        try {
            this.f10607a.mo27324K2();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: o */
    public void mo14477o(boolean z) {
        try {
            this.f10607a.mo27344w(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: p */
    public void mo14478p(int i) {
        try {
            this.f10607a.mo27321E0(i);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: q */
    public void mo14479q(boolean z) {
        try {
            this.f10607a.mo27332d0(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: r */
    public void mo14480r(@mr2 List<? extends List<LatLng>> list) {
        try {
            this.f10607a.mo27330a1(list);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: s */
    public void mo14481s(@mr2 List<LatLng> list) {
        try {
            Preconditions.checkNotNull(list, "points must not be null.");
            this.f10607a.mo27333g0(list);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: t */
    public void mo14482t(int i) {
        try {
            this.f10607a.mo27318B0(i);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: u */
    public void mo14483u(int i) {
        try {
            this.f10607a.mo27322E3(i);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: v */
    public void mo14484v(@ts2 List<h03> list) {
        try {
            this.f10607a.mo27338o0(list);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: w */
    public void mo14485w(float f) {
        try {
            this.f10607a.mo27341r0(f);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: x */
    public void mo14486x(@ts2 Object obj) {
        try {
            this.f10607a.mo27326M5(nt2.m23166l8(obj));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: y */
    public void mo14487y(boolean z) {
        try {
            this.f10607a.mo27329X(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: z */
    public void mo14488z(float f) {
        try {
            this.f10607a.mo27327V(f);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }
}
