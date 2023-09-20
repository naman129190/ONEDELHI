package com.onedelhi.secure;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class ov1 {
    /* renamed from: A */
    public boolean mo42274A() {
        return this instanceof sv1;
    }

    /* renamed from: B */
    public boolean mo42275B() {
        return this instanceof vv1;
    }

    /* renamed from: b */
    public abstract ov1 mo36904b();

    /* renamed from: e */
    public BigDecimal mo36905e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: f */
    public BigInteger mo36907f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: g */
    public boolean mo36908g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: i */
    public byte mo36910i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    @Deprecated
    /* renamed from: j */
    public char mo36913j() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: k */
    public double mo36914k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: l */
    public float mo36915l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: n */
    public int mo36916n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: o */
    public gv1 mo42276o() {
        if (mo42281y()) {
            return (gv1) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: r */
    public rv1 mo42277r() {
        if (mo42282z()) {
            return (rv1) this;
        }
        throw new IllegalStateException("Not a JSON Null: " + this);
    }

    /* renamed from: s */
    public sv1 mo42278s() {
        if (mo42274A()) {
            return (sv1) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: t */
    public vv1 mo42279t() {
        if (mo42275B()) {
            return (vv1) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            lw1 lw1 = new lw1(stringWriter);
            lw1.mo40299l0(true);
            m44.m56910b(this, lw1);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: u */
    public long mo36918u() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: v */
    public Number mo36919v() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: w */
    public short mo36920w() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: x */
    public String mo36921x() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: y */
    public boolean mo42281y() {
        return this instanceof gv1;
    }

    /* renamed from: z */
    public boolean mo42282z() {
        return this instanceof rv1;
    }
}
