package com.onedelhi.secure;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public interface j04 extends HasApiKey<Api.ApiOptions.NoOptions> {

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.j04$a */
    public @interface C2466a {

        /* renamed from: t0 */
        public static final int f13972t0 = 0;

        /* renamed from: u0 */
        public static final int f13973u0 = 1;

        /* renamed from: v0 */
        public static final int f13974v0 = 2;
    }

    @mr2
    /* renamed from: a */
    w94<Void> mo18071a();

    @mr2
    /* renamed from: b */
    w94<Integer> mo18072b();

    @mr2
    /* renamed from: j */
    w94<Boolean> mo18073j(@mr2 String str);
}
