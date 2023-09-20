package com.onedelhi.secure;

import java.io.EOFException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\b\u001a\r\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\b\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\b\u001a\u0015\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\b\u001a\r\u0010\f\u001a\u00020\u000b*\u00020\u0000H\b\u001a\r\u0010\u000e\u001a\u00020\r*\u00020\u0000H\b\u001a\u0015\u0010\u000f\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\b\u001a\u0015\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\b\u001a\r\u0010\u0015\u001a\u00020\u0014*\u00020\u0000H\b\u001a\u0015\u0010\u0016\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\b\u001a\u0015\u0010\u0017\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0014H\b\u001a%\u0010\u0019\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0012H\b\u001a\u001d\u0010\u001a\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\b\u001a\u0015\u0010\u001c\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001bH\b\u001a\r\u0010\u001e\u001a\u00020\u001d*\u00020\u0000H\b\u001a\u0015\u0010\u001f\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\b\u001a\u000f\u0010 \u001a\u0004\u0018\u00010\u001d*\u00020\u0000H\b\u001a\u0015\u0010\"\u001a\u00020\u001d*\u00020\u00002\u0006\u0010!\u001a\u00020\u0003H\b\u001a\r\u0010#\u001a\u00020\u0012*\u00020\u0000H\b\u001a\r\u0010%\u001a\u00020$*\u00020\u0000H\b\u001a\r\u0010&\u001a\u00020$*\u00020\u0000H\b\u001a\r\u0010'\u001a\u00020\u0012*\u00020\u0000H\b\u001a\r\u0010(\u001a\u00020\u0012*\u00020\u0000H\b\u001a\r\u0010)\u001a\u00020\u0003*\u00020\u0000H\b\u001a\r\u0010*\u001a\u00020\u0003*\u00020\u0000H\b\u001a\r\u0010+\u001a\u00020\u0003*\u00020\u0000H\b\u001a\r\u0010,\u001a\u00020\u0003*\u00020\u0000H\b\u001a\u0015\u0010-\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\b\u001a%\u00100\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0003H\b\u001a\u001d\u00102\u001a\u00020\u0003*\u00020\u00002\u0006\u00101\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0003H\b\u001a\u001d\u00104\u001a\u00020\u0003*\u00020\u00002\u0006\u00103\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0003H\b\u001a-\u00106\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u00101\u001a\u00020\r2\u0006\u00105\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0012H\b\u001a\r\u00108\u001a\u000207*\u00020\u0000H\b\u001a\r\u00109\u001a\u00020\b*\u00020\u0000H\b\u001a\r\u0010;\u001a\u00020:*\u00020\u0000H\b\u001a\r\u0010<\u001a\u00020\u001d*\u00020\u0000H\b¨\u0006="}, d2 = {"Lcom/onedelhi/secure/bg3;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "i", "", "b", "Lcom/onedelhi/secure/un4;", "F", "E", "", "k", "Lcom/onedelhi/secure/fr;", "n", "o", "Lcom/onedelhi/secure/yw2;", "options", "", "G", "", "l", "m", "r", "offset", "h", "q", "Lcom/onedelhi/secure/oz3;", "j", "", "z", "A", "C", "limit", "D", "B", "", "x", "y", "t", "u", "v", "w", "p", "s", "H", "fromIndex", "toIndex", "c", "bytes", "d", "targetBytes", "e", "bytesOffset", "g", "Lcom/onedelhi/secure/to;", "f", "a", "Lcom/onedelhi/secure/me4;", "I", "J", "okio"}, k = 2, mv = {1, 4, 0})
public final class cg3 {
    @vr2
    /* renamed from: A */
    public static final String m40927A(@vr2 bg3 bg3, long j) {
        jt1.m53777p(bg3, "$this$commonReadUtf8");
        bg3.mo31694o(j);
        return bg3.f26339a.mo31698r1(j);
    }

    /* renamed from: B */
    public static final int m40928B(@vr2 bg3 bg3) {
        long j;
        jt1.m53777p(bg3, "$this$commonReadUtf8CodePoint");
        bg3.mo31694o(1);
        byte Z = bg3.f26339a.mo41249Z(0);
        if ((Z & 224) == 192) {
            j = 2;
        } else if ((Z & 240) == 224) {
            j = 3;
        } else {
            if ((Z & 248) == 240) {
                j = 4;
            }
            return bg3.f26339a.mo31669D0();
        }
        bg3.mo31694o(j);
        return bg3.f26339a.mo31669D0();
    }

    @ss2
    /* renamed from: C */
    public static final String m40929C(@vr2 bg3 bg3) {
        jt1.m53777p(bg3, "$this$commonReadUtf8Line");
        long i = bg3.mo31686i((byte) 10);
        if (i != -1) {
            return C6467po.m61499b0(bg3.f26339a, i);
        }
        if (bg3.f26339a.mo41244V0() != 0) {
            return bg3.mo31698r1(bg3.f26339a.mo41244V0());
        }
        return null;
    }

    @vr2
    /* renamed from: D */
    public static final String m40930D(@vr2 bg3 bg3, long j) {
        jt1.m53777p(bg3, "$this$commonReadUtf8LineStrict");
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long s0 = bg3.mo31708s0(b, 0, j2);
            if (s0 != -1) {
                return C6467po.m61499b0(bg3.f26339a, s0);
            }
            if (j2 < Long.MAX_VALUE && bg3.mo31677T(j2) && bg3.f26339a.mo41249Z(j2 - 1) == ((byte) 13) && bg3.mo31677T(1 + j2) && bg3.f26339a.mo41249Z(j2) == b) {
                return C6467po.m61499b0(bg3.f26339a, j2);
            }
            C6205no noVar = new C6205no();
            C6205no noVar2 = bg3.f26339a;
            noVar2.mo41278m(noVar, 0, Math.min((long) 32, noVar2.mo41244V0()));
            throw new EOFException("\\n not found: limit=" + Math.min(bg3.f26339a.mo41244V0(), j) + " content=" + noVar.mo31697r0().mo31159D() + m00.f31887b);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    /* renamed from: E */
    public static final boolean m40931E(@vr2 bg3 bg3, long j) {
        jt1.m53777p(bg3, "$this$commonRequest");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!bg3.f26341b) {
            while (bg3.f26339a.mo41244V0() < j) {
                if (bg3.f26340a.read(bg3.f26339a, (long) 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: F */
    public static final void m40932F(@vr2 bg3 bg3, long j) {
        jt1.m53777p(bg3, "$this$commonRequire");
        if (!bg3.mo31677T(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: G */
    public static final int m40933G(@vr2 bg3 bg3, @vr2 yw2 yw2) {
        jt1.m53777p(bg3, "$this$commonSelect");
        jt1.m53777p(yw2, "options");
        if (!bg3.f26341b) {
            do {
                int d0 = C6467po.m61503d0(bg3.f26339a, yw2, true);
                if (d0 != -2) {
                    if (d0 == -1) {
                        return -1;
                    }
                    bg3.f26339a.mo31670F1((long) yw2.mo48022i()[d0].mo36274j0());
                    return d0;
                }
            } while (bg3.f26340a.read(bg3.f26339a, (long) 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: H */
    public static final void m40934H(@vr2 bg3 bg3, long j) {
        jt1.m53777p(bg3, "$this$commonSkip");
        if (!bg3.f26341b) {
            while (j > 0) {
                if (bg3.f26339a.mo41244V0() == 0 && bg3.f26340a.read(bg3.f26339a, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, bg3.f26339a.mo41244V0());
                bg3.f26339a.mo31670F1(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @vr2
    /* renamed from: I */
    public static final me4 m40935I(@vr2 bg3 bg3) {
        jt1.m53777p(bg3, "$this$commonTimeout");
        return bg3.f26340a.timeout();
    }

    @vr2
    /* renamed from: J */
    public static final String m40936J(@vr2 bg3 bg3) {
        jt1.m53777p(bg3, "$this$commonToString");
        return "buffer(" + bg3.f26340a + ')';
    }

    /* renamed from: a */
    public static final void m40937a(@vr2 bg3 bg3) {
        jt1.m53777p(bg3, "$this$commonClose");
        if (!bg3.f26341b) {
            bg3.f26341b = true;
            bg3.f26340a.close();
            bg3.f26339a.mo41255c();
        }
    }

    /* renamed from: b */
    public static final boolean m40938b(@vr2 bg3 bg3) {
        jt1.m53777p(bg3, "$this$commonExhausted");
        if (!bg3.f26341b) {
            return bg3.f26339a.mo31685f2() && bg3.f26340a.read(bg3.f26339a, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: c */
    public static final long m40939c(@vr2 bg3 bg3, byte b, long j, long j2) {
        jt1.m53777p(bg3, "$this$commonIndexOf");
        boolean z = true;
        if (!bg3.f26341b) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long s0 = bg3.f26339a.mo31708s0(b, j, j2);
                    if (s0 == -1) {
                        long V0 = bg3.f26339a.mo41244V0();
                        if (V0 >= j2 || bg3.f26340a.read(bg3.f26339a, (long) 8192) == -1) {
                            break;
                        }
                        j = Math.max(j, V0);
                    } else {
                        return s0;
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: d */
    public static final long m40940d(@vr2 bg3 bg3, @vr2 C5301fr frVar, long j) {
        jt1.m53777p(bg3, "$this$commonIndexOf");
        jt1.m53777p(frVar, "bytes");
        if (!bg3.f26341b) {
            while (true) {
                long a0 = bg3.f26339a.mo31680a0(frVar, j);
                if (a0 != -1) {
                    return a0;
                }
                long V0 = bg3.f26339a.mo41244V0();
                if (bg3.f26340a.read(bg3.f26339a, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (V0 - ((long) frVar.mo36274j0())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: e */
    public static final long m40941e(@vr2 bg3 bg3, @vr2 C5301fr frVar, long j) {
        jt1.m53777p(bg3, "$this$commonIndexOfElement");
        jt1.m53777p(frVar, "targetBytes");
        if (!bg3.f26341b) {
            while (true) {
                long k = bg3.f26339a.mo31689k(frVar, j);
                if (k != -1) {
                    return k;
                }
                long V0 = bg3.f26339a.mo41244V0();
                if (bg3.f26340a.read(bg3.f26339a, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, V0);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @vr2
    /* renamed from: f */
    public static final C6893to m40942f(@vr2 bg3 bg3) {
        jt1.m53777p(bg3, "$this$commonPeek");
        return gu2.m49835d(new b13(bg3));
    }

    /* renamed from: g */
    public static final boolean m40943g(@vr2 bg3 bg3, long j, @vr2 C5301fr frVar, int i, int i2) {
        jt1.m53777p(bg3, "$this$commonRangeEquals");
        jt1.m53777p(frVar, "bytes");
        if (!(!bg3.f26341b)) {
            throw new IllegalStateException("closed".toString());
        } else if (j < 0 || i < 0 || i2 < 0 || frVar.mo36274j0() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!bg3.mo31677T(1 + j2) || bg3.f26339a.mo41249Z(j2) != frVar.mo36284y(i + i3)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: h */
    public static final int m40944h(@vr2 bg3 bg3, @vr2 byte[] bArr, int i, int i2) {
        jt1.m53777p(bg3, "$this$commonRead");
        jt1.m53777p(bArr, "sink");
        long j = (long) i2;
        C5950l.m55169e((long) bArr.length, (long) i, j);
        if (bg3.f26339a.mo41244V0() == 0 && bg3.f26340a.read(bg3.f26339a, (long) 8192) == -1) {
            return -1;
        }
        return bg3.f26339a.read(bArr, i, (int) Math.min(j, bg3.f26339a.mo41244V0()));
    }

    /* renamed from: i */
    public static final long m40945i(@vr2 bg3 bg3, @vr2 C6205no noVar, long j) {
        jt1.m53777p(bg3, "$this$commonRead");
        jt1.m53777p(noVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(true ^ bg3.f26341b)) {
            throw new IllegalStateException("closed".toString());
        } else if (bg3.f26339a.mo41244V0() == 0 && bg3.f26340a.read(bg3.f26339a, (long) 8192) == -1) {
            return -1;
        } else {
            return bg3.f26339a.read(noVar, Math.min(j, bg3.f26339a.mo41244V0()));
        }
    }

    /* renamed from: j */
    public static final long m40946j(@vr2 bg3 bg3, @vr2 oz3 oz3) {
        C6205no noVar;
        jt1.m53777p(bg3, "$this$commonReadAll");
        jt1.m53777p(oz3, "sink");
        long j = 0;
        while (true) {
            int i = (bg3.f26340a.read(bg3.f26339a, (long) 8192) > -1 ? 1 : (bg3.f26340a.read(bg3.f26339a, (long) 8192) == -1 ? 0 : -1));
            noVar = bg3.f26339a;
            if (i == 0) {
                break;
            }
            long g = noVar.mo41264g();
            if (g > 0) {
                j += g;
                oz3.write(bg3.f26339a, g);
            }
        }
        if (noVar.mo41244V0() <= 0) {
            return j;
        }
        long V0 = j + bg3.f26339a.mo41244V0();
        C6205no noVar2 = bg3.f26339a;
        oz3.write(noVar2, noVar2.mo41244V0());
        return V0;
    }

    /* renamed from: k */
    public static final byte m40947k(@vr2 bg3 bg3) {
        jt1.m53777p(bg3, "$this$commonReadByte");
        bg3.mo31694o(1);
        return bg3.f26339a.readByte();
    }

    @vr2
    /* renamed from: l */
    public static final byte[] m40948l(@vr2 bg3 bg3) {
        jt1.m53777p(bg3, "$this$commonReadByteArray");
        bg3.f26339a.mo41235N(bg3.f26340a);
        return bg3.f26339a.mo31713u2();
    }

    @vr2
    /* renamed from: m */
    public static final byte[] m40949m(@vr2 bg3 bg3, long j) {
        jt1.m53777p(bg3, "$this$commonReadByteArray");
        bg3.mo31694o(j);
        return bg3.f26339a.mo31691k1(j);
    }

    @vr2
    /* renamed from: n */
    public static final C5301fr m40950n(@vr2 bg3 bg3) {
        jt1.m53777p(bg3, "$this$commonReadByteString");
        bg3.f26339a.mo41235N(bg3.f26340a);
        return bg3.f26339a.mo31697r0();
    }

    @vr2
    /* renamed from: o */
    public static final C5301fr m40951o(@vr2 bg3 bg3, long j) {
        jt1.m53777p(bg3, "$this$commonReadByteString");
        bg3.mo31694o(j);
        return bg3.f26339a.mo31672I(j);
    }

    /* renamed from: p */
    public static final long m40952p(@vr2 bg3 bg3) {
        int i;
        jt1.m53777p(bg3, "$this$commonReadDecimalLong");
        bg3.mo31694o(1);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!bg3.mo31677T(j2)) {
                break;
            }
            byte Z = bg3.f26339a.mo41249Z(j);
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
        return bg3.f26339a.mo31681b0();
    }

    /* renamed from: q */
    public static final void m40953q(@vr2 bg3 bg3, @vr2 C6205no noVar, long j) {
        jt1.m53777p(bg3, "$this$commonReadFully");
        jt1.m53777p(noVar, "sink");
        try {
            bg3.mo31694o(j);
            bg3.f26339a.mo31683e2(noVar, j);
        } catch (EOFException e) {
            noVar.mo41235N(bg3.f26339a);
            throw e;
        }
    }

    /* renamed from: r */
    public static final void m40954r(@vr2 bg3 bg3, @vr2 byte[] bArr) {
        jt1.m53777p(bg3, "$this$commonReadFully");
        jt1.m53777p(bArr, "sink");
        try {
            bg3.mo31694o((long) bArr.length);
            bg3.f26339a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (bg3.f26339a.mo41244V0() > 0) {
                C6205no noVar = bg3.f26339a;
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

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m40955s(@com.onedelhi.secure.vr2 com.onedelhi.secure.bg3 r5) {
        /*
            java.lang.String r0 = "$this$commonReadHexadecimalUnsignedLong"
            com.onedelhi.secure.jt1.m53777p(r5, r0)
            r0 = 1
            r5.mo31694o(r0)
            r0 = 0
        L_0x000b:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.mo31677T(r2)
            if (r2 == 0) goto L_0x0069
            com.onedelhi.secure.no r2 = r5.f26339a
            long r3 = (long) r0
            byte r2 = r2.mo41249Z(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0025
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x003a
        L_0x0025:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002f
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x003a
        L_0x002f:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x003c
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r0 = r1
            goto L_0x000b
        L_0x003c:
            if (r0 == 0) goto L_0x003f
            goto L_0x0069
        L_0x003f:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            r1 = 16
            int r1 = com.onedelhi.secure.C5327fx.m48539a(r1)
            int r1 = com.onedelhi.secure.C5327fx.m48539a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            com.onedelhi.secure.jt1.m53776o(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0069:
            com.onedelhi.secure.no r5 = r5.f26339a
            long r0 = r5.mo31709s2()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.cg3.m40955s(com.onedelhi.secure.bg3):long");
    }

    /* renamed from: t */
    public static final int m40956t(@vr2 bg3 bg3) {
        jt1.m53777p(bg3, "$this$commonReadInt");
        bg3.mo31694o(4);
        return bg3.f26339a.readInt();
    }

    /* renamed from: u */
    public static final int m40957u(@vr2 bg3 bg3) {
        jt1.m53777p(bg3, "$this$commonReadIntLe");
        bg3.mo31694o(4);
        return bg3.f26339a.mo31693n1();
    }

    /* renamed from: v */
    public static final long m40958v(@vr2 bg3 bg3) {
        jt1.m53777p(bg3, "$this$commonReadLong");
        bg3.mo31694o(8);
        return bg3.f26339a.readLong();
    }

    /* renamed from: w */
    public static final long m40959w(@vr2 bg3 bg3) {
        jt1.m53777p(bg3, "$this$commonReadLongLe");
        bg3.mo31694o(8);
        return bg3.f26339a.mo31679Y1();
    }

    /* renamed from: x */
    public static final short m40960x(@vr2 bg3 bg3) {
        jt1.m53777p(bg3, "$this$commonReadShort");
        bg3.mo31694o(2);
        return bg3.f26339a.readShort();
    }

    /* renamed from: y */
    public static final short m40961y(@vr2 bg3 bg3) {
        jt1.m53777p(bg3, "$this$commonReadShortLe");
        bg3.mo31694o(2);
        return bg3.f26339a.mo31711t1();
    }

    @vr2
    /* renamed from: z */
    public static final String m40962z(@vr2 bg3 bg3) {
        jt1.m53777p(bg3, "$this$commonReadUtf8");
        bg3.f26339a.mo41235N(bg3.f26340a);
        return bg3.f26339a.mo31688j();
    }
}
