package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0237a;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0253h;
import androidx.appcompat.view.menu.C0255i;
import androidx.appcompat.view.menu.C0258j;
import androidx.appcompat.view.menu.C0260k;
import androidx.appcompat.view.menu.C0265m;
import androidx.appcompat.widget.ActionMenuView;
import com.onedelhi.secure.C3222q2;
import com.onedelhi.secure.C3665u2;
import com.onedelhi.secure.la1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.my3;
import com.onedelhi.secure.of4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.za3;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.a */
public class C0348a extends C0237a implements C3665u2.C3666a {

    /* renamed from: b */
    public static final String f1739b = "ActionMenuPresenter";

    /* renamed from: a */
    public Drawable f1740a;

    /* renamed from: a */
    public final SparseBooleanArray f1741a = new SparseBooleanArray();

    /* renamed from: a */
    public C0349a f1742a;

    /* renamed from: a */
    public C0350b f1743a;

    /* renamed from: a */
    public C0351c f1744a;

    /* renamed from: a */
    public C0352d f1745a;

    /* renamed from: a */
    public C0354e f1746a;

    /* renamed from: a */
    public final C0355f f1747a = new C0355f();

    /* renamed from: b */
    public boolean f1748b;

    /* renamed from: c */
    public boolean f1749c;

    /* renamed from: d */
    public boolean f1750d;

    /* renamed from: e */
    public boolean f1751e;

    /* renamed from: f */
    public boolean f1752f;

    /* renamed from: g */
    public boolean f1753g;

    /* renamed from: h */
    public boolean f1754h;

    /* renamed from: q */
    public int f1755q;

    /* renamed from: r */
    public int f1756r;

    /* renamed from: s */
    public int f1757s;

    /* renamed from: t */
    public int f1758t;

    /* renamed from: u */
    public int f1759u;

    /* renamed from: androidx.appcompat.widget.a$a */
    public class C0349a extends C0255i {
        public C0349a(Context context, C0265m mVar, View view) {
            super(context, mVar, view, false, za3.C4057b.actionOverflowMenuStyle);
            if (!((C0253h) mVar.getItem()).mo1431q()) {
                View view2 = C0348a.this.f1745a;
                mo1476h(view2 == null ? (View) C0348a.this.f1034a : view2);
            }
            mo1380a(C0348a.this.f1747a);
        }

        /* renamed from: g */
        public void mo1475g() {
            C0348a aVar = C0348a.this;
            aVar.f1742a = null;
            aVar.f1759u = 0;
            super.mo1475g();
        }
    }

    /* renamed from: androidx.appcompat.widget.a$b */
    public class C0350b extends ActionMenuItemView.C0236b {
        public C0350b() {
        }

        /* renamed from: a */
        public my3 mo1196a() {
            C0349a aVar = C0348a.this.f1742a;
            if (aVar != null) {
                return aVar.mo1473e();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.a$c */
    public class C0351c implements Runnable {

        /* renamed from: a */
        public C0354e f1762a;

        public C0351c(C0354e eVar) {
            this.f1762a = eVar;
        }

        public void run() {
            if (C0348a.this.f1032a != null) {
                C0348a.this.f1032a.mo1328d();
            }
            View view = (View) C0348a.this.f1034a;
            if (!(view == null || view.getWindowToken() == null || !this.f1762a.mo1483o())) {
                C0348a.this.f1746a = this.f1762a;
            }
            C0348a.this.f1744a = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.a$d */
    public class C0352d extends AppCompatImageView implements ActionMenuView.C0272a {

        /* renamed from: androidx.appcompat.widget.a$d$a */
        public class C0353a extends la1 {

            /* renamed from: a */
            public final /* synthetic */ C0348a f1766a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0353a(View view, C0348a aVar) {
                super(view);
                this.f1766a = aVar;
            }

            /* renamed from: b */
            public my3 mo1194b() {
                C0354e eVar = C0348a.this.f1746a;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo1473e();
            }

            /* renamed from: c */
            public boolean mo1195c() {
                C0348a.this.mo2489Q();
                return true;
            }

            /* renamed from: d */
            public boolean mo1687d() {
                C0348a aVar = C0348a.this;
                if (aVar.f1744a != null) {
                    return false;
                }
                aVar.mo2477E();
                return true;
            }
        }

        public C0352d(Context context) {
            super(context, (AttributeSet) null, za3.C4057b.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            of4.m23742a(this, getContentDescription());
            setOnTouchListener(new C0353a(this, C0348a.this));
        }

        /* renamed from: a */
        public boolean mo1170a() {
            return false;
        }

        /* renamed from: e */
        public boolean mo1173e() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0348a.this.mo2489Q();
            return true;
        }

        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                wo0.m30983l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.a$e */
    public class C0354e extends C0255i {
        public C0354e(Context context, C0248e eVar, View view, boolean z) {
            super(context, eVar, view, z, za3.C4057b.actionOverflowMenuStyle);
            mo1478j(8388613);
            mo1380a(C0348a.this.f1747a);
        }

        /* renamed from: g */
        public void mo1475g() {
            if (C0348a.this.f1032a != null) {
                C0348a.this.f1032a.close();
            }
            C0348a.this.f1746a = null;
            super.mo1475g();
        }
    }

    /* renamed from: androidx.appcompat.widget.a$f */
    public class C0355f implements C0258j.C0259a {
        public C0355f() {
        }

        /* renamed from: b */
        public void mo1072b(@mr2 C0248e eVar, boolean z) {
            if (eVar instanceof C0265m) {
                eVar.mo1290G().mo1332f(false);
            }
            C0258j.C0259a q = C0348a.this.mo1226q();
            if (q != null) {
                q.mo1072b(eVar, z);
            }
        }

        /* renamed from: c */
        public boolean mo1073c(@mr2 C0248e eVar) {
            if (eVar == C0348a.this.f1032a) {
                return false;
            }
            C0348a.this.f1759u = ((C0265m) eVar).getItem().getItemId();
            C0258j.C0259a q = C0348a.this.mo1226q();
            if (q != null) {
                return q.mo1073c(eVar);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.appcompat.widget.a$g */
    public static class C0356g implements Parcelable {
        public static final Parcelable.Creator<C0356g> CREATOR = new C0357a();

        /* renamed from: n */
        public int f1769n;

        /* renamed from: androidx.appcompat.widget.a$g$a */
        public class C0357a implements Parcelable.Creator<C0356g> {
            /* renamed from: a */
            public C0356g createFromParcel(Parcel parcel) {
                return new C0356g(parcel);
            }

            /* renamed from: b */
            public C0356g[] newArray(int i) {
                return new C0356g[i];
            }
        }

        public C0356g() {
        }

        public C0356g(Parcel parcel) {
            this.f1769n = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1769n);
        }
    }

    public C0348a(Context context) {
        super(context, za3.C4065j.abc_action_menu_layout, za3.C4065j.abc_action_menu_item_layout);
    }

    /* renamed from: B */
    public boolean mo2474B() {
        return mo2477E() | mo2478F();
    }

    /* renamed from: C */
    public final View mo2475C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1034a;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0260k.C0261a) && ((C0260k.C0261a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: D */
    public Drawable mo2476D() {
        C0352d dVar = this.f1745a;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1748b) {
            return this.f1740a;
        }
        return null;
    }

    /* renamed from: E */
    public boolean mo2477E() {
        C0260k kVar;
        C0351c cVar = this.f1744a;
        if (cVar == null || (kVar = this.f1034a) == null) {
            C0354e eVar = this.f1746a;
            if (eVar == null) {
                return false;
            }
            eVar.dismiss();
            return true;
        }
        ((View) kVar).removeCallbacks(cVar);
        this.f1744a = null;
        return true;
    }

    /* renamed from: F */
    public boolean mo2478F() {
        C0349a aVar = this.f1742a;
        if (aVar == null) {
            return false;
        }
        aVar.dismiss();
        return true;
    }

    /* renamed from: G */
    public boolean mo2479G() {
        return this.f1744a != null || mo2480H();
    }

    /* renamed from: H */
    public boolean mo2480H() {
        C0354e eVar = this.f1746a;
        return eVar != null && eVar.mo1474f();
    }

    /* renamed from: I */
    public boolean mo2481I() {
        return this.f1749c;
    }

    /* renamed from: J */
    public void mo2482J(Configuration configuration) {
        if (!this.f1751e) {
            this.f1757s = C3222q2.m25257b(this.f1035b).mo22808d();
        }
        C0248e eVar = this.f1032a;
        if (eVar != null) {
            eVar.mo1297N(true);
        }
    }

    /* renamed from: K */
    public void mo2483K(boolean z) {
        this.f1754h = z;
    }

    /* renamed from: L */
    public void mo2484L(int i) {
        this.f1757s = i;
        this.f1751e = true;
    }

    /* renamed from: M */
    public void mo2485M(ActionMenuView actionMenuView) {
        this.f1034a = actionMenuView;
        actionMenuView.mo1198g(this.f1032a);
    }

    /* renamed from: N */
    public void mo2486N(Drawable drawable) {
        C0352d dVar = this.f1745a;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1748b = true;
        this.f1740a = drawable;
    }

    /* renamed from: O */
    public void mo2487O(boolean z) {
        this.f1749c = z;
        this.f1750d = true;
    }

    /* renamed from: P */
    public void mo2488P(int i, boolean z) {
        this.f1755q = i;
        this.f1752f = z;
        this.f1753g = true;
    }

    /* renamed from: Q */
    public boolean mo2489Q() {
        C0248e eVar;
        if (!this.f1749c || mo2480H() || (eVar = this.f1032a) == null || this.f1034a == null || this.f1744a != null || eVar.mo1287C().isEmpty()) {
            return false;
        }
        C0351c cVar = new C0351c(new C0354e(this.f1035b, this.f1032a, this.f1745a, true));
        this.f1744a = cVar;
        ((View) this.f1034a).post(cVar);
        return true;
    }

    /* renamed from: a */
    public void mo2490a(boolean z) {
        if (z) {
            super.mo1219h((C0265m) null);
            return;
        }
        C0248e eVar = this.f1032a;
        if (eVar != null) {
            eVar.mo1332f(false);
        }
    }

    /* renamed from: b */
    public void mo1212b(C0248e eVar, boolean z) {
        mo2474B();
        super.mo1212b(eVar, z);
    }

    /* renamed from: d */
    public void mo1214d(boolean z) {
        C0260k kVar;
        super.mo1214d(z);
        ((View) this.f1034a).requestLayout();
        C0248e eVar = this.f1032a;
        boolean z2 = false;
        if (eVar != null) {
            ArrayList<C0253h> v = eVar.mo1369v();
            int size = v.size();
            for (int i = 0; i < size; i++) {
                C3665u2 f = v.get(i).mo1396f();
                if (f != null) {
                    f.mo25369k(this);
                }
            }
        }
        C0248e eVar2 = this.f1032a;
        ArrayList<C0253h> C = eVar2 != null ? eVar2.mo1287C() : null;
        if (this.f1749c && C != null) {
            int size2 = C.size();
            if (size2 == 1) {
                z2 = !C.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        C0352d dVar = this.f1745a;
        if (z2) {
            if (dVar == null) {
                this.f1745a = new C0352d(this.f1030a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1745a.getParent();
            if (viewGroup != this.f1034a) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1745a);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1034a;
                actionMenuView.addView(this.f1745a, actionMenuView.mo1633I());
            }
        } else if (dVar != null && dVar.getParent() == (kVar = this.f1034a)) {
            ((ViewGroup) kVar).removeView(this.f1745a);
        }
        ((ActionMenuView) this.f1034a).setOverflowReserved(this.f1749c);
    }

    /* renamed from: e */
    public boolean mo1215e() {
        int i;
        ArrayList<C0253h> arrayList;
        int i2;
        int i3;
        int i4;
        C0348a aVar = this;
        C0248e eVar = aVar.f1032a;
        View view = null;
        int i5 = 0;
        if (eVar != null) {
            arrayList = eVar.mo1291H();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = aVar.f1757s;
        int i7 = aVar.f1756r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.f1034a;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            C0253h hVar = arrayList.get(i10);
            if (hVar.mo1393d()) {
                i8++;
            } else if (hVar.mo1433s()) {
                i9++;
            } else {
                z = true;
            }
            if (aVar.f1754h && hVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (aVar.f1749c && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = aVar.f1741a;
        sparseBooleanArray.clear();
        if (aVar.f1752f) {
            int i12 = aVar.f1758t;
            i2 = i7 / i12;
            i3 = i12 + ((i7 % i12) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            C0253h hVar2 = arrayList.get(i13);
            if (hVar2.mo1393d()) {
                View r = aVar.mo1227r(hVar2, view, viewGroup);
                if (aVar.f1752f) {
                    i2 -= ActionMenuView.m2091O(r, i3, i2, makeMeasureSpec, i5);
                } else {
                    r.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = r.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = hVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                hVar2.mo1468z(true);
                i4 = i;
            } else if (hVar2.mo1433s()) {
                int groupId2 = hVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!aVar.f1752f || i2 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View r2 = aVar.mo1227r(hVar2, (View) null, viewGroup);
                    if (aVar.f1752f) {
                        int O = ActionMenuView.m2091O(r2, i3, i2, makeMeasureSpec, 0);
                        i2 -= O;
                        if (O == 0) {
                            z4 = false;
                        }
                    } else {
                        r2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = r2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z5 & (!aVar.f1752f ? i7 + i14 > 0 : i7 >= 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    int i15 = 0;
                    while (i15 < i13) {
                        C0253h hVar3 = arrayList.get(i15);
                        if (hVar3.getGroupId() == groupId2) {
                            if (hVar3.mo1431q()) {
                                i11++;
                            }
                            hVar3.mo1468z(false);
                        }
                        i15++;
                    }
                }
                if (z3) {
                    i11--;
                }
                hVar2.mo1468z(z3);
            } else {
                i4 = i;
                hVar2.mo1468z(false);
                i13++;
                view = null;
                aVar = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            view = null;
            aVar = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    /* renamed from: f */
    public C0260k mo1216f(ViewGroup viewGroup) {
        C0260k kVar = this.f1034a;
        C0260k f = super.mo1216f(viewGroup);
        if (kVar != f) {
            ((ActionMenuView) f).setPresenter(this);
        }
        return f;
    }

    /* renamed from: g */
    public void mo1217g(@mr2 Context context, @ts2 C0248e eVar) {
        super.mo1217g(context, eVar);
        Resources resources = context.getResources();
        C3222q2 b = C3222q2.m25257b(context);
        if (!this.f1750d) {
            this.f1749c = b.mo22812h();
        }
        if (!this.f1753g) {
            this.f1755q = b.mo22807c();
        }
        if (!this.f1751e) {
            this.f1757s = b.mo22808d();
        }
        int i = this.f1755q;
        if (this.f1749c) {
            if (this.f1745a == null) {
                C0352d dVar = new C0352d(this.f1030a);
                this.f1745a = dVar;
                if (this.f1748b) {
                    dVar.setImageDrawable(this.f1740a);
                    this.f1740a = null;
                    this.f1748b = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1745a.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1745a.getMeasuredWidth();
        } else {
            this.f1745a = null;
        }
        this.f1756r = i;
        this.f1758t = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: h */
    public boolean mo1219h(C0265m mVar) {
        boolean z = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        C0265m mVar2 = mVar;
        while (mVar2.mo1494n0() != this.f1032a) {
            mVar2 = (C0265m) mVar2.mo1494n0();
        }
        View C = mo2475C(mVar2.getItem());
        if (C == null) {
            return false;
        }
        this.f1759u = mVar.getItem().getItemId();
        int size = mVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0349a aVar = new C0349a(this.f1035b, mVar, C);
        this.f1742a = aVar;
        aVar.mo1477i(z);
        this.f1742a.mo1480l();
        super.mo1219h(mVar);
        return true;
    }

    /* renamed from: i */
    public Parcelable mo1240i() {
        C0356g gVar = new C0356g();
        gVar.f1769n = this.f1759u;
        return gVar;
    }

    /* renamed from: l */
    public void mo1222l(C0253h hVar, C0260k.C0261a aVar) {
        aVar.mo1171b(hVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1034a);
        if (this.f1743a == null) {
            this.f1743a = new C0350b();
        }
        actionMenuItemView.setPopupCallback(this.f1743a);
    }

    /* renamed from: n */
    public void mo1242n(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof C0356g) && (i = ((C0356g) parcelable).f1769n) > 0 && (findItem = this.f1032a.findItem(i)) != null) {
            mo1219h((C0265m) findItem.getSubMenu());
        }
    }

    /* renamed from: p */
    public boolean mo1225p(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1745a) {
            return false;
        }
        return super.mo1225p(viewGroup, i);
    }

    /* renamed from: r */
    public View mo1227r(C0253h hVar, View view, ViewGroup viewGroup) {
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.mo1429o()) {
            actionView = super.mo1227r(hVar, view, viewGroup);
        }
        actionView.setVisibility(hVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo1656p(layoutParams));
        }
        return actionView;
    }

    /* renamed from: t */
    public boolean mo1229t(int i, C0253h hVar) {
        return hVar.mo1431q();
    }
}
