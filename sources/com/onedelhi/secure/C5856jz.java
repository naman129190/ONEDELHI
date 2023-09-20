package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0011\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/onedelhi/secure/jz;", "Lcom/onedelhi/secure/lz;", "", "a", "b", "", "e", "value", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "d", "()Ljava/lang/Double;", "start", "c", "endInclusive", "<init>", "(DD)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.jz */
public final class C5856jz implements C6069lz<Double> {

    /* renamed from: a */
    public final double f31015a;

    /* renamed from: b */
    public final double f31016b;

    public C5856jz(double d, double d2) {
        this.f31015a = d;
        this.f31016b = d2;
    }

    /* renamed from: a */
    public boolean mo38934a(double d) {
        return d >= this.f31015a && d <= this.f31016b;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo27426b(Comparable comparable) {
        return mo38934a(((Number) comparable).doubleValue());
    }

    @vr2
    /* renamed from: c */
    public Double mo27427g() {
        return Double.valueOf(this.f31016b);
    }

    @vr2
    /* renamed from: d */
    public Double mo27428i() {
        return Double.valueOf(this.f31015a);
    }

    /* renamed from: e */
    public boolean mo38937e(double d, double d2) {
        return d <= d2;
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof C5856jz) {
            if (isEmpty() && ((C5856jz) obj).isEmpty()) {
                return true;
            }
            C5856jz jzVar = (C5856jz) obj;
            if (this.f31015a == jzVar.f31015a) {
                if (this.f31016b == jzVar.f31016b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ boolean mo38939f(Comparable comparable, Comparable comparable2) {
        return mo38937e(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.valueOf(this.f31015a).hashCode() * 31) + Double.valueOf(this.f31016b).hashCode();
    }

    public boolean isEmpty() {
        return this.f31015a > this.f31016b;
    }

    @vr2
    public String toString() {
        return this.f31015a + ".." + this.f31016b;
    }
}
