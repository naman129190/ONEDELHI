package com.onedelhi.secure;

import com.onedelhi.secure.o60;
import java.util.ArrayList;
import java.util.HashMap;

public class l81 extends dw4 {

    /* renamed from: M0 */
    public static final int f15178M0 = 0;

    /* renamed from: N0 */
    public static final int f15179N0 = 1;

    /* renamed from: O0 */
    public static final int f15180O0 = 2;

    /* renamed from: P0 */
    public static final int f15181P0 = 0;

    /* renamed from: Q0 */
    public static final int f15182Q0 = 1;

    /* renamed from: R0 */
    public static final int f15183R0 = 2;

    /* renamed from: S0 */
    public static final int f15184S0 = 3;

    /* renamed from: T0 */
    public static final int f15185T0 = 0;

    /* renamed from: U0 */
    public static final int f15186U0 = 1;

    /* renamed from: V0 */
    public static final int f15187V0 = 2;

    /* renamed from: W0 */
    public static final int f15188W0 = 3;

    /* renamed from: A0 */
    public int f15189A0 = -1;

    /* renamed from: B0 */
    public int f15190B0 = -1;

    /* renamed from: C0 */
    public int f15191C0 = -1;

    /* renamed from: D0 */
    public int f15192D0 = -1;

    /* renamed from: E0 */
    public int f15193E0 = 0;

    /* renamed from: F0 */
    public int f15194F0 = 0;

    /* renamed from: G0 */
    public int f15195G0 = 2;

    /* renamed from: H0 */
    public int f15196H0 = 2;

    /* renamed from: I0 */
    public int f15197I0 = 0;

    /* renamed from: J0 */
    public int f15198J0 = -1;

    /* renamed from: K0 */
    public int f15199K0 = 0;

    /* renamed from: L0 */
    public int f15200L0 = 0;

    /* renamed from: b */
    public ArrayList<C2702a> f15201b = new ArrayList<>();

    /* renamed from: c */
    public int[] f15202c = null;

    /* renamed from: d */
    public o60[] f15203d = null;

    /* renamed from: e */
    public o60[] f15204e = null;

    /* renamed from: f */
    public o60[] f15205f;

    /* renamed from: i */
    public float f15206i = 0.5f;

    /* renamed from: j */
    public float f15207j = 0.5f;

    /* renamed from: k */
    public float f15208k = 0.5f;

    /* renamed from: l */
    public float f15209l = 0.5f;

    /* renamed from: m */
    public float f15210m = 0.5f;

    /* renamed from: n */
    public float f15211n = 0.5f;

    /* renamed from: y0 */
    public int f15212y0 = -1;

    /* renamed from: z0 */
    public int f15213z0 = -1;

    /* renamed from: com.onedelhi.secure.l81$a */
    public class C2702a {

        /* renamed from: a */
        public int f15214a;

        /* renamed from: a */
        public m60 f15216a;

        /* renamed from: a */
        public o60 f15217a = null;

        /* renamed from: b */
        public int f15218b = 0;

        /* renamed from: b */
        public m60 f15219b;

        /* renamed from: c */
        public int f15220c = 0;

        /* renamed from: c */
        public m60 f15221c;

        /* renamed from: d */
        public int f15222d = 0;

        /* renamed from: d */
        public m60 f15223d;

        /* renamed from: e */
        public int f15224e = 0;

        /* renamed from: f */
        public int f15225f = 0;

        /* renamed from: g */
        public int f15226g = 0;

        /* renamed from: h */
        public int f15227h = 0;

        /* renamed from: i */
        public int f15228i = 0;

        /* renamed from: j */
        public int f15229j = 0;

        /* renamed from: k */
        public int f15230k = 0;

        /* renamed from: l */
        public int f15231l = 0;

        public C2702a(int i, m60 m60, m60 m602, m60 m603, m60 m604, int i2) {
            this.f15214a = i;
            this.f15216a = m60;
            this.f15219b = m602;
            this.f15221c = m603;
            this.f15223d = m604;
            this.f15220c = l81.this.mo14915s2();
            this.f15222d = l81.this.mo14917u2();
            this.f15224e = l81.this.mo14916t2();
            this.f15225f = l81.this.mo14914r2();
            this.f15231l = i2;
        }

        /* renamed from: b */
        public void mo19322b(o60 o60) {
            int i = 0;
            if (this.f15214a == 0) {
                int U2 = l81.this.mo19301f3(o60, this.f15231l);
                if (o60.mo21630H() == o60.C3032b.MATCH_CONSTRAINT) {
                    this.f15230k++;
                    U2 = 0;
                }
                int I2 = l81.this.f15193E0;
                if (o60.mo21720l0() != 8) {
                    i = I2;
                }
                this.f15226g += U2 + i;
                int V2 = l81.this.mo19300e3(o60, this.f15231l);
                if (this.f15217a == null || this.f15218b < V2) {
                    this.f15217a = o60;
                    this.f15218b = V2;
                    this.f15227h = V2;
                }
            } else {
                int U22 = l81.this.mo19301f3(o60, this.f15231l);
                int V22 = l81.this.mo19300e3(o60, this.f15231l);
                if (o60.mo21714j0() == o60.C3032b.MATCH_CONSTRAINT) {
                    this.f15230k++;
                    V22 = 0;
                }
                int J2 = l81.this.f15194F0;
                if (o60.mo21720l0() != 8) {
                    i = J2;
                }
                this.f15227h += V22 + i;
                if (this.f15217a == null || this.f15218b < U22) {
                    this.f15217a = o60;
                    this.f15218b = U22;
                    this.f15226g = U22;
                }
            }
            this.f15229j++;
        }

        /* renamed from: c */
        public void mo19323c() {
            this.f15218b = 0;
            this.f15217a = null;
            this.f15226g = 0;
            this.f15227h = 0;
            this.f15228i = 0;
            this.f15229j = 0;
            this.f15230k = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:140:0x0260  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo19324d(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f15229j
                r2 = 0
                r3 = 0
            L_0x0006:
                if (r3 >= r1) goto L_0x0027
                int r4 = r0.f15228i
                int r4 = r4 + r3
                com.onedelhi.secure.l81 r5 = com.onedelhi.secure.l81.this
                int r5 = r5.f15200L0
                if (r4 < r5) goto L_0x0014
                goto L_0x0027
            L_0x0014:
                com.onedelhi.secure.l81 r4 = com.onedelhi.secure.l81.this
                com.onedelhi.secure.o60[] r4 = r4.f15205f
                int r5 = r0.f15228i
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L_0x0024
                r4.mo21667U0()
            L_0x0024:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x0027:
                if (r1 == 0) goto L_0x0351
                com.onedelhi.secure.o60 r3 = r0.f15217a
                if (r3 != 0) goto L_0x002f
                goto L_0x0351
            L_0x002f:
                if (r19 == 0) goto L_0x0035
                if (r18 != 0) goto L_0x0035
                r4 = 1
                goto L_0x0036
            L_0x0035:
                r4 = 0
            L_0x0036:
                r5 = -1
                r6 = 0
                r7 = -1
                r8 = -1
            L_0x003a:
                if (r6 >= r1) goto L_0x0069
                if (r17 == 0) goto L_0x0042
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x0043
            L_0x0042:
                r9 = r6
            L_0x0043:
                int r10 = r0.f15228i
                int r10 = r10 + r9
                com.onedelhi.secure.l81 r11 = com.onedelhi.secure.l81.this
                int r11 = r11.f15200L0
                if (r10 < r11) goto L_0x004f
                goto L_0x0069
            L_0x004f:
                com.onedelhi.secure.l81 r10 = com.onedelhi.secure.l81.this
                com.onedelhi.secure.o60[] r10 = r10.f15205f
                int r11 = r0.f15228i
                int r11 = r11 + r9
                r9 = r10[r11]
                if (r9 == 0) goto L_0x0066
                int r9 = r9.mo21720l0()
                if (r9 != 0) goto L_0x0066
                if (r7 != r5) goto L_0x0065
                r7 = r6
            L_0x0065:
                r8 = r6
            L_0x0066:
                int r6 = r6 + 1
                goto L_0x003a
            L_0x0069:
                r6 = 0
                int r9 = r0.f15214a
                if (r9 != 0) goto L_0x01fc
                com.onedelhi.secure.o60 r9 = r0.f15217a
                com.onedelhi.secure.l81 r10 = com.onedelhi.secure.l81.this
                int r10 = r10.f15213z0
                r9.mo21673W1(r10)
                int r10 = r0.f15222d
                if (r18 <= 0) goto L_0x0084
                com.onedelhi.secure.l81 r11 = com.onedelhi.secure.l81.this
                int r11 = r11.f15194F0
                int r10 = r10 + r11
            L_0x0084:
                com.onedelhi.secure.m60 r11 = r9.f17765b
                com.onedelhi.secure.m60 r12 = r0.f15219b
                r11.mo20106a(r12, r10)
                if (r19 == 0) goto L_0x0096
                com.onedelhi.secure.m60 r10 = r9.f17781d
                com.onedelhi.secure.m60 r11 = r0.f15223d
                int r12 = r0.f15225f
                r10.mo20106a(r11, r12)
            L_0x0096:
                if (r18 <= 0) goto L_0x00a3
                com.onedelhi.secure.m60 r10 = r0.f15219b
                com.onedelhi.secure.o60 r10 = r10.f15916a
                com.onedelhi.secure.m60 r10 = r10.f17781d
                com.onedelhi.secure.m60 r11 = r9.f17765b
                r10.mo20106a(r11, r2)
            L_0x00a3:
                com.onedelhi.secure.l81 r10 = com.onedelhi.secure.l81.this
                int r10 = r10.f15196H0
                r11 = 3
                if (r10 != r11) goto L_0x00dd
                boolean r10 = r9.mo21734q0()
                if (r10 != 0) goto L_0x00dd
                r10 = 0
            L_0x00b3:
                if (r10 >= r1) goto L_0x00dd
                if (r17 == 0) goto L_0x00bb
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x00bc
            L_0x00bb:
                r12 = r10
            L_0x00bc:
                int r13 = r0.f15228i
                int r13 = r13 + r12
                com.onedelhi.secure.l81 r14 = com.onedelhi.secure.l81.this
                int r14 = r14.f15200L0
                if (r13 < r14) goto L_0x00c8
                goto L_0x00dd
            L_0x00c8:
                com.onedelhi.secure.l81 r13 = com.onedelhi.secure.l81.this
                com.onedelhi.secure.o60[] r13 = r13.f15205f
                int r14 = r0.f15228i
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.mo21734q0()
                if (r13 == 0) goto L_0x00da
                goto L_0x00de
            L_0x00da:
                int r10 = r10 + 1
                goto L_0x00b3
            L_0x00dd:
                r12 = r9
            L_0x00de:
                r10 = 0
            L_0x00df:
                if (r10 >= r1) goto L_0x0351
                if (r17 == 0) goto L_0x00e7
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00e8
            L_0x00e7:
                r13 = r10
            L_0x00e8:
                int r14 = r0.f15228i
                int r14 = r14 + r13
                com.onedelhi.secure.l81 r15 = com.onedelhi.secure.l81.this
                int r15 = r15.f15200L0
                if (r14 < r15) goto L_0x00f5
                goto L_0x0351
            L_0x00f5:
                com.onedelhi.secure.l81 r14 = com.onedelhi.secure.l81.this
                com.onedelhi.secure.o60[] r14 = r14.f15205f
                int r15 = r0.f15228i
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r14 != 0) goto L_0x0106
                r14 = r6
            L_0x0103:
                r6 = 3
                goto L_0x01f6
            L_0x0106:
                if (r10 != 0) goto L_0x0111
                com.onedelhi.secure.m60 r15 = r14.f17748a
                com.onedelhi.secure.m60 r11 = r0.f15216a
                int r3 = r0.f15220c
                r14.mo21719l(r15, r11, r3)
            L_0x0111:
                if (r13 != 0) goto L_0x016f
                com.onedelhi.secure.l81 r3 = com.onedelhi.secure.l81.this
                int r3 = r3.f15212y0
                r11 = 1065353216(0x3f800000, float:1.0)
                com.onedelhi.secure.l81 r13 = com.onedelhi.secure.l81.this
                float r13 = r13.f15206i
                if (r17 == 0) goto L_0x0125
                float r13 = r11 - r13
            L_0x0125:
                int r15 = r0.f15228i
                if (r15 != 0) goto L_0x0149
                com.onedelhi.secure.l81 r15 = com.onedelhi.secure.l81.this
                int r15 = r15.f15189A0
                if (r15 == r5) goto L_0x0149
                com.onedelhi.secure.l81 r3 = com.onedelhi.secure.l81.this
                int r3 = r3.f15189A0
                if (r17 == 0) goto L_0x0141
                com.onedelhi.secure.l81 r13 = com.onedelhi.secure.l81.this
                float r13 = r13.f15208k
            L_0x013f:
                float r11 = r11 - r13
                goto L_0x0147
            L_0x0141:
                com.onedelhi.secure.l81 r11 = com.onedelhi.secure.l81.this
                float r11 = r11.f15208k
            L_0x0147:
                r13 = r11
                goto L_0x0169
            L_0x0149:
                if (r19 == 0) goto L_0x0169
                com.onedelhi.secure.l81 r15 = com.onedelhi.secure.l81.this
                int r15 = r15.f15191C0
                if (r15 == r5) goto L_0x0169
                com.onedelhi.secure.l81 r3 = com.onedelhi.secure.l81.this
                int r3 = r3.f15191C0
                if (r17 == 0) goto L_0x0162
                com.onedelhi.secure.l81 r13 = com.onedelhi.secure.l81.this
                float r13 = r13.f15210m
                goto L_0x013f
            L_0x0162:
                com.onedelhi.secure.l81 r11 = com.onedelhi.secure.l81.this
                float r11 = r11.f15210m
                goto L_0x0147
            L_0x0169:
                r14.mo21615B1(r3)
                r14.mo21612A1(r13)
            L_0x016f:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x017c
                com.onedelhi.secure.m60 r3 = r14.f17775c
                com.onedelhi.secure.m60 r11 = r0.f15221c
                int r13 = r0.f15224e
                r14.mo21719l(r3, r11, r13)
            L_0x017c:
                if (r6 == 0) goto L_0x01a7
                com.onedelhi.secure.m60 r3 = r14.f17748a
                com.onedelhi.secure.m60 r11 = r6.f17775c
                com.onedelhi.secure.l81 r13 = com.onedelhi.secure.l81.this
                int r13 = r13.f15193E0
                r3.mo20106a(r11, r13)
                if (r10 != r7) goto L_0x0194
                com.onedelhi.secure.m60 r3 = r14.f17748a
                int r11 = r0.f15220c
                r3.mo20104B(r11)
            L_0x0194:
                com.onedelhi.secure.m60 r3 = r6.f17775c
                com.onedelhi.secure.m60 r11 = r14.f17748a
                r3.mo20106a(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L_0x01a7
                com.onedelhi.secure.m60 r3 = r6.f17775c
                int r6 = r0.f15224e
                r3.mo20104B(r6)
            L_0x01a7:
                if (r14 == r9) goto L_0x0103
                com.onedelhi.secure.l81 r3 = com.onedelhi.secure.l81.this
                int r3 = r3.f15196H0
                r6 = 3
                if (r3 != r6) goto L_0x01c5
                boolean r3 = r12.mo21734q0()
                if (r3 == 0) goto L_0x01c5
                if (r14 == r12) goto L_0x01c5
                boolean r3 = r14.mo21734q0()
                if (r3 == 0) goto L_0x01c5
                com.onedelhi.secure.m60 r3 = r14.f17785e
                com.onedelhi.secure.m60 r11 = r12.f17785e
                goto L_0x01f3
            L_0x01c5:
                com.onedelhi.secure.l81 r3 = com.onedelhi.secure.l81.this
                int r3 = r3.f15196H0
                if (r3 == 0) goto L_0x01ef
                r11 = 1
                if (r3 == r11) goto L_0x01ea
                com.onedelhi.secure.m60 r3 = r14.f17765b
                if (r4 == 0) goto L_0x01e5
                com.onedelhi.secure.m60 r11 = r0.f15219b
                int r13 = r0.f15222d
                r3.mo20106a(r11, r13)
                com.onedelhi.secure.m60 r3 = r14.f17781d
                com.onedelhi.secure.m60 r11 = r0.f15223d
                int r13 = r0.f15225f
                r3.mo20106a(r11, r13)
                goto L_0x01f6
            L_0x01e5:
                com.onedelhi.secure.m60 r11 = r9.f17765b
                r3.mo20106a(r11, r2)
            L_0x01ea:
                com.onedelhi.secure.m60 r3 = r14.f17781d
                com.onedelhi.secure.m60 r11 = r9.f17781d
                goto L_0x01f3
            L_0x01ef:
                com.onedelhi.secure.m60 r3 = r14.f17765b
                com.onedelhi.secure.m60 r11 = r9.f17765b
            L_0x01f3:
                r3.mo20106a(r11, r2)
            L_0x01f6:
                int r10 = r10 + 1
                r6 = r14
                r11 = 3
                goto L_0x00df
            L_0x01fc:
                com.onedelhi.secure.o60 r3 = r0.f15217a
                com.onedelhi.secure.l81 r9 = com.onedelhi.secure.l81.this
                int r9 = r9.f15212y0
                r3.mo21615B1(r9)
                int r9 = r0.f15220c
                if (r18 <= 0) goto L_0x0212
                com.onedelhi.secure.l81 r10 = com.onedelhi.secure.l81.this
                int r10 = r10.f15193E0
                int r9 = r9 + r10
            L_0x0212:
                if (r17 == 0) goto L_0x0231
                com.onedelhi.secure.m60 r10 = r3.f17775c
                com.onedelhi.secure.m60 r11 = r0.f15221c
                r10.mo20106a(r11, r9)
                if (r19 == 0) goto L_0x0226
                com.onedelhi.secure.m60 r9 = r3.f17748a
                com.onedelhi.secure.m60 r10 = r0.f15216a
                int r11 = r0.f15224e
                r9.mo20106a(r10, r11)
            L_0x0226:
                if (r18 <= 0) goto L_0x0250
                com.onedelhi.secure.m60 r9 = r0.f15221c
                com.onedelhi.secure.o60 r9 = r9.f15916a
                com.onedelhi.secure.m60 r9 = r9.f17748a
                com.onedelhi.secure.m60 r10 = r3.f17775c
                goto L_0x024d
            L_0x0231:
                com.onedelhi.secure.m60 r10 = r3.f17748a
                com.onedelhi.secure.m60 r11 = r0.f15216a
                r10.mo20106a(r11, r9)
                if (r19 == 0) goto L_0x0243
                com.onedelhi.secure.m60 r9 = r3.f17775c
                com.onedelhi.secure.m60 r10 = r0.f15221c
                int r11 = r0.f15224e
                r9.mo20106a(r10, r11)
            L_0x0243:
                if (r18 <= 0) goto L_0x0250
                com.onedelhi.secure.m60 r9 = r0.f15216a
                com.onedelhi.secure.o60 r9 = r9.f15916a
                com.onedelhi.secure.m60 r9 = r9.f17775c
                com.onedelhi.secure.m60 r10 = r3.f17748a
            L_0x024d:
                r9.mo20106a(r10, r2)
            L_0x0250:
                r9 = 0
            L_0x0251:
                if (r9 >= r1) goto L_0x0351
                int r10 = r0.f15228i
                int r10 = r10 + r9
                com.onedelhi.secure.l81 r11 = com.onedelhi.secure.l81.this
                int r11 = r11.f15200L0
                if (r10 < r11) goto L_0x0260
                goto L_0x0351
            L_0x0260:
                com.onedelhi.secure.l81 r10 = com.onedelhi.secure.l81.this
                com.onedelhi.secure.o60[] r10 = r10.f15205f
                int r11 = r0.f15228i
                int r11 = r11 + r9
                r10 = r10[r11]
                if (r10 != 0) goto L_0x0270
                r12 = 1
                goto L_0x034d
            L_0x0270:
                if (r9 != 0) goto L_0x02bc
                com.onedelhi.secure.m60 r11 = r10.f17765b
                com.onedelhi.secure.m60 r12 = r0.f15219b
                int r13 = r0.f15222d
                r10.mo21719l(r11, r12, r13)
                com.onedelhi.secure.l81 r11 = com.onedelhi.secure.l81.this
                int r11 = r11.f15213z0
                com.onedelhi.secure.l81 r12 = com.onedelhi.secure.l81.this
                float r12 = r12.f15207j
                int r13 = r0.f15228i
                if (r13 != 0) goto L_0x02a0
                com.onedelhi.secure.l81 r13 = com.onedelhi.secure.l81.this
                int r13 = r13.f15190B0
                if (r13 == r5) goto L_0x02a0
                com.onedelhi.secure.l81 r11 = com.onedelhi.secure.l81.this
                int r11 = r11.f15190B0
                com.onedelhi.secure.l81 r12 = com.onedelhi.secure.l81.this
                float r12 = r12.f15209l
                goto L_0x02b6
            L_0x02a0:
                if (r19 == 0) goto L_0x02b6
                com.onedelhi.secure.l81 r13 = com.onedelhi.secure.l81.this
                int r13 = r13.f15192D0
                if (r13 == r5) goto L_0x02b6
                com.onedelhi.secure.l81 r11 = com.onedelhi.secure.l81.this
                int r11 = r11.f15192D0
                com.onedelhi.secure.l81 r12 = com.onedelhi.secure.l81.this
                float r12 = r12.f15211n
            L_0x02b6:
                r10.mo21673W1(r11)
                r10.mo21671V1(r12)
            L_0x02bc:
                int r11 = r1 + -1
                if (r9 != r11) goto L_0x02c9
                com.onedelhi.secure.m60 r11 = r10.f17781d
                com.onedelhi.secure.m60 r12 = r0.f15223d
                int r13 = r0.f15225f
                r10.mo21719l(r11, r12, r13)
            L_0x02c9:
                if (r6 == 0) goto L_0x02f4
                com.onedelhi.secure.m60 r11 = r10.f17765b
                com.onedelhi.secure.m60 r12 = r6.f17781d
                com.onedelhi.secure.l81 r13 = com.onedelhi.secure.l81.this
                int r13 = r13.f15194F0
                r11.mo20106a(r12, r13)
                if (r9 != r7) goto L_0x02e1
                com.onedelhi.secure.m60 r11 = r10.f17765b
                int r12 = r0.f15222d
                r11.mo20104B(r12)
            L_0x02e1:
                com.onedelhi.secure.m60 r11 = r6.f17781d
                com.onedelhi.secure.m60 r12 = r10.f17765b
                r11.mo20106a(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r9 != r12) goto L_0x02f4
                com.onedelhi.secure.m60 r6 = r6.f17781d
                int r11 = r0.f15225f
                r6.mo20104B(r11)
            L_0x02f4:
                if (r10 == r3) goto L_0x034b
                r6 = 2
                com.onedelhi.secure.l81 r11 = com.onedelhi.secure.l81.this
                int r11 = r11.f15195G0
                if (r17 == 0) goto L_0x031c
                if (r11 == 0) goto L_0x0314
                r12 = 1
                if (r11 == r12) goto L_0x030f
                if (r11 == r6) goto L_0x0307
                goto L_0x034b
            L_0x0307:
                com.onedelhi.secure.m60 r6 = r10.f17748a
                com.onedelhi.secure.m60 r11 = r3.f17748a
                r6.mo20106a(r11, r2)
                goto L_0x0314
            L_0x030f:
                com.onedelhi.secure.m60 r6 = r10.f17748a
                com.onedelhi.secure.m60 r11 = r3.f17748a
                goto L_0x0318
            L_0x0314:
                com.onedelhi.secure.m60 r6 = r10.f17775c
                com.onedelhi.secure.m60 r11 = r3.f17775c
            L_0x0318:
                r6.mo20106a(r11, r2)
                goto L_0x034b
            L_0x031c:
                r12 = 1
                if (r11 == 0) goto L_0x0343
                if (r11 == r12) goto L_0x033e
                if (r11 == r6) goto L_0x0324
                goto L_0x034c
            L_0x0324:
                com.onedelhi.secure.m60 r6 = r10.f17748a
                if (r4 == 0) goto L_0x0339
                com.onedelhi.secure.m60 r11 = r0.f15216a
                int r13 = r0.f15220c
                r6.mo20106a(r11, r13)
                com.onedelhi.secure.m60 r6 = r10.f17775c
                com.onedelhi.secure.m60 r11 = r0.f15221c
                int r13 = r0.f15224e
                r6.mo20106a(r11, r13)
                goto L_0x034c
            L_0x0339:
                com.onedelhi.secure.m60 r11 = r3.f17748a
                r6.mo20106a(r11, r2)
            L_0x033e:
                com.onedelhi.secure.m60 r6 = r10.f17775c
                com.onedelhi.secure.m60 r11 = r3.f17775c
                goto L_0x0347
            L_0x0343:
                com.onedelhi.secure.m60 r6 = r10.f17748a
                com.onedelhi.secure.m60 r11 = r3.f17748a
            L_0x0347:
                r6.mo20106a(r11, r2)
                goto L_0x034c
            L_0x034b:
                r12 = 1
            L_0x034c:
                r6 = r10
            L_0x034d:
                int r9 = r9 + 1
                goto L_0x0251
            L_0x0351:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.l81.C2702a.mo19324d(boolean, int, boolean):void");
        }

        /* renamed from: e */
        public int mo19325e() {
            return this.f15214a == 1 ? this.f15227h - l81.this.f15194F0 : this.f15227h;
        }

        /* renamed from: f */
        public int mo19326f() {
            return this.f15214a == 0 ? this.f15226g - l81.this.f15193E0 : this.f15226g;
        }

        /* renamed from: g */
        public void mo19327g(int i) {
            int i2;
            o60.C3032b bVar;
            int i3;
            o60.C3032b bVar2;
            l81 l81;
            int i4 = this.f15230k;
            if (i4 != 0) {
                int i5 = this.f15229j;
                int i6 = i / i4;
                int i7 = 0;
                while (i7 < i5 && this.f15228i + i7 < l81.this.f15200L0) {
                    o60 o60 = l81.this.f15205f[this.f15228i + i7];
                    if (this.f15214a == 0) {
                        if (o60 != null && o60.mo21630H() == o60.C3032b.MATCH_CONSTRAINT && o60.f17788f == 0) {
                            l81 = l81.this;
                            bVar2 = o60.C3032b.FIXED;
                            bVar = o60.mo21714j0();
                            i2 = o60.mo21619D();
                            i3 = i6;
                        }
                        i7++;
                    } else {
                        if (o60 != null && o60.mo21714j0() == o60.C3032b.MATCH_CONSTRAINT && o60.f17792g == 0) {
                            l81 = l81.this;
                            bVar2 = o60.mo21630H();
                            i3 = o60.mo21723m0();
                            bVar = o60.C3032b.FIXED;
                            i2 = i6;
                        }
                        i7++;
                    }
                    l81.mo14919w2(o60, bVar2, i3, bVar, i2);
                    i7++;
                }
                mo19328h();
            }
        }

        /* renamed from: h */
        public final void mo19328h() {
            this.f15226g = 0;
            this.f15227h = 0;
            this.f15217a = null;
            this.f15218b = 0;
            int i = this.f15229j;
            int i2 = 0;
            while (i2 < i && this.f15228i + i2 < l81.this.f15200L0) {
                o60 o60 = l81.this.f15205f[this.f15228i + i2];
                if (this.f15214a == 0) {
                    int m0 = o60.mo21723m0();
                    int I2 = l81.this.f15193E0;
                    if (o60.mo21720l0() == 8) {
                        I2 = 0;
                    }
                    this.f15226g += m0 + I2;
                    int V2 = l81.this.mo19300e3(o60, this.f15231l);
                    if (this.f15217a == null || this.f15218b < V2) {
                        this.f15217a = o60;
                        this.f15218b = V2;
                        this.f15227h = V2;
                    }
                } else {
                    int U2 = l81.this.mo19301f3(o60, this.f15231l);
                    int V22 = l81.this.mo19300e3(o60, this.f15231l);
                    int J2 = l81.this.f15194F0;
                    if (o60.mo21720l0() == 8) {
                        J2 = 0;
                    }
                    this.f15227h += V22 + J2;
                    if (this.f15217a == null || this.f15218b < U2) {
                        this.f15217a = o60;
                        this.f15218b = U2;
                        this.f15226g = U2;
                    }
                }
                i2++;
            }
        }

        /* renamed from: i */
        public void mo19329i(int i) {
            this.f15228i = i;
        }

        /* renamed from: j */
        public void mo19330j(int i, m60 m60, m60 m602, m60 m603, m60 m604, int i2, int i3, int i4, int i5, int i6) {
            this.f15214a = i;
            this.f15216a = m60;
            this.f15219b = m602;
            this.f15221c = m603;
            this.f15223d = m604;
            this.f15220c = i2;
            this.f15222d = i3;
            this.f15224e = i4;
            this.f15225f = i5;
            this.f15231l = i6;
        }
    }

    /* renamed from: A3 */
    public void mo19295A3(int i) {
        this.f15194F0 = i;
    }

    /* renamed from: B3 */
    public void mo19296B3(int i) {
        this.f15213z0 = i;
    }

    /* renamed from: C3 */
    public void mo19297C3(int i) {
        this.f15197I0 = i;
    }

    /* renamed from: c3 */
    public final void mo19298c3(boolean z) {
        o60 o60;
        float f;
        int i;
        if (this.f15202c != null && this.f15204e != null && this.f15203d != null) {
            for (int i2 = 0; i2 < this.f15200L0; i2++) {
                this.f15205f[i2].mo21667U0();
            }
            int[] iArr = this.f15202c;
            int i3 = iArr[0];
            int i4 = iArr[1];
            o60 o602 = null;
            float f2 = this.f15206i;
            int i5 = 0;
            while (i5 < i3) {
                if (z) {
                    i = (i3 - i5) - 1;
                    f = 1.0f - this.f15206i;
                } else {
                    f = f2;
                    i = i5;
                }
                o60 o603 = this.f15204e[i];
                if (!(o603 == null || o603.mo21720l0() == 8)) {
                    if (i5 == 0) {
                        o603.mo21719l(o603.f17748a, this.f17748a, mo14915s2());
                        o603.mo21615B1(this.f15212y0);
                        o603.mo21612A1(f);
                    }
                    if (i5 == i3 - 1) {
                        o603.mo21719l(o603.f17775c, this.f17775c, mo14916t2());
                    }
                    if (i5 > 0 && o602 != null) {
                        o603.mo21719l(o603.f17748a, o602.f17775c, this.f15193E0);
                        o602.mo21719l(o602.f17775c, o603.f17748a, 0);
                    }
                    o602 = o603;
                }
                i5++;
                f2 = f;
            }
            for (int i6 = 0; i6 < i4; i6++) {
                o60 o604 = this.f15203d[i6];
                if (!(o604 == null || o604.mo21720l0() == 8)) {
                    if (i6 == 0) {
                        o604.mo21719l(o604.f17765b, this.f17765b, mo14917u2());
                        o604.mo21673W1(this.f15213z0);
                        o604.mo21671V1(this.f15207j);
                    }
                    if (i6 == i4 - 1) {
                        o604.mo21719l(o604.f17781d, this.f17781d, mo14914r2());
                    }
                    if (i6 > 0 && o602 != null) {
                        o604.mo21719l(o604.f17765b, o602.f17781d, this.f15194F0);
                        o602.mo21719l(o602.f17781d, o604.f17765b, 0);
                    }
                    o602 = o604;
                }
            }
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = (i8 * i3) + i7;
                    if (this.f15199K0 == 1) {
                        i9 = (i7 * i4) + i8;
                    }
                    o60[] o60Arr = this.f15205f;
                    if (!(i9 >= o60Arr.length || (o60 = o60Arr[i9]) == null || o60.mo21720l0() == 8)) {
                        o60 o605 = this.f15204e[i7];
                        o60 o606 = this.f15203d[i8];
                        if (o60 != o605) {
                            o60.mo21719l(o60.f17748a, o605.f17748a, 0);
                            o60.mo21719l(o60.f17775c, o605.f17775c, 0);
                        }
                        if (o60 != o606) {
                            o60.mo21719l(o60.f17765b, o606.f17765b, 0);
                            o60.mo21719l(o60.f17781d, o606.f17781d, 0);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d3 */
    public float mo19299d3() {
        return (float) this.f15198J0;
    }

    /* renamed from: e3 */
    public final int mo19300e3(o60 o60, int i) {
        if (o60 == null) {
            return 0;
        }
        if (o60.mo21714j0() == o60.C3032b.MATCH_CONSTRAINT) {
            int i2 = o60.f17792g;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (o60.f17763b * ((float) i));
                if (i3 != o60.mo21619D()) {
                    o60.mo21649N1(true);
                    mo14919w2(o60, o60.mo21630H(), o60.mo21723m0(), o60.C3032b.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return o60.mo21619D();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) o60.mo21723m0()) * o60.f17783e) + 0.5f);
                }
            }
        }
        return o60.mo21619D();
    }

    /* renamed from: f3 */
    public final int mo19301f3(o60 o60, int i) {
        if (o60 == null) {
            return 0;
        }
        if (o60.mo21630H() == o60.C3032b.MATCH_CONSTRAINT) {
            int i2 = o60.f17788f;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (o60.f17744a * ((float) i));
                if (i3 != o60.mo21723m0()) {
                    o60.mo21649N1(true);
                    mo14919w2(o60, o60.C3032b.FIXED, i3, o60.mo21714j0(), o60.mo21619D());
                }
                return i3;
            } else if (i2 == 1) {
                return o60.mo21723m0();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) o60.mo21619D()) * o60.f17783e) + 0.5f);
                }
            }
        }
        return o60.mo21723m0();
    }

    /* renamed from: g */
    public void mo15199g(p32 p32, boolean z) {
        super.mo15199g(p32, z);
        boolean z2 = mo21666U() != null && ((p60) mo21666U()).mo22332O2();
        int i = this.f15197I0;
        if (i != 0) {
            if (i == 1) {
                int size = this.f15201b.size();
                int i2 = 0;
                while (i2 < size) {
                    this.f15201b.get(i2).mo19324d(z2, i2, i2 == size + -1);
                    i2++;
                }
            } else if (i == 2) {
                mo19298c3(z2);
            } else if (i == 3) {
                int size2 = this.f15201b.size();
                int i3 = 0;
                while (i3 < size2) {
                    this.f15201b.get(i3).mo19324d(z2, i3, i3 == size2 + -1);
                    i3++;
                }
            }
        } else if (this.f15201b.size() > 0) {
            this.f15201b.get(0).mo19324d(z2, 0, true);
        }
        mo14922z2(false);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0129 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0066  */
    /* renamed from: g3 */
    public final void mo19302g3(com.onedelhi.secure.o60[] r17, int r18, int r19, int r20, int[] r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = 0
            int r6 = r0.f15198J0
            if (r3 != 0) goto L_0x0030
            if (r6 > 0) goto L_0x002d
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0014:
            if (r7 >= r2) goto L_0x002d
            if (r7 <= 0) goto L_0x001b
            int r9 = r0.f15193E0
            int r8 = r8 + r9
        L_0x001b:
            r9 = r1[r7]
            if (r9 != 0) goto L_0x0020
            goto L_0x002a
        L_0x0020:
            int r9 = r0.mo19301f3(r9, r4)
            int r8 = r8 + r9
            if (r8 <= r4) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            int r6 = r6 + 1
        L_0x002a:
            int r7 = r7 + 1
            goto L_0x0014
        L_0x002d:
            r7 = r6
            r6 = 0
            goto L_0x004f
        L_0x0030:
            if (r6 > 0) goto L_0x004e
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0035:
            if (r7 >= r2) goto L_0x004e
            if (r7 <= 0) goto L_0x003c
            int r9 = r0.f15194F0
            int r8 = r8 + r9
        L_0x003c:
            r9 = r1[r7]
            if (r9 != 0) goto L_0x0041
            goto L_0x004b
        L_0x0041:
            int r9 = r0.mo19300e3(r9, r4)
            int r8 = r8 + r9
            if (r8 <= r4) goto L_0x0049
            goto L_0x004e
        L_0x0049:
            int r6 = r6 + 1
        L_0x004b:
            int r7 = r7 + 1
            goto L_0x0035
        L_0x004e:
            r7 = 0
        L_0x004f:
            int[] r8 = r0.f15202c
            if (r8 != 0) goto L_0x0058
            r8 = 2
            int[] r8 = new int[r8]
            r0.f15202c = r8
        L_0x0058:
            r8 = 1
            if (r6 != 0) goto L_0x005d
            if (r3 == r8) goto L_0x0061
        L_0x005d:
            if (r7 != 0) goto L_0x0063
            if (r3 != 0) goto L_0x0063
        L_0x0061:
            r9 = 1
            goto L_0x0064
        L_0x0063:
            r9 = 0
        L_0x0064:
            if (r9 != 0) goto L_0x0129
            if (r3 != 0) goto L_0x0072
            float r6 = (float) r2
            float r10 = (float) r7
            float r6 = r6 / r10
            double r10 = (double) r6
            double r10 = java.lang.Math.ceil(r10)
            int r6 = (int) r10
            goto L_0x007b
        L_0x0072:
            float r7 = (float) r2
            float r10 = (float) r6
            float r7 = r7 / r10
            double r10 = (double) r7
            double r10 = java.lang.Math.ceil(r10)
            int r7 = (int) r10
        L_0x007b:
            com.onedelhi.secure.o60[] r10 = r0.f15204e
            r11 = 0
            if (r10 == 0) goto L_0x0088
            int r12 = r10.length
            if (r12 >= r7) goto L_0x0084
            goto L_0x0088
        L_0x0084:
            java.util.Arrays.fill(r10, r11)
            goto L_0x008c
        L_0x0088:
            com.onedelhi.secure.o60[] r10 = new com.onedelhi.secure.o60[r7]
            r0.f15204e = r10
        L_0x008c:
            com.onedelhi.secure.o60[] r10 = r0.f15203d
            if (r10 == 0) goto L_0x0098
            int r12 = r10.length
            if (r12 >= r6) goto L_0x0094
            goto L_0x0098
        L_0x0094:
            java.util.Arrays.fill(r10, r11)
            goto L_0x009c
        L_0x0098:
            com.onedelhi.secure.o60[] r10 = new com.onedelhi.secure.o60[r6]
            r0.f15203d = r10
        L_0x009c:
            r10 = 0
        L_0x009d:
            if (r10 >= r7) goto L_0x00e5
            r11 = 0
        L_0x00a0:
            if (r11 >= r6) goto L_0x00e2
            int r12 = r11 * r7
            int r12 = r12 + r10
            if (r3 != r8) goto L_0x00aa
            int r12 = r10 * r6
            int r12 = r12 + r11
        L_0x00aa:
            int r13 = r1.length
            if (r12 < r13) goto L_0x00ae
            goto L_0x00df
        L_0x00ae:
            r12 = r1[r12]
            if (r12 != 0) goto L_0x00b3
            goto L_0x00df
        L_0x00b3:
            int r13 = r0.mo19301f3(r12, r4)
            com.onedelhi.secure.o60[] r14 = r0.f15204e
            r15 = r14[r10]
            if (r15 == 0) goto L_0x00c5
            r14 = r14[r10]
            int r14 = r14.mo21723m0()
            if (r14 >= r13) goto L_0x00c9
        L_0x00c5:
            com.onedelhi.secure.o60[] r13 = r0.f15204e
            r13[r10] = r12
        L_0x00c9:
            int r13 = r0.mo19300e3(r12, r4)
            com.onedelhi.secure.o60[] r14 = r0.f15203d
            r15 = r14[r11]
            if (r15 == 0) goto L_0x00db
            r14 = r14[r11]
            int r14 = r14.mo21619D()
            if (r14 >= r13) goto L_0x00df
        L_0x00db:
            com.onedelhi.secure.o60[] r13 = r0.f15203d
            r13[r11] = r12
        L_0x00df:
            int r11 = r11 + 1
            goto L_0x00a0
        L_0x00e2:
            int r10 = r10 + 1
            goto L_0x009d
        L_0x00e5:
            r10 = 0
            r11 = 0
        L_0x00e7:
            if (r10 >= r7) goto L_0x00fc
            com.onedelhi.secure.o60[] r12 = r0.f15204e
            r12 = r12[r10]
            if (r12 == 0) goto L_0x00f9
            if (r10 <= 0) goto L_0x00f4
            int r13 = r0.f15193E0
            int r11 = r11 + r13
        L_0x00f4:
            int r12 = r0.mo19301f3(r12, r4)
            int r11 = r11 + r12
        L_0x00f9:
            int r10 = r10 + 1
            goto L_0x00e7
        L_0x00fc:
            r10 = 0
            r12 = 0
        L_0x00fe:
            if (r10 >= r6) goto L_0x0113
            com.onedelhi.secure.o60[] r13 = r0.f15203d
            r13 = r13[r10]
            if (r13 == 0) goto L_0x0110
            if (r10 <= 0) goto L_0x010b
            int r14 = r0.f15194F0
            int r12 = r12 + r14
        L_0x010b:
            int r13 = r0.mo19300e3(r13, r4)
            int r12 = r12 + r13
        L_0x0110:
            int r10 = r10 + 1
            goto L_0x00fe
        L_0x0113:
            r21[r5] = r11
            r21[r8] = r12
            if (r3 != 0) goto L_0x0121
            if (r11 <= r4) goto L_0x0061
            if (r7 <= r8) goto L_0x0061
            int r7 = r7 + -1
            goto L_0x0064
        L_0x0121:
            if (r12 <= r4) goto L_0x0061
            if (r6 <= r8) goto L_0x0061
            int r6 = r6 + -1
            goto L_0x0064
        L_0x0129:
            int[] r1 = r0.f15202c
            r1[r5] = r7
            r1[r8] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.l81.mo19302g3(com.onedelhi.secure.o60[], int, int, int, int[]):void");
    }

    /* renamed from: h3 */
    public final void mo19303h3(o60[] o60Arr, int i, int i2, int i3, int[] iArr) {
        m60 m60;
        int i4;
        int i5;
        int i6;
        m60 m602;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        int i11 = i3;
        if (i10 != 0) {
            this.f15201b.clear();
            C2702a aVar = new C2702a(i2, this.f17748a, this.f17765b, this.f17775c, this.f17781d, i3);
            this.f15201b.add(aVar);
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            if (i2 == 0) {
                while (i14 < i10) {
                    o60 o60 = o60Arr[i14];
                    int f3 = mo19301f3(o60, i11);
                    if (o60.mo21630H() == o60.C3032b.MATCH_CONSTRAINT) {
                        i12++;
                    }
                    int i15 = i12;
                    boolean z = (i13 == i11 || (this.f15193E0 + i13) + f3 > i11) && aVar.f15217a != null;
                    if (!z && i14 > 0 && (i9 = this.f15198J0) > 0 && i14 % i9 == 0) {
                        z = true;
                    }
                    if (z) {
                        aVar = new C2702a(i2, this.f17748a, this.f17765b, this.f17775c, this.f17781d, i3);
                        aVar.mo19329i(i14);
                        this.f15201b.add(aVar);
                    } else if (i14 > 0) {
                        i13 += this.f15193E0 + f3;
                        aVar.mo19322b(o60);
                        i14++;
                        i12 = i15;
                    }
                    i13 = f3;
                    aVar.mo19322b(o60);
                    i14++;
                    i12 = i15;
                }
            } else {
                while (i14 < i10) {
                    o60 o602 = o60Arr[i14];
                    int e3 = mo19300e3(o602, i11);
                    if (o602.mo21714j0() == o60.C3032b.MATCH_CONSTRAINT) {
                        i12++;
                    }
                    int i16 = i12;
                    boolean z2 = (i13 == i11 || (this.f15194F0 + i13) + e3 > i11) && aVar.f15217a != null;
                    if (!z2 && i14 > 0 && (i8 = this.f15198J0) > 0 && i14 % i8 == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        aVar = new C2702a(i2, this.f17748a, this.f17765b, this.f17775c, this.f17781d, i3);
                        aVar.mo19329i(i14);
                        this.f15201b.add(aVar);
                    } else if (i14 > 0) {
                        i7 = i13 + this.f15194F0 + e3;
                        aVar.mo19322b(o602);
                        i14++;
                        i12 = i16;
                    }
                    i7 = e3;
                    aVar.mo19322b(o602);
                    i14++;
                    i12 = i16;
                }
            }
            int size = this.f15201b.size();
            m60 m603 = this.f17748a;
            m60 m604 = this.f17765b;
            m60 m605 = this.f17775c;
            m60 m606 = this.f17781d;
            int s2 = mo14915s2();
            int u2 = mo14917u2();
            int t2 = mo14916t2();
            int r2 = mo14914r2();
            o60.C3032b H = mo21630H();
            o60.C3032b bVar = o60.C3032b.WRAP_CONTENT;
            boolean z3 = H == bVar || mo21714j0() == bVar;
            if (i12 > 0 && z3) {
                for (int i17 = 0; i17 < size; i17++) {
                    C2702a aVar2 = this.f15201b.get(i17);
                    aVar2.mo19327g(i11 - (i2 == 0 ? aVar2.mo19326f() : aVar2.mo19325e()));
                }
            }
            int i18 = u2;
            int i19 = t2;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = s2;
            m60 m607 = m604;
            m60 m608 = m603;
            int i24 = r2;
            while (i22 < size) {
                C2702a aVar3 = this.f15201b.get(i22);
                if (i2 == 0) {
                    if (i22 < size - 1) {
                        m602 = this.f15201b.get(i22 + 1).f15217a.f17765b;
                        i6 = 0;
                    } else {
                        m602 = this.f17781d;
                        i6 = mo14914r2();
                    }
                    m60 m609 = aVar3.f15217a.f17781d;
                    m60 m6010 = m608;
                    m60 m6011 = m608;
                    int i25 = i20;
                    m60 m6012 = m607;
                    int i26 = i21;
                    m60 m6013 = m605;
                    m60 m6014 = m605;
                    i4 = i22;
                    aVar3.mo19330j(i2, m6010, m6012, m6013, m602, i23, i18, i19, i6, i3);
                    int max = Math.max(i26, aVar3.mo19326f());
                    i20 = i25 + aVar3.mo19325e();
                    if (i4 > 0) {
                        i20 += this.f15194F0;
                    }
                    m608 = m6011;
                    i21 = max;
                    m607 = m609;
                    i18 = 0;
                    m60 = m6014;
                    int i27 = i6;
                    m606 = m602;
                    i24 = i27;
                } else {
                    m60 m6015 = m608;
                    int i28 = i20;
                    int i29 = i21;
                    i4 = i22;
                    if (i4 < size - 1) {
                        m60 = this.f15201b.get(i4 + 1).f15217a.f17748a;
                        i5 = 0;
                    } else {
                        m60 = this.f17775c;
                        i5 = mo14916t2();
                    }
                    m60 m6016 = aVar3.f15217a.f17775c;
                    aVar3.mo19330j(i2, m6015, m607, m60, m606, i23, i18, i5, i24, i3);
                    i21 = i29 + aVar3.mo19326f();
                    int max2 = Math.max(i28, aVar3.mo19325e());
                    if (i4 > 0) {
                        i21 += this.f15193E0;
                    }
                    i20 = max2;
                    i19 = i5;
                    m608 = m6016;
                    i23 = 0;
                }
                i22 = i4 + 1;
                int i30 = i3;
                m605 = m60;
            }
            iArr[0] = i21;
            iArr[1] = i20;
        }
    }

    /* renamed from: i3 */
    public final void mo19304i3(o60[] o60Arr, int i, int i2, int i3, int[] iArr) {
        m60 m60;
        int i4;
        int i5;
        int i6;
        m60 m602;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        int i11 = i3;
        if (i10 != 0) {
            this.f15201b.clear();
            C2702a aVar = new C2702a(i2, this.f17748a, this.f17765b, this.f17775c, this.f17781d, i3);
            this.f15201b.add(aVar);
            int i12 = 0;
            int i13 = 0;
            if (i2 == 0) {
                int i14 = 0;
                int i15 = 0;
                while (i15 < i10) {
                    int i16 = i12 + 1;
                    o60 o60 = o60Arr[i15];
                    int f3 = mo19301f3(o60, i11);
                    if (o60.mo21630H() == o60.C3032b.MATCH_CONSTRAINT) {
                        i13++;
                    }
                    int i17 = i13;
                    boolean z = (i14 == i11 || (this.f15193E0 + i14) + f3 > i11) && aVar.f15217a != null;
                    if (!z && i15 > 0 && (i9 = this.f15198J0) > 0 && i16 > i9) {
                        z = true;
                    }
                    if (z) {
                        aVar = new C2702a(i2, this.f17748a, this.f17765b, this.f17775c, this.f17781d, i3);
                        aVar.mo19329i(i15);
                        this.f15201b.add(aVar);
                        i12 = i16;
                        i14 = f3;
                    } else {
                        i14 = i15 > 0 ? i14 + this.f15193E0 + f3 : f3;
                        i12 = 0;
                    }
                    aVar.mo19322b(o60);
                    i15++;
                    i13 = i17;
                }
            } else {
                int i18 = 0;
                while (i18 < i10) {
                    o60 o602 = o60Arr[i18];
                    int e3 = mo19300e3(o602, i11);
                    if (o602.mo21714j0() == o60.C3032b.MATCH_CONSTRAINT) {
                        i13++;
                    }
                    int i19 = i13;
                    boolean z2 = (i12 == i11 || (this.f15194F0 + i12) + e3 > i11) && aVar.f15217a != null;
                    if (!z2 && i18 > 0 && (i8 = this.f15198J0) > 0 && i8 < 0) {
                        z2 = true;
                    }
                    if (z2) {
                        aVar = new C2702a(i2, this.f17748a, this.f17765b, this.f17775c, this.f17781d, i3);
                        aVar.mo19329i(i18);
                        this.f15201b.add(aVar);
                    } else if (i18 > 0) {
                        i7 = i12 + this.f15194F0 + e3;
                        aVar.mo19322b(o602);
                        i18++;
                        i13 = i19;
                    }
                    i7 = e3;
                    aVar.mo19322b(o602);
                    i18++;
                    i13 = i19;
                }
            }
            int size = this.f15201b.size();
            m60 m603 = this.f17748a;
            m60 m604 = this.f17765b;
            m60 m605 = this.f17775c;
            m60 m606 = this.f17781d;
            int s2 = mo14915s2();
            int u2 = mo14917u2();
            int t2 = mo14916t2();
            int r2 = mo14914r2();
            o60.C3032b H = mo21630H();
            o60.C3032b bVar = o60.C3032b.WRAP_CONTENT;
            boolean z3 = H == bVar || mo21714j0() == bVar;
            if (i13 > 0 && z3) {
                for (int i20 = 0; i20 < size; i20++) {
                    C2702a aVar2 = this.f15201b.get(i20);
                    aVar2.mo19327g(i11 - (i2 == 0 ? aVar2.mo19326f() : aVar2.mo19325e()));
                }
            }
            int i21 = u2;
            int i22 = t2;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = s2;
            m60 m607 = m604;
            m60 m608 = m603;
            int i27 = r2;
            while (i25 < size) {
                C2702a aVar3 = this.f15201b.get(i25);
                if (i2 == 0) {
                    if (i25 < size - 1) {
                        m602 = this.f15201b.get(i25 + 1).f15217a.f17765b;
                        i6 = 0;
                    } else {
                        m602 = this.f17781d;
                        i6 = mo14914r2();
                    }
                    m60 m609 = aVar3.f15217a.f17781d;
                    m60 m6010 = m608;
                    m60 m6011 = m608;
                    int i28 = i23;
                    m60 m6012 = m607;
                    int i29 = i24;
                    m60 m6013 = m605;
                    m60 m6014 = m605;
                    i4 = i25;
                    aVar3.mo19330j(i2, m6010, m6012, m6013, m602, i26, i21, i22, i6, i3);
                    int max = Math.max(i29, aVar3.mo19326f());
                    i23 = i28 + aVar3.mo19325e();
                    if (i4 > 0) {
                        i23 += this.f15194F0;
                    }
                    m608 = m6011;
                    i24 = max;
                    m607 = m609;
                    i21 = 0;
                    m60 = m6014;
                    int i30 = i6;
                    m606 = m602;
                    i27 = i30;
                } else {
                    m60 m6015 = m608;
                    int i31 = i23;
                    int i32 = i24;
                    i4 = i25;
                    if (i4 < size - 1) {
                        m60 = this.f15201b.get(i4 + 1).f15217a.f17748a;
                        i5 = 0;
                    } else {
                        m60 = this.f17775c;
                        i5 = mo14916t2();
                    }
                    m60 m6016 = aVar3.f15217a.f17775c;
                    aVar3.mo19330j(i2, m6015, m607, m60, m606, i26, i21, i5, i27, i3);
                    i24 = i32 + aVar3.mo19326f();
                    int max2 = Math.max(i31, aVar3.mo19325e());
                    if (i4 > 0) {
                        i24 += this.f15193E0;
                    }
                    i23 = max2;
                    i22 = i5;
                    m608 = m6016;
                    i26 = 0;
                }
                i25 = i4 + 1;
                int i33 = i3;
                m605 = m60;
            }
            iArr[0] = i24;
            iArr[1] = i23;
        }
    }

    /* renamed from: j3 */
    public final void mo19305j3(o60[] o60Arr, int i, int i2, int i3, int[] iArr) {
        C2702a aVar;
        int i4 = i;
        if (i4 != 0) {
            if (this.f15201b.size() == 0) {
                aVar = new C2702a(i2, this.f17748a, this.f17765b, this.f17775c, this.f17781d, i3);
                this.f15201b.add(aVar);
            } else {
                C2702a aVar2 = this.f15201b.get(0);
                aVar2.mo19323c();
                aVar = aVar2;
                int i5 = i2;
                aVar.mo19330j(i5, this.f17748a, this.f17765b, this.f17775c, this.f17781d, mo14915s2(), mo14917u2(), mo14916t2(), mo14914r2(), i3);
            }
            for (int i6 = 0; i6 < i4; i6++) {
                aVar.mo19322b(o60Arr[i6]);
            }
            iArr[0] = aVar.mo19326f();
            iArr[1] = aVar.mo19325e();
        }
    }

    /* renamed from: k3 */
    public void mo19306k3(float f) {
        this.f15208k = f;
    }

    /* renamed from: l3 */
    public void mo19307l3(int i) {
        this.f15189A0 = i;
    }

    /* renamed from: m3 */
    public void mo19308m3(float f) {
        this.f15209l = f;
    }

    /* renamed from: n */
    public void mo15202n(o60 o60, HashMap<o60, o60> hashMap) {
        super.mo15202n(o60, hashMap);
        l81 l81 = (l81) o60;
        this.f15212y0 = l81.f15212y0;
        this.f15213z0 = l81.f15213z0;
        this.f15189A0 = l81.f15189A0;
        this.f15190B0 = l81.f15190B0;
        this.f15191C0 = l81.f15191C0;
        this.f15192D0 = l81.f15192D0;
        this.f15206i = l81.f15206i;
        this.f15207j = l81.f15207j;
        this.f15208k = l81.f15208k;
        this.f15209l = l81.f15209l;
        this.f15210m = l81.f15210m;
        this.f15211n = l81.f15211n;
        this.f15193E0 = l81.f15193E0;
        this.f15194F0 = l81.f15194F0;
        this.f15195G0 = l81.f15195G0;
        this.f15196H0 = l81.f15196H0;
        this.f15197I0 = l81.f15197I0;
        this.f15198J0 = l81.f15198J0;
        this.f15199K0 = l81.f15199K0;
    }

    /* renamed from: n3 */
    public void mo19309n3(int i) {
        this.f15190B0 = i;
    }

    /* renamed from: o3 */
    public void mo19310o3(int i) {
        this.f15195G0 = i;
    }

    /* renamed from: p3 */
    public void mo19311p3(float f) {
        this.f15206i = f;
    }

    /* renamed from: q3 */
    public void mo19312q3(int i) {
        this.f15193E0 = i;
    }

    /* renamed from: r3 */
    public void mo19313r3(int i) {
        this.f15212y0 = i;
    }

    /* renamed from: s3 */
    public void mo19314s3(float f) {
        this.f15210m = f;
    }

    /* renamed from: t3 */
    public void mo19315t3(int i) {
        this.f15191C0 = i;
    }

    /* renamed from: u3 */
    public void mo19316u3(float f) {
        this.f15211n = f;
    }

    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: type inference failed for: r11v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r6.f15213z0 == -1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r6.f15213z0 == -1) goto L_0x0054;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0112  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: v2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14918v2(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            int r0 = r6.f16180n0
            r11 = 0
            if (r0 <= 0) goto L_0x001c
            boolean r0 = r18.mo14920x2()
            if (r0 != 0) goto L_0x001c
            r6.mo14900A2(r11, r11)
            r6.mo14922z2(r11)
            return
        L_0x001c:
            int r12 = r18.mo14915s2()
            int r13 = r18.mo14916t2()
            int r14 = r18.mo14917u2()
            int r15 = r18.mo14914r2()
            r0 = 2
            int[] r5 = new int[r0]
            int r1 = r8 - r12
            int r1 = r1 - r13
            int r2 = r6.f15199K0
            r4 = 1
            if (r2 != r4) goto L_0x003a
            int r1 = r10 - r14
            int r1 = r1 - r15
        L_0x003a:
            r16 = r1
            r1 = -1
            if (r2 != 0) goto L_0x004a
            int r2 = r6.f15212y0
            if (r2 != r1) goto L_0x0045
            r6.f15212y0 = r11
        L_0x0045:
            int r2 = r6.f15213z0
            if (r2 != r1) goto L_0x0056
            goto L_0x0054
        L_0x004a:
            int r2 = r6.f15212y0
            if (r2 != r1) goto L_0x0050
            r6.f15212y0 = r11
        L_0x0050:
            int r2 = r6.f15213z0
            if (r2 != r1) goto L_0x0056
        L_0x0054:
            r6.f15213z0 = r11
        L_0x0056:
            com.onedelhi.secure.o60[] r1 = r6.f16179c
            r2 = 0
            r3 = 0
        L_0x005a:
            int r11 = r6.f16180n0
            r0 = 8
            if (r2 >= r11) goto L_0x0070
            com.onedelhi.secure.o60[] r11 = r6.f16179c
            r11 = r11[r2]
            int r11 = r11.mo21720l0()
            if (r11 != r0) goto L_0x006c
            int r3 = r3 + 1
        L_0x006c:
            int r2 = r2 + 1
            r0 = 2
            goto L_0x005a
        L_0x0070:
            if (r3 <= 0) goto L_0x008f
            int r11 = r11 - r3
            com.onedelhi.secure.o60[] r1 = new com.onedelhi.secure.o60[r11]
            r2 = 0
            r3 = 0
        L_0x0077:
            int r11 = r6.f16180n0
            if (r2 >= r11) goto L_0x008d
            com.onedelhi.secure.o60[] r11 = r6.f16179c
            r11 = r11[r2]
            int r4 = r11.mo21720l0()
            if (r4 == r0) goto L_0x0089
            r1[r3] = r11
            int r3 = r3 + 1
        L_0x0089:
            int r2 = r2 + 1
            r4 = 1
            goto L_0x0077
        L_0x008d:
            r2 = r3
            goto L_0x0090
        L_0x008f:
            r2 = r11
        L_0x0090:
            r6.f15205f = r1
            r6.f15200L0 = r2
            int r0 = r6.f15197I0
            if (r0 == 0) goto L_0x00cd
            r4 = 1
            if (r0 == r4) goto L_0x00c0
            r3 = 2
            if (r0 == r3) goto L_0x00b3
            r3 = 3
            if (r0 == r3) goto L_0x00a6
            r17 = r5
            r0 = 0
            r11 = 1
            goto L_0x00da
        L_0x00a6:
            int r3 = r6.f15199K0
            r0 = r18
            r11 = 1
            r4 = r16
            r17 = r5
            r0.mo19304i3(r1, r2, r3, r4, r5)
            goto L_0x00d9
        L_0x00b3:
            r17 = r5
            r11 = 1
            int r3 = r6.f15199K0
            r0 = r18
            r4 = r16
            r0.mo19302g3(r1, r2, r3, r4, r5)
            goto L_0x00d9
        L_0x00c0:
            r17 = r5
            r11 = 1
            int r3 = r6.f15199K0
            r0 = r18
            r4 = r16
            r0.mo19303h3(r1, r2, r3, r4, r5)
            goto L_0x00d9
        L_0x00cd:
            r17 = r5
            r11 = 1
            int r3 = r6.f15199K0
            r0 = r18
            r4 = r16
            r0.mo19305j3(r1, r2, r3, r4, r5)
        L_0x00d9:
            r0 = 0
        L_0x00da:
            r1 = r17[r0]
            int r1 = r1 + r12
            int r1 = r1 + r13
            r2 = r17[r11]
            int r2 = r2 + r14
            int r2 = r2 + r15
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r7 != r4) goto L_0x00ea
            r1 = r8
            goto L_0x00f5
        L_0x00ea:
            if (r7 != r3) goto L_0x00f1
            int r1 = java.lang.Math.min(r1, r8)
            goto L_0x00f5
        L_0x00f1:
            if (r7 != 0) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            r1 = 0
        L_0x00f5:
            if (r9 != r4) goto L_0x00f9
            r2 = r10
            goto L_0x0104
        L_0x00f9:
            if (r9 != r3) goto L_0x0100
            int r2 = java.lang.Math.min(r2, r10)
            goto L_0x0104
        L_0x0100:
            if (r9 != 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r2 = 0
        L_0x0104:
            r6.mo14900A2(r1, r2)
            r6.mo21691c2(r1)
            r6.mo21758y1(r2)
            int r1 = r6.f16180n0
            if (r1 <= 0) goto L_0x0112
            goto L_0x0113
        L_0x0112:
            r11 = 0
        L_0x0113:
            r6.mo14922z2(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.l81.mo14918v2(int, int, int, int):void");
    }

    /* renamed from: v3 */
    public void mo19317v3(int i) {
        this.f15192D0 = i;
    }

    /* renamed from: w3 */
    public void mo19318w3(int i) {
        this.f15198J0 = i;
    }

    /* renamed from: x3 */
    public void mo19319x3(int i) {
        this.f15199K0 = i;
    }

    /* renamed from: y3 */
    public void mo19320y3(int i) {
        this.f15196H0 = i;
    }

    /* renamed from: z3 */
    public void mo19321z3(float f) {
        this.f15207j = f;
    }
}
