package com.onedelhi.secure;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class wg1 {

    /* renamed from: a */
    public static final String f22101a = "GifHeaderParser";

    /* renamed from: b */
    public static final int f22102b = 255;

    /* renamed from: c */
    public static final int f22103c = 44;

    /* renamed from: d */
    public static final int f22104d = 33;

    /* renamed from: e */
    public static final int f22105e = 59;

    /* renamed from: f */
    public static final int f22106f = 249;

    /* renamed from: g */
    public static final int f22107g = 255;

    /* renamed from: h */
    public static final int f22108h = 254;

    /* renamed from: i */
    public static final int f22109i = 1;

    /* renamed from: j */
    public static final int f22110j = 28;

    /* renamed from: k */
    public static final int f22111k = 2;

    /* renamed from: l */
    public static final int f22112l = 1;

    /* renamed from: m */
    public static final int f22113m = 128;

    /* renamed from: n */
    public static final int f22114n = 64;

    /* renamed from: o */
    public static final int f22115o = 7;

    /* renamed from: p */
    public static final int f22116p = 128;

    /* renamed from: q */
    public static final int f22117q = 7;

    /* renamed from: r */
    public static final int f22118r = 2;

    /* renamed from: s */
    public static final int f22119s = 10;

    /* renamed from: t */
    public static final int f22120t = 256;

    /* renamed from: a */
    public int f22121a = 0;

    /* renamed from: a */
    public vg1 f22122a;

    /* renamed from: a */
    public ByteBuffer f22123a;

    /* renamed from: a */
    public final byte[] f22124a = new byte[256];

    /* renamed from: a */
    public void mo26510a() {
        this.f22123a = null;
        this.f22122a = null;
    }

    /* renamed from: b */
    public final boolean mo26511b() {
        return this.f22122a.f21760a != 0;
    }

    /* renamed from: c */
    public boolean mo26512c() {
        mo26521l();
        if (!mo26511b()) {
            mo26519j(2);
        }
        return this.f22122a.f21765b > 1;
    }

    @mr2
    /* renamed from: d */
    public vg1 mo26513d() {
        if (this.f22123a == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (mo26511b()) {
            return this.f22122a;
        } else {
            mo26521l();
            if (!mo26511b()) {
                mo26518i();
                vg1 vg1 = this.f22122a;
                if (vg1.f21765b < 0) {
                    vg1.f21760a = 1;
                }
            }
            return this.f22122a;
        }
    }

    /* renamed from: e */
    public final int mo26514e() {
        try {
            return this.f22123a.get() & 255;
        } catch (Exception unused) {
            this.f22122a.f21760a = 1;
            return 0;
        }
    }

    /* renamed from: f */
    public final void mo26515f() {
        this.f22122a.f21761a.f20351a = mo26524o();
        this.f22122a.f21761a.f20354b = mo26524o();
        this.f22122a.f21761a.f20356c = mo26524o();
        this.f22122a.f21761a.f20357d = mo26524o();
        int e = mo26514e();
        boolean z = false;
        boolean z2 = (e & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((e & 7) + 1));
        sg1 sg1 = this.f22122a.f21761a;
        if ((e & 64) != 0) {
            z = true;
        }
        sg1.f20352a = z;
        if (z2) {
            sg1.f20353a = mo26517h(pow);
        } else {
            sg1.f20353a = null;
        }
        this.f22122a.f21761a.f20361h = this.f22123a.position();
        mo26529t();
        if (!mo26511b()) {
            vg1 vg1 = this.f22122a;
            vg1.f21765b++;
            vg1.f21762a.add(vg1.f21761a);
        }
    }

    /* renamed from: g */
    public final void mo26516g() {
        int e = mo26514e();
        this.f22121a = e;
        if (e > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.f22121a;
                    if (i < i3) {
                        i2 = i3 - i;
                        this.f22123a.get(this.f22124a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception e2) {
                    if (Log.isLoggable(f22101a, 3)) {
                        Log.d(f22101a, "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f22121a, e2);
                    }
                    this.f22122a.f21760a = 1;
                    return;
                }
            }
        }
    }

    @ts2
    /* renamed from: h */
    public final int[] mo26517h(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f22123a.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable(f22101a, 3)) {
                Log.d(f22101a, "Format Error Reading Color Table", e);
            }
            this.f22122a.f21760a = 1;
        }
        return iArr;
    }

    /* renamed from: i */
    public final void mo26518i() {
        mo26519j(Integer.MAX_VALUE);
    }

    /* renamed from: j */
    public final void mo26519j(int i) {
        boolean z = false;
        while (!z && !mo26511b() && this.f22122a.f21765b <= i) {
            int e = mo26514e();
            if (e == 33) {
                int e2 = mo26514e();
                if (e2 != 1) {
                    if (e2 == 249) {
                        this.f22122a.f21761a = new sg1();
                        mo26520k();
                    } else if (e2 != 254 && e2 == 255) {
                        mo26516g();
                        StringBuilder sb = new StringBuilder();
                        for (int i2 = 0; i2 < 11; i2++) {
                            sb.append((char) this.f22124a[i2]);
                        }
                        if (sb.toString().equals("NETSCAPE2.0")) {
                            mo26523n();
                        }
                    }
                }
                mo26528s();
            } else if (e == 44) {
                vg1 vg1 = this.f22122a;
                if (vg1.f21761a == null) {
                    vg1.f21761a = new sg1();
                }
                mo26515f();
            } else if (e != 59) {
                this.f22122a.f21760a = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: k */
    public final void mo26520k() {
        mo26514e();
        int e = mo26514e();
        sg1 sg1 = this.f22122a.f21761a;
        int i = (e & 28) >> 2;
        sg1.f20358e = i;
        boolean z = true;
        if (i == 0) {
            sg1.f20358e = 1;
        }
        if ((e & 1) == 0) {
            z = false;
        }
        sg1.f20355b = z;
        int o = mo26524o();
        if (o < 2) {
            o = 10;
        }
        sg1 sg12 = this.f22122a.f21761a;
        sg12.f20360g = o * 10;
        sg12.f20359f = mo26514e();
        mo26514e();
    }

    /* renamed from: l */
    public final void mo26521l() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) mo26514e());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f22122a.f21760a = 1;
            return;
        }
        mo26522m();
        if (this.f22122a.f21763a && !mo26511b()) {
            vg1 vg1 = this.f22122a;
            vg1.f21764a = mo26517h(vg1.f21768e);
            vg1 vg12 = this.f22122a;
            vg12.f21771h = vg12.f21764a[vg12.f21769f];
        }
    }

    /* renamed from: m */
    public final void mo26522m() {
        this.f22122a.f21766c = mo26524o();
        this.f22122a.f21767d = mo26524o();
        int e = mo26514e();
        vg1 vg1 = this.f22122a;
        vg1.f21763a = (e & 128) != 0;
        vg1.f21768e = (int) Math.pow(2.0d, (double) ((e & 7) + 1));
        this.f22122a.f21769f = mo26514e();
        this.f22122a.f21770g = mo26514e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26523n() {
        /*
            r3 = this;
        L_0x0000:
            r3.mo26516g()
            byte[] r0 = r3.f22124a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            com.onedelhi.secure.vg1 r2 = r3.f22122a
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f21772i = r0
        L_0x001b:
            int r0 = r3.f22121a
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.mo26511b()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.wg1.mo26523n():void");
    }

    /* renamed from: o */
    public final int mo26524o() {
        return this.f22123a.getShort();
    }

    /* renamed from: p */
    public final void mo26525p() {
        this.f22123a = null;
        Arrays.fill(this.f22124a, (byte) 0);
        this.f22122a = new vg1();
        this.f22121a = 0;
    }

    /* renamed from: q */
    public wg1 mo26526q(@mr2 ByteBuffer byteBuffer) {
        mo26525p();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f22123a = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f22123a.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: r */
    public wg1 mo26527r(@ts2 byte[] bArr) {
        if (bArr != null) {
            mo26526q(ByteBuffer.wrap(bArr));
        } else {
            this.f22123a = null;
            this.f22122a.f21760a = 2;
        }
        return this;
    }

    /* renamed from: s */
    public final void mo26528s() {
        int e;
        do {
            e = mo26514e();
            this.f22123a.position(Math.min(this.f22123a.position() + e, this.f22123a.limit()));
        } while (e > 0);
    }

    /* renamed from: t */
    public final void mo26529t() {
        mo26514e();
        mo26528s();
    }
}
