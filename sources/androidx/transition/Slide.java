package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ny3;
import com.onedelhi.secure.th4;
import com.onedelhi.secure.xj4;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

public class Slide extends Visibility {

    /* renamed from: b */
    public static final TimeInterpolator f5544b = new DecelerateInterpolator();

    /* renamed from: b */
    public static final C1032g f5545b = new C1026a();

    /* renamed from: c */
    public static final TimeInterpolator f5546c = new AccelerateInterpolator();

    /* renamed from: c */
    public static final C1032g f5547c = new C1027b();

    /* renamed from: d */
    public static final C1032g f5548d = new C1028c();

    /* renamed from: e */
    public static final C1032g f5549e = new C1029d();

    /* renamed from: f */
    public static final C1032g f5550f = new C1030e();

    /* renamed from: g */
    public static final C1032g f5551g = new C1031f();

    /* renamed from: k */
    public static final String f5552k = "android:slide:screenPosition";

    /* renamed from: a */
    public C1032g f5553a = f5551g;

    /* renamed from: x */
    public int f5554x = 80;

    /* renamed from: androidx.transition.Slide$a */
    public static class C1026a extends C1033h {
        public C1026a() {
            super((C1026a) null);
        }

        /* renamed from: b */
        public float mo6888b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$b */
    public static class C1027b extends C1033h {
        public C1027b() {
            super((C1026a) null);
        }

        /* renamed from: b */
        public float mo6888b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (jt4.m18928Z(viewGroup) != 1) {
                z = false;
            }
            float translationX = view.getTranslationX();
            float width = (float) viewGroup.getWidth();
            return z ? translationX + width : translationX - width;
        }
    }

    /* renamed from: androidx.transition.Slide$c */
    public static class C1028c extends C1034i {
        public C1028c() {
            super((C1026a) null);
        }

        /* renamed from: a */
        public float mo6889a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.Slide$d */
    public static class C1029d extends C1033h {
        public C1029d() {
            super((C1026a) null);
        }

        /* renamed from: b */
        public float mo6888b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$e */
    public static class C1030e extends C1033h {
        public C1030e() {
            super((C1026a) null);
        }

        /* renamed from: b */
        public float mo6888b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (jt4.m18928Z(viewGroup) != 1) {
                z = false;
            }
            float translationX = view.getTranslationX();
            float width = (float) viewGroup.getWidth();
            return z ? translationX - width : translationX + width;
        }
    }

    /* renamed from: androidx.transition.Slide$f */
    public static class C1031f extends C1034i {
        public C1031f() {
            super((C1026a) null);
        }

        /* renamed from: a */
        public float mo6889a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.Slide$g */
    public interface C1032g {
        /* renamed from: a */
        float mo6889a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo6888b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.Slide$h */
    public static abstract class C1033h implements C1032g {
        public C1033h() {
        }

        public /* synthetic */ C1033h(C1026a aVar) {
            this();
        }

        /* renamed from: a */
        public float mo6889a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: androidx.transition.Slide$i */
    public static abstract class C1034i implements C1032g {
        public C1034i() {
        }

        public /* synthetic */ C1034i(C1026a aVar) {
            this();
        }

        /* renamed from: b */
        public float mo6888b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.transition.Slide$j */
    public @interface C1035j {
    }

    public Slide() {
        mo6887K0(80);
    }

    public Slide(int i) {
        mo6887K0(i);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1072g.f5684h);
        int k = xj4.m31494k(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        mo6887K0(k);
    }

    /* renamed from: A0 */
    private void m6933A0(th4 th4) {
        int[] iArr = new int[2];
        th4.f20844a.getLocationOnScreen(iArr);
        th4.f20846a.put(f5552k, iArr);
    }

    /* renamed from: E0 */
    public Animator mo6878E0(ViewGroup viewGroup, View view, th4 th4, th4 th42) {
        if (th42 == null) {
            return null;
        }
        int[] iArr = (int[]) th42.f20846a.get(f5552k);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C1091l.m7203a(view, th42, iArr[0], iArr[1], this.f5553a.mo6888b(viewGroup, view), this.f5553a.mo6889a(viewGroup, view), translationX, translationY, f5544b, this);
    }

    /* renamed from: G0 */
    public Animator mo6879G0(ViewGroup viewGroup, View view, th4 th4, th4 th42) {
        if (th4 == null) {
            return null;
        }
        int[] iArr = (int[]) th4.f20846a.get(f5552k);
        return C1091l.m7203a(view, th4, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f5553a.mo6888b(viewGroup, view), this.f5553a.mo6889a(viewGroup, view), f5546c, this);
    }

    /* renamed from: J0 */
    public int mo6886J0() {
        return this.f5554x;
    }

    /* renamed from: K0 */
    public void mo6887K0(int i) {
        C1032g gVar;
        if (i == 3) {
            gVar = f5545b;
        } else if (i == 5) {
            gVar = f5549e;
        } else if (i == 48) {
            gVar = f5548d;
        } else if (i == 80) {
            gVar = f5551g;
        } else if (i == 8388611) {
            gVar = f5547c;
        } else if (i == 8388613) {
            gVar = f5550f;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f5553a = gVar;
        this.f5554x = i;
        ny3 ny3 = new ny3();
        ny3.mo21507k(i);
        mo6952v0(ny3);
    }

    /* renamed from: j */
    public void mo6800j(@mr2 th4 th4) {
        super.mo6800j(th4);
        m6933A0(th4);
    }

    /* renamed from: m */
    public void mo6801m(@mr2 th4 th4) {
        super.mo6801m(th4);
        m6933A0(th4);
    }
}
