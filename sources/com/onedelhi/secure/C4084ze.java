package com.onedelhi.secure;

import java.util.ArrayList;

/* renamed from: com.onedelhi.secure.ze */
public class C4084ze {
    @nu3("message")
    @qy0

    /* renamed from: a */
    public String f23580a;
    @nu3("results")
    @qy0

    /* renamed from: a */
    public ArrayList<C4086b> f23581a;
    @nu3("description")
    @qy0

    /* renamed from: b */
    public String f23582b;

    /* renamed from: com.onedelhi.secure.ze$a */
    public static class C4085a {
        @nu3("name")
        @qy0

        /* renamed from: a */
        public final String f23583a;
        @nu3("street")
        @qy0

        /* renamed from: b */
        public final String f23584b;
        @nu3("formatted")
        @qy0

        /* renamed from: c */
        public final String f23585c;

        public C4085a(String str, String str2, String str3) {
            this.f23583a = str;
            this.f23584b = str2;
            this.f23585c = str3;
        }

        /* renamed from: a */
        public String mo27951a() {
            return this.f23585c;
        }

        /* renamed from: b */
        public String mo27952b() {
            return this.f23583a;
        }

        /* renamed from: c */
        public String mo27953c() {
            return this.f23584b;
        }
    }

    /* renamed from: com.onedelhi.secure.ze$b */
    public static class C4086b {
        @nu3("lat")
        @qy0

        /* renamed from: a */
        public final Float f23586a;
        @nu3("display_name")
        @qy0

        /* renamed from: a */
        public final String f23587a;
        @nu3("lon")
        @qy0

        /* renamed from: b */
        public final Float f23588b;
        @nu3("complete_address")
        @qy0

        /* renamed from: b */
        public final String f23589b;

        public C4086b(String str, Float f, Float f2, String str2) {
            this.f23587a = str;
            this.f23586a = f;
            this.f23588b = f2;
            this.f23589b = str2;
        }

        /* renamed from: a */
        public String mo27954a() {
            return this.f23589b;
        }

        /* renamed from: b */
        public String mo27955b() {
            return this.f23587a;
        }

        /* renamed from: c */
        public Float mo27956c() {
            return this.f23586a;
        }

        /* renamed from: d */
        public Float mo27957d() {
            return this.f23588b;
        }
    }

    public C4084ze() {
    }

    public C4084ze(String str, String str2, ArrayList<C4086b> arrayList) {
        this.f23580a = str;
        this.f23582b = str2;
        this.f23581a = arrayList;
    }

    /* renamed from: a */
    public String mo27946a() {
        return this.f23582b;
    }

    /* renamed from: b */
    public ArrayList<C4086b> mo27947b() {
        return this.f23581a;
    }

    /* renamed from: c */
    public String mo27948c() {
        return this.f23580a;
    }

    /* renamed from: d */
    public void mo27949d(String str) {
        this.f23582b = str;
    }

    /* renamed from: e */
    public void mo27950e(String str) {
        this.f23580a = str;
    }
}
