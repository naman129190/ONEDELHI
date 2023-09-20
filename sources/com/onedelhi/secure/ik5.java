package com.onedelhi.secure;

import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class ik5 extends cj5 {

    /* renamed from: a */
    public final transient Object f13727a;

    public ik5(Object obj) {
        Objects.requireNonNull(obj);
        this.f13727a = obj;
    }

    /* renamed from: b */
    public final int mo13125b(Object[] objArr, int i) {
        objArr[0] = this.f13727a;
        return 1;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f13727a.equals(obj);
    }

    /* renamed from: g */
    public final qk5 mo13129g() {
        return new kj5(this.f13727a);
    }

    public final int hashCode() {
        return this.f13727a.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new kj5(this.f13727a);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f13727a.toString();
        return "[" + obj + "]";
    }
}
