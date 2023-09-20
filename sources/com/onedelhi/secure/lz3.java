package com.onedelhi.secure;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C1175b;
import com.bumptech.glide.C1182c;
import com.onedelhi.secure.nu0;
import java.util.List;
import java.util.concurrent.Executor;

public final class lz3<R> implements si3, uz3, gk3 {

    /* renamed from: b */
    public static final String f15707b = "Request";

    /* renamed from: b */
    public static final boolean f15708b = Log.isLoggable(f15707b, 2);

    /* renamed from: c */
    public static final String f15709c = "Glide";

    /* renamed from: a */
    public final int f15710a;
    @mj1("requestLock")

    /* renamed from: a */
    public long f15711a;

    /* renamed from: a */
    public final Context f15712a;
    @mj1("requestLock")
    @ts2

    /* renamed from: a */
    public Drawable f15713a;

    /* renamed from: a */
    public final C1182c f15714a;
    @mj1("requestLock")

    /* renamed from: a */
    public ck3<R> f15715a;
    @ts2

    /* renamed from: a */
    public final ej3<R> f15716a;

    /* renamed from: a */
    public final f53 f15717a;

    /* renamed from: a */
    public final k34 f15718a;

    /* renamed from: a */
    public final kh4<? super R> f15719a;
    @mj1("requestLock")

    /* renamed from: a */
    public C2794a f15720a;
    @mj1("requestLock")

    /* renamed from: a */
    public nu0.C3015d f15721a;

    /* renamed from: a */
    public volatile nu0 f15722a;

    /* renamed from: a */
    public final s94<R> f15723a;

    /* renamed from: a */
    public final C3636tj<?> f15724a;

    /* renamed from: a */
    public final vi3 f15725a;

    /* renamed from: a */
    public final Class<R> f15726a;

    /* renamed from: a */
    public final Object f15727a;
    @ts2

    /* renamed from: a */
    public RuntimeException f15728a;
    @ts2

    /* renamed from: a */
    public final String f15729a;
    @ts2

    /* renamed from: a */
    public final List<ej3<R>> f15730a;

    /* renamed from: a */
    public final Executor f15731a;
    @mj1("requestLock")

    /* renamed from: a */
    public boolean f15732a;

    /* renamed from: b */
    public final int f15733b;
    @mj1("requestLock")
    @ts2

    /* renamed from: b */
    public Drawable f15734b;
    @ts2

    /* renamed from: b */
    public final Object f15735b;
    @mj1("requestLock")

    /* renamed from: c */
    public int f15736c;
    @mj1("requestLock")
    @ts2

    /* renamed from: c */
    public Drawable f15737c;
    @mj1("requestLock")

    /* renamed from: d */
    public int f15738d;

    /* renamed from: com.onedelhi.secure.lz3$a */
    public enum C2794a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public lz3(Context context, C1182c cVar, @mr2 Object obj, @ts2 Object obj2, Class<R> cls, C3636tj<?> tjVar, int i, int i2, f53 f53, s94<R> s94, @ts2 ej3<R> ej3, @ts2 List<ej3<R>> list, vi3 vi3, nu0 nu0, kh4<? super R> kh4, Executor executor) {
        this.f15729a = f15708b ? String.valueOf(super.hashCode()) : null;
        this.f15718a = k34.m19424a();
        this.f15727a = obj;
        this.f15712a = context;
        this.f15714a = cVar;
        this.f15735b = obj2;
        this.f15726a = cls;
        this.f15724a = tjVar;
        this.f15710a = i;
        this.f15733b = i2;
        this.f15717a = f53;
        this.f15723a = s94;
        this.f15716a = ej3;
        this.f15730a = list;
        this.f15725a = vi3;
        this.f15722a = nu0;
        this.f15719a = kh4;
        this.f15731a = executor;
        this.f15720a = C2794a.PENDING;
        if (this.f15728a == null && cVar.mo7499g().mo7503b(C1175b.C1179d.class)) {
            this.f15728a = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: u */
    public static int m21080u(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* renamed from: x */
    public static <R> lz3<R> m21081x(Context context, C1182c cVar, Object obj, Object obj2, Class<R> cls, C3636tj<?> tjVar, int i, int i2, f53 f53, s94<R> s94, ej3<R> ej3, @ts2 List<ej3<R>> list, vi3 vi3, nu0 nu0, kh4<? super R> kh4, Executor executor) {
        return new lz3(context, cVar, obj, obj2, cls, tjVar, i, i2, f53, s94, ej3, list, vi3, nu0, kh4, executor);
    }

    @mj1("requestLock")
    /* renamed from: A */
    public final void mo19954A() {
        if (mo19965l()) {
            Drawable drawable = null;
            if (this.f15735b == null) {
                drawable = mo19969p();
            }
            if (drawable == null) {
                drawable = mo19968o();
            }
            if (drawable == null) {
                drawable = mo19970q();
            }
            this.f15723a.mo16019b(drawable);
        }
    }

    /* renamed from: a */
    public void mo16693a(yg1 yg1) {
        mo19977y(yg1, 5);
    }

    /* renamed from: b */
    public boolean mo19955b() {
        boolean z;
        synchronized (this.f15727a) {
            z = this.f15720a == C2794a.COMPLETE;
        }
        return z;
    }

    /* renamed from: c */
    public void mo16694c(ck3<?> ck3, vd0 vd0, boolean z) {
        this.f15718a.mo18881c();
        ck3<?> ck32 = null;
        try {
            synchronized (this.f15727a) {
                try {
                    this.f15721a = null;
                    if (ck3 == null) {
                        mo16693a(new yg1("Expected to receive a Resource<R> with an object of " + this.f15726a + " inside, but instead got null."));
                        return;
                    }
                    Object obj = ck3.get();
                    if (obj != null) {
                        if (this.f15726a.isAssignableFrom(obj.getClass())) {
                            if (!mo19966m()) {
                                try {
                                    this.f15715a = null;
                                    this.f15720a = C2794a.COMPLETE;
                                    this.f15722a.mo21483l(ck3);
                                    return;
                                } catch (Throwable th) {
                                    ck32 = ck3;
                                    th = th;
                                    throw th;
                                }
                            } else {
                                mo19978z(ck3, obj, vd0, z);
                                return;
                            }
                        }
                    }
                    this.f15715a = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected to receive an object of ");
                    sb.append(this.f15726a);
                    sb.append(" but instead got ");
                    sb.append(obj != null ? obj.getClass() : "");
                    sb.append(to1.f35745h);
                    sb.append(obj);
                    sb.append("} inside Resource{");
                    sb.append(ck3);
                    sb.append("}.");
                    sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                    mo16693a(new yg1(sb.toString()));
                    this.f15722a.mo21483l(ck3);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (ck32 != null) {
                this.f15722a.mo21483l(ck32);
            }
            throw th3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r5.f15722a.mo21483l(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f15727a
            monitor-enter(r0)
            r5.mo19961i()     // Catch:{ all -> 0x0039 }
            com.onedelhi.secure.k34 r1 = r5.f15718a     // Catch:{ all -> 0x0039 }
            r1.mo18881c()     // Catch:{ all -> 0x0039 }
            com.onedelhi.secure.lz3$a r1 = r5.f15720a     // Catch:{ all -> 0x0039 }
            com.onedelhi.secure.lz3$a r2 = com.onedelhi.secure.lz3.C2794a.CLEARED     // Catch:{ all -> 0x0039 }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0013:
            r5.mo19967n()     // Catch:{ all -> 0x0039 }
            com.onedelhi.secure.ck3<R> r1 = r5.f15715a     // Catch:{ all -> 0x0039 }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f15715a = r3     // Catch:{ all -> 0x0039 }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            boolean r3 = r5.mo19963j()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x002e
            com.onedelhi.secure.s94<R> r3 = r5.f15723a     // Catch:{ all -> 0x0039 }
            android.graphics.drawable.Drawable r4 = r5.mo19970q()     // Catch:{ all -> 0x0039 }
            r3.mo16336p(r4)     // Catch:{ all -> 0x0039 }
        L_0x002e:
            r5.f15720a = r2     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0038
            com.onedelhi.secure.nu0 r0 = r5.f15722a
            r0.mo21483l(r1)
        L_0x0038:
            return
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.lz3.clear():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19957d() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f15727a
            monitor-enter(r0)
            r5.mo19961i()     // Catch:{ all -> 0x00a8 }
            com.onedelhi.secure.k34 r1 = r5.f15718a     // Catch:{ all -> 0x00a8 }
            r1.mo18881c()     // Catch:{ all -> 0x00a8 }
            long r1 = com.onedelhi.secure.j92.m18214b()     // Catch:{ all -> 0x00a8 }
            r5.f15711a = r1     // Catch:{ all -> 0x00a8 }
            java.lang.Object r1 = r5.f15735b     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x003c
            int r1 = r5.f15710a     // Catch:{ all -> 0x00a8 }
            int r2 = r5.f15733b     // Catch:{ all -> 0x00a8 }
            boolean r1 = com.onedelhi.secure.oq4.m24035w(r1, r2)     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x0027
            int r1 = r5.f15710a     // Catch:{ all -> 0x00a8 }
            r5.f15736c = r1     // Catch:{ all -> 0x00a8 }
            int r1 = r5.f15733b     // Catch:{ all -> 0x00a8 }
            r5.f15738d = r1     // Catch:{ all -> 0x00a8 }
        L_0x0027:
            android.graphics.drawable.Drawable r1 = r5.mo19969p()     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x002f
            r1 = 5
            goto L_0x0030
        L_0x002f:
            r1 = 3
        L_0x0030:
            com.onedelhi.secure.yg1 r2 = new com.onedelhi.secure.yg1     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00a8 }
            r5.mo19977y(r2, r1)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x003c:
            com.onedelhi.secure.lz3$a r1 = r5.f15720a     // Catch:{ all -> 0x00a8 }
            com.onedelhi.secure.lz3$a r2 = com.onedelhi.secure.lz3.C2794a.RUNNING     // Catch:{ all -> 0x00a8 }
            if (r1 == r2) goto L_0x00a0
            com.onedelhi.secure.lz3$a r3 = com.onedelhi.secure.lz3.C2794a.COMPLETE     // Catch:{ all -> 0x00a8 }
            if (r1 != r3) goto L_0x0050
            com.onedelhi.secure.ck3<R> r1 = r5.f15715a     // Catch:{ all -> 0x00a8 }
            com.onedelhi.secure.vd0 r2 = com.onedelhi.secure.vd0.MEMORY_CACHE     // Catch:{ all -> 0x00a8 }
            r3 = 0
            r5.mo16694c(r1, r2, r3)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x0050:
            com.onedelhi.secure.lz3$a r1 = com.onedelhi.secure.lz3.C2794a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00a8 }
            r5.f15720a = r1     // Catch:{ all -> 0x00a8 }
            int r3 = r5.f15710a     // Catch:{ all -> 0x00a8 }
            int r4 = r5.f15733b     // Catch:{ all -> 0x00a8 }
            boolean r3 = com.onedelhi.secure.oq4.m24035w(r3, r4)     // Catch:{ all -> 0x00a8 }
            if (r3 == 0) goto L_0x0066
            int r3 = r5.f15710a     // Catch:{ all -> 0x00a8 }
            int r4 = r5.f15733b     // Catch:{ all -> 0x00a8 }
            r5.mo19958e(r3, r4)     // Catch:{ all -> 0x00a8 }
            goto L_0x006b
        L_0x0066:
            com.onedelhi.secure.s94<R> r3 = r5.f15723a     // Catch:{ all -> 0x00a8 }
            r3.mo14955e(r5)     // Catch:{ all -> 0x00a8 }
        L_0x006b:
            com.onedelhi.secure.lz3$a r3 = r5.f15720a     // Catch:{ all -> 0x00a8 }
            if (r3 == r2) goto L_0x0071
            if (r3 != r1) goto L_0x0080
        L_0x0071:
            boolean r1 = r5.mo19965l()     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x0080
            com.onedelhi.secure.s94<R> r1 = r5.f15723a     // Catch:{ all -> 0x00a8 }
            android.graphics.drawable.Drawable r2 = r5.mo19970q()     // Catch:{ all -> 0x00a8 }
            r1.mo16334h(r2)     // Catch:{ all -> 0x00a8 }
        L_0x0080:
            boolean r1 = f15708b     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x009e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r1.<init>()     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00a8 }
            long r2 = r5.f15711a     // Catch:{ all -> 0x00a8 }
            double r2 = com.onedelhi.secure.j92.m18213a(r2)     // Catch:{ all -> 0x00a8 }
            r1.append(r2)     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a8 }
            r5.mo19973t(r1)     // Catch:{ all -> 0x00a8 }
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x00a0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00a8 }
            throw r1     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.lz3.mo19957d():void");
    }

    /* renamed from: e */
    public void mo19958e(int i, int i2) {
        Object obj;
        this.f15718a.mo18881c();
        Object obj2 = this.f15727a;
        synchronized (obj2) {
            try {
                boolean z = f15708b;
                if (z) {
                    mo19973t("Got onSizeReady in " + j92.m18213a(this.f15711a));
                }
                if (this.f15720a == C2794a.WAITING_FOR_SIZE) {
                    C2794a aVar = C2794a.RUNNING;
                    this.f15720a = aVar;
                    float S = this.f15724a.mo25162S();
                    this.f15736c = m21080u(i, S);
                    this.f15738d = m21080u(i2, S);
                    if (z) {
                        mo19973t("finished setup for calling load in " + j92.m18213a(this.f15711a));
                    }
                    C2794a aVar2 = aVar;
                    boolean z2 = z;
                    C2794a aVar3 = aVar2;
                    obj = obj2;
                    try {
                        this.f15721a = this.f15722a.mo21479g(this.f15714a, this.f15735b, this.f15724a.mo25160R(), this.f15736c, this.f15738d, this.f15724a.mo25158Q(), this.f15726a, this.f15717a, this.f15724a.mo25134E(), this.f15724a.mo25164U(), this.f15724a.mo25182h0(), this.f15724a.mo25174c0(), this.f15724a.mo25146K(), this.f15724a.mo25170a0(), this.f15724a.mo25166W(), this.f15724a.mo25165V(), this.f15724a.mo25144J(), this, this.f15731a);
                        if (this.f15720a != aVar3) {
                            this.f15721a = null;
                        }
                        if (z2) {
                            mo19973t("finished onSizeReady in " + j92.m18213a(this.f15711a));
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    /* renamed from: f */
    public boolean mo19959f(si3 si3) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        C3636tj<?> tjVar;
        f53 f53;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        C3636tj<?> tjVar2;
        f53 f532;
        int size2;
        si3 si32 = si3;
        if (!(si32 instanceof lz3)) {
            return false;
        }
        synchronized (this.f15727a) {
            i = this.f15710a;
            i2 = this.f15733b;
            obj = this.f15735b;
            cls = this.f15726a;
            tjVar = this.f15724a;
            f53 = this.f15717a;
            List<ej3<R>> list = this.f15730a;
            size = list != null ? list.size() : 0;
        }
        lz3 lz3 = (lz3) si32;
        synchronized (lz3.f15727a) {
            i3 = lz3.f15710a;
            i4 = lz3.f15733b;
            obj2 = lz3.f15735b;
            cls2 = lz3.f15726a;
            tjVar2 = lz3.f15724a;
            f532 = lz3.f15717a;
            List<ej3<R>> list2 = lz3.f15730a;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i == i3 && i2 == i4 && oq4.m24015c(obj, obj2) && cls.equals(cls2) && tjVar.equals(tjVar2) && f53 == f532 && size == size2;
    }

    /* renamed from: g */
    public Object mo16695g() {
        this.f15718a.mo18881c();
        return this.f15727a;
    }

    /* renamed from: h */
    public boolean mo19960h() {
        boolean z;
        synchronized (this.f15727a) {
            z = this.f15720a == C2794a.COMPLETE;
        }
        return z;
    }

    @mj1("requestLock")
    /* renamed from: i */
    public final void mo19961i() {
        if (this.f15732a) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f15727a) {
            C2794a aVar = this.f15720a;
            if (aVar != C2794a.RUNNING) {
                if (aVar != C2794a.WAITING_FOR_SIZE) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @mj1("requestLock")
    /* renamed from: j */
    public final boolean mo19963j() {
        vi3 vi3 = this.f15725a;
        return vi3 == null || vi3.mo22100g(this);
    }

    /* renamed from: k */
    public boolean mo19964k() {
        boolean z;
        synchronized (this.f15727a) {
            z = this.f15720a == C2794a.CLEARED;
        }
        return z;
    }

    @mj1("requestLock")
    /* renamed from: l */
    public final boolean mo19965l() {
        vi3 vi3 = this.f15725a;
        return vi3 == null || vi3.mo22099e(this);
    }

    @mj1("requestLock")
    /* renamed from: m */
    public final boolean mo19966m() {
        vi3 vi3 = this.f15725a;
        return vi3 == null || vi3.mo22102j(this);
    }

    @mj1("requestLock")
    /* renamed from: n */
    public final void mo19967n() {
        mo19961i();
        this.f15718a.mo18881c();
        this.f15723a.mo14956r(this);
        nu0.C3015d dVar = this.f15721a;
        if (dVar != null) {
            dVar.mo21493a();
            this.f15721a = null;
        }
    }

    @mj1("requestLock")
    /* renamed from: o */
    public final Drawable mo19968o() {
        if (this.f15713a == null) {
            Drawable G = this.f15724a.mo25138G();
            this.f15713a = G;
            if (G == null && this.f15724a.mo25136F() > 0) {
                this.f15713a = mo19972s(this.f15724a.mo25136F());
            }
        }
        return this.f15713a;
    }

    @mj1("requestLock")
    /* renamed from: p */
    public final Drawable mo19969p() {
        if (this.f15737c == null) {
            Drawable H = this.f15724a.mo25140H();
            this.f15737c = H;
            if (H == null && this.f15724a.mo25142I() > 0) {
                this.f15737c = mo19972s(this.f15724a.mo25142I());
            }
        }
        return this.f15737c;
    }

    @mj1("requestLock")
    /* renamed from: q */
    public final Drawable mo19970q() {
        if (this.f15734b == null) {
            Drawable N = this.f15724a.mo25152N();
            this.f15734b = N;
            if (N == null && this.f15724a.mo25154O() > 0) {
                this.f15734b = mo19972s(this.f15724a.mo25154O());
            }
        }
        return this.f15734b;
    }

    @mj1("requestLock")
    /* renamed from: r */
    public final boolean mo19971r() {
        vi3 vi3 = this.f15725a;
        return vi3 == null || !vi3.mo22097a().mo19955b();
    }

    @mj1("requestLock")
    /* renamed from: s */
    public final Drawable mo19972s(@dp0 int i) {
        return ap0.m11352a(this.f15714a, i, this.f15724a.mo25163T() != null ? this.f15724a.mo25163T() : this.f15712a.getTheme());
    }

    /* renamed from: t */
    public final void mo19973t(String str) {
        Log.v(f15707b, str + " this: " + this.f15729a);
    }

    /* renamed from: u0 */
    public void mo19974u0() {
        synchronized (this.f15727a) {
            if (isRunning()) {
                clear();
            }
        }
    }

    @mj1("requestLock")
    /* renamed from: v */
    public final void mo19975v() {
        vi3 vi3 = this.f15725a;
        if (vi3 != null) {
            vi3.mo22101i(this);
        }
    }

    @mj1("requestLock")
    /* renamed from: w */
    public final void mo19976w() {
        vi3 vi3 = this.f15725a;
        if (vi3 != null) {
            vi3.mo22098c(this);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: y */
    public final void mo19977y(yg1 yg1, int i) {
        boolean z;
        this.f15718a.mo18881c();
        synchronized (this.f15727a) {
            yg1.mo27468l(this.f15728a);
            int h = this.f15714a.mo7500h();
            if (h <= i) {
                Log.w("Glide", "Load failed for " + this.f15735b + " with size [" + this.f15736c + "x" + this.f15738d + "]", yg1);
                if (h <= 4) {
                    yg1.mo27464h("Glide");
                }
            }
            this.f15721a = null;
            this.f15720a = C2794a.FAILED;
            boolean z2 = true;
            this.f15732a = true;
            try {
                List<ej3<R>> list = this.f15730a;
                if (list != null) {
                    z = false;
                    for (ej3<R> f : list) {
                        z |= f.mo15213f(yg1, this.f15735b, this.f15723a, mo19971r());
                    }
                } else {
                    z = false;
                }
                ej3<R> ej3 = this.f15716a;
                if (ej3 == null || !ej3.mo15213f(yg1, this.f15735b, this.f15723a, mo19971r())) {
                    z2 = false;
                }
                if (!z && !z2) {
                    mo19954A();
                }
                this.f15732a = false;
                mo19975v();
            } catch (Throwable th) {
                this.f15732a = false;
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a7 A[Catch:{ all -> 0x00b8 }] */
    @com.onedelhi.secure.mj1("requestLock")
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19978z(com.onedelhi.secure.ck3<R> r10, R r11, com.onedelhi.secure.vd0 r12, boolean r13) {
        /*
            r9 = this;
            boolean r13 = r9.mo19971r()
            com.onedelhi.secure.lz3$a r0 = com.onedelhi.secure.lz3.C2794a.COMPLETE
            r9.f15720a = r0
            r9.f15715a = r10
            com.bumptech.glide.c r10 = r9.f15714a
            int r10 = r10.mo7500h()
            r0 = 3
            if (r10 > r0) goto L_0x006a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Finished loading "
            r10.append(r0)
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r10.append(r0)
            java.lang.String r0 = " from "
            r10.append(r0)
            r10.append(r12)
            java.lang.String r0 = " for "
            r10.append(r0)
            java.lang.Object r0 = r9.f15735b
            r10.append(r0)
            java.lang.String r0 = " with size ["
            r10.append(r0)
            int r0 = r9.f15736c
            r10.append(r0)
            java.lang.String r0 = "x"
            r10.append(r0)
            int r0 = r9.f15738d
            r10.append(r0)
            java.lang.String r0 = "] in "
            r10.append(r0)
            long r0 = r9.f15711a
            double r0 = com.onedelhi.secure.j92.m18213a(r0)
            r10.append(r0)
            java.lang.String r0 = " ms"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r10)
        L_0x006a:
            r10 = 1
            r9.f15732a = r10
            r6 = 0
            java.util.List<com.onedelhi.secure.ej3<R>> r0 = r9.f15730a     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x0090
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x00b8 }
            r8 = 0
        L_0x0077:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x00b8 }
            com.onedelhi.secure.ej3 r0 = (com.onedelhi.secure.ej3) r0     // Catch:{ all -> 0x00b8 }
            java.lang.Object r2 = r9.f15735b     // Catch:{ all -> 0x00b8 }
            com.onedelhi.secure.s94<R> r3 = r9.f15723a     // Catch:{ all -> 0x00b8 }
            r1 = r11
            r4 = r12
            r5 = r13
            boolean r0 = r0.mo15214i(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b8 }
            r8 = r8 | r0
            goto L_0x0077
        L_0x0090:
            r8 = 0
        L_0x0091:
            com.onedelhi.secure.ej3<R> r0 = r9.f15716a     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r2 = r9.f15735b     // Catch:{ all -> 0x00b8 }
            com.onedelhi.secure.s94<R> r3 = r9.f15723a     // Catch:{ all -> 0x00b8 }
            r1 = r11
            r4 = r12
            r5 = r13
            boolean r0 = r0.mo15214i(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r10 = 0
        L_0x00a4:
            r10 = r10 | r8
            if (r10 != 0) goto L_0x00b2
            com.onedelhi.secure.kh4<? super R> r10 = r9.f15719a     // Catch:{ all -> 0x00b8 }
            com.onedelhi.secure.jh4 r10 = r10.mo16140a(r12, r13)     // Catch:{ all -> 0x00b8 }
            com.onedelhi.secure.s94<R> r12 = r9.f15723a     // Catch:{ all -> 0x00b8 }
            r12.mo16021s(r11, r10)     // Catch:{ all -> 0x00b8 }
        L_0x00b2:
            r9.f15732a = r6
            r9.mo19976w()
            return
        L_0x00b8:
            r10 = move-exception
            r9.f15732a = r6
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.lz3.mo19978z(com.onedelhi.secure.ck3, java.lang.Object, com.onedelhi.secure.vd0, boolean):void");
    }
}
