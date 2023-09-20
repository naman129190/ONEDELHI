package okhttp3;

import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.ku1;
import com.onedelhi.secure.rw1;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;
import java.io.IOException;

@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, mo38105d2 = {"Lokhttp3/Authenticator;", "", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "Companion", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
public interface Authenticator {
    public static final Companion Companion = new Companion((wg0) null);
    @rw1
    @vr2
    public static final Authenticator JAVA_NET_AUTHENTICATOR = new ku1((Dns) null, 1, (wg0) null);
    @rw1
    @vr2
    public static final Authenticator NONE = new Companion.AuthenticatorNone();

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000¨\u0006\u0001\u0002\u0007\n\u0005\bF0\u0001¨\u0006\u0007"}, mo38105d2 = {"Lokhttp3/Authenticator$Companion;", "", "()V", "JAVA_NET_AUTHENTICATOR", "Lokhttp3/Authenticator;", "NONE", "AuthenticatorNone", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = null;

        @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo38105d2 = {"Lokhttp3/Authenticator$Companion$AuthenticatorNone;", "Lokhttp3/Authenticator;", "()V", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
        public static final class AuthenticatorNone implements Authenticator {
            @ss2
            public Request authenticate(@ss2 Route route, @vr2 Response response) {
                jt1.m53777p(response, "response");
                return null;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(wg0 wg0) {
            this();
        }
    }

    @ss2
    Request authenticate(@ss2 Route route, @vr2 Response response) throws IOException;
}
