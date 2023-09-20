package com.onedelhi.secure;

import android.os.Build;
import com.onedelhi.secure.q51;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

public class tr1 {

    /* renamed from: a */
    public static final C7012v5 f35763a = C7012v5.m67717e();

    /* renamed from: a */
    public static final String f35764a = "User-Agent";

    /* renamed from: a */
    public long f35765a = -1;

    /* renamed from: a */
    public final oo2 f35766a;

    /* renamed from: a */
    public final qe4 f35767a;

    /* renamed from: a */
    public final HttpURLConnection f35768a;

    /* renamed from: b */
    public long f35769b = -1;

    public tr1(HttpURLConnection httpURLConnection, qe4 qe4, oo2 oo2) {
        this.f35768a = httpURLConnection;
        this.f35766a = oo2;
        this.f35767a = qe4;
        oo2.mo41925C(httpURLConnection.getURL().toString());
    }

    /* renamed from: A */
    public boolean mo45230A() {
        return this.f35768a.getInstanceFollowRedirects();
    }

    /* renamed from: B */
    public long mo45231B() {
        mo45257a0();
        return this.f35768a.getLastModified();
    }

    /* renamed from: C */
    public OutputStream mo45232C() throws IOException {
        try {
            OutputStream outputStream = this.f35768a.getOutputStream();
            return outputStream != null ? new qr1(outputStream, this.f35766a, this.f35767a) : outputStream;
        } catch (IOException e) {
            this.f35766a.mo41947z(this.f35767a.mo43508c());
            po2.m61530d(this.f35766a);
            throw e;
        }
    }

    /* renamed from: D */
    public Permission mo45233D() throws IOException {
        try {
            return this.f35768a.getPermission();
        } catch (IOException e) {
            this.f35766a.mo41947z(this.f35767a.mo43508c());
            po2.m61530d(this.f35766a);
            throw e;
        }
    }

    /* renamed from: E */
    public int mo45234E() {
        return this.f35768a.getReadTimeout();
    }

    /* renamed from: F */
    public String mo45235F() {
        return this.f35768a.getRequestMethod();
    }

    /* renamed from: G */
    public Map<String, List<String>> mo45236G() {
        return this.f35768a.getRequestProperties();
    }

    /* renamed from: H */
    public String mo45237H(String str) {
        return this.f35768a.getRequestProperty(str);
    }

    /* renamed from: I */
    public int mo45238I() throws IOException {
        mo45257a0();
        if (this.f35769b == -1) {
            long c = this.f35767a.mo43508c();
            this.f35769b = c;
            this.f35766a.mo41924B(c);
        }
        try {
            int responseCode = this.f35768a.getResponseCode();
            this.f35766a.mo41938q(responseCode);
            return responseCode;
        } catch (IOException e) {
            this.f35766a.mo41947z(this.f35767a.mo43508c());
            po2.m61530d(this.f35766a);
            throw e;
        }
    }

    /* renamed from: J */
    public String mo45239J() throws IOException {
        mo45257a0();
        if (this.f35769b == -1) {
            long c = this.f35767a.mo43508c();
            this.f35769b = c;
            this.f35766a.mo41924B(c);
        }
        try {
            String responseMessage = this.f35768a.getResponseMessage();
            this.f35766a.mo41938q(this.f35768a.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            this.f35766a.mo41947z(this.f35767a.mo43508c());
            po2.m61530d(this.f35766a);
            throw e;
        }
    }

    /* renamed from: K */
    public URL mo45240K() {
        return this.f35768a.getURL();
    }

    /* renamed from: L */
    public boolean mo45241L() {
        return this.f35768a.getUseCaches();
    }

    /* renamed from: M */
    public void mo45242M(boolean z) {
        this.f35768a.setAllowUserInteraction(z);
    }

    /* renamed from: N */
    public void mo45243N(int i) {
        this.f35768a.setChunkedStreamingMode(i);
    }

    /* renamed from: O */
    public void mo45244O(int i) {
        this.f35768a.setConnectTimeout(i);
    }

    /* renamed from: P */
    public void mo45245P(boolean z) {
        this.f35768a.setDefaultUseCaches(z);
    }

    /* renamed from: Q */
    public void mo45246Q(boolean z) {
        this.f35768a.setDoInput(z);
    }

    /* renamed from: R */
    public void mo45247R(boolean z) {
        this.f35768a.setDoOutput(z);
    }

    /* renamed from: S */
    public void mo45248S(int i) {
        this.f35768a.setFixedLengthStreamingMode(i);
    }

    /* renamed from: T */
    public void mo45249T(long j) {
        this.f35768a.setFixedLengthStreamingMode(j);
    }

    /* renamed from: U */
    public void mo45250U(long j) {
        this.f35768a.setIfModifiedSince(j);
    }

    /* renamed from: V */
    public void mo45251V(boolean z) {
        this.f35768a.setInstanceFollowRedirects(z);
    }

    /* renamed from: W */
    public void mo45252W(int i) {
        this.f35768a.setReadTimeout(i);
    }

    /* renamed from: X */
    public void mo45253X(String str) throws ProtocolException {
        this.f35768a.setRequestMethod(str);
    }

    /* renamed from: Y */
    public void mo45254Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f35766a.mo41926D(str2);
        }
        this.f35768a.setRequestProperty(str, str2);
    }

    /* renamed from: Z */
    public void mo45255Z(boolean z) {
        this.f35768a.setUseCaches(z);
    }

    /* renamed from: a */
    public void mo45256a(String str, String str2) {
        this.f35768a.addRequestProperty(str, str2);
    }

    /* renamed from: a0 */
    public final void mo45257a0() {
        String str;
        oo2 oo2;
        if (this.f35765a == -1) {
            this.f35767a.mo43512h();
            long e = this.f35767a.mo43511e();
            this.f35765a = e;
            this.f35766a.mo41943v(e);
        }
        String F = mo45235F();
        if (F != null) {
            this.f35766a.mo41937p(F);
            return;
        }
        if (mo45274o()) {
            oo2 = this.f35766a;
            str = q51.C6513a.f34002v;
        } else {
            oo2 = this.f35766a;
            str = "GET";
        }
        oo2.mo41937p(str);
    }

    /* renamed from: b */
    public void mo45258b() throws IOException {
        if (this.f35765a == -1) {
            this.f35767a.mo43512h();
            long e = this.f35767a.mo43511e();
            this.f35765a = e;
            this.f35766a.mo41943v(e);
        }
        try {
            this.f35768a.connect();
        } catch (IOException e2) {
            this.f35766a.mo41947z(this.f35767a.mo43508c());
            po2.m61530d(this.f35766a);
            throw e2;
        }
    }

    /* renamed from: b0 */
    public boolean mo45259b0() {
        return this.f35768a.usingProxy();
    }

    /* renamed from: c */
    public void mo45260c() {
        this.f35766a.mo41947z(this.f35767a.mo43508c());
        this.f35766a.mo41927b();
        this.f35768a.disconnect();
    }

    /* renamed from: d */
    public boolean mo45261d() {
        return this.f35768a.getAllowUserInteraction();
    }

    /* renamed from: e */
    public int mo45262e() {
        return this.f35768a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f35768a.equals(obj);
    }

    /* renamed from: f */
    public Object mo45264f() throws IOException {
        mo45257a0();
        this.f35766a.mo41938q(this.f35768a.getResponseCode());
        try {
            Object content = this.f35768a.getContent();
            if (content instanceof InputStream) {
                this.f35766a.mo41944w(this.f35768a.getContentType());
                return new pr1((InputStream) content, this.f35766a, this.f35767a);
            }
            this.f35766a.mo41944w(this.f35768a.getContentType());
            this.f35766a.mo41945x((long) this.f35768a.getContentLength());
            this.f35766a.mo41947z(this.f35767a.mo43508c());
            this.f35766a.mo41927b();
            return content;
        } catch (IOException e) {
            this.f35766a.mo41947z(this.f35767a.mo43508c());
            po2.m61530d(this.f35766a);
            throw e;
        }
    }

    /* renamed from: g */
    public Object mo45265g(Class[] clsArr) throws IOException {
        mo45257a0();
        this.f35766a.mo41938q(this.f35768a.getResponseCode());
        try {
            Object content = this.f35768a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f35766a.mo41944w(this.f35768a.getContentType());
                return new pr1((InputStream) content, this.f35766a, this.f35767a);
            }
            this.f35766a.mo41944w(this.f35768a.getContentType());
            this.f35766a.mo41945x((long) this.f35768a.getContentLength());
            this.f35766a.mo41947z(this.f35767a.mo43508c());
            this.f35766a.mo41927b();
            return content;
        } catch (IOException e) {
            this.f35766a.mo41947z(this.f35767a.mo43508c());
            po2.m61530d(this.f35766a);
            throw e;
        }
    }

    /* renamed from: h */
    public String mo45266h() {
        mo45257a0();
        return this.f35768a.getContentEncoding();
    }

    public int hashCode() {
        return this.f35768a.hashCode();
    }

    /* renamed from: i */
    public int mo45268i() {
        mo45257a0();
        return this.f35768a.getContentLength();
    }

    /* renamed from: j */
    public long mo45269j() {
        mo45257a0();
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f35768a.getContentLengthLong();
        }
        return 0;
    }

    /* renamed from: k */
    public String mo45270k() {
        mo45257a0();
        return this.f35768a.getContentType();
    }

    /* renamed from: l */
    public long mo45271l() {
        mo45257a0();
        return this.f35768a.getDate();
    }

    /* renamed from: m */
    public boolean mo45272m() {
        return this.f35768a.getDefaultUseCaches();
    }

    /* renamed from: n */
    public boolean mo45273n() {
        return this.f35768a.getDoInput();
    }

    /* renamed from: o */
    public boolean mo45274o() {
        return this.f35768a.getDoOutput();
    }

    /* renamed from: p */
    public InputStream mo45275p() {
        mo45257a0();
        try {
            this.f35766a.mo41938q(this.f35768a.getResponseCode());
        } catch (IOException unused) {
            f35763a.mo46000a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f35768a.getErrorStream();
        return errorStream != null ? new pr1(errorStream, this.f35766a, this.f35767a) : errorStream;
    }

    /* renamed from: q */
    public long mo45276q() {
        mo45257a0();
        return this.f35768a.getExpiration();
    }

    /* renamed from: r */
    public String mo45277r(int i) {
        mo45257a0();
        return this.f35768a.getHeaderField(i);
    }

    /* renamed from: s */
    public String mo45278s(String str) {
        mo45257a0();
        return this.f35768a.getHeaderField(str);
    }

    /* renamed from: t */
    public long mo45279t(String str, long j) {
        mo45257a0();
        return this.f35768a.getHeaderFieldDate(str, j);
    }

    public String toString() {
        return this.f35768a.toString();
    }

    /* renamed from: u */
    public int mo45281u(String str, int i) {
        mo45257a0();
        return this.f35768a.getHeaderFieldInt(str, i);
    }

    /* renamed from: v */
    public String mo45282v(int i) {
        mo45257a0();
        return this.f35768a.getHeaderFieldKey(i);
    }

    /* renamed from: w */
    public long mo45283w(String str, long j) {
        mo45257a0();
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f35768a.getHeaderFieldLong(str, j);
        }
        return 0;
    }

    /* renamed from: x */
    public Map<String, List<String>> mo45284x() {
        mo45257a0();
        return this.f35768a.getHeaderFields();
    }

    /* renamed from: y */
    public long mo45285y() {
        return this.f35768a.getIfModifiedSince();
    }

    /* renamed from: z */
    public InputStream mo45286z() throws IOException {
        mo45257a0();
        this.f35766a.mo41938q(this.f35768a.getResponseCode());
        this.f35766a.mo41944w(this.f35768a.getContentType());
        try {
            InputStream inputStream = this.f35768a.getInputStream();
            return inputStream != null ? new pr1(inputStream, this.f35766a, this.f35767a) : inputStream;
        } catch (IOException e) {
            this.f35766a.mo41947z(this.f35767a.mo43508c());
            po2.m61530d(this.f35766a);
            throw e;
        }
    }
}
