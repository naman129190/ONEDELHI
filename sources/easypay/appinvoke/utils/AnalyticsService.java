package easypay.appinvoke.utils;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import com.google.firebase.messaging.C4311b;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.onedelhi.secure.C5706ib;
import com.onedelhi.secure.hj1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.v82;
import easypay.appinvoke.manager.Constants;
import java.util.HashMap;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class AnalyticsService extends JobIntentService {

    /* renamed from: n */
    public static int f38715n = 123;

    /* renamed from: b */
    public HashMap<String, Object> f38716b;

    /* renamed from: l */
    public static void m74627l(Context context, Intent intent) {
        JobIntentService.m3566d(context, AnalyticsService.class, f38715n, intent);
    }

    /* renamed from: h */
    public void mo3717h(@mr2 Intent intent) {
        if (intent != null) {
            try {
                this.f38716b = (HashMap) intent.getSerializableExtra(C4311b.C4317f.C4318a.f25149a);
            } catch (Exception e) {
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
            }
            if (this.f38716b != null) {
                try {
                    MediaType parse = MediaType.parse("application/json; charset=utf-8");
                    OkHttpClient okHttpClient = new OkHttpClient();
                    String z = new hj1().mo37346d().mo36024z(this.f38716b);
                    C5706ib.m51978a("analytics log map-json:" + z, this);
                    v82.m67793c("AssistAna", "analytics service :Map" + z);
                    if (FirebasePerfOkHttpClient.execute(okHttpClient.newCall(new Request.Builder().url(Constants.EventUrl).post(RequestBody.create(parse, z)).build())).body() != null) {
                        stopSelf();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    C5706ib.m51978a("EXCEPTION", e2);
                }
            }
        }
    }

    public void onCreate() {
        super.onCreate();
    }
}
