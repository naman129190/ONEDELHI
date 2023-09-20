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

@sj3(21)
public final class c04 implements ew4 {

    /* renamed from: c */
    public static final int f26597c = -1;

    /* renamed from: a */
    public int f26598a;
    @e83

    /* renamed from: b */
    public int f26599b = -1;

    /* renamed from: com.onedelhi.secure.c04$a */
    public class C4718a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ float f26600a;

        /* renamed from: a */
        public final /* synthetic */ View f26601a;

        public C4718a(View view, float f) {
            this.f26601a = view;
            this.f26600a = f;
        }

        public void onAnimationEnd(Animator animator) {
            this.f26601a.setTranslationX(this.f26600a);
        }
    }

    /* renamed from: com.onedelhi.secure.c04$b */
    public class C4719b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ float f26602a;

        /* renamed from: a */
        public final /* synthetic */ View f26603a;

        public C4719b(View view, float f) {
            this.f26603a = view;
            this.f26602a = f;
        }

        public void onAnimationEnd(Animator animator) {
            this.f26603a.setTranslationY(this.f26602a);
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.c04$c */
    public @interface C4720c {
    }

    public c04(int i) {
        this.f26598a = i;
    }

    /* renamed from: c */
    public static Animator m40648c(View view, View view2, int i, @e83 int i2) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return m40650e(view2, ((float) i2) + translationX, translationX, translationX);
        }
        if (i == 5) {
            return m40650e(view2, translationX - ((float) i2), translationX, translationX);
        }
        if (i == 48) {
            return m40651f(view2, translationY - ((float) i2), translationY, translationY);
        }
        if (i == 80) {
            return m40651f(view2, ((float) i2) + translationY, translationY, translationY);
        }
        if (i == 8388611) {
            return m40650e(view2, m40652j(view) ? ((float) i2) + translationX : translationX - ((float) i2), translationX, translationX);
        } else if (i == 8388613) {
            return m40650e(view2, m40652j(view) ? translationX - ((float) i2) : ((float) i2) + translationX, translationX, translationX);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i);
        }
    }

    /* renamed from: d */
    public static Animator m40649d(View view, View view2, int i, @e83 int i2) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return m40650e(view2, translationX, translationX - ((float) i2), translationX);
        }
        if (i == 5) {
            return m40650e(view2, translationX, ((float) i2) + translationX, translationX);
        }
        if (i == 48) {
            return m40651f(view2, translationY, ((float) i2) + translationY, translationY);
        }
        if (i == 80) {
            return m40651f(view2, translationY, translationY - ((float) i2), translationY);
        }
        if (i == 8388611) {
            return m40650e(view2, translationX, m40652j(view) ? translationX - ((float) i2) : ((float) i2) + translationX, translationX);
        } else if (i == 8388613) {
            return m40650e(view2, translationX, m40652j(view) ? ((float) i2) + translationX : translationX - ((float) i2), translationX);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i);
        }
    }

    /* renamed from: e */
    public static Animator m40650e(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new C4718a(view, f3));
        return ofPropertyValuesHolder;
    }

    /* renamed from: f */
    public static Animator m40651f(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new C4719b(view, f3));
        return ofPropertyValuesHolder;
    }

    /* renamed from: j */
    public static boolean m40652j(View view) {
        return jt4.m18928Z(view) == 1;
    }

    @ts2
    /* renamed from: a */
    public Animator mo32190a(@mr2 ViewGroup viewGroup, @mr2 View view) {
        return m40648c(viewGroup, view, this.f26598a, mo32193h(view.getContext()));
    }

    @ts2
    /* renamed from: b */
    public Animator mo32191b(@mr2 ViewGroup viewGroup, @mr2 View view) {
        return m40649d(viewGroup, view, this.f26598a, mo32193h(view.getContext()));
    }

    @e83
    /* renamed from: g */
    public int mo32192g() {
        return this.f26599b;
    }

    /* renamed from: h */
    public final int mo32193h(Context context) {
        int i = this.f26599b;
        return i != -1 ? i : context.getResources().getDimensionPixelSize(fd3.C2156f.mtrl_transition_shared_axis_slide_distance);
    }

    /* renamed from: i */
    public int mo32194i() {
        return this.f26598a;
    }

    /* renamed from: k */
    public void mo32195k(@e83 int i) {
        if (i >= 0) {
            this.f26599b = i;
            return;
        }
        throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
    }

    /* renamed from: l */
    public void mo32196l(int i) {
        this.f26598a = i;
    }
}
