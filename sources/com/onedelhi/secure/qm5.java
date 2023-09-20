package com.onedelhi.secure;

import java.io.IOException;

public final class qm5 extends cn5 {

    /* renamed from: a */
    public final char[] f19255a = new char[512];

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qm5(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            com.onedelhi.secure.km5 r4 = new com.onedelhi.secure.km5
            java.lang.String r5 = "0123456789ABCDEF"
            char[] r5 = r5.toCharArray()
            java.lang.String r0 = "base16()"
            r4.<init>(r0, r5)
            r5 = 0
            r3.<init>(r4, r5)
            r5 = 512(0x200, float:7.175E-43)
            char[] r5 = new char[r5]
            r3.f19255a = r5
            char[] r5 = r4.f15028a
            int r5 = r5.length
            r0 = 0
            r1 = 16
            if (r5 != r1) goto L_0x0023
            r5 = 1
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            com.onedelhi.secure.pg5.m24695c(r5)
        L_0x0027:
            r5 = 256(0x100, float:3.59E-43)
            if (r0 >= r5) goto L_0x0044
            char[] r5 = r3.f19255a
            int r1 = r0 >>> 4
            char r1 = r4.mo19163a(r1)
            r5[r0] = r1
            char[] r5 = r3.f19255a
            r1 = r0 | 256(0x100, float:3.59E-43)
            r2 = r0 & 15
            char r2 = r4.mo19163a(r2)
            r5[r1] = r2
            int r0 = r0 + 1
            goto L_0x0027
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qm5.<init>(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo14281a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        pg5.m24697e(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i3] & 255;
            appendable.append(this.f19255a[b]);
            appendable.append(this.f19255a[b | 256]);
        }
    }
}
