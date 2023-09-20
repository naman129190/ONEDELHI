package com.onedelhi.secure;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class lw1 implements Closeable, Flushable {

    /* renamed from: a */
    public static final Pattern f31861a = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: a */
    public static final String[] f31862a = new String[128];

    /* renamed from: b */
    public static final String[] f31863b;

    /* renamed from: a */
    public final Writer f31864a;

    /* renamed from: a */
    public int[] f31865a = new int[32];

    /* renamed from: b */
    public String f31866b;

    /* renamed from: b */
    public boolean f31867b;

    /* renamed from: c */
    public String f31868c;

    /* renamed from: c */
    public boolean f31869c;

    /* renamed from: d */
    public String f31870d;

    /* renamed from: d */
    public boolean f31871d;

    /* renamed from: n */
    public int f31872n = 0;

    static {
        for (int i = 0; i <= 31; i++) {
            f31862a[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f31862a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f31863b = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public lw1(Writer writer) {
        mo40292Z(6);
        this.f31868c = ar4.f25981a;
        this.f31871d = true;
        Objects.requireNonNull(writer, "out == null");
        this.f31864a = writer;
    }

    /* renamed from: A */
    public static boolean m56622A(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    /* renamed from: C0 */
    public lw1 mo37578C0(Boolean bool) throws IOException {
        if (bool == null) {
            return mo37582M();
        }
        mo40289N0();
        mo40294b();
        this.f31864a.write(bool.booleanValue() ? h60.f29487F : h60.f29488G);
        return this;
    }

    /* renamed from: E */
    public lw1 mo40287E(String str) throws IOException {
        if (str == null) {
            return mo37582M();
        }
        mo40289N0();
        mo40294b();
        this.f31864a.append(str);
        return this;
    }

    /* renamed from: F0 */
    public lw1 mo37579F0(Number number) throws IOException {
        if (number == null) {
            return mo37582M();
        }
        mo40289N0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!m56622A(cls) && !f31861a.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f31867b) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + obj);
        }
        mo40294b();
        this.f31864a.append(obj);
        return this;
    }

    /* renamed from: G0 */
    public lw1 mo37580G0(String str) throws IOException {
        if (str == null) {
            return mo37582M();
        }
        mo40289N0();
        mo40294b();
        mo40303p0(str);
        return this;
    }

    /* renamed from: H */
    public lw1 mo37581H(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f31870d != null) {
            throw new IllegalStateException();
        } else if (this.f31872n != 0) {
            this.f31870d = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: K */
    public final void mo40288K() throws IOException {
        if (this.f31866b != null) {
            this.f31864a.write(10);
            int i = this.f31872n;
            for (int i2 = 1; i2 < i; i2++) {
                this.f31864a.write(this.f31866b);
            }
        }
    }

    /* renamed from: M */
    public lw1 mo37582M() throws IOException {
        if (this.f31870d != null) {
            if (this.f31871d) {
                mo40289N0();
            } else {
                this.f31870d = null;
                return this;
            }
        }
        mo40294b();
        this.f31864a.write("null");
        return this;
    }

    /* renamed from: M0 */
    public lw1 mo37583M0(boolean z) throws IOException {
        mo40289N0();
        mo40294b();
        this.f31864a.write(z ? h60.f29487F : h60.f29488G);
        return this;
    }

    /* renamed from: N0 */
    public final void mo40289N0() throws IOException {
        if (this.f31870d != null) {
            mo40293a();
            mo40303p0(this.f31870d);
            this.f31870d = null;
        }
    }

    /* renamed from: X */
    public final lw1 mo40290X(int i, char c) throws IOException {
        mo40294b();
        mo40292Z(i);
        this.f31864a.write(c);
        return this;
    }

    /* renamed from: Y */
    public final int mo40291Y() {
        int i = this.f31872n;
        if (i != 0) {
            return this.f31865a[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: Z */
    public final void mo40292Z(int i) {
        int i2 = this.f31872n;
        int[] iArr = this.f31865a;
        if (i2 == iArr.length) {
            this.f31865a = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f31865a;
        int i3 = this.f31872n;
        this.f31872n = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: a */
    public final void mo40293a() throws IOException {
        int Y = mo40291Y();
        if (Y == 5) {
            this.f31864a.write(44);
        } else if (Y != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        mo40288K();
        mo40295c0(4);
    }

    /* renamed from: b */
    public final void mo40294b() throws IOException {
        int Y = mo40291Y();
        if (Y == 1) {
            mo40295c0(2);
        } else if (Y == 2) {
            this.f31864a.append(',');
        } else if (Y != 4) {
            if (Y != 6) {
                if (Y != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f31867b) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            mo40295c0(7);
            return;
        } else {
            this.f31864a.append(this.f31868c);
            mo40295c0(5);
            return;
        }
        mo40288K();
    }

    /* renamed from: c */
    public lw1 mo37587c() throws IOException {
        mo40289N0();
        return mo40290X(1, '[');
    }

    /* renamed from: c0 */
    public final void mo40295c0(int i) {
        this.f31865a[this.f31872n - 1] = i;
    }

    public void close() throws IOException {
        this.f31864a.close();
        int i = this.f31872n;
        if (i > 1 || (i == 1 && this.f31865a[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f31872n = 0;
    }

    /* renamed from: d */
    public lw1 mo37589d() throws IOException {
        mo40289N0();
        return mo40290X(3, '{');
    }

    /* renamed from: e0 */
    public final void mo40296e0(boolean z) {
        this.f31869c = z;
    }

    public void flush() throws IOException {
        if (this.f31872n != 0) {
            this.f31864a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public final lw1 mo40297g(int i, int i2, char c) throws IOException {
        int Y = mo40291Y();
        if (Y != i2 && Y != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f31870d == null) {
            this.f31872n--;
            if (Y == i2) {
                mo40288K();
            }
            this.f31864a.write(c);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f31870d);
        }
    }

    /* renamed from: h */
    public lw1 mo37591h() throws IOException {
        return mo40297g(1, 2, ']');
    }

    /* renamed from: j0 */
    public final void mo40298j0(String str) {
        String str2;
        if (str.length() == 0) {
            this.f31866b = null;
            str2 = ar4.f25981a;
        } else {
            this.f31866b = str;
            str2 = ": ";
        }
        this.f31868c = str2;
    }

    /* renamed from: l */
    public lw1 mo37592l() throws IOException {
        return mo40297g(3, 5, '}');
    }

    /* renamed from: l0 */
    public final void mo40299l0(boolean z) {
        this.f31867b = z;
    }

    /* renamed from: m */
    public final boolean mo40300m() {
        return this.f31871d;
    }

    /* renamed from: o0 */
    public final void mo40301o0(boolean z) {
        this.f31871d = z;
    }

    /* renamed from: p */
    public final boolean mo40302p() {
        return this.f31869c;
    }

    /* renamed from: p0 */
    public final void mo40303p0(String str) throws IOException {
        String str2;
        String[] strArr = this.f31869c ? f31863b : f31862a;
        this.f31864a.write(34);
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
                this.f31864a.write(str, i, i2 - i);
            }
            this.f31864a.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f31864a.write(str, i, length - i);
        }
        this.f31864a.write(34);
    }

    /* renamed from: q */
    public boolean mo40304q() {
        return this.f31867b;
    }

    /* renamed from: q0 */
    public lw1 mo37593q0(double d) throws IOException {
        mo40289N0();
        if (this.f31867b || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            mo40294b();
            this.f31864a.append(Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    /* renamed from: u0 */
    public lw1 mo37594u0(long j) throws IOException {
        mo40289N0();
        mo40294b();
        this.f31864a.write(Long.toString(j));
        return this;
    }
}
