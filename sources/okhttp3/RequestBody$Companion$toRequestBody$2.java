package okhttp3;

import com.onedelhi.secure.C6785so;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.vr2;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"okhttp3/RequestBody$Companion$toRequestBody$2", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lcom/onedelhi/secure/so;", "sink", "Lcom/onedelhi/secure/un4;", "writeTo", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class RequestBody$Companion$toRequestBody$2 extends RequestBody {
    public final /* synthetic */ int $byteCount;
    public final /* synthetic */ MediaType $contentType;
    public final /* synthetic */ int $offset;
    public final /* synthetic */ byte[] $this_toRequestBody;

    public RequestBody$Companion$toRequestBody$2(byte[] bArr, MediaType mediaType, int i, int i2) {
        this.$this_toRequestBody = bArr;
        this.$contentType = mediaType;
        this.$byteCount = i;
        this.$offset = i2;
    }

    public long contentLength() {
        return (long) this.$byteCount;
    }

    @ss2
    public MediaType contentType() {
        return this.$contentType;
    }

    public void writeTo(@vr2 C6785so soVar) {
        jt1.m53777p(soVar, "sink");
        soVar.mo41266h0(this.$this_toRequestBody, this.$offset, this.$byteCount);
    }
}
