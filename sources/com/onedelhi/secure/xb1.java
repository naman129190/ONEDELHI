package com.onedelhi.secure;

import com.onedelhi.secure.yb1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@sj3(16)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface xb1 {
    Class<?> contentEntity() default Object.class;

    String languageId() default "";

    yb1.C3984a matchInfo() default yb1.C3984a.f22971b;

    String[] notIndexed() default {};

    yb1.C3985b order() default yb1.C3985b.f22972a;

    int[] prefix() default {};

    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}
