package com.onedelhi.secure;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

public final class t12 extends Number {

    /* renamed from: b */
    public final String f35360b;

    public t12(String str) {
        this.f35360b = str;
    }

    /* renamed from: a */
    public final void mo44745a(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    /* renamed from: b */
    public final Object mo44746b() throws ObjectStreamException {
        return new BigDecimal(this.f35360b);
    }

    public double doubleValue() {
        return Double.parseDouble(this.f35360b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t12)) {
            return false;
        }
        String str = this.f35360b;
        String str2 = ((t12) obj).f35360b;
        return str == str2 || str.equals(str2);
    }

    public float floatValue() {
        return Float.parseFloat(this.f35360b);
    }

    public int hashCode() {
        return this.f35360b.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f35360b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f35360b).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f35360b     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f35360b     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f35360b
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.t12.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f35360b);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f35360b).longValue();
        }
    }

    public String toString() {
        return this.f35360b;
    }
}
