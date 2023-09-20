package com.onedelhi.secure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: com.onedelhi.secure.zb */
public @interface C4069zb {

    @Target({})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.zb$a */
    public @interface C4070a {
        int mask() default 0;

        @mr2
        String name();

        int value();
    }

    @mr2
    C4070a[] intMapping() default {};

    @mr2
    String value();
}
