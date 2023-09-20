package com.onedelhi.secure;

import com.onedelhi.secure.m10;
import java.nio.charset.Charset;
import java.util.Map;

public final class g54 {

    /* renamed from: a */
    public static final String f28948a;

    /* renamed from: a */
    public static final boolean f28949a;

    /* renamed from: b */
    public static final String f28950b = "SJIS";

    /* renamed from: c */
    public static final String f28951c = "GB2312";

    /* renamed from: d */
    public static final String f28952d = "EUC_JP";

    /* renamed from: e */
    public static final String f28953e = "UTF8";

    /* renamed from: f */
    public static final String f28954f = "ISO8859_1";

    static {
        String name = Charset.defaultCharset().name();
        f28948a = name;
        f28949a = f28950b.equalsIgnoreCase(name) || f28952d.equalsIgnoreCase(name);
    }

    /* renamed from: a */
    public static String m49088a(byte[] bArr, Map<pf0, ?> map) {
        byte[] bArr2 = bArr;
        Map<pf0, ?> map2 = map;
        if (map2 != null) {
            pf0 pf0 = pf0.CHARACTER_SET;
            if (map2.containsKey(pf0)) {
                return map2.get(pf0).toString();
            }
        }
        int length = bArr2.length;
        boolean z = true;
        int i = 0;
        boolean z2 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        int i2 = 0;
        boolean z3 = true;
        boolean z4 = true;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i3 < length && (z || z3 || z4)) {
            byte b = bArr2[i3] & 255;
            if (z4) {
                byte b2 = b & C7276xq.f37586a;
                if (i4 > 0) {
                    if (b2 != 0) {
                        i4--;
                    }
                } else if (b2 != 0) {
                    if ((b & m10.C2804j.f15814a) != 0) {
                        i4++;
                        if ((b & 32) == 0) {
                            i6++;
                        } else {
                            i4++;
                            if ((b & 16) == 0) {
                                i7++;
                            } else {
                                i4++;
                                if ((b & 8) == 0) {
                                    i8++;
                                }
                            }
                        }
                    }
                }
                z4 = false;
            }
            if (z) {
                if (b > Byte.MAX_VALUE && b < 160) {
                    z = false;
                } else if (b > 159 && (b < 192 || b == 215 || b == 247)) {
                    i10++;
                }
            }
            if (z3) {
                if (i5 > 0) {
                    if (b >= 64 && b != Byte.MAX_VALUE && b <= 252) {
                        i5--;
                    }
                } else if (!(b == 128 || b == 160 || b > 239)) {
                    if (b <= 160 || b >= 224) {
                        if (b > Byte.MAX_VALUE) {
                            i5++;
                            int i13 = i11 + 1;
                            if (i13 > i) {
                                i = i13;
                                i11 = i;
                            } else {
                                i11 = i13;
                            }
                        } else {
                            i11 = 0;
                        }
                        i12 = 0;
                    } else {
                        i2++;
                        int i14 = i12 + 1;
                        if (i14 > i9) {
                            i9 = i14;
                            i12 = i9;
                        } else {
                            i12 = i14;
                        }
                        i11 = 0;
                    }
                }
                z3 = false;
            }
            i3++;
            bArr2 = bArr;
        }
        if (z4 && i4 > 0) {
            z4 = false;
        }
        if (z3 && i5 > 0) {
            z3 = false;
        }
        return (!z4 || (!z2 && (i6 + i7) + i8 <= 0)) ? (!z3 || (!f28949a && i9 < 3 && i < 3)) ? (!z || !z3) ? z ? f28954f : z3 ? f28950b : z4 ? "UTF8" : f28948a : (!(i9 == 2 && i2 == 2) && i10 * 10 < length) ? f28954f : f28950b : f28950b : "UTF8";
    }
}
