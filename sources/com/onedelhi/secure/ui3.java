package com.onedelhi.secure;

import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

public final class ui3 {

    /* renamed from: a */
    public static final Pattern f36139a = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public static final char[] f36140a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: c */
    public static final String f36141c = " \"<>^`{}|\\?#";

    /* renamed from: a */
    public final String f36142a;
    @Nullable

    /* renamed from: a */
    public FormBody.Builder f36143a;

    /* renamed from: a */
    public final Headers.Builder f36144a;
    @Nullable

    /* renamed from: a */
    public HttpUrl.Builder f36145a;

    /* renamed from: a */
    public final HttpUrl f36146a;
    @Nullable

    /* renamed from: a */
    public MediaType f36147a;
    @Nullable

    /* renamed from: a */
    public MultipartBody.Builder f36148a;

    /* renamed from: a */
    public final Request.Builder f36149a = new Request.Builder();
    @Nullable

    /* renamed from: a */
    public RequestBody f36150a;

    /* renamed from: a */
    public final boolean f36151a;
    @Nullable

    /* renamed from: b */
    public String f36152b;

    /* renamed from: com.onedelhi.secure.ui3$a */
    public static class C6968a extends RequestBody {

        /* renamed from: a */
        public final MediaType f36153a;

        /* renamed from: a */
        public final RequestBody f36154a;

        public C6968a(RequestBody requestBody, MediaType mediaType) {
            this.f36154a = requestBody;
            this.f36153a = mediaType;
        }

        public long contentLength() throws IOException {
            return this.f36154a.contentLength();
        }

        public MediaType contentType() {
            return this.f36153a;
        }

        public void writeTo(C6785so soVar) throws IOException {
            this.f36154a.writeTo(soVar);
        }
    }

    public ui3(String str, HttpUrl httpUrl, @Nullable String str2, @Nullable Headers headers, @Nullable MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.f36142a = str;
        this.f36146a = httpUrl;
        this.f36152b = str2;
        this.f36147a = mediaType;
        this.f36151a = z;
        this.f36144a = headers != null ? headers.newBuilder() : new Headers.Builder();
        if (z2) {
            this.f36143a = new FormBody.Builder();
        } else if (z3) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f36148a = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    /* renamed from: i */
    public static String m67074i(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || f36141c.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                C6205no noVar = new C6205no();
                noVar.mo41246W0(str, 0, i);
                m67075j(noVar, str, i, length, z);
                return noVar.mo31688j();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: j */
    public static void m67075j(C6205no noVar, String str, int i, int i2, boolean z) {
        C6205no noVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || f36141c.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (noVar2 == null) {
                        noVar2 = new C6205no();
                    }
                    noVar2.mo41274k2(codePointAt);
                    while (!noVar2.mo31685f2()) {
                        byte readByte = noVar2.readByte() & 255;
                        noVar.mo41230L0(37);
                        char[] cArr = f36140a;
                        noVar.mo41230L0(cArr[(readByte >> 4) & 15]);
                        noVar.mo41230L0(cArr[readByte & 15]);
                    }
                } else {
                    noVar.mo41274k2(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    public void mo45608a(String str, String str2, boolean z) {
        if (z) {
            this.f36143a.addEncoded(str, str2);
        } else {
            this.f36143a.add(str, str2);
        }
    }

    /* renamed from: b */
    public void mo45609b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f36147a = MediaType.get(str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e);
            }
        } else {
            this.f36144a.add(str, str2);
        }
    }

    /* renamed from: c */
    public void mo45610c(Headers headers) {
        this.f36144a.addAll(headers);
    }

    /* renamed from: d */
    public void mo45611d(Headers headers, RequestBody requestBody) {
        this.f36148a.addPart(headers, requestBody);
    }

    /* renamed from: e */
    public void mo45612e(MultipartBody.Part part) {
        this.f36148a.addPart(part);
    }

    /* renamed from: f */
    public void mo45613f(String str, String str2, boolean z) {
        if (this.f36152b != null) {
            String i = m67074i(str2, z);
            String str3 = this.f36152b;
            String replace = str3.replace(to1.f35745h + str + "}", i);
            if (!f36139a.matcher(replace).matches()) {
                this.f36152b = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* renamed from: g */
    public void mo45614g(String str, @Nullable String str2, boolean z) {
        String str3 = this.f36152b;
        if (str3 != null) {
            HttpUrl.Builder newBuilder = this.f36146a.newBuilder(str3);
            this.f36145a = newBuilder;
            if (newBuilder != null) {
                this.f36152b = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f36146a + ", Relative: " + this.f36152b);
            }
        }
        if (z) {
            this.f36145a.addEncodedQueryParameter(str, str2);
        } else {
            this.f36145a.addQueryParameter(str, str2);
        }
    }

    /* renamed from: h */
    public <T> void mo45615h(Class<T> cls, @Nullable T t) {
        this.f36149a.tag(cls, t);
    }

    /* renamed from: k */
    public Request.Builder mo45616k() {
        HttpUrl httpUrl;
        HttpUrl.Builder builder = this.f36145a;
        if (builder != null) {
            httpUrl = builder.build();
        } else {
            httpUrl = this.f36146a.resolve(this.f36152b);
            if (httpUrl == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f36146a + ", Relative: " + this.f36152b);
            }
        }
        C6968a aVar = this.f36150a;
        if (aVar == null) {
            FormBody.Builder builder2 = this.f36143a;
            if (builder2 != null) {
                aVar = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.f36148a;
                if (builder3 != null) {
                    aVar = builder3.build();
                } else if (this.f36151a) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.f36147a;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new C6968a(aVar, mediaType);
            } else {
                this.f36144a.add("Content-Type", mediaType.toString());
            }
        }
        return this.f36149a.url(httpUrl).headers(this.f36144a.build()).method(this.f36142a, aVar);
    }

    /* renamed from: l */
    public void mo45617l(RequestBody requestBody) {
        this.f36150a = requestBody;
    }

    /* renamed from: m */
    public void mo45618m(Object obj) {
        this.f36152b = obj.toString();
    }
}
