package com.onedelhi.secure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@r94(allowedTargets = {C6097m7.f32036b})
@Target({ElementType.ANNOTATION_TYPE})
@xj0(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @oi3(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/yx0;", "", "Lcom/onedelhi/secure/yx0$a;", "level", "()Lcom/onedelhi/secure/yx0$a;", "a", "annotation-experimental_release"}, k = 1, mv = {1, 4, 2})
@yl3(C5970l7.f31579b)
@Retention(RetentionPolicy.CLASS)
public @interface yx0 {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/yx0$a;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "annotation-experimental_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.onedelhi.secure.yx0$a */
    public enum C4028a {
        WARNING,
        ERROR
    }

    C4028a level() default C4028a.ERROR;
}
