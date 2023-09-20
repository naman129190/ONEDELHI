package com.onedelhi.secure;

public final class t83 {

    /* renamed from: b */
    public static final int f35507b = 8;

    /* renamed from: a */
    public int f35508a = -1;

    /* renamed from: a */
    public kv0 f35509a;

    /* renamed from: a */
    public oj2 f35510a;

    /* renamed from: a */
    public ts4 f35511a;

    /* renamed from: a */
    public C7512zq f35512a;

    /* renamed from: f */
    public static boolean m65529f(int i) {
        return i >= 0 && i < 8;
    }

    /* renamed from: a */
    public kv0 mo44935a() {
        return this.f35509a;
    }

    /* renamed from: b */
    public int mo44936b() {
        return this.f35508a;
    }

    /* renamed from: c */
    public C7512zq mo44937c() {
        return this.f35512a;
    }

    /* renamed from: d */
    public oj2 mo44938d() {
        return this.f35510a;
    }

    /* renamed from: e */
    public ts4 mo44939e() {
        return this.f35511a;
    }

    /* renamed from: g */
    public void mo44940g(kv0 kv0) {
        this.f35509a = kv0;
    }

    /* renamed from: h */
    public void mo44941h(int i) {
        this.f35508a = i;
    }

    /* renamed from: i */
    public void mo44942i(C7512zq zqVar) {
        this.f35512a = zqVar;
    }

    /* renamed from: j */
    public void mo44943j(oj2 oj2) {
        this.f35510a = oj2;
    }

    /* renamed from: k */
    public void mo44944k(ts4 ts4) {
        this.f35511a = ts4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f35510a);
        sb.append("\n ecLevel: ");
        sb.append(this.f35509a);
        sb.append("\n version: ");
        sb.append(this.f35511a);
        sb.append("\n maskPattern: ");
        sb.append(this.f35508a);
        if (this.f35512a == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f35512a);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
