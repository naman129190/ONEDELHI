package com.onedelhi.secure;

import android.graphics.Path;
import com.onedelhi.secure.C2760lj;
import com.onedelhi.secure.lx3;
import java.util.List;

public class ww3 implements pz2, C2760lj.C2762b {

    /* renamed from: a */
    public final Path f22350a = new Path();

    /* renamed from: a */
    public d40 f22351a = new d40();

    /* renamed from: a */
    public final C2760lj<?, Path> f22352a;

    /* renamed from: a */
    public final qa2 f22353a;

    /* renamed from: a */
    public final String f22354a;

    /* renamed from: a */
    public final boolean f22355a;

    /* renamed from: b */
    public boolean f22356b;

    public ww3(qa2 qa2, C2861mj mjVar, gx3 gx3) {
        this.f22354a = gx3.mo17001b();
        this.f22355a = gx3.mo17003d();
        this.f22353a = qa2;
        C2760lj<xw3, Path> a = gx3.mo17002c().mo17597a();
        this.f22352a = a;
        mjVar.mo20432j(a);
        a.mo19638a(this);
    }

    /* renamed from: a */
    public final void mo26711a() {
        this.f22356b = false;
        this.f22353a.invalidateSelf();
    }

    /* renamed from: c */
    public void mo14992c() {
        mo26711a();
    }

    /* renamed from: e */
    public Path mo17060e() {
        if (this.f22356b) {
            return this.f22350a;
        }
        this.f22350a.reset();
        if (!this.f22355a) {
            this.f22350a.set(this.f22352a.mo15565h());
            this.f22350a.setFillType(Path.FillType.EVEN_ODD);
            this.f22351a.mo14492b(this.f22350a);
        }
        this.f22356b = true;
        return this.f22350a;
    }

    /* renamed from: g */
    public void mo14994g(List<y60> list, List<y60> list2) {
        for (int i = 0; i < list.size(); i++) {
            y60 y60 = list.get(i);
            if (y60 instanceof ti4) {
                ti4 ti4 = (ti4) y60;
                if (ti4.mo25121j() == lx3.C2789a.SIMULTANEOUSLY) {
                    this.f22351a.mo14491a(ti4);
                    ti4.mo25117a(this);
                }
            }
        }
    }

    public String getName() {
        return this.f22354a;
    }
}
