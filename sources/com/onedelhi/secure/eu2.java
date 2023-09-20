package com.onedelhi.secure;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\f\u0010\u0011\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u0012\u001a\u00020\u0006*\u00020\u0002H\u0002J\u001c\u0010\u0014\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0002J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¨\u0006\u001a"}, d2 = {"Lcom/onedelhi/secure/eu2;", "Ljavax/net/ssl/HostnameVerifier;", "", "host", "Ljavax/net/ssl/SSLSession;", "session", "", "verify", "Ljava/security/cert/X509Certificate;", "certificate", "e", "", "a", "ipAddress", "h", "hostname", "g", "b", "d", "pattern", "f", "", "type", "c", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class eu2 implements HostnameVerifier {

    /* renamed from: a */
    public static final eu2 f28100a = new eu2();

    /* renamed from: n */
    public static final int f28101n = 2;

    /* renamed from: o */
    public static final int f28102o = 7;

    @vr2
    /* renamed from: a */
    public final List<String> mo35634a(@vr2 X509Certificate x509Certificate) {
        jt1.m53777p(x509Certificate, "certificate");
        return a10.m35935z4(mo35636c(x509Certificate, 7), mo35636c(x509Certificate, 2));
    }

    /* renamed from: b */
    public final String mo35635b(String str) {
        if (!mo35637d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        jt1.m53776o(locale, "Locale.US");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        jt1.m53776o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* renamed from: c */
    public final List<String> mo35636c(X509Certificate x509Certificate, int i) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return s00.m64037F();
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (!(!jt1.m53768g(next.get(0), Integer.valueOf(i)))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return s00.m64037F();
        }
    }

    /* renamed from: d */
    public final boolean mo35637d(String str) {
        return str.length() == ((int) iq4.m52592l(str, 0, 0, 3, (Object) null));
    }

    /* renamed from: e */
    public final boolean mo35638e(@vr2 String str, @vr2 X509Certificate x509Certificate) {
        jt1.m53777p(str, dm1.f27488b);
        jt1.m53777p(x509Certificate, "certificate");
        return nq4.m58703h(str) ? mo35641h(str, x509Certificate) : mo35640g(str, x509Certificate);
    }

    /* renamed from: f */
    public final boolean mo35639f(String str, String str2) {
        if (!(str == null || str.length() == 0) && !t54.m65466u2(str, ".", false, 2, (Object) null) && !t54.m65408J1(str, "..", false, 2, (Object) null)) {
            if (!(str2 == null || str2.length() == 0) && !t54.m65466u2(str2, ".", false, 2, (Object) null) && !t54.m65408J1(str2, "..", false, 2, (Object) null)) {
                if (!t54.m65408J1(str, ".", false, 2, (Object) null)) {
                    str = str + ".";
                }
                String str3 = str;
                if (!t54.m65408J1(str2, ".", false, 2, (Object) null)) {
                    str2 = str2 + ".";
                }
                String b = mo35635b(str2);
                if (!u54.m66602V2(b, "*", false, 2, (Object) null)) {
                    return jt1.m53768g(str3, b);
                }
                if (!t54.m65466u2(b, "*.", false, 2, (Object) null) || u54.m66666q3(b, '*', 1, false, 4, (Object) null) != -1 || str3.length() < b.length() || jt1.m53768g("*.", b)) {
                    return false;
                }
                String substring = b.substring(1);
                jt1.m53776o(substring, "(this as java.lang.String).substring(startIndex)");
                if (!t54.m65408J1(str3, substring, false, 2, (Object) null)) {
                    return false;
                }
                int length = str3.length() - substring.length();
                return length <= 0 || u54.m66542E3(str3, '.', length + -1, false, 4, (Object) null) == -1;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo35640g(String str, X509Certificate x509Certificate) {
        String b = mo35635b(str);
        List<String> c = mo35636c(x509Certificate, 2);
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        for (String f : c) {
            if (f28100a.mo35639f(b, f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo35641h(String str, X509Certificate x509Certificate) {
        String e = vl1.m68221e(str);
        List<String> c = mo35636c(x509Certificate, 7);
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        for (String e2 : c) {
            if (jt1.m53768g(e, vl1.m68221e(e2))) {
                return true;
            }
        }
        return false;
    }

    public boolean verify(@vr2 String str, @vr2 SSLSession sSLSession) {
        jt1.m53777p(str, dm1.f27488b);
        jt1.m53777p(sSLSession, jw3.f30975b);
        if (!mo35637d(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return mo35638e(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
