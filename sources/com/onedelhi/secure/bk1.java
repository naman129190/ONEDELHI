package com.onedelhi.secure;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$B\u001d\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b#\u0010%J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016J\u001e\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0016J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u001c\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002R\u001a\u0010\u001b\u001a\u00020\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006&"}, d2 = {"Lcom/onedelhi/secure/bk1;", "Lcom/onedelhi/secure/ck1;", "Lcom/onedelhi/secure/ei0;", "Lcom/onedelhi/secure/b90;", "context", "", "S0", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lcom/onedelhi/secure/un4;", "Q0", "", "timeMillis", "Lcom/onedelhi/secure/iu;", "continuation", "Z", "Lcom/onedelhi/secure/fn0;", "M0", "", "toString", "", "other", "equals", "", "hashCode", "l1", "immediate", "Lcom/onedelhi/secure/bk1;", "p1", "()Lcom/onedelhi/secure/bk1;", "Landroid/os/Handler;", "handler", "name", "invokeImmediately", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
public final class bk1 extends ck1 implements ei0 {
    @ss2
    private volatile bk1 _immediate;
    @vr2

    /* renamed from: a */
    public final Handler f26389a;
    @vr2

    /* renamed from: a */
    public final bk1 f26390a;
    @ss2

    /* renamed from: b */
    public final String f26391b;

    /* renamed from: b */
    public final boolean f26392b;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onedelhi/secure/un4;", "run", "()V", "com/onedelhi/secure/mo3$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.bk1$a */
    public static final class C4678a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ bk1 f26393a;

        /* renamed from: a */
        public final /* synthetic */ C5744iu f26394a;

        public C4678a(C5744iu iuVar, bk1 bk1) {
            this.f26394a = iuVar;
            this.f26393a = bk1;
        }

        public final void run() {
            this.f26394a.mo38231G(this.f26393a, un4.f36206a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/onedelhi/secure/un4;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.bk1$b */
    public static final class C4679b extends d12 implements ec1<Throwable, un4> {

        /* renamed from: a */
        public final /* synthetic */ bk1 f26395a;

        /* renamed from: a */
        public final /* synthetic */ Runnable f26396a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4679b(bk1 bk1, Runnable runnable) {
            super(1);
            this.f26395a = bk1;
            this.f26396a = runnable;
        }

        /* renamed from: X */
        public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
            mo31913a((Throwable) obj);
            return un4.f36206a;
        }

        /* renamed from: a */
        public final void mo31913a(@ss2 Throwable th) {
            this.f26395a.f26389a.removeCallbacks(this.f26396a);
        }
    }

    public bk1(@vr2 Handler handler, @ss2 String str) {
        this(handler, str, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk1(Handler handler, String str, int i, wg0 wg0) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bk1(Handler handler, String str, boolean z) {
        super((wg0) null);
        bk1 bk1 = null;
        this.f26389a = handler;
        this.f26391b = str;
        this.f26392b = z;
        this._immediate = z ? this : bk1;
        bk1 bk12 = this._immediate;
        if (bk12 == null) {
            bk12 = new bk1(handler, str, true);
            this._immediate = bk12;
        }
        this.f26390a = bk12;
    }

    /* renamed from: s1 */
    public static final void m40132s1(bk1 bk1, Runnable runnable) {
        bk1.f26389a.removeCallbacks(runnable);
    }

    @vr2
    /* renamed from: M0 */
    public fn0 mo31901M0(long j, @vr2 Runnable runnable, @vr2 b90 b90) {
        if (this.f26389a.postDelayed(runnable, df3.m45222v(j, 4611686018427387903L))) {
            return new ak1(this, runnable);
        }
        mo31909l1(b90, runnable);
        return jr2.f30914a;
    }

    /* renamed from: Q0 */
    public void mo31902Q0(@vr2 b90 b90, @vr2 Runnable runnable) {
        if (!this.f26389a.post(runnable)) {
            mo31909l1(b90, runnable);
        }
    }

    /* renamed from: S0 */
    public boolean mo31903S0(@vr2 b90 b90) {
        return !this.f26392b || !jt1.m53768g(Looper.myLooper(), this.f26389a.getLooper());
    }

    /* renamed from: Z */
    public void mo31904Z(long j, @vr2 C5744iu<? super un4> iuVar) {
        C4678a aVar = new C4678a(iuVar, this);
        if (this.f26389a.postDelayed(aVar, df3.m45222v(j, 4611686018427387903L))) {
            iuVar.mo38232J(new C4679b(this, aVar));
        } else {
            mo31909l1(iuVar.mo31187f(), aVar);
        }
    }

    public boolean equals(@ss2 Object obj) {
        return (obj instanceof bk1) && ((bk1) obj).f26389a == this.f26389a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f26389a);
    }

    /* renamed from: l1 */
    public final void mo31909l1(b90 b90, Runnable runnable) {
        xu1.m70812f(b90, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        wm0.m69460c().mo31902Q0(b90, runnable);
    }

    @vr2
    /* renamed from: p1 */
    public bk1 mo31907h1() {
        return this.f26390a;
    }

    @vr2
    public String toString() {
        String f1 = mo47121f1();
        if (f1 != null) {
            return f1;
        }
        String str = this.f26391b;
        if (str == null) {
            str = this.f26389a.toString();
        }
        return this.f26392b ? jt1.m53745C(str, ".immediate") : str;
    }
}
