package okhttp3;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.onedelhi.secure.C5301fr;
import com.onedelhi.secure.C5604hx;
import com.onedelhi.secure.C6785so;
import com.onedelhi.secure.ak0;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.nq4;
import com.onedelhi.secure.oi3;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.uw1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.vw1;
import com.onedelhi.secure.wg0;
import com.onedelhi.secure.xj0;
import com.onedelhi.secure.zw1;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import okhttp3.MediaType;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lokhttp3/RequestBody;", "", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lcom/onedelhi/secure/so;", "sink", "Lcom/onedelhi/secure/un4;", "writeTo", "", "isDuplex", "isOneShot", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
public abstract class RequestBody {
    public static final Companion Companion = new Companion((wg0) null);

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\b\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u0005*\u00020\t2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\nJ3\u0010\b\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0006\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u0005*\u00020\u00102\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0011J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0007J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\tH\u0007J.\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0010H\u0007¨\u0006\u0017"}, d2 = {"Lokhttp3/RequestBody$Companion;", "", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/RequestBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "toRequestBody", "Lcom/onedelhi/secure/fr;", "(Lcom/onedelhi/secure/fr;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "", "", "offset", "byteCount", "([BLokhttp3/MediaType;II)Lokhttp3/RequestBody;", "Ljava/io/File;", "(Ljava/io/File;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "asRequestBody", "content", "file", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wg0 wg0) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, C5301fr frVar, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(frVar, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return companion.create(mediaType, bArr, i, i2);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return companion.create(bArr, mediaType, i, i2);
        }

        @zw1
        @uw1(name = "create")
        @vr2
        public final RequestBody create(@vr2 C5301fr frVar, @ss2 MediaType mediaType) {
            jt1.m53777p(frVar, "$this$toRequestBody");
            return new RequestBody$Companion$toRequestBody$1(frVar, mediaType);
        }

        @zw1
        @uw1(name = "create")
        @vr2
        public final RequestBody create(@vr2 File file, @ss2 MediaType mediaType) {
            jt1.m53777p(file, "$this$asRequestBody");
            return new RequestBody$Companion$asRequestBody$1(file, mediaType);
        }

        @zw1
        @uw1(name = "create")
        @vr2
        public final RequestBody create(@vr2 String str, @ss2 MediaType mediaType) {
            jt1.m53777p(str, "$this$toRequestBody");
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
            byte[] bytes = str.getBytes(charset);
            jt1.m53776o(bytes, "(this as java.lang.String).getBytes(charset)");
            return create(bytes, mediaType, 0, bytes.length);
        }

        @zw1
        @vr2
        @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        public final RequestBody create(@ss2 MediaType mediaType, @vr2 C5301fr frVar) {
            jt1.m53777p(frVar, FirebaseAnalytics.C4305d.f24947P);
            return create(frVar, mediaType);
        }

        @zw1
        @vr2
        @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @oi3(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        public final RequestBody create(@ss2 MediaType mediaType, @vr2 File file) {
            jt1.m53777p(file, "file");
            return create(file, mediaType);
        }

        @zw1
        @vr2
        @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        public final RequestBody create(@ss2 MediaType mediaType, @vr2 String str) {
            jt1.m53777p(str, FirebaseAnalytics.C4305d.f24947P);
            return create(str, mediaType);
        }

        @zw1
        @vr2
        @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @vw1
        public final RequestBody create(@ss2 MediaType mediaType, @vr2 byte[] bArr) {
            return create$default(this, mediaType, bArr, 0, 0, 12, (Object) null);
        }

        @zw1
        @vr2
        @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @vw1
        public final RequestBody create(@ss2 MediaType mediaType, @vr2 byte[] bArr, int i) {
            return create$default(this, mediaType, bArr, i, 0, 8, (Object) null);
        }

        @zw1
        @vr2
        @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @vw1
        public final RequestBody create(@ss2 MediaType mediaType, @vr2 byte[] bArr, int i, int i2) {
            jt1.m53777p(bArr, FirebaseAnalytics.C4305d.f24947P);
            return create(bArr, mediaType, i, i2);
        }

        @zw1
        @uw1(name = "create")
        @vr2
        @vw1
        public final RequestBody create(@vr2 byte[] bArr) {
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        @zw1
        @uw1(name = "create")
        @vr2
        @vw1
        public final RequestBody create(@vr2 byte[] bArr, @ss2 MediaType mediaType) {
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        @zw1
        @uw1(name = "create")
        @vr2
        @vw1
        public final RequestBody create(@vr2 byte[] bArr, @ss2 MediaType mediaType, int i) {
            return create$default(this, bArr, mediaType, i, 0, 4, (Object) null);
        }

        @zw1
        @uw1(name = "create")
        @vr2
        @vw1
        public final RequestBody create(@vr2 byte[] bArr, @ss2 MediaType mediaType, int i, int i2) {
            jt1.m53777p(bArr, "$this$toRequestBody");
            nq4.m58709k((long) bArr.length, (long) i, (long) i2);
            return new RequestBody$Companion$toRequestBody$2(bArr, mediaType, i2, i);
        }
    }

    @zw1
    @uw1(name = "create")
    @vr2
    public static final RequestBody create(@vr2 C5301fr frVar, @ss2 MediaType mediaType) {
        return Companion.create(frVar, mediaType);
    }

    @zw1
    @uw1(name = "create")
    @vr2
    public static final RequestBody create(@vr2 File file, @ss2 MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    @zw1
    @uw1(name = "create")
    @vr2
    public static final RequestBody create(@vr2 String str, @ss2 MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    @zw1
    @vr2
    @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    public static final RequestBody create(@ss2 MediaType mediaType, @vr2 C5301fr frVar) {
        return Companion.create(mediaType, frVar);
    }

    @zw1
    @vr2
    @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @oi3(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    public static final RequestBody create(@ss2 MediaType mediaType, @vr2 File file) {
        return Companion.create(mediaType, file);
    }

    @zw1
    @vr2
    @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    public static final RequestBody create(@ss2 MediaType mediaType, @vr2 String str) {
        return Companion.create(mediaType, str);
    }

    @zw1
    @vr2
    @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @vw1
    public static final RequestBody create(@ss2 MediaType mediaType, @vr2 byte[] bArr) {
        return Companion.create$default(Companion, mediaType, bArr, 0, 0, 12, (Object) null);
    }

    @zw1
    @vr2
    @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @vw1
    public static final RequestBody create(@ss2 MediaType mediaType, @vr2 byte[] bArr, int i) {
        return Companion.create$default(Companion, mediaType, bArr, i, 0, 8, (Object) null);
    }

    @zw1
    @vr2
    @xj0(level = ak0.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @oi3(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @vw1
    public static final RequestBody create(@ss2 MediaType mediaType, @vr2 byte[] bArr, int i, int i2) {
        return Companion.create(mediaType, bArr, i, i2);
    }

    @zw1
    @uw1(name = "create")
    @vr2
    @vw1
    public static final RequestBody create(@vr2 byte[] bArr) {
        return Companion.create$default(Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
    }

    @zw1
    @uw1(name = "create")
    @vr2
    @vw1
    public static final RequestBody create(@vr2 byte[] bArr, @ss2 MediaType mediaType) {
        return Companion.create$default(Companion, bArr, mediaType, 0, 0, 6, (Object) null);
    }

    @zw1
    @uw1(name = "create")
    @vr2
    @vw1
    public static final RequestBody create(@vr2 byte[] bArr, @ss2 MediaType mediaType, int i) {
        return Companion.create$default(Companion, bArr, mediaType, i, 0, 4, (Object) null);
    }

    @zw1
    @uw1(name = "create")
    @vr2
    @vw1
    public static final RequestBody create(@vr2 byte[] bArr, @ss2 MediaType mediaType, int i, int i2) {
        return Companion.create(bArr, mediaType, i, i2);
    }

    public long contentLength() throws IOException {
        return -1;
    }

    @ss2
    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@vr2 C6785so soVar) throws IOException;
}
