package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.C1060e;
import androidx.transition.Transition;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.th4;
import com.onedelhi.secure.ts2;

/* renamed from: androidx.transition.l */
public class C1091l {

    /* renamed from: androidx.transition.l$a */
    public static class C1092a extends AnimatorListenerAdapter implements Transition.C1043h {

        /* renamed from: a */
        public float f5732a;

        /* renamed from: a */
        public final int f5733a;

        /* renamed from: a */
        public final View f5734a;

        /* renamed from: a */
        public int[] f5735a;

        /* renamed from: b */
        public float f5736b;

        /* renamed from: b */
        public final int f5737b;

        /* renamed from: b */
        public final View f5738b;

        /* renamed from: c */
        public final float f5739c;

        /* renamed from: d */
        public final float f5740d;

        public C1092a(View view, View view2, int i, int i2, float f, float f2) {
            this.f5738b = view;
            this.f5734a = view2;
            this.f5733a = i - Math.round(view.getTranslationX());
            this.f5737b = i2 - Math.round(view.getTranslationY());
            this.f5739c = f;
            this.f5740d = f2;
            int i3 = C1060e.C1065e.transition_position;
            int[] iArr = (int[]) view2.getTag(i3);
            this.f5735a = iArr;
            if (iArr != null) {
                view2.setTag(i3, (Object) null);
            }
        }

        /* renamed from: a */
        public void mo6964a(@mr2 Transition transition) {
        }

        /* renamed from: b */
        public void mo6830b(@mr2 Transition transition) {
        }

        /* renamed from: c */
        public void mo6831c(@mr2 Transition transition) {
        }

        /* renamed from: d */
        public void mo6832d(@mr2 Transition transition) {
        }

        /* renamed from: e */
        public void mo6833e(@mr2 Transition transition) {
            this.f5738b.setTranslationX(this.f5739c);
            this.f5738b.setTranslationY(this.f5740d);
            transition.mo6926h0(this);
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f5735a == null) {
                this.f5735a = new int[2];
            }
            this.f5735a[0] = Math.round(((float) this.f5733a) + this.f5738b.getTranslationX());
            this.f5735a[1] = Math.round(((float) this.f5737b) + this.f5738b.getTranslationY());
            this.f5734a.setTag(C1060e.C1065e.transition_position, this.f5735a);
        }

        public void onAnimationPause(Animator animator) {
            this.f5732a = this.f5738b.getTranslationX();
            this.f5736b = this.f5738b.getTranslationY();
            this.f5738b.setTranslationX(this.f5739c);
            this.f5738b.setTranslationY(this.f5740d);
        }

        public void onAnimationResume(Animator animator) {
            this.f5738b.setTranslationX(this.f5732a);
            this.f5738b.setTranslationY(this.f5736b);
        }
    }

    @ts2
    /* renamed from: a */
    public static Animator m7203a(@mr2 View view, @mr2 th4 th4, int i, int i2, float f, float f2, float f3, float f4, @ts2 TimeInterpolator timeInterpolator, @mr2 Transition transition) {
        float f5;
        float f6;
        View view2 = view;
        th4 th42 = th4;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) th42.f20844a.getTag(C1060e.C1065e.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        C1092a aVar = new C1092a(view, th42.f20844a, round, round2, translationX, translationY);
        transition.mo6912a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        C1050a.m7118a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
