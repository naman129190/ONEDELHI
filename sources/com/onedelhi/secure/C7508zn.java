package com.onedelhi.secure;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onedelhi.secure.zn */
public class C7508zn implements C5663i5, C4688bo {

    /* renamed from: a */
    public static final String f38386a = "name";

    /* renamed from: b */
    public static final String f38387b = "parameters";

    /* renamed from: c */
    public static final String f38388c = "$A$:";
    @ts2

    /* renamed from: a */
    public C4586ao f38389a;

    @mr2
    /* renamed from: b */
    public static String m74193b(@mr2 String str, @mr2 Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put(f38387b, jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: W */
    public void mo34506W(@mr2 String str, @mr2 Bundle bundle) {
        C4586ao aoVar = this.f38389a;
        if (aoVar != null) {
            try {
                aoVar.mo31088a(f38388c + m74193b(str, bundle));
            } catch (JSONException unused) {
                o92.m59120f().mo41623m("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    /* renamed from: a */
    public void mo31956a(@ts2 C4586ao aoVar) {
        this.f38389a = aoVar;
        o92.m59120f().mo41613b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
