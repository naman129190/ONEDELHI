package okhttp3;

import com.onedelhi.secure.cc1;
import com.onedelhi.secure.d12;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.s00;
import com.onedelhi.secure.vr2;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo38105d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, mo38106k = 3, mo38107mv = {1, 4, 0})
public final class Handshake$peerCertificates$2 extends d12 implements cc1<List<? extends Certificate>> {
    public final /* synthetic */ cc1 $peerCertificatesFn;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Handshake$peerCertificates$2(cc1 cc1) {
        super(0);
        this.$peerCertificatesFn = cc1;
    }

    @vr2
    public final List<Certificate> invoke() {
        try {
            return (List) this.$peerCertificatesFn.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return s00.m64037F();
        }
    }
}
