package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C1060e;
import com.onedelhi.secure.ig1;
import com.onedelhi.secure.j63;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.kg1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qv4;
import com.onedelhi.secure.th4;
import com.onedelhi.secure.v71;
import com.onedelhi.secure.vf2;
import com.onedelhi.secure.xj4;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform extends Transition {

    /* renamed from: a */
    public static final Property<C1022e, float[]> f5493a = new C1018a(float[].class, "nonTranslations");

    /* renamed from: a */
    public static final String[] f5494a = {f5496h, f5498i, f5500k};

    /* renamed from: b */
    public static final Property<C1022e, PointF> f5495b = new C1019b(PointF.class, "translations");

    /* renamed from: h */
    public static final String f5496h = "android:changeTransform:matrix";

    /* renamed from: h */
    public static final boolean f5497h = true;

    /* renamed from: i */
    public static final String f5498i = "android:changeTransform:transforms";

    /* renamed from: j */
    public static final String f5499j = "android:changeTransform:parent";

    /* renamed from: k */
    public static final String f5500k = "android:changeTransform:parentMatrix";

    /* renamed from: l */
    public static final String f5501l = "android:changeTransform:intermediateParentMatrix";

    /* renamed from: m */
    public static final String f5502m = "android:changeTransform:intermediateMatrix";

    /* renamed from: a */
    public Matrix f5503a = new Matrix();

    /* renamed from: f */
    public boolean f5504f = true;

    /* renamed from: g */
    public boolean f5505g = true;

    /* renamed from: androidx.transition.ChangeTransform$a */
    public static class C1018a extends Property<C1022e, float[]> {
        public C1018a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public float[] get(C1022e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1022e eVar, float[] fArr) {
            eVar.mo6874d(fArr);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$b */
    public static class C1019b extends Property<C1022e, PointF> {
        public C1019b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1022e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1022e eVar, PointF pointF) {
            eVar.mo6873c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$c */
    public class C1020c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public Matrix f5506a = new Matrix();

        /* renamed from: a */
        public final /* synthetic */ View f5507a;

        /* renamed from: a */
        public final /* synthetic */ C1022e f5508a;

        /* renamed from: a */
        public final /* synthetic */ C1023f f5509a;

        /* renamed from: a */
        public boolean f5511a;

        /* renamed from: b */
        public final /* synthetic */ Matrix f5512b;

        /* renamed from: b */
        public final /* synthetic */ boolean f5513b;

        public C1020c(boolean z, Matrix matrix, View view, C1023f fVar, C1022e eVar) {
            this.f5513b = z;
            this.f5512b = matrix;
            this.f5507a = view;
            this.f5509a = fVar;
            this.f5508a = eVar;
        }

        /* renamed from: a */
        public final void mo6866a(Matrix matrix) {
            this.f5506a.set(matrix);
            this.f5507a.setTag(C1060e.C1065e.transition_transform, this.f5506a);
            this.f5509a.mo6875a(this.f5507a);
        }

        public void onAnimationCancel(Animator animator) {
            this.f5511a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f5511a) {
                if (!this.f5513b || !ChangeTransform.this.f5504f) {
                    this.f5507a.setTag(C1060e.C1065e.transition_transform, (Object) null);
                    this.f5507a.setTag(C1060e.C1065e.parent_matrix, (Object) null);
                } else {
                    mo6866a(this.f5512b);
                }
            }
            qv4.m26201f(this.f5507a, (Matrix) null);
            this.f5509a.mo6875a(this.f5507a);
        }

        public void onAnimationPause(Animator animator) {
            mo6866a(this.f5508a.mo6871a());
        }

        public void onAnimationResume(Animator animator) {
            ChangeTransform.m6886G0(this.f5507a);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$d */
    public static class C1021d extends C1085i {

        /* renamed from: a */
        public View f5514a;

        /* renamed from: a */
        public ig1 f5515a;

        public C1021d(View view, ig1 ig1) {
            this.f5514a = view;
            this.f5515a = ig1;
        }

        /* renamed from: b */
        public void mo6830b(@mr2 Transition transition) {
            this.f5515a.setVisibility(0);
        }

        /* renamed from: d */
        public void mo6832d(@mr2 Transition transition) {
            this.f5515a.setVisibility(4);
        }

        /* renamed from: e */
        public void mo6833e(@mr2 Transition transition) {
            transition.mo6926h0(this);
            kg1.m19783b(this.f5514a);
            this.f5514a.setTag(C1060e.C1065e.transition_transform, (Object) null);
            this.f5514a.setTag(C1060e.C1065e.parent_matrix, (Object) null);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$e */
    public static class C1022e {

        /* renamed from: a */
        public float f5516a;

        /* renamed from: a */
        public final Matrix f5517a = new Matrix();

        /* renamed from: a */
        public final View f5518a;

        /* renamed from: a */
        public final float[] f5519a;

        /* renamed from: b */
        public float f5520b;

        public C1022e(View view, float[] fArr) {
            this.f5518a = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f5519a = fArr2;
            this.f5516a = fArr2[2];
            this.f5520b = fArr2[5];
            mo6872b();
        }

        /* renamed from: a */
        public Matrix mo6871a() {
            return this.f5517a;
        }

        /* renamed from: b */
        public final void mo6872b() {
            float[] fArr = this.f5519a;
            fArr[2] = this.f5516a;
            fArr[5] = this.f5520b;
            this.f5517a.setValues(fArr);
            qv4.m26201f(this.f5518a, this.f5517a);
        }

        /* renamed from: c */
        public void mo6873c(PointF pointF) {
            this.f5516a = pointF.x;
            this.f5520b = pointF.y;
            mo6872b();
        }

        /* renamed from: d */
        public void mo6874d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f5519a, 0, fArr.length);
            mo6872b();
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$f */
    public static class C1023f {

        /* renamed from: a */
        public final float f5521a;

        /* renamed from: b */
        public final float f5522b;

        /* renamed from: c */
        public final float f5523c;

        /* renamed from: d */
        public final float f5524d;

        /* renamed from: e */
        public final float f5525e;

        /* renamed from: f */
        public final float f5526f;

        /* renamed from: g */
        public final float f5527g;

        /* renamed from: h */
        public final float f5528h;

        public C1023f(View view) {
            this.f5521a = view.getTranslationX();
            this.f5522b = view.getTranslationY();
            this.f5523c = jt4.m18844A0(view);
            this.f5524d = view.getScaleX();
            this.f5525e = view.getScaleY();
            this.f5526f = view.getRotationX();
            this.f5527g = view.getRotationY();
            this.f5528h = view.getRotation();
        }

        /* renamed from: a */
        public void mo6875a(View view) {
            ChangeTransform.m6887K0(view, this.f5521a, this.f5522b, this.f5523c, this.f5524d, this.f5525e, this.f5526f, this.f5527g, this.f5528h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1023f)) {
                return false;
            }
            C1023f fVar = (C1023f) obj;
            return fVar.f5521a == this.f5521a && fVar.f5522b == this.f5522b && fVar.f5523c == this.f5523c && fVar.f5524d == this.f5524d && fVar.f5525e == this.f5525e && fVar.f5526f == this.f5526f && fVar.f5527g == this.f5527g && fVar.f5528h == this.f5528h;
        }

        public int hashCode() {
            float f = this.f5521a;
            int i = 0;
            int floatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.f5522b;
            int floatToIntBits2 = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f5523c;
            int floatToIntBits3 = (floatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f5524d;
            int floatToIntBits4 = (floatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f5525e;
            int floatToIntBits5 = (floatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f5526f;
            int floatToIntBits6 = (floatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f5527g;
            int floatToIntBits7 = (floatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f5528h;
            if (f8 != 0.0f) {
                i = Float.floatToIntBits(f8);
            }
            return floatToIntBits7 + i;
        }
    }

    public ChangeTransform() {
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1072g.f5683g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f5504f = xj4.m31488e(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f5505g = xj4.m31488e(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: G0 */
    public static void m6886G0(View view) {
        m6887K0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: K0 */
    public static void m6887K0(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        jt4.m19022w2(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    /* renamed from: A0 */
    public final void mo6849A0(th4 th4) {
        View view = th4.f20844a;
        if (view.getVisibility() != 8) {
            th4.f20846a.put(f5499j, view.getParent());
            th4.f20846a.put(f5498i, new C1023f(view));
            Matrix matrix = view.getMatrix();
            th4.f20846a.put(f5496h, (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
            if (this.f5505g) {
                Matrix matrix2 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                qv4.m26205j(viewGroup, matrix2);
                matrix2.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                th4.f20846a.put(f5500k, matrix2);
                th4.f20846a.put(f5502m, view.getTag(C1060e.C1065e.transition_transform));
                th4.f20846a.put(f5501l, view.getTag(C1060e.C1065e.parent_matrix));
            }
        }
    }

    /* renamed from: B0 */
    public final void mo6850B0(ViewGroup viewGroup, th4 th4, th4 th42) {
        View view = th42.f20844a;
        Matrix matrix = new Matrix((Matrix) th42.f20846a.get(f5500k));
        qv4.m26206k(viewGroup, matrix);
        ig1 a = kg1.m19782a(view, viewGroup, matrix);
        if (a != null) {
            a.mo7023a((ViewGroup) th4.f20846a.get(f5499j), th4.f20844a);
            Transition transition = this;
            while (true) {
                Transition transition2 = transition.f5574a;
                if (transition2 == null) {
                    break;
                }
                transition = transition2;
            }
            transition.mo6912a(new C1021d(view, a));
            if (f5497h) {
                View view2 = th4.f20844a;
                if (view2 != th42.f20844a) {
                    qv4.m26203h(view2, 0.0f);
                }
                qv4.m26203h(view, 1.0f);
            }
        }
    }

    /* renamed from: C0 */
    public final ObjectAnimator mo6851C0(th4 th4, th4 th42, boolean z) {
        Matrix matrix = (Matrix) th4.f20846a.get(f5496h);
        Matrix matrix2 = (Matrix) th42.f20846a.get(f5496h);
        if (matrix == null) {
            matrix = vf2.f21742a;
        }
        if (matrix2 == null) {
            matrix2 = vf2.f21742a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        View view = th42.f20844a;
        m6886G0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C1022e eVar = new C1022e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, new PropertyValuesHolder[]{PropertyValuesHolder.ofObject(f5493a, new v71(new float[9]), new float[][]{fArr, fArr2}), j63.m18184a(f5495b, mo6901L().mo6787a(fArr[2], fArr[5], fArr2[2], fArr2[5]))});
        C1020c cVar = new C1020c(z, matrix3, view, (C1023f) th42.f20846a.get(f5498i), eVar);
        ofPropertyValuesHolder.addListener(cVar);
        C1050a.m7118a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    /* renamed from: D0 */
    public boolean mo6852D0() {
        return this.f5505g;
    }

    /* renamed from: E0 */
    public boolean mo6853E0() {
        return this.f5504f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r5 == r4.f20844a) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r4 == r5) goto L_0x001e;
     */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6854F0(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo6910X(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.mo6910X(r5)
            if (r0 != 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            com.onedelhi.secure.th4 r4 = r3.mo6899J(r4, r1)
            if (r4 == 0) goto L_0x001f
            android.view.View r4 = r4.f20844a
            if (r5 != r4) goto L_0x001d
            goto L_0x001e
        L_0x001a:
            if (r4 != r5) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            r2 = r1
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.mo6854F0(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    /* renamed from: H0 */
    public final void mo6855H0(th4 th4, th4 th42) {
        Matrix matrix = (Matrix) th42.f20846a.get(f5500k);
        th42.f20844a.setTag(C1060e.C1065e.parent_matrix, matrix);
        Matrix matrix2 = this.f5503a;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) th4.f20846a.get(f5496h);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            th4.f20846a.put(f5496h, matrix3);
        }
        matrix3.postConcat((Matrix) th4.f20846a.get(f5500k));
        matrix3.postConcat(matrix2);
    }

    /* renamed from: I0 */
    public void mo6856I0(boolean z) {
        this.f5505g = z;
    }

    /* renamed from: J0 */
    public void mo6857J0(boolean z) {
        this.f5504f = z;
    }

    /* renamed from: T */
    public String[] mo6799T() {
        return f5494a;
    }

    /* renamed from: j */
    public void mo6800j(@mr2 th4 th4) {
        mo6849A0(th4);
    }

    /* renamed from: m */
    public void mo6801m(@mr2 th4 th4) {
        mo6849A0(th4);
        if (!f5497h) {
            ((ViewGroup) th4.f20844a.getParent()).startViewTransition(th4.f20844a);
        }
    }

    /* renamed from: q */
    public Animator mo6802q(@mr2 ViewGroup viewGroup, th4 th4, th4 th42) {
        if (th4 == null || th42 == null || !th4.f20846a.containsKey(f5499j) || !th42.f20846a.containsKey(f5499j)) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) th4.f20846a.get(f5499j);
        boolean z = this.f5505g && !mo6854F0(viewGroup2, (ViewGroup) th42.f20846a.get(f5499j));
        Matrix matrix = (Matrix) th4.f20846a.get(f5502m);
        if (matrix != null) {
            th4.f20846a.put(f5496h, matrix);
        }
        Matrix matrix2 = (Matrix) th4.f20846a.get(f5501l);
        if (matrix2 != null) {
            th4.f20846a.put(f5500k, matrix2);
        }
        if (z) {
            mo6855H0(th4, th42);
        }
        ObjectAnimator C0 = mo6851C0(th4, th42, z);
        if (z && C0 != null && this.f5504f) {
            mo6850B0(viewGroup, th4, th42);
        } else if (!f5497h) {
            viewGroup2.endViewTransition(th4.f20844a);
        }
        return C0;
    }
}
