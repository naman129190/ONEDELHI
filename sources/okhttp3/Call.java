package okhttp3;

import com.onedelhi.secure.ii2;
import com.onedelhi.secure.me4;
import com.onedelhi.secure.vr2;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0011J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u0000H&¨\u0006\u0012"}, d2 = {"Lokhttp3/Call;", "", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "execute", "Lokhttp3/Callback;", "responseCallback", "Lcom/onedelhi/secure/un4;", "enqueue", "cancel", "", "isExecuted", "isCanceled", "Lcom/onedelhi/secure/me4;", "timeout", "clone", "Factory", "okhttp"}, k = 1, mv = {1, 4, 0})
public interface Call extends Cloneable {

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo38105d2 = {"Lokhttp3/Call$Factory;", "", "newCall", "Lokhttp3/Call;", "request", "Lokhttp3/Request;", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
    public interface Factory {
        @vr2
        Call newCall(@vr2 Request request);
    }

    void cancel();

    @vr2
    Call clone();

    void enqueue(@vr2 Callback callback);

    @vr2
    Response execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    @vr2
    Request request();

    @vr2
    me4 timeout();
}
