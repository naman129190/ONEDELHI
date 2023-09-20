package com.onedelhi.secure;

import com.google.firebase.messaging.C4311b;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\bS\u0010TJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0016H\u0016J \u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014H\u0016J\u0010\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010%\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"H\u0016J\n\u0010&\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010'\u001a\u00020\u001fH\u0016J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0005H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010,\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020+H\u0016J\b\u0010.\u001a\u00020\u0014H\u0016J\b\u0010/\u001a\u00020\u0014H\u0016J\b\u00100\u001a\u00020\u0005H\u0016J\b\u00101\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020\u0005H\u0016J\b\u00103\u001a\u00020\u0005H\u0016J\u0010\u00104\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u00106\u001a\u00020\u00052\u0006\u00105\u001a\u00020\rH\u0016J\u0018\u00108\u001a\u00020\u00052\u0006\u00105\u001a\u00020\r2\u0006\u00107\u001a\u00020\u0005H\u0016J \u0010:\u001a\u00020\u00052\u0006\u00105\u001a\u00020\r2\u0006\u00107\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0016J\u0010\u0010<\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u000fH\u0016J\u0018\u0010=\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0005H\u0016J\u0010\u0010?\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u000fH\u0016J\u0018\u0010@\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0005H\u0016J\u0018\u0010A\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u000fH\u0016J(\u0010C\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014H\u0016J\b\u0010D\u001a\u00020\u0001H\u0016J\b\u0010F\u001a\u00020EH\u0016J\b\u0010G\u001a\u00020\bH\u0016J\b\u0010H\u001a\u00020\nH\u0016J\b\u0010J\u001a\u00020IH\u0016J\b\u0010K\u001a\u00020\u001fH\u0016R\u001b\u0010P\u001a\u00020\u00028Ö\u0002X\u0004¢\u0006\f\u0012\u0004\bN\u0010O\u001a\u0004\bL\u0010M¨\u0006U"}, d2 = {"Lcom/onedelhi/secure/bg3;", "Lcom/onedelhi/secure/to;", "Lcom/onedelhi/secure/no;", "f", "sink", "", "byteCount", "read", "", "f2", "Lcom/onedelhi/secure/un4;", "o", "T", "", "readByte", "Lcom/onedelhi/secure/fr;", "r0", "I", "Lcom/onedelhi/secure/yw2;", "options", "", "m0", "", "u2", "k1", "readFully", "offset", "Ljava/nio/ByteBuffer;", "e2", "Lcom/onedelhi/secure/oz3;", "B", "", "j", "r1", "Ljava/nio/charset/Charset;", "charset", "H2", "z2", "K0", "r2", "limit", "X0", "D0", "", "readShort", "t1", "readInt", "n1", "readLong", "Y1", "b0", "s2", "F1", "b", "i", "fromIndex", "I0", "toIndex", "s0", "bytes", "N1", "a0", "targetBytes", "q1", "k", "O", "bytesOffset", "k0", "t", "Ljava/io/InputStream;", "r", "isOpen", "close", "Lcom/onedelhi/secure/me4;", "timeout", "toString", "e", "()Lcom/onedelhi/secure/no;", "getBuffer$annotations", "()V", "buffer", "Lcom/onedelhi/secure/x04;", "source", "<init>", "(Lcom/onedelhi/secure/x04;)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class bg3 implements C6893to {
    @rw1
    @vr2

    /* renamed from: a */
    public final C6205no f26339a = new C6205no();
    @rw1
    @vr2

    /* renamed from: a */
    public final x04 f26340a;
    @rw1

    /* renamed from: b */
    public boolean f26341b;

    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"com/onedelhi/secure/bg3$a", "Ljava/io/InputStream;", "", "read", "", "data", "offset", "byteCount", "available", "Lcom/onedelhi/secure/un4;", "close", "", "toString", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.bg3$a */
    public static final class C4672a extends InputStream {

        /* renamed from: a */
        public final /* synthetic */ bg3 f26342a;

        public C4672a(bg3 bg3) {
            this.f26342a = bg3;
        }

        public int available() {
            bg3 bg3 = this.f26342a;
            if (!bg3.f26341b) {
                return (int) Math.min(bg3.f26339a.mo41244V0(), (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f26342a.close();
        }

        public int read() {
            bg3 bg3 = this.f26342a;
            if (!bg3.f26341b) {
                if (bg3.f26339a.mo41244V0() == 0) {
                    bg3 bg32 = this.f26342a;
                    if (bg32.f26340a.read(bg32.f26339a, (long) 8192) == -1) {
                        return -1;
                    }
                }
                return this.f26342a.f26339a.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public int read(@vr2 byte[] bArr, int i, int i2) {
            jt1.m53777p(bArr, C4311b.C4317f.C4318a.f25149a);
            if (!this.f26342a.f26341b) {
                C5950l.m55169e((long) bArr.length, (long) i, (long) i2);
                if (this.f26342a.f26339a.mo41244V0() == 0) {
                    bg3 bg3 = this.f26342a;
                    if (bg3.f26340a.read(bg3.f26339a, (long) 8192) == -1) {
                        return -1;
                    }
                }
                return this.f26342a.f26339a.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }

        @vr2
        public String toString() {
            return this.f26342a + ".inputStream()";
        }
    }

    public bg3(@vr2 x04 x04) {
        jt1.m53777p(x04, "source");
        this.f26340a = x04;
    }

    /* renamed from: a */
    public static /* synthetic */ void m39822a() {
    }

    /* renamed from: B */
    public long mo31668B(@vr2 oz3 oz3) {
        C6205no noVar;
        jt1.m53777p(oz3, "sink");
        long j = 0;
        while (true) {
            int i = (this.f26340a.read(this.f26339a, (long) 8192) > -1 ? 1 : (this.f26340a.read(this.f26339a, (long) 8192) == -1 ? 0 : -1));
            noVar = this.f26339a;
            if (i == 0) {
                break;
            }
            long g = noVar.mo41264g();
            if (g > 0) {
                j += g;
                oz3.write(this.f26339a, g);
            }
        }
        if (noVar.mo41244V0() <= 0) {
            return j;
        }
        long V0 = j + this.f26339a.mo41244V0();
        C6205no noVar2 = this.f26339a;
        oz3.write(noVar2, noVar2.mo41244V0());
        return V0;
    }

    /* renamed from: D0 */
    public int mo31669D0() {
        long j;
        mo31694o(1);
        byte Z = this.f26339a.mo41249Z(0);
        if ((Z & 224) == 192) {
            j = 2;
        } else if ((Z & 240) == 224) {
            j = 3;
        } else {
            if ((Z & 248) == 240) {
                j = 4;
            }
            return this.f26339a.mo31669D0();
        }
        mo31694o(j);
        return this.f26339a.mo31669D0();
    }

    /* renamed from: F1 */
    public void mo31670F1(long j) {
        if (!this.f26341b) {
            while (j > 0) {
                if (this.f26339a.mo41244V0() == 0 && this.f26340a.read(this.f26339a, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f26339a.mo41244V0());
                this.f26339a.mo31670F1(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: H2 */
    public String mo31671H2(@vr2 Charset charset) {
        jt1.m53777p(charset, "charset");
        this.f26339a.mo41235N(this.f26340a);
        return this.f26339a.mo31671H2(charset);
    }

    @vr2
    /* renamed from: I */
    public C5301fr mo31672I(long j) {
        mo31694o(j);
        return this.f26339a.mo31672I(j);
    }

    /* renamed from: I0 */
    public long mo31673I0(byte b, long j) {
        return mo31708s0(b, j, Long.MAX_VALUE);
    }

    @ss2
    /* renamed from: K0 */
    public String mo31674K0() {
        long i = mo31686i((byte) 10);
        if (i != -1) {
            return C6467po.m61499b0(this.f26339a, i);
        }
        if (this.f26339a.mo41244V0() != 0) {
            return mo31698r1(this.f26339a.mo41244V0());
        }
        return null;
    }

    /* renamed from: N1 */
    public long mo31675N1(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "bytes");
        return mo31680a0(frVar, 0);
    }

    /* renamed from: O */
    public boolean mo31676O(long j, @vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "bytes");
        return mo31690k0(j, frVar, 0, frVar.mo36274j0());
    }

    /* renamed from: T */
    public boolean mo31677T(long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!this.f26341b) {
            while (this.f26339a.mo41244V0() < j) {
                if (this.f26340a.read(this.f26339a, (long) 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @vr2
    /* renamed from: X0 */
    public String mo31678X0(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long s0 = mo31708s0(b, 0, j2);
            if (s0 != -1) {
                return C6467po.m61499b0(this.f26339a, s0);
            }
            if (j2 < Long.MAX_VALUE && mo31677T(j2) && this.f26339a.mo41249Z(j2 - 1) == ((byte) 13) && mo31677T(1 + j2) && this.f26339a.mo41249Z(j2) == b) {
                return C6467po.m61499b0(this.f26339a, j2);
            }
            C6205no noVar = new C6205no();
            C6205no noVar2 = this.f26339a;
            noVar2.mo41278m(noVar, 0, Math.min((long) 32, noVar2.mo41244V0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f26339a.mo41244V0(), j) + " content=" + noVar.mo31697r0().mo31159D() + m00.f31887b);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    /* renamed from: Y1 */
    public long mo31679Y1() {
        mo31694o(8);
        return this.f26339a.mo31679Y1();
    }

    /* renamed from: a0 */
    public long mo31680a0(@vr2 C5301fr frVar, long j) {
        jt1.m53777p(frVar, "bytes");
        if (!this.f26341b) {
            while (true) {
                long a0 = this.f26339a.mo31680a0(frVar, j);
                if (a0 != -1) {
                    return a0;
                }
                long V0 = this.f26339a.mo41244V0();
                if (this.f26340a.read(this.f26339a, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (V0 - ((long) frVar.mo36274j0())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: b0 */
    public long mo31681b0() {
        int i;
        mo31694o(1);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!mo31677T(j2)) {
                break;
            }
            byte Z = this.f26339a.mo41249Z(j);
            if ((Z >= ((byte) 48) && Z <= ((byte) 57)) || (j == 0 && Z == ((byte) 45))) {
                j = j2;
            } else if (i == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9] or '-' character but was 0x");
                String num = Integer.toString(Z, C5327fx.m48539a(C5327fx.m48539a(16)));
                jt1.m53776o(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                sb.append(num);
                throw new NumberFormatException(sb.toString());
            }
        }
        return this.f26339a.mo31681b0();
    }

    public void close() {
        if (!this.f26341b) {
            this.f26341b = true;
            this.f26340a.close();
            this.f26339a.mo41255c();
        }
    }

    @vr2
    /* renamed from: e */
    public C6205no mo31682e() {
        return this.f26339a;
    }

    /* renamed from: e2 */
    public void mo31683e2(@vr2 C6205no noVar, long j) {
        jt1.m53777p(noVar, "sink");
        try {
            mo31694o(j);
            this.f26339a.mo31683e2(noVar, j);
        } catch (EOFException e) {
            noVar.mo41235N(this.f26339a);
            throw e;
        }
    }

    @vr2
    /* renamed from: f */
    public C6205no mo31684f() {
        return this.f26339a;
    }

    /* renamed from: f2 */
    public boolean mo31685f2() {
        if (!this.f26341b) {
            return this.f26339a.mo31685f2() && this.f26340a.read(this.f26339a, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: i */
    public long mo31686i(byte b) {
        return mo31708s0(b, 0, Long.MAX_VALUE);
    }

    public boolean isOpen() {
        return !this.f26341b;
    }

    @vr2
    /* renamed from: j */
    public String mo31688j() {
        this.f26339a.mo41235N(this.f26340a);
        return this.f26339a.mo31688j();
    }

    /* renamed from: k */
    public long mo31689k(@vr2 C5301fr frVar, long j) {
        jt1.m53777p(frVar, "targetBytes");
        if (!this.f26341b) {
            while (true) {
                long k = this.f26339a.mo31689k(frVar, j);
                if (k != -1) {
                    return k;
                }
                long V0 = this.f26339a.mo41244V0();
                if (this.f26340a.read(this.f26339a, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, V0);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: k0 */
    public boolean mo31690k0(long j, @vr2 C5301fr frVar, int i, int i2) {
        jt1.m53777p(frVar, "bytes");
        if (!this.f26341b) {
            if (j >= 0 && i >= 0 && i2 >= 0 && frVar.mo36274j0() - i >= i2) {
                int i3 = 0;
                while (i3 < i2) {
                    long j2 = ((long) i3) + j;
                    if (mo31677T(1 + j2) && this.f26339a.mo41249Z(j2) == frVar.mo36284y(i + i3)) {
                        i3++;
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: k1 */
    public byte[] mo31691k1(long j) {
        mo31694o(j);
        return this.f26339a.mo31691k1(j);
    }

    /* renamed from: m0 */
    public int mo31692m0(@vr2 yw2 yw2) {
        jt1.m53777p(yw2, "options");
        if (!this.f26341b) {
            while (true) {
                int d0 = C6467po.m61503d0(this.f26339a, yw2, true);
                if (d0 == -2) {
                    if (this.f26340a.read(this.f26339a, (long) 8192) == -1) {
                        break;
                    }
                } else if (d0 != -1) {
                    this.f26339a.mo31670F1((long) yw2.mo48022i()[d0].mo36274j0());
                    return d0;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: n1 */
    public int mo31693n1() {
        mo31694o(4);
        return this.f26339a.mo31693n1();
    }

    /* renamed from: o */
    public void mo31694o(long j) {
        if (!mo31677T(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: q1 */
    public long mo31695q1(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "targetBytes");
        return mo31689k(frVar, 0);
    }

    @vr2
    /* renamed from: r */
    public InputStream mo31696r() {
        return new C4672a(this);
    }

    @vr2
    /* renamed from: r0 */
    public C5301fr mo31697r0() {
        this.f26339a.mo41235N(this.f26340a);
        return this.f26339a.mo31697r0();
    }

    @vr2
    /* renamed from: r1 */
    public String mo31698r1(long j) {
        mo31694o(j);
        return this.f26339a.mo31698r1(j);
    }

    @vr2
    /* renamed from: r2 */
    public String mo31699r2() {
        return mo31678X0(Long.MAX_VALUE);
    }

    public int read(@vr2 ByteBuffer byteBuffer) {
        jt1.m53777p(byteBuffer, "sink");
        if (this.f26339a.mo41244V0() == 0 && this.f26340a.read(this.f26339a, (long) 8192) == -1) {
            return -1;
        }
        return this.f26339a.read(byteBuffer);
    }

    public int read(@vr2 byte[] bArr) {
        jt1.m53777p(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    public int read(@vr2 byte[] bArr, int i, int i2) {
        jt1.m53777p(bArr, "sink");
        long j = (long) i2;
        C5950l.m55169e((long) bArr.length, (long) i, j);
        if (this.f26339a.mo41244V0() == 0 && this.f26340a.read(this.f26339a, (long) 8192) == -1) {
            return -1;
        }
        return this.f26339a.read(bArr, i, (int) Math.min(j, this.f26339a.mo41244V0()));
    }

    public long read(@vr2 C6205no noVar, long j) {
        jt1.m53777p(noVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(true ^ this.f26341b)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f26339a.mo41244V0() == 0 && this.f26340a.read(this.f26339a, (long) 8192) == -1) {
            return -1;
        } else {
            return this.f26339a.read(noVar, Math.min(j, this.f26339a.mo41244V0()));
        }
    }

    public byte readByte() {
        mo31694o(1);
        return this.f26339a.readByte();
    }

    public void readFully(@vr2 byte[] bArr) {
        jt1.m53777p(bArr, "sink");
        try {
            mo31694o((long) bArr.length);
            this.f26339a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f26339a.mo41244V0() > 0) {
                C6205no noVar = this.f26339a;
                int read = noVar.read(bArr, i, (int) noVar.mo41244V0());
                if (read != -1) {
                    i += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    public int readInt() {
        mo31694o(4);
        return this.f26339a.readInt();
    }

    public long readLong() {
        mo31694o(8);
        return this.f26339a.readLong();
    }

    public short readShort() {
        mo31694o(2);
        return this.f26339a.readShort();
    }

    /* renamed from: s0 */
    public long mo31708s0(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f26341b) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long s0 = this.f26339a.mo31708s0(b, j, j2);
                    if (s0 != -1) {
                        return s0;
                    }
                    long V0 = this.f26339a.mo41244V0();
                    if (V0 >= j2 || this.f26340a.read(this.f26339a, (long) 8192) == -1) {
                        return -1;
                    }
                    j = Math.max(j, V0);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* renamed from: s2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo31709s2() {
        /*
            r5 = this;
            r0 = 1
            r5.mo31694o(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.mo31677T(r2)
            if (r2 == 0) goto L_0x0064
            com.onedelhi.secure.no r2 = r5.f26339a
            long r3 = (long) r0
            byte r2 = r2.mo41249Z(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0064
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            int r3 = com.onedelhi.secure.C5327fx.m48539a(r3)
            int r3 = com.onedelhi.secure.C5327fx.m48539a(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            com.onedelhi.secure.jt1.m53776o(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0064:
            com.onedelhi.secure.no r0 = r5.f26339a
            long r0 = r0.mo31709s2()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bg3.mo31709s2():long");
    }

    @vr2
    /* renamed from: t */
    public C6893to mo31710t() {
        return gu2.m49835d(new b13(this));
    }

    /* renamed from: t1 */
    public short mo31711t1() {
        mo31694o(2);
        return this.f26339a.mo31711t1();
    }

    @vr2
    public me4 timeout() {
        return this.f26340a.timeout();
    }

    @vr2
    public String toString() {
        return "buffer(" + this.f26340a + ')';
    }

    @vr2
    /* renamed from: u2 */
    public byte[] mo31713u2() {
        this.f26339a.mo41235N(this.f26340a);
        return this.f26339a.mo31713u2();
    }

    @vr2
    /* renamed from: z2 */
    public String mo31714z2(long j, @vr2 Charset charset) {
        jt1.m53777p(charset, "charset");
        mo31694o(j);
        return this.f26339a.mo31714z2(j, charset);
    }
}
