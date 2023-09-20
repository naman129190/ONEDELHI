package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.C2283gw;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.onedelhi.secure.xy */
public class C3954xy {
    @mr2

    /* renamed from: d */
    public static final String f22807d = "typ";
    @mr2

    /* renamed from: e */
    public static final String f22808e = "challenge";
    @mr2

    /* renamed from: f */
    public static final String f22809f = "origin";
    @mr2

    /* renamed from: g */
    public static final String f22810g = "cid_pubkey";
    @mr2

    /* renamed from: h */
    public static final String f22811h = "navigator.id.finishEnrollment";
    @mr2

    /* renamed from: i */
    public static final String f22812i = "navigator.id.getAssertion";

    /* renamed from: a */
    public final C2283gw f22813a;

    /* renamed from: a */
    public final String f22814a;

    /* renamed from: b */
    public final String f22815b;

    /* renamed from: c */
    public final String f22816c;

    /* renamed from: com.onedelhi.secure.xy$a */
    public static class C3955a implements Cloneable {

        /* renamed from: a */
        public C2283gw f22817a;

        /* renamed from: b */
        public String f22818b;

        /* renamed from: c */
        public String f22819c;

        /* renamed from: d */
        public String f22820d;

        public C3955a() {
            this.f22817a = C2283gw.f12782a;
        }

        public C3955a(String str, String str2, String str3, C2283gw gwVar) {
            this.f22818b = str;
            this.f22819c = str2;
            this.f22820d = str3;
            this.f22817a = gwVar;
        }

        @mr2
        /* renamed from: c */
        public static C3955a m31773c() {
            return new C3955a();
        }

        @mr2
        /* renamed from: a */
        public C3954xy mo27143a() {
            return new C3954xy(this.f22818b, this.f22819c, this.f22820d, this.f22817a);
        }

        @mr2
        /* renamed from: b */
        public C3955a clone() {
            return new C3955a(this.f22818b, this.f22819c, this.f22820d, this.f22817a);
        }

        @mr2
        /* renamed from: d */
        public C3955a mo27146d(@mr2 String str) {
            this.f22819c = str;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C3955a mo27147e(@mr2 C2283gw gwVar) {
            this.f22817a = gwVar;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C3955a mo27148f(@mr2 String str) {
            this.f22820d = str;
            return this;
        }

        @mr2
        /* renamed from: g */
        public C3955a mo27149g(@mr2 String str) {
            this.f22818b = str;
            return this;
        }
    }

    public C3954xy(String str, String str2, String str3, C2283gw gwVar) {
        this.f22814a = (String) Preconditions.checkNotNull(str);
        this.f22815b = (String) Preconditions.checkNotNull(str2);
        this.f22816c = (String) Preconditions.checkNotNull(str3);
        this.f22813a = (C2283gw) Preconditions.checkNotNull(gwVar);
    }

    @mr2
    /* renamed from: a */
    public String mo27140a() {
        Object M2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f22807d, this.f22814a);
            jSONObject.put(f22808e, this.f22815b);
            jSONObject.put("origin", this.f22816c);
            C2283gw.C2284a aVar = C2283gw.C2284a.ABSENT;
            int ordinal = this.f22813a.mo16950N2().ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    M2 = this.f22813a.mo16947K2();
                }
                return jSONObject.toString();
            }
            M2 = this.f22813a.mo16949M2();
            jSONObject.put(f22810g, M2);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(@mr2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3954xy)) {
            return false;
        }
        C3954xy xyVar = (C3954xy) obj;
        return this.f22814a.equals(xyVar.f22814a) && this.f22815b.equals(xyVar.f22815b) && this.f22816c.equals(xyVar.f22816c) && this.f22813a.equals(xyVar.f22813a);
    }

    public int hashCode() {
        return ((((((this.f22814a.hashCode() + 31) * 31) + this.f22815b.hashCode()) * 31) + this.f22816c.hashCode()) * 31) + this.f22813a.hashCode();
    }
}
