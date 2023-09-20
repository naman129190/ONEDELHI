package com.onedelhi.secure;

import com.onedelhi.secure.pd0;
import com.onedelhi.secure.qd0;
import com.onedelhi.secure.rj2;
import java.io.File;
import java.util.List;

public class ek3 implements qd0, pd0.C3144a<Object> {

    /* renamed from: a */
    public fk3 f11269a;

    /* renamed from: a */
    public ky1 f11270a;

    /* renamed from: a */
    public final nf0<?> f11271a;

    /* renamed from: a */
    public final qd0.C3289a f11272a;

    /* renamed from: a */
    public volatile rj2.C3418a<?> f11273a;

    /* renamed from: a */
    public File f11274a;

    /* renamed from: a */
    public List<rj2<File, ?>> f11275a;

    /* renamed from: n */
    public int f11276n;

    /* renamed from: o */
    public int f11277o = -1;

    /* renamed from: p */
    public int f11278p;

    public ek3(nf0<?> nf0, qd0.C3289a aVar) {
        this.f11271a = nf0;
        this.f11272a = aVar;
    }

    /* renamed from: a */
    public boolean mo13881a() {
        List<ky1> c = this.f11271a.mo21208c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        List<Class<?>> m = this.f11271a.mo21218m();
        if (!m.isEmpty()) {
            while (true) {
                if (this.f11275a == null || !mo15219b()) {
                    int i = this.f11277o + 1;
                    this.f11277o = i;
                    if (i >= m.size()) {
                        int i2 = this.f11276n + 1;
                        this.f11276n = i2;
                        if (i2 >= c.size()) {
                            return false;
                        }
                        this.f11277o = 0;
                    }
                    ky1 ky1 = c.get(this.f11276n);
                    Class cls = m.get(this.f11277o);
                    ky1 ky12 = ky1;
                    this.f11269a = new fk3(this.f11271a.mo21207b(), ky12, this.f11271a.mo21220o(), this.f11271a.mo21224s(), this.f11271a.mo21211f(), this.f11271a.mo21223r(cls), cls, this.f11271a.mo21216k());
                    File a = this.f11271a.mo21209d().mo17845a(this.f11269a);
                    this.f11274a = a;
                    if (a != null) {
                        this.f11270a = ky1;
                        this.f11275a = this.f11271a.mo21215j(a);
                        this.f11278p = 0;
                    }
                } else {
                    this.f11273a = null;
                    while (!z && mo15219b()) {
                        List<rj2<File, ?>> list = this.f11275a;
                        int i3 = this.f11278p;
                        this.f11278p = i3 + 1;
                        this.f11273a = list.get(i3).mo13191a(this.f11274a, this.f11271a.mo21224s(), this.f11271a.mo21211f(), this.f11271a.mo21216k());
                        if (this.f11273a != null && this.f11271a.mo21225t(this.f11273a.f19900a.mo14075a())) {
                            this.f11273a.f19900a.mo14570c(this.f11271a.mo21217l(), this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.f11271a.mo21222q())) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f11271a.mo21214i() + " to " + this.f11271a.mo21222q());
        }
    }

    /* renamed from: b */
    public final boolean mo15219b() {
        return this.f11278p < this.f11275a.size();
    }

    public void cancel() {
        rj2.C3418a<?> aVar = this.f11273a;
        if (aVar != null) {
            aVar.f19900a.cancel();
        }
    }

    /* renamed from: e */
    public void mo13892e(@mr2 Exception exc) {
        this.f11272a.mo13891l(this.f11269a, exc, this.f11273a.f19900a, vd0.RESOURCE_DISK_CACHE);
    }

    /* renamed from: f */
    public void mo13893f(Object obj) {
        this.f11272a.mo13886e(this.f11270a, obj, this.f11273a.f19900a, vd0.RESOURCE_DISK_CACHE, this.f11269a);
    }
}
