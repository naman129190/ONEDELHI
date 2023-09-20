package com.onedelhi.secure;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@r94(allowedTargets = {C6097m7.CLASS, C6097m7.FUNCTION, C6097m7.PROPERTY, C6097m7.ANNOTATION_CLASS, C6097m7.CONSTRUCTOR, C6097m7.PROPERTY_SETTER, C6097m7.PROPERTY_GETTER, C6097m7.TYPEALIAS})
@im2
@Documented
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@gz3(version = "1.4")
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001e\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/zj0;", "", "", "warningSince", "()Ljava/lang/String;", "errorSince", "hiddenSince", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
@Retention(RetentionPolicy.RUNTIME)
public @interface zj0 {
    String errorSince() default "";

    String hiddenSince() default "";

    String warningSince() default "";
}
