package com.onedelhi.secure;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u001a3\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\bø\u0001\u0000\u001a3\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\bø\u0001\u0000\u001a;\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\bø\u0001\u0000\u001a;\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\bø\u0001\u0000\u001a;\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\bø\u0001\u0000\u001a;\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\bø\u0001\u0000\u001a\u001a\u0010\u0015\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u001aO\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\bø\u0001\u0000\u001aM\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\bø\u0001\u0000\u001aO\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\bø\u0001\u0000\u001aM\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\bø\u0001\u0000\u001a'\u0010\u001c\u001a\u00020\u00042\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001d"}, d2 = {"Ljava/util/Timer;", "", "delay", "Lkotlin/Function1;", "Ljava/util/TimerTask;", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/wy0;", "action", "f", "Ljava/util/Date;", "time", "h", "period", "e", "g", "i", "j", "", "name", "", "daemon", "k", "initialDelay", "l", "startAt", "m", "a", "b", "p", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
@uw1(name = "TimersKt")
public final class re4 {

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/onedelhi/secure/re4$a", "Ljava/util/TimerTask;", "Lcom/onedelhi/secure/un4;", "run", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.re4$a */
    public static final class C6689a extends TimerTask {

        /* renamed from: a */
        public final /* synthetic */ ec1<TimerTask, un4> f34610a;

        public C6689a(ec1<? super TimerTask, un4> ec1) {
            this.f34610a = ec1;
        }

        public void run() {
            this.f34610a.mo17094X(this);
        }
    }

    @xq1
    /* renamed from: a */
    public static final Timer m63575a(String str, boolean z, long j, long j2, ec1<? super TimerTask, un4> ec1) {
        jt1.m53777p(ec1, "action");
        Timer k = m63585k(str, z);
        k.scheduleAtFixedRate(new C6689a(ec1), j, j2);
        return k;
    }

    @xq1
    /* renamed from: b */
    public static final Timer m63576b(String str, boolean z, Date date, long j, ec1<? super TimerTask, un4> ec1) {
        jt1.m53777p(date, "startAt");
        jt1.m53777p(ec1, "action");
        Timer k = m63585k(str, z);
        k.scheduleAtFixedRate(new C6689a(ec1), date, j);
        return k;
    }

    /* renamed from: c */
    public static /* synthetic */ Timer m63577c(String str, boolean z, long j, long j2, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        jt1.m53777p(ec1, "action");
        Timer k = m63585k(str, z);
        Timer timer = k;
        timer.scheduleAtFixedRate(new C6689a(ec1), j, j2);
        return k;
    }

    /* renamed from: d */
    public static /* synthetic */ Timer m63578d(String str, boolean z, Date date, long j, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        jt1.m53777p(date, "startAt");
        jt1.m53777p(ec1, "action");
        Timer k = m63585k(str, z);
        k.scheduleAtFixedRate(new C6689a(ec1), date, j);
        return k;
    }

    @xq1
    /* renamed from: e */
    public static final TimerTask m63579e(Timer timer, long j, long j2, ec1<? super TimerTask, un4> ec1) {
        jt1.m53777p(timer, "<this>");
        jt1.m53777p(ec1, "action");
        C6689a aVar = new C6689a(ec1);
        timer.schedule(aVar, j, j2);
        return aVar;
    }

    @xq1
    /* renamed from: f */
    public static final TimerTask m63580f(Timer timer, long j, ec1<? super TimerTask, un4> ec1) {
        jt1.m53777p(timer, "<this>");
        jt1.m53777p(ec1, "action");
        C6689a aVar = new C6689a(ec1);
        timer.schedule(aVar, j);
        return aVar;
    }

    @xq1
    /* renamed from: g */
    public static final TimerTask m63581g(Timer timer, Date date, long j, ec1<? super TimerTask, un4> ec1) {
        jt1.m53777p(timer, "<this>");
        jt1.m53777p(date, "time");
        jt1.m53777p(ec1, "action");
        C6689a aVar = new C6689a(ec1);
        timer.schedule(aVar, date, j);
        return aVar;
    }

    @xq1
    /* renamed from: h */
    public static final TimerTask m63582h(Timer timer, Date date, ec1<? super TimerTask, un4> ec1) {
        jt1.m53777p(timer, "<this>");
        jt1.m53777p(date, "time");
        jt1.m53777p(ec1, "action");
        C6689a aVar = new C6689a(ec1);
        timer.schedule(aVar, date);
        return aVar;
    }

    @xq1
    /* renamed from: i */
    public static final TimerTask m63583i(Timer timer, long j, long j2, ec1<? super TimerTask, un4> ec1) {
        jt1.m53777p(timer, "<this>");
        jt1.m53777p(ec1, "action");
        C6689a aVar = new C6689a(ec1);
        timer.scheduleAtFixedRate(aVar, j, j2);
        return aVar;
    }

    @xq1
    /* renamed from: j */
    public static final TimerTask m63584j(Timer timer, Date date, long j, ec1<? super TimerTask, un4> ec1) {
        jt1.m53777p(timer, "<this>");
        jt1.m53777p(date, "time");
        jt1.m53777p(ec1, "action");
        C6689a aVar = new C6689a(ec1);
        timer.scheduleAtFixedRate(aVar, date, j);
        return aVar;
    }

    @vr2
    @z73
    /* renamed from: k */
    public static final Timer m63585k(@ss2 String str, boolean z) {
        return str == null ? new Timer(z) : new Timer(str, z);
    }

    @xq1
    /* renamed from: l */
    public static final Timer m63586l(String str, boolean z, long j, long j2, ec1<? super TimerTask, un4> ec1) {
        jt1.m53777p(ec1, "action");
        Timer k = m63585k(str, z);
        k.schedule(new C6689a(ec1), j, j2);
        return k;
    }

    @xq1
    /* renamed from: m */
    public static final Timer m63587m(String str, boolean z, Date date, long j, ec1<? super TimerTask, un4> ec1) {
        jt1.m53777p(date, "startAt");
        jt1.m53777p(ec1, "action");
        Timer k = m63585k(str, z);
        k.schedule(new C6689a(ec1), date, j);
        return k;
    }

    /* renamed from: n */
    public static /* synthetic */ Timer m63588n(String str, boolean z, long j, long j2, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        jt1.m53777p(ec1, "action");
        Timer k = m63585k(str, z);
        Timer timer = k;
        timer.schedule(new C6689a(ec1), j, j2);
        return k;
    }

    /* renamed from: o */
    public static /* synthetic */ Timer m63589o(String str, boolean z, Date date, long j, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        jt1.m53777p(date, "startAt");
        jt1.m53777p(ec1, "action");
        Timer k = m63585k(str, z);
        k.schedule(new C6689a(ec1), date, j);
        return k;
    }

    @xq1
    /* renamed from: p */
    public static final TimerTask m63590p(ec1<? super TimerTask, un4> ec1) {
        jt1.m53777p(ec1, "action");
        return new C6689a(ec1);
    }
}
