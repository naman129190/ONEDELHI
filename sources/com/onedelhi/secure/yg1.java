package com.onedelhi.secure;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class yg1 extends Exception {

    /* renamed from: a */
    public static final StackTraceElement[] f23075a = new StackTraceElement[0];

    /* renamed from: b */
    public static final long f23076b = 1;

    /* renamed from: a */
    public ky1 f23077a;

    /* renamed from: a */
    public vd0 f23078a;

    /* renamed from: a */
    public Class<?> f23079a;
    @ts2

    /* renamed from: a */
    public Exception f23080a;

    /* renamed from: a */
    public final List<Throwable> f23081a;

    /* renamed from: b */
    public String f23082b;

    /* renamed from: com.onedelhi.secure.yg1$a */
    public static final class C3999a implements Appendable {

        /* renamed from: b */
        public static final String f23083b = "";

        /* renamed from: c */
        public static final String f23084c = "  ";

        /* renamed from: a */
        public final Appendable f23085a;

        /* renamed from: b */
        public boolean f23086b = true;

        public C3999a(Appendable appendable) {
            this.f23085a = appendable;
        }

        @mr2
        /* renamed from: a */
        public final CharSequence mo27472a(@ts2 CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.f23086b) {
                this.f23086b = false;
                this.f23085a.append(f23084c);
            }
            if (c == 10) {
                z = true;
            }
            this.f23086b = z;
            this.f23085a.append(c);
            return this;
        }

        public Appendable append(@ts2 CharSequence charSequence) throws IOException {
            CharSequence a = mo27472a(charSequence);
            return append(a, 0, a.length());
        }

        public Appendable append(@ts2 CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence a = mo27472a(charSequence);
            boolean z = false;
            if (this.f23086b) {
                this.f23086b = false;
                this.f23085a.append(f23084c);
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f23086b = z;
            this.f23085a.append(a, i, i2);
            return this;
        }
    }

    public yg1(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    public yg1(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public yg1(String str, List<Throwable> list) {
        this.f23082b = str;
        setStackTrace(f23075a);
        this.f23081a = list;
    }

    /* renamed from: b */
    public static void m32342b(List<Throwable> list, Appendable appendable) {
        try {
            m32343c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static void m32343c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof yg1) {
                ((yg1) th).mo27465i(appendable);
            } else {
                m32344d(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    public static void m32344d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public final void mo27458a(Throwable th, List<Throwable> list) {
        if (th instanceof yg1) {
            for (Throwable a : ((yg1) th).mo27459e()) {
                mo27458a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: e */
    public List<Throwable> mo27459e() {
        return this.f23081a;
    }

    @ts2
    /* renamed from: f */
    public Exception mo27460f() {
        return this.f23080a;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public List<Throwable> mo27462g() {
        ArrayList arrayList = new ArrayList();
        mo27458a(this, arrayList);
        return arrayList;
    }

    public String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f23082b);
        String str4 = "";
        if (this.f23079a != null) {
            str = ", " + this.f23079a;
        } else {
            str = str4;
        }
        sb.append(str);
        if (this.f23078a != null) {
            str2 = ", " + this.f23078a;
        } else {
            str2 = str4;
        }
        sb.append(str2);
        if (this.f23077a != null) {
            str4 = ", " + this.f23077a;
        }
        sb.append(str4);
        List<Throwable> g = mo27462g();
        if (g.isEmpty()) {
            return sb.toString();
        }
        if (g.size() == 1) {
            str3 = "\nThere was 1 root cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(g.size());
            str3 = " root causes:";
        }
        sb.append(str3);
        for (Throwable next : g) {
            sb.append(10);
            sb.append(next.getClass().getName());
            sb.append('(');
            sb.append(next.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* renamed from: h */
    public void mo27464h(String str) {
        List<Throwable> g = mo27462g();
        int size = g.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(pl2.f33727d);
            Log.i(str, sb.toString(), g.get(i));
            i = i2;
        }
    }

    /* renamed from: i */
    public final void mo27465i(Appendable appendable) {
        m32344d(this, appendable);
        m32342b(mo27459e(), new C3999a(appendable));
    }

    /* renamed from: j */
    public void mo27466j(ky1 ky1, vd0 vd0) {
        mo27467k(ky1, vd0, (Class<?>) null);
    }

    /* renamed from: k */
    public void mo27467k(ky1 ky1, vd0 vd0, Class<?> cls) {
        this.f23077a = ky1;
        this.f23078a = vd0;
        this.f23079a = cls;
    }

    /* renamed from: l */
    public void mo27468l(@ts2 Exception exc) {
        this.f23080a = exc;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        mo27465i(printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        mo27465i(printWriter);
    }
}
