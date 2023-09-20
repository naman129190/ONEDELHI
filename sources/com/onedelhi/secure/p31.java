package com.onedelhi.secure;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
public class p31 {

    /* renamed from: a */
    public final Context f18320a;

    /* renamed from: com.onedelhi.secure.p31$a */
    public class C3118a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a */
        public final /* synthetic */ C3120c f18321a;

        public C3118a(C3120c cVar) {
            this.f18321a = cVar;
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.f18321a.mo22239a(i, charSequence);
        }

        public void onAuthenticationFailed() {
            this.f18321a.mo22240b();
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.f18321a.mo22241c(i, charSequence);
        }

        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f18321a.mo22242d(new C3121d(p31.m24376f(C3119b.m24383b(authenticationResult))));
        }
    }

    @sj3(23)
    /* renamed from: com.onedelhi.secure.p31$b */
    public static class C3119b {
        @wj3("android.permission.USE_FINGERPRINT")
        @pn0
        /* renamed from: a */
        public static void m24382a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @pn0
        /* renamed from: b */
        public static FingerprintManager.CryptoObject m24383b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @pn0
        /* renamed from: c */
        public static FingerprintManager m24384c(Context context) {
            int i = Build.VERSION.SDK_INT;
            if (i != 23 && (i <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint"))) {
                return null;
            }
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }

        @wj3("android.permission.USE_FINGERPRINT")
        @pn0
        /* renamed from: d */
        public static boolean m24385d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @wj3("android.permission.USE_FINGERPRINT")
        @pn0
        /* renamed from: e */
        public static boolean m24386e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @pn0
        /* renamed from: f */
        public static C3122e m24387f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new C3122e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new C3122e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new C3122e(cryptoObject.getMac());
            }
            return null;
        }

        @pn0
        /* renamed from: g */
        public static FingerprintManager.CryptoObject m24388g(C3122e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.mo22244a() != null) {
                return new FingerprintManager.CryptoObject(eVar.mo22244a());
            }
            if (eVar.mo22246c() != null) {
                return new FingerprintManager.CryptoObject(eVar.mo22246c());
            }
            if (eVar.mo22245b() != null) {
                return new FingerprintManager.CryptoObject(eVar.mo22245b());
            }
            return null;
        }
    }

    /* renamed from: com.onedelhi.secure.p31$c */
    public static abstract class C3120c {
        /* renamed from: a */
        public void mo22239a(int i, CharSequence charSequence) {
        }

        /* renamed from: b */
        public void mo22240b() {
        }

        /* renamed from: c */
        public void mo22241c(int i, CharSequence charSequence) {
        }

        /* renamed from: d */
        public void mo22242d(C3121d dVar) {
        }
    }

    /* renamed from: com.onedelhi.secure.p31$d */
    public static final class C3121d {

        /* renamed from: a */
        public final C3122e f18322a;

        public C3121d(C3122e eVar) {
            this.f18322a = eVar;
        }

        /* renamed from: a */
        public C3122e mo22243a() {
            return this.f18322a;
        }
    }

    /* renamed from: com.onedelhi.secure.p31$e */
    public static class C3122e {

        /* renamed from: a */
        public final Signature f18323a;

        /* renamed from: a */
        public final Cipher f18324a;

        /* renamed from: a */
        public final Mac f18325a;

        public C3122e(@mr2 Signature signature) {
            this.f18323a = signature;
            this.f18324a = null;
            this.f18325a = null;
        }

        public C3122e(@mr2 Cipher cipher) {
            this.f18324a = cipher;
            this.f18323a = null;
            this.f18325a = null;
        }

        public C3122e(@mr2 Mac mac) {
            this.f18325a = mac;
            this.f18324a = null;
            this.f18323a = null;
        }

        @ts2
        /* renamed from: a */
        public Cipher mo22244a() {
            return this.f18324a;
        }

        @ts2
        /* renamed from: b */
        public Mac mo22245b() {
            return this.f18325a;
        }

        @ts2
        /* renamed from: c */
        public Signature mo22246c() {
            return this.f18323a;
        }
    }

    public p31(Context context) {
        this.f18320a = context;
    }

    @mr2
    /* renamed from: b */
    public static p31 m24374b(@mr2 Context context) {
        return new p31(context);
    }

    @sj3(23)
    @ts2
    /* renamed from: c */
    public static FingerprintManager m24375c(@mr2 Context context) {
        return C3119b.m24384c(context);
    }

    @sj3(23)
    /* renamed from: f */
    public static C3122e m24376f(FingerprintManager.CryptoObject cryptoObject) {
        return C3119b.m24387f(cryptoObject);
    }

    @sj3(23)
    /* renamed from: g */
    public static FingerprintManager.AuthenticationCallback m24377g(C3120c cVar) {
        return new C3118a(cVar);
    }

    @sj3(23)
    /* renamed from: h */
    public static FingerprintManager.CryptoObject m24378h(C3122e eVar) {
        return C3119b.m24388g(eVar);
    }

    @wj3("android.permission.USE_FINGERPRINT")
    /* renamed from: a */
    public void mo22232a(@ts2 C3122e eVar, int i, @ts2 C3345qu quVar, @mr2 C3120c cVar, @ts2 Handler handler) {
        FingerprintManager c;
        if (Build.VERSION.SDK_INT >= 23 && (c = m24375c(this.f18320a)) != null) {
            C3119b.m24382a(c, m24378h(eVar), quVar != null ? (CancellationSignal) quVar.mo23440b() : null, i, m24377g(cVar), handler);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = m24375c(r3.f18320a);
     */
    @com.onedelhi.secure.wj3("android.permission.USE_FINGERPRINT")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo22233d() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 23
            if (r0 < r2) goto L_0x0016
            android.content.Context r0 = r3.f18320a
            android.hardware.fingerprint.FingerprintManager r0 = m24375c(r0)
            if (r0 == 0) goto L_0x0016
            boolean r0 = com.onedelhi.secure.p31.C3119b.m24385d(r0)
            if (r0 == 0) goto L_0x0016
            r1 = 1
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.p31.mo22233d():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = m24375c(r3.f18320a);
     */
    @com.onedelhi.secure.wj3("android.permission.USE_FINGERPRINT")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo22234e() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 23
            if (r0 < r2) goto L_0x0016
            android.content.Context r0 = r3.f18320a
            android.hardware.fingerprint.FingerprintManager r0 = m24375c(r0)
            if (r0 == 0) goto L_0x0016
            boolean r0 = com.onedelhi.secure.p31.C3119b.m24386e(r0)
            if (r0 == 0) goto L_0x0016
            r1 = 1
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.p31.mo22234e():boolean");
    }
}
