package com.onedelhi.secure;

import java.util.ArrayList;

/* renamed from: com.onedelhi.secure.fb */
public class C5235fb {
    @nu3("enabled")

    /* renamed from: a */
    public Boolean f28241a;
    @nu3("etag")

    /* renamed from: a */
    public String f28242a;
    @nu3("pages")

    /* renamed from: a */
    public ArrayList<C5983lb> f28243a = null;
    @nu3("cardScheme")

    /* renamed from: b */
    public String f28244b;
    @nu3("bankName")

    /* renamed from: c */
    public String f28245c;
    @nu3("payMode")

    /* renamed from: d */
    public String f28246d;

    /* renamed from: a */
    public String mo35825a() {
        return this.f28245c;
    }

    /* renamed from: b */
    public String mo35826b() {
        return this.f28244b;
    }

    /* renamed from: c */
    public Boolean mo35827c() {
        return this.f28241a;
    }

    /* renamed from: d */
    public String mo35828d() {
        return this.f28242a;
    }

    /* renamed from: e */
    public String mo35829e() {
        return this.f28246d;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5235fb)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C5235fb fbVar = (C5235fb) obj;
        return (mo35825a() + mo35829e() + mo35826b()).equals(fbVar.mo35825a() + fbVar.mo35829e() + fbVar.mo35826b());
    }

    /* renamed from: f */
    public ArrayList<C5983lb> mo35831f() {
        return this.f28243a;
    }

    /* renamed from: g */
    public void mo35832g(String str) {
        this.f28245c = str;
    }

    /* renamed from: h */
    public void mo35833h(String str) {
        this.f28244b = str;
    }

    /* renamed from: i */
    public void mo35834i(Boolean bool) {
        this.f28241a = bool;
    }

    /* renamed from: j */
    public void mo35835j(String str) {
        this.f28242a = str;
    }

    /* renamed from: k */
    public void mo35836k(String str) {
        this.f28246d = str;
    }

    /* renamed from: l */
    public void mo35837l(ArrayList<C5983lb> arrayList) {
        this.f28243a = arrayList;
    }

    public String toString() {
        return mo35825a() + mo35829e() + mo35826b();
    }
}
