package com.onedelhi.secure;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0253h;
import androidx.appcompat.view.menu.C0258j;
import androidx.appcompat.view.menu.C0260k;
import androidx.appcompat.view.menu.C0265m;
import androidx.recyclerview.widget.C0947v;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import java.util.ArrayList;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class on2 implements C0258j {

    /* renamed from: C */
    public static final int f33095C = 0;

    /* renamed from: b */
    public static final String f33096b = "android:menu:list";

    /* renamed from: c */
    public static final String f33097c = "android:menu:adapter";

    /* renamed from: d */
    public static final String f33098d = "android:menu:header";

    /* renamed from: A */
    public int f33099A;

    /* renamed from: B */
    public int f33100B = -1;
    @ts2

    /* renamed from: a */
    public ColorStateList f33101a;

    /* renamed from: a */
    public Drawable f33102a;

    /* renamed from: a */
    public RippleDrawable f33103a;

    /* renamed from: a */
    public LayoutInflater f33104a;

    /* renamed from: a */
    public final View.OnClickListener f33105a = new C6285a();

    /* renamed from: a */
    public LinearLayout f33106a;

    /* renamed from: a */
    public C0248e f33107a;

    /* renamed from: a */
    public C0258j.C0259a f33108a;

    /* renamed from: a */
    public NavigationMenuView f33109a;

    /* renamed from: a */
    public C6287c f33110a;

    /* renamed from: b */
    public ColorStateList f33111b;

    /* renamed from: b */
    public boolean f33112b;

    /* renamed from: c */
    public ColorStateList f33113c;

    /* renamed from: c */
    public boolean f33114c = true;

    /* renamed from: n */
    public int f33115n;

    /* renamed from: o */
    public int f33116o = 0;

    /* renamed from: p */
    public int f33117p = 0;

    /* renamed from: q */
    public int f33118q;
    @e83

    /* renamed from: r */
    public int f33119r;

    /* renamed from: s */
    public int f33120s;

    /* renamed from: t */
    public int f33121t;
    @e83

    /* renamed from: u */
    public int f33122u;
    @e83

    /* renamed from: v */
    public int f33123v;
    @e83

    /* renamed from: w */
    public int f33124w;
    @e83

    /* renamed from: x */
    public int f33125x;

    /* renamed from: y */
    public int f33126y;

    /* renamed from: z */
    public int f33127z;

    /* renamed from: com.onedelhi.secure.on2$a */
    public class C6285a implements View.OnClickListener {
        public C6285a() {
        }

        public void onClick(View view) {
            boolean z = true;
            on2.this.mo41886Z(true);
            C0253h itemData = ((NavigationMenuItemView) view).getItemData();
            on2 on2 = on2.this;
            boolean P = on2.f33107a.mo1299P(itemData, on2, 0);
            if (itemData == null || !itemData.isCheckable() || !P) {
                z = false;
            } else {
                on2.this.f33110a.mo41914V(itemData);
            }
            on2.this.mo41886Z(false);
            if (z) {
                on2.this.mo1214d(false);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.on2$b */
    public static class C6286b extends C6297l {
        public C6286b(View view) {
            super(view);
        }
    }

    /* renamed from: com.onedelhi.secure.on2$c */
    public class C6287c extends RecyclerView.C0805h<C6297l> {

        /* renamed from: a */
        public static final int f33129a = 0;

        /* renamed from: a */
        public static final String f33130a = "android:menu:checked";

        /* renamed from: b */
        public static final int f33131b = 1;

        /* renamed from: b */
        public static final String f33132b = "android:menu:action_views";

        /* renamed from: c */
        public static final int f33133c = 2;

        /* renamed from: d */
        public static final int f33134d = 3;

        /* renamed from: a */
        public C0253h f33135a;

        /* renamed from: a */
        public final ArrayList<C6290e> f33137a = new ArrayList<>();

        /* renamed from: b */
        public boolean f33138b;

        /* renamed from: com.onedelhi.secure.on2$c$a */
        public class C6288a extends C3884x1 {

            /* renamed from: a */
            public final /* synthetic */ int f33139a;

            /* renamed from: a */
            public final /* synthetic */ boolean f33141a;

            public C6288a(int i, boolean z) {
                this.f33139a = i;
                this.f33141a = z;
            }

            /* renamed from: g */
            public void mo3893g(@mr2 View view, @mr2 C1638a2 a2Var) {
                super.mo3893g(view, a2Var);
                a2Var.mo12555Z0(C1638a2.C1641c.m10709h(C6287c.this.mo41903K(this.f33139a), 1, 1, 1, this.f33141a, view.isSelected()));
            }
        }

        public C6287c() {
            mo41911S();
        }

        /* renamed from: K */
        public final int mo41903K(int i) {
            int i2 = i;
            for (int i3 = 0; i3 < i; i3++) {
                if (on2.this.f33110a.mo5713i(i3) == 2) {
                    i2--;
                }
            }
            return on2.this.f33106a.getChildCount() == 0 ? i2 - 1 : i2;
        }

        /* renamed from: L */
        public final void mo41904L(int i, int i2) {
            while (i < i2) {
                ((C6292g) this.f33137a.get(i)).f33145a = true;
                i++;
            }
        }

        @mr2
        /* renamed from: M */
        public Bundle mo41905M() {
            Bundle bundle = new Bundle();
            C0253h hVar = this.f33135a;
            if (hVar != null) {
                bundle.putInt(f33130a, hVar.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f33137a.size();
            for (int i = 0; i < size; i++) {
                C6290e eVar = this.f33137a.get(i);
                if (eVar instanceof C6292g) {
                    C0253h a = ((C6292g) eVar).mo41919a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        qy2 qy2 = new qy2();
                        actionView.saveHierarchyState(qy2);
                        sparseArray.put(a.getItemId(), qy2);
                    }
                }
            }
            bundle.putSparseParcelableArray(f33132b, sparseArray);
            return bundle;
        }

        /* renamed from: N */
        public C0253h mo41906N() {
            return this.f33135a;
        }

        /* renamed from: O */
        public int mo41907O() {
            int i = on2.this.f33106a.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < on2.this.f33110a.mo5711g(); i2++) {
                int i3 = on2.this.f33110a.mo5713i(i2);
                if (i3 == 0 || i3 == 1) {
                    i++;
                }
            }
            return i;
        }

        /* renamed from: P */
        public void mo5728x(@mr2 C6297l lVar, int i) {
            boolean z;
            View view;
            int i2 = mo5713i(i);
            if (i2 != 0) {
                z = true;
                if (i2 == 1) {
                    TextView textView = (TextView) lVar.f4609a;
                    textView.setText(((C6292g) this.f33137a.get(i)).mo41919a().getTitle());
                    int i3 = on2.this.f33116o;
                    if (i3 != 0) {
                        jb4.m18310E(textView, i3);
                    }
                    textView.setPadding(on2.this.f33124w, textView.getPaddingTop(), on2.this.f33125x, textView.getPaddingBottom());
                    ColorStateList colorStateList = on2.this.f33101a;
                    view = textView;
                    if (colorStateList != null) {
                        textView.setTextColor(colorStateList);
                        view = textView;
                    }
                } else if (i2 == 2) {
                    C6291f fVar = (C6291f) this.f33137a.get(i);
                    lVar.f4609a.setPadding(on2.this.f33122u, fVar.mo41918b(), on2.this.f33123v, fVar.mo41917a());
                    return;
                } else if (i2 == 3) {
                    view = lVar.f4609a;
                } else {
                    return;
                }
            } else {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f4609a;
                navigationMenuItemView.setIconTintList(on2.this.f33113c);
                int i4 = on2.this.f33117p;
                if (i4 != 0) {
                    navigationMenuItemView.setTextAppearance(i4);
                }
                ColorStateList colorStateList2 = on2.this.f33111b;
                if (colorStateList2 != null) {
                    navigationMenuItemView.setTextColor(colorStateList2);
                }
                Drawable drawable = on2.this.f33102a;
                jt4.m18877I1(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                RippleDrawable rippleDrawable = on2.this.f33103a;
                if (rippleDrawable != null) {
                    navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
                }
                C6292g gVar = (C6292g) this.f33137a.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.f33145a);
                on2 on2 = on2.this;
                int i5 = on2.f33118q;
                int i6 = on2.f33119r;
                navigationMenuItemView.setPadding(i5, i6, i5, i6);
                navigationMenuItemView.setIconPadding(on2.this.f33120s);
                on2 on22 = on2.this;
                if (on22.f33112b) {
                    navigationMenuItemView.setIconSize(on22.f33121t);
                }
                navigationMenuItemView.setMaxLines(on2.this.f33126y);
                z = false;
                navigationMenuItemView.mo1171b(gVar.mo41919a(), 0);
                view = navigationMenuItemView;
            }
            mo41913U(view, i, z);
        }

        @ts2
        /* renamed from: Q */
        public C6297l mo5730z(ViewGroup viewGroup, int i) {
            if (i == 0) {
                on2 on2 = on2.this;
                return new C6294i(on2.f33104a, viewGroup, on2.f33105a);
            } else if (i == 1) {
                return new C6296k(on2.this.f33104a, viewGroup);
            } else {
                if (i == 2) {
                    return new C6295j(on2.this.f33104a, viewGroup);
                }
                if (i != 3) {
                    return null;
                }
                return new C6286b(on2.this.f33106a);
            }
        }

        /* renamed from: R */
        public void mo5702E(C6297l lVar) {
            if (lVar instanceof C6294i) {
                ((NavigationMenuItemView) lVar.f4609a).mo28255G();
            }
        }

        /* renamed from: S */
        public final void mo41911S() {
            if (!this.f33138b) {
                this.f33138b = true;
                this.f33137a.clear();
                this.f33137a.add(new C6289d());
                int i = -1;
                int size = on2.this.f33107a.mo1291H().size();
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0253h hVar = on2.this.f33107a.mo1291H().get(i3);
                    if (hVar.isChecked()) {
                        mo41914V(hVar);
                    }
                    if (hVar.isCheckable()) {
                        hVar.mo1467y(false);
                    }
                    if (hVar.hasSubMenu()) {
                        SubMenu subMenu = hVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f33137a.add(new C6291f(on2.this.f33099A, 0));
                            }
                            this.f33137a.add(new C6292g(hVar));
                            int size2 = this.f33137a.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                C0253h hVar2 = (C0253h) subMenu.getItem(i4);
                                if (hVar2.isVisible()) {
                                    if (!z2 && hVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (hVar2.isCheckable()) {
                                        hVar2.mo1467y(false);
                                    }
                                    if (hVar.isChecked()) {
                                        mo41914V(hVar);
                                    }
                                    this.f33137a.add(new C6292g(hVar2));
                                }
                            }
                            if (z2) {
                                mo41904L(size2, this.f33137a.size());
                            }
                        }
                    } else {
                        int groupId = hVar.getGroupId();
                        if (groupId != i) {
                            i2 = this.f33137a.size();
                            z = hVar.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                ArrayList<C6290e> arrayList = this.f33137a;
                                int i5 = on2.this.f33099A;
                                arrayList.add(new C6291f(i5, i5));
                            }
                        } else if (!z && hVar.getIcon() != null) {
                            mo41904L(i2, this.f33137a.size());
                            z = true;
                        }
                        C6292g gVar = new C6292g(hVar);
                        gVar.f33145a = z;
                        this.f33137a.add(gVar);
                        i = groupId;
                    }
                }
                this.f33138b = false;
            }
        }

        /* renamed from: T */
        public void mo41912T(@mr2 Bundle bundle) {
            C0253h a;
            View actionView;
            qy2 qy2;
            C0253h a2;
            int i = bundle.getInt(f33130a, 0);
            if (i != 0) {
                this.f33138b = true;
                int size = this.f33137a.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    C6290e eVar = this.f33137a.get(i2);
                    if ((eVar instanceof C6292g) && (a2 = ((C6292g) eVar).mo41919a()) != null && a2.getItemId() == i) {
                        mo41914V(a2);
                        break;
                    }
                    i2++;
                }
                this.f33138b = false;
                mo41911S();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f33132b);
            if (sparseParcelableArray != null) {
                int size2 = this.f33137a.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C6290e eVar2 = this.f33137a.get(i3);
                    if (!(!(eVar2 instanceof C6292g) || (a = ((C6292g) eVar2).mo41919a()) == null || (actionView = a.getActionView()) == null || (qy2 = (qy2) sparseParcelableArray.get(a.getItemId())) == null)) {
                        actionView.restoreHierarchyState(qy2);
                    }
                }
            }
        }

        /* renamed from: U */
        public final void mo41913U(View view, int i, boolean z) {
            jt4.m18849B1(view, new C6288a(i, z));
        }

        /* renamed from: V */
        public void mo41914V(@mr2 C0253h hVar) {
            if (this.f33135a != hVar && hVar.isCheckable()) {
                C0253h hVar2 = this.f33135a;
                if (hVar2 != null) {
                    hVar2.setChecked(false);
                }
                this.f33135a = hVar;
                hVar.setChecked(true);
            }
        }

        /* renamed from: W */
        public void mo41915W(boolean z) {
            this.f33138b = z;
        }

        /* renamed from: X */
        public void mo41916X() {
            mo41911S();
            mo5717m();
        }

        /* renamed from: g */
        public int mo5711g() {
            return this.f33137a.size();
        }

        /* renamed from: h */
        public long mo5712h(int i) {
            return (long) i;
        }

        /* renamed from: i */
        public int mo5713i(int i) {
            C6290e eVar = this.f33137a.get(i);
            if (eVar instanceof C6291f) {
                return 2;
            }
            if (eVar instanceof C6289d) {
                return 3;
            }
            if (eVar instanceof C6292g) {
                return ((C6292g) eVar).mo41919a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }
    }

    /* renamed from: com.onedelhi.secure.on2$d */
    public static class C6289d implements C6290e {
    }

    /* renamed from: com.onedelhi.secure.on2$e */
    public interface C6290e {
    }

    /* renamed from: com.onedelhi.secure.on2$f */
    public static class C6291f implements C6290e {

        /* renamed from: a */
        public final int f33142a;

        /* renamed from: b */
        public final int f33143b;

        public C6291f(int i, int i2) {
            this.f33142a = i;
            this.f33143b = i2;
        }

        /* renamed from: a */
        public int mo41917a() {
            return this.f33143b;
        }

        /* renamed from: b */
        public int mo41918b() {
            return this.f33142a;
        }
    }

    /* renamed from: com.onedelhi.secure.on2$g */
    public static class C6292g implements C6290e {

        /* renamed from: a */
        public final C0253h f33144a;

        /* renamed from: a */
        public boolean f33145a;

        public C6292g(C0253h hVar) {
            this.f33144a = hVar;
        }

        /* renamed from: a */
        public C0253h mo41919a() {
            return this.f33144a;
        }
    }

    /* renamed from: com.onedelhi.secure.on2$h */
    public class C6293h extends C0947v {
        public C6293h(@mr2 RecyclerView recyclerView) {
            super(recyclerView);
        }

        /* renamed from: g */
        public void mo3893g(View view, @mr2 C1638a2 a2Var) {
            super.mo3893g(view, a2Var);
            a2Var.mo12553Y0(C1638a2.C1640b.m10702e(on2.this.f33110a.mo41907O(), 1, false));
        }
    }

    /* renamed from: com.onedelhi.secure.on2$i */
    public static class C6294i extends C6297l {
        public C6294i(@mr2 LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(fd3.C2161k.design_navigation_item, viewGroup, false));
            this.f4609a.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.onedelhi.secure.on2$j */
    public static class C6295j extends C6297l {
        public C6295j(@mr2 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(fd3.C2161k.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: com.onedelhi.secure.on2$k */
    public static class C6296k extends C6297l {
        public C6296k(@mr2 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(fd3.C2161k.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: com.onedelhi.secure.on2$l */
    public static abstract class C6297l extends RecyclerView.C0803f0 {
        public C6297l(View view) {
            super(view);
        }
    }

    @e83
    /* renamed from: A */
    public int mo41861A() {
        return this.f33125x;
    }

    @e83
    /* renamed from: B */
    public int mo41862B() {
        return this.f33124w;
    }

    /* renamed from: C */
    public View mo41863C(@s12 int i) {
        View inflate = this.f33104a.inflate(i, this.f33106a, false);
        mo41888c(inflate);
        return inflate;
    }

    /* renamed from: D */
    public boolean mo41864D() {
        return this.f33114c;
    }

    /* renamed from: E */
    public void mo41865E(@mr2 View view) {
        this.f33106a.removeView(view);
        if (this.f33106a.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.f33109a;
            navigationMenuView.setPadding(0, this.f33127z, 0, navigationMenuView.getPaddingBottom());
        }
    }

    /* renamed from: F */
    public void mo41866F(boolean z) {
        if (this.f33114c != z) {
            this.f33114c = z;
            mo41887a0();
        }
    }

    /* renamed from: G */
    public void mo41867G(@mr2 C0253h hVar) {
        this.f33110a.mo41914V(hVar);
    }

    /* renamed from: H */
    public void mo41868H(@e83 int i) {
        this.f33123v = i;
        mo1214d(false);
    }

    /* renamed from: I */
    public void mo41869I(@e83 int i) {
        this.f33122u = i;
        mo1214d(false);
    }

    /* renamed from: J */
    public void mo41870J(int i) {
        this.f33115n = i;
    }

    /* renamed from: K */
    public void mo41871K(@ts2 Drawable drawable) {
        this.f33102a = drawable;
        mo1214d(false);
    }

    /* renamed from: L */
    public void mo41872L(@ts2 RippleDrawable rippleDrawable) {
        this.f33103a = rippleDrawable;
        mo1214d(false);
    }

    /* renamed from: M */
    public void mo41873M(int i) {
        this.f33118q = i;
        mo1214d(false);
    }

    /* renamed from: N */
    public void mo41874N(int i) {
        this.f33120s = i;
        mo1214d(false);
    }

    /* renamed from: O */
    public void mo41875O(@zk0 int i) {
        if (this.f33121t != i) {
            this.f33121t = i;
            this.f33112b = true;
            mo1214d(false);
        }
    }

    /* renamed from: P */
    public void mo41876P(@ts2 ColorStateList colorStateList) {
        this.f33113c = colorStateList;
        mo1214d(false);
    }

    /* renamed from: Q */
    public void mo41877Q(int i) {
        this.f33126y = i;
        mo1214d(false);
    }

    /* renamed from: R */
    public void mo41878R(@e64 int i) {
        this.f33117p = i;
        mo1214d(false);
    }

    /* renamed from: S */
    public void mo41879S(@ts2 ColorStateList colorStateList) {
        this.f33111b = colorStateList;
        mo1214d(false);
    }

    /* renamed from: T */
    public void mo41880T(@e83 int i) {
        this.f33119r = i;
        mo1214d(false);
    }

    /* renamed from: U */
    public void mo41881U(int i) {
        this.f33100B = i;
        NavigationMenuView navigationMenuView = this.f33109a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    /* renamed from: V */
    public void mo41882V(@ts2 ColorStateList colorStateList) {
        this.f33101a = colorStateList;
        mo1214d(false);
    }

    /* renamed from: W */
    public void mo41883W(@e83 int i) {
        this.f33125x = i;
        mo1214d(false);
    }

    /* renamed from: X */
    public void mo41884X(@e83 int i) {
        this.f33124w = i;
        mo1214d(false);
    }

    /* renamed from: Y */
    public void mo41885Y(@e64 int i) {
        this.f33116o = i;
        mo1214d(false);
    }

    /* renamed from: Z */
    public void mo41886Z(boolean z) {
        C6287c cVar = this.f33110a;
        if (cVar != null) {
            cVar.mo41915W(z);
        }
    }

    /* renamed from: a0 */
    public final void mo41887a0() {
        int i = (this.f33106a.getChildCount() != 0 || !this.f33114c) ? 0 : this.f33127z;
        NavigationMenuView navigationMenuView = this.f33109a;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: b */
    public void mo1212b(C0248e eVar, boolean z) {
        C0258j.C0259a aVar = this.f33108a;
        if (aVar != null) {
            aVar.mo1072b(eVar, z);
        }
    }

    /* renamed from: c */
    public void mo41888c(@mr2 View view) {
        this.f33106a.addView(view);
        NavigationMenuView navigationMenuView = this.f33109a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: d */
    public void mo1214d(boolean z) {
        C6287c cVar = this.f33110a;
        if (cVar != null) {
            cVar.mo41916X();
        }
    }

    /* renamed from: e */
    public boolean mo1215e() {
        return false;
    }

    /* renamed from: f */
    public C0260k mo1216f(ViewGroup viewGroup) {
        if (this.f33109a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f33104a.inflate(fd3.C2161k.design_navigation_menu, viewGroup, false);
            this.f33109a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new C6293h(this.f33109a));
            if (this.f33110a == null) {
                this.f33110a = new C6287c();
            }
            int i = this.f33100B;
            if (i != -1) {
                this.f33109a.setOverScrollMode(i);
            }
            this.f33106a = (LinearLayout) this.f33104a.inflate(fd3.C2161k.design_navigation_item_header, this.f33109a, false);
            this.f33109a.setAdapter(this.f33110a);
        }
        return this.f33109a;
    }

    /* renamed from: g */
    public void mo1217g(@mr2 Context context, @mr2 C0248e eVar) {
        this.f33104a = LayoutInflater.from(context);
        this.f33107a = eVar;
        this.f33099A = context.getResources().getDimensionPixelOffset(fd3.C2156f.design_navigation_separator_vertical_padding);
    }

    public int getId() {
        return this.f33115n;
    }

    /* renamed from: h */
    public boolean mo1219h(C0265m mVar) {
        return false;
    }

    @mr2
    /* renamed from: i */
    public Parcelable mo1240i() {
        Bundle bundle = new Bundle();
        if (this.f33109a != null) {
            SparseArray sparseArray = new SparseArray();
            this.f33109a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C6287c cVar = this.f33110a;
        if (cVar != null) {
            bundle.putBundle(f33097c, cVar.mo41905M());
        }
        if (this.f33106a != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f33106a.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(f33098d, sparseArray2);
        }
        return bundle;
    }

    /* renamed from: j */
    public void mo1220j(C0258j.C0259a aVar) {
        this.f33108a = aVar;
    }

    /* renamed from: k */
    public boolean mo1221k(C0248e eVar, C0253h hVar) {
        return false;
    }

    /* renamed from: l */
    public void mo41889l(@mr2 sx4 sx4) {
        int r = sx4.mo24605r();
        if (this.f33127z != r) {
            this.f33127z = r;
            mo41887a0();
        }
        NavigationMenuView navigationMenuView = this.f33109a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, sx4.mo24602o());
        jt4.m18991p(this.f33106a, sx4);
    }

    /* renamed from: m */
    public boolean mo1223m(C0248e eVar, C0253h hVar) {
        return false;
    }

    /* renamed from: n */
    public void mo1242n(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f33109a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(f33097c);
            if (bundle2 != null) {
                this.f33110a.mo41912T(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray(f33098d);
            if (sparseParcelableArray2 != null) {
                this.f33106a.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @ts2
    /* renamed from: o */
    public C0253h mo41890o() {
        return this.f33110a.mo41906N();
    }

    @e83
    /* renamed from: p */
    public int mo41891p() {
        return this.f33123v;
    }

    @e83
    /* renamed from: q */
    public int mo41892q() {
        return this.f33122u;
    }

    /* renamed from: r */
    public int mo41893r() {
        return this.f33106a.getChildCount();
    }

    /* renamed from: s */
    public View mo41894s(int i) {
        return this.f33106a.getChildAt(i);
    }

    @ts2
    /* renamed from: t */
    public Drawable mo41895t() {
        return this.f33102a;
    }

    /* renamed from: u */
    public int mo41896u() {
        return this.f33118q;
    }

    /* renamed from: v */
    public int mo41897v() {
        return this.f33120s;
    }

    /* renamed from: w */
    public int mo41898w() {
        return this.f33126y;
    }

    @ts2
    /* renamed from: x */
    public ColorStateList mo41899x() {
        return this.f33111b;
    }

    @ts2
    /* renamed from: y */
    public ColorStateList mo41900y() {
        return this.f33113c;
    }

    @e83
    /* renamed from: z */
    public int mo41901z() {
        return this.f33119r;
    }
}
