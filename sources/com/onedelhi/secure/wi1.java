package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class wi1 {

    /* renamed from: a */
    public final uv6 f22134a;

    public wi1(uv6 uv6) {
        this.f22134a = (uv6) Preconditions.checkNotNull(uv6);
    }

    /* renamed from: a */
    public float mo26547a() {
        try {
            return this.f22134a.mo25763k();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: b */
    public LatLngBounds mo26548b() {
        try {
            return this.f22134a.mo25759d5();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: c */
    public float mo26549c() {
        try {
            return this.f22134a.mo25762i();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: d */
    public String mo26550d() {
        try {
            return this.f22134a.mo25769q1();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: e */
    public LatLng mo26551e() {
        try {
            return this.f22134a.mo25764k0();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof wi1)) {
            return false;
        }
        try {
            return this.f22134a.mo25758b1(((wi1) obj).f22134a);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @ts2
    /* renamed from: f */
    public Object mo26553f() {
        try {
            return nt2.m23165k8(this.f22134a.mo25751H());
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: g */
    public float mo26554g() {
        try {
            return this.f22134a.mo25771u();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: h */
    public float mo26555h() {
        try {
            return this.f22134a.mo25773w5();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public int hashCode() {
        try {
            return this.f22134a.mo25765p();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: i */
    public float mo26557i() {
        try {
            return this.f22134a.mo25767p6();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: j */
    public boolean mo26558j() {
        try {
            return this.f22134a.mo25775z();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: k */
    public boolean mo26559k() {
        try {
            return this.f22134a.mo25760g3();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: l */
    public void mo26560l() {
        try {
            this.f22134a.mo25774y();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: m */
    public void mo26561m(float f) {
        try {
            this.f22134a.mo25768q0(f);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: n */
    public void mo26562n(boolean z) {
        try {
            this.f22134a.mo25772w(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: o */
    public void mo26563o(float f) {
        try {
            this.f22134a.mo25766p3(f);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: p */
    public void mo26564p(float f, float f2) {
        try {
            this.f22134a.mo25755O6(f, f2);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: q */
    public void mo26565q(@mr2 C3798vl vlVar) {
        Preconditions.checkNotNull(vlVar, "imageDescriptor must not be null");
        try {
            this.f22134a.mo25761h0(vlVar.mo26166a());
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: r */
    public void mo26566r(@mr2 LatLng latLng) {
        try {
            this.f22134a.mo25757a4(latLng);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: s */
    public void mo26567s(@mr2 LatLngBounds latLngBounds) {
        try {
            this.f22134a.mo25770r7(latLngBounds);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: t */
    public void mo26568t(@ts2 Object obj) {
        try {
            this.f22134a.mo25754N(nt2.m23166l8(obj));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: u */
    public void mo26569u(float f) {
        try {
            this.f22134a.mo25756X4(f);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: v */
    public void mo26570v(boolean z) {
        try {
            this.f22134a.mo25752H4(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: w */
    public void mo26571w(float f) {
        try {
            this.f22134a.mo25753M2(f);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }
}
