package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.C0819p implements RecyclerView.C0793b0.C0795b {

    /* renamed from: a */
    public static final float f4700a = 0.33333334f;

    /* renamed from: a */
    public static final String f4701a = "StaggeredGridLManager";

    /* renamed from: m */
    public static final int f4702m = 0;

    /* renamed from: m */
    public static final boolean f4703m = false;

    /* renamed from: n */
    public static final int f4704n = 1;

    /* renamed from: o */
    public static final int f4705o = 0;
    @Deprecated

    /* renamed from: p */
    public static final int f4706p = 1;

    /* renamed from: q */
    public static final int f4707q = 2;

    /* renamed from: r */
    public static final int f4708r = Integer.MIN_VALUE;

    /* renamed from: a */
    public final Rect f4709a = new Rect();

    /* renamed from: a */
    public final C0837b f4710a = new C0837b();

    /* renamed from: a */
    public C0838c f4711a = new C0838c();

    /* renamed from: a */
    public C0841d f4712a;
    @mr2

    /* renamed from: a */
    public final C0932n f4713a;
    @mr2

    /* renamed from: a */
    public C0942t f4714a;

    /* renamed from: a */
    public final Runnable f4715a = new C0836a();

    /* renamed from: a */
    public BitSet f4716a;

    /* renamed from: a */
    public int[] f4717a;

    /* renamed from: a */
    public C0843e[] f4718a;
    @mr2

    /* renamed from: b */
    public C0942t f4719b;

    /* renamed from: f */
    public int f4720f = -1;

    /* renamed from: g */
    public int f4721g;

    /* renamed from: g */
    public boolean f4722g = false;

    /* renamed from: h */
    public int f4723h;

    /* renamed from: h */
    public boolean f4724h = false;

    /* renamed from: i */
    public int f4725i = -1;

    /* renamed from: i */
    public boolean f4726i;

    /* renamed from: j */
    public int f4727j = Integer.MIN_VALUE;

    /* renamed from: j */
    public boolean f4728j;

    /* renamed from: k */
    public int f4729k = 2;

    /* renamed from: k */
    public boolean f4730k = false;

    /* renamed from: l */
    public int f4731l;

    /* renamed from: l */
    public boolean f4732l = true;

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: a */
        public static final int f4733a = -1;

        /* renamed from: a */
        public C0843e f4734a;

        /* renamed from: c */
        public boolean f4735c;

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
        public final int mo6049j() {
            C0843e eVar = this.f4734a;
            if (eVar == null) {
                return -1;
            }
            return eVar.f4767d;
        }

        /* renamed from: k */
        public boolean mo6050k() {
            return this.f4735c;
        }

        /* renamed from: l */
        public void mo6051l(boolean z) {
            this.f4735c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class C0836a implements Runnable {
        public C0836a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo6029q2();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C0837b {

        /* renamed from: a */
        public int f4737a;

        /* renamed from: a */
        public boolean f4739a;

        /* renamed from: a */
        public int[] f4740a;

        /* renamed from: b */
        public int f4741b;

        /* renamed from: b */
        public boolean f4742b;

        /* renamed from: c */
        public boolean f4743c;

        public C0837b() {
            mo6055c();
        }

        /* renamed from: a */
        public void mo6053a() {
            this.f4741b = this.f4739a ? StaggeredGridLayoutManager.this.f4714a.mo6507i() : StaggeredGridLayoutManager.this.f4714a.mo6512n();
        }

        /* renamed from: b */
        public void mo6054b(int i) {
            this.f4741b = this.f4739a ? StaggeredGridLayoutManager.this.f4714a.mo6507i() - i : StaggeredGridLayoutManager.this.f4714a.mo6512n() + i;
        }

        /* renamed from: c */
        public void mo6055c() {
            this.f4737a = -1;
            this.f4741b = Integer.MIN_VALUE;
            this.f4739a = false;
            this.f4742b = false;
            this.f4743c = false;
            int[] iArr = this.f4740a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        public void mo6056d(C0843e[] eVarArr) {
            int length = eVarArr.length;
            int[] iArr = this.f4740a;
            if (iArr == null || iArr.length < length) {
                this.f4740a = new int[StaggeredGridLayoutManager.this.f4718a.length];
            }
            for (int i = 0; i < length; i++) {
                this.f4740a[i] = eVarArr[i].mo6109u(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0838c {

        /* renamed from: a */
        public static final int f4744a = 10;

        /* renamed from: a */
        public List<C0839a> f4745a;

        /* renamed from: a */
        public int[] f4746a;

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a */
        public static class C0839a implements Parcelable {
            public static final Parcelable.Creator<C0839a> CREATOR = new C0840a();

            /* renamed from: a */
            public int[] f4747a;

            /* renamed from: b */
            public boolean f4748b;

            /* renamed from: n */
            public int f4749n;

            /* renamed from: o */
            public int f4750o;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a$a */
            public class C0840a implements Parcelable.Creator<C0839a> {
                /* renamed from: a */
                public C0839a createFromParcel(Parcel parcel) {
                    return new C0839a(parcel);
                }

                /* renamed from: b */
                public C0839a[] newArray(int i) {
                    return new C0839a[i];
                }
            }

            public C0839a() {
            }

            public C0839a(Parcel parcel) {
                this.f4749n = parcel.readInt();
                this.f4750o = parcel.readInt();
                this.f4748b = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f4747a = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            public int mo6072a(int i) {
                int[] iArr = this.f4747a;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4749n + ", mGapDir=" + this.f4750o + ", mHasUnwantedGapAfter=" + this.f4748b + ", mGapPerSpan=" + Arrays.toString(this.f4747a) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f4749n);
                parcel.writeInt(this.f4750o);
                parcel.writeInt(this.f4748b ? 1 : 0);
                int[] iArr = this.f4747a;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f4747a);
            }
        }

        /* renamed from: a */
        public void mo6057a(C0839a aVar) {
            if (this.f4745a == null) {
                this.f4745a = new ArrayList();
            }
            int size = this.f4745a.size();
            for (int i = 0; i < size; i++) {
                C0839a aVar2 = this.f4745a.get(i);
                if (aVar2.f4749n == aVar.f4749n) {
                    this.f4745a.remove(i);
                }
                if (aVar2.f4749n >= aVar.f4749n) {
                    this.f4745a.add(i, aVar);
                    return;
                }
            }
            this.f4745a.add(aVar);
        }

        /* renamed from: b */
        public void mo6058b() {
            int[] iArr = this.f4746a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4745a = null;
        }

        /* renamed from: c */
        public void mo6059c(int i) {
            int[] iArr = this.f4746a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f4746a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[mo6071o(i)];
                this.f4746a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4746a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        public int mo6060d(int i) {
            List<C0839a> list = this.f4745a;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4745a.get(size).f4749n >= i) {
                        this.f4745a.remove(size);
                    }
                }
            }
            return mo6064h(i);
        }

        /* renamed from: e */
        public C0839a mo6061e(int i, int i2, int i3, boolean z) {
            List<C0839a> list = this.f4745a;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0839a aVar = this.f4745a.get(i4);
                int i5 = aVar.f4749n;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f4750o == i3 || (z && aVar.f4748b))) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: f */
        public C0839a mo6062f(int i) {
            List<C0839a> list = this.f4745a;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C0839a aVar = this.f4745a.get(size);
                if (aVar.f4749n == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: g */
        public int mo6063g(int i) {
            int[] iArr = this.f4746a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* renamed from: h */
        public int mo6064h(int i) {
            int[] iArr = this.f4746a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = mo6065i(i);
            if (i2 == -1) {
                int[] iArr2 = this.f4746a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f4746a.length;
            }
            int min = Math.min(i2 + 1, this.f4746a.length);
            Arrays.fill(this.f4746a, i, min, -1);
            return min;
        }

        /* renamed from: i */
        public final int mo6065i(int i) {
            if (this.f4745a == null) {
                return -1;
            }
            C0839a f = mo6062f(i);
            if (f != null) {
                this.f4745a.remove(f);
            }
            int size = this.f4745a.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f4745a.get(i2).f4749n >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f4745a.remove(i2);
            return this.f4745a.get(i2).f4749n;
        }

        /* renamed from: j */
        public void mo6066j(int i, int i2) {
            int[] iArr = this.f4746a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo6059c(i3);
                int[] iArr2 = this.f4746a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f4746a, i, i3, -1);
                mo6068l(i, i2);
            }
        }

        /* renamed from: k */
        public void mo6067k(int i, int i2) {
            int[] iArr = this.f4746a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo6059c(i3);
                int[] iArr2 = this.f4746a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f4746a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                mo6069m(i, i2);
            }
        }

        /* renamed from: l */
        public final void mo6068l(int i, int i2) {
            List<C0839a> list = this.f4745a;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0839a aVar = this.f4745a.get(size);
                    int i3 = aVar.f4749n;
                    if (i3 >= i) {
                        aVar.f4749n = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: m */
        public final void mo6069m(int i, int i2) {
            List<C0839a> list = this.f4745a;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0839a aVar = this.f4745a.get(size);
                    int i4 = aVar.f4749n;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f4745a.remove(size);
                        } else {
                            aVar.f4749n = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: n */
        public void mo6070n(int i, C0843e eVar) {
            mo6059c(i);
            this.f4746a[i] = eVar.f4767d;
        }

        /* renamed from: o */
        public int mo6071o(int i) {
            int length = this.f4746a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public static class C0841d implements Parcelable {
        public static final Parcelable.Creator<C0841d> CREATOR = new C0842a();

        /* renamed from: a */
        public List<C0838c.C0839a> f4751a;

        /* renamed from: a */
        public int[] f4752a;

        /* renamed from: b */
        public boolean f4753b;

        /* renamed from: b */
        public int[] f4754b;

        /* renamed from: c */
        public boolean f4755c;

        /* renamed from: d */
        public boolean f4756d;

        /* renamed from: n */
        public int f4757n;

        /* renamed from: o */
        public int f4758o;

        /* renamed from: p */
        public int f4759p;

        /* renamed from: q */
        public int f4760q;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        public class C0842a implements Parcelable.Creator<C0841d> {
            /* renamed from: a */
            public C0841d createFromParcel(Parcel parcel) {
                return new C0841d(parcel);
            }

            /* renamed from: b */
            public C0841d[] newArray(int i) {
                return new C0841d[i];
            }
        }

        public C0841d() {
        }

        public C0841d(Parcel parcel) {
            this.f4757n = parcel.readInt();
            this.f4758o = parcel.readInt();
            int readInt = parcel.readInt();
            this.f4759p = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f4752a = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f4760q = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f4754b = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f4753b = parcel.readInt() == 1;
            this.f4755c = parcel.readInt() == 1;
            this.f4756d = parcel.readInt() == 1 ? true : z;
            this.f4751a = parcel.readArrayList(C0838c.C0839a.class.getClassLoader());
        }

        public C0841d(C0841d dVar) {
            this.f4759p = dVar.f4759p;
            this.f4757n = dVar.f4757n;
            this.f4758o = dVar.f4758o;
            this.f4752a = dVar.f4752a;
            this.f4760q = dVar.f4760q;
            this.f4754b = dVar.f4754b;
            this.f4753b = dVar.f4753b;
            this.f4755c = dVar.f4755c;
            this.f4756d = dVar.f4756d;
            this.f4751a = dVar.f4751a;
        }

        /* renamed from: a */
        public void mo6080a() {
            this.f4752a = null;
            this.f4759p = 0;
            this.f4757n = -1;
            this.f4758o = -1;
        }

        /* renamed from: b */
        public void mo6081b() {
            this.f4752a = null;
            this.f4759p = 0;
            this.f4760q = 0;
            this.f4754b = null;
            this.f4751a = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4757n);
            parcel.writeInt(this.f4758o);
            parcel.writeInt(this.f4759p);
            if (this.f4759p > 0) {
                parcel.writeIntArray(this.f4752a);
            }
            parcel.writeInt(this.f4760q);
            if (this.f4760q > 0) {
                parcel.writeIntArray(this.f4754b);
            }
            parcel.writeInt(this.f4753b ? 1 : 0);
            parcel.writeInt(this.f4755c ? 1 : 0);
            parcel.writeInt(this.f4756d ? 1 : 0);
            parcel.writeList(this.f4751a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public class C0843e {

        /* renamed from: e */
        public static final int f4761e = Integer.MIN_VALUE;

        /* renamed from: a */
        public int f4762a = Integer.MIN_VALUE;

        /* renamed from: a */
        public ArrayList<View> f4764a = new ArrayList<>();

        /* renamed from: b */
        public int f4765b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f4766c = 0;

        /* renamed from: d */
        public final int f4767d;

        public C0843e(int i) {
            this.f4767d = i;
        }

        /* renamed from: A */
        public void mo6088A(int i) {
            this.f4762a = i;
            this.f4765b = i;
        }

        /* renamed from: a */
        public void mo6089a(View view) {
            LayoutParams s = mo6107s(view);
            s.f4734a = this;
            this.f4764a.add(view);
            this.f4765b = Integer.MIN_VALUE;
            if (this.f4764a.size() == 1) {
                this.f4762a = Integer.MIN_VALUE;
            }
            if (s.mo5565g() || s.mo5564f()) {
                this.f4766c += StaggeredGridLayoutManager.this.f4714a.mo6503e(view);
            }
        }

        /* renamed from: b */
        public void mo6090b(boolean z, int i) {
            int q = z ? mo6105q(Integer.MIN_VALUE) : mo6109u(Integer.MIN_VALUE);
            mo6093e();
            if (q != Integer.MIN_VALUE) {
                if (z && q < StaggeredGridLayoutManager.this.f4714a.mo6507i()) {
                    return;
                }
                if (z || q <= StaggeredGridLayoutManager.this.f4714a.mo6512n()) {
                    if (i != Integer.MIN_VALUE) {
                        q += i;
                    }
                    this.f4765b = q;
                    this.f4762a = q;
                }
            }
        }

        /* renamed from: c */
        public void mo6091c() {
            C0838c.C0839a f;
            ArrayList<View> arrayList = this.f4764a;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams s = mo6107s(view);
            this.f4765b = StaggeredGridLayoutManager.this.f4714a.mo6502d(view);
            if (s.f4735c && (f = StaggeredGridLayoutManager.this.f4711a.mo6062f(s.mo5562d())) != null && f.f4750o == 1) {
                this.f4765b += f.mo6072a(this.f4767d);
            }
        }

        /* renamed from: d */
        public void mo6092d() {
            C0838c.C0839a f;
            View view = this.f4764a.get(0);
            LayoutParams s = mo6107s(view);
            this.f4762a = StaggeredGridLayoutManager.this.f4714a.mo6505g(view);
            if (s.f4735c && (f = StaggeredGridLayoutManager.this.f4711a.mo6062f(s.mo5562d())) != null && f.f4750o == -1) {
                this.f4762a -= f.mo6072a(this.f4767d);
            }
        }

        /* renamed from: e */
        public void mo6093e() {
            this.f4764a.clear();
            mo6110v();
            this.f4766c = 0;
        }

        /* renamed from: f */
        public int mo6094f() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f4722g) {
                i2 = this.f4764a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f4764a.size();
            }
            return mo6102n(i2, i, true);
        }

        /* renamed from: g */
        public int mo6095g() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f4722g) {
                i2 = this.f4764a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f4764a.size();
            }
            return mo6101m(i2, i, true);
        }

        /* renamed from: h */
        public int mo6096h() {
            return StaggeredGridLayoutManager.this.f4722g ? mo6102n(this.f4764a.size() - 1, -1, false) : mo6102n(0, this.f4764a.size(), false);
        }

        /* renamed from: i */
        public int mo6097i() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f4722g) {
                i2 = 0;
                i = this.f4764a.size();
            } else {
                i2 = this.f4764a.size() - 1;
                i = -1;
            }
            return mo6102n(i2, i, true);
        }

        /* renamed from: j */
        public int mo6098j() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f4722g) {
                i2 = 0;
                i = this.f4764a.size();
            } else {
                i2 = this.f4764a.size() - 1;
                i = -1;
            }
            return mo6101m(i2, i, true);
        }

        /* renamed from: k */
        public int mo6099k() {
            return StaggeredGridLayoutManager.this.f4722g ? mo6102n(0, this.f4764a.size(), false) : mo6102n(this.f4764a.size() - 1, -1, false);
        }

        /* renamed from: l */
        public int mo6100l(int i, int i2, boolean z, boolean z2, boolean z3) {
            int n = StaggeredGridLayoutManager.this.f4714a.mo6512n();
            int i3 = StaggeredGridLayoutManager.this.f4714a.mo6507i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f4764a.get(i);
                int g = StaggeredGridLayoutManager.this.f4714a.mo6505g(view);
                int d = StaggeredGridLayoutManager.this.f4714a.mo6502d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g < i3 : g <= i3;
                if (!z3 ? d > n : d >= n) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && g >= n && d <= i3) {
                        }
                    } else if (g >= n && d <= i3) {
                    }
                    return StaggeredGridLayoutManager.this.mo5893s0(view);
                }
                i += i4;
            }
            return -1;
        }

        /* renamed from: m */
        public int mo6101m(int i, int i2, boolean z) {
            return mo6100l(i, i2, false, false, z);
        }

        /* renamed from: n */
        public int mo6102n(int i, int i2, boolean z) {
            return mo6100l(i, i2, z, true, false);
        }

        /* renamed from: o */
        public int mo6103o() {
            return this.f4766c;
        }

        /* renamed from: p */
        public int mo6104p() {
            int i = this.f4765b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo6091c();
            return this.f4765b;
        }

        /* renamed from: q */
        public int mo6105q(int i) {
            int i2 = this.f4765b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4764a.size() == 0) {
                return i;
            }
            mo6091c();
            return this.f4765b;
        }

        /* renamed from: r */
        public View mo6106r(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f4764a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f4764a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f4722g && staggeredGridLayoutManager.mo5893s0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f4722g && staggeredGridLayoutManager2.mo5893s0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f4764a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f4764a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f4722g && staggeredGridLayoutManager3.mo5893s0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f4722g && staggeredGridLayoutManager4.mo5893s0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: s */
        public LayoutParams mo6107s(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* renamed from: t */
        public int mo6108t() {
            int i = this.f4762a;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo6092d();
            return this.f4762a;
        }

        /* renamed from: u */
        public int mo6109u(int i) {
            int i2 = this.f4762a;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4764a.size() == 0) {
                return i;
            }
            mo6092d();
            return this.f4762a;
        }

        /* renamed from: v */
        public void mo6110v() {
            this.f4762a = Integer.MIN_VALUE;
            this.f4765b = Integer.MIN_VALUE;
        }

        /* renamed from: w */
        public void mo6111w(int i) {
            int i2 = this.f4762a;
            if (i2 != Integer.MIN_VALUE) {
                this.f4762a = i2 + i;
            }
            int i3 = this.f4765b;
            if (i3 != Integer.MIN_VALUE) {
                this.f4765b = i3 + i;
            }
        }

        /* renamed from: x */
        public void mo6112x() {
            int size = this.f4764a.size();
            View remove = this.f4764a.remove(size - 1);
            LayoutParams s = mo6107s(remove);
            s.f4734a = null;
            if (s.mo5565g() || s.mo5564f()) {
                this.f4766c -= StaggeredGridLayoutManager.this.f4714a.mo6503e(remove);
            }
            if (size == 1) {
                this.f4762a = Integer.MIN_VALUE;
            }
            this.f4765b = Integer.MIN_VALUE;
        }

        /* renamed from: y */
        public void mo6113y() {
            View remove = this.f4764a.remove(0);
            LayoutParams s = mo6107s(remove);
            s.f4734a = null;
            if (this.f4764a.size() == 0) {
                this.f4765b = Integer.MIN_VALUE;
            }
            if (s.mo5565g() || s.mo5564f()) {
                this.f4766c -= StaggeredGridLayoutManager.this.f4714a.mo6503e(remove);
            }
            this.f4762a = Integer.MIN_VALUE;
        }

        /* renamed from: z */
        public void mo6114z(View view) {
            LayoutParams s = mo6107s(view);
            s.f4734a = this;
            this.f4764a.add(0, view);
            this.f4762a = Integer.MIN_VALUE;
            if (this.f4764a.size() == 1) {
                this.f4765b = Integer.MIN_VALUE;
            }
            if (s.mo5565g() || s.mo5564f()) {
                this.f4766c += StaggeredGridLayoutManager.this.f4714a.mo6503e(view);
            }
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f4721g = i2;
        mo6032r3(i);
        this.f4713a = new C0932n();
        mo6045y2();
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C0819p.C0823d t0 = RecyclerView.C0819p.m5637t0(context, attributeSet, i, i2);
        mo6028p3(t0.f4677a);
        mo6032r3(t0.f4679b);
        mo6030q3(t0.f4678a);
        this.f4713a = new C0932n();
        mo6045y2();
    }

    /* renamed from: A2 */
    public int[] mo5981A2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f4720f];
        } else if (iArr.length < this.f4720f) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f4720f + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f4720f; i++) {
            iArr[i] = this.f4718a[i].mo6094f();
        }
        return iArr;
    }

    /* renamed from: B2 */
    public final int mo5982B2(int i) {
        int Q = mo5828Q();
        for (int i2 = 0; i2 < Q; i2++) {
            int s0 = mo5893s0(mo5825P(i2));
            if (s0 >= 0 && s0 < i) {
                return s0;
            }
        }
        return 0;
    }

    /* renamed from: C2 */
    public View mo5983C2(boolean z) {
        int n = this.f4714a.mo6512n();
        int i = this.f4714a.mo6507i();
        View view = null;
        for (int Q = mo5828Q() - 1; Q >= 0; Q--) {
            View P = mo5825P(Q);
            int g = this.f4714a.mo6505g(P);
            int d = this.f4714a.mo6502d(P);
            if (d > n && g < i) {
                if (d <= i || !z) {
                    return P;
                }
                if (view == null) {
                    view = P;
                }
            }
        }
        return view;
    }

    /* renamed from: D2 */
    public View mo5984D2(boolean z) {
        int n = this.f4714a.mo6512n();
        int i = this.f4714a.mo6507i();
        int Q = mo5828Q();
        View view = null;
        for (int i2 = 0; i2 < Q; i2++) {
            View P = mo5825P(i2);
            int g = this.f4714a.mo6505g(P);
            if (this.f4714a.mo6502d(P) > n && g < i) {
                if (g >= n || !z) {
                    return P;
                }
                if (view == null) {
                    view = P;
                }
            }
        }
        return view;
    }

    /* renamed from: E2 */
    public int mo5985E2() {
        View C2 = this.f4724h ? mo5983C2(true) : mo5984D2(true);
        if (C2 == null) {
            return -1;
        }
        return mo5893s0(C2);
    }

    /* renamed from: F0 */
    public boolean mo5262F0() {
        return this.f4729k != 0;
    }

    /* renamed from: F2 */
    public int[] mo5986F2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f4720f];
        } else if (iArr.length < this.f4720f) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f4720f + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f4720f; i++) {
            iArr[i] = this.f4718a[i].mo6096h();
        }
        return iArr;
    }

    /* renamed from: G2 */
    public int[] mo5987G2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f4720f];
        } else if (iArr.length < this.f4720f) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f4720f + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f4720f; i++) {
            iArr[i] = this.f4718a[i].mo6097i();
        }
        return iArr;
    }

    /* renamed from: H2 */
    public final int mo5988H2(int i) {
        for (int Q = mo5828Q() - 1; Q >= 0; Q--) {
            int s0 = mo5893s0(mo5825P(Q));
            if (s0 >= 0 && s0 < i) {
                return s0;
            }
        }
        return 0;
    }

    /* renamed from: I2 */
    public int[] mo5989I2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f4720f];
        } else if (iArr.length < this.f4720f) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f4720f + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f4720f; i++) {
            iArr[i] = this.f4718a[i].mo6099k();
        }
        return iArr;
    }

    /* renamed from: J2 */
    public final void mo5990J2(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, boolean z) {
        int i;
        int O2 = mo5995O2(Integer.MIN_VALUE);
        if (O2 != Integer.MIN_VALUE && (i = this.f4714a.mo6507i() - O2) > 0) {
            int i2 = i - (-mo6020l3(-i, wVar, c0Var));
            if (z && i2 > 0) {
                this.f4714a.mo6518t(i2);
            }
        }
    }

    /* renamed from: K */
    public RecyclerView.LayoutParams mo5205K() {
        return this.f4721g == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    /* renamed from: K2 */
    public final void mo5991K2(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var, boolean z) {
        int n;
        int R2 = mo5998R2(Integer.MAX_VALUE);
        if (R2 != Integer.MAX_VALUE && (n = R2 - this.f4714a.mo6512n()) > 0) {
            int l3 = n - mo6020l3(n, wVar, c0Var);
            if (z && l3 > 0) {
                this.f4714a.mo6518t(-l3);
            }
        }
    }

    /* renamed from: L */
    public RecyclerView.LayoutParams mo5207L(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: L2 */
    public int mo5992L2() {
        if (mo5828Q() == 0) {
            return 0;
        }
        return mo5893s0(mo5825P(0));
    }

    /* renamed from: M */
    public RecyclerView.LayoutParams mo5209M(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* renamed from: M2 */
    public int mo5993M2() {
        return this.f4729k;
    }

    /* renamed from: N2 */
    public int mo5994N2() {
        int Q = mo5828Q();
        if (Q == 0) {
            return 0;
        }
        return mo5893s0(mo5825P(Q - 1));
    }

    /* renamed from: O2 */
    public final int mo5995O2(int i) {
        int q = this.f4718a[0].mo6105q(i);
        for (int i2 = 1; i2 < this.f4720f; i2++) {
            int q2 = this.f4718a[i2].mo6105q(i);
            if (q2 > q) {
                q = q2;
            }
        }
        return q;
    }

    /* renamed from: P2 */
    public final int mo5996P2(int i) {
        int u = this.f4718a[0].mo6109u(i);
        for (int i2 = 1; i2 < this.f4720f; i2++) {
            int u2 = this.f4718a[i2].mo6109u(i);
            if (u2 > u) {
                u = u2;
            }
        }
        return u;
    }

    /* renamed from: Q1 */
    public int mo5214Q1(int i, RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var) {
        return mo6020l3(i, wVar, c0Var);
    }

    /* renamed from: Q2 */
    public final int mo5997Q2(int i) {
        int q = this.f4718a[0].mo6105q(i);
        for (int i2 = 1; i2 < this.f4720f; i2++) {
            int q2 = this.f4718a[i2].mo6105q(i);
            if (q2 < q) {
                q = q2;
            }
        }
        return q;
    }

    /* renamed from: R1 */
    public void mo5275R1(int i) {
        C0841d dVar = this.f4712a;
        if (!(dVar == null || dVar.f4757n == i)) {
            dVar.mo6080a();
        }
        this.f4725i = i;
        this.f4727j = Integer.MIN_VALUE;
        mo5821N1();
    }

    /* renamed from: R2 */
    public final int mo5998R2(int i) {
        int u = this.f4718a[0].mo6109u(i);
        for (int i2 = 1; i2 < this.f4720f; i2++) {
            int u2 = this.f4718a[i2].mo6109u(i);
            if (u2 < u) {
                u = u2;
            }
        }
        return u;
    }

    /* renamed from: S1 */
    public int mo5215S1(int i, RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var) {
        return mo6020l3(i, wVar, c0Var);
    }

    /* renamed from: S2 */
    public final C0843e mo5999S2(C0932n nVar) {
        int i;
        int i2;
        int i3 = -1;
        if (mo6010d3(nVar.f5159d)) {
            i2 = this.f4720f - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f4720f;
            i = 1;
        }
        C0843e eVar = null;
        if (nVar.f5159d == 1) {
            int i4 = Integer.MAX_VALUE;
            int n = this.f4714a.mo6512n();
            while (i2 != i3) {
                C0843e eVar2 = this.f4718a[i2];
                int q = eVar2.mo6105q(n);
                if (q < i4) {
                    eVar = eVar2;
                    i4 = q;
                }
                i2 += i;
            }
            return eVar;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = this.f4714a.mo6507i();
        while (i2 != i3) {
            C0843e eVar3 = this.f4718a[i2];
            int u = eVar3.mo6109u(i6);
            if (u > i5) {
                eVar = eVar3;
                i5 = u;
            }
            i2 += i;
        }
        return eVar;
    }

    /* renamed from: T0 */
    public void mo5833T0(int i) {
        super.mo5833T0(i);
        for (int i2 = 0; i2 < this.f4720f; i2++) {
            this.f4718a[i2].mo6111w(i);
        }
    }

    /* renamed from: T2 */
    public int mo6000T2() {
        return this.f4721g;
    }

    /* renamed from: U0 */
    public void mo5836U0(int i) {
        super.mo5836U0(i);
        for (int i2 = 0; i2 < this.f4720f; i2++) {
            this.f4718a[i2].mo6111w(i);
        }
    }

    /* renamed from: U2 */
    public boolean mo6001U2() {
        return this.f4722g;
    }

    /* renamed from: V0 */
    public void mo5838V0(@ts2 RecyclerView.C0805h hVar, @ts2 RecyclerView.C0805h hVar2) {
        this.f4711a.mo6058b();
        for (int i = 0; i < this.f4720f; i++) {
            this.f4718a[i].mo6093e();
        }
    }

    /* renamed from: V2 */
    public int mo6002V2() {
        return this.f4720f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: W2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6003W2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f4724h
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo5994N2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo5992L2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r4 = r6.f4711a
            r4.mo6064h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.f4711a
            r9.mo6067k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = r6.f4711a
            r7.mo6066j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.f4711a
            r9.mo6067k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.f4711a
            r9.mo6066j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f4724h
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo5992L2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo5994N2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo5821N1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo6003W2(int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: X2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo6004X2() {
        /*
            r12 = this;
            int r0 = r12.mo5828Q()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f4720f
            r2.<init>(r3)
            int r3 = r12.f4720f
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f4721g
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo6006Z2()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f4724h
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo5825P(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r9 = r8.f4734a
            int r9 = r9.f4767d
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r9 = r8.f4734a
            boolean r9 = r12.mo6031r2(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r9 = r8.f4734a
            int r9 = r9.f4767d
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f4735c
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo5825P(r9)
            boolean r10 = r12.f4724h
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.t r10 = r12.f4714a
            int r10 = r10.mo6502d(r7)
            androidx.recyclerview.widget.t r11 = r12.f4714a
            int r11 = r11.mo6502d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.t r10 = r12.f4714a
            int r10 = r10.mo6505g(r7)
            androidx.recyclerview.widget.t r11 = r12.f4714a
            int r11 = r11.mo6505g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r8 = r8.f4734a
            int r8 = r8.f4767d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r9 = r9.f4734a
            int r9 = r9.f4767d
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo6004X2():android.view.View");
    }

    /* renamed from: Y1 */
    public void mo5219Y1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int o0 = mo5887o0() + mo5888p0();
        int r0 = mo5891r0() + mo5884m0();
        if (this.f4721g == 1) {
            i4 = RecyclerView.C0819p.m5636q(i2, rect.height() + r0, mo5880k0());
            i3 = RecyclerView.C0819p.m5636q(i, (this.f4723h * this.f4720f) + o0, mo5882l0());
        } else {
            i3 = RecyclerView.C0819p.m5636q(i, rect.width() + o0, mo5882l0());
            i4 = RecyclerView.C0819p.m5636q(i2, (this.f4723h * this.f4720f) + r0, mo5880k0());
        }
        mo5845X1(i3, i4);
    }

    /* renamed from: Y2 */
    public void mo6005Y2() {
        this.f4711a.mo6058b();
        mo5821N1();
    }

    /* renamed from: Z0 */
    public void mo5282Z0(RecyclerView recyclerView, RecyclerView.C0831w wVar) {
        super.mo5282Z0(recyclerView, wVar);
        mo5808H1(this.f4715a);
        for (int i = 0; i < this.f4720f; i++) {
            this.f4718a[i].mo6093e();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: Z2 */
    public boolean mo6006Z2() {
        return mo5875i0() == 1;
    }

    /* renamed from: a */
    public PointF mo5284a(int i) {
        int p2 = mo6027p2(i);
        PointF pointF = new PointF();
        if (p2 == 0) {
            return null;
        }
        if (this.f4721g == 0) {
            pointF.x = (float) p2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) p2;
        }
        return pointF;
    }

    @ts2
    /* renamed from: a1 */
    public View mo5220a1(View view, int i, RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var) {
        View I;
        View r;
        if (mo5828Q() == 0 || (I = mo5809I(view)) == null) {
            return null;
        }
        mo6018k3();
        int v2 = mo6039v2(i);
        if (v2 == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) I.getLayoutParams();
        boolean z = layoutParams.f4735c;
        C0843e eVar = layoutParams.f4734a;
        int N2 = v2 == 1 ? mo5994N2() : mo5992L2();
        mo6042w3(N2, c0Var);
        mo6026o3(v2);
        C0932n nVar = this.f4713a;
        nVar.f5155b = nVar.f5157c + N2;
        nVar.f5153a = (int) (((float) this.f4714a.mo6513o()) * 0.33333334f);
        C0932n nVar2 = this.f4713a;
        nVar2.f5156b = true;
        nVar2.f5154a = false;
        mo6047z2(wVar, nVar2, c0Var);
        this.f4726i = this.f4724h;
        if (!z && (r = eVar.mo6106r(N2, v2)) != null && r != I) {
            return r;
        }
        if (mo6010d3(v2)) {
            for (int i2 = this.f4720f - 1; i2 >= 0; i2--) {
                View r2 = this.f4718a[i2].mo6106r(N2, v2);
                if (r2 != null && r2 != I) {
                    return r2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f4720f; i3++) {
                View r3 = this.f4718a[i3].mo6106r(N2, v2);
                if (r3 != null && r3 != I) {
                    return r3;
                }
            }
        }
        boolean z2 = (this.f4722g ^ true) == (v2 == -1);
        if (!z) {
            View J = mo5266J(z2 ? eVar.mo6095g() : eVar.mo6098j());
            if (!(J == null || J == I)) {
                return J;
            }
        }
        if (mo6010d3(v2)) {
            for (int i4 = this.f4720f - 1; i4 >= 0; i4--) {
                if (i4 != eVar.f4767d) {
                    C0843e[] eVarArr = this.f4718a;
                    View J2 = mo5266J(z2 ? eVarArr[i4].mo6095g() : eVarArr[i4].mo6098j());
                    if (!(J2 == null || J2 == I)) {
                        return J2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f4720f; i5++) {
                C0843e[] eVarArr2 = this.f4718a;
                View J3 = mo5266J(z2 ? eVarArr2[i5].mo6095g() : eVarArr2[i5].mo6098j());
                if (J3 != null && J3 != I) {
                    return J3;
                }
            }
        }
        return null;
    }

    /* renamed from: a3 */
    public final void mo6007a3(View view, int i, int i2, boolean z) {
        mo5883m(view, this.f4709a);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin;
        Rect rect = this.f4709a;
        int z3 = mo6048z3(i, i3 + rect.left, layoutParams.rightMargin + rect.right);
        int i4 = layoutParams.topMargin;
        Rect rect2 = this.f4709a;
        int z32 = mo6048z3(i2, i4 + rect2.top, layoutParams.bottomMargin + rect2.bottom);
        if (z ? mo5864e2(view, z3, z32, layoutParams) : mo5857c2(view, z3, z32, layoutParams)) {
            view.measure(z3, z32);
        }
    }

    /* renamed from: b1 */
    public void mo5287b1(AccessibilityEvent accessibilityEvent) {
        super.mo5287b1(accessibilityEvent);
        if (mo5828Q() > 0) {
            View D2 = mo5984D2(false);
            View C2 = mo5983C2(false);
            if (D2 != null && C2 != null) {
                int s0 = mo5893s0(D2);
                int s02 = mo5893s0(C2);
                if (s0 < s02) {
                    accessibilityEvent.setFromIndex(s0);
                    accessibilityEvent.setToIndex(s02);
                    return;
                }
                accessibilityEvent.setFromIndex(s02);
                accessibilityEvent.setToIndex(s0);
            }
        }
    }

    /* renamed from: b3 */
    public final void mo6008b3(View view, LayoutParams layoutParams, boolean z) {
        int i;
        int i2;
        if (layoutParams.f4735c) {
            if (this.f4721g == 1) {
                i2 = this.f4731l;
            } else {
                mo6007a3(view, RecyclerView.C0819p.m5634R(mo5904z0(), mo5787A0(), mo5887o0() + mo5888p0(), layoutParams.width, true), this.f4731l, z);
                return;
            }
        } else if (this.f4721g == 1) {
            i2 = RecyclerView.C0819p.m5634R(this.f4723h, mo5787A0(), 0, layoutParams.width, false);
        } else {
            i2 = RecyclerView.C0819p.m5634R(mo5904z0(), mo5787A0(), mo5887o0() + mo5888p0(), layoutParams.width, true);
            i = RecyclerView.C0819p.m5634R(this.f4723h, mo5866f0(), 0, layoutParams.height, false);
            mo6007a3(view, i2, i, z);
        }
        i = RecyclerView.C0819p.m5634R(mo5862e0(), mo5866f0(), mo5891r0() + mo5884m0(), layoutParams.height, true);
        mo6007a3(view, i2, i, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014b, code lost:
        if (mo6029q2() != false) goto L_0x014f;
     */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6009c3(androidx.recyclerview.widget.RecyclerView.C0831w r9, androidx.recyclerview.widget.RecyclerView.C0797c0 r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f4710a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r8.f4712a
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f4725i
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo5609d()
            if (r1 != 0) goto L_0x0018
            r8.mo5797D1(r9)
            r0.mo6055c()
            return
        L_0x0018:
            boolean r1 = r0.f4743c
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f4725i
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r8.f4712a
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo6055c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.f4712a
            if (r5 == 0) goto L_0x0037
            r8.mo6019l2(r0)
            goto L_0x003e
        L_0x0037:
            r8.mo6018k3()
            boolean r5 = r8.f4724h
            r0.f4739a = r5
        L_0x003e:
            r8.mo6040v3(r10, r0)
            r0.f4743c = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.f4712a
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f4725i
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f4739a
            boolean r6 = r8.f4726i
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo6006Z2()
            boolean r6 = r8.f4728j
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r5 = r8.f4711a
            r5.mo6058b()
            r0.f4742b = r4
        L_0x0060:
            int r5 = r8.mo5828Q()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.f4712a
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f4759p
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f4742b
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.f4720f
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r5 = r8.f4718a
            r5 = r5[r1]
            r5.mo6093e()
            int r5 = r0.f4741b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r6 = r8.f4718a
            r6 = r6[r1]
            r6.mo6088A(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f4710a
            int[] r1 = r1.f4740a
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.f4720f
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r5 = r8.f4718a
            r5 = r5[r1]
            r5.mo6093e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f4710a
            int[] r6 = r6.f4740a
            r6 = r6[r1]
            r5.mo6088A(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.f4720f
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r5 = r8.f4718a
            r5 = r5[r1]
            boolean r6 = r8.f4724h
            int r7 = r0.f4741b
            r5.mo6090b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f4710a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r5 = r8.f4718a
            r1.mo6056d(r5)
        L_0x00c9:
            r8.mo5903z(r9)
            androidx.recyclerview.widget.n r1 = r8.f4713a
            r1.f5154a = r3
            r8.f4730k = r3
            androidx.recyclerview.widget.t r1 = r8.f4719b
            int r1 = r1.mo6513o()
            r8.mo6044x3(r1)
            int r1 = r0.f4737a
            r8.mo6042w3(r1, r10)
            boolean r1 = r0.f4739a
            if (r1 == 0) goto L_0x00f0
            r8.mo6026o3(r2)
            androidx.recyclerview.widget.n r1 = r8.f4713a
            r8.mo6047z2(r9, r1, r10)
            r8.mo6026o3(r4)
            goto L_0x00fb
        L_0x00f0:
            r8.mo6026o3(r4)
            androidx.recyclerview.widget.n r1 = r8.f4713a
            r8.mo6047z2(r9, r1, r10)
            r8.mo6026o3(r2)
        L_0x00fb:
            androidx.recyclerview.widget.n r1 = r8.f4713a
            int r2 = r0.f4737a
            int r5 = r1.f5157c
            int r2 = r2 + r5
            r1.f5155b = r2
            r8.mo6047z2(r9, r1, r10)
            r8.mo6016j3()
            int r1 = r8.mo5828Q()
            if (r1 <= 0) goto L_0x0121
            boolean r1 = r8.f4724h
            if (r1 == 0) goto L_0x011b
            r8.mo5990J2(r9, r10, r4)
            r8.mo5991K2(r9, r10, r3)
            goto L_0x0121
        L_0x011b:
            r8.mo5991K2(r9, r10, r4)
            r8.mo5990J2(r9, r10, r3)
        L_0x0121:
            if (r11 == 0) goto L_0x014e
            boolean r11 = r10.mo5615j()
            if (r11 != 0) goto L_0x014e
            int r11 = r8.f4729k
            if (r11 == 0) goto L_0x013f
            int r11 = r8.mo5828Q()
            if (r11 <= 0) goto L_0x013f
            boolean r11 = r8.f4730k
            if (r11 != 0) goto L_0x013d
            android.view.View r11 = r8.mo6004X2()
            if (r11 == 0) goto L_0x013f
        L_0x013d:
            r11 = 1
            goto L_0x0140
        L_0x013f:
            r11 = 0
        L_0x0140:
            if (r11 == 0) goto L_0x014e
            java.lang.Runnable r11 = r8.f4715a
            r8.mo5808H1(r11)
            boolean r11 = r8.mo6029q2()
            if (r11 == 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r4 = 0
        L_0x014f:
            boolean r11 = r10.mo5615j()
            if (r11 == 0) goto L_0x015a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f4710a
            r11.mo6055c()
        L_0x015a:
            boolean r11 = r0.f4739a
            r8.f4726i = r11
            boolean r11 = r8.mo6006Z2()
            r8.f4728j = r11
            if (r4 == 0) goto L_0x016e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f4710a
            r11.mo6055c()
            r8.mo6009c3(r9, r10, r3)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo6009c3(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$c0, boolean):void");
    }

    /* renamed from: d3 */
    public final boolean mo6010d3(int i) {
        if (this.f4721g == 0) {
            return (i == -1) != this.f4724h;
        }
        return ((i == -1) == this.f4724h) == mo6006Z2();
    }

    /* renamed from: e3 */
    public void mo6011e3(int i, RecyclerView.C0797c0 c0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo5994N2();
            i2 = 1;
        } else {
            i3 = mo5992L2();
            i2 = -1;
        }
        this.f4713a.f5154a = true;
        mo6042w3(i3, c0Var);
        mo6026o3(i2);
        C0932n nVar = this.f4713a;
        nVar.f5155b = i3 + nVar.f5157c;
        nVar.f5153a = Math.abs(i);
    }

    /* renamed from: f2 */
    public void mo5293f2(RecyclerView recyclerView, RecyclerView.C0797c0 c0Var, int i) {
        C0933o oVar = new C0933o(recyclerView.getContext());
        oVar.mo5589q(i);
        mo5870g2(oVar);
    }

    /* renamed from: f3 */
    public final void mo6012f3(View view) {
        for (int i = this.f4720f - 1; i >= 0; i--) {
            this.f4718a[i].mo6114z(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.f5159d == -1) goto L_0x0012;
     */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6013g3(androidx.recyclerview.widget.RecyclerView.C0831w r3, androidx.recyclerview.widget.C0932n r4) {
        /*
            r2 = this;
            boolean r0 = r4.f5154a
            if (r0 == 0) goto L_0x004d
            boolean r0 = r4.f5158c
            if (r0 == 0) goto L_0x0009
            goto L_0x004d
        L_0x0009:
            int r0 = r4.f5153a
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.f5159d
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.f5161f
        L_0x0014:
            r2.mo6014h3(r3, r4)
            goto L_0x004d
        L_0x0018:
            int r4 = r4.f5160e
        L_0x001a:
            r2.mo6015i3(r3, r4)
            goto L_0x004d
        L_0x001e:
            int r0 = r4.f5159d
            if (r0 != r1) goto L_0x0037
            int r0 = r4.f5160e
            int r1 = r2.mo5996P2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002c
            goto L_0x0012
        L_0x002c:
            int r1 = r4.f5161f
            int r4 = r4.f5153a
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0037:
            int r0 = r4.f5161f
            int r0 = r2.mo5997Q2(r0)
            int r1 = r4.f5161f
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0043
            goto L_0x0018
        L_0x0043:
            int r1 = r4.f5160e
            int r4 = r4.f5153a
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo6013g3(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.n):void");
    }

    /* renamed from: h3 */
    public final void mo6014h3(RecyclerView.C0831w wVar, int i) {
        int Q = mo5828Q() - 1;
        while (Q >= 0) {
            View P = mo5825P(Q);
            if (this.f4714a.mo6505g(P) >= i && this.f4714a.mo6516r(P) >= i) {
                LayoutParams layoutParams = (LayoutParams) P.getLayoutParams();
                if (layoutParams.f4735c) {
                    int i2 = 0;
                    while (i2 < this.f4720f) {
                        if (this.f4718a[i2].f4764a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f4720f; i3++) {
                        this.f4718a[i3].mo6112x();
                    }
                } else if (layoutParams.f4734a.f4764a.size() != 1) {
                    layoutParams.f4734a.mo6112x();
                } else {
                    return;
                }
                mo5802F1(P, wVar);
                Q--;
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public void mo5297i(String str) {
        if (this.f4712a == null) {
            super.mo5297i(str);
        }
    }

    /* renamed from: i1 */
    public void mo5222i1(RecyclerView recyclerView, int i, int i2) {
        mo6003W2(i, i2, 1);
    }

    /* renamed from: i3 */
    public final void mo6015i3(RecyclerView.C0831w wVar, int i) {
        while (mo5828Q() > 0) {
            View P = mo5825P(0);
            if (this.f4714a.mo6502d(P) <= i && this.f4714a.mo6515q(P) <= i) {
                LayoutParams layoutParams = (LayoutParams) P.getLayoutParams();
                if (layoutParams.f4735c) {
                    int i2 = 0;
                    while (i2 < this.f4720f) {
                        if (this.f4718a[i2].f4764a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f4720f; i3++) {
                        this.f4718a[i3].mo6113y();
                    }
                } else if (layoutParams.f4734a.f4764a.size() != 1) {
                    layoutParams.f4734a.mo6113y();
                } else {
                    return;
                }
                mo5802F1(P, wVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: j1 */
    public void mo5223j1(RecyclerView recyclerView) {
        this.f4711a.mo6058b();
        mo5821N1();
    }

    /* renamed from: j2 */
    public boolean mo5224j2() {
        return this.f4712a == null;
    }

    /* renamed from: j3 */
    public final void mo6016j3() {
        if (this.f4719b.mo6510l() != 1073741824) {
            float f = 0.0f;
            int Q = mo5828Q();
            for (int i = 0; i < Q; i++) {
                View P = mo5825P(i);
                float e = (float) this.f4719b.mo6503e(P);
                if (e >= f) {
                    if (((LayoutParams) P.getLayoutParams()).mo6050k()) {
                        e = (e * 1.0f) / ((float) this.f4720f);
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f4723h;
            int round = Math.round(f * ((float) this.f4720f));
            if (this.f4719b.mo6510l() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f4719b.mo6513o());
            }
            mo6044x3(round);
            if (this.f4723h != i2) {
                for (int i3 = 0; i3 < Q; i3++) {
                    View P2 = mo5825P(i3);
                    LayoutParams layoutParams = (LayoutParams) P2.getLayoutParams();
                    if (!layoutParams.f4735c) {
                        if (!mo6006Z2() || this.f4721g != 1) {
                            int i4 = layoutParams.f4734a.f4767d;
                            int i5 = this.f4721g;
                            int i6 = (this.f4723h * i4) - (i4 * i2);
                            if (i5 == 1) {
                                P2.offsetLeftAndRight(i6);
                            } else {
                                P2.offsetTopAndBottom(i6);
                            }
                        } else {
                            int i7 = this.f4720f;
                            int i8 = layoutParams.f4734a.f4767d;
                            P2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f4723h) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k1 */
    public void mo5226k1(RecyclerView recyclerView, int i, int i2, int i3) {
        mo6003W2(i, i2, 8);
    }

    /* renamed from: k2 */
    public final void mo6017k2(View view) {
        for (int i = this.f4720f - 1; i >= 0; i--) {
            this.f4718a[i].mo6089a(view);
        }
    }

    /* renamed from: k3 */
    public final void mo6018k3() {
        this.f4724h = (this.f4721g == 1 || !mo6006Z2()) ? this.f4722g : !this.f4722g;
    }

    /* renamed from: l1 */
    public void mo5227l1(RecyclerView recyclerView, int i, int i2) {
        mo6003W2(i, i2, 2);
    }

    /* renamed from: l2 */
    public final void mo6019l2(C0837b bVar) {
        boolean z;
        C0841d dVar = this.f4712a;
        int i = dVar.f4759p;
        if (i > 0) {
            if (i == this.f4720f) {
                for (int i2 = 0; i2 < this.f4720f; i2++) {
                    this.f4718a[i2].mo6093e();
                    C0841d dVar2 = this.f4712a;
                    int i3 = dVar2.f4752a[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += dVar2.f4755c ? this.f4714a.mo6507i() : this.f4714a.mo6512n();
                    }
                    this.f4718a[i2].mo6088A(i3);
                }
            } else {
                dVar.mo6081b();
                C0841d dVar3 = this.f4712a;
                dVar3.f4757n = dVar3.f4758o;
            }
        }
        C0841d dVar4 = this.f4712a;
        this.f4728j = dVar4.f4756d;
        mo6030q3(dVar4.f4753b);
        mo6018k3();
        C0841d dVar5 = this.f4712a;
        int i4 = dVar5.f4757n;
        if (i4 != -1) {
            this.f4725i = i4;
            z = dVar5.f4755c;
        } else {
            z = this.f4724h;
        }
        bVar.f4739a = z;
        if (dVar5.f4760q > 1) {
            C0838c cVar = this.f4711a;
            cVar.f4746a = dVar5.f4754b;
            cVar.f4745a = dVar5.f4751a;
        }
    }

    /* renamed from: l3 */
    public int mo6020l3(int i, RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var) {
        if (mo5828Q() == 0 || i == 0) {
            return 0;
        }
        mo6011e3(i, c0Var);
        int z2 = mo6047z2(wVar, this.f4713a, c0Var);
        if (this.f4713a.f5153a >= z2) {
            i = i < 0 ? -z2 : z2;
        }
        this.f4714a.mo6518t(-i);
        this.f4726i = this.f4724h;
        C0932n nVar = this.f4713a;
        nVar.f5153a = 0;
        mo6013g3(wVar, nVar);
        return i;
    }

    /* renamed from: m2 */
    public boolean mo6021m2() {
        int q = this.f4718a[0].mo6105q(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4720f; i++) {
            if (this.f4718a[i].mo6105q(Integer.MIN_VALUE) != q) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m3 */
    public void mo6022m3(int i, int i2) {
        C0841d dVar = this.f4712a;
        if (dVar != null) {
            dVar.mo6080a();
        }
        this.f4725i = i;
        this.f4727j = i2;
        mo5821N1();
    }

    /* renamed from: n */
    public boolean mo5304n() {
        return this.f4721g == 0;
    }

    /* renamed from: n1 */
    public void mo5229n1(RecyclerView recyclerView, int i, int i2, Object obj) {
        mo6003W2(i, i2, 4);
    }

    /* renamed from: n2 */
    public boolean mo6023n2() {
        int u = this.f4718a[0].mo6109u(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4720f; i++) {
            if (this.f4718a[i].mo6109u(Integer.MIN_VALUE) != u) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n3 */
    public void mo6024n3(int i) {
        mo5297i((String) null);
        if (i != this.f4729k) {
            if (i == 0 || i == 2) {
                this.f4729k = i;
                mo5821N1();
                return;
            }
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
    }

    /* renamed from: o */
    public boolean mo5307o() {
        return this.f4721g == 1;
    }

    /* renamed from: o1 */
    public void mo5230o1(RecyclerView.C0831w wVar, RecyclerView.C0797c0 c0Var) {
        mo6009c3(wVar, c0Var, true);
    }

    /* renamed from: o2 */
    public final void mo6025o2(View view, LayoutParams layoutParams, C0932n nVar) {
        if (nVar.f5159d == 1) {
            if (layoutParams.f4735c) {
                mo6017k2(view);
            } else {
                layoutParams.f4734a.mo6089a(view);
            }
        } else if (layoutParams.f4735c) {
            mo6012f3(view);
        } else {
            layoutParams.f4734a.mo6114z(view);
        }
    }

    /* renamed from: o3 */
    public final void mo6026o3(int i) {
        C0932n nVar = this.f4713a;
        nVar.f5159d = i;
        int i2 = 1;
        if (this.f4724h != (i == -1)) {
            i2 = -1;
        }
        nVar.f5157c = i2;
    }

    /* renamed from: p */
    public boolean mo5231p(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: p1 */
    public void mo5232p1(RecyclerView.C0797c0 c0Var) {
        super.mo5232p1(c0Var);
        this.f4725i = -1;
        this.f4727j = Integer.MIN_VALUE;
        this.f4712a = null;
        this.f4710a.mo6055c();
    }

    /* renamed from: p2 */
    public final int mo6027p2(int i) {
        if (mo5828Q() == 0) {
            return this.f4724h ? 1 : -1;
        }
        return (i < mo5992L2()) != this.f4724h ? -1 : 1;
    }

    /* renamed from: p3 */
    public void mo6028p3(int i) {
        if (i == 0 || i == 1) {
            mo5297i((String) null);
            if (i != this.f4721g) {
                this.f4721g = i;
                C0942t tVar = this.f4714a;
                this.f4714a = this.f4719b;
                this.f4719b = tVar;
                mo5821N1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: q2 */
    public boolean mo6029q2() {
        int i;
        int i2;
        if (mo5828Q() == 0 || this.f4729k == 0 || !mo5799E0()) {
            return false;
        }
        if (this.f4724h) {
            i2 = mo5994N2();
            i = mo5992L2();
        } else {
            i2 = mo5992L2();
            i = mo5994N2();
        }
        if (i2 == 0 && mo6004X2() != null) {
            this.f4711a.mo6058b();
        } else if (!this.f4730k) {
            return false;
        } else {
            int i3 = this.f4724h ? -1 : 1;
            int i4 = i + 1;
            C0838c.C0839a e = this.f4711a.mo6061e(i2, i4, i3, true);
            if (e == null) {
                this.f4730k = false;
                this.f4711a.mo6060d(i4);
                return false;
            }
            C0838c.C0839a e2 = this.f4711a.mo6061e(i2, e.f4749n, i3 * -1, true);
            if (e2 == null) {
                this.f4711a.mo6060d(e.f4749n);
            } else {
                this.f4711a.mo6060d(e2.f4749n + 1);
            }
        }
        mo5824O1();
        mo5821N1();
        return true;
    }

    /* renamed from: q3 */
    public void mo6030q3(boolean z) {
        mo5297i((String) null);
        C0841d dVar = this.f4712a;
        if (!(dVar == null || dVar.f4753b == z)) {
            dVar.f4753b = z;
        }
        this.f4722g = z;
        mo5821N1();
    }

    @hl3({hl3.C2354a.f13185a})
    /* renamed from: r */
    public void mo5314r(int i, int i2, RecyclerView.C0797c0 c0Var, RecyclerView.C0819p.C0822c cVar) {
        int i3;
        int i4;
        if (this.f4721g != 0) {
            i = i2;
        }
        if (mo5828Q() != 0 && i != 0) {
            mo6011e3(i, c0Var);
            int[] iArr = this.f4717a;
            if (iArr == null || iArr.length < this.f4720f) {
                this.f4717a = new int[this.f4720f];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f4720f; i6++) {
                C0932n nVar = this.f4713a;
                if (nVar.f5157c == -1) {
                    i4 = nVar.f5160e;
                    i3 = this.f4718a[i6].mo6109u(i4);
                } else {
                    i4 = this.f4718a[i6].mo6105q(nVar.f5161f);
                    i3 = this.f4713a.f5161f;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f4717a[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f4717a, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f4713a.mo6462a(c0Var); i8++) {
                cVar.mo5911a(this.f4713a.f5155b, this.f4717a[i8]);
                C0932n nVar2 = this.f4713a;
                nVar2.f5155b += nVar2.f5157c;
            }
        }
    }

    /* renamed from: r2 */
    public final boolean mo6031r2(C0843e eVar) {
        if (this.f4724h) {
            if (eVar.mo6104p() < this.f4714a.mo6507i()) {
                ArrayList<View> arrayList = eVar.f4764a;
                return !eVar.mo6107s(arrayList.get(arrayList.size() - 1)).f4735c;
            }
        } else if (eVar.mo6108t() > this.f4714a.mo6512n()) {
            return !eVar.mo6107s(eVar.f4764a.get(0)).f4735c;
        }
        return false;
    }

    /* renamed from: r3 */
    public void mo6032r3(int i) {
        mo5297i((String) null);
        if (i != this.f4720f) {
            mo6005Y2();
            this.f4720f = i;
            this.f4716a = new BitSet(this.f4720f);
            this.f4718a = new C0843e[this.f4720f];
            for (int i2 = 0; i2 < this.f4720f; i2++) {
                this.f4718a[i2] = new C0843e(i2);
            }
            mo5821N1();
        }
    }

    /* renamed from: s2 */
    public final int mo6033s2(RecyclerView.C0797c0 c0Var) {
        if (mo5828Q() == 0) {
            return 0;
        }
        return C0949w.m6598a(c0Var, this.f4714a, mo5984D2(!this.f4732l), mo5983C2(!this.f4732l), this, this.f4732l);
    }

    /* renamed from: s3 */
    public final void mo6034s3(int i, int i2) {
        for (int i3 = 0; i3 < this.f4720f; i3++) {
            if (!this.f4718a[i3].f4764a.isEmpty()) {
                mo6046y3(this.f4718a[i3], i, i2);
            }
        }
    }

    /* renamed from: t */
    public int mo5320t(RecyclerView.C0797c0 c0Var) {
        return mo6033s2(c0Var);
    }

    /* renamed from: t1 */
    public void mo5321t1(Parcelable parcelable) {
        if (parcelable instanceof C0841d) {
            C0841d dVar = (C0841d) parcelable;
            this.f4712a = dVar;
            if (this.f4725i != -1) {
                dVar.mo6080a();
                this.f4712a.mo6081b();
            }
            mo5821N1();
        }
    }

    /* renamed from: t2 */
    public final int mo6035t2(RecyclerView.C0797c0 c0Var) {
        if (mo5828Q() == 0) {
            return 0;
        }
        return C0949w.m6599b(c0Var, this.f4714a, mo5984D2(!this.f4732l), mo5983C2(!this.f4732l), this, this.f4732l, this.f4724h);
    }

    /* renamed from: t3 */
    public final boolean mo6036t3(RecyclerView.C0797c0 c0Var, C0837b bVar) {
        boolean z = this.f4726i;
        int d = c0Var.mo5609d();
        bVar.f4737a = z ? mo5988H2(d) : mo5982B2(d);
        bVar.f4741b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: u */
    public int mo5234u(RecyclerView.C0797c0 c0Var) {
        return mo6035t2(c0Var);
    }

    /* renamed from: u1 */
    public Parcelable mo5323u1() {
        int i;
        int i2;
        int[] iArr;
        if (this.f4712a != null) {
            return new C0841d(this.f4712a);
        }
        C0841d dVar = new C0841d();
        dVar.f4753b = this.f4722g;
        dVar.f4755c = this.f4726i;
        dVar.f4756d = this.f4728j;
        C0838c cVar = this.f4711a;
        if (cVar == null || (iArr = cVar.f4746a) == null) {
            dVar.f4760q = 0;
        } else {
            dVar.f4754b = iArr;
            dVar.f4760q = iArr.length;
            dVar.f4751a = cVar.f4745a;
        }
        if (mo5828Q() > 0) {
            dVar.f4757n = this.f4726i ? mo5994N2() : mo5992L2();
            dVar.f4758o = mo5985E2();
            int i3 = this.f4720f;
            dVar.f4759p = i3;
            dVar.f4752a = new int[i3];
            for (int i4 = 0; i4 < this.f4720f; i4++) {
                if (this.f4726i) {
                    i = this.f4718a[i4].mo6105q(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f4714a.mo6507i();
                    } else {
                        dVar.f4752a[i4] = i;
                    }
                } else {
                    i = this.f4718a[i4].mo6109u(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f4714a.mo6512n();
                    } else {
                        dVar.f4752a[i4] = i;
                    }
                }
                i -= i2;
                dVar.f4752a[i4] = i;
            }
        } else {
            dVar.f4757n = -1;
            dVar.f4758o = -1;
            dVar.f4759p = 0;
        }
        return dVar;
    }

    /* renamed from: u2 */
    public final int mo6037u2(RecyclerView.C0797c0 c0Var) {
        if (mo5828Q() == 0) {
            return 0;
        }
        return C0949w.m6600c(c0Var, this.f4714a, mo5984D2(!this.f4732l), mo5983C2(!this.f4732l), this, this.f4732l);
    }

    /* renamed from: u3 */
    public boolean mo6038u3(RecyclerView.C0797c0 c0Var, C0837b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!c0Var.mo5615j() && (i = this.f4725i) != -1) {
            if (i < 0 || i >= c0Var.mo5609d()) {
                this.f4725i = -1;
                this.f4727j = Integer.MIN_VALUE;
            } else {
                C0841d dVar = this.f4712a;
                if (dVar == null || dVar.f4757n == -1 || dVar.f4759p < 1) {
                    View J = mo5266J(this.f4725i);
                    if (J != null) {
                        bVar.f4737a = this.f4724h ? mo5994N2() : mo5992L2();
                        if (this.f4727j != Integer.MIN_VALUE) {
                            if (bVar.f4739a) {
                                i3 = this.f4714a.mo6507i() - this.f4727j;
                                i2 = this.f4714a.mo6502d(J);
                            } else {
                                i3 = this.f4714a.mo6512n() + this.f4727j;
                                i2 = this.f4714a.mo6505g(J);
                            }
                            bVar.f4741b = i3 - i2;
                            return true;
                        } else if (this.f4714a.mo6503e(J) > this.f4714a.mo6513o()) {
                            bVar.f4741b = bVar.f4739a ? this.f4714a.mo6507i() : this.f4714a.mo6512n();
                            return true;
                        } else {
                            int g = this.f4714a.mo6505g(J) - this.f4714a.mo6512n();
                            if (g < 0) {
                                bVar.f4741b = -g;
                                return true;
                            }
                            int i4 = this.f4714a.mo6507i() - this.f4714a.mo6502d(J);
                            if (i4 < 0) {
                                bVar.f4741b = i4;
                                return true;
                            }
                            bVar.f4741b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i5 = this.f4725i;
                        bVar.f4737a = i5;
                        int i6 = this.f4727j;
                        if (i6 == Integer.MIN_VALUE) {
                            if (mo6027p2(i5) == 1) {
                                z = true;
                            }
                            bVar.f4739a = z;
                            bVar.mo6053a();
                        } else {
                            bVar.mo6054b(i6);
                        }
                        bVar.f4742b = true;
                    }
                } else {
                    bVar.f4741b = Integer.MIN_VALUE;
                    bVar.f4737a = this.f4725i;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public int mo5236v(RecyclerView.C0797c0 c0Var) {
        return mo6037u2(c0Var);
    }

    /* renamed from: v1 */
    public void mo5896v1(int i) {
        if (i == 0) {
            mo6029q2();
        }
    }

    /* renamed from: v2 */
    public final int mo6039v2(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f4721g == 1) ? 1 : Integer.MIN_VALUE : this.f4721g == 0 ? 1 : Integer.MIN_VALUE : this.f4721g == 1 ? -1 : Integer.MIN_VALUE : this.f4721g == 0 ? -1 : Integer.MIN_VALUE : (this.f4721g != 1 && mo6006Z2()) ? -1 : 1 : (this.f4721g != 1 && mo6006Z2()) ? 1 : -1;
    }

    /* renamed from: v3 */
    public void mo6040v3(RecyclerView.C0797c0 c0Var, C0837b bVar) {
        if (!mo6038u3(c0Var, bVar) && !mo6036t3(c0Var, bVar)) {
            bVar.mo6053a();
            bVar.f4737a = 0;
        }
    }

    /* renamed from: w */
    public int mo5326w(RecyclerView.C0797c0 c0Var) {
        return mo6033s2(c0Var);
    }

    /* renamed from: w2 */
    public final C0838c.C0839a mo6041w2(int i) {
        C0838c.C0839a aVar = new C0838c.C0839a();
        aVar.f4747a = new int[this.f4720f];
        for (int i2 = 0; i2 < this.f4720f; i2++) {
            aVar.f4747a[i2] = i - this.f4718a[i2].mo6105q(i);
        }
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: w3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6042w3(int r5, androidx.recyclerview.widget.RecyclerView.C0797c0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.n r0 = r4.f4713a
            r1 = 0
            r0.f5153a = r1
            r0.f5155b = r5
            boolean r0 = r4.mo5817M0()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.mo5612g()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f4724h
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.t r5 = r4.f4714a
            int r5 = r5.mo6513o()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.t r5 = r4.f4714a
            int r5 = r5.mo6513o()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.mo5835U()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.n r0 = r4.f4713a
            androidx.recyclerview.widget.t r3 = r4.f4714a
            int r3 = r3.mo6512n()
            int r3 = r3 - r6
            r0.f5160e = r3
            androidx.recyclerview.widget.n r6 = r4.f4713a
            androidx.recyclerview.widget.t r0 = r4.f4714a
            int r0 = r0.mo6507i()
            int r0 = r0 + r5
            r6.f5161f = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.n r0 = r4.f4713a
            androidx.recyclerview.widget.t r3 = r4.f4714a
            int r3 = r3.mo6506h()
            int r3 = r3 + r5
            r0.f5161f = r3
            androidx.recyclerview.widget.n r5 = r4.f4713a
            int r6 = -r6
            r5.f5160e = r6
        L_0x005d:
            androidx.recyclerview.widget.n r5 = r4.f4713a
            r5.f5156b = r1
            r5.f5154a = r2
            androidx.recyclerview.widget.t r6 = r4.f4714a
            int r6 = r6.mo6510l()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.t r6 = r4.f4714a
            int r6 = r6.mo6506h()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f5158c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo6042w3(int, androidx.recyclerview.widget.RecyclerView$c0):void");
    }

    /* renamed from: x */
    public int mo5239x(RecyclerView.C0797c0 c0Var) {
        return mo6035t2(c0Var);
    }

    /* renamed from: x2 */
    public final C0838c.C0839a mo6043x2(int i) {
        C0838c.C0839a aVar = new C0838c.C0839a();
        aVar.f4747a = new int[this.f4720f];
        for (int i2 = 0; i2 < this.f4720f; i2++) {
            aVar.f4747a[i2] = this.f4718a[i2].mo6109u(i) - i;
        }
        return aVar;
    }

    /* renamed from: x3 */
    public void mo6044x3(int i) {
        this.f4723h = i / this.f4720f;
        this.f4731l = View.MeasureSpec.makeMeasureSpec(i, this.f4719b.mo6510l());
    }

    /* renamed from: y */
    public int mo5241y(RecyclerView.C0797c0 c0Var) {
        return mo6037u2(c0Var);
    }

    /* renamed from: y2 */
    public final void mo6045y2() {
        this.f4714a = C0942t.m6518b(this, this.f4721g);
        this.f4719b = C0942t.m6518b(this, 1 - this.f4721g);
    }

    /* renamed from: y3 */
    public final void mo6046y3(C0843e eVar, int i, int i2) {
        int o = eVar.mo6103o();
        if (i == -1) {
            if (eVar.mo6108t() + o > i2) {
                return;
            }
        } else if (eVar.mo6104p() - o < i2) {
            return;
        }
        this.f4716a.set(eVar.f4767d, false);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* renamed from: z2 */
    public final int mo6047z2(RecyclerView.C0831w wVar, C0932n nVar, RecyclerView.C0797c0 c0Var) {
        int i;
        C0843e eVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        RecyclerView.C0831w wVar2 = wVar;
        C0932n nVar2 = nVar;
        ? r9 = 0;
        this.f4716a.set(0, this.f4720f, true);
        if (this.f4713a.f5158c) {
            i = nVar2.f5159d == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = nVar2.f5159d == 1 ? nVar2.f5161f + nVar2.f5153a : nVar2.f5160e - nVar2.f5153a;
        }
        mo6034s3(nVar2.f5159d, i);
        int i8 = this.f4724h ? this.f4714a.mo6507i() : this.f4714a.mo6512n();
        boolean z = false;
        while (nVar.mo6462a(c0Var) && (this.f4713a.f5158c || !this.f4716a.isEmpty())) {
            View b = nVar2.mo6463b(wVar2);
            LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
            int d = layoutParams.mo5562d();
            int g = this.f4711a.mo6063g(d);
            boolean z2 = g == -1;
            if (z2) {
                eVar = layoutParams.f4735c ? this.f4718a[r9] : mo5999S2(nVar2);
                this.f4711a.mo6070n(d, eVar);
            } else {
                eVar = this.f4718a[g];
            }
            C0843e eVar2 = eVar;
            layoutParams.f4734a = eVar2;
            if (nVar2.f5159d == 1) {
                mo5861e(b);
            } else {
                mo5865f(b, r9);
            }
            mo6008b3(b, layoutParams, r9);
            if (nVar2.f5159d == 1) {
                int O2 = layoutParams.f4735c ? mo5995O2(i8) : eVar2.mo6105q(i8);
                int e = this.f4714a.mo6503e(b) + O2;
                if (z2 && layoutParams.f4735c) {
                    C0838c.C0839a w2 = mo6041w2(O2);
                    w2.f4750o = -1;
                    w2.f4749n = d;
                    this.f4711a.mo6057a(w2);
                }
                i2 = e;
                i3 = O2;
            } else {
                int R2 = layoutParams.f4735c ? mo5998R2(i8) : eVar2.mo6109u(i8);
                i3 = R2 - this.f4714a.mo6503e(b);
                if (z2 && layoutParams.f4735c) {
                    C0838c.C0839a x2 = mo6043x2(R2);
                    x2.f4750o = 1;
                    x2.f4749n = d;
                    this.f4711a.mo6057a(x2);
                }
                i2 = R2;
            }
            if (layoutParams.f4735c && nVar2.f5157c == -1) {
                if (!z2) {
                    if (!(nVar2.f5159d == 1 ? mo6021m2() : mo6023n2())) {
                        C0838c.C0839a f = this.f4711a.mo6062f(d);
                        if (f != null) {
                            f.f4748b = true;
                        }
                    }
                }
                this.f4730k = true;
            }
            mo6025o2(b, layoutParams, nVar2);
            if (!mo6006Z2() || this.f4721g != 1) {
                int n = layoutParams.f4735c ? this.f4719b.mo6512n() : (eVar2.f4767d * this.f4723h) + this.f4719b.mo6512n();
                i5 = n;
                i4 = this.f4719b.mo6503e(b) + n;
            } else {
                int i9 = layoutParams.f4735c ? this.f4719b.mo6507i() : this.f4719b.mo6507i() - (((this.f4720f - 1) - eVar2.f4767d) * this.f4723h);
                i4 = i9;
                i5 = i9 - this.f4719b.mo6503e(b);
            }
            if (this.f4721g == 1) {
                staggeredGridLayoutManager = this;
                view = b;
                i7 = i5;
                i5 = i3;
                i6 = i4;
            } else {
                staggeredGridLayoutManager = this;
                view = b;
                i7 = i3;
                i6 = i2;
                i2 = i4;
            }
            staggeredGridLayoutManager.mo5826P0(view, i7, i5, i6, i2);
            if (layoutParams.f4735c) {
                mo6034s3(this.f4713a.f5159d, i);
            } else {
                mo6046y3(eVar2, this.f4713a.f5159d, i);
            }
            mo6013g3(wVar2, this.f4713a);
            if (this.f4713a.f5156b && b.hasFocusable()) {
                if (layoutParams.f4735c) {
                    this.f4716a.clear();
                } else {
                    this.f4716a.set(eVar2.f4767d, false);
                    z = true;
                    r9 = 0;
                }
            }
            z = true;
            r9 = 0;
        }
        if (!z) {
            mo6013g3(wVar2, this.f4713a);
        }
        int n2 = this.f4713a.f5159d == -1 ? this.f4714a.mo6512n() - mo5998R2(this.f4714a.mo6512n()) : mo5995O2(this.f4714a.mo6507i()) - this.f4714a.mo6507i();
        if (n2 > 0) {
            return Math.min(nVar2.f5153a, n2);
        }
        return 0;
    }

    /* renamed from: z3 */
    public final int mo6048z3(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }
}
