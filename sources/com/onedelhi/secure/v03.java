package com.onedelhi.secure;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

public class v03 {

    /* renamed from: a */
    public static v03 f36384a;

    /* renamed from: com.onedelhi.secure.v03$a */
    public class C7000a implements Callback {

        /* renamed from: a */
        public final /* synthetic */ C7013v7 f36386a;

        public C7000a(C7013v7 v7Var) {
            this.f36386a = v7Var;
        }

        public void onFailure(@mr2 Call call, @mr2 IOException iOException) {
            this.f36386a.mo46021b();
        }

        public void onResponse(@mr2 Call call, @mr2 Response response) throws IOException {
            if (response.body() != null) {
                String string = response.body().string();
                this.f36386a.mo46020a((m53) new fj1().mo36012n(string, m53.class));
            }
        }
    }

    /* renamed from: a */
    public static synchronized v03 m67575a() {
        v03 v03;
        synchronized (v03.class) {
            if (f36384a == null) {
                f36384a = new v03();
            }
            v03 = f36384a;
        }
        return v03;
    }

    /* renamed from: c */
    public static void m67576c() {
        f36384a = null;
    }

    /* renamed from: b */
    public void mo45921b(C7013v7<m53> v7Var) {
        String str = u03.m66329h().f35876a.mo44723a().get("MID");
        String str2 = u03.m66329h().f35876a.mo44723a().get(h60.f29506a);
        if (str == null || str2 == null) {
            v7Var.mo46021b();
            return;
        }
        String str3 = u03.m66325a() + "?orderId=" + str2 + "&mid=" + str;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("mid", str);
            jSONObject3.put("orderId", str2);
            jSONObject2.put(h60.f29498Q, h60.f29515j);
            jSONObject2.put("token", u03.m66329h().f35876a.mo44723a().get(h60.f29515j));
            jSONObject2.put("version", "v2");
            jSONObject2.put(h60.f29501T, System.currentTimeMillis());
            jSONObject.put(h60.f29502U, jSONObject2);
            jSONObject.put("body", jSONObject3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        FirebasePerfOkHttpClient.enqueue(new OkHttpClient().newCall(new Request.Builder().url(str3).header("content-type", "application/json").header("Accept", "application/json").post(RequestBody.create(MediaType.parse("application/json"), jSONObject.toString().getBytes())).build()), new C7000a(v7Var));
    }
}
