package easypay.appinvoke.manager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.p000v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C0657l;
import com.google.firebase.messaging.C4311b;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.onedelhi.secure.C4474a8;
import com.onedelhi.secure.C5403gb;
import com.onedelhi.secure.C5706ib;
import com.onedelhi.secure.de3;
import com.onedelhi.secure.es2;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.hg1;
import com.onedelhi.secure.hj1;
import com.onedelhi.secure.q51;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.to1;
import com.onedelhi.secure.vw4;
import com.onedelhi.secure.yr0;
import easypay.appinvoke.actions.EasypayBrowserFragment;
import easypay.appinvoke.actions.GAEventManager;
import easypay.appinvoke.utils.EasyPayConfigDownloader;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;

public class PaytmAssist {
    private static PaytmAssist assistInstance = null;
    private static Context context = null;
    private static boolean isEasyPayActive = true;
    public static boolean isEasyPayEnabled = true;
    private String appVersionTest;
    private String bankName;
    private String cardDetails;
    private String cardScheme;
    private String configUrlToHit = "";
    private EasyPayHelper easyPayHelper;
    private EasypayBrowserFragment fragment;
    private Integer fragmentViewId;
    private boolean isAssistEngineTerminated;
    private boolean isFragmentResumed = true;
    private boolean isFragmentStopped = true;
    private boolean isShowNbLoader = false;
    private String lastLoadedUrl;
    /* access modifiers changed from: private */
    public AppCompatActivity mActivity;
    private StringBuilder mAnalyticsExtraParam;
    private GAEventManager mAnalyticsManager;
    private C4474a8 mAppCallback;
    private C5403gb mEventCallBack;
    private Map<String, Object> mEventMap = new HashMap();
    private ArrayList<vw4> mWcListListener;
    /* access modifiers changed from: private */
    public String mid;
    private String orderId;
    private String payType;
    private WebViewClient paymentWebClient;
    private EasypayWebViewClient webClientInstance;
    private WebView webView = null;

    private void accessCheckApi() {
        new Thread(new Runnable() {
            public void run() {
                if (PaytmAssist.this.mid != null) {
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put("mid", PaytmAssist.this.mid);
                        MediaType parse = MediaType.parse("application/json; charset=utf-8");
                        if (FirebasePerfOkHttpClient.execute(new OkHttpClient().newCall(new Request.Builder().url(Constants.WelcomeApi).post(RequestBody.create(parse, new hj1().mo37346d().mo36024z(hashMap))).build())).body() != null && PaytmAssist.this.mActivity != null) {
                            PaytmAssist.this.mActivity.runOnUiThread(new Runnable() {
                                public void run() {
                                    PaytmAssist.this.initAssist();
                                }
                            });
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    private void configureWebClient() {
        WebViewClient paymentWebClient2 = getAssistInstance().getPaymentWebClient();
        if (paymentWebClient2 == null) {
            paymentWebClient2 = getAssistInstance().getWebClientInstance();
        }
        this.webView.setWebViewClient(paymentWebClient2);
    }

    /* access modifiers changed from: private */
    public void downloadBankWiseConfig(String str) {
        try {
            Intent intent = new Intent(this.mActivity, EasyPayConfigDownloader.class);
            intent.putExtra(Constants.EXTRA_BANK_REQ_JSON, str);
            EasyPayConfigDownloader.m74629n(this.mActivity.getBaseContext(), intent);
        } catch (Exception unused) {
        }
    }

    private void fetchAPIByAppVersion(final String str) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(Constants.FETCH_URL_API).openConnection()));
                    httpURLConnection.setReadTimeout(15000);
                    httpURLConnection.setConnectTimeout(13000);
                    httpURLConnection.setRequestMethod(q51.C6513a.f34002v);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("deviceType", "android");
                    jSONObject.put("version", "8.2.2");
                    jSONObject.put("orderId", PaytmAssist.getAssistInstance().getOrderId());
                    jSONObject.put("mid", PaytmAssist.getAssistInstance().getMid());
                    jSONObject.put("deviceType", "ANDROID");
                    C5706ib.m51978a("Fetch APi requestURL:https://securegw.paytm.in/payassist/api/getURLByAppVersion", this);
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(jSONObject.toString().getBytes());
                    outputStream.close();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, es2.C2087g.f11511j);
                    StringBuilder sb = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    hg1 hg1 = (hg1) new fj1().mo36012n(sb.toString(), hg1.class);
                    if (hg1 != null && hg1.mo37303a() == 200) {
                        if (!TextUtils.isEmpty(hg1.mo37305c())) {
                            PaytmAssist.this.setConfigUrlToHit(hg1.mo37305c());
                            PaytmAssist.this.downloadBankWiseConfig(str);
                            C5706ib.m51978a("Get Config URL to hitURL:" + PaytmAssist.this.getConfigUrlToHit(), this);
                        } else {
                            PaytmAssist.this.setConfigUrlToHit("");
                        }
                    }
                    bufferedInputStream.close();
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e2) {
                    e2.printStackTrace();
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        }).start();
    }

    private String freeStorage() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return Long.toString((((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount())) / PlaybackStateCompat.f408A);
        } catch (Exception unused) {
            return "";
        }
    }

    public static synchronized PaytmAssist getAssistInstance() {
        PaytmAssist paytmAssist;
        synchronized (PaytmAssist.class) {
            if (assistInstance == null) {
                assistInstance = new PaytmAssist();
            }
            paytmAssist = assistInstance;
        }
        return paytmAssist;
    }

    public static Context getContext() {
        return context;
    }

    public static boolean getEasyPayActiveStatus() {
        return isEasyPayActive;
    }

    public static void getEasyPayEnabledStatus(boolean z) {
        isEasyPayEnabled = z;
    }

    private String getNetworkType(Context context2) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() == 1) {
                    return "WIFI";
                }
                if (activeNetworkInfo.getType() == 0) {
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return "2G";
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return "3G";
                        case 13:
                            return "4G";
                        default:
                            return "Unknown";
                    }
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private WebViewClient getPaymentWebClient() {
        return this.paymentWebClient;
    }

    private void inflatePaytmAssist() {
        try {
            C5706ib.m51978a("Creating EasypayBrowserFragment", this);
            EasypayBrowserFragment t0 = EasypayBrowserFragment.m74535t0();
            this.fragment = t0;
            setFragment(t0);
            C0657l r = this.mActivity.mo4464v0().mo4611r();
            if (this.mActivity != null && !this.fragment.isAdded()) {
                r.mo4860f(this.fragmentViewId.intValue(), this.fragment);
                r.mo4726q();
                this.webView.setWebChromeClient(new yr0(this.fragment));
                this.mAnalyticsManager.mo38438z(this.mActivity.getPackageName(), this.orderId, this.mActivity.getPackageManager().getPackageInfo(this.mActivity.getPackageName(), 0).versionName);
                this.mAnalyticsManager.mo38417e(this.mid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public void initAssist() {
        Context context2;
        String str;
        GAEventManager gAEventManager;
        String packageName;
        GAEventManager gAEventManager2;
        String packageName2;
        AppCompatActivity appCompatActivity = this.mActivity;
        if (appCompatActivity != null && (context2 = context) != null) {
            if (isEasyPayEnabled) {
                if (r70.m26348a(context2, "android.permission.READ_SMS") == 0) {
                    this.mAnalyticsManager.mo38426n(true);
                    inflatePaytmAssist();
                    try {
                        if (this.mActivity.getPackageManager() != null) {
                            str = this.mActivity.getPackageManager().getPackageInfo(this.mActivity.getPackageName(), 0).versionName;
                            gAEventManager = this.mAnalyticsManager;
                            packageName = this.mActivity.getPackageName();
                        } else {
                            gAEventManager2 = this.mAnalyticsManager;
                            packageName2 = this.mActivity.getPackageName();
                        }
                    } catch (Exception unused) {
                        return;
                    }
                } else if (r70.m26348a(context, "android.permission.READ_SMS") != 0 && isEasyPayEnabled) {
                    this.mAnalyticsManager.mo38426n(false);
                    inflatePaytmAssist();
                    if (this.mActivity.getPackageManager() != null) {
                        str = this.mActivity.getPackageManager().getPackageInfo(this.mActivity.getPackageName(), 0).versionName;
                        gAEventManager = this.mAnalyticsManager;
                        packageName = this.mActivity.getPackageName();
                    } else {
                        gAEventManager2 = this.mAnalyticsManager;
                        packageName2 = this.mActivity.getPackageName();
                    }
                } else {
                    return;
                }
                gAEventManager2.mo38438z(packageName2, this.orderId, "Version Not Found");
                return;
            }
            str = appCompatActivity.getPackageManager().getPackageInfo(this.mActivity.getPackageName(), 0).versionName;
            gAEventManager = this.mAnalyticsManager;
            packageName = this.mActivity.getPackageName();
            gAEventManager.mo38438z(packageName, this.orderId, str);
        }
    }

    private static void setAssistInstance(PaytmAssist paytmAssist) {
        assistInstance = paytmAssist;
    }

    /* access modifiers changed from: private */
    public void setConfigUrlToHit(String str) {
        this.configUrlToHit = str;
    }

    public static void setContext(Context context2) {
        context = context2;
    }

    public static void setEasyPayActiveStatus(boolean z) {
        isEasyPayActive = z;
    }

    public static boolean setEasyPayEnabledStatus() {
        return isEasyPayEnabled;
    }

    private void setEasyPayHelper() {
        this.easyPayHelper = new EasyPayHelper();
    }

    private void setFragmentViewId(Integer num) {
        this.fragmentViewId = num;
    }

    private void setWebClientInstance(Activity activity) {
        if (activity != null) {
            this.webClientInstance = new EasypayWebViewClient(activity);
        }
    }

    private void setWebClientInstance(EasypayWebViewClient easypayWebViewClient) {
        this.webClientInstance = easypayWebViewClient;
    }

    private void setWebView(WebView webView2) {
        this.webView = webView2;
    }

    public String geTxnBank() {
        if (TextUtils.isEmpty(this.bankName)) {
            return null;
        }
        return this.bankName;
    }

    public String getAppVersionTest() {
        return this.appVersionTest;
    }

    public boolean getAssistEngineTerminatedStatus() {
        return this.isAssistEngineTerminated;
    }

    public String getCardDetails() {
        return this.cardDetails;
    }

    public String getConfigUrlToHit() {
        return this.configUrlToHit;
    }

    public EasyPayHelper getEasyPayHelper() {
        EasyPayHelper easyPayHelper2 = this.easyPayHelper;
        return easyPayHelper2 == null ? new EasyPayHelper() : easyPayHelper2;
    }

    public EasypayBrowserFragment getFragment() {
        return this.fragment;
    }

    public String getLastLoadedUrl() {
        return this.lastLoadedUrl;
    }

    public String getMid() {
        return this.mid;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getTxnPayType() {
        if (TextUtils.isEmpty(this.payType)) {
            this.payType = "";
        }
        return this.payType;
    }

    public EasypayWebViewClient getWebClientInstance() {
        if (this.webClientInstance == null && this.mActivity != null) {
            this.webClientInstance = new EasypayWebViewClient(this.mActivity);
        }
        return this.webClientInstance;
    }

    public WebView getWebView() {
        return this.webView;
    }

    public StringBuilder getmAnalyticsExtraParam() {
        return this.mAnalyticsExtraParam;
    }

    public GAEventManager getmAnalyticsManager() {
        return this.mAnalyticsManager;
    }

    public C5403gb getmEventCallBack() {
        return this.mEventCallBack;
    }

    public Map<String, Object> getmEventMap() {
        return this.mEventMap;
    }

    public ArrayList<vw4> getmWcListListener() {
        return this.mWcListListener;
    }

    public boolean isAssistLayoutPopped() {
        EasypayBrowserFragment easypayBrowserFragment = this.fragment;
        if (easypayBrowserFragment != null) {
            return easypayBrowserFragment.f38691e;
        }
        return false;
    }

    public boolean isFragmentPaused() {
        return this.isFragmentStopped;
    }

    public boolean isFragmentResumed() {
        return this.isFragmentResumed;
    }

    public void registerSMSCallBack(C4474a8 a8Var) {
        this.mAppCallback = a8Var;
    }

    public void removeAssist() {
        try {
            EasypayBrowserFragment easypayBrowserFragment = this.fragment;
            if (easypayBrowserFragment != null && easypayBrowserFragment.isAdded()) {
                C0657l r = this.mActivity.mo4464v0().mo4611r();
                r.mo4709B(this.fragment);
                r.mo4727r();
            }
            if (this.mActivity != null) {
                this.mActivity = null;
            }
            if (assistInstance != null) {
                assistInstance = null;
            }
            if (context != null) {
                context = null;
            }
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void sendEvent(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction("com.paytm.com.paytm.pgsdk.easypay.appinvoke.CUSTOM_EVENT");
        intent.putExtra("eventName", str);
        intent.putExtra("data0", str2);
        intent.putExtra("data1", str3);
        this.mActivity.sendBroadcast(intent);
    }

    public void setAppSMSCallback(String str) {
        C4474a8 a8Var = this.mAppCallback;
        if (a8Var != null) {
            a8Var.mo30481r(str);
        }
    }

    public void setAppVersionTest(String str) {
        C5706ib.m51978a("AppVersion:" + str, this);
        this.appVersionTest = str;
    }

    public void setAssistEngineTerminatedStatus(boolean z) {
        this.isAssistEngineTerminated = z;
    }

    public boolean setAssistLoader() {
        return this.isShowNbLoader;
    }

    public void setBankInfo(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && str.contains("-")) {
            str = str.substring(0, str.indexOf("-"));
        }
        this.bankName = str;
        this.payType = str2.toLowerCase();
        this.cardScheme = str3.toLowerCase();
        GAEventManager gAEventManager = this.mAnalyticsManager;
        if (gAEventManager != null) {
            gAEventManager.mo38433u(this.payType);
            this.mAnalyticsManager.mo38420h(str3);
            this.cardDetails = str + str3 + str2;
            String lowerCase = (str + str3 + str2).toLowerCase();
            if (lowerCase.contains(Constants.EASYPAY_PAYTYPE_ATM) || lowerCase.contains("idebit") || lowerCase.contains("atm")) {
                this.mAnalyticsManager.mo38428p(true);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Constants.EXTRA_BANK_CODE, str);
                jSONObject.put(Constants.EXTRA_BANK_PAYTYPE, str2);
                jSONObject.put(Constants.EXTRA_BANK_SCHEME, str3);
                fetchAPIByAppVersion(jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void setFragment(EasypayBrowserFragment easypayBrowserFragment) {
        this.fragment = easypayBrowserFragment;
    }

    public void setFragmentPaused(boolean z) {
        this.isFragmentStopped = z;
    }

    public void setFragmentResumed(boolean z) {
        this.isFragmentResumed = z;
    }

    public void setLastLoadedUrl(String str) {
        this.lastLoadedUrl = str;
    }

    public void setLoaderVisibility(boolean z) {
        this.isShowNbLoader = z;
    }

    public void setMid(String str) {
        this.mid = str;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setPaymentWebClient(WebViewClient webViewClient) {
        if (webViewClient == null) {
            webViewClient = this.webClientInstance;
        }
        this.paymentWebClient = webViewClient;
        configureWebClient();
    }

    public void setToolbarText(AppCompatActivity appCompatActivity, String str) throws ClassCastException {
        View inflate = appCompatActivity.getLayoutInflater().inflate(de3.C5010k.easy_pay_toolbar, (ViewGroup) null);
        ((TextView) inflate.findViewById(de3.C5007h.easy_pay_toolbar_tv)).setText(str);
        ActionBar N0 = appCompatActivity.mo843N0();
        if (N0 != null) {
            N0.mo721V(inflate);
            N0.mo745m0(false);
        }
    }

    public void setTxnBank(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.bankName = str;
        }
    }

    public void setTxnPayType(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.payType = str;
        }
    }

    public void setmAnalyticsExtraParam(StringBuilder sb) {
        this.mAnalyticsExtraParam = sb;
    }

    public void setmAnalyticsManager(GAEventManager gAEventManager) {
        this.mAnalyticsManager = gAEventManager;
    }

    public void setmWcListListener(ArrayList<vw4> arrayList) {
        this.mWcListListener = arrayList;
    }

    public void startAssist() {
        accessCheckApi();
    }

    @SuppressLint({"JavascriptInterface"})
    public boolean startConfigAssist(Context context2, Boolean bool, Boolean bool2, Integer num, WebView webView2, Activity activity, String str, String str2) {
        context = context2;
        this.mActivity = (AppCompatActivity) activity;
        isEasyPayActive = bool.booleanValue();
        isEasyPayEnabled = bool2.booleanValue();
        setWebView(webView2);
        setContext(context2);
        setFragmentViewId(num);
        this.orderId = str;
        this.mAnalyticsManager = new GAEventManager();
        StringBuilder sb = new StringBuilder();
        this.mAnalyticsExtraParam = sb;
        sb.append("networkInfo");
        if (getNetworkType(context) != null) {
            this.mAnalyticsExtraParam.append(getNetworkType(context));
        }
        this.mAnalyticsExtraParam.append("deviceInfo");
        StringBuilder sb2 = this.mAnalyticsExtraParam;
        String str3 = Build.MANUFACTURER;
        sb2.append(str3);
        StringBuilder sb3 = this.mAnalyticsExtraParam;
        String str4 = Build.MODEL;
        sb3.append(str4);
        StringBuilder sb4 = this.mAnalyticsExtraParam;
        String str5 = Build.DEVICE;
        sb4.append(str5);
        StringBuilder sb5 = this.mAnalyticsExtraParam;
        String str6 = Build.BRAND;
        sb5.append(str6);
        this.mAnalyticsExtraParam.append("Security patchLevel:");
        this.mAnalyticsExtraParam.append(Build.DISPLAY);
        String freeStorage = freeStorage();
        if (TextUtils.isEmpty(freeStorage)) {
            freeStorage = "N/A";
        }
        this.mAnalyticsExtraParam.append(freeStorage);
        Map<String, Object> map = this.mEventMap;
        map.put("deviceInfo", str3 + to1.f35743f + str4 + to1.f35743f + str5 + to1.f35743f + str6 + to1.f35743f + freeStorage());
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        Map<String, Object> map2 = this.mEventMap;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(displayMetrics.heightPixels);
        sb6.append(to1.f35743f);
        sb6.append(displayMetrics.widthPixels);
        map2.put(C4311b.C4317f.C4318a.f25150b, sb6.toString());
        double d = (double) displayMetrics.densityDpi;
        double d2 = ((double) displayMetrics.heightPixels) / d;
        double d3 = ((double) displayMetrics.widthPixels) / d;
        Map<String, Object> map3 = this.mEventMap;
        map3.put("displayInInches", d2 + to1.f35743f + d3);
        this.fragmentViewId = num;
        this.mid = str2;
        this.mWcListListener = new ArrayList<>();
        setWebClientInstance(activity);
        this.webView.addJavascriptInterface(this.mActivity, "Android");
        setOrderId(this.orderId);
        setMid(this.mid);
        setEasyPayHelper();
        this.mAnalyticsManager.mo38423k(bool2.booleanValue());
        return true;
    }
}
