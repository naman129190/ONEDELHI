package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.a */
public class C4218a {

    /* renamed from: a */
    public static final int f24412a = 0;

    /* renamed from: a */
    public static C4218a f24413a = null;

    /* renamed from: b */
    public static final int f24414b = 1500;

    /* renamed from: c */
    public static final int f24415c = 2750;
    @mr2

    /* renamed from: a */
    public final Handler f24416a = new Handler(Looper.getMainLooper(), new C4219a());
    @ts2

    /* renamed from: a */
    public C4221c f24417a;
    @mr2

    /* renamed from: a */
    public final Object f24418a = new Object();
    @ts2

    /* renamed from: b */
    public C4221c f24419b;

    /* renamed from: com.google.android.material.snackbar.a$a */
    public class C4219a implements Handler.Callback {
        public C4219a() {
        }

        public boolean handleMessage(@mr2 Message message) {
            if (message.what != 0) {
                return false;
            }
            C4218a.this.mo28925d((C4221c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.a$b */
    public interface C4220b {
        /* renamed from: a */
        void mo28879a();

        /* renamed from: b */
        void mo28880b(int i);
    }

    /* renamed from: com.google.android.material.snackbar.a$c */
    public static class C4221c {

        /* renamed from: a */
        public int f24421a;
        @mr2

        /* renamed from: a */
        public final WeakReference<C4220b> f24422a;

        /* renamed from: a */
        public boolean f24423a;

        public C4221c(int i, C4220b bVar) {
            this.f24422a = new WeakReference<>(bVar);
            this.f24421a = i;
        }

        /* renamed from: a */
        public boolean mo28938a(@ts2 C4220b bVar) {
            return bVar != null && this.f24422a.get() == bVar;
        }
    }

    /* renamed from: c */
    public static C4218a m34009c() {
        if (f24413a == null) {
            f24413a = new C4218a();
        }
        return f24413a;
    }

    /* renamed from: a */
    public final boolean mo28923a(@mr2 C4221c cVar, int i) {
        C4220b bVar = (C4220b) cVar.f24422a.get();
        if (bVar == null) {
            return false;
        }
        this.f24416a.removeCallbacksAndMessages(cVar);
        bVar.mo28880b(i);
        return true;
    }

    /* renamed from: b */
    public void mo28924b(C4220b bVar, int i) {
        C4221c cVar;
        synchronized (this.f24418a) {
            if (mo28928g(bVar)) {
                cVar = this.f24417a;
            } else if (mo28929h(bVar)) {
                cVar = this.f24419b;
            }
            mo28923a(cVar, i);
        }
    }

    /* renamed from: d */
    public void mo28925d(@mr2 C4221c cVar) {
        synchronized (this.f24418a) {
            if (this.f24417a == cVar || this.f24419b == cVar) {
                mo28923a(cVar, 2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo28926e(C4220b bVar) {
        boolean g;
        synchronized (this.f24418a) {
            g = mo28928g(bVar);
        }
        return g;
    }

    /* renamed from: f */
    public boolean mo28927f(C4220b bVar) {
        boolean z;
        synchronized (this.f24418a) {
            if (!mo28928g(bVar)) {
                if (!mo28929h(bVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: g */
    public final boolean mo28928g(C4220b bVar) {
        C4221c cVar = this.f24417a;
        return cVar != null && cVar.mo28938a(bVar);
    }

    /* renamed from: h */
    public final boolean mo28929h(C4220b bVar) {
        C4221c cVar = this.f24419b;
        return cVar != null && cVar.mo28938a(bVar);
    }

    /* renamed from: i */
    public void mo28930i(C4220b bVar) {
        synchronized (this.f24418a) {
            if (mo28928g(bVar)) {
                this.f24417a = null;
                if (this.f24419b != null) {
                    mo28936o();
                }
            }
        }
    }

    /* renamed from: j */
    public void mo28931j(C4220b bVar) {
        synchronized (this.f24418a) {
            if (mo28928g(bVar)) {
                mo28934m(this.f24417a);
            }
        }
    }

    /* renamed from: k */
    public void mo28932k(C4220b bVar) {
        synchronized (this.f24418a) {
            if (mo28928g(bVar)) {
                C4221c cVar = this.f24417a;
                if (!cVar.f24423a) {
                    cVar.f24423a = true;
                    this.f24416a.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    /* renamed from: l */
    public void mo28933l(C4220b bVar) {
        synchronized (this.f24418a) {
            if (mo28928g(bVar)) {
                C4221c cVar = this.f24417a;
                if (cVar.f24423a) {
                    cVar.f24423a = false;
                    mo28934m(cVar);
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo28934m(@mr2 C4221c cVar) {
        int i = cVar.f24421a;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : f24415c;
            }
            this.f24416a.removeCallbacksAndMessages(cVar);
            Handler handler = this.f24416a;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* renamed from: n */
    public void mo28935n(int i, C4220b bVar) {
        synchronized (this.f24418a) {
            if (mo28928g(bVar)) {
                C4221c cVar = this.f24417a;
                cVar.f24421a = i;
                this.f24416a.removeCallbacksAndMessages(cVar);
                mo28934m(this.f24417a);
                return;
            }
            if (mo28929h(bVar)) {
                this.f24419b.f24421a = i;
            } else {
                this.f24419b = new C4221c(i, bVar);
            }
            C4221c cVar2 = this.f24417a;
            if (cVar2 == null || !mo28923a(cVar2, 4)) {
                this.f24417a = null;
                mo28936o();
            }
        }
    }

    /* renamed from: o */
    public final void mo28936o() {
        C4221c cVar = this.f24419b;
        if (cVar != null) {
            this.f24417a = cVar;
            this.f24419b = null;
            C4220b bVar = (C4220b) cVar.f24422a.get();
            if (bVar != null) {
                bVar.mo28879a();
            } else {
                this.f24417a = null;
            }
        }
    }
}
