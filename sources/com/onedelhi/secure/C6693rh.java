package com.onedelhi.secure;

import com.onedelhi.secure.nl3;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000b\u0004B\u001d\u0012\u0014\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/rh;", "T", "", "", "b", "(Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "", "Lcom/onedelhi/secure/yh0;", "deferreds", "<init>", "([Lcom/onedelhi/secure/yh0;)V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.rh */
public final class C6693rh<T> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f34617a = AtomicIntegerFieldUpdater.newUpdater(C6693rh.class, "notCompletedCount");
    @vr2

    /* renamed from: a */
    public final yh0<T>[] f34618a;
    @vr2
    public volatile /* synthetic */ int notCompletedCount;

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR<\u0010\u0015\u001a\u000e\u0018\u00010\u000eR\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\u0010\u001a\u000e\u0018\u00010\u000eR\b\u0012\u0004\u0012\u00028\u00000\u000f8F@FX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/onedelhi/secure/rh$a;", "Lcom/onedelhi/secure/av1;", "", "cause", "Lcom/onedelhi/secure/un4;", "a1", "(Ljava/lang/Throwable;)V", "Lcom/onedelhi/secure/fn0;", "handle", "Lcom/onedelhi/secure/fn0;", "e1", "()Lcom/onedelhi/secure/fn0;", "g1", "(Lcom/onedelhi/secure/fn0;)V", "Lcom/onedelhi/secure/rh$b;", "Lcom/onedelhi/secure/rh;", "value", "d1", "()Lcom/onedelhi/secure/rh$b;", "f1", "(Lcom/onedelhi/secure/rh$b;)V", "disposer", "Lcom/onedelhi/secure/iu;", "", "continuation", "<init>", "(Lcom/onedelhi/secure/rh;Lcom/onedelhi/secure/iu;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.rh$a */
    public final class C6694a extends av1 {
        @vr2
        private volatile /* synthetic */ Object _disposer = null;

        /* renamed from: a */
        public fn0 f34619a;
        @vr2

        /* renamed from: a */
        public final C5744iu<List<? extends T>> f34620a;

        public C6694a(@vr2 C5744iu<? super List<? extends T>> iuVar) {
            this.f34620a = iuVar;
        }

        /* renamed from: X */
        public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
            mo32031a1((Throwable) obj);
            return un4.f36206a;
        }

        /* renamed from: a1 */
        public void mo32031a1(@ss2 Throwable th) {
            if (th != null) {
                Object j = this.f34620a.mo38240j(th);
                if (j != null) {
                    this.f34620a.mo38233N(j);
                    C6693rh<T>.b d1 = mo43896d1();
                    if (d1 != null) {
                        d1.mo43900b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C6693rh.f34617a.decrementAndGet(C6693rh.this) == 0) {
                C5744iu<List<? extends T>> iuVar = this.f34620a;
                nl3.C6191a aVar = nl3.f32575a;
                yh0[] a = C6693rh.this.f34618a;
                ArrayList arrayList = new ArrayList(a.length);
                int i = 0;
                int length = a.length;
                while (i < length) {
                    yh0 yh0 = a[i];
                    i++;
                    arrayList.add(yh0.mo30933p());
                }
                iuVar.mo31191m0(nl3.m58187b(arrayList));
            }
        }

        @ss2
        /* renamed from: d1 */
        public final C6693rh<T>.b mo43896d1() {
            return (C6695b) this._disposer;
        }

        @vr2
        /* renamed from: e1 */
        public final fn0 mo43897e1() {
            fn0 fn0 = this.f34619a;
            if (fn0 != null) {
                return fn0;
            }
            jt1.m53761S("handle");
            return null;
        }

        /* renamed from: f1 */
        public final void mo43898f1(@ss2 C6693rh<T>.b bVar) {
            this._disposer = bVar;
        }

        /* renamed from: g1 */
        public final void mo43899g1(@vr2 fn0 fn0) {
            this.f34619a = fn0;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\f\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/rh$b;", "Lcom/onedelhi/secure/au;", "Lcom/onedelhi/secure/un4;", "b", "", "cause", "a", "", "toString", "", "Lcom/onedelhi/secure/rh$a;", "Lcom/onedelhi/secure/rh;", "nodes", "<init>", "(Lcom/onedelhi/secure/rh;[Lcom/onedelhi/secure/rh$a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.rh$b */
    public final class C6695b extends C4592au {
        @vr2

        /* renamed from: a */
        public final C6693rh<T>.a[] f34623a;

        public C6695b(@vr2 C6693rh<T>.a[] aVarArr) {
            this.f34623a = aVarArr;
        }

        /* renamed from: X */
        public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
            mo31185a((Throwable) obj);
            return un4.f36206a;
        }

        /* renamed from: a */
        public void mo31185a(@ss2 Throwable th) {
            mo43900b();
        }

        /* renamed from: b */
        public final void mo43900b() {
            C6693rh<T>.a[] aVarArr = this.f34623a;
            int length = aVarArr.length;
            int i = 0;
            while (i < length) {
                C6693rh<T>.a aVar = aVarArr[i];
                i++;
                aVar.mo43897e1().mo30964e();
            }
        }

        @vr2
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f34623a + ']';
        }
    }

    public C6693rh(@vr2 yh0<? extends T>[] yh0Arr) {
        this.f34618a = yh0Arr;
        this.notCompletedCount = yh0Arr.length;
    }

    @ss2
    /* renamed from: b */
    public final Object mo43895b(@vr2 b80<? super List<? extends T>> b80) {
        C5847ju juVar = new C5847ju(lt1.m56482d(b80), 1);
        juVar.mo38234T();
        int length = this.f34618a.length;
        C6694a[] aVarArr = new C6694a[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            yh0 yh0 = this.f34618a[i2];
            yh0.mo32087O0();
            C6694a aVar = new C6694a(juVar);
            aVar.mo43899g1(yh0.mo32078F0(aVar));
            un4 un4 = un4.f36206a;
            aVarArr[i2] = aVar;
        }
        C6695b bVar = new C6695b(aVarArr);
        while (i < length) {
            C6694a aVar2 = aVarArr[i];
            i++;
            aVar2.mo43898f1(bVar);
        }
        if (juVar.mo38238d()) {
            bVar.mo43900b();
        } else {
            juVar.mo38232J(bVar);
        }
        Object A = juVar.mo38880A();
        if (A == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        return A;
    }
}
