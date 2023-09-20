package okhttp3;

import com.onedelhi.secure.C6613qv;
import com.onedelhi.secure.cc1;
import com.onedelhi.secure.d12;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.t00;
import com.onedelhi.secure.vr2;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo38105d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, mo38106k = 3, mo38107mv = {1, 4, 0})
public final class CertificatePinner$check$1 extends d12 implements cc1<List<? extends X509Certificate>> {
    public final /* synthetic */ String $hostname;
    public final /* synthetic */ List $peerCertificates;
    public final /* synthetic */ CertificatePinner this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CertificatePinner$check$1(CertificatePinner certificatePinner, List list, String str) {
        super(0);
        this.this$0 = certificatePinner;
        this.$peerCertificates = list;
        this.$hostname = str;
    }

    @vr2
    public final List<X509Certificate> invoke() {
        List<Certificate> list;
        C6613qv certificateChainCleaner$okhttp = this.this$0.getCertificateChainCleaner$okhttp();
        if (certificateChainCleaner$okhttp == null || (list = certificateChainCleaner$okhttp.mo43140a(this.$peerCertificates, this.$hostname)) == null) {
            list = this.$peerCertificates;
        }
        ArrayList arrayList = new ArrayList(t00.m65073Z(list, 10));
        for (Certificate certificate : list) {
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
