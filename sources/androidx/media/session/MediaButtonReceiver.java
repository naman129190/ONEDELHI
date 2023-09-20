package androidx.media.session;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p000v4.media.MediaBrowserCompat;
import android.support.p000v4.media.session.MediaControllerCompat;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.support.p000v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.MediaBrowserServiceCompat;
import com.onedelhi.secure.hl3;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f4351a = "MediaButtonReceiver";

    /* renamed from: androidx.media.session.MediaButtonReceiver$a */
    public static class C0782a extends MediaBrowserCompat.C0003b {

        /* renamed from: a */
        public final BroadcastReceiver.PendingResult f4352a;

        /* renamed from: a */
        public final Context f4353a;

        /* renamed from: a */
        public final Intent f4354a;

        /* renamed from: a */
        public MediaBrowserCompat f4355a;

        public C0782a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f4353a = context;
            this.f4354a = intent;
            this.f4352a = pendingResult;
        }

        /* renamed from: a */
        public void mo31a() {
            try {
                new MediaControllerCompat(this.f4353a, this.f4355a.mo8h()).mo192d((KeyEvent) this.f4354a.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException e) {
                Log.e(MediaButtonReceiver.f4351a, "Failed to create a media controller", e);
            }
            mo5192e();
        }

        /* renamed from: b */
        public void mo32b() {
            mo5192e();
        }

        /* renamed from: c */
        public void mo33c() {
            mo5192e();
        }

        /* renamed from: e */
        public final void mo5192e() {
            this.f4355a.mo2b();
            this.f4352a.finish();
        }

        /* renamed from: f */
        public void mo5193f(MediaBrowserCompat mediaBrowserCompat) {
            this.f4355a = mediaBrowserCompat;
        }
    }

    /* renamed from: a */
    public static PendingIntent m5074a(Context context, long j) {
        ComponentName c = m5076c(context);
        if (c != null) {
            return m5075b(context, c, j);
        }
        Log.w(f4351a, "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
        return null;
    }

    /* renamed from: b */
    public static PendingIntent m5075b(Context context, ComponentName componentName, long j) {
        String str;
        if (componentName == null) {
            str = "The component name of media button receiver should be provided.";
        } else {
            int q = PlaybackStateCompat.m768q(j);
            if (q == 0) {
                str = "Cannot build a media button pending intent with the given action: " + j;
            } else {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, q));
                return PendingIntent.getBroadcast(context, q, intent, 0);
            }
        }
        Log.w(f4351a, str);
        return null;
    }

    @hl3({hl3.C2354a.f13185a})
    /* renamed from: c */
    public static ComponentName m5076c(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        } else if (queryBroadcastReceivers.size() <= 1) {
            return null;
        } else {
            Log.w(f4351a, "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            return null;
        }
    }

    /* renamed from: d */
    public static ComponentName m5077d(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    /* renamed from: e */
    public static KeyEvent m5078e(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.mo316e().mo192d(keyEvent);
        return keyEvent;
    }

    /* renamed from: f */
    public static void m5079f(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d(f4351a, "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName d = m5077d(context, "android.intent.action.MEDIA_BUTTON");
        if (d != null) {
            intent.setComponent(d);
            m5079f(context, intent);
            return;
        }
        ComponentName d2 = m5077d(context, MediaBrowserServiceCompat.f4202c);
        if (d2 != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C0782a aVar = new C0782a(applicationContext, intent, goAsync);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, d2, aVar, (Bundle) null);
            aVar.mo5193f(mediaBrowserCompat);
            mediaBrowserCompat.mo1a();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
}
