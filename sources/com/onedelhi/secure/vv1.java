package com.onedelhi.secure;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class vv1 extends ov1 {

    /* renamed from: a */
    public final Object f36726a;

    public vv1(Boolean bool) {
        this.f36726a = C4453a.m35637b(bool);
    }

    public vv1(Character ch) {
        this.f36726a = ((Character) C4453a.m35637b(ch)).toString();
    }

    public vv1(Number number) {
        this.f36726a = C4453a.m35637b(number);
    }

    public vv1(String str) {
        this.f36726a = C4453a.m35637b(str);
    }

    /* renamed from: F */
    public static boolean m68536F(vv1 vv1) {
        Object obj = vv1.f36726a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* renamed from: C */
    public vv1 mo36904b() {
        return this;
    }

    /* renamed from: D */
    public boolean mo46384D() {
        return this.f36726a instanceof Boolean;
    }

    /* renamed from: G */
    public boolean mo46385G() {
        return this.f36726a instanceof Number;
    }

    /* renamed from: I */
    public boolean mo46386I() {
        return this.f36726a instanceof String;
    }

    /* renamed from: e */
    public BigDecimal mo36905e() {
        Object obj = this.f36726a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : new BigDecimal(this.f36726a.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vv1.class != obj.getClass()) {
            return false;
        }
        vv1 vv1 = (vv1) obj;
        if (this.f36726a == null) {
            return vv1.f36726a == null;
        }
        if (m68536F(this) && m68536F(vv1)) {
            return mo36919v().longValue() == vv1.mo36919v().longValue();
        }
        Object obj2 = this.f36726a;
        if (!(obj2 instanceof Number) || !(vv1.f36726a instanceof Number)) {
            return obj2.equals(vv1.f36726a);
        }
        double doubleValue = mo36919v().doubleValue();
        double doubleValue2 = vv1.mo36919v().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    /* renamed from: f */
    public BigInteger mo36907f() {
        Object obj = this.f36726a;
        return obj instanceof BigInteger ? (BigInteger) obj : new BigInteger(this.f36726a.toString());
    }

    /* renamed from: g */
    public boolean mo36908g() {
        return mo46384D() ? ((Boolean) this.f36726a).booleanValue() : Boolean.parseBoolean(mo36921x());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f36726a == null) {
            return 31;
        }
        if (m68536F(this)) {
            doubleToLongBits = mo36919v().longValue();
        } else {
            Object obj = this.f36726a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo36919v().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: i */
    public byte mo36910i() {
        return mo46385G() ? mo36919v().byteValue() : Byte.parseByte(mo36921x());
    }

    /* renamed from: j */
    public char mo36913j() {
        return mo36921x().charAt(0);
    }

    /* renamed from: k */
    public double mo36914k() {
        return mo46385G() ? mo36919v().doubleValue() : Double.parseDouble(mo36921x());
    }

    /* renamed from: l */
    public float mo36915l() {
        return mo46385G() ? mo36919v().floatValue() : Float.parseFloat(mo36921x());
    }

    /* renamed from: n */
    public int mo36916n() {
        return mo46385G() ? mo36919v().intValue() : Integer.parseInt(mo36921x());
    }

    /* renamed from: u */
    public long mo36918u() {
        return mo46385G() ? mo36919v().longValue() : Long.parseLong(mo36921x());
    }

    /* renamed from: v */
    public Number mo36919v() {
        Object obj = this.f36726a;
        return obj instanceof String ? new t12((String) obj) : (Number) obj;
    }

    /* renamed from: w */
    public short mo36920w() {
        return mo46385G() ? mo36919v().shortValue() : Short.parseShort(mo36921x());
    }

    /* renamed from: x */
    public String mo36921x() {
        return mo46385G() ? mo36919v().toString() : mo46384D() ? ((Boolean) this.f36726a).toString() : (String) this.f36726a;
    }
}
