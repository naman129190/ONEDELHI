package okhttp3;

import com.onedelhi.secure.ii2;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.vr2;
import java.net.Socket;

@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\n"}, mo38105d2 = {"Lokhttp3/Connection;", "", "handshake", "Lokhttp3/Handshake;", "protocol", "Lokhttp3/Protocol;", "route", "Lokhttp3/Route;", "socket", "Ljava/net/Socket;", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
public interface Connection {
    @ss2
    Handshake handshake();

    @vr2
    Protocol protocol();

    @vr2
    Route route();

    @vr2
    Socket socket();
}
