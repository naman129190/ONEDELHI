package com.onedelhi.secure;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class bk0 {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f26387a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f26388b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m40127a(@mr2 ViewGroup viewGroup, @mr2 View view, @mr2 Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m40129c(viewGroup, view, rect);
    }

    /* renamed from: b */
    public static void m40128b(ViewParent viewParent, @mr2 View view, @mr2 Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m40128b(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    /* renamed from: c */
    public static void m40129c(@mr2 ViewGroup viewGroup, @mr2 View view, @mr2 Rect rect) {
        ThreadLocal<Matrix> threadLocal = f26387a;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m40128b(viewGroup, view, matrix);
        ThreadLocal<RectF> threadLocal2 = f26388b;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
