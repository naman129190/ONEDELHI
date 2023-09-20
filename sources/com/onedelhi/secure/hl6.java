package com.onedelhi.secure;

import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class hl6 extends xk6 {

    /* renamed from: a */
    public final transient Object f13193a;

    public hl6(Object obj) {
        Objects.requireNonNull(obj);
        this.f13193a = obj;
    }

    /* renamed from: b */
    public final int mo14790b(Object[] objArr, int i) {
        objArr[0] = this.f13193a;
        return 1;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f13193a.equals(obj);
    }

    /* renamed from: g */
    public final jl6 mo16060g() {
        return new zk6(this.f13193a);
    }

    public final int hashCode() {
        return this.f13193a.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new zk6(this.f13193a);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f13193a.toString();
        return "[" + obj + "]";
    }
}
