package easypay.appinvoke.utils;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.app.JobIntentService;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.onedelhi.secure.C5706ib;
import com.onedelhi.secure.es2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.q51;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.xr0;
import easypay.appinvoke.manager.Constants;
import easypay.appinvoke.manager.PaytmAssist;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;

public class EasyPayConfigDownloader extends JobIntentService {

    /* renamed from: n */
    public static final int f38717n = 2321;

    /* renamed from: a */
    public SharedPreferences f38718a;

    /* renamed from: a */
    public C7587a f38719a;

    /* renamed from: b */
    public SharedPreferences f38720b;

    /* renamed from: c */
    public String f38721c;

    /* renamed from: easypay.appinvoke.utils.EasyPayConfigDownloader$a */
    public interface C7587a {
        /* renamed from: a */
        void mo48802a(String str);

        /* renamed from: b */
        void mo48803b(String str);
    }

    public EasyPayConfigDownloader() {
    }

    public EasyPayConfigDownloader(C7587a aVar, Context context, Intent intent) {
        mo48800o(aVar);
        m74629n(context, intent);
    }

    /* renamed from: n */
    public static void m74629n(Context context, Intent intent) {
        JobIntentService.m3566d(context, EasyPayConfigDownloader.class, f38717n, intent);
    }

    /* renamed from: h */
    public void mo3717h(@mr2 Intent intent) {
        this.f38720b = getSharedPreferences(Constants.EASYPAY_NEW_PREFERENCE_FILE, 0);
        this.f38718a = getSharedPreferences(Constants.EASY_PAY_ETAG_PREF, 0);
        this.f38721c = intent.getStringExtra(Constants.EXTRA_BANK_REQ_JSON);
        mo48798l();
    }

    /* renamed from: l */
    public void mo48798l() {
        try {
            long j = this.f38720b.getLong("easypay_configuration_load_timestamp", 0);
            if (System.currentTimeMillis() - j > this.f38720b.getLong("easypay_configuration_ttl", 0)) {
                String configUrlToHit = PaytmAssist.getAssistInstance().getConfigUrlToHit();
                C5706ib.m51978a("EasyPay Config requestURL:" + configUrlToHit, this);
                if (!TextUtils.isEmpty(configUrlToHit) && mo48799m(configUrlToHit)) {
                    SharedPreferences.Editor edit = this.f38720b.edit();
                    edit.putLong("easypay_configuration_load_timestamp", System.currentTimeMillis());
                    edit.apply();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
    }

    /* renamed from: m */
    public boolean mo48799m(String str) {
        try {
            URL url = new URL(str);
            C5706ib.m51978a("url:" + url.toString(), this);
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setConnectTimeout(13000);
            httpURLConnection.setRequestMethod(q51.C6513a.f34002v);
            JSONObject jSONObject = new JSONObject(this.f38721c);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("bankName", jSONObject.getString(Constants.EXTRA_BANK_CODE));
            jSONObject2.put("payMode", jSONObject.getString(Constants.EXTRA_BANK_PAYTYPE));
            if (jSONObject.getString(Constants.EXTRA_BANK_PAYTYPE).equals(Constants.EASYPAY_PAYTYPE_NETBANKING)) {
                jSONObject2.put(Constants.EXTRA_BANK_SCHEME, (Object) null);
            } else {
                jSONObject2.put(Constants.EXTRA_BANK_SCHEME, jSONObject.getString(Constants.EXTRA_BANK_SCHEME));
            }
            jSONObject2.put("orderId", PaytmAssist.getAssistInstance().getOrderId());
            jSONObject2.put("mid", PaytmAssist.getAssistInstance().getMid());
            jSONObject2.put("deviceType", "ANDROID");
            C5706ib.m51978a("resquestBody:" + jSONObject2.toString(), this);
            String a = xr0.m70756a(this, jSONObject.getString(Constants.EXTRA_BANK_CODE), jSONObject.getString(Constants.EXTRA_BANK_PAYTYPE), jSONObject.getString(Constants.EXTRA_BANK_SCHEME));
            if (a == null) {
                a = "";
            }
            httpURLConnection.setRequestProperty(ConfigFetchHttpClient.f25306g, a);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(jSONObject2.toString().getBytes());
            outputStream.close();
            C5706ib.m51978a("EasyPay Config requestbody:" + jSONObject2.toString(), this);
            String headerField = httpURLConnection.getHeaderField(ConfigFetchHttpClient.f25305f);
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, es2.C2087g.f11511j);
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedInputStream.close();
                    C5706ib.m51978a("unique Assist Config response" + sb.toString(), this);
                    xr0.m70757b(this, sb.toString(), headerField);
                    Intent intent = new Intent();
                    intent.setAction(Constants.EASYPAY_ACTION_FILE_DOWNLOADED);
                    sendBroadcast(intent);
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: o */
    public void mo48800o(C7587a aVar) {
        this.f38719a = aVar;
    }

    public void onCreate() {
        super.onCreate();
    }

    public void onStart(@ts2 Intent intent, int i) {
        super.onStart(intent, i);
    }
}
