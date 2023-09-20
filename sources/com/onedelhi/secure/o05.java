package com.onedelhi.secure;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.List;
import jmjou.C7601c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class o05 {

    /* renamed from: a */
    public String f32872a;

    /* renamed from: a */
    public List<n05> f32873a;

    /* renamed from: a */
    public static o05 m58886a(String str, C7601c cVar) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        o05 o05 = new o05();
        ArrayList arrayList = new ArrayList();
        o05.f32872a = v15.m67589d(jSONObject, ImagesContract.URL, false, false);
        JSONArray b = v15.m67587b(jSONObject, ba0.f26252c, false, false);
        if (b != null && b.length() > 0) {
            for (int i = 0; i < b.length(); i++) {
                JSONObject jSONObject2 = (JSONObject) h15.get(b, i);
                if (jSONObject2 != null) {
                    arrayList.add((n05) h15.fromJsonString(jSONObject2.toString(), cVar, n05.class));
                }
            }
        }
        o05.f32873a = arrayList;
        return o05;
    }
}
