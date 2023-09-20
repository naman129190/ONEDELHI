package com.onedelhi.secure;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import com.onedelhi.secure.c15;
import com.phonepe.intent.sdk.api.RequestCallback;
import jmjou.C7601c;
import jmjou.C7606e;
import org.json.JSONException;
import org.json.JSONObject;

public class a15 implements C7606e, ServiceConnection {

    /* renamed from: a */
    public AsyncTask<Void, Void, String> f25717a = new C4468a();

    /* renamed from: a */
    public c15 f25718a;

    /* renamed from: a */
    public RequestCallback f25719a;

    /* renamed from: a */
    public C7601c f25720a;

    /* renamed from: b */
    public String f25721b;

    /* renamed from: c */
    public String f25722c;

    /* renamed from: d */
    public String f25723d;

    /* renamed from: com.onedelhi.secure.a15$a */
    public class C4468a extends AsyncTask<Void, Void, String> {
        public C4468a() {
        }

        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            try {
                m05.m56772c("SDKtoAppConnection", "Making Request");
                a15 a15 = a15.this;
                String W4 = a15.f25718a.mo32211W4(a15.f25721b, a15.f25722c, a15.f25723d);
                new JSONObject(W4).put("timestamp", System.currentTimeMillis());
                a15 a152 = a15.this;
                a152.f25720a.mo48875k(a152.f25721b, W4);
                return W4;
            } catch (Exception e) {
                m05.m56773d("SDKtoAppConnection", "CAUGHT EXCEPTION: " + e.getMessage(), e);
                return null;
            }
        }

        public void onPostExecute(Object obj) {
            String str = (String) obj;
            super.onPostExecute(str);
            a15.this.mo30413b(str);
            a15.this.f25720a.getClass();
            C7601c.f38776a.unbindService(a15.this);
        }
    }

    /* renamed from: a */
    public final void mo30412a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", false);
            jSONObject.put("phonepeResponded", false);
            mo30413b(jSONObject.toString());
        } catch (JSONException unused) {
            mo30413b((String) null);
        }
    }

    /* renamed from: b */
    public final synchronized void mo30413b(String str) {
        if (this.f25719a != null) {
            m05.m56772c("SDKtoAppConnection", "Got Response");
            this.f25719a.onResponse(str);
            this.f25719a = null;
        }
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        this.f25720a = cVar;
        Object obj = null;
        this.f25721b = (String) (aVar.containsKey("request") ? aVar.get("request") : null);
        this.f25722c = (String) (aVar.containsKey("constraints") ? aVar.get("constraints") : null);
        if (aVar.containsKey("callback")) {
            obj = aVar.get("callback");
        }
        this.f25719a = (RequestCallback) obj;
        if (cVar.mo48872h(this.f25721b) != null) {
            try {
                String str = (String) cVar.mo48872h(this.f25721b);
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("timestamp")) {
                    if (System.currentTimeMillis() - jSONObject.getLong("timestamp") >= np1.f32709a) {
                        m05.m56772c("SDKtoAppConnection", "Sending Cached Response");
                        mo30413b(str);
                        return;
                    }
                    m05.m56772c("SDKtoAppConnection", "Cached Data expired fetching again.");
                }
            } catch (Exception e) {
                m05.m56773d("SDKtoAppConnection", e.getMessage(), e);
            }
        }
        Intent intent = new Intent();
        intent.setAction("com.phonepe.app.remote.service.MERCHANTSERVICE");
        intent.setComponent(new ComponentName(l05.m55199c(cVar), "com.phonepe.app.external.sdksupport.MerchantService"));
        intent.addFlags(1);
        this.f25723d = C7601c.f38776a.getPackageName();
        int i = 0;
        boolean z = false;
        while (i < 20) {
            i++;
            z = C7601c.f38776a.bindService(intent, this, 1);
            if (z) {
                break;
            }
        }
        if (!z) {
            mo30412a();
        }
        m05.m56772c("SDKtoAppConnection", "initConnection: Result: " + z + " Count: " + i + " Thread: " + Thread.currentThread().getName());
    }

    public boolean isCachingAllowed() {
        return false;
    }

    public void onBindingDied(ComponentName componentName) {
        m05.m56772c("SDKtoAppConnection", "onBindingDied: " + componentName.flattenToString());
        if (this.f25717a.getStatus() == AsyncTask.Status.PENDING) {
            mo30412a();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c15 c15;
        int i = c15.C4722a.f26614b;
        if (iBinder == null) {
            c15 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.phonepe.app.external.sdksupport.MerchantBridge");
            c15 = (queryLocalInterface == null || !(queryLocalInterface instanceof c15)) ? new c15.C4722a.C4723a(iBinder) : (c15) queryLocalInterface;
        }
        this.f25718a = c15;
        if (this.f25717a.getStatus() == AsyncTask.Status.PENDING) {
            this.f25717a.execute(new Void[0]);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        m05.m56772c("SDKtoAppConnection", "onServiceDisconnected: " + componentName.flattenToString());
        if (this.f25717a.getStatus() == AsyncTask.Status.PENDING) {
            mo30412a();
        }
    }
}
