package com.onedelhi.secure;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0018\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/rl2;", "E", "Lcom/onedelhi/secure/t0;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "fromIndex", "toIndex", "Lcom/onedelhi/secure/un4;", "f", "index", "get", "(I)Ljava/lang/Object;", "b", "()I", "size", "", "list", "<init>", "(Ljava/util/List;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class rl2<E> extends C6809t0<E> implements RandomAccess {
    @vr2

    /* renamed from: a */
    public final List<E> f34669a;

    /* renamed from: n */
    public int f34670n;

    /* renamed from: o */
    public int f34671o;

    public rl2(@vr2 List<? extends E> list) {
        jt1.m53777p(list, "list");
        this.f34669a = list;
    }

    /* renamed from: b */
    public int mo34341b() {
        return this.f34671o;
    }

    /* renamed from: f */
    public final void mo43941f(int i, int i2) {
        C6809t0.f35278a.mo44672d(i, i2, this.f34669a.size());
        this.f34670n = i;
        this.f34671o = i2 - i;
    }

    public E get(int i) {
        C6809t0.f35278a.mo44670b(i, this.f34671o);
        return this.f34669a.get(this.f34670n + i);
    }
}
