package okhttp3;

import com.onedelhi.secure.C4478ab;
import com.onedelhi.secure.C5301fr;
import com.onedelhi.secure.C6613qv;
import com.onedelhi.secure.a10;
import com.onedelhi.secure.ar4;
import com.onedelhi.secure.cc1;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.lj4;
import com.onedelhi.secure.oi3;
import com.onedelhi.secure.rw1;
import com.onedelhi.secure.s00;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.t54;
import com.onedelhi.secure.u54;
import com.onedelhi.secure.vl1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;
import com.onedelhi.secure.xj0;
import com.onedelhi.secure.zw1;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\r\u0018\u0000 &2\u00020\u0001:\u0003'&(B#\b\u0000\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b$\u0010%J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\tH\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000fJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lokhttp3/CertificatePinner;", "", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "Lcom/onedelhi/secure/un4;", "check", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "check$okhttp", "(Ljava/lang/String;Lcom/onedelhi/secure/cc1;)V", "", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "Lokhttp3/CertificatePinner$Pin;", "findMatchingPins", "Lcom/onedelhi/secure/qv;", "certificateChainCleaner", "withCertificateChainCleaner$okhttp", "(Lcom/onedelhi/secure/qv;)Lokhttp3/CertificatePinner;", "withCertificateChainCleaner", "other", "", "equals", "", "hashCode", "", "pins", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "Lcom/onedelhi/secure/qv;", "getCertificateChainCleaner$okhttp", "()Lcom/onedelhi/secure/qv;", "<init>", "(Ljava/util/Set;Lcom/onedelhi/secure/qv;)V", "Companion", "Builder", "Pin", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class CertificatePinner {
    public static final Companion Companion = new Companion((wg0) null);
    @rw1
    @vr2
    public static final CertificatePinner DEFAULT = new Builder().build();
    @ss2
    private final C6613qv certificateChainCleaner;
    @vr2
    private final Set<Pin> pins;

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u000b\"\u00020\n¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, mo38105d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "()V", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "getPins", "()Ljava/util/List;", "add", "pattern", "", "", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "build", "Lokhttp3/CertificatePinner;", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
    public static final class Builder {
        @vr2
        private final List<Pin> pins = new ArrayList();

        @vr2
        public final Builder add(@vr2 String str, @vr2 String... strArr) {
            jt1.m53777p(str, "pattern");
            jt1.m53777p(strArr, "pins");
            for (String pin : strArr) {
                this.pins.add(new Pin(str, pin));
            }
            return this;
        }

        @vr2
        public final CertificatePinner build() {
            return new CertificatePinner(a10.m35794V5(this.pins), (C6613qv) null, 2, (wg0) null);
        }

        @vr2
        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "Ljava/security/cert/X509Certificate;", "Lcom/onedelhi/secure/fr;", "sha1Hash", "sha256Hash", "Ljava/security/cert/Certificate;", "certificate", "", "pin", "Lokhttp3/CertificatePinner;", "DEFAULT", "Lokhttp3/CertificatePinner;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wg0 wg0) {
            this();
        }

        @zw1
        @vr2
        public final String pin(@vr2 Certificate certificate) {
            jt1.m53777p(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + sha256Hash((X509Certificate) certificate).mo31169g();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        @zw1
        @vr2
        public final C5301fr sha1Hash(@vr2 X509Certificate x509Certificate) {
            jt1.m53777p(x509Certificate, "$this$sha1Hash");
            C5301fr.C5302a aVar = C5301fr.f28633a;
            PublicKey publicKey = x509Certificate.getPublicKey();
            jt1.m53776o(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            jt1.m53776o(encoded, "publicKey.encoded");
            return C5301fr.C5302a.m48446p(aVar, encoded, 0, 0, 3, (Object) null).mo36271g0();
        }

        @zw1
        @vr2
        public final C5301fr sha256Hash(@vr2 X509Certificate x509Certificate) {
            jt1.m53777p(x509Certificate, "$this$sha256Hash");
            C5301fr.C5302a aVar = C5301fr.f28633a;
            PublicKey publicKey = x509Certificate.getPublicKey();
            jt1.m53776o(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            jt1.m53776o(encoded, "publicKey.encoded");
            return C5301fr.C5302a.m48446p(aVar, encoded, 0, 0, 3, (Object) null).mo36272h0();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "", "hostname", "", "matchesHostname", "Ljava/security/cert/X509Certificate;", "certificate", "matchesCertificate", "toString", "other", "equals", "", "hashCode", "pattern", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "hashAlgorithm", "getHashAlgorithm", "Lcom/onedelhi/secure/fr;", "hash", "Lcom/onedelhi/secure/fr;", "getHash", "()Lcom/onedelhi/secure/fr;", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Pin {
        @vr2
        private final C5301fr hash;
        @vr2
        private final String hashAlgorithm;
        @vr2
        private final String pattern;

        public Pin(@vr2 String str, @vr2 String str2) {
            C5301fr h;
            jt1.m53777p(str, "pattern");
            jt1.m53777p(str2, "pin");
            if ((t54.m65466u2(str, "*.", false, 2, (Object) null) && u54.m66669r3(str, "*", 1, false, 4, (Object) null) == -1) || (t54.m65466u2(str, "**.", false, 2, (Object) null) && u54.m66669r3(str, "*", 2, false, 4, (Object) null) == -1) || u54.m66669r3(str, "*", 0, false, 6, (Object) null) == -1) {
                String e = vl1.m68221e(str);
                if (e != null) {
                    this.pattern = e;
                    if (t54.m65466u2(str2, "sha1/", false, 2, (Object) null)) {
                        this.hashAlgorithm = "sha1";
                        C5301fr.C5302a aVar = C5301fr.f28633a;
                        String substring = str2.substring(5);
                        jt1.m53776o(substring, "(this as java.lang.String).substring(startIndex)");
                        h = aVar.mo36293h(substring);
                        if (h == null) {
                            throw new IllegalArgumentException("Invalid pin hash: " + str2);
                        }
                    } else if (t54.m65466u2(str2, "sha256/", false, 2, (Object) null)) {
                        this.hashAlgorithm = "sha256";
                        C5301fr.C5302a aVar2 = C5301fr.f28633a;
                        String substring2 = str2.substring(7);
                        jt1.m53776o(substring2, "(this as java.lang.String).substring(startIndex)");
                        h = aVar2.mo36293h(substring2);
                        if (h == null) {
                            throw new IllegalArgumentException("Invalid pin hash: " + str2);
                        }
                    } else {
                        throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
                    }
                    this.hash = h;
                    return;
                }
                throw new IllegalArgumentException("Invalid pattern: " + str);
            }
            throw new IllegalArgumentException(("Unexpected pattern: " + str).toString());
        }

        public boolean equals(@ss2 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return !(jt1.m53768g(this.pattern, pin.pattern) ^ true) && !(jt1.m53768g(this.hashAlgorithm, pin.hashAlgorithm) ^ true) && !(jt1.m53768g(this.hash, pin.hash) ^ true);
        }

        @vr2
        public final C5301fr getHash() {
            return this.hash;
        }

        @vr2
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        @vr2
        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final boolean matchesCertificate(@vr2 X509Certificate x509Certificate) {
            C5301fr frVar;
            C5301fr frVar2;
            jt1.m53777p(x509Certificate, "certificate");
            String str = this.hashAlgorithm;
            int hashCode = str.hashCode();
            if (hashCode != -903629273) {
                if (hashCode == 3528965 && str.equals("sha1")) {
                    frVar2 = this.hash;
                    frVar = CertificatePinner.Companion.sha1Hash(x509Certificate);
                }
                return false;
            }
            if (str.equals("sha256")) {
                frVar2 = this.hash;
                frVar = CertificatePinner.Companion.sha256Hash(x509Certificate);
            }
            return false;
            return jt1.m53768g(frVar2, frVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x003f A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean matchesHostname(@com.onedelhi.secure.vr2 java.lang.String r12) {
            /*
                r11 = this;
                java.lang.String r0 = "hostname"
                com.onedelhi.secure.jt1.m53777p(r12, r0)
                java.lang.String r0 = r11.pattern
                java.lang.String r1 = "**."
                r2 = 0
                r3 = 2
                r4 = 0
                boolean r0 = com.onedelhi.secure.t54.m65466u2(r0, r1, r2, r3, r4)
                r1 = 1
                if (r0 == 0) goto L_0x0041
                java.lang.String r0 = r11.pattern
                int r0 = r0.length()
                int r7 = r0 + -3
                int r0 = r12.length()
                int r0 = r0 - r7
                int r3 = r12.length()
                int r4 = r3 - r7
                java.lang.String r5 = r11.pattern
                r6 = 3
                r8 = 0
                r9 = 16
                r10 = 0
                r3 = r12
                boolean r3 = com.onedelhi.secure.t54.m65436f2(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r3 == 0) goto L_0x0082
                if (r0 == 0) goto L_0x003f
                int r0 = r0 - r1
                char r12 = r12.charAt(r0)
                r0 = 46
                if (r12 != r0) goto L_0x0082
            L_0x003f:
                r2 = 1
                goto L_0x0082
            L_0x0041:
                java.lang.String r0 = r11.pattern
                java.lang.String r5 = "*."
                boolean r0 = com.onedelhi.secure.t54.m65466u2(r0, r5, r2, r3, r4)
                if (r0 == 0) goto L_0x007c
                java.lang.String r0 = r11.pattern
                int r0 = r0.length()
                int r7 = r0 + -1
                int r0 = r12.length()
                int r0 = r0 - r7
                int r3 = r12.length()
                int r4 = r3 - r7
                java.lang.String r5 = r11.pattern
                r6 = 1
                r8 = 0
                r9 = 16
                r10 = 0
                r3 = r12
                boolean r3 = com.onedelhi.secure.t54.m65436f2(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r3 == 0) goto L_0x0082
                r5 = 46
                int r6 = r0 + -1
                r7 = 0
                r8 = 4
                r9 = 0
                r4 = r12
                int r12 = com.onedelhi.secure.u54.m66542E3(r4, r5, r6, r7, r8, r9)
                r0 = -1
                if (r12 != r0) goto L_0x0082
                goto L_0x003f
            L_0x007c:
                java.lang.String r0 = r11.pattern
                boolean r2 = com.onedelhi.secure.jt1.m53768g(r12, r0)
            L_0x0082:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.Pin.matchesHostname(java.lang.String):boolean");
        }

        @vr2
        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.mo31169g();
        }
    }

    public CertificatePinner(@vr2 Set<Pin> set, @ss2 C6613qv qvVar) {
        jt1.m53777p(set, "pins");
        this.pins = set;
        this.certificateChainCleaner = qvVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CertificatePinner(Set set, C6613qv qvVar, int i, wg0 wg0) {
        this(set, (i & 2) != 0 ? null : qvVar);
    }

    @zw1
    @vr2
    public static final String pin(@vr2 Certificate certificate) {
        return Companion.pin(certificate);
    }

    @zw1
    @vr2
    public static final C5301fr sha1Hash(@vr2 X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    @zw1
    @vr2
    public static final C5301fr sha256Hash(@vr2 X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(@vr2 String str, @vr2 List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        jt1.m53777p(str, "hostname");
        jt1.m53777p(list, "peerCertificates");
        check$okhttp(str, new CertificatePinner$check$1(this, list, str));
    }

    @xj0(message = "replaced with {@link #check(String, List)}.", replaceWith = @oi3(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void check(@vr2 String str, @vr2 Certificate... certificateArr) throws SSLPeerUnverifiedException {
        jt1.m53777p(str, "hostname");
        jt1.m53777p(certificateArr, "peerCertificates");
        check(str, (List<? extends Certificate>) C4478ab.m37236iz(certificateArr));
    }

    public final void check$okhttp(@vr2 String str, @vr2 cc1<? extends List<? extends X509Certificate>> cc1) {
        Pin next;
        jt1.m53777p(str, "hostname");
        jt1.m53777p(cc1, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (!findMatchingPins.isEmpty()) {
            List<X509Certificate> list = (List) cc1.invoke();
            loop0:
            for (X509Certificate x509Certificate : list) {
                Iterator<Pin> it = findMatchingPins.iterator();
                C5301fr frVar = null;
                C5301fr frVar2 = null;
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        String hashAlgorithm = next.getHashAlgorithm();
                        int hashCode = hashAlgorithm.hashCode();
                        if (hashCode == -903629273) {
                            if (!hashAlgorithm.equals("sha256")) {
                                break loop0;
                            }
                            if (frVar == null) {
                                frVar = Companion.sha256Hash(x509Certificate);
                            }
                            if (jt1.m53768g(next.getHash(), frVar)) {
                                return;
                            }
                        } else if (hashCode != 3528965 || !hashAlgorithm.equals("sha1")) {
                            break loop0;
                        } else {
                            if (frVar2 == null) {
                                frVar2 = Companion.sha1Hash(x509Certificate);
                            }
                            if (jt1.m53768g(next.getHash(), frVar2)) {
                                return;
                            }
                        }
                    }
                }
                throw new AssertionError("unsupported hashAlgorithm: " + next.getHashAlgorithm());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb.append("\n    ");
                sb.append(Companion.pin(x509Certificate2));
                sb.append(": ");
                Principal subjectDN = x509Certificate2.getSubjectDN();
                jt1.m53776o(subjectDN, "element.subjectDN");
                sb.append(subjectDN.getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(ar4.f25981a);
            for (Pin append : findMatchingPins) {
                sb.append("\n    ");
                sb.append(append);
            }
            String sb2 = sb.toString();
            jt1.m53776o(sb2, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb2);
        }
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            return jt1.m53768g(certificatePinner.pins, this.pins) && jt1.m53768g(certificatePinner.certificateChainCleaner, this.certificateChainCleaner);
        }
    }

    @vr2
    public final List<Pin> findMatchingPins(@vr2 String str) {
        jt1.m53777p(str, "hostname");
        Set<Pin> set = this.pins;
        List<Pin> F = s00.m64037F();
        for (T next : set) {
            if (((Pin) next).matchesHostname(str)) {
                if (F.isEmpty()) {
                    F = new ArrayList<>();
                }
                lj4.m55693g(F).add(next);
            }
        }
        return F;
    }

    @ss2
    public final C6613qv getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    @vr2
    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int hashCode = (1517 + this.pins.hashCode()) * 41;
        C6613qv qvVar = this.certificateChainCleaner;
        return hashCode + (qvVar != null ? qvVar.hashCode() : 0);
    }

    @vr2
    public final CertificatePinner withCertificateChainCleaner$okhttp(@vr2 C6613qv qvVar) {
        jt1.m53777p(qvVar, "certificateChainCleaner");
        return jt1.m53768g(this.certificateChainCleaner, qvVar) ? this : new CertificatePinner(this.pins, qvVar);
    }
}
