package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import java.io.PrintWriter;

@hl3({hl3.C2354a.f13188c})
public final class ge4 {
    @hl3({hl3.C2354a.f13188c})

    /* renamed from: a */
    public static final int f12538a = 19;

    /* renamed from: a */
    public static final Object f12539a = new Object();

    /* renamed from: a */
    public static char[] f12540a = new char[24];

    /* renamed from: b */
    public static final int f12541b = 60;

    /* renamed from: c */
    public static final int f12542c = 3600;

    /* renamed from: d */
    public static final int f12543d = 86400;

    /* renamed from: a */
    public static int m15795a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: b */
    public static void m15796b(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            m15798d(j - j2, printWriter, 0);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: c */
    public static void m15797c(long j, PrintWriter printWriter) {
        m15798d(j, printWriter, 0);
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: d */
    public static void m15798d(long j, PrintWriter printWriter, int i) {
        synchronized (f12539a) {
            printWriter.print(new String(f12540a, 0, m15800f(j, i)));
        }
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: e */
    public static void m15799e(long j, StringBuilder sb) {
        synchronized (f12539a) {
            sb.append(f12540a, 0, m15800f(j, 0));
        }
    }

    /* renamed from: f */
    public static int m15800f(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        int i7 = i;
        if (f12540a.length < i7) {
            f12540a = new char[i7];
        }
        char[] cArr = f12540a;
        int i8 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i8 == 0) {
            int i9 = i7 - 1;
            while (i9 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (i8 > 0) {
            c = '+';
        } else {
            c = '-';
            j2 = -j2;
        }
        int i10 = (int) (j2 % 1000);
        int floor = (int) Math.floor((double) (j2 / 1000));
        if (floor > 86400) {
            i2 = floor / f12543d;
            floor -= f12543d * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i11 = floor / 60;
            i4 = floor - (i11 * 60);
            i5 = i11;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i7 != 0) {
            int a = m15795a(i2, 1, false, 0);
            int a2 = a + m15795a(i3, 1, a > 0, 2);
            int a3 = a2 + m15795a(i5, 1, a2 > 0, 2);
            int a4 = a3 + m15795a(i4, 1, a3 > 0, 2);
            i6 = 0;
            for (int a5 = a4 + m15795a(i10, 2, true, a4 > 0 ? 3 : 0) + 1; a5 < i7; a5++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i12 = i6 + 1;
        boolean z = i7 != 0;
        int i13 = i12;
        int g = m15801g(cArr, i2, 'd', i12, false, 0);
        int g2 = m15801g(cArr, i3, 'h', g, g != i13, z ? 2 : 0);
        int g3 = m15801g(cArr, i5, 'm', g2, g2 != i13, z ? 2 : 0);
        int g4 = m15801g(cArr, i4, 's', g3, g3 != i13, z ? 2 : 0);
        int g5 = m15801g(cArr, i10, 'm', g4, true, (!z || g4 == i13) ? 0 : 3);
        cArr[g5] = 's';
        return g5 + 1;
    }

    /* renamed from: g */
    public static int m15801g(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        int i7 = i4 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }
}
