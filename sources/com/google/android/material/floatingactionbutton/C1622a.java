package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.onedelhi.secure.C1947d7;
import com.onedelhi.secure.C2479j7;
import com.onedelhi.secure.C3423rn;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.cf2;
import com.onedelhi.secure.cp1;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.h34;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.k43;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nl2;
import com.onedelhi.secure.nx3;
import com.onedelhi.secure.pl2;
import com.onedelhi.secure.sf2;
import com.onedelhi.secure.tm3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.tw3;
import com.onedelhi.secure.um3;
import com.onedelhi.secure.uw3;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.yz1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.material.floatingactionbutton.a */
public class C1622a {

    /* renamed from: a */
    public static final long f8443a = 100;

    /* renamed from: a */
    public static final TimeInterpolator f8444a = C1947d7.f10651c;

    /* renamed from: a */
    public static final int[] f8445a = {16842919, 16842910};

    /* renamed from: b */
    public static final long f8446b = 100;

    /* renamed from: b */
    public static final int[] f8447b = {16843623, 16842908, 16842910};

    /* renamed from: c */
    public static final int[] f8448c = {16842908, 16842910};

    /* renamed from: d */
    public static final int f8449d = 0;

    /* renamed from: d */
    public static final int[] f8450d = {16843623, 16842910};

    /* renamed from: e */
    public static final int f8451e = 1;

    /* renamed from: e */
    public static final int[] f8452e = {16842910};

    /* renamed from: f */
    public static final float f8453f = 1.5f;

    /* renamed from: f */
    public static final int f8454f = 2;

    /* renamed from: f */
    public static final int[] f8455f = new int[0];

    /* renamed from: g */
    public static final float f8456g = 0.0f;

    /* renamed from: g */
    public static final int f8457g = fd3.C2153c.motionDurationLong2;

    /* renamed from: h */
    public static final float f8458h = 0.4f;

    /* renamed from: h */
    public static final int f8459h = fd3.C2153c.motionEasingEmphasizedInterpolator;

    /* renamed from: i */
    public static final float f8460i = 0.4f;

    /* renamed from: i */
    public static final int f8461i = fd3.C2153c.motionDurationMedium1;

    /* renamed from: j */
    public static final float f8462j = 1.0f;

    /* renamed from: j */
    public static final int f8463j = fd3.C2153c.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: k */
    public static final float f8464k = 1.0f;

    /* renamed from: l */
    public static final float f8465l = 1.0f;

    /* renamed from: m */
    public static final float f8466m = 0.0f;

    /* renamed from: n */
    public static final float f8467n = 0.0f;

    /* renamed from: a */
    public float f8468a;

    /* renamed from: a */
    public int f8469a;
    @ts2

    /* renamed from: a */
    public Animator f8470a;

    /* renamed from: a */
    public final Matrix f8471a = new Matrix();

    /* renamed from: a */
    public final Rect f8472a = new Rect();

    /* renamed from: a */
    public final RectF f8473a = new RectF();
    @ts2

    /* renamed from: a */
    public Drawable f8474a;
    @ts2

    /* renamed from: a */
    public ViewTreeObserver.OnPreDrawListener f8475a;

    /* renamed from: a */
    public final FloatingActionButton f8476a;
    @ts2

    /* renamed from: a */
    public bf2 f8477a;
    @mr2

    /* renamed from: a */
    public final h34 f8478a;
    @ts2

    /* renamed from: a */
    public nl2 f8479a;
    @ts2

    /* renamed from: a */
    public C3423rn f8480a;

    /* renamed from: a */
    public final tw3 f8481a;
    @ts2

    /* renamed from: a */
    public uw3 f8482a;

    /* renamed from: a */
    public ArrayList<Animator.AnimatorListener> f8483a;

    /* renamed from: a */
    public boolean f8484a;

    /* renamed from: b */
    public float f8485b;

    /* renamed from: b */
    public int f8486b;

    /* renamed from: b */
    public final RectF f8487b = new RectF();
    @ts2

    /* renamed from: b */
    public Drawable f8488b;
    @ts2

    /* renamed from: b */
    public nl2 f8489b;

    /* renamed from: b */
    public ArrayList<Animator.AnimatorListener> f8490b;

    /* renamed from: b */
    public boolean f8491b = true;

    /* renamed from: c */
    public float f8492c;

    /* renamed from: c */
    public int f8493c = 0;

    /* renamed from: c */
    public ArrayList<C1632j> f8494c;

    /* renamed from: d */
    public float f8495d;

    /* renamed from: e */
    public float f8496e = 1.0f;

    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    public class C1623a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1633k f8497a;

        /* renamed from: a */
        public boolean f8499a;

        /* renamed from: b */
        public final /* synthetic */ boolean f8500b;

        public C1623a(boolean z, C1633k kVar) {
            this.f8500b = z;
            this.f8497a = kVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f8499a = true;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C1622a.this.f8493c = 0;
            Animator unused2 = C1622a.this.f8470a = null;
            if (!this.f8499a) {
                FloatingActionButton floatingActionButton = C1622a.this.f8476a;
                boolean z = this.f8500b;
                floatingActionButton.mo28273c(z ? 8 : 4, z);
                C1633k kVar = this.f8497a;
                if (kVar != null) {
                    kVar.mo12349a();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C1622a.this.f8476a.mo28273c(0, this.f8500b);
            int unused = C1622a.this.f8493c = 1;
            Animator unused2 = C1622a.this.f8470a = animator;
            this.f8499a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    public class C1624b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1633k f8501a;

        /* renamed from: a */
        public final /* synthetic */ boolean f8503a;

        public C1624b(boolean z, C1633k kVar) {
            this.f8503a = z;
            this.f8501a = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C1622a.this.f8493c = 0;
            Animator unused2 = C1622a.this.f8470a = null;
            C1633k kVar = this.f8501a;
            if (kVar != null) {
                kVar.mo12350b();
            }
        }

        public void onAnimationStart(Animator animator) {
            C1622a.this.f8476a.mo28273c(0, this.f8503a);
            int unused = C1622a.this.f8493c = 2;
            Animator unused2 = C1622a.this.f8470a = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$c */
    public class C1625c extends sf2 {
        public C1625c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, @mr2 Matrix matrix, @mr2 Matrix matrix2) {
            float unused = C1622a.this.f8496e = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$d */
    public class C1626d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f8505a;

        /* renamed from: a */
        public final /* synthetic */ Matrix f8506a;

        /* renamed from: b */
        public final /* synthetic */ float f8508b;

        /* renamed from: c */
        public final /* synthetic */ float f8509c;

        /* renamed from: d */
        public final /* synthetic */ float f8510d;

        /* renamed from: e */
        public final /* synthetic */ float f8511e;

        /* renamed from: f */
        public final /* synthetic */ float f8512f;

        /* renamed from: g */
        public final /* synthetic */ float f8513g;

        public C1626d(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.f8505a = f;
            this.f8508b = f2;
            this.f8509c = f3;
            this.f8510d = f4;
            this.f8511e = f5;
            this.f8512f = f6;
            this.f8513g = f7;
            this.f8506a = matrix;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1622a.this.f8476a.setAlpha(C1947d7.m12986b(this.f8505a, this.f8508b, 0.0f, 0.2f, floatValue));
            C1622a.this.f8476a.setScaleX(C1947d7.m12985a(this.f8509c, this.f8510d, floatValue));
            C1622a.this.f8476a.setScaleY(C1947d7.m12985a(this.f8511e, this.f8510d, floatValue));
            float unused = C1622a.this.f8496e = C1947d7.m12985a(this.f8512f, this.f8513g, floatValue);
            C1622a.this.mo12395h(C1947d7.m12985a(this.f8512f, this.f8513g, floatValue), this.f8506a);
            C1622a.this.f8476a.setImageMatrix(this.f8506a);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$e */
    public class C1627e implements TypeEvaluator<Float> {

        /* renamed from: a */
        public FloatEvaluator f8514a = new FloatEvaluator();

        public C1627e() {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f8514a.evaluate(f, f2, f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$f */
    public class C1628f implements ViewTreeObserver.OnPreDrawListener {
        public C1628f() {
        }

        public boolean onPreDraw() {
            C1622a.this.mo12366H();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$g */
    public class C1629g extends C1635m {
        public C1629g() {
            super(C1622a.this, (C1623a) null);
        }

        /* renamed from: a */
        public float mo12429a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$h */
    public class C1630h extends C1635m {
        public C1630h() {
            super(C1622a.this, (C1623a) null);
        }

        /* renamed from: a */
        public float mo12429a() {
            C1622a aVar = C1622a.this;
            return aVar.f8468a + aVar.f8485b;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$i */
    public class C1631i extends C1635m {
        public C1631i() {
            super(C1622a.this, (C1623a) null);
        }

        /* renamed from: a */
        public float mo12429a() {
            C1622a aVar = C1622a.this;
            return aVar.f8468a + aVar.f8492c;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$j */
    public interface C1632j {
        /* renamed from: a */
        void mo12355a();

        /* renamed from: b */
        void mo12356b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$k */
    public interface C1633k {
        /* renamed from: a */
        void mo12349a();

        /* renamed from: b */
        void mo12350b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$l */
    public class C1634l extends C1635m {
        public C1634l() {
            super(C1622a.this, (C1623a) null);
        }

        /* renamed from: a */
        public float mo12429a() {
            return C1622a.this.f8468a;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$m */
    public abstract class C1635m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public float f8521a;

        /* renamed from: a */
        public boolean f8523a;

        /* renamed from: b */
        public float f8524b;

        public C1635m() {
        }

        public /* synthetic */ C1635m(C1622a aVar, C1623a aVar2) {
            this();
        }

        /* renamed from: a */
        public abstract float mo12429a();

        public void onAnimationEnd(Animator animator) {
            C1622a.this.mo12400j0((float) ((int) this.f8524b));
            this.f8523a = false;
        }

        public void onAnimationUpdate(@mr2 ValueAnimator valueAnimator) {
            if (!this.f8523a) {
                bf2 bf2 = C1622a.this.f8477a;
                this.f8521a = bf2 == null ? 0.0f : bf2.mo31644x();
                this.f8524b = mo12429a();
                this.f8523a = true;
            }
            C1622a aVar = C1622a.this;
            float f = this.f8521a;
            aVar.mo12400j0((float) ((int) (f + ((this.f8524b - f) * valueAnimator.getAnimatedFraction()))));
        }
    }

    public C1622a(FloatingActionButton floatingActionButton, tw3 tw3) {
        this.f8476a = floatingActionButton;
        this.f8481a = tw3;
        h34 h34 = new h34();
        this.f8478a = h34;
        h34.mo37168a(f8445a, mo12401k(new C1631i()));
        h34.mo37168a(f8447b, mo12401k(new C1630h()));
        h34.mo37168a(f8448c, mo12401k(new C1630h()));
        h34.mo37168a(f8450d, mo12401k(new C1630h()));
        h34.mo37168a(f8452e, mo12401k(new C1634l()));
        h34.mo37168a(f8455f, mo12401k(new C1629g()));
        this.f8495d = floatingActionButton.getRotation();
    }

    /* renamed from: A */
    public void mo12359A() {
        this.f8478a.mo37170c();
    }

    /* renamed from: B */
    public void mo12360B() {
        bf2 bf2 = this.f8477a;
        if (bf2 != null) {
            cf2.m40865f(this.f8476a, bf2);
        }
        if (mo12372N()) {
            this.f8476a.getViewTreeObserver().addOnPreDrawListener(mo12409r());
        }
    }

    /* renamed from: C */
    public void mo12361C() {
    }

    /* renamed from: D */
    public void mo12362D() {
        ViewTreeObserver viewTreeObserver = this.f8476a.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f8475a;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f8475a = null;
        }
    }

    /* renamed from: E */
    public void mo12363E(int[] iArr) {
        this.f8478a.mo37171d(iArr);
    }

    /* renamed from: F */
    public void mo12364F(float f, float f2, float f3) {
        mo12398i0();
        mo12400j0(f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12365G(@com.onedelhi.secure.mr2 android.graphics.Rect r8) {
        /*
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.f8488b
            java.lang.String r1 = "Didn't initialize content background"
            com.onedelhi.secure.k43.m19456m(r0, r1)
            boolean r0 = r7.mo12387c0()
            if (r0 == 0) goto L_0x0020
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.Drawable r2 = r7.f8488b
            int r3 = r8.left
            int r4 = r8.top
            int r5 = r8.right
            int r6 = r8.bottom
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            com.onedelhi.secure.tw3 r8 = r7.f8481a
            goto L_0x0024
        L_0x0020:
            com.onedelhi.secure.tw3 r8 = r7.f8481a
            android.graphics.drawable.Drawable r0 = r7.f8488b
        L_0x0024:
            r8.mo12352b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.C1622a.mo12365G(android.graphics.Rect):void");
    }

    /* renamed from: H */
    public void mo12366H() {
        float rotation = this.f8476a.getRotation();
        if (this.f8495d != rotation) {
            this.f8495d = rotation;
            mo12394g0();
        }
    }

    /* renamed from: I */
    public void mo12367I() {
        ArrayList<C1632j> arrayList = this.f8494c;
        if (arrayList != null) {
            Iterator<C1632j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo12355a();
            }
        }
    }

    /* renamed from: J */
    public void mo12368J() {
        ArrayList<C1632j> arrayList = this.f8494c;
        if (arrayList != null) {
            Iterator<C1632j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo12356b();
            }
        }
    }

    /* renamed from: K */
    public void mo12369K(@mr2 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f8490b;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* renamed from: L */
    public void mo12370L(@mr2 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f8483a;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* renamed from: M */
    public void mo12371M(@mr2 C1632j jVar) {
        ArrayList<C1632j> arrayList = this.f8494c;
        if (arrayList != null) {
            arrayList.remove(jVar);
        }
    }

    /* renamed from: N */
    public boolean mo12372N() {
        return true;
    }

    /* renamed from: O */
    public void mo12373O(@ts2 ColorStateList colorStateList) {
        bf2 bf2 = this.f8477a;
        if (bf2 != null) {
            bf2.setTintList(colorStateList);
        }
        C3423rn rnVar = this.f8480a;
        if (rnVar != null) {
            rnVar.mo23943d(colorStateList);
        }
    }

    /* renamed from: P */
    public void mo12374P(@ts2 PorterDuff.Mode mode) {
        bf2 bf2 = this.f8477a;
        if (bf2 != null) {
            bf2.setTintMode(mode);
        }
    }

    /* renamed from: Q */
    public final void mo12375Q(float f) {
        if (this.f8468a != f) {
            this.f8468a = f;
            mo12364F(f, this.f8485b, this.f8492c);
        }
    }

    /* renamed from: R */
    public void mo12376R(boolean z) {
        this.f8484a = z;
    }

    /* renamed from: S */
    public final void mo12377S(@ts2 nl2 nl2) {
        this.f8489b = nl2;
    }

    /* renamed from: T */
    public final void mo12378T(float f) {
        if (this.f8485b != f) {
            this.f8485b = f;
            mo12364F(this.f8468a, f, this.f8492c);
        }
    }

    /* renamed from: U */
    public final void mo12379U(float f) {
        this.f8496e = f;
        Matrix matrix = this.f8471a;
        mo12395h(f, matrix);
        this.f8476a.setImageMatrix(matrix);
    }

    /* renamed from: V */
    public final void mo12380V(int i) {
        if (this.f8486b != i) {
            this.f8486b = i;
            mo12396h0();
        }
    }

    /* renamed from: W */
    public void mo12381W(int i) {
        this.f8469a = i;
    }

    /* renamed from: X */
    public final void mo12382X(float f) {
        if (this.f8492c != f) {
            this.f8492c = f;
            mo12364F(this.f8468a, this.f8485b, f);
        }
    }

    /* renamed from: Y */
    public void mo12383Y(@ts2 ColorStateList colorStateList) {
        Drawable drawable = this.f8474a;
        if (drawable != null) {
            wo0.m30986o(drawable, um3.m67327e(colorStateList));
        }
    }

    /* renamed from: Z */
    public void mo12384Z(boolean z) {
        this.f8491b = z;
        mo12398i0();
    }

    /* renamed from: a0 */
    public final void mo12385a0(@mr2 uw3 uw3) {
        this.f8482a = uw3;
        bf2 bf2 = this.f8477a;
        if (bf2 != null) {
            bf2.setShapeAppearanceModel(uw3);
        }
        Drawable drawable = this.f8474a;
        if (drawable instanceof nx3) {
            ((nx3) drawable).setShapeAppearanceModel(uw3);
        }
        C3423rn rnVar = this.f8480a;
        if (rnVar != null) {
            rnVar.mo23947g(uw3);
        }
    }

    /* renamed from: b0 */
    public final void mo12386b0(@ts2 nl2 nl2) {
        this.f8479a = nl2;
    }

    /* renamed from: c0 */
    public boolean mo12387c0() {
        return true;
    }

    /* renamed from: d0 */
    public final boolean mo12388d0() {
        return jt4.m18914U0(this.f8476a) && !this.f8476a.isInEditMode();
    }

    /* renamed from: e */
    public void mo12389e(@mr2 Animator.AnimatorListener animatorListener) {
        if (this.f8490b == null) {
            this.f8490b = new ArrayList<>();
        }
        this.f8490b.add(animatorListener);
    }

    /* renamed from: e0 */
    public final boolean mo12390e0() {
        return !this.f8484a || this.f8476a.getSizeDimension() >= this.f8469a;
    }

    /* renamed from: f */
    public void mo12391f(@mr2 Animator.AnimatorListener animatorListener) {
        if (this.f8483a == null) {
            this.f8483a = new ArrayList<>();
        }
        this.f8483a.add(animatorListener);
    }

    /* renamed from: f0 */
    public void mo12392f0(@ts2 C1633k kVar, boolean z) {
        if (!mo12417z()) {
            Animator animator = this.f8470a;
            if (animator != null) {
                animator.cancel();
            }
            boolean z2 = this.f8479a == null;
            if (mo12388d0()) {
                if (this.f8476a.getVisibility() != 0) {
                    float f = 0.0f;
                    this.f8476a.setAlpha(0.0f);
                    this.f8476a.setScaleY(z2 ? 0.4f : 0.0f);
                    this.f8476a.setScaleX(z2 ? 0.4f : 0.0f);
                    if (z2) {
                        f = 0.4f;
                    }
                    mo12379U(f);
                }
                nl2 nl2 = this.f8479a;
                AnimatorSet i = nl2 != null ? mo12397i(nl2, 1.0f, 1.0f, 1.0f) : mo12399j(1.0f, 1.0f, 1.0f, f8457g, f8459h);
                i.addListener(new C1624b(z, kVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f8483a;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        i.addListener(it.next());
                    }
                }
                i.start();
                return;
            }
            this.f8476a.mo28273c(0, z);
            this.f8476a.setAlpha(1.0f);
            this.f8476a.setScaleY(1.0f);
            this.f8476a.setScaleX(1.0f);
            mo12379U(1.0f);
            if (kVar != null) {
                kVar.mo12350b();
            }
        }
    }

    /* renamed from: g */
    public void mo12393g(@mr2 C1632j jVar) {
        if (this.f8494c == null) {
            this.f8494c = new ArrayList<>();
        }
        this.f8494c.add(jVar);
    }

    /* renamed from: g0 */
    public void mo12394g0() {
        bf2 bf2 = this.f8477a;
        if (bf2 != null) {
            bf2.mo31643w0((int) this.f8495d);
        }
    }

    /* renamed from: h */
    public final void mo12395h(float f, @mr2 Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f8476a.getDrawable();
        if (drawable != null && this.f8486b != 0) {
            RectF rectF = this.f8473a;
            RectF rectF2 = this.f8487b;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f8486b;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f8486b;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: h0 */
    public final void mo12396h0() {
        mo12379U(this.f8496e);
    }

    @mr2
    /* renamed from: i */
    public final AnimatorSet mo12397i(@mr2 nl2 nl2, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f8476a, View.ALPHA, new float[]{f});
        nl2.mo21373h("opacity").mo21979a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f8476a, View.SCALE_X, new float[]{f2});
        nl2.mo21373h(yz1.f38142d).mo21979a(ofFloat2);
        mo12402k0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f8476a, View.SCALE_Y, new float[]{f2});
        nl2.mo21373h(yz1.f38142d).mo21979a(ofFloat3);
        mo12402k0(ofFloat3);
        arrayList.add(ofFloat3);
        mo12395h(f3, this.f8471a);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f8476a, new cp1(), new C1625c(), new Matrix[]{new Matrix(this.f8471a)});
        nl2.mo21373h("iconScale").mo21979a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C2479j7.m18186a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: i0 */
    public final void mo12398i0() {
        Rect rect = this.f8472a;
        mo12410s(rect);
        mo12365G(rect);
        this.f8481a.mo12351a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: j */
    public final AnimatorSet mo12399j(float f, float f2, float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C1626d(this.f8476a.getAlpha(), f, this.f8476a.getScaleX(), f2, this.f8476a.getScaleY(), this.f8496e, f3, new Matrix(this.f8471a)));
        arrayList.add(ofFloat);
        C2479j7.m18186a(animatorSet, arrayList);
        animatorSet.setDuration((long) pl2.m61421f(this.f8476a.getContext(), i, this.f8476a.getContext().getResources().getInteger(fd3.C2159i.material_motion_duration_long_1)));
        animatorSet.setInterpolator(pl2.m61422g(this.f8476a.getContext(), i2, C1947d7.f10650b));
        return animatorSet;
    }

    /* renamed from: j0 */
    public void mo12400j0(float f) {
        bf2 bf2 = this.f8477a;
        if (bf2 != null) {
            bf2.mo31624n0(f);
        }
    }

    @mr2
    /* renamed from: k */
    public final ValueAnimator mo12401k(@mr2 C1635m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f8444a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: k0 */
    public final void mo12402k0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new C1627e());
        }
    }

    /* renamed from: l */
    public bf2 mo12403l() {
        return new bf2((uw3) k43.m19455l(this.f8482a));
    }

    @ts2
    /* renamed from: m */
    public final Drawable mo12404m() {
        return this.f8488b;
    }

    /* renamed from: n */
    public float mo12405n() {
        return this.f8468a;
    }

    /* renamed from: o */
    public boolean mo12406o() {
        return this.f8484a;
    }

    @ts2
    /* renamed from: p */
    public final nl2 mo12407p() {
        return this.f8489b;
    }

    /* renamed from: q */
    public float mo12408q() {
        return this.f8485b;
    }

    @mr2
    /* renamed from: r */
    public final ViewTreeObserver.OnPreDrawListener mo12409r() {
        if (this.f8475a == null) {
            this.f8475a = new C1628f();
        }
        return this.f8475a;
    }

    /* renamed from: s */
    public void mo12410s(@mr2 Rect rect) {
        int sizeDimension = this.f8484a ? (this.f8469a - this.f8476a.getSizeDimension()) / 2 : 0;
        float n = this.f8491b ? mo12405n() + this.f8492c : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) n));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (n * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: t */
    public float mo12411t() {
        return this.f8492c;
    }

    @ts2
    /* renamed from: u */
    public final uw3 mo12412u() {
        return this.f8482a;
    }

    @ts2
    /* renamed from: v */
    public final nl2 mo12413v() {
        return this.f8479a;
    }

    /* renamed from: w */
    public void mo12414w(@ts2 C1633k kVar, boolean z) {
        if (!mo12416y()) {
            Animator animator = this.f8470a;
            if (animator != null) {
                animator.cancel();
            }
            if (mo12388d0()) {
                nl2 nl2 = this.f8489b;
                AnimatorSet i = nl2 != null ? mo12397i(nl2, 0.0f, 0.0f, 0.0f) : mo12399j(0.0f, 0.4f, 0.4f, f8461i, f8463j);
                i.addListener(new C1623a(z, kVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f8490b;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        i.addListener(it.next());
                    }
                }
                i.start();
                return;
            }
            this.f8476a.mo28273c(z ? 8 : 4, z);
            if (kVar != null) {
                kVar.mo12349a();
            }
        }
    }

    /* renamed from: x */
    public void mo12415x(ColorStateList colorStateList, @ts2 PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        bf2 l = mo12403l();
        this.f8477a = l;
        l.setTintList(colorStateList);
        if (mode != null) {
            this.f8477a.setTintMode(mode);
        }
        this.f8477a.mo31641v0(-12303292);
        this.f8477a.mo31599Z(this.f8476a.getContext());
        tm3 tm3 = new tm3(this.f8477a.getShapeAppearanceModel());
        tm3.setTintList(um3.m67327e(colorStateList2));
        this.f8474a = tm3;
        this.f8488b = new LayerDrawable(new Drawable[]{(Drawable) k43.m19455l(this.f8477a), tm3});
    }

    /* renamed from: y */
    public boolean mo12416y() {
        return this.f8476a.getVisibility() == 0 ? this.f8493c == 1 : this.f8493c != 2;
    }

    /* renamed from: z */
    public boolean mo12417z() {
        return this.f8476a.getVisibility() != 0 ? this.f8493c == 2 : this.f8493c != 1;
    }
}
