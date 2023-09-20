package com.onedelhi.secure;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.er */
public abstract class C5173er implements Iterable<Byte>, Serializable {

    /* renamed from: a */
    public static final C5179f f28038a = (C6172n5.m57901c() ? new C5185l((C5174a) null) : new C5177d((C5174a) null));

    /* renamed from: a */
    public static final C5173er f28039a = new C5183j(vs1.f36666a);

    /* renamed from: a */
    public static final Comparator<C5173er> f28040a = new C5175b();

    /* renamed from: o */
    public static final int f28041o = 128;

    /* renamed from: p */
    public static final int f28042p = 256;

    /* renamed from: q */
    public static final int f28043q = 8192;

    /* renamed from: r */
    public static final int f28044r = 255;

    /* renamed from: n */
    public int f28045n = 0;

    /* renamed from: com.onedelhi.secure.er$a */
    public class C5174a extends C5176c {

        /* renamed from: n */
        public int f28047n = 0;

        /* renamed from: o */
        public final int f28048o;

        public C5174a() {
            this.f28048o = C5173er.this.size();
        }

        /* renamed from: g */
        public byte mo34555g() {
            int i = this.f28047n;
            if (i < this.f28048o) {
                this.f28047n = i + 1;
                return C5173er.this.mo34530D(i);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f28047n < this.f28048o;
        }
    }

    /* renamed from: com.onedelhi.secure.er$b */
    public static class C5175b implements Comparator<C5173er> {
        /* renamed from: a */
        public int compare(C5173er erVar, C5173er erVar2) {
            C5180g I = erVar.iterator();
            C5180g I2 = erVar2.iterator();
            while (I.hasNext() && I2.hasNext()) {
                int compare = Integer.compare(C5173er.m47121f0(I.mo34555g()), C5173er.m47121f0(I2.mo34555g()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(erVar.size(), erVar2.size());
        }
    }

    /* renamed from: com.onedelhi.secure.er$c */
    public static abstract class C5176c implements C5180g {
        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(mo34555g());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.onedelhi.secure.er$d */
    public static final class C5177d implements C5179f {
        public C5177d() {
        }

        public /* synthetic */ C5177d(C5174a aVar) {
            this();
        }

        /* renamed from: a */
        public byte[] mo35556a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* renamed from: com.onedelhi.secure.er$e */
    public static final class C5178e extends C5183j {

        /* renamed from: c */
        public static final long f28049c = 1;

        /* renamed from: s */
        public final int f28050s;

        /* renamed from: t */
        public final int f28051t;

        public C5178e(byte[] bArr, int i, int i2) {
            super(bArr);
            C5173er.m47124k(i, i + i2, bArr.length);
            this.f28050s = i;
            this.f28051t = i2;
        }

        /* renamed from: A */
        public void mo34528A(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f28055a, mo35559z0() + i, bArr, i2, i3);
        }

        /* renamed from: A0 */
        public final void mo35557A0(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* renamed from: B0 */
        public Object mo35558B0() {
            return C5173er.m47129p0(mo35538d0());
        }

        /* renamed from: D */
        public byte mo34530D(int i) {
            return this.f28055a[this.f28050s + i];
        }

        /* renamed from: i */
        public byte mo34545i(int i) {
            C5173er.m47123j(i, size());
            return this.f28055a[this.f28050s + i];
        }

        public int size() {
            return this.f28051t;
        }

        /* renamed from: z0 */
        public int mo35559z0() {
            return this.f28050s;
        }
    }

    /* renamed from: com.onedelhi.secure.er$f */
    public interface C5179f {
        /* renamed from: a */
        byte[] mo35556a(byte[] bArr, int i, int i2);
    }

    /* renamed from: com.onedelhi.secure.er$g */
    public interface C5180g extends Iterator<Byte> {
        /* renamed from: g */
        byte mo34555g();
    }

    /* renamed from: com.onedelhi.secure.er$h */
    public static final class C5181h {

        /* renamed from: a */
        public final i00 f28052a;

        /* renamed from: a */
        public final byte[] f28053a;

        public C5181h(int i) {
            byte[] bArr = new byte[i];
            this.f28053a = bArr;
            this.f28052a = i00.m51438n1(bArr);
        }

        public /* synthetic */ C5181h(int i, C5174a aVar) {
            this(i);
        }

        /* renamed from: a */
        public C5173er mo35560a() {
            this.f28052a.mo37761Z();
            return new C5183j(this.f28053a);
        }

        /* renamed from: b */
        public i00 mo35561b() {
            return this.f28052a;
        }
    }

    /* renamed from: com.onedelhi.secure.er$i */
    public static abstract class C5182i extends C5173er {
        /* renamed from: C */
        public final int mo34529C() {
            return 0;
        }

        /* renamed from: F */
        public final boolean mo34532F() {
            return true;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C5173er.super.iterator();
        }

        /* renamed from: x0 */
        public void mo34553x0(C4589ar arVar) throws IOException {
            mo34548s0(arVar);
        }

        /* renamed from: y0 */
        public abstract boolean mo35562y0(C5173er erVar, int i, int i2);
    }

    /* renamed from: com.onedelhi.secure.er$j */
    public static class C5183j extends C5182i {

        /* renamed from: b */
        public static final long f28054b = 1;

        /* renamed from: a */
        public final byte[] f28055a;

        public C5183j(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f28055a = bArr;
        }

        /* renamed from: A */
        public void mo34528A(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f28055a, i, bArr, i2, i3);
        }

        /* renamed from: D */
        public byte mo34530D(int i) {
            return this.f28055a[i];
        }

        /* renamed from: G */
        public final boolean mo34533G() {
            int z0 = mo35559z0();
            return hq4.m50772u(this.f28055a, z0, size() + z0);
        }

        /* renamed from: L */
        public final g00 mo34537L() {
            return g00.m48678r(this.f28055a, mo35559z0(), size(), true);
        }

        /* renamed from: N */
        public final InputStream mo34538N() {
            return new ByteArrayInputStream(this.f28055a, mo35559z0(), size());
        }

        /* renamed from: Q */
        public final int mo34539Q(int i, int i2, int i3) {
            return vs1.m68451w(i, this.f28055a, mo35559z0() + i2, i3);
        }

        /* renamed from: R */
        public final int mo34540R(int i, int i2, int i3) {
            int z0 = mo35559z0() + i2;
            return hq4.m50774w(i, this.f28055a, z0, i3 + z0);
        }

        /* renamed from: b0 */
        public final C5173er mo34541b0(int i, int i2) {
            int k = C5173er.m47124k(i, i2, size());
            return k == 0 ? C5173er.f28039a : new C5178e(this.f28055a, mo35559z0() + i, k);
        }

        /* renamed from: e */
        public final ByteBuffer mo34542e() {
            return ByteBuffer.wrap(this.f28055a, mo35559z0(), size()).asReadOnlyBuffer();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C5173er) || size() != ((C5173er) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C5183j)) {
                return obj.equals(this);
            }
            C5183j jVar = (C5183j) obj;
            int S = mo35535S();
            int S2 = jVar.mo35535S();
            if (S == 0 || S2 == 0 || S == S2) {
                return mo35562y0(jVar, 0, size());
            }
            return false;
        }

        /* renamed from: f */
        public final List<ByteBuffer> mo34544f() {
            return Collections.singletonList(mo34542e());
        }

        /* renamed from: i */
        public byte mo34545i(int i) {
            return this.f28055a[i];
        }

        /* renamed from: i0 */
        public final String mo34546i0(Charset charset) {
            return new String(this.f28055a, mo35559z0(), size(), charset);
        }

        /* renamed from: s0 */
        public final void mo34548s0(C4589ar arVar) throws IOException {
            arVar.mo31116X(this.f28055a, mo35559z0(), size());
        }

        public int size() {
            return this.f28055a.length;
        }

        /* renamed from: t0 */
        public final void mo34550t0(OutputStream outputStream) throws IOException {
            outputStream.write(mo35538d0());
        }

        /* renamed from: w0 */
        public final void mo34551w0(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.f28055a, mo35559z0() + i, i2);
        }

        /* renamed from: x */
        public final void mo34552x(ByteBuffer byteBuffer) {
            byteBuffer.put(this.f28055a, mo35559z0(), size());
        }

        /* renamed from: y0 */
        public final boolean mo35562y0(C5173er erVar, int i, int i2) {
            if (i2 <= erVar.size()) {
                int i3 = i + i2;
                if (i3 > erVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + erVar.size());
                } else if (!(erVar instanceof C5183j)) {
                    return erVar.mo34541b0(i, i3).equals(mo34541b0(0, i2));
                } else {
                    C5183j jVar = (C5183j) erVar;
                    byte[] bArr = this.f28055a;
                    byte[] bArr2 = jVar.f28055a;
                    int z0 = mo35559z0() + i2;
                    int z02 = mo35559z0();
                    int z03 = jVar.mo35559z0() + i;
                    while (z02 < z0) {
                        if (bArr[z02] != bArr2[z03]) {
                            return false;
                        }
                        z02++;
                        z03++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        /* renamed from: z0 */
        public int mo35559z0() {
            return 0;
        }
    }

    /* renamed from: com.onedelhi.secure.er$k */
    public static final class C5184k extends OutputStream {

        /* renamed from: b */
        public static final byte[] f28056b = new byte[0];

        /* renamed from: a */
        public final ArrayList<C5173er> f28057a;

        /* renamed from: a */
        public byte[] f28058a;

        /* renamed from: n */
        public final int f28059n;

        /* renamed from: o */
        public int f28060o;

        /* renamed from: p */
        public int f28061p;

        public C5184k(int i) {
            if (i >= 0) {
                this.f28059n = i;
                this.f28057a = new ArrayList<>();
                this.f28058a = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        /* renamed from: a */
        public final byte[] mo35563a(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        /* renamed from: b */
        public final void mo35564b(int i) {
            this.f28057a.add(new C5183j(this.f28058a));
            int length = this.f28060o + this.f28058a.length;
            this.f28060o = length;
            this.f28058a = new byte[Math.max(this.f28059n, Math.max(i, length >>> 1))];
            this.f28061p = 0;
        }

        /* renamed from: c */
        public final void mo35565c() {
            int i = this.f28061p;
            byte[] bArr = this.f28058a;
            if (i >= bArr.length) {
                this.f28057a.add(new C5183j(this.f28058a));
                this.f28058a = f28056b;
            } else if (i > 0) {
                this.f28057a.add(new C5183j(mo35563a(bArr, i)));
            }
            this.f28060o += this.f28061p;
            this.f28061p = 0;
        }

        /* renamed from: d */
        public synchronized void mo35566d() {
            this.f28057a.clear();
            this.f28060o = 0;
            this.f28061p = 0;
        }

        /* renamed from: g */
        public synchronized int mo35567g() {
            return this.f28060o + this.f28061p;
        }

        /* renamed from: h */
        public synchronized C5173er mo35568h() {
            mo35565c();
            return C5173er.m47125n(this.f28057a);
        }

        /* renamed from: l */
        public void mo35569l(OutputStream outputStream) throws IOException {
            C5173er[] erVarArr;
            byte[] bArr;
            int i;
            synchronized (this) {
                ArrayList<C5173er> arrayList = this.f28057a;
                erVarArr = (C5173er[]) arrayList.toArray(new C5173er[arrayList.size()]);
                bArr = this.f28058a;
                i = this.f28061p;
            }
            for (C5173er t0 : erVarArr) {
                t0.mo34550t0(outputStream);
            }
            outputStream.write(mo35563a(bArr, i));
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo35567g())});
        }

        public synchronized void write(int i) {
            if (this.f28061p == this.f28058a.length) {
                mo35564b(1);
            }
            byte[] bArr = this.f28058a;
            int i2 = this.f28061p;
            this.f28061p = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.f28058a;
            int length = bArr2.length;
            int i3 = this.f28061p;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f28061p += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                mo35564b(i4);
                System.arraycopy(bArr, i + length2, this.f28058a, 0, i4);
                this.f28061p = i4;
            }
        }
    }

    /* renamed from: com.onedelhi.secure.er$l */
    public static final class C5185l implements C5179f {
        public C5185l() {
        }

        public /* synthetic */ C5185l(C5174a aVar) {
            this();
        }

        /* renamed from: a */
        public byte[] mo35556a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    /* renamed from: J */
    public static C5181h m47113J(int i) {
        return new C5181h(i, (C5174a) null);
    }

    /* renamed from: O */
    public static C5184k m47114O() {
        return new C5184k(128);
    }

    /* renamed from: P */
    public static C5184k m47115P(int i) {
        return new C5184k(i);
    }

    /* renamed from: T */
    public static C5173er m47116T(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == 0) {
            return null;
        }
        return m47135v(bArr, 0, i2);
    }

    /* renamed from: U */
    public static C5173er m47117U(InputStream inputStream) throws IOException {
        return m47119W(inputStream, 256, 8192);
    }

    /* renamed from: V */
    public static C5173er m47118V(InputStream inputStream, int i) throws IOException {
        return m47119W(inputStream, i, i);
    }

    /* renamed from: W */
    public static C5173er m47119W(InputStream inputStream, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            C5173er T = m47116T(inputStream, i);
            if (T == null) {
                return m47125n(arrayList);
            }
            arrayList.add(T);
            i = Math.min(i * 2, i2);
        }
    }

    /* renamed from: f0 */
    public static int m47121f0(byte b) {
        return b & 255;
    }

    /* renamed from: g */
    public static C5173er m47122g(Iterator<C5173er> it, int i) {
        if (i < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return it.next();
        } else {
            int i2 = i >>> 1;
            return m47122g(it, i2).mo35544l(m47122g(it, i - i2));
        }
    }

    /* renamed from: j */
    public static void m47123j(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* renamed from: k */
    public static int m47124k(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    /* renamed from: n */
    public static C5173er m47125n(Iterable<C5173er> iterable) {
        int i;
        if (!(iterable instanceof Collection)) {
            i = 0;
            Iterator<C5173er> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                i++;
            }
        } else {
            i = ((Collection) iterable).size();
        }
        return i == 0 ? f28039a : m47122g(iterable.iterator(), i);
    }

    /* renamed from: n0 */
    public static Comparator<C5173er> m47126n0() {
        return f28040a;
    }

    /* renamed from: o */
    public static C5173er m47127o(String str, String str2) throws UnsupportedEncodingException {
        return new C5183j(str.getBytes(str2));
    }

    /* renamed from: o0 */
    public static C5173er m47128o0(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new wq2(byteBuffer);
        }
        return m47131r0(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    /* renamed from: p0 */
    public static C5173er m47129p0(byte[] bArr) {
        return new C5183j(bArr);
    }

    /* renamed from: r */
    public static C5173er m47130r(String str, Charset charset) {
        return new C5183j(str.getBytes(charset));
    }

    /* renamed from: r0 */
    public static C5173er m47131r0(byte[] bArr, int i, int i2) {
        return new C5178e(bArr, i, i2);
    }

    /* renamed from: s */
    public static C5173er m47132s(ByteBuffer byteBuffer) {
        return m47133t(byteBuffer, byteBuffer.remaining());
    }

    /* renamed from: t */
    public static C5173er m47133t(ByteBuffer byteBuffer, int i) {
        m47124k(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new C5183j(bArr);
    }

    /* renamed from: u */
    public static C5173er m47134u(byte[] bArr) {
        return m47135v(bArr, 0, bArr.length);
    }

    /* renamed from: v */
    public static C5173er m47135v(byte[] bArr, int i, int i2) {
        m47124k(i, i + i2, bArr.length);
        return new C5183j(f28038a.mo35556a(bArr, i, i2));
    }

    /* renamed from: w */
    public static C5173er m47136w(String str) {
        return new C5183j(str.getBytes(vs1.f36665a));
    }

    /* renamed from: A */
    public abstract void mo34528A(byte[] bArr, int i, int i2, int i3);

    /* renamed from: B */
    public final boolean mo35534B(C5173er erVar) {
        return size() >= erVar.size() && mo35537a0(size() - erVar.size()).equals(erVar);
    }

    /* renamed from: C */
    public abstract int mo34529C();

    /* renamed from: D */
    public abstract byte mo34530D(int i);

    /* renamed from: F */
    public abstract boolean mo34532F();

    /* renamed from: G */
    public abstract boolean mo34533G();

    /* renamed from: I */
    public C5180g iterator() {
        return new C5174a();
    }

    /* renamed from: L */
    public abstract g00 mo34537L();

    /* renamed from: N */
    public abstract InputStream mo34538N();

    /* renamed from: Q */
    public abstract int mo34539Q(int i, int i2, int i3);

    /* renamed from: R */
    public abstract int mo34540R(int i, int i2, int i3);

    /* renamed from: S */
    public final int mo35535S() {
        return this.f28045n;
    }

    /* renamed from: Z */
    public final boolean mo35536Z(C5173er erVar) {
        return size() >= erVar.size() && mo34541b0(0, erVar.size()).equals(erVar);
    }

    /* renamed from: a0 */
    public final C5173er mo35537a0(int i) {
        return mo34541b0(i, size());
    }

    /* renamed from: b0 */
    public abstract C5173er mo34541b0(int i, int i2);

    /* renamed from: d0 */
    public final byte[] mo35538d0() {
        int size = size();
        if (size == 0) {
            return vs1.f36666a;
        }
        byte[] bArr = new byte[size];
        mo34528A(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: e */
    public abstract ByteBuffer mo34542e();

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract List<ByteBuffer> mo34544f();

    /* renamed from: g0 */
    public final String mo35539g0(String str) throws UnsupportedEncodingException {
        try {
            return mo35540h0(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    /* renamed from: h0 */
    public final String mo35540h0(Charset charset) {
        return size() == 0 ? "" : mo34546i0(charset);
    }

    public final int hashCode() {
        int i = this.f28045n;
        if (i == 0) {
            int size = size();
            i = mo34539Q(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f28045n = i;
        }
        return i;
    }

    /* renamed from: i */
    public abstract byte mo34545i(int i);

    /* renamed from: i0 */
    public abstract String mo34546i0(Charset charset);

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: k0 */
    public final String mo35543k0() {
        return mo35540h0(vs1.f36665a);
    }

    /* renamed from: l */
    public final C5173er mo35544l(C5173er erVar) {
        if (Integer.MAX_VALUE - size() >= erVar.size()) {
            return dn3.m45411A0(this, erVar);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + C3516si.f20377b + erVar.size());
    }

    /* renamed from: m0 */
    public final String mo35545m0() {
        if (size() <= 50) {
            return ab4.m37780a(this);
        }
        return ab4.m37780a(mo34541b0(0, 47)) + "...";
    }

    /* renamed from: s0 */
    public abstract void mo34548s0(C4589ar arVar) throws IOException;

    public abstract int size();

    /* renamed from: t0 */
    public abstract void mo34550t0(OutputStream outputStream) throws IOException;

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), mo35545m0()});
    }

    /* renamed from: v0 */
    public final void mo35547v0(OutputStream outputStream, int i, int i2) throws IOException {
        m47124k(i, i + i2, size());
        if (i2 > 0) {
            mo34551w0(outputStream, i, i2);
        }
    }

    /* renamed from: w0 */
    public abstract void mo34551w0(OutputStream outputStream, int i, int i2) throws IOException;

    /* renamed from: x */
    public abstract void mo34552x(ByteBuffer byteBuffer);

    /* renamed from: x0 */
    public abstract void mo34553x0(C4589ar arVar) throws IOException;

    /* renamed from: y */
    public void mo35548y(byte[] bArr, int i) {
        mo35549z(bArr, 0, i, size());
    }

    @Deprecated
    /* renamed from: z */
    public final void mo35549z(byte[] bArr, int i, int i2, int i3) {
        m47124k(i, i + i3, size());
        m47124k(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            mo34528A(bArr, i, i2, i3);
        }
    }
}
