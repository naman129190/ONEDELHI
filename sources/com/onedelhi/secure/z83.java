package com.onedelhi.secure;

import java.lang.annotation.Annotation;

public final class z83<T> {

    /* renamed from: a */
    public final Class<? extends Annotation> f38282a;

    /* renamed from: b */
    public final Class<T> f38283b;

    /* renamed from: com.onedelhi.secure.z83$a */
    public @interface C7454a {
    }

    public z83(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f38282a = cls;
        this.f38283b = cls2;
    }

    /* renamed from: a */
    public static <T> z83<T> m72649a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new z83<>(cls, cls2);
    }

    /* renamed from: b */
    public static <T> z83<T> m72650b(Class<T> cls) {
        return new z83<>(C7454a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z83.class != obj.getClass()) {
            return false;
        }
        z83 z83 = (z83) obj;
        if (!this.f38283b.equals(z83.f38283b)) {
            return false;
        }
        return this.f38282a.equals(z83.f38282a);
    }

    public int hashCode() {
        return (this.f38283b.hashCode() * 31) + this.f38282a.hashCode();
    }

    public String toString() {
        if (this.f38282a == C7454a.class) {
            return this.f38283b.getName();
        }
        return "@" + this.f38282a.getName() + " " + this.f38283b.getName();
    }
}
