package com.onedelhi.secure;

import org.json.JSONException;
import org.json.JSONObject;

public class kw3 {

    /* renamed from: a */
    public final wb0 f31482a;

    public kw3(wb0 wb0) {
        this.f31482a = wb0;
    }

    /* renamed from: a */
    public static lw3 m55122a(int i) {
        if (i == 3) {
            return new pw3();
        }
        o92 f = o92.m59120f();
        f.mo41615d("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
        return new rh0();
    }

    /* renamed from: b */
    public jv3 mo39585b(JSONObject jSONObject) throws JSONException {
        return m55122a(jSONObject.getInt(jw3.f30978c)).mo40305a(this.f31482a, jSONObject);
    }
}
