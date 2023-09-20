package com.onedelhi.secure;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import com.onedelhi.secure.uw3;

@sj3(21)
public class rh4 {

    /* renamed from: a */
    public static final int f34625a = -1;

    /* renamed from: a */
    public static final RectF f34626a = new RectF();
    @C3982yb

    /* renamed from: b */
    public static final int f34627b = 0;

    /* renamed from: c */
    public static final int f34628c = 0;

    /* renamed from: d */
    public static final int f34629d = 1;

    /* renamed from: com.onedelhi.secure.rh4$a */
    public class C6696a implements uw3.C6983c {

        /* renamed from: a */
        public final /* synthetic */ RectF f34630a;

        public C6696a(RectF rectF) {
            this.f34630a = rectF;
        }

        @mr2
        /* renamed from: a */
        public z80 mo31652a(@mr2 z80 z80) {
            return z80 instanceof ph3 ? z80 : new ph3(z80.mo32234a(this.f34630a) / this.f34630a.height());
        }
    }

    /* renamed from: com.onedelhi.secure.rh4$b */
    public class C6697b implements C6699d {

        /* renamed from: a */
        public final /* synthetic */ float f34631a;

        /* renamed from: a */
        public final /* synthetic */ RectF f34632a;

        /* renamed from: b */
        public final /* synthetic */ float f34633b;

        /* renamed from: b */
        public final /* synthetic */ RectF f34634b;

        /* renamed from: c */
        public final /* synthetic */ float f34635c;

        public C6697b(RectF rectF, RectF rectF2, float f, float f2, float f3) {
            this.f34632a = rectF;
            this.f34634b = rectF2;
            this.f34631a = f;
            this.f34633b = f2;
            this.f34635c = f3;
        }

        @mr2
        /* renamed from: a */
        public z80 mo43902a(@mr2 z80 z80, @mr2 z80 z802) {
            return new C5459h0(rh4.m63621l(z80.mo32234a(this.f34632a), z802.mo32234a(this.f34634b), this.f34631a, this.f34633b, this.f34635c));
        }
    }

    /* renamed from: com.onedelhi.secure.rh4$c */
    public interface C6698c {
        /* renamed from: a */
        void mo42581a(Canvas canvas);
    }

    /* renamed from: com.onedelhi.secure.rh4$d */
    public interface C6699d {
        @mr2
        /* renamed from: a */
        z80 mo43902a(@mr2 z80 z80, @mr2 z80 z802);
    }

    /* renamed from: a */
    public static float m63610a(@mr2 RectF rectF) {
        return rectF.width() * rectF.height();
    }

    /* renamed from: b */
    public static uw3 m63611b(uw3 uw3, RectF rectF) {
        return uw3.mo45827y(new C6696a(rectF));
    }

    /* renamed from: c */
    public static Shader m63612c(@d10 int i) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i, i, Shader.TileMode.CLAMP);
    }

    @mr2
    /* renamed from: d */
    public static <T> T m63613d(@ts2 T t, @mr2 T t2) {
        return t != null ? t : t2;
    }

    /* renamed from: e */
    public static View m63614e(View view, @mo1 int i) {
        String resourceName = view.getResources().getResourceName(i);
        while (view != null) {
            if (view.getId() != i) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    /* renamed from: f */
    public static View m63615f(View view, @mo1 int i) {
        View findViewById = view.findViewById(i);
        return findViewById != null ? findViewById : m63614e(view, i);
    }

    /* renamed from: g */
    public static RectF m63616g(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new RectF((float) i, (float) i2, (float) (view.getWidth() + i), (float) (view.getHeight() + i2));
    }

    /* renamed from: h */
    public static RectF m63617h(View view) {
        return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
    }

    /* renamed from: i */
    public static Rect m63618i(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: j */
    public static boolean m63619j(uw3 uw3, RectF rectF) {
        return (uw3.mo45820r().mo32234a(rectF) == 0.0f && uw3.mo45822t().mo32234a(rectF) == 0.0f && uw3.mo45815l().mo32234a(rectF) == 0.0f && uw3.mo45813j().mo32234a(rectF) == 0.0f) ? false : true;
    }

    /* renamed from: k */
    public static float m63620k(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: l */
    public static float m63621l(float f, float f2, @d81(from = 0.0d, mo14561to = 1.0d) float f3, @d81(from = 0.0d, mo14561to = 1.0d) float f4, @d81(from = 0.0d, mo14561to = 1.0d) float f5) {
        return m63622m(f, f2, f3, f4, f5, false);
    }

    /* renamed from: m */
    public static float m63622m(float f, float f2, @d81(from = 0.0d, mo14561to = 1.0d) float f3, @d81(from = 0.0d, mo14561to = 1.0d) float f4, @d81(from = 0.0d) float f5, boolean z) {
        return (!z || (f5 >= 0.0f && f5 <= 1.0f)) ? f5 < f3 ? f : f5 > f4 ? f2 : m63620k(f, f2, (f5 - f3) / (f4 - f3)) : m63620k(f, f2, f5);
    }

    /* renamed from: n */
    public static int m63623n(int i, int i2, @d81(from = 0.0d, mo14561to = 1.0d) float f, @d81(from = 0.0d, mo14561to = 1.0d) float f2, @d81(from = 0.0d, mo14561to = 1.0d) float f3) {
        return f3 < f ? i : f3 > f2 ? i2 : (int) m63620k((float) i, (float) i2, (f3 - f) / (f2 - f));
    }

    /* renamed from: o */
    public static uw3 m63624o(uw3 uw3, uw3 uw32, RectF rectF, RectF rectF2, @d81(from = 0.0d, mo14561to = 1.0d) float f, @d81(from = 0.0d, mo14561to = 1.0d) float f2, @d81(from = 0.0d, mo14561to = 1.0d) float f3) {
        return f3 < f ? uw3 : f3 > f2 ? uw32 : m63633x(uw3, uw32, rectF, new C6697b(rectF, rectF2, f, f2, f3));
    }

    /* renamed from: p */
    public static void m63625p(TransitionSet transitionSet, @ts2 Transition transition) {
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
    }

    /* renamed from: q */
    public static boolean m63626q(Transition transition, Context context, @C3982yb int i) {
        int f;
        if (i == 0 || transition.getDuration() != -1 || (f = pl2.m61421f(context, i, -1)) == -1) {
            return false;
        }
        transition.setDuration((long) f);
        return true;
    }

    /* renamed from: r */
    public static boolean m63627r(Transition transition, Context context, @C3982yb int i, TimeInterpolator timeInterpolator) {
        if (i == 0 || transition.getInterpolator() != null) {
            return false;
        }
        transition.setInterpolator(pl2.m61422g(context, i, timeInterpolator));
        return true;
    }

    /* renamed from: s */
    public static boolean m63628s(Transition transition, Context context, @C3982yb int i) {
        PathMotion u;
        if (i == 0 || (u = m63630u(context, i)) == null) {
            return false;
        }
        transition.setPathMotion(u);
        return true;
    }

    /* renamed from: t */
    public static void m63629t(TransitionSet transitionSet, @ts2 Transition transition) {
        if (transition != null) {
            transitionSet.removeTransition(transition);
        }
    }

    @ts2
    /* renamed from: u */
    public static PathMotion m63630u(Context context, @C3982yb int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.type;
        if (i2 == 16) {
            int i3 = typedValue.data;
            if (i3 == 0) {
                return null;
            }
            if (i3 == 1) {
                return new he2();
            }
            throw new IllegalArgumentException("Invalid motion path type: " + i3);
        } else if (i2 == 3) {
            return new PatternPathMotion(xz2.m31794e(String.valueOf(typedValue.string)));
        } else {
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
    }

    /* renamed from: v */
    public static int m63631v(Canvas canvas, Rect rect, int i) {
        RectF rectF = f34626a;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i);
    }

    /* renamed from: w */
    public static void m63632w(Canvas canvas, Rect rect, float f, float f2, float f3, int i, C6698c cVar) {
        if (i > 0) {
            int save = canvas.save();
            canvas.translate(f, f2);
            canvas.scale(f3, f3);
            if (i < 255) {
                m63631v(canvas, rect, i);
            }
            cVar.mo42581a(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: x */
    public static uw3 m63633x(uw3 uw3, uw3 uw32, RectF rectF, C6699d dVar) {
        return (m63619j(uw3, rectF) ? uw3 : uw32).mo45824v().mo45839L(dVar.mo43902a(uw3.mo45820r(), uw32.mo45820r())).mo45844Q(dVar.mo43902a(uw3.mo45822t(), uw32.mo45822t())).mo45856y(dVar.mo43902a(uw3.mo45813j(), uw32.mo45813j())).mo45831D(dVar.mo43902a(uw3.mo45815l(), uw32.mo45815l())).mo45845m();
    }
}
