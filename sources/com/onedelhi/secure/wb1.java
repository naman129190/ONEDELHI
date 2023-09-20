package com.onedelhi.secure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@sj3(16)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface wb1 {
    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}
