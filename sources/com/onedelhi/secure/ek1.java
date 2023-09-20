package com.onedelhi.secure;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.onedelhi.secure.nl3;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u0013\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\u001a\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroid/os/Handler;", "", "name", "Lcom/onedelhi/secure/ck1;", "g", "(Landroid/os/Handler;Ljava/lang/String;)Lcom/onedelhi/secure/ck1;", "Landroid/os/Looper;", "", "async", "d", "", "e", "(Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lcom/onedelhi/secure/iu;", "cont", "Lcom/onedelhi/secure/un4;", "l", "Landroid/view/Choreographer;", "choreographer", "j", "kotlinx-coroutines-android"}, k = 2, mv = {1, 6, 0})
public final class ek1 {

    /* renamed from: a */
    public static final long f27962a = 4611686018427387903L;
    @rw1
    @ss2

    /* renamed from: a */
    public static final ck1 f27963a;
    @ss2
    private static volatile Choreographer choreographer;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onedelhi/secure/un4;", "run", "()V", "com/onedelhi/secure/mo3$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ek1$a */
    public static final class C5158a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C5744iu f27964a;

        public C5158a(C5744iu iuVar) {
            this.f27964a = iuVar;
        }

        public final void run() {
            ek1.m46929l(this.f27964a);
        }
    }

    static {
        Object obj;
        ck1 ck1 = null;
        try {
            nl3.C6191a aVar = nl3.f32575a;
            obj = nl3.m58187b(new bk1(m46921d(Looper.getMainLooper(), true), (String) null, 2, (wg0) null));
        } catch (Throwable th) {
            nl3.C6191a aVar2 = nl3.f32575a;
            obj = nl3.m58187b(pl3.m61423a(th));
        }
        if (!nl3.m58194i(obj)) {
            ck1 = obj;
        }
        f27963a = ck1;
    }

    @hw4
    @vr2
    /* renamed from: d */
    public static final Handler m46921d(@vr2 Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    @ss2
    /* renamed from: e */
    public static final Object m46922e(@vr2 b80<? super Long> b80) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            C5847ju juVar = new C5847ju(lt1.m56482d(b80), 1);
            juVar.mo38234T();
            m46927j(choreographer2, juVar);
            Object A = juVar.mo38880A();
            if (A == mt1.m57558h()) {
                hf0.m50483c(b80);
            }
            return A;
        }
        C5847ju juVar2 = new C5847ju(lt1.m56482d(b80), 1);
        juVar2.mo38234T();
        wm0.m69462e().mo31902Q0(gt0.f29313a, new C5158a(juVar2));
        Object A2 = juVar2.mo38880A();
        if (A2 == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        return A2;
    }

    @vw1
    @uw1(name = "from")
    @vr2
    /* renamed from: f */
    public static final ck1 m46923f(@vr2 Handler handler) {
        return m46925h(handler, (String) null, 1, (Object) null);
    }

    @vw1
    @uw1(name = "from")
    @vr2
    /* renamed from: g */
    public static final ck1 m46924g(@vr2 Handler handler, @ss2 String str) {
        return new bk1(handler, str);
    }

    /* renamed from: h */
    public static /* synthetic */ ck1 m46925h(Handler handler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return m46924g(handler, str);
    }

    @xj0(level = ak0.HIDDEN, message = "Use Dispatchers.Main instead")
    /* renamed from: i */
    public static /* synthetic */ void m46926i() {
    }

    /* renamed from: j */
    public static final void m46927j(Choreographer choreographer2, C5744iu<? super Long> iuVar) {
        choreographer2.postFrameCallback(new dk1(iuVar));
    }

    /* renamed from: k */
    public static final void m46928k(C5744iu iuVar, long j) {
        iuVar.mo38231G(wm0.m69462e(), Long.valueOf(j));
    }

    /* renamed from: l */
    public static final void m46929l(C5744iu<? super Long> iuVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            jt1.m53774m(choreographer2);
            choreographer = choreographer2;
        }
        m46927j(choreographer2, iuVar);
    }
}
