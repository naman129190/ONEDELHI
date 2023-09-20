package com.onedelhi.secure;

import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.ak4;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u000e\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J \u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0018\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J(\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u001bH\u0016J \u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0016J\u0010\u0010\b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u001eH\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001fH\u0016J\u0018\u0010!\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010#\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\fH\u0016J\u0010\u0010$\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010%\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010'\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\fH\u0016J\u0010\u0010(\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\fH\u0016J\u0010\u0010)\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0005H\u0016J\u0010\u0010*\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0005H\u0016J\u0010\u0010+\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0005H\u0016J\u0010\u0010,\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0001H\u0016J\b\u0010.\u001a\u00020\u0001H\u0016J\b\u00100\u001a\u00020/H\u0016J\b\u00101\u001a\u00020\u0007H\u0016J\b\u00103\u001a\u000202H\u0016J\b\u00104\u001a\u00020\u0007H\u0016J\b\u00106\u001a\u000205H\u0016J\b\u00107\u001a\u00020\u000fH\u0016R\u001b\u0010<\u001a\u00020\u00028Ö\u0002X\u0004¢\u0006\f\u0012\u0004\b:\u0010;\u001a\u0004\b8\u00109¨\u0006A"}, d2 = {"Lcom/onedelhi/secure/zf3;", "Lcom/onedelhi/secure/so;", "Lcom/onedelhi/secure/no;", "f", "source", "", "byteCount", "Lcom/onedelhi/secure/un4;", "write", "Lcom/onedelhi/secure/fr;", "byteString", "s", "", "offset", "u", "", "string", "n", "beginIndex", "endIndex", "W0", "codePoint", "k2", "Ljava/nio/charset/Charset;", "charset", "z", "J2", "", "D2", "h0", "Ljava/nio/ByteBuffer;", "Lcom/onedelhi/secure/x04;", "N", "R1", "b", "L0", "V", "u1", "i", "w0", "h2", "v", "B0", "S1", "e1", "y2", "C", "Ljava/io/OutputStream;", "F", "flush", "", "isOpen", "close", "Lcom/onedelhi/secure/me4;", "timeout", "toString", "e", "()Lcom/onedelhi/secure/no;", "getBuffer$annotations", "()V", "buffer", "Lcom/onedelhi/secure/oz3;", "sink", "<init>", "(Lcom/onedelhi/secure/oz3;)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class zf3 implements C6785so {
    @rw1
    @vr2

    /* renamed from: a */
    public final C6205no f38327a = new C6205no();
    @rw1
    @vr2

    /* renamed from: a */
    public final oz3 f38328a;
    @rw1

    /* renamed from: b */
    public boolean f38329b;

    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"com/onedelhi/secure/zf3$a", "Ljava/io/OutputStream;", "", "b", "Lcom/onedelhi/secure/un4;", "write", "", "data", "offset", "byteCount", "flush", "close", "", "toString", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.zf3$a */
    public static final class C7489a extends OutputStream {

        /* renamed from: a */
        public final /* synthetic */ zf3 f38330a;

        public C7489a(zf3 zf3) {
            this.f38330a = zf3;
        }

        public void close() {
            this.f38330a.close();
        }

        public void flush() {
            zf3 zf3 = this.f38330a;
            if (!zf3.f38329b) {
                zf3.flush();
            }
        }

        @vr2
        public String toString() {
            return this.f38330a + ".outputStream()";
        }

        public void write(int i) {
            zf3 zf3 = this.f38330a;
            if (!zf3.f38329b) {
                zf3.f38327a.mo41230L0((byte) i);
                this.f38330a.mo41296y2();
                return;
            }
            throw new IOException("closed");
        }

        public void write(@vr2 byte[] bArr, int i, int i2) {
            jt1.m53777p(bArr, C4311b.C4317f.C4318a.f25149a);
            zf3 zf3 = this.f38330a;
            if (!zf3.f38329b) {
                zf3.f38327a.mo41266h0(bArr, i, i2);
                this.f38330a.mo41296y2();
                return;
            }
            throw new IOException("closed");
        }
    }

    public zf3(@vr2 oz3 oz3) {
        jt1.m53777p(oz3, "sink");
        this.f38328a = oz3;
    }

    /* renamed from: a */
    public static /* synthetic */ void m73166a() {
    }

    @vr2
    /* renamed from: B0 */
    public C6785so mo41215B0(long j) {
        if (!this.f38329b) {
            this.f38327a.mo41215B0(j);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: C */
    public C6785so mo41217C() {
        if (!this.f38329b) {
            long V0 = this.f38327a.mo41244V0();
            if (V0 > 0) {
                this.f38328a.write(this.f38327a, V0);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: D2 */
    public C6785so mo41221D2(@vr2 byte[] bArr) {
        jt1.m53777p(bArr, "source");
        if (!this.f38329b) {
            this.f38327a.mo41221D2(bArr);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: F */
    public OutputStream mo41223F() {
        return new C7489a(this);
    }

    @vr2
    /* renamed from: J2 */
    public C6785so mo41229J2(@vr2 String str, int i, int i2, @vr2 Charset charset) {
        jt1.m53777p(str, ak4.C1709b.f9167e);
        jt1.m53777p(charset, "charset");
        if (!this.f38329b) {
            this.f38327a.mo41229J2(str, i, i2, charset);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: L0 */
    public C6785so mo41230L0(int i) {
        if (!this.f38329b) {
            this.f38327a.mo41230L0(i);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: N */
    public long mo41235N(@vr2 x04 x04) {
        jt1.m53777p(x04, "source");
        long j = 0;
        while (true) {
            long read = x04.read(this.f38327a, (long) 8192);
            if (read == -1) {
                return j;
            }
            j += read;
            mo41296y2();
        }
    }

    @vr2
    /* renamed from: R1 */
    public C6785so mo41240R1(@vr2 x04 x04, long j) {
        jt1.m53777p(x04, "source");
        while (j > 0) {
            long read = x04.read(this.f38327a, j);
            if (read != -1) {
                j -= read;
                mo41296y2();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    @vr2
    /* renamed from: S1 */
    public C6785so mo41242S1(long j) {
        if (!this.f38329b) {
            this.f38327a.mo41242S1(j);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: V */
    public C6785so mo41243V(int i) {
        if (!this.f38329b) {
            this.f38327a.mo41243V(i);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: W0 */
    public C6785so mo41246W0(@vr2 String str, int i, int i2) {
        jt1.m53777p(str, ak4.C1709b.f9167e);
        if (!this.f38329b) {
            this.f38327a.mo41246W0(str, i, i2);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }

    public void close() {
        if (!this.f38329b) {
            Throwable th = null;
            try {
                if (this.f38327a.mo41244V0() > 0) {
                    oz3 oz3 = this.f38328a;
                    C6205no noVar = this.f38327a;
                    oz3.write(noVar, noVar.mo41244V0());
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f38328a.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f38329b = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @vr2
    /* renamed from: e */
    public C6205no mo31682e() {
        return this.f38327a;
    }

    @vr2
    /* renamed from: e1 */
    public C6785so mo41261e1(long j) {
        if (!this.f38329b) {
            this.f38327a.mo41261e1(j);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: f */
    public C6205no mo31684f() {
        return this.f38327a;
    }

    public void flush() {
        if (!this.f38329b) {
            if (this.f38327a.mo41244V0() > 0) {
                oz3 oz3 = this.f38328a;
                C6205no noVar = this.f38327a;
                oz3.write(noVar, noVar.mo41244V0());
            }
            this.f38328a.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: h0 */
    public C6785so mo41266h0(@vr2 byte[] bArr, int i, int i2) {
        jt1.m53777p(bArr, "source");
        if (!this.f38329b) {
            this.f38327a.mo41266h0(bArr, i, i2);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: h2 */
    public C6785so mo41268h2(int i) {
        if (!this.f38329b) {
            this.f38327a.mo41268h2(i);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f38329b;
    }

    @vr2
    /* renamed from: k2 */
    public C6785so mo41274k2(int i) {
        if (!this.f38329b) {
            this.f38327a.mo41274k2(i);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: n */
    public C6785so mo41279n(@vr2 String str) {
        jt1.m53777p(str, ak4.C1709b.f9167e);
        if (!this.f38329b) {
            this.f38327a.mo41279n(str);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: s */
    public C6785so mo41287s(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "byteString");
        if (!this.f38329b) {
            this.f38327a.mo41287s(frVar);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    public me4 timeout() {
        return this.f38328a.timeout();
    }

    @vr2
    public String toString() {
        return "buffer(" + this.f38328a + ')';
    }

    @vr2
    /* renamed from: u */
    public C6785so mo41290u(@vr2 C5301fr frVar, int i, int i2) {
        jt1.m53777p(frVar, "byteString");
        if (!this.f38329b) {
            this.f38327a.mo41290u(frVar, i, i2);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: u1 */
    public C6785so mo41291u1(int i) {
        if (!this.f38329b) {
            this.f38327a.mo41291u1(i);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: v */
    public C6785so mo41292v(long j) {
        if (!this.f38329b) {
            this.f38327a.mo41292v(j);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: w0 */
    public C6785so mo41293w0(int i) {
        if (!this.f38329b) {
            this.f38327a.mo41293w0(i);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }

    public int write(@vr2 ByteBuffer byteBuffer) {
        jt1.m53777p(byteBuffer, "source");
        if (!this.f38329b) {
            int write = this.f38327a.write(byteBuffer);
            mo41296y2();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public void write(@vr2 C6205no noVar, long j) {
        jt1.m53777p(noVar, "source");
        if (!this.f38329b) {
            this.f38327a.write(noVar, j);
            mo41296y2();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: y2 */
    public C6785so mo41296y2() {
        if (!this.f38329b) {
            long g = this.f38327a.mo41264g();
            if (g > 0) {
                this.f38328a.write(this.f38327a, g);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: z */
    public C6785so mo41297z(@vr2 String str, @vr2 Charset charset) {
        jt1.m53777p(str, ak4.C1709b.f9167e);
        jt1.m53777p(charset, "charset");
        if (!this.f38329b) {
            this.f38327a.mo41297z(str, charset);
            return mo41296y2();
        }
        throw new IllegalStateException("closed".toString());
    }
}
