package com.onedelhi.secure;

import java.io.PrintStream;
import java.util.Arrays;

public class ry1 {

    /* renamed from: com.onedelhi.secure.ry1$a */
    public static class C3458a {

        /* renamed from: b */
        public static final int f20113b = 999;

        /* renamed from: a */
        public int f20114a;

        /* renamed from: a */
        public int[] f20115a = new int[101];

        /* renamed from: a */
        public ec0[] f20116a = new ec0[101];

        public C3458a() {
            mo24114b();
        }

        /* renamed from: a */
        public void mo24113a(int i, ec0 ec0) {
            if (this.f20116a[i] != null) {
                mo24117e(i);
            }
            this.f20116a[i] = ec0;
            int[] iArr = this.f20115a;
            int i2 = this.f20114a;
            this.f20114a = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        /* renamed from: b */
        public void mo24114b() {
            Arrays.fill(this.f20115a, 999);
            Arrays.fill(this.f20116a, (Object) null);
            this.f20114a = 0;
        }

        /* renamed from: c */
        public void mo24115c() {
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f20115a, this.f20114a)));
            System.out.print("K: [");
            int i = 0;
            while (i < this.f20114a) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "" : ", ");
                sb.append(mo24119g(i));
                printStream2.print(sb.toString());
                i++;
            }
            System.out.println("]");
        }

        /* renamed from: d */
        public int mo24116d(int i) {
            return this.f20115a[i];
        }

        /* renamed from: e */
        public void mo24117e(int i) {
            this.f20116a[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f20114a;
                if (i2 < i4) {
                    int[] iArr = this.f20115a;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.f20114a = i4 - 1;
                    return;
                }
            }
        }

        /* renamed from: f */
        public int mo24118f() {
            return this.f20114a;
        }

        /* renamed from: g */
        public ec0 mo24119g(int i) {
            return this.f20116a[this.f20115a[i]];
        }
    }

    /* renamed from: com.onedelhi.secure.ry1$b */
    public static class C3459b {

        /* renamed from: b */
        public static final int f20117b = 999;

        /* renamed from: a */
        public int f20118a;

        /* renamed from: a */
        public int[] f20119a = new int[101];

        /* renamed from: a */
        public qc0[] f20120a = new qc0[101];

        public C3459b() {
            mo24121b();
        }

        /* renamed from: a */
        public void mo24120a(int i, qc0 qc0) {
            if (this.f20120a[i] != null) {
                mo24124e(i);
            }
            this.f20120a[i] = qc0;
            int[] iArr = this.f20119a;
            int i2 = this.f20118a;
            this.f20118a = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        /* renamed from: b */
        public void mo24121b() {
            Arrays.fill(this.f20119a, 999);
            Arrays.fill(this.f20120a, (Object) null);
            this.f20118a = 0;
        }

        /* renamed from: c */
        public void mo24122c() {
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f20119a, this.f20118a)));
            System.out.print("K: [");
            int i = 0;
            while (i < this.f20118a) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "" : ", ");
                sb.append(mo24126g(i));
                printStream2.print(sb.toString());
                i++;
            }
            System.out.println("]");
        }

        /* renamed from: d */
        public int mo24123d(int i) {
            return this.f20119a[i];
        }

        /* renamed from: e */
        public void mo24124e(int i) {
            this.f20120a[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f20118a;
                if (i2 < i4) {
                    int[] iArr = this.f20119a;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.f20118a = i4 - 1;
                    return;
                }
            }
        }

        /* renamed from: f */
        public int mo24125f() {
            return this.f20118a;
        }

        /* renamed from: g */
        public qc0 mo24126g(int i) {
            return this.f20120a[this.f20119a[i]];
        }
    }

    /* renamed from: com.onedelhi.secure.ry1$c */
    public static class C3460c {

        /* renamed from: b */
        public static final int f20121b = 999;

        /* renamed from: a */
        public int f20122a;

        /* renamed from: a */
        public int[] f20123a = new int[101];

        /* renamed from: a */
        public float[][] f20124a = new float[101][];

        public C3460c() {
            mo24128b();
        }

        /* renamed from: a */
        public void mo24127a(int i, float[] fArr) {
            if (this.f20124a[i] != null) {
                mo24131e(i);
            }
            this.f20124a[i] = fArr;
            int[] iArr = this.f20123a;
            int i2 = this.f20122a;
            this.f20122a = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        /* renamed from: b */
        public void mo24128b() {
            Arrays.fill(this.f20123a, 999);
            Arrays.fill(this.f20124a, (Object) null);
            this.f20122a = 0;
        }

        /* renamed from: c */
        public void mo24129c() {
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f20123a, this.f20122a)));
            System.out.print("K: [");
            int i = 0;
            while (i < this.f20122a) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "" : ", ");
                sb.append(Arrays.toString(mo24133g(i)));
                printStream2.print(sb.toString());
                i++;
            }
            System.out.println("]");
        }

        /* renamed from: d */
        public int mo24130d(int i) {
            return this.f20123a[i];
        }

        /* renamed from: e */
        public void mo24131e(int i) {
            this.f20124a[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f20122a;
                if (i2 < i4) {
                    int[] iArr = this.f20123a;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.f20122a = i4 - 1;
                    return;
                }
            }
        }

        /* renamed from: f */
        public int mo24132f() {
            return this.f20122a;
        }

        /* renamed from: g */
        public float[] mo24133g(int i) {
            return this.f20124a[this.f20123a[i]];
        }
    }
}
