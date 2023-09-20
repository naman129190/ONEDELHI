package com.onedelhi.secure;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.onedelhi.secure.fk */
public class C5281fk {

    /* renamed from: a */
    public static final int f28561a = 1;

    /* renamed from: b */
    public static final int f28562b = 2;

    /* renamed from: c */
    public static final int f28563c = 3;

    /* renamed from: a */
    public final Float f28564a;

    /* renamed from: a */
    public final boolean f28565a;

    public C5281fk(Float f, boolean z) {
        this.f28565a = z;
        this.f28564a = f;
    }

    /* renamed from: a */
    public static C5281fk m47987a(Context context) {
        Float f = null;
        boolean z = false;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = m47989f(registerReceiver);
                f = m47988d(registerReceiver);
            }
        } catch (IllegalStateException e) {
            o92.m59120f().mo41616e("An error occurred getting battery state.", e);
        }
        return new C5281fk(f, z);
    }

    /* renamed from: d */
    public static Float m47988d(Intent intent) {
        int intExtra = intent.getIntExtra(FirebaseAnalytics.C4305d.f24990t, -1);
        int intExtra2 = intent.getIntExtra(yz1.f38142d, -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(((float) intExtra) / ((float) intExtra2));
    }

    /* renamed from: f */
    public static boolean m47989f(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: b */
    public Float mo36036b() {
        return this.f28564a;
    }

    /* renamed from: c */
    public int mo36037c() {
        Float f;
        if (!this.f28565a || (f = this.f28564a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }

    /* renamed from: e */
    public boolean mo36038e() {
        return this.f28565a;
    }
}
