package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;

public final class wg3 {

    /* renamed from: a */
    public final te1 f36993a;

    /* renamed from: a */
    public final List<ue1> f36994a;

    public wg3(te1 te1) {
        this.f36993a = te1;
        ArrayList arrayList = new ArrayList();
        this.f36994a = arrayList;
        arrayList.add(new ue1(te1, new int[]{1}));
    }

    /* renamed from: a */
    public final ue1 mo46727a(int i) {
        if (i >= this.f36994a.size()) {
            List<ue1> list = this.f36994a;
            ue1 ue1 = list.get(list.size() - 1);
            for (int size = this.f36994a.size(); size <= i; size++) {
                te1 te1 = this.f36993a;
                ue1 = ue1.mo45572i(new ue1(te1, new int[]{1, te1.mo44964c((size - 1) + te1.mo44965d())}));
                this.f36994a.add(ue1);
            }
        }
        return this.f36994a.get(i);
    }

    /* renamed from: b */
    public void mo46728b(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                ue1 a = mo46727a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] e = new ue1(this.f36993a, iArr2).mo45573j(i, 1).mo45565b(a)[1].mo45568e();
                int length2 = i - e.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(e, 0, iArr, length + length2, e.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
