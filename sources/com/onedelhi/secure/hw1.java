package com.onedelhi.secure;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class hw1 extends lw1 {

    /* renamed from: a */
    public static final vv1 f29880a = new vv1("closed");

    /* renamed from: b */
    public static final Writer f29881b = new C5603a();

    /* renamed from: a */
    public ov1 f29882a = rv1.f34755a;

    /* renamed from: a */
    public final List<ov1> f29883a = new ArrayList();

    /* renamed from: e */
    public String f29884e;

    /* renamed from: com.onedelhi.secure.hw1$a */
    public class C5603a extends Writer {
        public void close() throws IOException {
            throw new AssertionError();
        }

        public void flush() throws IOException {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public hw1() {
        super(f29881b);
    }

    /* renamed from: C0 */
    public lw1 mo37578C0(Boolean bool) throws IOException {
        if (bool == null) {
            return mo37582M();
        }
        mo37586Q0(new vv1(bool));
        return this;
    }

    /* renamed from: F0 */
    public lw1 mo37579F0(Number number) throws IOException {
        if (number == null) {
            return mo37582M();
        }
        if (!mo40304q()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        mo37586Q0(new vv1(number));
        return this;
    }

    /* renamed from: G0 */
    public lw1 mo37580G0(String str) throws IOException {
        if (str == null) {
            return mo37582M();
        }
        mo37586Q0(new vv1(str));
        return this;
    }

    /* renamed from: H */
    public lw1 mo37581H(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f29883a.isEmpty() || this.f29884e != null) {
            throw new IllegalStateException();
        } else if (mo37585P0() instanceof sv1) {
            this.f29884e = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: M */
    public lw1 mo37582M() throws IOException {
        mo37586Q0(rv1.f34755a);
        return this;
    }

    /* renamed from: M0 */
    public lw1 mo37583M0(boolean z) throws IOException {
        mo37586Q0(new vv1(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: O0 */
    public ov1 mo37584O0() {
        if (this.f29883a.isEmpty()) {
            return this.f29882a;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f29883a);
    }

    /* renamed from: P0 */
    public final ov1 mo37585P0() {
        List<ov1> list = this.f29883a;
        return list.get(list.size() - 1);
    }

    /* renamed from: Q0 */
    public final void mo37586Q0(ov1 ov1) {
        if (this.f29884e != null) {
            if (!ov1.mo42282z() || mo40300m()) {
                ((sv1) mo37585P0()).mo44555C(this.f29884e, ov1);
            }
            this.f29884e = null;
        } else if (this.f29883a.isEmpty()) {
            this.f29882a = ov1;
        } else {
            ov1 P0 = mo37585P0();
            if (P0 instanceof gv1) {
                ((gv1) P0).mo36892C(ov1);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: c */
    public lw1 mo37587c() throws IOException {
        gv1 gv1 = new gv1();
        mo37586Q0(gv1);
        this.f29883a.add(gv1);
        return this;
    }

    public void close() throws IOException {
        if (this.f29883a.isEmpty()) {
            this.f29883a.add(f29880a);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public lw1 mo37589d() throws IOException {
        sv1 sv1 = new sv1();
        mo37586Q0(sv1);
        this.f29883a.add(sv1);
        return this;
    }

    public void flush() throws IOException {
    }

    /* renamed from: h */
    public lw1 mo37591h() throws IOException {
        if (this.f29883a.isEmpty() || this.f29884e != null) {
            throw new IllegalStateException();
        } else if (mo37585P0() instanceof gv1) {
            List<ov1> list = this.f29883a;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: l */
    public lw1 mo37592l() throws IOException {
        if (this.f29883a.isEmpty() || this.f29884e != null) {
            throw new IllegalStateException();
        } else if (mo37585P0() instanceof sv1) {
            List<ov1> list = this.f29883a;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: q0 */
    public lw1 mo37593q0(double d) throws IOException {
        if (mo40304q() || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            mo37586Q0(new vv1((Number) Double.valueOf(d)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    /* renamed from: u0 */
    public lw1 mo37594u0(long j) throws IOException {
        mo37586Q0(new vv1((Number) Long.valueOf(j)));
        return this;
    }
}
