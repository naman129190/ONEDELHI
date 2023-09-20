package com.onedelhi.secure;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.google.firebase.messaging.C4321e;

public class ks2 extends nc0<Bitmap> {

    /* renamed from: a */
    public final Notification f15067a;

    /* renamed from: a */
    public final Context f15068a;

    /* renamed from: a */
    public final RemoteViews f15069a;

    /* renamed from: b */
    public final String f15070b;

    /* renamed from: p */
    public final int f15071p;

    /* renamed from: q */
    public final int f15072q;

    public ks2(Context context, int i, int i2, int i3, RemoteViews remoteViews, Notification notification, int i4, String str) {
        super(i, i2);
        this.f15068a = (Context) g43.m15510e(context, "Context must not be null!");
        this.f15067a = (Notification) g43.m15510e(notification, "Notification object can not be null!");
        this.f15069a = (RemoteViews) g43.m15510e(remoteViews, "RemoteViews object can not be null!");
        this.f15072q = i3;
        this.f15071p = i4;
        this.f15070b = str;
    }

    public ks2(Context context, int i, RemoteViews remoteViews, Notification notification, int i2) {
        this(context, i, remoteViews, notification, i2, (String) null);
    }

    public ks2(Context context, int i, RemoteViews remoteViews, Notification notification, int i2, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, notification, i2, str);
    }

    /* renamed from: f */
    public void mo16021s(@mr2 Bitmap bitmap, @ts2 jh4<? super Bitmap> jh4) {
        mo19188i(bitmap);
    }

    /* renamed from: i */
    public final void mo19188i(@ts2 Bitmap bitmap) {
        this.f15069a.setImageViewBitmap(this.f15072q, bitmap);
        mo19189j();
    }

    /* renamed from: j */
    public final void mo19189j() {
        ((NotificationManager) g43.m15509d((NotificationManager) this.f15068a.getSystemService(C4321e.f25157b))).notify(this.f15070b, this.f15071p, this.f15067a);
    }

    /* renamed from: p */
    public void mo16336p(@ts2 Drawable drawable) {
        mo19188i((Bitmap) null);
    }
}
