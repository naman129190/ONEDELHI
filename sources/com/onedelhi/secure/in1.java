package com.onedelhi.secure;

import android.support.p000v4.media.session.PlaybackStateCompat;

public final class in1 implements xy3 {

    /* renamed from: a */
    public static final int[] f30379a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 6, 6, 0, 0, 7, 7, 4, 4, 0, 0, 4, 4, 0, 0};

    /* renamed from: a */
    public int f30380a;

    /* renamed from: a */
    public final boolean f30381a;

    public in1(boolean z, int i) {
        this.f30381a = z;
        this.f30380a = i;
    }

    /* renamed from: a */
    public int mo38163a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = (i + i2) - 16;
        int i6 = i;
        while (i6 <= i5) {
            int i7 = f30379a[bArr[i6] & 31];
            int i8 = 5;
            int i9 = 0;
            while (i9 < 3) {
                if (((i7 >>> i9) & 1) == 0) {
                    i4 = i6;
                } else {
                    int i10 = i8 >>> 3;
                    int i11 = i8 & 7;
                    long j = 0;
                    int i12 = 0;
                    while (i12 < 6) {
                        j |= (((long) bArr[(i6 + i10) + i12]) & 255) << (i12 * 8);
                        i12++;
                        i6 = i6;
                    }
                    i4 = i6;
                    long j2 = j >>> i11;
                    if (((j2 >>> 37) & 15) == 5 && ((j2 >>> 9) & 7) == 0) {
                        i3 = i9;
                        int i13 = (((((int) (j2 >>> 36)) & 1) << 20) | ((int) ((j2 >>> 13) & 1048575))) << 4;
                        long j3 = (long) ((this.f30381a ? i13 + ((this.f30380a + i4) - i) : i13 - ((this.f30380a + i4) - i)) >>> 4);
                        long j4 = ((((j2 & -77309403137L) | ((j3 & 1048575) << 13)) | ((j3 & PlaybackStateCompat.f408A) << 16)) << i11) | (((long) ((1 << i11) - 1)) & j);
                        for (int i14 = 0; i14 < 6; i14++) {
                            bArr[i4 + i10 + i14] = (byte) ((int) (j4 >>> (i14 * 8)));
                        }
                        i9 = i3 + 1;
                        i8 += 41;
                        i6 = i4;
                    }
                }
                i3 = i9;
                i9 = i3 + 1;
                i8 += 41;
                i6 = i4;
            }
            i6 += 16;
        }
        int i15 = i6 - i;
        this.f30380a += i15;
        return i15;
    }
}
