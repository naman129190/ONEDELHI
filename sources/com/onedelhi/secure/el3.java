package com.onedelhi.secure;

import com.onedelhi.secure.fu2;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class el3<T> {
    @Nullable

    /* renamed from: a */
    public final T f27992a;

    /* renamed from: a */
    public final Response f27993a;
    @Nullable

    /* renamed from: a */
    public final ResponseBody f27994a;

    public el3(Response response, @Nullable T t, @Nullable ResponseBody responseBody) {
        this.f27993a = response;
        this.f27992a = t;
        this.f27994a = responseBody;
    }

    /* renamed from: c */
    public static <T> el3<T> m47002c(int i, ResponseBody responseBody) {
        Objects.requireNonNull(responseBody, "body == null");
        if (i >= 400) {
            return m47003d(responseBody, new Response.Builder().body(new fu2.C5311c(responseBody.contentType(), responseBody.contentLength())).code(i).message("Response.error()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException("code < 400: " + i);
    }

    /* renamed from: d */
    public static <T> el3<T> m47003d(ResponseBody responseBody, Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (!response.isSuccessful()) {
            return new el3<>(response, (Object) null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: j */
    public static <T> el3<T> m47004j(int i, @Nullable T t) {
        if (i >= 200 && i < 300) {
            return m47007m(t, new Response.Builder().code(i).message("Response.success()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i);
    }

    /* renamed from: k */
    public static <T> el3<T> m47005k(@Nullable T t) {
        return m47007m(t, new Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    /* renamed from: l */
    public static <T> el3<T> m47006l(@Nullable T t, Headers headers) {
        Objects.requireNonNull(headers, "headers == null");
        return m47007m(t, new Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).headers(headers).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    /* renamed from: m */
    public static <T> el3<T> m47007m(@Nullable T t, Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new el3<>(response, t, (ResponseBody) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    /* renamed from: a */
    public T mo35468a() {
        return this.f27992a;
    }

    /* renamed from: b */
    public int mo35469b() {
        return this.f27993a.code();
    }

    @Nullable
    /* renamed from: e */
    public ResponseBody mo35470e() {
        return this.f27994a;
    }

    /* renamed from: f */
    public Headers mo35471f() {
        return this.f27993a.headers();
    }

    /* renamed from: g */
    public boolean mo35472g() {
        return this.f27993a.isSuccessful();
    }

    /* renamed from: h */
    public String mo35473h() {
        return this.f27993a.message();
    }

    /* renamed from: i */
    public Response mo35474i() {
        return this.f27993a;
    }

    public String toString() {
        return this.f27993a.toString();
    }
}
