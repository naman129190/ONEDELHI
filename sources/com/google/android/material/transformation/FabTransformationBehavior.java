package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.C1551a;
import com.google.android.material.circularreveal.C1553b;
import com.google.android.material.circularreveal.C1556c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.onedelhi.secure.C1947d7;
import com.onedelhi.secure.C2479j7;
import com.onedelhi.secure.C3678u9;
import com.onedelhi.secure.C3740us;
import com.onedelhi.secure.C3879wx;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nl2;
import com.onedelhi.secure.ol2;
import com.onedelhi.secure.pf2;
import com.onedelhi.secure.s33;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.uo0;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: a */
    public float f24849a;

    /* renamed from: a */
    public final Rect f24850a = new Rect();

    /* renamed from: a */
    public final RectF f24851a = new RectF();

    /* renamed from: a */
    public final int[] f24852a = new int[2];

    /* renamed from: b */
    public float f24853b;

    /* renamed from: b */
    public final RectF f24854b = new RectF();

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public class C4296a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f24855a;

        /* renamed from: a */
        public final /* synthetic */ boolean f24857a;

        /* renamed from: b */
        public final /* synthetic */ View f24858b;

        public C4296a(boolean z, View view, View view2) {
            this.f24857a = z;
            this.f24855a = view;
            this.f24858b = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f24857a) {
                this.f24855a.setVisibility(4);
                this.f24858b.setAlpha(1.0f);
                this.f24858b.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f24857a) {
                this.f24855a.setVisibility(0);
                this.f24858b.setAlpha(0.0f);
                this.f24858b.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public class C4297b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f24859a;

        public C4297b(View view) {
            this.f24859a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f24859a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    public class C4298c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ Drawable f24861a;

        /* renamed from: a */
        public final /* synthetic */ C1556c f24862a;

        public C4298c(C1556c cVar, Drawable drawable) {
            this.f24862a = cVar;
            this.f24861a = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f24862a.setCircularRevealOverlayDrawable((Drawable) null);
        }

        public void onAnimationStart(Animator animator) {
            this.f24862a.setCircularRevealOverlayDrawable(this.f24861a);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    public class C4299d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1556c f24864a;

        public C4299d(C1556c cVar) {
            this.f24864a = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            C1556c.C1561e revealInfo = this.f24864a.getRevealInfo();
            revealInfo.f8201c = Float.MAX_VALUE;
            this.f24864a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    public static class C4300e {
        @ts2

        /* renamed from: a */
        public nl2 f24866a;

        /* renamed from: a */
        public s33 f24867a;
    }

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @mr2
    /* renamed from: M */
    public AnimatorSet mo29630M(@mr2 View view, @mr2 View view2, boolean z, boolean z2) {
        boolean z3 = z;
        C4300e h0 = mo29652h0(view2.getContext(), z3);
        if (z3) {
            this.f24849a = view.getTranslationX();
            this.f24853b = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        mo29645a0(view, view2, z, z2, h0, arrayList, arrayList2);
        RectF rectF = this.f24851a;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        mo29650f0(view3, view4, z4, z2, h0, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        mo29644Z(view3, view4, z4, h0, arrayList);
        boolean z5 = z2;
        C4300e eVar = h0;
        mo29647c0(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        mo29646b0(view3, view4, z4, z5, eVar, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        mo29643Y(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        mo29642X(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C2479j7.m18186a(animatorSet, arrayList);
        animatorSet.addListener(new C4296a(z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    @ts2
    /* renamed from: N */
    public final ViewGroup mo29632N(@mr2 View view) {
        View findViewById = view.findViewById(fd3.C2158h.mtrl_child_content_container);
        return findViewById != null ? mo29653i0(findViewById) : ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) ? mo29653i0(((ViewGroup) view).getChildAt(0)) : mo29653i0(view);
    }

    /* renamed from: O */
    public final void mo29633O(@mr2 View view, @mr2 C4300e eVar, @mr2 ol2 ol2, @mr2 ol2 ol22, float f, float f2, float f3, float f4, @mr2 RectF rectF) {
        float V = mo29640V(eVar, ol2, f, f3);
        float V2 = mo29640V(eVar, ol22, f2, f4);
        Rect rect = this.f24850a;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f24851a;
        rectF2.set(rect);
        RectF rectF3 = this.f24854b;
        mo29641W(view, rectF3);
        rectF3.offset(V, V2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: P */
    public final void mo29634P(@mr2 View view, @mr2 RectF rectF) {
        mo29641W(view, rectF);
        rectF.offset(this.f24849a, this.f24853b);
    }

    @mr2
    /* renamed from: Q */
    public final Pair<ol2, ol2> mo29635Q(float f, float f2, boolean z, @mr2 C4300e eVar) {
        String str;
        nl2 nl2;
        ol2 ol2;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            ol2 = eVar.f24866a.mo21373h("translationXLinear");
            nl2 = eVar.f24866a;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            ol2 = eVar.f24866a.mo21373h("translationXCurveDownwards");
            nl2 = eVar.f24866a;
            str = "translationYCurveDownwards";
        } else {
            ol2 = eVar.f24866a.mo21373h("translationXCurveUpwards");
            nl2 = eVar.f24866a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(ol2, nl2.mo21373h(str));
    }

    /* renamed from: R */
    public final float mo29636R(@mr2 View view, @mr2 View view2, @mr2 s33 s33) {
        RectF rectF = this.f24851a;
        RectF rectF2 = this.f24854b;
        mo29634P(view, rectF);
        mo29641W(view2, rectF2);
        rectF2.offset(-mo29638T(view, view2, s33), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: S */
    public final float mo29637S(@mr2 View view, @mr2 View view2, @mr2 s33 s33) {
        RectF rectF = this.f24851a;
        RectF rectF2 = this.f24854b;
        mo29634P(view, rectF);
        mo29641W(view2, rectF2);
        rectF2.offset(0.0f, -mo29639U(view, view2, s33));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: T */
    public final float mo29638T(@mr2 View view, @mr2 View view2, @mr2 s33 s33) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f24851a;
        RectF rectF2 = this.f24854b;
        mo29634P(view, rectF);
        mo29641W(view2, rectF2);
        int i = s33.f20194a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + s33.f20193a;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + s33.f20193a;
    }

    /* renamed from: U */
    public final float mo29639U(@mr2 View view, @mr2 View view2, @mr2 s33 s33) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f24851a;
        RectF rectF2 = this.f24854b;
        mo29634P(view, rectF);
        mo29641W(view2, rectF2);
        int i = s33.f20194a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + s33.f20195b;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + s33.f20195b;
    }

    /* renamed from: V */
    public final float mo29640V(@mr2 C4300e eVar, @mr2 ol2 ol2, float f, float f2) {
        long c = ol2.mo21980c();
        long d = ol2.mo21981d();
        ol2 h = eVar.f24866a.mo21373h("expansion");
        return C1947d7.m12985a(f, f2, ol2.mo21982e().getInterpolation(((float) (((h.mo21980c() + h.mo21981d()) + 17) - c)) / ((float) d)));
    }

    /* renamed from: W */
    public final void mo29641W(@mr2 View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f24852a;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: X */
    public final void mo29642X(View view, View view2, boolean z, boolean z2, @mr2 C4300e eVar, @mr2 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup N;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof C1556c) || C1553b.f8183d != 0) && (N = mo29632N(view2)) != null) {
                if (z) {
                    if (!z2) {
                        C3879wx.f22357a.set(N, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(N, C3879wx.f22357a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(N, C3879wx.f22357a, new float[]{0.0f});
                }
                eVar.f24866a.mo21373h("contentFade").mo21979a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    /* renamed from: Y */
    public final void mo29643Y(@mr2 View view, View view2, boolean z, boolean z2, @mr2 C4300e eVar, @mr2 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof C1556c) {
            C1556c cVar = (C1556c) view2;
            int g0 = mo29651g0(view);
            int i = 16777215 & g0;
            if (z) {
                if (!z2) {
                    cVar.setCircularRevealScrimColor(g0);
                }
                objectAnimator = ObjectAnimator.ofInt(cVar, C1556c.C1560d.f8197a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(cVar, C1556c.C1560d.f8197a, new int[]{g0});
            }
            objectAnimator.setEvaluator(C3678u9.m29188b());
            eVar.f24866a.mo21373h("color").mo21979a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: Z */
    public final void mo29644Z(@mr2 View view, @mr2 View view2, boolean z, @mr2 C4300e eVar, @mr2 List<Animator> list) {
        float T = mo29638T(view, view2, eVar.f24867a);
        float U = mo29639U(view, view2, eVar.f24867a);
        Pair<ol2, ol2> Q = mo29635Q(T, U, z, eVar);
        ol2 ol2 = (ol2) Q.first;
        ol2 ol22 = (ol2) Q.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            T = this.f24849a;
        }
        fArr[0] = T;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            U = this.f24853b;
        }
        fArr2[0] = U;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        ol2.mo21979a(ofFloat);
        ol22.mo21979a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    /* renamed from: a0 */
    public final void mo29645a0(View view, @mr2 View view2, boolean z, boolean z2, @mr2 C4300e eVar, @mr2 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float R = jt4.m18904R(view2) - jt4.m18904R(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-R);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-R});
        }
        eVar.f24866a.mo21373h("elevation").mo21979a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: b0 */
    public final void mo29646b0(@mr2 View view, View view2, boolean z, boolean z2, @mr2 C4300e eVar, float f, float f2, @mr2 List<Animator> list, @mr2 List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C4300e eVar2 = eVar;
        if (view4 instanceof C1556c) {
            C1556c cVar = (C1556c) view4;
            float R = mo29636R(view3, view4, eVar2.f24867a);
            float S = mo29637S(view3, view4, eVar2.f24867a);
            ((FloatingActionButton) view3).mo12285k(this.f24850a);
            float width = ((float) this.f24850a.width()) / 2.0f;
            ol2 h = eVar2.f24866a.mo21373h("expansion");
            if (z) {
                if (!z2) {
                    cVar.setRevealInfo(new C1556c.C1561e(R, S, width));
                }
                if (z2) {
                    width = cVar.getRevealInfo().f8201c;
                }
                animator = C1551a.m10040a(cVar, R, S, pf2.m60988b(R, S, 0.0f, 0.0f, f, f2));
                animator.addListener(new C4299d(cVar));
                mo29649e0(view2, h.mo21980c(), (int) R, (int) S, width, list);
            } else {
                float f3 = cVar.getRevealInfo().f8201c;
                Animator a = C1551a.m10040a(cVar, R, S, width);
                int i = (int) R;
                int i2 = (int) S;
                View view5 = view2;
                mo29649e0(view5, h.mo21980c(), i, i2, f3, list);
                long c = h.mo21980c();
                long d = h.mo21981d();
                long i3 = eVar2.f24866a.mo21375i();
                mo29648d0(view5, c, d, i3, i, i2, width, list);
                animator = a;
            }
            h.mo21979a(animator);
            list.add(animator);
            list2.add(C1551a.m10042c(cVar));
        }
    }

    /* renamed from: c0 */
    public final void mo29647c0(View view, View view2, boolean z, boolean z2, @mr2 C4300e eVar, @mr2 List<Animator> list, @mr2 List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof C1556c) && (view instanceof ImageView)) {
            C1556c cVar = (C1556c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, uo0.f21459a, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, uo0.f21459a, new int[]{255});
                }
                objectAnimator.addUpdateListener(new C4297b(view2));
                eVar.f24866a.mo21373h("iconFade").mo21979a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new C4298c(cVar, drawable));
            }
        }
    }

    /* renamed from: d0 */
    public final void mo29648d0(View view, long j, long j2, long j3, int i, int i2, float f, @mr2 List<Animator> list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(j4);
            createCircularReveal.setDuration(j3 - j4);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: e0 */
    public final void mo29649e0(View view, long j, int i, int i2, float f, @mr2 List<Animator> list) {
        if (j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    @C3740us
    /* renamed from: f */
    public boolean mo3646f(@mr2 CoordinatorLayout coordinatorLayout, @mr2 View view, @mr2 View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    /* renamed from: f0 */
    public final void mo29650f0(@mr2 View view, @mr2 View view2, boolean z, boolean z2, @mr2 C4300e eVar, @mr2 List<Animator> list, List<Animator.AnimatorListener> list2, @mr2 RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        C4300e eVar2 = eVar;
        List<Animator> list3 = list;
        float T = mo29638T(view3, view4, eVar2.f24867a);
        float U = mo29639U(view3, view4, eVar2.f24867a);
        Pair<ol2, ol2> Q = mo29635Q(T, U, z3, eVar2);
        ol2 ol2 = (ol2) Q.first;
        ol2 ol22 = (ol2) Q.second;
        if (z3) {
            if (!z2) {
                view4.setTranslationX(-T);
                view4.setTranslationY(-U);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            mo29633O(view2, eVar, ol2, ol22, -T, -U, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-T});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-U});
        }
        ol2.mo21979a(objectAnimator2);
        ol22.mo21979a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    /* renamed from: g0 */
    public final int mo29651g0(@mr2 View view) {
        ColorStateList N = jt4.m18892N(view);
        if (N != null) {
            return N.getColorForState(view.getDrawableState(), N.getDefaultColor());
        }
        return 0;
    }

    @C3740us
    /* renamed from: h */
    public void mo3648h(@mr2 CoordinatorLayout.C0459f fVar) {
        if (fVar.f3231f == 0) {
            fVar.f3231f = 80;
        }
    }

    /* renamed from: h0 */
    public abstract C4300e mo29652h0(Context context, boolean z);

    @ts2
    /* renamed from: i0 */
    public final ViewGroup mo29653i0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }
}
