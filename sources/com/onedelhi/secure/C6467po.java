package com.onedelhi.secure;

import com.onedelhi.secure.ak4;
import java.io.EOFException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\u001a0\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aA\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000b2\u001a\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u0011H\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001e\u0010\u0018\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\bH\u0000\u001a%\u0010\u001c\u001a\u00020\n*\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\b\u001a\r\u0010\u001d\u001a\u00020\u000b*\u00020\nH\b\u001a\r\u0010\u001f\u001a\u00020\u001e*\u00020\nH\b\u001a\r\u0010!\u001a\u00020 *\u00020\nH\b\u001a\r\u0010\"\u001a\u00020\u0002*\u00020\nH\b\u001a\r\u0010#\u001a\u00020\u000b*\u00020\nH\b\u001a\u0015\u0010%\u001a\u00020\u001e*\u00020\n2\u0006\u0010$\u001a\u00020\u000bH\b\u001a\r\u0010'\u001a\u00020&*\u00020\nH\b\u001a\u0015\u0010(\u001a\u00020&*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\b\u001a)\u0010+\u001a\u00020\n*\u00020\n2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0002H\b\u001a\u0015\u0010-\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\b\u001a\u0015\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\b\u001a\u0015\u0010/\u001a\u00020\u0000*\u00020\n2\u0006\u0010.\u001a\u00020\u0002H\b\u001a\u0015\u00101\u001a\u00020\n*\u00020\n2\u0006\u00100\u001a\u00020\u0004H\b\u001a%\u00102\u001a\u00020\n*\u00020\n2\u0006\u00100\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\b\u001a\r\u00103\u001a\u00020\u0004*\u00020\nH\b\u001a\u0015\u00104\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\b\u001a\u0015\u00106\u001a\u00020\u0002*\u00020\n2\u0006\u00105\u001a\u00020\u0004H\b\u001a\u0015\u00107\u001a\u00020&*\u00020\n2\u0006\u00105\u001a\u00020\u0004H\b\u001a%\u00108\u001a\u00020\u0002*\u00020\n2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\b\u001a\r\u00109\u001a\u00020\u000b*\u00020\nH\b\u001a\r\u0010:\u001a\u00020\u000b*\u00020\nH\b\u001a\r\u0010;\u001a\u00020)*\u00020\nH\b\u001a\u0015\u0010<\u001a\u00020)*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\b\u001a\u0015\u0010=\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\b\u001a\u001d\u0010,\u001a\u00020&*\u00020\n2\u0006\u00105\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\b\u001a\u0015\u0010?\u001a\u00020\u000b*\u00020\n2\u0006\u00105\u001a\u00020>H\b\u001a\u0015\u0010@\u001a\u00020\r*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\b\u001a\u000f\u0010A\u001a\u0004\u0018\u00010\r*\u00020\nH\b\u001a\u0015\u0010C\u001a\u00020\r*\u00020\n2\u0006\u0010B\u001a\u00020\u000bH\b\u001a\r\u0010D\u001a\u00020\u0002*\u00020\nH\b\u001a%\u0010H\u001a\u00020\n*\u00020\n2\u0006\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u0002H\b\u001a\u0015\u0010J\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u0002H\b\u001a\u0015\u0010L\u001a\u00020\u000b*\u00020\n2\u0006\u00100\u001a\u00020KH\b\u001a\u001d\u0010M\u001a\u00020\n*\u00020\n2\u0006\u00100\u001a\u00020K2\u0006\u0010\u001b\u001a\u00020\u000bH\b\u001a\u0015\u0010N\u001a\u00020\n*\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0002H\b\u001a\u0015\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010;\u001a\u00020\u0002H\b\u001a\u0015\u0010Q\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u0002H\b\u001a\u0015\u0010R\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\b\u001a\u001d\u0010S\u001a\u00020&*\u00020\n2\u0006\u00100\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\b\u001a\u001d\u0010T\u001a\u00020\u000b*\u00020\n2\u0006\u00105\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\b\u001a%\u0010V\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020\u000bH\b\u001a\u001d\u0010P\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000bH\b\u001a\u001d\u0010X\u001a\u00020\u000b*\u00020\n2\u0006\u0010W\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000bH\b\u001a-\u0010Y\u001a\u00020\b*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\b\u001a\u0017\u0010\\\u001a\u00020\b*\u00020\n2\b\u0010[\u001a\u0004\u0018\u00010ZH\b\u001a\r\u0010]\u001a\u00020\u0002*\u00020\nH\b\u001a\r\u0010^\u001a\u00020\n*\u00020\nH\b\u001a\r\u0010_\u001a\u00020)*\u00020\nH\b\u001a\u0015\u0010`\u001a\u00020)*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0002H\b\"\u001a\u0010a\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\u0002\u0007\n\u0005\b20\u0001¨\u0006e"}, d2 = {"Lcom/onedelhi/secure/ws3;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "a0", "Lcom/onedelhi/secure/no;", "", "newline", "", "b0", "T", "fromIndex", "Lkotlin/Function2;", "lambda", "c0", "(Lcom/onedelhi/secure/no;JLcom/onedelhi/secure/sc1;)Ljava/lang/Object;", "Lcom/onedelhi/secure/yw2;", "options", "selectTruncated", "d0", "out", "offset", "byteCount", "d", "b", "", "p", "", "A", "y", "z", "pos", "f", "Lcom/onedelhi/secure/un4;", "a", "G", "Lcom/onedelhi/secure/fr;", "byteString", "K", "v", "S", "minimumCapacity", "J", "source", "M", "N", "q", "r", "sink", "l", "w", "m", "u", "x", "s", "t", "F", "Lcom/onedelhi/secure/oz3;", "o", "B", "D", "limit", "E", "C", "string", "beginIndex", "endIndex", "X", "codePoint", "Y", "Lcom/onedelhi/secure/x04;", "Q", "L", "R", "W", "i", "U", "V", "O", "n", "toIndex", "h", "targetBytes", "j", "k", "", "other", "e", "g", "c", "H", "I", "HEX_DIGIT_BYTES", "[B", "Z", "()[B", "okio"}, k = 2, mv = {1, 4, 0})
/* renamed from: com.onedelhi.secure.po */
public final class C6467po {

    /* renamed from: a */
    public static final int f33743a = 4096;

    /* renamed from: a */
    public static final long f33744a = -922337203685477580L;
    @vr2

    /* renamed from: a */
    public static final byte[] f33745a = C5857k.m53899a("0123456789abcdef");

    /* renamed from: b */
    public static final long f33746b = -7;

    /* renamed from: A */
    public static final short m61470A(@vr2 C6205no noVar) {
        jt1.m53777p(noVar, "$this$commonReadShort");
        if (noVar.mo41244V0() >= 2) {
            ws3 ws3 = noVar.f32655a;
            jt1.m53774m(ws3);
            int i = ws3.f37108a;
            int i2 = ws3.f37112b;
            if (i2 - i < 2) {
                return (short) ((noVar.readByte() & 255) | ((noVar.readByte() & 255) << 8));
            }
            byte[] bArr = ws3.f37111a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            noVar.mo41237P0(noVar.mo41244V0() - 2);
            if (i4 == i2) {
                noVar.f32655a = ws3.mo46873b();
                zs3.m74279d(ws3);
            } else {
                ws3.f37108a = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    @vr2
    /* renamed from: B */
    public static final String m61471B(@vr2 C6205no noVar, long j) {
        jt1.m53777p(noVar, "$this$commonReadUtf8");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (noVar.mo41244V0() < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            ws3 ws3 = noVar.f32655a;
            jt1.m53774m(ws3);
            int i2 = ws3.f37108a;
            if (((long) i2) + j > ((long) ws3.f37112b)) {
                return mz4.m57779c(noVar.mo31691k1(j), 0, 0, 3, (Object) null);
            }
            int i3 = (int) j;
            String b = mz4.m57778b(ws3.f37111a, i2, i2 + i3);
            ws3.f37108a += i3;
            noVar.mo41237P0(noVar.mo41244V0() - j);
            if (ws3.f37108a == ws3.f37112b) {
                noVar.f32655a = ws3.mo46873b();
                zs3.m74279d(ws3);
            }
            return b;
        }
    }

    /* renamed from: C */
    public static final int m61472C(@vr2 C6205no noVar) {
        byte b;
        int i;
        byte b2;
        jt1.m53777p(noVar, "$this$commonReadUtf8CodePoint");
        if (noVar.mo41244V0() != 0) {
            byte Z = noVar.mo41249Z(0);
            int i2 = 1;
            if ((Z & C7276xq.f37586a) == 0) {
                b2 = Z & Byte.MAX_VALUE;
                i = 1;
                b = 0;
            } else if ((Z & 224) == 192) {
                b2 = Z & 31;
                i = 2;
                b = C7276xq.f37586a;
            } else if ((Z & 240) == 224) {
                b2 = Z & 15;
                i = 3;
                b = 2048;
            } else if ((Z & 248) == 240) {
                b2 = Z & 7;
                i = 4;
                b = 65536;
            } else {
                noVar.mo31670F1(1);
                return iq4.f30425a;
            }
            long j = (long) i;
            if (noVar.mo41244V0() >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte Z2 = noVar.mo41249Z(j2);
                    if ((Z2 & mx0.f16640e) == 128) {
                        b2 = (b2 << 6) | (Z2 & iq4.f30423a);
                        i2++;
                    } else {
                        noVar.mo31670F1(j2);
                        return iq4.f30425a;
                    }
                }
                noVar.mo31670F1(j);
                return b2 > 1114111 ? iq4.f30425a : ((55296 <= b2 && 57343 >= b2) || b2 < b) ? iq4.f30425a : b2;
            }
            throw new EOFException("size < " + i + ": " + noVar.mo41244V0() + " (to read code point prefixed 0x" + C5950l.m55177m(Z) + ')');
        }
        throw new EOFException();
    }

    @ss2
    /* renamed from: D */
    public static final String m61473D(@vr2 C6205no noVar) {
        jt1.m53777p(noVar, "$this$commonReadUtf8Line");
        long i = noVar.mo31686i((byte) 10);
        if (i != -1) {
            return m61499b0(noVar, i);
        }
        if (noVar.mo41244V0() != 0) {
            return noVar.mo31698r1(noVar.mo41244V0());
        }
        return null;
    }

    @vr2
    /* renamed from: E */
    public static final String m61474E(@vr2 C6205no noVar, long j) {
        jt1.m53777p(noVar, "$this$commonReadUtf8LineStrict");
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long s0 = noVar.mo31708s0(b, 0, j2);
            if (s0 != -1) {
                return m61499b0(noVar, s0);
            }
            if (j2 < noVar.mo41244V0() && noVar.mo41249Z(j2 - 1) == ((byte) 13) && noVar.mo41249Z(j2) == b) {
                return m61499b0(noVar, j2);
            }
            C6205no noVar2 = new C6205no();
            noVar.mo41278m(noVar2, 0, Math.min((long) 32, noVar.mo41244V0()));
            throw new EOFException("\\n not found: limit=" + Math.min(noVar.mo41244V0(), j) + " content=" + noVar2.mo31697r0().mo31159D() + tk4.f35682E);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    /* renamed from: F */
    public static final int m61475F(@vr2 C6205no noVar, @vr2 yw2 yw2) {
        jt1.m53777p(noVar, "$this$commonSelect");
        jt1.m53777p(yw2, "options");
        int e0 = m61505e0(noVar, yw2, false, 2, (Object) null);
        if (e0 == -1) {
            return -1;
        }
        noVar.mo31670F1((long) yw2.mo48022i()[e0].mo36274j0());
        return e0;
    }

    /* renamed from: G */
    public static final void m61476G(@vr2 C6205no noVar, long j) {
        jt1.m53777p(noVar, "$this$commonSkip");
        while (j > 0) {
            ws3 ws3 = noVar.f32655a;
            if (ws3 != null) {
                int min = (int) Math.min(j, (long) (ws3.f37112b - ws3.f37108a));
                long j2 = (long) min;
                noVar.mo41237P0(noVar.mo41244V0() - j2);
                j -= j2;
                int i = ws3.f37108a + min;
                ws3.f37108a = i;
                if (i == ws3.f37112b) {
                    noVar.f32655a = ws3.mo46873b();
                    zs3.m74279d(ws3);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @vr2
    /* renamed from: H */
    public static final C5301fr m61477H(@vr2 C6205no noVar) {
        jt1.m53777p(noVar, "$this$commonSnapshot");
        if (noVar.mo41244V0() <= ((long) Integer.MAX_VALUE)) {
            return noVar.mo41257c1((int) noVar.mo41244V0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + noVar.mo41244V0()).toString());
    }

    @vr2
    /* renamed from: I */
    public static final C5301fr m61478I(@vr2 C6205no noVar, int i) {
        jt1.m53777p(noVar, "$this$commonSnapshot");
        if (i == 0) {
            return C5301fr.f28634a;
        }
        C5950l.m55169e(noVar.mo41244V0(), 0, (long) i);
        ws3 ws3 = noVar.f32655a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            jt1.m53774m(ws3);
            int i5 = ws3.f37112b;
            int i6 = ws3.f37108a;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                ws3 = ws3.f37109a;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        ws3 ws32 = noVar.f32655a;
        int i7 = 0;
        while (i2 < i) {
            jt1.m53774m(ws32);
            bArr[i7] = ws32.f37111a;
            i2 += ws32.f37112b - ws32.f37108a;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = ws32.f37108a;
            ws32.f37110a = true;
            i7++;
            ws32 = ws32.f37109a;
        }
        return new at3(bArr, iArr);
    }

    @vr2
    /* renamed from: J */
    public static final ws3 m61479J(@vr2 C6205no noVar, int i) {
        jt1.m53777p(noVar, "$this$commonWritableSegment");
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            ws3 ws3 = noVar.f32655a;
            if (ws3 == null) {
                ws3 e = zs3.m74280e();
                noVar.f32655a = e;
                e.f37113b = e;
                e.f37109a = e;
                return e;
            }
            jt1.m53774m(ws3);
            ws3 ws32 = ws3.f37113b;
            jt1.m53774m(ws32);
            return (ws32.f37112b + i > 8192 || !ws32.f37114b) ? ws32.mo46874c(zs3.m74280e()) : ws32;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @vr2
    /* renamed from: K */
    public static final C6205no m61480K(@vr2 C6205no noVar, @vr2 C5301fr frVar, int i, int i2) {
        jt1.m53777p(noVar, "$this$commonWrite");
        jt1.m53777p(frVar, "byteString");
        frVar.mo31180w0(noVar, i, i2);
        return noVar;
    }

    @vr2
    /* renamed from: L */
    public static final C6205no m61481L(@vr2 C6205no noVar, @vr2 x04 x04, long j) {
        jt1.m53777p(noVar, "$this$commonWrite");
        jt1.m53777p(x04, "source");
        while (j > 0) {
            long read = x04.read(noVar, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return noVar;
    }

    @vr2
    /* renamed from: M */
    public static final C6205no m61482M(@vr2 C6205no noVar, @vr2 byte[] bArr) {
        jt1.m53777p(noVar, "$this$commonWrite");
        jt1.m53777p(bArr, "source");
        return noVar.mo41266h0(bArr, 0, bArr.length);
    }

    @vr2
    /* renamed from: N */
    public static final C6205no m61483N(@vr2 C6205no noVar, @vr2 byte[] bArr, int i, int i2) {
        jt1.m53777p(noVar, "$this$commonWrite");
        jt1.m53777p(bArr, "source");
        long j = (long) i2;
        C5950l.m55169e((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            ws3 f1 = noVar.mo41263f1(1);
            int min = Math.min(i3 - i, 8192 - f1.f37112b);
            int i4 = i + min;
            C7458za.m72840W0(bArr, f1.f37111a, f1.f37112b, i, i4);
            f1.f37112b += min;
            i = i4;
        }
        noVar.mo41237P0(noVar.mo41244V0() + j);
        return noVar;
    }

    /* renamed from: O */
    public static final void m61484O(@vr2 C6205no noVar, @vr2 C6205no noVar2, long j) {
        ws3 ws3;
        jt1.m53777p(noVar, "$this$commonWrite");
        jt1.m53777p(noVar2, "source");
        if (noVar2 != noVar) {
            C5950l.m55169e(noVar2.mo41244V0(), 0, j);
            while (j > 0) {
                ws3 ws32 = noVar2.f32655a;
                jt1.m53774m(ws32);
                int i = ws32.f37112b;
                ws3 ws33 = noVar2.f32655a;
                jt1.m53774m(ws33);
                if (j < ((long) (i - ws33.f37108a))) {
                    ws3 ws34 = noVar.f32655a;
                    if (ws34 != null) {
                        jt1.m53774m(ws34);
                        ws3 = ws34.f37113b;
                    } else {
                        ws3 = null;
                    }
                    if (ws3 != null && ws3.f37114b) {
                        if ((((long) ws3.f37112b) + j) - ((long) (ws3.f37110a ? 0 : ws3.f37108a)) <= ((long) 8192)) {
                            ws3 ws35 = noVar2.f32655a;
                            jt1.m53774m(ws35);
                            ws35.mo46878g(ws3, (int) j);
                            noVar2.mo41237P0(noVar2.mo41244V0() - j);
                            noVar.mo41237P0(noVar.mo41244V0() + j);
                            return;
                        }
                    }
                    ws3 ws36 = noVar2.f32655a;
                    jt1.m53774m(ws36);
                    noVar2.f32655a = ws36.mo46876e((int) j);
                }
                ws3 ws37 = noVar2.f32655a;
                jt1.m53774m(ws37);
                long j2 = (long) (ws37.f37112b - ws37.f37108a);
                noVar2.f32655a = ws37.mo46873b();
                ws3 ws38 = noVar.f32655a;
                if (ws38 == null) {
                    noVar.f32655a = ws37;
                    ws37.f37113b = ws37;
                    ws37.f37109a = ws37;
                } else {
                    jt1.m53774m(ws38);
                    ws3 ws39 = ws38.f37113b;
                    jt1.m53774m(ws39);
                    ws39.mo46874c(ws37).mo46872a();
                }
                noVar2.mo41237P0(noVar2.mo41244V0() - j2);
                noVar.mo41237P0(noVar.mo41244V0() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* renamed from: P */
    public static /* synthetic */ C6205no m61485P(C6205no noVar, C5301fr frVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = frVar.mo36274j0();
        }
        jt1.m53777p(noVar, "$this$commonWrite");
        jt1.m53777p(frVar, "byteString");
        frVar.mo31180w0(noVar, i, i2);
        return noVar;
    }

    /* renamed from: Q */
    public static final long m61486Q(@vr2 C6205no noVar, @vr2 x04 x04) {
        jt1.m53777p(noVar, "$this$commonWriteAll");
        jt1.m53777p(x04, "source");
        long j = 0;
        while (true) {
            long read = x04.read(noVar, (long) 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @vr2
    /* renamed from: R */
    public static final C6205no m61487R(@vr2 C6205no noVar, int i) {
        jt1.m53777p(noVar, "$this$commonWriteByte");
        ws3 f1 = noVar.mo41263f1(1);
        byte[] bArr = f1.f37111a;
        int i2 = f1.f37112b;
        f1.f37112b = i2 + 1;
        bArr[i2] = (byte) i;
        noVar.mo41237P0(noVar.mo41244V0() + 1);
        return noVar;
    }

    @vr2
    /* renamed from: S */
    public static final C6205no m61488S(@vr2 C6205no noVar, long j) {
        jt1.m53777p(noVar, "$this$commonWriteDecimalLong");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return noVar.mo41230L0(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return noVar.mo41279n("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < C4564ak.f25870a ? j < eg3.f27898b ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < zv0.f38454a ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        ws3 f1 = noVar.mo41263f1(i2);
        byte[] bArr = f1.f37111a;
        int i3 = f1.f37112b + i2;
        while (j != 0) {
            long j2 = (long) 10;
            i3--;
            bArr[i3] = m61495Z()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        f1.f37112b += i2;
        noVar.mo41237P0(noVar.mo41244V0() + ((long) i2));
        return noVar;
    }

    @vr2
    /* renamed from: T */
    public static final C6205no m61489T(@vr2 C6205no noVar, long j) {
        jt1.m53777p(noVar, "$this$commonWriteHexadecimalUnsignedLong");
        if (j == 0) {
            return noVar.mo41230L0(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        ws3 f1 = noVar.mo41263f1(i);
        byte[] bArr = f1.f37111a;
        int i2 = f1.f37112b;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = m61495Z()[(int) (15 & j)];
            j >>>= 4;
        }
        f1.f37112b += i;
        noVar.mo41237P0(noVar.mo41244V0() + ((long) i));
        return noVar;
    }

    @vr2
    /* renamed from: U */
    public static final C6205no m61490U(@vr2 C6205no noVar, int i) {
        jt1.m53777p(noVar, "$this$commonWriteInt");
        ws3 f1 = noVar.mo41263f1(4);
        byte[] bArr = f1.f37111a;
        int i2 = f1.f37112b;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        f1.f37112b = i5 + 1;
        noVar.mo41237P0(noVar.mo41244V0() + 4);
        return noVar;
    }

    @vr2
    /* renamed from: V */
    public static final C6205no m61491V(@vr2 C6205no noVar, long j) {
        jt1.m53777p(noVar, "$this$commonWriteLong");
        ws3 f1 = noVar.mo41263f1(8);
        byte[] bArr = f1.f37111a;
        int i = f1.f37112b;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i8] = (byte) ((int) (j & 255));
        f1.f37112b = i8 + 1;
        noVar.mo41237P0(noVar.mo41244V0() + 8);
        return noVar;
    }

    @vr2
    /* renamed from: W */
    public static final C6205no m61492W(@vr2 C6205no noVar, int i) {
        jt1.m53777p(noVar, "$this$commonWriteShort");
        ws3 f1 = noVar.mo41263f1(2);
        byte[] bArr = f1.f37111a;
        int i2 = f1.f37112b;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        f1.f37112b = i3 + 1;
        noVar.mo41237P0(noVar.mo41244V0() + 2);
        return noVar;
    }

    @vr2
    /* renamed from: X */
    public static final C6205no m61493X(@vr2 C6205no noVar, @vr2 String str, int i, int i2) {
        long V0;
        long j;
        jt1.m53777p(noVar, "$this$commonWriteUtf8");
        jt1.m53777p(str, ak4.C1709b.f9167e);
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            ws3 f1 = noVar.mo41263f1(1);
                            byte[] bArr = f1.f37111a;
                            int i3 = f1.f37112b - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                            while (i4 < min) {
                                char charAt2 = str.charAt(i4);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                bArr[i4 + i3] = (byte) charAt2;
                                i4++;
                            }
                            int i5 = f1.f37112b;
                            int i6 = (i3 + i4) - i5;
                            f1.f37112b = i5 + i6;
                            noVar.mo41237P0(noVar.mo41244V0() + ((long) i6));
                            i = i4;
                        } else {
                            if (charAt < 2048) {
                                ws3 f12 = noVar.mo41263f1(2);
                                byte[] bArr2 = f12.f37111a;
                                int i7 = f12.f37112b;
                                bArr2[i7] = (byte) ((charAt >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                                f12.f37112b = i7 + 2;
                                V0 = noVar.mo41244V0();
                                j = 2;
                            } else if (charAt < 55296 || charAt > 57343) {
                                ws3 f13 = noVar.mo41263f1(3);
                                byte[] bArr3 = f13.f37111a;
                                int i8 = f13.f37112b;
                                bArr3[i8] = (byte) ((charAt >> 12) | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt & '?') | 128);
                                f13.f37112b = i8 + 3;
                                V0 = noVar.mo41244V0();
                                j = 3;
                            } else {
                                int i9 = i + 1;
                                char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                                if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    noVar.mo41230L0(63);
                                    i = i9;
                                } else {
                                    int i10 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + C6794sw.f35203a;
                                    ws3 f14 = noVar.mo41263f1(4);
                                    byte[] bArr4 = f14.f37111a;
                                    int i11 = f14.f37112b;
                                    bArr4[i11] = (byte) ((i10 >> 18) | 240);
                                    bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                    bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                    bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                                    f14.f37112b = i11 + 4;
                                    noVar.mo41237P0(noVar.mo41244V0() + 4);
                                    i += 2;
                                }
                            }
                            noVar.mo41237P0(V0 + j);
                            i++;
                        }
                    }
                    return noVar;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    @vr2
    /* renamed from: Y */
    public static final C6205no m61494Y(@vr2 C6205no noVar, int i) {
        long V0;
        long j;
        jt1.m53777p(noVar, "$this$commonWriteUtf8CodePoint");
        if (i < 128) {
            noVar.mo41230L0(i);
        } else {
            if (i < 2048) {
                ws3 f1 = noVar.mo41263f1(2);
                byte[] bArr = f1.f37111a;
                int i2 = f1.f37112b;
                bArr[i2] = (byte) ((i >> 6) | 192);
                bArr[i2 + 1] = (byte) ((i & 63) | 128);
                f1.f37112b = i2 + 2;
                V0 = noVar.mo41244V0();
                j = 2;
            } else if (55296 <= i && 57343 >= i) {
                noVar.mo41230L0(63);
            } else if (i < 65536) {
                ws3 f12 = noVar.mo41263f1(3);
                byte[] bArr2 = f12.f37111a;
                int i3 = f12.f37112b;
                bArr2[i3] = (byte) ((i >> 12) | 224);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                f12.f37112b = i3 + 3;
                V0 = noVar.mo41244V0();
                j = 3;
            } else if (i <= 1114111) {
                ws3 f13 = noVar.mo41263f1(4);
                byte[] bArr3 = f13.f37111a;
                int i4 = f13.f37112b;
                bArr3[i4] = (byte) ((i >> 18) | 240);
                bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i4 + 3] = (byte) ((i & 63) | 128);
                f13.f37112b = i4 + 4;
                V0 = noVar.mo41244V0();
                j = 4;
            } else {
                throw new IllegalArgumentException("Unexpected code point: 0x" + C5950l.m55178n(i));
            }
            noVar.mo41237P0(V0 + j);
        }
        return noVar;
    }

    @vr2
    /* renamed from: Z */
    public static final byte[] m61495Z() {
        return f33745a;
    }

    /* renamed from: a */
    public static final void m61496a(@vr2 C6205no noVar) {
        jt1.m53777p(noVar, "$this$commonClear");
        noVar.mo31670F1(noVar.mo41244V0());
    }

    /* renamed from: a0 */
    public static final boolean m61497a0(@vr2 ws3 ws3, int i, @vr2 byte[] bArr, int i2, int i3) {
        jt1.m53777p(ws3, "segment");
        jt1.m53777p(bArr, "bytes");
        int i4 = ws3.f37112b;
        byte[] bArr2 = ws3.f37111a;
        while (i2 < i3) {
            if (i == i4) {
                ws3 = ws3.f37109a;
                jt1.m53774m(ws3);
                byte[] bArr3 = ws3.f37111a;
                int i5 = ws3.f37108a;
                bArr2 = bArr3;
                i = i5;
                i4 = ws3.f37112b;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: b */
    public static final long m61498b(@vr2 C6205no noVar) {
        jt1.m53777p(noVar, "$this$commonCompleteSegmentByteCount");
        long V0 = noVar.mo41244V0();
        if (V0 == 0) {
            return 0;
        }
        ws3 ws3 = noVar.f32655a;
        jt1.m53774m(ws3);
        ws3 ws32 = ws3.f37113b;
        jt1.m53774m(ws32);
        int i = ws32.f37112b;
        return (i >= 8192 || !ws32.f37114b) ? V0 : V0 - ((long) (i - ws32.f37108a));
    }

    @vr2
    /* renamed from: b0 */
    public static final String m61499b0(@vr2 C6205no noVar, long j) {
        String str;
        jt1.m53777p(noVar, "$this$readUtf8Line");
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (noVar.mo41249Z(j3) == ((byte) 13)) {
                str = noVar.mo31698r1(j3);
                j2 = 2;
                noVar.mo31670F1(j2);
                return str;
            }
        }
        str = noVar.mo31698r1(j);
        noVar.mo31670F1(j2);
        return str;
    }

    @vr2
    /* renamed from: c */
    public static final C6205no m61500c(@vr2 C6205no noVar) {
        jt1.m53777p(noVar, "$this$commonCopy");
        C6205no noVar2 = new C6205no();
        if (noVar.mo41244V0() == 0) {
            return noVar2;
        }
        ws3 ws3 = noVar.f32655a;
        jt1.m53774m(ws3);
        ws3 d = ws3.mo46875d();
        noVar2.f32655a = d;
        d.f37113b = d;
        d.f37109a = d;
        for (ws3 ws32 = ws3.f37109a; ws32 != ws3; ws32 = ws32.f37109a) {
            ws3 ws33 = d.f37113b;
            jt1.m53774m(ws33);
            jt1.m53774m(ws32);
            ws33.mo46874c(ws32.mo46875d());
        }
        noVar2.mo41237P0(noVar.mo41244V0());
        return noVar2;
    }

    /* renamed from: c0 */
    public static final <T> T m61501c0(@vr2 C6205no noVar, long j, @vr2 sc1<? super ws3, ? super Long, ? extends T> sc1) {
        jt1.m53777p(noVar, "$this$seek");
        jt1.m53777p(sc1, "lambda");
        ws3 ws3 = noVar.f32655a;
        if (ws3 == null) {
            return sc1.mo21054h0(null, -1L);
        }
        if (noVar.mo41244V0() - j < j) {
            long V0 = noVar.mo41244V0();
            while (V0 > j) {
                ws3 = ws3.f37113b;
                jt1.m53774m(ws3);
                V0 -= (long) (ws3.f37112b - ws3.f37108a);
            }
            return sc1.mo21054h0(ws3, Long.valueOf(V0));
        }
        long j2 = 0;
        while (true) {
            long j3 = ((long) (ws3.f37112b - ws3.f37108a)) + j2;
            if (j3 > j) {
                return sc1.mo21054h0(ws3, Long.valueOf(j2));
            }
            ws3 = ws3.f37109a;
            jt1.m53774m(ws3);
            j2 = j3;
        }
    }

    @vr2
    /* renamed from: d */
    public static final C6205no m61502d(@vr2 C6205no noVar, @vr2 C6205no noVar2, long j, long j2) {
        jt1.m53777p(noVar, "$this$commonCopyTo");
        jt1.m53777p(noVar2, "out");
        C5950l.m55169e(noVar.mo41244V0(), j, j2);
        if (j2 == 0) {
            return noVar;
        }
        noVar2.mo41237P0(noVar2.mo41244V0() + j2);
        ws3 ws3 = noVar.f32655a;
        while (true) {
            jt1.m53774m(ws3);
            int i = ws3.f37112b;
            int i2 = ws3.f37108a;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            ws3 = ws3.f37109a;
        }
        while (j2 > 0) {
            jt1.m53774m(ws3);
            ws3 d = ws3.mo46875d();
            int i3 = d.f37108a + ((int) j);
            d.f37108a = i3;
            d.f37112b = Math.min(i3 + ((int) j2), d.f37112b);
            ws3 ws32 = noVar2.f32655a;
            if (ws32 == null) {
                d.f37113b = d;
                d.f37109a = d;
                noVar2.f32655a = d;
            } else {
                jt1.m53774m(ws32);
                ws3 ws33 = ws32.f37113b;
                jt1.m53774m(ws33);
                ws33.mo46874c(d);
            }
            j2 -= (long) (d.f37112b - d.f37108a);
            ws3 = ws3.f37109a;
            j = 0;
        }
        return noVar;
    }

    /* renamed from: d0 */
    public static final int m61503d0(@vr2 C6205no noVar, @vr2 yw2 yw2, boolean z) {
        int i;
        int i2;
        int i3;
        ws3 ws3;
        int i4;
        C6205no noVar2 = noVar;
        jt1.m53777p(noVar2, "$this$selectPrefix");
        jt1.m53777p(yw2, "options");
        ws3 ws32 = noVar2.f32655a;
        if (ws32 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = ws32.f37111a;
        int i5 = ws32.f37108a;
        int i6 = ws32.f37112b;
        int[] j = yw2.mo48023j();
        ws3 ws33 = ws32;
        int i7 = 0;
        int i8 = -1;
        loop0:
        while (true) {
            int i9 = i7 + 1;
            int i10 = j[i7];
            int i11 = i9 + 1;
            int i12 = j[i9];
            if (i12 != -1) {
                i8 = i12;
            }
            if (ws33 == null) {
                break;
            }
            if (i10 < 0) {
                int i13 = i11 + (i10 * -1);
                while (true) {
                    int i14 = i5 + 1;
                    int i15 = i11 + 1;
                    if ((bArr[i5] & 255) != j[i11]) {
                        return i8;
                    }
                    boolean z2 = i15 == i13;
                    if (i14 == i6) {
                        jt1.m53774m(ws33);
                        ws3 ws34 = ws33.f37109a;
                        jt1.m53774m(ws34);
                        i4 = ws34.f37108a;
                        byte[] bArr2 = ws34.f37111a;
                        i3 = ws34.f37112b;
                        if (ws34 != ws32) {
                            byte[] bArr3 = bArr2;
                            ws3 = ws34;
                            bArr = bArr3;
                        } else if (!z2) {
                            break loop0;
                        } else {
                            bArr = bArr2;
                            ws3 = null;
                        }
                    } else {
                        ws3 ws35 = ws33;
                        i3 = i6;
                        i4 = i14;
                        ws3 = ws35;
                    }
                    if (z2) {
                        i2 = j[i15];
                        i = i4;
                        i6 = i3;
                        ws33 = ws3;
                        break;
                    }
                    i5 = i4;
                    i6 = i3;
                    i11 = i15;
                    ws33 = ws3;
                }
            } else {
                i = i5 + 1;
                byte b = bArr[i5] & 255;
                int i16 = i11 + i10;
                while (i11 != i16) {
                    if (b == j[i11]) {
                        i2 = j[i11 + i10];
                        if (i == i6) {
                            ws33 = ws33.f37109a;
                            jt1.m53774m(ws33);
                            i = ws33.f37108a;
                            bArr = ws33.f37111a;
                            i6 = ws33.f37112b;
                            if (ws33 == ws32) {
                                ws33 = null;
                            }
                        }
                    } else {
                        i11++;
                    }
                }
                return i8;
            }
            if (i2 >= 0) {
                return i2;
            }
            i7 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i8;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m61504e(@com.onedelhi.secure.vr2 com.onedelhi.secure.C6205no r18, @com.onedelhi.secure.ss2 java.lang.Object r19) {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "$this$commonEquals"
            com.onedelhi.secure.jt1.m53777p(r0, r2)
            r2 = 1
            if (r0 != r1) goto L_0x000d
            return r2
        L_0x000d:
            boolean r3 = r1 instanceof com.onedelhi.secure.C6205no
            r4 = 0
            if (r3 != 0) goto L_0x0013
            return r4
        L_0x0013:
            long r5 = r18.mo41244V0()
            com.onedelhi.secure.no r1 = (com.onedelhi.secure.C6205no) r1
            long r7 = r1.mo41244V0()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0022
            return r4
        L_0x0022:
            long r5 = r18.mo41244V0()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x002d
            return r2
        L_0x002d:
            com.onedelhi.secure.ws3 r3 = r0.f32655a
            com.onedelhi.secure.jt1.m53774m(r3)
            com.onedelhi.secure.ws3 r1 = r1.f32655a
            com.onedelhi.secure.jt1.m53774m(r1)
            int r5 = r3.f37108a
            int r6 = r1.f37108a
            r9 = r7
        L_0x003c:
            long r11 = r18.mo41244V0()
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0083
            int r11 = r3.f37112b
            int r11 = r11 - r5
            int r12 = r1.f37112b
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L_0x0050:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x006b
            byte[] r15 = r3.f37111a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f37111a
            int r17 = r6 + 1
            byte r6 = r15[r6]
            if (r5 == r6) goto L_0x0063
            return r4
        L_0x0063:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L_0x0050
        L_0x006b:
            int r13 = r3.f37112b
            if (r5 != r13) goto L_0x0076
            com.onedelhi.secure.ws3 r3 = r3.f37109a
            com.onedelhi.secure.jt1.m53774m(r3)
            int r5 = r3.f37108a
        L_0x0076:
            int r13 = r1.f37112b
            if (r6 != r13) goto L_0x0081
            com.onedelhi.secure.ws3 r1 = r1.f37109a
            com.onedelhi.secure.jt1.m53774m(r1)
            int r6 = r1.f37108a
        L_0x0081:
            long r9 = r9 + r11
            goto L_0x003c
        L_0x0083:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6467po.m61504e(com.onedelhi.secure.no, java.lang.Object):boolean");
    }

    /* renamed from: e0 */
    public static /* synthetic */ int m61505e0(C6205no noVar, yw2 yw2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m61503d0(noVar, yw2, z);
    }

    /* renamed from: f */
    public static final byte m61506f(@vr2 C6205no noVar, long j) {
        jt1.m53777p(noVar, "$this$commonGet");
        C5950l.m55169e(noVar.mo41244V0(), j, 1);
        ws3 ws3 = noVar.f32655a;
        if (ws3 == null) {
            jt1.m53774m((Object) null);
            throw null;
        } else if (noVar.mo41244V0() - j < j) {
            long V0 = noVar.mo41244V0();
            while (V0 > j) {
                ws3 = ws3.f37113b;
                jt1.m53774m(ws3);
                V0 -= (long) (ws3.f37112b - ws3.f37108a);
            }
            jt1.m53774m(ws3);
            return ws3.f37111a[(int) ((((long) ws3.f37108a) + j) - V0)];
        } else {
            long j2 = 0;
            while (true) {
                long j3 = ((long) (ws3.f37112b - ws3.f37108a)) + j2;
                if (j3 > j) {
                    jt1.m53774m(ws3);
                    return ws3.f37111a[(int) ((((long) ws3.f37108a) + j) - j2)];
                }
                ws3 = ws3.f37109a;
                jt1.m53774m(ws3);
                j2 = j3;
            }
        }
    }

    /* renamed from: g */
    public static final int m61507g(@vr2 C6205no noVar) {
        jt1.m53777p(noVar, "$this$commonHashCode");
        ws3 ws3 = noVar.f32655a;
        if (ws3 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = ws3.f37112b;
            for (int i3 = ws3.f37108a; i3 < i2; i3++) {
                i = (i * 31) + ws3.f37111a[i3];
            }
            ws3 = ws3.f37109a;
            jt1.m53774m(ws3);
        } while (ws3 != noVar.f32655a);
        return i;
    }

    /* renamed from: h */
    public static final long m61508h(@vr2 C6205no noVar, byte b, long j, long j2) {
        ws3 ws3;
        long j3;
        int i;
        jt1.m53777p(noVar, "$this$commonIndexOf");
        long j4 = 0;
        if (0 <= j && j2 >= j) {
            if (j2 > noVar.mo41244V0()) {
                j2 = noVar.mo41244V0();
            }
            if (j == j2 || (ws3 = noVar.f32655a) == null) {
                return -1;
            }
            if (noVar.mo41244V0() - j < j) {
                j3 = noVar.mo41244V0();
                while (j3 > j) {
                    ws3 = ws3.f37113b;
                    jt1.m53774m(ws3);
                    j3 -= (long) (ws3.f37112b - ws3.f37108a);
                }
                while (j3 < j2) {
                    byte[] bArr = ws3.f37111a;
                    int min = (int) Math.min((long) ws3.f37112b, (((long) ws3.f37108a) + j2) - j3);
                    i = (int) ((((long) ws3.f37108a) + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b) {
                            i++;
                        }
                    }
                    j3 += (long) (ws3.f37112b - ws3.f37108a);
                    ws3 = ws3.f37109a;
                    jt1.m53774m(ws3);
                    j = j3;
                }
                return -1;
            }
            while (true) {
                long j5 = ((long) (ws3.f37112b - ws3.f37108a)) + j4;
                if (j5 > j) {
                    break;
                }
                ws3 = ws3.f37109a;
                jt1.m53774m(ws3);
                j4 = j5;
            }
            while (j3 < j2) {
                byte[] bArr2 = ws3.f37111a;
                int min2 = (int) Math.min((long) ws3.f37112b, (((long) ws3.f37108a) + j2) - j3);
                int i2 = (int) ((((long) ws3.f37108a) + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b) {
                        i2 = i + 1;
                    }
                }
                j4 = j3 + ((long) (ws3.f37112b - ws3.f37108a));
                ws3 = ws3.f37109a;
                jt1.m53774m(ws3);
                j = j4;
            }
            return -1;
            return ((long) (i - ws3.f37108a)) + j3;
        }
        throw new IllegalArgumentException(("size=" + noVar.mo41244V0() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    /* renamed from: i */
    public static final long m61509i(@vr2 C6205no noVar, @vr2 C5301fr frVar, long j) {
        long j2;
        int i;
        C6205no noVar2 = noVar;
        long j3 = j;
        jt1.m53777p(noVar2, "$this$commonIndexOf");
        jt1.m53777p(frVar, "bytes");
        if (frVar.mo36274j0() > 0) {
            long j4 = 0;
            if (j3 >= 0) {
                ws3 ws3 = noVar2.f32655a;
                if (ws3 == null) {
                    return -1;
                }
                if (noVar.mo41244V0() - j3 < j3) {
                    j2 = noVar.mo41244V0();
                    while (j2 > j3) {
                        ws3 = ws3.f37113b;
                        jt1.m53774m(ws3);
                        j2 -= (long) (ws3.f37112b - ws3.f37108a);
                    }
                    byte[] O = frVar.mo31162O();
                    byte b = O[0];
                    int j0 = frVar.mo36274j0();
                    long V0 = (noVar.mo41244V0() - ((long) j0)) + 1;
                    while (j2 < V0) {
                        byte[] bArr = ws3.f37111a;
                        int min = (int) Math.min((long) ws3.f37112b, (((long) ws3.f37108a) + V0) - j2);
                        i = (int) ((((long) ws3.f37108a) + j3) - j2);
                        while (i < min) {
                            if (bArr[i] != b || !m61497a0(ws3, i + 1, O, 1, j0)) {
                                i++;
                            }
                        }
                        j2 += (long) (ws3.f37112b - ws3.f37108a);
                        ws3 = ws3.f37109a;
                        jt1.m53774m(ws3);
                        j3 = j2;
                    }
                    return -1;
                }
                while (true) {
                    long j5 = ((long) (ws3.f37112b - ws3.f37108a)) + j4;
                    if (j5 > j3) {
                        break;
                    }
                    ws3 = ws3.f37109a;
                    jt1.m53774m(ws3);
                    j4 = j5;
                }
                byte[] O2 = frVar.mo31162O();
                byte b2 = O2[0];
                int j02 = frVar.mo36274j0();
                long V02 = (noVar.mo41244V0() - ((long) j02)) + 1;
                long j6 = j4;
                while (j2 < V02) {
                    byte[] bArr2 = ws3.f37111a;
                    long j7 = V02;
                    int min2 = (int) Math.min((long) ws3.f37112b, (((long) ws3.f37108a) + V02) - j2);
                    int i2 = (int) ((((long) ws3.f37108a) + j3) - j2);
                    while (i < min2) {
                        if (bArr2[i] == b2) {
                            if (m61497a0(ws3, i + 1, O2, 1, j02)) {
                            }
                        }
                        i2 = i + 1;
                    }
                    j6 = j2 + ((long) (ws3.f37112b - ws3.f37108a));
                    ws3 = ws3.f37109a;
                    jt1.m53774m(ws3);
                    V02 = j7;
                    j3 = j6;
                }
                return -1;
                return ((long) (i - ws3.f37108a)) + j2;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j3).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    /* renamed from: j */
    public static final long m61510j(@vr2 C6205no noVar, @vr2 C5301fr frVar, long j) {
        long j2;
        int i;
        jt1.m53777p(noVar, "$this$commonIndexOfElement");
        jt1.m53777p(frVar, "targetBytes");
        long j3 = 0;
        if (j >= 0) {
            ws3 ws3 = noVar.f32655a;
            if (ws3 == null) {
                return -1;
            }
            if (noVar.mo41244V0() - j < j) {
                j2 = noVar.mo41244V0();
                while (j2 > j) {
                    ws3 = ws3.f37113b;
                    jt1.m53774m(ws3);
                    j2 -= (long) (ws3.f37112b - ws3.f37108a);
                }
                if (frVar.mo36274j0() == 2) {
                    byte y = frVar.mo36284y(0);
                    byte y2 = frVar.mo36284y(1);
                    while (j2 < noVar.mo41244V0()) {
                        byte[] bArr = ws3.f37111a;
                        i = (int) ((((long) ws3.f37108a) + j) - j2);
                        int i2 = ws3.f37112b;
                        while (i < i2) {
                            byte b = bArr[i];
                            if (!(b == y || b == y2)) {
                                i++;
                            }
                        }
                        j2 += (long) (ws3.f37112b - ws3.f37108a);
                        ws3 = ws3.f37109a;
                        jt1.m53774m(ws3);
                        j = j2;
                    }
                } else {
                    byte[] O = frVar.mo31162O();
                    while (j2 < noVar.mo41244V0()) {
                        byte[] bArr2 = ws3.f37111a;
                        int i3 = (int) ((((long) ws3.f37108a) + j) - j2);
                        int i4 = ws3.f37112b;
                        while (i < i4) {
                            byte b2 = bArr2[i];
                            int length = O.length;
                            int i5 = 0;
                            while (i5 < length) {
                                if (b2 != O[i5]) {
                                    i5++;
                                }
                            }
                            i3 = i + 1;
                        }
                        j2 += (long) (ws3.f37112b - ws3.f37108a);
                        ws3 = ws3.f37109a;
                        jt1.m53774m(ws3);
                        j = j2;
                    }
                }
                return -1;
            }
            while (true) {
                long j4 = ((long) (ws3.f37112b - ws3.f37108a)) + j3;
                if (j4 > j) {
                    break;
                }
                ws3 = ws3.f37109a;
                jt1.m53774m(ws3);
                j3 = j4;
            }
            if (frVar.mo36274j0() == 2) {
                byte y3 = frVar.mo36284y(0);
                byte y4 = frVar.mo36284y(1);
                while (j2 < noVar.mo41244V0()) {
                    byte[] bArr3 = ws3.f37111a;
                    int i6 = (int) ((((long) ws3.f37108a) + j) - j2);
                    int i7 = ws3.f37112b;
                    while (i < i7) {
                        byte b3 = bArr3[i];
                        if (!(b3 == y3 || b3 == y4)) {
                            i6 = i + 1;
                        }
                    }
                    j3 = j2 + ((long) (ws3.f37112b - ws3.f37108a));
                    ws3 = ws3.f37109a;
                    jt1.m53774m(ws3);
                    j = j3;
                }
            } else {
                byte[] O2 = frVar.mo31162O();
                while (j2 < noVar.mo41244V0()) {
                    byte[] bArr4 = ws3.f37111a;
                    int i8 = (int) ((((long) ws3.f37108a) + j) - j2);
                    int i9 = ws3.f37112b;
                    while (i < i9) {
                        byte b4 = bArr4[i];
                        int length2 = O2.length;
                        int i10 = 0;
                        while (i10 < length2) {
                            if (b4 != O2[i10]) {
                                i10++;
                            }
                        }
                        i8 = i + 1;
                    }
                    j3 = j2 + ((long) (ws3.f37112b - ws3.f37108a));
                    ws3 = ws3.f37109a;
                    jt1.m53774m(ws3);
                    j = j3;
                }
            }
            return -1;
            return ((long) (i - ws3.f37108a)) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    /* renamed from: k */
    public static final boolean m61511k(@vr2 C6205no noVar, long j, @vr2 C5301fr frVar, int i, int i2) {
        jt1.m53777p(noVar, "$this$commonRangeEquals");
        jt1.m53777p(frVar, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || noVar.mo41244V0() - j < ((long) i2) || frVar.mo36274j0() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (noVar.mo41249Z(((long) i3) + j) != frVar.mo36284y(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public static final int m61512l(@vr2 C6205no noVar, @vr2 byte[] bArr) {
        jt1.m53777p(noVar, "$this$commonRead");
        jt1.m53777p(bArr, "sink");
        return noVar.read(bArr, 0, bArr.length);
    }

    /* renamed from: m */
    public static final int m61513m(@vr2 C6205no noVar, @vr2 byte[] bArr, int i, int i2) {
        jt1.m53777p(noVar, "$this$commonRead");
        jt1.m53777p(bArr, "sink");
        C5950l.m55169e((long) bArr.length, (long) i, (long) i2);
        ws3 ws3 = noVar.f32655a;
        if (ws3 == null) {
            return -1;
        }
        int min = Math.min(i2, ws3.f37112b - ws3.f37108a);
        byte[] bArr2 = ws3.f37111a;
        int i3 = ws3.f37108a;
        C7458za.m72840W0(bArr2, bArr, i, i3, i3 + min);
        ws3.f37108a += min;
        noVar.mo41237P0(noVar.mo41244V0() - ((long) min));
        if (ws3.f37108a == ws3.f37112b) {
            noVar.f32655a = ws3.mo46873b();
            zs3.m74279d(ws3);
        }
        return min;
    }

    /* renamed from: n */
    public static final long m61514n(@vr2 C6205no noVar, @vr2 C6205no noVar2, long j) {
        jt1.m53777p(noVar, "$this$commonRead");
        jt1.m53777p(noVar2, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (noVar.mo41244V0() == 0) {
            return -1;
        } else {
            if (j > noVar.mo41244V0()) {
                j = noVar.mo41244V0();
            }
            noVar2.write(noVar, j);
            return j;
        }
    }

    /* renamed from: o */
    public static final long m61515o(@vr2 C6205no noVar, @vr2 oz3 oz3) {
        jt1.m53777p(noVar, "$this$commonReadAll");
        jt1.m53777p(oz3, "sink");
        long V0 = noVar.mo41244V0();
        if (V0 > 0) {
            oz3.write(noVar, V0);
        }
        return V0;
    }

    /* renamed from: p */
    public static final byte m61516p(@vr2 C6205no noVar) {
        jt1.m53777p(noVar, "$this$commonReadByte");
        if (noVar.mo41244V0() != 0) {
            ws3 ws3 = noVar.f32655a;
            jt1.m53774m(ws3);
            int i = ws3.f37108a;
            int i2 = ws3.f37112b;
            int i3 = i + 1;
            byte b = ws3.f37111a[i];
            noVar.mo41237P0(noVar.mo41244V0() - 1);
            if (i3 == i2) {
                noVar.f32655a = ws3.mo46873b();
                zs3.m74279d(ws3);
            } else {
                ws3.f37108a = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    @vr2
    /* renamed from: q */
    public static final byte[] m61517q(@vr2 C6205no noVar) {
        jt1.m53777p(noVar, "$this$commonReadByteArray");
        return noVar.mo31691k1(noVar.mo41244V0());
    }

    @vr2
    /* renamed from: r */
    public static final byte[] m61518r(@vr2 C6205no noVar, long j) {
        jt1.m53777p(noVar, "$this$commonReadByteArray");
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (noVar.mo41244V0() >= j) {
            byte[] bArr = new byte[((int) j)];
            noVar.readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    @vr2
    /* renamed from: s */
    public static final C5301fr m61519s(@vr2 C6205no noVar) {
        jt1.m53777p(noVar, "$this$commonReadByteString");
        return noVar.mo31672I(noVar.mo41244V0());
    }

    @vr2
    /* renamed from: t */
    public static final C5301fr m61520t(@vr2 C6205no noVar, long j) {
        jt1.m53777p(noVar, "$this$commonReadByteString");
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (noVar.mo41244V0() < j) {
            throw new EOFException();
        } else if (j < ((long) 4096)) {
            return new C5301fr(noVar.mo31691k1(j));
        } else {
            C5301fr c1 = noVar.mo41257c1((int) j);
            noVar.mo31670F1(j);
            return c1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r0 = new com.onedelhi.secure.C6205no().mo41242S1(r3).mo41230L0(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r6 != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        r0.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        throw new java.lang.NumberFormatException("Number too large: " + r0.mo31688j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
        if (r10 != r11) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b3, code lost:
        r0.f32655a = r16.mo46873b();
        com.onedelhi.secure.zs3.m74279d(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bd, code lost:
        r16.f37108a = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c1, code lost:
        if (r7 != false) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093 A[SYNTHETIC] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m61521u(@com.onedelhi.secure.vr2 com.onedelhi.secure.C6205no r17) {
        /*
            r0 = r17
            java.lang.String r1 = "$this$commonReadDecimalLong"
            com.onedelhi.secure.jt1.m53777p(r0, r1)
            long r1 = r17.mo41244V0()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00d5
            r1 = -7
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0016:
            com.onedelhi.secure.ws3 r8 = r0.f32655a
            com.onedelhi.secure.jt1.m53774m(r8)
            byte[] r9 = r8.f37111a
            int r10 = r8.f37108a
            int r11 = r8.f37112b
        L_0x0021:
            r12 = 1
            if (r10 >= r11) goto L_0x00ae
            byte r13 = r9[r10]
            r14 = 48
            byte r14 = (byte) r14
            if (r13 < r14) goto L_0x0079
            r15 = 57
            byte r15 = (byte) r15
            if (r13 > r15) goto L_0x0079
            int r14 = r14 - r13
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x004c
            r15 = r7
            r16 = r8
            if (r12 != 0) goto L_0x0045
            long r7 = (long) r14
            int r12 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x0045
            goto L_0x004c
        L_0x0045:
            r7 = 10
            long r3 = r3 * r7
            long r7 = (long) r14
            long r3 = r3 + r7
            goto L_0x0087
        L_0x004c:
            com.onedelhi.secure.no r0 = new com.onedelhi.secure.no
            r0.<init>()
            com.onedelhi.secure.no r0 = r0.mo41242S1(r3)
            com.onedelhi.secure.no r0 = r0.mo41230L0(r13)
            if (r6 != 0) goto L_0x005e
            r0.readByte()
        L_0x005e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo31688j()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0079:
            r15 = r7
            r16 = r8
            r7 = 45
            byte r7 = (byte) r7
            if (r13 != r7) goto L_0x008f
            if (r5 != 0) goto L_0x008f
            r6 = 1
            long r1 = r1 - r6
            r6 = 1
        L_0x0087:
            int r10 = r10 + 1
            int r5 = r5 + 1
            r7 = r15
            r8 = r16
            goto L_0x0021
        L_0x008f:
            if (r5 == 0) goto L_0x0093
            r7 = 1
            goto L_0x00b1
        L_0x0093:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            java.lang.String r2 = com.onedelhi.secure.C5950l.m55177m(r13)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ae:
            r15 = r7
            r16 = r8
        L_0x00b1:
            if (r10 != r11) goto L_0x00bd
            com.onedelhi.secure.ws3 r8 = r16.mo46873b()
            r0.f32655a = r8
            com.onedelhi.secure.zs3.m74279d(r16)
            goto L_0x00c1
        L_0x00bd:
            r8 = r16
            r8.f37108a = r10
        L_0x00c1:
            if (r7 != 0) goto L_0x00c7
            com.onedelhi.secure.ws3 r8 = r0.f32655a
            if (r8 != 0) goto L_0x0016
        L_0x00c7:
            long r1 = r17.mo41244V0()
            long r7 = (long) r5
            long r1 = r1 - r7
            r0.mo41237P0(r1)
            if (r6 == 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            long r3 = -r3
        L_0x00d4:
            return r3
        L_0x00d5:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6467po.m61521u(com.onedelhi.secure.no):long");
    }

    /* renamed from: v */
    public static final void m61522v(@vr2 C6205no noVar, @vr2 C6205no noVar2, long j) {
        jt1.m53777p(noVar, "$this$commonReadFully");
        jt1.m53777p(noVar2, "sink");
        if (noVar.mo41244V0() >= j) {
            noVar2.write(noVar, j);
        } else {
            noVar2.write(noVar, noVar.mo41244V0());
            throw new EOFException();
        }
    }

    /* renamed from: w */
    public static final void m61523w(@vr2 C6205no noVar, @vr2 byte[] bArr) {
        jt1.m53777p(noVar, "$this$commonReadFully");
        jt1.m53777p(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = noVar.read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009f A[EDGE_INSN: B:44:0x009f->B:28:0x009f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001f  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m61524x(@com.onedelhi.secure.vr2 com.onedelhi.secure.C6205no r15) {
        /*
            java.lang.String r0 = "$this$commonReadHexadecimalUnsignedLong"
            com.onedelhi.secure.jt1.m53777p(r15, r0)
            long r0 = r15.mo41244V0()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00bd
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x0012:
            com.onedelhi.secure.ws3 r6 = r15.f32655a
            com.onedelhi.secure.jt1.m53774m(r6)
            byte[] r7 = r6.f37111a
            int r8 = r6.f37108a
            int r9 = r6.f37112b
        L_0x001d:
            if (r8 >= r9) goto L_0x009f
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x002e
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x002e
            int r11 = r10 - r11
            goto L_0x0048
        L_0x002e:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x003d
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x003d
        L_0x0038:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0048
        L_0x003d:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0080
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0080
            goto L_0x0038
        L_0x0048:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0058
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x001d
        L_0x0058:
            com.onedelhi.secure.no r15 = new com.onedelhi.secure.no
            r15.<init>()
            com.onedelhi.secure.no r15 = r15.mo41261e1(r4)
            com.onedelhi.secure.no r15 = r15.mo41230L0(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r15 = r15.mo31688j()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L_0x0080:
            if (r0 == 0) goto L_0x0084
            r1 = 1
            goto L_0x009f
        L_0x0084:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = com.onedelhi.secure.C5950l.m55177m(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x009f:
            if (r8 != r9) goto L_0x00ab
            com.onedelhi.secure.ws3 r7 = r6.mo46873b()
            r15.f32655a = r7
            com.onedelhi.secure.zs3.m74279d(r6)
            goto L_0x00ad
        L_0x00ab:
            r6.f37108a = r8
        L_0x00ad:
            if (r1 != 0) goto L_0x00b3
            com.onedelhi.secure.ws3 r6 = r15.f32655a
            if (r6 != 0) goto L_0x0012
        L_0x00b3:
            long r1 = r15.mo41244V0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.mo41237P0(r1)
            return r4
        L_0x00bd:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6467po.m61524x(com.onedelhi.secure.no):long");
    }

    /* renamed from: y */
    public static final int m61525y(@vr2 C6205no noVar) {
        jt1.m53777p(noVar, "$this$commonReadInt");
        if (noVar.mo41244V0() >= 4) {
            ws3 ws3 = noVar.f32655a;
            jt1.m53774m(ws3);
            int i = ws3.f37108a;
            int i2 = ws3.f37112b;
            if (((long) (i2 - i)) < 4) {
                return (noVar.readByte() & 255) | ((noVar.readByte() & 255) << 24) | ((noVar.readByte() & 255) << 16) | ((noVar.readByte() & 255) << 8);
            }
            byte[] bArr = ws3.f37111a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            noVar.mo41237P0(noVar.mo41244V0() - 4);
            if (i6 == i2) {
                noVar.f32655a = ws3.mo46873b();
                zs3.m74279d(ws3);
            } else {
                ws3.f37108a = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    /* renamed from: z */
    public static final long m61526z(@vr2 C6205no noVar) {
        jt1.m53777p(noVar, "$this$commonReadLong");
        if (noVar.mo41244V0() >= 8) {
            ws3 ws3 = noVar.f32655a;
            jt1.m53774m(ws3);
            int i = ws3.f37108a;
            int i2 = ws3.f37112b;
            if (((long) (i2 - i)) < 8) {
                return ((((long) noVar.readInt()) & ZipConstants.ZIP64_MAGIC) << 32) | (ZipConstants.ZIP64_MAGIC & ((long) noVar.readInt()));
            }
            byte[] bArr = ws3.f37111a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40);
            int i6 = i5 + 1;
            long j2 = ((((long) bArr[i5]) & 255) << 32) | j;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j3 = j2 | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j4 = j3 | ((((long) bArr[i8]) & 255) << 8) | (((long) bArr[i9]) & 255);
            noVar.mo41237P0(noVar.mo41244V0() - 8);
            if (i10 == i2) {
                noVar.f32655a = ws3.mo46873b();
                zs3.m74279d(ws3);
            } else {
                ws3.f37108a = i10;
            }
            return j4;
        }
        throw new EOFException();
    }
}
