package com.onedelhi.secure;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

public final class np1 {

    /* renamed from: a */
    public static final long f32709a = 300000;

    /* renamed from: a */
    public static final String f32710a = "np1";

    /* renamed from: a */
    public final BroadcastReceiver f32711a;

    /* renamed from: a */
    public final Context f32712a;

    /* renamed from: a */
    public Handler f32713a;

    /* renamed from: a */
    public Runnable f32714a;

    /* renamed from: a */
    public boolean f32715a = false;

    /* renamed from: b */
    public boolean f32716b;

    /* renamed from: com.onedelhi.secure.np1$b */
    public final class C6220b extends BroadcastReceiver {
        public C6220b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m58656b(boolean z) {
            np1.this.mo41425f(z);
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                np1.this.f32713a.post(new op1(this, intent.getIntExtra("plugged", -1) <= 0));
            }
        }
    }

    public np1(Context context, Runnable runnable) {
        this.f32712a = context;
        this.f32714a = runnable;
        this.f32711a = new C6220b();
        this.f32713a = new Handler();
    }

    /* renamed from: c */
    public void mo41422c() {
        mo41424e();
        if (this.f32716b) {
            this.f32713a.postDelayed(this.f32714a, f32709a);
        }
    }

    /* renamed from: d */
    public void mo41423d() {
        mo41424e();
        mo41428i();
    }

    /* renamed from: e */
    public final void mo41424e() {
        this.f32713a.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: f */
    public final void mo41425f(boolean z) {
        this.f32716b = z;
        if (this.f32715a) {
            mo41422c();
        }
    }

    /* renamed from: g */
    public final void mo41426g() {
        if (!this.f32715a) {
            this.f32712a.registerReceiver(this.f32711a, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f32715a = true;
        }
    }

    /* renamed from: h */
    public void mo41427h() {
        mo41426g();
        mo41422c();
    }

    /* renamed from: i */
    public final void mo41428i() {
        if (this.f32715a) {
            this.f32712a.unregisterReceiver(this.f32711a);
            this.f32715a = false;
        }
    }
}
