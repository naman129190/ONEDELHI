package com.onedelhi.secure;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.onedelhi.secure.hl3;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: com.onedelhi.secure.ob */
public abstract class C3044ob<D> extends i62<D> {

    /* renamed from: a */
    public static final String f17894a = "AsyncTaskLoader";

    /* renamed from: f */
    public static final boolean f17895f = false;

    /* renamed from: a */
    public long f17896a;

    /* renamed from: a */
    public Handler f17897a;

    /* renamed from: a */
    public volatile C3044ob<D>.a f17898a;

    /* renamed from: a */
    public final Executor f17899a;

    /* renamed from: b */
    public long f17900b;

    /* renamed from: b */
    public volatile C3044ob<D>.a f17901b;

    /* renamed from: com.onedelhi.secure.ob$a */
    public final class C3045a extends wj2<Void, Void, D> implements Runnable {

        /* renamed from: a */
        public final CountDownLatch f17903a = new CountDownLatch(1);

        /* renamed from: b */
        public boolean f17904b;

        public C3045a() {
        }

        /* renamed from: m */
        public void mo21854m(D d) {
            try {
                C3044ob.this.mo21846E(this, d);
            } finally {
                this.f17903a.countDown();
            }
        }

        /* renamed from: n */
        public void mo21855n(D d) {
            try {
                C3044ob.this.mo21847F(this, d);
            } finally {
                this.f17903a.countDown();
            }
        }

        public void run() {
            this.f17904b = false;
            C3044ob.this.mo21848G();
        }

        /* renamed from: u */
        public D mo21853b(Void... voidArr) {
            try {
                return C3044ob.this.mo21850K();
            } catch (fw2 e) {
                if (mo26595k()) {
                    return null;
                }
                throw e;
            }
        }

        /* renamed from: v */
        public void mo21858v() {
            try {
                this.f17903a.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public C3044ob(@mr2 Context context) {
        this(context, wj2.f22164a);
    }

    public C3044ob(@mr2 Context context, @mr2 Executor executor) {
        super(context);
        this.f17900b = -10000;
        this.f17899a = executor;
    }

    /* renamed from: D */
    public void mo12972D() {
    }

    /* renamed from: E */
    public void mo21846E(C3044ob<D>.a aVar, D d) {
        mo12973J(d);
        if (this.f17901b == aVar) {
            mo17620x();
            this.f17900b = SystemClock.uptimeMillis();
            this.f17901b = null;
            mo17605e();
            mo21848G();
        }
    }

    /* renamed from: F */
    public void mo21847F(C3044ob<D>.a aVar, D d) {
        if (this.f17898a != aVar) {
            mo21846E(aVar, d);
        } else if (mo17609k()) {
            mo12973J(d);
        } else {
            mo17603c();
            this.f17900b = SystemClock.uptimeMillis();
            this.f17898a = null;
            mo12987f(d);
        }
    }

    /* renamed from: G */
    public void mo21848G() {
        if (this.f17901b == null && this.f17898a != null) {
            if (this.f17898a.f17904b) {
                this.f17898a.f17904b = false;
                this.f17897a.removeCallbacks(this.f17898a);
            }
            if (this.f17896a <= 0 || SystemClock.uptimeMillis() >= this.f17900b + this.f17896a) {
                this.f17898a.mo26590e(this.f17899a, (Params[]) null);
                return;
            }
            this.f17898a.f17904b = true;
            this.f17897a.postAtTime(this.f17898a, this.f17900b + this.f17896a);
        }
    }

    /* renamed from: H */
    public boolean mo21849H() {
        return this.f17901b != null;
    }

    @ts2
    /* renamed from: I */
    public abstract D mo12813I();

    /* renamed from: J */
    public void mo12973J(@ts2 D d) {
    }

    @ts2
    /* renamed from: K */
    public D mo21850K() {
        return mo12813I();
    }

    /* renamed from: L */
    public void mo21851L(long j) {
        this.f17896a = j;
        if (j != 0) {
            this.f17897a = new Handler();
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: M */
    public void mo21852M() {
        C3044ob<D>.a aVar = this.f17898a;
        if (aVar != null) {
            aVar.mo21858v();
        }
    }

    @Deprecated
    /* renamed from: g */
    public void mo12988g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo12988g(str, fileDescriptor, printWriter, strArr);
        if (this.f17898a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f17898a);
            printWriter.print(" waiting=");
            printWriter.println(this.f17898a.f17904b);
        }
        if (this.f17901b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f17901b);
            printWriter.print(" waiting=");
            printWriter.println(this.f17901b.f17904b);
        }
        if (this.f17896a != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            ge4.m15797c(this.f17896a, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            ge4.m15796b(this.f17900b, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    /* renamed from: o */
    public boolean mo17613o() {
        if (this.f17898a == null) {
            return false;
        }
        if (!this.f13498a) {
            this.f13501d = true;
        }
        if (this.f17901b != null) {
            if (this.f17898a.f17904b) {
                this.f17898a.f17904b = false;
                this.f17897a.removeCallbacks(this.f17898a);
            }
            this.f17898a = null;
            return false;
        } else if (this.f17898a.f17904b) {
            this.f17898a.f17904b = false;
            this.f17897a.removeCallbacks(this.f17898a);
            this.f17898a = null;
            return false;
        } else {
            boolean a = this.f17898a.mo26588a(false);
            if (a) {
                this.f17901b = this.f17898a;
                mo12972D();
            }
            this.f17898a = null;
            return a;
        }
    }

    /* renamed from: q */
    public void mo17615q() {
        super.mo17615q();
        mo17602b();
        this.f17898a = new C3045a();
        mo21848G();
    }
}
