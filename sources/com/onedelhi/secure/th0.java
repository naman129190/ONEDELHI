package com.onedelhi.secure;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.onedelhi.secure.hl3;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class th0 extends aa4 {
    @ts2

    /* renamed from: a */
    public volatile Handler f20827a;

    /* renamed from: a */
    public final Object f20828a = new Object();

    /* renamed from: a */
    public final ExecutorService f20829a = Executors.newFixedThreadPool(4, new C3606a());

    /* renamed from: com.onedelhi.secure.th0$a */
    public class C3606a implements ThreadFactory {

        /* renamed from: a */
        public static final String f20830a = "arch_disk_io_%d";

        /* renamed from: a */
        public final AtomicInteger f20832a = new AtomicInteger(0);

        public C3606a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(f20830a, new Object[]{Integer.valueOf(this.f20832a.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: e */
    public static Handler m28433e(@mr2 Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    /* renamed from: a */
    public void mo12884a(Runnable runnable) {
        this.f20829a.execute(runnable);
    }

    /* renamed from: c */
    public boolean mo12886c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: d */
    public void mo12887d(Runnable runnable) {
        if (this.f20827a == null) {
            synchronized (this.f20828a) {
                if (this.f20827a == null) {
                    this.f20827a = m28433e(Looper.getMainLooper());
                }
            }
        }
        this.f20827a.post(runnable);
    }
}
