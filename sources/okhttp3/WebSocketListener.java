package okhttp3;

import com.onedelhi.secure.C5301fr;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.vr2;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/WebSocketListener;", "", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", "response", "Lcom/onedelhi/secure/un4;", "onOpen", "", "text", "onMessage", "Lcom/onedelhi/secure/fr;", "bytes", "", "code", "reason", "onClosing", "onClosed", "", "t", "onFailure", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public abstract class WebSocketListener {
    public void onClosed(@vr2 WebSocket webSocket, int i, @vr2 String str) {
        jt1.m53777p(webSocket, "webSocket");
        jt1.m53777p(str, "reason");
    }

    public void onClosing(@vr2 WebSocket webSocket, int i, @vr2 String str) {
        jt1.m53777p(webSocket, "webSocket");
        jt1.m53777p(str, "reason");
    }

    public void onFailure(@vr2 WebSocket webSocket, @vr2 Throwable th, @ss2 Response response) {
        jt1.m53777p(webSocket, "webSocket");
        jt1.m53777p(th, "t");
    }

    public void onMessage(@vr2 WebSocket webSocket, @vr2 C5301fr frVar) {
        jt1.m53777p(webSocket, "webSocket");
        jt1.m53777p(frVar, "bytes");
    }

    public void onMessage(@vr2 WebSocket webSocket, @vr2 String str) {
        jt1.m53777p(webSocket, "webSocket");
        jt1.m53777p(str, "text");
    }

    public void onOpen(@vr2 WebSocket webSocket, @vr2 Response response) {
        jt1.m53777p(webSocket, "webSocket");
        jt1.m53777p(response, "response");
    }
}
