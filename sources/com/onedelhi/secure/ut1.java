package com.onedelhi.secure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
public @interface ut1 {
    tt1[] value();
}
