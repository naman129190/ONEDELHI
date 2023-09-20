package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C1173a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class tg1 {

    /* renamed from: a */
    public int f20792a;

    /* renamed from: a */
    public Bitmap f20793a;

    /* renamed from: a */
    public final Handler f20794a;

    /* renamed from: a */
    public final fj3 f20795a;

    /* renamed from: a */
    public final C2355hm f20796a;

    /* renamed from: a */
    public final mg1 f20797a;

    /* renamed from: a */
    public sg4<Bitmap> f20798a;

    /* renamed from: a */
    public C3602a f20799a;
    @ts2

    /* renamed from: a */
    public C3605d f20800a;

    /* renamed from: a */
    public ti3<Bitmap> f20801a;

    /* renamed from: a */
    public final List<C3603b> f20802a;

    /* renamed from: a */
    public boolean f20803a;

    /* renamed from: b */
    public int f20804b;

    /* renamed from: b */
    public C3602a f20805b;

    /* renamed from: b */
    public boolean f20806b;

    /* renamed from: c */
    public int f20807c;

    /* renamed from: c */
    public C3602a f20808c;

    /* renamed from: c */
    public boolean f20809c;

    /* renamed from: d */
    public boolean f20810d;

    @hw4
    /* renamed from: com.onedelhi.secure.tg1$a */
    public static class C3602a extends nc0<Bitmap> {

        /* renamed from: a */
        public Bitmap f20811a;

        /* renamed from: a */
        public final Handler f20812a;

        /* renamed from: b */
        public final long f20813b;

        /* renamed from: p */
        public final int f20814p;

        public C3602a(Handler handler, int i, long j) {
            this.f20812a = handler;
            this.f20814p = i;
            this.f20813b = j;
        }

        /* renamed from: f */
        public Bitmap mo24925f() {
            return this.f20811a;
        }

        /* renamed from: i */
        public void mo16021s(@mr2 Bitmap bitmap, @ts2 jh4<? super Bitmap> jh4) {
            this.f20811a = bitmap;
            this.f20812a.sendMessageAtTime(this.f20812a.obtainMessage(1, this), this.f20813b);
        }

        /* renamed from: p */
        public void mo16336p(@ts2 Drawable drawable) {
            this.f20811a = null;
        }
    }

    /* renamed from: com.onedelhi.secure.tg1$b */
    public interface C3603b {
        /* renamed from: a */
        void mo21230a();
    }

    /* renamed from: com.onedelhi.secure.tg1$c */
    public class C3604c implements Handler.Callback {

        /* renamed from: n */
        public static final int f20815n = 1;

        /* renamed from: o */
        public static final int f20816o = 2;

        public C3604c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                tg1.this.mo24916o((C3602a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                tg1.this.f20795a.mo15967C((C3602a) message.obj);
                return false;
            }
        }
    }

    @hw4
    /* renamed from: com.onedelhi.secure.tg1$d */
    public interface C3605d {
        /* renamed from: a */
        void mo24928a();
    }

    public tg1(C1173a aVar, mg1 mg1, int i, int i2, sg4<Bitmap> sg4, Bitmap bitmap) {
        this(aVar.mo7457h(), C1173a.m7523E(aVar.mo7459j()), mg1, (Handler) null, m28400k(C1173a.m7523E(aVar.mo7459j()), i, i2), sg4, bitmap);
    }

    public tg1(C2355hm hmVar, fj3 fj3, mg1 mg1, Handler handler, ti3<Bitmap> ti3, sg4<Bitmap> sg4, Bitmap bitmap) {
        this.f20802a = new ArrayList();
        this.f20795a = fj3;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C3604c()) : handler;
        this.f20796a = hmVar;
        this.f20794a = handler;
        this.f20801a = ti3;
        this.f20797a = mg1;
        mo24918q(sg4, bitmap);
    }

    /* renamed from: g */
    public static ky1 m28399g() {
        return new mt2(Double.valueOf(Math.random()));
    }

    /* renamed from: k */
    public static ti3<Bitmap> m28400k(fj3 fj3, int i, int i2) {
        return fj3.mo16015x().mo25088a(((mj3) ((mj3) mj3.m21650X0(km0.f15020b).mo25159Q0(true)).mo25139G0(true)).mo25203v0(i, i2));
    }

    /* renamed from: a */
    public void mo24904a() {
        this.f20802a.clear();
        mo24917p();
        mo24922u();
        C3602a aVar = this.f20799a;
        if (aVar != null) {
            this.f20795a.mo15967C(aVar);
            this.f20799a = null;
        }
        C3602a aVar2 = this.f20805b;
        if (aVar2 != null) {
            this.f20795a.mo15967C(aVar2);
            this.f20805b = null;
        }
        C3602a aVar3 = this.f20808c;
        if (aVar3 != null) {
            this.f20795a.mo15967C(aVar3);
            this.f20808c = null;
        }
        this.f20797a.clear();
        this.f20810d = true;
    }

    /* renamed from: b */
    public ByteBuffer mo24905b() {
        return this.f20797a.mo20335D1().asReadOnlyBuffer();
    }

    /* renamed from: c */
    public Bitmap mo24906c() {
        C3602a aVar = this.f20799a;
        return aVar != null ? aVar.mo24925f() : this.f20793a;
    }

    /* renamed from: d */
    public int mo24907d() {
        C3602a aVar = this.f20799a;
        if (aVar != null) {
            return aVar.f20814p;
        }
        return -1;
    }

    /* renamed from: e */
    public Bitmap mo24908e() {
        return this.f20793a;
    }

    /* renamed from: f */
    public int mo24909f() {
        return this.f20797a.mo20342p1();
    }

    /* renamed from: h */
    public sg4<Bitmap> mo24910h() {
        return this.f20798a;
    }

    /* renamed from: i */
    public int mo24911i() {
        return this.f20807c;
    }

    /* renamed from: j */
    public int mo24912j() {
        return this.f20797a.mo20332A1();
    }

    /* renamed from: l */
    public int mo24913l() {
        return this.f20797a.mo20337F1() + this.f20792a;
    }

    /* renamed from: m */
    public int mo24914m() {
        return this.f20804b;
    }

    /* renamed from: n */
    public final void mo24915n() {
        if (this.f20803a && !this.f20806b) {
            if (this.f20809c) {
                g43.m15506a(this.f20808c == null, "Pending target must be null when starting from the first frame");
                this.f20797a.mo20348u1();
                this.f20809c = false;
            }
            C3602a aVar = this.f20808c;
            if (aVar != null) {
                this.f20808c = null;
                mo24916o(aVar);
                return;
            }
            this.f20806b = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f20797a.mo20343q1());
            this.f20797a.mo20347t1();
            this.f20805b = new C3602a(this.f20794a, this.f20797a.mo20350w1(), uptimeMillis);
            this.f20801a.mo25088a(mj3.m21667o1(m28399g())).mo16003l(this.f20797a).mo25098h1(this.f20805b);
        }
    }

    @hw4
    /* renamed from: o */
    public void mo24916o(C3602a aVar) {
        C3605d dVar = this.f20800a;
        if (dVar != null) {
            dVar.mo24928a();
        }
        this.f20806b = false;
        if (this.f20810d) {
            this.f20794a.obtainMessage(2, aVar).sendToTarget();
        } else if (this.f20803a) {
            if (aVar.mo24925f() != null) {
                mo24917p();
                C3602a aVar2 = this.f20799a;
                this.f20799a = aVar;
                for (int size = this.f20802a.size() - 1; size >= 0; size--) {
                    this.f20802a.get(size).mo21230a();
                }
                if (aVar2 != null) {
                    this.f20794a.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            mo24915n();
        } else if (this.f20809c) {
            this.f20794a.obtainMessage(2, aVar).sendToTarget();
        } else {
            this.f20808c = aVar;
        }
    }

    /* renamed from: p */
    public final void mo24917p() {
        Bitmap bitmap = this.f20793a;
        if (bitmap != null) {
            this.f20796a.mo16798c(bitmap);
            this.f20793a = null;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, com.onedelhi.secure.sg4, com.onedelhi.secure.sg4<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24918q(com.onedelhi.secure.sg4<android.graphics.Bitmap> r3, android.graphics.Bitmap r4) {
        /*
            r2 = this;
            java.lang.Object r0 = com.onedelhi.secure.g43.m15509d(r3)
            com.onedelhi.secure.sg4 r0 = (com.onedelhi.secure.sg4) r0
            r2.f20798a = r0
            java.lang.Object r0 = com.onedelhi.secure.g43.m15509d(r4)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r2.f20793a = r0
            com.onedelhi.secure.ti3<android.graphics.Bitmap> r0 = r2.f20801a
            com.onedelhi.secure.mj3 r1 = new com.onedelhi.secure.mj3
            r1.<init>()
            com.onedelhi.secure.tj r3 = r1.mo25147K0(r3)
            com.onedelhi.secure.ti3 r3 = r0.mo25088a(r3)
            r2.f20801a = r3
            int r3 = com.onedelhi.secure.oq4.m24020h(r4)
            r2.f20792a = r3
            int r3 = r4.getWidth()
            r2.f20804b = r3
            int r3 = r4.getHeight()
            r2.f20807c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.tg1.mo24918q(com.onedelhi.secure.sg4, android.graphics.Bitmap):void");
    }

    /* renamed from: r */
    public void mo24919r() {
        g43.m15506a(!this.f20803a, "Can't restart a running animation");
        this.f20809c = true;
        C3602a aVar = this.f20808c;
        if (aVar != null) {
            this.f20795a.mo15967C(aVar);
            this.f20808c = null;
        }
    }

    @hw4
    /* renamed from: s */
    public void mo24920s(@ts2 C3605d dVar) {
        this.f20800a = dVar;
    }

    /* renamed from: t */
    public final void mo24921t() {
        if (!this.f20803a) {
            this.f20803a = true;
            this.f20810d = false;
            mo24915n();
        }
    }

    /* renamed from: u */
    public final void mo24922u() {
        this.f20803a = false;
    }

    /* renamed from: v */
    public void mo24923v(C3603b bVar) {
        if (this.f20810d) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f20802a.contains(bVar)) {
            boolean isEmpty = this.f20802a.isEmpty();
            this.f20802a.add(bVar);
            if (isEmpty) {
                mo24921t();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* renamed from: w */
    public void mo24924w(C3603b bVar) {
        this.f20802a.remove(bVar);
        if (this.f20802a.isEmpty()) {
            mo24922u();
        }
    }
}
