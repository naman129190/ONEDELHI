package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import org.json.JSONObject;

public class a13 {

    /* renamed from: a */
    public static final String f25713a = "=";

    /* renamed from: b */
    public static final String f25714b = "&";

    /* renamed from: c */
    public static final String f25715c = "PGSDK";

    /* renamed from: d */
    public static final String f25716d = "UTF-8";

    /* renamed from: a */
    public static synchronized void m35943a(String str) {
        synchronized (a13.class) {
            w82.m69214a(f25715c, str);
        }
    }

    /* renamed from: b */
    public static synchronized Bundle m35944b(String str) {
        Bundle bundle;
        synchronized (a13.class) {
            bundle = new Bundle();
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.length() > 0) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string = jSONObject.getString(next);
                        m35943a(next + " = " + string);
                        bundle.putString(next, string);
                    }
                }
            } catch (Exception e) {
                C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
                m35943a("Error while parsing the Merchant Response");
                m35953k(e);
            }
        }
        return bundle;
    }

    /* renamed from: c */
    public static String m35945c(Bundle bundle) {
        JSONObject jSONObject;
        if (bundle != null) {
            try {
                if (bundle.size() > 0) {
                    jSONObject = new JSONObject();
                    for (String str : bundle.keySet()) {
                        jSONObject.put(str, bundle.get(str));
                    }
                    m35943a("JSON string is " + jSONObject);
                    return jSONObject.toString();
                }
            } catch (Exception e) {
                m35953k(e);
                return null;
            }
        }
        jSONObject = null;
        m35943a("JSON string is " + jSONObject);
        return jSONObject.toString();
    }

    @ts2
    /* renamed from: d */
    public static String m35946d(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.reset();
            return new String(instance.digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            m35953k(e);
            return null;
        }
    }

    /* renamed from: e */
    public static synchronized String m35947e(Bundle bundle) {
        String stringBuffer;
        synchronized (a13.class) {
            try {
                m35943a("Extracting Strings from Bundle...");
                boolean z = true;
                StringBuffer stringBuffer2 = new StringBuffer();
                for (String str : bundle.keySet()) {
                    if (z) {
                        z = false;
                    } else {
                        stringBuffer2.append(f25714b);
                    }
                    stringBuffer2.append(str);
                    stringBuffer2.append(f25713a);
                    stringBuffer2.append(bundle.getString(str));
                }
                m35943a("Extracted String is " + stringBuffer2.toString());
                stringBuffer = stringBuffer2.toString();
            } catch (Exception e) {
                m35953k(e);
                return null;
            }
        }
        return stringBuffer;
    }

    /* renamed from: f */
    public static String m35948f(Bundle bundle) {
        JSONObject jSONObject;
        if (bundle != null) {
            try {
                if (bundle.size() > 0) {
                    jSONObject = new JSONObject();
                    for (String str : bundle.keySet()) {
                        jSONObject.put(URLEncoder.encode(str, "UTF-8"), URLEncoder.encode(bundle.getString(str), "UTF-8"));
                    }
                    m35943a("URL encoded JSON string is " + jSONObject);
                    return jSONObject.toString();
                }
            } catch (Exception e) {
                m35953k(e);
                return null;
            }
        }
        jSONObject = null;
        m35943a("URL encoded JSON string is " + jSONObject);
        return jSONObject.toString();
    }

    /* renamed from: g */
    public static synchronized String m35949g(Bundle bundle) {
        String stringBuffer;
        synchronized (a13.class) {
            try {
                m35943a("Extracting Strings from Bundle...");
                boolean z = true;
                StringBuffer stringBuffer2 = new StringBuffer();
                for (String str : bundle.keySet()) {
                    if (z) {
                        z = false;
                    } else {
                        stringBuffer2.append(f25714b);
                    }
                    stringBuffer2.append(URLEncoder.encode(str, "UTF-8"));
                    stringBuffer2.append(f25713a);
                    stringBuffer2.append(URLEncoder.encode(bundle.getString(str), "UTF-8"));
                }
                m35943a("URL encoded String is " + stringBuffer2.toString());
                stringBuffer = stringBuffer2.toString();
            } catch (Exception e) {
                m35953k(e);
                return null;
            }
        }
        return stringBuffer;
    }

    /* renamed from: h */
    public static synchronized boolean m35950h(Context context) {
        synchronized (a13.class) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            boolean isConnected = activeNetworkInfo.isConnected();
            return isConnected;
        }
    }

    /* renamed from: i */
    public static boolean m35951i(Context context) {
        try {
            context.getPackageManager().getPackageInfo(pg4.f33656d, 0);
            C5871k5.m54077e().mo39058h(h60.f29522q, h60.f29519n, h60.f29482A, h60.f29487F);
            return true;
        } catch (Exception unused) {
            C5871k5.m54077e().mo39058h(h60.f29522q, h60.f29519n, h60.f29482A, h60.f29488G);
            m35943a("Paytm app not installed");
            return false;
        }
    }

    /* renamed from: j */
    public static boolean m35952j(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("upi").authority("pay");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(builder.toString()));
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 0)) {
            if (pg4.f33656d.equalsIgnoreCase(resolveInfo.activityInfo.packageName)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static synchronized void m35953k(Exception exc) {
        synchronized (a13.class) {
            exc.printStackTrace();
        }
    }
}
