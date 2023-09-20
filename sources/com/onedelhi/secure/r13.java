package com.onedelhi.secure;

import com.google.auto.value.AutoValue;
import com.onedelhi.secure.C5267fh;
import com.onedelhi.secure.q13;

@AutoValue
public abstract class r13 {
    @mr2

    /* renamed from: a */
    public static r13 f34478a = m63311a().mo35952a();

    @AutoValue.Builder
    /* renamed from: com.onedelhi.secure.r13$a */
    public static abstract class C6634a {
        @mr2
        /* renamed from: a */
        public abstract r13 mo35952a();

        @mr2
        /* renamed from: b */
        public abstract C6634a mo35953b(@ts2 String str);

        @mr2
        /* renamed from: c */
        public abstract C6634a mo35954c(long j);

        @mr2
        /* renamed from: d */
        public abstract C6634a mo35955d(@mr2 String str);

        @mr2
        /* renamed from: e */
        public abstract C6634a mo35956e(@ts2 String str);

        @mr2
        /* renamed from: f */
        public abstract C6634a mo35957f(@ts2 String str);

        @mr2
        /* renamed from: g */
        public abstract C6634a mo35958g(@mr2 q13.C6501a aVar);

        @mr2
        /* renamed from: h */
        public abstract C6634a mo35959h(long j);
    }

    @mr2
    /* renamed from: a */
    public static C6634a m63311a() {
        return new C5267fh.C5269b().mo35959h(0).mo35958g(q13.C6501a.ATTEMPT_MIGRATION).mo35954c(0);
    }

    @ts2
    /* renamed from: b */
    public abstract String mo35941b();

    /* renamed from: c */
    public abstract long mo35942c();

    @ts2
    /* renamed from: d */
    public abstract String mo35943d();

    @ts2
    /* renamed from: e */
    public abstract String mo35944e();

    @ts2
    /* renamed from: f */
    public abstract String mo35946f();

    @mr2
    /* renamed from: g */
    public abstract q13.C6501a mo35947g();

    /* renamed from: h */
    public abstract long mo35948h();

    /* renamed from: i */
    public boolean mo43783i() {
        return mo35947g() == q13.C6501a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean mo43784j() {
        return mo35947g() == q13.C6501a.NOT_GENERATED || mo35947g() == q13.C6501a.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean mo43785k() {
        return mo35947g() == q13.C6501a.REGISTERED;
    }

    /* renamed from: l */
    public boolean mo43786l() {
        return mo35947g() == q13.C6501a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean mo43787m() {
        return mo35947g() == q13.C6501a.ATTEMPT_MIGRATION;
    }

    @mr2
    /* renamed from: n */
    public abstract C6634a mo35950n();

    @mr2
    /* renamed from: o */
    public r13 mo43788o(@mr2 String str, long j, long j2) {
        return mo35950n().mo35953b(str).mo35954c(j).mo35959h(j2).mo35952a();
    }

    @mr2
    /* renamed from: p */
    public r13 mo43789p() {
        return mo35950n().mo35953b((String) null).mo35952a();
    }

    @mr2
    /* renamed from: q */
    public r13 mo43790q(@mr2 String str) {
        return mo35950n().mo35956e(str).mo35958g(q13.C6501a.REGISTER_ERROR).mo35952a();
    }

    @mr2
    /* renamed from: r */
    public r13 mo43791r() {
        return mo35950n().mo35958g(q13.C6501a.NOT_GENERATED).mo35952a();
    }

    @mr2
    /* renamed from: s */
    public r13 mo43792s(@mr2 String str, @mr2 String str2, long j, @ts2 String str3, long j2) {
        return mo35950n().mo35955d(str).mo35958g(q13.C6501a.REGISTERED).mo35953b(str3).mo35957f(str2).mo35954c(j2).mo35959h(j).mo35952a();
    }

    @mr2
    /* renamed from: t */
    public r13 mo43793t(@mr2 String str) {
        return mo35950n().mo35955d(str).mo35958g(q13.C6501a.UNREGISTERED).mo35952a();
    }
}
