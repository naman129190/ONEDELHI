package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Observable;

public class lf1 extends Observable implements pf1 {

    /* renamed from: a */
    public static final String[] f31644a = {"Point", "MultiPoint", "GeometryCollection"};

    /* renamed from: a */
    public final sd2 f31645a = new sd2();

    /* renamed from: a */
    public void mo35880a(boolean z) {
        this.f31645a.mo24333i3(z);
        mo39831w();
    }

    /* renamed from: b */
    public String[] mo35881b() {
        return f31644a;
    }

    /* renamed from: c */
    public float mo39810c() {
        return this.f31645a.mo24313O2();
    }

    /* renamed from: d */
    public float mo39811d() {
        return this.f31645a.mo24314P2();
    }

    /* renamed from: e */
    public float mo39812e() {
        return this.f31645a.mo24315Q2();
    }

    /* renamed from: f */
    public C3798vl mo39813f() {
        return this.f31645a.mo24316R2();
    }

    /* renamed from: g */
    public float mo39814g() {
        return this.f31645a.mo24317S2();
    }

    /* renamed from: h */
    public float mo39815h() {
        return this.f31645a.mo24318T2();
    }

    /* renamed from: i */
    public float mo39816i() {
        return this.f31645a.mo24320V2();
    }

    public boolean isVisible() {
        return this.f31645a.mo24328d3();
    }

    /* renamed from: j */
    public String mo39817j() {
        return this.f31645a.mo24321W2();
    }

    /* renamed from: k */
    public String mo39818k() {
        return this.f31645a.mo24322X2();
    }

    /* renamed from: l */
    public boolean mo39819l() {
        return this.f31645a.mo24326b3();
    }

    /* renamed from: m */
    public boolean mo39820m() {
        return this.f31645a.mo24327c3();
    }

    /* renamed from: n */
    public void mo39821n(float f) {
        this.f31645a.mo24309K2(f);
        mo39831w();
    }

    /* renamed from: o */
    public void mo39822o(float f, float f2) {
        this.f31645a.mo24310L2(f, f2);
        mo39831w();
    }

    /* renamed from: p */
    public void mo39823p(boolean z) {
        this.f31645a.mo24311M2(z);
        mo39831w();
    }

    /* renamed from: q */
    public void mo39824q(boolean z) {
        this.f31645a.mo24312N2(z);
        mo39831w();
    }

    /* renamed from: r */
    public void mo39825r(C3798vl vlVar) {
        this.f31645a.mo24324Z2(vlVar);
        mo39831w();
    }

    /* renamed from: s */
    public void mo39826s(float f, float f2) {
        this.f31645a.mo24325a3(f, f2);
        mo39831w();
    }

    /* renamed from: t */
    public void mo39827t(float f) {
        this.f31645a.mo24330f3(f);
        mo39831w();
    }

    public String toString() {
        return "PointStyle{" + "\n geometry type=" + Arrays.toString(f31644a) + ",\n alpha=" + mo39810c() + ",\n anchor U=" + mo39811d() + ",\n anchor V=" + mo39812e() + ",\n draggable=" + mo39819l() + ",\n flat=" + mo39820m() + ",\n info window anchor U=" + mo39814g() + ",\n info window anchor V=" + mo39815h() + ",\n rotation=" + mo39816i() + ",\n snippet=" + mo39817j() + ",\n title=" + mo39818k() + ",\n visible=" + isVisible() + "\n}\n";
    }

    /* renamed from: u */
    public void mo39829u(String str) {
        this.f31645a.mo24331g3(str);
        mo39831w();
    }

    /* renamed from: v */
    public void mo39830v(String str) {
        this.f31645a.mo24332h3(str);
        mo39831w();
    }

    /* renamed from: w */
    public final void mo39831w() {
        setChanged();
        notifyObservers();
    }

    /* renamed from: x */
    public sd2 mo39832x() {
        sd2 sd2 = new sd2();
        sd2.mo24309K2(this.f31645a.mo24313O2());
        sd2.mo24310L2(this.f31645a.mo24314P2(), this.f31645a.mo24315Q2());
        sd2.mo24311M2(this.f31645a.mo24326b3());
        sd2.mo24312N2(this.f31645a.mo24327c3());
        sd2.mo24324Z2(this.f31645a.mo24316R2());
        sd2.mo24325a3(this.f31645a.mo24317S2(), this.f31645a.mo24318T2());
        sd2.mo24330f3(this.f31645a.mo24320V2());
        sd2.mo24331g3(this.f31645a.mo24321W2());
        sd2.mo24332h3(this.f31645a.mo24322X2());
        sd2.mo24333i3(this.f31645a.mo24328d3());
        return sd2;
    }
}
