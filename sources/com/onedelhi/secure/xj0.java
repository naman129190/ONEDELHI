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
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001c\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\b8\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/xj0;", "", "", "message", "()Ljava/lang/String;", "Lcom/onedelhi/secure/oi3;", "replaceWith", "()Lcom/onedelhi/secure/oi3;", "Lcom/onedelhi/secure/ak0;", "level", "()Lcom/onedelhi/secure/ak0;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
@Retention(RetentionPolicy.RUNTIME)
public @interface xj0 {
    ak0 level() default ak0.WARNING;

    String message();

    oi3 replaceWith() default @oi3(expression = "", imports = {});
}
