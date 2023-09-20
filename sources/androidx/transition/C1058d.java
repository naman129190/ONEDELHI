package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.transition.C1060e;
import com.onedelhi.secure.C3874wu;
import com.onedelhi.secure.ig1;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qv4;
import com.onedelhi.secure.ts2;

@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.transition.d */
public class C1058d extends ViewGroup implements ig1 {
    @ts2

    /* renamed from: a */
    public Matrix f5664a;

    /* renamed from: a */
    public View f5665a;

    /* renamed from: a */
    public ViewGroup f5666a;

    /* renamed from: a */
    public final ViewTreeObserver.OnPreDrawListener f5667a = new C1059a();

    /* renamed from: b */
    public final View f5668b;

    /* renamed from: n */
    public int f5669n;

    /* renamed from: androidx.transition.d$a */
    public class C1059a implements ViewTreeObserver.OnPreDrawListener {
        public C1059a() {
        }

        public boolean onPreDraw() {
            View view;
            jt4.m18985n1(C1058d.this);
            C1058d dVar = C1058d.this;
            ViewGroup viewGroup = dVar.f5666a;
            if (viewGroup == null || (view = dVar.f5665a) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            jt4.m18985n1(C1058d.this.f5666a);
            C1058d dVar2 = C1058d.this;
            dVar2.f5666a = null;
            dVar2.f5665a = null;
            return true;
        }
    }

    public C1058d(View view) {
        super(view.getContext());
        this.f5668b = view;
        setWillNotDraw(false);
        setLayerType(2, (Paint) null);
    }

    /* renamed from: b */
    public static C1058d m7154b(View view, ViewGroup viewGroup, Matrix matrix) {
        C1057c cVar;
        if (view.getParent() instanceof ViewGroup) {
            C1057c b = C1057c.m7147b(viewGroup);
            C1058d e = m7157e(view);
            int i = 0;
            if (!(e == null || (cVar = (C1057c) e.getParent()) == b)) {
                i = e.f5669n;
                cVar.removeView(e);
                e = null;
            }
            if (e == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    m7155c(view, viewGroup, matrix);
                }
                e = new C1058d(view);
                e.mo7024h(matrix);
                if (b == null) {
                    b = new C1057c(viewGroup);
                } else {
                    b.mo7020g();
                }
                m7156d(viewGroup, b);
                m7156d(viewGroup, e);
                b.mo7018a(e);
                e.f5669n = i;
            } else if (matrix != null) {
                e.mo7024h(matrix);
            }
            e.f5669n++;
            return e;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    /* renamed from: c */
    public static void m7155c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        qv4.m26205j(viewGroup2, matrix);
        matrix.preTranslate((float) (-viewGroup2.getScrollX()), (float) (-viewGroup2.getScrollY()));
        qv4.m26206k(viewGroup, matrix);
    }

    /* renamed from: d */
    public static void m7156d(View view, View view2) {
        qv4.m26202g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    /* renamed from: e */
    public static C1058d m7157e(View view) {
        return (C1058d) view.getTag(C1060e.C1065e.ghost_view);
    }

    /* renamed from: f */
    public static void m7158f(View view) {
        C1058d e = m7157e(view);
        if (e != null) {
            int i = e.f5669n - 1;
            e.f5669n = i;
            if (i <= 0) {
                ((C1057c) e.getParent()).removeView(e);
            }
        }
    }

    /* renamed from: g */
    public static void m7159g(@mr2 View view, @ts2 C1058d dVar) {
        view.setTag(C1060e.C1065e.ghost_view, dVar);
    }

    /* renamed from: a */
    public void mo7023a(ViewGroup viewGroup, View view) {
        this.f5666a = viewGroup;
        this.f5665a = view;
    }

    /* renamed from: h */
    public void mo7024h(@mr2 Matrix matrix) {
        this.f5664a = matrix;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m7159g(this.f5668b, this);
        this.f5668b.getViewTreeObserver().addOnPreDrawListener(this.f5667a);
        qv4.m26204i(this.f5668b, 4);
        if (this.f5668b.getParent() != null) {
            ((View) this.f5668b.getParent()).invalidate();
        }
    }

    public void onDetachedFromWindow() {
        this.f5668b.getViewTreeObserver().removeOnPreDrawListener(this.f5667a);
        qv4.m26204i(this.f5668b, 0);
        m7159g(this.f5668b, (C1058d) null);
        if (this.f5668b.getParent() != null) {
            ((View) this.f5668b.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        C3874wu.m31103a(canvas, true);
        canvas.setMatrix(this.f5664a);
        qv4.m26204i(this.f5668b, 0);
        this.f5668b.invalidate();
        qv4.m26204i(this.f5668b, 4);
        drawChild(canvas, this.f5668b, getDrawingTime());
        C3874wu.m31103a(canvas, false);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (m7157e(this.f5668b) == this) {
            qv4.m26204i(this.f5668b, i == 0 ? 4 : 0);
        }
    }
}
