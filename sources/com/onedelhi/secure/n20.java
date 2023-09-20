package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B4\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003J$\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J:\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0016"}, d2 = {"Lcom/onedelhi/secure/n20;", "", "a", "Lkotlin/Function1;", "", "Lcom/onedelhi/secure/iy2;", "name", "cause", "Lcom/onedelhi/secure/un4;", "b", "result", "onCancellation", "c", "", "toString", "", "hashCode", "other", "", "equals", "<init>", "(Ljava/lang/Object;Lcom/onedelhi/secure/ec1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class n20 {
    @rw1
    @vr2

    /* renamed from: a */
    public final ec1<Throwable, un4> f32342a;
    @rw1
    @ss2

    /* renamed from: a */
    public final Object f32343a;

    public n20(@ss2 Object obj, @vr2 ec1<? super Throwable, un4> ec1) {
        this.f32343a = obj;
        this.f32342a = ec1;
    }

    /* renamed from: d */
    public static /* synthetic */ n20 m57790d(n20 n20, Object obj, ec1<Throwable, un4> ec1, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = n20.f32343a;
        }
        if ((i & 2) != 0) {
            ec1 = n20.f32342a;
        }
        return n20.mo40898c(obj, ec1);
    }

    @ss2
    /* renamed from: a */
    public final Object mo40896a() {
        return this.f32343a;
    }

    @vr2
    /* renamed from: b */
    public final ec1<Throwable, un4> mo40897b() {
        return this.f32342a;
    }

    @vr2
    /* renamed from: c */
    public final n20 mo40898c(@ss2 Object obj, @vr2 ec1<? super Throwable, un4> ec1) {
        return new n20(obj, ec1);
    }

    public boolean equals(@ss2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n20)) {
            return false;
        }
        n20 n20 = (n20) obj;
        return jt1.m53768g(this.f32343a, n20.f32343a) && jt1.m53768g(this.f32342a, n20.f32342a);
    }

    public int hashCode() {
        Object obj = this.f32343a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f32342a.hashCode();
    }

    @vr2
    public String toString() {
        return "CompletedWithCancellation(result=" + this.f32343a + ", onCancellation=" + this.f32342a + ')';
    }
}
