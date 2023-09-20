package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.p003ui.SquareTextView;
import com.onedelhi.secure.C6723rz;
import com.onedelhi.secure.C6801sz;
import com.onedelhi.secure.th1;
import com.onedelhi.secure.xd3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class tg0<T extends C6723rz> implements C6909tz<T> {

    /* renamed from: a */
    public static final TimeInterpolator f35562a = new DecelerateInterpolator();

    /* renamed from: a */
    public static final boolean f35563a = true;

    /* renamed from: a */
    public static final int[] f35564a = {10, 20, 50, 100, 200, 500, 1000};

    /* renamed from: a */
    public final float f35565a;

    /* renamed from: a */
    public int f35566a = 4;

    /* renamed from: a */
    public ShapeDrawable f35567a;

    /* renamed from: a */
    public SparseArray<C3798vl> f35568a = new SparseArray<>();

    /* renamed from: a */
    public final io1 f35569a;

    /* renamed from: a */
    public C6801sz.C6804c<T> f35570a;

    /* renamed from: a */
    public C6801sz.C6805d<T> f35571a;

    /* renamed from: a */
    public C6801sz.C6806e<T> f35572a;

    /* renamed from: a */
    public C6801sz.C6807f<T> f35573a;

    /* renamed from: a */
    public final C6801sz<T> f35574a;

    /* renamed from: a */
    public C6870g<T> f35575a = new C6870g<>((C6864a) null);

    /* renamed from: a */
    public final tg0<T>.k f35576a = new C6874k(this, (C6864a) null);

    /* renamed from: a */
    public final th1 f35577a;

    /* renamed from: a */
    public Map<od2, C6622qz<T>> f35578a = new HashMap();

    /* renamed from: a */
    public Set<C6872i> f35579a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    public float f35580b;

    /* renamed from: b */
    public Map<C6622qz<T>, od2> f35581b = new HashMap();

    /* renamed from: b */
    public Set<? extends C6622qz<T>> f35582b;

    /* renamed from: com.onedelhi.secure.tg0$a */
    public class C6864a implements th1.C3623q {
        public C6864a() {
        }

        /* renamed from: g */
        public boolean mo25011g(od2 od2) {
            return tg0.this.f35572a != null && tg0.this.f35572a.mo44649a((C6723rz) tg0.this.f35575a.mo45007b(od2));
        }
    }

    /* renamed from: com.onedelhi.secure.tg0$b */
    public class C6865b implements th1.C3617k {
        public C6865b() {
        }

        /* renamed from: a */
        public void mo25005a(od2 od2) {
            if (tg0.this.f35573a != null) {
                tg0.this.f35573a.mo44650a((C6723rz) tg0.this.f35575a.mo45007b(od2));
            }
        }
    }

    /* renamed from: com.onedelhi.secure.tg0$c */
    public class C6866c implements th1.C3623q {
        public C6866c() {
        }

        /* renamed from: g */
        public boolean mo25011g(od2 od2) {
            return tg0.this.f35570a != null && tg0.this.f35570a.mo44647a((C6622qz) tg0.this.f35578a.get(od2));
        }
    }

    /* renamed from: com.onedelhi.secure.tg0$d */
    public class C6867d implements th1.C3617k {
        public C6867d() {
        }

        /* renamed from: a */
        public void mo25005a(od2 od2) {
            if (tg0.this.f35571a != null) {
                tg0.this.f35571a.mo44648a((C6622qz) tg0.this.f35578a.get(od2));
            }
        }
    }

    @TargetApi(12)
    /* renamed from: com.onedelhi.secure.tg0$e */
    public class C6868e extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final LatLng f35587a;

        /* renamed from: a */
        public final od2 f35588a;

        /* renamed from: a */
        public rd2 f35589a;

        /* renamed from: a */
        public final C6872i f35590a;

        /* renamed from: a */
        public boolean f35592a;

        /* renamed from: b */
        public final LatLng f35593b;

        public C6868e(C6872i iVar, LatLng latLng, LatLng latLng2) {
            this.f35590a = iVar;
            this.f35588a = iVar.f35611a;
            this.f35587a = latLng;
            this.f35593b = latLng2;
        }

        public /* synthetic */ C6868e(tg0 tg0, C6872i iVar, LatLng latLng, LatLng latLng2, C6864a aVar) {
            this(iVar, latLng, latLng2);
        }

        /* renamed from: a */
        public void mo45001a() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setInterpolator(tg0.f35562a);
            ofFloat.addUpdateListener(this);
            ofFloat.addListener(this);
            ofFloat.start();
        }

        /* renamed from: b */
        public void mo45002b(rd2 rd2) {
            this.f35589a = rd2;
            this.f35592a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f35592a) {
                tg0.this.f35581b.remove((C6622qz) tg0.this.f35578a.get(this.f35588a));
                tg0.this.f35575a.mo45009d(this.f35588a);
                tg0.this.f35578a.remove(this.f35588a);
                this.f35589a.mo43855m(this.f35588a);
            }
            LatLng unused = this.f35590a.f35610a = this.f35593b;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.f35593b;
            double d = latLng.f7562a;
            LatLng latLng2 = this.f35587a;
            double d2 = latLng2.f7562a;
            double d3 = (double) animatedFraction;
            double d4 = ((d - d2) * d3) + d2;
            double d5 = latLng.f7563b - latLng2.f7563b;
            if (Math.abs(d5) > 180.0d) {
                d5 -= Math.signum(d5) * 360.0d;
            }
            this.f35588a.mo21892u(new LatLng(d4, (d5 * d3) + this.f35587a.f7563b));
        }
    }

    /* renamed from: com.onedelhi.secure.tg0$f */
    public class C6869f {

        /* renamed from: a */
        public final LatLng f35594a;

        /* renamed from: a */
        public final C6622qz<T> f35595a;

        /* renamed from: a */
        public final Set<C6872i> f35597a;

        public C6869f(C6622qz<T> qzVar, Set<C6872i> set, LatLng latLng) {
            this.f35595a = qzVar;
            this.f35597a = set;
            this.f35594a = latLng;
        }

        /* renamed from: b */
        public final void mo45005b(tg0<T>.h hVar) {
            C6872i iVar;
            if (!tg0.this.mo44993Q(this.f35595a)) {
                for (T t : this.f35595a.mo39428b()) {
                    od2 a = tg0.this.f35575a.mo45006a(t);
                    if (a == null) {
                        sd2 sd2 = new sd2();
                        LatLng latLng = this.f35594a;
                        if (latLng == null) {
                            latLng = t.mo44116a();
                        }
                        sd2.mo24329e3(latLng);
                        tg0.this.mo44988L(t, sd2);
                        a = tg0.this.f35574a.mo44633m().mo43856e(sd2);
                        iVar = new C6872i(a, (C6864a) null);
                        tg0.this.f35575a.mo45008c(t, a);
                        LatLng latLng2 = this.f35594a;
                        if (latLng2 != null) {
                            hVar.mo45011b(iVar, latLng2, t.mo44116a());
                        }
                    } else {
                        iVar = new C6872i(a, (C6864a) null);
                    }
                    tg0.this.mo44990N(t, a);
                    this.f35597a.add(iVar);
                }
                return;
            }
            sd2 sd22 = new sd2();
            LatLng latLng3 = this.f35594a;
            if (latLng3 == null) {
                latLng3 = this.f35595a.mo39427a();
            }
            sd2 e3 = sd22.mo24329e3(latLng3);
            tg0.this.mo44989M(this.f35595a, e3);
            od2 e = tg0.this.f35574a.mo44632l().mo43856e(e3);
            tg0.this.f35578a.put(e, this.f35595a);
            tg0.this.f35581b.put(this.f35595a, e);
            C6872i iVar2 = new C6872i(e, (C6864a) null);
            LatLng latLng4 = this.f35594a;
            if (latLng4 != null) {
                hVar.mo45011b(iVar2, latLng4, this.f35595a.mo39427a());
            }
            tg0.this.mo44991O(this.f35595a, e);
            this.f35597a.add(iVar2);
        }
    }

    /* renamed from: com.onedelhi.secure.tg0$g */
    public static class C6870g<T> {

        /* renamed from: a */
        public Map<T, od2> f35598a;

        /* renamed from: b */
        public Map<od2, T> f35599b;

        public C6870g() {
            this.f35598a = new HashMap();
            this.f35599b = new HashMap();
        }

        public /* synthetic */ C6870g(C6864a aVar) {
            this();
        }

        /* renamed from: a */
        public od2 mo45006a(T t) {
            return this.f35598a.get(t);
        }

        /* renamed from: b */
        public T mo45007b(od2 od2) {
            return this.f35599b.get(od2);
        }

        /* renamed from: c */
        public void mo45008c(T t, od2 od2) {
            this.f35598a.put(t, od2);
            this.f35599b.put(od2, t);
        }

        /* renamed from: d */
        public void mo45009d(od2 od2) {
            T t = this.f35599b.get(od2);
            this.f35599b.remove(od2);
            this.f35598a.remove(t);
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.onedelhi.secure.tg0$h */
    public class C6871h extends Handler implements MessageQueue.IdleHandler {

        /* renamed from: a */
        public static final int f35600a = 0;

        /* renamed from: a */
        public Queue<tg0<T>.f> f35602a;

        /* renamed from: a */
        public final Condition f35603a;

        /* renamed from: a */
        public final Lock f35604a;

        /* renamed from: a */
        public boolean f35605a;

        /* renamed from: b */
        public Queue<tg0<T>.f> f35606b;

        /* renamed from: c */
        public Queue<od2> f35607c;

        /* renamed from: d */
        public Queue<od2> f35608d;

        /* renamed from: e */
        public Queue<tg0<T>.e> f35609e;

        public C6871h() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f35604a = reentrantLock;
            this.f35603a = reentrantLock.newCondition();
            this.f35602a = new LinkedList();
            this.f35606b = new LinkedList();
            this.f35607c = new LinkedList();
            this.f35608d = new LinkedList();
            this.f35609e = new LinkedList();
        }

        public /* synthetic */ C6871h(tg0 tg0, C6864a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo45010a(boolean z, tg0<T>.f fVar) {
            this.f35604a.lock();
            sendEmptyMessage(0);
            (z ? this.f35606b : this.f35602a).add(fVar);
            this.f35604a.unlock();
        }

        /* renamed from: b */
        public void mo45011b(C6872i iVar, LatLng latLng, LatLng latLng2) {
            this.f35604a.lock();
            this.f35609e.add(new C6868e(tg0.this, iVar, latLng, latLng2, (C6864a) null));
            this.f35604a.unlock();
        }

        @TargetApi(11)
        /* renamed from: c */
        public void mo45012c(C6872i iVar, LatLng latLng, LatLng latLng2) {
            this.f35604a.lock();
            C6868e eVar = new C6868e(tg0.this, iVar, latLng, latLng2, (C6864a) null);
            eVar.mo45002b(tg0.this.f35574a.mo44634n());
            this.f35609e.add(eVar);
            this.f35604a.unlock();
        }

        /* renamed from: d */
        public boolean mo45013d() {
            try {
                this.f35604a.lock();
                return !this.f35602a.isEmpty() || !this.f35606b.isEmpty() || !this.f35608d.isEmpty() || !this.f35607c.isEmpty() || !this.f35609e.isEmpty();
            } finally {
                this.f35604a.unlock();
            }
        }

        @TargetApi(11)
        /* renamed from: e */
        public final void mo45014e() {
            Queue<od2> queue;
            Queue<tg0<T>.f> queue2;
            if (!this.f35608d.isEmpty()) {
                queue = this.f35608d;
            } else if (!this.f35609e.isEmpty()) {
                this.f35609e.poll().mo45001a();
                return;
            } else {
                if (!this.f35606b.isEmpty()) {
                    queue2 = this.f35606b;
                } else if (!this.f35602a.isEmpty()) {
                    queue2 = this.f35602a;
                } else if (!this.f35607c.isEmpty()) {
                    queue = this.f35607c;
                } else {
                    return;
                }
                queue2.poll().mo45005b(this);
                return;
            }
            mo45016g(queue.poll());
        }

        /* renamed from: f */
        public void mo45015f(boolean z, od2 od2) {
            this.f35604a.lock();
            sendEmptyMessage(0);
            (z ? this.f35608d : this.f35607c).add(od2);
            this.f35604a.unlock();
        }

        /* renamed from: g */
        public final void mo45016g(od2 od2) {
            tg0.this.f35581b.remove((C6622qz) tg0.this.f35578a.get(od2));
            tg0.this.f35575a.mo45009d(od2);
            tg0.this.f35578a.remove(od2);
            tg0.this.f35574a.mo44634n().mo43855m(od2);
        }

        /* renamed from: h */
        public void mo45017h() {
            while (mo45013d()) {
                sendEmptyMessage(0);
                this.f35604a.lock();
                try {
                    if (mo45013d()) {
                        this.f35603a.await();
                    }
                    this.f35604a.unlock();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    this.f35604a.unlock();
                    throw th;
                }
            }
        }

        public void handleMessage(Message message) {
            if (!this.f35605a) {
                Looper.myQueue().addIdleHandler(this);
                this.f35605a = true;
            }
            removeMessages(0);
            this.f35604a.lock();
            int i = 0;
            while (i < 10) {
                try {
                    mo45014e();
                    i++;
                } catch (Throwable th) {
                    this.f35604a.unlock();
                    throw th;
                }
            }
            if (!mo45013d()) {
                this.f35605a = false;
                Looper.myQueue().removeIdleHandler(this);
                this.f35603a.signalAll();
            } else {
                sendEmptyMessageDelayed(0, 10);
            }
            this.f35604a.unlock();
        }

        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }
    }

    /* renamed from: com.onedelhi.secure.tg0$i */
    public static class C6872i {

        /* renamed from: a */
        public LatLng f35610a;

        /* renamed from: a */
        public final od2 f35611a;

        public C6872i(od2 od2) {
            this.f35611a = od2;
            this.f35610a = od2.mo21872c();
        }

        public /* synthetic */ C6872i(od2 od2, C6864a aVar) {
            this(od2);
        }

        public boolean equals(Object obj) {
            if (obj instanceof C6872i) {
                return this.f35611a.equals(((C6872i) obj).f35611a);
            }
            return false;
        }

        public int hashCode() {
            return this.f35611a.hashCode();
        }
    }

    /* renamed from: com.onedelhi.secure.tg0$j */
    public class C6873j implements Runnable {

        /* renamed from: a */
        public float f35612a;

        /* renamed from: a */
        public q14 f35613a;

        /* renamed from: a */
        public w53 f35615a;

        /* renamed from: a */
        public Runnable f35616a;

        /* renamed from: a */
        public final Set<? extends C6622qz<T>> f35617a;

        public C6873j(Set<? extends C6622qz<T>> set) {
            this.f35617a = set;
        }

        public /* synthetic */ C6873j(tg0 tg0, Set set, C6864a aVar) {
            this(set);
        }

        /* renamed from: a */
        public void mo45022a(Runnable runnable) {
            this.f35616a = runnable;
        }

        /* renamed from: b */
        public void mo45023b(float f) {
            this.f35612a = f;
            this.f35613a = new q14(Math.pow(2.0d, (double) Math.min(f, tg0.this.f35580b)) * 256.0d);
        }

        /* renamed from: c */
        public void mo45024c(w53 w53) {
            this.f35615a = w53;
        }

        @SuppressLint({"NewApi"})
        public void run() {
            ArrayList arrayList;
            if (!this.f35617a.equals(tg0.this.f35582b)) {
                ArrayList arrayList2 = null;
                C6871h hVar = new C6871h(tg0.this, (C6864a) null);
                float f = this.f35612a;
                boolean z = f > tg0.this.f35580b;
                float h = f - tg0.this.f35580b;
                Set<C6872i> l = tg0.this.f35579a;
                LatLngBounds latLngBounds = this.f35615a.mo26443b().f13892a;
                if (tg0.this.f35582b == null || !tg0.f35563a) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (C6622qz qzVar : tg0.this.f35582b) {
                        if (tg0.this.mo44993Q(qzVar) && latLngBounds.mo10685L2(qzVar.mo39427a())) {
                            arrayList.add(this.f35613a.mo43081b(qzVar.mo39427a()));
                        }
                    }
                }
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                for (C6622qz qzVar2 : this.f35617a) {
                    boolean L2 = latLngBounds.mo10685L2(qzVar2.mo39427a());
                    if (!z || !L2 || !tg0.f35563a) {
                        hVar.mo45010a(L2, new C6869f(qzVar2, newSetFromMap, (LatLng) null));
                    } else {
                        v23 o = tg0.m65618A(arrayList, this.f35613a.mo43081b(qzVar2.mo39427a()));
                        if (o != null) {
                            hVar.mo45010a(true, new C6869f(qzVar2, newSetFromMap, this.f35613a.mo43080a(o)));
                        } else {
                            hVar.mo45010a(true, new C6869f(qzVar2, newSetFromMap, (LatLng) null));
                        }
                    }
                }
                hVar.mo45017h();
                l.removeAll(newSetFromMap);
                if (tg0.f35563a) {
                    arrayList2 = new ArrayList();
                    for (C6622qz qzVar3 : this.f35617a) {
                        if (tg0.this.mo44993Q(qzVar3) && latLngBounds.mo10685L2(qzVar3.mo39427a())) {
                            arrayList2.add(this.f35613a.mo43081b(qzVar3.mo39427a()));
                        }
                    }
                }
                for (C6872i iVar : l) {
                    boolean L22 = latLngBounds.mo10685L2(iVar.f35610a);
                    if (z || h <= -3.0f || !L22 || !tg0.f35563a) {
                        hVar.mo45015f(L22, iVar.f35611a);
                    } else {
                        v23 o2 = tg0.m65618A(arrayList2, this.f35613a.mo43081b(iVar.f35610a));
                        if (o2 != null) {
                            hVar.mo45012c(iVar, iVar.f35610a, this.f35613a.mo43080a(o2));
                        } else {
                            hVar.mo45015f(true, iVar.f35611a);
                        }
                    }
                }
                hVar.mo45017h();
                Set unused = tg0.this.f35579a = newSetFromMap;
                Set unused2 = tg0.this.f35582b = this.f35617a;
                float unused3 = tg0.this.f35580b = f;
            }
            this.f35616a.run();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.onedelhi.secure.tg0$k */
    public class C6874k extends Handler {

        /* renamed from: a */
        public static final int f35618a = 0;

        /* renamed from: b */
        public static final int f35619b = 1;

        /* renamed from: a */
        public tg0<T>.j f35620a;

        /* renamed from: a */
        public boolean f35622a;

        /* renamed from: com.onedelhi.secure.tg0$k$a */
        public class C6875a implements Runnable {
            public C6875a() {
            }

            public void run() {
                C6874k.this.sendEmptyMessage(1);
            }
        }

        public C6874k() {
            this.f35622a = false;
            this.f35620a = null;
        }

        public /* synthetic */ C6874k(tg0 tg0, C6864a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo45026a(Set<? extends C6622qz<T>> set) {
            synchronized (this) {
                this.f35620a = new C6873j(tg0.this, set, (C6864a) null);
            }
            sendEmptyMessage(0);
        }

        public void handleMessage(Message message) {
            w53 q;
            tg0<T>.j jVar;
            if (message.what == 1) {
                this.f35622a = false;
                if (this.f35620a != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (!this.f35622a && this.f35620a != null && (q = tg0.this.f35577a.mo24984q()) != null) {
                synchronized (this) {
                    jVar = this.f35620a;
                    this.f35620a = null;
                    this.f35622a = true;
                }
                jVar.mo45022a(new C6875a());
                jVar.mo45024c(q);
                jVar.mo45023b(tg0.this.f35577a.mo24978k().f7554a);
                new Thread(jVar).start();
            }
        }
    }

    public tg0(Context context, th1 th1, C6801sz<T> szVar) {
        this.f35577a = th1;
        this.f35565a = context.getResources().getDisplayMetrics().density;
        io1 io1 = new io1(context);
        this.f35569a = io1;
        io1.mo38184l(mo44987K(context));
        io1.mo38187o(xd3.C7240i.amu_ClusterIcon_TextAppearance);
        io1.mo38180h(mo44986J());
        this.f35574a = szVar;
    }

    /* renamed from: A */
    public static v23 m65618A(List<v23> list, v23 v23) {
        v23 v232 = null;
        if (list != null && !list.isEmpty()) {
            double d = 10000.0d;
            for (v23 next : list) {
                double z = m65637z(next, v23);
                if (z < d) {
                    v232 = next;
                    d = z;
                }
            }
        }
        return v232;
    }

    /* renamed from: z */
    public static double m65637z(v23 v23, v23 v232) {
        double d = v23.f36408a;
        double d2 = v232.f36408a;
        double d3 = (d - d2) * (d - d2);
        double d4 = v23.f36409b;
        double d5 = v232.f36409b;
        return d3 + ((d4 - d5) * (d4 - d5));
    }

    /* renamed from: B */
    public int mo44978B(C6622qz<T> qzVar) {
        int c = qzVar.mo39429c();
        int i = 0;
        if (c <= f35564a[0]) {
            return c;
        }
        while (true) {
            int[] iArr = f35564a;
            if (i >= iArr.length - 1) {
                return iArr[iArr.length - 1];
            }
            int i2 = i + 1;
            if (c < iArr[i2]) {
                return iArr[i];
            }
            i = i2;
        }
    }

    /* renamed from: C */
    public C6622qz<T> mo44979C(od2 od2) {
        return this.f35578a.get(od2);
    }

    /* renamed from: D */
    public T mo44980D(od2 od2) {
        return (C6723rz) this.f35575a.mo45007b(od2);
    }

    /* renamed from: E */
    public String mo44981E(int i) {
        if (i < f35564a[0]) {
            return String.valueOf(i);
        }
        return String.valueOf(i) + C3516si.f20377b;
    }

    /* renamed from: F */
    public int mo44982F(int i) {
        float min = 300.0f - Math.min((float) i, 300.0f);
        return Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    /* renamed from: G */
    public od2 mo44983G(C6622qz<T> qzVar) {
        return this.f35581b.get(qzVar);
    }

    /* renamed from: H */
    public od2 mo44984H(T t) {
        return this.f35575a.mo45006a(t);
    }

    /* renamed from: I */
    public int mo44985I() {
        return this.f35566a;
    }

    /* renamed from: J */
    public final LayerDrawable mo44986J() {
        this.f35567a = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.f35567a});
        int i = (int) (this.f35565a * 3.0f);
        layerDrawable.setLayerInset(1, i, i, i, i);
        return layerDrawable;
    }

    /* renamed from: K */
    public final SquareTextView mo44987K(Context context) {
        SquareTextView squareTextView = new SquareTextView(context);
        squareTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        squareTextView.setId(xd3.C7235d.amu_text);
        int i = (int) (this.f35565a * 12.0f);
        squareTextView.setPadding(i, i, i, i);
        return squareTextView;
    }

    /* renamed from: L */
    public void mo44988L(T t, sd2 sd2) {
    }

    /* renamed from: M */
    public void mo44989M(C6622qz<T> qzVar, sd2 sd2) {
        int B = mo44978B(qzVar);
        C3798vl vlVar = this.f35568a.get(B);
        if (vlVar == null) {
            this.f35567a.getPaint().setColor(mo44982F(B));
            vlVar = C3858wl.m30941d(this.f35569a.mo38178f(mo44981E(B)));
            this.f35568a.put(B, vlVar);
        }
        sd2.mo24324Z2(vlVar);
    }

    /* renamed from: N */
    public void mo44990N(T t, od2 od2) {
    }

    /* renamed from: O */
    public void mo44991O(C6622qz<T> qzVar, od2 od2) {
    }

    /* renamed from: P */
    public void mo44992P(int i) {
        this.f35566a = i;
    }

    /* renamed from: Q */
    public boolean mo44993Q(C6622qz<T> qzVar) {
        return qzVar.mo39429c() > this.f35566a;
    }

    /* renamed from: a */
    public void mo44994a() {
        this.f35574a.mo44633m().mo43862k(new C6864a());
        this.f35574a.mo44633m().mo43861j(new C6865b());
        this.f35574a.mo44632l().mo43862k(new C6866c());
        this.f35574a.mo44632l().mo43861j(new C6867d());
    }

    /* renamed from: b */
    public void mo44995b(C6801sz.C6806e<T> eVar) {
        this.f35572a = eVar;
    }

    /* renamed from: c */
    public void mo44996c(C6801sz.C6805d<T> dVar) {
        this.f35571a = dVar;
    }

    /* renamed from: d */
    public void mo44997d(Set<? extends C6622qz<T>> set) {
        this.f35576a.mo45026a(set);
    }

    /* renamed from: e */
    public void mo44998e(C6801sz.C6804c<T> cVar) {
        this.f35570a = cVar;
    }

    /* renamed from: f */
    public void mo44999f(C6801sz.C6807f<T> fVar) {
        this.f35573a = fVar;
    }

    /* renamed from: g */
    public void mo45000g() {
        this.f35574a.mo44633m().mo43862k((th1.C3623q) null);
        this.f35574a.mo44632l().mo43862k((th1.C3623q) null);
    }
}
