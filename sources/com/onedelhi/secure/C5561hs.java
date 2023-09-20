package com.onedelhi.secure;

import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u0005B\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/hs;", "", "Lokhttp3/Request;", "networkRequest", "Lokhttp3/Request;", "b", "()Lokhttp3/Request;", "Lokhttp3/Response;", "cacheResponse", "Lokhttp3/Response;", "a", "()Lokhttp3/Response;", "<init>", "(Lokhttp3/Request;Lokhttp3/Response;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.onedelhi.secure.hs */
public final class C5561hs {

    /* renamed from: a */
    public static final C5562a f29763a = new C5562a((wg0) null);
    @ss2

    /* renamed from: a */
    public final Request f29764a;
    @ss2

    /* renamed from: a */
    public final Response f29765a;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/hs$a;", "", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "request", "", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.hs$a */
    public static final class C5562a {
        public C5562a() {
        }

        public /* synthetic */ C5562a(wg0 wg0) {
            this();
        }

        /* renamed from: a */
        public final boolean mo37520a(@vr2 Response response, @vr2 Request request) {
            jt1.m53777p(response, "response");
            jt1.m53777p(request, "request");
            int code = response.code();
            if (!(code == 200 || code == 410 || code == 414 || code == 501 || code == 203 || code == 204)) {
                if (code != 307) {
                    if (!(code == 308 || code == 404 || code == 405)) {
                        switch (code) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (Response.header$default(response, "Expires", (String) null, 2, (Object) null) == null && response.cacheControl().maxAgeSeconds() == -1 && !response.cacheControl().isPublic() && !response.cacheControl().isPrivate()) {
                    return false;
                }
            }
            return !response.cacheControl().noStore() && !request.cacheControl().noStore();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/onedelhi/secure/hs$b;", "", "Lcom/onedelhi/secure/hs;", "b", "", "g", "c", "", "d", "a", "Lokhttp3/Request;", "request", "f", "Lokhttp3/Request;", "e", "()Lokhttp3/Request;", "nowMillis", "Lokhttp3/Response;", "cacheResponse", "<init>", "(JLokhttp3/Request;Lokhttp3/Response;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.hs$b */
    public static final class C5563b {

        /* renamed from: a */
        public int f29766a = -1;

        /* renamed from: a */
        public long f29767a;

        /* renamed from: a */
        public String f29768a;

        /* renamed from: a */
        public Date f29769a;
        @vr2

        /* renamed from: a */
        public final Request f29770a;

        /* renamed from: a */
        public final Response f29771a;

        /* renamed from: b */
        public long f29772b;

        /* renamed from: b */
        public String f29773b;

        /* renamed from: b */
        public Date f29774b;

        /* renamed from: c */
        public final long f29775c;

        /* renamed from: c */
        public String f29776c;

        /* renamed from: c */
        public Date f29777c;

        public C5563b(long j, @vr2 Request request, @ss2 Response response) {
            jt1.m53777p(request, "request");
            this.f29775c = j;
            this.f29770a = request;
            this.f29771a = response;
            if (response != null) {
                this.f29767a = response.sentRequestAtMillis();
                this.f29772b = response.receivedResponseAtMillis();
                Headers headers = response.headers();
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    String name = headers.name(i);
                    String value = headers.value(i);
                    if (t54.m65410K1(name, "Date", true)) {
                        this.f29769a = re0.m63547a(value);
                        this.f29768a = value;
                    } else if (t54.m65410K1(name, "Expires", true)) {
                        this.f29777c = re0.m63547a(value);
                    } else if (t54.m65410K1(name, "Last-Modified", true)) {
                        this.f29774b = re0.m63547a(value);
                        this.f29773b = value;
                    } else if (t54.m65410K1(name, ConfigFetchHttpClient.f25305f, true)) {
                        this.f29776c = value;
                    } else if (t54.m65410K1(name, "Age", true)) {
                        this.f29766a = nq4.m58702g0(value, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        public final long mo37521a() {
            Date date = this.f29769a;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.f29772b - date.getTime());
            }
            int i = this.f29766a;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            long j2 = this.f29772b;
            return j + (j2 - this.f29767a) + (this.f29775c - j2);
        }

        @vr2
        /* renamed from: b */
        public final C5561hs mo37522b() {
            C5561hs c = mo37523c();
            return (c.mo37519b() == null || !this.f29770a.cacheControl().onlyIfCached()) ? c : new C5561hs((Request) null, (Response) null);
        }

        /* renamed from: c */
        public final C5561hs mo37523c() {
            if (this.f29771a == null) {
                return new C5561hs(this.f29770a, (Response) null);
            }
            if (this.f29770a.isHttps() && this.f29771a.handshake() == null) {
                return new C5561hs(this.f29770a, (Response) null);
            }
            if (!C5561hs.f29763a.mo37520a(this.f29771a, this.f29770a)) {
                return new C5561hs(this.f29770a, (Response) null);
            }
            CacheControl cacheControl = this.f29770a.cacheControl();
            if (cacheControl.noCache() || mo37526f(this.f29770a)) {
                return new C5561hs(this.f29770a, (Response) null);
            }
            CacheControl cacheControl2 = this.f29771a.cacheControl();
            long a = mo37521a();
            long d = mo37524d();
            if (cacheControl.maxAgeSeconds() != -1) {
                d = Math.min(d, TimeUnit.SECONDS.toMillis((long) cacheControl.maxAgeSeconds()));
            }
            long j = 0;
            long millis = cacheControl.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis((long) cacheControl.minFreshSeconds()) : 0;
            if (!cacheControl2.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                j = TimeUnit.SECONDS.toMillis((long) cacheControl.maxStaleSeconds());
            }
            if (!cacheControl2.noCache()) {
                long j2 = millis + a;
                if (j2 < j + d) {
                    Response.Builder newBuilder = this.f29771a.newBuilder();
                    if (j2 >= d) {
                        newBuilder.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a > pr3.f18684a && mo37527g()) {
                        newBuilder.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C5561hs((Request) null, newBuilder.build());
                }
            }
            String str = this.f29776c;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = ConfigFetchHttpClient.f25306g;
            } else if (this.f29774b != null) {
                str = this.f29773b;
            } else if (this.f29769a == null) {
                return new C5561hs(this.f29770a, (Response) null);
            } else {
                str = this.f29768a;
            }
            Headers.Builder newBuilder2 = this.f29770a.headers().newBuilder();
            jt1.m53774m(str);
            newBuilder2.addLenient$okhttp(str2, str);
            return new C5561hs(this.f29770a.newBuilder().headers(newBuilder2.build()).build(), this.f29771a);
        }

        /* renamed from: d */
        public final long mo37524d() {
            Response response = this.f29771a;
            jt1.m53774m(response);
            CacheControl cacheControl = response.cacheControl();
            if (cacheControl.maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis((long) cacheControl.maxAgeSeconds());
            }
            Date date = this.f29777c;
            if (date != null) {
                Date date2 = this.f29769a;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f29772b);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f29774b == null || this.f29771a.request().url().query() != null) {
                return 0;
            } else {
                Date date3 = this.f29769a;
                long time2 = date3 != null ? date3.getTime() : this.f29767a;
                Date date4 = this.f29774b;
                jt1.m53774m(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
                return 0;
            }
        }

        @vr2
        /* renamed from: e */
        public final Request mo37525e() {
            return this.f29770a;
        }

        /* renamed from: f */
        public final boolean mo37526f(Request request) {
            return (request.header("If-Modified-Since") == null && request.header(ConfigFetchHttpClient.f25306g) == null) ? false : true;
        }

        /* renamed from: g */
        public final boolean mo37527g() {
            Response response = this.f29771a;
            jt1.m53774m(response);
            return response.cacheControl().maxAgeSeconds() == -1 && this.f29777c == null;
        }
    }

    public C5561hs(@ss2 Request request, @ss2 Response response) {
        this.f29764a = request;
        this.f29765a = response;
    }

    @ss2
    /* renamed from: a */
    public final Response mo37518a() {
        return this.f29765a;
    }

    @ss2
    /* renamed from: b */
    public final Request mo37519b() {
        return this.f29764a;
    }
}
