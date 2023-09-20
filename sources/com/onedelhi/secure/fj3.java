package com.onedelhi.secure;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.bumptech.glide.C1173a;
import com.onedelhi.secure.x50;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class fj3 implements ComponentCallbacks2, y22, vj2<ti3<Drawable>> {

    /* renamed from: b */
    public static final mj3 f12078b = ((mj3) mj3.m21649W0(Bitmap.class).mo25186k0());

    /* renamed from: c */
    public static final mj3 f12079c = ((mj3) mj3.m21649W0(ng1.class).mo25186k0());

    /* renamed from: d */
    public static final mj3 f12080d = ((mj3) ((mj3) mj3.m21650X0(km0.f15021c).mo25209y0(f53.LOW)).mo25139G0(true));

    /* renamed from: a */
    public final Context f12081a;

    /* renamed from: a */
    public final C1173a f12082a;
    @mj1("this")

    /* renamed from: a */
    public final ij3 f12083a;
    @mj1("this")

    /* renamed from: a */
    public mj3 f12084a;
    @mj1("this")

    /* renamed from: a */
    public final nj3 f12085a;
    @mj1("this")

    /* renamed from: a */
    public final t94 f12086a;

    /* renamed from: a */
    public final v22 f12087a;

    /* renamed from: a */
    public final x50 f12088a;

    /* renamed from: a */
    public final Runnable f12089a;

    /* renamed from: a */
    public final CopyOnWriteArrayList<ej3<Object>> f12090a;

    /* renamed from: b */
    public boolean f12091b;

    /* renamed from: com.onedelhi.secure.fj3$a */
    public class C2173a implements Runnable {
        public C2173a() {
        }

        public void run() {
            fj3 fj3 = fj3.this;
            fj3.f12087a.mo12674b(fj3);
        }
    }

    /* renamed from: com.onedelhi.secure.fj3$b */
    public static class C2174b extends rc0<View, Object> {
        public C2174b(@mr2 View view) {
            super(view);
        }

        /* renamed from: b */
        public void mo16019b(@ts2 Drawable drawable) {
        }

        /* renamed from: n */
        public void mo16020n(@ts2 Drawable drawable) {
        }

        /* renamed from: s */
        public void mo16021s(@mr2 Object obj, @ts2 jh4<? super Object> jh4) {
        }
    }

    /* renamed from: com.onedelhi.secure.fj3$c */
    public class C2175c implements x50.C3899a {
        @mj1("RequestManager.this")

        /* renamed from: a */
        public final nj3 f12094a;

        public C2175c(@mr2 nj3 nj3) {
            this.f12094a = nj3;
        }

        /* renamed from: a */
        public void mo16022a(boolean z) {
            if (z) {
                synchronized (fj3.this) {
                    this.f12094a.mo21343g();
                }
            }
        }
    }

    public fj3(@mr2 C1173a aVar, @mr2 v22 v22, @mr2 ij3 ij3, @mr2 Context context) {
        this(aVar, v22, ij3, new nj3(), aVar.mo7458i(), context);
    }

    public fj3(C1173a aVar, v22 v22, ij3 ij3, nj3 nj3, y50 y50, Context context) {
        this.f12086a = new t94();
        C2173a aVar2 = new C2173a();
        this.f12089a = aVar2;
        this.f12082a = aVar;
        this.f12087a = v22;
        this.f12083a = ij3;
        this.f12085a = nj3;
        this.f12081a = context;
        x50 a = y50.mo26050a(context.getApplicationContext(), new C2175c(nj3));
        this.f12088a = a;
        if (oq4.m24032t()) {
            oq4.m24036x(aVar2);
        } else {
            v22.mo12674b(this);
        }
        v22.mo12674b(a);
        this.f12090a = new CopyOnWriteArrayList<>(aVar.mo7460k().mo7495c());
        mo15991a0(aVar.mo7460k().mo7496d());
        aVar.mo7467v(this);
    }

    @mr2
    @C2677kx
    /* renamed from: A */
    public ti3<ng1> mo15965A() {
        return mo16014w(ng1.class).mo25088a(f12079c);
    }

    /* renamed from: B */
    public void mo15966B(@mr2 View view) {
        mo15967C(new C2174b(view));
    }

    /* renamed from: C */
    public void mo15967C(@ts2 s94<?> s94) {
        if (s94 != null) {
            mo15996d0(s94);
        }
    }

    @mr2
    @C2677kx
    /* renamed from: D */
    public ti3<File> mo15968D(@ts2 Object obj) {
        return mo15969E().mo16003l(obj);
    }

    @mr2
    @C2677kx
    /* renamed from: E */
    public ti3<File> mo15969E() {
        return mo16014w(File.class).mo25088a(f12080d);
    }

    /* renamed from: F */
    public List<ej3<Object>> mo15970F() {
        return this.f12090a;
    }

    /* renamed from: G */
    public synchronized mj3 mo15971G() {
        return this.f12084a;
    }

    @mr2
    /* renamed from: H */
    public <T> oh4<?, T> mo15972H(Class<T> cls) {
        return this.f12082a.mo7460k().mo7497e(cls);
    }

    /* renamed from: I */
    public synchronized boolean mo15973I() {
        return this.f12085a.mo21340d();
    }

    @mr2
    @C2677kx
    /* renamed from: J */
    public ti3<Drawable> mo16009q(@ts2 Bitmap bitmap) {
        return mo16016y().mo16009q(bitmap);
    }

    @mr2
    @C2677kx
    /* renamed from: K */
    public ti3<Drawable> mo16010t(@ts2 Drawable drawable) {
        return mo16016y().mo16010t(drawable);
    }

    @mr2
    @C2677kx
    /* renamed from: L */
    public ti3<Drawable> mo16002k(@ts2 Uri uri) {
        return mo16016y().mo16002k(uri);
    }

    @mr2
    @C2677kx
    /* renamed from: M */
    public ti3<Drawable> mo16000i(@ts2 File file) {
        return mo16016y().mo16000i(file);
    }

    @mr2
    @C2677kx
    /* renamed from: N */
    public ti3<Drawable> mo16005o(@dp0 @mf3 @ts2 Integer num) {
        return mo16016y().mo16005o(num);
    }

    @mr2
    @C2677kx
    /* renamed from: O */
    public ti3<Drawable> mo16003l(@ts2 Object obj) {
        return mo16016y().mo16003l(obj);
    }

    @mr2
    @C2677kx
    /* renamed from: P */
    public ti3<Drawable> mo16004n(@ts2 String str) {
        return mo16016y().mo16004n(str);
    }

    @C2677kx
    @Deprecated
    /* renamed from: Q */
    public ti3<Drawable> mo15998f(@ts2 URL url) {
        return mo16016y().mo15998f(url);
    }

    @mr2
    @C2677kx
    /* renamed from: R */
    public ti3<Drawable> mo16001j(@ts2 byte[] bArr) {
        return mo16016y().mo16001j(bArr);
    }

    /* renamed from: S */
    public synchronized void mo15983S() {
        this.f12085a.mo21341e();
    }

    /* renamed from: T */
    public synchronized void mo15984T() {
        mo15983S();
        for (fj3 S : this.f12083a.mo16682a()) {
            S.mo15983S();
        }
    }

    /* renamed from: U */
    public synchronized void mo15985U() {
        this.f12085a.mo21342f();
    }

    /* renamed from: V */
    public synchronized void mo15986V() {
        mo15985U();
        for (fj3 U : this.f12083a.mo16682a()) {
            U.mo15985U();
        }
    }

    /* renamed from: W */
    public synchronized void mo15987W() {
        this.f12085a.mo21344h();
    }

    /* renamed from: X */
    public synchronized void mo15988X() {
        oq4.m24014b();
        mo15987W();
        for (fj3 W : this.f12083a.mo16682a()) {
            W.mo15987W();
        }
    }

    @mr2
    /* renamed from: Y */
    public synchronized fj3 mo15989Y(@mr2 mj3 mj3) {
        mo15991a0(mj3);
        return this;
    }

    /* renamed from: Z */
    public void mo15990Z(boolean z) {
        this.f12091b = z;
    }

    /* renamed from: a0 */
    public synchronized void mo15991a0(@mr2 mj3 mj3) {
        this.f12084a = (mj3) ((mj3) mj3.clone()).mo25171b();
    }

    /* renamed from: b0 */
    public synchronized void mo15992b0(@mr2 s94<?> s94, @mr2 si3 si3) {
        this.f12086a.mo24782j(s94);
        this.f12085a.mo21345i(si3);
    }

    /* renamed from: c */
    public synchronized void mo15993c() {
        mo15985U();
        this.f12086a.mo15993c();
    }

    /* renamed from: c0 */
    public synchronized boolean mo15994c0(@mr2 s94<?> s94) {
        si3 m = s94.mo16335m();
        if (m == null) {
            return true;
        }
        if (!this.f12085a.mo21338b(m)) {
            return false;
        }
        this.f12086a.mo24783k(s94);
        s94.mo16333a((si3) null);
        return true;
    }

    /* renamed from: d */
    public synchronized void mo15995d() {
        mo15987W();
        this.f12086a.mo15995d();
    }

    /* renamed from: d0 */
    public final void mo15996d0(@mr2 s94<?> s94) {
        boolean c0 = mo15994c0(s94);
        si3 m = s94.mo16335m();
        if (!c0 && !this.f12082a.mo7468w(s94) && m != null) {
            s94.mo16333a((si3) null);
            m.clear();
        }
    }

    /* renamed from: e0 */
    public final synchronized void mo15997e0(@mr2 mj3 mj3) {
        this.f12084a = (mj3) this.f12084a.mo25088a(mj3);
    }

    /* renamed from: g */
    public synchronized void mo15999g() {
        this.f12086a.mo15999g();
        for (s94<?> C : this.f12086a.mo24781i()) {
            mo15967C(C);
        }
        this.f12086a.mo24780f();
        this.f12085a.mo21339c();
        this.f12087a.mo12673a(this);
        this.f12087a.mo12673a(this.f12088a);
        oq4.m24037y(this.f12089a);
        this.f12082a.mo7453B(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        if (i == 60 && this.f12091b) {
            mo15984T();
        }
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f12085a + ", treeNode=" + this.f12083a + "}";
    }

    /* renamed from: u */
    public fj3 mo16012u(ej3<Object> ej3) {
        this.f12090a.add(ej3);
        return this;
    }

    @mr2
    /* renamed from: v */
    public synchronized fj3 mo16013v(@mr2 mj3 mj3) {
        mo15997e0(mj3);
        return this;
    }

    @mr2
    @C2677kx
    /* renamed from: w */
    public <ResourceType> ti3<ResourceType> mo16014w(@mr2 Class<ResourceType> cls) {
        return new ti3<>(this.f12082a, this, cls, this.f12081a);
    }

    @mr2
    @C2677kx
    /* renamed from: x */
    public ti3<Bitmap> mo16015x() {
        return mo16014w(Bitmap.class).mo25088a(f12078b);
    }

    @mr2
    @C2677kx
    /* renamed from: y */
    public ti3<Drawable> mo16016y() {
        return mo16014w(Drawable.class);
    }

    @mr2
    @C2677kx
    /* renamed from: z */
    public ti3<File> mo16017z() {
        return mo16014w(File.class).mo25088a(mj3.m21669q1(true));
    }
}
