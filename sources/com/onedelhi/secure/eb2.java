package com.onedelhi.secure;

import java.util.Arrays;

public final class eb2<V> {
    @ts2

    /* renamed from: a */
    public final V f11164a;
    @ts2

    /* renamed from: a */
    public final Throwable f11165a;

    public eb2(V v) {
        this.f11164a = v;
        this.f11165a = null;
    }

    public eb2(Throwable th) {
        this.f11165a = th;
        this.f11164a = null;
    }

    @ts2
    /* renamed from: a */
    public Throwable mo15103a() {
        return this.f11165a;
    }

    @ts2
    /* renamed from: b */
    public V mo15104b() {
        return this.f11164a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb2)) {
            return false;
        }
        eb2 eb2 = (eb2) obj;
        if (mo15104b() != null && mo15104b().equals(eb2.mo15104b())) {
            return true;
        }
        if (mo15103a() == null || eb2.mo15103a() == null) {
            return false;
        }
        return mo15103a().toString().equals(mo15103a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{mo15104b(), mo15103a()});
    }
}
