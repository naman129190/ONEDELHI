package com.onedelhi.secure;

import android.text.TextUtils;
import com.onedelhi.secure.d35;
import java.util.Set;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import jmjou.C7601c;
import jmjou.C7606e;

public class y25 implements HostnameVerifier, C7606e {

    /* renamed from: a */
    public C7601c f37768a;

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        this.f37768a = cVar;
    }

    public boolean isCachingAllowed() {
        return false;
    }

    public boolean verify(String str, SSLSession sSLSession) {
        Boolean bool = (Boolean) this.f37768a.mo48872h("com.phonepe.android.sdk.isUAT");
        String str2 = d35.m44668a(l05.m55205i(bool)).f27214c;
        String str3 = (l05.m55205i(bool) ? d35.C4952a.API_UAT : d35.C4952a.API_PRODUCTION).f27214c;
        if (!TextUtils.isEmpty(str)) {
            if (str.contains(str2) || str.contains(str3)) {
                return HttpsURLConnection.getDefaultHostnameVerifier().verify(str2, sSLSession);
            }
            Set<String> set = d35.f27206a;
            if (!TextUtils.isEmpty((CharSequence) null)) {
                throw null;
            }
        }
        m05.m56771b("CustomHostNameVerifier", "Detected an SSLSession coming from an unknown host. Aborting !!!");
        return false;
    }
}
