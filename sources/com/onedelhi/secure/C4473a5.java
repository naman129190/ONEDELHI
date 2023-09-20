package com.onedelhi.secure;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;

/* renamed from: com.onedelhi.secure.a5 */
public final class C4473a5 implements SensorEventListener {

    /* renamed from: a */
    public static final float f25754a = 45.0f;

    /* renamed from: b */
    public static final float f25755b = 450.0f;

    /* renamed from: a */
    public Context f25756a;

    /* renamed from: a */
    public Sensor f25757a;

    /* renamed from: a */
    public Handler f25758a = new Handler();

    /* renamed from: a */
    public C6225nt f25759a;

    /* renamed from: a */
    public C6596qt f25760a;

    public C4473a5(Context context, C6225nt ntVar, C6596qt qtVar) {
        this.f25756a = context;
        this.f25759a = ntVar;
        this.f25760a = qtVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m36076b(boolean z) {
        this.f25759a.mo41453A(z);
    }

    /* renamed from: c */
    public final void mo30466c(boolean z) {
        this.f25758a.post(new C7433z4(this, z));
    }

    /* renamed from: d */
    public void mo30467d() {
        if (this.f25760a.mo43706d()) {
            SensorManager sensorManager = (SensorManager) this.f25756a.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f25757a = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    /* renamed from: e */
    public void mo30468e() {
        if (this.f25757a != null) {
            ((SensorManager) this.f25756a.getSystemService("sensor")).unregisterListener(this);
            this.f25757a = null;
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        if (this.f25759a == null) {
            return;
        }
        if (f <= 45.0f) {
            mo30466c(true);
        } else if (f >= 450.0f) {
            mo30466c(false);
        }
    }
}
