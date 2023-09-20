package com.onedelhi.secure;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.onedelhi.secure.q51;
import com.phonepe.intent.sdk.api.PhonePe;
import com.phonepe.intent.sdk.api.PhonePeInitException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import jmjou.C7601c;

public class b15 extends WebViewClient {

    /* renamed from: a */
    public static List<String> f26100a;

    /* renamed from: a */
    public static boolean f26101a;

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (!f26101a) {
            m05.m56770a("WEB_VIEW_CLIENT", "Precache has been disabled either by merchant or config");
        } else {
            try {
                C7601c objectFactory = PhonePe.getObjectFactory();
                if (webView == null || webResourceRequest == null || webResourceRequest.getUrl() == null || webResourceRequest.getMethod().matches(q51.C6513a.f34002v) || !l05.m55197a(objectFactory)) {
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
                Uri url = webResourceRequest.getUrl();
                String path = url.getPath();
                boolean z = false;
                for (int i = 0; i < f26100a.size(); i++) {
                    if (path.endsWith(f26100a.get(i))) {
                        z = true;
                    }
                }
                if (!z) {
                    m05.m56772c("WEB_VIEW_CLIENT", String.format("request check 2 = {url:%s, method:%s} is not a valid candidate for interception", new Object[]{url, webResourceRequest.getMethod()}));
                } else {
                    try {
                        URL url2 = new URL(url.toString());
                        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url2.openConnection()));
                        httpsURLConnection.setSSLSocketFactory(new h05());
                        httpsURLConnection.setRequestMethod(webResourceRequest.getMethod());
                        httpsURLConnection.setUseCaches(true);
                        httpsURLConnection.connect();
                        int responseCode = httpsURLConnection.getResponseCode();
                        if (responseCode >= 200 && responseCode < 400) {
                            String contentType = httpsURLConnection.getContentType();
                            if (contentType != null) {
                                int indexOf = contentType.indexOf("; charset=");
                                String substring = indexOf >= 0 ? contentType.substring(0, indexOf) : contentType;
                                String substring2 = indexOf >= 0 ? contentType.substring(indexOf + 10) : "UTF-8";
                                m05.m56772c("WEB_VIEW_CLIENT", url2.toString());
                                return new WebResourceResponse(substring, substring2, httpsURLConnection.getInputStream());
                            }
                            m05.m56771b("WEB_VIEW_CLIENT", String.format("failed to intercept request because of either content_type is null or invalid. content_type = {%s}", new Object[]{contentType}));
                        }
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    } catch (Exception e) {
                        m05.m56771b("WEB_VIEW_CLIENT", String.format("failed to intercept the request, because of throwable = {%s}", new Object[]{e.getMessage()}));
                    }
                }
            } catch (PhonePeInitException e2) {
                m05.m56773d("WEB_VIEW_CLIENT", e2.getMessage(), e2);
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
