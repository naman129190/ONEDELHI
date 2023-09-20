package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.transition.C1060e;
import com.onedelhi.secure.C2681ky;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.th4;

public class Explode extends Visibility {

    /* renamed from: b */
    public static final TimeInterpolator f5529b = new DecelerateInterpolator();

    /* renamed from: c */
    public static final TimeInterpolator f5530c = new AccelerateInterpolator();

    /* renamed from: k */
    public static final String f5531k = "android:explode:screenBounds";

    /* renamed from: c */
    public int[] f5532c = new int[2];

    public Explode() {
        mo6952v0(new C2681ky());
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo6952v0(new C2681ky());
    }

    /* renamed from: A0 */
    private void m6914A0(th4 th4) {
        View view = th4.f20844a;
        view.getLocationOnScreen(this.f5532c);
        int[] iArr = this.f5532c;
        int i = iArr[0];
        int i2 = iArr[1];
        th4.f20846a.put(f5531k, new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    /* renamed from: J0 */
    public static float m6915J0(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    /* renamed from: K0 */
    public static float m6916K0(View view, int i, int i2) {
        return m6915J0((float) Math.max(i, view.getWidth() - i), (float) Math.max(i2, view.getHeight() - i2));
    }

    /* renamed from: E0 */
    public Animator mo6878E0(ViewGroup viewGroup, View view, th4 th4, th4 th42) {
        if (th42 == null) {
            return null;
        }
        Rect rect = (Rect) th42.f20846a.get(f5531k);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        mo6880L0(viewGroup, rect, this.f5532c);
        int[] iArr = this.f5532c;
        return C1091l.m7203a(view, th42, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, f5529b, this);
    }

    /* renamed from: G0 */
    public Animator mo6879G0(ViewGroup viewGroup, View view, th4 th4, th4 th42) {
        float f;
        float f2;
        if (th4 == null) {
            return null;
        }
        Rect rect = (Rect) th4.f20846a.get(f5531k);
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) th4.f20844a.getTag(C1060e.C1065e.transition_position);
        if (iArr != null) {
            f2 = ((float) (iArr[0] - rect.left)) + translationX;
            f = ((float) (iArr[1] - rect.top)) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f2 = translationX;
            f = translationY;
        }
        mo6880L0(viewGroup, rect, this.f5532c);
        int[] iArr2 = this.f5532c;
        return C1091l.m7203a(view, th4, i, i2, translationX, translationY, f2 + ((float) iArr2[0]), f + ((float) iArr2[1]), f5530c, this);
    }

    /* renamed from: L0 */
    public final void mo6880L0(View view, Rect rect, int[] iArr) {
        int i;
        int i2;
        View view2 = view;
        view2.getLocationOnScreen(this.f5532c);
        int[] iArr2 = this.f5532c;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        Rect G = mo6896G();
        if (G == null) {
            i2 = (view.getWidth() / 2) + i3 + Math.round(view.getTranslationX());
            i = (view.getHeight() / 2) + i4 + Math.round(view.getTranslationY());
        } else {
            int centerX = G.centerX();
            i = G.centerY();
            i2 = centerX;
        }
        float centerX2 = (float) (rect.centerX() - i2);
        float centerY = (float) (rect.centerY() - i);
        if (centerX2 == 0.0f && centerY == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float J0 = m6915J0(centerX2, centerY);
        float K0 = m6916K0(view2, i2 - i3, i - i4);
        iArr[0] = Math.round((centerX2 / J0) * K0);
        iArr[1] = Math.round(K0 * (centerY / J0));
    }

    /* renamed from: j */
    public void mo6800j(@mr2 th4 th4) {
        super.mo6800j(th4);
        m6914A0(th4);
    }

    /* renamed from: m */
    public void mo6801m(@mr2 th4 th4) {
        super.mo6801m(th4);
        m6914A0(th4);
    }
}
