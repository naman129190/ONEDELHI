package com.onedelhi.secure;

import android.os.Build;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.onedelhi.secure.vh3;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onedelhi.secure.k5 */
public class C5871k5 {

    /* renamed from: a */
    public static volatile C5871k5 f31103a;

    /* renamed from: a */
    public String f31104a = "";

    /* renamed from: a */
    public final MediaType f31105a = MediaType.get("application/json; charset=utf-8");

    /* renamed from: b */
    public String f31106b = "";

    /* renamed from: c */
    public String f31107c = "";

    /* renamed from: com.onedelhi.secure.k5$a */
    public class C5872a implements Callback {
        public C5872a() {
        }

        public void onFailure(@vr2 Call call, @vr2 IOException iOException) {
        }

        public void onResponse(@vr2 Call call, @vr2 Response response) throws IOException {
        }
    }

    /* renamed from: a */
    public static void m54076a() {
        if (f31103a != null) {
            f31103a = null;
        }
    }

    /* renamed from: e */
    public static C5871k5 m54077e() {
        if (f31103a == null) {
            synchronized (C5871k5.class) {
                if (f31103a == null) {
                    f31103a = new C5871k5();
                }
            }
        }
        return f31103a;
    }

    /* renamed from: b */
    public String mo39053b() {
        return this.f31104a;
    }

    /* renamed from: c */
    public String mo39054c(t03 t03) {
        if (!(t03 == null || t03.mo44723a() == null)) {
            this.f31106b = t03.mo44723a().get("MID");
            this.f31107c = t03.mo44723a().get(h60.f29506a);
        }
        return "mid=" + this.f31106b + "^" + "orderId" + a13.f25713a + this.f31107c + "^" + h60.f29531z + a13.f25713a + this.f31104a;
    }

    /* renamed from: d */
    public final String mo39055d(String str, String str2, String str3, String str4) {
        String str5 = Build.MANUFACTURER + "-" + Build.MODEL;
        String valueOf = String.valueOf(System.currentTimeMillis());
        String valueOf2 = String.valueOf(Build.VERSION.SDK_INT);
        String str6 = this.f31104a;
        if (str6 == null) {
            str6 = "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventType", h60.f29518m);
            jSONObject.put("mid", this.f31106b);
            jSONObject.put("orderId", this.f31107c);
            jSONObject.put("deviceModel", str5);
            jSONObject.put("os", "android");
            jSONObject.put("osVersion", valueOf2);
            jSONObject.put("timestamp", valueOf);
            jSONObject.put("flow", str2);
            jSONObject.put(vh3.C7051b.f36564T, "AIO_1.0");
            jSONObject.put("platform", "SDK");
            jSONObject.put("deviceType", "SmartPhone");
            jSONObject.put("eventCategory", h60.f29518m);
            jSONObject.put("eventAction", str);
            jSONObject.put("eventLabel", str3);
            jSONObject.put(h60.f29531z, str6);
            if (!str4.isEmpty()) {
                jSONObject.put("PaytmAppVersion", "Android_" + str4);
            }
            jSONObject.put("env", "allinone_sdk_prod");
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: f */
    public void mo39056f(String str, String str2) {
        mo39058h(h60.f29526u, str, h60.f29484C, str2);
    }

    /* renamed from: g */
    public void mo39057g(String str, String str2, String str3) {
        mo39060j(str, str2, str3, "");
    }

    /* renamed from: h */
    public void mo39058h(String str, String str2, String str3, String str4) {
        mo39057g(str, str2, str3 + a13.f25713a + str4);
    }

    /* renamed from: i */
    public void mo39059i(String str, String str2, String str3, String str4, String str5) {
        mo39060j(str, str2, str3 + a13.f25713a + str4, str5);
    }

    /* renamed from: j */
    public void mo39060j(String str, String str2, String str3, String str4) {
        OkHttpClient okHttpClient = new OkHttpClient();
        HttpUrl.Builder addPathSegment = new HttpUrl.Builder().scheme(m51.f32019b).host("securegw.paytm.in").addPathSegment("ui").addPathSegment("logger");
        FirebasePerfOkHttpClient.enqueue(okHttpClient.newCall(new Request.Builder().url(addPathSegment.build()).post(RequestBody.create(mo39055d(str, str2, str3, str4), this.f31105a)).build()), new C5872a());
    }

    /* renamed from: k */
    public void mo39061k(String str) {
        this.f31104a = str;
    }
}
