package com.onedelhi.secure;

import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class v15 {
    /* renamed from: a */
    public static JSONObject m67586a(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        if (z) {
            return jSONObject.getJSONObject(str);
        }
        if (z2 && jSONObject.isNull(str)) {
            throw new JSONException(String.format(Locale.US, "Value is null for key %s when key is specified as not null", new Object[]{str}));
        } else if (!jSONObject.isNull(str)) {
            return jSONObject.getJSONObject(str);
        } else {
            return null;
        }
    }

    /* renamed from: b */
    public static JSONArray m67587b(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        if (z) {
            return jSONObject.getJSONArray(str);
        }
        if (z2 && jSONObject.isNull(str)) {
            throw new JSONException(String.format(Locale.US, "Value is null for key %s when key is specified as not null", new Object[]{str}));
        } else if (!jSONObject.isNull(str)) {
            return jSONObject.getJSONArray(str);
        } else {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m67588c(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        if (z) {
            return jSONObject.getBoolean(str);
        }
        if (z2 && jSONObject.isNull(str)) {
            throw new JSONException(String.format(Locale.US, "Value is null for key %s when key is specified as not null", new Object[]{str}));
        } else if (!jSONObject.isNull(str)) {
            return jSONObject.getBoolean(str);
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public static String m67589d(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        if (z) {
            return jSONObject.getString(str);
        }
        if (z2 && jSONObject.isNull(str)) {
            throw new JSONException(String.format(Locale.US, "Value is null for key %s when key is specified as not null", new Object[]{str}));
        } else if (!jSONObject.isNull(str)) {
            return jSONObject.getString(str);
        } else {
            return null;
        }
    }
}
