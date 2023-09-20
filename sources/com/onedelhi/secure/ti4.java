package com.onedelhi.secure;

import com.onedelhi.secure.C2760lj;
import com.onedelhi.secure.lx3;
import java.util.ArrayList;
import java.util.List;

public class ti4 implements y60, C2760lj.C2762b {

    /* renamed from: a */
    public final C2760lj<?, Float> f20896a;

    /* renamed from: a */
    public final lx3.C2789a f20897a;

    /* renamed from: a */
    public final String f20898a;

    /* renamed from: a */
    public final List<C2760lj.C2762b> f20899a = new ArrayList();

    /* renamed from: a */
    public final boolean f20900a;

    /* renamed from: b */
    public final C2760lj<?, Float> f20901b;

    /* renamed from: c */
    public final C2760lj<?, Float> f20902c;

    public ti4(C2861mj mjVar, lx3 lx3) {
        this.f20898a = lx3.mo19929c();
        this.f20900a = lx3.mo19933g();
        this.f20897a = lx3.mo19932f();
        C2760lj<Float, Float> a = lx3.mo19931e().mo17597a();
        this.f20896a = a;
        C2760lj<Float, Float> a2 = lx3.mo19928b().mo17597a();
        this.f20901b = a2;
        C2760lj<Float, Float> a3 = lx3.mo19930d().mo17597a();
        this.f20902c = a3;
        mjVar.mo20432j(a);
        mjVar.mo20432j(a2);
        mjVar.mo20432j(a3);
        a.mo19638a(this);
        a2.mo19638a(this);
        a3.mo19638a(this);
    }

    /* renamed from: a */
    public void mo25117a(C2760lj.C2762b bVar) {
        this.f20899a.add(bVar);
    }

    /* renamed from: c */
    public void mo14992c() {
        for (int i = 0; i < this.f20899a.size(); i++) {
            this.f20899a.get(i).mo14992c();
        }
    }

    /* renamed from: d */
    public C2760lj<?, Float> mo25118d() {
        return this.f20901b;
    }

    /* renamed from: g */
    public void mo14994g(List<y60> list, List<y60> list2) {
    }

    public String getName() {
        return this.f20898a;
    }

    /* renamed from: h */
    public C2760lj<?, Float> mo25119h() {
        return this.f20902c;
    }

    /* renamed from: i */
    public C2760lj<?, Float> mo25120i() {
        return this.f20896a;
    }

    /* renamed from: j */
    public lx3.C2789a mo25121j() {
        return this.f20897a;
    }

    /* renamed from: k */
    public boolean mo25122k() {
        return this.f20900a;
    }
}
