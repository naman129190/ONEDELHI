package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class qa2 extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: c */
    public static final String f18976c = qa2.class.getSimpleName();

    /* renamed from: o */
    public static final int f18977o = 1;

    /* renamed from: p */
    public static final int f18978p = 2;

    /* renamed from: q */
    public static final int f18979q = -1;

    /* renamed from: a */
    public float f18980a;

    /* renamed from: a */
    public final ValueAnimator.AnimatorUpdateListener f18981a;

    /* renamed from: a */
    public final Matrix f18982a = new Matrix();
    @ts2

    /* renamed from: a */
    public ImageView.ScaleType f18983a;
    @ts2

    /* renamed from: a */
    public a40 f18984a;

    /* renamed from: a */
    public final gb2 f18985a;

    /* renamed from: a */
    public la2 f18986a;
    @ts2

    /* renamed from: a */
    public n91 f18987a;
    @ts2

    /* renamed from: a */
    public o91 f18988a;
    @ts2

    /* renamed from: a */
    public uo1 f18989a;
    @ts2

    /* renamed from: a */
    public va4 f18990a;
    @ts2

    /* renamed from: a */
    public vo1 f18991a;

    /* renamed from: a */
    public final ArrayList<C3264s> f18992a;

    /* renamed from: a */
    public final Set<C3263r> f18993a;
    @ts2

    /* renamed from: b */
    public String f18994b;

    /* renamed from: b */
    public boolean f18995b;

    /* renamed from: c */
    public boolean f18996c;

    /* renamed from: d */
    public boolean f18997d;

    /* renamed from: e */
    public boolean f18998e;

    /* renamed from: f */
    public boolean f18999f;

    /* renamed from: g */
    public boolean f19000g;

    /* renamed from: h */
    public boolean f19001h;

    /* renamed from: n */
    public int f19002n;

    /* renamed from: com.onedelhi.secure.qa2$a */
    public class C3246a implements C3264s {

        /* renamed from: a */
        public final /* synthetic */ String f19004a;

        public C3246a(String str) {
            this.f19004a = str;
        }

        /* renamed from: a */
        public void mo23054a(la2 la2) {
            qa2.this.mo23019l0(this.f19004a);
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$b */
    public class C3247b implements C3264s {

        /* renamed from: a */
        public final /* synthetic */ String f19006a;

        /* renamed from: a */
        public final /* synthetic */ boolean f19007a;

        /* renamed from: b */
        public final /* synthetic */ String f19008b;

        public C3247b(String str, String str2, boolean z) {
            this.f19006a = str;
            this.f19008b = str2;
            this.f19007a = z;
        }

        /* renamed from: a */
        public void mo23054a(la2 la2) {
            qa2.this.mo23021m0(this.f19006a, this.f19008b, this.f19007a);
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$c */
    public class C3248c implements C3264s {

        /* renamed from: a */
        public final /* synthetic */ int f19009a;

        /* renamed from: b */
        public final /* synthetic */ int f19011b;

        public C3248c(int i, int i2) {
            this.f19009a = i;
            this.f19011b = i2;
        }

        /* renamed from: a */
        public void mo23054a(la2 la2) {
            qa2.this.mo23017k0(this.f19009a, this.f19011b);
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$d */
    public class C3249d implements C3264s {

        /* renamed from: a */
        public final /* synthetic */ float f19012a;

        /* renamed from: b */
        public final /* synthetic */ float f19014b;

        public C3249d(float f, float f2) {
            this.f19012a = f;
            this.f19014b = f2;
        }

        /* renamed from: a */
        public void mo23054a(la2 la2) {
            qa2.this.mo23023n0(this.f19012a, this.f19014b);
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$e */
    public class C3250e implements C3264s {

        /* renamed from: a */
        public final /* synthetic */ int f19015a;

        public C3250e(int i) {
            this.f19015a = i;
        }

        /* renamed from: a */
        public void mo23054a(la2 la2) {
            qa2.this.mo22998e0(this.f19015a);
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$f */
    public class C3251f implements C3264s {

        /* renamed from: a */
        public final /* synthetic */ float f19017a;

        public C3251f(float f) {
            this.f19017a = f;
        }

        /* renamed from: a */
        public void mo23054a(la2 la2) {
            qa2.this.mo23033s0(this.f19017a);
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$g */
    public class C3252g implements C3264s {

        /* renamed from: a */
        public final /* synthetic */ hb2 f19019a;

        /* renamed from: a */
        public final /* synthetic */ wy1 f19021a;

        /* renamed from: a */
        public final /* synthetic */ Object f19022a;

        public C3252g(wy1 wy1, Object obj, hb2 hb2) {
            this.f19021a = wy1;
            this.f19022a = obj;
            this.f19019a = hb2;
        }

        /* renamed from: a */
        public void mo23054a(la2 la2) {
            qa2.this.mo23007h(this.f19021a, this.f19022a, this.f19019a);
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$h */
    public class C3253h extends hb2<T> {

        /* renamed from: a */
        public final /* synthetic */ zy3 f19024a;

        public C3253h(zy3 zy3) {
            this.f19024a = zy3;
        }

        /* renamed from: a */
        public T mo7444a(ra2<T> ra2) {
            return this.f19024a.mo28193a(ra2);
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$i */
    public class C3254i implements ValueAnimator.AnimatorUpdateListener {
        public C3254i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (qa2.this.f18984a != null) {
                qa2.this.f18984a.mo12681H(qa2.this.f18985a.mo16482h());
            }
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$j */
    public class C3255j implements C3264s {
        public C3255j() {
        }

        /* renamed from: a */
        public void mo23054a(la2 la2) {
            qa2.this.mo22986T();
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$k */
    public class C3256k implements C3264s {
        public C3256k() {
        }

        /* renamed from: a */
        public void mo23054a(la2 la2) {
            qa2.this.mo22992Z();
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$l */
    public class C3257l implements C3264s {

        /* renamed from: a */
        public final /* synthetic */ int f19028a;

        public C3257l(int i) {
            this.f19028a = i;
        }

        /* renamed from: a */
        public void mo23054a(la2 la2) {
            qa2.this.mo23025o0(this.f19028a);
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$m */
    public class C3258m implements C3264s {

        /* renamed from: a */
        public final /* synthetic */ float f19030a;

        public C3258m(float f) {
            this.f19030a = f;
        }

        /* renamed from: a */
        public void mo23054a(la2 la2) {
            qa2.this.mo23029q0(this.f19030a);
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$n */
    public class C3259n implements C3264s {

        /* renamed from: a */
        public final /* synthetic */ int f19032a;

        public C3259n(int i) {
            this.f19032a = i;
        }

        /* renamed from: a */
        public void mo23054a(la2 la2) {
            qa2.this.mo23008h0(this.f19032a);
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$o */
    public class C3260o implements C3264s {

        /* renamed from: a */
        public final /* synthetic */ float f19034a;

        public C3260o(float f) {
            this.f19034a = f;
        }

        /* renamed from: a */
        public void mo23054a(la2 la2) {
            qa2.this.mo23015j0(this.f19034a);
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$p */
    public class C3261p implements C3264s {

        /* renamed from: a */
        public final /* synthetic */ String f19037a;

        public C3261p(String str) {
            this.f19037a = str;
        }

        /* renamed from: a */
        public void mo23054a(la2 la2) {
            qa2.this.mo23027p0(this.f19037a);
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$q */
    public class C3262q implements C3264s {

        /* renamed from: a */
        public final /* synthetic */ String f19039a;

        public C3262q(String str) {
            this.f19039a = str;
        }

        /* renamed from: a */
        public void mo23054a(la2 la2) {
            qa2.this.mo23010i0(this.f19039a);
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$r */
    public static class C3263r {
        @ts2

        /* renamed from: a */
        public final ColorFilter f19040a;

        /* renamed from: a */
        public final String f19041a;
        @ts2

        /* renamed from: b */
        public final String f19042b;

        public C3263r(@ts2 String str, @ts2 String str2, @ts2 ColorFilter colorFilter) {
            this.f19041a = str;
            this.f19042b = str2;
            this.f19040a = colorFilter;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3263r)) {
                return false;
            }
            C3263r rVar = (C3263r) obj;
            return hashCode() == rVar.hashCode() && this.f19040a == rVar.f19040a;
        }

        public int hashCode() {
            String str = this.f19041a;
            int hashCode = str != null ? 527 * str.hashCode() : 17;
            String str2 = this.f19042b;
            return str2 != null ? hashCode * 31 * str2.hashCode() : hashCode;
        }
    }

    /* renamed from: com.onedelhi.secure.qa2$s */
    public interface C3264s {
        /* renamed from: a */
        void mo23054a(la2 la2);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.qa2$t */
    public @interface C3265t {
    }

    public qa2() {
        gb2 gb2 = new gb2();
        this.f18985a = gb2;
        this.f18980a = 1.0f;
        this.f18995b = true;
        this.f18996c = false;
        this.f18993a = new HashSet();
        this.f18992a = new ArrayList<>();
        C3254i iVar = new C3254i();
        this.f18981a = iVar;
        this.f19002n = 255;
        this.f19000g = true;
        this.f19001h = false;
        gb2.addUpdateListener(iVar);
    }

    /* renamed from: A */
    public float mo22963A() {
        return this.f18985a.mo16486k();
    }

    /* renamed from: A0 */
    public void mo22964A0(va4 va4) {
        this.f18990a = va4;
    }

    /* renamed from: B */
    public final float mo22965B(@mr2 Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.f18986a.mo19373b().width()), ((float) canvas.getHeight()) / ((float) this.f18986a.mo19373b().height()));
    }

    @ts2
    /* renamed from: B0 */
    public Bitmap mo22966B0(String str, @ts2 Bitmap bitmap) {
        vo1 y = mo23050y();
        if (y == null) {
            p92.m24544e("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap e = y.mo26192e(str, bitmap);
        invalidateSelf();
        return e;
    }

    /* renamed from: C */
    public float mo22967C() {
        return this.f18985a.mo16487l();
    }

    /* renamed from: C0 */
    public final void mo22968C0() {
        if (this.f18986a != null) {
            float H = mo22974H();
            setBounds(0, 0, (int) (((float) this.f18986a.mo19373b().width()) * H), (int) (((float) this.f18986a.mo19373b().height()) * H));
        }
    }

    @ts2
    /* renamed from: D */
    public j13 mo22969D() {
        la2 la2 = this.f18986a;
        if (la2 != null) {
            return la2.mo19385n();
        }
        return null;
    }

    /* renamed from: D0 */
    public boolean mo22970D0() {
        return this.f18990a == null && this.f18986a.mo19374c().mo18866x() > 0;
    }

    @d81(from = 0.0d, mo14561to = 1.0d)
    /* renamed from: E */
    public float mo22971E() {
        return this.f18985a.mo16482h();
    }

    /* renamed from: F */
    public int mo22972F() {
        return this.f18985a.getRepeatCount();
    }

    /* renamed from: G */
    public int mo22973G() {
        return this.f18985a.getRepeatMode();
    }

    /* renamed from: H */
    public float mo22974H() {
        return this.f18980a;
    }

    /* renamed from: I */
    public float mo22975I() {
        return this.f18985a.mo16488m();
    }

    @ts2
    /* renamed from: J */
    public va4 mo22976J() {
        return this.f18990a;
    }

    @ts2
    /* renamed from: K */
    public Typeface mo22977K(String str, String str2) {
        o91 v = mo23044v();
        if (v != null) {
            return v.mo21837b(str, str2);
        }
        return null;
    }

    /* renamed from: L */
    public boolean mo22978L() {
        a40 a40 = this.f18984a;
        return a40 != null && a40.mo12682K();
    }

    /* renamed from: M */
    public boolean mo22979M() {
        a40 a40 = this.f18984a;
        return a40 != null && a40.mo12683L();
    }

    /* renamed from: N */
    public boolean mo22980N() {
        gb2 gb2 = this.f18985a;
        if (gb2 == null) {
            return false;
        }
        return gb2.isRunning();
    }

    /* renamed from: O */
    public boolean mo22981O() {
        return this.f18999f;
    }

    /* renamed from: P */
    public boolean mo22982P() {
        return this.f18985a.getRepeatCount() == -1;
    }

    /* renamed from: Q */
    public boolean mo22983Q() {
        return this.f18997d;
    }

    @Deprecated
    /* renamed from: R */
    public void mo22984R(boolean z) {
        this.f18985a.setRepeatCount(z ? -1 : 0);
    }

    /* renamed from: S */
    public void mo22985S() {
        this.f18992a.clear();
        this.f18985a.mo16490o();
    }

    @bc2
    /* renamed from: T */
    public void mo22986T() {
        if (this.f18984a == null) {
            this.f18992a.add(new C3255j());
            return;
        }
        if (this.f18995b || mo22972F() == 0) {
            this.f18985a.mo16491p();
        }
        if (!this.f18995b) {
            mo22998e0((int) (mo22975I() < 0.0f ? mo22967C() : mo22963A()));
            this.f18985a.mo16478g();
        }
    }

    /* renamed from: U */
    public void mo22987U() {
        this.f18985a.removeAllListeners();
    }

    /* renamed from: V */
    public void mo22988V() {
        this.f18985a.removeAllUpdateListeners();
        this.f18985a.addUpdateListener(this.f18981a);
    }

    /* renamed from: W */
    public void mo22989W(Animator.AnimatorListener animatorListener) {
        this.f18985a.removeListener(animatorListener);
    }

    /* renamed from: X */
    public void mo22990X(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f18985a.removeUpdateListener(animatorUpdateListener);
    }

    /* renamed from: Y */
    public List<wy1> mo22991Y(wy1 wy1) {
        if (this.f18984a == null) {
            p92.m24544e("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f18984a.mo14996h(wy1, 0, arrayList, new wy1(new String[0]));
        return arrayList;
    }

    @bc2
    /* renamed from: Z */
    public void mo22992Z() {
        if (this.f18984a == null) {
            this.f18992a.add(new C3256k());
            return;
        }
        if (this.f18995b || mo22972F() == 0) {
            this.f18985a.mo16496t();
        }
        if (!this.f18995b) {
            mo22998e0((int) (mo22975I() < 0.0f ? mo22967C() : mo22963A()));
            this.f18985a.mo16478g();
        }
    }

    /* renamed from: a0 */
    public void mo22993a0() {
        this.f18985a.mo16497u();
    }

    /* renamed from: b0 */
    public void mo22994b0(boolean z) {
        this.f18999f = z;
    }

    /* renamed from: c0 */
    public boolean mo22995c0(la2 la2) {
        if (this.f18986a == la2) {
            return false;
        }
        this.f19001h = false;
        mo23018l();
        this.f18986a = la2;
        mo23014j();
        this.f18985a.mo16498v(la2);
        mo23033s0(this.f18985a.getAnimatedFraction());
        mo23047w0(this.f18980a);
        mo22968C0();
        Iterator it = new ArrayList(this.f18992a).iterator();
        while (it.hasNext()) {
            ((C3264s) it.next()).mo23054a(la2);
            it.remove();
        }
        this.f18992a.clear();
        la2.mo19396x(this.f18998e);
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable((Drawable) null);
        imageView.setImageDrawable(this);
        return true;
    }

    /* renamed from: d0 */
    public void mo22996d0(n91 n91) {
        this.f18987a = n91;
        o91 o91 = this.f18988a;
        if (o91 != null) {
            o91.mo21839d(n91);
        }
    }

    public void draw(@mr2 Canvas canvas) {
        this.f19001h = false;
        h02.m16420a("Drawable#draw");
        if (this.f18996c) {
            try {
                mo23022n(canvas);
            } catch (Throwable th) {
                p92.m24542c("Lottie crashed in draw!", th);
            }
        } else {
            mo23022n(canvas);
        }
        h02.m16421b("Drawable#draw");
    }

    /* renamed from: e0 */
    public void mo22998e0(int i) {
        if (this.f18986a == null) {
            this.f18992a.add(new C3250e(i));
        } else {
            this.f18985a.mo16499w((float) i);
        }
    }

    /* renamed from: f */
    public void mo22999f(Animator.AnimatorListener animatorListener) {
        this.f18985a.addListener(animatorListener);
    }

    /* renamed from: f0 */
    public void mo23000f0(uo1 uo1) {
        this.f18989a = uo1;
        vo1 vo1 = this.f18991a;
        if (vo1 != null) {
            vo1.mo26191d(uo1);
        }
    }

    /* renamed from: g */
    public void mo23001g(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f18985a.addUpdateListener(animatorUpdateListener);
    }

    /* renamed from: g0 */
    public void mo23002g0(@ts2 String str) {
        this.f18994b = str;
    }

    public int getAlpha() {
        return this.f19002n;
    }

    public int getIntrinsicHeight() {
        la2 la2 = this.f18986a;
        if (la2 == null) {
            return -1;
        }
        return (int) (((float) la2.mo19373b().height()) * mo22974H());
    }

    public int getIntrinsicWidth() {
        la2 la2 = this.f18986a;
        if (la2 == null) {
            return -1;
        }
        return (int) (((float) la2.mo19373b().width()) * mo22974H());
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public <T> void mo23007h(wy1 wy1, T t, hb2<T> hb2) {
        if (this.f18984a == null) {
            this.f18992a.add(new C3252g(wy1, t, hb2));
            return;
        }
        boolean z = true;
        if (wy1.mo26721d() != null) {
            wy1.mo26721d().mo12684a(t, hb2);
        } else {
            List<wy1> Y = mo22991Y(wy1);
            for (int i = 0; i < Y.size(); i++) {
                Y.get(i).mo26721d().mo12684a(t, hb2);
            }
            z = true ^ Y.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == ab2.f8982q) {
                mo23033s0(mo22971E());
            }
        }
    }

    /* renamed from: h0 */
    public void mo23008h0(int i) {
        if (this.f18986a == null) {
            this.f18992a.add(new C3259n(i));
        } else {
            this.f18985a.mo16500x(((float) i) + 0.99f);
        }
    }

    /* renamed from: i */
    public <T> void mo23009i(wy1 wy1, T t, zy3<T> zy3) {
        mo23007h(wy1, t, new C3253h(zy3));
    }

    /* renamed from: i0 */
    public void mo23010i0(String str) {
        la2 la2 = this.f18986a;
        if (la2 == null) {
            this.f18992a.add(new C3262q(str));
            return;
        }
        pd2 k = la2.mo19382k(str);
        if (k != null) {
            mo23008h0((int) (k.f18438a + k.f18440b));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void invalidateDrawable(@mr2 Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        if (!this.f19001h) {
            this.f19001h = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        return mo22980N();
    }

    /* renamed from: j */
    public final void mo23014j() {
        this.f18984a = new a40(this, n12.m22271b(this.f18986a), this.f18986a.mo19381j(), this.f18986a);
    }

    /* renamed from: j0 */
    public void mo23015j0(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        la2 la2 = this.f18986a;
        if (la2 == null) {
            this.f18992a.add(new C3260o(f));
        } else {
            mo23008h0((int) hj2.m16795j(la2.mo19387p(), this.f18986a.mo19377f(), f));
        }
    }

    /* renamed from: k */
    public void mo23016k() {
        this.f18992a.clear();
        this.f18985a.cancel();
    }

    /* renamed from: k0 */
    public void mo23017k0(int i, int i2) {
        if (this.f18986a == null) {
            this.f18992a.add(new C3248c(i, i2));
        } else {
            this.f18985a.mo16501y((float) i, ((float) i2) + 0.99f);
        }
    }

    /* renamed from: l */
    public void mo23018l() {
        if (this.f18985a.isRunning()) {
            this.f18985a.cancel();
        }
        this.f18986a = null;
        this.f18984a = null;
        this.f18991a = null;
        this.f18985a.mo16477f();
        invalidateSelf();
    }

    /* renamed from: l0 */
    public void mo23019l0(String str) {
        la2 la2 = this.f18986a;
        if (la2 == null) {
            this.f18992a.add(new C3246a(str));
            return;
        }
        pd2 k = la2.mo19382k(str);
        if (k != null) {
            int i = (int) k.f18438a;
            mo23017k0(i, ((int) k.f18440b) + i);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: m */
    public void mo23020m() {
        this.f19000g = false;
    }

    /* renamed from: m0 */
    public void mo23021m0(String str, String str2, boolean z) {
        la2 la2 = this.f18986a;
        if (la2 == null) {
            this.f18992a.add(new C3247b(str, str2, z));
            return;
        }
        pd2 k = la2.mo19382k(str);
        if (k != null) {
            int i = (int) k.f18438a;
            pd2 k2 = this.f18986a.mo19382k(str2);
            if (str2 != null) {
                mo23017k0(i, (int) (k2.f18438a + (z ? 1.0f : 0.0f)));
                return;
            }
            throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: n */
    public final void mo23022n(@mr2 Canvas canvas) {
        if (ImageView.ScaleType.FIT_XY == this.f18983a) {
            mo23024o(canvas);
        } else {
            mo23026p(canvas);
        }
    }

    /* renamed from: n0 */
    public void mo23023n0(@d81(from = 0.0d, mo14561to = 1.0d) float f, @d81(from = 0.0d, mo14561to = 1.0d) float f2) {
        la2 la2 = this.f18986a;
        if (la2 == null) {
            this.f18992a.add(new C3249d(f, f2));
        } else {
            mo23017k0((int) hj2.m16795j(la2.mo19387p(), this.f18986a.mo19377f(), f), (int) hj2.m16795j(this.f18986a.mo19387p(), this.f18986a.mo19377f(), f2));
        }
    }

    /* renamed from: o */
    public final void mo23024o(Canvas canvas) {
        float f;
        if (this.f18984a != null) {
            int i = -1;
            Rect bounds = getBounds();
            float width = ((float) bounds.width()) / ((float) this.f18986a.mo19373b().width());
            float height = ((float) bounds.height()) / ((float) this.f18986a.mo19373b().height());
            if (this.f19000g) {
                float min = Math.min(width, height);
                if (min < 1.0f) {
                    f = 1.0f / min;
                    width /= f;
                    height /= f;
                } else {
                    f = 1.0f;
                }
                if (f > 1.0f) {
                    i = canvas.save();
                    float width2 = ((float) bounds.width()) / 2.0f;
                    float height2 = ((float) bounds.height()) / 2.0f;
                    float f2 = width2 * min;
                    float f3 = min * height2;
                    canvas.translate(width2 - f2, height2 - f3);
                    canvas.scale(f, f, f2, f3);
                }
            }
            this.f18982a.reset();
            this.f18982a.preScale(width, height);
            this.f18984a.mo14993f(canvas, this.f18982a, this.f19002n);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: o0 */
    public void mo23025o0(int i) {
        if (this.f18986a == null) {
            this.f18992a.add(new C3257l(i));
        } else {
            this.f18985a.mo16502z(i);
        }
    }

    /* renamed from: p */
    public final void mo23026p(Canvas canvas) {
        float f;
        if (this.f18984a != null) {
            float f2 = this.f18980a;
            float B = mo22965B(canvas);
            if (f2 > B) {
                f = this.f18980a / B;
            } else {
                B = f2;
                f = 1.0f;
            }
            int i = -1;
            if (f > 1.0f) {
                i = canvas.save();
                float width = ((float) this.f18986a.mo19373b().width()) / 2.0f;
                float height = ((float) this.f18986a.mo19373b().height()) / 2.0f;
                float f3 = width * B;
                float f4 = height * B;
                canvas.translate((mo22974H() * width) - f3, (mo22974H() * height) - f4);
                canvas.scale(f, f, f3, f4);
            }
            this.f18982a.reset();
            this.f18982a.preScale(B, B);
            this.f18984a.mo14993f(canvas, this.f18982a, this.f19002n);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: p0 */
    public void mo23027p0(String str) {
        la2 la2 = this.f18986a;
        if (la2 == null) {
            this.f18992a.add(new C3261p(str));
            return;
        }
        pd2 k = la2.mo19382k(str);
        if (k != null) {
            mo23025o0((int) k.f18438a);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: q */
    public void mo23028q(boolean z) {
        if (this.f18997d != z) {
            this.f18997d = z;
            if (this.f18986a != null) {
                mo23014j();
            }
        }
    }

    /* renamed from: q0 */
    public void mo23029q0(float f) {
        la2 la2 = this.f18986a;
        if (la2 == null) {
            this.f18992a.add(new C3258m(f));
        } else {
            mo23025o0((int) hj2.m16795j(la2.mo19387p(), this.f18986a.mo19377f(), f));
        }
    }

    /* renamed from: r */
    public boolean mo23030r() {
        return this.f18997d;
    }

    /* renamed from: r0 */
    public void mo23031r0(boolean z) {
        this.f18998e = z;
        la2 la2 = this.f18986a;
        if (la2 != null) {
            la2.mo19396x(z);
        }
    }

    @bc2
    /* renamed from: s */
    public void mo23032s() {
        this.f18992a.clear();
        this.f18985a.mo16478g();
    }

    /* renamed from: s0 */
    public void mo23033s0(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        if (this.f18986a == null) {
            this.f18992a.add(new C3251f(f));
            return;
        }
        h02.m16420a("Drawable#setProgress");
        this.f18985a.mo16499w(hj2.m16795j(this.f18986a.mo19387p(), this.f18986a.mo19377f(), f));
        h02.m16421b("Drawable#setProgress");
    }

    public void scheduleDrawable(@mr2 Drawable drawable, @mr2 Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(@js1(from = 0, mo18580to = 255) int i) {
        this.f19002n = i;
        invalidateSelf();
    }

    public void setColorFilter(@ts2 ColorFilter colorFilter) {
        p92.m24544e("Use addColorFilter instead.");
    }

    @bc2
    public void start() {
        mo22986T();
    }

    @bc2
    public void stop() {
        mo23032s();
    }

    /* renamed from: t */
    public la2 mo23039t() {
        return this.f18986a;
    }

    /* renamed from: t0 */
    public void mo23040t0(int i) {
        this.f18985a.setRepeatCount(i);
    }

    @ts2
    /* renamed from: u */
    public final Context mo23041u() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* renamed from: u0 */
    public void mo23042u0(int i) {
        this.f18985a.setRepeatMode(i);
    }

    public void unscheduleDrawable(@mr2 Drawable drawable, @mr2 Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v */
    public final o91 mo23044v() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f18988a == null) {
            this.f18988a = new o91(getCallback(), this.f18987a);
        }
        return this.f18988a;
    }

    /* renamed from: v0 */
    public void mo23045v0(boolean z) {
        this.f18996c = z;
    }

    /* renamed from: w */
    public int mo23046w() {
        return (int) this.f18985a.mo16483i();
    }

    /* renamed from: w0 */
    public void mo23047w0(float f) {
        this.f18980a = f;
        mo22968C0();
    }

    @ts2
    /* renamed from: x */
    public Bitmap mo23048x(String str) {
        vo1 y = mo23050y();
        if (y != null) {
            return y.mo26188a(str);
        }
        return null;
    }

    /* renamed from: x0 */
    public void mo23049x0(ImageView.ScaleType scaleType) {
        this.f18983a = scaleType;
    }

    /* renamed from: y */
    public final vo1 mo23050y() {
        if (getCallback() == null) {
            return null;
        }
        vo1 vo1 = this.f18991a;
        if (vo1 != null && !vo1.mo26189b(mo23041u())) {
            this.f18991a = null;
        }
        if (this.f18991a == null) {
            this.f18991a = new vo1(getCallback(), this.f18994b, this.f18989a, this.f18986a.mo19380i());
        }
        return this.f18991a;
    }

    /* renamed from: y0 */
    public void mo23051y0(float f) {
        this.f18985a.mo16473A(f);
    }

    @ts2
    /* renamed from: z */
    public String mo23052z() {
        return this.f18994b;
    }

    /* renamed from: z0 */
    public void mo23053z0(Boolean bool) {
        this.f18995b = bool.booleanValue();
    }
}
