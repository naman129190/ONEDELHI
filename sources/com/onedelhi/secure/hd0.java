package com.onedelhi.secure;

import com.onedelhi.secure.pd0;
import com.onedelhi.secure.qd0;
import com.onedelhi.secure.rj2;
import java.io.File;
import java.util.List;

public class hd0 implements qd0, pd0.C3144a<Object> {

    /* renamed from: a */
    public ky1 f13051a;

    /* renamed from: a */
    public final nf0<?> f13052a;

    /* renamed from: a */
    public final qd0.C3289a f13053a;

    /* renamed from: a */
    public volatile rj2.C3418a<?> f13054a;

    /* renamed from: a */
    public File f13055a;

    /* renamed from: a */
    public final List<ky1> f13056a;

    /* renamed from: b */
    public List<rj2<File, ?>> f13057b;

    /* renamed from: n */
    public int f13058n;

    /* renamed from: o */
    public int f13059o;

    public hd0(nf0<?> nf0, qd0.C3289a aVar) {
        this(nf0.mo21208c(), nf0, aVar);
    }

    public hd0(List<ky1> list, nf0<?> nf0, qd0.C3289a aVar) {
        this.f13058n = -1;
        this.f13056a = list;
        this.f13052a = nf0;
        this.f13053a = aVar;
    }

    /* renamed from: a */
    public boolean mo13881a() {
        while (true) {
            boolean z = false;
            if (this.f13057b == null || !mo17200b()) {
                int i = this.f13058n + 1;
                this.f13058n = i;
                if (i >= this.f13056a.size()) {
                    return false;
                }
                ky1 ky1 = this.f13056a.get(this.f13058n);
                File a = this.f13052a.mo21209d().mo17845a(new id0(ky1, this.f13052a.mo21220o()));
                this.f13055a = a;
                if (a != null) {
                    this.f13051a = ky1;
                    this.f13057b = this.f13052a.mo21215j(a);
                    this.f13059o = 0;
                }
            } else {
                this.f13054a = null;
                while (!z && mo17200b()) {
                    List<rj2<File, ?>> list = this.f13057b;
                    int i2 = this.f13059o;
                    this.f13059o = i2 + 1;
                    this.f13054a = list.get(i2).mo13191a(this.f13055a, this.f13052a.mo21224s(), this.f13052a.mo21211f(), this.f13052a.mo21216k());
                    if (this.f13054a != null && this.f13052a.mo21225t(this.f13054a.f19900a.mo14075a())) {
                        this.f13054a.f19900a.mo14570c(this.f13052a.mo21217l(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo17200b() {
        return this.f13059o < this.f13057b.size();
    }

    public void cancel() {
        rj2.C3418a<?> aVar = this.f13054a;
        if (aVar != null) {
            aVar.f19900a.cancel();
        }
    }

    /* renamed from: e */
    public void mo13892e(@mr2 Exception exc) {
        this.f13053a.mo13891l(this.f13051a, exc, this.f13054a.f19900a, vd0.DATA_DISK_CACHE);
    }

    /* renamed from: f */
    public void mo13893f(Object obj) {
        this.f13053a.mo13886e(this.f13051a, obj, this.f13054a.f19900a, vd0.DATA_DISK_CACHE, this.f13051a);
    }
}
