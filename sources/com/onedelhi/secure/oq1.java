package com.onedelhi.secure;

import androidx.lifecycle.C0709m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\bJ\u0006\u0010\r\u001a\u00020\f¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/oq1;", "", "Lcom/onedelhi/secure/au4;", "T", "Lcom/onedelhi/secure/hx1;", "clazz", "Lkotlin/Function1;", "Lcom/onedelhi/secure/jb0;", "Lcom/onedelhi/secure/wy0;", "initializer", "Lcom/onedelhi/secure/un4;", "a", "Landroidx/lifecycle/m$b;", "b", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
@bu4
public final class oq1 {
    @vr2

    /* renamed from: a */
    public final List<cu4<?>> f18067a = new ArrayList();

    /* renamed from: a */
    public final <T extends au4> void mo22052a(@vr2 hx1<T> hx1, @vr2 ec1<? super jb0, ? extends T> ec1) {
        jt1.m53777p(hx1, "clazz");
        jt1.m53777p(ec1, "initializer");
        this.f18067a.add(new cu4(nw1.m58840d(hx1), ec1));
    }

    @vr2
    /* renamed from: b */
    public final C0709m.C0713b mo22053b() {
        Object[] array = this.f18067a.toArray(new cu4[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        cu4[] cu4Arr = (cu4[]) array;
        return new nq1((cu4[]) Arrays.copyOf(cu4Arr, cu4Arr.length));
    }
}
