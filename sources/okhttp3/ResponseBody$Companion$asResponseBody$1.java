package okhttp3;

import com.onedelhi.secure.C6893to;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.vr2;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"okhttp3/ResponseBody$Companion$asResponseBody$1", "Lokhttp3/ResponseBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lcom/onedelhi/secure/to;", "source", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {
    public final /* synthetic */ long $contentLength;
    public final /* synthetic */ MediaType $contentType;
    public final /* synthetic */ C6893to $this_asResponseBody;

    public ResponseBody$Companion$asResponseBody$1(C6893to toVar, MediaType mediaType, long j) {
        this.$this_asResponseBody = toVar;
        this.$contentType = mediaType;
        this.$contentLength = j;
    }

    public long contentLength() {
        return this.$contentLength;
    }

    @ss2
    public MediaType contentType() {
        return this.$contentType;
    }

    @vr2
    public C6893to source() {
        return this.$this_asResponseBody;
    }
}
