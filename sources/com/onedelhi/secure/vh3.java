package com.onedelhi.secure;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class vh3 {

    /* renamed from: a */
    public static final String f36550a = "https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch";

    /* renamed from: b */
    public static final String f36551b = "https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations";

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.vh3$a */
    public @interface C7050a {

        /* renamed from: H */
        public static final String f36552H = "experimentId";

        /* renamed from: I */
        public static final String f36553I = "variantId";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.vh3$b */
    public @interface C7051b {

        /* renamed from: J */
        public static final String f36554J = "appInstanceId";

        /* renamed from: K */
        public static final String f36555K = "appInstanceIdToken";

        /* renamed from: L */
        public static final String f36556L = "appId";

        /* renamed from: M */
        public static final String f36557M = "countryCode";

        /* renamed from: N */
        public static final String f36558N = "languageCode";

        /* renamed from: O */
        public static final String f36559O = "platformVersion";

        /* renamed from: P */
        public static final String f36560P = "timeZone";

        /* renamed from: Q */
        public static final String f36561Q = "appVersion";

        /* renamed from: R */
        public static final String f36562R = "appBuild";

        /* renamed from: S */
        public static final String f36563S = "packageName";

        /* renamed from: T */
        public static final String f36564T = "sdkVersion";

        /* renamed from: U */
        public static final String f36565U = "analyticsUserProperties";

        /* renamed from: V */
        public static final String f36566V = "firstOpenTime";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.vh3$c */
    public @interface C7052c {

        /* renamed from: W */
        public static final String f36567W = "entries";

        /* renamed from: X */
        public static final String f36568X = "experimentDescriptions";

        /* renamed from: Y */
        public static final String f36569Y = "personalizationMetadata";

        /* renamed from: Z */
        public static final String f36570Z = "state";

        /* renamed from: a0 */
        public static final String f36571a0 = "templateVersion";
    }
}
