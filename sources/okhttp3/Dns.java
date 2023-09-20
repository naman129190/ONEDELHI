package okhttp3;

import com.onedelhi.secure.C4478ab;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.rw1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, mo38105d2 = {"Lokhttp3/Dns;", "", "lookup", "", "Ljava/net/InetAddress;", "hostname", "", "Companion", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
public interface Dns {
    public static final Companion Companion = new Companion((wg0) null);
    @rw1
    @vr2
    public static final Dns SYSTEM = new Companion.DnsSystem();

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000¨\u0006\u0001\u0002\u0007\n\u0005\bF0\u0001¨\u0006\u0006"}, mo38105d2 = {"Lokhttp3/Dns$Companion;", "", "()V", "SYSTEM", "Lokhttp3/Dns;", "DnsSystem", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = null;

        @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo38105d2 = {"Lokhttp3/Dns$Companion$DnsSystem;", "Lokhttp3/Dns;", "()V", "lookup", "", "Ljava/net/InetAddress;", "hostname", "", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
        public static final class DnsSystem implements Dns {
            @vr2
            public List<InetAddress> lookup(@vr2 String str) {
                jt1.m53777p(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    jt1.m53776o(allByName, "InetAddress.getAllByName(hostname)");
                    return C4478ab.m37236iz(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(wg0 wg0) {
            this();
        }
    }

    @vr2
    List<InetAddress> lookup(@vr2 String str) throws UnknownHostException;
}
