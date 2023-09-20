package com.onedelhi.secure;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;

/* renamed from: com.onedelhi.secure.k9 */
public class C2612k9 extends nc0<Bitmap> {

    /* renamed from: a */
    public final ComponentName f14792a;

    /* renamed from: a */
    public final Context f14793a;

    /* renamed from: a */
    public final RemoteViews f14794a;

    /* renamed from: a */
    public final int[] f14795a;

    /* renamed from: p */
    public final int f14796p;

    public C2612k9(Context context, int i, int i2, int i3, RemoteViews remoteViews, ComponentName componentName) {
        super(i, i2);
        this.f14793a = (Context) g43.m15510e(context, "Context can not be null!");
        this.f14794a = (RemoteViews) g43.m15510e(remoteViews, "RemoteViews object can not be null!");
        this.f14792a = (ComponentName) g43.m15510e(componentName, "ComponentName can not be null!");
        this.f14796p = i3;
        this.f14795a = null;
    }

    public C2612k9(Context context, int i, int i2, int i3, RemoteViews remoteViews, int... iArr) {
        super(i, i2);
        if (iArr.length != 0) {
            this.f14793a = (Context) g43.m15510e(context, "Context can not be null!");
            this.f14794a = (RemoteViews) g43.m15510e(remoteViews, "RemoteViews object can not be null!");
            this.f14795a = (int[]) g43.m15510e(iArr, "WidgetIds can not be null!");
            this.f14796p = i3;
            this.f14792a = null;
            return;
        }
        throw new IllegalArgumentException("WidgetIds must have length > 0");
    }

    public C2612k9(Context context, int i, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, componentName);
    }

    public C2612k9(Context context, int i, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, iArr);
    }

    /* renamed from: f */
    public void mo16021s(@mr2 Bitmap bitmap, @ts2 jh4<? super Bitmap> jh4) {
        mo18962i(bitmap);
    }

    /* renamed from: i */
    public final void mo18962i(@ts2 Bitmap bitmap) {
        this.f14794a.setImageViewBitmap(this.f14796p, bitmap);
        mo18963j();
    }

    /* renamed from: j */
    public final void mo18963j() {
        AppWidgetManager instance = AppWidgetManager.getInstance(this.f14793a);
        ComponentName componentName = this.f14792a;
        if (componentName != null) {
            instance.updateAppWidget(componentName, this.f14794a);
        } else {
            instance.updateAppWidget(this.f14795a, this.f14794a);
        }
    }

    /* renamed from: p */
    public void mo16336p(@ts2 Drawable drawable) {
        mo18962i((Bitmap) null);
    }
}
