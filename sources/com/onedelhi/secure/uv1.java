package com.onedelhi.secure;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class uv1 {
    /* renamed from: d */
    public static ov1 m67429d(xv1 xv1) throws qv1, ew1 {
        boolean E = xv1.mo47399E();
        xv1.mo47404M0(true);
        try {
            ov1 a = m44.m56909a(xv1);
            xv1.mo47404M0(E);
            return a;
        } catch (StackOverflowError e) {
            throw new tv1("Failed parsing JSON source: " + xv1 + " to Json", e);
        } catch (OutOfMemoryError e2) {
            throw new tv1("Failed parsing JSON source: " + xv1 + " to Json", e2);
        } catch (Throwable th) {
            xv1.mo47404M0(E);
            throw th;
        }
    }

    /* renamed from: e */
    public static ov1 m67430e(Reader reader) throws qv1, ew1 {
        try {
            xv1 xv1 = new xv1(reader);
            ov1 d = m67429d(xv1);
            if (!d.mo42282z()) {
                if (xv1.mo36944q0() != fw1.END_DOCUMENT) {
                    throw new ew1("Did not consume the entire document.");
                }
            }
            return d;
        } catch (cc2 e) {
            throw new ew1((Throwable) e);
        } catch (IOException e2) {
            throw new qv1((Throwable) e2);
        } catch (NumberFormatException e3) {
            throw new ew1((Throwable) e3);
        }
    }

    /* renamed from: f */
    public static ov1 m67431f(String str) throws ew1 {
        return m67430e(new StringReader(str));
    }

    @Deprecated
    /* renamed from: a */
    public ov1 mo45798a(xv1 xv1) throws qv1, ew1 {
        return m67429d(xv1);
    }

    @Deprecated
    /* renamed from: b */
    public ov1 mo45799b(Reader reader) throws qv1, ew1 {
        return m67430e(reader);
    }

    @Deprecated
    /* renamed from: c */
    public ov1 mo45800c(String str) throws ew1 {
        return m67431f(str);
    }
}
