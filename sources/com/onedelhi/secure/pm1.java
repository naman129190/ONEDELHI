package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\t\u0015B\u0013\b\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R*\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00068\u0006@GX\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/onedelhi/secure/pm1;", "Lokhttp3/Interceptor;", "", "name", "Lcom/onedelhi/secure/un4;", "f", "Lcom/onedelhi/secure/pm1$a;", "level", "g", "a", "()Lcom/onedelhi/secure/pm1$a;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lokhttp3/Headers;", "headers", "", "i", "e", "", "b", "<set-?>", "Lcom/onedelhi/secure/pm1$a;", "c", "d", "(Lcom/onedelhi/secure/pm1$a;)V", "Lcom/onedelhi/secure/pm1$b;", "logger", "<init>", "(Lcom/onedelhi/secure/pm1$b;)V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
public final class pm1 implements Interceptor {
    @vr2

    /* renamed from: a */
    public volatile C6462a f33728a;

    /* renamed from: a */
    public final C6463b f33729a;

    /* renamed from: a */
    public volatile Set<String> f33730a;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/pm1$a;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.pm1$a */
    public enum C6462a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0001\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/pm1$b;", "", "", "message", "Lcom/onedelhi/secure/un4;", "a", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.pm1$b */
    public interface C6463b {

        /* renamed from: a */
        public static final C6464a f33736a = new C6464a((wg0) null);
        @rw1
        @vr2

        /* renamed from: a */
        public static final C6463b f33737a = new C6464a.C6465a();

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0002\u0007\n\u0005\bF0\u0001¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/pm1$b$a;", "", "Lcom/onedelhi/secure/pm1$b;", "DEFAULT", "Lcom/onedelhi/secure/pm1$b;", "<init>", "()V", "a", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.onedelhi.secure.pm1$b$a */
        public static final class C6464a {

            /* renamed from: a */
            public static final /* synthetic */ C6464a f33738a = null;

            @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/pm1$b$a$a;", "Lcom/onedelhi/secure/pm1$b;", "", "message", "Lcom/onedelhi/secure/un4;", "a", "<init>", "()V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
            /* renamed from: com.onedelhi.secure.pm1$b$a$a */
            public static final class C6465a implements C6463b {
                /* renamed from: a */
                public void mo42823a(@vr2 String str) {
                    jt1.m53777p(str, "message");
                    k23.m54025n(k23.f31087a.mo39034g(), str, 0, (Throwable) null, 6, (Object) null);
                }
            }

            public C6464a() {
            }

            public /* synthetic */ C6464a(wg0 wg0) {
                this();
            }
        }

        /* renamed from: a */
        void mo42823a(@vr2 String str);
    }

    @vw1
    public pm1() {
        this((C6463b) null, 1, (wg0) null);
    }

    @vw1
    public pm1(@vr2 C6463b bVar) {
        jt1.m53777p(bVar, "logger");
        this.f33729a = bVar;
        this.f33730a = hv3.m51155k();
        this.f33728a = C6462a.NONE;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pm1(C6463b bVar, int i, wg0 wg0) {
        this((i & 1) != 0 ? C6463b.f33737a : bVar);
    }

    @uw1(name = "-deprecated_level")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to var", replaceWith = @oi3(expression = "level", imports = {}))
    /* renamed from: a */
    public final C6462a mo42816a() {
        return this.f33728a;
    }

    /* renamed from: b */
    public final boolean mo42817b(Headers headers) {
        String str = headers.get("Content-Encoding");
        return str != null && !t54.m65410K1(str, "identity", true) && !t54.m65410K1(str, "gzip", true);
    }

    @vr2
    /* renamed from: c */
    public final C6462a mo42818c() {
        return this.f33728a;
    }

    @uw1(name = "level")
    /* renamed from: d */
    public final void mo42819d(@vr2 C6462a aVar) {
        jt1.m53777p(aVar, "<set-?>");
        this.f33728a = aVar;
    }

    /* renamed from: e */
    public final void mo42820e(Headers headers, int i) {
        String value = this.f33730a.contains(headers.name(i)) ? "██" : headers.value(i);
        C6463b bVar = this.f33729a;
        bVar.mo42823a(headers.name(i) + ": " + value);
    }

    /* renamed from: f */
    public final void mo42821f(@vr2 String str) {
        jt1.m53777p(str, "name");
        TreeSet treeSet = new TreeSet(t54.m65420S1(x44.f37329a));
        x00.m69813p0(treeSet, this.f33730a);
        treeSet.add(str);
        this.f33730a = treeSet;
    }

    @vr2
    /* renamed from: g */
    public final pm1 mo42822g(@vr2 C6462a aVar) {
        jt1.m53777p(aVar, FirebaseAnalytics.C4305d.f24990t);
        this.f33728a = aVar;
        return this;
    }

    @vr2
    public Response intercept(@vr2 Interceptor.Chain chain) throws IOException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C6463b bVar;
        Charset charset;
        String str7;
        Throwable th;
        C6463b bVar2;
        String str8;
        StringBuilder sb;
        String str9;
        C6463b bVar3;
        Charset charset2;
        StringBuilder sb2;
        Interceptor.Chain chain2 = chain;
        jt1.m53777p(chain2, "chain");
        C6462a aVar = this.f33728a;
        Request request = chain.request();
        if (aVar == C6462a.NONE) {
            return chain2.proceed(request);
        }
        boolean z = aVar == C6462a.BODY;
        boolean z2 = z || aVar == C6462a.HEADERS;
        RequestBody body = request.body();
        Connection connection = chain.connection();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("--> ");
        sb3.append(request.method());
        sb3.append(' ');
        sb3.append(request.url());
        if (connection != null) {
            str = " " + connection.protocol();
        } else {
            str = "";
        }
        sb3.append(str);
        String sb4 = sb3.toString();
        if (!z2 && body != null) {
            sb4 = sb4 + " (" + body.contentLength() + "-byte body)";
        }
        this.f33729a.mo42823a(sb4);
        if (z2) {
            Headers headers = request.headers();
            if (body != null) {
                MediaType contentType = body.contentType();
                if (contentType != null && headers.get("Content-Type") == null) {
                    this.f33729a.mo42823a("Content-Type: " + contentType);
                }
                if (body.contentLength() != -1 && headers.get("Content-Length") == null) {
                    this.f33729a.mo42823a("Content-Length: " + body.contentLength());
                }
            }
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                mo42820e(headers, i);
            }
            if (!z || body == null) {
                bVar3 = this.f33729a;
                sb = new StringBuilder();
                sb.append("--> END ");
                str9 = request.method();
            } else if (mo42817b(request.headers())) {
                bVar3 = this.f33729a;
                sb = new StringBuilder();
                sb.append("--> END ");
                sb.append(request.method());
                str9 = " (encoded body omitted)";
            } else if (body.isDuplex()) {
                bVar3 = this.f33729a;
                sb = new StringBuilder();
                sb.append("--> END ");
                sb.append(request.method());
                str9 = " (duplex request body omitted)";
            } else if (body.isOneShot()) {
                bVar3 = this.f33729a;
                sb = new StringBuilder();
                sb.append("--> END ");
                sb.append(request.method());
                str9 = " (one-shot body omitted)";
            } else {
                C6205no noVar = new C6205no();
                body.writeTo(noVar);
                MediaType contentType2 = body.contentType();
                if (contentType2 == null || (charset2 = contentType2.charset(StandardCharsets.UTF_8)) == null) {
                    charset2 = StandardCharsets.UTF_8;
                    jt1.m53776o(charset2, "UTF_8");
                }
                this.f33729a.mo42823a("");
                if (jq4.m53697a(noVar)) {
                    this.f33729a.mo42823a(noVar.mo31671H2(charset2));
                    bVar2 = this.f33729a;
                    sb2 = new StringBuilder();
                    sb2.append("--> END ");
                    sb2.append(request.method());
                    sb2.append(" (");
                    sb2.append(body.contentLength());
                    sb2.append("-byte body)");
                } else {
                    bVar2 = this.f33729a;
                    sb2 = new StringBuilder();
                    sb2.append("--> END ");
                    sb2.append(request.method());
                    sb2.append(" (binary ");
                    sb2.append(body.contentLength());
                    sb2.append("-byte body omitted)");
                }
                str8 = sb2.toString();
                bVar2.mo42823a(str8);
            }
            sb.append(str9);
            str8 = sb.toString();
            bVar2.mo42823a(str8);
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = chain2.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            jt1.m53774m(body2);
            long contentLength = body2.contentLength();
            if (contentLength != -1) {
                str2 = contentLength + "-byte";
            } else {
                str2 = "unknown-length";
            }
            C6463b bVar4 = this.f33729a;
            String str10 = "-byte body)";
            StringBuilder sb5 = new StringBuilder();
            long j = contentLength;
            sb5.append("<-- ");
            sb5.append(proceed.code());
            if (proceed.message().length() == 0) {
                str3 = "-byte body omitted)";
                str4 = "";
            } else {
                String message = proceed.message();
                StringBuilder sb6 = new StringBuilder();
                str3 = "-byte body omitted)";
                sb6.append(String.valueOf(' '));
                sb6.append(message);
                str4 = sb6.toString();
            }
            sb5.append(str4);
            sb5.append(' ');
            sb5.append(proceed.request().url());
            sb5.append(" (");
            sb5.append(millis);
            sb5.append("ms");
            if (!z2) {
                str5 = ", " + str2 + " body";
            } else {
                str5 = "";
            }
            sb5.append(str5);
            sb5.append(')');
            bVar4.mo42823a(sb5.toString());
            if (z2) {
                Headers headers2 = proceed.headers();
                int size2 = headers2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    mo42820e(headers2, i2);
                }
                if (!z || !om1.m59474c(proceed)) {
                    bVar = this.f33729a;
                    str6 = "<-- END HTTP";
                } else if (mo42817b(proceed.headers())) {
                    bVar = this.f33729a;
                    str6 = "<-- END HTTP (encoded body omitted)";
                } else {
                    C6893to source = body2.source();
                    source.mo31677T(Long.MAX_VALUE);
                    C6205no e = source.mo31682e();
                    Long l = null;
                    if (t54.m65410K1("gzip", headers2.get("Content-Encoding"), true)) {
                        Long valueOf = Long.valueOf(e.mo41244V0());
                        tj1 tj1 = new tj1(e.clone());
                        try {
                            e = new C6205no();
                            e.mo41235N(tj1);
                            C5630hz.m51313a(tj1, (Throwable) null);
                            l = valueOf;
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            C5630hz.m51313a(tj1, th);
                            throw th3;
                        }
                    }
                    MediaType contentType3 = body2.contentType();
                    if (contentType3 == null || (charset = contentType3.charset(StandardCharsets.UTF_8)) == null) {
                        charset = StandardCharsets.UTF_8;
                        jt1.m53776o(charset, "UTF_8");
                    }
                    if (!jq4.m53697a(e)) {
                        this.f33729a.mo42823a("");
                        this.f33729a.mo42823a("<-- END HTTP (binary " + e.mo41244V0() + str3);
                        return proceed;
                    }
                    if (j != 0) {
                        this.f33729a.mo42823a("");
                        this.f33729a.mo42823a(e.clone().mo31671H2(charset));
                    }
                    C6463b bVar5 = this.f33729a;
                    if (l != null) {
                        str7 = "<-- END HTTP (" + e.mo41244V0() + "-byte, " + l + "-gzipped-byte body)";
                    } else {
                        str7 = "<-- END HTTP (" + e.mo41244V0() + str10;
                    }
                    bVar5.mo42823a(str7);
                }
                bVar.mo42823a(str6);
            }
            return proceed;
        } catch (Exception e2) {
            Exception exc = e2;
            this.f33729a.mo42823a("<-- HTTP FAILED: " + exc);
            throw exc;
        }
    }
}
