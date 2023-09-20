package com.onedelhi.secure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Repeatable(C4096a.class)
@Retention(RetentionPolicy.CLASS)
public @interface zi0 {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.onedelhi.secure.zi0$a */
    public @interface C4096a {
        zi0[] value();
    }

    String columnName();

    String tableName();
}
