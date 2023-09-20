package com.onedelhi.secure;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.CLASS)
public @interface up1 {

    /* renamed from: com.onedelhi.secure.up1$a */
    public enum C3732a {
        ASC,
        DESC
    }

    String name() default "";

    C3732a[] orders() default {};

    boolean unique() default false;

    String[] value();
}
