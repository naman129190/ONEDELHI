package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.C1089k;
import com.onedelhi.secure.ip1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.th4;
import com.onedelhi.secure.vf2;
import java.util.Map;

public class ChangeImageTransform extends Transition {

    /* renamed from: a */
    public static final TypeEvaluator<Matrix> f5484a = new C1015a();

    /* renamed from: a */
    public static final Property<ImageView, Matrix> f5485a = new C1016b(Matrix.class, "animatedTransform");

    /* renamed from: a */
    public static final String[] f5486a = {f5487h, f5488i};

    /* renamed from: h */
    public static final String f5487h = "android:changeImageTransform:matrix";

    /* renamed from: i */
    public static final String f5488i = "android:changeImageTransform:bounds";

    /* renamed from: androidx.transition.ChangeImageTransform$a */
    public static class C1015a implements TypeEvaluator<Matrix> {
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$b */
    public static class C1016b extends Property<ImageView, Matrix> {
        public C1016b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Matrix get(ImageView imageView) {
            return null;
        }

        /* renamed from: b */
        public void set(ImageView imageView, Matrix matrix) {
            ip1.m17759a(imageView, matrix);
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$c */
    public static /* synthetic */ class C1017c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5489a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5489a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5489a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeImageTransform.C1017c.<clinit>():void");
        }
    }

    public ChangeImageTransform() {
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: B0 */
    public static Matrix m6868B0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = (float) imageView.getWidth();
        float f = (float) intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = (float) imageView.getHeight();
        float f2 = (float) intrinsicHeight;
        float max = Math.max(width / f, height / f2);
        int round = Math.round((width - (f * max)) / 2.0f);
        int round2 = Math.round((height - (f2 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate((float) round, (float) round2);
        return matrix;
    }

    @mr2
    /* renamed from: C0 */
    public static Matrix m6869C0(@mr2 ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i = C1017c.f5489a[imageView.getScaleType().ordinal()];
            if (i == 1) {
                return m6870F0(imageView);
            }
            if (i == 2) {
                return m6868B0(imageView);
            }
        }
        return new Matrix(imageView.getImageMatrix());
    }

    /* renamed from: F0 */
    public static Matrix m6870F0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) imageView.getWidth()) / ((float) drawable.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable.getIntrinsicHeight()));
        return matrix;
    }

    /* renamed from: A0 */
    public final void mo6839A0(th4 th4) {
        View view = th4.f20844a;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map<String, Object> map = th4.f20846a;
                map.put(f5488i, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                map.put(f5487h, m6869C0(imageView));
            }
        }
    }

    /* renamed from: D0 */
    public final ObjectAnimator mo6840D0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, f5485a, new C1089k.C1090a(), new Matrix[]{matrix, matrix2});
    }

    @mr2
    /* renamed from: E0 */
    public final ObjectAnimator mo6841E0(@mr2 ImageView imageView) {
        Property<ImageView, Matrix> property = f5485a;
        TypeEvaluator<Matrix> typeEvaluator = f5484a;
        Matrix matrix = vf2.f21742a;
        return ObjectAnimator.ofObject(imageView, property, typeEvaluator, new Matrix[]{matrix, matrix});
    }

    /* renamed from: T */
    public String[] mo6799T() {
        return f5486a;
    }

    /* renamed from: j */
    public void mo6800j(@mr2 th4 th4) {
        mo6839A0(th4);
    }

    /* renamed from: m */
    public void mo6801m(@mr2 th4 th4) {
        mo6839A0(th4);
    }

    /* renamed from: q */
    public Animator mo6802q(@mr2 ViewGroup viewGroup, th4 th4, th4 th42) {
        if (th4 == null || th42 == null) {
            return null;
        }
        Rect rect = (Rect) th4.f20846a.get(f5488i);
        Rect rect2 = (Rect) th42.f20846a.get(f5488i);
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) th4.f20846a.get(f5487h);
        Matrix matrix2 = (Matrix) th42.f20846a.get(f5487h);
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) th42.f20844a;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return mo6841E0(imageView);
        }
        if (matrix == null) {
            matrix = vf2.f21742a;
        }
        if (matrix2 == null) {
            matrix2 = vf2.f21742a;
        }
        f5485a.set(imageView, matrix);
        return mo6840D0(imageView, matrix, matrix2);
    }
}
