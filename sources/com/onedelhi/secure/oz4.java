package com.onedelhi.secure;

import com.google.firebase.messaging.C4311b;
import jmjou.C7601c;
import jmjou.C7606e;
import org.json.JSONObject;

public class oz4 implements C7606e {

    /* renamed from: a */
    public zz4 f33392a;

    /* renamed from: com.onedelhi.secure.oz4$a */
    public enum C6352a {
        HIGH,
        LOW
    }

    /* renamed from: a */
    public void mo42319a(String str, String str2, C6352a aVar) {
        m05.m56771b(str, str2);
        if (C6352a.HIGH.equals(aVar)) {
            String format = String.format("tag = {%s}, errorMessage = {%s}", new Object[]{str, str2});
            u25 b = this.f33392a.mo48478b("RUNTIME_ERROR");
            h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "errorMessage", format);
            this.f33392a.mo48477a(b);
            throw new RuntimeException(str2);
        }
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        this.f33392a = (zz4) cVar.mo48873i(zz4.class);
    }

    public boolean isCachingAllowed() {
        return true;
    }
}
