package com.onedelhi.secure;

import java.util.HashMap;
import java.util.Map;

public class lc0 {

    /* renamed from: a */
    public final Map<String, String> f31611a;

    /* renamed from: com.onedelhi.secure.lc0$a */
    public static class C5985a {

        /* renamed from: a */
        public Map<String, String> f31612a = new HashMap();

        @mr2
        /* renamed from: b */
        public lc0 mo39767b() {
            return new lc0(this);
        }

        @mr2
        /* renamed from: c */
        public C5985a mo39768c(@mr2 String str, boolean z) {
            this.f31612a.put(str, Boolean.toString(z));
            return this;
        }

        @mr2
        /* renamed from: d */
        public C5985a mo39769d(@mr2 String str, double d) {
            this.f31612a.put(str, Double.toString(d));
            return this;
        }

        @mr2
        /* renamed from: e */
        public C5985a mo39770e(@mr2 String str, float f) {
            this.f31612a.put(str, Float.toString(f));
            return this;
        }

        @mr2
        /* renamed from: f */
        public C5985a mo39771f(@mr2 String str, int i) {
            this.f31612a.put(str, Integer.toString(i));
            return this;
        }

        @mr2
        /* renamed from: g */
        public C5985a mo39772g(@mr2 String str, long j) {
            this.f31612a.put(str, Long.toString(j));
            return this;
        }

        @mr2
        /* renamed from: h */
        public C5985a mo39773h(@mr2 String str, @mr2 String str2) {
            this.f31612a.put(str, str2);
            return this;
        }
    }

    public lc0(@mr2 C5985a aVar) {
        this.f31611a = aVar.f31612a;
    }
}
