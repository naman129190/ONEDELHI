package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.C0690e;
import androidx.lifecycle.C0703j;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.ft0;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;

/* renamed from: androidx.lifecycle.i */
public class C0698i implements a32 {

    /* renamed from: a */
    public static final C0698i f4096a = new C0698i();
    @hw4

    /* renamed from: b */
    public static final long f4097b = 700;

    /* renamed from: a */
    public Handler f4098a;

    /* renamed from: a */
    public final C0695g f4099a = new C0695g(this);

    /* renamed from: a */
    public C0703j.C0704a f4100a = new C0700b();

    /* renamed from: a */
    public Runnable f4101a = new C0699a();

    /* renamed from: b */
    public boolean f4102b = true;

    /* renamed from: c */
    public boolean f4103c = true;

    /* renamed from: n */
    public int f4104n = 0;

    /* renamed from: o */
    public int f4105o = 0;

    /* renamed from: androidx.lifecycle.i$a */
    public class C0699a implements Runnable {
        public C0699a() {
        }

        public void run() {
            C0698i.this.mo4983f();
            C0698i.this.mo4984g();
        }
    }

    /* renamed from: androidx.lifecycle.i$b */
    public class C0700b implements C0703j.C0704a {
        public C0700b() {
        }

        /* renamed from: d */
        public void mo4986d() {
            C0698i.this.mo4980c();
        }

        /* renamed from: f */
        public void mo4987f() {
            C0698i.this.mo4979b();
        }

        /* renamed from: g */
        public void mo4988g() {
        }
    }

    /* renamed from: androidx.lifecycle.i$c */
    public class C0701c extends ft0 {

        /* renamed from: androidx.lifecycle.i$c$a */
        public class C0702a extends ft0 {
            public C0702a() {
            }

            public void onActivityPostResumed(@mr2 Activity activity) {
                C0698i.this.mo4979b();
            }

            public void onActivityPostStarted(@mr2 Activity activity) {
                C0698i.this.mo4980c();
            }
        }

        public C0701c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                C0703j.m4830f(activity).mo4999h(C0698i.this.f4100a);
            }
        }

        public void onActivityPaused(Activity activity) {
            C0698i.this.mo4978a();
        }

        @sj3(29)
        public void onActivityPreCreated(@mr2 Activity activity, @ts2 Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new C0702a());
        }

        public void onActivityStopped(Activity activity) {
            C0698i.this.mo4981d();
        }
    }

    @mr2
    /* renamed from: h */
    public static a32 m4817h() {
        return f4096a;
    }

    /* renamed from: i */
    public static void m4818i(Context context) {
        f4096a.mo4982e(context);
    }

    /* renamed from: a */
    public void mo4978a() {
        int i = this.f4105o - 1;
        this.f4105o = i;
        if (i == 0) {
            this.f4098a.postDelayed(this.f4101a, 700);
        }
    }

    /* renamed from: b */
    public void mo4979b() {
        int i = this.f4105o + 1;
        this.f4105o = i;
        if (i != 1) {
            return;
        }
        if (this.f4102b) {
            this.f4099a.mo4968j(C0690e.C0692b.ON_RESUME);
            this.f4102b = false;
            return;
        }
        this.f4098a.removeCallbacks(this.f4101a);
    }

    /* renamed from: c */
    public void mo4980c() {
        int i = this.f4104n + 1;
        this.f4104n = i;
        if (i == 1 && this.f4103c) {
            this.f4099a.mo4968j(C0690e.C0692b.ON_START);
            this.f4103c = false;
        }
    }

    /* renamed from: d */
    public void mo4981d() {
        this.f4104n--;
        mo4984g();
    }

    /* renamed from: e */
    public void mo4982e(Context context) {
        this.f4098a = new Handler();
        this.f4099a.mo4968j(C0690e.C0692b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0701c());
    }

    /* renamed from: f */
    public void mo4983f() {
        if (this.f4105o == 0) {
            this.f4102b = true;
            this.f4099a.mo4968j(C0690e.C0692b.ON_PAUSE);
        }
    }

    /* renamed from: g */
    public void mo4984g() {
        if (this.f4104n == 0 && this.f4102b) {
            this.f4099a.mo4968j(C0690e.C0692b.ON_STOP);
            this.f4103c = true;
        }
    }

    @mr2
    public C0690e getLifecycle() {
        return this.f4099a;
    }
}
