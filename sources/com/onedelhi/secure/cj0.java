package com.onedelhi.secure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Repeatable(C1911a.class)
@Retention(RetentionPolicy.CLASS)
public @interface cj0 {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.onedelhi.secure.cj0$a */
    public @interface C1911a {
        cj0[] value();
    }

    String tableName();
}
