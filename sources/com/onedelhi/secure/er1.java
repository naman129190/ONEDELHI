package com.onedelhi.secure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface er1 {
    Class<?> entity() default Object.class;

    @qu2
    int onConflict() default 3;
}
