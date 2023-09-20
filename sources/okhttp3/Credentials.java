package okhttp3;

import com.onedelhi.secure.C5301fr;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.vw1;
import com.onedelhi.secure.zw1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, mo38105d2 = {"Lokhttp3/Credentials;", "", "()V", "basic", "", "username", "password", "charset", "Ljava/nio/charset/Charset;", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    @vw1
    @zw1
    @vr2
    public static final String basic(@vr2 String str, @vr2 String str2) {
        return basic$default(str, str2, (Charset) null, 4, (Object) null);
    }

    @vw1
    @zw1
    @vr2
    public static final String basic(@vr2 String str, @vr2 String str2, @vr2 Charset charset) {
        jt1.m53777p(str, "username");
        jt1.m53777p(str2, "password");
        jt1.m53777p(charset, "charset");
        String g = C5301fr.f28633a.mo36295j(str + ':' + str2, charset).mo31169g();
        return "Basic " + g;
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            jt1.m53776o(charset, "ISO_8859_1");
        }
        return basic(str, str2, charset);
    }
}
