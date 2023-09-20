package com.onedelhi.secure;

import com.onedelhi.secure.jv3;
import org.json.JSONException;
import org.json.JSONObject;

public class pw3 implements lw3 {
    /* renamed from: b */
    public static jv3.C5849a m61739b(JSONObject jSONObject) {
        return new jv3.C5849a(jSONObject.optBoolean(jw3.f30987i, true), jSONObject.optBoolean(jw3.f30988j, false), jSONObject.optBoolean(jw3.f30989k, false));
    }

    /* renamed from: c */
    public static jv3.C5850b m61740c(JSONObject jSONObject) {
        return new jv3.C5850b(jSONObject.optInt(jw3.f30991m, 8), 4);
    }

    /* renamed from: d */
    public static long m61741d(wb0 wb0, long j, JSONObject jSONObject) {
        return jSONObject.has(jw3.f30971a) ? jSONObject.optLong(jw3.f30971a) : wb0.mo46666a() + (j * 1000);
    }

    /* renamed from: a */
    public jv3 mo40305a(wb0 wb0, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt(jw3.f30978c, 0);
        int optInt2 = jSONObject2.optInt(jw3.f30983e, 3600);
        return new jv3(m61741d(wb0, (long) optInt2, jSONObject2), m61740c(jSONObject2.has(jw3.f30975b) ? jSONObject2.getJSONObject(jw3.f30975b) : new JSONObject()), m61739b(jSONObject2.getJSONObject("features")), optInt, optInt2, jSONObject2.optDouble(jw3.f30984f, 10.0d), jSONObject2.optDouble(jw3.f30985g, 1.2d), jSONObject2.optInt(jw3.f30986h, 60));
    }
}
