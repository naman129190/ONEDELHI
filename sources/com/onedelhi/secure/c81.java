package com.onedelhi.secure;

import android.util.FloatProperty;

public abstract class c81<T> {

    /* renamed from: a */
    public final String f10189a;

    /* renamed from: com.onedelhi.secure.c81$a */
    public static class C1863a extends c81<T> {

        /* renamed from: a */
        public final /* synthetic */ FloatProperty f10190a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1863a(String str, FloatProperty floatProperty) {
            super(str);
            this.f10190a = floatProperty;
        }

        /* renamed from: b */
        public float mo14062b(T t) {
            return ((Float) this.f10190a.get(t)).floatValue();
        }

        /* renamed from: c */
        public void mo14063c(T t, float f) {
            this.f10190a.setValue(t, f);
        }
    }

    public c81(String str) {
        this.f10189a = str;
    }

    @sj3(24)
    /* renamed from: a */
    public static <T> c81<T> m12391a(FloatProperty<T> floatProperty) {
        return new C1863a(floatProperty.getName(), floatProperty);
    }

    /* renamed from: b */
    public abstract float mo14062b(T t);

    /* renamed from: c */
    public abstract void mo14063c(T t, float f);
}
