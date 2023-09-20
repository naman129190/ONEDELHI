package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.th4;
import com.onedelhi.secure.ts2;

public class ChangeScroll extends Transition {

    /* renamed from: a */
    public static final String[] f5490a = {f5491h, f5492i};

    /* renamed from: h */
    public static final String f5491h = "android:changeScroll:x";

    /* renamed from: i */
    public static final String f5492i = "android:changeScroll:y";

    public ChangeScroll() {
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: A0 */
    public final void mo6848A0(th4 th4) {
        th4.f20846a.put(f5491h, Integer.valueOf(th4.f20844a.getScrollX()));
        th4.f20846a.put(f5492i, Integer.valueOf(th4.f20844a.getScrollY()));
    }

    @ts2
    /* renamed from: T */
    public String[] mo6799T() {
        return f5490a;
    }

    /* renamed from: j */
    public void mo6800j(@mr2 th4 th4) {
        mo6848A0(th4);
    }

    /* renamed from: m */
    public void mo6801m(@mr2 th4 th4) {
        mo6848A0(th4);
    }

    @ts2
    /* renamed from: q */
    public Animator mo6802q(@mr2 ViewGroup viewGroup, @ts2 th4 th4, @ts2 th4 th42) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (th4 == null || th42 == null) {
            return null;
        }
        View view = th42.f20844a;
        int intValue = ((Integer) th4.f20846a.get(f5491h)).intValue();
        int intValue2 = ((Integer) th42.f20846a.get(f5491h)).intValue();
        int intValue3 = ((Integer) th4.f20846a.get(f5492i)).intValue();
        int intValue4 = ((Integer) th42.f20846a.get(f5492i)).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", new int[]{intValue3, intValue4});
        }
        return C1089k.m7201c(objectAnimator, objectAnimator2);
    }
}
