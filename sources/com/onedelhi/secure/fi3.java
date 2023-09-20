package com.onedelhi.secure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Repeatable(C2170a.class)
@Retention(RetentionPolicy.CLASS)
public @interface fi3 {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.onedelhi.secure.fi3$a */
    public @interface C2170a {
        fi3[] value();
    }

    String fromColumnName();

    String tableName();

    String toColumnName();
}
