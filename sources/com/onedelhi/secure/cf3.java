package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0002\u001a\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0007*\u00020\t2\u0006\u0010\u0002\u001a\u00020\tH\u0002\u001aB\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u000b\"\u0018\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\f*\b\u0012\u0004\u0012\u00028\u00000\u0003*\u00028\u00012\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\n¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¨\u0006\u0017"}, d2 = {"", "T", "that", "Lcom/onedelhi/secure/mz;", "e", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lcom/onedelhi/secure/mz;", "", "Lcom/onedelhi/secure/lz;", "c", "", "d", "", "", "R", "element", "", "b", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "isPositive", "", "step", "Lcom/onedelhi/secure/un4;", "a", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/ranges/RangesKt")
public class cf3 {
    /* renamed from: a */
    public static final void m40866a(boolean z, @vr2 Number number) {
        jt1.m53777p(number, "step");
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }

    @gz3(version = "1.3")
    @xq1
    /* renamed from: b */
    public static final <T, R extends Iterable<? extends T> & C6158mz<T>> boolean m40867b(R r, T t) {
        jt1.m53777p(r, "<this>");
        return t != null && ((C6158mz) r).mo27426b((Comparable) t);
    }

    @gz3(version = "1.1")
    @vr2
    /* renamed from: c */
    public static final C6069lz<Double> m40868c(double d, double d2) {
        return new C5856jz(d, d2);
    }

    @gz3(version = "1.1")
    @vr2
    /* renamed from: d */
    public static final C6069lz<Float> m40869d(float f, float f2) {
        return new C5949kz(f, f2);
    }

    @vr2
    /* renamed from: e */
    public static final <T extends Comparable<? super T>> C6158mz<T> m40870e(@vr2 T t, @vr2 T t2) {
        jt1.m53777p(t, "<this>");
        jt1.m53777p(t2, "that");
        return new w10(t, t2);
    }
}
