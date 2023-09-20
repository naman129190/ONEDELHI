package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import com.onedelhi.secure.hl3;
import java.util.Map;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class fb4 extends Transition {

    /* renamed from: h */
    public static final String f28252h = "android:textscale:scale";

    /* renamed from: com.onedelhi.secure.fb4$a */
    public class C5237a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ TextView f28253a;

        public C5237a(TextView textView) {
            this.f28253a = textView;
        }

        public void onAnimationUpdate(@mr2 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f28253a.setScaleX(floatValue);
            this.f28253a.setScaleY(floatValue);
        }
    }

    /* renamed from: A0 */
    public final void mo35842A0(@mr2 th4 th4) {
        View view = th4.f20844a;
        if (view instanceof TextView) {
            th4.f20846a.put(f28252h, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    /* renamed from: j */
    public void mo6800j(@mr2 th4 th4) {
        mo35842A0(th4);
    }

    /* renamed from: m */
    public void mo6801m(@mr2 th4 th4) {
        mo35842A0(th4);
    }

    /* renamed from: q */
    public Animator mo6802q(@mr2 ViewGroup viewGroup, @ts2 th4 th4, @ts2 th4 th42) {
        if (th4 == null || th42 == null || !(th4.f20844a instanceof TextView)) {
            return null;
        }
        View view = th42.f20844a;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = th4.f20846a;
        Map<String, Object> map2 = th42.f20846a;
        float f = 1.0f;
        float floatValue = map.get(f28252h) != null ? ((Float) map.get(f28252h)).floatValue() : 1.0f;
        if (map2.get(f28252h) != null) {
            f = ((Float) map2.get(f28252h)).floatValue();
        }
        if (floatValue == f) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue, f});
        ofFloat.addUpdateListener(new C5237a(textView));
        return ofFloat;
    }
}
