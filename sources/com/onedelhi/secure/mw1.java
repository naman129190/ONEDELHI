package com.onedelhi.secure;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.CLASS)
public @interface mw1 {
    String entityColumn() default "";

    String parentColumn() default "";

    Class<?> value();
}
