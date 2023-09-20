package com.onedelhi.secure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: com.onedelhi.secure.if */
public @interface C2444if {
    int from();

    Class<?> spec() default Object.class;

    /* renamed from: to */
    int mo17743to();
}
