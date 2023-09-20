package com.onedelhi.secure;

import java.io.IOException;
import java.math.RoundingMode;
import javax.annotation.CheckForNull;

public class cn5 extends in5 {

    /* renamed from: a */
    public final km5 f10432a;
    @CheckForNull

    /* renamed from: a */
    public final Character f10433a;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cn5(com.onedelhi.secure.km5 r4, @javax.annotation.CheckForNull java.lang.Character r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.f10432a = r4
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L_0x0017
            r5.charValue()
            r2 = 61
            boolean r4 = r4.mo19164b(r2)
            if (r4 != 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r4 = 0
            goto L_0x0018
        L_0x0017:
            r4 = 1
        L_0x0018:
            if (r4 == 0) goto L_0x001d
            r3.f10433a = r5
            return
        L_0x001d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.String r5 = "Padding character %s was already in alphabet"
            java.lang.String r5 = com.onedelhi.secure.yg5.m32373a(r5, r1)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.cn5.<init>(com.onedelhi.secure.km5, java.lang.Character):void");
    }

    public cn5(String str, String str2, @CheckForNull Character ch) {
        this(new km5(str, str2.toCharArray()), ch);
    }

    /* renamed from: a */
    public void mo14281a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        pg5.m24697e(0, i2, bArr.length);
        while (i3 < i2) {
            mo14283e(appendable, bArr, i3, Math.min(this.f10432a.f15031d, i2 - i3));
            i3 += this.f10432a.f15031d;
        }
    }

    /* renamed from: b */
    public final int mo14282b(int i) {
        km5 km5 = this.f10432a;
        return km5.f15030c * un5.m29470a(i, km5.f15031d, RoundingMode.CEILING);
    }

    /* renamed from: e */
    public final void mo14283e(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        pg5.m24697e(i, i + i2, bArr.length);
        int i3 = 0;
        pg5.m24695c(i2 <= this.f10432a.f15031d);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | ((long) (bArr[i + i4] & 255))) << 8;
        }
        int i5 = ((i2 + 1) * 8) - this.f10432a.f15029b;
        while (i3 < i2 * 8) {
            km5 km5 = this.f10432a;
            appendable.append(km5.mo19163a(km5.f15024a & ((int) (j >>> (i5 - i3)))));
            i3 += this.f10432a.f15029b;
        }
        if (this.f10433a != null) {
            while (i3 < this.f10432a.f15031d * 8) {
                this.f10433a.charValue();
                appendable.append('=');
                i3 += this.f10432a.f15029b;
            }
        }
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof cn5) {
            cn5 cn5 = (cn5) obj;
            if (this.f10432a.equals(cn5.f10432a)) {
                Character ch = this.f10433a;
                Character ch2 = cn5.f10433a;
                if (ch != ch2) {
                    return ch != null && ch.equals(ch2);
                }
                return true;
            }
        }
    }

    public final int hashCode() {
        int hashCode = this.f10432a.hashCode();
        Character ch = this.f10433a;
        return hashCode ^ (ch == null ? 0 : ch.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.f10432a);
        if (8 % this.f10432a.f15029b != 0) {
            if (this.f10433a == null) {
                str = ".omitPadding()";
            } else {
                sb.append(".withPadChar('");
                sb.append(this.f10433a);
                str = "')";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
