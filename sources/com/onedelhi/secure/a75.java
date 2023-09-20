package com.onedelhi.secure;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class a75 extends C3044ob implements SignInConnectionListener {

    /* renamed from: a */
    public final Set f8874a;

    /* renamed from: a */
    public final Semaphore f8875a = new Semaphore(0);

    public a75(Context context, Set set) {
        super(context);
        this.f8874a = set;
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ Object mo12813I() {
        int i = 0;
        for (GoogleApiClient maybeSignIn : this.f8874a) {
            if (maybeSignIn.maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.f8875a.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public final void onComplete() {
        this.f8875a.release();
    }

    /* renamed from: s */
    public final void mo12814s() {
        this.f8875a.drainPermits();
        mo17606h();
    }
}
