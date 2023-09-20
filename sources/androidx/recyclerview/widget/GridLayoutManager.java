package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.C1638a2;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: b */
    public static final String f4356b = "GridLayoutManager";

    /* renamed from: n */
    public static final int f4357n = -1;

    /* renamed from: p */
    public static final boolean f4358p = false;

    /* renamed from: a */
    public final Rect f4359a = new Rect();

    /* renamed from: a */
    public final SparseIntArray f4360a = new SparseIntArray();

    /* renamed from: a */
    public C0784b f4361a = new C0783a();

    /* renamed from: a */
    public View[] f4362a;

    /* renamed from: b */
    public final SparseIntArray f4363b = new SparseIntArray();

    /* renamed from: b */
    public int[] f4364b;

    /* renamed from: m */
    public int f4365m = -1;

    /* renamed from: n */
    public boolean f4366n = false;

    /* renamed from: o */
    public boolean f4367o;

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: c */
        public static final int f4368c = -1;

        /* renamed from: a */
        public int f4369a = -1;

        /* renamed from: b */
        public int f4370b = 0;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: j */
        public int mo5244j() {
            return this.f4369a;
        }

        /* renamed from: k */
        public int mo5245k() {
            return this.f4370b;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0783a extends C0784b {
        /* renamed from: e */
        public int mo5246e(int i, int i2) {
            return i % i2;
        }

        /* renamed from: f */
        public int mo5247f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static abstract class C0784b {

        /* renamed from: a */
        public final SparseIntArray f4371a = new SparseIntArray();

        /* renamed from: a */
        public boolean f4372a = false;

        /* renamed from: b */
        public final SparseIntArray f4373b = new SparseIntArray();

        /* renamed from: b */
        public boolean f4374b = false;

        /* renamed from: a */
        public static int m5140a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* renamed from: b */
        public int mo5248b(int i, int i2) {
            if (!this.f4374b) {
                return mo5250d(i, i2);
            }
            int i3 = this.f4373b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = mo5250d(i, i2);
            this.f4373b.put(i, d);
            return d;
        }

        /* renamed from: c */
        public int mo5249c(int i, int i2) {
            if (!this.f4372a) {
                return mo5246e(i, i2);
            }
            int i3 = this.f4371a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = mo5246e(i, i2);
            this.f4371a.put(i, e);
            return e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo5250d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f4374b
                r1 = 0
                if (r0 == 0) goto L_0x0024
                android.util.SparseIntArray r0 = r6.f4373b
                int r0 = m5140a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0024
                android.util.SparseIntArray r2 = r6.f4373b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.mo5249c(r0, r8)
                int r0 = r6.mo5247f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L_0x0027
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0024:
                r2 = 0
                r3 = 0
            L_0x0026:
                r4 = 0
            L_0x0027:
                int r0 = r6.mo5247f(r7)
            L_0x002b:
                if (r3 >= r7) goto L_0x0040
                int r5 = r6.mo5247f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L_0x0038
                int r2 = r2 + 1
                r4 = 0
                goto L_0x003d
            L_0x0038:
                if (r4 <= r8) goto L_0x003d
                int r2 = r2 + 1
                r4 = r5
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0040:
                int r4 = r4 + r0
                if (r4 <= r8) goto L_0x0045
                int r2 = r2 + 1
            L_0x0045:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C0784b.mo5250d(int, int):int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo5246e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.mo5247f(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.f4372a
                if (r2 == 0) goto L_0x0020
                android.util.SparseIntArray r2 = r5.f4371a
                int r2 = m5140a(r2, r6)
                if (r2 < 0) goto L_0x0020
                android.util.SparseIntArray r3 = r5.f4371a
                int r3 = r3.get(r2)
                int r4 = r5.mo5247f(r2)
                int r3 = r3 + r4
                goto L_0x0030
            L_0x0020:
                r2 = 0
                r3 = 0
            L_0x0022:
                if (r2 >= r6) goto L_0x0033
                int r4 = r5.mo5247f(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x002d
                r3 = 0
                goto L_0x0030
            L_0x002d:
                if (r3 <= r7) goto L_0x0030
                r3 = r4
            L_0x0030:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0033:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x0037
                return r3
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C0784b.mo5246e(int, int):int");
        }

        /* renamed from: f */
        public abstract int mo5247f(int i);

        /* renamed from: g */
        public void mo5251g() {
            this.f4373b.clear();
        }

        /* renamed from: h */
        public void mo5252h() {
            this.f4371a.clear();
        }

        /* renamed from: i */
        public boolean mo5253i() {
            return this.f4374b;
        }

        /* renamed from: j */
        public boolean mo5254j() {
            return this.f4372a;
        }

        /* renamed from: k */
        public void mo5255k(boolean z) {
            if (!z) {
                this.f4373b.clear();
            }
            this.f4374b = z;
        }

        /* renamed from: l */
        public void mo5256l(boolean z) {
            if (!z) {
                this.f4373b.clear();
            }
            this.f4372a = z;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo5210M3(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo5210M3(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo5210M3(RecyclerView.C0819p.m5637t0(context, attributeSet, i, i2).f4679b);
    }

    /* renamed from: w3 */
    public static int[] m5085w3(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: A3 */
    public final void mo5194A3(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, LinearLayoutManager.C0785a aVar, int i) {
        boolean z = i == 1;
        int F3 = mo5200F3(wVar, c0Var, aVar.f4397a);
        if (z) {
            while (F3 > 0) {
                int i2 = aVar.f4397a;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.f4397a = i3;
                    F3 = mo5200F3(wVar, c0Var, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int d = c0Var.mo5609d() - 1;
        int i4 = aVar.f4397a;
        while (i4 < d) {
            int i5 = i4 + 1;
            int F32 = mo5200F3(wVar, c0Var, i5);
            if (F32 <= F3) {
                break;
            }
            i4 = i5;
            F3 = F32;
        }
        aVar.f4397a = i4;
    }

    /* renamed from: B3 */
    public final void mo5195B3() {
        View[] viewArr = this.f4362a;
        if (viewArr == null || viewArr.length != this.f4365m) {
            this.f4362a = new View[this.f4365m];
        }
    }

    /* renamed from: C3 */
    public int mo5196C3(int i, int i2) {
        if (this.f4387f != 1 || !mo5274Q2()) {
            int[] iArr = this.f4364b;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f4364b;
        int i3 = this.f4365m;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: D3 */
    public int mo5197D3() {
        return this.f4365m;
    }

    /* renamed from: E3 */
    public final int mo5198E3(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, int i) {
        if (!c0Var.mo5615j()) {
            return this.f4361a.mo5248b(i, this.f4365m);
        }
        int g = wVar.mo5952g(i);
        if (g != -1) {
            return this.f4361a.mo5248b(g, this.f4365m);
        }
        Log.w(f4356b, "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: F2 */
    public View mo5199F2(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, boolean z, boolean z2) {
        int i;
        int Q = mo5828Q();
        int i2 = -1;
        int i3 = 1;
        if (z2) {
            i = mo5828Q() - 1;
            i3 = -1;
        } else {
            i2 = Q;
            i = 0;
        }
        int d = c0Var.mo5609d();
        mo5315r2();
        int n = this.f4385a.mo6512n();
        int i4 = this.f4385a.mo6507i();
        View view = null;
        View view2 = null;
        while (i != i2) {
            View P = mo5825P(i);
            int s0 = mo5893s0(P);
            if (s0 >= 0 && s0 < d && mo5200F3(wVar, c0Var, s0) == 0) {
                if (((RecyclerView.LayoutParams) P.getLayoutParams()).mo5565g()) {
                    if (view2 == null) {
                        view2 = P;
                    }
                } else if (this.f4385a.mo6505g(P) < i4 && this.f4385a.mo6502d(P) >= n) {
                    return P;
                } else {
                    if (view == null) {
                        view = P;
                    }
                }
            }
            i += i3;
        }
        return view != null ? view : view2;
    }

    /* renamed from: F3 */
    public final int mo5200F3(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, int i) {
        if (!c0Var.mo5615j()) {
            return this.f4361a.mo5249c(i, this.f4365m);
        }
        int i2 = this.f4363b.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int g = wVar.mo5952g(i);
        if (g != -1) {
            return this.f4361a.mo5249c(g, this.f4365m);
        }
        Log.w(f4356b, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: G3 */
    public final int mo5201G3(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, int i) {
        if (!c0Var.mo5615j()) {
            return this.f4361a.mo5247f(i);
        }
        int i2 = this.f4360a.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int g = wVar.mo5952g(i);
        if (g != -1) {
            return this.f4361a.mo5247f(g);
        }
        Log.w(f4356b, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* renamed from: H3 */
    public C0784b mo5202H3() {
        return this.f4361a;
    }

    /* renamed from: I3 */
    public final void mo5203I3(float f, int i) {
        mo5238v3(Math.max(Math.round(f * ((float) this.f4365m)), i));
    }

    /* renamed from: J3 */
    public boolean mo5204J3() {
        return this.f4367o;
    }

    /* renamed from: K */
    public RecyclerView.LayoutParams mo5205K() {
        return this.f4387f == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    /* renamed from: K3 */
    public final void mo5206K3(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f4542a;
        int i4 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i5 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int C3 = mo5196C3(layoutParams.f4369a, layoutParams.f4370b);
        if (this.f4387f == 1) {
            i2 = RecyclerView.C0819p.m5634R(C3, i, i5, layoutParams.width, false);
            i3 = RecyclerView.C0819p.m5634R(this.f4385a.mo6513o(), mo5866f0(), i4, layoutParams.height, true);
        } else {
            int R = RecyclerView.C0819p.m5634R(C3, i, i4, layoutParams.height, false);
            int R2 = RecyclerView.C0819p.m5634R(this.f4385a.mo6513o(), mo5787A0(), i5, layoutParams.width, true);
            i3 = R;
            i2 = R2;
        }
        mo5208L3(view, i2, i3, z);
    }

    /* renamed from: L */
    public RecyclerView.LayoutParams mo5207L(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: L3 */
    public final void mo5208L3(View view, int i, int i2, boolean z) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? mo5864e2(view, i, i2, layoutParams) : mo5857c2(view, i, i2, layoutParams)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: M */
    public RecyclerView.LayoutParams mo5209M(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* renamed from: M3 */
    public void mo5210M3(int i) {
        if (i != this.f4365m) {
            this.f4366n = true;
            if (i >= 1) {
                this.f4365m = i;
                this.f4361a.mo5252h();
                mo5821N1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    /* renamed from: N3 */
    public void mo5211N3(C0784b bVar) {
        this.f4361a = bVar;
    }

    /* renamed from: O3 */
    public void mo5212O3(boolean z) {
        this.f4367o = z;
    }

    /* renamed from: P3 */
    public final void mo5213P3() {
        int i;
        int i2;
        if (mo5270M2() == 1) {
            i2 = mo5904z0() - mo5888p0();
            i = mo5887o0();
        } else {
            i2 = mo5862e0() - mo5884m0();
            i = mo5891r0();
        }
        mo5238v3(i2 - i);
    }

    /* renamed from: Q1 */
    public int mo5214Q1(int i, RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var) {
        mo5213P3();
        mo5195B3();
        return super.mo5214Q1(i, wVar, c0Var);
    }

    /* renamed from: S1 */
    public int mo5215S1(int i, RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var) {
        mo5213P3();
        mo5195B3();
        return super.mo5215S1(i, wVar, c0Var);
    }

    /* renamed from: S2 */
    public void mo5216S2(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, LinearLayoutManager.C0787c cVar, LinearLayoutManager.C0786b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        View e;
        RecyclerView.C0831w wVar2 = wVar;
        RecyclerView.C0797c0 c0Var2 = c0Var;
        LinearLayoutManager.C0787c cVar2 = cVar;
        LinearLayoutManager.C0786b bVar2 = bVar;
        int m = this.f4385a.mo6511m();
        boolean z = false;
        boolean z2 = m != 1073741824;
        int i11 = mo5828Q() > 0 ? this.f4364b[this.f4365m] : 0;
        if (z2) {
            mo5213P3();
        }
        boolean z3 = cVar2.f4420d == 1;
        int i12 = this.f4365m;
        if (!z3) {
            i12 = mo5200F3(wVar2, c0Var2, cVar2.f4418c) + mo5201G3(wVar2, c0Var2, cVar2.f4418c);
        }
        int i13 = 0;
        while (i13 < this.f4365m && cVar2.mo5340c(c0Var2) && i12 > 0) {
            int i14 = cVar2.f4418c;
            int G3 = mo5201G3(wVar2, c0Var2, i14);
            if (G3 <= this.f4365m) {
                i12 -= G3;
                if (i12 < 0 || (e = cVar2.mo5342e(wVar2)) == null) {
                    break;
                }
                this.f4362a[i13] = e;
                i13++;
            } else {
                throw new IllegalArgumentException("Item at position " + i14 + " requires " + G3 + " spans but GridLayoutManager has only " + this.f4365m + " spans.");
            }
        }
        if (i13 == 0) {
            bVar2.f4403a = true;
            return;
        }
        float f = 0.0f;
        mo5233t3(wVar2, c0Var2, i13, z3);
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            View view = this.f4362a[i15];
            if (cVar2.f4414a == null) {
                if (z3) {
                    mo5861e(view);
                } else {
                    mo5865f(view, z);
                }
            } else if (z3) {
                mo5854c(view);
            } else {
                mo5858d(view, z ? 1 : 0);
            }
            mo5883m(view, this.f4359a);
            mo5206K3(view, m, z);
            int e2 = this.f4385a.mo6503e(view);
            if (e2 > i16) {
                i16 = e2;
            }
            float f2 = (((float) this.f4385a.mo6504f(view)) * 1.0f) / ((float) ((LayoutParams) view.getLayoutParams()).f4370b);
            if (f2 > f) {
                f = f2;
            }
            i15++;
            z = false;
        }
        if (z2) {
            mo5203I3(f, i11);
            i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                View view2 = this.f4362a[i17];
                mo5206K3(view2, 1073741824, true);
                int e3 = this.f4385a.mo6503e(view2);
                if (e3 > i16) {
                    i16 = e3;
                }
            }
        }
        for (int i18 = 0; i18 < i13; i18++) {
            View view3 = this.f4362a[i18];
            if (this.f4385a.mo6503e(view3) != i16) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.f4542a;
                int i19 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
                int i20 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
                int C3 = mo5196C3(layoutParams.f4369a, layoutParams.f4370b);
                if (this.f4387f == 1) {
                    i10 = RecyclerView.C0819p.m5634R(C3, 1073741824, i20, layoutParams.width, false);
                    i9 = View.MeasureSpec.makeMeasureSpec(i16 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                    i9 = RecyclerView.C0819p.m5634R(C3, 1073741824, i19, layoutParams.height, false);
                    i10 = makeMeasureSpec;
                }
                mo5208L3(view3, i10, i9, true);
            }
        }
        int i21 = 0;
        bVar2.f4402a = i16;
        if (this.f4387f == 1) {
            if (cVar2.f4421e == -1) {
                i4 = cVar2.f4413a;
                i = i4 - i16;
            } else {
                int i22 = cVar2.f4413a;
                i = i22;
                i4 = i16 + i22;
            }
            i3 = 0;
            i2 = 0;
        } else if (cVar2.f4421e == -1) {
            int i23 = cVar2.f4413a;
            i2 = i23 - i16;
            i = 0;
            i3 = i23;
            i4 = 0;
        } else {
            int i24 = cVar2.f4413a;
            i3 = i16 + i24;
            i2 = i24;
            i4 = 0;
            i = 0;
        }
        while (i21 < i13) {
            View view4 = this.f4362a[i21];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.f4387f == 1) {
                if (mo5274Q2()) {
                    int o0 = mo5887o0() + this.f4364b[this.f4365m - layoutParams2.f4369a];
                    i8 = i4;
                    i7 = o0;
                    i6 = o0 - this.f4385a.mo6504f(view4);
                } else {
                    int o02 = mo5887o0() + this.f4364b[layoutParams2.f4369a];
                    i8 = i4;
                    i6 = o02;
                    i7 = this.f4385a.mo6504f(view4) + o02;
                }
                i5 = i;
            } else {
                int r0 = mo5891r0() + this.f4364b[layoutParams2.f4369a];
                i5 = r0;
                i7 = i3;
                i6 = i2;
                i8 = this.f4385a.mo6504f(view4) + r0;
            }
            mo5826P0(view4, i6, i5, i7, i8);
            if (layoutParams2.mo5565g() || layoutParams2.mo5564f()) {
                bVar2.f4404b = true;
            }
            bVar2.f4405c |= view4.hasFocusable();
            i21++;
            i4 = i8;
            i3 = i7;
            i2 = i6;
            i = i5;
        }
        Arrays.fill(this.f4362a, (Object) null);
    }

    /* renamed from: V */
    public int mo5217V(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var) {
        if (this.f4387f == 1) {
            return this.f4365m;
        }
        if (c0Var.mo5609d() < 1) {
            return 0;
        }
        return mo5198E3(wVar, c0Var, c0Var.mo5609d() - 1) + 1;
    }

    /* renamed from: V2 */
    public void mo5218V2(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, LinearLayoutManager.C0785a aVar, int i) {
        super.mo5218V2(wVar, c0Var, aVar, i);
        mo5213P3();
        if (c0Var.mo5609d() > 0 && !c0Var.mo5615j()) {
            mo5194A3(wVar, c0Var, aVar, i);
        }
        mo5195B3();
    }

    /* renamed from: Y1 */
    public void mo5219Y1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f4364b == null) {
            super.mo5219Y1(rect, i, i2);
        }
        int o0 = mo5887o0() + mo5888p0();
        int r0 = mo5891r0() + mo5884m0();
        if (this.f4387f == 1) {
            i4 = RecyclerView.C0819p.m5636q(i2, rect.height() + r0, mo5880k0());
            int[] iArr = this.f4364b;
            i3 = RecyclerView.C0819p.m5636q(i, iArr[iArr.length - 1] + o0, mo5882l0());
        } else {
            i3 = RecyclerView.C0819p.m5636q(i, rect.width() + o0, mo5882l0());
            int[] iArr2 = this.f4364b;
            i4 = RecyclerView.C0819p.m5636q(i2, iArr2[iArr2.length - 1] + r0, mo5880k0());
        }
        mo5845X1(i3, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo5220a1(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C0831w r26, androidx.recyclerview.widget.RecyclerView.C0797c0 r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.mo5809I(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r5 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r5
            int r6 = r5.f4369a
            int r5 = r5.f4370b
            int r5 = r5 + r6
            android.view.View r7 = super.mo5220a1(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo5310p2(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f4393i
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.mo5828Q()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.mo5828Q()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f4387f
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo5274Q2()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.mo5198E3(r1, r2, r7)
            r10 = r7
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.mo5198E3(r1, r2, r10)
            android.view.View r1 = r0.mo5825P(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r9
            int r2 = r9.f4369a
            r18 = r3
            int r3 = r9.f4370b
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.mo5820N0(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f4369a
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f4369a
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo5220a1(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$c0):android.view.View");
    }

    /* renamed from: g1 */
    public void mo5221g1(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, View view, C1638a2 a2Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.mo5867f1(view, a2Var);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int E3 = mo5198E3(wVar, c0Var, layoutParams2.mo5562d());
        if (this.f4387f == 0) {
            i4 = layoutParams2.mo5244j();
            i3 = layoutParams2.mo5245k();
            i = 1;
            z2 = false;
            z = false;
            i2 = E3;
        } else {
            i3 = 1;
            i2 = layoutParams2.mo5244j();
            i = layoutParams2.mo5245k();
            z2 = false;
            z = false;
            i4 = E3;
        }
        a2Var.mo12555Z0(C1638a2.C1641c.m10709h(i4, i3, i2, i, z2, z));
    }

    /* renamed from: i1 */
    public void mo5222i1(RecyclerView recyclerView, int i, int i2) {
        this.f4361a.mo5252h();
        this.f4361a.mo5251g();
    }

    /* renamed from: j1 */
    public void mo5223j1(RecyclerView recyclerView) {
        this.f4361a.mo5252h();
        this.f4361a.mo5251g();
    }

    /* renamed from: j2 */
    public boolean mo5224j2() {
        return this.f4384a == null && !this.f4366n;
    }

    /* renamed from: j3 */
    public void mo5225j3(boolean z) {
        if (!z) {
            super.mo5225j3(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: k1 */
    public void mo5226k1(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f4361a.mo5252h();
        this.f4361a.mo5251g();
    }

    /* renamed from: l1 */
    public void mo5227l1(RecyclerView recyclerView, int i, int i2) {
        this.f4361a.mo5252h();
        this.f4361a.mo5251g();
    }

    /* renamed from: l2 */
    public void mo5228l2(RecyclerView.C0797c0 c0Var, LinearLayoutManager.C0787c cVar, RecyclerView.C0819p.C0822c cVar2) {
        int i = this.f4365m;
        for (int i2 = 0; i2 < this.f4365m && cVar.mo5340c(c0Var) && i > 0; i2++) {
            int i3 = cVar.f4418c;
            cVar2.mo5911a(i3, Math.max(0, cVar.f4422f));
            i -= this.f4361a.mo5247f(i3);
            cVar.f4418c += cVar.f4420d;
        }
    }

    /* renamed from: n1 */
    public void mo5229n1(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f4361a.mo5252h();
        this.f4361a.mo5251g();
    }

    /* renamed from: o1 */
    public void mo5230o1(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var) {
        if (c0Var.mo5615j()) {
            mo5235u3();
        }
        super.mo5230o1(wVar, c0Var);
        mo5240x3();
    }

    /* renamed from: p */
    public boolean mo5231p(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: p1 */
    public void mo5232p1(RecyclerView.C0797c0 c0Var) {
        super.mo5232p1(c0Var);
        this.f4366n = false;
    }

    /* renamed from: t3 */
    public final void mo5233t3(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.f4362a[i3];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int G3 = mo5201G3(wVar, c0Var, mo5893s0(view));
            layoutParams.f4370b = G3;
            layoutParams.f4369a = i4;
            i4 += G3;
            i3 += i2;
        }
    }

    /* renamed from: u */
    public int mo5234u(RecyclerView.C0797c0 c0Var) {
        return this.f4367o ? mo5242y3(c0Var) : super.mo5234u(c0Var);
    }

    /* renamed from: u3 */
    public final void mo5235u3() {
        int Q = mo5828Q();
        for (int i = 0; i < Q; i++) {
            LayoutParams layoutParams = (LayoutParams) mo5825P(i).getLayoutParams();
            int d = layoutParams.mo5562d();
            this.f4360a.put(d, layoutParams.mo5245k());
            this.f4363b.put(d, layoutParams.mo5244j());
        }
    }

    /* renamed from: v */
    public int mo5236v(RecyclerView.C0797c0 c0Var) {
        return this.f4367o ? mo5243z3(c0Var) : super.mo5236v(c0Var);
    }

    /* renamed from: v0 */
    public int mo5237v0(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var) {
        if (this.f4387f == 0) {
            return this.f4365m;
        }
        if (c0Var.mo5609d() < 1) {
            return 0;
        }
        return mo5198E3(wVar, c0Var, c0Var.mo5609d() - 1) + 1;
    }

    /* renamed from: v3 */
    public final void mo5238v3(int i) {
        this.f4364b = m5085w3(this.f4364b, this.f4365m, i);
    }

    /* renamed from: x */
    public int mo5239x(RecyclerView.C0797c0 c0Var) {
        return this.f4367o ? mo5242y3(c0Var) : super.mo5239x(c0Var);
    }

    /* renamed from: x3 */
    public final void mo5240x3() {
        this.f4360a.clear();
        this.f4363b.clear();
    }

    /* renamed from: y */
    public int mo5241y(RecyclerView.C0797c0 c0Var) {
        return this.f4367o ? mo5243z3(c0Var) : super.mo5241y(c0Var);
    }

    /* renamed from: y3 */
    public final int mo5242y3(RecyclerView.C0797c0 c0Var) {
        if (!(mo5828Q() == 0 || c0Var.mo5609d() == 0)) {
            mo5315r2();
            boolean R2 = mo5276R2();
            View w2 = mo5327w2(!R2, true);
            View v2 = mo5325v2(!R2, true);
            if (!(w2 == null || v2 == null)) {
                int b = this.f4361a.mo5248b(mo5893s0(w2), this.f4365m);
                int b2 = this.f4361a.mo5248b(mo5893s0(v2), this.f4365m);
                int min = Math.min(b, b2);
                int max = this.f4393i ? Math.max(0, ((this.f4361a.mo5248b(c0Var.mo5609d() - 1, this.f4365m) + 1) - Math.max(b, b2)) - 1) : Math.max(0, min);
                if (!R2) {
                    return max;
                }
                return Math.round((((float) max) * (((float) Math.abs(this.f4385a.mo6502d(v2) - this.f4385a.mo6505g(w2))) / ((float) ((this.f4361a.mo5248b(mo5893s0(v2), this.f4365m) - this.f4361a.mo5248b(mo5893s0(w2), this.f4365m)) + 1)))) + ((float) (this.f4385a.mo6512n() - this.f4385a.mo6505g(w2))));
            }
        }
        return 0;
    }

    /* renamed from: z3 */
    public final int mo5243z3(RecyclerView.C0797c0 c0Var) {
        if (!(mo5828Q() == 0 || c0Var.mo5609d() == 0)) {
            mo5315r2();
            View w2 = mo5327w2(!mo5276R2(), true);
            View v2 = mo5325v2(!mo5276R2(), true);
            if (!(w2 == null || v2 == null)) {
                if (!mo5276R2()) {
                    return this.f4361a.mo5248b(c0Var.mo5609d() - 1, this.f4365m) + 1;
                }
                int d = this.f4385a.mo6502d(v2) - this.f4385a.mo6505g(w2);
                int b = this.f4361a.mo5248b(mo5893s0(w2), this.f4365m);
                return (int) ((((float) d) / ((float) ((this.f4361a.mo5248b(mo5893s0(v2), this.f4365m) - b) + 1))) * ((float) (this.f4361a.mo5248b(c0Var.mo5609d() - 1, this.f4365m) + 1)));
            }
        }
        return 0;
    }
}
