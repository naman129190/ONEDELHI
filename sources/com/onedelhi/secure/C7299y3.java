package com.onedelhi.secure;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
/* renamed from: com.onedelhi.secure.y3 */
public @interface C7299y3 {
    boolean enabled() default true;

    String name();
}
