package com.onedelhi.secure;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class vf0 {

    /* renamed from: a */
    public static final int f36529a = 1;

    /* renamed from: a */
    public static final char[] f36530a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: com.onedelhi.secure.vf0$a */
    public static /* synthetic */ class C7048a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36531a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onedelhi.secure.oj2[] r0 = com.onedelhi.secure.oj2.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36531a = r0
                com.onedelhi.secure.oj2 r1 = com.onedelhi.secure.oj2.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36531a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.oj2 r1 = com.onedelhi.secure.oj2.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36531a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.oj2 r1 = com.onedelhi.secure.oj2.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36531a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.oj2 r1 = com.onedelhi.secure.oj2.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36531a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.oj2 r1 = com.onedelhi.secure.oj2.TERMINATOR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36531a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.oj2 r1 = com.onedelhi.secure.oj2.FNC1_FIRST_POSITION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36531a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.oj2 r1 = com.onedelhi.secure.oj2.FNC1_SECOND_POSITION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f36531a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.onedelhi.secure.oj2 r1 = com.onedelhi.secure.oj2.STRUCTURED_APPEND     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f36531a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.onedelhi.secure.oj2 r1 = com.onedelhi.secure.oj2.ECI     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f36531a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.onedelhi.secure.oj2 r1 = com.onedelhi.secure.oj2.HANZI     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vf0.C7048a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static gg0 m68012a(byte[] bArr, ts4 ts4, kv0 kv0, Map<pf0, ?> map) throws ha1 {
        oj2 oj2;
        ts4 ts42 = ts4;
        C6705rl rlVar = new C6705rl(bArr);
        StringBuilder sb = new StringBuilder(50);
        int i = 1;
        ArrayList arrayList = new ArrayList(1);
        C4597ax axVar = null;
        boolean z = false;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            try {
                oj2 a = rlVar.mo43935a() < 4 ? oj2.TERMINATOR : oj2.m59423a(rlVar.mo43938d(4));
                int[] iArr = C7048a.f36531a;
                switch (iArr[a.ordinal()]) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                        oj2 = a;
                        z = true;
                        break;
                    case 8:
                        if (rlVar.mo43935a() >= 16) {
                            int d = rlVar.mo43938d(8);
                            i3 = rlVar.mo43938d(8);
                            i2 = d;
                            break;
                        } else {
                            throw ha1.m50341a();
                        }
                    case 9:
                        axVar = C4597ax.m39175b(m68018g(rlVar));
                        if (axVar == null) {
                            throw ha1.m50341a();
                        }
                        break;
                    case 10:
                        int d2 = rlVar.mo43938d(4);
                        int d3 = rlVar.mo43938d(a.mo41793e(ts42));
                        if (d2 == i) {
                            m68015d(rlVar, sb, d3);
                            break;
                        }
                        break;
                    default:
                        int d4 = rlVar.mo43938d(a.mo41793e(ts42));
                        int i4 = iArr[a.ordinal()];
                        if (i4 != i) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    oj2 = a;
                                    m68014c(rlVar, sb, d4, axVar, arrayList, map);
                                    break;
                                } else if (i4 == 4) {
                                    m68016e(rlVar, sb, d4);
                                    break;
                                } else {
                                    throw ha1.m50341a();
                                }
                            } else {
                                oj2 = a;
                                m68013b(rlVar, sb, d4, z);
                                break;
                            }
                        } else {
                            oj2 = a;
                            m68017f(rlVar, sb, d4);
                            break;
                        }
                }
                oj2 = a;
                if (oj2 == oj2.TERMINATOR) {
                    return new gg0(bArr, sb.toString(), arrayList.isEmpty() ? null : arrayList, kv0 == null ? null : kv0.toString(), i2, i3);
                }
                i = 1;
            } catch (IllegalArgumentException unused) {
                throw ha1.m50341a();
            }
        }
    }

    /* renamed from: b */
    public static void m68013b(C6705rl rlVar, StringBuilder sb, int i, boolean z) throws ha1 {
        while (i > 1) {
            if (rlVar.mo43935a() >= 11) {
                int d = rlVar.mo43938d(11);
                sb.append(m68019h(d / 45));
                sb.append(m68019h(d % 45));
                i -= 2;
            } else {
                throw ha1.m50341a();
            }
        }
        if (i == 1) {
            if (rlVar.mo43935a() >= 6) {
                sb.append(m68019h(rlVar.mo43938d(6)));
            } else {
                throw ha1.m50341a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, tf0.f35560o);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m68014c(C6705rl rlVar, StringBuilder sb, int i, C4597ax axVar, Collection<byte[]> collection, Map<pf0, ?> map) throws ha1 {
        if ((i << 3) <= rlVar.mo43935a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) rlVar.mo43938d(8);
            }
            try {
                sb.append(new String(bArr, axVar == null ? g54.m49088a(bArr, map) : axVar.name()));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw ha1.m50341a();
            }
        } else {
            throw ha1.m50341a();
        }
    }

    /* renamed from: d */
    public static void m68015d(C6705rl rlVar, StringBuilder sb, int i) throws ha1 {
        if (i * 13 <= rlVar.mo43935a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = rlVar.mo43938d(13);
                int i3 = (d % 96) | ((d / 96) << 8);
                int i4 = i3 + (i3 < 2560 ? 41377 : 42657);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, g54.f28951c));
            } catch (UnsupportedEncodingException unused) {
                throw ha1.m50341a();
            }
        } else {
            throw ha1.m50341a();
        }
    }

    /* renamed from: e */
    public static void m68016e(C6705rl rlVar, StringBuilder sb, int i) throws ha1 {
        if (i * 13 <= rlVar.mo43935a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = rlVar.mo43938d(13);
                int i3 = (d % 192) | ((d / 192) << 8);
                int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, g54.f28950b));
            } catch (UnsupportedEncodingException unused) {
                throw ha1.m50341a();
            }
        } else {
            throw ha1.m50341a();
        }
    }

    /* renamed from: f */
    public static void m68017f(C6705rl rlVar, StringBuilder sb, int i) throws ha1 {
        while (i >= 3) {
            if (rlVar.mo43935a() >= 10) {
                int d = rlVar.mo43938d(10);
                if (d < 1000) {
                    sb.append(m68019h(d / 100));
                    sb.append(m68019h((d / 10) % 10));
                    sb.append(m68019h(d % 10));
                    i -= 3;
                } else {
                    throw ha1.m50341a();
                }
            } else {
                throw ha1.m50341a();
            }
        }
        if (i == 2) {
            if (rlVar.mo43935a() >= 7) {
                int d2 = rlVar.mo43938d(7);
                if (d2 < 100) {
                    sb.append(m68019h(d2 / 10));
                    sb.append(m68019h(d2 % 10));
                    return;
                }
                throw ha1.m50341a();
            }
            throw ha1.m50341a();
        } else if (i != 1) {
        } else {
            if (rlVar.mo43935a() >= 4) {
                int d3 = rlVar.mo43938d(4);
                if (d3 < 10) {
                    sb.append(m68019h(d3));
                    return;
                }
                throw ha1.m50341a();
            }
            throw ha1.m50341a();
        }
    }

    /* renamed from: g */
    public static int m68018g(C6705rl rlVar) throws ha1 {
        int d = rlVar.mo43938d(8);
        if ((d & 128) == 0) {
            return d & 127;
        }
        if ((d & 192) == 128) {
            return rlVar.mo43938d(8) | ((d & 63) << 8);
        }
        if ((d & 224) == 192) {
            return rlVar.mo43938d(16) | ((d & 31) << 16);
        }
        throw ha1.m50341a();
    }

    /* renamed from: h */
    public static char m68019h(int i) throws ha1 {
        char[] cArr = f36530a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw ha1.m50341a();
    }
}
