package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class d04 implements fw4 {

    /* renamed from: c */
    public static final int f27173c = -1;

    /* renamed from: a */
    public int f27174a;
    @e83

    /* renamed from: b */
    public int f27175b = -1;

    /* renamed from: com.onedelhi.secure.d04$a */
    public class C4942a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ float f27176a;

        /* renamed from: a */
        public final /* synthetic */ View f27177a;

        public C4942a(View view, float f) {
            this.f27177a = view;
            this.f27176a = f;
        }

        public void onAnimationEnd(Animator animator) {
            this.f27177a.setTranslationX(this.f27176a);
        }
    }

    /* renamed from: com.onedelhi.secure.d04$b */
    public class C4943b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ float f27178a;

        /* renamed from: a */
        public final /* synthetic */ View f27179a;

        public C4943b(View view, float f) {
            this.f27179a = view;
            this.f27178a = f;
        }

        public void onAnimationEnd(Animator animator) {
            this.f27179a.setTranslationY(this.f27178a);
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.d04$c */
    public @interface C4944c {
    }

    public d04(int i) {
        this.f27174a = i;
    }

    /* renamed from: c */
    public static Animator m44422c(View view, View view2, int i, @e83 int i2) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return m44424e(view2, ((float) i2) + translationX, translationX, translationX);
        }
        if (i == 5) {
            return m44424e(view2, translationX - ((float) i2), translationX, translationX);
        }
        if (i == 48) {
            return m44425f(view2, translationY - ((float) i2), translationY, translationY);
        }
        if (i == 80) {
            return m44425f(view2, ((float) i2) + translationY, translationY, translationY);
        }
        if (i == 8388611) {
            return m44424e(view2, m44426j(view) ? ((float) i2) + translationX : translationX - ((float) i2), translationX, translationX);
        } else if (i == 8388613) {
            return m44424e(view2, m44426j(view) ? translationX - ((float) i2) : ((float) i2) + translationX, translationX, translationX);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i);
        }
    }

    /* renamed from: d */
    public static Animator m44423d(View view, View view2, int i, @e83 int i2) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return m44424e(view2, translationX, translationX - ((float) i2), translationX);
        }
        if (i == 5) {
            return m44424e(view2, translationX, ((float) i2) + translationX, translationX);
        }
        if (i == 48) {
            return m44425f(view2, translationY, ((float) i2) + translationY, translationY);
        }
        if (i == 80) {
            return m44425f(view2, translationY, translationY - ((float) i2), translationY);
        }
        if (i == 8388611) {
            return m44424e(view2, translationX, m44426j(view) ? translationX - ((float) i2) : ((float) i2) + translationX, translationX);
        } else if (i == 8388613) {
            return m44424e(view2, translationX, m44426j(view) ? ((float) i2) + translationX : translationX - ((float) i2), translationX);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i);
        }
    }

    /* renamed from: e */
    public static Animator m44424e(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new C4942a(view, f3));
        return ofPropertyValuesHolder;
    }

    /* renamed from: f */
    public static Animator m44425f(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new C4943b(view, f3));
        return ofPropertyValuesHolder;
    }

    /* renamed from: j */
    public static boolean m44426j(View view) {
        return jt4.m18928Z(view) == 1;
    }

    @ts2
    /* renamed from: a */
    public Animator mo34051a(@mr2 ViewGroup viewGroup, @mr2 View view) {
        return m44422c(viewGroup, view, this.f27174a, mo34054h(view.getContext()));
    }

    @ts2
    /* renamed from: b */
    public Animator mo34052b(@mr2 ViewGroup viewGroup, @mr2 View view) {
        return m44423d(viewGroup, view, this.f27174a, mo34054h(view.getContext()));
    }

    @e83
    /* renamed from: g */
    public int mo34053g() {
        return this.f27175b;
    }

    /* renamed from: h */
    public final int mo34054h(Context context) {
        int i = this.f27175b;
        return i != -1 ? i : context.getResources().getDimensionPixelSize(fd3.C2156f.mtrl_transition_shared_axis_slide_distance);
    }

    /* renamed from: i */
    public int mo34055i() {
        return this.f27174a;
    }

    /* renamed from: k */
    public void mo34056k(@e83 int i) {
        if (i >= 0) {
            this.f27175b = i;
            return;
        }
        throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
    }

    /* renamed from: l */
    public void mo34057l(int i) {
        this.f27174a = i;
    }
}
