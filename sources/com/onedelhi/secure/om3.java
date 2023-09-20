package com.onedelhi.secure;

import java.util.Comparator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003B\u001f\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003R'\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/om3;", "T", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "reversed", "comparator", "Ljava/util/Comparator;", "()Ljava/util/Comparator;", "<init>", "(Ljava/util/Comparator;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class om3<T> implements Comparator<T> {
    @vr2

    /* renamed from: a */
    public final Comparator<T> f33090a;

    public om3(@vr2 Comparator<T> comparator) {
        jt1.m53777p(comparator, "comparator");
        this.f33090a = comparator;
    }

    @vr2
    /* renamed from: a */
    public final Comparator<T> mo41853a() {
        return this.f33090a;
    }

    public int compare(T t, T t2) {
        return this.f33090a.compare(t2, t);
    }

    @vr2
    public final Comparator<T> reversed() {
        return this.f33090a;
    }
}
