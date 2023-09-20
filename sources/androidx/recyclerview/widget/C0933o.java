package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.o */
public class C0933o extends RecyclerView.C0793b0 {

    /* renamed from: b */
    public static final float f5162b = 25.0f;

    /* renamed from: c */
    public static final float f5163c = 1.2f;

    /* renamed from: d */
    public static final int f5164d = 10000;

    /* renamed from: e */
    public static final int f5165e = -1;

    /* renamed from: e */
    public static final boolean f5166e = false;

    /* renamed from: f */
    public static final int f5167f = 1;

    /* renamed from: g */
    public static final int f5168g = 0;

    /* renamed from: a */
    public float f5169a;

    /* renamed from: a */
    public PointF f5170a;

    /* renamed from: a */
    public final DisplayMetrics f5171a;

    /* renamed from: a */
    public final DecelerateInterpolator f5172a = new DecelerateInterpolator();

    /* renamed from: a */
    public final LinearInterpolator f5173a = new LinearInterpolator();

    /* renamed from: b */
    public int f5174b = 0;

    /* renamed from: c */
    public int f5175c = 0;

    /* renamed from: d */
    public boolean f5176d = false;

    public C0933o(Context context) {
        this.f5171a = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    public int mo6465A() {
        PointF pointF = this.f5170a;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* renamed from: B */
    public final float mo6466B() {
        if (!this.f5176d) {
            this.f5169a = mo6472w(this.f5171a);
            this.f5176d = true;
        }
        return this.f5169a;
    }

    /* renamed from: C */
    public int mo6467C() {
        PointF pointF = this.f5170a;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* renamed from: D */
    public void mo6468D(RecyclerView.C0793b0.C0794a aVar) {
        PointF a = mo5573a(mo5578f());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.mo5597f(mo5578f());
            mo5591s();
            return;
        }
        mo5582j(a);
        this.f5170a = a;
        this.f5174b = (int) (a.x * 10000.0f);
        this.f5175c = (int) (a.y * 10000.0f);
        aVar.mo5603l((int) (((float) this.f5174b) * 1.2f), (int) (((float) this.f5175c) * 1.2f), (int) (((float) mo6474y(10000)) * 1.2f), this.f5173a);
    }

    /* renamed from: m */
    public void mo5585m(int i, int i2, RecyclerView.C0797c0 c0Var, RecyclerView.C0793b0.C0794a aVar) {
        if (mo5575c() == 0) {
            mo5591s();
            return;
        }
        this.f5174b = mo6475z(this.f5174b, i);
        int z = mo6475z(this.f5175c, i2);
        this.f5175c = z;
        if (this.f5174b == 0 && z == 0) {
            mo6468D(aVar);
        }
    }

    /* renamed from: n */
    public void mo5586n() {
    }

    /* renamed from: o */
    public void mo5587o() {
        this.f5175c = 0;
        this.f5174b = 0;
        this.f5170a = null;
    }

    /* renamed from: p */
    public void mo5588p(View view, RecyclerView.C0797c0 c0Var, RecyclerView.C0793b0.C0794a aVar) {
        int u = mo6470u(view, mo6465A());
        int v = mo6471v(view, mo6467C());
        int x = mo6473x((int) Math.sqrt((double) ((u * u) + (v * v))));
        if (x > 0) {
            aVar.mo5603l(-u, -v, x, this.f5172a);
        }
    }

    /* renamed from: t */
    public int mo6469t(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: u */
    public int mo6470u(View view, int i) {
        RecyclerView.C0819p e = mo5577e();
        if (e == null || !e.mo5304n()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return mo6469t(e.mo5846Y(view) - layoutParams.leftMargin, e.mo5852b0(view) + layoutParams.rightMargin, e.mo5887o0(), e.mo5904z0() - e.mo5888p0(), i);
    }

    /* renamed from: v */
    public int mo6471v(View view, int i) {
        RecyclerView.C0819p e = mo5577e();
        if (e == null || !e.mo5307o()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return mo6469t(e.mo5855c0(view) - layoutParams.topMargin, e.mo5840W(view) + layoutParams.bottomMargin, e.mo5891r0(), e.mo5862e0() - e.mo5884m0(), i);
    }

    /* renamed from: w */
    public float mo6472w(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: x */
    public int mo6473x(int i) {
        return (int) Math.ceil(((double) mo6474y(i)) / 0.3356d);
    }

    /* renamed from: y */
    public int mo6474y(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * mo6466B()));
    }

    /* renamed from: z */
    public final int mo6475z(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }
}
