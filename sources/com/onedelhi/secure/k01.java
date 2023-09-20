package com.onedelhi.secure;

import android.annotation.SuppressLint;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class k01 {

    /* renamed from: a */
    public static final String f31025a = "Firebase-Messaging-Network-Io";

    /* renamed from: b */
    public static final String f31026b = "Firebase-Messaging-Task";

    /* renamed from: c */
    public static final String f31027c = "Firebase-Messaging-File";

    /* renamed from: d */
    public static final String f31028d = "Firebase-Messaging-Intent-Handle";

    /* renamed from: e */
    public static final String f31029e = "Firebase-Messaging-Topics-Io";

    /* renamed from: f */
    public static final String f31030f = "Firebase-Messaging-Init";

    /* renamed from: g */
    public static final String f31031g = "Firebase-Messaging-File-Io";

    /* renamed from: h */
    public static final String f31032h = "Firebase-Messaging-Rpc-Task";

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: a */
    public static Executor m53915a(String str) {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: b */
    public static ExecutorService m53916b() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(f31027c));
    }

    /* renamed from: c */
    public static Executor m53917c() {
        return m53915a(f31031g);
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: d */
    public static ScheduledExecutorService m53918d() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(f31030f));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: e */
    public static ExecutorService m53919e() {
        return l33.m55254a().mo31251j(new NamedThreadFactory(f31028d), bc4.HIGH_SPEED);
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: f */
    public static ExecutorService m53920f() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(f31025a));
    }

    /* renamed from: g */
    public static Executor m53921g() {
        return m53915a(f31032h);
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: h */
    public static ExecutorService m53922h() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(f31026b));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: i */
    public static ScheduledExecutorService m53923i() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(f31029e));
    }
}
