package com.onedelhi.secure;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

public class gn3 {

    /* renamed from: a */
    public int f29237a;

    /* renamed from: a */
    public OrientationEventListener f29238a;

    /* renamed from: a */
    public WindowManager f29239a;

    /* renamed from: a */
    public fn3 f29240a;

    /* renamed from: com.onedelhi.secure.gn3$a */
    public class C5440a extends OrientationEventListener {
        public C5440a(Context context, int i) {
            super(context, i);
        }

        public void onOrientationChanged(int i) {
            int rotation;
            WindowManager a = gn3.this.f29239a;
            fn3 b = gn3.this.f29240a;
            if (gn3.this.f29239a != null && b != null && (rotation = a.getDefaultDisplay().getRotation()) != gn3.this.f29237a) {
                int unused = gn3.this.f29237a = rotation;
                b.mo30307a(rotation);
            }
        }
    }

    /* renamed from: e */
    public void mo36797e(Context context, fn3 fn3) {
        mo36798f();
        Context applicationContext = context.getApplicationContext();
        this.f29240a = fn3;
        this.f29239a = (WindowManager) applicationContext.getSystemService("window");
        C5440a aVar = new C5440a(applicationContext, 3);
        this.f29238a = aVar;
        aVar.enable();
        this.f29237a = this.f29239a.getDefaultDisplay().getRotation();
    }

    /* renamed from: f */
    public void mo36798f() {
        OrientationEventListener orientationEventListener = this.f29238a;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f29238a = null;
        this.f29239a = null;
        this.f29240a = null;
    }
}
