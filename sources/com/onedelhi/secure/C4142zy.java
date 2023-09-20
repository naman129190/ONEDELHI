package com.onedelhi.secure;

import com.google.auto.value.AutoValue;
import com.onedelhi.secure.C3598tf;

@AutoValue
/* renamed from: com.onedelhi.secure.zy */
public abstract class C4142zy {

    @AutoValue.Builder
    /* renamed from: com.onedelhi.secure.zy$a */
    public static abstract class C4143a {
        @mr2
        /* renamed from: a */
        public abstract C4142zy mo24892a();

        @mr2
        /* renamed from: b */
        public abstract C4143a mo24893b(@ts2 C3365r5 r5Var);

        @mr2
        /* renamed from: c */
        public abstract C4143a mo24894c(@ts2 C4144b bVar);
    }

    /* renamed from: com.onedelhi.secure.zy$b */
    public enum C4144b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        

        /* renamed from: n */
        public final int f23943n;

        /* access modifiers changed from: public */
        C4144b(int i) {
            this.f23943n = i;
        }
    }

    @mr2
    /* renamed from: a */
    public static C4143a m33531a() {
        return new C3598tf.C3600b();
    }

    @ts2
    /* renamed from: b */
    public abstract C3365r5 mo24887b();

    @ts2
    /* renamed from: c */
    public abstract C4144b mo24888c();
}
