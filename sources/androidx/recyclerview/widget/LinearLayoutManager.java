package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.C0657l;
import androidx.recyclerview.widget.C0918m;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.C0819p implements C0918m.C0931j, RecyclerView.C0793b0.C0795b {

    /* renamed from: a */
    public static final float f4375a = 0.33333334f;

    /* renamed from: a */
    public static final String f4376a = "LinearLayoutManager";

    /* renamed from: j */
    public static final int f4377j = 0;

    /* renamed from: k */
    public static final int f4378k = 1;

    /* renamed from: l */
    public static final int f4379l = Integer.MIN_VALUE;

    /* renamed from: m */
    public static final boolean f4380m = false;

    /* renamed from: a */
    public final C0785a f4381a;

    /* renamed from: a */
    public final C0786b f4382a;

    /* renamed from: a */
    public C0787c f4383a;

    /* renamed from: a */
    public C0788d f4384a;

    /* renamed from: a */
    public C0942t f4385a;

    /* renamed from: a */
    public int[] f4386a;

    /* renamed from: f */
    public int f4387f;

    /* renamed from: g */
    public int f4388g;

    /* renamed from: g */
    public boolean f4389g;

    /* renamed from: h */
    public int f4390h;

    /* renamed from: h */
    public boolean f4391h;

    /* renamed from: i */
    public int f4392i;

    /* renamed from: i */
    public boolean f4393i;

    /* renamed from: j */
    public boolean f4394j;

    /* renamed from: k */
    public boolean f4395k;

    /* renamed from: l */
    public boolean f4396l;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C0785a {

        /* renamed from: a */
        public int f4397a;

        /* renamed from: a */
        public C0942t f4398a;

        /* renamed from: a */
        public boolean f4399a;

        /* renamed from: b */
        public int f4400b;

        /* renamed from: b */
        public boolean f4401b;

        public C0785a() {
            mo5335e();
        }

        /* renamed from: a */
        public void mo5331a() {
            this.f4400b = this.f4399a ? this.f4398a.mo6507i() : this.f4398a.mo6512n();
        }

        /* renamed from: b */
        public void mo5332b(View view, int i) {
            this.f4400b = this.f4399a ? this.f4398a.mo6502d(view) + this.f4398a.mo6514p() : this.f4398a.mo6505g(view);
            this.f4397a = i;
        }

        /* renamed from: c */
        public void mo5333c(View view, int i) {
            int p = this.f4398a.mo6514p();
            if (p >= 0) {
                mo5332b(view, i);
                return;
            }
            this.f4397a = i;
            if (this.f4399a) {
                int i2 = (this.f4398a.mo6507i() - p) - this.f4398a.mo6502d(view);
                this.f4400b = this.f4398a.mo6507i() - i2;
                if (i2 > 0) {
                    int e = this.f4400b - this.f4398a.mo6503e(view);
                    int n = this.f4398a.mo6512n();
                    int min = e - (n + Math.min(this.f4398a.mo6505g(view) - n, 0));
                    if (min < 0) {
                        this.f4400b += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.f4398a.mo6505g(view);
            int n2 = g - this.f4398a.mo6512n();
            this.f4400b = g;
            if (n2 > 0) {
                int i3 = (this.f4398a.mo6507i() - Math.min(0, (this.f4398a.mo6507i() - p) - this.f4398a.mo6502d(view))) - (g + this.f4398a.mo6503e(view));
                if (i3 < 0) {
                    this.f4400b -= Math.min(n2, -i3);
                }
            }
        }

        /* renamed from: d */
        public boolean mo5334d(View view, RecyclerView.C0797c0 c0Var) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return !layoutParams.mo5565g() && layoutParams.mo5562d() >= 0 && layoutParams.mo5562d() < c0Var.mo5609d();
        }

        /* renamed from: e */
        public void mo5335e() {
            this.f4397a = -1;
            this.f4400b = Integer.MIN_VALUE;
            this.f4399a = false;
            this.f4401b = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f4397a + ", mCoordinate=" + this.f4400b + ", mLayoutFromEnd=" + this.f4399a + ", mValid=" + this.f4401b + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C0786b {

        /* renamed from: a */
        public int f4402a;

        /* renamed from: a */
        public boolean f4403a;

        /* renamed from: b */
        public boolean f4404b;

        /* renamed from: c */
        public boolean f4405c;

        /* renamed from: a */
        public void mo5337a() {
            this.f4402a = 0;
            this.f4403a = false;
            this.f4404b = false;
            this.f4405c = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C0787c {

        /* renamed from: a */
        public static final String f4406a = "LLM#LayoutState";

        /* renamed from: j */
        public static final int f4407j = -1;

        /* renamed from: k */
        public static final int f4408k = 1;

        /* renamed from: l */
        public static final int f4409l = Integer.MIN_VALUE;

        /* renamed from: m */
        public static final int f4410m = -1;

        /* renamed from: n */
        public static final int f4411n = 1;

        /* renamed from: o */
        public static final int f4412o = Integer.MIN_VALUE;

        /* renamed from: a */
        public int f4413a;

        /* renamed from: a */
        public List<RecyclerView.C0803f0> f4414a = null;

        /* renamed from: a */
        public boolean f4415a = true;

        /* renamed from: b */
        public int f4416b;

        /* renamed from: b */
        public boolean f4417b = false;

        /* renamed from: c */
        public int f4418c;

        /* renamed from: c */
        public boolean f4419c;

        /* renamed from: d */
        public int f4420d;

        /* renamed from: e */
        public int f4421e;

        /* renamed from: f */
        public int f4422f;

        /* renamed from: g */
        public int f4423g = 0;

        /* renamed from: h */
        public int f4424h = 0;

        /* renamed from: i */
        public int f4425i;

        /* renamed from: a */
        public void mo5338a() {
            mo5339b((View) null);
        }

        /* renamed from: b */
        public void mo5339b(View view) {
            View g = mo5344g(view);
            this.f4418c = g == null ? -1 : ((RecyclerView.LayoutParams) g.getLayoutParams()).mo5562d();
        }

        /* renamed from: c */
        public boolean mo5340c(RecyclerView.C0797c0 c0Var) {
            int i = this.f4418c;
            return i >= 0 && i < c0Var.mo5609d();
        }

        /* renamed from: d */
        public void mo5341d() {
            Log.d(f4406a, "avail:" + this.f4416b + ", ind:" + this.f4418c + ", dir:" + this.f4420d + ", offset:" + this.f4413a + ", layoutDir:" + this.f4421e);
        }

        /* renamed from: e */
        public View mo5342e(RecyclerView.C0831w wVar) {
            if (this.f4414a != null) {
                return mo5343f();
            }
            View p = wVar.mo5961p(this.f4418c);
            this.f4418c += this.f4420d;
            return p;
        }

        /* renamed from: f */
        public final View mo5343f() {
            int size = this.f4414a.size();
            for (int i = 0; i < size; i++) {
                View view = this.f4414a.get(i).f4609a;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.mo5565g() && this.f4418c == layoutParams.mo5562d()) {
                    mo5339b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: g */
        public View mo5344g(View view) {
            int d;
            int size = this.f4414a.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f4414a.get(i2).f4609a;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.mo5565g() && (d = (layoutParams.mo5562d() - this.f4418c) * this.f4420d) >= 0 && d < i) {
                    view2 = view3;
                    if (d == 0) {
                        break;
                    }
                    i = d;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C0788d implements Parcelable {
        public static final Parcelable.Creator<C0788d> CREATOR = new C0789a();

        /* renamed from: b */
        public boolean f4426b;

        /* renamed from: n */
        public int f4427n;

        /* renamed from: o */
        public int f4428o;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        public class C0789a implements Parcelable.Creator<C0788d> {
            /* renamed from: a */
            public C0788d createFromParcel(Parcel parcel) {
                return new C0788d(parcel);
            }

            /* renamed from: b */
            public C0788d[] newArray(int i) {
                return new C0788d[i];
            }
        }

        public C0788d() {
        }

        public C0788d(Parcel parcel) {
            this.f4427n = parcel.readInt();
            this.f4428o = parcel.readInt();
            this.f4426b = parcel.readInt() != 1 ? false : true;
        }

        public C0788d(C0788d dVar) {
            this.f4427n = dVar.f4427n;
            this.f4428o = dVar.f4428o;
            this.f4426b = dVar.f4426b;
        }

        /* renamed from: a */
        public boolean mo5345a() {
            return this.f4427n >= 0;
        }

        /* renamed from: b */
        public void mo5346b() {
            this.f4427n = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4427n);
            parcel.writeInt(this.f4428o);
            parcel.writeInt(this.f4426b ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f4387f = 1;
        this.f4391h = false;
        this.f4393i = false;
        this.f4394j = false;
        this.f4395k = true;
        this.f4388g = -1;
        this.f4390h = Integer.MIN_VALUE;
        this.f4384a = null;
        this.f4381a = new C0785a();
        this.f4382a = new C0786b();
        this.f4392i = 2;
        this.f4386a = new int[2];
        mo5294f3(i);
        mo5296h3(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f4387f = 1;
        this.f4391h = false;
        this.f4393i = false;
        this.f4394j = false;
        this.f4395k = true;
        this.f4388g = -1;
        this.f4390h = Integer.MIN_VALUE;
        this.f4384a = null;
        this.f4381a = new C0785a();
        this.f4382a = new C0786b();
        this.f4392i = 2;
        this.f4386a = new int[2];
        RecyclerView.C0819p.C0823d t0 = RecyclerView.C0819p.m5637t0(context, attributeSet, i, i2);
        mo5294f3(t0.f4677a);
        mo5296h3(t0.f4678a);
        mo5225j3(t0.f4680b);
    }

    /* renamed from: A2 */
    public int mo5257A2() {
        View C2 = mo5259C2(mo5828Q() - 1, -1, false, true);
        if (C2 == null) {
            return -1;
        }
        return mo5893s0(C2);
    }

    /* renamed from: B2 */
    public View mo5258B2(int i, int i2) {
        int i3;
        int i4;
        mo5315r2();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo5825P(i);
        }
        if (this.f4385a.mo6505g(mo5825P(i)) < this.f4385a.mo6512n()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = C0657l.f3918w;
        }
        return (this.f4387f == 0 ? this.f4661a : this.f4666b).mo6160a(i, i2, i4, i3);
    }

    /* renamed from: C2 */
    public View mo5259C2(int i, int i2, boolean z, boolean z2) {
        mo5315r2();
        int i3 = MediaSessionCompat.f270g;
        int i4 = z ? 24579 : MediaSessionCompat.f270g;
        if (!z2) {
            i3 = 0;
        }
        return (this.f4387f == 0 ? this.f4661a : this.f4666b).mo6160a(i, i2, i4, i3);
    }

    /* renamed from: D2 */
    public final View mo5260D2() {
        return this.f4393i ? mo5324u2() : mo5330z2();
    }

    /* renamed from: E2 */
    public final View mo5261E2() {
        return this.f4393i ? mo5330z2() : mo5324u2();
    }

    /* renamed from: F0 */
    public boolean mo5262F0() {
        return true;
    }

    /* renamed from: F2 */
    public View mo5199F2(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, boolean z, boolean z2) {
        int i;
        int i2;
        mo5315r2();
        int Q = mo5828Q();
        int i3 = -1;
        if (z2) {
            i2 = mo5828Q() - 1;
            i = -1;
        } else {
            i3 = Q;
            i2 = 0;
            i = 1;
        }
        int d = c0Var.mo5609d();
        int n = this.f4385a.mo6512n();
        int i4 = this.f4385a.mo6507i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i3) {
            View P = mo5825P(i2);
            int s0 = mo5893s0(P);
            int g = this.f4385a.mo6505g(P);
            int d2 = this.f4385a.mo6502d(P);
            if (s0 >= 0 && s0 < d) {
                if (!((RecyclerView.LayoutParams) P.getLayoutParams()).mo5565g()) {
                    boolean z3 = d2 <= n && g < n;
                    boolean z4 = g >= i4 && d2 > i4;
                    if (!z3 && !z4) {
                        return P;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = P;
                        }
                    } else if (!z3) {
                        if (view != null) {
                        }
                        view = P;
                    }
                    view2 = P;
                } else if (view3 == null) {
                    view3 = P;
                }
            }
            i2 += i;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    /* renamed from: G2 */
    public final int mo5263G2(int i, RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, boolean z) {
        int i2;
        int i3 = this.f4385a.mo6507i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -mo5289c3(-i3, wVar, c0Var);
        int i5 = i + i4;
        if (!z || (i2 = this.f4385a.mo6507i() - i5) <= 0) {
            return i4;
        }
        this.f4385a.mo6518t(i2);
        return i2 + i4;
    }

    /* renamed from: H2 */
    public final int mo5264H2(int i, RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, boolean z) {
        int n;
        int n2 = i - this.f4385a.mo6512n();
        if (n2 <= 0) {
            return 0;
        }
        int i2 = -mo5289c3(n2, wVar, c0Var);
        int i3 = i + i2;
        if (!z || (n = i3 - this.f4385a.mo6512n()) <= 0) {
            return i2;
        }
        this.f4385a.mo6518t(-n);
        return i2 - n;
    }

    /* renamed from: I2 */
    public final View mo5265I2() {
        return mo5825P(this.f4393i ? 0 : mo5828Q() - 1);
    }

    /* renamed from: J */
    public View mo5266J(int i) {
        int Q = mo5828Q();
        if (Q == 0) {
            return null;
        }
        int s0 = i - mo5893s0(mo5825P(0));
        if (s0 >= 0 && s0 < Q) {
            View P = mo5825P(s0);
            if (mo5893s0(P) == i) {
                return P;
            }
        }
        return super.mo5266J(i);
    }

    /* renamed from: J2 */
    public final View mo5267J2() {
        return mo5825P(this.f4393i ? mo5828Q() - 1 : 0);
    }

    /* renamed from: K */
    public RecyclerView.LayoutParams mo5205K() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Deprecated
    /* renamed from: K2 */
    public int mo5268K2(RecyclerView.C0797c0 c0Var) {
        if (c0Var.mo5613h()) {
            return this.f4385a.mo6513o();
        }
        return 0;
    }

    /* renamed from: L2 */
    public int mo5269L2() {
        return this.f4392i;
    }

    /* renamed from: M2 */
    public int mo5270M2() {
        return this.f4387f;
    }

    /* renamed from: N2 */
    public boolean mo5271N2() {
        return this.f4396l;
    }

    /* renamed from: O2 */
    public boolean mo5272O2() {
        return this.f4391h;
    }

    /* renamed from: P2 */
    public boolean mo5273P2() {
        return this.f4394j;
    }

    /* renamed from: Q1 */
    public int mo5214Q1(int i, RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var) {
        if (this.f4387f == 1) {
            return 0;
        }
        return mo5289c3(i, wVar, c0Var);
    }

    /* renamed from: Q2 */
    public boolean mo5274Q2() {
        return mo5875i0() == 1;
    }

    /* renamed from: R1 */
    public void mo5275R1(int i) {
        this.f4388g = i;
        this.f4390h = Integer.MIN_VALUE;
        C0788d dVar = this.f4384a;
        if (dVar != null) {
            dVar.mo5346b();
        }
        mo5821N1();
    }

    /* renamed from: R2 */
    public boolean mo5276R2() {
        return this.f4395k;
    }

    /* renamed from: S1 */
    public int mo5215S1(int i, RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var) {
        if (this.f4387f == 0) {
            return 0;
        }
        return mo5289c3(i, wVar, c0Var);
    }

    /* renamed from: S2 */
    public void mo5216S2(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, C0787c cVar, C0786b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View e = cVar.mo5342e(wVar);
        if (e == null) {
            bVar.f4403a = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) e.getLayoutParams();
        if (cVar.f4414a == null) {
            if (this.f4393i == (cVar.f4421e == -1)) {
                mo5861e(e);
            } else {
                mo5865f(e, 0);
            }
        } else {
            if (this.f4393i == (cVar.f4421e == -1)) {
                mo5854c(e);
            } else {
                mo5858d(e, 0);
            }
        }
        mo5830R0(e, 0, 0);
        bVar.f4402a = this.f4385a.mo6503e(e);
        if (this.f4387f == 1) {
            if (mo5274Q2()) {
                i5 = mo5904z0() - mo5888p0();
                i4 = i5 - this.f4385a.mo6504f(e);
            } else {
                i4 = mo5887o0();
                i5 = this.f4385a.mo6504f(e) + i4;
            }
            int i6 = cVar.f4421e;
            int i7 = cVar.f4413a;
            if (i6 == -1) {
                i = i7;
                i2 = i5;
                i3 = i7 - bVar.f4402a;
            } else {
                i3 = i7;
                i2 = i5;
                i = bVar.f4402a + i7;
            }
        } else {
            int r0 = mo5891r0();
            int f = this.f4385a.mo6504f(e) + r0;
            int i8 = cVar.f4421e;
            int i9 = cVar.f4413a;
            if (i8 == -1) {
                i2 = i9;
                i3 = r0;
                i = f;
                i4 = i9 - bVar.f4402a;
            } else {
                i3 = r0;
                i2 = bVar.f4402a + i9;
                i = f;
                i4 = i9;
            }
        }
        mo5826P0(e, i4, i3, i2, i);
        if (layoutParams.mo5565g() || layoutParams.mo5564f()) {
            bVar.f4404b = true;
        }
        bVar.f4405c = e.hasFocusable();
    }

    /* renamed from: T2 */
    public final void mo5277T2(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, int i, int i2) {
        RecyclerView.C0831w wVar2 = wVar;
        RecyclerView.C0797c0 c0Var2 = c0Var;
        if (c0Var.mo5619n() && mo5828Q() != 0 && !c0Var.mo5615j() && mo5224j2()) {
            List<RecyclerView.C0803f0> l = wVar.mo5957l();
            int size = l.size();
            int s0 = mo5893s0(mo5825P(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.C0803f0 f0Var = l.get(i5);
                if (!f0Var.mo5697z()) {
                    char c = 1;
                    if ((f0Var.mo5686p() < s0) != this.f4393i) {
                        c = 65535;
                    }
                    int e = this.f4385a.mo6503e(f0Var.f4609a);
                    if (c == 65535) {
                        i3 += e;
                    } else {
                        i4 += e;
                    }
                }
            }
            this.f4383a.f4414a = l;
            if (i3 > 0) {
                mo5313q3(mo5893s0(mo5267J2()), i);
                C0787c cVar = this.f4383a;
                cVar.f4423g = i3;
                cVar.f4416b = 0;
                cVar.mo5338a();
                mo5318s2(wVar2, this.f4383a, c0Var2, false);
            }
            if (i4 > 0) {
                mo5309o3(mo5893s0(mo5265I2()), i2);
                C0787c cVar2 = this.f4383a;
                cVar2.f4423g = i4;
                cVar2.f4416b = 0;
                cVar2.mo5338a();
                mo5318s2(wVar2, this.f4383a, c0Var2, false);
            }
            this.f4383a.f4414a = null;
        }
    }

    /* renamed from: U2 */
    public final void mo5278U2() {
        Log.d(f4376a, "internal representation of views on the screen");
        for (int i = 0; i < mo5828Q(); i++) {
            View P = mo5825P(i);
            Log.d(f4376a, "item " + mo5893s0(P) + ", coord:" + this.f4385a.mo6505g(P));
        }
        Log.d(f4376a, "==============");
    }

    /* renamed from: V2 */
    public void mo5218V2(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, C0785a aVar, int i) {
    }

    /* renamed from: W2 */
    public final void mo5279W2(RecyclerView.C0831w wVar, C0787c cVar) {
        if (cVar.f4415a && !cVar.f4419c) {
            int i = cVar.f4422f;
            int i2 = cVar.f4424h;
            if (cVar.f4421e == -1) {
                mo5281Y2(wVar, i, i2);
            } else {
                mo5283Z2(wVar, i, i2);
            }
        }
    }

    /* renamed from: X2 */
    public final void mo5280X2(RecyclerView.C0831w wVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo5805G1(i3, wVar);
                }
                return;
            }
            while (i > i2) {
                mo5805G1(i, wVar);
                i--;
            }
        }
    }

    /* renamed from: Y2 */
    public final void mo5281Y2(RecyclerView.C0831w wVar, int i, int i2) {
        int Q = mo5828Q();
        if (i >= 0) {
            int h = (this.f4385a.mo6506h() - i) + i2;
            if (this.f4393i) {
                for (int i3 = 0; i3 < Q; i3++) {
                    View P = mo5825P(i3);
                    if (this.f4385a.mo6505g(P) < h || this.f4385a.mo6516r(P) < h) {
                        mo5280X2(wVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = Q - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View P2 = mo5825P(i5);
                if (this.f4385a.mo6505g(P2) < h || this.f4385a.mo6516r(P2) < h) {
                    mo5280X2(wVar, i4, i5);
                    return;
                }
            }
        }
    }

    /* renamed from: Z0 */
    public void mo5282Z0(RecyclerView recyclerView, RecyclerView.C0831w wVar) {
        super.mo5282Z0(recyclerView, wVar);
        if (this.f4396l) {
            mo5797D1(wVar);
            wVar.mo5949d();
        }
    }

    /* renamed from: Z2 */
    public final void mo5283Z2(RecyclerView.C0831w wVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int Q = mo5828Q();
            if (this.f4393i) {
                int i4 = Q - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View P = mo5825P(i5);
                    if (this.f4385a.mo6502d(P) > i3 || this.f4385a.mo6515q(P) > i3) {
                        mo5280X2(wVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < Q; i6++) {
                View P2 = mo5825P(i6);
                if (this.f4385a.mo6502d(P2) > i3 || this.f4385a.mo6515q(P2) > i3) {
                    mo5280X2(wVar, 0, i6);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public PointF mo5284a(int i) {
        if (mo5828Q() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo5893s0(mo5825P(0))) {
            z = true;
        }
        if (z != this.f4393i) {
            i2 = -1;
        }
        return this.f4387f == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    /* renamed from: a1 */
    public View mo5220a1(View view, int i, RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var) {
        int p2;
        mo5288b3();
        if (mo5828Q() == 0 || (p2 = mo5310p2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo5315r2();
        mo5306n3(p2, (int) (((float) this.f4385a.mo6513o()) * 0.33333334f), false, c0Var);
        C0787c cVar = this.f4383a;
        cVar.f4422f = Integer.MIN_VALUE;
        cVar.f4415a = false;
        mo5318s2(wVar, cVar, c0Var, true);
        View E2 = p2 == -1 ? mo5261E2() : mo5260D2();
        View J2 = p2 == -1 ? mo5267J2() : mo5265I2();
        if (!J2.hasFocusable()) {
            return E2;
        }
        if (E2 == null) {
            return null;
        }
        return J2;
    }

    /* renamed from: a3 */
    public boolean mo5285a3() {
        return this.f4385a.mo6510l() == 0 && this.f4385a.mo6506h() == 0;
    }

    /* renamed from: b */
    public void mo5286b(@mr2 View view, @mr2 View view2, int i, int i2) {
        int i3;
        mo5297i("Cannot drop a view during a scroll or layout calculation");
        mo5315r2();
        mo5288b3();
        int s0 = mo5893s0(view);
        int s02 = mo5893s0(view2);
        char c = s0 < s02 ? (char) 1 : 65535;
        if (this.f4393i) {
            if (c == 1) {
                mo5291d3(s02, this.f4385a.mo6507i() - (this.f4385a.mo6505g(view2) + this.f4385a.mo6503e(view)));
                return;
            }
            i3 = this.f4385a.mo6507i() - this.f4385a.mo6502d(view2);
        } else if (c == 65535) {
            i3 = this.f4385a.mo6505g(view2);
        } else {
            mo5291d3(s02, this.f4385a.mo6502d(view2) - this.f4385a.mo6503e(view));
            return;
        }
        mo5291d3(s02, i3);
    }

    /* renamed from: b1 */
    public void mo5287b1(AccessibilityEvent accessibilityEvent) {
        super.mo5287b1(accessibilityEvent);
        if (mo5828Q() > 0) {
            accessibilityEvent.setFromIndex(mo5328x2());
            accessibilityEvent.setToIndex(mo5257A2());
        }
    }

    /* renamed from: b3 */
    public final void mo5288b3() {
        this.f4393i = (this.f4387f == 1 || !mo5274Q2()) ? this.f4391h : !this.f4391h;
    }

    /* renamed from: c3 */
    public int mo5289c3(int i, RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var) {
        if (mo5828Q() == 0 || i == 0) {
            return 0;
        }
        mo5315r2();
        this.f4383a.f4415a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        mo5306n3(i2, abs, true, c0Var);
        C0787c cVar = this.f4383a;
        int s2 = cVar.f4422f + mo5318s2(wVar, cVar, c0Var, false);
        if (s2 < 0) {
            return 0;
        }
        if (abs > s2) {
            i = i2 * s2;
        }
        this.f4385a.mo6518t(-i);
        this.f4383a.f4425i = i;
        return i;
    }

    /* renamed from: d2 */
    public boolean mo5290d2() {
        return (mo5866f0() == 1073741824 || mo5787A0() == 1073741824 || !mo5790B0()) ? false : true;
    }

    /* renamed from: d3 */
    public void mo5291d3(int i, int i2) {
        this.f4388g = i;
        this.f4390h = i2;
        C0788d dVar = this.f4384a;
        if (dVar != null) {
            dVar.mo5346b();
        }
        mo5821N1();
    }

    /* renamed from: e3 */
    public void mo5292e3(int i) {
        this.f4392i = i;
    }

    /* renamed from: f2 */
    public void mo5293f2(RecyclerView recyclerView, RecyclerView.C0797c0 c0Var, int i) {
        C0933o oVar = new C0933o(recyclerView.getContext());
        oVar.mo5589q(i);
        mo5870g2(oVar);
    }

    /* renamed from: f3 */
    public void mo5294f3(int i) {
        if (i == 0 || i == 1) {
            mo5297i((String) null);
            if (i != this.f4387f || this.f4385a == null) {
                C0942t b = C0942t.m6518b(this, i);
                this.f4385a = b;
                this.f4381a.f4398a = b;
                this.f4387f = i;
                mo5821N1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: g3 */
    public void mo5295g3(boolean z) {
        this.f4396l = z;
    }

    /* renamed from: h3 */
    public void mo5296h3(boolean z) {
        mo5297i((String) null);
        if (z != this.f4391h) {
            this.f4391h = z;
            mo5821N1();
        }
    }

    /* renamed from: i */
    public void mo5297i(String str) {
        if (this.f4384a == null) {
            super.mo5297i(str);
        }
    }

    /* renamed from: i3 */
    public void mo5298i3(boolean z) {
        this.f4395k = z;
    }

    /* renamed from: j2 */
    public boolean mo5224j2() {
        return this.f4384a == null && this.f4389g == this.f4394j;
    }

    /* renamed from: j3 */
    public void mo5225j3(boolean z) {
        mo5297i((String) null);
        if (this.f4394j != z) {
            this.f4394j = z;
            mo5821N1();
        }
    }

    /* renamed from: k2 */
    public void mo5299k2(@mr2 RecyclerView.C0797c0 c0Var, @mr2 int[] iArr) {
        int i;
        int K2 = mo5268K2(c0Var);
        if (this.f4383a.f4421e == -1) {
            i = 0;
        } else {
            i = K2;
            K2 = 0;
        }
        iArr[0] = K2;
        iArr[1] = i;
    }

    /* renamed from: k3 */
    public final boolean mo5300k3(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, C0785a aVar) {
        View F2;
        boolean z = false;
        if (mo5828Q() == 0) {
            return false;
        }
        View d0 = mo5859d0();
        if (d0 == null || !aVar.mo5334d(d0, c0Var)) {
            boolean z2 = this.f4389g;
            boolean z3 = this.f4394j;
            if (z2 != z3 || (F2 = mo5199F2(wVar, c0Var, aVar.f4399a, z3)) == null) {
                return false;
            }
            aVar.mo5332b(F2, mo5893s0(F2));
            if (!c0Var.mo5615j() && mo5224j2()) {
                int g = this.f4385a.mo6505g(F2);
                int d = this.f4385a.mo6502d(F2);
                int n = this.f4385a.mo6512n();
                int i = this.f4385a.mo6507i();
                boolean z4 = d <= n && g < n;
                if (g >= i && d > i) {
                    z = true;
                }
                if (z4 || z) {
                    if (aVar.f4399a) {
                        n = i;
                    }
                    aVar.f4400b = n;
                }
            }
            return true;
        }
        aVar.mo5333c(d0, mo5893s0(d0));
        return true;
    }

    /* renamed from: l2 */
    public void mo5228l2(RecyclerView.C0797c0 c0Var, C0787c cVar, RecyclerView.C0819p.C0822c cVar2) {
        int i = cVar.f4418c;
        if (i >= 0 && i < c0Var.mo5609d()) {
            cVar2.mo5911a(i, Math.max(0, cVar.f4422f));
        }
    }

    /* renamed from: l3 */
    public final boolean mo5301l3(RecyclerView.C0797c0 c0Var, C0785a aVar) {
        int i;
        boolean z = false;
        if (!c0Var.mo5615j() && (i = this.f4388g) != -1) {
            if (i < 0 || i >= c0Var.mo5609d()) {
                this.f4388g = -1;
                this.f4390h = Integer.MIN_VALUE;
            } else {
                aVar.f4397a = this.f4388g;
                C0788d dVar = this.f4384a;
                if (dVar != null && dVar.mo5345a()) {
                    boolean z2 = this.f4384a.f4426b;
                    aVar.f4399a = z2;
                    aVar.f4400b = z2 ? this.f4385a.mo6507i() - this.f4384a.f4428o : this.f4385a.mo6512n() + this.f4384a.f4428o;
                    return true;
                } else if (this.f4390h == Integer.MIN_VALUE) {
                    View J = mo5266J(this.f4388g);
                    if (J == null) {
                        if (mo5828Q() > 0) {
                            if ((this.f4388g < mo5893s0(mo5825P(0))) == this.f4393i) {
                                z = true;
                            }
                            aVar.f4399a = z;
                        }
                        aVar.mo5331a();
                    } else if (this.f4385a.mo6503e(J) > this.f4385a.mo6513o()) {
                        aVar.mo5331a();
                        return true;
                    } else if (this.f4385a.mo6505g(J) - this.f4385a.mo6512n() < 0) {
                        aVar.f4400b = this.f4385a.mo6512n();
                        aVar.f4399a = false;
                        return true;
                    } else if (this.f4385a.mo6507i() - this.f4385a.mo6502d(J) < 0) {
                        aVar.f4400b = this.f4385a.mo6507i();
                        aVar.f4399a = true;
                        return true;
                    } else {
                        aVar.f4400b = aVar.f4399a ? this.f4385a.mo6502d(J) + this.f4385a.mo6514p() : this.f4385a.mo6505g(J);
                    }
                    return true;
                } else {
                    boolean z3 = this.f4393i;
                    aVar.f4399a = z3;
                    aVar.f4400b = z3 ? this.f4385a.mo6507i() - this.f4390h : this.f4385a.mo6512n() + this.f4390h;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: m2 */
    public final int mo5302m2(RecyclerView.C0797c0 c0Var) {
        if (mo5828Q() == 0) {
            return 0;
        }
        mo5315r2();
        C0942t tVar = this.f4385a;
        View w2 = mo5327w2(!this.f4395k, true);
        return C0949w.m6598a(c0Var, tVar, w2, mo5325v2(!this.f4395k, true), this, this.f4395k);
    }

    /* renamed from: m3 */
    public final void mo5303m3(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, C0785a aVar) {
        if (!mo5301l3(c0Var, aVar) && !mo5300k3(wVar, c0Var, aVar)) {
            aVar.mo5331a();
            aVar.f4397a = this.f4394j ? c0Var.mo5609d() - 1 : 0;
        }
    }

    /* renamed from: n */
    public boolean mo5304n() {
        return this.f4387f == 0;
    }

    /* renamed from: n2 */
    public final int mo5305n2(RecyclerView.C0797c0 c0Var) {
        if (mo5828Q() == 0) {
            return 0;
        }
        mo5315r2();
        C0942t tVar = this.f4385a;
        View w2 = mo5327w2(!this.f4395k, true);
        return C0949w.m6599b(c0Var, tVar, w2, mo5325v2(!this.f4395k, true), this, this.f4395k, this.f4393i);
    }

    /* renamed from: n3 */
    public final void mo5306n3(int i, int i2, boolean z, RecyclerView.C0797c0 c0Var) {
        int i3;
        this.f4383a.f4419c = mo5285a3();
        this.f4383a.f4421e = i;
        int[] iArr = this.f4386a;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        mo5299k2(c0Var, iArr);
        int max = Math.max(0, this.f4386a[0]);
        int max2 = Math.max(0, this.f4386a[1]);
        if (i == 1) {
            z2 = true;
        }
        C0787c cVar = this.f4383a;
        int i5 = z2 ? max2 : max;
        cVar.f4423g = i5;
        if (!z2) {
            max = max2;
        }
        cVar.f4424h = max;
        if (z2) {
            cVar.f4423g = i5 + this.f4385a.mo6508j();
            View I2 = mo5265I2();
            C0787c cVar2 = this.f4383a;
            if (this.f4393i) {
                i4 = -1;
            }
            cVar2.f4420d = i4;
            int s0 = mo5893s0(I2);
            C0787c cVar3 = this.f4383a;
            cVar2.f4418c = s0 + cVar3.f4420d;
            cVar3.f4413a = this.f4385a.mo6502d(I2);
            i3 = this.f4385a.mo6502d(I2) - this.f4385a.mo6507i();
        } else {
            View J2 = mo5267J2();
            this.f4383a.f4423g += this.f4385a.mo6512n();
            C0787c cVar4 = this.f4383a;
            if (!this.f4393i) {
                i4 = -1;
            }
            cVar4.f4420d = i4;
            int s02 = mo5893s0(J2);
            C0787c cVar5 = this.f4383a;
            cVar4.f4418c = s02 + cVar5.f4420d;
            cVar5.f4413a = this.f4385a.mo6505g(J2);
            i3 = (-this.f4385a.mo6505g(J2)) + this.f4385a.mo6512n();
        }
        C0787c cVar6 = this.f4383a;
        cVar6.f4416b = i2;
        if (z) {
            cVar6.f4416b = i2 - i3;
        }
        cVar6.f4422f = i3;
    }

    /* renamed from: o */
    public boolean mo5307o() {
        return this.f4387f == 1;
    }

    /* renamed from: o1 */
    public void mo5230o1(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View J;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.f4384a == null && this.f4388g == -1) && c0Var.mo5609d() == 0) {
            mo5797D1(wVar);
            return;
        }
        C0788d dVar = this.f4384a;
        if (dVar != null && dVar.mo5345a()) {
            this.f4388g = this.f4384a.f4427n;
        }
        mo5315r2();
        this.f4383a.f4415a = false;
        mo5288b3();
        View d0 = mo5859d0();
        C0785a aVar = this.f4381a;
        if (!aVar.f4401b || this.f4388g != -1 || this.f4384a != null) {
            aVar.mo5335e();
            C0785a aVar2 = this.f4381a;
            aVar2.f4399a = this.f4393i ^ this.f4394j;
            mo5303m3(wVar, c0Var, aVar2);
            this.f4381a.f4401b = true;
        } else if (d0 != null && (this.f4385a.mo6505g(d0) >= this.f4385a.mo6507i() || this.f4385a.mo6502d(d0) <= this.f4385a.mo6512n())) {
            this.f4381a.mo5333c(d0, mo5893s0(d0));
        }
        C0787c cVar = this.f4383a;
        cVar.f4421e = cVar.f4425i >= 0 ? 1 : -1;
        int[] iArr = this.f4386a;
        iArr[0] = 0;
        iArr[1] = 0;
        mo5299k2(c0Var, iArr);
        int max = Math.max(0, this.f4386a[0]) + this.f4385a.mo6512n();
        int max2 = Math.max(0, this.f4386a[1]) + this.f4385a.mo6508j();
        if (!(!c0Var.mo5615j() || (i6 = this.f4388g) == -1 || this.f4390h == Integer.MIN_VALUE || (J = mo5266J(i6)) == null)) {
            if (this.f4393i) {
                i7 = this.f4385a.mo6507i() - this.f4385a.mo6502d(J);
                i8 = this.f4390h;
            } else {
                i8 = this.f4385a.mo6505g(J) - this.f4385a.mo6512n();
                i7 = this.f4390h;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        C0785a aVar3 = this.f4381a;
        if (!aVar3.f4399a ? !this.f4393i : this.f4393i) {
            i9 = 1;
        }
        mo5218V2(wVar, c0Var, aVar3, i9);
        mo5903z(wVar);
        this.f4383a.f4419c = mo5285a3();
        this.f4383a.f4417b = c0Var.mo5615j();
        this.f4383a.f4424h = 0;
        C0785a aVar4 = this.f4381a;
        if (aVar4.f4399a) {
            mo5316r3(aVar4);
            C0787c cVar2 = this.f4383a;
            cVar2.f4423g = max;
            mo5318s2(wVar, cVar2, c0Var, false);
            C0787c cVar3 = this.f4383a;
            i2 = cVar3.f4413a;
            int i11 = cVar3.f4418c;
            int i12 = cVar3.f4416b;
            if (i12 > 0) {
                max2 += i12;
            }
            mo5311p3(this.f4381a);
            C0787c cVar4 = this.f4383a;
            cVar4.f4423g = max2;
            cVar4.f4418c += cVar4.f4420d;
            mo5318s2(wVar, cVar4, c0Var, false);
            C0787c cVar5 = this.f4383a;
            i = cVar5.f4413a;
            int i13 = cVar5.f4416b;
            if (i13 > 0) {
                mo5313q3(i11, i2);
                C0787c cVar6 = this.f4383a;
                cVar6.f4423g = i13;
                mo5318s2(wVar, cVar6, c0Var, false);
                i2 = this.f4383a.f4413a;
            }
        } else {
            mo5311p3(aVar4);
            C0787c cVar7 = this.f4383a;
            cVar7.f4423g = max2;
            mo5318s2(wVar, cVar7, c0Var, false);
            C0787c cVar8 = this.f4383a;
            i = cVar8.f4413a;
            int i14 = cVar8.f4418c;
            int i15 = cVar8.f4416b;
            if (i15 > 0) {
                max += i15;
            }
            mo5316r3(this.f4381a);
            C0787c cVar9 = this.f4383a;
            cVar9.f4423g = max;
            cVar9.f4418c += cVar9.f4420d;
            mo5318s2(wVar, cVar9, c0Var, false);
            C0787c cVar10 = this.f4383a;
            i2 = cVar10.f4413a;
            int i16 = cVar10.f4416b;
            if (i16 > 0) {
                mo5309o3(i14, i);
                C0787c cVar11 = this.f4383a;
                cVar11.f4423g = i16;
                mo5318s2(wVar, cVar11, c0Var, false);
                i = this.f4383a.f4413a;
            }
        }
        if (mo5828Q() > 0) {
            if (this.f4393i ^ this.f4394j) {
                int G2 = mo5263G2(i, wVar, c0Var, true);
                i4 = i2 + G2;
                i3 = i + G2;
                i5 = mo5264H2(i4, wVar, c0Var, false);
            } else {
                int H2 = mo5264H2(i2, wVar, c0Var, true);
                i4 = i2 + H2;
                i3 = i + H2;
                i5 = mo5263G2(i3, wVar, c0Var, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        mo5277T2(wVar, c0Var, i2, i);
        if (!c0Var.mo5615j()) {
            this.f4385a.mo6519u();
        } else {
            this.f4381a.mo5335e();
        }
        this.f4389g = this.f4394j;
    }

    /* renamed from: o2 */
    public final int mo5308o2(RecyclerView.C0797c0 c0Var) {
        if (mo5828Q() == 0) {
            return 0;
        }
        mo5315r2();
        C0942t tVar = this.f4385a;
        View w2 = mo5327w2(!this.f4395k, true);
        return C0949w.m6600c(c0Var, tVar, w2, mo5325v2(!this.f4395k, true), this, this.f4395k);
    }

    /* renamed from: o3 */
    public final void mo5309o3(int i, int i2) {
        this.f4383a.f4416b = this.f4385a.mo6507i() - i2;
        C0787c cVar = this.f4383a;
        cVar.f4420d = this.f4393i ? -1 : 1;
        cVar.f4418c = i;
        cVar.f4421e = 1;
        cVar.f4413a = i2;
        cVar.f4422f = Integer.MIN_VALUE;
    }

    /* renamed from: p1 */
    public void mo5232p1(RecyclerView.C0797c0 c0Var) {
        super.mo5232p1(c0Var);
        this.f4384a = null;
        this.f4388g = -1;
        this.f4390h = Integer.MIN_VALUE;
        this.f4381a.mo5335e();
    }

    /* renamed from: p2 */
    public int mo5310p2(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f4387f == 1) ? 1 : Integer.MIN_VALUE : this.f4387f == 0 ? 1 : Integer.MIN_VALUE : this.f4387f == 1 ? -1 : Integer.MIN_VALUE : this.f4387f == 0 ? -1 : Integer.MIN_VALUE : (this.f4387f != 1 && mo5274Q2()) ? -1 : 1 : (this.f4387f != 1 && mo5274Q2()) ? 1 : -1;
    }

    /* renamed from: p3 */
    public final void mo5311p3(C0785a aVar) {
        mo5309o3(aVar.f4397a, aVar.f4400b);
    }

    /* renamed from: q2 */
    public C0787c mo5312q2() {
        return new C0787c();
    }

    /* renamed from: q3 */
    public final void mo5313q3(int i, int i2) {
        this.f4383a.f4416b = i2 - this.f4385a.mo6512n();
        C0787c cVar = this.f4383a;
        cVar.f4418c = i;
        cVar.f4420d = this.f4393i ? 1 : -1;
        cVar.f4421e = -1;
        cVar.f4413a = i2;
        cVar.f4422f = Integer.MIN_VALUE;
    }

    /* renamed from: r */
    public void mo5314r(int i, int i2, RecyclerView.C0797c0 c0Var, RecyclerView.C0819p.C0822c cVar) {
        if (this.f4387f != 0) {
            i = i2;
        }
        if (mo5828Q() != 0 && i != 0) {
            mo5315r2();
            mo5306n3(i > 0 ? 1 : -1, Math.abs(i), true, c0Var);
            mo5228l2(c0Var, this.f4383a, cVar);
        }
    }

    /* renamed from: r2 */
    public void mo5315r2() {
        if (this.f4383a == null) {
            this.f4383a = mo5312q2();
        }
    }

    /* renamed from: r3 */
    public final void mo5316r3(C0785a aVar) {
        mo5313q3(aVar.f4397a, aVar.f4400b);
    }

    /* renamed from: s */
    public void mo5317s(int i, RecyclerView.C0819p.C0822c cVar) {
        boolean z;
        int i2;
        C0788d dVar = this.f4384a;
        int i3 = -1;
        if (dVar == null || !dVar.mo5345a()) {
            mo5288b3();
            z = this.f4393i;
            i2 = this.f4388g;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C0788d dVar2 = this.f4384a;
            z = dVar2.f4426b;
            i2 = dVar2.f4427n;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f4392i && i2 >= 0 && i2 < i; i4++) {
            cVar.mo5911a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: s2 */
    public int mo5318s2(RecyclerView.C0831w wVar, C0787c cVar, RecyclerView.C0797c0 c0Var, boolean z) {
        int i = cVar.f4416b;
        int i2 = cVar.f4422f;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f4422f = i2 + i;
            }
            mo5279W2(wVar, cVar);
        }
        int i3 = cVar.f4416b + cVar.f4423g;
        C0786b bVar = this.f4382a;
        while (true) {
            if ((!cVar.f4419c && i3 <= 0) || !cVar.mo5340c(c0Var)) {
                break;
            }
            bVar.mo5337a();
            mo5216S2(wVar, c0Var, cVar, bVar);
            if (!bVar.f4403a) {
                cVar.f4413a += bVar.f4402a * cVar.f4421e;
                if (!bVar.f4404b || cVar.f4414a != null || !c0Var.mo5615j()) {
                    int i4 = cVar.f4416b;
                    int i5 = bVar.f4402a;
                    cVar.f4416b = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f4422f;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f4402a;
                    cVar.f4422f = i7;
                    int i8 = cVar.f4416b;
                    if (i8 < 0) {
                        cVar.f4422f = i7 + i8;
                    }
                    mo5279W2(wVar, cVar);
                }
                if (z && bVar.f4405c) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f4416b;
    }

    /* renamed from: s3 */
    public void mo5319s3() {
        Log.d(f4376a, "validating child count " + mo5828Q());
        boolean z = true;
        if (mo5828Q() >= 1) {
            int s0 = mo5893s0(mo5825P(0));
            int g = this.f4385a.mo6505g(mo5825P(0));
            if (this.f4393i) {
                int i = 1;
                while (i < mo5828Q()) {
                    View P = mo5825P(i);
                    int s02 = mo5893s0(P);
                    int g2 = this.f4385a.mo6505g(P);
                    if (s02 < s0) {
                        mo5278U2();
                        StringBuilder sb = new StringBuilder();
                        sb.append("detected invalid position. loc invalid? ");
                        if (g2 >= g) {
                            z = false;
                        }
                        sb.append(z);
                        throw new RuntimeException(sb.toString());
                    } else if (g2 <= g) {
                        i++;
                    } else {
                        mo5278U2();
                        throw new RuntimeException("detected invalid location");
                    }
                }
                return;
            }
            int i2 = 1;
            while (i2 < mo5828Q()) {
                View P2 = mo5825P(i2);
                int s03 = mo5893s0(P2);
                int g3 = this.f4385a.mo6505g(P2);
                if (s03 < s0) {
                    mo5278U2();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("detected invalid position. loc invalid? ");
                    if (g3 >= g) {
                        z = false;
                    }
                    sb2.append(z);
                    throw new RuntimeException(sb2.toString());
                } else if (g3 >= g) {
                    i2++;
                } else {
                    mo5278U2();
                    throw new RuntimeException("detected invalid location");
                }
            }
        }
    }

    /* renamed from: t */
    public int mo5320t(RecyclerView.C0797c0 c0Var) {
        return mo5302m2(c0Var);
    }

    /* renamed from: t1 */
    public void mo5321t1(Parcelable parcelable) {
        if (parcelable instanceof C0788d) {
            C0788d dVar = (C0788d) parcelable;
            this.f4384a = dVar;
            if (this.f4388g != -1) {
                dVar.mo5346b();
            }
            mo5821N1();
        }
    }

    /* renamed from: t2 */
    public int mo5322t2() {
        View C2 = mo5259C2(0, mo5828Q(), true, false);
        if (C2 == null) {
            return -1;
        }
        return mo5893s0(C2);
    }

    /* renamed from: u */
    public int mo5234u(RecyclerView.C0797c0 c0Var) {
        return mo5305n2(c0Var);
    }

    /* renamed from: u1 */
    public Parcelable mo5323u1() {
        if (this.f4384a != null) {
            return new C0788d(this.f4384a);
        }
        C0788d dVar = new C0788d();
        if (mo5828Q() > 0) {
            mo5315r2();
            boolean z = this.f4389g ^ this.f4393i;
            dVar.f4426b = z;
            if (z) {
                View I2 = mo5265I2();
                dVar.f4428o = this.f4385a.mo6507i() - this.f4385a.mo6502d(I2);
                dVar.f4427n = mo5893s0(I2);
            } else {
                View J2 = mo5267J2();
                dVar.f4427n = mo5893s0(J2);
                dVar.f4428o = this.f4385a.mo6505g(J2) - this.f4385a.mo6512n();
            }
        } else {
            dVar.mo5346b();
        }
        return dVar;
    }

    /* renamed from: u2 */
    public final View mo5324u2() {
        return mo5258B2(0, mo5828Q());
    }

    /* renamed from: v */
    public int mo5236v(RecyclerView.C0797c0 c0Var) {
        return mo5308o2(c0Var);
    }

    /* renamed from: v2 */
    public View mo5325v2(boolean z, boolean z2) {
        int Q;
        int i;
        if (this.f4393i) {
            Q = 0;
            i = mo5828Q();
        } else {
            Q = mo5828Q() - 1;
            i = -1;
        }
        return mo5259C2(Q, i, z, z2);
    }

    /* renamed from: w */
    public int mo5326w(RecyclerView.C0797c0 c0Var) {
        return mo5302m2(c0Var);
    }

    /* renamed from: w2 */
    public View mo5327w2(boolean z, boolean z2) {
        int i;
        int Q;
        if (this.f4393i) {
            i = mo5828Q() - 1;
            Q = -1;
        } else {
            i = 0;
            Q = mo5828Q();
        }
        return mo5259C2(i, Q, z, z2);
    }

    /* renamed from: x */
    public int mo5239x(RecyclerView.C0797c0 c0Var) {
        return mo5305n2(c0Var);
    }

    /* renamed from: x2 */
    public int mo5328x2() {
        View C2 = mo5259C2(0, mo5828Q(), false, true);
        if (C2 == null) {
            return -1;
        }
        return mo5893s0(C2);
    }

    /* renamed from: y */
    public int mo5241y(RecyclerView.C0797c0 c0Var) {
        return mo5308o2(c0Var);
    }

    /* renamed from: y2 */
    public int mo5329y2() {
        View C2 = mo5259C2(mo5828Q() - 1, -1, true, false);
        if (C2 == null) {
            return -1;
        }
        return mo5893s0(C2);
    }

    /* renamed from: z2 */
    public final View mo5330z2() {
        return mo5258B2(mo5828Q() - 1, -1);
    }
}
