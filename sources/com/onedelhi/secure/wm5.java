package com.onedelhi.secure;

import java.io.IOException;

public final class wm5 extends cn5 {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wm5(java.lang.String r2, java.lang.String r3, @javax.annotation.CheckForNull java.lang.Character r4) {
        /*
            r1 = this;
            com.onedelhi.secure.km5 r0 = new com.onedelhi.secure.km5
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = r0.f15028a
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            com.onedelhi.secure.pg5.m24695c(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.wm5.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    /* renamed from: a */
    public final void mo14281a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        pg5.m24697e(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = i3 + 1;
            int i6 = i5 + 1;
            byte b = ((bArr[i3] & 255) << 16) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
            appendable.append(this.f10432a.mo19163a(b >>> 18));
            appendable.append(this.f10432a.mo19163a((b >>> 12) & 63));
            appendable.append(this.f10432a.mo19163a((b >>> 6) & 63));
            appendable.append(this.f10432a.mo19163a(b & iq4.f30423a));
            i3 = i6 + 1;
        }
        if (i3 < i2) {
            mo14283e(appendable, bArr, i3, i2 - i3);
        }
    }
}
