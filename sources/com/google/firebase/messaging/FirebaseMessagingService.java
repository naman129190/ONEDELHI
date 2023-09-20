package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.k01;
import com.onedelhi.secure.ly4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.tu3;
import com.onedelhi.secure.vt3;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

public class FirebaseMessagingService extends EnhancedIntentService {

    /* renamed from: a */
    public static final Queue<String> f25045a = new ArrayDeque(10);

    /* renamed from: c */
    public static final String f25046c = "com.google.android.c2dm.intent.RECEIVE";

    /* renamed from: d */
    public static final String f25047d = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";

    /* renamed from: e */
    public static final String f25048e = "com.google.firebase.messaging.NEW_TOKEN";

    /* renamed from: f */
    public static final String f25049f = "token";

    /* renamed from: p */
    public static final int f25050p = 10;

    @hw4
    /* renamed from: v */
    public static void m34716v() {
        f25045a.clear();
    }

    /* renamed from: e */
    public Intent mo29681e(Intent intent) {
        return tu3.m66209b().mo45317c();
    }

    /* renamed from: f */
    public void mo29682f(Intent intent) {
        String action = intent.getAction();
        if (f25046c.equals(action) || f25047d.equals(action)) {
            mo29721o(intent);
        } else if (f25048e.equals(action)) {
            mo29724s(intent.getStringExtra("token"));
        } else {
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
        }
    }

    /* renamed from: l */
    public final boolean mo29718l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = f25045a;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        } else {
            Log.d("FirebaseMessaging", "Received duplicate message: " + str);
            return true;
        }
    }

    /* renamed from: m */
    public final void mo29719m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C4322f.m34790v(extras)) {
            C4322f fVar = new C4322f(extras);
            ExecutorService f = k01.m53920f();
            try {
                if (!new C4319c(this, fVar, f).mo29727a()) {
                    if (C4321e.m34759E(intent)) {
                        C4321e.m34783w(intent);
                    }
                } else {
                    return;
                }
            } finally {
                f.shutdown();
            }
        }
        mo8305q(new C4323g(extras));
    }

    /* renamed from: n */
    public final String mo29720n(Intent intent) {
        String stringExtra = intent.getStringExtra(C4311b.C4315d.f25118h);
        return stringExtra == null ? intent.getStringExtra(C4311b.C4315d.f25116f) : stringExtra;
    }

    /* renamed from: o */
    public final void mo29721o(Intent intent) {
        if (!mo29718l(intent.getStringExtra(C4311b.C4315d.f25118h))) {
            mo29726u(intent);
        }
    }

    @ly4
    /* renamed from: p */
    public void mo29722p() {
    }

    @ly4
    /* renamed from: q */
    public void mo8305q(@mr2 C4323g gVar) {
    }

    @ly4
    /* renamed from: r */
    public void mo29723r(@mr2 String str) {
    }

    @ly4
    /* renamed from: s */
    public void mo29724s(@mr2 String str) {
    }

    @ly4
    /* renamed from: t */
    public void mo29725t(@mr2 String str, @mr2 Exception exc) {
    }

    /* renamed from: u */
    public final void mo29726u(Intent intent) {
        String stringExtra = intent.getStringExtra(C4311b.C4315d.f25114d);
        if (stringExtra == null) {
            stringExtra = C4311b.C4316e.f25127a;
        }
        char c = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals(C4311b.C4316e.f25128b)) {
                    c = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals(C4311b.C4316e.f25127a)) {
                    c = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals(C4311b.C4316e.f25130d)) {
                    c = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals(C4311b.C4316e.f25129c)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                mo29722p();
                return;
            case 1:
                C4321e.m34785y(intent);
                mo29719m(intent);
                return;
            case 2:
                mo29725t(mo29720n(intent), new vt3(intent.getStringExtra("error")));
                return;
            case 3:
                mo29723r(intent.getStringExtra(C4311b.C4315d.f25118h));
                return;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                return;
        }
    }
}
