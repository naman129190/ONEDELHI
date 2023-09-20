package com.onedelhi.secure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

public final class s11 {

    /* renamed from: a */
    public final Field f34894a;

    public s11(Field field) {
        C4453a.m35637b(field);
        this.f34894a = field;
    }

    /* renamed from: a */
    public Object mo44144a(Object obj) throws IllegalAccessException {
        return this.f34894a.get(obj);
    }

    /* renamed from: b */
    public <T extends Annotation> T mo44145b(Class<T> cls) {
        return this.f34894a.getAnnotation(cls);
    }

    /* renamed from: c */
    public Collection<Annotation> mo44146c() {
        return Arrays.asList(this.f34894a.getAnnotations());
    }

    /* renamed from: d */
    public Class<?> mo44147d() {
        return this.f34894a.getType();
    }

    /* renamed from: e */
    public Type mo44148e() {
        return this.f34894a.getGenericType();
    }

    /* renamed from: f */
    public Class<?> mo44149f() {
        return this.f34894a.getDeclaringClass();
    }

    /* renamed from: g */
    public String mo44150g() {
        return this.f34894a.getName();
    }

    /* renamed from: h */
    public boolean mo44151h(int i) {
        return (i & this.f34894a.getModifiers()) != 0;
    }

    /* renamed from: i */
    public boolean mo44152i() {
        return this.f34894a.isSynthetic();
    }
}
