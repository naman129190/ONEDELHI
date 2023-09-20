package com.onedelhi.secure;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public class h05 extends SSLSocketFactory {

    /* renamed from: a */
    public SSLSocketFactory f29378a;

    public h05() throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
        this.f29378a = instance.getSocketFactory();
    }

    /* renamed from: a */
    public final Socket mo37101a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socket;
    }

    public Socket createSocket() throws IOException {
        return mo37101a(this.f29378a.createSocket());
    }

    public Socket createSocket(String str, int i) throws IOException {
        return mo37101a(this.f29378a.createSocket(str, i));
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return mo37101a(this.f29378a.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return mo37101a(this.f29378a.createSocket(inetAddress, i));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return mo37101a(this.f29378a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return mo37101a(this.f29378a.createSocket(socket, str, i, z));
    }

    public String[] getDefaultCipherSuites() {
        return this.f29378a.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.f29378a.getSupportedCipherSuites();
    }
}
