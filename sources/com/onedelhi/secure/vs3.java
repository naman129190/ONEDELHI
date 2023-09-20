package com.onedelhi.secure;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class vs3 extends us3 {

    /* renamed from: e */
    public static final /* synthetic */ boolean f36680e = false;

    /* renamed from: a */
    public final C4477aa f36681a;

    /* renamed from: a */
    public C5853jx f36682a;

    /* renamed from: a */
    public us3 f36683a;

    /* renamed from: a */
    public final C7271xm f36684a;

    /* renamed from: a */
    public C7375ym f36685a;

    /* renamed from: a */
    public IOException f36686a;

    /* renamed from: a */
    public final ArrayList<xp1> f36687a;

    /* renamed from: a */
    public final byte[] f36688a;

    /* renamed from: b */
    public long f36689b;

    /* renamed from: b */
    public final C7271xm f36690b;

    /* renamed from: b */
    public final boolean f36691b;

    /* renamed from: c */
    public long f36692c;

    /* renamed from: c */
    public boolean f36693c;

    /* renamed from: d */
    public long f36694d;

    /* renamed from: d */
    public boolean f36695d;

    /* renamed from: e */
    public long f36696e;

    /* renamed from: n */
    public final int f36697n;

    /* renamed from: o */
    public int f36698o;

    /* renamed from: p */
    public int f36699p;

    /* renamed from: q */
    public int f36700q;

    static {
        Class<vs3> cls = vs3.class;
    }

    public vs3(us3 us3) throws IOException {
        this(us3, -1);
    }

    public vs3(us3 us3, int i) throws IOException {
        this(us3, i, true);
    }

    public vs3(us3 us3, int i, C4477aa aaVar) throws IOException {
        this(us3, i, true, aaVar);
    }

    public vs3(us3 us3, int i, boolean z) throws IOException {
        this(us3, i, z, C4477aa.m36107b());
    }

    public vs3(us3 us3, int i, boolean z, C4477aa aaVar) throws IOException {
        us3 us32 = us3;
        this.f36698o = 0;
        this.f36687a = new ArrayList<>();
        this.f36699p = 0;
        long j = 0;
        this.f36689b = 0;
        this.f36692c = 0;
        this.f36700q = 0;
        this.f36685a = null;
        this.f36694d = 0;
        this.f36693c = false;
        this.f36695d = false;
        this.f36686a = null;
        int i2 = 1;
        this.f36688a = new byte[1];
        this.f36681a = aaVar;
        this.f36691b = z;
        this.f36683a = us32;
        DataInputStream dataInputStream = new DataInputStream(us32);
        us32.mo45290c(0);
        byte[] bArr = zy4.f38504a;
        byte[] bArr2 = new byte[bArr.length];
        dataInputStream.readFully(bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            long a = us3.mo45288a();
            if ((3 & a) == 0) {
                byte[] bArr3 = new byte[12];
                int i3 = i;
                while (true) {
                    long j2 = j;
                    while (a > j) {
                        if (a >= 12) {
                            long j3 = a - 12;
                            us32.mo45290c(j3);
                            dataInputStream.readFully(bArr3);
                            if (bArr3[8] == 0 && bArr3[9] == 0 && bArr3[10] == 0 && bArr3[11] == 0) {
                                j2 += 4;
                                a -= 4;
                                j = 0;
                            } else {
                                h44 d = jg0.m53342d(bArr3);
                                if (d.f29454a < j3) {
                                    this.f36682a = C5853jx.m53873b(d.f29453a);
                                    this.f36699p |= i2 << d.f29453a;
                                    us32.mo45290c(j3 - d.f29454a);
                                    try {
                                        xp1 xp1 = r2;
                                        h44 h44 = d;
                                        xp1 xp12 = new xp1(us3, d, j2, i3);
                                        this.f36698o += xp1.mo47377g();
                                        i3 = i3 >= 0 ? i3 - xp1.mo47377g() : i3;
                                        if (this.f36692c < xp1.mo47376f()) {
                                            this.f36692c = xp1.mo47376f();
                                        }
                                        long d2 = xp1.mo46816d() - 12;
                                        if (j3 >= d2) {
                                            a = j3 - d2;
                                            us32.mo45290c(a);
                                            dataInputStream.readFully(bArr3);
                                            if (jg0.m53340b(jg0.m53343e(bArr3), h44)) {
                                                long j4 = this.f36689b + xp1.mo47380j();
                                                this.f36689b = j4;
                                                if (j4 >= 0) {
                                                    int h = this.f36700q + xp1.mo47378h();
                                                    this.f36700q = h;
                                                    if (h >= 0) {
                                                        this.f36687a.add(xp1);
                                                        j = 0;
                                                        i2 = 1;
                                                    } else {
                                                        throw new no4("XZ file has over 2147483647 Blocks");
                                                    }
                                                } else {
                                                    throw new no4("XZ file is too big");
                                                }
                                            } else {
                                                throw new s90("XZ Stream Footer does not match Stream Header");
                                            }
                                        } else {
                                            throw new s90("XZ Index indicates too big compressed size for the XZ Stream");
                                        }
                                    } catch (xg2 e) {
                                        int b = e.mo47177b();
                                        int i4 = this.f36698o;
                                        throw new xg2(b + i4, i3 + i4);
                                    }
                                } else {
                                    throw new s90("Backward Size in XZ Stream Footer is too big");
                                }
                            }
                        } else {
                            throw new s90();
                        }
                    }
                    this.f36697n = i3;
                    ArrayList<xp1> arrayList = this.f36687a;
                    xp1 xp13 = arrayList.get(arrayList.size() - 1);
                    int size = this.f36687a.size() - 2;
                    while (size >= 0) {
                        xp1 xp14 = this.f36687a.get(size);
                        xp14.mo47385o(xp13);
                        size--;
                        xp13 = xp14;
                    }
                    ArrayList<xp1> arrayList2 = this.f36687a;
                    xp1 xp15 = arrayList2.get(arrayList2.size() - 1);
                    this.f36684a = new C7271xm(xp15);
                    this.f36690b = new C7271xm(xp15);
                    return;
                }
            }
            throw new s90("XZ file size is not a multiple of 4 bytes");
        }
        throw new az4();
    }

    public vs3(us3 us3, C4477aa aaVar) throws IOException {
        this(us3, -1, aaVar);
    }

    /* renamed from: A */
    public long mo46347A(int i) {
        mo46353Y(this.f36690b, i);
        return this.f36690b.f37542d;
    }

    /* renamed from: E */
    public int mo46348E() {
        return this.f36699p;
    }

    /* renamed from: H */
    public int mo46349H() {
        return this.f36698o;
    }

    /* renamed from: K */
    public long mo46350K() {
        return this.f36692c;
    }

    /* renamed from: M */
    public int mo46351M() {
        return this.f36687a.size();
    }

    /* renamed from: X */
    public final void mo46352X() throws IOException {
        try {
            C7375ym ymVar = this.f36685a;
            if (ymVar != null) {
                ymVar.close();
                this.f36685a = null;
            }
            us3 us3 = this.f36683a;
            C5853jx jxVar = this.f36682a;
            boolean z = this.f36691b;
            int i = this.f36697n;
            C7271xm xmVar = this.f36684a;
            this.f36685a = new C7375ym(us3, jxVar, z, i, xmVar.f37541c, xmVar.f37542d, this.f36681a);
        } catch (xg2 e) {
            int b = e.mo47177b();
            int i2 = this.f36698o;
            throw new xg2(b + i2, this.f36697n + i2);
        } catch (aq1 unused) {
            throw new s90();
        }
    }

    /* renamed from: Y */
    public final void mo46353Y(C7271xm xmVar, int i) {
        if (i < 0 || i >= this.f36700q) {
            throw new IndexOutOfBoundsException("Invalid XZ Block number: " + i);
        } else if (xmVar.f37537a != i) {
            int i2 = 0;
            while (true) {
                xp1 xp1 = this.f36687a.get(i2);
                if (xp1.mo47381k(i)) {
                    xp1.mo47384n(xmVar, i);
                    return;
                }
                i2++;
            }
        }
    }

    /* renamed from: Z */
    public final void mo46354Z(C7271xm xmVar, long j) {
        if (j < 0 || j >= this.f36689b) {
            throw new IndexOutOfBoundsException("Invalid uncompressed position: " + j);
        }
        int i = 0;
        while (true) {
            xp1 xp1 = this.f36687a.get(i);
            if (xp1.mo47382l(j)) {
                xp1.mo47383m(xmVar, j);
                return;
            }
            i++;
        }
    }

    /* renamed from: a */
    public long mo45288a() {
        return this.f36689b;
    }

    public int available() throws IOException {
        C7375ym ymVar;
        if (this.f36683a != null) {
            IOException iOException = this.f36686a;
            if (iOException != null) {
                throw iOException;
            } else if (this.f36695d || this.f36693c || (ymVar = this.f36685a) == null) {
                return 0;
            } else {
                return ymVar.available();
            }
        } else {
            throw new bz4("Stream closed");
        }
    }

    /* renamed from: b */
    public long mo45289b() throws IOException {
        if (this.f36683a != null) {
            return this.f36693c ? this.f36696e : this.f36694d;
        }
        throw new bz4("Stream closed");
    }

    /* renamed from: c */
    public void mo45290c(long j) throws IOException {
        if (this.f36683a == null) {
            throw new bz4("Stream closed");
        } else if (j >= 0) {
            this.f36696e = j;
            this.f36693c = true;
        } else {
            throw new bz4("Negative seek position: " + j);
        }
    }

    /* renamed from: c0 */
    public final void mo46356c0() throws IOException {
        if (!this.f36693c) {
            if (this.f36684a.mo47356b()) {
                this.f36684a.mo47357c();
                mo46352X();
                return;
            }
            this.f36696e = this.f36694d;
        }
        this.f36693c = false;
        long j = this.f36696e;
        if (j >= this.f36689b) {
            this.f36694d = j;
            C7375ym ymVar = this.f36685a;
            if (ymVar != null) {
                ymVar.close();
                this.f36685a = null;
            }
            this.f36695d = true;
            return;
        }
        this.f36695d = false;
        mo46354Z(this.f36684a, j);
        long j2 = this.f36694d;
        C7271xm xmVar = this.f36684a;
        if (j2 <= xmVar.f37540b || j2 > this.f36696e) {
            this.f36683a.mo45290c(xmVar.f37538a);
            this.f36682a = C5853jx.m53873b(this.f36684a.mo47355a());
            mo46352X();
            this.f36694d = this.f36684a.f37540b;
        }
        long j3 = this.f36696e;
        long j4 = this.f36694d;
        if (j3 > j4) {
            long j5 = j3 - j4;
            if (this.f36685a.skip(j5) == j5) {
                this.f36694d = this.f36696e;
                return;
            }
            throw new s90();
        }
    }

    public void close() throws IOException {
        mo46358d(true);
    }

    /* renamed from: d */
    public void mo46358d(boolean z) throws IOException {
        if (this.f36683a != null) {
            C7375ym ymVar = this.f36685a;
            if (ymVar != null) {
                ymVar.close();
                this.f36685a = null;
            }
            if (z) {
                try {
                    this.f36683a.close();
                } catch (Throwable th) {
                    this.f36683a = null;
                    throw th;
                }
            }
            this.f36683a = null;
        }
    }

    /* renamed from: e0 */
    public void mo46359e0(int i) throws IOException {
        if (this.f36683a == null) {
            throw new bz4("Stream closed");
        } else if (i < 0 || i >= this.f36700q) {
            throw new bz4("Invalid XZ Block number: " + i);
        } else {
            this.f36696e = mo46365q(i);
            this.f36693c = true;
        }
    }

    /* renamed from: g */
    public int mo46360g(int i) {
        mo46353Y(this.f36690b, i);
        return this.f36690b.mo47355a();
    }

    /* renamed from: h */
    public long mo46361h(int i) {
        mo46353Y(this.f36690b, i);
        return this.f36690b.f37538a;
    }

    /* renamed from: l */
    public long mo46362l(int i) {
        mo46353Y(this.f36690b, i);
        return (this.f36690b.f37541c + 3) & -4;
    }

    /* renamed from: m */
    public int mo46363m() {
        return this.f36700q;
    }

    /* renamed from: p */
    public int mo46364p(long j) {
        mo46354Z(this.f36690b, j);
        return this.f36690b.f37537a;
    }

    /* renamed from: q */
    public long mo46365q(int i) {
        mo46353Y(this.f36690b, i);
        return this.f36690b.f37540b;
    }

    public int read() throws IOException {
        if (read(this.f36688a, 0, 1) == -1) {
            return -1;
        }
        return this.f36688a[0] & 255;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f36683a != null) {
            IOException iOException = this.f36686a;
            if (iOException == null) {
                try {
                    if (this.f36693c) {
                        mo46356c0();
                    }
                    if (this.f36695d) {
                        return -1;
                    }
                    while (true) {
                        if (i2 <= 0) {
                            break;
                        }
                        if (this.f36685a == null) {
                            mo46356c0();
                            if (this.f36695d) {
                                break;
                            }
                        }
                        int read = this.f36685a.read(bArr, i, i2);
                        if (read > 0) {
                            this.f36694d += (long) read;
                            i4 += read;
                            i += read;
                            i2 -= read;
                        } else if (read == -1) {
                            this.f36685a = null;
                        }
                    }
                    return i4;
                } catch (IOException e) {
                    e = e;
                    if (e instanceof EOFException) {
                        e = new s90();
                    }
                    this.f36686a = e;
                    if (0 == 0) {
                        throw e;
                    }
                }
            } else {
                throw iOException;
            }
        } else {
            throw new bz4("Stream closed");
        }
    }
}
