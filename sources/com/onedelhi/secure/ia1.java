package com.onedelhi.secure;

public final class ia1 {

    /* renamed from: a */
    public static final int f30230a = 21522;

    /* renamed from: a */
    public static final int[][] f30231a = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    public final byte f30232a;

    /* renamed from: a */
    public final kv0 f30233a;

    public ia1(int i) {
        this.f30233a = kv0.m55028a((i >> 3) & 3);
        this.f30232a = (byte) (i & 7);
    }

    /* renamed from: a */
    public static ia1 m51965a(int i, int i2) {
        ia1 b = m51966b(i, i2);
        return b != null ? b : m51966b(i ^ 21522, i2 ^ 21522);
    }

    /* renamed from: b */
    public static ia1 m51966b(int i, int i2) {
        int e;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr : f30231a) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new ia1(iArr[1]);
            }
            int e2 = m51967e(i, i5);
            if (e2 < i3) {
                i4 = iArr[1];
                i3 = e2;
            }
            if (i != i2 && (e = m51967e(i2, i5)) < i3) {
                i4 = iArr[1];
                i3 = e;
            }
        }
        if (i3 <= 3) {
            return new ia1(i4);
        }
        return null;
    }

    /* renamed from: e */
    public static int m51967e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    /* renamed from: c */
    public byte mo37925c() {
        return this.f30232a;
    }

    /* renamed from: d */
    public kv0 mo37926d() {
        return this.f30233a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ia1)) {
            return false;
        }
        ia1 ia1 = (ia1) obj;
        return this.f30233a == ia1.f30233a && this.f30232a == ia1.f30232a;
    }

    public int hashCode() {
        return (this.f30233a.ordinal() << 3) | this.f30232a;
    }
}
