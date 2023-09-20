package com.onedelhi.secure;

import android.os.Bundle;
import com.google.firebase.remoteconfig.internal.C4367b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class t13 {

    /* renamed from: a */
    public static final String f35361a = "fp";

    /* renamed from: b */
    public static final String f35362b = "personalization_assignment";

    /* renamed from: c */
    public static final String f35363c = "arm_key";

    /* renamed from: d */
    public static final String f35364d = "arm_value";

    /* renamed from: e */
    public static final String f35365e = "personalizationId";

    /* renamed from: f */
    public static final String f35366f = "personalization_id";

    /* renamed from: g */
    public static final String f35367g = "armIndex";

    /* renamed from: h */
    public static final String f35368h = "arm_index";

    /* renamed from: i */
    public static final String f35369i = "group";

    /* renamed from: j */
    public static final String f35370j = "group";

    /* renamed from: k */
    public static final String f35371k = "_fpc";

    /* renamed from: l */
    public static final String f35372l = "choiceId";

    /* renamed from: m */
    public static final String f35373m = "_fpid";

    /* renamed from: a */
    public final b73<C4623b5> f35374a;

    /* renamed from: a */
    public final Map<String, String> f35375a = Collections.synchronizedMap(new HashMap());

    public t13(b73<C4623b5> b73) {
        this.f35374a = b73;
    }

    /* renamed from: a */
    public void mo44754a(@mr2 String str, @mr2 C4367b bVar) {
        JSONObject optJSONObject;
        C4623b5 b5Var = this.f35374a.get();
        if (b5Var != null) {
            JSONObject h = bVar.mo30029h();
            if (h.length() >= 1) {
                JSONObject f = bVar.mo30027f();
                if (f.length() >= 1 && (optJSONObject = h.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString(f35372l);
                    if (!optString.isEmpty()) {
                        synchronized (this.f35375a) {
                            if (!optString.equals(this.f35375a.get(str))) {
                                this.f35375a.put(str, optString);
                                Bundle bundle = new Bundle();
                                bundle.putString(f35363c, str);
                                bundle.putString(f35364d, f.optString(str));
                                bundle.putString(f35366f, optJSONObject.optString(f35365e));
                                bundle.putInt(f35368h, optJSONObject.optInt(f35367g, -1));
                                bundle.putString("group", optJSONObject.optString("group"));
                                b5Var.mo31397a(f35361a, f35362b, bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(f35373m, optString);
                                b5Var.mo31397a(f35361a, f35371k, bundle2);
                            }
                        }
                    }
                }
            }
        }
    }
}
