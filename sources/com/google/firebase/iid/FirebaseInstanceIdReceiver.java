package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.firebase.messaging.C4321e;
import com.onedelhi.secure.C3219pz;
import com.onedelhi.secure.ha4;
import com.onedelhi.secure.j01;
import com.onedelhi.secure.ly4;
import com.onedelhi.secure.mr2;
import java.util.concurrent.ExecutionException;

public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {

    /* renamed from: a */
    public static final String f25004a = "FirebaseMessaging";

    /* renamed from: g */
    public static Intent m34640g(@mr2 Context context, @mr2 String str, @mr2 Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @ly4
    /* renamed from: b */
    public int mo9257b(@mr2 Context context, @mr2 C3219pz pzVar) {
        try {
            return ((Integer) ha4.m16566a(new j01(context).mo38366i(pzVar.mo22790N2()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @ly4
    /* renamed from: c */
    public void mo9258c(@mr2 Context context, @mr2 Bundle bundle) {
        Intent g = m34640g(context, CloudMessagingReceiver.C1408a.f7344b, bundle);
        if (C4321e.m34759E(g)) {
            C4321e.m34782v(g);
        }
    }
}
