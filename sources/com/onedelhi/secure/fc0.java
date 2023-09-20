package com.onedelhi.secure;

public final class fc0 extends C3952xu {

    /* renamed from: a */
    public final float f12014a;
    @mr2

    /* renamed from: b */
    public final C3798vl f12015b;

    public fc0(@mr2 C3798vl vlVar) {
        this(vlVar, 10.0f);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fc0(@com.onedelhi.secure.mr2 com.onedelhi.secure.C3798vl r3, float r4) {
        /*
            r2 = this;
            java.lang.String r0 = "bitmapDescriptor must not be null"
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.onedelhi.secure.vl r0 = (com.onedelhi.secure.C3798vl) r0
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0015
            r2.<init>(r0, r4)
            r2.f12015b = r3
            r2.f12014a = r4
            return
        L_0x0015:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "refWidth must be positive"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.fc0.<init>(com.onedelhi.secure.vl, float):void");
    }

    @mr2
    public String toString() {
        String valueOf = String.valueOf(this.f12015b);
        float f = this.f12014a;
        return "[CustomCap: bitmapDescriptor=" + valueOf + " refWidth=" + f + "]";
    }
}
