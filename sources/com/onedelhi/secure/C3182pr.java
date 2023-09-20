package com.onedelhi.secure;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.onedelhi.secure.pr */
public class C3182pr extends C3336qr {

    /* renamed from: a */
    public ArrayList<C3336qr> f18683a = new ArrayList<>();

    public C3182pr(char[] cArr) {
        super(cArr);
    }

    /* renamed from: B */
    public static C3336qr m24945B(char[] cArr) {
        return new C3182pr(cArr);
    }

    /* renamed from: A */
    public void mo22581A(C3336qr qrVar) {
        this.f18683a.add(qrVar);
        if (C3736ur.f21479b) {
            PrintStream printStream = System.out;
            printStream.println("added element " + qrVar + " to " + this);
        }
    }

    /* renamed from: C */
    public C3336qr mo22582C(int i) throws C3805vr {
        if (i >= 0 && i < this.f18683a.size()) {
            return this.f18683a.get(i);
        }
        throw new C3805vr("no element at index " + i, this);
    }

    /* renamed from: D */
    public C3336qr mo22583D(String str) throws C3805vr {
        Iterator<C3336qr> it = this.f18683a.iterator();
        while (it.hasNext()) {
            C3450rr rrVar = (C3450rr) it.next();
            if (rrVar.mo23405e().equals(str)) {
                return rrVar.mo24058k0();
            }
        }
        throw new C3805vr("no element for key <" + str + ">", this);
    }

    /* renamed from: F */
    public C3086or mo22584F(int i) throws C3805vr {
        C3336qr C = mo22582C(i);
        if (C instanceof C3086or) {
            return (C3086or) C;
        }
        throw new C3805vr("no array at index " + i, this);
    }

    /* renamed from: G */
    public C3086or mo22585G(String str) throws C3805vr {
        C3336qr D = mo22583D(str);
        if (D instanceof C3086or) {
            return (C3086or) D;
        }
        throw new C3805vr("no array found for key <" + str + ">, found [" + D.mo23413o() + "] : " + D, this);
    }

    /* renamed from: I */
    public C3086or mo22586I(String str) {
        C3336qr T = mo22595T(str);
        if (T instanceof C3086or) {
            return (C3086or) T;
        }
        return null;
    }

    /* renamed from: J */
    public boolean mo22587J(String str) throws C3805vr {
        C3336qr D = mo22583D(str);
        if (D instanceof C4021yr) {
            return ((C4021yr) D).mo27668B();
        }
        throw new C3805vr("no boolean found for key <" + str + ">, found [" + D.mo23413o() + "] : " + D, this);
    }

    /* renamed from: L */
    public float mo22588L(String str) throws C3805vr {
        C3336qr D = mo22583D(str);
        if (D != null) {
            return D.mo23409j();
        }
        throw new C3805vr("no float found for key <" + str + ">, found [" + D.mo23413o() + "] : " + D, this);
    }

    /* renamed from: N */
    public float mo22589N(String str) {
        C3336qr T = mo22595T(str);
        if (T instanceof C3535sr) {
            return T.mo23409j();
        }
        return Float.NaN;
    }

    /* renamed from: O */
    public int mo22590O(String str) throws C3805vr {
        C3336qr D = mo22583D(str);
        if (D != null) {
            return D.mo23410k();
        }
        throw new C3805vr("no int found for key <" + str + ">, found [" + D.mo23413o() + "] : " + D, this);
    }

    /* renamed from: P */
    public C3652tr mo22591P(int i) throws C3805vr {
        C3336qr C = mo22582C(i);
        if (C instanceof C3652tr) {
            return (C3652tr) C;
        }
        throw new C3805vr("no object at index " + i, this);
    }

    /* renamed from: Q */
    public C3652tr mo22592Q(String str) throws C3805vr {
        C3336qr D = mo22583D(str);
        if (D instanceof C3652tr) {
            return (C3652tr) D;
        }
        throw new C3805vr("no object found for key <" + str + ">, found [" + D.mo23413o() + "] : " + D, this);
    }

    /* renamed from: R */
    public C3652tr mo22593R(String str) {
        C3336qr T = mo22595T(str);
        if (T instanceof C3652tr) {
            return (C3652tr) T;
        }
        return null;
    }

    /* renamed from: S */
    public C3336qr mo22594S(int i) {
        if (i < 0 || i >= this.f18683a.size()) {
            return null;
        }
        return this.f18683a.get(i);
    }

    /* renamed from: T */
    public C3336qr mo22595T(String str) {
        Iterator<C3336qr> it = this.f18683a.iterator();
        while (it.hasNext()) {
            C3450rr rrVar = (C3450rr) it.next();
            if (rrVar.mo23405e().equals(str)) {
                return rrVar.mo24058k0();
            }
        }
        return null;
    }

    /* renamed from: U */
    public String mo22596U(int i) throws C3805vr {
        C3336qr C = mo22582C(i);
        if (C instanceof C3946xr) {
            return C.mo23405e();
        }
        throw new C3805vr("no string at index " + i, this);
    }

    /* renamed from: V */
    public String mo22597V(String str) throws C3805vr {
        C3336qr D = mo22583D(str);
        if (D instanceof C3946xr) {
            return D.mo23405e();
        }
        String str2 = null;
        if (D != null) {
            str2 = D.mo23413o();
        }
        throw new C3805vr("no string found for key <" + str + ">, found [" + str2 + "] : " + D, this);
    }

    /* renamed from: W */
    public String mo22598W(int i) {
        C3336qr S = mo22594S(i);
        if (S instanceof C3946xr) {
            return S.mo23405e();
        }
        return null;
    }

    /* renamed from: Z */
    public String mo22599Z(String str) {
        C3336qr T = mo22595T(str);
        if (T instanceof C3946xr) {
            return T.mo23405e();
        }
        return null;
    }

    /* renamed from: a0 */
    public boolean mo22600a0(String str) {
        Iterator<C3336qr> it = this.f18683a.iterator();
        while (it.hasNext()) {
            C3336qr next = it.next();
            if ((next instanceof C3450rr) && ((C3450rr) next).mo23405e().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b0 */
    public ArrayList<String> mo22601b0() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<C3336qr> it = this.f18683a.iterator();
        while (it.hasNext()) {
            C3336qr next = it.next();
            if (next instanceof C3450rr) {
                arrayList.add(((C3450rr) next).mo23405e());
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public boolean mo22602d(int i) throws C3805vr {
        C3336qr C = mo22582C(i);
        if (C instanceof C4021yr) {
            return ((C4021yr) C).mo27668B();
        }
        throw new C3805vr("no boolean at index " + i, this);
    }

    /* renamed from: d0 */
    public void mo22603d0(String str, C3336qr qrVar) {
        Iterator<C3336qr> it = this.f18683a.iterator();
        while (it.hasNext()) {
            C3450rr rrVar = (C3450rr) it.next();
            if (rrVar.mo23405e().equals(str)) {
                rrVar.mo24059m0(qrVar);
                return;
            }
        }
        this.f18683a.add((C3450rr) C3450rr.m27027h0(str, qrVar));
    }

    /* renamed from: f0 */
    public void mo22604f0(String str, float f) {
        mo22603d0(str, new C3535sr(f));
    }

    /* renamed from: g0 */
    public void mo22605g0(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<C3336qr> it = this.f18683a.iterator();
        while (it.hasNext()) {
            C3336qr next = it.next();
            if (((C3450rr) next).mo23405e().equals(str)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.f18683a.remove((C3336qr) it2.next());
        }
    }

    public float getFloat(int i) throws C3805vr {
        C3336qr C = mo22582C(i);
        if (C != null) {
            return C.mo23409j();
        }
        throw new C3805vr("no float at index " + i, this);
    }

    public int getInt(int i) throws C3805vr {
        C3336qr C = mo22582C(i);
        if (C != null) {
            return C.mo23410k();
        }
        throw new C3805vr("no int at index " + i, this);
    }

    public int size() {
        return this.f18683a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<C3336qr> it = this.f18683a.iterator();
        while (it.hasNext()) {
            C3336qr next = it.next();
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(next);
        }
        return super.toString() + " = <" + sb + " >";
    }
}
