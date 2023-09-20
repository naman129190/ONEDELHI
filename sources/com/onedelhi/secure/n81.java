package com.onedelhi.secure;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface n81 {
    @lr2

    /* renamed from: C */
    public static final String f32456C = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";
    @lr2

    /* renamed from: D */
    public static final String f32457D = "this";
    @lr2

    /* renamed from: E */
    public static final String f32458E = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";
    @lr2

    /* renamed from: F */
    public static final String f32459F = "The return value of this method";
    @lr2

    /* renamed from: G */
    public static final String f32460G = "this";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}
