package com.onedelhi.secure;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.CLASS)
/* renamed from: com.onedelhi.secure.dq */
public @interface C1988dq {

    /* renamed from: com.onedelhi.secure.dq$a */
    public enum C1989a {
        ENABLED,
        DISABLED,
        INHERITED
    }

    C1989a enums() default C1989a.INHERITED;

    C1989a uuid() default C1989a.INHERITED;
}
