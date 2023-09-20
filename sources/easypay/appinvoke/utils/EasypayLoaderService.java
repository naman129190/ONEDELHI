package easypay.appinvoke.utils;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.app.JobIntentService;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.onedelhi.secure.es2;
import com.onedelhi.secure.gk1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qa0;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.v82;
import easypay.appinvoke.manager.Constants;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class EasypayLoaderService extends JobIntentService {

    /* renamed from: c */
    public static final String f38722c = "EasypayLoaderService";

    /* renamed from: n */
    public static final int f38723n = 1234;

    /* renamed from: a */
    public SharedPreferences.Editor f38724a;

    /* renamed from: a */
    public SharedPreferences f38725a;

    /* renamed from: a */
    public C7588a f38726a;

    /* renamed from: b */
    public SharedPreferences f38727b;

    /* renamed from: easypay.appinvoke.utils.EasypayLoaderService$a */
    public interface C7588a {
        /* renamed from: a */
        void mo48808a(String str);

        /* renamed from: b */
        void mo48809b(String str);
    }

    public EasypayLoaderService() {
    }

    public EasypayLoaderService(C7588a aVar) {
        this.f38726a = aVar;
    }

    /* renamed from: n */
    public static void m74636n(Context context, Intent intent) {
        JobIntentService.m3566d(context, EasypayLoaderService.class, f38723n, intent);
    }

    /* renamed from: h */
    public void mo3717h(@mr2 Intent intent) {
        this.f38727b = getSharedPreferences("com.paytm.com.paytm.pgsdk.easypay.appinvoke.PREFERENCE_FILE_KEY", 0);
        this.f38725a = getSharedPreferences("ETAGPreference", 0);
        SharedPreferences.Editor edit = this.f38727b.edit();
        edit.putBoolean("enableEasyPay", intent.getBooleanExtra("enableEasyPay", false));
        edit.apply();
        mo48804l();
    }

    /* renamed from: l */
    public void mo48804l() {
        if (System.currentTimeMillis() - this.f38727b.getLong("easypay_configuration_load_timestamp", 0) > this.f38727b.getLong("easypay_configuration_ttl", 0)) {
            v82.m67791a("kanish", "loader service :json not expired");
            try {
                String str = Constants.getDbUrl() + ("?" + ("JsonData={\"MID\":\"" + this.f38727b.getString("merchant_mid", "") + "\"}"));
                v82.m67791a(f38722c, "Json download path:" + str);
                if (mo48805m(str, "easypay_configuration.json")) {
                    SharedPreferences.Editor edit = getSharedPreferences("com.paytm.com.paytm.pgsdk.easypay.appinvoke.PREFERENCE_FILE_KEY", 0).edit();
                    edit.putLong("easypay_configuration_load_timestamp", System.currentTimeMillis());
                    edit.apply();
                    v82.m67791a(f38722c, "downloaded - easypay_configuration.json");
                }
            } catch (Exception unused) {
            }
        } else {
            v82.m67791a(f38722c, "not downloading - easypay_configuration.json");
        }
    }

    /* renamed from: m */
    public boolean mo48805m(String str, String str2) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setConnectTimeout(gk1.f12625h);
            httpURLConnection.setRequestMethod("GET");
            String string = this.f38725a.getString("ETAGValue", qa0.f34045b);
            long j = this.f38725a.getLong("LastRequestTimestamp", 0);
            long currentTimeMillis = System.currentTimeMillis();
            httpURLConnection.setRequestProperty(ConfigFetchHttpClient.f25306g, string);
            httpURLConnection.connect();
            String headerField = httpURLConnection.getHeaderField(ConfigFetchHttpClient.f25305f);
            SharedPreferences.Editor edit = this.f38725a.edit();
            this.f38724a = edit;
            edit.putString("ETAGValue", headerField);
            this.f38724a.apply();
            if (currentTimeMillis < j + 10800000) {
                Intent intent = new Intent();
                intent.setAction(Constants.EASYPAY_ACTION_OLD_FILE_DOWNLOADED);
                sendBroadcast(intent);
                v82.m67791a(f38722c, "No need to download file");
                return true;
            }
            SharedPreferences.Editor edit2 = this.f38725a.edit();
            this.f38724a = edit2;
            edit2.putLong("LastRequestTimestamp", currentTimeMillis);
            this.f38724a.apply();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream(), es2.C2087g.f11511j);
            File file = new File(getApplicationContext().getFilesDir() + "/" + str2);
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bufferedInputStream.close();
                    new String(byteArrayOutputStream.toByteArray());
                    v82.m67791a(f38722c, "baos data is :- " + new String(byteArrayOutputStream.toByteArray()));
                    v82.m67791a(f38722c, "easypay_configuration downloaded!");
                    Intent intent2 = new Intent();
                    intent2.setAction(Constants.EASYPAY_ACTION_OLD_FILE_DOWNLOADED);
                    sendBroadcast(intent2);
                    return true;
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: o */
    public void mo48806o(C7588a aVar) {
        v82.m67791a(f38722c, aVar.toString());
        this.f38726a = aVar;
    }

    public void onCreate() {
        super.onCreate();
    }

    public void onStart(@ts2 Intent intent, int i) {
        super.onStart(intent, i);
    }
}
