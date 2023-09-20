package com.onedelhi.secure;

import android.util.Base64;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.messaging.C4311b;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.onedelhi.secure.oz4;
import com.onedelhi.secure.q51;
import com.onedelhi.secure.uz4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import jmjou.C7601c;
import jmjou.C7606e;
import org.json.JSONObject;

public class l15 implements C7606e {

    /* renamed from: a */
    public HttpURLConnection f31514a;

    /* renamed from: a */
    public HttpsURLConnection f31515a;

    /* renamed from: a */
    public C7601c f31516a;

    /* renamed from: b */
    public String f31517b;

    /* renamed from: b */
    public boolean f31518b;

    /* renamed from: a */
    public final boolean mo39618a() throws SSLPeerUnverifiedException, NoSuchAlgorithmException {
        boolean z = this.f31518b;
        if (!z) {
            return true;
        }
        Certificate[] serverCertificates = z ? this.f31515a.getServerCertificates() : new Certificate[0];
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        for (Certificate certificate : serverCertificates) {
            byte[] encoded = ((X509Certificate) certificate).getPublicKey().getEncoded();
            instance.update(encoded, 0, encoded.length);
            if (((HashSet) d35.f27206a).contains(Base64.encodeToString(instance.digest(), 2))) {
                return true;
            }
        }
        throw new SSLPeerUnverifiedException("Unidentified server.");
    }

    /* renamed from: b */
    public uz4.C6991a mo39619b() {
        String str;
        uz4.C6991a aVar = (uz4.C6991a) this.f31516a.mo48873i(uz4.C6991a.class);
        if (mo39621d() == null) {
            aVar.f36361b = false;
            aVar.f36360b = String.format("http(s)  url connection is null, please check logs from same {%s}", new Object[]{"APIManager"});
            aVar.f36362n = -1;
            return aVar;
        }
        try {
            mo39621d().connect();
            mo39618a();
            if (this.f31517b != null) {
                OutputStream outputStream = mo39621d().getOutputStream();
                outputStream.write(this.f31517b.getBytes());
                outputStream.flush();
                outputStream.close();
            }
            int responseCode = mo39621d().getResponseCode();
            URL url = mo39621d().getURL();
            String str2 = "";
            if (url != null) {
                str2 = url.toString();
            }
            if (200 > responseCode || responseCode >= 300) {
                str = mo39620c(mo39621d().getErrorStream());
                aVar.mo45881a(responseCode, str, false);
                if (!mo39621d().getURL().getPath().contains("/apis/v2/sdk/event")) {
                    zz4 zz4 = (zz4) this.f31516a.mo48873i(zz4.class);
                    u25 b = zz4.mo48478b("SDK_NETWORK_ERROR");
                    h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "errorMessage", aVar.f36360b);
                    zz4.mo48477a(b);
                }
            } else {
                str = mo39620c(mo39621d().getInputStream());
                aVar.mo45881a(responseCode, str, true);
            }
            m05.m56772c("APIManager", "Url: " + str2 + "\nStatus Code: " + responseCode + "\nResponse: " + str);
        } catch (Exception e) {
            m05.m56773d("APIManager", e.getMessage(), e);
            aVar.mo45881a(-1, e.getMessage(), false);
        }
        return aVar;
    }

    /* renamed from: c */
    public final String mo39620c(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    /* renamed from: d */
    public final HttpURLConnection mo39621d() {
        return this.f31518b ? this.f31515a : this.f31514a;
    }

    /* renamed from: e */
    public final void mo39622e(HttpURLConnection httpURLConnection, boolean z) throws ProtocolException {
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setConnectTimeout(15000);
        if (z) {
            httpURLConnection.setRequestMethod(q51.C6513a.f34002v);
            httpURLConnection.setDoOutput(true);
            return;
        }
        httpURLConnection.setRequestMethod("GET");
    }

    /* renamed from: f */
    public final void mo39623f(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        URL url = mo39621d().getURL();
        if (url != null) {
            sb.append(url.toString() + "\n");
        }
        for (Map.Entry next : map.entrySet()) {
            mo39621d().setRequestProperty((String) next.getKey(), (String) next.getValue());
            sb.append("Header :" + ((String) next.getKey()) + ar4.f25981a + ((String) next.getValue()));
            sb.append(10);
        }
        if (this.f31517b != null) {
            sb.append("Body: " + this.f31517b);
        }
        m05.m56772c("APIManager", sb.toString());
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        String str;
        this.f31516a = cVar;
        try {
            Object obj = null;
            URL url = new URL((String) (aVar.containsKey(ImagesContract.URL) ? aVar.get(ImagesContract.URL) : null));
            Object obj2 = Boolean.FALSE;
            boolean booleanValue = ((Boolean) (aVar.containsKey("isPost") ? aVar.get("isPost") : obj2)).booleanValue();
            boolean startsWith = url.toString().startsWith("https://");
            this.f31518b = startsWith;
            if (startsWith) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                this.f31515a = httpsURLConnection;
                mo39622e(httpsURLConnection, booleanValue);
                this.f31515a.setSSLSocketFactory(new h05());
                this.f31515a.setHostnameVerifier((HostnameVerifier) this.f31516a.mo48873i(y25.class));
            } else {
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                this.f31514a = httpURLConnection;
                mo39622e(httpURLConnection, booleanValue);
            }
            this.f31516a.getClass();
            Object hashMap = new HashMap();
            mo39621d().setUseCaches(((Boolean) (aVar.containsKey("useCache") ? aVar.get("useCache") : obj2)).booleanValue());
            HttpURLConnection d = mo39621d();
            if (aVar.containsKey("defaultCache")) {
                obj2 = aVar.get("defaultCache");
            }
            d.setDefaultUseCaches(((Boolean) obj2).booleanValue());
            if (aVar.containsKey("body")) {
                obj = aVar.get("body");
            }
            this.f31517b = (String) obj;
            if (aVar.containsKey("headers")) {
                hashMap = aVar.get("headers");
            }
            mo39623f((Map) hashMap);
        } catch (NoSuchAlgorithmException e) {
            str = String.format("NoSuchAlgorithmException caught with message = {%s}", new Object[]{e.getMessage()});
            this.f31516a.mo48865a().mo42319a("APIManager", str, oz4.C6352a.LOW);
        } catch (KeyManagementException e2) {
            str = String.format("KeyManagementException caught with message = {%s}", new Object[]{e2.getMessage()});
            this.f31516a.mo48865a().mo42319a("APIManager", str, oz4.C6352a.LOW);
        } catch (ProtocolException e3) {
            str = String.format("ProtocolException caught with message = {%s}", new Object[]{e3.getMessage()});
            this.f31516a.mo48865a().mo42319a("APIManager", str, oz4.C6352a.LOW);
        } catch (IOException e4) {
            str = String.format("IOException caught with message = {%s}", new Object[]{e4.getMessage()});
            this.f31516a.mo48865a().mo42319a("APIManager", str, oz4.C6352a.LOW);
        }
    }

    public boolean isCachingAllowed() {
        return false;
    }
}
