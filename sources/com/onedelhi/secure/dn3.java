package com.onedelhi.secure;

import com.onedelhi.secure.C5173er;
import com.onedelhi.secure.ak4;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class dn3 extends C5173er {

    /* renamed from: a */
    public static final int[] f27541a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, ak4.C1712e.f9246k, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: b */
    public static final long f27542b = 1;

    /* renamed from: b */
    public final C5173er f27543b;

    /* renamed from: c */
    public final C5173er f27544c;

    /* renamed from: s */
    public final int f27545s;

    /* renamed from: t */
    public final int f27546t;

    /* renamed from: u */
    public final int f27547u;

    /* renamed from: com.onedelhi.secure.dn3$a */
    public class C5044a extends C5173er.C5176c {

        /* renamed from: a */
        public final C5046c f27548a;

        /* renamed from: a */
        public C5173er.C5180g f27550a = mo34554b();

        public C5044a() {
            this.f27548a = new C5046c(dn3.this, (C5044a) null);
        }

        /* renamed from: b */
        public final C5173er.C5180g mo34554b() {
            if (this.f27548a.hasNext()) {
                return this.f27548a.next().iterator();
            }
            return null;
        }

        /* renamed from: g */
        public byte mo34555g() {
            C5173er.C5180g gVar = this.f27550a;
            if (gVar != null) {
                byte g = gVar.mo34555g();
                if (!this.f27550a.hasNext()) {
                    this.f27550a = mo34554b();
                }
                return g;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f27550a != null;
        }
    }

    /* renamed from: com.onedelhi.secure.dn3$b */
    public static class C5045b {

        /* renamed from: a */
        public final ArrayDeque<C5173er> f27551a;

        public C5045b() {
            this.f27551a = new ArrayDeque<>();
        }

        public /* synthetic */ C5045b(C5044a aVar) {
            this();
        }

        /* renamed from: b */
        public final C5173er mo34557b(C5173er erVar, C5173er erVar2) {
            mo34558c(erVar);
            mo34558c(erVar2);
            C5173er pop = this.f27551a.pop();
            while (!this.f27551a.isEmpty()) {
                pop = new dn3(this.f27551a.pop(), pop, (C5044a) null);
            }
            return pop;
        }

        /* renamed from: c */
        public final void mo34558c(C5173er erVar) {
            if (erVar.mo34532F()) {
                mo34560e(erVar);
            } else if (erVar instanceof dn3) {
                dn3 dn3 = (dn3) erVar;
                mo34558c(dn3.f27543b);
                mo34558c(dn3.f27544c);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + erVar.getClass());
            }
        }

        /* renamed from: d */
        public final int mo34559d(int i) {
            int binarySearch = Arrays.binarySearch(dn3.f27541a, i);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        /* renamed from: e */
        public final void mo34560e(C5173er erVar) {
            int d = mo34559d(erVar.size());
            int E0 = dn3.m45413E0(d + 1);
            if (this.f27551a.isEmpty() || this.f27551a.peek().size() >= E0) {
                this.f27551a.push(erVar);
                return;
            }
            int E02 = dn3.m45413E0(d);
            C5173er pop = this.f27551a.pop();
            while (!this.f27551a.isEmpty() && this.f27551a.peek().size() < E02) {
                pop = new dn3(this.f27551a.pop(), pop, (C5044a) null);
            }
            dn3 dn3 = new dn3(pop, erVar, (C5044a) null);
            while (!this.f27551a.isEmpty() && this.f27551a.peek().size() < dn3.m45413E0(mo34559d(dn3.size()) + 1)) {
                dn3 = new dn3(this.f27551a.pop(), dn3, (C5044a) null);
            }
            this.f27551a.push(dn3);
        }
    }

    /* renamed from: com.onedelhi.secure.dn3$c */
    public static final class C5046c implements Iterator<C5173er.C5182i> {

        /* renamed from: a */
        public C5173er.C5182i f27552a;

        /* renamed from: a */
        public final ArrayDeque<dn3> f27553a;

        public C5046c(C5173er erVar) {
            C5173er.C5182i iVar;
            if (erVar instanceof dn3) {
                dn3 dn3 = (dn3) erVar;
                ArrayDeque<dn3> arrayDeque = new ArrayDeque<>(dn3.mo34529C());
                this.f27553a = arrayDeque;
                arrayDeque.push(dn3);
                iVar = mo34561a(dn3.f27543b);
            } else {
                this.f27553a = null;
                iVar = (C5173er.C5182i) erVar;
            }
            this.f27552a = iVar;
        }

        public /* synthetic */ C5046c(C5173er erVar, C5044a aVar) {
            this(erVar);
        }

        /* renamed from: a */
        public final C5173er.C5182i mo34561a(C5173er erVar) {
            while (erVar instanceof dn3) {
                dn3 dn3 = (dn3) erVar;
                this.f27553a.push(dn3);
                erVar = dn3.f27543b;
            }
            return (C5173er.C5182i) erVar;
        }

        /* renamed from: b */
        public final C5173er.C5182i mo34562b() {
            C5173er.C5182i a;
            do {
                ArrayDeque<dn3> arrayDeque = this.f27553a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                a = mo34561a(this.f27553a.pop().f27544c);
            } while (a.isEmpty());
            return a;
        }

        /* renamed from: d */
        public C5173er.C5182i next() {
            C5173er.C5182i iVar = this.f27552a;
            if (iVar != null) {
                this.f27552a = mo34562b();
                return iVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f27552a != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.onedelhi.secure.dn3$d */
    public class C5047d extends InputStream {

        /* renamed from: a */
        public C5046c f27554a;

        /* renamed from: a */
        public C5173er.C5182i f27556a;

        /* renamed from: n */
        public int f27557n;

        /* renamed from: o */
        public int f27558o;

        /* renamed from: p */
        public int f27559p;

        /* renamed from: q */
        public int f27560q;

        public C5047d() {
            mo34570c();
        }

        /* renamed from: a */
        public final void mo34567a() {
            int i;
            if (this.f27556a != null && this.f27558o == (i = this.f27557n)) {
                this.f27559p += i;
                int i2 = 0;
                this.f27558o = 0;
                if (this.f27554a.hasNext()) {
                    C5173er.C5182i d = this.f27554a.next();
                    this.f27556a = d;
                    i2 = d.size();
                } else {
                    this.f27556a = null;
                }
                this.f27557n = i2;
            }
        }

        public int available() throws IOException {
            return mo34569b();
        }

        /* renamed from: b */
        public final int mo34569b() {
            return dn3.this.size() - (this.f27559p + this.f27558o);
        }

        /* renamed from: c */
        public final void mo34570c() {
            C5046c cVar = new C5046c(dn3.this, (C5044a) null);
            this.f27554a = cVar;
            C5173er.C5182i d = cVar.next();
            this.f27556a = d;
            this.f27557n = d.size();
            this.f27558o = 0;
            this.f27559p = 0;
        }

        /* renamed from: d */
        public final int mo34571d(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                mo34567a();
                if (this.f27556a == null) {
                    break;
                }
                int min = Math.min(this.f27557n - this.f27558o, i3);
                if (bArr != null) {
                    this.f27556a.mo35549z(bArr, this.f27558o, i, min);
                    i += min;
                }
                this.f27558o += min;
                i3 -= min;
            }
            return i2 - i3;
        }

        public void mark(int i) {
            this.f27560q = this.f27559p + this.f27558o;
        }

        public boolean markSupported() {
            return true;
        }

        public int read() throws IOException {
            mo34567a();
            C5173er.C5182i iVar = this.f27556a;
            if (iVar == null) {
                return -1;
            }
            int i = this.f27558o;
            this.f27558o = i + 1;
            return iVar.mo34545i(i) & 255;
        }

        public int read(byte[] bArr, int i, int i2) {
            Objects.requireNonNull(bArr);
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            int d = mo34571d(bArr, i, i2);
            if (d != 0) {
                return d;
            }
            if (i2 > 0 || mo34569b() == 0) {
                return -1;
            }
            return d;
        }

        public synchronized void reset() {
            mo34570c();
            mo34571d((byte[]) null, 0, this.f27560q);
        }

        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (long) mo34571d((byte[]) null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public dn3(C5173er erVar, C5173er erVar2) {
        this.f27543b = erVar;
        this.f27544c = erVar2;
        int size = erVar.size();
        this.f27546t = size;
        this.f27545s = size + erVar2.size();
        this.f27547u = Math.max(erVar.mo34529C(), erVar2.mo34529C()) + 1;
    }

    public /* synthetic */ dn3(C5173er erVar, C5173er erVar2, C5044a aVar) {
        this(erVar, erVar2);
    }

    /* renamed from: A0 */
    public static C5173er m45411A0(C5173er erVar, C5173er erVar2) {
        if (erVar2.size() == 0) {
            return erVar;
        }
        if (erVar.size() == 0) {
            return erVar2;
        }
        int size = erVar.size() + erVar2.size();
        if (size < 128) {
            return m45412B0(erVar, erVar2);
        }
        if (erVar instanceof dn3) {
            dn3 dn3 = (dn3) erVar;
            if (dn3.f27544c.size() + erVar2.size() < 128) {
                return new dn3(dn3.f27543b, m45412B0(dn3.f27544c, erVar2));
            } else if (dn3.f27543b.mo34529C() > dn3.f27544c.mo34529C() && dn3.mo34529C() > erVar2.mo34529C()) {
                return new dn3(dn3.f27543b, new dn3(dn3.f27544c, erVar2));
            }
        }
        return size >= m45413E0(Math.max(erVar.mo34529C(), erVar2.mo34529C()) + 1) ? new dn3(erVar, erVar2) : new C5045b((C5044a) null).mo34557b(erVar, erVar2);
    }

    /* renamed from: B0 */
    public static C5173er m45412B0(C5173er erVar, C5173er erVar2) {
        int size = erVar.size();
        int size2 = erVar2.size();
        byte[] bArr = new byte[(size + size2)];
        erVar.mo35549z(bArr, 0, 0, size);
        erVar2.mo35549z(bArr, 0, size, size2);
        return C5173er.m47129p0(bArr);
    }

    /* renamed from: E0 */
    public static int m45413E0(int i) {
        int[] iArr = f27541a;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    /* renamed from: H0 */
    public static dn3 m45414H0(C5173er erVar, C5173er erVar2) {
        return new dn3(erVar, erVar2);
    }

    /* renamed from: A */
    public void mo34528A(byte[] bArr, int i, int i2, int i3) {
        C5173er erVar;
        int i4 = i + i3;
        int i5 = this.f27546t;
        if (i4 <= i5) {
            erVar = this.f27543b;
        } else if (i >= i5) {
            erVar = this.f27544c;
            i -= i5;
        } else {
            int i6 = i5 - i;
            this.f27543b.mo34528A(bArr, i, i2, i6);
            this.f27544c.mo34528A(bArr, 0, i2 + i6, i3 - i6);
            return;
        }
        erVar.mo34528A(bArr, i, i2, i3);
    }

    /* renamed from: C */
    public int mo34529C() {
        return this.f27547u;
    }

    /* renamed from: D */
    public byte mo34530D(int i) {
        int i2 = this.f27546t;
        return i < i2 ? this.f27543b.mo34530D(i) : this.f27544c.mo34530D(i - i2);
    }

    /* renamed from: D0 */
    public final boolean mo34531D0(C5173er erVar) {
        C5046c cVar = new C5046c(this, (C5044a) null);
        C5173er.C5182i iVar = (C5173er.C5182i) cVar.next();
        C5046c cVar2 = new C5046c(erVar, (C5044a) null);
        C5173er.C5182i iVar2 = (C5173er.C5182i) cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = iVar.size() - i;
            int size2 = iVar2.size() - i2;
            int min = Math.min(size, size2);
            if (!(i == 0 ? iVar.mo35562y0(iVar2, i2, min) : iVar2.mo35562y0(iVar, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.f27545s;
            if (i3 < i4) {
                if (min == size) {
                    iVar = (C5173er.C5182i) cVar.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    iVar2 = (C5173er.C5182i) cVar2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: F */
    public boolean mo34532F() {
        return this.f27545s >= m45413E0(this.f27547u);
    }

    /* renamed from: G */
    public boolean mo34533G() {
        int R = this.f27543b.mo34540R(0, 0, this.f27546t);
        C5173er erVar = this.f27544c;
        return erVar.mo34540R(R, 0, erVar.size()) == 0;
    }

    /* renamed from: I */
    public C5173er.C5180g iterator() {
        return new C5044a();
    }

    /* renamed from: I0 */
    public final void mo34535I0(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    /* renamed from: J0 */
    public Object mo34536J0() {
        return C5173er.m47129p0(mo35538d0());
    }

    /* renamed from: L */
    public g00 mo34537L() {
        return g00.m48673m(mo34544f(), true);
    }

    /* renamed from: N */
    public InputStream mo34538N() {
        return new C5047d();
    }

    /* renamed from: Q */
    public int mo34539Q(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f27546t;
        if (i4 <= i5) {
            return this.f27543b.mo34539Q(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f27544c.mo34539Q(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f27544c.mo34539Q(this.f27543b.mo34539Q(i, i2, i6), 0, i3 - i6);
    }

    /* renamed from: R */
    public int mo34540R(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f27546t;
        if (i4 <= i5) {
            return this.f27543b.mo34540R(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f27544c.mo34540R(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f27544c.mo34540R(this.f27543b.mo34540R(i, i2, i6), 0, i3 - i6);
    }

    /* renamed from: b0 */
    public C5173er mo34541b0(int i, int i2) {
        int k = C5173er.m47124k(i, i2, this.f27545s);
        if (k == 0) {
            return C5173er.f28039a;
        }
        if (k == this.f27545s) {
            return this;
        }
        int i3 = this.f27546t;
        return i2 <= i3 ? this.f27543b.mo34541b0(i, i2) : i >= i3 ? this.f27544c.mo34541b0(i - i3, i2 - i3) : new dn3(this.f27543b.mo35537a0(i), this.f27544c.mo34541b0(0, i2 - this.f27546t));
    }

    /* renamed from: e */
    public ByteBuffer mo34542e() {
        return ByteBuffer.wrap(mo35538d0()).asReadOnlyBuffer();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5173er)) {
            return false;
        }
        C5173er erVar = (C5173er) obj;
        if (this.f27545s != erVar.size()) {
            return false;
        }
        if (this.f27545s == 0) {
            return true;
        }
        int S = mo35535S();
        int S2 = erVar.mo35535S();
        if (S == 0 || S2 == 0 || S == S2) {
            return mo34531D0(erVar);
        }
        return false;
    }

    /* renamed from: f */
    public List<ByteBuffer> mo34544f() {
        ArrayList arrayList = new ArrayList();
        C5046c cVar = new C5046c(this, (C5044a) null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().mo34542e());
        }
        return arrayList;
    }

    /* renamed from: i */
    public byte mo34545i(int i) {
        C5173er.m47123j(i, this.f27545s);
        return mo34530D(i);
    }

    /* renamed from: i0 */
    public String mo34546i0(Charset charset) {
        return new String(mo35538d0(), charset);
    }

    /* renamed from: s0 */
    public void mo34548s0(C4589ar arVar) throws IOException {
        this.f27543b.mo34548s0(arVar);
        this.f27544c.mo34548s0(arVar);
    }

    public int size() {
        return this.f27545s;
    }

    /* renamed from: t0 */
    public void mo34550t0(OutputStream outputStream) throws IOException {
        this.f27543b.mo34550t0(outputStream);
        this.f27544c.mo34550t0(outputStream);
    }

    /* renamed from: w0 */
    public void mo34551w0(OutputStream outputStream, int i, int i2) throws IOException {
        C5173er erVar;
        int i3 = i + i2;
        int i4 = this.f27546t;
        if (i3 <= i4) {
            erVar = this.f27543b;
        } else if (i >= i4) {
            erVar = this.f27544c;
            i -= i4;
        } else {
            int i5 = i4 - i;
            this.f27543b.mo34551w0(outputStream, i, i5);
            this.f27544c.mo34551w0(outputStream, 0, i2 - i5);
            return;
        }
        erVar.mo34551w0(outputStream, i, i2);
    }

    /* renamed from: x */
    public void mo34552x(ByteBuffer byteBuffer) {
        this.f27543b.mo34552x(byteBuffer);
        this.f27544c.mo34552x(byteBuffer);
    }

    /* renamed from: x0 */
    public void mo34553x0(C4589ar arVar) throws IOException {
        this.f27544c.mo34553x0(arVar);
        this.f27543b.mo34553x0(arVar);
    }
}
