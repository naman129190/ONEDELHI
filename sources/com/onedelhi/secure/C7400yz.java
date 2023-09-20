package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.onedelhi.secure.yz */
public final class C7400yz extends sv2 {

    /* renamed from: a */
    public static final char f38118a = 'ñ';

    /* renamed from: a */
    public static final int f38119a = 103;

    /* renamed from: b */
    public static final char f38120b = 'ò';

    /* renamed from: b */
    public static final int f38121b = 104;

    /* renamed from: c */
    public static final char f38122c = 'ó';

    /* renamed from: c */
    public static final int f38123c = 105;

    /* renamed from: d */
    public static final char f38124d = 'ô';

    /* renamed from: d */
    public static final int f38125d = 101;

    /* renamed from: e */
    public static final int f38126e = 100;

    /* renamed from: f */
    public static final int f38127f = 99;

    /* renamed from: g */
    public static final int f38128g = 106;

    /* renamed from: h */
    public static final int f38129h = 102;

    /* renamed from: i */
    public static final int f38130i = 97;

    /* renamed from: j */
    public static final int f38131j = 96;

    /* renamed from: k */
    public static final int f38132k = 101;

    /* renamed from: l */
    public static final int f38133l = 100;

    /* renamed from: com.onedelhi.secure.yz$a */
    public enum C7401a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: i */
    public static int m72395i(CharSequence charSequence, int i, int i2) {
        C7401a j;
        C7401a j2;
        char charAt;
        C7401a j3 = m72396j(charSequence, i);
        C7401a aVar = C7401a.ONE_DIGIT;
        if (j3 == aVar) {
            return i2 == 101 ? 101 : 100;
        }
        C7401a aVar2 = C7401a.UNCODABLE;
        if (j3 == aVar2) {
            return (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || (charAt >= '`' && (charAt < 241 || charAt > 244))))) ? 100 : 101;
        }
        if (i2 == 101 && j3 == C7401a.FNC_1) {
            return 101;
        }
        if (i2 == 99) {
            return 99;
        }
        if (i2 == 100) {
            C7401a aVar3 = C7401a.FNC_1;
            if (j3 == aVar3 || (j = m72396j(charSequence, i + 2)) == aVar2 || j == aVar) {
                return 100;
            }
            if (j == aVar3) {
                return m72396j(charSequence, i + 3) == C7401a.TWO_DIGITS ? 99 : 100;
            }
            int i3 = i + 4;
            while (true) {
                j2 = m72396j(charSequence, i3);
                if (j2 != C7401a.TWO_DIGITS) {
                    break;
                }
                i3 += 2;
            }
            return j2 == C7401a.ONE_DIGIT ? 100 : 99;
        }
        if (j3 == C7401a.FNC_1) {
            j3 = m72396j(charSequence, i + 1);
        }
        return j3 == C7401a.TWO_DIGITS ? 99 : 100;
    }

    /* renamed from: j */
    public static C7401a m72396j(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return C7401a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return C7401a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return C7401a.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return C7401a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        return (charAt2 < '0' || charAt2 > '9') ? C7401a.ONE_DIGIT : C7401a.TWO_DIGITS;
    }

    /* renamed from: e */
    public boolean[] mo30374e(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt <= 127) {
                        break;
                    } else {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            int i7 = 103;
            if (i3 < length) {
                int i8 = m72395i(str, i3, i5);
                int i9 = 100;
                if (i8 == i5) {
                    switch (str.charAt(i3)) {
                        case 241:
                            i9 = 102;
                            break;
                        case 242:
                            i9 = 97;
                            break;
                        case 243:
                            i9 = 96;
                            break;
                        case 244:
                            if (i5 == 101) {
                                i9 = 101;
                                break;
                            }
                            break;
                        default:
                            if (i5 != 100) {
                                if (i5 == 101) {
                                    i9 = str.charAt(i3) - ' ';
                                    if (i9 < 0) {
                                        i9 += 96;
                                        break;
                                    }
                                } else {
                                    i9 = Integer.parseInt(str.substring(i3, i3 + 2));
                                    i3++;
                                    break;
                                }
                            } else {
                                i9 = str.charAt(i3) - ' ';
                                break;
                            }
                            break;
                    }
                    i3++;
                } else {
                    if (i5 != 0) {
                        i7 = i8;
                    } else if (i8 == 100) {
                        i7 = 104;
                    } else if (i8 != 101) {
                        i7 = 105;
                    }
                    i9 = i7;
                    i5 = i8;
                }
                arrayList.add(C7284xz.f37695a[i9]);
                i4 += i9 * i6;
                if (i3 != 0) {
                    i6++;
                }
            } else {
                int[][] iArr = C7284xz.f37695a;
                arrayList.add(iArr[i4 % 103]);
                arrayList.add(iArr[106]);
                int i10 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i11 : (int[]) r13.next()) {
                        i10 += i11;
                    }
                }
                boolean[] zArr = new boolean[i10];
                for (int[] c : arrayList) {
                    i += sv2.m64912c(zArr, i, c, true);
                }
                return zArr;
            }
        }
    }

    /* renamed from: g */
    public Collection<C7363yi> mo30375g() {
        return Collections.singleton(C7363yi.CODE_128);
    }
}
