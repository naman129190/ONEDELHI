package com.onedelhi.secure;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.onedelhi.secure.yd3;

public class ig0 {

    /* renamed from: a */
    public static final String f30314a = "ig0";

    /* renamed from: a */
    public Rect f30315a;

    /* renamed from: a */
    public final Handler.Callback f30316a = new C5723a();

    /* renamed from: a */
    public Handler f30317a;

    /* renamed from: a */
    public HandlerThread f30318a;

    /* renamed from: a */
    public eg0 f30319a;

    /* renamed from: a */
    public C6137mt f30320a;

    /* renamed from: a */
    public final u43 f30321a = new C5724b();

    /* renamed from: a */
    public final Object f30322a = new Object();

    /* renamed from: a */
    public boolean f30323a = false;

    /* renamed from: b */
    public Handler f30324b;

    /* renamed from: com.onedelhi.secure.ig0$a */
    public class C5723a implements Handler.Callback {
        public C5723a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == yd3.C7336g.zxing_decode) {
                ig0.this.mo38079g((b14) message.obj);
                return true;
            } else if (i != yd3.C7336g.zxing_preview_failed) {
                return true;
            } else {
                ig0.this.mo38082j();
                return true;
            }
        }
    }

    /* renamed from: com.onedelhi.secure.ig0$b */
    public class C5724b implements u43 {
        public C5724b() {
        }

        /* renamed from: a */
        public void mo38088a(b14 b14) {
            synchronized (ig0.this.f30322a) {
                if (ig0.this.f30323a) {
                    ig0.this.f30317a.obtainMessage(yd3.C7336g.zxing_decode, b14).sendToTarget();
                }
            }
        }

        /* renamed from: b */
        public void mo38089b(Exception exc) {
            synchronized (ig0.this.f30322a) {
                if (ig0.this.f30323a) {
                    ig0.this.f30317a.obtainMessage(yd3.C7336g.zxing_preview_failed).sendToTarget();
                }
            }
        }
    }

    public ig0(C6137mt mtVar, eg0 eg0, Handler handler) {
        pq4.m61624a();
        this.f30320a = mtVar;
        this.f30319a = eg0;
        this.f30324b = handler;
    }

    /* renamed from: f */
    public qb2 mo38078f(b14 b14) {
        if (this.f30315a == null) {
            return null;
        }
        return b14.mo31330a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38079g(com.onedelhi.secure.b14 r9) {
        /*
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            android.graphics.Rect r2 = r8.f30315a
            r9.mo31342m(r2)
            com.onedelhi.secure.qb2 r2 = r8.mo38078f(r9)
            if (r2 == 0) goto L_0x0016
            com.onedelhi.secure.eg0 r3 = r8.f30319a
            com.onedelhi.secure.ol3 r2 = r3.mo35235c(r2)
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            if (r2 == 0) goto L_0x0053
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = f30314a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Found barcode in "
            r6.append(r7)
            long r3 = r3 - r0
            r6.append(r3)
            java.lang.String r0 = " ms"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.d(r5, r0)
            android.os.Handler r0 = r8.f30324b
            if (r0 == 0) goto L_0x0060
            com.onedelhi.secure.bj r0 = new com.onedelhi.secure.bj
            r0.<init>(r2, r9)
            android.os.Handler r1 = r8.f30324b
            int r2 = com.onedelhi.secure.yd3.C7336g.zxing_decode_succeeded
            android.os.Message r0 = android.os.Message.obtain(r1, r2, r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.setData(r1)
            goto L_0x005d
        L_0x0053:
            android.os.Handler r0 = r8.f30324b
            if (r0 == 0) goto L_0x0060
            int r1 = com.onedelhi.secure.yd3.C7336g.zxing_decode_failed
            android.os.Message r0 = android.os.Message.obtain(r0, r1)
        L_0x005d:
            r0.sendToTarget()
        L_0x0060:
            android.os.Handler r0 = r8.f30324b
            if (r0 == 0) goto L_0x0079
            com.onedelhi.secure.eg0 r0 = r8.f30319a
            java.util.List r0 = r0.mo35236d()
            java.util.List r9 = com.onedelhi.secure.C4675bj.m39970m(r0, r9)
            android.os.Handler r0 = r8.f30324b
            int r1 = com.onedelhi.secure.yd3.C7336g.zxing_possible_result_points
            android.os.Message r9 = android.os.Message.obtain(r0, r1, r9)
            r9.sendToTarget()
        L_0x0079:
            r8.mo38082j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ig0.mo38079g(com.onedelhi.secure.b14):void");
    }

    /* renamed from: h */
    public Rect mo38080h() {
        return this.f30315a;
    }

    /* renamed from: i */
    public eg0 mo38081i() {
        return this.f30319a;
    }

    /* renamed from: j */
    public final void mo38082j() {
        this.f30320a.mo40760E(this.f30321a);
    }

    /* renamed from: k */
    public void mo38083k(Rect rect) {
        this.f30315a = rect;
    }

    /* renamed from: l */
    public void mo38084l(eg0 eg0) {
        this.f30319a = eg0;
    }

    /* renamed from: m */
    public void mo38085m() {
        pq4.m61624a();
        HandlerThread handlerThread = new HandlerThread(f30314a);
        this.f30318a = handlerThread;
        handlerThread.start();
        this.f30317a = new Handler(this.f30318a.getLooper(), this.f30316a);
        this.f30323a = true;
        mo38082j();
    }

    /* renamed from: n */
    public void mo38086n() {
        pq4.m61624a();
        synchronized (this.f30322a) {
            this.f30323a = false;
            this.f30317a.removeCallbacksAndMessages((Object) null);
            this.f30318a.quit();
        }
    }
}
