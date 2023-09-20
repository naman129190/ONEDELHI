package com.onedelhi.secure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
public @interface tt1 {
    String attribute();

    String event() default "";

    String method() default "";

    Class type();
}
