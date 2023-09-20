package com.onedelhi.secure;

import java.util.concurrent.TimeUnit;

public class cj3 {

    /* renamed from: b */
    public static final long f26777b = TimeUnit.HOURS.toMillis(24);

    /* renamed from: c */
    public static final long f26778c = TimeUnit.MINUTES.toMillis(30);
    @mj1("this")

    /* renamed from: a */
    public int f26779a;
    @mj1("this")

    /* renamed from: a */
    public long f26780a;

    /* renamed from: a */
    public final ar4 f26781a;

    public cj3() {
        this.f26781a = ar4.m39019c();
    }

    public cj3(ar4 ar4) {
        this.f26781a = ar4;
    }

    /* renamed from: c */
    public static boolean m41041c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    /* renamed from: d */
    public static boolean m41042d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    /* renamed from: a */
    public final synchronized long mo32400a(int i) {
        if (!m41041c(i)) {
            return f26777b;
        }
        return (long) Math.min(Math.pow(2.0d, (double) this.f26779a) + ((double) this.f26781a.mo31120e()), (double) f26778c);
    }

    /* renamed from: b */
    public synchronized boolean mo32401b() {
        return this.f26779a == 0 || this.f26781a.mo31118a() > this.f26780a;
    }

    /* renamed from: e */
    public final synchronized void mo32402e() {
        this.f26779a = 0;
    }

    /* renamed from: f */
    public synchronized void mo32403f(int i) {
        if (m41042d(i)) {
            mo32402e();
            return;
        }
        this.f26779a++;
        this.f26780a = this.f26781a.mo31118a() + mo32400a(i);
    }
}
