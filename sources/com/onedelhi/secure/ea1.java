package com.onedelhi.secure;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.CLASS)
public @interface ea1 {

    /* renamed from: V */
    public static final int f11151V = 1;

    /* renamed from: W */
    public static final int f11152W = 2;

    /* renamed from: X */
    public static final int f11153X = 3;

    /* renamed from: Y */
    public static final int f11154Y = 4;

    /* renamed from: Z */
    public static final int f11155Z = 5;

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.onedelhi.secure.ea1$a */
    public @interface C2037a {
    }

    String[] childColumns();

    boolean deferred() default false;

    Class<?> entity();

    @C2037a
    int onDelete() default 1;

    @C2037a
    int onUpdate() default 1;

    String[] parentColumns();
}
