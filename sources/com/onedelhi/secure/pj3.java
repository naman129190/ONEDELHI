package com.onedelhi.secure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@ji3
@Repeatable(C6449a.class)
@r94(allowedTargets = {C6097m7.CLASS, C6097m7.FUNCTION, C6097m7.PROPERTY, C6097m7.CONSTRUCTOR, C6097m7.TYPEALIAS})
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@gz3(version = "1.2")
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\t8\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\f8\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/pj3;", "", "", "version", "()Ljava/lang/String;", "message", "Lcom/onedelhi/secure/ak0;", "level", "()Lcom/onedelhi/secure/ak0;", "Lcom/onedelhi/secure/qj3;", "versionKind", "()Lcom/onedelhi/secure/qj3;", "", "errorCode", "()I", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
@yl3(C5970l7.SOURCE)
@Retention(RetentionPolicy.SOURCE)
public @interface pj3 {

    @ki3
    @r94(allowedTargets = {C6097m7.CLASS, C6097m7.FUNCTION, C6097m7.PROPERTY, C6097m7.CONSTRUCTOR, C6097m7.TYPEALIAS})
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @yl3(C5970l7.SOURCE)
    @ii2(mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.pj3$a */
    public @interface C6449a {
        pj3[] value();
    }

    int errorCode() default -1;

    ak0 level() default ak0.ERROR;

    String message() default "";

    String version();

    qj3 versionKind() default qj3.f34259a;
}
