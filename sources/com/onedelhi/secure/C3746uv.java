package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.onedelhi.secure.uv */
public class C3746uv extends gx4 {

    /* renamed from: a */
    public ArrayList<gx4> f21529a = new ArrayList<>();

    /* renamed from: c */
    public int f21530c;

    public C3746uv(o60 o60, int i) {
        super(o60);
        this.f12810b = i;
        mo25738u();
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13813a(com.onedelhi.secure.sj0 r27) {
        /*
            r26 = this;
            r0 = r26
            com.onedelhi.secure.wj0 r1 = r0.f12808a
            boolean r1 = r1.f22152c
            if (r1 == 0) goto L_0x03f1
            com.onedelhi.secure.wj0 r1 = r0.f12811b
            boolean r1 = r1.f22152c
            if (r1 != 0) goto L_0x0010
            goto L_0x03f1
        L_0x0010:
            com.onedelhi.secure.o60 r1 = r0.f12807a
            com.onedelhi.secure.o60 r1 = r1.mo21666U()
            boolean r2 = r1 instanceof com.onedelhi.secure.p60
            if (r2 == 0) goto L_0x0021
            com.onedelhi.secure.p60 r1 = (com.onedelhi.secure.p60) r1
            boolean r1 = r1.mo22332O2()
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            com.onedelhi.secure.wj0 r2 = r0.f12811b
            int r2 = r2.f22148b
            com.onedelhi.secure.wj0 r4 = r0.f12808a
            int r4 = r4.f22148b
            int r2 = r2 - r4
            java.util.ArrayList<com.onedelhi.secure.gx4> r4 = r0.f21529a
            int r4 = r4.size()
            r5 = 0
        L_0x0032:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004a
            java.util.ArrayList<com.onedelhi.secure.gx4> r8 = r0.f21529a
            java.lang.Object r8 = r8.get(r5)
            com.onedelhi.secure.gx4 r8 = (com.onedelhi.secure.gx4) r8
            com.onedelhi.secure.o60 r8 = r8.f12807a
            int r8 = r8.mo21720l0()
            if (r8 != r7) goto L_0x004b
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004a:
            r5 = -1
        L_0x004b:
            int r8 = r4 + -1
            r9 = r8
        L_0x004e:
            if (r9 < 0) goto L_0x0064
            java.util.ArrayList<com.onedelhi.secure.gx4> r10 = r0.f21529a
            java.lang.Object r10 = r10.get(r9)
            com.onedelhi.secure.gx4 r10 = (com.onedelhi.secure.gx4) r10
            com.onedelhi.secure.o60 r10 = r10.f12807a
            int r10 = r10.mo21720l0()
            if (r10 != r7) goto L_0x0063
            int r9 = r9 + -1
            goto L_0x004e
        L_0x0063:
            r6 = r9
        L_0x0064:
            r9 = 0
        L_0x0065:
            r11 = 2
            if (r9 >= r11) goto L_0x0109
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x006f:
            if (r13 >= r4) goto L_0x00fb
            java.util.ArrayList<com.onedelhi.secure.gx4> r3 = r0.f21529a
            java.lang.Object r3 = r3.get(r13)
            com.onedelhi.secure.gx4 r3 = (com.onedelhi.secure.gx4) r3
            com.onedelhi.secure.o60 r11 = r3.f12807a
            int r11 = r11.mo21720l0()
            if (r11 != r7) goto L_0x0083
            goto L_0x00f4
        L_0x0083:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x008e
            if (r13 < r5) goto L_0x008e
            com.onedelhi.secure.wj0 r11 = r3.f12808a
            int r11 = r11.f22141a
            int r14 = r14 + r11
        L_0x008e:
            com.onedelhi.secure.cl0 r11 = r3.f12803a
            int r7 = r11.f22148b
            com.onedelhi.secure.o60$b r10 = r3.f12806a
            com.onedelhi.secure.o60$b r12 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009a
            r10 = 1
            goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            if (r10 == 0) goto L_0x00bd
            int r11 = r0.f12810b
            if (r11 != 0) goto L_0x00ac
            com.onedelhi.secure.o60 r12 = r3.f12807a
            com.onedelhi.secure.ul1 r12 = r12.f17750a
            com.onedelhi.secure.cl0 r12 = r12.f12803a
            boolean r12 = r12.f22152c
            if (r12 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r12 = 1
            if (r11 != r12) goto L_0x00ba
            com.onedelhi.secure.o60 r11 = r3.f12807a
            com.onedelhi.secure.bt4 r11 = r11.f17746a
            com.onedelhi.secure.cl0 r11 = r11.f12803a
            boolean r11 = r11.f22152c
            if (r11 != 0) goto L_0x00ba
            return
        L_0x00ba:
            r19 = r7
            goto L_0x00d3
        L_0x00bd:
            r19 = r7
            r12 = 1
            int r7 = r3.f12802a
            if (r7 != r12) goto L_0x00cb
            if (r9 != 0) goto L_0x00cb
            int r7 = r11.f10315d
            int r15 = r15 + 1
            goto L_0x00d1
        L_0x00cb:
            boolean r7 = r11.f22152c
            if (r7 == 0) goto L_0x00d3
            r7 = r19
        L_0x00d1:
            r10 = 1
            goto L_0x00d5
        L_0x00d3:
            r7 = r19
        L_0x00d5:
            if (r10 != 0) goto L_0x00e9
            int r15 = r15 + 1
            com.onedelhi.secure.o60 r7 = r3.f12807a
            float[] r7 = r7.f17756a
            int r10 = r0.f12810b
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ea
            float r17 = r17 + r7
            goto L_0x00ea
        L_0x00e9:
            int r14 = r14 + r7
        L_0x00ea:
            if (r13 >= r8) goto L_0x00f4
            if (r13 >= r6) goto L_0x00f4
            com.onedelhi.secure.wj0 r3 = r3.f12811b
            int r3 = r3.f22141a
            int r3 = -r3
            int r14 = r14 + r3
        L_0x00f4:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x006f
        L_0x00fb:
            if (r14 < r2) goto L_0x0106
            if (r15 != 0) goto L_0x0100
            goto L_0x0106
        L_0x0100:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0065
        L_0x0106:
            r3 = r16
            goto L_0x010e
        L_0x0109:
            r3 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010e:
            com.onedelhi.secure.wj0 r7 = r0.f12808a
            int r7 = r7.f22148b
            if (r1 == 0) goto L_0x0118
            com.onedelhi.secure.wj0 r7 = r0.f12811b
            int r7 = r7.f22148b
        L_0x0118:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L_0x0129
            r10 = 1073741824(0x40000000, float:2.0)
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            if (r1 == 0) goto L_0x0128
            int r7 = r7 + r10
            goto L_0x0129
        L_0x0128:
            int r7 = r7 - r10
        L_0x0129:
            if (r15 <= 0) goto L_0x0221
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x0135:
            if (r12 >= r4) goto L_0x01d3
            java.util.ArrayList<com.onedelhi.secure.gx4> r9 = r0.f21529a
            java.lang.Object r9 = r9.get(r12)
            com.onedelhi.secure.gx4 r9 = (com.onedelhi.secure.gx4) r9
            r19 = r11
            com.onedelhi.secure.o60 r11 = r9.f12807a
            int r11 = r11.mo21720l0()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x014f
            goto L_0x01b9
        L_0x014f:
            com.onedelhi.secure.o60$b r11 = r9.f12806a
            com.onedelhi.secure.o60$b r14 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x01b9
            com.onedelhi.secure.cl0 r11 = r9.f12803a
            boolean r14 = r11.f22152c
            if (r14 != 0) goto L_0x01b9
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0173
            com.onedelhi.secure.o60 r14 = r9.f12807a
            float[] r14 = r14.f17756a
            r21 = r7
            int r7 = r0.f12810b
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x0177
        L_0x0173:
            r21 = r7
            r7 = r19
        L_0x0177:
            int r14 = r0.f12810b
            if (r14 != 0) goto L_0x0186
            com.onedelhi.secure.o60 r14 = r9.f12807a
            r22 = r10
            int r10 = r14.f17798i
            int r14 = r14.f17795h
            r23 = r1
            goto L_0x0195
        L_0x0186:
            r22 = r10
            com.onedelhi.secure.o60 r10 = r9.f12807a
            int r14 = r10.f17802k
            int r10 = r10.f17800j
            r23 = r1
            r25 = r14
            r14 = r10
            r10 = r25
        L_0x0195:
            int r1 = r9.f12802a
            r24 = r3
            r3 = 1
            if (r1 != r3) goto L_0x01a3
            int r1 = r11.f10315d
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x01a4
        L_0x01a3:
            r1 = r7
        L_0x01a4:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x01ae
            int r1 = java.lang.Math.min(r10, r1)
        L_0x01ae:
            if (r1 == r7) goto L_0x01b3
            int r13 = r13 + 1
            r7 = r1
        L_0x01b3:
            com.onedelhi.secure.cl0 r1 = r9.f12803a
            r1.mo14196e(r7)
            goto L_0x01c1
        L_0x01b9:
            r23 = r1
            r24 = r3
            r21 = r7
            r22 = r10
        L_0x01c1:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r3 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0135
        L_0x01d3:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x0212
            int r15 = r15 - r13
            r1 = 0
            r3 = 0
        L_0x01e0:
            if (r1 >= r4) goto L_0x0210
            java.util.ArrayList<com.onedelhi.secure.gx4> r7 = r0.f21529a
            java.lang.Object r7 = r7.get(r1)
            com.onedelhi.secure.gx4 r7 = (com.onedelhi.secure.gx4) r7
            com.onedelhi.secure.o60 r9 = r7.f12807a
            int r9 = r9.mo21720l0()
            r10 = 8
            if (r9 != r10) goto L_0x01f5
            goto L_0x020d
        L_0x01f5:
            if (r1 <= 0) goto L_0x01fe
            if (r1 < r5) goto L_0x01fe
            com.onedelhi.secure.wj0 r9 = r7.f12808a
            int r9 = r9.f22141a
            int r3 = r3 + r9
        L_0x01fe:
            com.onedelhi.secure.cl0 r9 = r7.f12803a
            int r9 = r9.f22148b
            int r3 = r3 + r9
            if (r1 >= r8) goto L_0x020d
            if (r1 >= r6) goto L_0x020d
            com.onedelhi.secure.wj0 r7 = r7.f12811b
            int r7 = r7.f22141a
            int r7 = -r7
            int r3 = r3 + r7
        L_0x020d:
            int r1 = r1 + 1
            goto L_0x01e0
        L_0x0210:
            r14 = r3
            goto L_0x0214
        L_0x0212:
            r14 = r20
        L_0x0214:
            int r1 = r0.f21530c
            r3 = 2
            if (r1 != r3) goto L_0x021f
            if (r13 != 0) goto L_0x021f
            r1 = 0
            r0.f21530c = r1
            goto L_0x022b
        L_0x021f:
            r1 = 0
            goto L_0x022b
        L_0x0221:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            r1 = 0
            r3 = 2
        L_0x022b:
            if (r14 <= r2) goto L_0x022f
            r0.f21530c = r3
        L_0x022f:
            if (r24 <= 0) goto L_0x0237
            if (r15 != 0) goto L_0x0237
            if (r5 != r6) goto L_0x0237
            r0.f21530c = r3
        L_0x0237:
            int r3 = r0.f21530c
            r7 = 1
            r9 = r24
            if (r3 != r7) goto L_0x02cb
            if (r9 <= r7) goto L_0x0245
            int r2 = r2 - r14
            int r3 = r9 + -1
            int r2 = r2 / r3
            goto L_0x024c
        L_0x0245:
            if (r9 != r7) goto L_0x024b
            int r2 = r2 - r14
            r3 = 2
            int r2 = r2 / r3
            goto L_0x024c
        L_0x024b:
            r2 = 0
        L_0x024c:
            if (r15 <= 0) goto L_0x024f
            r2 = 0
        L_0x024f:
            r7 = r21
            r3 = 0
        L_0x0252:
            if (r3 >= r4) goto L_0x03f1
            if (r23 == 0) goto L_0x025b
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x025c
        L_0x025b:
            r1 = r3
        L_0x025c:
            java.util.ArrayList<com.onedelhi.secure.gx4> r9 = r0.f21529a
            java.lang.Object r1 = r9.get(r1)
            com.onedelhi.secure.gx4 r1 = (com.onedelhi.secure.gx4) r1
            com.onedelhi.secure.o60 r9 = r1.f12807a
            int r9 = r9.mo21720l0()
            r10 = 8
            if (r9 != r10) goto L_0x0279
            com.onedelhi.secure.wj0 r9 = r1.f12808a
            r9.mo14196e(r7)
            com.onedelhi.secure.wj0 r1 = r1.f12811b
            r1.mo14196e(r7)
            goto L_0x02c8
        L_0x0279:
            if (r3 <= 0) goto L_0x0280
            if (r23 == 0) goto L_0x027f
            int r7 = r7 - r2
            goto L_0x0280
        L_0x027f:
            int r7 = r7 + r2
        L_0x0280:
            if (r3 <= 0) goto L_0x028d
            if (r3 < r5) goto L_0x028d
            com.onedelhi.secure.wj0 r9 = r1.f12808a
            int r9 = r9.f22141a
            if (r23 == 0) goto L_0x028c
            int r7 = r7 - r9
            goto L_0x028d
        L_0x028c:
            int r7 = r7 + r9
        L_0x028d:
            if (r23 == 0) goto L_0x0292
            com.onedelhi.secure.wj0 r9 = r1.f12811b
            goto L_0x0294
        L_0x0292:
            com.onedelhi.secure.wj0 r9 = r1.f12808a
        L_0x0294:
            r9.mo14196e(r7)
            com.onedelhi.secure.cl0 r9 = r1.f12803a
            int r10 = r9.f22148b
            com.onedelhi.secure.o60$b r11 = r1.f12806a
            com.onedelhi.secure.o60$b r12 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02a8
            int r11 = r1.f12802a
            r12 = 1
            if (r11 != r12) goto L_0x02a8
            int r10 = r9.f10315d
        L_0x02a8:
            if (r23 == 0) goto L_0x02ac
            int r7 = r7 - r10
            goto L_0x02ad
        L_0x02ac:
            int r7 = r7 + r10
        L_0x02ad:
            if (r23 == 0) goto L_0x02b2
            com.onedelhi.secure.wj0 r9 = r1.f12808a
            goto L_0x02b4
        L_0x02b2:
            com.onedelhi.secure.wj0 r9 = r1.f12811b
        L_0x02b4:
            r9.mo14196e(r7)
            r9 = 1
            r1.f12809a = r9
            if (r3 >= r8) goto L_0x02c8
            if (r3 >= r6) goto L_0x02c8
            com.onedelhi.secure.wj0 r1 = r1.f12811b
            int r1 = r1.f22141a
            int r1 = -r1
            if (r23 == 0) goto L_0x02c7
            int r7 = r7 - r1
            goto L_0x02c8
        L_0x02c7:
            int r7 = r7 + r1
        L_0x02c8:
            int r3 = r3 + 1
            goto L_0x0252
        L_0x02cb:
            if (r3 != 0) goto L_0x0350
            int r2 = r2 - r14
            r3 = 1
            int r7 = r9 + 1
            int r2 = r2 / r7
            if (r15 <= 0) goto L_0x02d5
            r2 = 0
        L_0x02d5:
            r7 = r21
            r3 = 0
        L_0x02d8:
            if (r3 >= r4) goto L_0x03f1
            if (r23 == 0) goto L_0x02e1
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x02e2
        L_0x02e1:
            r1 = r3
        L_0x02e2:
            java.util.ArrayList<com.onedelhi.secure.gx4> r9 = r0.f21529a
            java.lang.Object r1 = r9.get(r1)
            com.onedelhi.secure.gx4 r1 = (com.onedelhi.secure.gx4) r1
            com.onedelhi.secure.o60 r9 = r1.f12807a
            int r9 = r9.mo21720l0()
            r10 = 8
            if (r9 != r10) goto L_0x02ff
            com.onedelhi.secure.wj0 r9 = r1.f12808a
            r9.mo14196e(r7)
            com.onedelhi.secure.wj0 r1 = r1.f12811b
            r1.mo14196e(r7)
            goto L_0x034d
        L_0x02ff:
            if (r23 == 0) goto L_0x0303
            int r7 = r7 - r2
            goto L_0x0304
        L_0x0303:
            int r7 = r7 + r2
        L_0x0304:
            if (r3 <= 0) goto L_0x0311
            if (r3 < r5) goto L_0x0311
            com.onedelhi.secure.wj0 r9 = r1.f12808a
            int r9 = r9.f22141a
            if (r23 == 0) goto L_0x0310
            int r7 = r7 - r9
            goto L_0x0311
        L_0x0310:
            int r7 = r7 + r9
        L_0x0311:
            if (r23 == 0) goto L_0x0316
            com.onedelhi.secure.wj0 r9 = r1.f12811b
            goto L_0x0318
        L_0x0316:
            com.onedelhi.secure.wj0 r9 = r1.f12808a
        L_0x0318:
            r9.mo14196e(r7)
            com.onedelhi.secure.cl0 r9 = r1.f12803a
            int r10 = r9.f22148b
            com.onedelhi.secure.o60$b r11 = r1.f12806a
            com.onedelhi.secure.o60$b r12 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x0330
            int r11 = r1.f12802a
            r12 = 1
            if (r11 != r12) goto L_0x0330
            int r9 = r9.f10315d
            int r10 = java.lang.Math.min(r10, r9)
        L_0x0330:
            if (r23 == 0) goto L_0x0334
            int r7 = r7 - r10
            goto L_0x0335
        L_0x0334:
            int r7 = r7 + r10
        L_0x0335:
            if (r23 == 0) goto L_0x033a
            com.onedelhi.secure.wj0 r9 = r1.f12808a
            goto L_0x033c
        L_0x033a:
            com.onedelhi.secure.wj0 r9 = r1.f12811b
        L_0x033c:
            r9.mo14196e(r7)
            if (r3 >= r8) goto L_0x034d
            if (r3 >= r6) goto L_0x034d
            com.onedelhi.secure.wj0 r1 = r1.f12811b
            int r1 = r1.f22141a
            int r1 = -r1
            if (r23 == 0) goto L_0x034c
            int r7 = r7 - r1
            goto L_0x034d
        L_0x034c:
            int r7 = r7 + r1
        L_0x034d:
            int r3 = r3 + 1
            goto L_0x02d8
        L_0x0350:
            r7 = 2
            if (r3 != r7) goto L_0x03f1
            int r3 = r0.f12810b
            if (r3 != 0) goto L_0x035e
            com.onedelhi.secure.o60 r3 = r0.f12807a
            float r3 = r3.mo21622E()
            goto L_0x0364
        L_0x035e:
            com.onedelhi.secure.o60 r3 = r0.f12807a
            float r3 = r3.mo21703g0()
        L_0x0364:
            if (r23 == 0) goto L_0x036a
            r7 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7 - r3
        L_0x036a:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r2 < 0) goto L_0x0376
            if (r15 <= 0) goto L_0x0377
        L_0x0376:
            r2 = 0
        L_0x0377:
            if (r23 == 0) goto L_0x037c
            int r7 = r21 - r2
            goto L_0x037e
        L_0x037c:
            int r7 = r21 + r2
        L_0x037e:
            r3 = 0
        L_0x037f:
            if (r3 >= r4) goto L_0x03f1
            if (r23 == 0) goto L_0x0388
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x0389
        L_0x0388:
            r1 = r3
        L_0x0389:
            java.util.ArrayList<com.onedelhi.secure.gx4> r2 = r0.f21529a
            java.lang.Object r1 = r2.get(r1)
            com.onedelhi.secure.gx4 r1 = (com.onedelhi.secure.gx4) r1
            com.onedelhi.secure.o60 r2 = r1.f12807a
            int r2 = r2.mo21720l0()
            r9 = 8
            if (r2 != r9) goto L_0x03a7
            com.onedelhi.secure.wj0 r2 = r1.f12808a
            r2.mo14196e(r7)
            com.onedelhi.secure.wj0 r1 = r1.f12811b
            r1.mo14196e(r7)
            r12 = 1
            goto L_0x03ee
        L_0x03a7:
            if (r3 <= 0) goto L_0x03b4
            if (r3 < r5) goto L_0x03b4
            com.onedelhi.secure.wj0 r2 = r1.f12808a
            int r2 = r2.f22141a
            if (r23 == 0) goto L_0x03b3
            int r7 = r7 - r2
            goto L_0x03b4
        L_0x03b3:
            int r7 = r7 + r2
        L_0x03b4:
            if (r23 == 0) goto L_0x03b9
            com.onedelhi.secure.wj0 r2 = r1.f12811b
            goto L_0x03bb
        L_0x03b9:
            com.onedelhi.secure.wj0 r2 = r1.f12808a
        L_0x03bb:
            r2.mo14196e(r7)
            com.onedelhi.secure.cl0 r2 = r1.f12803a
            int r10 = r2.f22148b
            com.onedelhi.secure.o60$b r11 = r1.f12806a
            com.onedelhi.secure.o60$b r12 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03d0
            int r11 = r1.f12802a
            r12 = 1
            if (r11 != r12) goto L_0x03d1
            int r10 = r2.f10315d
            goto L_0x03d1
        L_0x03d0:
            r12 = 1
        L_0x03d1:
            if (r23 == 0) goto L_0x03d5
            int r7 = r7 - r10
            goto L_0x03d6
        L_0x03d5:
            int r7 = r7 + r10
        L_0x03d6:
            if (r23 == 0) goto L_0x03db
            com.onedelhi.secure.wj0 r2 = r1.f12808a
            goto L_0x03dd
        L_0x03db:
            com.onedelhi.secure.wj0 r2 = r1.f12811b
        L_0x03dd:
            r2.mo14196e(r7)
            if (r3 >= r8) goto L_0x03ee
            if (r3 >= r6) goto L_0x03ee
            com.onedelhi.secure.wj0 r1 = r1.f12811b
            int r1 = r1.f22141a
            int r1 = -r1
            if (r23 == 0) goto L_0x03ed
            int r7 = r7 - r1
            goto L_0x03ee
        L_0x03ed:
            int r7 = r7 + r1
        L_0x03ee:
            int r3 = r3 + 1
            goto L_0x037f
        L_0x03f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3746uv.mo13813a(com.onedelhi.secure.sj0):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13814d() {
        /*
            r5 = this;
            java.util.ArrayList<com.onedelhi.secure.gx4> r0 = r5.f21529a
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.next()
            com.onedelhi.secure.gx4 r1 = (com.onedelhi.secure.gx4) r1
            r1.mo13814d()
            goto L_0x0006
        L_0x0016:
            java.util.ArrayList<com.onedelhi.secure.gx4> r0 = r5.f21529a
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L_0x0020
            return
        L_0x0020:
            java.util.ArrayList<com.onedelhi.secure.gx4> r2 = r5.f21529a
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.onedelhi.secure.gx4 r2 = (com.onedelhi.secure.gx4) r2
            com.onedelhi.secure.o60 r2 = r2.f12807a
            java.util.ArrayList<com.onedelhi.secure.gx4> r4 = r5.f21529a
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            com.onedelhi.secure.gx4 r0 = (com.onedelhi.secure.gx4) r0
            com.onedelhi.secure.o60 r0 = r0.f12807a
            int r4 = r5.f12810b
            if (r4 != 0) goto L_0x0070
            com.onedelhi.secure.m60 r1 = r2.f17748a
            com.onedelhi.secure.m60 r0 = r0.f17775c
            com.onedelhi.secure.wj0 r2 = r5.mo17009i(r1, r3)
            int r1 = r1.mo20112g()
            com.onedelhi.secure.o60 r4 = r5.mo25739v()
            if (r4 == 0) goto L_0x0052
            com.onedelhi.secure.m60 r1 = r4.f17748a
            int r1 = r1.mo20112g()
        L_0x0052:
            if (r2 == 0) goto L_0x0059
            com.onedelhi.secure.wj0 r4 = r5.f12808a
            r5.mo17005b(r4, r2, r1)
        L_0x0059:
            com.onedelhi.secure.wj0 r1 = r5.mo17009i(r0, r3)
            int r0 = r0.mo20112g()
            com.onedelhi.secure.o60 r2 = r5.mo25740w()
            if (r2 == 0) goto L_0x006d
            com.onedelhi.secure.m60 r0 = r2.f17775c
            int r0 = r0.mo20112g()
        L_0x006d:
            if (r1 == 0) goto L_0x00ab
            goto L_0x00a5
        L_0x0070:
            com.onedelhi.secure.m60 r2 = r2.f17765b
            com.onedelhi.secure.m60 r0 = r0.f17781d
            com.onedelhi.secure.wj0 r3 = r5.mo17009i(r2, r1)
            int r2 = r2.mo20112g()
            com.onedelhi.secure.o60 r4 = r5.mo25739v()
            if (r4 == 0) goto L_0x0088
            com.onedelhi.secure.m60 r2 = r4.f17765b
            int r2 = r2.mo20112g()
        L_0x0088:
            if (r3 == 0) goto L_0x008f
            com.onedelhi.secure.wj0 r4 = r5.f12808a
            r5.mo17005b(r4, r3, r2)
        L_0x008f:
            com.onedelhi.secure.wj0 r1 = r5.mo17009i(r0, r1)
            int r0 = r0.mo20112g()
            com.onedelhi.secure.o60 r2 = r5.mo25740w()
            if (r2 == 0) goto L_0x00a3
            com.onedelhi.secure.m60 r0 = r2.f17781d
            int r0 = r0.mo20112g()
        L_0x00a3:
            if (r1 == 0) goto L_0x00ab
        L_0x00a5:
            com.onedelhi.secure.wj0 r2 = r5.f12811b
            int r0 = -r0
            r5.mo17005b(r2, r1, r0)
        L_0x00ab:
            com.onedelhi.secure.wj0 r0 = r5.f12808a
            r0.f22144a = r5
            com.onedelhi.secure.wj0 r0 = r5.f12811b
            r0.f22144a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3746uv.mo13814d():void");
    }

    /* renamed from: e */
    public void mo13815e() {
        for (int i = 0; i < this.f21529a.size(); i++) {
            this.f21529a.get(i).mo13815e();
        }
    }

    /* renamed from: f */
    public void mo13816f() {
        this.f12805a = null;
        Iterator<gx4> it = this.f21529a.iterator();
        while (it.hasNext()) {
            it.next().mo13816f();
        }
    }

    /* renamed from: j */
    public long mo17010j() {
        int size = this.f21529a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            gx4 gx4 = this.f21529a.get(i);
            j = j + ((long) gx4.f12808a.f22141a) + gx4.mo17010j() + ((long) gx4.f12811b.f22141a);
        }
        return j;
    }

    /* renamed from: n */
    public void mo13817n() {
        this.f12808a.f22152c = false;
        this.f12811b.f22152c = false;
    }

    /* renamed from: p */
    public boolean mo13818p() {
        int size = this.f21529a.size();
        for (int i = 0; i < size; i++) {
            if (!this.f21529a.get(i).mo13818p()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f12810b == 0 ? "horizontal : " : "vertical : ");
        Iterator<gx4> it = this.f21529a.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }

    /* renamed from: u */
    public final void mo25738u() {
        o60 o60;
        o60 o602 = this.f12807a;
        do {
            o60 = o602;
            o602 = o602.mo21669V(this.f12810b);
        } while (o602 != null);
        this.f12807a = o60;
        this.f21529a.add(o60.mo21683a0(this.f12810b));
        o60 R = o60.mo21658R(this.f12810b);
        while (R != null) {
            this.f21529a.add(R.mo21683a0(this.f12810b));
            R = R.mo21658R(this.f12810b);
        }
        Iterator<gx4> it = this.f21529a.iterator();
        while (it.hasNext()) {
            gx4 next = it.next();
            int i = this.f12810b;
            if (i == 0) {
                next.f12807a.f17751a = this;
            } else if (i == 1) {
                next.f12807a.f17767b = this;
            }
        }
        if ((this.f12810b == 0 && ((p60) this.f12807a.mo21666U()).mo22332O2()) && this.f21529a.size() > 1) {
            ArrayList<gx4> arrayList = this.f21529a;
            this.f12807a = arrayList.get(arrayList.size() - 1).f12807a;
        }
        this.f21530c = this.f12810b == 0 ? this.f12807a.mo21628G() : this.f12807a.mo21710i0();
    }

    /* renamed from: v */
    public final o60 mo25739v() {
        for (int i = 0; i < this.f21529a.size(); i++) {
            gx4 gx4 = this.f21529a.get(i);
            if (gx4.f12807a.mo21720l0() != 8) {
                return gx4.f12807a;
            }
        }
        return null;
    }

    /* renamed from: w */
    public final o60 mo25740w() {
        for (int size = this.f21529a.size() - 1; size >= 0; size--) {
            gx4 gx4 = this.f21529a.get(size);
            if (gx4.f12807a.mo21720l0() != 8) {
                return gx4.f12807a;
            }
        }
        return null;
    }
}
