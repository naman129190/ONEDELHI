package com.onedelhi.secure;

import com.onedelhi.secure.yh2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class g00 {

    /* renamed from: d */
    public static final int f28782d = 4096;

    /* renamed from: e */
    public static final int f28783e = 100;

    /* renamed from: f */
    public static final int f28784f = Integer.MAX_VALUE;

    /* renamed from: a */
    public int f28785a;

    /* renamed from: a */
    public h00 f28786a;

    /* renamed from: a */
    public boolean f28787a;

    /* renamed from: b */
    public int f28788b;

    /* renamed from: c */
    public int f28789c;

    /* renamed from: com.onedelhi.secure.g00$b */
    public static final class C5343b extends g00 {

        /* renamed from: a */
        public final byte[] f28790a;

        /* renamed from: b */
        public final boolean f28791b;

        /* renamed from: c */
        public boolean f28792c;

        /* renamed from: g */
        public int f28793g;

        /* renamed from: h */
        public int f28794h;

        /* renamed from: i */
        public int f28795i;

        /* renamed from: j */
        public int f28796j;

        /* renamed from: k */
        public int f28797k;

        /* renamed from: l */
        public int f28798l;

        public C5343b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f28798l = Integer.MAX_VALUE;
            this.f28790a = bArr;
            this.f28793g = i2 + i;
            this.f28795i = i;
            this.f28796j = i;
            this.f28791b = z;
        }

        /* renamed from: A */
        public int mo36411A() throws IOException {
            return mo36422L();
        }

        /* renamed from: B */
        public long mo36412B() throws IOException {
            return mo36423M();
        }

        /* renamed from: C */
        public float mo36413C() throws IOException {
            return Float.intBitsToFloat(mo36422L());
        }

        /* renamed from: D */
        public <T extends yh2> T mo36414D(int i, cz2<T> cz2, zy0 zy0) throws IOException {
            int i2 = this.f28785a;
            if (i2 < this.f28788b) {
                this.f28785a = i2 + 1;
                T t = (yh2) cz2.mo34004d(this, zy0);
                mo36435a(wx4.m69700c(i, 4));
                this.f28785a--;
                return t;
            }
            throw nt1.m58789j();
        }

        /* renamed from: E */
        public void mo36415E(int i, yh2.C7362a aVar, zy0 zy0) throws IOException {
            int i2 = this.f28785a;
            if (i2 < this.f28788b) {
                this.f28785a = i2 + 1;
                aVar.mo43380Z7(this, zy0);
                mo36435a(wx4.m69700c(i, 4));
                this.f28785a--;
                return;
            }
            throw nt1.m58789j();
        }

        /* renamed from: F */
        public int mo36416F() throws IOException {
            return mo36424N();
        }

        /* renamed from: G */
        public long mo36417G() throws IOException {
            return mo36425Q();
        }

        /* renamed from: H */
        public <T extends yh2> T mo36418H(cz2<T> cz2, zy0 zy0) throws IOException {
            int N = mo36424N();
            if (this.f28785a < this.f28788b) {
                int t = mo36455t(N);
                this.f28785a++;
                T t2 = (yh2) cz2.mo34004d(this, zy0);
                mo36435a(0);
                this.f28785a--;
                if (mo36443f() == 0) {
                    mo36454s(t);
                    return t2;
                }
                throw nt1.m58791n();
            }
            throw nt1.m58789j();
        }

        /* renamed from: I */
        public void mo36419I(yh2.C7362a aVar, zy0 zy0) throws IOException {
            int N = mo36424N();
            if (this.f28785a < this.f28788b) {
                int t = mo36455t(N);
                this.f28785a++;
                aVar.mo43380Z7(this, zy0);
                mo36435a(0);
                this.f28785a--;
                if (mo36443f() == 0) {
                    mo36454s(t);
                    return;
                }
                throw nt1.m58791n();
            }
            throw nt1.m58789j();
        }

        /* renamed from: J */
        public byte mo36420J() throws IOException {
            int i = this.f28795i;
            if (i != this.f28793g) {
                byte[] bArr = this.f28790a;
                this.f28795i = i + 1;
                return bArr[i];
            }
            throw nt1.m58791n();
        }

        /* renamed from: K */
        public byte[] mo36421K(int i) throws IOException {
            if (i > 0) {
                int i2 = this.f28793g;
                int i3 = this.f28795i;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f28795i = i4;
                    return Arrays.copyOfRange(this.f28790a, i3, i4);
                }
            }
            if (i > 0) {
                throw nt1.m58791n();
            } else if (i == 0) {
                return vs1.f36666a;
            } else {
                throw nt1.m58787h();
            }
        }

        /* renamed from: L */
        public int mo36422L() throws IOException {
            int i = this.f28795i;
            if (this.f28793g - i >= 4) {
                byte[] bArr = this.f28790a;
                this.f28795i = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw nt1.m58791n();
        }

        /* renamed from: M */
        public long mo36423M() throws IOException {
            int i = this.f28795i;
            if (this.f28793g - i >= 8) {
                byte[] bArr = this.f28790a;
                this.f28795i = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw nt1.m58791n();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo36424N() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f28795i
                int r1 = r5.f28793g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f28790a
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f28795i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo36426R()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f28795i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g00.C5343b.mo36424N():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: Q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo36425Q() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f28795i
                int r1 = r11.f28793g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f28790a
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f28795i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo36426R()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f28795i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g00.C5343b.mo36425Q():long");
        }

        /* renamed from: R */
        public long mo36426R() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo36420J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & C7276xq.f37586a) == 0) {
                    return j;
                }
            }
            throw nt1.m58786g();
        }

        /* renamed from: S */
        public int mo36427S() throws IOException {
            return mo36422L();
        }

        /* renamed from: T */
        public long mo36428T() throws IOException {
            return mo36423M();
        }

        /* renamed from: U */
        public int mo36429U() throws IOException {
            return g00.m48668b(mo36424N());
        }

        /* renamed from: V */
        public long mo36430V() throws IOException {
            return g00.m48669c(mo36425Q());
        }

        /* renamed from: W */
        public String mo36431W() throws IOException {
            int N = mo36424N();
            if (N > 0) {
                int i = this.f28793g;
                int i2 = this.f28795i;
                if (N <= i - i2) {
                    String str = new String(this.f28790a, i2, N, vs1.f36665a);
                    this.f28795i += N;
                    return str;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N < 0) {
                throw nt1.m58787h();
            }
            throw nt1.m58791n();
        }

        /* renamed from: X */
        public String mo36432X() throws IOException {
            int N = mo36424N();
            if (N > 0) {
                int i = this.f28793g;
                int i2 = this.f28795i;
                if (N <= i - i2) {
                    String h = hq4.m50759h(this.f28790a, i2, N);
                    this.f28795i += N;
                    return h;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N <= 0) {
                throw nt1.m58787h();
            }
            throw nt1.m58791n();
        }

        /* renamed from: Y */
        public int mo36433Y() throws IOException {
            if (mo36449i()) {
                this.f28797k = 0;
                return 0;
            }
            int N = mo36424N();
            this.f28797k = N;
            if (wx4.m69698a(N) != 0) {
                return this.f28797k;
            }
            throw nt1.m58783d();
        }

        /* renamed from: Z */
        public int mo36434Z() throws IOException {
            return mo36424N();
        }

        /* renamed from: a */
        public void mo36435a(int i) throws nt1 {
            if (this.f28797k != i) {
                throw nt1.m58782c();
            }
        }

        /* renamed from: a0 */
        public long mo36436a0() throws IOException {
            return mo36425Q();
        }

        @Deprecated
        /* renamed from: b0 */
        public void mo36437b0(int i, yh2.C7362a aVar) throws IOException {
            mo36415E(i, aVar, zy0.m74393d());
        }

        /* renamed from: c0 */
        public void mo36438c0() {
            this.f28796j = this.f28795i;
        }

        /* renamed from: e */
        public void mo36441e(boolean z) {
            this.f28792c = z;
        }

        /* renamed from: f */
        public int mo36443f() {
            int i = this.f28798l;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - mo36447h();
        }

        /* renamed from: g */
        public int mo36445g() {
            return this.f28797k;
        }

        /* renamed from: g0 */
        public boolean mo36446g0(int i) throws IOException {
            int b = wx4.m69699b(i);
            if (b == 0) {
                mo36463n0();
                return true;
            } else if (b == 1) {
                mo36452k0(8);
                return true;
            } else if (b == 2) {
                mo36452k0(mo36424N());
                return true;
            } else if (b == 3) {
                mo36450i0();
                mo36435a(wx4.m69700c(wx4.m69698a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo36452k0(4);
                    return true;
                }
                throw nt1.m58785f();
            }
        }

        /* renamed from: h */
        public int mo36447h() {
            return this.f28795i - this.f28796j;
        }

        /* renamed from: h0 */
        public boolean mo36448h0(int i, i00 i00) throws IOException {
            int b = wx4.m69699b(i);
            if (b == 0) {
                long G = mo36417G();
                i00.mo37762Z1(i);
                i00.mo37781i2(G);
                return true;
            } else if (b == 1) {
                long M = mo36423M();
                i00.mo37762Z1(i);
                i00.mo37738D1(M);
                return true;
            } else if (b == 2) {
                C5173er x = mo36459x();
                i00.mo37762Z1(i);
                i00.mo37796z1(x);
                return true;
            } else if (b == 3) {
                i00.mo37762Z1(i);
                mo36451j0(i00);
                int c = wx4.m69700c(wx4.m69698a(i), 4);
                mo36435a(c);
                i00.mo37762Z1(c);
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    int L = mo36422L();
                    i00.mo37762Z1(i);
                    i00.mo37736C1(L);
                    return true;
                }
                throw nt1.m58785f();
            }
        }

        /* renamed from: i */
        public boolean mo36449i() throws IOException {
            return this.f28795i == this.f28793g;
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: i0 */
        public void mo36450i0() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo36433Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo36446g0(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g00.C5343b.mo36450i0():void");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: j0 */
        public void mo36451j0(com.onedelhi.secure.i00 r2) throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo36433Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo36448h0(r0, r2)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g00.C5343b.mo36451j0(com.onedelhi.secure.i00):void");
        }

        /* renamed from: k0 */
        public void mo36452k0(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f28793g;
                int i3 = this.f28795i;
                if (i <= i2 - i3) {
                    this.f28795i = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw nt1.m58787h();
            }
            throw nt1.m58791n();
        }

        /* renamed from: m0 */
        public final void mo36462m0() {
            int i = this.f28793g + this.f28794h;
            this.f28793g = i;
            int i2 = i - this.f28796j;
            int i3 = this.f28798l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f28794h = i4;
                this.f28793g = i - i4;
                return;
            }
            this.f28794h = 0;
        }

        /* renamed from: n0 */
        public final void mo36463n0() throws IOException {
            if (this.f28793g - this.f28795i >= 10) {
                mo36464o0();
            } else {
                mo36465p0();
            }
        }

        /* renamed from: o0 */
        public final void mo36464o0() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f28790a;
                int i2 = this.f28795i;
                this.f28795i = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw nt1.m58786g();
        }

        /* renamed from: p0 */
        public final void mo36465p0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo36420J() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw nt1.m58786g();
        }

        /* renamed from: s */
        public void mo36454s(int i) {
            this.f28798l = i;
            mo36462m0();
        }

        /* renamed from: t */
        public int mo36455t(int i) throws nt1 {
            if (i >= 0) {
                int h = i + mo36447h();
                if (h >= 0) {
                    int i2 = this.f28798l;
                    if (h <= i2) {
                        this.f28798l = h;
                        mo36462m0();
                        return i2;
                    }
                    throw nt1.m58791n();
                }
                throw nt1.m58788i();
            }
            throw nt1.m58787h();
        }

        /* renamed from: u */
        public boolean mo36456u() throws IOException {
            return mo36425Q() != 0;
        }

        /* renamed from: v */
        public byte[] mo36457v() throws IOException {
            return mo36421K(mo36424N());
        }

        /* renamed from: w */
        public ByteBuffer mo36458w() throws IOException {
            int N = mo36424N();
            if (N > 0) {
                int i = this.f28793g;
                int i2 = this.f28795i;
                if (N <= i - i2) {
                    ByteBuffer wrap = (this.f28791b || !this.f28792c) ? ByteBuffer.wrap(Arrays.copyOfRange(this.f28790a, i2, i2 + N)) : ByteBuffer.wrap(this.f28790a, i2, N).slice();
                    this.f28795i += N;
                    return wrap;
                }
            }
            if (N == 0) {
                return vs1.f36664a;
            }
            if (N < 0) {
                throw nt1.m58787h();
            }
            throw nt1.m58791n();
        }

        /* renamed from: x */
        public C5173er mo36459x() throws IOException {
            int N = mo36424N();
            if (N > 0) {
                int i = this.f28793g;
                int i2 = this.f28795i;
                if (N <= i - i2) {
                    C5173er v = (!this.f28791b || !this.f28792c) ? C5173er.m47135v(this.f28790a, i2, N) : C5173er.m47131r0(this.f28790a, i2, N);
                    this.f28795i += N;
                    return v;
                }
            }
            return N == 0 ? C5173er.f28039a : C5173er.m47129p0(mo36421K(N));
        }

        /* renamed from: y */
        public double mo36460y() throws IOException {
            return Double.longBitsToDouble(mo36423M());
        }

        /* renamed from: z */
        public int mo36461z() throws IOException {
            return mo36424N();
        }
    }

    /* renamed from: com.onedelhi.secure.g00$c */
    public static final class C5344c extends g00 {

        /* renamed from: a */
        public long f28799a;

        /* renamed from: a */
        public Iterable<ByteBuffer> f28800a;

        /* renamed from: a */
        public ByteBuffer f28801a;

        /* renamed from: a */
        public Iterator<ByteBuffer> f28802a;

        /* renamed from: b */
        public long f28803b;

        /* renamed from: b */
        public boolean f28804b;

        /* renamed from: c */
        public long f28805c;

        /* renamed from: c */
        public boolean f28806c;

        /* renamed from: d */
        public long f28807d;

        /* renamed from: g */
        public int f28808g;

        /* renamed from: h */
        public int f28809h;

        /* renamed from: i */
        public int f28810i;

        /* renamed from: j */
        public int f28811j;

        /* renamed from: k */
        public int f28812k;

        /* renamed from: l */
        public int f28813l;

        public C5344c(Iterable<ByteBuffer> iterable, int i, boolean z) {
            super();
            this.f28810i = Integer.MAX_VALUE;
            this.f28808g = i;
            this.f28800a = iterable;
            this.f28802a = iterable.iterator();
            this.f28804b = z;
            this.f28812k = 0;
            this.f28813l = 0;
            if (i == 0) {
                this.f28801a = vs1.f36664a;
                this.f28799a = 0;
                this.f28803b = 0;
                this.f28807d = 0;
                this.f28805c = 0;
                return;
            }
            mo36473t0();
        }

        /* renamed from: A */
        public int mo36411A() throws IOException {
            return mo36422L();
        }

        /* renamed from: B */
        public long mo36412B() throws IOException {
            return mo36423M();
        }

        /* renamed from: C */
        public float mo36413C() throws IOException {
            return Float.intBitsToFloat(mo36422L());
        }

        /* renamed from: D */
        public <T extends yh2> T mo36414D(int i, cz2<T> cz2, zy0 zy0) throws IOException {
            int i2 = this.f28785a;
            if (i2 < this.f28788b) {
                this.f28785a = i2 + 1;
                T t = (yh2) cz2.mo34004d(this, zy0);
                mo36435a(wx4.m69700c(i, 4));
                this.f28785a--;
                return t;
            }
            throw nt1.m58789j();
        }

        /* renamed from: E */
        public void mo36415E(int i, yh2.C7362a aVar, zy0 zy0) throws IOException {
            int i2 = this.f28785a;
            if (i2 < this.f28788b) {
                this.f28785a = i2 + 1;
                aVar.mo43380Z7(this, zy0);
                mo36435a(wx4.m69700c(i, 4));
                this.f28785a--;
                return;
            }
            throw nt1.m58789j();
        }

        /* renamed from: F */
        public int mo36416F() throws IOException {
            return mo36424N();
        }

        /* renamed from: G */
        public long mo36417G() throws IOException {
            return mo36425Q();
        }

        /* renamed from: H */
        public <T extends yh2> T mo36418H(cz2<T> cz2, zy0 zy0) throws IOException {
            int N = mo36424N();
            if (this.f28785a < this.f28788b) {
                int t = mo36455t(N);
                this.f28785a++;
                T t2 = (yh2) cz2.mo34004d(this, zy0);
                mo36435a(0);
                this.f28785a--;
                if (mo36443f() == 0) {
                    mo36454s(t);
                    return t2;
                }
                throw nt1.m58791n();
            }
            throw nt1.m58789j();
        }

        /* renamed from: I */
        public void mo36419I(yh2.C7362a aVar, zy0 zy0) throws IOException {
            int N = mo36424N();
            if (this.f28785a < this.f28788b) {
                int t = mo36455t(N);
                this.f28785a++;
                aVar.mo43380Z7(this, zy0);
                mo36435a(0);
                this.f28785a--;
                if (mo36443f() == 0) {
                    mo36454s(t);
                    return;
                }
                throw nt1.m58791n();
            }
            throw nt1.m58789j();
        }

        /* renamed from: J */
        public byte mo36420J() throws IOException {
            if (mo36466m0() == 0) {
                mo36467n0();
            }
            long j = this.f28799a;
            this.f28799a = 1 + j;
            return ko4.m54663A(j);
        }

        /* renamed from: K */
        public byte[] mo36421K(int i) throws IOException {
            if (i >= 0) {
                long j = (long) i;
                if (j <= mo36466m0()) {
                    byte[] bArr = new byte[i];
                    ko4.m54719p(this.f28799a, bArr, 0, j);
                    this.f28799a += j;
                    return bArr;
                }
            }
            if (i >= 0 && i <= mo36470q0()) {
                byte[] bArr2 = new byte[i];
                mo36468o0(bArr2, 0, i);
                return bArr2;
            } else if (i > 0) {
                throw nt1.m58791n();
            } else if (i == 0) {
                return vs1.f36666a;
            } else {
                throw nt1.m58787h();
            }
        }

        /* renamed from: L */
        public int mo36422L() throws IOException {
            if (mo36466m0() < 4) {
                return (mo36420J() & 255) | ((mo36420J() & 255) << 8) | ((mo36420J() & 255) << 16) | ((mo36420J() & 255) << 24);
            }
            long j = this.f28799a;
            this.f28799a = 4 + j;
            return ((ko4.m54663A(j + 3) & 255) << 24) | (ko4.m54663A(j) & 255) | ((ko4.m54663A(1 + j) & 255) << 8) | ((ko4.m54663A(2 + j) & 255) << 16);
        }

        /* renamed from: M */
        public long mo36423M() throws IOException {
            if (mo36466m0() < 8) {
                return (((long) mo36420J()) & 255) | ((((long) mo36420J()) & 255) << 8) | ((((long) mo36420J()) & 255) << 16) | ((((long) mo36420J()) & 255) << 24) | ((((long) mo36420J()) & 255) << 32) | ((((long) mo36420J()) & 255) << 40) | ((((long) mo36420J()) & 255) << 48) | ((((long) mo36420J()) & 255) << 56);
            }
            long j = this.f28799a;
            this.f28799a = 8 + j;
            return ((((long) ko4.m54663A(j + 7)) & 255) << 56) | (((long) ko4.m54663A(j)) & 255) | ((((long) ko4.m54663A(1 + j)) & 255) << 8) | ((((long) ko4.m54663A(2 + j)) & 255) << 16) | ((((long) ko4.m54663A(3 + j)) & 255) << 24) | ((((long) ko4.m54663A(4 + j)) & 255) << 32) | ((((long) ko4.m54663A(5 + j)) & 255) << 40) | ((((long) ko4.m54663A(6 + j)) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
            if (com.onedelhi.secure.ko4.m54663A(r4) < 0) goto L_0x008a;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo36424N() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f28799a
                long r2 = r10.f28807d
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L_0x000a
                goto L_0x008a
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.onedelhi.secure.ko4.m54663A(r0)
                if (r0 < 0) goto L_0x001a
                long r4 = r10.f28799a
                long r4 = r4 + r2
                r10.f28799a = r4
                return r0
            L_0x001a:
                long r6 = r10.f28807d
                long r8 = r10.f28799a
                long r6 = r6 - r8
                r8 = 10
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0026
                goto L_0x008a
            L_0x0026:
                long r6 = r4 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0034
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0090
            L_0x0034:
                long r4 = r6 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0043
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x0041:
                r6 = r4
                goto L_0x0090
            L_0x0043:
                long r6 = r4 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0053
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x0090
            L_0x0053:
                long r4 = r6 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r4)
                if (r1 >= 0) goto L_0x0090
                long r4 = r6 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r4)
                if (r1 >= 0) goto L_0x0090
                long r4 = r6 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r4)
                if (r1 >= 0) goto L_0x0090
            L_0x008a:
                long r0 = r10.mo36426R()
                int r1 = (int) r0
                return r1
            L_0x0090:
                r10.f28799a = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g00.C5344c.mo36424N():int");
        }

        /* renamed from: Q */
        public long mo36425Q() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f28799a;
            if (this.f28807d != j4) {
                long j5 = j4 + 1;
                byte A = ko4.m54663A(j4);
                if (A >= 0) {
                    this.f28799a++;
                    return (long) A;
                } else if (this.f28807d - this.f28799a >= 10) {
                    long j6 = j5 + 1;
                    byte A2 = A ^ (ko4.m54663A(j5) << 7);
                    if (A2 < 0) {
                        b = A2 ^ C7276xq.f37586a;
                    } else {
                        long j7 = j6 + 1;
                        byte A3 = A2 ^ (ko4.m54663A(j6) << 14);
                        if (A3 >= 0) {
                            j = (long) (A3 ^ C7276xq.f37586a);
                        } else {
                            j6 = j7 + 1;
                            byte A4 = A3 ^ (ko4.m54663A(j7) << 21);
                            if (A4 < 0) {
                                b = A4 ^ C7276xq.f37586a;
                            } else {
                                j7 = j6 + 1;
                                long A5 = ((long) A4) ^ (((long) ko4.m54663A(j6)) << 28);
                                if (A5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long A6 = A5 ^ (((long) ko4.m54663A(j7)) << 35);
                                    if (A6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        A5 = A6 ^ (((long) ko4.m54663A(j8)) << 42);
                                        if (A5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            A6 = A5 ^ (((long) ko4.m54663A(j7)) << 49);
                                            if (A6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (A6 ^ (((long) ko4.m54663A(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) ko4.m54663A(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f28799a = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = A6 ^ j2;
                                    j6 = j8;
                                    this.f28799a = j6;
                                    return j;
                                }
                                j = A5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f28799a = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f28799a = j6;
                    return j;
                }
            }
            return mo36426R();
        }

        /* renamed from: R */
        public long mo36426R() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo36420J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & C7276xq.f37586a) == 0) {
                    return j;
                }
            }
            throw nt1.m58786g();
        }

        /* renamed from: S */
        public int mo36427S() throws IOException {
            return mo36422L();
        }

        /* renamed from: T */
        public long mo36428T() throws IOException {
            return mo36423M();
        }

        /* renamed from: U */
        public int mo36429U() throws IOException {
            return g00.m48668b(mo36424N());
        }

        /* renamed from: V */
        public long mo36430V() throws IOException {
            return g00.m48669c(mo36425Q());
        }

        /* renamed from: W */
        public String mo36431W() throws IOException {
            int N = mo36424N();
            if (N > 0) {
                long j = (long) N;
                long j2 = this.f28807d;
                long j3 = this.f28799a;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[N];
                    ko4.m54719p(j3, bArr, 0, j);
                    String str = new String(bArr, vs1.f36665a);
                    this.f28799a += j;
                    return str;
                }
            }
            if (N > 0 && N <= mo36470q0()) {
                byte[] bArr2 = new byte[N];
                mo36468o0(bArr2, 0, N);
                return new String(bArr2, vs1.f36665a);
            } else if (N == 0) {
                return "";
            } else {
                if (N < 0) {
                    throw nt1.m58787h();
                }
                throw nt1.m58791n();
            }
        }

        /* renamed from: X */
        public String mo36432X() throws IOException {
            int N = mo36424N();
            if (N > 0) {
                long j = (long) N;
                long j2 = this.f28807d;
                long j3 = this.f28799a;
                if (j <= j2 - j3) {
                    String g = hq4.m50758g(this.f28801a, (int) (j3 - this.f28803b), N);
                    this.f28799a += j;
                    return g;
                }
            }
            if (N >= 0 && N <= mo36470q0()) {
                byte[] bArr = new byte[N];
                mo36468o0(bArr, 0, N);
                return hq4.m50759h(bArr, 0, N);
            } else if (N == 0) {
                return "";
            } else {
                if (N <= 0) {
                    throw nt1.m58787h();
                }
                throw nt1.m58791n();
            }
        }

        /* renamed from: Y */
        public int mo36433Y() throws IOException {
            if (mo36449i()) {
                this.f28811j = 0;
                return 0;
            }
            int N = mo36424N();
            this.f28811j = N;
            if (wx4.m69698a(N) != 0) {
                return this.f28811j;
            }
            throw nt1.m58783d();
        }

        /* renamed from: Z */
        public int mo36434Z() throws IOException {
            return mo36424N();
        }

        /* renamed from: a */
        public void mo36435a(int i) throws nt1 {
            if (this.f28811j != i) {
                throw nt1.m58782c();
            }
        }

        /* renamed from: a0 */
        public long mo36436a0() throws IOException {
            return mo36425Q();
        }

        @Deprecated
        /* renamed from: b0 */
        public void mo36437b0(int i, yh2.C7362a aVar) throws IOException {
            mo36415E(i, aVar, zy0.m74393d());
        }

        /* renamed from: c0 */
        public void mo36438c0() {
            this.f28813l = (int) ((((long) this.f28812k) + this.f28799a) - this.f28803b);
        }

        /* renamed from: e */
        public void mo36441e(boolean z) {
            this.f28806c = z;
        }

        /* renamed from: f */
        public int mo36443f() {
            int i = this.f28810i;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - mo36447h();
        }

        /* renamed from: g */
        public int mo36445g() {
            return this.f28811j;
        }

        /* renamed from: g0 */
        public boolean mo36446g0(int i) throws IOException {
            int b = wx4.m69699b(i);
            if (b == 0) {
                mo36471r0();
                return true;
            } else if (b == 1) {
                mo36452k0(8);
                return true;
            } else if (b == 2) {
                mo36452k0(mo36424N());
                return true;
            } else if (b == 3) {
                mo36450i0();
                mo36435a(wx4.m69700c(wx4.m69698a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo36452k0(4);
                    return true;
                }
                throw nt1.m58785f();
            }
        }

        /* renamed from: h */
        public int mo36447h() {
            return (int) ((((long) (this.f28812k - this.f28813l)) + this.f28799a) - this.f28803b);
        }

        /* renamed from: h0 */
        public boolean mo36448h0(int i, i00 i00) throws IOException {
            int b = wx4.m69699b(i);
            if (b == 0) {
                long G = mo36417G();
                i00.mo37762Z1(i);
                i00.mo37781i2(G);
                return true;
            } else if (b == 1) {
                long M = mo36423M();
                i00.mo37762Z1(i);
                i00.mo37738D1(M);
                return true;
            } else if (b == 2) {
                C5173er x = mo36459x();
                i00.mo37762Z1(i);
                i00.mo37796z1(x);
                return true;
            } else if (b == 3) {
                i00.mo37762Z1(i);
                mo36451j0(i00);
                int c = wx4.m69700c(wx4.m69698a(i), 4);
                mo36435a(c);
                i00.mo37762Z1(c);
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    int L = mo36422L();
                    i00.mo37762Z1(i);
                    i00.mo37736C1(L);
                    return true;
                }
                throw nt1.m58785f();
            }
        }

        /* renamed from: i */
        public boolean mo36449i() throws IOException {
            return (((long) this.f28812k) + this.f28799a) - this.f28803b == ((long) this.f28808g);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: i0 */
        public void mo36450i0() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo36433Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo36446g0(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g00.C5344c.mo36450i0():void");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: j0 */
        public void mo36451j0(com.onedelhi.secure.i00 r2) throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo36433Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo36448h0(r0, r2)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g00.C5344c.mo36451j0(com.onedelhi.secure.i00):void");
        }

        /* renamed from: k0 */
        public void mo36452k0(int i) throws IOException {
            if (i >= 0 && ((long) i) <= (((long) (this.f28808g - this.f28812k)) - this.f28799a) + this.f28803b) {
                while (i > 0) {
                    if (mo36466m0() == 0) {
                        mo36467n0();
                    }
                    int min = Math.min(i, (int) mo36466m0());
                    i -= min;
                    this.f28799a += (long) min;
                }
            } else if (i < 0) {
                throw nt1.m58787h();
            } else {
                throw nt1.m58791n();
            }
        }

        /* renamed from: m0 */
        public final long mo36466m0() {
            return this.f28807d - this.f28799a;
        }

        /* renamed from: n0 */
        public final void mo36467n0() throws nt1 {
            if (this.f28802a.hasNext()) {
                mo36473t0();
                return;
            }
            throw nt1.m58791n();
        }

        /* renamed from: o0 */
        public final void mo36468o0(byte[] bArr, int i, int i2) throws IOException {
            if (i2 >= 0 && i2 <= mo36470q0()) {
                int i3 = i2;
                while (i3 > 0) {
                    if (mo36466m0() == 0) {
                        mo36467n0();
                    }
                    int min = Math.min(i3, (int) mo36466m0());
                    long j = (long) min;
                    ko4.m54719p(this.f28799a, bArr, (long) ((i2 - i3) + i), j);
                    i3 -= min;
                    this.f28799a += j;
                }
            } else if (i2 > 0) {
                throw nt1.m58791n();
            } else if (i2 != 0) {
                throw nt1.m58787h();
            }
        }

        /* renamed from: p0 */
        public final void mo36469p0() {
            int i = this.f28808g + this.f28809h;
            this.f28808g = i;
            int i2 = i - this.f28813l;
            int i3 = this.f28810i;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f28809h = i4;
                this.f28808g = i - i4;
                return;
            }
            this.f28809h = 0;
        }

        /* renamed from: q0 */
        public final int mo36470q0() {
            return (int) ((((long) (this.f28808g - this.f28812k)) - this.f28799a) + this.f28803b);
        }

        /* renamed from: r0 */
        public final void mo36471r0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo36420J() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw nt1.m58786g();
        }

        /* renamed from: s */
        public void mo36454s(int i) {
            this.f28810i = i;
            mo36469p0();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
            throw com.onedelhi.secure.nt1.m58791n();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
            r3.f28801a.position(r0);
            r3.f28801a.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0029 */
        /* renamed from: s0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.nio.ByteBuffer mo36472s0(int r4, int r5) throws java.io.IOException {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f28801a
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.f28801a
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.f28801a     // Catch:{ IllegalArgumentException -> 0x0029 }
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r4 = r3.f28801a     // Catch:{ IllegalArgumentException -> 0x0029 }
                r4.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r4 = r3.f28801a     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r5 = r3.f28801a
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f28801a
                r5.limit(r1)
                return r4
            L_0x0027:
                r4 = move-exception
                goto L_0x002e
            L_0x0029:
                com.onedelhi.secure.nt1 r4 = com.onedelhi.secure.nt1.m58791n()     // Catch:{ all -> 0x0027 }
                throw r4     // Catch:{ all -> 0x0027 }
            L_0x002e:
                java.nio.ByteBuffer r5 = r3.f28801a
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f28801a
                r5.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g00.C5344c.mo36472s0(int, int):java.nio.ByteBuffer");
        }

        /* renamed from: t */
        public int mo36455t(int i) throws nt1 {
            if (i >= 0) {
                int h = i + mo36447h();
                int i2 = this.f28810i;
                if (h <= i2) {
                    this.f28810i = h;
                    mo36469p0();
                    return i2;
                }
                throw nt1.m58791n();
            }
            throw nt1.m58787h();
        }

        /* renamed from: t0 */
        public final void mo36473t0() {
            ByteBuffer next = this.f28802a.next();
            this.f28801a = next;
            this.f28812k += (int) (this.f28799a - this.f28803b);
            long position = (long) next.position();
            this.f28799a = position;
            this.f28803b = position;
            this.f28807d = (long) this.f28801a.limit();
            long k = ko4.m54709k(this.f28801a);
            this.f28805c = k;
            this.f28799a += k;
            this.f28803b += k;
            this.f28807d += k;
        }

        /* renamed from: u */
        public boolean mo36456u() throws IOException {
            return mo36425Q() != 0;
        }

        /* renamed from: v */
        public byte[] mo36457v() throws IOException {
            return mo36421K(mo36424N());
        }

        /* renamed from: w */
        public ByteBuffer mo36458w() throws IOException {
            int N = mo36424N();
            if (N > 0) {
                long j = (long) N;
                if (j <= mo36466m0()) {
                    if (this.f28804b || !this.f28806c) {
                        byte[] bArr = new byte[N];
                        ko4.m54719p(this.f28799a, bArr, 0, j);
                        this.f28799a += j;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j2 = this.f28799a + j;
                    this.f28799a = j2;
                    long j3 = this.f28805c;
                    return mo36472s0((int) ((j2 - j3) - j), (int) (j2 - j3));
                }
            }
            if (N > 0 && N <= mo36470q0()) {
                byte[] bArr2 = new byte[N];
                mo36468o0(bArr2, 0, N);
                return ByteBuffer.wrap(bArr2);
            } else if (N == 0) {
                return vs1.f36664a;
            } else {
                if (N < 0) {
                    throw nt1.m58787h();
                }
                throw nt1.m58791n();
            }
        }

        /* renamed from: x */
        public C5173er mo36459x() throws IOException {
            int N = mo36424N();
            if (N > 0) {
                long j = (long) N;
                long j2 = this.f28807d;
                long j3 = this.f28799a;
                if (j <= j2 - j3) {
                    if (!this.f28804b || !this.f28806c) {
                        byte[] bArr = new byte[N];
                        ko4.m54719p(j3, bArr, 0, j);
                        this.f28799a += j;
                        return C5173er.m47129p0(bArr);
                    }
                    int i = (int) (j3 - this.f28805c);
                    C5173er o0 = C5173er.m47128o0(mo36472s0(i, N + i));
                    this.f28799a += j;
                    return o0;
                }
            }
            if (N <= 0 || N > mo36470q0()) {
                if (N == 0) {
                    return C5173er.f28039a;
                }
                if (N < 0) {
                    throw nt1.m58787h();
                }
                throw nt1.m58791n();
            } else if (!this.f28804b || !this.f28806c) {
                byte[] bArr2 = new byte[N];
                mo36468o0(bArr2, 0, N);
                return C5173er.m47129p0(bArr2);
            } else {
                ArrayList arrayList = new ArrayList();
                while (N > 0) {
                    if (mo36466m0() == 0) {
                        mo36467n0();
                    }
                    int min = Math.min(N, (int) mo36466m0());
                    int i2 = (int) (this.f28799a - this.f28805c);
                    arrayList.add(C5173er.m47128o0(mo36472s0(i2, i2 + min)));
                    N -= min;
                    this.f28799a += (long) min;
                }
                return C5173er.m47125n(arrayList);
            }
        }

        /* renamed from: y */
        public double mo36460y() throws IOException {
            return Double.longBitsToDouble(mo36423M());
        }

        /* renamed from: z */
        public int mo36461z() throws IOException {
            return mo36424N();
        }
    }

    /* renamed from: com.onedelhi.secure.g00$d */
    public static final class C5345d extends g00 {

        /* renamed from: a */
        public C5346a f28814a;

        /* renamed from: a */
        public final InputStream f28815a;

        /* renamed from: a */
        public final byte[] f28816a;

        /* renamed from: g */
        public int f28817g;

        /* renamed from: h */
        public int f28818h;

        /* renamed from: i */
        public int f28819i;

        /* renamed from: j */
        public int f28820j;

        /* renamed from: k */
        public int f28821k;

        /* renamed from: l */
        public int f28822l;

        /* renamed from: com.onedelhi.secure.g00$d$a */
        public interface C5346a {
            /* renamed from: a */
            void mo36485a();
        }

        /* renamed from: com.onedelhi.secure.g00$d$b */
        public class C5347b implements C5346a {

            /* renamed from: a */
            public int f28823a;

            /* renamed from: a */
            public ByteArrayOutputStream f28825a;

            public C5347b() {
                this.f28823a = C5345d.this.f28819i;
            }

            /* renamed from: a */
            public void mo36485a() {
                if (this.f28825a == null) {
                    this.f28825a = new ByteArrayOutputStream();
                }
                this.f28825a.write(C5345d.this.f28816a, this.f28823a, C5345d.this.f28819i - this.f28823a);
                this.f28823a = 0;
            }

            /* renamed from: b */
            public ByteBuffer mo36486b() {
                ByteArrayOutputStream byteArrayOutputStream = this.f28825a;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(C5345d.this.f28816a, this.f28823a, C5345d.this.f28819i - this.f28823a);
                }
                byteArrayOutputStream.write(C5345d.this.f28816a, this.f28823a, C5345d.this.f28819i);
                return ByteBuffer.wrap(this.f28825a.toByteArray());
            }
        }

        public C5345d(InputStream inputStream, int i) {
            super();
            this.f28822l = Integer.MAX_VALUE;
            this.f28814a = null;
            vs1.m68433e(inputStream, "input");
            this.f28815a = inputStream;
            this.f28816a = new byte[i];
            this.f28817g = 0;
            this.f28819i = 0;
            this.f28821k = 0;
        }

        /* renamed from: o0 */
        public static int m48836o0(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (nt1 e) {
                e.mo41484k();
                throw e;
            }
        }

        /* renamed from: p0 */
        public static int m48837p0(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (nt1 e) {
                e.mo41484k();
                throw e;
            }
        }

        /* renamed from: w0 */
        public static long m48838w0(InputStream inputStream, long j) throws IOException {
            try {
                return inputStream.skip(j);
            } catch (nt1 e) {
                e.mo41484k();
                throw e;
            }
        }

        /* renamed from: A */
        public int mo36411A() throws IOException {
            return mo36422L();
        }

        /* renamed from: A0 */
        public final void mo36474A0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo36420J() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw nt1.m58786g();
        }

        /* renamed from: B */
        public long mo36412B() throws IOException {
            return mo36423M();
        }

        /* renamed from: B0 */
        public final boolean mo36475B0(int i) throws IOException {
            int i2 = this.f28819i;
            if (i2 + i > this.f28817g) {
                int i3 = this.f28789c;
                int i4 = this.f28821k;
                if (i > (i3 - i4) - i2 || i4 + i2 + i > this.f28822l) {
                    return false;
                }
                C5346a aVar = this.f28814a;
                if (aVar != null) {
                    aVar.mo36485a();
                }
                int i5 = this.f28819i;
                if (i5 > 0) {
                    int i6 = this.f28817g;
                    if (i6 > i5) {
                        byte[] bArr = this.f28816a;
                        System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                    }
                    this.f28821k += i5;
                    this.f28817g -= i5;
                    this.f28819i = 0;
                }
                InputStream inputStream = this.f28815a;
                byte[] bArr2 = this.f28816a;
                int i7 = this.f28817g;
                int p0 = m48837p0(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.f28789c - this.f28821k) - i7));
                if (p0 == 0 || p0 < -1 || p0 > this.f28816a.length) {
                    throw new IllegalStateException(this.f28815a.getClass() + "#read(byte[]) returned invalid result: " + p0 + "\nThe InputStream implementation is buggy.");
                } else if (p0 <= 0) {
                    return false;
                } else {
                    this.f28817g += p0;
                    mo36480u0();
                    if (this.f28817g >= i) {
                        return true;
                    }
                    return mo36475B0(i);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
        }

        /* renamed from: C */
        public float mo36413C() throws IOException {
            return Float.intBitsToFloat(mo36422L());
        }

        /* renamed from: D */
        public <T extends yh2> T mo36414D(int i, cz2<T> cz2, zy0 zy0) throws IOException {
            int i2 = this.f28785a;
            if (i2 < this.f28788b) {
                this.f28785a = i2 + 1;
                T t = (yh2) cz2.mo34004d(this, zy0);
                mo36435a(wx4.m69700c(i, 4));
                this.f28785a--;
                return t;
            }
            throw nt1.m58789j();
        }

        /* renamed from: E */
        public void mo36415E(int i, yh2.C7362a aVar, zy0 zy0) throws IOException {
            int i2 = this.f28785a;
            if (i2 < this.f28788b) {
                this.f28785a = i2 + 1;
                aVar.mo43380Z7(this, zy0);
                mo36435a(wx4.m69700c(i, 4));
                this.f28785a--;
                return;
            }
            throw nt1.m58789j();
        }

        /* renamed from: F */
        public int mo36416F() throws IOException {
            return mo36424N();
        }

        /* renamed from: G */
        public long mo36417G() throws IOException {
            return mo36425Q();
        }

        /* renamed from: H */
        public <T extends yh2> T mo36418H(cz2<T> cz2, zy0 zy0) throws IOException {
            int N = mo36424N();
            if (this.f28785a < this.f28788b) {
                int t = mo36455t(N);
                this.f28785a++;
                T t2 = (yh2) cz2.mo34004d(this, zy0);
                mo36435a(0);
                this.f28785a--;
                if (mo36443f() == 0) {
                    mo36454s(t);
                    return t2;
                }
                throw nt1.m58791n();
            }
            throw nt1.m58789j();
        }

        /* renamed from: I */
        public void mo36419I(yh2.C7362a aVar, zy0 zy0) throws IOException {
            int N = mo36424N();
            if (this.f28785a < this.f28788b) {
                int t = mo36455t(N);
                this.f28785a++;
                aVar.mo43380Z7(this, zy0);
                mo36435a(0);
                this.f28785a--;
                if (mo36443f() == 0) {
                    mo36454s(t);
                    return;
                }
                throw nt1.m58791n();
            }
            throw nt1.m58789j();
        }

        /* renamed from: J */
        public byte mo36420J() throws IOException {
            if (this.f28819i == this.f28817g) {
                mo36481v0(1);
            }
            byte[] bArr = this.f28816a;
            int i = this.f28819i;
            this.f28819i = i + 1;
            return bArr[i];
        }

        /* renamed from: K */
        public byte[] mo36421K(int i) throws IOException {
            int i2 = this.f28819i;
            if (i > this.f28817g - i2 || i <= 0) {
                return mo36477r0(i, false);
            }
            int i3 = i + i2;
            this.f28819i = i3;
            return Arrays.copyOfRange(this.f28816a, i2, i3);
        }

        /* renamed from: L */
        public int mo36422L() throws IOException {
            int i = this.f28819i;
            if (this.f28817g - i < 4) {
                mo36481v0(4);
                i = this.f28819i;
            }
            byte[] bArr = this.f28816a;
            this.f28819i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: M */
        public long mo36423M() throws IOException {
            int i = this.f28819i;
            if (this.f28817g - i < 8) {
                mo36481v0(8);
                i = this.f28819i;
            }
            byte[] bArr = this.f28816a;
            this.f28819i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo36424N() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f28819i
                int r1 = r5.f28817g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f28816a
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f28819i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo36426R()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f28819i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g00.C5345d.mo36424N():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: Q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo36425Q() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f28819i
                int r1 = r11.f28817g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f28816a
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f28819i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo36426R()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f28819i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g00.C5345d.mo36425Q():long");
        }

        /* renamed from: R */
        public long mo36426R() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo36420J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & C7276xq.f37586a) == 0) {
                    return j;
                }
            }
            throw nt1.m58786g();
        }

        /* renamed from: S */
        public int mo36427S() throws IOException {
            return mo36422L();
        }

        /* renamed from: T */
        public long mo36428T() throws IOException {
            return mo36423M();
        }

        /* renamed from: U */
        public int mo36429U() throws IOException {
            return g00.m48668b(mo36424N());
        }

        /* renamed from: V */
        public long mo36430V() throws IOException {
            return g00.m48669c(mo36425Q());
        }

        /* renamed from: W */
        public String mo36431W() throws IOException {
            int N = mo36424N();
            if (N > 0) {
                int i = this.f28817g;
                int i2 = this.f28819i;
                if (N <= i - i2) {
                    String str = new String(this.f28816a, i2, N, vs1.f36665a);
                    this.f28819i += N;
                    return str;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N > this.f28817g) {
                return new String(mo36477r0(N, false), vs1.f36665a);
            }
            mo36481v0(N);
            String str2 = new String(this.f28816a, this.f28819i, N, vs1.f36665a);
            this.f28819i += N;
            return str2;
        }

        /* renamed from: X */
        public String mo36432X() throws IOException {
            byte[] bArr;
            int N = mo36424N();
            int i = this.f28819i;
            int i2 = this.f28817g;
            if (N <= i2 - i && N > 0) {
                bArr = this.f28816a;
                this.f28819i = i + N;
            } else if (N == 0) {
                return "";
            } else {
                if (N <= i2) {
                    mo36481v0(N);
                    bArr = this.f28816a;
                    this.f28819i = N + 0;
                } else {
                    bArr = mo36477r0(N, false);
                }
                i = 0;
            }
            return hq4.m50759h(bArr, i, N);
        }

        /* renamed from: Y */
        public int mo36433Y() throws IOException {
            if (mo36449i()) {
                this.f28820j = 0;
                return 0;
            }
            int N = mo36424N();
            this.f28820j = N;
            if (wx4.m69698a(N) != 0) {
                return this.f28820j;
            }
            throw nt1.m58783d();
        }

        /* renamed from: Z */
        public int mo36434Z() throws IOException {
            return mo36424N();
        }

        /* renamed from: a */
        public void mo36435a(int i) throws nt1 {
            if (this.f28820j != i) {
                throw nt1.m58782c();
            }
        }

        /* renamed from: a0 */
        public long mo36436a0() throws IOException {
            return mo36425Q();
        }

        @Deprecated
        /* renamed from: b0 */
        public void mo36437b0(int i, yh2.C7362a aVar) throws IOException {
            mo36415E(i, aVar, zy0.m74393d());
        }

        /* renamed from: c0 */
        public void mo36438c0() {
            this.f28821k = -this.f28819i;
        }

        /* renamed from: e */
        public void mo36441e(boolean z) {
        }

        /* renamed from: f */
        public int mo36443f() {
            int i = this.f28822l;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.f28821k + this.f28819i);
        }

        /* renamed from: g */
        public int mo36445g() {
            return this.f28820j;
        }

        /* renamed from: g0 */
        public boolean mo36446g0(int i) throws IOException {
            int b = wx4.m69699b(i);
            if (b == 0) {
                mo36483y0();
                return true;
            } else if (b == 1) {
                mo36452k0(8);
                return true;
            } else if (b == 2) {
                mo36452k0(mo36424N());
                return true;
            } else if (b == 3) {
                mo36450i0();
                mo36435a(wx4.m69700c(wx4.m69698a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo36452k0(4);
                    return true;
                }
                throw nt1.m58785f();
            }
        }

        /* renamed from: h */
        public int mo36447h() {
            return this.f28821k + this.f28819i;
        }

        /* renamed from: h0 */
        public boolean mo36448h0(int i, i00 i00) throws IOException {
            int b = wx4.m69699b(i);
            if (b == 0) {
                long G = mo36417G();
                i00.mo37762Z1(i);
                i00.mo37781i2(G);
                return true;
            } else if (b == 1) {
                long M = mo36423M();
                i00.mo37762Z1(i);
                i00.mo37738D1(M);
                return true;
            } else if (b == 2) {
                C5173er x = mo36459x();
                i00.mo37762Z1(i);
                i00.mo37796z1(x);
                return true;
            } else if (b == 3) {
                i00.mo37762Z1(i);
                mo36451j0(i00);
                int c = wx4.m69700c(wx4.m69698a(i), 4);
                mo36435a(c);
                i00.mo37762Z1(c);
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    int L = mo36422L();
                    i00.mo37762Z1(i);
                    i00.mo37736C1(L);
                    return true;
                }
                throw nt1.m58785f();
            }
        }

        /* renamed from: i */
        public boolean mo36449i() throws IOException {
            return this.f28819i == this.f28817g && !mo36475B0(1);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: i0 */
        public void mo36450i0() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo36433Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo36446g0(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g00.C5345d.mo36450i0():void");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: j0 */
        public void mo36451j0(com.onedelhi.secure.i00 r2) throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo36433Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo36448h0(r0, r2)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g00.C5345d.mo36451j0(com.onedelhi.secure.i00):void");
        }

        /* renamed from: k0 */
        public void mo36452k0(int i) throws IOException {
            int i2 = this.f28817g;
            int i3 = this.f28819i;
            if (i > i2 - i3 || i < 0) {
                mo36482x0(i);
            } else {
                this.f28819i = i3 + i;
            }
        }

        /* renamed from: q0 */
        public final C5173er mo36476q0(int i) throws IOException {
            byte[] s0 = mo36478s0(i);
            if (s0 != null) {
                return C5173er.m47134u(s0);
            }
            int i2 = this.f28819i;
            int i3 = this.f28817g;
            int i4 = i3 - i2;
            this.f28821k += i3;
            this.f28819i = 0;
            this.f28817g = 0;
            List<byte[]> t0 = mo36479t0(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f28816a, i2, bArr, 0, i4);
            for (byte[] next : t0) {
                System.arraycopy(next, 0, bArr, i4, next.length);
                i4 += next.length;
            }
            return C5173er.m47129p0(bArr);
        }

        /* renamed from: r0 */
        public final byte[] mo36477r0(int i, boolean z) throws IOException {
            byte[] s0 = mo36478s0(i);
            if (s0 != null) {
                return z ? (byte[]) s0.clone() : s0;
            }
            int i2 = this.f28819i;
            int i3 = this.f28817g;
            int i4 = i3 - i2;
            this.f28821k += i3;
            this.f28819i = 0;
            this.f28817g = 0;
            List<byte[]> t0 = mo36479t0(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f28816a, i2, bArr, 0, i4);
            for (byte[] next : t0) {
                System.arraycopy(next, 0, bArr, i4, next.length);
                i4 += next.length;
            }
            return bArr;
        }

        /* renamed from: s */
        public void mo36454s(int i) {
            this.f28822l = i;
            mo36480u0();
        }

        /* renamed from: s0 */
        public final byte[] mo36478s0(int i) throws IOException {
            if (i == 0) {
                return vs1.f36666a;
            }
            if (i >= 0) {
                int i2 = this.f28821k;
                int i3 = this.f28819i;
                int i4 = i2 + i3 + i;
                if (i4 - this.f28789c <= 0) {
                    int i5 = this.f28822l;
                    if (i4 <= i5) {
                        int i6 = this.f28817g - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > m48836o0(this.f28815a)) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f28816a, this.f28819i, bArr, 0, i6);
                        this.f28821k += this.f28817g;
                        this.f28819i = 0;
                        this.f28817g = 0;
                        while (i6 < i) {
                            int p0 = m48837p0(this.f28815a, bArr, i6, i - i6);
                            if (p0 != -1) {
                                this.f28821k += p0;
                                i6 += p0;
                            } else {
                                throw nt1.m58791n();
                            }
                        }
                        return bArr;
                    }
                    mo36452k0((i5 - i2) - i3);
                    throw nt1.m58791n();
                }
                throw nt1.m58790m();
            }
            throw nt1.m58787h();
        }

        /* renamed from: t */
        public int mo36455t(int i) throws nt1 {
            if (i >= 0) {
                int i2 = i + this.f28821k + this.f28819i;
                int i3 = this.f28822l;
                if (i2 <= i3) {
                    this.f28822l = i2;
                    mo36480u0();
                    return i3;
                }
                throw nt1.m58791n();
            }
            throw nt1.m58787h();
        }

        /* renamed from: t0 */
        public final List<byte[]> mo36479t0(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f28815a.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f28821k += read;
                        i2 += read;
                    } else {
                        throw nt1.m58791n();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: u */
        public boolean mo36456u() throws IOException {
            return mo36425Q() != 0;
        }

        /* renamed from: u0 */
        public final void mo36480u0() {
            int i = this.f28817g + this.f28818h;
            this.f28817g = i;
            int i2 = this.f28821k + i;
            int i3 = this.f28822l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f28818h = i4;
                this.f28817g = i - i4;
                return;
            }
            this.f28818h = 0;
        }

        /* renamed from: v */
        public byte[] mo36457v() throws IOException {
            int N = mo36424N();
            int i = this.f28817g;
            int i2 = this.f28819i;
            if (N > i - i2 || N <= 0) {
                return mo36477r0(N, false);
            }
            byte[] copyOfRange = Arrays.copyOfRange(this.f28816a, i2, i2 + N);
            this.f28819i += N;
            return copyOfRange;
        }

        /* renamed from: v0 */
        public final void mo36481v0(int i) throws IOException {
            if (mo36475B0(i)) {
                return;
            }
            if (i > (this.f28789c - this.f28821k) - this.f28819i) {
                throw nt1.m58790m();
            }
            throw nt1.m58791n();
        }

        /* renamed from: w */
        public ByteBuffer mo36458w() throws IOException {
            int N = mo36424N();
            int i = this.f28817g;
            int i2 = this.f28819i;
            if (N > i - i2 || N <= 0) {
                return N == 0 ? vs1.f36664a : ByteBuffer.wrap(mo36477r0(N, true));
            }
            ByteBuffer wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f28816a, i2, i2 + N));
            this.f28819i += N;
            return wrap;
        }

        /* renamed from: x */
        public C5173er mo36459x() throws IOException {
            int N = mo36424N();
            int i = this.f28817g;
            int i2 = this.f28819i;
            if (N > i - i2 || N <= 0) {
                return N == 0 ? C5173er.f28039a : mo36476q0(N);
            }
            C5173er v = C5173er.m47135v(this.f28816a, i2, N);
            this.f28819i += N;
            return v;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            throw new java.lang.IllegalStateException(r8.f28815a.getClass() + "#skip returned invalid result: " + r0 + "\nThe InputStream implementation is buggy.");
         */
        /* renamed from: x0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo36482x0(int r9) throws java.io.IOException {
            /*
                r8 = this;
                if (r9 < 0) goto L_0x0094
                int r0 = r8.f28821k
                int r1 = r8.f28819i
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.f28822l
                if (r2 > r3) goto L_0x008a
                com.onedelhi.secure.g00$d$a r2 = r8.f28814a
                r3 = 0
                if (r2 != 0) goto L_0x006f
                int r0 = r0 + r1
                r8.f28821k = r0
                int r0 = r8.f28817g
                int r0 = r0 - r1
                r8.f28817g = r3
                r8.f28819i = r3
                r3 = r0
            L_0x001d:
                if (r3 >= r9) goto L_0x0067
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.f28815a     // Catch:{ all -> 0x005d }
                long r4 = (long) r0     // Catch:{ all -> 0x005d }
                long r0 = m48838w0(r1, r4)     // Catch:{ all -> 0x005d }
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 < 0) goto L_0x0038
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0038
                if (r2 != 0) goto L_0x0035
                goto L_0x0067
            L_0x0035:
                int r1 = (int) r0     // Catch:{ all -> 0x005d }
                int r3 = r3 + r1
                goto L_0x001d
            L_0x0038:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
                r2.<init>()     // Catch:{ all -> 0x005d }
                java.io.InputStream r4 = r8.f28815a     // Catch:{ all -> 0x005d }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x005d }
                r2.append(r4)     // Catch:{ all -> 0x005d }
                java.lang.String r4 = "#skip returned invalid result: "
                r2.append(r4)     // Catch:{ all -> 0x005d }
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = "\nThe InputStream implementation is buggy."
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x005d }
                r9.<init>(r0)     // Catch:{ all -> 0x005d }
                throw r9     // Catch:{ all -> 0x005d }
            L_0x005d:
                r9 = move-exception
                int r0 = r8.f28821k
                int r0 = r0 + r3
                r8.f28821k = r0
                r8.mo36480u0()
                throw r9
            L_0x0067:
                int r0 = r8.f28821k
                int r0 = r0 + r3
                r8.f28821k = r0
                r8.mo36480u0()
            L_0x006f:
                if (r3 >= r9) goto L_0x0089
                int r0 = r8.f28817g
                int r1 = r8.f28819i
                int r1 = r0 - r1
                r8.f28819i = r0
                r0 = 1
            L_0x007a:
                r8.mo36481v0(r0)
                int r2 = r9 - r1
                int r3 = r8.f28817g
                if (r2 <= r3) goto L_0x0087
                int r1 = r1 + r3
                r8.f28819i = r3
                goto L_0x007a
            L_0x0087:
                r8.f28819i = r2
            L_0x0089:
                return
            L_0x008a:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.mo36452k0(r3)
                com.onedelhi.secure.nt1 r9 = com.onedelhi.secure.nt1.m58791n()
                throw r9
            L_0x0094:
                com.onedelhi.secure.nt1 r9 = com.onedelhi.secure.nt1.m58787h()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g00.C5345d.mo36482x0(int):void");
        }

        /* renamed from: y */
        public double mo36460y() throws IOException {
            return Double.longBitsToDouble(mo36423M());
        }

        /* renamed from: y0 */
        public final void mo36483y0() throws IOException {
            if (this.f28817g - this.f28819i >= 10) {
                mo36484z0();
            } else {
                mo36474A0();
            }
        }

        /* renamed from: z */
        public int mo36461z() throws IOException {
            return mo36424N();
        }

        /* renamed from: z0 */
        public final void mo36484z0() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f28816a;
                int i2 = this.f28819i;
                this.f28819i = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw nt1.m58786g();
        }
    }

    /* renamed from: com.onedelhi.secure.g00$e */
    public static final class C5348e extends g00 {

        /* renamed from: a */
        public final long f28826a;

        /* renamed from: a */
        public final ByteBuffer f28827a;

        /* renamed from: b */
        public long f28828b;

        /* renamed from: b */
        public final boolean f28829b;

        /* renamed from: c */
        public long f28830c;

        /* renamed from: c */
        public boolean f28831c;

        /* renamed from: d */
        public long f28832d;

        /* renamed from: g */
        public int f28833g;

        /* renamed from: h */
        public int f28834h;

        /* renamed from: i */
        public int f28835i;

        public C5348e(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f28835i = Integer.MAX_VALUE;
            this.f28827a = byteBuffer;
            long k = ko4.m54709k(byteBuffer);
            this.f28826a = k;
            this.f28828b = ((long) byteBuffer.limit()) + k;
            long position = k + ((long) byteBuffer.position());
            this.f28830c = position;
            this.f28832d = position;
            this.f28829b = z;
        }

        /* renamed from: n0 */
        public static boolean m48899n0() {
            return ko4.m54684V();
        }

        /* renamed from: A */
        public int mo36411A() throws IOException {
            return mo36422L();
        }

        /* renamed from: B */
        public long mo36412B() throws IOException {
            return mo36423M();
        }

        /* renamed from: C */
        public float mo36413C() throws IOException {
            return Float.intBitsToFloat(mo36422L());
        }

        /* renamed from: D */
        public <T extends yh2> T mo36414D(int i, cz2<T> cz2, zy0 zy0) throws IOException {
            int i2 = this.f28785a;
            if (i2 < this.f28788b) {
                this.f28785a = i2 + 1;
                T t = (yh2) cz2.mo34004d(this, zy0);
                mo36435a(wx4.m69700c(i, 4));
                this.f28785a--;
                return t;
            }
            throw nt1.m58789j();
        }

        /* renamed from: E */
        public void mo36415E(int i, yh2.C7362a aVar, zy0 zy0) throws IOException {
            int i2 = this.f28785a;
            if (i2 < this.f28788b) {
                this.f28785a = i2 + 1;
                aVar.mo43380Z7(this, zy0);
                mo36435a(wx4.m69700c(i, 4));
                this.f28785a--;
                return;
            }
            throw nt1.m58789j();
        }

        /* renamed from: F */
        public int mo36416F() throws IOException {
            return mo36424N();
        }

        /* renamed from: G */
        public long mo36417G() throws IOException {
            return mo36425Q();
        }

        /* renamed from: H */
        public <T extends yh2> T mo36418H(cz2<T> cz2, zy0 zy0) throws IOException {
            int N = mo36424N();
            if (this.f28785a < this.f28788b) {
                int t = mo36455t(N);
                this.f28785a++;
                T t2 = (yh2) cz2.mo34004d(this, zy0);
                mo36435a(0);
                this.f28785a--;
                if (mo36443f() == 0) {
                    mo36454s(t);
                    return t2;
                }
                throw nt1.m58791n();
            }
            throw nt1.m58789j();
        }

        /* renamed from: I */
        public void mo36419I(yh2.C7362a aVar, zy0 zy0) throws IOException {
            int N = mo36424N();
            if (this.f28785a < this.f28788b) {
                int t = mo36455t(N);
                this.f28785a++;
                aVar.mo43380Z7(this, zy0);
                mo36435a(0);
                this.f28785a--;
                if (mo36443f() == 0) {
                    mo36454s(t);
                    return;
                }
                throw nt1.m58791n();
            }
            throw nt1.m58789j();
        }

        /* renamed from: J */
        public byte mo36420J() throws IOException {
            long j = this.f28830c;
            if (j != this.f28828b) {
                this.f28830c = 1 + j;
                return ko4.m54663A(j);
            }
            throw nt1.m58791n();
        }

        /* renamed from: K */
        public byte[] mo36421K(int i) throws IOException {
            if (i >= 0 && i <= mo36489p0()) {
                byte[] bArr = new byte[i];
                long j = this.f28830c;
                long j2 = (long) i;
                mo36493t0(j, j + j2).get(bArr);
                this.f28830c += j2;
                return bArr;
            } else if (i > 0) {
                throw nt1.m58791n();
            } else if (i == 0) {
                return vs1.f36666a;
            } else {
                throw nt1.m58787h();
            }
        }

        /* renamed from: L */
        public int mo36422L() throws IOException {
            long j = this.f28830c;
            if (this.f28828b - j >= 4) {
                this.f28830c = 4 + j;
                return ((ko4.m54663A(j + 3) & 255) << 24) | (ko4.m54663A(j) & 255) | ((ko4.m54663A(1 + j) & 255) << 8) | ((ko4.m54663A(2 + j) & 255) << 16);
            }
            throw nt1.m58791n();
        }

        /* renamed from: M */
        public long mo36423M() throws IOException {
            long j = this.f28830c;
            if (this.f28828b - j >= 8) {
                this.f28830c = 8 + j;
                return ((((long) ko4.m54663A(j + 7)) & 255) << 56) | (((long) ko4.m54663A(j)) & 255) | ((((long) ko4.m54663A(1 + j)) & 255) << 8) | ((((long) ko4.m54663A(2 + j)) & 255) << 16) | ((((long) ko4.m54663A(3 + j)) & 255) << 24) | ((((long) ko4.m54663A(4 + j)) & 255) << 32) | ((((long) ko4.m54663A(5 + j)) & 255) << 40) | ((((long) ko4.m54663A(6 + j)) & 255) << 48);
            }
            throw nt1.m58791n();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (com.onedelhi.secure.ko4.m54663A(r4) < 0) goto L_0x0085;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo36424N() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f28830c
                long r2 = r10.f28828b
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L_0x000a
                goto L_0x0085
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.onedelhi.secure.ko4.m54663A(r0)
                if (r0 < 0) goto L_0x0017
                r10.f28830c = r4
                return r0
            L_0x0017:
                long r6 = r10.f28828b
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0021
                goto L_0x0085
            L_0x0021:
                long r6 = r4 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002f
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008b
            L_0x002f:
                long r4 = r6 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003c:
                r6 = r4
                goto L_0x008b
            L_0x003e:
                long r6 = r4 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008b
            L_0x004e:
                long r4 = r6 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.onedelhi.secure.ko4.m54663A(r4)
                if (r1 >= 0) goto L_0x008b
            L_0x0085:
                long r0 = r10.mo36426R()
                int r1 = (int) r0
                return r1
            L_0x008b:
                r10.f28830c = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g00.C5348e.mo36424N():int");
        }

        /* renamed from: Q */
        public long mo36425Q() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f28830c;
            if (this.f28828b != j4) {
                long j5 = j4 + 1;
                byte A = ko4.m54663A(j4);
                if (A >= 0) {
                    this.f28830c = j5;
                    return (long) A;
                } else if (this.f28828b - j5 >= 9) {
                    long j6 = j5 + 1;
                    byte A2 = A ^ (ko4.m54663A(j5) << 7);
                    if (A2 < 0) {
                        b = A2 ^ C7276xq.f37586a;
                    } else {
                        long j7 = j6 + 1;
                        byte A3 = A2 ^ (ko4.m54663A(j6) << 14);
                        if (A3 >= 0) {
                            j = (long) (A3 ^ C7276xq.f37586a);
                        } else {
                            j6 = j7 + 1;
                            byte A4 = A3 ^ (ko4.m54663A(j7) << 21);
                            if (A4 < 0) {
                                b = A4 ^ C7276xq.f37586a;
                            } else {
                                j7 = j6 + 1;
                                long A5 = ((long) A4) ^ (((long) ko4.m54663A(j6)) << 28);
                                if (A5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long A6 = A5 ^ (((long) ko4.m54663A(j7)) << 35);
                                    if (A6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        A5 = A6 ^ (((long) ko4.m54663A(j8)) << 42);
                                        if (A5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            A6 = A5 ^ (((long) ko4.m54663A(j7)) << 49);
                                            if (A6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (A6 ^ (((long) ko4.m54663A(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) ko4.m54663A(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f28830c = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = A6 ^ j2;
                                    j6 = j8;
                                    this.f28830c = j6;
                                    return j;
                                }
                                j = A5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f28830c = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f28830c = j6;
                    return j;
                }
            }
            return mo36426R();
        }

        /* renamed from: R */
        public long mo36426R() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo36420J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & C7276xq.f37586a) == 0) {
                    return j;
                }
            }
            throw nt1.m58786g();
        }

        /* renamed from: S */
        public int mo36427S() throws IOException {
            return mo36422L();
        }

        /* renamed from: T */
        public long mo36428T() throws IOException {
            return mo36423M();
        }

        /* renamed from: U */
        public int mo36429U() throws IOException {
            return g00.m48668b(mo36424N());
        }

        /* renamed from: V */
        public long mo36430V() throws IOException {
            return g00.m48669c(mo36425Q());
        }

        /* renamed from: W */
        public String mo36431W() throws IOException {
            int N = mo36424N();
            if (N > 0 && N <= mo36489p0()) {
                byte[] bArr = new byte[N];
                long j = (long) N;
                ko4.m54719p(this.f28830c, bArr, 0, j);
                String str = new String(bArr, vs1.f36665a);
                this.f28830c += j;
                return str;
            } else if (N == 0) {
                return "";
            } else {
                if (N < 0) {
                    throw nt1.m58787h();
                }
                throw nt1.m58791n();
            }
        }

        /* renamed from: X */
        public String mo36432X() throws IOException {
            int N = mo36424N();
            if (N > 0 && N <= mo36489p0()) {
                String g = hq4.m50758g(this.f28827a, mo36487m0(this.f28830c), N);
                this.f28830c += (long) N;
                return g;
            } else if (N == 0) {
                return "";
            } else {
                if (N <= 0) {
                    throw nt1.m58787h();
                }
                throw nt1.m58791n();
            }
        }

        /* renamed from: Y */
        public int mo36433Y() throws IOException {
            if (mo36449i()) {
                this.f28834h = 0;
                return 0;
            }
            int N = mo36424N();
            this.f28834h = N;
            if (wx4.m69698a(N) != 0) {
                return this.f28834h;
            }
            throw nt1.m58783d();
        }

        /* renamed from: Z */
        public int mo36434Z() throws IOException {
            return mo36424N();
        }

        /* renamed from: a */
        public void mo36435a(int i) throws nt1 {
            if (this.f28834h != i) {
                throw nt1.m58782c();
            }
        }

        /* renamed from: a0 */
        public long mo36436a0() throws IOException {
            return mo36425Q();
        }

        @Deprecated
        /* renamed from: b0 */
        public void mo36437b0(int i, yh2.C7362a aVar) throws IOException {
            mo36415E(i, aVar, zy0.m74393d());
        }

        /* renamed from: c0 */
        public void mo36438c0() {
            this.f28832d = this.f28830c;
        }

        /* renamed from: e */
        public void mo36441e(boolean z) {
            this.f28831c = z;
        }

        /* renamed from: f */
        public int mo36443f() {
            int i = this.f28835i;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - mo36447h();
        }

        /* renamed from: g */
        public int mo36445g() {
            return this.f28834h;
        }

        /* renamed from: g0 */
        public boolean mo36446g0(int i) throws IOException {
            int b = wx4.m69699b(i);
            if (b == 0) {
                mo36490q0();
                return true;
            } else if (b == 1) {
                mo36452k0(8);
                return true;
            } else if (b == 2) {
                mo36452k0(mo36424N());
                return true;
            } else if (b == 3) {
                mo36450i0();
                mo36435a(wx4.m69700c(wx4.m69698a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo36452k0(4);
                    return true;
                }
                throw nt1.m58785f();
            }
        }

        /* renamed from: h */
        public int mo36447h() {
            return (int) (this.f28830c - this.f28832d);
        }

        /* renamed from: h0 */
        public boolean mo36448h0(int i, i00 i00) throws IOException {
            int b = wx4.m69699b(i);
            if (b == 0) {
                long G = mo36417G();
                i00.mo37762Z1(i);
                i00.mo37781i2(G);
                return true;
            } else if (b == 1) {
                long M = mo36423M();
                i00.mo37762Z1(i);
                i00.mo37738D1(M);
                return true;
            } else if (b == 2) {
                C5173er x = mo36459x();
                i00.mo37762Z1(i);
                i00.mo37796z1(x);
                return true;
            } else if (b == 3) {
                i00.mo37762Z1(i);
                mo36451j0(i00);
                int c = wx4.m69700c(wx4.m69698a(i), 4);
                mo36435a(c);
                i00.mo37762Z1(c);
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    int L = mo36422L();
                    i00.mo37762Z1(i);
                    i00.mo37736C1(L);
                    return true;
                }
                throw nt1.m58785f();
            }
        }

        /* renamed from: i */
        public boolean mo36449i() throws IOException {
            return this.f28830c == this.f28828b;
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: i0 */
        public void mo36450i0() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo36433Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo36446g0(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g00.C5348e.mo36450i0():void");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: j0 */
        public void mo36451j0(com.onedelhi.secure.i00 r2) throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo36433Y()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo36448h0(r0, r2)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g00.C5348e.mo36451j0(com.onedelhi.secure.i00):void");
        }

        /* renamed from: k0 */
        public void mo36452k0(int i) throws IOException {
            if (i >= 0 && i <= mo36489p0()) {
                this.f28830c += (long) i;
            } else if (i < 0) {
                throw nt1.m58787h();
            } else {
                throw nt1.m58791n();
            }
        }

        /* renamed from: m0 */
        public final int mo36487m0(long j) {
            return (int) (j - this.f28826a);
        }

        /* renamed from: o0 */
        public final void mo36488o0() {
            long j = this.f28828b + ((long) this.f28833g);
            this.f28828b = j;
            int i = (int) (j - this.f28832d);
            int i2 = this.f28835i;
            if (i > i2) {
                int i3 = i - i2;
                this.f28833g = i3;
                this.f28828b = j - ((long) i3);
                return;
            }
            this.f28833g = 0;
        }

        /* renamed from: p0 */
        public final int mo36489p0() {
            return (int) (this.f28828b - this.f28830c);
        }

        /* renamed from: q0 */
        public final void mo36490q0() throws IOException {
            if (mo36489p0() >= 10) {
                mo36491r0();
            } else {
                mo36492s0();
            }
        }

        /* renamed from: r0 */
        public final void mo36491r0() throws IOException {
            int i = 0;
            while (i < 10) {
                long j = this.f28830c;
                this.f28830c = 1 + j;
                if (ko4.m54663A(j) < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw nt1.m58786g();
        }

        /* renamed from: s */
        public void mo36454s(int i) {
            this.f28835i = i;
            mo36488o0();
        }

        /* renamed from: s0 */
        public final void mo36492s0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo36420J() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw nt1.m58786g();
        }

        /* renamed from: t */
        public int mo36455t(int i) throws nt1 {
            if (i >= 0) {
                int h = i + mo36447h();
                int i2 = this.f28835i;
                if (h <= i2) {
                    this.f28835i = h;
                    mo36488o0();
                    return i2;
                }
                throw nt1.m58791n();
            }
            throw nt1.m58787h();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
            throw com.onedelhi.secure.nt1.m58791n();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
            r3.f28827a.position(r0);
            r3.f28827a.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0031 */
        /* renamed from: t0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.nio.ByteBuffer mo36493t0(long r4, long r6) throws java.io.IOException {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f28827a
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.f28827a
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.f28827a     // Catch:{ IllegalArgumentException -> 0x0031 }
                int r4 = r3.mo36487m0(r4)     // Catch:{ IllegalArgumentException -> 0x0031 }
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r3.f28827a     // Catch:{ IllegalArgumentException -> 0x0031 }
                int r5 = r3.mo36487m0(r6)     // Catch:{ IllegalArgumentException -> 0x0031 }
                r4.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r3.f28827a     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r5 = r3.f28827a
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f28827a
                r5.limit(r1)
                return r4
            L_0x002f:
                r4 = move-exception
                goto L_0x0036
            L_0x0031:
                com.onedelhi.secure.nt1 r4 = com.onedelhi.secure.nt1.m58791n()     // Catch:{ all -> 0x002f }
                throw r4     // Catch:{ all -> 0x002f }
            L_0x0036:
                java.nio.ByteBuffer r5 = r3.f28827a
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f28827a
                r5.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g00.C5348e.mo36493t0(long, long):java.nio.ByteBuffer");
        }

        /* renamed from: u */
        public boolean mo36456u() throws IOException {
            return mo36425Q() != 0;
        }

        /* renamed from: v */
        public byte[] mo36457v() throws IOException {
            return mo36421K(mo36424N());
        }

        /* renamed from: w */
        public ByteBuffer mo36458w() throws IOException {
            int N = mo36424N();
            if (N <= 0 || N > mo36489p0()) {
                if (N == 0) {
                    return vs1.f36664a;
                }
                if (N < 0) {
                    throw nt1.m58787h();
                }
                throw nt1.m58791n();
            } else if (this.f28829b || !this.f28831c) {
                byte[] bArr = new byte[N];
                long j = (long) N;
                ko4.m54719p(this.f28830c, bArr, 0, j);
                this.f28830c += j;
                return ByteBuffer.wrap(bArr);
            } else {
                long j2 = this.f28830c;
                long j3 = (long) N;
                ByteBuffer t0 = mo36493t0(j2, j2 + j3);
                this.f28830c += j3;
                return t0;
            }
        }

        /* renamed from: x */
        public C5173er mo36459x() throws IOException {
            int N = mo36424N();
            if (N <= 0 || N > mo36489p0()) {
                if (N == 0) {
                    return C5173er.f28039a;
                }
                if (N < 0) {
                    throw nt1.m58787h();
                }
                throw nt1.m58791n();
            } else if (!this.f28829b || !this.f28831c) {
                byte[] bArr = new byte[N];
                long j = (long) N;
                ko4.m54719p(this.f28830c, bArr, 0, j);
                this.f28830c += j;
                return C5173er.m47129p0(bArr);
            } else {
                long j2 = this.f28830c;
                long j3 = (long) N;
                ByteBuffer t0 = mo36493t0(j2, j2 + j3);
                this.f28830c += j3;
                return C5173er.m47128o0(t0);
            }
        }

        /* renamed from: y */
        public double mo36460y() throws IOException {
            return Double.longBitsToDouble(mo36423M());
        }

        /* renamed from: z */
        public int mo36461z() throws IOException {
            return mo36424N();
        }
    }

    public g00() {
        this.f28788b = 100;
        this.f28789c = Integer.MAX_VALUE;
        this.f28787a = false;
    }

    /* renamed from: O */
    public static int m48666O(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i2 |= (read & 127) << i3;
                if ((read & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw nt1.m58791n();
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw nt1.m58791n();
            } else if ((read2 & 128) == 0) {
                return i2;
            } else {
                i3 += 7;
            }
        }
        throw nt1.m58786g();
    }

    /* renamed from: P */
    public static int m48667P(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return m48666O(read, inputStream);
        }
        throw nt1.m58791n();
    }

    /* renamed from: b */
    public static int m48668b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m48669c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: j */
    public static g00 m48670j(InputStream inputStream) {
        return m48671k(inputStream, 4096);
    }

    /* renamed from: k */
    public static g00 m48671k(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? m48676p(vs1.f36666a) : new C5345d(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    /* renamed from: l */
    public static g00 m48672l(Iterable<ByteBuffer> iterable) {
        return !C5348e.m48899n0() ? m48670j(new gu1(iterable)) : m48673m(iterable, false);
    }

    /* renamed from: m */
    public static g00 m48673m(Iterable<ByteBuffer> iterable, boolean z) {
        boolean z2 = false;
        int i = 0;
        for (ByteBuffer next : iterable) {
            i += next.remaining();
            z2 = next.hasArray() ? z2 | true : next.isDirect() ? z2 | true : z2 | true;
        }
        return z2 ? new C5344c(iterable, i, z) : m48670j(new gu1(iterable));
    }

    /* renamed from: n */
    public static g00 m48674n(ByteBuffer byteBuffer) {
        return m48675o(byteBuffer, false);
    }

    /* renamed from: o */
    public static g00 m48675o(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m48678r(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && C5348e.m48899n0()) {
            return new C5348e(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m48678r(bArr, 0, remaining, true);
    }

    /* renamed from: p */
    public static g00 m48676p(byte[] bArr) {
        return m48677q(bArr, 0, bArr.length);
    }

    /* renamed from: q */
    public static g00 m48677q(byte[] bArr, int i, int i2) {
        return m48678r(bArr, i, i2, false);
    }

    /* renamed from: r */
    public static g00 m48678r(byte[] bArr, int i, int i2, boolean z) {
        C5343b bVar = new C5343b(bArr, i, i2, z);
        try {
            bVar.mo36455t(i2);
            return bVar;
        } catch (nt1 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract int mo36411A() throws IOException;

    /* renamed from: B */
    public abstract long mo36412B() throws IOException;

    /* renamed from: C */
    public abstract float mo36413C() throws IOException;

    /* renamed from: D */
    public abstract <T extends yh2> T mo36414D(int i, cz2<T> cz2, zy0 zy0) throws IOException;

    /* renamed from: E */
    public abstract void mo36415E(int i, yh2.C7362a aVar, zy0 zy0) throws IOException;

    /* renamed from: F */
    public abstract int mo36416F() throws IOException;

    /* renamed from: G */
    public abstract long mo36417G() throws IOException;

    /* renamed from: H */
    public abstract <T extends yh2> T mo36418H(cz2<T> cz2, zy0 zy0) throws IOException;

    /* renamed from: I */
    public abstract void mo36419I(yh2.C7362a aVar, zy0 zy0) throws IOException;

    /* renamed from: J */
    public abstract byte mo36420J() throws IOException;

    /* renamed from: K */
    public abstract byte[] mo36421K(int i) throws IOException;

    /* renamed from: L */
    public abstract int mo36422L() throws IOException;

    /* renamed from: M */
    public abstract long mo36423M() throws IOException;

    /* renamed from: N */
    public abstract int mo36424N() throws IOException;

    /* renamed from: Q */
    public abstract long mo36425Q() throws IOException;

    /* renamed from: R */
    public abstract long mo36426R() throws IOException;

    /* renamed from: S */
    public abstract int mo36427S() throws IOException;

    /* renamed from: T */
    public abstract long mo36428T() throws IOException;

    /* renamed from: U */
    public abstract int mo36429U() throws IOException;

    /* renamed from: V */
    public abstract long mo36430V() throws IOException;

    /* renamed from: W */
    public abstract String mo36431W() throws IOException;

    /* renamed from: X */
    public abstract String mo36432X() throws IOException;

    /* renamed from: Y */
    public abstract int mo36433Y() throws IOException;

    /* renamed from: Z */
    public abstract int mo36434Z() throws IOException;

    /* renamed from: a */
    public abstract void mo36435a(int i) throws nt1;

    /* renamed from: a0 */
    public abstract long mo36436a0() throws IOException;

    @Deprecated
    /* renamed from: b0 */
    public abstract void mo36437b0(int i, yh2.C7362a aVar) throws IOException;

    /* renamed from: c0 */
    public abstract void mo36438c0();

    /* renamed from: d */
    public final void mo36439d() {
        this.f28787a = true;
    }

    /* renamed from: d0 */
    public final int mo36440d0(int i) {
        if (i >= 0) {
            int i2 = this.f28788b;
            this.f28788b = i;
            return i2;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i);
    }

    /* renamed from: e */
    public abstract void mo36441e(boolean z);

    /* renamed from: e0 */
    public final int mo36442e0(int i) {
        if (i >= 0) {
            int i2 = this.f28789c;
            this.f28789c = i;
            return i2;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i);
    }

    /* renamed from: f */
    public abstract int mo36443f();

    /* renamed from: f0 */
    public final boolean mo36444f0() {
        return this.f28787a;
    }

    /* renamed from: g */
    public abstract int mo36445g();

    /* renamed from: g0 */
    public abstract boolean mo36446g0(int i) throws IOException;

    /* renamed from: h */
    public abstract int mo36447h();

    @Deprecated
    /* renamed from: h0 */
    public abstract boolean mo36448h0(int i, i00 i00) throws IOException;

    /* renamed from: i */
    public abstract boolean mo36449i() throws IOException;

    /* renamed from: i0 */
    public abstract void mo36450i0() throws IOException;

    /* renamed from: j0 */
    public abstract void mo36451j0(i00 i00) throws IOException;

    /* renamed from: k0 */
    public abstract void mo36452k0(int i) throws IOException;

    /* renamed from: l0 */
    public final void mo36453l0() {
        this.f28787a = false;
    }

    /* renamed from: s */
    public abstract void mo36454s(int i);

    /* renamed from: t */
    public abstract int mo36455t(int i) throws nt1;

    /* renamed from: u */
    public abstract boolean mo36456u() throws IOException;

    /* renamed from: v */
    public abstract byte[] mo36457v() throws IOException;

    /* renamed from: w */
    public abstract ByteBuffer mo36458w() throws IOException;

    /* renamed from: x */
    public abstract C5173er mo36459x() throws IOException;

    /* renamed from: y */
    public abstract double mo36460y() throws IOException;

    /* renamed from: z */
    public abstract int mo36461z() throws IOException;
}
