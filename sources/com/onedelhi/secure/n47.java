package com.onedelhi.secure;

public abstract class n47 extends rk6 {

    /* renamed from: a */
    public final rv6 f17101a;

    /* renamed from: a */
    public final CharSequence f17102a;

    /* renamed from: b */
    public final boolean f17103b;

    /* renamed from: o */
    public int f17104o = 0;

    /* renamed from: p */
    public int f17105p;

    public n47(d57 d57, CharSequence charSequence) {
        this.f17101a = d57.f10641a;
        this.f17103b = d57.f10642a;
        this.f17105p = Integer.MAX_VALUE;
        this.f17102a = charSequence;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r0 >= r1) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        r5.f17102a.charAt(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r0 >= r1) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r5.f17102a.charAt(r1 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r5.f17103b == false) goto L_0x0045;
     */
    @javax.annotation.CheckForNull
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo20863a() {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r5.f17104o
        L_0x0002:
            int r1 = r5.f17104o
            r2 = -1
            if (r1 == r2) goto L_0x006a
            int r1 = r5.mo20865e(r1)
            if (r1 != r2) goto L_0x0017
            java.lang.CharSequence r1 = r5.f17102a
            int r1 = r1.length()
            r5.f17104o = r2
            r3 = -1
            goto L_0x001d
        L_0x0017:
            int r3 = r5.mo20864d(r1)
            r5.f17104o = r3
        L_0x001d:
            if (r3 != r0) goto L_0x002e
            int r3 = r3 + 1
            r5.f17104o = r3
            java.lang.CharSequence r1 = r5.f17102a
            int r1 = r1.length()
            if (r3 <= r1) goto L_0x0002
            r5.f17104o = r2
            goto L_0x0002
        L_0x002e:
            if (r0 >= r1) goto L_0x0035
            java.lang.CharSequence r3 = r5.f17102a
            r3.charAt(r0)
        L_0x0035:
            if (r0 >= r1) goto L_0x003e
            java.lang.CharSequence r3 = r5.f17102a
            int r4 = r1 + -1
            r3.charAt(r4)
        L_0x003e:
            boolean r3 = r5.f17103b
            if (r3 == 0) goto L_0x0045
            if (r0 != r1) goto L_0x0045
            goto L_0x0000
        L_0x0045:
            int r3 = r5.f17105p
            r4 = 1
            if (r3 != r4) goto L_0x005c
            java.lang.CharSequence r1 = r5.f17102a
            int r1 = r1.length()
            r5.f17104o = r2
            if (r1 <= r0) goto L_0x005f
            java.lang.CharSequence r2 = r5.f17102a
            int r3 = r1 + -1
            r2.charAt(r3)
            goto L_0x005f
        L_0x005c:
            int r3 = r3 + r2
            r5.f17105p = r3
        L_0x005f:
            java.lang.CharSequence r2 = r5.f17102a
            java.lang.CharSequence r0 = r2.subSequence(r0, r1)
            java.lang.String r0 = r0.toString()
            goto L_0x006e
        L_0x006a:
            r5.mo23930b()
            r0 = 0
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.n47.mo20863a():java.lang.Object");
    }

    /* renamed from: d */
    public abstract int mo20864d(int i);

    /* renamed from: e */
    public abstract int mo20865e(int i);
}
