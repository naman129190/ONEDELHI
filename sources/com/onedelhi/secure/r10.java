package com.onedelhi.secure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface r10 {

    /* renamed from: A */
    public static final int f19527A = 2;

    /* renamed from: B */
    public static final int f19528B = 3;

    /* renamed from: C */
    public static final int f19529C = 4;

    /* renamed from: D */
    public static final int f19530D = 5;

    /* renamed from: E */
    public static final int f19531E = 1;

    /* renamed from: F */
    public static final int f19532F = 2;

    /* renamed from: G */
    public static final int f19533G = 3;

    /* renamed from: H */
    public static final int f19534H = 4;
    @sj3(21)

    /* renamed from: I */
    public static final int f19535I = 5;
    @sj3(21)

    /* renamed from: J */
    public static final int f19536J = 6;

    /* renamed from: m */
    public static final String f19537m = "[field-name]";

    /* renamed from: n */
    public static final String f19538n = "[value-unspecified]";

    /* renamed from: z */
    public static final int f19539z = 1;

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.onedelhi.secure.r10$a */
    public @interface C3351a {
    }

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.onedelhi.secure.r10$b */
    public @interface C3352b {
    }

    @C3351a
    int collate() default 1;

    String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    String name() default "[field-name]";

    @C3352b
    int typeAffinity() default 1;
}
