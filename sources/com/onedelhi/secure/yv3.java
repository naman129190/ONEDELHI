package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

public class yv3 implements mw3 {

    /* renamed from: a */
    public static final String f38069a = "existing_instance_identifier";

    /* renamed from: b */
    public static final String f38070b = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings";

    /* renamed from: a */
    public final Context f38071a;

    /* renamed from: a */
    public final C5844js f38072a;

    /* renamed from: a */
    public final kw3 f38073a;

    /* renamed from: a */
    public final ld0 f38074a;

    /* renamed from: a */
    public final nw3 f38075a;

    /* renamed from: a */
    public final ow3 f38076a;

    /* renamed from: a */
    public final wb0 f38077a;

    /* renamed from: a */
    public final AtomicReference<jv3> f38078a;

    /* renamed from: b */
    public final AtomicReference<x94<jv3>> f38079b = new AtomicReference<>(new x94());

    /* renamed from: com.onedelhi.secure.yv3$a */
    public class C7392a implements r64<Void, Void> {
        public C7392a() {
        }

        @mr2
        /* renamed from: a */
        public w94<Void> then(@ts2 Void voidR) throws Exception {
            JSONObject a = yv3.this.f38076a.mo42303a(yv3.this.f38075a, true);
            if (a != null) {
                jv3 b = yv3.this.f38073a.mo39585b(a);
                yv3.this.f38072a.mo38839c(b.f30952a, a);
                yv3.this.mo48016q(a, "Loaded settings: ");
                yv3 yv3 = yv3.this;
                boolean unused = yv3.mo48017r(yv3.f38075a.f32825e);
                yv3.this.f38078a.set(b);
                ((x94) yv3.this.f38079b.get()).mo26839e(b);
            }
            return ha4.m16572g(null);
        }
    }

    public yv3(Context context, nw3 nw3, wb0 wb0, kw3 kw3, C5844js jsVar, ow3 ow3, ld0 ld0) {
        AtomicReference<jv3> atomicReference = new AtomicReference<>();
        this.f38078a = atomicReference;
        this.f38071a = context;
        this.f38075a = nw3;
        this.f38077a = wb0;
        this.f38073a = kw3;
        this.f38072a = jsVar;
        this.f38076a = ow3;
        this.f38074a = ld0;
        atomicReference.set(rh0.m63608b(wb0));
    }

    /* renamed from: l */
    public static yv3 m72264l(Context context, String str, lo1 lo1, vm1 vm1, String str2, String str3, t21 t21, ld0 ld0) {
        String g = lo1.mo40147g();
        x84 x84 = new x84();
        kw3 kw3 = new kw3(x84);
        C5844js jsVar = new C5844js(t21);
        sh0 sh0 = new sh0(String.format(Locale.US, f38070b, new Object[]{str}), vm1);
        String h = lo1.mo40148h();
        String i = lo1.mo40149i();
        String j = lo1.mo40150j();
        String h2 = u10.m66361h(u10.m66369p(context), str, str3, str2);
        return new yv3(context, new nw3(str, h, i, j, lo1, h2, str3, str2, fj0.m47925a(g).mo35993b()), x84, kw3, jsVar, sh0, ld0);
    }

    /* renamed from: a */
    public jv3 mo40840a() {
        return this.f38078a.get();
    }

    /* renamed from: b */
    public w94<jv3> mo40841b() {
        return this.f38079b.get().mo26835a();
    }

    /* renamed from: k */
    public boolean mo48011k() {
        return !mo48013n().equals(this.f38075a.f32825e);
    }

    /* renamed from: m */
    public final jv3 mo48012m(wv3 wv3) {
        jv3 jv3 = null;
        try {
            if (wv3.SKIP_CACHE_LOOKUP.equals(wv3)) {
                return null;
            }
            JSONObject b = this.f38072a.mo38838b();
            if (b != null) {
                jv3 b2 = this.f38073a.mo39585b(b);
                if (b2 != null) {
                    mo48016q(b, "Loaded cached settings: ");
                    long a = this.f38077a.mo46666a();
                    if (!wv3.IGNORE_CACHE_EXPIRATION.equals(wv3)) {
                        if (b2.mo38915a(a)) {
                            o92.m59120f().mo41621k("Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        o92.m59120f().mo41621k("Returning cached settings.");
                        return b2;
                    } catch (Exception e) {
                        e = e;
                        jv3 = b2;
                        o92.m59120f().mo41616e("Failed to get cached settings", e);
                        return jv3;
                    }
                } else {
                    o92.m59120f().mo41616e("Failed to parse cached settings data.", (Throwable) null);
                    return null;
                }
            } else {
                o92.m59120f().mo41613b("No cached settings data found.");
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            o92.m59120f().mo41616e("Failed to get cached settings", e);
            return jv3;
        }
    }

    /* renamed from: n */
    public final String mo48013n() {
        return u10.m66373t(this.f38071a).getString(f38069a, "");
    }

    /* renamed from: o */
    public w94<Void> mo48014o(wv3 wv3, Executor executor) {
        jv3 m;
        if (mo48011k() || (m = mo48012m(wv3)) == null) {
            jv3 m2 = mo48012m(wv3.IGNORE_CACHE_EXPIRATION);
            if (m2 != null) {
                this.f38078a.set(m2);
                this.f38079b.get().mo26839e(m2);
            }
            return this.f38074a.mo39789j(executor).mo17592x(executor, new C7392a());
        }
        this.f38078a.set(m);
        this.f38079b.get().mo26839e(m);
        return ha4.m16572g(null);
    }

    /* renamed from: p */
    public w94<Void> mo48015p(Executor executor) {
        return mo48014o(wv3.USE_CACHE, executor);
    }

    /* renamed from: q */
    public final void mo48016q(JSONObject jSONObject, String str) throws JSONException {
        o92 f = o92.m59120f();
        f.mo41613b(str + jSONObject.toString());
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: r */
    public final boolean mo48017r(String str) {
        SharedPreferences.Editor edit = u10.m66373t(this.f38071a).edit();
        edit.putString(f38069a, str);
        edit.apply();
        return true;
    }
}
