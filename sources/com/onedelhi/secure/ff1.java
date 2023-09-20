package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Observable;

public class ff1 extends Observable implements pf1 {

    /* renamed from: a */
    public static final String[] f28405a = {"LineString", "MultiLineString", "GeometryCollection"};

    /* renamed from: a */
    public final g33 f28406a = new g33();

    /* renamed from: a */
    public void mo35880a(boolean z) {
        this.f28406a.mo16312i3(z);
        mo35893m();
    }

    /* renamed from: b */
    public String[] mo35881b() {
        return f28405a;
    }

    /* renamed from: c */
    public int mo35882c() {
        return this.f28406a.mo16298U2();
    }

    /* renamed from: d */
    public float mo35883d() {
        return this.f28406a.mo16304a3();
    }

    /* renamed from: e */
    public float mo35884e() {
        return this.f28406a.mo16305b3();
    }

    /* renamed from: f */
    public boolean mo35885f() {
        return this.f28406a.mo16306c3();
    }

    /* renamed from: g */
    public boolean mo35886g() {
        return this.f28406a.mo16307d3();
    }

    /* renamed from: h */
    public void mo35887h(boolean z) {
        this.f28406a.mo16294Q2(z);
        mo35893m();
    }

    /* renamed from: i */
    public void mo35888i(int i) {
        this.f28406a.mo16295R2(i);
        mo35893m();
    }

    public boolean isVisible() {
        return this.f28406a.mo16308e3();
    }

    /* renamed from: j */
    public void mo35890j(boolean z) {
        this.f28406a.mo16297T2(z);
        mo35893m();
    }

    /* renamed from: k */
    public void mo35891k(float f) {
        this.f28406a.mo16313j3(f);
        mo35893m();
    }

    /* renamed from: l */
    public void mo35892l(float f) {
        this.f28406a.mo16314k3(f);
        mo35893m();
    }

    /* renamed from: m */
    public final void mo35893m() {
        setChanged();
        notifyObservers();
    }

    /* renamed from: n */
    public g33 mo35894n() {
        g33 g33 = new g33();
        g33.mo16295R2(this.f28406a.mo16298U2());
        g33.mo16294Q2(this.f28406a.mo16306c3());
        g33.mo16297T2(this.f28406a.mo16307d3());
        g33.mo16312i3(this.f28406a.mo16308e3());
        g33.mo16313j3(this.f28406a.mo16304a3());
        g33.mo16314k3(this.f28406a.mo16305b3());
        return g33;
    }

    public String toString() {
        return "LineStringStyle{" + "\n geometry type=" + Arrays.toString(f28405a) + ",\n color=" + mo35882c() + ",\n clickable=" + mo35885f() + ",\n geodesic=" + mo35886g() + ",\n visible=" + isVisible() + ",\n width=" + mo35883d() + ",\n z index=" + mo35884e() + "\n}\n";
    }
}
