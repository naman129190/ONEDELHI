package com.onedelhi.secure;

import com.onedelhi.secure.ea3;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

public class fa3 implements o21 {

    /* renamed from: a */
    public static final Charset f28217a = Charset.forName("UTF-8");

    /* renamed from: a */
    public final int f28218a;

    /* renamed from: a */
    public ea3 f28219a;

    /* renamed from: a */
    public final File f28220a;

    /* renamed from: com.onedelhi.secure.fa3$a */
    public class C5229a implements ea3.C5113d {

        /* renamed from: a */
        public final /* synthetic */ byte[] f28222a;

        /* renamed from: a */
        public final /* synthetic */ int[] f28223a;

        public C5229a(byte[] bArr, int[] iArr) {
            this.f28222a = bArr;
            this.f28223a = iArr;
        }

        /* renamed from: a */
        public void mo34983a(InputStream inputStream, int i) throws IOException {
            try {
                inputStream.read(this.f28222a, this.f28223a[0], i);
                int[] iArr = this.f28223a;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: com.onedelhi.secure.fa3$b */
    public static class C5230b {

        /* renamed from: a */
        public final int f28224a;

        /* renamed from: a */
        public final byte[] f28225a;

        public C5230b(byte[] bArr, int i) {
            this.f28225a = bArr;
            this.f28224a = i;
        }
    }

    public fa3(File file, int i) {
        this.f28220a = file;
        this.f28218a = i;
    }

    /* renamed from: a */
    public byte[] mo31465a() {
        C5230b g = mo35803g();
        if (g == null) {
            return null;
        }
        int i = g.f28224a;
        byte[] bArr = new byte[i];
        System.arraycopy(g.f28225a, 0, bArr, 0, i);
        return bArr;
    }

    /* renamed from: b */
    public void mo31466b() {
        mo31469e();
        this.f28220a.delete();
    }

    /* renamed from: c */
    public String mo31467c() {
        byte[] a = mo31465a();
        if (a != null) {
            return new String(a, f28217a);
        }
        return null;
    }

    /* renamed from: d */
    public void mo31468d(long j, String str) {
        mo35804h();
        mo35802f(j, str);
    }

    /* renamed from: e */
    public void mo31469e() {
        u10.m66358e(this.f28219a, "There was a problem closing the Crashlytics log file.");
        this.f28219a = null;
    }

    /* renamed from: f */
    public final void mo35802f(long j, String str) {
        if (this.f28219a != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.f28218a / 4;
                if (str.length() > i) {
                    str = "..." + str.substring(str.length() - i);
                }
                this.f28219a.mo34970g(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(f28217a));
                while (!this.f28219a.mo34962E() && this.f28219a.mo34982u0() > this.f28218a) {
                    this.f28219a.mo34972j0();
                }
            } catch (IOException e) {
                o92.m59120f().mo41616e("There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    /* renamed from: g */
    public final C5230b mo35803g() {
        if (!this.f28220a.exists()) {
            return null;
        }
        mo35804h();
        ea3 ea3 = this.f28219a;
        if (ea3 == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[ea3.mo34982u0()];
        try {
            this.f28219a.mo34977p(new C5229a(bArr, iArr));
        } catch (IOException e) {
            o92.m59120f().mo41616e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new C5230b(bArr, iArr[0]);
    }

    /* renamed from: h */
    public final void mo35804h() {
        if (this.f28219a == null) {
            try {
                this.f28219a = new ea3(this.f28220a);
            } catch (IOException e) {
                o92 f = o92.m59120f();
                f.mo41616e("Could not open log file: " + this.f28220a, e);
            }
        }
    }
}
