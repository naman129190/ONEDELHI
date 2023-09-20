package com.onedelhi.secure;

import com.google.firebase.messaging.C4311b;
import java.util.Iterator;
import jmjou.C7601c;
import org.json.JSONException;
import org.json.JSONObject;

public class u25 extends z25 {
    /* renamed from: b */
    public static u25 m66421b(C7601c cVar, String str) {
        u25 u25 = (u25) cVar.mo48873i(u25.class);
        try {
            JSONObject jSONObject = new JSONObject(str);
            u25.put("eventName", v15.m67589d(jSONObject, "eventName", false, false));
            JSONObject a = v15.m67586a(jSONObject, C4311b.C4317f.C4318a.f25149a, false, false);
            if (a != null) {
                Iterator<String> keys = a.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (a.opt(next) != null) {
                        u25.mo45379a(next, a.opt(next));
                    }
                }
            }
        } catch (JSONException e) {
            m05.m56773d("Event", String.format("JSONException caught, message = {%s}", new Object[]{e.getMessage()}), e);
        }
        return u25;
    }

    /* renamed from: a */
    public <T> u25 mo45379a(String str, T t) {
        h15.put((JSONObject) get(C4311b.C4317f.C4318a.f25149a), getObjectFactory(), str, t);
        return this;
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        super.init(cVar, aVar);
        cVar.getClass();
        put(C4311b.C4317f.C4318a.f25149a, new JSONObject());
        put("eventTime", Long.valueOf(System.currentTimeMillis()));
        h15.put((JSONObject) get(C4311b.C4317f.C4318a.f25149a), getObjectFactory(), "intentSupported", String.valueOf(true));
    }
}
