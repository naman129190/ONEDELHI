package com.onedelhi.secure;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class h40 {

    /* renamed from: a */
    public static final int f12909a = 15;

    @sj3(28)
    /* renamed from: com.onedelhi.secure.h40$a */
    public static class C2297a {
        @pn0
        /* renamed from: a */
        public static Handler m16469a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @mr2
    @Deprecated
    /* renamed from: b */
    public static Executor m16465b(@mr2 Handler handler) {
        Objects.requireNonNull(handler);
        return new f40(handler);
    }

    /* renamed from: c */
    public static ThreadPoolExecutor m16466c(@mr2 String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new g40(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: d */
    public static /* synthetic */ Thread m16467d(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* renamed from: e */
    public static Handler m16468e() {
        return Build.VERSION.SDK_INT >= 28 ? C2297a.m16469a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }
}
