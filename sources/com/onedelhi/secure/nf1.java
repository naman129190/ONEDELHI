package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Observable;

public class nf1 extends Observable implements pf1 {

    /* renamed from: a */
    public static final String[] f32494a = {"Polygon", "MultiPolygon", "GeometryCollection"};

    /* renamed from: a */
    public final e33 f32495a = new e33();

    /* renamed from: a */
    public void mo35880a(boolean z) {
        this.f32495a.mo15027g3(z);
        mo41033m();
    }

    /* renamed from: b */
    public String[] mo35881b() {
        return f32494a;
    }

    /* renamed from: c */
    public int mo41023c() {
        return this.f32495a.mo15012R2();
    }

    /* renamed from: d */
    public int mo41024d() {
        return this.f32495a.mo15015U2();
    }

    /* renamed from: e */
    public float mo41025e() {
        return this.f32495a.mo15018X2();
    }

    /* renamed from: f */
    public float mo41026f() {
        return this.f32495a.mo15019Y2();
    }

    /* renamed from: g */
    public boolean mo41027g() {
        return this.f32495a.mo15021a3();
    }

    /* renamed from: h */
    public void mo41028h(int i) {
        this.f32495a.mo15010P2(i);
        mo41033m();
    }

    /* renamed from: i */
    public void mo41029i(boolean z) {
        this.f32495a.mo15011Q2(z);
        mo41033m();
    }

    public boolean isVisible() {
        return this.f32495a.mo15022b3();
    }

    /* renamed from: j */
    public void mo41030j(int i) {
        this.f32495a.mo15023c3(i);
        mo41033m();
    }

    /* renamed from: k */
    public void mo41031k(float f) {
        this.f32495a.mo15026f3(f);
        mo41033m();
    }

    /* renamed from: l */
    public void mo41032l(float f) {
        this.f32495a.mo15028h3(f);
        mo41033m();
    }

    /* renamed from: m */
    public final void mo41033m() {
        setChanged();
        notifyObservers();
    }

    /* renamed from: n */
    public e33 mo41034n() {
        e33 e33 = new e33();
        e33.mo15010P2(this.f32495a.mo15012R2());
        e33.mo15011Q2(this.f32495a.mo15021a3());
        e33.mo15023c3(this.f32495a.mo15015U2());
        e33.mo15026f3(this.f32495a.mo15018X2());
        e33.mo15027g3(this.f32495a.mo15022b3());
        e33.mo15028h3(this.f32495a.mo15019Y2());
        return e33;
    }

    public String toString() {
        return "PolygonStyle{" + "\n geometry type=" + Arrays.toString(f32494a) + ",\n fill color=" + mo41023c() + ",\n geodesic=" + mo41027g() + ",\n stroke color=" + mo41024d() + ",\n stroke width=" + mo41025e() + ",\n visible=" + isVisible() + ",\n z index=" + mo41026f() + "\n}\n";
    }
}
