package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u001c\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\b\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a-\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\bø\u0001\u0000\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a1\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\b\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\t\u0010\n\u001aB\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\bø\u0001\u0000\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\b\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a-\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\bø\u0001\u0000\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a1\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\b\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u000f\u0010\n\u001aB\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\bø\u0001\u0000\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u0010\u0010\f\u001a\u0011\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0005H\b\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0014"}, d2 = {"", "value", "Lcom/onedelhi/secure/un4;", "h", "Lkotlin/Function0;", "", "lazyMessage", "i", "T", "j", "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "(Ljava/lang/Object;Lcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "c", "d", "e", "f", "message", "", "g", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/PreconditionsKt")
public class n43 extends m43 {
    @xq1
    /* renamed from: c */
    public static final void m57890c(boolean z) {
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @xq1
    /* renamed from: d */
    public static final void m57891d(boolean z, cc1<? extends Object> cc1) {
        jt1.m53777p(cc1, "lazyMessage");
        if (!z) {
            throw new IllegalStateException(cc1.invoke().toString());
        }
    }

    @xq1
    /* renamed from: e */
    public static final <T> T m57892e(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @xq1
    /* renamed from: f */
    public static final <T> T m57893f(T t, cc1<? extends Object> cc1) {
        jt1.m53777p(cc1, "lazyMessage");
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(cc1.invoke().toString());
    }

    @xq1
    /* renamed from: g */
    public static final Void m57894g(Object obj) {
        jt1.m53777p(obj, "message");
        throw new IllegalStateException(obj.toString());
    }

    @xq1
    /* renamed from: h */
    public static final void m57895h(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @xq1
    /* renamed from: i */
    public static final void m57896i(boolean z, cc1<? extends Object> cc1) {
        jt1.m53777p(cc1, "lazyMessage");
        if (!z) {
            throw new IllegalArgumentException(cc1.invoke().toString());
        }
    }

    @xq1
    /* renamed from: j */
    public static final <T> T m57897j(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @xq1
    /* renamed from: k */
    public static final <T> T m57898k(T t, cc1<? extends Object> cc1) {
        jt1.m53777p(cc1, "lazyMessage");
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(cc1.invoke().toString());
    }
}
