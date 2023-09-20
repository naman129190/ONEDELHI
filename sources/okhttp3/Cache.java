package okhttp3;

import com.google.android.gms.common.internal.ImagesContract;
import com.onedelhi.secure.C5301fr;
import com.onedelhi.secure.C5446gs;
import com.onedelhi.secure.C5561hs;
import com.onedelhi.secure.C6205no;
import com.onedelhi.secure.C6785so;
import com.onedelhi.secure.C6893to;
import com.onedelhi.secure.ak0;
import com.onedelhi.secure.fa4;
import com.onedelhi.secure.gu2;
import com.onedelhi.secure.hv3;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.k23;
import com.onedelhi.secure.ma1;
import com.onedelhi.secure.na1;
import com.onedelhi.secure.nm0;
import com.onedelhi.secure.nq4;
import com.onedelhi.secure.oi3;
import com.onedelhi.secure.oz3;
import com.onedelhi.secure.qm1;
import com.onedelhi.secure.r34;
import com.onedelhi.secure.s00;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.t54;
import com.onedelhi.secure.tk4;
import com.onedelhi.secure.u21;
import com.onedelhi.secure.u54;
import com.onedelhi.secure.uw1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;
import com.onedelhi.secure.x04;
import com.onedelhi.secure.x44;
import com.onedelhi.secure.xj0;
import com.onedelhi.secure.zw1;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0004LKMNB!\b\u0000\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IB\u0019\b\u0016\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u0010&\u001a\u00020$¢\u0006\u0004\bH\u0010JJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0018\u00010\u0003R\u00020\u0004H\u0002J\u0019\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u0006J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020!J\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020$J\b\u0010'\u001a\u00020\u0006H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\u000f\u0010,\u001a\u00020)H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u00101\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b/\u00100J\u000f\u00104\u001a\u00020\u0006H\u0000¢\u0006\u0004\b2\u00103J\u0006\u00105\u001a\u00020!J\u0006\u00106\u001a\u00020!J\u0006\u00107\u001a\u00020!R\"\u0010#\u001a\u00020!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b#\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\"\u001a\u00020!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\"\u00108\u001a\u0004\b=\u0010:\"\u0004\b>\u0010<R\u0016\u00105\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00108R\u0016\u00106\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00108R\u0016\u00107\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010?\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0011\u0010D\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010,\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\b,\u0010+¨\u0006O"}, d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lcom/onedelhi/secure/nm0$a;", "Lcom/onedelhi/secure/nm0;", "editor", "Lcom/onedelhi/secure/un4;", "abortQuietly", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "get$okhttp", "(Lokhttp3/Request;)Lokhttp3/Response;", "get", "response", "Lcom/onedelhi/secure/gs;", "put$okhttp", "(Lokhttp3/Response;)Lcom/onedelhi/secure/gs;", "put", "remove$okhttp", "(Lokhttp3/Request;)V", "remove", "cached", "network", "update$okhttp", "(Lokhttp3/Response;Lokhttp3/Response;)V", "update", "initialize", "delete", "evictAll", "", "", "urls", "", "writeAbortCount", "writeSuccessCount", "", "size", "maxSize", "flush", "close", "Ljava/io/File;", "-deprecated_directory", "()Ljava/io/File;", "directory", "Lcom/onedelhi/secure/hs;", "cacheStrategy", "trackResponse$okhttp", "(Lcom/onedelhi/secure/hs;)V", "trackResponse", "trackConditionalCacheHit$okhttp", "()V", "trackConditionalCacheHit", "networkCount", "hitCount", "requestCount", "I", "getWriteSuccessCount$okhttp", "()I", "setWriteSuccessCount$okhttp", "(I)V", "getWriteAbortCount$okhttp", "setWriteAbortCount$okhttp", "cache", "Lcom/onedelhi/secure/nm0;", "getCache$okhttp", "()Lcom/onedelhi/secure/nm0;", "", "isClosed", "()Z", "Lcom/onedelhi/secure/u21;", "fileSystem", "<init>", "(Ljava/io/File;JLcom/onedelhi/secure/u21;)V", "(Ljava/io/File;J)V", "Companion", "CacheResponseBody", "Entry", "RealCacheRequest", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class Cache implements Closeable, Flushable {
    public static final Companion Companion = new Companion((wg0) null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    @vr2
    private final nm0 cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\f\u001a\u00060\nR\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u001b\u0010\f\u001a\u00060\nR\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lcom/onedelhi/secure/to;", "source", "", "Ljava/lang/String;", "Lcom/onedelhi/secure/nm0$g;", "Lcom/onedelhi/secure/nm0;", "snapshot", "Lcom/onedelhi/secure/nm0$g;", "getSnapshot", "()Lcom/onedelhi/secure/nm0$g;", "<init>", "(Lcom/onedelhi/secure/nm0$g;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class CacheResponseBody extends ResponseBody {
        private final C6893to bodySource;
        private final String contentLength;
        private final String contentType;
        @vr2
        private final nm0.C6202g snapshot;

        public CacheResponseBody(@vr2 nm0.C6202g gVar, @ss2 String str, @ss2 String str2) {
            jt1.m53777p(gVar, "snapshot");
            this.snapshot = gVar;
            this.contentType = str;
            this.contentLength = str2;
            x04 c = gVar.mo41203c(1);
            this.bodySource = gu2.m49835d(new na1(this, c, c) {
                public final /* synthetic */ x04 $source;
                public final /* synthetic */ CacheResponseBody this$0;

                {
                    this.this$0 = r1;
                    this.$source = r2;
                }

                public void close() throws IOException {
                    this.this$0.getSnapshot().close();
                    super.close();
                }
            });
        }

        public long contentLength() {
            String str = this.contentLength;
            if (str != null) {
                return nq4.m58700f0(str, -1);
            }
            return -1;
        }

        @ss2
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }

        @vr2
        public final nm0.C6202g getSnapshot() {
            return this.snapshot;
        }

        @vr2
        public C6893to source() {
            return this.bodySource;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015J\n\u0010\u0019\u001a\u00020\u0017*\u00020\u0012J\n\u0010\b\u001a\u00020\u0002*\u00020\u0012R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b¨\u0006!"}, d2 = {"Lokhttp3/Cache$Companion;", "", "Lokhttp3/Headers;", "", "", "varyFields", "requestHeaders", "responseHeaders", "varyHeaders", "Lokhttp3/HttpUrl;", "url", "key", "Lcom/onedelhi/secure/to;", "source", "", "readInt$okhttp", "(Lcom/onedelhi/secure/to;)I", "readInt", "Lokhttp3/Response;", "cachedResponse", "cachedRequest", "Lokhttp3/Request;", "newRequest", "", "varyMatches", "hasVaryAll", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wg0 wg0) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if (t54.m65410K1("Vary", headers.name(i), true)) {
                    String value = headers.value(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(t54.m65420S1(x44.f37329a));
                    }
                    for (String str : u54.m66592S4(value, new char[]{','}, false, 0, 6, (Object) null)) {
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        treeSet.add(u54.m66544E5(str).toString());
                    }
                }
            }
            return treeSet != null ? treeSet : hv3.m51155k();
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> varyFields = varyFields(headers2);
            if (varyFields.isEmpty()) {
                return nq4.f32731a;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                if (varyFields.contains(name)) {
                    builder.add(name, headers.value(i));
                }
            }
            return builder.build();
        }

        public final boolean hasVaryAll(@vr2 Response response) {
            jt1.m53777p(response, "$this$hasVaryAll");
            return varyFields(response.headers()).contains("*");
        }

        @zw1
        @vr2
        public final String key(@vr2 HttpUrl httpUrl) {
            jt1.m53777p(httpUrl, ImagesContract.URL);
            return C5301fr.f28633a.mo36296l(httpUrl.toString()).mo36264W().mo31159D();
        }

        public final int readInt$okhttp(@vr2 C6893to toVar) throws IOException {
            jt1.m53777p(toVar, "source");
            try {
                long b0 = toVar.mo31681b0();
                String r2 = toVar.mo31699r2();
                if (b0 >= 0 && b0 <= ((long) Integer.MAX_VALUE)) {
                    if (!(r2.length() > 0)) {
                        return (int) b0;
                    }
                }
                throw new IOException("expected an int but was \"" + b0 + r2 + tk4.f35693a);
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        @vr2
        public final Headers varyHeaders(@vr2 Response response) {
            jt1.m53777p(response, "$this$varyHeaders");
            Response networkResponse = response.networkResponse();
            jt1.m53774m(networkResponse);
            return varyHeaders(networkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(@vr2 Response response, @vr2 Headers headers, @vr2 Request request) {
            jt1.m53777p(response, "cachedResponse");
            jt1.m53777p(headers, "cachedRequest");
            jt1.m53777p(request, "newRequest");
            Set<String> varyFields = varyFields(response.headers());
            if ((varyFields instanceof Collection) && varyFields.isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if (!jt1.m53768g(headers.values(str), request.headers(str))) {
                    return false;
                }
            }
            return true;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 52\u00020\u0001:\u00015B\u0011\b\u0016\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b2\u00104J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0012\u0010\u000f\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fR\u00020\rJ\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0016R\u00020\rR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u0014\u0010&\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u0016\u0010(\u001a\u0004\u0018\u00010'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010.\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00066"}, d2 = {"Lokhttp3/Cache$Entry;", "", "Lcom/onedelhi/secure/to;", "source", "", "Ljava/security/cert/Certificate;", "readCertificateList", "Lcom/onedelhi/secure/so;", "sink", "certificates", "Lcom/onedelhi/secure/un4;", "writeCertList", "Lcom/onedelhi/secure/nm0$a;", "Lcom/onedelhi/secure/nm0;", "editor", "writeTo", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "response", "", "matches", "Lcom/onedelhi/secure/nm0$g;", "snapshot", "", "url", "Ljava/lang/String;", "Lokhttp3/Headers;", "varyHeaders", "Lokhttp3/Headers;", "requestMethod", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Protocol;", "", "code", "I", "message", "responseHeaders", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Handshake;", "", "sentRequestMillis", "J", "receivedResponseMillis", "isHttps", "()Z", "Lcom/onedelhi/secure/x04;", "rawSource", "<init>", "(Lcom/onedelhi/secure/x04;)V", "(Lokhttp3/Response;)V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Entry {
        public static final Companion Companion = new Companion((wg0) null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final String url;
        private final Headers varyHeaders;

        @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo38105d2 = {"Lokhttp3/Cache$Entry$Companion;", "", "()V", "RECEIVED_MILLIS", "", "SENT_MILLIS", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(wg0 wg0) {
                this();
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            k23.C5870a aVar = k23.f31087a;
            sb.append(aVar.mo39034g().mo39023i());
            sb.append("-Sent-Millis");
            SENT_MILLIS = sb.toString();
            RECEIVED_MILLIS = aVar.mo39034g().mo39023i() + "-Received-Millis";
        }

        public Entry(@vr2 x04 x04) throws IOException {
            Handshake handshake2;
            jt1.m53777p(x04, "rawSource");
            try {
                C6893to d = gu2.m49835d(x04);
                this.url = d.mo31699r2();
                this.requestMethod = d.mo31699r2();
                Headers.Builder builder = new Headers.Builder();
                int readInt$okhttp = Cache.Companion.readInt$okhttp(d);
                boolean z = false;
                for (int i = 0; i < readInt$okhttp; i++) {
                    builder.addLenient$okhttp(d.mo31699r2());
                }
                this.varyHeaders = builder.build();
                r34 b = r34.f34483a.mo43806b(d.mo31699r2());
                this.protocol = b.f34490a;
                this.code = b.f34488a;
                this.message = b.f34489a;
                Headers.Builder builder2 = new Headers.Builder();
                int readInt$okhttp2 = Cache.Companion.readInt$okhttp(d);
                for (int i2 = 0; i2 < readInt$okhttp2; i2++) {
                    builder2.addLenient$okhttp(d.mo31699r2());
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                long j = 0;
                this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : j;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String r2 = d.mo31699r2();
                    if (!(r2.length() > 0 ? true : z)) {
                        handshake2 = Handshake.Companion.get(!d.mo31685f2() ? TlsVersion.Companion.forJavaName(d.mo31699r2()) : TlsVersion.SSL_3_0, CipherSuite.Companion.forJavaName(d.mo31699r2()), readCertificateList(d), readCertificateList(d));
                    } else {
                        throw new IOException("expected \"\" but was \"" + r2 + tk4.f35693a);
                    }
                } else {
                    handshake2 = null;
                }
                this.handshake = handshake2;
            } finally {
                x04.close();
            }
        }

        public Entry(@vr2 Response response) {
            jt1.m53777p(response, "response");
            this.url = response.request().url().toString();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }

        private final boolean isHttps() {
            return t54.m65466u2(this.url, "https://", false, 2, (Object) null);
        }

        private final List<Certificate> readCertificateList(C6893to toVar) throws IOException {
            int readInt$okhttp = Cache.Companion.readInt$okhttp(toVar);
            if (readInt$okhttp == -1) {
                return s00.m64037F();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                for (int i = 0; i < readInt$okhttp; i++) {
                    String r2 = toVar.mo31699r2();
                    C6205no noVar = new C6205no();
                    C5301fr h = C5301fr.f28633a.mo36293h(r2);
                    jt1.m53774m(h);
                    noVar.mo41287s(h);
                    arrayList.add(instance.generateCertificate(noVar.mo31696r()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private final void writeCertList(C6785so soVar, List<? extends Certificate> list) throws IOException {
            try {
                soVar.mo41242S1((long) list.size()).mo41230L0(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    byte[] encoded = ((Certificate) list.get(i)).getEncoded();
                    C5301fr.C5302a aVar = C5301fr.f28633a;
                    jt1.m53776o(encoded, "bytes");
                    soVar.mo41279n(C5301fr.C5302a.m48446p(aVar, encoded, 0, 0, 3, (Object) null).mo31169g()).mo41230L0(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean matches(@vr2 Request request, @vr2 Response response) {
            jt1.m53777p(request, "request");
            jt1.m53777p(response, "response");
            return jt1.m53768g(this.url, request.url().toString()) && jt1.m53768g(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request);
        }

        @vr2
        public final Response response(@vr2 nm0.C6202g gVar) {
            jt1.m53777p(gVar, "snapshot");
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, (RequestBody) null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(gVar, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0114, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0115, code lost:
            com.onedelhi.secure.C5630hz.m51313a(r8, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0118, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeTo(@com.onedelhi.secure.vr2 com.onedelhi.secure.nm0.C6194a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.lang.String r0 = "editor"
                com.onedelhi.secure.jt1.m53777p(r8, r0)
                r0 = 0
                com.onedelhi.secure.oz3 r8 = r8.mo41174f(r0)
                com.onedelhi.secure.so r8 = com.onedelhi.secure.gu2.m49834c(r8)
                java.lang.String r1 = r7.url     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r1 = r8.mo41279n(r1)     // Catch:{ all -> 0x0112 }
                r2 = 10
                r1.mo41230L0(r2)     // Catch:{ all -> 0x0112 }
                java.lang.String r1 = r7.requestMethod     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r1 = r8.mo41279n(r1)     // Catch:{ all -> 0x0112 }
                r1.mo41230L0(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r1 = r7.varyHeaders     // Catch:{ all -> 0x0112 }
                int r1 = r1.size()     // Catch:{ all -> 0x0112 }
                long r3 = (long) r1     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r1 = r8.mo41242S1(r3)     // Catch:{ all -> 0x0112 }
                r1.mo41230L0(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r1 = r7.varyHeaders     // Catch:{ all -> 0x0112 }
                int r1 = r1.size()     // Catch:{ all -> 0x0112 }
                r3 = 0
            L_0x0037:
                java.lang.String r4 = ": "
                if (r3 >= r1) goto L_0x0059
                okhttp3.Headers r5 = r7.varyHeaders     // Catch:{ all -> 0x0112 }
                java.lang.String r5 = r5.name(r3)     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r5 = r8.mo41279n(r5)     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r4 = r5.mo41279n(r4)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r5 = r7.varyHeaders     // Catch:{ all -> 0x0112 }
                java.lang.String r5 = r5.value(r3)     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r4 = r4.mo41279n(r5)     // Catch:{ all -> 0x0112 }
                r4.mo41230L0(r2)     // Catch:{ all -> 0x0112 }
                int r3 = r3 + 1
                goto L_0x0037
            L_0x0059:
                com.onedelhi.secure.r34 r1 = new com.onedelhi.secure.r34     // Catch:{ all -> 0x0112 }
                okhttp3.Protocol r3 = r7.protocol     // Catch:{ all -> 0x0112 }
                int r5 = r7.code     // Catch:{ all -> 0x0112 }
                java.lang.String r6 = r7.message     // Catch:{ all -> 0x0112 }
                r1.<init>(r3, r5, r6)     // Catch:{ all -> 0x0112 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r1 = r8.mo41279n(r1)     // Catch:{ all -> 0x0112 }
                r1.mo41230L0(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r1 = r7.responseHeaders     // Catch:{ all -> 0x0112 }
                int r1 = r1.size()     // Catch:{ all -> 0x0112 }
                int r1 = r1 + 2
                long r5 = (long) r1     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r1 = r8.mo41242S1(r5)     // Catch:{ all -> 0x0112 }
                r1.mo41230L0(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r1 = r7.responseHeaders     // Catch:{ all -> 0x0112 }
                int r1 = r1.size()     // Catch:{ all -> 0x0112 }
            L_0x0085:
                if (r0 >= r1) goto L_0x00a5
                okhttp3.Headers r3 = r7.responseHeaders     // Catch:{ all -> 0x0112 }
                java.lang.String r3 = r3.name(r0)     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r3 = r8.mo41279n(r3)     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r3 = r3.mo41279n(r4)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r5 = r7.responseHeaders     // Catch:{ all -> 0x0112 }
                java.lang.String r5 = r5.value(r0)     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r3 = r3.mo41279n(r5)     // Catch:{ all -> 0x0112 }
                r3.mo41230L0(r2)     // Catch:{ all -> 0x0112 }
                int r0 = r0 + 1
                goto L_0x0085
            L_0x00a5:
                java.lang.String r0 = SENT_MILLIS     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r0 = r8.mo41279n(r0)     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r0 = r0.mo41279n(r4)     // Catch:{ all -> 0x0112 }
                long r5 = r7.sentRequestMillis     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r0 = r0.mo41242S1(r5)     // Catch:{ all -> 0x0112 }
                r0.mo41230L0(r2)     // Catch:{ all -> 0x0112 }
                java.lang.String r0 = RECEIVED_MILLIS     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r0 = r8.mo41279n(r0)     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r0 = r0.mo41279n(r4)     // Catch:{ all -> 0x0112 }
                long r3 = r7.receivedResponseMillis     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r0 = r0.mo41242S1(r3)     // Catch:{ all -> 0x0112 }
                r0.mo41230L0(r2)     // Catch:{ all -> 0x0112 }
                boolean r0 = r7.isHttps()     // Catch:{ all -> 0x0112 }
                if (r0 == 0) goto L_0x010b
                r8.mo41230L0(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.jt1.m53774m(r0)     // Catch:{ all -> 0x0112 }
                okhttp3.CipherSuite r0 = r0.cipherSuite()     // Catch:{ all -> 0x0112 }
                java.lang.String r0 = r0.javaName()     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r0 = r8.mo41279n(r0)     // Catch:{ all -> 0x0112 }
                r0.mo41230L0(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0112 }
                java.util.List r0 = r0.peerCertificates()     // Catch:{ all -> 0x0112 }
                r7.writeCertList(r8, r0)     // Catch:{ all -> 0x0112 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0112 }
                java.util.List r0 = r0.localCertificates()     // Catch:{ all -> 0x0112 }
                r7.writeCertList(r8, r0)     // Catch:{ all -> 0x0112 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0112 }
                okhttp3.TlsVersion r0 = r0.tlsVersion()     // Catch:{ all -> 0x0112 }
                java.lang.String r0 = r0.javaName()     // Catch:{ all -> 0x0112 }
                com.onedelhi.secure.so r0 = r8.mo41279n(r0)     // Catch:{ all -> 0x0112 }
                r0.mo41230L0(r2)     // Catch:{ all -> 0x0112 }
            L_0x010b:
                com.onedelhi.secure.un4 r0 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0112 }
                r0 = 0
                com.onedelhi.secure.C5630hz.m51313a(r8, r0)
                return
            L_0x0112:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0114 }
            L_0x0114:
                r1 = move-exception
                com.onedelhi.secure.C5630hz.m51313a(r8, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache.Entry.writeTo(com.onedelhi.secure.nm0$a):void");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000f\u001a\u00060\rR\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lcom/onedelhi/secure/gs;", "Lcom/onedelhi/secure/un4;", "abort", "Lcom/onedelhi/secure/oz3;", "body", "", "done", "Z", "getDone", "()Z", "setDone", "(Z)V", "Lcom/onedelhi/secure/nm0$a;", "Lcom/onedelhi/secure/nm0;", "editor", "<init>", "(Lokhttp3/Cache;Lcom/onedelhi/secure/nm0$a;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class RealCacheRequest implements C5446gs {
        private final oz3 body;
        private final oz3 cacheOut;
        private boolean done;
        /* access modifiers changed from: private */
        public final nm0.C6194a editor;
        public final /* synthetic */ Cache this$0;

        public RealCacheRequest(@vr2 Cache cache, nm0.C6194a aVar) {
            jt1.m53777p(aVar, "editor");
            this.this$0 = cache;
            this.editor = aVar;
            oz3 f = aVar.mo41174f(1);
            this.cacheOut = f;
            this.body = new ma1(this, f) {
                public final /* synthetic */ RealCacheRequest this$0;

                {
                    this.this$0 = r1;
                }

                public void close() throws IOException {
                    synchronized (this.this$0.this$0) {
                        if (!this.this$0.getDone()) {
                            this.this$0.setDone(true);
                            Cache cache = this.this$0.this$0;
                            cache.setWriteSuccessCount$okhttp(cache.getWriteSuccessCount$okhttp() + 1);
                            super.close();
                            this.this$0.editor.mo41170b();
                        }
                    }
                }
            };
        }

        public void abort() {
            synchronized (this.this$0) {
                if (!this.done) {
                    this.done = true;
                    Cache cache = this.this$0;
                    cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                    nq4.m58711l(this.cacheOut);
                    try {
                        this.editor.mo41169a();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        @vr2
        public oz3 body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z) {
            this.done = z;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Cache(@vr2 File file, long j) {
        this(file, j, u21.f35945a);
        jt1.m53777p(file, "directory");
    }

    public Cache(@vr2 File file, long j, @vr2 u21 u21) {
        jt1.m53777p(file, "directory");
        jt1.m53777p(u21, "fileSystem");
        this.cache = new nm0(u21, file, VERSION, 2, j, fa4.f28227a);
    }

    private final void abortQuietly(nm0.C6194a aVar) {
        if (aVar != null) {
            try {
                aVar.mo41169a();
            } catch (IOException unused) {
            }
        }
    }

    @zw1
    @vr2
    public static final String key(@vr2 HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    @uw1(name = "-deprecated_directory")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "directory", imports = {}))
    /* renamed from: -deprecated_directory  reason: not valid java name */
    public final File m74758deprecated_directory() {
        return this.cache.mo41167q0();
    }

    public void close() throws IOException {
        this.cache.close();
    }

    public final void delete() throws IOException {
        this.cache.mo41150Z();
    }

    @uw1(name = "directory")
    @vr2
    public final File directory() {
        return this.cache.mo41167q0();
    }

    public final void evictAll() throws IOException {
        this.cache.mo41162l0();
    }

    public void flush() throws IOException {
        this.cache.flush();
    }

    @ss2
    public final Response get$okhttp(@vr2 Request request) {
        jt1.m53777p(request, "request");
        try {
            nm0.C6202g o0 = this.cache.mo41164o0(Companion.key(request.url()));
            if (o0 != null) {
                try {
                    Entry entry = new Entry(o0.mo41203c(0));
                    Response response = entry.response(o0);
                    if (entry.matches(request, response)) {
                        return response;
                    }
                    ResponseBody body = response.body();
                    if (body != null) {
                        nq4.m58711l(body);
                    }
                    return null;
                } catch (IOException unused) {
                    nq4.m58711l(o0);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @vr2
    public final nm0 getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() throws IOException {
        this.cache.mo41140M0();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.mo41138F0();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    @ss2
    public final C5446gs put$okhttp(@vr2 Response response) {
        nm0.C6194a aVar;
        jt1.m53777p(response, "response");
        String method = response.request().method();
        if (qm1.f34314a.mo43680a(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if (!jt1.m53768g(method, "GET")) {
            return null;
        } else {
            Companion companion = Companion;
            if (companion.hasVaryAll(response)) {
                return null;
            }
            Entry entry = new Entry(response);
            try {
                aVar = nm0.m58231j0(this.cache, companion.key(response.request().url()), 0, 2, (Object) null);
                if (aVar == null) {
                    return null;
                }
                try {
                    entry.writeTo(aVar);
                    return new RealCacheRequest(this, aVar);
                } catch (IOException unused2) {
                    abortQuietly(aVar);
                    return null;
                }
            } catch (IOException unused3) {
                aVar = null;
                abortQuietly(aVar);
                return null;
            }
        }
    }

    public final void remove$okhttp(@vr2 Request request) throws IOException {
        jt1.m53777p(request, "request");
        this.cache.mo41147V0(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    public final long size() throws IOException {
        return this.cache.mo41159i1();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(@vr2 C5561hs hsVar) {
        jt1.m53777p(hsVar, "cacheStrategy");
        this.requestCount++;
        if (hsVar.mo37519b() != null) {
            this.networkCount++;
        } else if (hsVar.mo37518a() != null) {
            this.hitCount++;
        }
    }

    public final void update$okhttp(@vr2 Response response, @vr2 Response response2) {
        jt1.m53777p(response, "cached");
        jt1.m53777p(response2, "network");
        Entry entry = new Entry(response2);
        ResponseBody body = response.body();
        Objects.requireNonNull(body, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            nm0.C6194a a = ((CacheResponseBody) body).getSnapshot().mo41201a();
            if (a != null) {
                entry.writeTo(a);
                a.mo41170b();
            }
        } catch (IOException unused) {
            abortQuietly((nm0.C6194a) null);
        }
    }

    @vr2
    public final Iterator<String> urls() throws IOException {
        return new Cache$urls$1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }
}
