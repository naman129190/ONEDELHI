package com.onedelhi.secure;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface j64 {

    @Documented
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.onedelhi.secure.j64$a */
    public @interface C2477a {
    }

    @Documented
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.onedelhi.secure.j64$b */
    public @interface C2478b {
    }

    Class<?>[] modules() default {};
}