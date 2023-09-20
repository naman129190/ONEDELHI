package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;

public class eg0 implements tl3 {

    /* renamed from: a */
    public uf3 f27894a;

    /* renamed from: a */
    public List<sl3> f27895a = new ArrayList();

    public eg0(uf3 uf3) {
        this.f27894a = uf3;
    }

    /* renamed from: a */
    public void mo35233a(sl3 sl3) {
        this.f27895a.add(sl3);
    }

    /* renamed from: b */
    public ol3 mo35234b(C6969uk ukVar) {
        ol3 ol3;
        this.f27895a.clear();
        try {
            uf3 uf3 = this.f27894a;
            ol3 = uf3 instanceof wl2 ? ((wl2) uf3).mo46798d(ukVar) : uf3.mo34501a(ukVar);
        } catch (Exception unused) {
            ol3 = null;
        } catch (Throwable th) {
            this.f27894a.reset();
            throw th;
        }
        this.f27894a.reset();
        return ol3;
    }

    /* renamed from: c */
    public ol3 mo35235c(qb2 qb2) {
        return mo35234b(mo35238f(qb2));
    }

    /* renamed from: d */
    public List<sl3> mo35236d() {
        return new ArrayList(this.f27895a);
    }

    /* renamed from: e */
    public uf3 mo35237e() {
        return this.f27894a;
    }

    /* renamed from: f */
    public C6969uk mo35238f(qb2 qb2) {
        return new C6969uk(new gn1(qb2));
    }
}
