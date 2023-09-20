package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.cs */
public class C4908cs extends C5853jx {

    /* renamed from: a */
    public static final long[] f27049a = new long[256];

    /* renamed from: b */
    public static final long f27050b = -3932672073523589310L;

    /* renamed from: a */
    public long f27051a = -1;

    static {
        for (int i = 0; i < f27049a.length; i++) {
            long j = (long) i;
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = ((j & 1) > 1 ? 1 : ((j & 1) == 1 ? 0 : -1));
                j >>>= 1;
                if (i3 == 0) {
                    j ^= f27050b;
                }
            }
            f27049a[i] = j;
        }
    }

    public C4908cs() {
        this.f30993a = 8;
        this.f30994a = "CRC64";
    }

    /* renamed from: a */
    public byte[] mo31122a() {
        long j = ~this.f27051a;
        this.f27051a = -1;
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) ((int) (j >> (i * 8)));
        }
        return bArr;
    }

    /* renamed from: f */
    public void mo31123f(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            long[] jArr = f27049a;
            int i4 = i + 1;
            byte b = bArr[i];
            long j = this.f27051a;
            this.f27051a = (j >>> 8) ^ jArr[(b ^ ((int) j)) & 255];
            i = i4;
        }
    }
}
