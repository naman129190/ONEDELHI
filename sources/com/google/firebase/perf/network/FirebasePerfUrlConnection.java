package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.onedelhi.secure.li4;
import com.onedelhi.secure.oo2;
import com.onedelhi.secure.po2;
import com.onedelhi.secure.qe4;
import com.onedelhi.secure.rm4;
import com.onedelhi.secure.rr1;
import com.onedelhi.secure.sr1;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class FirebasePerfUrlConnection {
    /* renamed from: a */
    public static Object m35124a(rm4 rm4, li4 li4, qe4 qe4) throws IOException {
        qe4.mo43512h();
        long e = qe4.mo43511e();
        oo2 c = oo2.m59581c(li4);
        try {
            URLConnection a = rm4.mo43956a();
            return a instanceof HttpsURLConnection ? new sr1((HttpsURLConnection) a, qe4, c).getContent() : a instanceof HttpURLConnection ? new rr1((HttpURLConnection) a, qe4, c).getContent() : a.getContent();
        } catch (IOException e2) {
            c.mo41943v(e);
            c.mo41947z(qe4.mo43508c());
            c.mo41925C(rm4.toString());
            po2.m61530d(c);
            throw e2;
        }
    }

    /* renamed from: b */
    public static Object m35125b(rm4 rm4, Class[] clsArr, li4 li4, qe4 qe4) throws IOException {
        qe4.mo43512h();
        long e = qe4.mo43511e();
        oo2 c = oo2.m59581c(li4);
        try {
            URLConnection a = rm4.mo43956a();
            return a instanceof HttpsURLConnection ? new sr1((HttpsURLConnection) a, qe4, c).getContent(clsArr) : a instanceof HttpURLConnection ? new rr1((HttpURLConnection) a, qe4, c).getContent(clsArr) : a.getContent(clsArr);
        } catch (IOException e2) {
            c.mo41943v(e);
            c.mo41947z(qe4.mo43508c());
            c.mo41925C(rm4.toString());
            po2.m61530d(c);
            throw e2;
        }
    }

    /* renamed from: c */
    public static InputStream m35126c(rm4 rm4, li4 li4, qe4 qe4) throws IOException {
        qe4.mo43512h();
        long e = qe4.mo43511e();
        oo2 c = oo2.m59581c(li4);
        try {
            URLConnection a = rm4.mo43956a();
            return a instanceof HttpsURLConnection ? new sr1((HttpsURLConnection) a, qe4, c).getInputStream() : a instanceof HttpURLConnection ? new rr1((HttpURLConnection) a, qe4, c).getInputStream() : a.getInputStream();
        } catch (IOException e2) {
            c.mo41943v(e);
            c.mo41947z(qe4.mo43508c());
            c.mo41925C(rm4.toString());
            po2.m61530d(c);
            throw e2;
        }
    }

    @Keep
    public static Object getContent(URL url) throws IOException {
        return m35124a(new rm4(url), li4.m55636l(), new qe4());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        return m35125b(new rm4(url), clsArr, li4.m55636l(), new qe4());
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        return obj instanceof HttpsURLConnection ? new sr1((HttpsURLConnection) obj, new qe4(), oo2.m59581c(li4.m55636l())) : obj instanceof HttpURLConnection ? new rr1((HttpURLConnection) obj, new qe4(), oo2.m59581c(li4.m55636l())) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        return m35126c(new rm4(url), li4.m55636l(), new qe4());
    }
}
