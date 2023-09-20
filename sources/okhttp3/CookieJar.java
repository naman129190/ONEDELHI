package okhttp3;

import com.google.android.gms.common.internal.ImagesContract;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.rw1;
import com.onedelhi.secure.s00;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u000b"}, d2 = {"Lokhttp3/CookieJar;", "", "Lokhttp3/HttpUrl;", "url", "", "Lokhttp3/Cookie;", "cookies", "Lcom/onedelhi/secure/un4;", "saveFromResponse", "loadForRequest", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
public interface CookieJar {
    public static final Companion Companion = new Companion((wg0) null);
    @rw1
    @vr2
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000¨\u0006\u0001\u0002\u0007\n\u0005\bF0\u0001¨\u0006\u0006"}, mo38105d2 = {"Lokhttp3/CookieJar$Companion;", "", "()V", "NO_COOKIES", "Lokhttp3/CookieJar;", "NoCookies", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = null;

        @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lokhttp3/CookieJar$Companion$NoCookies;", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "", "Lokhttp3/Cookie;", "cookies", "Lcom/onedelhi/secure/un4;", "saveFromResponse", "loadForRequest", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class NoCookies implements CookieJar {
            @vr2
            public List<Cookie> loadForRequest(@vr2 HttpUrl httpUrl) {
                jt1.m53777p(httpUrl, ImagesContract.URL);
                return s00.m64037F();
            }

            public void saveFromResponse(@vr2 HttpUrl httpUrl, @vr2 List<Cookie> list) {
                jt1.m53777p(httpUrl, ImagesContract.URL);
                jt1.m53777p(list, "cookies");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(wg0 wg0) {
            this();
        }
    }

    @vr2
    List<Cookie> loadForRequest(@vr2 HttpUrl httpUrl);

    void saveFromResponse(@vr2 HttpUrl httpUrl, @vr2 List<Cookie> list);
}
