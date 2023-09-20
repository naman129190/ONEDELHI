package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.remoteconfig.internal.b */
public class C4367b {

    /* renamed from: a */
    public static final String f25332a = "configs_key";

    /* renamed from: b */
    public static final String f25333b = "fetch_time_key";

    /* renamed from: b */
    public static final Date f25334b = new Date(0);

    /* renamed from: c */
    public static final String f25335c = "abt_experiments_key";

    /* renamed from: d */
    public static final String f25336d = "personalization_metadata_key";

    /* renamed from: e */
    public static final String f25337e = "template_version_number_key";

    /* renamed from: a */
    public long f25338a;

    /* renamed from: a */
    public Date f25339a;

    /* renamed from: a */
    public JSONArray f25340a;

    /* renamed from: a */
    public JSONObject f25341a;

    /* renamed from: b */
    public JSONObject f25342b;

    /* renamed from: c */
    public JSONObject f25343c;

    /* renamed from: com.google.firebase.remoteconfig.internal.b$b */
    public static class C4369b {

        /* renamed from: a */
        public long f25344a;

        /* renamed from: a */
        public Date f25345a;

        /* renamed from: a */
        public JSONArray f25346a;

        /* renamed from: a */
        public JSONObject f25347a;

        /* renamed from: b */
        public JSONObject f25348b;

        public C4369b() {
            this.f25347a = new JSONObject();
            this.f25345a = C4367b.f25334b;
            this.f25346a = new JSONArray();
            this.f25348b = new JSONObject();
            this.f25344a = 0;
        }

        public C4369b(C4367b bVar) {
            this.f25347a = bVar.mo30027f();
            this.f25345a = bVar.mo30028g();
            this.f25346a = bVar.mo30024d();
            this.f25348b = bVar.mo30029h();
            this.f25344a = bVar.mo30031i();
        }

        /* renamed from: a */
        public C4367b mo30033a() throws JSONException {
            return new C4367b(this.f25347a, this.f25345a, this.f25346a, this.f25348b, this.f25344a);
        }

        /* renamed from: b */
        public C4369b mo30034b(Map<String, String> map) {
            this.f25347a = new JSONObject(map);
            return this;
        }

        /* renamed from: c */
        public C4369b mo30035c(JSONObject jSONObject) {
            try {
                this.f25347a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: d */
        public C4369b mo30036d(JSONArray jSONArray) {
            try {
                this.f25346a = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: e */
        public C4369b mo30037e(Date date) {
            this.f25345a = date;
            return this;
        }

        /* renamed from: f */
        public C4369b mo30038f(JSONObject jSONObject) {
            try {
                this.f25348b = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: g */
        public C4369b mo30039g(long j) {
            this.f25344a = j;
            return this;
        }
    }

    public C4367b(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(f25332a, jSONObject);
        jSONObject3.put(f25333b, date.getTime());
        jSONObject3.put(f25335c, jSONArray);
        jSONObject3.put(f25336d, jSONObject2);
        jSONObject3.put(f25337e, j);
        this.f25342b = jSONObject;
        this.f25339a = date;
        this.f25340a = jSONArray;
        this.f25343c = jSONObject2;
        this.f25338a = j;
        this.f25341a = jSONObject3;
    }

    /* renamed from: b */
    public static C4367b m35163b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(f25336d);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new C4367b(jSONObject.getJSONObject(f25332a), new Date(jSONObject.getLong(f25333b)), jSONObject.getJSONArray(f25335c), optJSONObject, jSONObject.optLong(f25337e));
    }

    /* renamed from: c */
    public static C4367b m35164c(JSONObject jSONObject) throws JSONException {
        return m35163b(new JSONObject(jSONObject.toString()));
    }

    /* renamed from: j */
    public static C4369b m35165j() {
        return new C4369b();
    }

    /* renamed from: k */
    public static C4369b m35166k(C4367b bVar) {
        return new C4369b(bVar);
    }

    /* renamed from: d */
    public JSONArray mo30024d() {
        return this.f25340a;
    }

    /* renamed from: e */
    public Set<String> mo30025e(C4367b bVar) throws JSONException {
        JSONObject f = m35164c(bVar.f25341a).mo30027f();
        HashSet hashSet = new HashSet();
        Iterator<String> keys = mo30027f().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (bVar.mo30027f().has(next) && mo30027f().get(next).equals(bVar.mo30027f().get(next)) && ((!mo30029h().has(next) || bVar.mo30029h().has(next)) && ((mo30029h().has(next) || !bVar.mo30029h().has(next)) && (!mo30029h().has(next) || !bVar.mo30029h().has(next) || mo30029h().getJSONObject(next).toString().equals(bVar.mo30029h().getJSONObject(next).toString()))))) {
                f.remove(next);
            } else {
                hashSet.add(next);
            }
        }
        Iterator<String> keys2 = f.keys();
        while (keys2.hasNext()) {
            hashSet.add(keys2.next());
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4367b)) {
            return false;
        }
        return this.f25341a.toString().equals(((C4367b) obj).toString());
    }

    /* renamed from: f */
    public JSONObject mo30027f() {
        return this.f25342b;
    }

    /* renamed from: g */
    public Date mo30028g() {
        return this.f25339a;
    }

    /* renamed from: h */
    public JSONObject mo30029h() {
        return this.f25343c;
    }

    public int hashCode() {
        return this.f25341a.hashCode();
    }

    /* renamed from: i */
    public long mo30031i() {
        return this.f25338a;
    }

    public String toString() {
        return this.f25341a.toString();
    }
}
