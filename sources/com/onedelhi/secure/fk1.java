package com.onedelhi.secure;

import android.os.Handler;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\bø\u0001\u0000\u001a4\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\f"}, d2 = {"Landroid/os/Handler;", "", "delayInMillis", "", "token", "Lkotlin/Function0;", "Lcom/onedelhi/secure/un4;", "action", "Ljava/lang/Runnable;", "c", "uptimeMillis", "a", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class fk1 {

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/onedelhi/secure/un4;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.fk1$a */
    public static final class C2176a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ cc1<un4> f12114a;

        public C2176a(cc1<un4> cc1) {
            this.f12114a = cc1;
        }

        public final void run() {
            this.f12114a.invoke();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/onedelhi/secure/un4;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.fk1$b */
    public static final class C2177b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ cc1<un4> f12115a;

        public C2177b(cc1<un4> cc1) {
            this.f12115a = cc1;
        }

        public final void run() {
            this.f12115a.invoke();
        }
    }

    @vr2
    /* renamed from: a */
    public static final Runnable m14991a(@vr2 Handler handler, long j, @ss2 Object obj, @vr2 cc1<un4> cc1) {
        jt1.m53777p(handler, "<this>");
        jt1.m53777p(cc1, "action");
        C2176a aVar = new C2176a(cc1);
        handler.postAtTime(aVar, obj, j);
        return aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ Runnable m14992b(Handler handler, long j, Object obj, cc1 cc1, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        jt1.m53777p(handler, "<this>");
        jt1.m53777p(cc1, "action");
        C2176a aVar = new C2176a(cc1);
        handler.postAtTime(aVar, obj, j);
        return aVar;
    }

    @vr2
    /* renamed from: c */
    public static final Runnable m14993c(@vr2 Handler handler, long j, @ss2 Object obj, @vr2 cc1<un4> cc1) {
        jt1.m53777p(handler, "<this>");
        jt1.m53777p(cc1, "action");
        C2177b bVar = new C2177b(cc1);
        if (obj == null) {
            handler.postDelayed(bVar, j);
        } else {
            zj1.m33175d(handler, bVar, obj, j);
        }
        return bVar;
    }

    /* renamed from: d */
    public static /* synthetic */ Runnable m14994d(Handler handler, long j, Object obj, cc1 cc1, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        jt1.m53777p(handler, "<this>");
        jt1.m53777p(cc1, "action");
        C2177b bVar = new C2177b(cc1);
        if (obj == null) {
            handler.postDelayed(bVar, j);
        } else {
            zj1.m33175d(handler, bVar, obj, j);
        }
        return bVar;
    }
}
