package okhttp3;

import com.onedelhi.secure.ss2;
import java.io.File;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"okhttp3/RequestBody$Companion$asRequestBody$1", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lcom/onedelhi/secure/so;", "sink", "Lcom/onedelhi/secure/un4;", "writeTo", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {
    public final /* synthetic */ MediaType $contentType;
    public final /* synthetic */ File $this_asRequestBody;

    public RequestBody$Companion$asRequestBody$1(File file, MediaType mediaType) {
        this.$this_asRequestBody = file;
        this.$contentType = mediaType;
    }

    public long contentLength() {
        return this.$this_asRequestBody.length();
    }

    @ss2
    public MediaType contentType() {
        return this.$contentType;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r0, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeTo(@com.onedelhi.secure.vr2 com.onedelhi.secure.C6785so r3) {
        /*
            r2 = this;
            java.lang.String r0 = "sink"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            java.io.File r0 = r2.$this_asRequestBody
            com.onedelhi.secure.x04 r0 = com.onedelhi.secure.gu2.m49843l(r0)
            r3.mo41235N(r0)     // Catch:{ all -> 0x0013 }
            r3 = 0
            com.onedelhi.secure.C5630hz.m51313a(r0, r3)
            return
        L_0x0013:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r1 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody$Companion$asRequestBody$1.writeTo(com.onedelhi.secure.so):void");
    }
}
