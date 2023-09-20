package com.onedelhi.secure;

import android.annotation.SuppressLint;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

@SuppressLint({"CustomX509TrustManager"})
public class cn1 implements X509TrustManager {

    /* renamed from: a */
    public static boolean f10412a;

    /* renamed from: a */
    public static final X509Certificate[] f10413a = new X509Certificate[0];

    /* renamed from: a */
    public static TrustManager[] f10414a;

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
