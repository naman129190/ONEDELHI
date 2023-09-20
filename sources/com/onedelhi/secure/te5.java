package com.onedelhi.secure;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

public final class te5 implements qh5 {

    /* renamed from: a */
    public final Double f20770a;

    public te5(Double d) {
        if (d == null) {
            this.f20770a = Double.valueOf(Double.NaN);
        } else {
            this.f20770a = d;
        }
    }

    /* renamed from: b */
    public final String mo13084b() {
        if (Double.isNaN(this.f20770a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f20770a.doubleValue())) {
            return this.f20770a.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f20770a.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((stripTrailingZeros.scale() > 0 ? stripTrailingZeros.precision() : stripTrailingZeros.scale()) - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf(mx0.f16704j2);
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace(mx0.f16704j2, "e+") : stripTrailingZeros.toPlainString();
    }

    /* renamed from: e */
    public final Double mo13085e() {
        return this.f20770a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof te5)) {
            return false;
        }
        return this.f20770a.equals(((te5) obj).f20770a);
    }

    /* renamed from: f */
    public final Boolean mo13087f() {
        boolean z = false;
        if (!Double.isNaN(this.f20770a.doubleValue()) && this.f20770a.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: g */
    public final qh5 mo13088g(String str, w96 w96, List list) {
        if ("toString".equals(str)) {
            return new wi5(mo13084b());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{mo13084b(), str}));
    }

    public final int hashCode() {
        return this.f20770a.hashCode();
    }

    /* renamed from: k */
    public final qh5 mo13090k() {
        return new te5(this.f20770a);
    }

    /* renamed from: l */
    public final Iterator mo13091l() {
        return null;
    }

    public final String toString() {
        return mo13084b();
    }
}
