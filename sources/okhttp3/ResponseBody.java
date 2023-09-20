package okhttp3;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.onedelhi.secure.C5301fr;
import com.onedelhi.secure.C5604hx;
import com.onedelhi.secure.C6205no;
import com.onedelhi.secure.C6893to;
import com.onedelhi.secure.ak0;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.nq4;
import com.onedelhi.secure.oi3;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.uw1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;
import com.onedelhi.secure.xj0;
import com.onedelhi.secure.zw1;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import okhttp3.MediaType;

@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0007¢\u0006\u0004\b \u0010!JB\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0004H\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\b\u0010\u0010\u001a\u00020\u000fH&J\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0005H&J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u001aJ\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "", "T", "Lkotlin/Function1;", "Lcom/onedelhi/secure/to;", "consumer", "", "sizeMapper", "consumeSource", "(Lcom/onedelhi/secure/ec1;Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Ljava/io/InputStream;", "byteStream", "source", "", "bytes", "Lcom/onedelhi/secure/fr;", "byteString", "Ljava/io/Reader;", "charStream", "", "string", "Lcom/onedelhi/secure/un4;", "close", "reader", "Ljava/io/Reader;", "<init>", "()V", "Companion", "BomAwareReader", "okhttp"}, k = 1, mv = {1, 4, 0})
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion((wg0) null);
    private Reader reader;

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "", "cbuf", "", "off", "len", "read", "Lcom/onedelhi/secure/un4;", "close", "", "closed", "Z", "delegate", "Ljava/io/Reader;", "Ljava/nio/charset/Charset;", "charset", "Ljava/nio/charset/Charset;", "Lcom/onedelhi/secure/to;", "source", "<init>", "(Lcom/onedelhi/secure/to;Ljava/nio/charset/Charset;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final C6893to source;

        public BomAwareReader(@vr2 C6893to toVar, @vr2 Charset charset2) {
            jt1.m53777p(toVar, "source");
            jt1.m53777p(charset2, "charset");
            this.source = toVar;
            this.charset = charset2;
        }

        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        public int read(@vr2 char[] cArr, int i, int i2) throws IOException {
            jt1.m53777p(cArr, "cbuf");
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    reader = new InputStreamReader(this.source.mo31696r(), nq4.m58679Q(this.source, this.charset));
                    this.delegate = reader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\b\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u0005*\u00020\t2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\b\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\fJ)\u0010\u0011\u001a\u00020\u0005*\u00020\r2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0006\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0007J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\"\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\rH\u0007¨\u0006\u0015"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "toResponseBody", "", "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lcom/onedelhi/secure/fr;", "(Lcom/onedelhi/secure/fr;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lcom/onedelhi/secure/to;", "", "contentLength", "(Lcom/onedelhi/secure/to;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "asResponseBody", "content", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wg0 wg0) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, C5301fr frVar, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(frVar, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, C6893to toVar, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(toVar, mediaType, j);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        @zw1
        @uw1(name = "create")
        @vr2
        public final ResponseBody create(@vr2 C5301fr frVar, @ss2 MediaType mediaType) {
            jt1.m53777p(frVar, "$this$toResponseBody");
            return create((C6893to) new C6205no().mo41287s(frVar), mediaType, (long) frVar.mo36274j0());
        }

        @zw1
        @uw1(name = "create")
        @vr2
        public final ResponseBody create(@vr2 C6893to toVar, @ss2 MediaType mediaType, long j) {
            jt1.m53777p(toVar, "$this$asResponseBody");
            return new ResponseBody$Companion$asResponseBody$1(toVar, mediaType, j);
        }

        @zw1
        @uw1(name = "create")
        @vr2
        public final ResponseBody create(@vr2 String str, @ss2 MediaType mediaType) {
            jt1.m53777p(str, "$this$toResponseBody");
            Charset charset = C5604hx.f29888a;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, (Charset) null, 1, (Object) null);
                if (charset$default == null) {
                    MediaType.Companion companion = MediaType.Companion;
                    mediaType = companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            C6205no J1 = new C6205no().mo41297z(str, charset);
            return create((C6893to) J1, mediaType, J1.mo41244V0());
        }

        @zw1
        @vr2
        @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        public final ResponseBody create(@ss2 MediaType mediaType, long j, @vr2 C6893to toVar) {
            jt1.m53777p(toVar, FirebaseAnalytics.C4305d.f24947P);
            return create(toVar, mediaType, j);
        }

        @zw1
        @vr2
        @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        public final ResponseBody create(@ss2 MediaType mediaType, @vr2 C5301fr frVar) {
            jt1.m53777p(frVar, FirebaseAnalytics.C4305d.f24947P);
            return create(frVar, mediaType);
        }

        @zw1
        @vr2
        @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        public final ResponseBody create(@ss2 MediaType mediaType, @vr2 String str) {
            jt1.m53777p(str, FirebaseAnalytics.C4305d.f24947P);
            return create(str, mediaType);
        }

        @zw1
        @vr2
        @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        public final ResponseBody create(@ss2 MediaType mediaType, @vr2 byte[] bArr) {
            jt1.m53777p(bArr, FirebaseAnalytics.C4305d.f24947P);
            return create(bArr, mediaType);
        }

        @zw1
        @uw1(name = "create")
        @vr2
        public final ResponseBody create(@vr2 byte[] bArr, @ss2 MediaType mediaType) {
            jt1.m53777p(bArr, "$this$toResponseBody");
            return create((C6893to) new C6205no().mo41221D2(bArr), mediaType, (long) bArr.length);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.charset(com.onedelhi.secure.C5604hx.f29888a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.nio.charset.Charset charset() {
        /*
            r2 = this;
            okhttp3.MediaType r0 = r2.contentType()
            if (r0 == 0) goto L_0x000f
            java.nio.charset.Charset r1 = com.onedelhi.secure.C5604hx.f29888a
            java.nio.charset.Charset r0 = r0.charset(r1)
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            java.nio.charset.Charset r0 = com.onedelhi.secure.C5604hx.f29888a
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.charset():java.nio.charset.Charset");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        com.onedelhi.secure.uq1.m67403d(1);
        com.onedelhi.secure.C5630hz.m51313a(r2, r6);
        com.onedelhi.secure.uq1.m67402c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> T consumeSource(com.onedelhi.secure.ec1<? super com.onedelhi.secure.C6893to, ? extends T> r6, com.onedelhi.secure.ec1<? super T, java.lang.Integer> r7) {
        /*
            r5 = this;
            long r0 = r5.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0067
            com.onedelhi.secure.to r2 = r5.source()
            r3 = 0
            r4 = 1
            java.lang.Object r6 = r6.mo17094X(r2)     // Catch:{ all -> 0x005a }
            com.onedelhi.secure.uq1.m67403d(r4)
            com.onedelhi.secure.C5630hz.m51313a(r2, r3)
            com.onedelhi.secure.uq1.m67402c(r4)
            java.lang.Object r7 = r7.mo17094X(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0059
            long r2 = (long) r7
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0035
            goto L_0x0059
        L_0x0035:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Content-Length ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") and stream length ("
            r2.append(r0)
            r2.append(r7)
            java.lang.String r7 = ") disagree"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r6.<init>(r7)
            throw r6
        L_0x0059:
            return r6
        L_0x005a:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x005c }
        L_0x005c:
            r7 = move-exception
            com.onedelhi.secure.uq1.m67403d(r4)
            com.onedelhi.secure.C5630hz.m51313a(r2, r6)
            com.onedelhi.secure.uq1.m67402c(r4)
            throw r7
        L_0x0067:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Cannot buffer entire body for content length: "
            r7.append(r2)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.consumeSource(com.onedelhi.secure.ec1, com.onedelhi.secure.ec1):java.lang.Object");
    }

    @zw1
    @uw1(name = "create")
    @vr2
    public static final ResponseBody create(@vr2 C5301fr frVar, @ss2 MediaType mediaType) {
        return Companion.create(frVar, mediaType);
    }

    @zw1
    @uw1(name = "create")
    @vr2
    public static final ResponseBody create(@vr2 C6893to toVar, @ss2 MediaType mediaType, long j) {
        return Companion.create(toVar, mediaType, j);
    }

    @zw1
    @uw1(name = "create")
    @vr2
    public static final ResponseBody create(@vr2 String str, @ss2 MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    @zw1
    @vr2
    @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    public static final ResponseBody create(@ss2 MediaType mediaType, long j, @vr2 C6893to toVar) {
        return Companion.create(mediaType, j, toVar);
    }

    @zw1
    @vr2
    @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    public static final ResponseBody create(@ss2 MediaType mediaType, @vr2 C5301fr frVar) {
        return Companion.create(mediaType, frVar);
    }

    @zw1
    @vr2
    @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    public static final ResponseBody create(@ss2 MediaType mediaType, @vr2 String str) {
        return Companion.create(mediaType, str);
    }

    @zw1
    @vr2
    @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    public static final ResponseBody create(@ss2 MediaType mediaType, @vr2 byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    @zw1
    @uw1(name = "create")
    @vr2
    public static final ResponseBody create(@vr2 byte[] bArr, @ss2 MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    @vr2
    public final InputStream byteStream() {
        return source().mo31696r();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        throw r1;
     */
    @com.onedelhi.secure.vr2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.C5301fr byteString() throws java.io.IOException {
        /*
            r7 = this;
            long r0 = r7.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0054
            com.onedelhi.secure.to r2 = r7.source()
            r3 = 0
            com.onedelhi.secure.fr r4 = r2.mo31697r0()     // Catch:{ all -> 0x004d }
            com.onedelhi.secure.C5630hz.m51313a(r2, r3)
            int r2 = r4.mo36274j0()
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x004c
            long r5 = (long) r2
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0028
            goto L_0x004c
        L_0x0028:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x004c:
            return r4
        L_0x004d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r1 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r2, r0)
            throw r1
        L_0x0054:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.byteString():com.onedelhi.secure.fr");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        throw r1;
     */
    @com.onedelhi.secure.vr2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] bytes() throws java.io.IOException {
        /*
            r7 = this;
            long r0 = r7.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0051
            com.onedelhi.secure.to r2 = r7.source()
            r3 = 0
            byte[] r4 = r2.mo31713u2()     // Catch:{ all -> 0x004a }
            com.onedelhi.secure.C5630hz.m51313a(r2, r3)
            int r2 = r4.length
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0049
            long r5 = (long) r2
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0025
            goto L_0x0049
        L_0x0025:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x0049:
            return r4
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r2, r0)
            throw r1
        L_0x0051:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.bytes():byte[]");
    }

    @vr2
    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    public void close() {
        nq4.m58711l(source());
    }

    public abstract long contentLength();

    @ss2
    public abstract MediaType contentType();

    @vr2
    public abstract C6893to source();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r0, r1);
     */
    @com.onedelhi.secure.vr2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String string() throws java.io.IOException {
        /*
            r3 = this;
            com.onedelhi.secure.to r0 = r3.source()
            java.nio.charset.Charset r1 = r3.charset()     // Catch:{ all -> 0x0015 }
            java.nio.charset.Charset r1 = com.onedelhi.secure.nq4.m58679Q(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r0.mo31671H2(r1)     // Catch:{ all -> 0x0015 }
            r2 = 0
            com.onedelhi.secure.C5630hz.m51313a(r0, r2)
            return r1
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.string():java.lang.String");
    }
}
