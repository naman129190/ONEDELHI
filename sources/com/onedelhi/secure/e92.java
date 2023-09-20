package com.onedelhi.secure;

import com.google.auto.value.AutoValue;
import com.onedelhi.secure.C1784bh;
import com.onedelhi.secure.tt0;
import java.util.List;

@AutoValue
public abstract class e92 {

    @AutoValue.Builder
    /* renamed from: com.onedelhi.secure.e92$a */
    public static abstract class C2036a {
        @mr2
        /* renamed from: a */
        public abstract e92 mo13696a();

        @mr2
        /* renamed from: b */
        public abstract C2036a mo13697b(@ts2 C4142zy zyVar);

        @mr2
        /* renamed from: c */
        public abstract C2036a mo13698c(@ts2 List<z82> list);

        @mr2
        /* renamed from: d */
        public abstract C2036a mo13699d(@ts2 Integer num);

        @mr2
        /* renamed from: e */
        public abstract C2036a mo13700e(@ts2 String str);

        @mr2
        /* renamed from: f */
        public abstract C2036a mo13701f(@ts2 y83 y83);

        @mr2
        /* renamed from: g */
        public abstract C2036a mo13702g(long j);

        @mr2
        /* renamed from: h */
        public abstract C2036a mo13703h(long j);

        @mr2
        /* renamed from: i */
        public C2036a mo15089i(int i) {
            return mo13699d(Integer.valueOf(i));
        }

        @mr2
        /* renamed from: j */
        public C2036a mo15090j(@mr2 String str) {
            return mo13700e(str);
        }
    }

    @mr2
    /* renamed from: a */
    public static C2036a m13627a() {
        return new C1784bh.C1786b();
    }

    @ts2
    /* renamed from: b */
    public abstract C4142zy mo13686b();

    @tt0.C6898a(name = "logEvent")
    @ts2
    /* renamed from: c */
    public abstract List<z82> mo13687c();

    @ts2
    /* renamed from: d */
    public abstract Integer mo13688d();

    @ts2
    /* renamed from: e */
    public abstract String mo13689e();

    @ts2
    /* renamed from: f */
    public abstract y83 mo13691f();

    /* renamed from: g */
    public abstract long mo13692g();

    /* renamed from: h */
    public abstract long mo13693h();
}
