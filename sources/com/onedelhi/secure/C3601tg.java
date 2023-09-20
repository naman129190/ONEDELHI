package com.onedelhi.secure;

import java.util.Objects;

/* renamed from: com.onedelhi.secure.tg */
public final class C3601tg<T> extends qv0<T> {

    /* renamed from: a */
    public final d53 f20789a;

    /* renamed from: a */
    public final Integer f20790a;

    /* renamed from: a */
    public final T f20791a;

    public C3601tg(@ts2 Integer num, T t, d53 d53) {
        this.f20790a = num;
        Objects.requireNonNull(t, "Null payload");
        this.f20791a = t;
        Objects.requireNonNull(d53, "Null priority");
        this.f20789a = d53;
    }

    @ts2
    /* renamed from: a */
    public Integer mo23457a() {
        return this.f20790a;
    }

    /* renamed from: b */
    public T mo23458b() {
        return this.f20791a;
    }

    /* renamed from: c */
    public d53 mo23459c() {
        return this.f20789a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qv0)) {
            return false;
        }
        qv0 qv0 = (qv0) obj;
        Integer num = this.f20790a;
        if (num != null ? num.equals(qv0.mo23457a()) : qv0.mo23457a() == null) {
            return this.f20791a.equals(qv0.mo23458b()) && this.f20789a.equals(qv0.mo23459c());
        }
    }

    public int hashCode() {
        Integer num = this.f20790a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f20791a.hashCode()) * 1000003) ^ this.f20789a.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f20790a + ", payload=" + this.f20791a + ", priority=" + this.f20789a + "}";
    }
}
