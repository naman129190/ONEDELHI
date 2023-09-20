package com.onedelhi.secure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@r94(allowedTargets = {C6097m7.f32036b})
@Target({ElementType.ANNOTATION_TYPE})
@xj0(message = "Please use RequiresOptIn instead.")
@gz3(version = "1.2")
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/ay0;", "", "Lcom/onedelhi/secure/ay0$a;", "level", "()Lcom/onedelhi/secure/ay0$a;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
@yl3(C5970l7.f31579b)
@zj0(errorSince = "1.6", warningSince = "1.4")
@Retention(RetentionPolicy.CLASS)
public @interface ay0 {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/ay0$a;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.ay0$a */
    public enum C4598a {
        WARNING,
        ERROR
    }

    C4598a level() default C4598a.ERROR;
}
