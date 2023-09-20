package com.onedelhi.secure;

import java.io.IOException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

public class cn2 extends SSLSocketFactory {

    /* renamed from: a */
    public SSLContext f27005a = SSLContext.getInstance("TLS");

    /* renamed from: com.onedelhi.secure.cn2$a */
    public class C4896a implements X509TrustManager {
        public C4896a() {
        }

        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }

    public cn2(KeyStore keyStore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        super(keyStore);
        C4896a aVar = new C4896a();
        this.f27005a.init((KeyManager[]) null, new TrustManager[]{aVar}, (SecureRandom) null);
    }

    public Socket createSocket() throws IOException {
        return this.f27005a.getSocketFactory().createSocket();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return this.f27005a.getSocketFactory().createSocket(socket, str, i, z);
    }
}
