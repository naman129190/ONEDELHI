package com.onedelhi.secure;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class uk3 {

    /* renamed from: a */
    public final Handler f21414a = new Handler(Looper.getMainLooper(), new C3720a());

    /* renamed from: a */
    public boolean f21415a;

    /* renamed from: com.onedelhi.secure.uk3$a */
    public static final class C3720a implements Handler.Callback {

        /* renamed from: n */
        public static final int f21416n = 1;

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((ck3) message.obj).mo13177a();
            return true;
        }
    }

    /* renamed from: a */
    public synchronized void mo25654a(ck3<?> ck3, boolean z) {
        if (!this.f21415a) {
            if (!z) {
                this.f21415a = true;
                ck3.mo13177a();
                this.f21415a = false;
            }
        }
        this.f21414a.obtainMessage(1, ck3).sendToTarget();
    }
}
