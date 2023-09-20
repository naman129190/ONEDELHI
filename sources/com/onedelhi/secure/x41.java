package com.onedelhi.secure;

import com.google.firebase.messaging.C4330i;
import com.google.firebase.messaging.FirebaseMessaging;

public final /* synthetic */ class x41 implements r64 {

    /* renamed from: a */
    public final /* synthetic */ FirebaseMessaging f37325a;

    /* renamed from: a */
    public final /* synthetic */ C4330i.C4331a f37326a;

    /* renamed from: a */
    public final /* synthetic */ String f37327a;

    public /* synthetic */ x41(FirebaseMessaging firebaseMessaging, String str, C4330i.C4331a aVar) {
        this.f37325a = firebaseMessaging;
        this.f37327a = str;
        this.f37326a = aVar;
    }

    public final w94 then(Object obj) {
        return this.f37325a.m34658G(this.f37327a, this.f37326a, (String) obj);
    }
}
