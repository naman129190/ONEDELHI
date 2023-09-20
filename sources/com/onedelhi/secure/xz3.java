package com.onedelhi.secure;

import java.lang.annotation.Annotation;

public final class xz3 implements wz3 {

    /* renamed from: a */
    public static final wz3 f37735a = new xz3();

    /* renamed from: a */
    public static Annotation[] m70984a(Annotation[] annotationArr) {
        if (er4.m47225l(annotationArr, wz3.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = f37735a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class<? extends Annotation> annotationType() {
        return wz3.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof wz3;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "@" + wz3.class.getName() + "()";
    }
}
