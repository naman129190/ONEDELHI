package com.onedelhi.secure;

public class pv0<T> {

    /* renamed from: a */
    public final Class<T> f33782a;

    /* renamed from: a */
    public final T f33783a;

    public pv0(Class<T> cls, T t) {
        this.f33782a = (Class) i43.m51838b(cls);
        this.f33783a = i43.m51838b(t);
    }

    /* renamed from: a */
    public T mo42921a() {
        return this.f33783a;
    }

    /* renamed from: b */
    public Class<T> mo42922b() {
        return this.f33782a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.f33782a, this.f33783a});
    }
}
