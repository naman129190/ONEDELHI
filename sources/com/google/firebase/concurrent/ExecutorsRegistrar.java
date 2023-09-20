package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.onedelhi.secure.C4895cn;
import com.onedelhi.secure.C6278oi;
import com.onedelhi.secure.a30;
import com.onedelhi.secure.d32;
import com.onedelhi.secure.ex0;
import com.onedelhi.secure.fx0;
import com.onedelhi.secure.gn4;
import com.onedelhi.secure.gx0;
import com.onedelhi.secure.hx0;
import com.onedelhi.secure.ix0;
import com.onedelhi.secure.jx0;
import com.onedelhi.secure.kx0;
import com.onedelhi.secure.lx0;
import com.onedelhi.secure.pc0;
import com.onedelhi.secure.u12;
import com.onedelhi.secure.wi0;
import com.onedelhi.secure.z83;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    public static final u12<ScheduledExecutorService> f24999a = new u12<>(lx0.f31873a);

    /* renamed from: b */
    public static final u12<ScheduledExecutorService> f25000b = new u12<>(kx0.f31483a);

    /* renamed from: c */
    public static final u12<ScheduledExecutorService> f25001c = new u12<>(jx0.f30995a);

    /* renamed from: d */
    public static final u12<ScheduledExecutorService> f25002d = new u12<>(ix0.f30482a);

    /* renamed from: i */
    public static StrictMode.ThreadPolicy m34624i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return detectNetwork.penaltyLog().build();
    }

    /* renamed from: j */
    public static ThreadFactory m34625j(String str, int i) {
        return new pc0(str, i, (StrictMode.ThreadPolicy) null);
    }

    /* renamed from: k */
    public static ThreadFactory m34626k(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new pc0(str, i, threadPolicy);
    }

    /* renamed from: t */
    public static StrictMode.ThreadPolicy m34635t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* renamed from: u */
    public static ScheduledExecutorService m34636u(ExecutorService executorService) {
        return new wi0(executorService, f25002d.get());
    }

    public List<a30<?>> getComponents() {
        return Arrays.asList(new a30[]{a30.m36013g(z83.m72649a(C6278oi.class, ScheduledExecutorService.class), z83.m72649a(C6278oi.class, ExecutorService.class), z83.m72649a(C6278oi.class, Executor.class)).mo30437f(hx0.f29897a).mo30435d(), a30.m36013g(z83.m72649a(C4895cn.class, ScheduledExecutorService.class), z83.m72649a(C4895cn.class, ExecutorService.class), z83.m72649a(C4895cn.class, Executor.class)).mo30437f(ex0.f28114a).mo30435d(), a30.m36013g(z83.m72649a(d32.class, ScheduledExecutorService.class), z83.m72649a(d32.class, ExecutorService.class), z83.m72649a(d32.class, Executor.class)).mo30437f(gx0.f29338a).mo30435d(), a30.m36012f(z83.m72649a(gn4.class, Executor.class)).mo30437f(fx0.f28720a).mo30435d()});
    }
}
