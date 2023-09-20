package com.onedelhi.secure;

public final class u83 {

    /* renamed from: a */
    public final boolean f36004a;

    public u83(boolean z) {
        this.f36004a = z;
    }

    /* renamed from: a */
    public void mo45538a(sl3[] sl3Arr) {
        if (this.f36004a && sl3Arr != null && sl3Arr.length >= 3) {
            sl3 sl3 = sl3Arr[0];
            sl3Arr[0] = sl3Arr[2];
            sl3Arr[2] = sl3;
        }
    }

    /* renamed from: b */
    public boolean mo45539b() {
        return this.f36004a;
    }
}
