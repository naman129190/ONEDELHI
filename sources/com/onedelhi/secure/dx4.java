package com.onedelhi.secure;

import java.util.ArrayList;

public class dx4 extends o60 {

    /* renamed from: b */
    public ArrayList<o60> f10993b = new ArrayList<>();

    public dx4() {
    }

    public dx4(int i, int i2) {
        super(i, i2);
    }

    public dx4(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    /* renamed from: Q1 */
    public void mo14928Q1(int i, int i2) {
        super.mo14928Q1(i, i2);
        int size = this.f10993b.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f10993b.get(i3).mo14928Q1(mo21677Y(), mo21680Z());
        }
    }

    /* renamed from: R0 */
    public void mo14929R0() {
        this.f10993b.clear();
        super.mo14929R0();
    }

    /* renamed from: W0 */
    public void mo14930W0(C1990ds dsVar) {
        super.mo14930W0(dsVar);
        int size = this.f10993b.size();
        for (int i = 0; i < size; i++) {
            this.f10993b.get(i).mo14930W0(dsVar);
        }
    }

    /* renamed from: b */
    public void mo14931b(o60 o60) {
        this.f10993b.add(o60);
        if (o60.mo21666U() != null) {
            ((dx4) o60.mo21666U()).mo14936o2(o60);
        }
        o60.mo21662S1(this);
    }

    /* renamed from: k2 */
    public void mo14932k2(o60... o60Arr) {
        for (o60 b : o60Arr) {
            mo14931b(b);
        }
    }

    /* renamed from: l2 */
    public ArrayList<o60> mo14933l2() {
        return this.f10993b;
    }

    /* renamed from: m2 */
    public p60 mo14934m2() {
        o60 U = mo21666U();
        p60 p60 = this instanceof p60 ? (p60) this : null;
        while (U != null) {
            o60 U2 = U.mo21666U();
            if (U instanceof p60) {
                p60 = (p60) U;
            }
            U = U2;
        }
        return p60;
    }

    /* renamed from: n2 */
    public void mo14935n2() {
        ArrayList<o60> arrayList = this.f10993b;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                o60 o60 = this.f10993b.get(i);
                if (o60 instanceof dx4) {
                    ((dx4) o60).mo14935n2();
                }
            }
        }
    }

    /* renamed from: o2 */
    public void mo14936o2(o60 o60) {
        this.f10993b.remove(o60);
        o60.mo14929R0();
    }

    /* renamed from: p2 */
    public void mo14937p2() {
        this.f10993b.clear();
    }
}
