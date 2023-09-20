package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qv4;
import com.onedelhi.secure.th4;
import com.onedelhi.secure.xj4;

public class Fade extends Visibility {

    /* renamed from: k */
    public static final String f5533k = "android:fade:transitionAlpha";

    /* renamed from: l */
    public static final String f5534l = "Fade";

    /* renamed from: x */
    public static final int f5535x = 1;

    /* renamed from: y */
    public static final int f5536y = 2;

    /* renamed from: androidx.transition.Fade$a */
    public class C1024a extends C1085i {

        /* renamed from: a */
        public final /* synthetic */ View f5537a;

        public C1024a(View view) {
            this.f5537a = view;
        }

        /* renamed from: e */
        public void mo6833e(@mr2 Transition transition) {
            qv4.m26203h(this.f5537a, 1.0f);
            qv4.m26196a(this.f5537a);
            transition.mo6926h0(this);
        }
    }

    /* renamed from: androidx.transition.Fade$b */
    public static class C1025b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f5539a;

        /* renamed from: a */
        public boolean f5540a = false;

        public C1025b(View view) {
            this.f5539a = view;
        }

        public void onAnimationEnd(Animator animator) {
            qv4.m26203h(this.f5539a, 1.0f);
            if (this.f5540a) {
                this.f5539a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (jt4.m18887L0(this.f5539a) && this.f5539a.getLayerType() == 0) {
                this.f5540a = true;
                this.f5539a.setLayerType(2, (Paint) null);
            }
        }
    }

    public Fade() {
    }

    public Fade(int i) {
        mo6993I0(i);
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1072g.f5682f);
        mo6993I0(xj4.m31494k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, mo6988B0()));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f20846a.get(f5533k);
     */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float m6922K0(com.onedelhi.secure.th4 r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f20846a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Fade.m6922K0(com.onedelhi.secure.th4, float):float");
    }

    /* renamed from: E0 */
    public Animator mo6878E0(ViewGroup viewGroup, View view, th4 th4, th4 th42) {
        float f = 0.0f;
        float K0 = m6922K0(th4, 0.0f);
        if (K0 != 1.0f) {
            f = K0;
        }
        return mo6881J0(view, f, 1.0f);
    }

    /* renamed from: G0 */
    public Animator mo6879G0(ViewGroup viewGroup, View view, th4 th4, th4 th42) {
        qv4.m26200e(view);
        return mo6881J0(view, m6922K0(th4, 1.0f), 0.0f);
    }

    /* renamed from: J0 */
    public final Animator mo6881J0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        qv4.m26203h(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, qv4.f19486a, new float[]{f2});
        ofFloat.addListener(new C1025b(view));
        mo6912a(new C1024a(view));
        return ofFloat;
    }

    /* renamed from: m */
    public void mo6801m(@mr2 th4 th4) {
        super.mo6801m(th4);
        th4.f20846a.put(f5533k, Float.valueOf(qv4.m26198c(th4.f20844a)));
    }
}
