package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0690e;
import com.onedelhi.secure.C3480s9;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.c01;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nq3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.z22;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.lifecycle.g */
public class C0695g extends C0690e {

    /* renamed from: a */
    public int f4086a;

    /* renamed from: a */
    public C0690e.C0693c f4087a;

    /* renamed from: a */
    public c01<z22, C0696a> f4088a;

    /* renamed from: a */
    public final WeakReference<a32> f4089a;

    /* renamed from: a */
    public ArrayList<C0690e.C0693c> f4090a;

    /* renamed from: a */
    public boolean f4091a;

    /* renamed from: b */
    public boolean f4092b;

    /* renamed from: c */
    public final boolean f4093c;

    /* renamed from: androidx.lifecycle.g$a */
    public static class C0696a {

        /* renamed from: a */
        public C0690e.C0693c f4094a;

        /* renamed from: a */
        public C0694f f4095a;

        public C0696a(z22 z22, C0690e.C0693c cVar) {
            this.f4095a = Lifecycling.m4735g(z22);
            this.f4094a = cVar;
        }

        /* renamed from: a */
        public void mo4976a(a32 a32, C0690e.C0692b bVar) {
            C0690e.C0693c e = bVar.mo4961e();
            this.f4094a = C0695g.m4799m(this.f4094a, e);
            this.f4095a.mo669g(a32, bVar);
            this.f4094a = e;
        }
    }

    public C0695g(@mr2 a32 a32) {
        this(a32, true);
    }

    public C0695g(@mr2 a32 a32, boolean z) {
        this.f4088a = new c01<>();
        this.f4086a = 0;
        this.f4091a = false;
        this.f4092b = false;
        this.f4090a = new ArrayList<>();
        this.f4089a = new WeakReference<>(a32);
        this.f4087a = C0690e.C0693c.INITIALIZED;
        this.f4093c = z;
    }

    @hw4
    @mr2
    /* renamed from: f */
    public static C0695g m4798f(@mr2 a32 a32) {
        return new C0695g(a32, false);
    }

    /* renamed from: m */
    public static C0690e.C0693c m4799m(@mr2 C0690e.C0693c cVar, @ts2 C0690e.C0693c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    /* renamed from: a */
    public void mo4958a(@mr2 z22 z22) {
        a32 a32;
        mo4965g("addObserver");
        C0690e.C0693c cVar = this.f4087a;
        C0690e.C0693c cVar2 = C0690e.C0693c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = C0690e.C0693c.INITIALIZED;
        }
        C0696a aVar = new C0696a(z22, cVar2);
        if (this.f4088a.mo13878k(z22, aVar) == null && (a32 = (a32) this.f4089a.get()) != null) {
            boolean z = this.f4086a != 0 || this.f4091a;
            C0690e.C0693c e = mo4964e(z22);
            this.f4086a++;
            while (aVar.f4094a.compareTo(e) < 0 && this.f4088a.contains(z22)) {
                mo4973p(aVar.f4094a);
                C0690e.C0692b g = C0690e.C0692b.m4793g(aVar.f4094a);
                if (g != null) {
                    aVar.mo4976a(a32, g);
                    mo4972o();
                    e = mo4964e(z22);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f4094a);
                }
            }
            if (!z) {
                mo4975r();
            }
            this.f4086a--;
        }
    }

    @mr2
    /* renamed from: b */
    public C0690e.C0693c mo4959b() {
        return this.f4087a;
    }

    /* renamed from: c */
    public void mo4960c(@mr2 z22 z22) {
        mo4965g("removeObserver");
        this.f4088a.mo13879l(z22);
    }

    /* renamed from: d */
    public final void mo4963d(a32 a32) {
        Iterator<Map.Entry<z22, C0696a>> b = this.f4088a.mo21420b();
        while (b.hasNext() && !this.f4092b) {
            Map.Entry next = b.next();
            C0696a aVar = (C0696a) next.getValue();
            while (aVar.f4094a.compareTo(this.f4087a) > 0 && !this.f4092b && this.f4088a.contains((z22) next.getKey())) {
                C0690e.C0692b a = C0690e.C0692b.m4791a(aVar.f4094a);
                if (a != null) {
                    mo4973p(a.mo4961e());
                    aVar.mo4976a(a32, a);
                    mo4972o();
                } else {
                    throw new IllegalStateException("no event down from " + aVar.f4094a);
                }
            }
        }
    }

    /* renamed from: e */
    public final C0690e.C0693c mo4964e(z22 z22) {
        Map.Entry<z22, C0696a> n = this.f4088a.mo13880n(z22);
        C0690e.C0693c cVar = null;
        C0690e.C0693c cVar2 = n != null ? n.getValue().f4094a : null;
        if (!this.f4090a.isEmpty()) {
            ArrayList<C0690e.C0693c> arrayList = this.f4090a;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return m4799m(m4799m(this.f4087a, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: g */
    public final void mo4965g(String str) {
        if (this.f4093c && !C3480s9.m27323f().mo12886c()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    /* renamed from: h */
    public final void mo4966h(a32 a32) {
        nq3<K, V>.d g = this.f4088a.mo21423g();
        while (g.hasNext() && !this.f4092b) {
            Map.Entry entry = (Map.Entry) g.next();
            C0696a aVar = (C0696a) entry.getValue();
            while (aVar.f4094a.compareTo(this.f4087a) < 0 && !this.f4092b && this.f4088a.contains((z22) entry.getKey())) {
                mo4973p(aVar.f4094a);
                C0690e.C0692b g2 = C0690e.C0692b.m4793g(aVar.f4094a);
                if (g2 != null) {
                    aVar.mo4976a(a32, g2);
                    mo4972o();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f4094a);
                }
            }
        }
    }

    /* renamed from: i */
    public int mo4967i() {
        mo4965g("getObserverCount");
        return this.f4088a.size();
    }

    /* renamed from: j */
    public void mo4968j(@mr2 C0690e.C0692b bVar) {
        mo4965g("handleLifecycleEvent");
        mo4971n(bVar.mo4961e());
    }

    /* renamed from: k */
    public final boolean mo4969k() {
        if (this.f4088a.size() == 0) {
            return true;
        }
        C0690e.C0693c cVar = this.f4088a.mo21421e().getValue().f4094a;
        C0690e.C0693c cVar2 = this.f4088a.mo21425i().getValue().f4094a;
        return cVar == cVar2 && this.f4087a == cVar2;
    }

    @bc2
    @Deprecated
    /* renamed from: l */
    public void mo4970l(@mr2 C0690e.C0693c cVar) {
        mo4965g("markState");
        mo4974q(cVar);
    }

    /* renamed from: n */
    public final void mo4971n(C0690e.C0693c cVar) {
        C0690e.C0693c cVar2 = this.f4087a;
        if (cVar2 != cVar) {
            if (cVar2 == C0690e.C0693c.INITIALIZED && cVar == C0690e.C0693c.DESTROYED) {
                throw new IllegalStateException("no event down from " + this.f4087a);
            }
            this.f4087a = cVar;
            if (this.f4091a || this.f4086a != 0) {
                this.f4092b = true;
                return;
            }
            this.f4091a = true;
            mo4975r();
            this.f4091a = false;
            if (this.f4087a == C0690e.C0693c.DESTROYED) {
                this.f4088a = new c01<>();
            }
        }
    }

    /* renamed from: o */
    public final void mo4972o() {
        ArrayList<C0690e.C0693c> arrayList = this.f4090a;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: p */
    public final void mo4973p(C0690e.C0693c cVar) {
        this.f4090a.add(cVar);
    }

    @bc2
    /* renamed from: q */
    public void mo4974q(@mr2 C0690e.C0693c cVar) {
        mo4965g("setCurrentState");
        mo4971n(cVar);
    }

    /* renamed from: r */
    public final void mo4975r() {
        a32 a32 = (a32) this.f4089a.get();
        if (a32 != null) {
            while (true) {
                boolean k = mo4969k();
                this.f4092b = false;
                if (!k) {
                    if (this.f4087a.compareTo(this.f4088a.mo21421e().getValue().f4094a) < 0) {
                        mo4963d(a32);
                    }
                    Map.Entry<z22, C0696a> i = this.f4088a.mo21425i();
                    if (!this.f4092b && i != null && this.f4087a.compareTo(i.getValue().f4094a) > 0) {
                        mo4966h(a32);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }
}
