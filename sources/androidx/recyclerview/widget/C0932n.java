package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.n */
public class C0932n {

    /* renamed from: g */
    public static final int f5148g = -1;

    /* renamed from: h */
    public static final int f5149h = 1;

    /* renamed from: i */
    public static final int f5150i = Integer.MIN_VALUE;

    /* renamed from: j */
    public static final int f5151j = -1;

    /* renamed from: k */
    public static final int f5152k = 1;

    /* renamed from: a */
    public int f5153a;

    /* renamed from: a */
    public boolean f5154a = true;

    /* renamed from: b */
    public int f5155b;

    /* renamed from: b */
    public boolean f5156b;

    /* renamed from: c */
    public int f5157c;

    /* renamed from: c */
    public boolean f5158c;

    /* renamed from: d */
    public int f5159d;

    /* renamed from: e */
    public int f5160e = 0;

    /* renamed from: f */
    public int f5161f = 0;

    /* renamed from: a */
    public boolean mo6462a(RecyclerView.C0797c0 c0Var) {
        int i = this.f5155b;
        return i >= 0 && i < c0Var.mo5609d();
    }

    /* renamed from: b */
    public View mo6463b(RecyclerView.C0831w wVar) {
        View p = wVar.mo5961p(this.f5155b);
        this.f5155b += this.f5157c;
        return p;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f5153a + ", mCurrentPosition=" + this.f5155b + ", mItemDirection=" + this.f5157c + ", mLayoutDirection=" + this.f5159d + ", mStartLine=" + this.f5160e + ", mEndLine=" + this.f5161f + '}';
    }
}
