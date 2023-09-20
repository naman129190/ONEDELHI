package okhttp3;

import com.onedelhi.secure.C5301fr;
import com.onedelhi.secure.C6785so;
import com.onedelhi.secure.ak0;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.nq4;
import com.onedelhi.secure.oi3;
import com.onedelhi.secure.rw1;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.tk4;
import com.onedelhi.secure.uw1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.vw1;
import com.onedelhi.secure.wg0;
import com.onedelhi.secure.xj0;
import com.onedelhi.secure.zw1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;

@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0003'&(B'\b\u0000\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0018¢\u0006\u0004\b$\u0010%J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u0010\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001c\u001a\u00020\u0006H\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0017\u0010\u0010\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0007¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u0006)"}, d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Lcom/onedelhi/secure/so;", "sink", "", "countBytes", "", "writeOrCountBytes", "", "index", "Lokhttp3/MultipartBody$Part;", "part", "Lokhttp3/MediaType;", "contentType", "-deprecated_type", "()Lokhttp3/MediaType;", "type", "", "-deprecated_boundary", "()Ljava/lang/String;", "boundary", "-deprecated_size", "()I", "size", "", "-deprecated_parts", "()Ljava/util/List;", "parts", "contentLength", "Lcom/onedelhi/secure/un4;", "writeTo", "Lokhttp3/MediaType;", "J", "Ljava/util/List;", "Lcom/onedelhi/secure/fr;", "boundaryByteString", "<init>", "(Lcom/onedelhi/secure/fr;Lokhttp3/MediaType;Ljava/util/List;)V", "Companion", "Builder", "Part", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class MultipartBody extends RequestBody {
    @rw1
    @vr2
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE = {(byte) 58, (byte) 32};
    private static final byte[] CRLF = {(byte) 13, (byte) 10};
    public static final Companion Companion = new Companion((wg0) null);
    private static final byte[] DASHDASH;
    @rw1
    @vr2
    public static final MediaType DIGEST;
    @rw1
    @vr2
    public static final MediaType FORM;
    @rw1
    @vr2
    public static final MediaType MIXED;
    @rw1
    @vr2
    public static final MediaType PARALLEL;
    private final C5301fr boundaryByteString;
    private long contentLength = -1;
    private final MediaType contentType;
    @vr2
    private final List<Part> parts;
    @vr2
    private final MediaType type;

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ \u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lokhttp3/MultipartBody$Builder;", "", "Lokhttp3/MediaType;", "type", "setType", "Lokhttp3/RequestBody;", "body", "addPart", "Lokhttp3/Headers;", "headers", "", "name", "value", "addFormDataPart", "filename", "Lokhttp3/MultipartBody$Part;", "part", "Lokhttp3/MultipartBody;", "build", "Lokhttp3/MediaType;", "", "parts", "Ljava/util/List;", "boundary", "<init>", "(Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Builder {
        private final C5301fr boundary;
        private final List<Part> parts;
        private MediaType type;

        @vw1
        public Builder() {
            this((String) null, 1, (wg0) null);
        }

        @vw1
        public Builder(@vr2 String str) {
            jt1.m53777p(str, "boundary");
            this.boundary = C5301fr.f28633a.mo36296l(str);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Builder(java.lang.String r1, int r2, com.onedelhi.secure.wg0 r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0011
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "UUID.randomUUID().toString()"
                com.onedelhi.secure.jt1.m53776o(r1, r2)
            L_0x0011:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.Builder.<init>(java.lang.String, int, com.onedelhi.secure.wg0):void");
        }

        @vr2
        public final Builder addFormDataPart(@vr2 String str, @vr2 String str2) {
            jt1.m53777p(str, "name");
            jt1.m53777p(str2, "value");
            addPart(Part.Companion.createFormData(str, str2));
            return this;
        }

        @vr2
        public final Builder addFormDataPart(@vr2 String str, @ss2 String str2, @vr2 RequestBody requestBody) {
            jt1.m53777p(str, "name");
            jt1.m53777p(requestBody, "body");
            addPart(Part.Companion.createFormData(str, str2, requestBody));
            return this;
        }

        @vr2
        public final Builder addPart(@ss2 Headers headers, @vr2 RequestBody requestBody) {
            jt1.m53777p(requestBody, "body");
            addPart(Part.Companion.create(headers, requestBody));
            return this;
        }

        @vr2
        public final Builder addPart(@vr2 Part part) {
            jt1.m53777p(part, "part");
            this.parts.add(part);
            return this;
        }

        @vr2
        public final Builder addPart(@vr2 RequestBody requestBody) {
            jt1.m53777p(requestBody, "body");
            addPart(Part.Companion.create(requestBody));
            return this;
        }

        @vr2
        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, nq4.m58696d0(this.parts));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        @vr2
        public final Builder setType(@vr2 MediaType mediaType) {
            jt1.m53777p(mediaType, "type");
            if (jt1.m53768g(mediaType.type(), "multipart")) {
                this.type = mediaType;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + mediaType).toString());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\t\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0018"}, d2 = {"Lokhttp3/MultipartBody$Companion;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "key", "Lcom/onedelhi/secure/un4;", "appendQuotedString$okhttp", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "appendQuotedString", "Lokhttp3/MediaType;", "ALTERNATIVE", "Lokhttp3/MediaType;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wg0 wg0) {
            this();
        }

        public final void appendQuotedString$okhttp(@vr2 StringBuilder sb, @vr2 String str) {
            String str2;
            jt1.m53777p(sb, "$this$appendQuotedString");
            jt1.m53777p(str, "key");
            sb.append(tk4.f35693a);
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == 10) {
                    str2 = "%0A";
                } else if (charAt == 13) {
                    str2 = "%0D";
                } else if (charAt != '\"') {
                    sb.append(charAt);
                } else {
                    str2 = "%22";
                }
                sb.append(str2);
            }
            sb.append(tk4.f35693a);
        }
    }

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\tJ\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\nR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\b¨\u0006\f"}, mo38105d2 = {"Lokhttp3/MultipartBody$Part;", "", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", "()Lokhttp3/RequestBody;", "()Lokhttp3/Headers;", "-deprecated_body", "-deprecated_headers", "Companion", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
    public static final class Part {
        public static final Companion Companion = new Companion((wg0) null);
        @vr2
        private final RequestBody body;
        @ss2
        private final Headers headers;

        @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000e"}, mo38105d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "()V", "create", "Lokhttp3/MultipartBody$Part;", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "createFormData", "name", "", "value", "filename", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(wg0 wg0) {
                this();
            }

            @zw1
            @vr2
            public final Part create(@ss2 Headers headers, @vr2 RequestBody requestBody) {
                jt1.m53777p(requestBody, "body");
                boolean z = true;
                if ((headers != null ? headers.get("Content-Type") : null) == null) {
                    if ((headers != null ? headers.get("Content-Length") : null) != null) {
                        z = false;
                    }
                    if (z) {
                        return new Part(headers, requestBody, (wg0) null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            @zw1
            @vr2
            public final Part create(@vr2 RequestBody requestBody) {
                jt1.m53777p(requestBody, "body");
                return create((Headers) null, requestBody);
            }

            @zw1
            @vr2
            public final Part createFormData(@vr2 String str, @vr2 String str2) {
                jt1.m53777p(str, "name");
                jt1.m53777p(str2, "value");
                return createFormData(str, (String) null, RequestBody.Companion.create$default(RequestBody.Companion, str2, (MediaType) null, 1, (Object) null));
            }

            @zw1
            @vr2
            public final Part createFormData(@vr2 String str, @ss2 String str2, @vr2 RequestBody requestBody) {
                jt1.m53777p(str, "name");
                jt1.m53777p(requestBody, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    companion.appendQuotedString$okhttp(sb, str2);
                }
                String sb2 = sb.toString();
                jt1.m53776o(sb2, "StringBuilder().apply(builderAction).toString()");
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb2).build(), requestBody);
            }
        }

        private Part(Headers headers2, RequestBody requestBody) {
            this.headers = headers2;
            this.body = requestBody;
        }

        public /* synthetic */ Part(Headers headers2, RequestBody requestBody, wg0 wg0) {
            this(headers2, requestBody);
        }

        @zw1
        @vr2
        public static final Part create(@ss2 Headers headers2, @vr2 RequestBody requestBody) {
            return Companion.create(headers2, requestBody);
        }

        @zw1
        @vr2
        public static final Part create(@vr2 RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        @zw1
        @vr2
        public static final Part createFormData(@vr2 String str, @vr2 String str2) {
            return Companion.createFormData(str, str2);
        }

        @zw1
        @vr2
        public static final Part createFormData(@vr2 String str, @ss2 String str2, @vr2 RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }

        @uw1(name = "-deprecated_body")
        @vr2
        @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "body", imports = {}))
        /* renamed from: -deprecated_body  reason: not valid java name */
        public final RequestBody m74829deprecated_body() {
            return this.body;
        }

        @uw1(name = "-deprecated_headers")
        @ss2
        @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "headers", imports = {}))
        /* renamed from: -deprecated_headers  reason: not valid java name */
        public final Headers m74830deprecated_headers() {
            return this.headers;
        }

        @uw1(name = "body")
        @vr2
        public final RequestBody body() {
            return this.body;
        }

        @uw1(name = "headers")
        @ss2
        public final Headers headers() {
            return this.headers;
        }
    }

    static {
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        byte b = (byte) 45;
        DASHDASH = new byte[]{b, b};
    }

    public MultipartBody(@vr2 C5301fr frVar, @vr2 MediaType mediaType, @vr2 List<Part> list) {
        jt1.m53777p(frVar, "boundaryByteString");
        jt1.m53777p(mediaType, "type");
        jt1.m53777p(list, "parts");
        this.boundaryByteString = frVar;
        this.type = mediaType;
        this.parts = list;
        MediaType.Companion companion = MediaType.Companion;
        this.contentType = companion.get(mediaType + "; boundary=" + boundary());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: com.onedelhi.secure.so} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: com.onedelhi.secure.no} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.onedelhi.secure.no} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.onedelhi.secure.so} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.onedelhi.secure.no} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long writeOrCountBytes(com.onedelhi.secure.C6785so r13, boolean r14) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            com.onedelhi.secure.no r13 = new com.onedelhi.secure.no
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<okhttp3.MultipartBody$Part> r1 = r12.parts
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x0014:
            if (r5 >= r1) goto L_0x00ae
            java.util.List<okhttp3.MultipartBody$Part> r6 = r12.parts
            java.lang.Object r6 = r6.get(r5)
            okhttp3.MultipartBody$Part r6 = (okhttp3.MultipartBody.Part) r6
            okhttp3.Headers r7 = r6.headers()
            okhttp3.RequestBody r6 = r6.body()
            com.onedelhi.secure.jt1.m53774m(r13)
            byte[] r8 = DASHDASH
            r13.mo41221D2(r8)
            com.onedelhi.secure.fr r8 = r12.boundaryByteString
            r13.mo41287s(r8)
            byte[] r8 = CRLF
            r13.mo41221D2(r8)
            if (r7 == 0) goto L_0x005f
            int r8 = r7.size()
            r9 = 0
        L_0x003f:
            if (r9 >= r8) goto L_0x005f
            java.lang.String r10 = r7.name(r9)
            com.onedelhi.secure.so r10 = r13.mo41279n(r10)
            byte[] r11 = COLONSPACE
            com.onedelhi.secure.so r10 = r10.mo41221D2(r11)
            java.lang.String r11 = r7.value(r9)
            com.onedelhi.secure.so r10 = r10.mo41279n(r11)
            byte[] r11 = CRLF
            r10.mo41221D2(r11)
            int r9 = r9 + 1
            goto L_0x003f
        L_0x005f:
            okhttp3.MediaType r7 = r6.contentType()
            if (r7 == 0) goto L_0x0078
            java.lang.String r8 = "Content-Type: "
            com.onedelhi.secure.so r8 = r13.mo41279n(r8)
            java.lang.String r7 = r7.toString()
            com.onedelhi.secure.so r7 = r8.mo41279n(r7)
            byte[] r8 = CRLF
            r7.mo41221D2(r8)
        L_0x0078:
            long r7 = r6.contentLength()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0092
            java.lang.String r9 = "Content-Length: "
            com.onedelhi.secure.so r9 = r13.mo41279n(r9)
            com.onedelhi.secure.so r9 = r9.mo41242S1(r7)
            byte[] r10 = CRLF
            r9.mo41221D2(r10)
            goto L_0x009b
        L_0x0092:
            if (r14 == 0) goto L_0x009b
            com.onedelhi.secure.jt1.m53774m(r0)
            r0.mo41255c()
            return r9
        L_0x009b:
            byte[] r9 = CRLF
            r13.mo41221D2(r9)
            if (r14 == 0) goto L_0x00a4
            long r3 = r3 + r7
            goto L_0x00a7
        L_0x00a4:
            r6.writeTo(r13)
        L_0x00a7:
            r13.mo41221D2(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00ae:
            com.onedelhi.secure.jt1.m53774m(r13)
            byte[] r1 = DASHDASH
            r13.mo41221D2(r1)
            com.onedelhi.secure.fr r2 = r12.boundaryByteString
            r13.mo41287s(r2)
            r13.mo41221D2(r1)
            byte[] r1 = CRLF
            r13.mo41221D2(r1)
            if (r14 == 0) goto L_0x00d0
            com.onedelhi.secure.jt1.m53774m(r0)
            long r13 = r0.mo41244V0()
            long r3 = r3 + r13
            r0.mo41255c()
        L_0x00d0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.writeOrCountBytes(com.onedelhi.secure.so, boolean):long");
    }

    @uw1(name = "-deprecated_boundary")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "boundary", imports = {}))
    /* renamed from: -deprecated_boundary  reason: not valid java name */
    public final String m74825deprecated_boundary() {
        return boundary();
    }

    @uw1(name = "-deprecated_parts")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "parts", imports = {}))
    /* renamed from: -deprecated_parts  reason: not valid java name */
    public final List<Part> m74826deprecated_parts() {
        return this.parts;
    }

    @uw1(name = "-deprecated_size")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "size", imports = {}))
    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m74827deprecated_size() {
        return size();
    }

    @uw1(name = "-deprecated_type")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "type", imports = {}))
    /* renamed from: -deprecated_type  reason: not valid java name */
    public final MediaType m74828deprecated_type() {
        return this.type;
    }

    @uw1(name = "boundary")
    @vr2
    public final String boundary() {
        return this.boundaryByteString.mo36280u0();
    }

    public long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long writeOrCountBytes = writeOrCountBytes((C6785so) null, true);
        this.contentLength = writeOrCountBytes;
        return writeOrCountBytes;
    }

    @vr2
    public MediaType contentType() {
        return this.contentType;
    }

    @vr2
    public final Part part(int i) {
        return this.parts.get(i);
    }

    @uw1(name = "parts")
    @vr2
    public final List<Part> parts() {
        return this.parts;
    }

    @uw1(name = "size")
    public final int size() {
        return this.parts.size();
    }

    @uw1(name = "type")
    @vr2
    public final MediaType type() {
        return this.type;
    }

    public void writeTo(@vr2 C6785so soVar) throws IOException {
        jt1.m53777p(soVar, "sink");
        writeOrCountBytes(soVar, false);
    }
}
