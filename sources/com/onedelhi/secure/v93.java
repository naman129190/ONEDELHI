package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;

public final class v93 implements p74 {

    /* renamed from: a */
    public List<Object> f21714a = new ArrayList();

    /* renamed from: B2 */
    public void mo13596B2(int i, long j) {
        mo25907b(i, Long.valueOf(j));
    }

    /* renamed from: I2 */
    public void mo13598I2() {
        this.f21714a.clear();
    }

    /* renamed from: J0 */
    public void mo13599J0(int i) {
        mo25907b(i, (Object) null);
    }

    /* renamed from: P1 */
    public void mo13600P1(int i, double d) {
        mo25907b(i, Double.valueOf(d));
    }

    /* renamed from: a */
    public List<Object> mo25906a() {
        return this.f21714a;
    }

    /* renamed from: b */
    public final void mo25907b(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.f21714a.size()) {
            for (int size = this.f21714a.size(); size <= i2; size++) {
                this.f21714a.add((Object) null);
            }
        }
        this.f21714a.set(i2, obj);
    }

    public void close() {
    }

    /* renamed from: m2 */
    public void mo13605m2(int i, String str) {
        mo25907b(i, str);
    }

    /* renamed from: w */
    public void mo13606w(int i, byte[] bArr) {
        mo25907b(i, bArr);
    }
}
