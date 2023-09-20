package com.onedelhi.secure;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class dw1 implements Iterator<ov1> {

    /* renamed from: a */
    public final xv1 f27631a;

    /* renamed from: a */
    public final Object f27632a;

    public dw1(Reader reader) {
        xv1 xv1 = new xv1(reader);
        this.f27631a = xv1;
        xv1.mo47404M0(true);
        this.f27632a = new Object();
    }

    public dw1(String str) {
        this((Reader) new StringReader(str));
    }

    /* renamed from: a */
    public ov1 next() throws tv1 {
        if (hasNext()) {
            try {
                return m44.m56909a(this.f27631a);
            } catch (StackOverflowError e) {
                throw new tv1("Failed parsing JSON source to Json", e);
            } catch (OutOfMemoryError e2) {
                throw new tv1("Failed parsing JSON source to Json", e2);
            } catch (tv1 e3) {
                e = e3;
                if (e.getCause() instanceof EOFException) {
                    e = new NoSuchElementException();
                }
                throw e;
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        boolean z;
        synchronized (this.f27632a) {
            try {
                z = this.f27631a.mo36944q0() != fw1.END_DOCUMENT;
            } catch (cc2 e) {
                throw new ew1((Throwable) e);
            } catch (IOException e2) {
                throw new qv1((Throwable) e2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
