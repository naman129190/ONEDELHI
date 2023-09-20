package com.onedelhi.secure;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class eo6 extends bm6 {

    /* renamed from: a */
    public static final /* synthetic */ int f11310a = 0;

    /* renamed from: a */
    public static final Logger f11311a = Logger.getLogger(eo6.class.getName());

    /* renamed from: a */
    public static final boolean f11312a = zu6.m33451C();

    /* renamed from: a */
    public go6 f11313a;

    public eo6() {
    }

    public /* synthetic */ eo6(co6 co6) {
    }

    /* renamed from: A */
    public static eo6 m13904A(byte[] bArr, int i, int i2) {
        return new yn6(bArr, 0, i2);
    }

    @Deprecated
    /* renamed from: u */
    public static int m13906u(int i, vs6 vs6, gt6 gt6) {
        int f = ((pl6) vs6).mo18539f(gt6);
        int y = m13910y(i << 3);
        return y + y + f;
    }

    /* renamed from: v */
    public static int m13907v(int i) {
        if (i >= 0) {
            return m13910y(i);
        }
        return 10;
    }

    /* renamed from: w */
    public static int m13908w(vs6 vs6, gt6 gt6) {
        int f = ((pl6) vs6).mo18539f(gt6);
        return m13910y(f) + f;
    }

    /* renamed from: x */
    public static int m13909x(String str) {
        int i;
        try {
            i = ev6.m14402c(str);
        } catch (dv6 unused) {
            i = str.getBytes(zq6.f23859b).length;
        }
        return m13910y(i) + i;
    }

    /* renamed from: y */
    public static int m13910y(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: z */
    public static int m13911z(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((k90.f31137g & j) != 0) {
            j >>>= 14;
            i += 2;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: a */
    public final void mo15262a() {
        if (mo15264d() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b */
    public final void mo15263b(String str, dv6 dv6) throws IOException {
        f11311a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dv6);
        byte[] bytes = str.getBytes(zq6.f23859b);
        try {
            int length = bytes.length;
            mo15278r(length);
            mo15274n(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new ao6(e);
        }
    }

    /* renamed from: d */
    public abstract int mo15264d();

    /* renamed from: e */
    public abstract void mo15265e(byte b) throws IOException;

    /* renamed from: f */
    public abstract void mo15266f(int i, boolean z) throws IOException;

    /* renamed from: g */
    public abstract void mo15267g(int i, on6 on6) throws IOException;

    /* renamed from: h */
    public abstract void mo15268h(int i, int i2) throws IOException;

    /* renamed from: i */
    public abstract void mo15269i(int i) throws IOException;

    /* renamed from: j */
    public abstract void mo15270j(int i, long j) throws IOException;

    /* renamed from: k */
    public abstract void mo15271k(long j) throws IOException;

    /* renamed from: l */
    public abstract void mo15272l(int i, int i2) throws IOException;

    /* renamed from: m */
    public abstract void mo15273m(int i) throws IOException;

    /* renamed from: n */
    public abstract void mo15274n(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: o */
    public abstract void mo15275o(int i, String str) throws IOException;

    /* renamed from: p */
    public abstract void mo15276p(int i, int i2) throws IOException;

    /* renamed from: q */
    public abstract void mo15277q(int i, int i2) throws IOException;

    /* renamed from: r */
    public abstract void mo15278r(int i) throws IOException;

    /* renamed from: s */
    public abstract void mo15279s(int i, long j) throws IOException;

    /* renamed from: t */
    public abstract void mo15280t(long j) throws IOException;
}
