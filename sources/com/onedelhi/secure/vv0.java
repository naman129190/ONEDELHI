package com.onedelhi.secure;

import com.onedelhi.secure.C1655a7;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0010\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002R\u0014\u0010\u0015\u001a\u00020\u00048TX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00028TX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u001c\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u001e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0014¨\u0006!"}, d2 = {"Lcom/onedelhi/secure/vv0;", "Lcom/onedelhi/secure/e90;", "", "A1", "", "B1", "C1", "Lcom/onedelhi/secure/tm0;", "task", "Lcom/onedelhi/secure/un4;", "i1", "unconfined", "l1", "c1", "", "parallelism", "V0", "shutdown", "h1", "s1", "()Z", "isEmpty", "j1", "()J", "nextTime", "b", "isActive", "w1", "isUnconfinedLoopActive", "z1", "isUnconfinedQueueEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class vv0 extends e90 {
    @ss2

    /* renamed from: a */
    public C6525qa<tm0<?>> f36723a;

    /* renamed from: b */
    public long f36724b;

    /* renamed from: b */
    public boolean f36725b;

    /* renamed from: f1 */
    public static /* synthetic */ void m68521f1(vv0 vv0, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            vv0.mo46374c1(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    /* renamed from: p1 */
    public static /* synthetic */ void m68522p1(vv0 vv0, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            vv0.mo46378l1(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: A1 */
    public long mo41645A1() {
        return !mo46372B1() ? Long.MAX_VALUE : 0;
    }

    /* renamed from: B1 */
    public final boolean mo46372B1() {
        tm0 e;
        C6525qa<tm0<?>> qaVar = this.f36723a;
        if (qaVar == null || (e = qaVar.mo43258e()) == null) {
            return false;
        }
        e.run();
        return true;
    }

    /* renamed from: C1 */
    public boolean mo41646C1() {
        return false;
    }

    @vr2
    /* renamed from: V0 */
    public final e90 mo34864V0(int i) {
        g32.m49063a(i);
        return this;
    }

    /* renamed from: b */
    public final boolean mo46373b() {
        return this.f36724b > 0;
    }

    /* renamed from: c1 */
    public final void mo46374c1(boolean z) {
        long h1 = this.f36724b - mo46375h1(z);
        this.f36724b = h1;
        if (h1 <= 0 && this.f36725b) {
            shutdown();
        }
    }

    /* renamed from: h1 */
    public final long mo46375h1(boolean z) {
        if (z) {
            return C1655a7.C1658c.f8859a;
        }
        return 1;
    }

    /* renamed from: i1 */
    public final void mo46376i1(@vr2 tm0<?> tm0) {
        C6525qa<tm0<?>> qaVar = this.f36723a;
        if (qaVar == null) {
            qaVar = new C6525qa<>();
            this.f36723a = qaVar;
        }
        qaVar.mo43254a(tm0);
    }

    /* renamed from: j1 */
    public long mo46377j1() {
        C6525qa<tm0<?>> qaVar = this.f36723a;
        return (qaVar != null && !qaVar.mo43257d()) ? 0 : Long.MAX_VALUE;
    }

    /* renamed from: l1 */
    public final void mo46378l1(boolean z) {
        this.f36724b += mo46375h1(z);
        if (!z) {
            this.f36725b = true;
        }
    }

    /* renamed from: s1 */
    public boolean mo46379s1() {
        return mo46382z1();
    }

    public void shutdown() {
    }

    /* renamed from: w1 */
    public final boolean mo46381w1() {
        return this.f36724b >= mo46375h1(true);
    }

    /* renamed from: z1 */
    public final boolean mo46382z1() {
        C6525qa<tm0<?>> qaVar = this.f36723a;
        if (qaVar == null) {
            return true;
        }
        return qaVar.mo43257d();
    }
}
