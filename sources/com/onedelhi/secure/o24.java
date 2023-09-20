package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.util.Log;
import com.onedelhi.secure.mg1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

public class o24 implements mg1 {

    /* renamed from: a */
    public static final String f17647a = "o24";

    /* renamed from: k */
    public static final int f17648k = 4096;

    /* renamed from: l */
    public static final int f17649l = -1;

    /* renamed from: m */
    public static final int f17650m = -1;

    /* renamed from: n */
    public static final int f17651n = 4;

    /* renamed from: o */
    public static final int f17652o = 255;
    @d10

    /* renamed from: p */
    public static final int f17653p = 0;
    @mr2

    /* renamed from: a */
    public Bitmap.Config f17654a;

    /* renamed from: a */
    public Bitmap f17655a;

    /* renamed from: a */
    public final mg1.C2858a f17656a;

    /* renamed from: a */
    public vg1 f17657a;

    /* renamed from: a */
    public wg1 f17658a;
    @ts2

    /* renamed from: a */
    public Boolean f17659a;

    /* renamed from: a */
    public ByteBuffer f17660a;

    /* renamed from: a */
    public boolean f17661a;

    /* renamed from: a */
    public byte[] f17662a;
    @d10

    /* renamed from: a */
    public int[] f17663a;

    /* renamed from: a */
    public short[] f17664a;

    /* renamed from: b */
    public byte[] f17665b;
    @d10

    /* renamed from: b */
    public final int[] f17666b;

    /* renamed from: c */
    public byte[] f17667c;
    @d10

    /* renamed from: c */
    public int[] f17668c;

    /* renamed from: d */
    public byte[] f17669d;

    /* renamed from: f */
    public int f17670f;

    /* renamed from: g */
    public int f17671g;

    /* renamed from: h */
    public int f17672h;

    /* renamed from: i */
    public int f17673i;

    /* renamed from: j */
    public int f17674j;

    public o24(@mr2 mg1.C2858a aVar) {
        this.f17666b = new int[256];
        this.f17654a = Bitmap.Config.ARGB_8888;
        this.f17656a = aVar;
        this.f17657a = new vg1();
    }

    public o24(@mr2 mg1.C2858a aVar, vg1 vg1, ByteBuffer byteBuffer) {
        this(aVar, vg1, byteBuffer, 1);
    }

    public o24(@mr2 mg1.C2858a aVar, vg1 vg1, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo20344r1(vg1, byteBuffer, i);
    }

    /* renamed from: A1 */
    public int mo20332A1() {
        int i = this.f17657a.f21772i;
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        return i + 1;
    }

    @Deprecated
    /* renamed from: B1 */
    public int mo20333B1() {
        int i = this.f17657a.f21772i;
        if (i == -1) {
            return 1;
        }
        return i;
    }

    /* renamed from: C1 */
    public int mo20334C1(int i) {
        if (i >= 0) {
            vg1 vg1 = this.f17657a;
            if (i < vg1.f21765b) {
                return vg1.f21762a.get(i).f20360g;
            }
        }
        return -1;
    }

    @mr2
    /* renamed from: D1 */
    public ByteBuffer mo20335D1() {
        return this.f17660a;
    }

    /* renamed from: E1 */
    public synchronized void mo20336E1(@mr2 vg1 vg1, @mr2 ByteBuffer byteBuffer) {
        mo20344r1(vg1, byteBuffer, 1);
    }

    /* renamed from: F1 */
    public int mo20337F1() {
        return this.f17660a.limit() + this.f17669d.length + (this.f17668c.length * 4);
    }

    @d10
    /* renamed from: a */
    public final int mo21569a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f17672h + i; i9++) {
            byte[] bArr = this.f17669d;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f17663a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f17672h + i11; i12++) {
            byte[] bArr2 = this.f17669d;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f17663a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* renamed from: b */
    public final void mo21570b(sg1 sg1) {
        Boolean bool;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        sg1 sg12 = sg1;
        int[] iArr = this.f17668c;
        int i6 = sg12.f20357d;
        int i7 = this.f17672h;
        int i8 = i6 / i7;
        int i9 = sg12.f20354b / i7;
        int i10 = sg12.f20356c / i7;
        int i11 = sg12.f20351a / i7;
        boolean z = this.f17670f == 0;
        int i12 = this.f17674j;
        int i13 = this.f17673i;
        byte[] bArr = this.f17669d;
        int[] iArr2 = this.f17663a;
        Boolean bool2 = this.f17659a;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (true) {
            bool = bool2;
            if (i15 >= i8) {
                break;
            }
            if (sg12.f20352a) {
                if (i16 >= i8) {
                    i = i8;
                    int i18 = i17 + 1;
                    if (i18 == 2) {
                        i17 = i18;
                        i16 = 4;
                    } else if (i18 != 3) {
                        i17 = i18;
                        if (i18 == 4) {
                            i16 = 1;
                            i14 = 2;
                        }
                    } else {
                        i17 = i18;
                        i16 = 2;
                        i14 = 4;
                    }
                } else {
                    i = i8;
                }
                i2 = i16 + i14;
            } else {
                i = i8;
                i2 = i16;
                i16 = i15;
            }
            int i19 = i16 + i9;
            boolean z2 = i7 == 1;
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i15 * i7 * sg12.f20356c;
                if (z2) {
                    int i25 = i21;
                    while (true) {
                        i5 = i9;
                        if (i25 >= i22) {
                            break;
                        }
                        int i26 = iArr2[bArr[i24] & 255];
                        if (i26 != 0) {
                            iArr[i25] = i26;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i24 += i7;
                        i25++;
                        i9 = i5;
                    }
                } else {
                    i5 = i9;
                    int i27 = ((i22 - i21) * i7) + i24;
                    int i28 = i21;
                    while (true) {
                        i4 = i10;
                        if (i28 >= i22) {
                            break;
                        }
                        int a = mo21569a(i24, i27, sg12.f20356c);
                        if (a != 0) {
                            iArr[i28] = a;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i24 += i7;
                        i28++;
                        i10 = i4;
                    }
                    bool2 = bool;
                    i15++;
                    i9 = i5;
                    i10 = i4;
                    i8 = i;
                    i16 = i3;
                }
            } else {
                i3 = i2;
                i5 = i9;
            }
            i4 = i10;
            bool2 = bool;
            i15++;
            i9 = i5;
            i10 = i4;
            i8 = i;
            i16 = i3;
        }
        if (this.f17659a == null) {
            this.f17659a = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    /* renamed from: c */
    public final void mo21571c(sg1 sg1) {
        sg1 sg12 = sg1;
        int[] iArr = this.f17668c;
        int i = sg12.f20357d;
        int i2 = sg12.f20354b;
        int i3 = sg12.f20356c;
        int i4 = sg12.f20351a;
        boolean z = this.f17670f == 0;
        int i5 = this.f17674j;
        byte[] bArr = this.f17669d;
        int[] iArr2 = this.f17663a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = sg12.f20356c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                byte b3 = b2 & 255;
                if (b3 != b) {
                    int i14 = iArr2[b3];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                sg1 sg13 = sg1;
                i = i13;
            }
            int i15 = i;
            i6++;
            sg12 = sg1;
        }
        Boolean bool = this.f17659a;
        this.f17659a = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f17659a == null && z && b != -1));
    }

    public void clear() {
        this.f17657a = null;
        byte[] bArr = this.f17669d;
        if (bArr != null) {
            this.f17656a.mo19550f(bArr);
        }
        int[] iArr = this.f17668c;
        if (iArr != null) {
            this.f17656a.mo19546b(iArr);
        }
        Bitmap bitmap = this.f17655a;
        if (bitmap != null) {
            this.f17656a.mo19545a(bitmap);
        }
        this.f17655a = null;
        this.f17660a = null;
        this.f17659a = null;
        byte[] bArr2 = this.f17662a;
        if (bArr2 != null) {
            this.f17656a.mo19550f(bArr2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21572d(com.onedelhi.secure.sg1 r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f17660a
            int r3 = r1.f20361h
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            com.onedelhi.secure.vg1 r1 = r0.f17657a
            int r2 = r1.f21766c
            int r1 = r1.f21767d
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f20356c
            int r1 = r1.f20357d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f17669d
            if (r1 == 0) goto L_0x0023
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002b
        L_0x0023:
            com.onedelhi.secure.mg1$a r1 = r0.f17656a
            byte[] r1 = r1.mo19547c(r2)
            r0.f17669d = r1
        L_0x002b:
            byte[] r1 = r0.f17669d
            short[] r3 = r0.f17664a
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0037
            short[] r3 = new short[r4]
            r0.f17664a = r3
        L_0x0037:
            short[] r3 = r0.f17664a
            byte[] r5 = r0.f17665b
            if (r5 != 0) goto L_0x0041
            byte[] r5 = new byte[r4]
            r0.f17665b = r5
        L_0x0041:
            byte[] r5 = r0.f17665b
            byte[] r6 = r0.f17667c
            if (r6 != 0) goto L_0x004d
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f17667c = r6
        L_0x004d:
            byte[] r6 = r0.f17667c
            int r7 = r28.mo21576h()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = 0
        L_0x0060:
            if (r14 >= r9) goto L_0x006a
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x0060
        L_0x006a:
            byte[] r14 = r0.f17662a
            r15 = -1
            r23 = r7
            r21 = r11
            r24 = r12
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = -1
            r25 = 0
            r26 = 0
        L_0x0083:
            if (r13 >= r2) goto L_0x014b
            if (r16 != 0) goto L_0x0094
            int r16 = r28.mo21575g()
            if (r16 > 0) goto L_0x0092
            r3 = 3
            r0.f17671g = r3
            goto L_0x014b
        L_0x0092:
            r17 = 0
        L_0x0094:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r0 = r22
            r15 = r23
            r22 = r7
            r7 = r26
        L_0x00ae:
            if (r4 < r15) goto L_0x0135
            r23 = r11
            r11 = r19 & r24
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c2
            r24 = r12
            r15 = r22
            r8 = r23
            r11 = r8
            r0 = -1
            goto L_0x00ae
        L_0x00c2:
            if (r11 != r10) goto L_0x00d8
            r18 = r4
            r26 = r7
            r21 = r8
            r7 = r22
            r11 = r23
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r22 = r0
            r23 = r15
            r15 = -1
            goto L_0x0147
        L_0x00d8:
            r26 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00ec
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r23
            r4 = r26
            goto L_0x00ae
        L_0x00ec:
            if (r11 < r8) goto L_0x00f5
            byte r7 = (byte) r7
            r6[r25] = r7
            int r25 = r25 + 1
            r7 = r0
            goto L_0x00f6
        L_0x00f5:
            r7 = r11
        L_0x00f6:
            if (r7 < r9) goto L_0x0101
            byte r21 = r5[r7]
            r6[r25] = r21
            int r25 = r25 + 1
            short r7 = r3[r7]
            goto L_0x00f6
        L_0x0101:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x0108:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r25 <= 0) goto L_0x0115
            int r25 = r25 + -1
            byte r27 = r6[r25]
            r1[r20] = r27
            goto L_0x0108
        L_0x0115:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x012c
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r24
            if (r0 != 0) goto L_0x012c
            if (r8 >= r6) goto L_0x012c
            int r15 = r15 + 1
            int r24 = r24 + r8
        L_0x012c:
            r0 = r11
            r11 = r23
            r4 = r26
            r6 = r27
            goto L_0x00ae
        L_0x0135:
            r26 = r4
            r21 = r8
            r23 = r15
            r18 = r26
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r15 = -1
            r26 = r7
            r7 = r22
            r22 = r0
        L_0x0147:
            r0 = r28
            goto L_0x0083
        L_0x014b:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.o24.mo21572d(com.onedelhi.secure.sg1):void");
    }

    @mr2
    /* renamed from: e */
    public final wg1 mo21573e() {
        if (this.f17658a == null) {
            this.f17658a = new wg1();
        }
        return this.f17658a;
    }

    /* renamed from: f */
    public final Bitmap mo21574f() {
        Boolean bool = this.f17659a;
        Bitmap d = this.f17656a.mo19548d(this.f17674j, this.f17673i, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f17654a);
        d.setHasAlpha(true);
        return d;
    }

    /* renamed from: g */
    public final int mo21575g() {
        int h = mo21576h();
        if (h <= 0) {
            return h;
        }
        ByteBuffer byteBuffer = this.f17660a;
        byteBuffer.get(this.f17662a, 0, Math.min(h, byteBuffer.remaining()));
        return h;
    }

    public int getHeight() {
        return this.f17657a.f21767d;
    }

    public int getWidth() {
        return this.f17657a.f21766c;
    }

    /* renamed from: h */
    public final int mo21576h() {
        return this.f17660a.get() & 255;
    }

    /* renamed from: i */
    public final Bitmap mo21577i(sg1 sg1, sg1 sg12) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f17668c;
        int i3 = 0;
        if (sg12 == null) {
            Bitmap bitmap2 = this.f17655a;
            if (bitmap2 != null) {
                this.f17656a.mo19545a(bitmap2);
            }
            this.f17655a = null;
            Arrays.fill(iArr, 0);
        }
        if (sg12 != null && sg12.f20358e == 3 && this.f17655a == null) {
            Arrays.fill(iArr, 0);
        }
        if (sg12 != null && (i2 = sg12.f20358e) > 0) {
            if (i2 == 2) {
                if (!sg1.f20355b) {
                    vg1 vg1 = this.f17657a;
                    int i4 = vg1.f21771h;
                    if (sg1.f20353a == null || vg1.f21769f != sg1.f20359f) {
                        i3 = i4;
                    }
                }
                int i5 = sg12.f20357d;
                int i6 = this.f17672h;
                int i7 = i5 / i6;
                int i8 = sg12.f20354b / i6;
                int i9 = sg12.f20356c / i6;
                int i10 = sg12.f20351a / i6;
                int i11 = this.f17674j;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f17674j;
                }
            } else if (i2 == 3 && (bitmap = this.f17655a) != null) {
                int i16 = this.f17674j;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f17673i);
            }
        }
        mo21572d(sg1);
        if (sg1.f20352a || this.f17672h != 1) {
            mo21570b(sg1);
        } else {
            mo21571c(sg1);
        }
        if (this.f17661a && ((i = sg1.f20358e) == 0 || i == 1)) {
            if (this.f17655a == null) {
                this.f17655a = mo21574f();
            }
            Bitmap bitmap3 = this.f17655a;
            int i17 = this.f17674j;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f17673i);
        }
        Bitmap f = mo21574f();
        int i18 = this.f17674j;
        f.setPixels(iArr, 0, i18, 0, 0, i18, this.f17673i);
        return f;
    }

    /* renamed from: o1 */
    public int mo20341o1() {
        return this.f17671g;
    }

    /* renamed from: p1 */
    public int mo20342p1() {
        return this.f17657a.f21765b;
    }

    /* renamed from: q1 */
    public int mo20343q1() {
        int i;
        if (this.f17657a.f21765b <= 0 || (i = this.f17670f) < 0) {
            return 0;
        }
        return mo20334C1(i);
    }

    /* renamed from: r1 */
    public synchronized void mo20344r1(@mr2 vg1 vg1, @mr2 ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f17671g = 0;
            this.f17657a = vg1;
            this.f17670f = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f17660a = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f17660a.order(ByteOrder.LITTLE_ENDIAN);
            this.f17661a = false;
            Iterator<sg1> it = vg1.f21762a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f20358e == 3) {
                        this.f17661a = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f17672h = highestOneBit;
            int i2 = vg1.f21766c;
            this.f17674j = i2 / highestOneBit;
            int i3 = vg1.f21767d;
            this.f17673i = i3 / highestOneBit;
            this.f17669d = this.f17656a.mo19547c(i2 * i3);
            this.f17668c = this.f17656a.mo19549e(this.f17674j * this.f17673i);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }

    public synchronized int read(@ts2 byte[] bArr) {
        vg1 d = mo21573e().mo26527r(bArr).mo26513d();
        this.f17657a = d;
        if (bArr != null) {
            mo20346s1(d, bArr);
        }
        return this.f17671g;
    }

    /* renamed from: s1 */
    public synchronized void mo20346s1(@mr2 vg1 vg1, @mr2 byte[] bArr) {
        mo20336E1(vg1, ByteBuffer.wrap(bArr));
    }

    /* renamed from: t1 */
    public void mo20347t1() {
        this.f17670f = (this.f17670f + 1) % this.f17657a.f21765b;
    }

    /* renamed from: u1 */
    public void mo20348u1() {
        this.f17670f = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e3, code lost:
        return null;
     */
    @com.onedelhi.secure.ts2
    /* renamed from: v1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo20349v1() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.onedelhi.secure.vg1 r0 = r8.f17657a     // Catch:{ all -> 0x00e4 }
            int r0 = r0.f21765b     // Catch:{ all -> 0x00e4 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f17670f     // Catch:{ all -> 0x00e4 }
            if (r0 >= 0) goto L_0x0039
        L_0x000d:
            java.lang.String r0 = f17647a     // Catch:{ all -> 0x00e4 }
            boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r3 == 0) goto L_0x0037
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r3.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            com.onedelhi.secure.vg1 r4 = r8.f17657a     // Catch:{ all -> 0x00e4 }
            int r4 = r4.f21765b     // Catch:{ all -> 0x00e4 }
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            int r4 = r8.f17670f     // Catch:{ all -> 0x00e4 }
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00e4 }
        L_0x0037:
            r8.f17671g = r2     // Catch:{ all -> 0x00e4 }
        L_0x0039:
            int r0 = r8.f17671g     // Catch:{ all -> 0x00e4 }
            r3 = 0
            if (r0 == r2) goto L_0x00c4
            r4 = 2
            if (r0 != r4) goto L_0x0043
            goto L_0x00c4
        L_0x0043:
            r0 = 0
            r8.f17671g = r0     // Catch:{ all -> 0x00e4 }
            byte[] r5 = r8.f17662a     // Catch:{ all -> 0x00e4 }
            if (r5 != 0) goto L_0x0054
            com.onedelhi.secure.mg1$a r5 = r8.f17656a     // Catch:{ all -> 0x00e4 }
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.mo19547c(r6)     // Catch:{ all -> 0x00e4 }
            r8.f17662a = r5     // Catch:{ all -> 0x00e4 }
        L_0x0054:
            com.onedelhi.secure.vg1 r5 = r8.f17657a     // Catch:{ all -> 0x00e4 }
            java.util.List<com.onedelhi.secure.sg1> r5 = r5.f21762a     // Catch:{ all -> 0x00e4 }
            int r6 = r8.f17670f     // Catch:{ all -> 0x00e4 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00e4 }
            com.onedelhi.secure.sg1 r5 = (com.onedelhi.secure.sg1) r5     // Catch:{ all -> 0x00e4 }
            int r6 = r8.f17670f     // Catch:{ all -> 0x00e4 }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0070
            com.onedelhi.secure.vg1 r7 = r8.f17657a     // Catch:{ all -> 0x00e4 }
            java.util.List<com.onedelhi.secure.sg1> r7 = r7.f21762a     // Catch:{ all -> 0x00e4 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00e4 }
            com.onedelhi.secure.sg1 r6 = (com.onedelhi.secure.sg1) r6     // Catch:{ all -> 0x00e4 }
            goto L_0x0071
        L_0x0070:
            r6 = r3
        L_0x0071:
            int[] r7 = r5.f20353a     // Catch:{ all -> 0x00e4 }
            if (r7 == 0) goto L_0x0076
            goto L_0x007a
        L_0x0076:
            com.onedelhi.secure.vg1 r7 = r8.f17657a     // Catch:{ all -> 0x00e4 }
            int[] r7 = r7.f21764a     // Catch:{ all -> 0x00e4 }
        L_0x007a:
            r8.f17663a = r7     // Catch:{ all -> 0x00e4 }
            if (r7 != 0) goto L_0x00a0
            java.lang.String r0 = f17647a     // Catch:{ all -> 0x00e4 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x009c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r1.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00e4 }
            int r4 = r8.f17670f     // Catch:{ all -> 0x00e4 }
            r1.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e4 }
        L_0x009c:
            r8.f17671g = r2     // Catch:{ all -> 0x00e4 }
            monitor-exit(r8)
            return r3
        L_0x00a0:
            boolean r1 = r5.f20355b     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00be
            int[] r1 = r8.f17666b     // Catch:{ all -> 0x00e4 }
            int r2 = r7.length     // Catch:{ all -> 0x00e4 }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00e4 }
            int[] r1 = r8.f17666b     // Catch:{ all -> 0x00e4 }
            r8.f17663a = r1     // Catch:{ all -> 0x00e4 }
            int r2 = r5.f20359f     // Catch:{ all -> 0x00e4 }
            r1[r2] = r0     // Catch:{ all -> 0x00e4 }
            int r0 = r5.f20358e     // Catch:{ all -> 0x00e4 }
            if (r0 != r4) goto L_0x00be
            int r0 = r8.f17670f     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x00be
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00e4 }
            r8.f17659a = r0     // Catch:{ all -> 0x00e4 }
        L_0x00be:
            android.graphics.Bitmap r0 = r8.mo21577i(r5, r6)     // Catch:{ all -> 0x00e4 }
            monitor-exit(r8)
            return r0
        L_0x00c4:
            java.lang.String r0 = f17647a     // Catch:{ all -> 0x00e4 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00e2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r1.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00e4 }
            int r2 = r8.f17671g     // Catch:{ all -> 0x00e4 }
            r1.append(r2)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e4 }
        L_0x00e2:
            monitor-exit(r8)
            return r3
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.o24.mo20349v1():android.graphics.Bitmap");
    }

    /* renamed from: w1 */
    public int mo20350w1() {
        return this.f17670f;
    }

    /* renamed from: x1 */
    public int mo20351x1() {
        return this.f17657a.f21772i;
    }

    /* renamed from: y1 */
    public void mo20352y1(@mr2 Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f17654a = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* renamed from: z1 */
    public int mo20353z1(@ts2 InputStream inputStream, int i) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i > 0 ? i + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                Log.w(f17647a, "Error reading data from stream", e);
            }
        } else {
            this.f17671g = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                Log.w(f17647a, "Error closing stream", e2);
            }
        }
        return this.f17671g;
    }
}
