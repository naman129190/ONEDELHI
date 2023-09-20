package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.transition.C1060e;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.n */
public class C1095n {

    /* renamed from: a */
    public static final int f5748a = 12;

    /* renamed from: a */
    public static final String f5749a = "ViewUtilsBase";

    /* renamed from: a */
    public static Field f5750a;

    /* renamed from: a */
    public static Method f5751a;

    /* renamed from: a */
    public static boolean f5752a;

    /* renamed from: b */
    public static boolean f5753b;

    /* renamed from: a */
    public float[] f5754a;

    /* renamed from: a */
    public void mo7058a(@mr2 View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C1060e.C1065e.save_non_transition_alpha, (Object) null);
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: b */
    public final void mo7059b() {
        if (!f5752a) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{cls2, cls2, cls2, cls2});
                f5751a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i(f5749a, "Failed to retrieve setFrame method", e);
            }
            f5752a = true;
        }
    }

    /* renamed from: c */
    public float mo7060c(@mr2 View view) {
        Float f = (Float) view.getTag(C1060e.C1065e.save_non_transition_alpha);
        float alpha = view.getAlpha();
        return f != null ? alpha / f.floatValue() : alpha;
    }

    /* renamed from: d */
    public void mo7061d(@mr2 View view) {
        int i = C1060e.C1065e.save_non_transition_alpha;
        if (view.getTag(i) == null) {
            view.setTag(i, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: e */
    public void mo7062e(@mr2 View view, @ts2 Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX((float) (view.getWidth() / 2));
            view.setPivotY((float) (view.getHeight() / 2));
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f5754a;
        if (fArr == null) {
            fArr = new float[9];
            this.f5754a = fArr;
        }
        matrix.getValues(fArr);
        float f = fArr[3];
        float sqrt = ((float) Math.sqrt((double) (1.0f - (f * f)))) * ((float) (fArr[0] < 0.0f ? -1 : 1));
        float degrees = (float) Math.toDegrees(Math.atan2((double) f, (double) sqrt));
        float f2 = fArr[0] / sqrt;
        float f3 = fArr[4] / sqrt;
        float f4 = fArr[2];
        float f5 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f4);
        view.setTranslationY(f5);
        view.setRotation(degrees);
        view.setScaleX(f2);
        view.setScaleY(f3);
    }

    /* renamed from: f */
    public void mo7063f(@mr2 View view, int i, int i2, int i3, int i4) {
        mo7059b();
        Method method = f5751a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: g */
    public void mo7064g(@mr2 View view, float f) {
        Float f2 = (Float) view.getTag(C1060e.C1065e.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: h */
    public void mo7065h(@mr2 View view, int i) {
        if (!f5753b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f5750a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(f5749a, "fetchViewFlagsField: ");
            }
            f5753b = true;
        }
        Field field = f5750a;
        if (field != null) {
            try {
                f5750a.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: i */
    public void mo7066i(@mr2 View view, @mr2 Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo7066i(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: j */
    public void mo7067j(@mr2 View view, @mr2 Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo7067j(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }
}
