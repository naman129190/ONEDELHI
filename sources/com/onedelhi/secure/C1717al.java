package com.onedelhi.secure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
/* renamed from: com.onedelhi.secure.al */
public @interface C1717al {
    boolean requireAll() default true;

    String[] value();
}
