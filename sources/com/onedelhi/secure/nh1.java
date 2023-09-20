package com.onedelhi.secure;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.onedelhi.secure.bl1;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

public class nh1 {

    /* renamed from: A */
    public static final String f32523A = "firebase-app-name-hash";

    /* renamed from: B */
    public static final String f32524B = "RST_FULL";

    /* renamed from: C */
    public static final String f32525C = "RST";

    /* renamed from: D */
    public static final String f32526D = "SYNC";

    /* renamed from: E */
    public static final String f32527E = "*";

    /* renamed from: a */
    public static final String f32528a = "FirebaseMessaging";

    /* renamed from: b */
    public static final String f32529b = "registration_id";

    /* renamed from: c */
    public static final String f32530c = "unregistered";

    /* renamed from: d */
    public static final String f32531d = "error";

    /* renamed from: e */
    public static final String f32532e = "SERVICE_NOT_AVAILABLE";

    /* renamed from: f */
    public static final String f32533f = "INTERNAL_SERVER_ERROR";

    /* renamed from: g */
    public static final String f32534g = "fire-iid";

    /* renamed from: h */
    public static final String f32535h = "InternalServerError";

    /* renamed from: i */
    public static final String f32536i = "gcm.topic";

    /* renamed from: j */
    public static final String f32537j = "/topics/";

    /* renamed from: k */
    public static final String f32538k = "INSTANCE_ID_RESET";

    /* renamed from: l */
    public static final String f32539l = "subtype";

    /* renamed from: m */
    public static final String f32540m = "sender";

    /* renamed from: n */
    public static final String f32541n = "scope";

    /* renamed from: o */
    public static final String f32542o = "delete";

    /* renamed from: p */
    public static final String f32543p = "iid-operation";

    /* renamed from: q */
    public static final String f32544q = "appid";

    /* renamed from: r */
    public static final String f32545r = "Firebase-Client";

    /* renamed from: s */
    public static final String f32546s = "Firebase-Client-Log-Type";

    /* renamed from: t */
    public static final String f32547t = "cliv";

    /* renamed from: u */
    public static final String f32548u = "gmp_app_id";

    /* renamed from: v */
    public static final String f32549v = "gmsv";

    /* renamed from: w */
    public static final String f32550w = "osv";

    /* renamed from: x */
    public static final String f32551x = "app_ver";

    /* renamed from: y */
    public static final String f32552y = "app_ver_name";

    /* renamed from: z */
    public static final String f32553z = "Goog-Firebase-Installations-Auth";

    /* renamed from: a */
    public final b73<wp4> f32554a;

    /* renamed from: a */
    public final ho3 f32555a;

    /* renamed from: a */
    public final ji2 f32556a;

    /* renamed from: a */
    public final o41 f32557a;

    /* renamed from: a */
    public final w31 f32558a;

    /* renamed from: b */
    public final b73<bl1> f32559b;

    public nh1(w31 w31, ji2 ji2, b73<wp4> b73, b73<bl1> b732, o41 o41) {
        this(w31, ji2, new ho3(w31.mo46527n()), b73, b732, o41);
    }

    @hw4
    public nh1(w31 w31, ji2 ji2, ho3 ho3, b73<wp4> b73, b73<bl1> b732, o41 o41) {
        this.f32558a = w31;
        this.f32556a = ji2;
        this.f32555a = ho3;
        this.f32554a = b73;
        this.f32559b = b732;
        this.f32557a = o41;
    }

    /* renamed from: b */
    public static String m58095b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: h */
    public static boolean m58096h(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || f32535h.equals(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ String m58097i(w94 w94) throws Exception {
        return mo41070g((Bundle) w94.mo17587s(IOException.class));
    }

    /* renamed from: c */
    public w94<?> mo41066c() {
        Bundle bundle = new Bundle();
        bundle.putString(f32542o, mm0.f16219f);
        return mo41067d(mo41072k(ji2.m53387c(this.f32558a), "*", bundle));
    }

    /* renamed from: d */
    public final w94<String> mo41067d(w94<Bundle> w94) {
        return w94.mo17582n(t40.f35420a, new mh1(this));
    }

    /* renamed from: e */
    public final String mo41068e() {
        try {
            return m58095b(MessageDigest.getInstance(u10.f35895a).digest(this.f32558a.mo46528r().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: f */
    public w94<String> mo41069f() {
        return mo41067d(mo41072k(ji2.m53387c(this.f32558a), "*", new Bundle()));
    }

    @C3568t7
    /* renamed from: g */
    public final String mo41070g(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString(f32529b);
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString(f32530c);
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if (f32525C.equals(string3)) {
                throw new IOException(f32538k);
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: j */
    public final void mo41071j(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        bl1.C4681a b;
        bundle.putString(f32541n, str2);
        bundle.putString("sender", str);
        bundle.putString(f32539l, str);
        bundle.putString(f32548u, this.f32558a.mo46529s().mo37192j());
        bundle.putString(f32549v, Integer.toString(this.f32556a.mo38674d()));
        bundle.putString(f32550w, Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString(f32551x, this.f32556a.mo38672a());
        bundle.putString(f32552y, this.f32556a.mo38673b());
        bundle.putString(f32523A, mo41068e());
        try {
            String b2 = ((kr1) ha4.m16566a(this.f32557a.mo40942c(false))).mo39411b();
            if (!TextUtils.isEmpty(b2)) {
                bundle.putString(f32553z, b2);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString(f32544q, (String) ha4.m16566a(this.f32557a.mo40943d()));
        bundle.putString(f32547t, "fcm-" + C4689bp.f26474c);
        bl1 bl1 = this.f32559b.get();
        wp4 wp4 = this.f32554a.get();
        if (bl1 != null && wp4 != null && (b = bl1.mo31921b(f32534g)) != bl1.C4681a.NONE) {
            bundle.putString(f32546s, Integer.toString(b.mo31922a()));
            bundle.putString(f32545r, wp4.mo46155b1());
        }
    }

    /* renamed from: k */
    public final w94<Bundle> mo41072k(String str, String str2, Bundle bundle) {
        try {
            mo41071j(str, str2, bundle);
            return this.f32555a.mo17362a(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return ha4.m16571f(e);
        }
    }

    /* renamed from: l */
    public w94<?> mo41073l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(f32536i, "/topics/" + str2);
        return mo41067d(mo41072k(str, "/topics/" + str2, bundle));
    }

    /* renamed from: m */
    public w94<?> mo41074m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(f32536i, "/topics/" + str2);
        bundle.putString(f32542o, mm0.f16219f);
        return mo41067d(mo41072k(str, "/topics/" + str2, bundle));
    }
}
