package com.onedelhi.secure;

import java.io.PrintStream;

/* renamed from: com.onedelhi.secure.qr */
public class C3336qr {

    /* renamed from: o */
    public static int f19436o = 80;

    /* renamed from: p */
    public static int f19437p = 2;

    /* renamed from: a */
    public C3182pr f19438a;

    /* renamed from: a */
    public final char[] f19439a;

    /* renamed from: b */
    public long f19440b = -1;

    /* renamed from: c */
    public long f19441c = Long.MAX_VALUE;

    /* renamed from: n */
    public int f19442n;

    public C3336qr(char[] cArr) {
        this.f19439a = cArr;
    }

    /* renamed from: b */
    public void mo23404b(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
    }

    /* renamed from: e */
    public String mo23405e() {
        String str = new String(this.f19439a);
        long j = this.f19441c;
        if (j != Long.MAX_VALUE) {
            long j2 = this.f19440b;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.f19440b;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    /* renamed from: f */
    public C3336qr mo23406f() {
        return this.f19438a;
    }

    /* renamed from: g */
    public String mo23407g() {
        if (!C3736ur.f21479b) {
            return "";
        }
        return mo23413o() + " -> ";
    }

    /* renamed from: i */
    public long mo23408i() {
        return this.f19441c;
    }

    /* renamed from: j */
    public float mo23409j() {
        if (this instanceof C3535sr) {
            return ((C3535sr) this).mo23409j();
        }
        return Float.NaN;
    }

    /* renamed from: k */
    public int mo23410k() {
        if (this instanceof C3535sr) {
            return ((C3535sr) this).mo23410k();
        }
        return 0;
    }

    /* renamed from: l */
    public int mo23411l() {
        return this.f19442n;
    }

    /* renamed from: n */
    public long mo23412n() {
        return this.f19440b;
    }

    /* renamed from: o */
    public String mo23413o() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    /* renamed from: r */
    public boolean mo23414r() {
        return this.f19441c != Long.MAX_VALUE;
    }

    /* renamed from: s */
    public boolean mo23415s() {
        return this.f19440b > -1;
    }

    /* renamed from: t */
    public boolean mo23416t() {
        return this.f19440b == -1;
    }

    public String toString() {
        long j = this.f19440b;
        long j2 = this.f19441c;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.f19440b + "-" + this.f19441c + pl2.f33727d;
        }
        String substring = new String(this.f19439a).substring((int) this.f19440b, ((int) this.f19441c) + 1);
        return mo23413o() + " (" + this.f19440b + " : " + this.f19441c + ") <<" + substring + ">>";
    }

    /* renamed from: u */
    public void mo23417u(C3182pr prVar) {
        this.f19438a = prVar;
    }

    /* renamed from: v */
    public void mo23418v(long j) {
        if (this.f19441c == Long.MAX_VALUE) {
            this.f19441c = j;
            if (C3736ur.f21479b) {
                PrintStream printStream = System.out;
                printStream.println("closing " + hashCode() + " -> " + this);
            }
            C3182pr prVar = this.f19438a;
            if (prVar != null) {
                prVar.mo22581A(this);
            }
        }
    }

    /* renamed from: w */
    public void mo23419w(int i) {
        this.f19442n = i;
    }

    /* renamed from: x */
    public void mo23420x(long j) {
        this.f19440b = j;
    }

    /* renamed from: y */
    public String mo22057y(int i, int i2) {
        return "";
    }

    /* renamed from: z */
    public String mo22058z() {
        return "";
    }
}
