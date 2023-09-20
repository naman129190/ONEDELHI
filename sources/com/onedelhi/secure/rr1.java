package com.onedelhi.secure;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

public final class rr1 extends HttpURLConnection {

    /* renamed from: a */
    public final tr1 f34712a;

    public rr1(HttpURLConnection httpURLConnection, qe4 qe4, oo2 oo2) {
        super(httpURLConnection.getURL());
        this.f34712a = new tr1(httpURLConnection, qe4, oo2);
    }

    public void addRequestProperty(String str, String str2) {
        this.f34712a.mo45256a(str, str2);
    }

    public void connect() throws IOException {
        this.f34712a.mo45258b();
    }

    public void disconnect() {
        this.f34712a.mo45260c();
    }

    public boolean equals(Object obj) {
        return this.f34712a.equals(obj);
    }

    public boolean getAllowUserInteraction() {
        return this.f34712a.mo45261d();
    }

    public int getConnectTimeout() {
        return this.f34712a.mo45262e();
    }

    public Object getContent() throws IOException {
        return this.f34712a.mo45264f();
    }

    public Object getContent(Class[] clsArr) throws IOException {
        return this.f34712a.mo45265g(clsArr);
    }

    public String getContentEncoding() {
        return this.f34712a.mo45266h();
    }

    public int getContentLength() {
        return this.f34712a.mo45268i();
    }

    public long getContentLengthLong() {
        return this.f34712a.mo45269j();
    }

    public String getContentType() {
        return this.f34712a.mo45270k();
    }

    public long getDate() {
        return this.f34712a.mo45271l();
    }

    public boolean getDefaultUseCaches() {
        return this.f34712a.mo45272m();
    }

    public boolean getDoInput() {
        return this.f34712a.mo45273n();
    }

    public boolean getDoOutput() {
        return this.f34712a.mo45274o();
    }

    public InputStream getErrorStream() {
        return this.f34712a.mo45275p();
    }

    public long getExpiration() {
        return this.f34712a.mo45276q();
    }

    public String getHeaderField(int i) {
        return this.f34712a.mo45277r(i);
    }

    public String getHeaderField(String str) {
        return this.f34712a.mo45278s(str);
    }

    public long getHeaderFieldDate(String str, long j) {
        return this.f34712a.mo45279t(str, j);
    }

    public int getHeaderFieldInt(String str, int i) {
        return this.f34712a.mo45281u(str, i);
    }

    public String getHeaderFieldKey(int i) {
        return this.f34712a.mo45282v(i);
    }

    public long getHeaderFieldLong(String str, long j) {
        return this.f34712a.mo45283w(str, j);
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.f34712a.mo45284x();
    }

    public long getIfModifiedSince() {
        return this.f34712a.mo45285y();
    }

    public InputStream getInputStream() throws IOException {
        return this.f34712a.mo45286z();
    }

    public boolean getInstanceFollowRedirects() {
        return this.f34712a.mo45230A();
    }

    public long getLastModified() {
        return this.f34712a.mo45231B();
    }

    public OutputStream getOutputStream() throws IOException {
        return this.f34712a.mo45232C();
    }

    public Permission getPermission() throws IOException {
        return this.f34712a.mo45233D();
    }

    public int getReadTimeout() {
        return this.f34712a.mo45234E();
    }

    public String getRequestMethod() {
        return this.f34712a.mo45235F();
    }

    public Map<String, List<String>> getRequestProperties() {
        return this.f34712a.mo45236G();
    }

    public String getRequestProperty(String str) {
        return this.f34712a.mo45237H(str);
    }

    public int getResponseCode() throws IOException {
        return this.f34712a.mo45238I();
    }

    public String getResponseMessage() throws IOException {
        return this.f34712a.mo45239J();
    }

    public URL getURL() {
        return this.f34712a.mo45240K();
    }

    public boolean getUseCaches() {
        return this.f34712a.mo45241L();
    }

    public int hashCode() {
        return this.f34712a.hashCode();
    }

    public void setAllowUserInteraction(boolean z) {
        this.f34712a.mo45242M(z);
    }

    public void setChunkedStreamingMode(int i) {
        this.f34712a.mo45243N(i);
    }

    public void setConnectTimeout(int i) {
        this.f34712a.mo45244O(i);
    }

    public void setDefaultUseCaches(boolean z) {
        this.f34712a.mo45245P(z);
    }

    public void setDoInput(boolean z) {
        this.f34712a.mo45246Q(z);
    }

    public void setDoOutput(boolean z) {
        this.f34712a.mo45247R(z);
    }

    public void setFixedLengthStreamingMode(int i) {
        this.f34712a.mo45248S(i);
    }

    public void setFixedLengthStreamingMode(long j) {
        this.f34712a.mo45249T(j);
    }

    public void setIfModifiedSince(long j) {
        this.f34712a.mo45250U(j);
    }

    public void setInstanceFollowRedirects(boolean z) {
        this.f34712a.mo45251V(z);
    }

    public void setReadTimeout(int i) {
        this.f34712a.mo45252W(i);
    }

    public void setRequestMethod(String str) throws ProtocolException {
        this.f34712a.mo45253X(str);
    }

    public void setRequestProperty(String str, String str2) {
        this.f34712a.mo45254Y(str, str2);
    }

    public void setUseCaches(boolean z) {
        this.f34712a.mo45255Z(z);
    }

    public String toString() {
        return this.f34712a.toString();
    }

    public boolean usingProxy() {
        return this.f34712a.mo45259b0();
    }
}
