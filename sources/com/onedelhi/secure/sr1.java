package com.onedelhi.secure;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

public final class sr1 extends HttpsURLConnection {

    /* renamed from: a */
    public final tr1 f35165a;

    /* renamed from: a */
    public final HttpsURLConnection f35166a;

    public sr1(HttpsURLConnection httpsURLConnection, qe4 qe4, oo2 oo2) {
        super(httpsURLConnection.getURL());
        this.f35166a = httpsURLConnection;
        this.f35165a = new tr1(httpsURLConnection, qe4, oo2);
    }

    public void addRequestProperty(String str, String str2) {
        this.f35165a.mo45256a(str, str2);
    }

    public void connect() throws IOException {
        this.f35165a.mo45258b();
    }

    public void disconnect() {
        this.f35165a.mo45260c();
    }

    public boolean equals(Object obj) {
        return this.f35165a.equals(obj);
    }

    public boolean getAllowUserInteraction() {
        return this.f35165a.mo45261d();
    }

    public String getCipherSuite() {
        return this.f35166a.getCipherSuite();
    }

    public int getConnectTimeout() {
        return this.f35165a.mo45262e();
    }

    public Object getContent() throws IOException {
        return this.f35165a.mo45264f();
    }

    public Object getContent(Class[] clsArr) throws IOException {
        return this.f35165a.mo45265g(clsArr);
    }

    public String getContentEncoding() {
        return this.f35165a.mo45266h();
    }

    public int getContentLength() {
        return this.f35165a.mo45268i();
    }

    public long getContentLengthLong() {
        return this.f35165a.mo45269j();
    }

    public String getContentType() {
        return this.f35165a.mo45270k();
    }

    public long getDate() {
        return this.f35165a.mo45271l();
    }

    public boolean getDefaultUseCaches() {
        return this.f35165a.mo45272m();
    }

    public boolean getDoInput() {
        return this.f35165a.mo45273n();
    }

    public boolean getDoOutput() {
        return this.f35165a.mo45274o();
    }

    public InputStream getErrorStream() {
        return this.f35165a.mo45275p();
    }

    public long getExpiration() {
        return this.f35165a.mo45276q();
    }

    public String getHeaderField(int i) {
        return this.f35165a.mo45277r(i);
    }

    public String getHeaderField(String str) {
        return this.f35165a.mo45278s(str);
    }

    public long getHeaderFieldDate(String str, long j) {
        return this.f35165a.mo45279t(str, j);
    }

    public int getHeaderFieldInt(String str, int i) {
        return this.f35165a.mo45281u(str, i);
    }

    public String getHeaderFieldKey(int i) {
        return this.f35165a.mo45282v(i);
    }

    public long getHeaderFieldLong(String str, long j) {
        return this.f35165a.mo45283w(str, j);
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.f35165a.mo45284x();
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f35166a.getHostnameVerifier();
    }

    public long getIfModifiedSince() {
        return this.f35165a.mo45285y();
    }

    public InputStream getInputStream() throws IOException {
        return this.f35165a.mo45286z();
    }

    public boolean getInstanceFollowRedirects() {
        return this.f35165a.mo45230A();
    }

    public long getLastModified() {
        return this.f35165a.mo45231B();
    }

    public Certificate[] getLocalCertificates() {
        return this.f35166a.getLocalCertificates();
    }

    public Principal getLocalPrincipal() {
        return this.f35166a.getLocalPrincipal();
    }

    public OutputStream getOutputStream() throws IOException {
        return this.f35165a.mo45232C();
    }

    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.f35166a.getPeerPrincipal();
    }

    public Permission getPermission() throws IOException {
        return this.f35165a.mo45233D();
    }

    public int getReadTimeout() {
        return this.f35165a.mo45234E();
    }

    public String getRequestMethod() {
        return this.f35165a.mo45235F();
    }

    public Map<String, List<String>> getRequestProperties() {
        return this.f35165a.mo45236G();
    }

    public String getRequestProperty(String str) {
        return this.f35165a.mo45237H(str);
    }

    public int getResponseCode() throws IOException {
        return this.f35165a.mo45238I();
    }

    public String getResponseMessage() throws IOException {
        return this.f35165a.mo45239J();
    }

    public SSLSocketFactory getSSLSocketFactory() {
        return this.f35166a.getSSLSocketFactory();
    }

    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return this.f35166a.getServerCertificates();
    }

    public URL getURL() {
        return this.f35165a.mo45240K();
    }

    public boolean getUseCaches() {
        return this.f35165a.mo45241L();
    }

    public int hashCode() {
        return this.f35165a.hashCode();
    }

    public void setAllowUserInteraction(boolean z) {
        this.f35165a.mo45242M(z);
    }

    public void setChunkedStreamingMode(int i) {
        this.f35165a.mo45243N(i);
    }

    public void setConnectTimeout(int i) {
        this.f35165a.mo45244O(i);
    }

    public void setDefaultUseCaches(boolean z) {
        this.f35165a.mo45245P(z);
    }

    public void setDoInput(boolean z) {
        this.f35165a.mo45246Q(z);
    }

    public void setDoOutput(boolean z) {
        this.f35165a.mo45247R(z);
    }

    public void setFixedLengthStreamingMode(int i) {
        this.f35165a.mo45248S(i);
    }

    public void setFixedLengthStreamingMode(long j) {
        this.f35165a.mo45249T(j);
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f35166a.setHostnameVerifier(hostnameVerifier);
    }

    public void setIfModifiedSince(long j) {
        this.f35165a.mo45250U(j);
    }

    public void setInstanceFollowRedirects(boolean z) {
        this.f35165a.mo45251V(z);
    }

    public void setReadTimeout(int i) {
        this.f35165a.mo45252W(i);
    }

    public void setRequestMethod(String str) throws ProtocolException {
        this.f35165a.mo45253X(str);
    }

    public void setRequestProperty(String str, String str2) {
        this.f35165a.mo45254Y(str, str2);
    }

    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f35166a.setSSLSocketFactory(sSLSocketFactory);
    }

    public void setUseCaches(boolean z) {
        this.f35165a.mo45255Z(z);
    }

    public String toString() {
        return this.f35165a.toString();
    }

    public boolean usingProxy() {
        return this.f35165a.mo45259b0();
    }
}
