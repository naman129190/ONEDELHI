package okhttp3;

import com.onedelhi.secure.ec1;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.vr2;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u0000 \u00072\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, mo38105d2 = {"Lokhttp3/Interceptor;", "", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Chain", "Companion", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
public interface Interceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0013\u001a\u00020\u0005H&¨\u0006\u0014"}, mo38105d2 = {"Lokhttp3/Interceptor$Chain;", "", "call", "Lokhttp3/Call;", "connectTimeoutMillis", "", "connection", "Lokhttp3/Connection;", "proceed", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "readTimeoutMillis", "withConnectTimeout", "timeout", "unit", "Ljava/util/concurrent/TimeUnit;", "withReadTimeout", "withWriteTimeout", "writeTimeoutMillis", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
    public interface Chain {
        @vr2
        Call call();

        int connectTimeoutMillis();

        @ss2
        Connection connection();

        @vr2
        Response proceed(@vr2 Request request) throws IOException;

        int readTimeoutMillis();

        @vr2
        Request request();

        @vr2
        Chain withConnectTimeout(int i, @vr2 TimeUnit timeUnit);

        @vr2
        Chain withReadTimeout(int i, @vr2 TimeUnit timeUnit);

        @vr2
        Chain withWriteTimeout(int i, @vr2 TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\n\u001a\u00020\t2#\b\u0004\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H\nø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\r"}, d2 = {"Lokhttp3/Interceptor$Companion;", "", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lcom/onedelhi/secure/iy2;", "name", "chain", "Lokhttp3/Response;", "block", "Lokhttp3/Interceptor;", "invoke", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @vr2
        public final Interceptor invoke(@vr2 ec1<? super Chain, Response> ec1) {
            jt1.m53777p(ec1, "block");
            return new Interceptor$Companion$invoke$1(ec1);
        }
    }

    @vr2
    Response intercept(@vr2 Chain chain) throws IOException;
}
