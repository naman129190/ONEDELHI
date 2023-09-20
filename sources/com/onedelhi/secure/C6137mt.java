package com.onedelhi.secure;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import com.onedelhi.secure.yd3;

/* renamed from: com.onedelhi.secure.mt */
public class C6137mt {

    /* renamed from: a */
    public static final String f32249a = "mt";

    /* renamed from: a */
    public Handler f32250a;

    /* renamed from: a */
    public C6225nt f32251a;

    /* renamed from: a */
    public C6596qt f32252a = new C6596qt();

    /* renamed from: a */
    public C6712rt f32253a;

    /* renamed from: a */
    public C6792st f32254a;

    /* renamed from: a */
    public zm0 f32255a;

    /* renamed from: a */
    public Runnable f32256a = new C6138a();

    /* renamed from: a */
    public boolean f32257a = false;

    /* renamed from: b */
    public Handler f32258b;

    /* renamed from: b */
    public Runnable f32259b = new C6139b();

    /* renamed from: b */
    public boolean f32260b = true;

    /* renamed from: c */
    public Runnable f32261c = new C6140c();

    /* renamed from: d */
    public Runnable f32262d = new C6141d();

    /* renamed from: com.onedelhi.secure.mt$a */
    public class C6138a implements Runnable {
        public C6138a() {
        }

        public void run() {
            try {
                Log.d(C6137mt.f32249a, "Opening camera");
                C6137mt.this.f32251a.mo41470r();
            } catch (Exception e) {
                C6137mt.this.mo40758C(e);
                Log.e(C6137mt.f32249a, "Failed to open camera", e);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.mt$b */
    public class C6139b implements Runnable {
        public C6139b() {
        }

        public void run() {
            try {
                Log.d(C6137mt.f32249a, "Configuring camera");
                C6137mt.this.f32251a.mo41459f();
                if (C6137mt.this.f32250a != null) {
                    C6137mt.this.f32250a.obtainMessage(yd3.C7336g.zxing_prewiew_size_ready, C6137mt.this.mo40777u()).sendToTarget();
                }
            } catch (Exception e) {
                C6137mt.this.mo40758C(e);
                Log.e(C6137mt.f32249a, "Failed to configure camera", e);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.mt$c */
    public class C6140c implements Runnable {
        public C6140c() {
        }

        public void run() {
            try {
                Log.d(C6137mt.f32249a, "Starting preview");
                C6137mt.this.f32251a.mo41478z(C6137mt.this.f32253a);
                C6137mt.this.f32251a.mo41454B();
            } catch (Exception e) {
                C6137mt.this.mo40758C(e);
                Log.e(C6137mt.f32249a, "Failed to start preview", e);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.mt$d */
    public class C6141d implements Runnable {
        public C6141d() {
        }

        public void run() {
            try {
                Log.d(C6137mt.f32249a, "Closing camera");
                C6137mt.this.f32251a.mo41455C();
                C6137mt.this.f32251a.mo41458e();
            } catch (Exception e) {
                Log.e(C6137mt.f32249a, "Failed to close camera", e);
            }
            boolean unused = C6137mt.this.f32260b = true;
            C6137mt.this.f32250a.sendEmptyMessage(yd3.C7336g.zxing_camera_closed);
            C6137mt.this.f32254a.mo44541b();
        }
    }

    public C6137mt(Context context) {
        pq4.m61624a();
        this.f32254a = C6792st.m64863e();
        C6225nt ntVar = new C6225nt(context);
        this.f32251a = ntVar;
        ntVar.mo41473u(this.f32252a);
        this.f32258b = new Handler();
    }

    public C6137mt(C6225nt ntVar) {
        pq4.m61624a();
        this.f32251a = ntVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m57518A(u43 u43) {
        if (!this.f32257a) {
            Log.d(f32249a, "Camera is closed, not requesting preview");
        } else {
            this.f32254a.mo44542c(new C5845jt(this, u43));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m57519B(boolean z) {
        this.f32251a.mo41453A(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m57532y(C6301ot otVar) {
        this.f32251a.mo41457d(otVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m57533z(u43 u43) {
        this.f32251a.mo41471s(u43);
    }

    /* renamed from: C */
    public final void mo40758C(Exception exc) {
        Handler handler = this.f32250a;
        if (handler != null) {
            handler.obtainMessage(yd3.C7336g.zxing_camera_error, exc).sendToTarget();
        }
    }

    /* renamed from: D */
    public void mo40759D() {
        pq4.m61624a();
        this.f32257a = true;
        this.f32260b = false;
        this.f32254a.mo44544f(this.f32256a);
    }

    /* renamed from: E */
    public void mo40760E(u43 u43) {
        this.f32258b.post(new C5936kt(this, u43));
    }

    /* renamed from: F */
    public void mo40761F(C6596qt qtVar) {
        if (!this.f32257a) {
            this.f32252a = qtVar;
            this.f32251a.mo41473u(qtVar);
        }
    }

    /* renamed from: G */
    public void mo40762G(zm0 zm0) {
        this.f32255a = zm0;
        this.f32251a.mo41475w(zm0);
    }

    /* renamed from: H */
    public void mo40763H(Handler handler) {
        this.f32250a = handler;
    }

    /* renamed from: I */
    public void mo40764I(C6712rt rtVar) {
        this.f32253a = rtVar;
    }

    /* renamed from: J */
    public void mo40765J(SurfaceHolder surfaceHolder) {
        mo40764I(new C6712rt(surfaceHolder));
    }

    /* renamed from: K */
    public void mo40766K(boolean z) {
        pq4.m61624a();
        if (this.f32257a) {
            this.f32254a.mo44542c(new C6050lt(this, z));
        }
    }

    /* renamed from: L */
    public void mo40767L() {
        pq4.m61624a();
        mo40768M();
        this.f32254a.mo44542c(this.f32261c);
    }

    /* renamed from: M */
    public final void mo40768M() {
        if (!this.f32257a) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    /* renamed from: m */
    public void mo40769m(C6301ot otVar) {
        pq4.m61624a();
        if (this.f32257a) {
            this.f32254a.mo44542c(new C5743it(this, otVar));
        }
    }

    /* renamed from: n */
    public void mo40770n() {
        pq4.m61624a();
        if (this.f32257a) {
            this.f32254a.mo44542c(this.f32262d);
        } else {
            this.f32260b = true;
        }
        this.f32257a = false;
    }

    /* renamed from: o */
    public void mo40771o() {
        pq4.m61624a();
        mo40768M();
        this.f32254a.mo44542c(this.f32259b);
    }

    /* renamed from: p */
    public C6225nt mo40772p() {
        return this.f32251a;
    }

    /* renamed from: q */
    public int mo40773q() {
        return this.f32251a.mo41461h();
    }

    /* renamed from: r */
    public C6596qt mo40774r() {
        return this.f32252a;
    }

    /* renamed from: s */
    public C6792st mo40775s() {
        return this.f32254a;
    }

    /* renamed from: t */
    public zm0 mo40776t() {
        return this.f32255a;
    }

    /* renamed from: u */
    public final pz3 mo40777u() {
        return this.f32251a.mo41466m();
    }

    /* renamed from: v */
    public C6712rt mo40778v() {
        return this.f32253a;
    }

    /* renamed from: w */
    public boolean mo40779w() {
        return this.f32260b;
    }

    /* renamed from: x */
    public boolean mo40780x() {
        return this.f32257a;
    }
}
