package androidx.lifecycle;

import androidx.lifecycle.C0690e;
import com.onedelhi.secure.C3480s9;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.bu2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nq3;
import com.onedelhi.secure.ts2;
import java.util.Iterator;
import java.util.Map;

public abstract class LiveData<T> {

    /* renamed from: c */
    public static final int f4036c = -1;

    /* renamed from: d */
    public static final Object f4037d = new Object();

    /* renamed from: a */
    public int f4038a;

    /* renamed from: a */
    public nq3<bu2<? super T>, LiveData<T>.c> f4039a;

    /* renamed from: a */
    public final Object f4040a;

    /* renamed from: a */
    public final Runnable f4041a;

    /* renamed from: a */
    public boolean f4042a;

    /* renamed from: b */
    public int f4043b;

    /* renamed from: b */
    public volatile Object f4044b;

    /* renamed from: b */
    public boolean f4045b;

    /* renamed from: c */
    public volatile Object f4046c;

    /* renamed from: c */
    public boolean f4047c;

    public class LifecycleBoundObserver extends LiveData<T>.c implements C0694f {
        @mr2

        /* renamed from: a */
        public final a32 f4048a;

        public LifecycleBoundObserver(@mr2 a32 a32, bu2<? super T> bu2) {
            super(bu2);
            this.f4048a = a32;
        }

        /* renamed from: g */
        public void mo669g(@mr2 a32 a32, @mr2 C0690e.C0692b bVar) {
            C0690e.C0693c b = this.f4048a.getLifecycle().mo4959b();
            if (b == C0690e.C0693c.DESTROYED) {
                LiveData.this.mo4931o(this.f4053a);
                return;
            }
            C0690e.C0693c cVar = null;
            while (cVar != b) {
                mo4938h(mo4936k());
                cVar = b;
                b = this.f4048a.getLifecycle().mo4959b();
            }
        }

        /* renamed from: i */
        public void mo4934i() {
            this.f4048a.getLifecycle().mo4960c(this);
        }

        /* renamed from: j */
        public boolean mo4935j(a32 a32) {
            return this.f4048a == a32;
        }

        /* renamed from: k */
        public boolean mo4936k() {
            return this.f4048a.getLifecycle().mo4959b().mo4962a(C0690e.C0693c.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    public class C0681a implements Runnable {
        public C0681a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f4040a) {
                obj = LiveData.this.f4046c;
                LiveData.this.f4046c = LiveData.f4037d;
            }
            LiveData.this.mo4933q(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    public class C0682b extends LiveData<T>.c {
        public C0682b(bu2<? super T> bu2) {
            super(bu2);
        }

        /* renamed from: k */
        public boolean mo4936k() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    public abstract class C0683c {

        /* renamed from: a */
        public final bu2<? super T> f4053a;

        /* renamed from: b */
        public boolean f4054b;

        /* renamed from: n */
        public int f4055n = -1;

        public C0683c(bu2<? super T> bu2) {
            this.f4053a = bu2;
        }

        /* renamed from: h */
        public void mo4938h(boolean z) {
            if (z != this.f4054b) {
                this.f4054b = z;
                LiveData.this.mo4919c(z ? 1 : -1);
                if (this.f4054b) {
                    LiveData.this.mo4921e(this);
                }
            }
        }

        /* renamed from: i */
        public void mo4934i() {
        }

        /* renamed from: j */
        public boolean mo4935j(a32 a32) {
            return false;
        }

        /* renamed from: k */
        public abstract boolean mo4936k();
    }

    public LiveData() {
        this.f4040a = new Object();
        this.f4039a = new nq3<>();
        this.f4038a = 0;
        Object obj = f4037d;
        this.f4046c = obj;
        this.f4041a = new C0681a();
        this.f4044b = obj;
        this.f4043b = -1;
    }

    public LiveData(T t) {
        this.f4040a = new Object();
        this.f4039a = new nq3<>();
        this.f4038a = 0;
        this.f4046c = f4037d;
        this.f4041a = new C0681a();
        this.f4044b = t;
        this.f4043b = 0;
    }

    /* renamed from: b */
    public static void m4738b(String str) {
        if (!C3480s9.m27323f().mo12886c()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    @bc2
    /* renamed from: c */
    public void mo4919c(int i) {
        int i2 = this.f4038a;
        this.f4038a = i + i2;
        if (!this.f4042a) {
            this.f4042a = true;
            while (true) {
                try {
                    int i3 = this.f4038a;
                    if (i2 != i3) {
                        boolean z = i2 == 0 && i3 > 0;
                        boolean z2 = i2 > 0 && i3 == 0;
                        if (z) {
                            mo4928l();
                        } else if (z2) {
                            mo4929m();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.f4042a = false;
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo4920d(LiveData<T>.c cVar) {
        if (cVar.f4054b) {
            if (!cVar.mo4936k()) {
                cVar.mo4938h(false);
                return;
            }
            int i = cVar.f4055n;
            int i2 = this.f4043b;
            if (i < i2) {
                cVar.f4055n = i2;
                cVar.f4053a.mo3946b(this.f4044b);
            }
        }
    }

    /* renamed from: e */
    public void mo4921e(@ts2 LiveData<T>.c cVar) {
        if (this.f4045b) {
            this.f4047c = true;
            return;
        }
        this.f4045b = true;
        do {
            this.f4047c = false;
            if (cVar == null) {
                nq3<K, V>.d g = this.f4039a.mo21423g();
                while (g.hasNext()) {
                    mo4920d((C0683c) ((Map.Entry) g.next()).getValue());
                    if (this.f4047c) {
                        break;
                    }
                }
            } else {
                mo4920d(cVar);
                cVar = null;
            }
        } while (this.f4047c);
        this.f4045b = false;
    }

    @ts2
    /* renamed from: f */
    public T mo4922f() {
        T t = this.f4044b;
        if (t != f4037d) {
            return t;
        }
        return null;
    }

    /* renamed from: g */
    public int mo4923g() {
        return this.f4043b;
    }

    /* renamed from: h */
    public boolean mo4924h() {
        return this.f4038a > 0;
    }

    /* renamed from: i */
    public boolean mo4925i() {
        return this.f4039a.size() > 0;
    }

    @bc2
    /* renamed from: j */
    public void mo4926j(@mr2 a32 a32, @mr2 bu2<? super T> bu2) {
        m4738b("observe");
        if (a32.getLifecycle().mo4959b() != C0690e.C0693c.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(a32, bu2);
            C0683c k = this.f4039a.mo13878k(bu2, lifecycleBoundObserver);
            if (k != null && !k.mo4935j(a32)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (k == null) {
                a32.getLifecycle().mo4958a(lifecycleBoundObserver);
            }
        }
    }

    @bc2
    /* renamed from: k */
    public void mo4927k(@mr2 bu2<? super T> bu2) {
        m4738b("observeForever");
        C0682b bVar = new C0682b(bu2);
        C0683c k = this.f4039a.mo13878k(bu2, bVar);
        if (k instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (k == null) {
            bVar.mo4938h(true);
        }
    }

    /* renamed from: l */
    public void mo4928l() {
    }

    /* renamed from: m */
    public void mo4929m() {
    }

    /* renamed from: n */
    public void mo4930n(T t) {
        boolean z;
        synchronized (this.f4040a) {
            z = this.f4046c == f4037d;
            this.f4046c = t;
        }
        if (z) {
            C3480s9.m27323f().mo12887d(this.f4041a);
        }
    }

    @bc2
    /* renamed from: o */
    public void mo4931o(@mr2 bu2<? super T> bu2) {
        m4738b("removeObserver");
        C0683c l = this.f4039a.mo13879l(bu2);
        if (l != null) {
            l.mo4934i();
            l.mo4938h(false);
        }
    }

    @bc2
    /* renamed from: p */
    public void mo4932p(@mr2 a32 a32) {
        m4738b("removeObservers");
        Iterator<Map.Entry<bu2<? super T>, LiveData<T>.c>> it = this.f4039a.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (((C0683c) next.getValue()).mo4935j(a32)) {
                mo4931o((bu2) next.getKey());
            }
        }
    }

    @bc2
    /* renamed from: q */
    public void mo4933q(T t) {
        m4738b("setValue");
        this.f4043b++;
        this.f4044b = t;
        mo4921e((LiveData<T>.c) null);
    }
}
