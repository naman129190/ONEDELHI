package com.onedelhi.secure;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class gw1 extends xv1 {

    /* renamed from: a */
    public static final Object f29328a = new Object();

    /* renamed from: b */
    public static final Reader f29329b = new C5450a();

    /* renamed from: V */
    public int f29330V = 0;

    /* renamed from: a */
    public Object[] f29331a = new Object[32];

    /* renamed from: b */
    public String[] f29332b = new String[32];

    /* renamed from: c */
    public int[] f29333c = new int[32];

    /* renamed from: com.onedelhi.secure.gw1$a */
    public class C5450a extends Reader {
        public void close() throws IOException {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    public gw1(ov1 ov1) {
        super(f29329b);
        mo36939i1(ov1);
    }

    /* renamed from: K */
    private String m49898K() {
        return " at path " + mo36935f0();
    }

    /* renamed from: p */
    private String m49899p(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.f29330V;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.f29331a;
            if (objArr[i] instanceof gv1) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.f29333c[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((objArr[i] instanceof sv1) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String[] strArr = this.f29332b;
                if (strArr[i] != null) {
                    sb.append(strArr[i]);
                }
            }
            i++;
        }
    }

    /* renamed from: A */
    public boolean mo36922A() throws IOException {
        fw1 q0 = mo36944q0();
        return (q0 == fw1.END_OBJECT || q0 == fw1.END_ARRAY || q0 == fw1.END_DOCUMENT) ? false : true;
    }

    /* renamed from: M */
    public boolean mo36923M() throws IOException {
        mo36925V0(fw1.BOOLEAN);
        boolean g = ((vv1) mo36936f1()).mo36908g();
        int i = this.f29330V;
        if (i > 0) {
            int[] iArr = this.f29333c;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return g;
    }

    /* renamed from: R0 */
    public void mo36924R0() throws IOException {
        if (mo36944q0() == fw1.NAME) {
            mo36932c0();
            this.f29332b[this.f29330V - 2] = "null";
        } else {
            mo36936f1();
            int i = this.f29330V;
            if (i > 0) {
                this.f29332b[i - 1] = "null";
            }
        }
        int i2 = this.f29330V;
        if (i2 > 0) {
            int[] iArr = this.f29333c;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: V0 */
    public final void mo36925V0(fw1 fw1) throws IOException {
        if (mo36944q0() != fw1) {
            throw new IllegalStateException("Expected " + fw1 + " but was " + mo36944q0() + m49898K());
        }
    }

    /* renamed from: X */
    public double mo36926X() throws IOException {
        fw1 q0 = mo36944q0();
        fw1 fw1 = fw1.NUMBER;
        if (q0 == fw1 || q0 == fw1.STRING) {
            double k = ((vv1) mo36933c1()).mo36914k();
            if (mo47399E() || (!Double.isNaN(k) && !Double.isInfinite(k))) {
                mo36936f1();
                int i = this.f29330V;
                if (i > 0) {
                    int[] iArr = this.f29333c;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return k;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + k);
        }
        throw new IllegalStateException("Expected " + fw1 + " but was " + q0 + m49898K());
    }

    /* renamed from: Y */
    public int mo36927Y() throws IOException {
        fw1 q0 = mo36944q0();
        fw1 fw1 = fw1.NUMBER;
        if (q0 == fw1 || q0 == fw1.STRING) {
            int n = ((vv1) mo36933c1()).mo36916n();
            mo36936f1();
            int i = this.f29330V;
            if (i > 0) {
                int[] iArr = this.f29333c;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return n;
        }
        throw new IllegalStateException("Expected " + fw1 + " but was " + q0 + m49898K());
    }

    /* renamed from: Z */
    public long mo36928Z() throws IOException {
        fw1 q0 = mo36944q0();
        fw1 fw1 = fw1.NUMBER;
        if (q0 == fw1 || q0 == fw1.STRING) {
            long u = ((vv1) mo36933c1()).mo36918u();
            mo36936f1();
            int i = this.f29330V;
            if (i > 0) {
                int[] iArr = this.f29333c;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return u;
        }
        throw new IllegalStateException("Expected " + fw1 + " but was " + q0 + m49898K());
    }

    /* renamed from: a */
    public void mo36929a() throws IOException {
        mo36925V0(fw1.BEGIN_ARRAY);
        mo36939i1(((gv1) mo36933c1()).iterator());
        this.f29333c[this.f29330V - 1] = 0;
    }

    /* renamed from: b */
    public void mo36930b() throws IOException {
        mo36925V0(fw1.BEGIN_OBJECT);
        mo36939i1(((sv1) mo36933c1()).mo44561L().iterator());
    }

    /* renamed from: b1 */
    public ov1 mo36931b1() throws IOException {
        fw1 q0 = mo36944q0();
        if (q0 == fw1.NAME || q0 == fw1.END_ARRAY || q0 == fw1.END_OBJECT || q0 == fw1.END_DOCUMENT) {
            throw new IllegalStateException("Unexpected " + q0 + " when reading a JsonElement.");
        }
        ov1 ov1 = (ov1) mo36933c1();
        mo36924R0();
        return ov1;
    }

    /* renamed from: c0 */
    public String mo36932c0() throws IOException {
        mo36925V0(fw1.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) mo36933c1()).next();
        String str = (String) entry.getKey();
        this.f29332b[this.f29330V - 1] = str;
        mo36939i1(entry.getValue());
        return str;
    }

    /* renamed from: c1 */
    public final Object mo36933c1() {
        return this.f29331a[this.f29330V - 1];
    }

    public void close() throws IOException {
        this.f29331a = new Object[]{f29328a};
        this.f29330V = 1;
    }

    /* renamed from: f0 */
    public String mo36935f0() {
        return m49899p(false);
    }

    /* renamed from: f1 */
    public final Object mo36936f1() {
        Object[] objArr = this.f29331a;
        int i = this.f29330V - 1;
        this.f29330V = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: h */
    public void mo36937h() throws IOException {
        mo36925V0(fw1.END_ARRAY);
        mo36936f1();
        mo36936f1();
        int i = this.f29330V;
        if (i > 0) {
            int[] iArr = this.f29333c;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: h1 */
    public void mo36938h1() throws IOException {
        mo36925V0(fw1.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) mo36933c1()).next();
        mo36939i1(entry.getValue());
        mo36939i1(new vv1((String) entry.getKey()));
    }

    /* renamed from: i1 */
    public final void mo36939i1(Object obj) {
        int i = this.f29330V;
        Object[] objArr = this.f29331a;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f29331a = Arrays.copyOf(objArr, i2);
            this.f29333c = Arrays.copyOf(this.f29333c, i2);
            this.f29332b = (String[]) Arrays.copyOf(this.f29332b, i2);
        }
        Object[] objArr2 = this.f29331a;
        int i3 = this.f29330V;
        this.f29330V = i3 + 1;
        objArr2[i3] = obj;
    }

    /* renamed from: j0 */
    public void mo36940j0() throws IOException {
        mo36925V0(fw1.NULL);
        mo36936f1();
        int i = this.f29330V;
        if (i > 0) {
            int[] iArr = this.f29333c;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: l */
    public void mo36941l() throws IOException {
        mo36925V0(fw1.END_OBJECT);
        mo36936f1();
        mo36936f1();
        int i = this.f29330V;
        if (i > 0) {
            int[] iArr = this.f29333c;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: o0 */
    public String mo36942o0() throws IOException {
        fw1 q0 = mo36944q0();
        fw1 fw1 = fw1.STRING;
        if (q0 == fw1 || q0 == fw1.NUMBER) {
            String x = ((vv1) mo36936f1()).mo36921x();
            int i = this.f29330V;
            if (i > 0) {
                int[] iArr = this.f29333c;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return x;
        }
        throw new IllegalStateException("Expected " + fw1 + " but was " + q0 + m49898K());
    }

    /* renamed from: q */
    public String mo36943q() {
        return m49899p(true);
    }

    /* renamed from: q0 */
    public fw1 mo36944q0() throws IOException {
        if (this.f29330V == 0) {
            return fw1.END_DOCUMENT;
        }
        Object c1 = mo36933c1();
        if (c1 instanceof Iterator) {
            boolean z = this.f29331a[this.f29330V - 2] instanceof sv1;
            Iterator it = (Iterator) c1;
            if (!it.hasNext()) {
                return z ? fw1.END_OBJECT : fw1.END_ARRAY;
            }
            if (z) {
                return fw1.NAME;
            }
            mo36939i1(it.next());
            return mo36944q0();
        } else if (c1 instanceof sv1) {
            return fw1.BEGIN_OBJECT;
        } else {
            if (c1 instanceof gv1) {
                return fw1.BEGIN_ARRAY;
            }
            if (c1 instanceof vv1) {
                vv1 vv1 = (vv1) c1;
                if (vv1.mo46386I()) {
                    return fw1.STRING;
                }
                if (vv1.mo46384D()) {
                    return fw1.BOOLEAN;
                }
                if (vv1.mo46385G()) {
                    return fw1.NUMBER;
                }
                throw new AssertionError();
            } else if (c1 instanceof rv1) {
                return fw1.NULL;
            } else {
                if (c1 == f29328a) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public String toString() {
        return gw1.class.getSimpleName() + m49898K();
    }
}
