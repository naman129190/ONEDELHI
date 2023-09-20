package com.onedelhi.secure;

import com.onedelhi.secure.oz4;
import jmjou.C7601c;
import jmjou.C7606e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class h15 implements C7606e {
    public static final String TAG = "AbstractJson";

    public static <T extends C7606e> T fromJsonString(String str, C7601c cVar, Class<T> cls) {
        String format;
        if (cVar == null) {
            format = String.format("{%s} is null or empty", new Object[]{"objectFactory"});
        } else if (str == null || str.length() == 0) {
            format = String.format("{%s} is null or empty", new Object[]{"jsonString"});
        } else {
            try {
                C7601c.C7602a aVar = (C7601c.C7602a) cVar.mo48873i(C7601c.C7602a.class);
                aVar.put(TAG, new JSONObject(str));
                return cVar.mo48874j(cls, aVar);
            } catch (JSONException e) {
                m05.m56771b(TAG, String.format("JSONException with msg = {%s} for the key {%s}", new Object[]{e.getMessage(), str}));
                return cVar.mo48873i(cls);
            }
        }
        m05.m56771b(TAG, format);
        return null;
    }

    public static <T> T get(JSONArray jSONArray, int i) {
        try {
            return jSONArray.get(i);
        } catch (JSONException e) {
            m05.m56771b(TAG, String.format("JSONException with msg = {%s} for the key {%s}", new Object[]{e.getMessage(), Integer.valueOf(i)}));
            return null;
        }
    }

    public static <T> T get(JSONObject jSONObject, String str) {
        try {
            return jSONObject.get(str);
        } catch (JSONException e) {
            m05.m56771b(TAG, String.format("JSONException with msg = {%s} for the key {%s}", new Object[]{e.getMessage(), str}));
            return null;
        }
    }

    public static <T> T getOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.get(str);
        } catch (JSONException e) {
            m05.m56771b(TAG, String.format("JSONException with msg = {%s} for the key {%s}", new Object[]{e.getMessage(), str}));
            return null;
        }
    }

    public static <T> void put(JSONObject jSONObject, C7601c cVar, String str, T t) {
        if (l05.m55206j(jSONObject, TAG, "jsonObject")) {
            cVar.mo48865a().mo42319a(TAG, "json object should not be null", oz4.C6352a.LOW);
        }
        try {
            jSONObject.put(str, t);
        } catch (JSONException e) {
            m05.m56771b(TAG, String.format("JSONException with msg = {%s} for the key {%s}", new Object[]{e.getMessage(), str}));
        }
    }

    public <T> T get(String str) {
        return get(getJsonObject(), str);
    }

    public abstract JSONObject getJsonObject();

    public abstract C7601c getObjectFactory();

    public boolean has(@mr2 String str) {
        return getJsonObject().has(str);
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
    }

    public boolean isCachingAllowed() {
        return false;
    }

    public <T> void put(String str, T t) {
        put(getJsonObject(), getObjectFactory(), str, t);
    }

    public String toJsonString() {
        if (l05.m55206j(getJsonObject(), TAG, "jsonObject")) {
            getObjectFactory().mo48865a().mo42319a(TAG, "json object should not be null", oz4.C6352a.LOW);
        }
        return getJsonObject().toString();
    }
}
