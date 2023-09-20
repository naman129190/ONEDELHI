package com.onedelhi.secure;

@fz0
public @interface o63 {

    /* renamed from: com.onedelhi.secure.o63$a */
    public enum C6247a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    C6247a intEncoding() default C6247a.DEFAULT;

    int tag();
}
