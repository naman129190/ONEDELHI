package com.onedelhi.secure;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
@wc2
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.onedelhi.secure.my */
public @interface C6157my {
    Class<?> value();
}
