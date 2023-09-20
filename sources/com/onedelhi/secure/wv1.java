package com.onedelhi.secure;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

public abstract class wv1 implements Closeable {

    /* renamed from: b */
    public static final String[] f22308b = new String[128];

    /* renamed from: a */
    public int[] f22309a = new int[32];

    /* renamed from: a */
    public String[] f22310a = new String[32];

    /* renamed from: b */
    public boolean f22311b;

    /* renamed from: b */
    public int[] f22312b = new int[32];

    /* renamed from: c */
    public boolean f22313c;

    /* renamed from: n */
    public int f22314n;

    /* renamed from: com.onedelhi.secure.wv1$a */
    public static final class C3876a {

        /* renamed from: a */
        public final yw2 f22315a;

        /* renamed from: a */
        public final String[] f22316a;

        public C3876a(String[] strArr, yw2 yw2) {
            this.f22316a = strArr;
            this.f22315a = yw2;
        }

        /* renamed from: a */
        public static C3876a m31144a(String... strArr) {
            try {
                C5301fr[] frVarArr = new C5301fr[strArr.length];
                C6205no noVar = new C6205no();
                for (int i = 0; i < strArr.length; i++) {
                    wv1.m31125Z(noVar, strArr[i]);
                    noVar.readByte();
                    frVarArr[i] = noVar.mo31697r0();
                }
                return new C3876a((String[]) strArr.clone(), yw2.m72279o(frVarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.wv1$b */
    public enum C3877b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f22308b[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f22308b;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: E */
    public static wv1 m31124E(C6893to toVar) {
        return new iw1(toVar);
    }

    /* renamed from: Z */
    public static void m31125Z(C6785so soVar, String str) throws IOException {
        String str2;
        String[] strArr = f22308b;
        soVar.mo41230L0(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                soVar.mo41246W0(str, i, i2);
            }
            soVar.mo41279n(str2);
            i = i2 + 1;
        }
        if (i < length) {
            soVar.mo41246W0(str, i, length);
        }
        soVar.mo41230L0(34);
    }

    /* renamed from: A */
    public abstract String mo17951A() throws IOException;

    /* renamed from: H */
    public abstract C3877b mo17955H() throws IOException;

    /* renamed from: K */
    public final void mo26706K(int i) {
        int i2 = this.f22314n;
        int[] iArr = this.f22309a;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f22309a = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f22310a;
                this.f22310a = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f22312b;
                this.f22312b = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new lv1("Nesting too deep at " + mo26708f0());
            }
        }
        int[] iArr3 = this.f22309a;
        int i3 = this.f22314n;
        this.f22314n = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: M */
    public abstract int mo17956M(C3876a aVar) throws IOException;

    /* renamed from: X */
    public abstract void mo17962X() throws IOException;

    /* renamed from: Y */
    public abstract void mo17963Y() throws IOException;

    /* renamed from: b */
    public abstract void mo17964b() throws IOException;

    /* renamed from: c */
    public abstract void mo17965c() throws IOException;

    /* renamed from: c0 */
    public final pv1 mo26707c0(String str) throws pv1 {
        throw new pv1(str + " at path " + mo26708f0());
    }

    /* renamed from: d */
    public abstract void mo17967d() throws IOException;

    /* renamed from: f0 */
    public final String mo26708f0() {
        return aw1.m11450a(this.f22314n, this.f22309a, this.f22310a, this.f22312b);
    }

    /* renamed from: g */
    public abstract void mo17969g() throws IOException;

    /* renamed from: h */
    public abstract boolean mo17970h() throws IOException;

    /* renamed from: l */
    public abstract boolean mo17972l() throws IOException;

    /* renamed from: m */
    public abstract double mo17974m() throws IOException;

    /* renamed from: p */
    public abstract int mo17976p() throws IOException;

    /* renamed from: q */
    public abstract String mo17978q() throws IOException;
}
