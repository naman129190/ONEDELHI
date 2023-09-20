package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.C3219pz;
import com.onedelhi.secure.ha4;
import com.onedelhi.secure.ly4;
import com.onedelhi.secure.m26;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.u17;
import com.onedelhi.secure.v16;
import com.onedelhi.secure.w94;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class CloudMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public final ExecutorService f7342a;

    /* renamed from: com.google.android.gms.cloudmessaging.CloudMessagingReceiver$a */
    public static final class C1408a {
        @mr2

        /* renamed from: a */
        public static final String f7343a = "com.google.firebase.messaging.NOTIFICATION_OPEN";
        @mr2

        /* renamed from: b */
        public static final String f7344b = "com.google.firebase.messaging.NOTIFICATION_DISMISS";
    }

    /* renamed from: com.google.android.gms.cloudmessaging.CloudMessagingReceiver$b */
    public static final class C1409b {
        @mr2

        /* renamed from: a */
        public static final String f7345a = "pending_intent";
        @mr2

        /* renamed from: b */
        public static final String f7346b = "wrapped_intent";
    }

    public CloudMessagingReceiver() {
        v16.m29773a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f7342a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @mr2
    /* renamed from: a */
    public Executor mo9256a() {
        return this.f7342a;
    }

    @ly4
    /* renamed from: b */
    public abstract int mo9257b(@mr2 Context context, @mr2 C3219pz pzVar);

    @ly4
    /* renamed from: c */
    public void mo9258c(@mr2 Context context, @mr2 Bundle bundle) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo9259d(@mr2 Intent intent, @mr2 Context context, boolean z, @mr2 BroadcastReceiver.PendingResult pendingResult) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            int f = intent2 != null ? mo9261f(context, intent2) : mo9260e(context, intent);
            if (z) {
                pendingResult.setResultCode(f);
            }
        } finally {
            pendingResult.finish();
        }
    }

    @ly4
    /* renamed from: e */
    public final int mo9260e(@mr2 Context context, @mr2 Intent intent) {
        w94<Void> w94;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra(C4311b.C4315d.f25118h);
        if (TextUtils.isEmpty(stringExtra)) {
            w94 = ha4.m16572g(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(C4311b.C4315d.f25118h, stringExtra);
            w94 = u17.m29044b(context).mo25363c(2, bundle);
        }
        int b = mo9257b(context, new C3219pz(intent));
        try {
            ha4.m16567b(w94, TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
            Log.w("CloudMessagingReceiver", sb.toString());
        }
        return b;
    }

    @ly4
    /* renamed from: f */
    public final int mo9261f(@mr2 Context context, @mr2 Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(C1409b.f7345a);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove(C1409b.f7345a);
        } else {
            extras = new Bundle();
        }
        if (C1408a.f7344b.equals(intent.getAction())) {
            mo9258c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    public final void onReceive(@mr2 Context context, @mr2 Intent intent) {
        if (intent != null) {
            mo9256a().execute(new m26(this, intent, context, isOrderedBroadcast(), goAsync()));
        }
    }
}
