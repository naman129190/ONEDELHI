package com.onedelhi.secure;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class r43<Z> extends nc0<Z> {

    /* renamed from: a */
    public static final Handler f19604a = new Handler(Looper.getMainLooper(), new C3364a());

    /* renamed from: p */
    public static final int f19605p = 1;

    /* renamed from: a */
    public final fj3 f19606a;

    /* renamed from: com.onedelhi.secure.r43$a */
    public class C3364a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((r43) message.obj).mo23616f();
            return true;
        }
    }

    public r43(fj3 fj3, int i, int i2) {
        super(i, i2);
        this.f19606a = fj3;
    }

    /* renamed from: i */
    public static <Z> r43<Z> m26307i(fj3 fj3, int i, int i2) {
        return new r43<>(fj3, i, i2);
    }

    /* renamed from: f */
    public void mo23616f() {
        this.f19606a.mo15967C(this);
    }

    /* renamed from: p */
    public void mo16336p(@ts2 Drawable drawable) {
    }

    /* renamed from: s */
    public void mo16021s(@mr2 Z z, @ts2 jh4<? super Z> jh4) {
        f19604a.obtainMessage(1, this).sendToTarget();
    }
}
