package com.onedelhi.secure;

import com.onedelhi.secure.tt0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class i92 {

    /* renamed from: a */
    public static final i92 f13551a = new C2418a().mo17691b();

    /* renamed from: a */
    public final String f13552a;

    /* renamed from: a */
    public final List<a92> f13553a;

    /* renamed from: com.onedelhi.secure.i92$a */
    public static final class C2418a {

        /* renamed from: a */
        public String f13554a = "";

        /* renamed from: a */
        public List<a92> f13555a = new ArrayList();

        /* renamed from: a */
        public C2418a mo17690a(a92 a92) {
            this.f13555a.add(a92);
            return this;
        }

        /* renamed from: b */
        public i92 mo17691b() {
            return new i92(this.f13554a, Collections.unmodifiableList(this.f13555a));
        }

        /* renamed from: c */
        public C2418a mo17692c(List<a92> list) {
            this.f13555a = list;
            return this;
        }

        /* renamed from: d */
        public C2418a mo17693d(String str) {
            this.f13554a = str;
            return this;
        }
    }

    public i92(String str, List<a92> list) {
        this.f13552a = str;
        this.f13553a = list;
    }

    /* renamed from: a */
    public static i92 m17358a() {
        return f13551a;
    }

    /* renamed from: d */
    public static C2418a m17359d() {
        return new C2418a();
    }

    @o63(tag = 2)
    @tt0.C6898a(name = "logEventDropped")
    /* renamed from: b */
    public List<a92> mo17688b() {
        return this.f13553a;
    }

    @o63(tag = 1)
    /* renamed from: c */
    public String mo17689c() {
        return this.f13552a;
    }
}
