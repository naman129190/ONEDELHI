package com.onedelhi.secure;

import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import p005me.dm7.barcodescanner.core.BarcodeScannerView;

/* renamed from: com.onedelhi.secure.ht */
public class C5564ht extends HandlerThread {

    /* renamed from: b */
    public static final String f29783b = "CameraHandlerThread";

    /* renamed from: a */
    public BarcodeScannerView f29784a;

    /* renamed from: com.onedelhi.secure.ht$a */
    public class C5565a implements Runnable {

        /* renamed from: n */
        public final /* synthetic */ int f29786n;

        /* renamed from: com.onedelhi.secure.ht$a$a */
        public class C5566a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Camera f29787a;

            public C5566a(Camera camera) {
                this.f29787a = camera;
            }

            public void run() {
                C5564ht.this.f29784a.setupCameraPreview(C7183wt.m69641a(this.f29787a, C5565a.this.f29786n));
            }
        }

        public C5565a(int i) {
            this.f29786n = i;
        }

        public void run() {
            new Handler(Looper.getMainLooper()).post(new C5566a(C7096vt.m68508b(this.f29786n)));
        }
    }

    public C5564ht(BarcodeScannerView barcodeScannerView) {
        super(f29783b);
        this.f29784a = barcodeScannerView;
        start();
    }

    /* renamed from: b */
    public void mo37546b(int i) {
        new Handler(getLooper()).post(new C5565a(i));
    }
}
