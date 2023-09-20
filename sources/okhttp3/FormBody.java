package okhttp3;

import com.onedelhi.secure.C6205no;
import com.onedelhi.secure.C6785so;
import com.onedelhi.secure.ak0;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.nq4;
import com.onedelhi.secure.oi3;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.uw1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.vw1;
import com.onedelhi.secure.wg0;
import com.onedelhi.secure.xj0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB%\b\u0000\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bJ\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u001f"}, d2 = {"Lokhttp3/FormBody;", "Lokhttp3/RequestBody;", "Lcom/onedelhi/secure/so;", "sink", "", "countBytes", "", "writeOrCountBytes", "", "-deprecated_size", "()I", "size", "index", "", "encodedName", "name", "encodedValue", "value", "Lokhttp3/MediaType;", "contentType", "contentLength", "Lcom/onedelhi/secure/un4;", "writeTo", "", "encodedNames", "Ljava/util/List;", "encodedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class FormBody extends RequestBody {
    private static final MediaType CONTENT_TYPE = MediaType.Companion.get("application/x-www-form-urlencoded");
    public static final Companion Companion = new Companion((wg0) null);
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo38105d2 = {"Lokhttp3/FormBody$Builder;", "", "charset", "Ljava/nio/charset/Charset;", "(Ljava/nio/charset/Charset;)V", "names", "", "", "values", "add", "name", "value", "addEncoded", "build", "Lokhttp3/FormBody;", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        @vw1
        public Builder() {
            this((Charset) null, 1, (wg0) null);
        }

        @vw1
        public Builder(@ss2 Charset charset2) {
            this.charset = charset2;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Builder(Charset charset2, int i, wg0 wg0) {
            this((i & 1) != 0 ? null : charset2);
        }

        @vr2
        public final Builder add(@vr2 String str, @vr2 String str2) {
            String str3 = str;
            jt1.m53777p(str3, "name");
            jt1.m53777p(str2, "value");
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str3, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, (Object) null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, (Object) null));
            return this;
        }

        @vr2
        public final Builder addEncoded(@vr2 String str, @vr2 String str2) {
            String str3 = str;
            jt1.m53777p(str3, "name");
            jt1.m53777p(str2, "value");
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str3, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, (Object) null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, (Object) null));
            return this;
        }

        @vr2
        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }
    }

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo38105d2 = {"Lokhttp3/FormBody$Companion;", "", "()V", "CONTENT_TYPE", "Lokhttp3/MediaType;", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wg0 wg0) {
            this();
        }
    }

    public FormBody(@vr2 List<String> list, @vr2 List<String> list2) {
        jt1.m53777p(list, "encodedNames");
        jt1.m53777p(list2, "encodedValues");
        this.encodedNames = nq4.m58696d0(list);
        this.encodedValues = nq4.m58696d0(list2);
    }

    private final long writeOrCountBytes(C6785so soVar, boolean z) {
        C6205no noVar;
        if (z) {
            noVar = new C6205no();
        } else {
            jt1.m53774m(soVar);
            noVar = soVar.mo31682e();
        }
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                noVar.mo41230L0(38);
            }
            noVar.mo41279n(this.encodedNames.get(i));
            noVar.mo41230L0(61);
            noVar.mo41279n(this.encodedValues.get(i));
        }
        if (!z) {
            return 0;
        }
        long V0 = noVar.mo41244V0();
        noVar.mo41255c();
        return V0;
    }

    @uw1(name = "-deprecated_size")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "size", imports = {}))
    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m74787deprecated_size() {
        return size();
    }

    public long contentLength() {
        return writeOrCountBytes((C6785so) null, true);
    }

    @vr2
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    @vr2
    public final String encodedName(int i) {
        return this.encodedNames.get(i);
    }

    @vr2
    public final String encodedValue(int i) {
        return this.encodedValues.get(i);
    }

    @vr2
    public final String name(int i) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedName(i), 0, 0, true, 3, (Object) null);
    }

    @uw1(name = "size")
    public final int size() {
        return this.encodedNames.size();
    }

    @vr2
    public final String value(int i) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedValue(i), 0, 0, true, 3, (Object) null);
    }

    public void writeTo(@vr2 C6785so soVar) throws IOException {
        jt1.m53777p(soVar, "sink");
        writeOrCountBytes(soVar, false);
    }
}
