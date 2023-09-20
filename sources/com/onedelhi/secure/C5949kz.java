package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0011\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/onedelhi/secure/kz;", "Lcom/onedelhi/secure/lz;", "", "a", "b", "", "e", "value", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "d", "()Ljava/lang/Float;", "start", "c", "endInclusive", "<init>", "(FF)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.kz */
public final class C5949kz implements C6069lz<Float> {

    /* renamed from: a */
    public final float f31494a;

    /* renamed from: b */
    public final float f31495b;

    public C5949kz(float f, float f2) {
        this.f31494a = f;
        this.f31495b = f2;
    }

    /* renamed from: a */
    public boolean mo39586a(float f) {
        return f >= this.f31494a && f <= this.f31495b;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo27426b(Comparable comparable) {
        return mo39586a(((Number) comparable).floatValue());
    }

    @vr2
    /* renamed from: c */
    public Float mo27427g() {
        return Float.valueOf(this.f31495b);
    }

    @vr2
    /* renamed from: d */
    public Float mo27428i() {
        return Float.valueOf(this.f31494a);
    }

    /* renamed from: e */
    public boolean mo39589e(float f, float f2) {
        return f <= f2;
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof C5949kz) {
            if (isEmpty() && ((C5949kz) obj).isEmpty()) {
                return true;
            }
            C5949kz kzVar = (C5949kz) obj;
            if (this.f31494a == kzVar.f31494a) {
                if (this.f31495b == kzVar.f31495b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ boolean mo38939f(Comparable comparable, Comparable comparable2) {
        return mo39589e(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.valueOf(this.f31494a).hashCode() * 31) + Float.valueOf(this.f31495b).hashCode();
    }

    public boolean isEmpty() {
        return this.f31494a > this.f31495b;
    }

    @vr2
    public String toString() {
        return this.f31494a + ".." + this.f31495b;
    }
}
