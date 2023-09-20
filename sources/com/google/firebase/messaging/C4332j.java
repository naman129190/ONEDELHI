package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.C4334k;
import com.onedelhi.secure.t40;
import com.onedelhi.secure.w94;
import com.onedelhi.secure.yx4;

/* renamed from: com.google.firebase.messaging.j */
public class C4332j extends Binder {

    /* renamed from: a */
    public final C4333a f25215a;

    /* renamed from: com.google.firebase.messaging.j$a */
    public interface C4333a {
        /* renamed from: a */
        w94<Void> mo29689a(Intent intent);
    }

    public C4332j(C4333a aVar) {
        this.f25215a = aVar;
    }

    /* renamed from: c */
    public void mo29829c(C4334k.C4335a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f25215a.mo29689a(aVar.f25223a).mo17574f(t40.f35420a, new yx4(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
