package com.onedelhi.secure;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class sh0 implements ow3 {

    /* renamed from: b */
    public static final String f35057b = "X-CRASHLYTICS-GOOGLE-APP-ID";

    /* renamed from: c */
    public static final String f35058c = "X-CRASHLYTICS-API-CLIENT-TYPE";

    /* renamed from: d */
    public static final String f35059d = "X-CRASHLYTICS-API-CLIENT-VERSION";

    /* renamed from: e */
    public static final String f35060e = "User-Agent";

    /* renamed from: f */
    public static final String f35061f = "Accept";

    /* renamed from: g */
    public static final String f35062g = "Crashlytics Android SDK/";

    /* renamed from: h */
    public static final String f35063h = "application/json";

    /* renamed from: i */
    public static final String f35064i = "android";

    /* renamed from: j */
    public static final String f35065j = "build_version";

    /* renamed from: k */
    public static final String f35066k = "display_version";

    /* renamed from: l */
    public static final String f35067l = "instance";

    /* renamed from: m */
    public static final String f35068m = "source";

    /* renamed from: n */
    public static final String f35069n = "X-CRASHLYTICS-DEVICE-MODEL";

    /* renamed from: o */
    public static final String f35070o = "X-CRASHLYTICS-OS-BUILD-VERSION";

    /* renamed from: p */
    public static final String f35071p = "X-CRASHLYTICS-OS-DISPLAY-VERSION";

    /* renamed from: q */
    public static final String f35072q = "X-CRASHLYTICS-INSTALLATION-ID";

    /* renamed from: a */
    public final o92 f35073a;

    /* renamed from: a */
    public final vm1 f35074a;

    /* renamed from: a */
    public final String f35075a;

    public sh0(String str, vm1 vm1) {
        this(str, vm1, o92.m59120f());
    }

    public sh0(String str, vm1 vm1, o92 o92) {
        if (str != null) {
            this.f35073a = o92;
            this.f35074a = vm1;
            this.f35075a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    /* renamed from: a */
    public JSONObject mo42303a(nw3 nw3, boolean z) {
        if (z) {
            try {
                Map<String, String> f = mo44350f(nw3);
                mm1 b = mo44346b(mo44348d(f), nw3);
                o92 o92 = this.f35073a;
                o92.mo41613b("Requesting settings from " + this.f35075a);
                o92 o922 = this.f35073a;
                o922.mo41621k("Settings query params were: " + f);
                return mo44351g(b.mo40696c());
            } catch (IOException e) {
                this.f35073a.mo41616e("Settings request failed.", e);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    /* renamed from: b */
    public final mm1 mo44346b(mm1 mm1, nw3 nw3) {
        mo44347c(mm1, f35057b, nw3.f32821a);
        mo44347c(mm1, f35058c, "android");
        mo44347c(mm1, f35059d, ga0.m49193m());
        mo44347c(mm1, "Accept", "application/json");
        mo44347c(mm1, f35069n, nw3.f32822b);
        mo44347c(mm1, f35070o, nw3.f32823c);
        mo44347c(mm1, f35071p, nw3.f32824d);
        mo44347c(mm1, f35072q, nw3.f32820a.mo38197a());
        return mm1;
    }

    /* renamed from: c */
    public final void mo44347c(mm1 mm1, String str, String str2) {
        if (str2 != null) {
            mm1.mo40697d(str, str2);
        }
    }

    /* renamed from: d */
    public mm1 mo44348d(Map<String, String> map) {
        mm1 b = this.f35074a.mo46203b(this.f35075a, map);
        return b.mo40697d("User-Agent", f35062g + ga0.m49193m()).mo40697d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* renamed from: e */
    public final JSONObject mo44349e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            o92 o92 = this.f35073a;
            o92.mo41624n("Failed to parse settings JSON from " + this.f35075a, e);
            o92 o922 = this.f35073a;
            o922.mo41623m("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    public final Map<String, String> mo44350f(nw3 nw3) {
        HashMap hashMap = new HashMap();
        hashMap.put(f35065j, nw3.f32827g);
        hashMap.put(f35066k, nw3.f32826f);
        hashMap.put("source", Integer.toString(nw3.f32819a));
        String str = nw3.f32825e;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: g */
    public JSONObject mo44351g(ym1 ym1) {
        int b = ym1.mo47864b();
        o92 o92 = this.f35073a;
        o92.mo41621k("Settings response code was: " + b);
        if (mo44352h(b)) {
            return mo44349e(ym1.mo47863a());
        }
        o92 o922 = this.f35073a;
        o922.mo41615d("Settings request failed; (status: " + b + ") from " + this.f35075a);
        return null;
    }

    /* renamed from: h */
    public boolean mo44352h(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }
}
