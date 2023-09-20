package com.onedelhi.secure;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public abstract class cj4<T> {

    /* renamed from: com.onedelhi.secure.cj4$a */
    public class C4775a extends cj4<T> {
        public C4775a() {
        }

        /* renamed from: e */
        public T mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() != fw1.NULL) {
                return cj4.this.mo30144e(xv1);
            }
            xv1.mo36940j0();
            return null;
        }

        /* renamed from: i */
        public void mo30145i(lw1 lw1, T t) throws IOException {
            if (t == null) {
                lw1.mo37582M();
            } else {
                cj4.this.mo30145i(lw1, t);
            }
        }
    }

    /* renamed from: a */
    public final T mo32404a(Reader reader) throws IOException {
        return mo30144e(new xv1(reader));
    }

    /* renamed from: b */
    public final T mo32405b(String str) throws IOException {
        return mo32404a(new StringReader(str));
    }

    /* renamed from: c */
    public final T mo32406c(ov1 ov1) {
        try {
            return mo30144e(new gw1(ov1));
        } catch (IOException e) {
            throw new qv1((Throwable) e);
        }
    }

    /* renamed from: d */
    public final cj4<T> mo32407d() {
        return new C4775a();
    }

    /* renamed from: e */
    public abstract T mo30144e(xv1 xv1) throws IOException;

    /* renamed from: f */
    public final String mo32408f(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            mo32409g(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: g */
    public final void mo32409g(Writer writer, T t) throws IOException {
        mo30145i(new lw1(writer), t);
    }

    /* renamed from: h */
    public final ov1 mo32410h(T t) {
        try {
            hw1 hw1 = new hw1();
            mo30145i(hw1, t);
            return hw1.mo37584O0();
        } catch (IOException e) {
            throw new qv1((Throwable) e);
        }
    }

    /* renamed from: i */
    public abstract void mo30145i(lw1 lw1, T t) throws IOException;
}
