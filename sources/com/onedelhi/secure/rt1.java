package com.onedelhi.secure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
public @interface rt1 {
    String attribute();

    String event() default "";
}
