package com.onedelhi.secure;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

public class pc0 implements ThreadFactory {

    /* renamed from: a */
    public static final ThreadFactory f33517a = Executors.defaultThreadFactory();

    /* renamed from: a */
    public final int f33518a;

    /* renamed from: a */
    public final StrictMode.ThreadPolicy f33519a;

    /* renamed from: a */
    public final String f33520a;

    /* renamed from: a */
    public final AtomicLong f33521a = new AtomicLong();

    public pc0(String str, int i, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        this.f33520a = str;
        this.f33518a = i;
        this.f33519a = threadPolicy;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m60864b(Runnable runnable) {
        Process.setThreadPriority(this.f33518a);
        StrictMode.ThreadPolicy threadPolicy = this.f33519a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = f33517a.newThread(new oc0(this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", new Object[]{this.f33520a, Long.valueOf(this.f33521a.getAndIncrement())}));
        return newThread;
    }
}
