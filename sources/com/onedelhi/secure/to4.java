package com.onedelhi.secure;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface to4 {
    Class<?> entity() default Object.class;

    @qu2
    int onConflict() default 3;
}
