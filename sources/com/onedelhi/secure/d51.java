package com.onedelhi.secure;

import com.google.firebase.messaging.FirebaseMessaging;

public final /* synthetic */ class d51 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FirebaseMessaging f27255a;

    /* renamed from: a */
    public final /* synthetic */ x94 f27256a;

    public /* synthetic */ d51(FirebaseMessaging firebaseMessaging, x94 x94) {
        this.f27255a = firebaseMessaging;
        this.f27256a = x94;
    }

    public final void run() {
        this.f27255a.m34661J(this.f27256a);
    }
}
