package com.onedelhi.secure;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

public class ho3 {

    /* renamed from: a */
    public static int f13205a;

    /* renamed from: a */
    public static PendingIntent f13206a;

    /* renamed from: a */
    public static final Executor f13207a = n67.f17199a;

    /* renamed from: a */
    public static final Pattern f13208a = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a */
    public final Context f13209a;

    /* renamed from: a */
    public Messenger f13210a;

    /* renamed from: a */
    public final l27 f13211a;

    /* renamed from: a */
    public px5 f13212a;
    @GuardedBy("responseCallbacks")

    /* renamed from: a */
    public final ty3<String, x94<Bundle>> f13213a = new ty3<>();

    /* renamed from: a */
    public final ScheduledExecutorService f13214a;

    /* renamed from: b */
    public Messenger f13215b;

    public ho3(@mr2 Context context) {
        this.f13209a = context;
        this.f13211a = new l27(context);
        this.f13210a = new Messenger(new ob5(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f13214a = scheduledThreadPoolExecutor;
    }

    /* renamed from: b */
    public static /* synthetic */ w94 m16871b(Bundle bundle) throws Exception {
        return m16875j(bundle) ? ha4.m16572g(null) : ha4.m16572g(bundle);
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m16872d(ho3 ho3, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new ks5());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof px5) {
                        ho3.f13212a = (px5) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        ho3.f13215b = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra(nh1.f32529b);
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra(nh1.f32530c);
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            Log.w("Rpc", sb.toString());
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                        }
                        if (stringExtra2.startsWith(to1.f35743f)) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                                return;
                            }
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(ar4.f25981a)) {
                                str2 = str2.substring(1);
                            }
                            ho3.mo17366i(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        synchronized (ho3.f13213a) {
                            for (int i = 0; i < ho3.f13213a.size(); i++) {
                                ho3.mo17366i(ho3.f13213a.mo25350m(i), intent2.getExtras());
                            }
                        }
                        return;
                    }
                    Matcher matcher = f13208a.matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString(nh1.f32529b, group2);
                            ho3.mo17366i(group, extras);
                            return;
                        }
                        return;
                    } else if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    String valueOf2 = String.valueOf(action);
                    Log.d("Rpc", valueOf2.length() != 0 ? "Unexpected response action: ".concat(valueOf2) : new String("Unexpected response action: "));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* renamed from: g */
    public static synchronized String m16873g() {
        String num;
        synchronized (ho3.class) {
            int i = f13205a;
            f13205a = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: h */
    public static synchronized void m16874h(Context context, Intent intent) {
        synchronized (ho3.class) {
            if (f13206a == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f13206a = w95.m30741a(context, 0, intent2, w95.f22068a);
            }
            intent.putExtra(FirebaseMessaging.f25020d, f13206a);
        }
    }

    /* renamed from: j */
    public static boolean m16875j(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    @mr2
    /* renamed from: a */
    public w94<Bundle> mo17362a(@mr2 Bundle bundle) {
        return this.f13211a.mo19270a() < 12000000 ? this.f13211a.mo19271b() != 0 ? mo17365f(bundle).mo17584p(f13207a, new c37(this, bundle)) : ha4.m16571f(new IOException("MISSING_INSTANCEID_SERVICE")) : u17.m29044b(this.f13209a).mo25364d(1, bundle).mo17582n(f13207a, t37.f20647a);
    }

    @mr2
    /* renamed from: c */
    public final /* synthetic */ w94 mo17363c(@mr2 Bundle bundle, @mr2 w94 w94) throws Exception {
        return (w94.mo17590v() && m16875j((Bundle) w94.mo17586r())) ? mo17365f(bundle).mo17592x(f13207a, z47.f23463a) : w94;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo17364e(@mr2 String str, @mr2 ScheduledFuture scheduledFuture, @mr2 w94 w94) {
        synchronized (this.f13213a) {
            this.f13213a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @C3568t7
    /* renamed from: f */
    public final w94<Bundle> mo17365f(Bundle bundle) {
        String g = m16873g();
        x94 x94 = new x94();
        synchronized (this.f13213a) {
            this.f13213a.put(g, x94);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f13211a.mo19271b() == 2 ? ji2.f30830e : ji2.f30831f);
        intent.putExtras(bundle);
        m16874h(this.f13209a, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 5);
        sb.append("|ID|");
        sb.append(g);
        sb.append(to1.f35743f);
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f13210a);
        if (!(this.f13215b == null && this.f13212a == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f13215b;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f13212a.mo22723b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            x94.mo26835a().mo17574f(f13207a, new j47(this, g, this.f13214a.schedule(new p57(x94), 30, TimeUnit.SECONDS)));
            return x94.mo26835a();
        }
        if (this.f13211a.mo19271b() == 2) {
            this.f13209a.sendBroadcast(intent);
        } else {
            this.f13209a.startService(intent);
        }
        x94.mo26835a().mo17574f(f13207a, new j47(this, g, this.f13214a.schedule(new p57(x94), 30, TimeUnit.SECONDS)));
        return x94.mo26835a();
    }

    /* renamed from: i */
    public final void mo17366i(String str, @ts2 Bundle bundle) {
        synchronized (this.f13213a) {
            x94 remove = this.f13213a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.mo26837c(bundle);
        }
    }
}
