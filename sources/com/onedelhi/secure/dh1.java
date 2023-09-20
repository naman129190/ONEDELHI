package com.onedelhi.secure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface dh1 {

    /* renamed from: a0 */
    public static final int f10742a0 = 0;

    /* renamed from: b0 */
    public static final int f10743b0 = 1;

    /* renamed from: c0 */
    public static final int f10744c0 = 2;

    boolean memoizeStaticMethod() default false;

    int override() default 0;

    boolean skipStaticMethod() default false;

    String staticMethodName() default "";
}
