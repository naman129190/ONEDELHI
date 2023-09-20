package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.C0945u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C2018e2;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.ic3;
import com.onedelhi.secure.js1;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.l34;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.yz0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ViewPager2 extends ViewGroup {

    /* renamed from: e */
    public static boolean f5931e = true;

    /* renamed from: q */
    public static final int f5932q = 0;

    /* renamed from: r */
    public static final int f5933r = 1;

    /* renamed from: s */
    public static final int f5934s = 0;

    /* renamed from: t */
    public static final int f5935t = 1;

    /* renamed from: u */
    public static final int f5936u = 2;

    /* renamed from: v */
    public static final int f5937v = -1;

    /* renamed from: a */
    public final Rect f5938a = new Rect();

    /* renamed from: a */
    public Parcelable f5939a;

    /* renamed from: a */
    public LinearLayoutManager f5940a;

    /* renamed from: a */
    public RecyclerView.C0808j f5941a = new C1125a();

    /* renamed from: a */
    public RecyclerView.C0812m f5942a = null;

    /* renamed from: a */
    public RecyclerView f5943a;

    /* renamed from: a */
    public C0945u f5944a;

    /* renamed from: a */
    public C1129e f5945a;

    /* renamed from: a */
    public C1147a f5946a = new C1147a(3);

    /* renamed from: a */
    public C1150d f5947a;

    /* renamed from: a */
    public C1151e f5948a;

    /* renamed from: a */
    public yz0 f5949a;

    /* renamed from: b */
    public final Rect f5950b = new Rect();

    /* renamed from: b */
    public C1147a f5951b;

    /* renamed from: b */
    public boolean f5952b = false;

    /* renamed from: c */
    public boolean f5953c = false;

    /* renamed from: d */
    public boolean f5954d = true;

    /* renamed from: n */
    public int f5955n;

    /* renamed from: o */
    public int f5956o = -1;

    /* renamed from: p */
    public int f5957p = -1;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    public class C1125a extends C1131g {
        public C1125a() {
            super((C1125a) null);
        }

        /* renamed from: a */
        public void mo5739a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f5952b = true;
            viewPager2.f5948a.mo7348n();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    public class C1126b extends C1134j {
        public C1126b() {
        }

        /* renamed from: a */
        public void mo7240a(int i) {
            if (i == 0) {
                ViewPager2.this.mo7293x();
            }
        }

        /* renamed from: c */
        public void mo7241c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f5955n != i) {
                viewPager2.f5955n = i;
                viewPager2.f5945a.mo7310q();
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    public class C1127c extends C1134j {
        public C1127c() {
        }

        /* renamed from: c */
        public void mo7241c(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f5943a.requestFocus(2);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    public class C1128d implements RecyclerView.C0824q {
        public C1128d() {
        }

        /* renamed from: c */
        public void mo5912c(@mr2 View view) {
        }

        /* renamed from: e */
        public void mo5913e(@mr2 View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (layoutParams.width != -1 || layoutParams.height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    public abstract class C1129e {
        public C1129e() {
        }

        public /* synthetic */ C1129e(ViewPager2 viewPager2, C1125a aVar) {
            this();
        }

        /* renamed from: a */
        public boolean mo7294a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo7295b(int i) {
            return false;
        }

        /* renamed from: c */
        public boolean mo7296c(int i, Bundle bundle) {
            return false;
        }

        /* renamed from: d */
        public boolean mo7297d() {
            return false;
        }

        /* renamed from: e */
        public void mo7298e(@ts2 RecyclerView.C0805h<?> hVar) {
        }

        /* renamed from: f */
        public void mo7299f(@ts2 RecyclerView.C0805h<?> hVar) {
        }

        /* renamed from: g */
        public String mo7300g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: h */
        public void mo7301h(@mr2 C1147a aVar, @mr2 RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo7302i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* renamed from: j */
        public void mo7303j(@mr2 C1638a2 a2Var) {
        }

        /* renamed from: k */
        public boolean mo7304k(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: l */
        public boolean mo7305l(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: m */
        public void mo7306m() {
        }

        /* renamed from: n */
        public CharSequence mo7307n() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: o */
        public void mo7308o(@mr2 AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: p */
        public void mo7309p() {
        }

        /* renamed from: q */
        public void mo7310q() {
        }

        /* renamed from: r */
        public void mo7311r() {
        }

        /* renamed from: s */
        public void mo7312s() {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    public class C1130f extends C1129e {
        public C1130f() {
            super(ViewPager2.this, (C1125a) null);
        }

        /* renamed from: b */
        public boolean mo7295b(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.mo7266l();
        }

        /* renamed from: d */
        public boolean mo7297d() {
            return true;
        }

        /* renamed from: j */
        public void mo7303j(@mr2 C1638a2 a2Var) {
            if (!ViewPager2.this.mo7266l()) {
                a2Var.mo12512K0(C1638a2.C1639a.f8651n);
                a2Var.mo12512K0(C1638a2.C1639a.f8650m);
                a2Var.mo12498F1(false);
            }
        }

        /* renamed from: k */
        public boolean mo7304k(int i) {
            if (mo7295b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        /* renamed from: n */
        public CharSequence mo7307n() {
            if (mo7297d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    public static abstract class C1131g extends RecyclerView.C0808j {
        public C1131g() {
        }

        public /* synthetic */ C1131g(C1125a aVar) {
            this();
        }

        /* renamed from: a */
        public abstract void mo5739a();

        /* renamed from: b */
        public final void mo5740b(int i, int i2) {
            mo5739a();
        }

        /* renamed from: c */
        public final void mo5741c(int i, int i2, @ts2 Object obj) {
            mo5739a();
        }

        /* renamed from: d */
        public final void mo5742d(int i, int i2) {
            mo5739a();
        }

        /* renamed from: e */
        public final void mo5743e(int i, int i2, int i3) {
            mo5739a();
        }

        /* renamed from: f */
        public final void mo5744f(int i, int i2) {
            mo5739a();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    public class C1132h extends LinearLayoutManager {
        public C1132h(Context context) {
            super(context);
        }

        /* renamed from: M1 */
        public boolean mo5818M1(@mr2 RecyclerView recyclerView, @mr2 View view, @mr2 Rect rect, boolean z, boolean z2) {
            return false;
        }

        /* renamed from: d1 */
        public void mo5860d1(@mr2 RecyclerView.C0831w wVar, @mr2 RecyclerView.C0797c0 c0Var, @mr2 C1638a2 a2Var) {
            super.mo5860d1(wVar, c0Var, a2Var);
            ViewPager2.this.f5945a.mo7303j(a2Var);
        }

        /* renamed from: k2 */
        public void mo5299k2(@mr2 RecyclerView.C0797c0 c0Var, @mr2 int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo5299k2(c0Var, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        /* renamed from: y1 */
        public boolean mo5902y1(@mr2 RecyclerView.C0831w wVar, @mr2 RecyclerView.C0797c0 c0Var, int i, @ts2 Bundle bundle) {
            return ViewPager2.this.f5945a.mo7295b(i) ? ViewPager2.this.f5945a.mo7304k(i) : super.mo5902y1(wVar, c0Var, i, bundle);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    @js1(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public @interface C1133i {
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    public static abstract class C1134j {
        /* renamed from: a */
        public void mo7240a(int i) {
        }

        /* renamed from: b */
        public void mo7313b(int i, float f, @e83 int i2) {
        }

        /* renamed from: c */
        public void mo7241c(int i) {
        }
    }

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public @interface C1135k {
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    public class C1136l extends C1129e {

        /* renamed from: a */
        public RecyclerView.C0808j f5965a;

        /* renamed from: a */
        public final C2018e2 f5966a = new C1137a();

        /* renamed from: b */
        public final C2018e2 f5968b = new C1138b();

        /* renamed from: androidx.viewpager2.widget.ViewPager2$l$a */
        public class C1137a implements C2018e2 {
            public C1137a() {
            }

            /* renamed from: a */
            public boolean mo4110a(@mr2 View view, @ts2 C2018e2.C2019a aVar) {
                C1136l.this.mo7316v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$l$b */
        public class C1138b implements C2018e2 {
            public C1138b() {
            }

            /* renamed from: a */
            public boolean mo4110a(@mr2 View view, @ts2 C2018e2.C2019a aVar) {
                C1136l.this.mo7316v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$l$c */
        public class C1139c extends C1131g {
            public C1139c() {
                super((C1125a) null);
            }

            /* renamed from: a */
            public void mo5739a() {
                C1136l.this.mo7317w();
            }
        }

        public C1136l() {
            super(ViewPager2.this, (C1125a) null);
        }

        /* renamed from: a */
        public boolean mo7294a() {
            return true;
        }

        /* renamed from: c */
        public boolean mo7296c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        /* renamed from: e */
        public void mo7298e(@ts2 RecyclerView.C0805h<?> hVar) {
            mo7317w();
            if (hVar != null) {
                hVar.mo5703F(this.f5965a);
            }
        }

        /* renamed from: f */
        public void mo7299f(@ts2 RecyclerView.C0805h<?> hVar) {
            if (hVar != null) {
                hVar.mo5706I(this.f5965a);
            }
        }

        /* renamed from: g */
        public String mo7300g() {
            if (mo7294a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        /* renamed from: h */
        public void mo7301h(@mr2 C1147a aVar, @mr2 RecyclerView recyclerView) {
            jt4.m18906R1(recyclerView, 2);
            this.f5965a = new C1139c();
            if (jt4.m18916V(ViewPager2.this) == 0) {
                jt4.m18906R1(ViewPager2.this, 1);
            }
        }

        /* renamed from: i */
        public void mo7302i(AccessibilityNodeInfo accessibilityNodeInfo) {
            mo7314t(accessibilityNodeInfo);
            mo7315u(accessibilityNodeInfo);
        }

        /* renamed from: l */
        public boolean mo7305l(int i, Bundle bundle) {
            if (mo7296c(i, bundle)) {
                mo7316v(i == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
                return true;
            }
            throw new IllegalStateException();
        }

        /* renamed from: m */
        public void mo7306m() {
            mo7317w();
        }

        /* renamed from: o */
        public void mo7308o(@mr2 AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo7300g());
        }

        /* renamed from: p */
        public void mo7309p() {
            mo7317w();
        }

        /* renamed from: q */
        public void mo7310q() {
            mo7317w();
        }

        /* renamed from: r */
        public void mo7311r() {
            mo7317w();
        }

        /* renamed from: s */
        public void mo7312s() {
            mo7317w();
        }

        /* renamed from: t */
        public final void mo7314t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            if (ViewPager2.this.getAdapter() == null) {
                i2 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i2 = ViewPager2.this.getAdapter().mo5711g();
            } else {
                i = ViewPager2.this.getAdapter().mo5711g();
                i2 = 0;
                C1638a2.m10547X1(accessibilityNodeInfo).mo12553Y0(C1638a2.C1640b.m10703f(i2, i, false, 0));
            }
            i = 0;
            C1638a2.m10547X1(accessibilityNodeInfo).mo12553Y0(C1638a2.C1640b.m10703f(i2, i, false, 0));
        }

        /* renamed from: u */
        public final void mo7315u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int g;
            RecyclerView.C0805h adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (g = adapter.mo5711g()) != 0 && ViewPager2.this.mo7266l()) {
                if (ViewPager2.this.f5955n > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.f5955n < g - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        /* renamed from: v */
        public void mo7316v(int i) {
            if (ViewPager2.this.mo7266l()) {
                ViewPager2.this.mo7280s(i, true);
            }
        }

        /* renamed from: w */
        public void mo7317w() {
            int g;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = 16908360;
            jt4.m19001r1(viewPager2, 16908360);
            jt4.m19001r1(viewPager2, 16908361);
            jt4.m19001r1(viewPager2, 16908358);
            jt4.m19001r1(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null && (g = ViewPager2.this.getAdapter().mo5711g()) != 0 && ViewPager2.this.mo7266l()) {
                if (ViewPager2.this.getOrientation() == 0) {
                    boolean k = ViewPager2.this.mo7265k();
                    int i2 = k ? 16908360 : 16908361;
                    if (k) {
                        i = 16908361;
                    }
                    if (ViewPager2.this.f5955n < g - 1) {
                        jt4.m19013u1(viewPager2, new C1638a2.C1639a(i2, (CharSequence) null), (CharSequence) null, this.f5966a);
                    }
                    if (ViewPager2.this.f5955n > 0) {
                        jt4.m19013u1(viewPager2, new C1638a2.C1639a(i, (CharSequence) null), (CharSequence) null, this.f5968b);
                        return;
                    }
                    return;
                }
                if (ViewPager2.this.f5955n < g - 1) {
                    jt4.m19013u1(viewPager2, new C1638a2.C1639a(16908359, (CharSequence) null), (CharSequence) null, this.f5966a);
                }
                if (ViewPager2.this.f5955n > 0) {
                    jt4.m19013u1(viewPager2, new C1638a2.C1639a(16908358, (CharSequence) null), (CharSequence) null, this.f5968b);
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$m */
    public interface C1140m {
        /* renamed from: a */
        void mo7318a(@mr2 View view, float f);
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$n */
    public class C1141n extends C0945u {
        public C1141n() {
        }

        @ts2
        /* renamed from: h */
        public View mo6477h(RecyclerView.C0819p pVar) {
            if (ViewPager2.this.mo7264j()) {
                return null;
            }
            return super.mo6477h(pVar);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$o */
    public class C1142o extends RecyclerView {
        public C1142o(@mr2 Context context) {
            super(context);
        }

        @sj3(23)
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f5945a.mo7297d() ? ViewPager2.this.f5945a.mo7307n() : super.getAccessibilityClassName();
        }

        public void onInitializeAccessibilityEvent(@mr2 AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f5955n);
            accessibilityEvent.setToIndex(ViewPager2.this.f5955n);
            ViewPager2.this.f5945a.mo7308o(accessibilityEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.mo7266l() && super.onInterceptTouchEvent(motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.mo7266l() && super.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$p */
    public static class C1143p extends View.BaseSavedState {
        public static final Parcelable.Creator<C1143p> CREATOR = new C1144a();

        /* renamed from: a */
        public Parcelable f5974a;

        /* renamed from: n */
        public int f5975n;

        /* renamed from: o */
        public int f5976o;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$p$a */
        public static class C1144a implements Parcelable.ClassLoaderCreator<C1143p> {
            /* renamed from: a */
            public C1143p createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C1143p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new C1143p(parcel, classLoader) : new C1143p(parcel);
            }

            /* renamed from: c */
            public C1143p[] newArray(int i) {
                return new C1143p[i];
            }
        }

        public C1143p(Parcel parcel) {
            super(parcel);
            mo7320a(parcel, (ClassLoader) null);
        }

        @sj3(24)
        public C1143p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            mo7320a(parcel, classLoader);
        }

        public C1143p(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        public final void mo7320a(Parcel parcel, ClassLoader classLoader) {
            this.f5975n = parcel.readInt();
            this.f5976o = parcel.readInt();
            this.f5974a = parcel.readParcelable(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5975n);
            parcel.writeInt(this.f5976o);
            parcel.writeParcelable(this.f5974a, i);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.viewpager2.widget.ViewPager2$q */
    public @interface C1145q {
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$r */
    public static class C1146r implements Runnable {

        /* renamed from: a */
        public final RecyclerView f5977a;

        /* renamed from: n */
        public final int f5978n;

        public C1146r(int i, RecyclerView recyclerView) {
            this.f5978n = i;
            this.f5977a = recyclerView;
        }

        public void run() {
            this.f5977a.mo5396O1(this.f5978n);
        }
    }

    public ViewPager2(@mr2 Context context) {
        super(context);
        mo7262h(context, (AttributeSet) null);
    }

    public ViewPager2(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
        mo7262h(context, attributeSet);
    }

    public ViewPager2(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo7262h(context, attributeSet);
    }

    @sj3(21)
    public ViewPager2(@mr2 Context context, @ts2 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo7262h(context, attributeSet);
    }

    /* renamed from: a */
    public void mo7244a(@mr2 RecyclerView.C0818o oVar) {
        this.f5943a.mo5482n(oVar);
    }

    /* renamed from: b */
    public void mo7245b(@mr2 RecyclerView.C0818o oVar, int i) {
        this.f5943a.mo5485o(oVar, i);
    }

    /* renamed from: c */
    public boolean mo7246c() {
        return this.f5949a.mo27737b();
    }

    public boolean canScrollHorizontally(int i) {
        return this.f5943a.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        return this.f5943a.canScrollVertically(i);
    }

    /* renamed from: d */
    public boolean mo7249d() {
        return this.f5949a.mo27739d();
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof C1143p) {
            int i = ((C1143p) parcelable).f5975n;
            sparseArray.put(this.f5943a.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        mo7279r();
    }

    /* renamed from: e */
    public final RecyclerView.C0824q mo7251e() {
        return new C1128d();
    }

    /* renamed from: f */
    public boolean mo7252f(@e83 @SuppressLint({"SupportAnnotationUsage"}) float f) {
        return this.f5949a.mo27740e(f);
    }

    @mr2
    /* renamed from: g */
    public RecyclerView.C0818o mo7253g(int i) {
        return this.f5943a.mo5353A0(i);
    }

    @sj3(23)
    public CharSequence getAccessibilityClassName() {
        return this.f5945a.mo7294a() ? this.f5945a.mo7300g() : super.getAccessibilityClassName();
    }

    @ts2
    public RecyclerView.C0805h getAdapter() {
        return this.f5943a.getAdapter();
    }

    public int getCurrentItem() {
        return this.f5955n;
    }

    public int getItemDecorationCount() {
        return this.f5943a.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f5957p;
    }

    public int getOrientation() {
        return this.f5940a.mo5270M2();
    }

    public int getPageSize() {
        int i;
        int i2;
        RecyclerView recyclerView = this.f5943a;
        if (getOrientation() == 0) {
            i = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i2 = recyclerView.getPaddingRight();
        } else {
            i = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i2 = recyclerView.getPaddingBottom();
        }
        return i - i2;
    }

    public int getScrollState() {
        return this.f5948a.mo7342h();
    }

    /* renamed from: h */
    public final void mo7262h(Context context, AttributeSet attributeSet) {
        this.f5945a = f5931e ? new C1136l() : new C1130f();
        C1142o oVar = new C1142o(context);
        this.f5943a = oVar;
        oVar.setId(jt4.m18855D());
        this.f5943a.setDescendantFocusability(131072);
        C1132h hVar = new C1132h(context);
        this.f5940a = hVar;
        this.f5943a.setLayoutManager(hVar);
        this.f5943a.setScrollingTouchSlop(1);
        mo7289t(context, attributeSet);
        this.f5943a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f5943a.mo5500p(mo7251e());
        C1151e eVar = new C1151e(this);
        this.f5948a = eVar;
        this.f5949a = new yz0(this, eVar, this.f5943a);
        C1141n nVar = new C1141n();
        this.f5944a = nVar;
        nVar.mo6554b(this.f5943a);
        this.f5943a.mo5506r(this.f5948a);
        C1147a aVar = new C1147a(3);
        this.f5951b = aVar;
        this.f5948a.mo7352r(aVar);
        C1126b bVar = new C1126b();
        C1127c cVar = new C1127c();
        this.f5951b.mo7329d(bVar);
        this.f5951b.mo7329d(cVar);
        this.f5945a.mo7301h(this.f5951b, this.f5943a);
        this.f5951b.mo7329d(this.f5946a);
        C1150d dVar = new C1150d(this.f5940a);
        this.f5947a = dVar;
        this.f5951b.mo7329d(dVar);
        RecyclerView recyclerView = this.f5943a;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* renamed from: i */
    public void mo7263i() {
        this.f5943a.mo5383K0();
    }

    /* renamed from: j */
    public boolean mo7264j() {
        return this.f5949a.mo27741f();
    }

    /* renamed from: k */
    public boolean mo7265k() {
        return this.f5940a.mo5875i0() == 1;
    }

    /* renamed from: l */
    public boolean mo7266l() {
        return this.f5954d;
    }

    /* renamed from: m */
    public final void mo7267m(@ts2 RecyclerView.C0805h<?> hVar) {
        if (hVar != null) {
            hVar.mo5703F(this.f5941a);
        }
    }

    /* renamed from: n */
    public void mo7268n(@mr2 C1134j jVar) {
        this.f5946a.mo7329d(jVar);
    }

    /* renamed from: o */
    public void mo7269o(@mr2 RecyclerView.C0818o oVar) {
        this.f5943a.mo5516s1(oVar);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f5945a.mo7302i(accessibilityNodeInfo);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f5943a.getMeasuredWidth();
        int measuredHeight = this.f5943a.getMeasuredHeight();
        this.f5938a.left = getPaddingLeft();
        this.f5938a.right = (i3 - i) - getPaddingRight();
        this.f5938a.top = getPaddingTop();
        this.f5938a.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f5938a, this.f5950b);
        RecyclerView recyclerView = this.f5943a;
        Rect rect = this.f5950b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f5952b) {
            mo7293x();
        }
    }

    public void onMeasure(int i, int i2) {
        measureChild(this.f5943a, i, i2);
        int measuredWidth = this.f5943a.getMeasuredWidth();
        int measuredHeight = this.f5943a.getMeasuredHeight();
        int measuredState = this.f5943a.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1143p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1143p pVar = (C1143p) parcelable;
        super.onRestoreInstanceState(pVar.getSuperState());
        this.f5956o = pVar.f5976o;
        this.f5939a = pVar.f5974a;
    }

    @ts2
    public Parcelable onSaveInstanceState() {
        C1143p pVar = new C1143p(super.onSaveInstanceState());
        pVar.f5975n = this.f5943a.getId();
        int i = this.f5956o;
        if (i == -1) {
            i = this.f5955n;
        }
        pVar.f5976o = i;
        Parcelable parcelable = this.f5939a;
        if (parcelable == null) {
            RecyclerView.C0805h adapter = this.f5943a.getAdapter();
            if (adapter instanceof l34) {
                parcelable = ((l34) adapter).mo7233b();
            }
            return pVar;
        }
        pVar.f5974a = parcelable;
        return pVar;
    }

    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    /* renamed from: p */
    public void mo7276p(int i) {
        this.f5943a.mo5542t1(i);
    }

    @sj3(16)
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return this.f5945a.mo7296c(i, bundle) ? this.f5945a.mo7305l(i, bundle) : super.performAccessibilityAction(i, bundle);
    }

    /* renamed from: q */
    public void mo7278q() {
        if (this.f5947a.mo7335d() != null) {
            double g = this.f5948a.mo7341g();
            int i = (int) g;
            float f = (float) (g - ((double) i));
            this.f5947a.mo7313b(i, f, Math.round(((float) getPageSize()) * f));
        }
    }

    /* renamed from: r */
    public final void mo7279r() {
        RecyclerView.C0805h adapter;
        if (this.f5956o != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.f5939a;
            if (parcelable != null) {
                if (adapter instanceof l34) {
                    ((l34) adapter).mo7231a(parcelable);
                }
                this.f5939a = null;
            }
            int max = Math.max(0, Math.min(this.f5956o, adapter.mo5711g() - 1));
            this.f5955n = max;
            this.f5956o = -1;
            this.f5943a.mo5372G1(max);
            this.f5945a.mo7306m();
        }
    }

    /* renamed from: s */
    public void mo7280s(int i, boolean z) {
        RecyclerView.C0805h adapter = getAdapter();
        if (adapter == null) {
            if (this.f5956o != -1) {
                this.f5956o = Math.max(i, 0);
            }
        } else if (adapter.mo5711g() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.mo5711g() - 1);
            if (min != this.f5955n || !this.f5948a.mo7345k()) {
                int i2 = this.f5955n;
                if (min != i2 || !z) {
                    double d = (double) i2;
                    this.f5955n = min;
                    this.f5945a.mo7310q();
                    if (!this.f5948a.mo7345k()) {
                        d = this.f5948a.mo7341g();
                    }
                    this.f5948a.mo7350p(min, z);
                    if (!z) {
                        this.f5943a.mo5372G1(min);
                        return;
                    }
                    double d2 = (double) min;
                    if (Math.abs(d2 - d) > 3.0d) {
                        this.f5943a.mo5372G1(d2 > d ? min - 3 : min + 3);
                        RecyclerView recyclerView = this.f5943a;
                        recyclerView.post(new C1146r(min, recyclerView));
                        return;
                    }
                    this.f5943a.mo5396O1(min);
                }
            }
        }
    }

    public void setAdapter(@ts2 RecyclerView.C0805h hVar) {
        RecyclerView.C0805h adapter = this.f5943a.getAdapter();
        this.f5945a.mo7299f(adapter);
        mo7291v(adapter);
        this.f5943a.setAdapter(hVar);
        this.f5955n = 0;
        mo7279r();
        this.f5945a.mo7298e(hVar);
        mo7267m(hVar);
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public void setCurrentItem(int i, boolean z) {
        if (!mo7264j()) {
            mo7280s(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    @sj3(17)
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f5945a.mo7309p();
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.f5957p = i;
            this.f5943a.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i) {
        this.f5940a.mo5294f3(i);
        this.f5945a.mo7311r();
    }

    public void setPageTransformer(@ts2 C1140m mVar) {
        boolean z = this.f5953c;
        if (mVar != null) {
            if (!z) {
                this.f5942a = this.f5943a.getItemAnimator();
                this.f5953c = true;
            }
            this.f5943a.setItemAnimator((RecyclerView.C0812m) null);
        } else if (z) {
            this.f5943a.setItemAnimator(this.f5942a);
            this.f5942a = null;
            this.f5953c = false;
        }
        if (mVar != this.f5947a.mo7335d()) {
            this.f5947a.mo7336e(mVar);
            mo7278q();
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.f5954d = z;
        this.f5945a.mo7312s();
    }

    /* renamed from: t */
    public final void mo7289t(Context context, AttributeSet attributeSet) {
        int[] iArr = ic3.C2433j.ViewPager2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(ic3.C2433j.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: u */
    public void mo7290u() {
        View h = this.f5944a.mo6477h(this.f5940a);
        if (h != null) {
            int[] c = this.f5944a.mo6476c(this.f5940a, h);
            if (c[0] != 0 || c[1] != 0) {
                this.f5943a.mo5384K1(c[0], c[1]);
            }
        }
    }

    /* renamed from: v */
    public final void mo7291v(@ts2 RecyclerView.C0805h<?> hVar) {
        if (hVar != null) {
            hVar.mo5706I(this.f5941a);
        }
    }

    /* renamed from: w */
    public void mo7292w(@mr2 C1134j jVar) {
        this.f5946a.mo7330e(jVar);
    }

    /* renamed from: x */
    public void mo7293x() {
        C0945u uVar = this.f5944a;
        if (uVar != null) {
            View h = uVar.mo6477h(this.f5940a);
            if (h != null) {
                int s0 = this.f5940a.mo5893s0(h);
                if (s0 != this.f5955n && getScrollState() == 0) {
                    this.f5951b.mo7241c(s0);
                }
                this.f5952b = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }
}
