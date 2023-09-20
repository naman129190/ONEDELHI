package com.onedelhi.secure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Repeatable(C2253a.class)
@Retention(RetentionPolicy.CLASS)
public @interface gi3 {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.onedelhi.secure.gi3$a */
    public @interface C2253a {
        gi3[] value();
    }

    String fromTableName();

    String toTableName();
}
