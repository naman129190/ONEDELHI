package com.onedelhi.secure;

public enum oj2 {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: a */
    public final int[] f33057a;

    /* renamed from: n */
    public final int f33058n;

    /* access modifiers changed from: public */
    oj2(int[] iArr, int i) {
        this.f33057a = iArr;
        this.f33058n = i;
    }

    /* renamed from: a */
    public static oj2 m59423a(int i) {
        if (i == 0) {
            return TERMINATOR;
        }
        if (i == 1) {
            return NUMERIC;
        }
        if (i == 2) {
            return ALPHANUMERIC;
        }
        if (i == 3) {
            return STRUCTURED_APPEND;
        }
        if (i == 4) {
            return BYTE;
        }
        if (i == 5) {
            return FNC1_FIRST_POSITION;
        }
        if (i == 7) {
            return ECI;
        }
        if (i == 8) {
            return KANJI;
        }
        if (i == 9) {
            return FNC1_SECOND_POSITION;
        }
        if (i == 13) {
            return HANZI;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public int mo41792b() {
        return this.f33058n;
    }

    /* renamed from: e */
    public int mo41793e(ts4 ts4) {
        int j = ts4.mo45300j();
        return this.f33057a[j <= 9 ? 0 : j <= 26 ? (char) 1 : 2];
    }
}
