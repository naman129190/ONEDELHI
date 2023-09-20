package com.onedelhi.secure;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@r94(allowedTargets = {C6097m7.f32036b, C6097m7.f32043i, C6097m7.f32044j, C6097m7.f32045k, C6097m7.f32042h, C6097m7.f32039e, C6097m7.f32041g})
@im2
@Documented
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB4\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\n\u001a\u00020\t8\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/wj3;", "", "", "value", "()Ljava/lang/String;", "", "allOf", "()[Ljava/lang/String;", "anyOf", "", "conditional", "()Z", "a", "b", "annotation"}, k = 1, mv = {1, 7, 1})
@yl3(C5970l7.f31579b)
@Retention(RetentionPolicy.CLASS)
public @interface wj3 {

    @r94(allowedTargets = {C6097m7.f32039e, C6097m7.f32043i, C6097m7.f32044j, C6097m7.f32045k, C6097m7.f32041g})
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/onedelhi/secure/wj3$a;", "", "Lcom/onedelhi/secure/wj3;", "value", "()Lcom/onedelhi/secure/wj3;", "annotation"}, k = 1, mv = {1, 7, 1})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.onedelhi.secure.wj3$a */
    public @interface C3851a {
        wj3 value() default @wj3;
    }

    @r94(allowedTargets = {C6097m7.f32039e, C6097m7.f32043i, C6097m7.f32044j, C6097m7.f32045k, C6097m7.f32041g})
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/onedelhi/secure/wj3$b;", "", "Lcom/onedelhi/secure/wj3;", "value", "()Lcom/onedelhi/secure/wj3;", "annotation"}, k = 1, mv = {1, 7, 1})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.onedelhi.secure.wj3$b */
    public @interface C3852b {
        wj3 value() default @wj3;
    }

    String[] allOf() default {};

    String[] anyOf() default {};

    boolean conditional() default false;

    String value() default "";
}
