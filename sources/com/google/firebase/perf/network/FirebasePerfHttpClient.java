package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.onedelhi.secure.li4;
import com.onedelhi.secure.oo2;
import com.onedelhi.secure.po2;
import com.onedelhi.secure.qe4;
import com.onedelhi.secure.ur1;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

public class FirebasePerfHttpClient {
    /* renamed from: a */
    public static <T> T m35115a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, qe4 qe4, li4 li4) throws IOException {
        oo2 c = oo2.m59581c(li4);
        try {
            c.mo41925C(httpHost.toURI() + httpRequest.getRequestLine().getUri()).mo41937p(httpRequest.getRequestLine().getMethod());
            Long a = po2.m61527a(httpRequest);
            if (a != null) {
                c.mo41942u(a.longValue());
            }
            qe4.mo43512h();
            c.mo41943v(qe4.mo43511e());
            return httpClient.execute(httpHost, httpRequest, new ur1(responseHandler, qe4, c));
        } catch (IOException e) {
            c.mo41947z(qe4.mo43508c());
            po2.m61530d(c);
            throw e;
        }
    }

    /* renamed from: b */
    public static <T> T m35116b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, qe4 qe4, li4 li4) throws IOException {
        oo2 c = oo2.m59581c(li4);
        try {
            c.mo41925C(httpHost.toURI() + httpRequest.getRequestLine().getUri()).mo41937p(httpRequest.getRequestLine().getMethod());
            Long a = po2.m61527a(httpRequest);
            if (a != null) {
                c.mo41942u(a.longValue());
            }
            qe4.mo43512h();
            c.mo41943v(qe4.mo43511e());
            return httpClient.execute(httpHost, httpRequest, new ur1(responseHandler, qe4, c), httpContext);
        } catch (IOException e) {
            c.mo41947z(qe4.mo43508c());
            po2.m61530d(c);
            throw e;
        }
    }

    /* renamed from: c */
    public static <T> T m35117c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, qe4 qe4, li4 li4) throws IOException {
        oo2 c = oo2.m59581c(li4);
        try {
            c.mo41925C(httpUriRequest.getURI().toString()).mo41937p(httpUriRequest.getMethod());
            Long a = po2.m61527a(httpUriRequest);
            if (a != null) {
                c.mo41942u(a.longValue());
            }
            qe4.mo43512h();
            c.mo41943v(qe4.mo43511e());
            return httpClient.execute(httpUriRequest, new ur1(responseHandler, qe4, c));
        } catch (IOException e) {
            c.mo41947z(qe4.mo43508c());
            po2.m61530d(c);
            throw e;
        }
    }

    /* renamed from: d */
    public static <T> T m35118d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, qe4 qe4, li4 li4) throws IOException {
        oo2 c = oo2.m59581c(li4);
        try {
            c.mo41925C(httpUriRequest.getURI().toString()).mo41937p(httpUriRequest.getMethod());
            Long a = po2.m61527a(httpUriRequest);
            if (a != null) {
                c.mo41942u(a.longValue());
            }
            qe4.mo43512h();
            c.mo41943v(qe4.mo43511e());
            return httpClient.execute(httpUriRequest, new ur1(responseHandler, qe4, c), httpContext);
        } catch (IOException e) {
            c.mo41947z(qe4.mo43508c());
            po2.m61530d(c);
            throw e;
        }
    }

    /* renamed from: e */
    public static HttpResponse m35119e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, qe4 qe4, li4 li4) throws IOException {
        oo2 c = oo2.m59581c(li4);
        try {
            c.mo41925C(httpHost.toURI() + httpRequest.getRequestLine().getUri()).mo41937p(httpRequest.getRequestLine().getMethod());
            Long a = po2.m61527a(httpRequest);
            if (a != null) {
                c.mo41942u(a.longValue());
            }
            qe4.mo43512h();
            c.mo41943v(qe4.mo43511e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            c.mo41947z(qe4.mo43508c());
            c.mo41938q(execute.getStatusLine().getStatusCode());
            Long a2 = po2.m61527a(execute);
            if (a2 != null) {
                c.mo41945x(a2.longValue());
            }
            String b = po2.m61528b(execute);
            if (b != null) {
                c.mo41944w(b);
            }
            c.mo41927b();
            return execute;
        } catch (IOException e) {
            c.mo41947z(qe4.mo43508c());
            po2.m61530d(c);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return m35115a(httpClient, httpHost, httpRequest, responseHandler, new qe4(), li4.m55636l());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return m35116b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new qe4(), li4.m55636l());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        return m35117c(httpClient, httpUriRequest, responseHandler, new qe4(), li4.m55636l());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        return m35118d(httpClient, httpUriRequest, responseHandler, httpContext, new qe4(), li4.m55636l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return m35119e(httpClient, httpHost, httpRequest, new qe4(), li4.m55636l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return m35120f(httpClient, httpHost, httpRequest, httpContext, new qe4(), li4.m55636l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return m35121g(httpClient, httpUriRequest, new qe4(), li4.m55636l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return m35122h(httpClient, httpUriRequest, httpContext, new qe4(), li4.m55636l());
    }

    /* renamed from: f */
    public static HttpResponse m35120f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, qe4 qe4, li4 li4) throws IOException {
        oo2 c = oo2.m59581c(li4);
        try {
            c.mo41925C(httpHost.toURI() + httpRequest.getRequestLine().getUri()).mo41937p(httpRequest.getRequestLine().getMethod());
            Long a = po2.m61527a(httpRequest);
            if (a != null) {
                c.mo41942u(a.longValue());
            }
            qe4.mo43512h();
            c.mo41943v(qe4.mo43511e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            c.mo41947z(qe4.mo43508c());
            c.mo41938q(execute.getStatusLine().getStatusCode());
            Long a2 = po2.m61527a(execute);
            if (a2 != null) {
                c.mo41945x(a2.longValue());
            }
            String b = po2.m61528b(execute);
            if (b != null) {
                c.mo41944w(b);
            }
            c.mo41927b();
            return execute;
        } catch (IOException e) {
            c.mo41947z(qe4.mo43508c());
            po2.m61530d(c);
            throw e;
        }
    }

    /* renamed from: g */
    public static HttpResponse m35121g(HttpClient httpClient, HttpUriRequest httpUriRequest, qe4 qe4, li4 li4) throws IOException {
        oo2 c = oo2.m59581c(li4);
        try {
            c.mo41925C(httpUriRequest.getURI().toString()).mo41937p(httpUriRequest.getMethod());
            Long a = po2.m61527a(httpUriRequest);
            if (a != null) {
                c.mo41942u(a.longValue());
            }
            qe4.mo43512h();
            c.mo41943v(qe4.mo43511e());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            c.mo41947z(qe4.mo43508c());
            c.mo41938q(execute.getStatusLine().getStatusCode());
            Long a2 = po2.m61527a(execute);
            if (a2 != null) {
                c.mo41945x(a2.longValue());
            }
            String b = po2.m61528b(execute);
            if (b != null) {
                c.mo41944w(b);
            }
            c.mo41927b();
            return execute;
        } catch (IOException e) {
            c.mo41947z(qe4.mo43508c());
            po2.m61530d(c);
            throw e;
        }
    }

    /* renamed from: h */
    public static HttpResponse m35122h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, qe4 qe4, li4 li4) throws IOException {
        oo2 c = oo2.m59581c(li4);
        try {
            c.mo41925C(httpUriRequest.getURI().toString()).mo41937p(httpUriRequest.getMethod());
            Long a = po2.m61527a(httpUriRequest);
            if (a != null) {
                c.mo41942u(a.longValue());
            }
            qe4.mo43512h();
            c.mo41943v(qe4.mo43511e());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            c.mo41947z(qe4.mo43508c());
            c.mo41938q(execute.getStatusLine().getStatusCode());
            Long a2 = po2.m61527a(execute);
            if (a2 != null) {
                c.mo41945x(a2.longValue());
            }
            String b = po2.m61528b(execute);
            if (b != null) {
                c.mo41944w(b);
            }
            c.mo41927b();
            return execute;
        } catch (IOException e) {
            c.mo41947z(qe4.mo43508c());
            po2.m61530d(c);
            throw e;
        }
    }
}
