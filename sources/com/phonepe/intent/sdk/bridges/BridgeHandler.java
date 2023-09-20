package com.phonepe.intent.sdk.bridges;

import android.webkit.JavascriptInterface;
import com.onedelhi.secure.j15;
import com.onedelhi.secure.m05;
import com.onedelhi.secure.o05;
import com.onedelhi.secure.oz4;
import com.onedelhi.secure.v15;
import jmjou.C7601c;
import jmjou.C7606e;
import org.json.JSONException;
import org.json.JSONObject;

public class BridgeHandler implements C7606e {
    public static final String TAG = "NativeSDK";
    public C7601c cqqlq;
    public j15 irjuc;

    public C7601c getObjectFactory() {
        return this.cqqlq;
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        this.irjuc = (j15) (aVar.containsKey("bridgeCallback") ? aVar.get("bridgeCallback") : null);
        this.cqqlq = cVar;
    }

    public boolean isCachingAllowed() {
        return false;
    }

    @JavascriptInterface
    public void onJSLoadStateChanged(String str, String str2, String str3) {
        m05.m56772c(TAG, String.format("onJSLoadStateChanged: isJSLoaded = {%s}", new Object[]{str2}));
        this.irjuc.mo18084a(str, str2, str3);
    }

    @JavascriptInterface
    public void onTransactionComplete(String str) {
        m05.m56772c(TAG, String.format("onTransactionComplete: paymentResponse = {%s}", new Object[]{str}));
        this.irjuc.mo18087d(str);
    }

    @JavascriptInterface
    public void setUrlConfig(String str) {
        boolean z = false;
        m05.m56772c(TAG, String.format("setUrlConfig : jsData = {%s}", new Object[]{str}));
        if (!(str == null || str.length() <= 0 || this.irjuc == null)) {
            C7601c cVar = this.cqqlq;
            o05 o05 = null;
            try {
                JSONObject a = v15.m67586a(new JSONObject(str), "urlConfig", true, true);
                if (a != null) {
                    o05 = o05.m58886a(a.toString(), cVar);
                }
            } catch (JSONException e) {
                m05.m56773d("UrlConfigData", String.format("JSONException caught with message = {%s}", new Object[]{e.getMessage()}), e);
            }
            if (o05 != null) {
                this.irjuc.mo18088j(o05);
                return;
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (this.irjuc == null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        String format = String.format("setUrlConfig is called with jsData = {%s}. bridgeCallback is null = {%s}", objArr);
        m05.m56771b(TAG, format);
        this.cqqlq.mo48865a().mo42319a(TAG, format, oz4.C6352a.LOW);
    }

    @JavascriptInterface
    public void showLoader(String str, String str2, String str3) {
        m05.m56772c(TAG, String.format("showLoader: shouldShowLoader = {%s}", new Object[]{str2}));
        this.irjuc.mo18085b(str, str2, str3);
    }
}
