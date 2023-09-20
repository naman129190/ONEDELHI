package com.onedelhi.secure;

import com.onedelhi.secure.C1788bk;
import com.onedelhi.secure.o60;
import java.util.HashSet;

public class dw4 extends ml1 {

    /* renamed from: A */
    public boolean f10966A = false;

    /* renamed from: a */
    public C1788bk.C1789a f10967a = new C1788bk.C1789a();

    /* renamed from: a */
    public C1788bk.C1790b f10968a = null;

    /* renamed from: o0 */
    public int f10969o0 = 0;

    /* renamed from: p0 */
    public int f10970p0 = 0;

    /* renamed from: q0 */
    public int f10971q0 = 0;

    /* renamed from: r0 */
    public int f10972r0 = 0;

    /* renamed from: s0 */
    public int f10973s0 = 0;

    /* renamed from: t0 */
    public int f10974t0 = 0;

    /* renamed from: u0 */
    public int f10975u0 = 0;

    /* renamed from: v0 */
    public int f10976v0 = 0;

    /* renamed from: w0 */
    public int f10977w0 = 0;

    /* renamed from: x0 */
    public int f10978x0 = 0;

    /* renamed from: A2 */
    public void mo14900A2(int i, int i2) {
        this.f10977w0 = i;
        this.f10978x0 = i2;
    }

    /* renamed from: B2 */
    public void mo14901B2(int i) {
        this.f10971q0 = i;
        this.f10969o0 = i;
        this.f10972r0 = i;
        this.f10970p0 = i;
        this.f10973s0 = i;
        this.f10974t0 = i;
    }

    /* renamed from: C2 */
    public void mo14902C2(int i) {
        this.f10970p0 = i;
    }

    /* renamed from: D2 */
    public void mo14903D2(int i) {
        this.f10974t0 = i;
    }

    /* renamed from: E2 */
    public void mo14904E2(int i) {
        this.f10971q0 = i;
        this.f10975u0 = i;
    }

    /* renamed from: F2 */
    public void mo14905F2(int i) {
        this.f10972r0 = i;
        this.f10976v0 = i;
    }

    /* renamed from: G2 */
    public void mo14906G2(int i) {
        this.f10973s0 = i;
        this.f10975u0 = i;
        this.f10976v0 = i;
    }

    /* renamed from: H2 */
    public void mo14907H2(int i) {
        this.f10969o0 = i;
    }

    /* renamed from: c */
    public void mo14908c(p60 p60) {
        mo14910n2();
    }

    /* renamed from: m2 */
    public void mo14909m2(boolean z) {
        int i = this.f10973s0;
        if (i <= 0 && this.f10974t0 <= 0) {
            return;
        }
        if (z) {
            this.f10975u0 = this.f10974t0;
            this.f10976v0 = i;
            return;
        }
        this.f10975u0 = i;
        this.f10976v0 = this.f10974t0;
    }

    /* renamed from: n2 */
    public void mo14910n2() {
        for (int i = 0; i < this.f16180n0; i++) {
            o60 o60 = this.f16179c[i];
            if (o60 != null) {
                o60.mo21634I1(true);
            }
        }
    }

    /* renamed from: o2 */
    public boolean mo14911o2(HashSet<o60> hashSet) {
        for (int i = 0; i < this.f16180n0; i++) {
            if (hashSet.contains(this.f16179c[i])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p2 */
    public int mo14912p2() {
        return this.f10978x0;
    }

    /* renamed from: q2 */
    public int mo14913q2() {
        return this.f10977w0;
    }

    /* renamed from: r2 */
    public int mo14914r2() {
        return this.f10970p0;
    }

    /* renamed from: s2 */
    public int mo14915s2() {
        return this.f10975u0;
    }

    /* renamed from: t2 */
    public int mo14916t2() {
        return this.f10976v0;
    }

    /* renamed from: u2 */
    public int mo14917u2() {
        return this.f10969o0;
    }

    /* renamed from: v2 */
    public void mo14918v2(int i, int i2, int i3, int i4) {
    }

    /* renamed from: w2 */
    public void mo14919w2(o60 o60, o60.C3032b bVar, int i, o60.C3032b bVar2, int i2) {
        while (this.f10968a == null && mo21666U() != null) {
            this.f10968a = ((p60) mo21666U()).mo22324G2();
        }
        C1788bk.C1789a aVar = this.f10967a;
        aVar.f9865a = bVar;
        aVar.f9868b = bVar2;
        aVar.f9864a = i;
        aVar.f9867b = i2;
        this.f10968a.mo3259a(o60, aVar);
        o60.mo21691c2(this.f10967a.f9870c);
        o60.mo21758y1(this.f10967a.f9871d);
        o60.mo21755x1(this.f10967a.f9866a);
        o60.mo21704g1(this.f10967a.f9872e);
    }

    /* renamed from: x2 */
    public boolean mo14920x2() {
        o60 o60 = this.f17749a;
        C1788bk.C1790b G2 = o60 != null ? ((p60) o60).mo22324G2() : null;
        if (G2 == null) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f16180n0) {
                return true;
            }
            o60 o602 = this.f16179c[i];
            if (o602 != null && !(o602 instanceof nj1)) {
                o60.C3032b z2 = o602.mo21759z(0);
                o60.C3032b z3 = o602.mo21759z(1);
                o60.C3032b bVar = o60.C3032b.MATCH_CONSTRAINT;
                if (z2 != bVar || o602.f17788f == 1 || z3 != bVar || o602.f17792g == 1) {
                    z = false;
                }
                if (!z) {
                    if (z2 == bVar) {
                        z2 = o60.C3032b.WRAP_CONTENT;
                    }
                    if (z3 == bVar) {
                        z3 = o60.C3032b.WRAP_CONTENT;
                    }
                    C1788bk.C1789a aVar = this.f10967a;
                    aVar.f9865a = z2;
                    aVar.f9868b = z3;
                    aVar.f9864a = o602.mo21723m0();
                    this.f10967a.f9867b = o602.mo21619D();
                    G2.mo3259a(o602, this.f10967a);
                    o602.mo21691c2(this.f10967a.f9870c);
                    o602.mo21758y1(this.f10967a.f9871d);
                    o602.mo21704g1(this.f10967a.f9872e);
                }
            }
            i++;
        }
    }

    /* renamed from: y2 */
    public boolean mo14921y2() {
        return this.f10966A;
    }

    /* renamed from: z2 */
    public void mo14922z2(boolean z) {
        this.f10966A = z;
    }
}
