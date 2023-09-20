package com.onedelhi.secure;

public class io3 {

    /* renamed from: g */
    public static final int f13780g = Integer.MIN_VALUE;

    /* renamed from: a */
    public int f13781a = 0;

    /* renamed from: a */
    public boolean f13782a = false;

    /* renamed from: b */
    public int f13783b = 0;

    /* renamed from: b */
    public boolean f13784b = false;

    /* renamed from: c */
    public int f13785c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f13786d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f13787e = 0;

    /* renamed from: f */
    public int f13788f = 0;

    /* renamed from: a */
    public int mo17894a() {
        return this.f13782a ? this.f13781a : this.f13783b;
    }

    /* renamed from: b */
    public int mo17895b() {
        return this.f13781a;
    }

    /* renamed from: c */
    public int mo17896c() {
        return this.f13783b;
    }

    /* renamed from: d */
    public int mo17897d() {
        return this.f13782a ? this.f13783b : this.f13781a;
    }

    /* renamed from: e */
    public void mo17898e(int i, int i2) {
        this.f13784b = false;
        if (i != Integer.MIN_VALUE) {
            this.f13787e = i;
            this.f13781a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f13788f = i2;
            this.f13783b = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17899f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f13782a
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f13782a = r2
            boolean r0 = r1.f13784b
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f13786d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f13787e
        L_0x0016:
            r1.f13781a = r2
            int r2 = r1.f13785c
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.f13785c
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.f13787e
        L_0x0024:
            r1.f13781a = r2
            int r2 = r1.f13786d
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.f13787e
            r1.f13781a = r2
        L_0x002f:
            int r2 = r1.f13788f
        L_0x0031:
            r1.f13783b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.io3.mo17899f(boolean):void");
    }

    /* renamed from: g */
    public void mo17900g(int i, int i2) {
        this.f13785c = i;
        this.f13786d = i2;
        this.f13784b = true;
        if (this.f13782a) {
            if (i2 != Integer.MIN_VALUE) {
                this.f13781a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f13783b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f13781a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f13783b = i2;
        }
    }
}
