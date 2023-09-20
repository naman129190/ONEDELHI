package com.onedelhi.secure;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class k85 {
    @ts2

    /* renamed from: a */
    public static k85 f14786a;
    @hw4
    @ts2

    /* renamed from: a */
    public GoogleSignInAccount f14787a;
    @hw4
    @ts2

    /* renamed from: a */
    public GoogleSignInOptions f14788a;
    @hw4

    /* renamed from: a */
    public final b44 f14789a;

    public k85(Context context) {
        b44 b = b44.m11561b(context);
        this.f14789a = b;
        this.f14787a = b.mo13410c();
        this.f14788a = b.mo13411d();
    }

    /* renamed from: c */
    public static synchronized k85 m19555c(@mr2 Context context) {
        k85 f;
        synchronized (k85.class) {
            f = m19556f(context.getApplicationContext());
        }
        return f;
    }

    /* renamed from: f */
    public static synchronized k85 m19556f(Context context) {
        synchronized (k85.class) {
            k85 k85 = f14786a;
            if (k85 != null) {
                return k85;
            }
            k85 k852 = new k85(context);
            f14786a = k852;
            return k852;
        }
    }

    @ts2
    /* renamed from: a */
    public final synchronized GoogleSignInAccount mo18956a() {
        return this.f14787a;
    }

    @ts2
    /* renamed from: b */
    public final synchronized GoogleSignInOptions mo18957b() {
        return this.f14788a;
    }

    /* renamed from: d */
    public final synchronized void mo18958d() {
        this.f14789a.mo13409a();
        this.f14787a = null;
        this.f14788a = null;
    }

    /* renamed from: e */
    public final synchronized void mo18959e(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f14789a.mo13413f(googleSignInAccount, googleSignInOptions);
        this.f14787a = googleSignInAccount;
        this.f14788a = googleSignInOptions;
    }
}
