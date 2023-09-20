package com.onedelhi.secure;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.onedelhi.secure.gc4;
import com.onedelhi.secure.ld4;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class di2<T> implements gc4<T> {

    /* renamed from: com.onedelhi.secure.di2$a */
    public class C1976a implements gc4.C2242b<T> {

        /* renamed from: a */
        public static final int f10755a = 1;

        /* renamed from: b */
        public static final int f10756b = 2;

        /* renamed from: c */
        public static final int f10757c = 3;

        /* renamed from: a */
        public final Handler f10758a = new Handler(Looper.getMainLooper());

        /* renamed from: a */
        public final C1980c f10759a = new C1980c();

        /* renamed from: a */
        public final /* synthetic */ gc4.C2242b f10761a;

        /* renamed from: a */
        public Runnable f10762a = new C1977a();

        /* renamed from: com.onedelhi.secure.di2$a$a */
        public class C1977a implements Runnable {
            public C1977a() {
            }

            public void run() {
                while (true) {
                    C1981d a = C1976a.this.f10759a.mo14688a();
                    if (a != null) {
                        int i = a.f10778a;
                        if (i == 1) {
                            C1976a.this.f10761a.mo14677c(a.f10781b, a.f10782c);
                        } else if (i == 2) {
                            C1976a.this.f10761a.mo14676b(a.f10781b, (ld4.C2732a) a.f10780a);
                        } else if (i != 3) {
                            Log.e("ThreadUtil", "Unsupported message, what=" + a.f10778a);
                        } else {
                            C1976a.this.f10761a.mo14675a(a.f10781b, a.f10782c);
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public C1976a(gc4.C2242b bVar) {
            this.f10761a = bVar;
        }

        /* renamed from: a */
        public void mo14675a(int i, int i2) {
            mo14678d(C1981d.m13150a(3, i, i2));
        }

        /* renamed from: b */
        public void mo14676b(int i, ld4.C2732a<T> aVar) {
            mo14678d(C1981d.m13152c(2, i, aVar));
        }

        /* renamed from: c */
        public void mo14677c(int i, int i2) {
            mo14678d(C1981d.m13150a(1, i, i2));
        }

        /* renamed from: d */
        public final void mo14678d(C1981d dVar) {
            this.f10759a.mo14690c(dVar);
            this.f10758a.post(this.f10762a);
        }
    }

    /* renamed from: com.onedelhi.secure.di2$b */
    public class C1978b implements gc4.C2241a<T> {

        /* renamed from: a */
        public static final int f10764a = 1;

        /* renamed from: b */
        public static final int f10765b = 2;

        /* renamed from: c */
        public static final int f10766c = 3;

        /* renamed from: d */
        public static final int f10767d = 4;

        /* renamed from: a */
        public final C1980c f10768a = new C1980c();

        /* renamed from: a */
        public final /* synthetic */ gc4.C2241a f10770a;

        /* renamed from: a */
        public Runnable f10771a = new C1979a();

        /* renamed from: a */
        public final Executor f10772a = AsyncTask.THREAD_POOL_EXECUTOR;

        /* renamed from: a */
        public AtomicBoolean f10773a = new AtomicBoolean(false);

        /* renamed from: com.onedelhi.secure.di2$b$a */
        public class C1979a implements Runnable {
            public C1979a() {
            }

            public void run() {
                while (true) {
                    C1981d a = C1978b.this.f10768a.mo14688a();
                    if (a == null) {
                        C1978b.this.f10773a.set(false);
                        return;
                    }
                    int i = a.f10778a;
                    if (i == 1) {
                        C1978b.this.f10768a.mo14689b(1);
                        C1978b.this.f10770a.mo14681b(a.f10781b);
                    } else if (i == 2) {
                        C1978b.this.f10768a.mo14689b(2);
                        C1978b.this.f10768a.mo14689b(3);
                        C1978b.this.f10770a.mo14682c(a.f10781b, a.f10782c, a.f10783d, a.f10784e, a.f10785f);
                    } else if (i == 3) {
                        C1978b.this.f10770a.mo14680a(a.f10781b, a.f10782c);
                    } else if (i != 4) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + a.f10778a);
                    } else {
                        C1978b.this.f10770a.mo14683d((ld4.C2732a) a.f10780a);
                    }
                }
            }
        }

        public C1978b(gc4.C2241a aVar) {
            this.f10770a = aVar;
        }

        /* renamed from: a */
        public void mo14680a(int i, int i2) {
            mo14685f(C1981d.m13150a(3, i, i2));
        }

        /* renamed from: b */
        public void mo14681b(int i) {
            mo14686g(C1981d.m13152c(1, i, (Object) null));
        }

        /* renamed from: c */
        public void mo14682c(int i, int i2, int i3, int i4, int i5) {
            mo14686g(C1981d.m13151b(2, i, i2, i3, i4, i5, (Object) null));
        }

        /* renamed from: d */
        public void mo14683d(ld4.C2732a<T> aVar) {
            mo14685f(C1981d.m13152c(4, 0, aVar));
        }

        /* renamed from: e */
        public final void mo14684e() {
            if (this.f10773a.compareAndSet(false, true)) {
                this.f10772a.execute(this.f10771a);
            }
        }

        /* renamed from: f */
        public final void mo14685f(C1981d dVar) {
            this.f10768a.mo14690c(dVar);
            mo14684e();
        }

        /* renamed from: g */
        public final void mo14686g(C1981d dVar) {
            this.f10768a.mo14691d(dVar);
            mo14684e();
        }
    }

    /* renamed from: com.onedelhi.secure.di2$c */
    public static class C1980c {

        /* renamed from: a */
        public C1981d f10775a;

        /* renamed from: a */
        public synchronized C1981d mo14688a() {
            C1981d dVar = this.f10775a;
            if (dVar == null) {
                return null;
            }
            this.f10775a = dVar.f10779a;
            return dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0013  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void mo14689b(int r5) {
            /*
                r4 = this;
                monitor-enter(r4)
            L_0x0001:
                com.onedelhi.secure.di2$d r0 = r4.f10775a     // Catch:{ all -> 0x0028 }
                if (r0 == 0) goto L_0x0011
                int r1 = r0.f10778a     // Catch:{ all -> 0x0028 }
                if (r1 != r5) goto L_0x0011
                com.onedelhi.secure.di2$d r1 = r0.f10779a     // Catch:{ all -> 0x0028 }
                r4.f10775a = r1     // Catch:{ all -> 0x0028 }
                r0.mo14692d()     // Catch:{ all -> 0x0028 }
                goto L_0x0001
            L_0x0011:
                if (r0 == 0) goto L_0x0026
                com.onedelhi.secure.di2$d r1 = r0.f10779a     // Catch:{ all -> 0x0028 }
            L_0x0015:
                if (r1 == 0) goto L_0x0026
                com.onedelhi.secure.di2$d r2 = r1.f10779a     // Catch:{ all -> 0x0028 }
                int r3 = r1.f10778a     // Catch:{ all -> 0x0028 }
                if (r3 != r5) goto L_0x0023
                r0.f10779a = r2     // Catch:{ all -> 0x0028 }
                r1.mo14692d()     // Catch:{ all -> 0x0028 }
                goto L_0x0024
            L_0x0023:
                r0 = r1
            L_0x0024:
                r1 = r2
                goto L_0x0015
            L_0x0026:
                monitor-exit(r4)
                return
            L_0x0028:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.di2.C1980c.mo14689b(int):void");
        }

        /* renamed from: c */
        public synchronized void mo14690c(C1981d dVar) {
            C1981d dVar2 = this.f10775a;
            if (dVar2 == null) {
                this.f10775a = dVar;
                return;
            }
            while (true) {
                C1981d dVar3 = dVar2.f10779a;
                if (dVar3 != null) {
                    dVar2 = dVar3;
                } else {
                    dVar2.f10779a = dVar;
                    return;
                }
            }
        }

        /* renamed from: d */
        public synchronized void mo14691d(C1981d dVar) {
            dVar.f10779a = this.f10775a;
            this.f10775a = dVar;
        }
    }

    /* renamed from: com.onedelhi.secure.di2$d */
    public static class C1981d {

        /* renamed from: b */
        public static C1981d f10776b;

        /* renamed from: b */
        public static final Object f10777b = new Object();

        /* renamed from: a */
        public int f10778a;

        /* renamed from: a */
        public C1981d f10779a;

        /* renamed from: a */
        public Object f10780a;

        /* renamed from: b */
        public int f10781b;

        /* renamed from: c */
        public int f10782c;

        /* renamed from: d */
        public int f10783d;

        /* renamed from: e */
        public int f10784e;

        /* renamed from: f */
        public int f10785f;

        /* renamed from: a */
        public static C1981d m13150a(int i, int i2, int i3) {
            return m13151b(i, i2, i3, 0, 0, 0, (Object) null);
        }

        /* renamed from: b */
        public static C1981d m13151b(int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            C1981d dVar;
            synchronized (f10777b) {
                dVar = f10776b;
                if (dVar == null) {
                    dVar = new C1981d();
                } else {
                    f10776b = dVar.f10779a;
                    dVar.f10779a = null;
                }
                dVar.f10778a = i;
                dVar.f10781b = i2;
                dVar.f10782c = i3;
                dVar.f10783d = i4;
                dVar.f10784e = i5;
                dVar.f10785f = i6;
                dVar.f10780a = obj;
            }
            return dVar;
        }

        /* renamed from: c */
        public static C1981d m13152c(int i, int i2, Object obj) {
            return m13151b(i, i2, 0, 0, 0, 0, obj);
        }

        /* renamed from: d */
        public void mo14692d() {
            this.f10779a = null;
            this.f10785f = 0;
            this.f10784e = 0;
            this.f10783d = 0;
            this.f10782c = 0;
            this.f10781b = 0;
            this.f10778a = 0;
            this.f10780a = null;
            synchronized (f10777b) {
                C1981d dVar = f10776b;
                if (dVar != null) {
                    this.f10779a = dVar;
                }
                f10776b = this;
            }
        }
    }

    /* renamed from: a */
    public gc4.C2242b<T> mo14673a(gc4.C2242b<T> bVar) {
        return new C1976a(bVar);
    }

    /* renamed from: b */
    public gc4.C2241a<T> mo14674b(gc4.C2241a<T> aVar) {
        return new C1978b(aVar);
    }
}
