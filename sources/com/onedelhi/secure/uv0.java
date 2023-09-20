package com.onedelhi.secure;

import com.google.auto.value.AutoValue;
import com.onedelhi.secure.C3702ug;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@AutoValue
public abstract class uv0 {

    @AutoValue.Builder
    /* renamed from: com.onedelhi.secure.uv0$a */
    public static abstract class C3747a {
        /* renamed from: a */
        public final C3747a mo25748a(String str, int i) {
            mo25590e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final C3747a mo25749b(String str, long j) {
            mo25590e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final C3747a mo25750c(String str, String str2) {
            mo25590e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract uv0 mo25589d();

        /* renamed from: e */
        public abstract Map<String, String> mo25590e();

        /* renamed from: f */
        public abstract C3747a mo25591f(Map<String, String> map);

        /* renamed from: g */
        public abstract C3747a mo25592g(Integer num);

        /* renamed from: h */
        public abstract C3747a mo25593h(xt0 xt0);

        /* renamed from: i */
        public abstract C3747a mo25594i(long j);

        /* renamed from: j */
        public abstract C3747a mo25595j(String str);

        /* renamed from: k */
        public abstract C3747a mo25596k(long j);
    }

    /* renamed from: a */
    public static C3747a m29608a() {
        return new C3702ug.C3704b().mo25591f(new HashMap());
    }

    /* renamed from: b */
    public final String mo25741b(String str) {
        String str2 = mo25580c().get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: c */
    public abstract Map<String, String> mo25580c();

    @ts2
    /* renamed from: d */
    public abstract Integer mo25581d();

    /* renamed from: e */
    public abstract xt0 mo25582e();

    /* renamed from: f */
    public abstract long mo25584f();

    /* renamed from: g */
    public final int mo25742g(String str) {
        String str2 = mo25580c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long mo25743h(String str) {
        String str2 = mo25580c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> mo25744i() {
        return Collections.unmodifiableMap(mo25580c());
    }

    /* renamed from: j */
    public final String mo25745j(String str, String str2) {
        String str3 = mo25580c().get(str);
        return str3 == null ? str2 : str3;
    }

    @Deprecated
    /* renamed from: k */
    public byte[] mo25746k() {
        return mo25582e().mo27087a();
    }

    /* renamed from: l */
    public abstract String mo25586l();

    /* renamed from: m */
    public abstract long mo25587m();

    /* renamed from: n */
    public C3747a mo25747n() {
        return new C3702ug.C3704b().mo25595j(mo25586l()).mo25592g(mo25581d()).mo25593h(mo25582e()).mo25594i(mo25584f()).mo25596k(mo25587m()).mo25591f(new HashMap(mo25580c()));
    }
}
