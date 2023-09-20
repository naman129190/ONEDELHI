package com.onedelhi.secure;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class ev0 {
    @mr2
    @VisibleForTesting

    /* renamed from: b */
    public static final String f11722b = "errorCode";
    @mr2
    @VisibleForTesting

    /* renamed from: c */
    public static final String f11723c = "errorMessage";

    /* renamed from: a */
    public final gv0 f11724a;

    /* renamed from: a */
    public final String f11725a;

    public ev0(@mr2 gv0 gv0) {
        this.f11724a = gv0;
        this.f11725a = null;
    }

    public ev0(@mr2 gv0 gv0, @mr2 String str) {
        this.f11724a = gv0;
        this.f11725a = str;
    }

    @mr2
    /* renamed from: a */
    public gv0 mo15613a() {
        return this.f11724a;
    }

    @mr2
    /* renamed from: b */
    public String mo15614b() {
        return this.f11725a;
    }

    @mr2
    /* renamed from: c */
    public JSONObject mo15615c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", this.f11724a.mo16921a());
            String str = this.f11725a;
            if (str != null) {
                jSONObject.put("errorMessage", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @mr2
    public String toString() {
        if (this.f11725a == null) {
            return String.format(Locale.ENGLISH, "{errorCode: %d}", new Object[]{Integer.valueOf(this.f11724a.mo16921a())});
        }
        return String.format(Locale.ENGLISH, "{errorCode: %d, errorMessage: %s}", new Object[]{Integer.valueOf(this.f11724a.mo16921a()), this.f11725a});
    }
}
