package com.onedelhi.secure;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@r94(allowedTargets = {C6097m7.CLASS, C6097m7.PROPERTY, C6097m7.LOCAL_VARIABLE, C6097m7.VALUE_PARAMETER, C6097m7.CONSTRUCTOR, C6097m7.FUNCTION, C6097m7.PROPERTY_GETTER, C6097m7.PROPERTY_SETTER, C6097m7.EXPRESSION, C6097m7.FILE, C6097m7.TYPEALIAS})
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@xj0(message = "Please use OptIn instead.", replaceWith = @oi3(expression = "OptIn(*markerClass)", imports = {"kotlin.OptIn"}))
@gz3(version = "1.2")
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B$\u0012\"\u0010\u0004\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\u0002\"\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003R!\u0010\u0004\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/up4;", "", "", "Lcom/onedelhi/secure/hx1;", "markerClass", "()[Ljava/lang/Class;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
@yl3(C5970l7.SOURCE)
@zj0(errorSince = "1.6", warningSince = "1.4")
@Retention(RetentionPolicy.SOURCE)
public @interface up4 {
    Class<? extends Annotation>[] markerClass();
}
