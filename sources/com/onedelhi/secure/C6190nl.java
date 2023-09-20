package com.onedelhi.secure;

import com.onedelhi.secure.yg1;
import java.util.Arrays;

/* renamed from: com.onedelhi.secure.nl */
public final class C6190nl implements Cloneable {

    /* renamed from: a */
    public final int[] f32571a;

    /* renamed from: n */
    public final int f32572n;

    /* renamed from: o */
    public final int f32573o;

    /* renamed from: p */
    public final int f32574p;

    public C6190nl(int i) {
        this(i, i);
    }

    public C6190nl(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f32572n = i;
        this.f32573o = i2;
        int i3 = (i + 31) / 32;
        this.f32574p = i3;
        this.f32571a = new int[(i3 * i2)];
    }

    public C6190nl(int i, int i2, int i3, int[] iArr) {
        this.f32572n = i;
        this.f32573o = i2;
        this.f32574p = i3;
        this.f32571a = iArr;
    }

    /* renamed from: m */
    public static C6190nl m58164m(String str, String str2, String str3) {
        if (str != null) {
            boolean[] zArr = new boolean[str.length()];
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = -1;
            int i5 = 0;
            while (i < str.length()) {
                if (str.charAt(i) == 10 || str.charAt(i) == 13) {
                    if (i2 > i3) {
                        if (i4 == -1) {
                            i4 = i2 - i3;
                        } else if (i2 - i3 != i4) {
                            throw new IllegalArgumentException("row lengths do not match");
                        }
                        i5++;
                        i3 = i2;
                    }
                    i++;
                } else {
                    if (str.startsWith(str2, i)) {
                        i += str2.length();
                        zArr[i2] = true;
                    } else if (str.startsWith(str3, i)) {
                        i += str3.length();
                        zArr[i2] = false;
                    } else {
                        throw new IllegalArgumentException("illegal character encountered: " + str.substring(i));
                    }
                    i2++;
                }
            }
            if (i2 > i3) {
                int i6 = i2 - i3;
                if (i4 == -1) {
                    i4 = i6;
                } else if (i6 != i4) {
                    throw new IllegalArgumentException("row lengths do not match");
                }
                i5++;
            }
            C6190nl nlVar = new C6190nl(i4, i5);
            for (int i7 = 0; i7 < i2; i7++) {
                if (zArr[i7]) {
                    nlVar.mo41096p(i7 % i4, i7 / i4);
                }
            }
            return nlVar;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    public static C6190nl m58165n(boolean[][] zArr) {
        int length = zArr.length;
        int length2 = zArr[0].length;
        C6190nl nlVar = new C6190nl(length2, length);
        for (int i = 0; i < length; i++) {
            boolean[] zArr2 = zArr[i];
            for (int i2 = 0; i2 < length2; i2++) {
                if (zArr2[i2]) {
                    nlVar.mo41096p(i2, i);
                }
            }
        }
        return nlVar;
    }

    /* renamed from: a */
    public final String mo41080a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f32573o * (this.f32572n + 1));
        for (int i = 0; i < this.f32573o; i++) {
            for (int i2 = 0; i2 < this.f32572n; i2++) {
                sb.append(mo41085e(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public void mo41081b() {
        int length = this.f32571a.length;
        for (int i = 0; i < length; i++) {
            this.f32571a[i] = 0;
        }
    }

    /* renamed from: c */
    public C6190nl clone() {
        return new C6190nl(this.f32572n, this.f32573o, this.f32574p, (int[]) this.f32571a.clone());
    }

    /* renamed from: d */
    public void mo41084d(int i, int i2) {
        int i3 = (i2 * this.f32574p) + (i / 32);
        int[] iArr = this.f32571a;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: e */
    public boolean mo41085e(int i, int i2) {
        return ((this.f32571a[(i2 * this.f32574p) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6190nl)) {
            return false;
        }
        C6190nl nlVar = (C6190nl) obj;
        return this.f32572n == nlVar.f32572n && this.f32573o == nlVar.f32573o && this.f32574p == nlVar.f32574p && Arrays.equals(this.f32571a, nlVar.f32571a);
    }

    /* renamed from: f */
    public int[] mo41087f() {
        int length = this.f32571a.length - 1;
        while (length >= 0 && this.f32571a[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f32574p;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f32571a[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    /* renamed from: g */
    public int[] mo41088g() {
        int i = this.f32572n;
        int i2 = this.f32573o;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f32573o; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f32574p;
                if (i6 >= i7) {
                    break;
                }
                int i8 = this.f32571a[(i7 * i5) + i6];
                if (i8 != 0) {
                    if (i5 < i2) {
                        i2 = i5;
                    }
                    if (i5 > i4) {
                        i4 = i5;
                    }
                    int i9 = i6 << 5;
                    if (i9 < i) {
                        int i10 = 0;
                        while ((i8 << (31 - i10)) == 0) {
                            i10++;
                        }
                        int i11 = i10 + i9;
                        if (i11 < i) {
                            i = i11;
                        }
                    }
                    if (i9 + 31 > i3) {
                        int i12 = 31;
                        while ((i8 >>> i12) == 0) {
                            i12--;
                        }
                        int i13 = i9 + i12;
                        if (i13 > i3) {
                            i3 = i13;
                        }
                    }
                }
                i6++;
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    /* renamed from: h */
    public int mo41089h() {
        return this.f32573o;
    }

    public int hashCode() {
        int i = this.f32572n;
        return (((((((i * 31) + i) * 31) + this.f32573o) * 31) + this.f32574p) * 31) + Arrays.hashCode(this.f32571a);
    }

    /* renamed from: i */
    public C6014ll mo41091i(int i, C6014ll llVar) {
        if (llVar == null || llVar.mo39935l() < this.f32572n) {
            llVar = new C6014ll(this.f32572n);
        } else {
            llVar.mo39925d();
        }
        int i2 = i * this.f32574p;
        for (int i3 = 0; i3 < this.f32574p; i3++) {
            llVar.mo39940r(i3 << 5, this.f32571a[i2 + i3]);
        }
        return llVar;
    }

    /* renamed from: j */
    public int mo41092j() {
        return this.f32574p;
    }

    /* renamed from: k */
    public int[] mo41093k() {
        int[] iArr;
        int i = 0;
        while (true) {
            iArr = this.f32571a;
            if (i < iArr.length && iArr[i] == 0) {
                i++;
            }
        }
        if (i == iArr.length) {
            return null;
        }
        int i2 = this.f32574p;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: l */
    public int mo41094l() {
        return this.f32572n;
    }

    /* renamed from: o */
    public void mo41095o() {
        C6014ll llVar = new C6014ll(this.f32572n);
        C6014ll llVar2 = new C6014ll(this.f32572n);
        int i = (this.f32573o + 1) / 2;
        for (int i2 = 0; i2 < i; i2++) {
            llVar = mo41091i(i2, llVar);
            int i3 = (this.f32573o - 1) - i2;
            llVar2 = mo41091i(i3, llVar2);
            llVar.mo39938p();
            llVar2.mo39938p();
            mo41098r(i2, llVar2);
            mo41098r(i3, llVar);
        }
    }

    /* renamed from: p */
    public void mo41096p(int i, int i2) {
        int i3 = (i2 * this.f32574p) + (i / 32);
        int[] iArr = this.f32571a;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: q */
    public void mo41097q(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f32573o || i5 > this.f32572n) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f32574p * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f32571a;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    /* renamed from: r */
    public void mo41098r(int i, C6014ll llVar) {
        int[] i2 = llVar.mo39932i();
        int[] iArr = this.f32571a;
        int i3 = this.f32574p;
        System.arraycopy(i2, 0, iArr, i * i3, i3);
    }

    /* renamed from: s */
    public String mo41099s(String str, String str2) {
        return mo41080a(str, str2, "\n");
    }

    @Deprecated
    /* renamed from: t */
    public String mo41100t(String str, String str2, String str3) {
        return mo41080a(str, str2, str3);
    }

    public String toString() {
        return mo41099s("X ", yg1.C3999a.f23084c);
    }

    /* renamed from: u */
    public void mo41102u(int i, int i2) {
        int i3 = (i2 * this.f32574p) + (i / 32);
        int[] iArr = this.f32571a;
        iArr[i3] = (~(1 << (i & 31))) & iArr[i3];
    }

    /* renamed from: v */
    public void mo41103v(C6190nl nlVar) {
        int i = this.f32572n;
        if (i == nlVar.f32572n && this.f32573o == nlVar.f32573o && this.f32574p == nlVar.f32574p) {
            C6014ll llVar = new C6014ll(i);
            for (int i2 = 0; i2 < this.f32573o; i2++) {
                int i3 = this.f32574p * i2;
                int[] i4 = nlVar.mo41091i(i2, llVar).mo39932i();
                for (int i5 = 0; i5 < this.f32574p; i5++) {
                    int[] iArr = this.f32571a;
                    int i6 = i3 + i5;
                    iArr[i6] = iArr[i6] ^ i4[i5];
                }
            }
            return;
        }
        throw new IllegalArgumentException("input matrix dimensions do not match");
    }
}
