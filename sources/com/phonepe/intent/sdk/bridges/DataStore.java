package com.phonepe.intent.sdk.bridges;

import android.webkit.JavascriptInterface;
import com.onedelhi.secure.b05;
import com.onedelhi.secure.h15;
import com.onedelhi.secure.h35;
import com.onedelhi.secure.j15;
import com.onedelhi.secure.l05;
import com.onedelhi.secure.m05;
import com.onedelhi.secure.m15;
import com.onedelhi.secure.r15;
import com.onedelhi.secure.s25;
import jmjou.C7601c;
import jmjou.C7606e;

public class DataStore implements C7606e {
    public static final String TAG = "NativeStore";
    public C7601c chmha;
    public j15 cqqlq;
    public b05 irjuc;

    @JavascriptInterface
    public void clearDataStore() {
        m05.m56774e(TAG, "clearDataStore is called to clear all data");
        this.irjuc.mo48863c();
    }

    @JavascriptInterface
    public void getBool(String str, String str2, String str3) {
        m05.m56774e(TAG, String.format("getBool is called with parameters context = {%s}, data = {%s}, callback = {%s}.", new Object[]{str, str2, str3}));
        String str4 = (String) ((s25) h15.fromJsonString(str2, this.chmha, s25.class)).get("key");
        irjuc(str, str4, str3, this.irjuc.mo48862b().contains(str4) ? Boolean.valueOf(this.irjuc.mo48862b().getBoolean(str4, false)) : null);
    }

    @JavascriptInterface
    public void getFloat(String str, String str2, String str3) {
        m05.m56774e(TAG, String.format("getFloat is called with parameters context = {%s}, data = {%s}, callback = {%s}.", new Object[]{str, str2, str3}));
        String str4 = (String) ((s25) h15.fromJsonString(str2, this.chmha, s25.class)).get("key");
        irjuc(str, str4, str3, this.irjuc.mo48862b().contains(str4) ? Float.valueOf(this.irjuc.mo48862b().getFloat(str4, -1.0f)) : null);
    }

    @JavascriptInterface
    public void getInt(String str, String str2, String str3) {
        m05.m56774e(TAG, String.format("getInt is called with parameters context = {%s}, data = {%s}, callback = {%s}.", new Object[]{str, str2, str3}));
        String str4 = (String) ((s25) h15.fromJsonString(str2, this.chmha, s25.class)).get("key");
        irjuc(str, str4, str3, this.irjuc.mo48862b().contains(str4) ? Integer.valueOf(this.irjuc.mo48862b().getInt(str4, 0)) : null);
    }

    @JavascriptInterface
    public void getString(String str, String str2, String str3) {
        m05.m56774e(TAG, String.format("getString is called with parameters context = {%s}, data = {%s}, callback = {%s}.", new Object[]{str, str2, str3}));
        String str4 = (String) ((s25) h15.fromJsonString(str2, this.chmha, s25.class)).get("key");
        try {
            if (this.irjuc.mo48862b().contains(str4)) {
                irjuc(str, str4, str3, this.irjuc.mo48862b().getString(str4, ""));
            } else {
                irjuc(str, str4, str3, (Object) null);
            }
        } catch (Exception e) {
            m05.m56772c("Real11test", e.getMessage());
        }
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        this.chmha = cVar;
        b05 b05 = (b05) cVar.mo48873i(b05.class);
        this.irjuc = b05;
        l05.m55206j(b05, "Real11test", "dC");
        this.cqqlq = (j15) (aVar.containsKey("bridgeCallback") ? aVar.get("bridgeCallback") : null);
    }

    public final <T> void irjuc(String str, String str2, String str3, T t) {
        h35 h35;
        m15 m15;
        r15 r15 = (r15) this.chmha.mo48873i(r15.class);
        String str4 = null;
        if (t != null) {
            s25 s25 = (s25) this.chmha.mo48873i(s25.class);
            s25.put("key", str2);
            s25.put("value", t);
            h35 m = this.chmha.mo48876m("SUCCESS");
            r15.mo43794a(s25);
            h35 = m;
            m15 = null;
        } else {
            m15 = (m15) this.chmha.mo48873i(m15.class);
            m15.put("code", "KEY_NOT_FOUND_ERROR");
            m15.put("message", "Key not found");
            h35 = null;
        }
        Object[] objArr = new Object[5];
        objArr[0] = str3;
        String str5 = "null";
        objArr[1] = m15 == null ? str5 : m15.toJsonString();
        if (h35 != null) {
            str5 = h35.toJsonString();
        }
        objArr[2] = str5;
        objArr[3] = str;
        objArr[4] = r15.toJsonString();
        m05.m56774e(TAG, String.format("onBridgeCallback triggered with callback = {%s}, error = {%s}, response = {%s}, context = {%s}, body = {%s}.", objArr));
        j15 j15 = this.cqqlq;
        String jsonString = m15 == null ? null : m15.toJsonString();
        if (h35 != null) {
            str4 = h35.toJsonString();
        }
        j15.mo18086c(str3, jsonString, str4, str, r15.toJsonString());
    }

    public boolean isCachingAllowed() {
        return false;
    }

    @JavascriptInterface
    public void removeKey(String str) {
        m05.m56774e(TAG, String.format("removeKey is called with parameters key = {%s}.", new Object[]{str}));
        this.irjuc.mo48862b().edit().remove(str).commit();
    }

    @JavascriptInterface
    public void setBool(String str, boolean z) {
        m05.m56774e(TAG, String.format("setBool is called with parameters key = {%s}, value = {%s}.", new Object[]{str, Boolean.valueOf(z)}));
        this.irjuc.mo48862b().edit().putBoolean(str, z).apply();
    }

    @JavascriptInterface
    public void setFloat(String str, float f) {
        m05.m56774e(TAG, String.format("setFloat is called with parameters key = {%s}, value = {%s}.", new Object[]{str, Float.valueOf(f)}));
        this.irjuc.mo48862b().edit().putFloat(str, f).apply();
    }

    @JavascriptInterface
    public void setInt(String str, int i) {
        m05.m56774e(TAG, String.format("setInt is called with parameters key = {%s}, value = {%s}.", new Object[]{str, Integer.valueOf(i)}));
        this.irjuc.mo48862b().edit().putInt(str, i).apply();
    }

    @JavascriptInterface
    public void setString(String str, String str2) {
        m05.m56774e(TAG, String.format("setString is called with parameters key = {%s}, value = {%s}.", new Object[]{str, str2}));
        this.irjuc.mo48862b().edit().putString(str, str2).apply();
    }
}
