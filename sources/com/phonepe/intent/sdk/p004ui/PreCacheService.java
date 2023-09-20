package com.phonepe.intent.sdk.p004ui;

import android.app.IntentService;
import android.content.Intent;
import android.text.TextUtils;
import com.onedelhi.secure.c05;
import com.onedelhi.secure.d35;
import com.onedelhi.secure.h15;
import com.onedelhi.secure.l05;
import com.onedelhi.secure.m05;
import com.onedelhi.secure.r25;
import com.onedelhi.secure.t25;
import com.onedelhi.secure.uz4;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import jmjou.C7601c;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.phonepe.intent.sdk.ui.PreCacheService */
public class PreCacheService extends IntentService {

    /* renamed from: a */
    public C7601c f38599a;

    /* renamed from: com.phonepe.intent.sdk.ui.PreCacheService$a */
    public class C7564a implements t25 {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f38600a;

        public C7564a(PreCacheService preCacheService, CountDownLatch countDownLatch) {
            this.f38600a = countDownLatch;
        }

        /* renamed from: c */
        public void mo30383c(int i, String str) {
            this.f38600a.countDown();
        }

        /* renamed from: h */
        public void mo30387h(String str) {
            this.f38600a.countDown();
        }
    }

    public PreCacheService() {
        super("PreCacheService");
        m05.m56774e("PreCacheService", "service is created");
    }

    public void onHandleIntent(Intent intent) {
        String str;
        int i;
        C7601c cVar = (C7601c) intent.getParcelableExtra("data_factory");
        this.f38599a = cVar;
        if (cVar != null) {
            r25 r25 = (r25) cVar.mo48873i(r25.class);
            if (!r25.f34479a.mo48862b().getBoolean("isPrecacheEnabled", true)) {
                m05.m56772c("PreCacheService", "Precache has been disabled by config");
                return;
            }
            uz4 uz4 = (uz4) this.f38599a.mo48873i(uz4.class);
            if (!l05.m55197a(this.f38599a)) {
                m05.m56771b("PreCacheService", "service failed to set up http response cache. returning ..");
                return;
            }
            m05.m56770a("PreCacheService", "fetching asset stats");
            if (r25.mo43797c() == null || r25.mo43797c().equals("")) {
                boolean i2 = l05.m55205i((Boolean) this.f38599a.mo48872h("com.phonepe.android.sdk.isUAT"));
                str = d35.m44668a(i2).f27213b + "/app/asset-stats";
            } else {
                str = r25.mo43797c();
            }
            uz4.C6991a b = uz4.mo45880b(str, false, false, false, (Map<String, String>) null, (String) null, uz4.f36359a).mo39619b();
            if (!b.f36361b) {
                m05.m56771b("PreCacheService", String.format("pre caching attempt failed, returning. network request failed, network response = {%s}.", new Object[]{b.f36360b}));
                return;
            }
            JSONObject b2 = this.f38599a.mo48866b(b.f36360b);
            if (b2 == null || !b2.has("assetUrlList")) {
                m05.m56771b("PreCacheService", "either asset stats is null or does not have any asset url");
                return;
            }
            JSONArray jSONArray = (JSONArray) h15.get(b2, "assetUrlList");
            if (jSONArray == null || jSONArray.length() == 0) {
                m05.m56771b("PreCacheService", "either assetUrlList is null or empty");
                return;
            }
            int length = jSONArray.length();
            CountDownLatch countDownLatch = new CountDownLatch(length);
            int i3 = 0;
            while (i3 < length) {
                String str2 = (String) h15.get(jSONArray, i3);
                if (TextUtils.isEmpty(str2)) {
                    m05.m56771b("PreCacheService", "asset url is null or empty");
                    countDownLatch.countDown();
                    i = i3;
                } else {
                    c05 c05 = r5;
                    i = i3;
                    c05 c052 = new c05(uz4, str2, false, true, (Map) null, (String) null, new C7564a(this, countDownLatch));
                    c05.executeOnExecutor(uz4.f36358a, new Void[0]);
                }
                i3 = i + 1;
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                InterruptedException interruptedException = e;
                Thread.currentThread().interrupt();
                m05.m56773d("PreCacheService", String.format("thread got interrupted with message = {%s} , letch count = {%s}", new Object[]{interruptedException.getMessage(), Long.toString(countDownLatch.getCount())}), interruptedException);
            }
        }
    }
}
