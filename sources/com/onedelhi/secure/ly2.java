package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
@Retention(RetentionPolicy.SOURCE)
public @interface ly2 {
    String defaultValue() default "";

    int value();
}
