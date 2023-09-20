package com.google.android.material.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0253h;
import androidx.appcompat.view.menu.C0260k;
import androidx.transition.AutoTransition;
import androidx.transition.C1086j;
import androidx.transition.TransitionSet;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C1947d7;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3516si;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.fb4;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mn2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n33;
import com.onedelhi.secure.pl2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.uw3;
import com.onedelhi.secure.za3;
import com.onedelhi.secure.zk0;
import java.util.HashSet;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public abstract class NavigationBarMenuView extends ViewGroup implements C0260k {

    /* renamed from: A */
    public static final int f24107A = -1;

    /* renamed from: a */
    public static final int[] f24108a = {16842912};

    /* renamed from: b */
    public static final int[] f24109b = {-16842910};

    /* renamed from: z */
    public static final int f24110z = 5;
    @ts2

    /* renamed from: a */
    public ColorStateList f24111a;

    /* renamed from: a */
    public Drawable f24112a;
    @mr2

    /* renamed from: a */
    public final SparseArray<View.OnTouchListener> f24113a = new SparseArray<>(5);
    @mr2

    /* renamed from: a */
    public final View.OnClickListener f24114a;

    /* renamed from: a */
    public C0248e f24115a;
    @ts2

    /* renamed from: a */
    public final TransitionSet f24116a;

    /* renamed from: a */
    public mn2 f24117a;

    /* renamed from: a */
    public final n33.C2922a<NavigationBarItemView> f24118a = new n33.C2924c(5);

    /* renamed from: a */
    public uw3 f24119a;
    @ts2

    /* renamed from: a */
    public NavigationBarItemView[] f24120a;

    /* renamed from: b */
    public ColorStateList f24121b;
    @mr2

    /* renamed from: b */
    public final SparseArray<C3516si> f24122b = new SparseArray<>(5);

    /* renamed from: b */
    public boolean f24123b;
    @ts2

    /* renamed from: c */
    public final ColorStateList f24124c = mo28346d(16842808);

    /* renamed from: c */
    public boolean f24125c = false;
    @ts2

    /* renamed from: d */
    public ColorStateList f24126d;

    /* renamed from: e */
    public ColorStateList f24127e;

    /* renamed from: n */
    public int f24128n;

    /* renamed from: o */
    public int f24129o = 0;

    /* renamed from: p */
    public int f24130p = 0;
    @zk0

    /* renamed from: q */
    public int f24131q;
    @e64

    /* renamed from: r */
    public int f24132r;
    @e64

    /* renamed from: s */
    public int f24133s;

    /* renamed from: t */
    public int f24134t;

    /* renamed from: u */
    public int f24135u = -1;

    /* renamed from: v */
    public int f24136v = -1;

    /* renamed from: w */
    public int f24137w;

    /* renamed from: x */
    public int f24138x;

    /* renamed from: y */
    public int f24139y;

    /* renamed from: com.google.android.material.navigation.NavigationBarMenuView$a */
    public class C4156a implements View.OnClickListener {
        public C4156a() {
        }

        public void onClick(View view) {
            C0253h itemData = ((NavigationBarItemView) view).getItemData();
            if (!NavigationBarMenuView.this.f24115a.mo1299P(itemData, NavigationBarMenuView.this.f24117a, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public NavigationBarMenuView(@mr2 Context context) {
        super(context);
        if (isInEditMode()) {
            this.f24116a = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.f24116a = autoTransition;
            autoTransition.mo6983S0(0);
            autoTransition.mo6941q0((long) pl2.m61421f(getContext(), fd3.C2153c.motionDurationLong1, getResources().getInteger(fd3.C2159i.material_motion_duration_long_1)));
            autoTransition.mo6945s0(pl2.m61422g(getContext(), fd3.C2153c.motionEasingStandard, C1947d7.f10650b));
            autoTransition.mo6970F0(new fb4());
        }
        this.f24114a = new C4156a();
        jt4.m18906R1(this, 1);
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView b = this.f24118a.mo20818b();
        return b == null ? mo11200f(getContext()) : b;
    }

    private void setBadgeIfNeeded(@mr2 NavigationBarItemView navigationBarItemView) {
        C3516si siVar;
        int id = navigationBarItemView.getId();
        if (mo28374m(id) && (siVar = this.f24122b.get(id)) != null) {
            navigationBarItemView.setBadge(siVar);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: c */
    public void mo28345c() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f24118a.mo20817a(navigationBarItemView);
                    navigationBarItemView.mo28301i();
                }
            }
        }
        if (this.f24115a.size() == 0) {
            this.f24129o = 0;
            this.f24130p = 0;
            this.f24120a = null;
            return;
        }
        mo28376o();
        this.f24120a = new NavigationBarItemView[this.f24115a.size()];
        boolean l = mo28373l(this.f24128n, this.f24115a.mo1291H().size());
        for (int i = 0; i < this.f24115a.size(); i++) {
            this.f24117a.mo40721l(true);
            this.f24115a.getItem(i).setCheckable(true);
            this.f24117a.mo40721l(false);
            NavigationBarItemView newItem = getNewItem();
            this.f24120a[i] = newItem;
            newItem.setIconTintList(this.f24111a);
            newItem.setIconSize(this.f24131q);
            newItem.setTextColor(this.f24124c);
            newItem.setTextAppearanceInactive(this.f24132r);
            newItem.setTextAppearanceActive(this.f24133s);
            newItem.setTextColor(this.f24121b);
            int i2 = this.f24135u;
            if (i2 != -1) {
                newItem.setItemPaddingTop(i2);
            }
            int i3 = this.f24136v;
            if (i3 != -1) {
                newItem.setItemPaddingBottom(i3);
            }
            newItem.setActiveIndicatorWidth(this.f24137w);
            newItem.setActiveIndicatorHeight(this.f24138x);
            newItem.setActiveIndicatorMarginHorizontal(this.f24139y);
            newItem.setActiveIndicatorDrawable(mo28347e());
            newItem.setActiveIndicatorResizeable(this.f24125c);
            newItem.setActiveIndicatorEnabled(this.f24123b);
            Drawable drawable = this.f24112a;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f24134t);
            }
            newItem.setItemRippleColor(this.f24126d);
            newItem.setShifting(l);
            newItem.setLabelVisibilityMode(this.f24128n);
            C0253h hVar = (C0253h) this.f24115a.getItem(i);
            newItem.mo1171b(hVar, 0);
            newItem.setItemPosition(i);
            int itemId = hVar.getItemId();
            newItem.setOnTouchListener(this.f24113a.get(itemId));
            newItem.setOnClickListener(this.f24114a);
            int i4 = this.f24129o;
            if (i4 != 0 && itemId == i4) {
                this.f24130p = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f24115a.size() - 1, this.f24130p);
        this.f24130p = min;
        this.f24115a.getItem(min).setChecked(true);
    }

    @ts2
    /* renamed from: d */
    public ColorStateList mo28346d(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = C3129p8.m24528a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(za3.C4057b.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        int[] iArr = f24109b;
        return new ColorStateList(new int[][]{iArr, f24108a, ViewGroup.EMPTY_STATE_SET}, new int[]{a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @ts2
    /* renamed from: e */
    public final Drawable mo28347e() {
        if (this.f24119a == null || this.f24127e == null) {
            return null;
        }
        bf2 bf2 = new bf2(this.f24119a);
        bf2.mo31626o0(this.f24127e);
        return bf2;
    }

    @mr2
    /* renamed from: f */
    public abstract NavigationBarItemView mo11200f(@mr2 Context context);

    /* renamed from: g */
    public void mo1198g(@mr2 C0248e eVar) {
        this.f24115a = eVar;
    }

    public SparseArray<C3516si> getBadgeDrawables() {
        return this.f24122b;
    }

    @ts2
    public ColorStateList getIconTintList() {
        return this.f24111a;
    }

    @ts2
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f24127e;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f24123b;
    }

    @e83
    public int getItemActiveIndicatorHeight() {
        return this.f24138x;
    }

    @e83
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f24139y;
    }

    @ts2
    public uw3 getItemActiveIndicatorShapeAppearance() {
        return this.f24119a;
    }

    @e83
    public int getItemActiveIndicatorWidth() {
        return this.f24137w;
    }

    @ts2
    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        return (navigationBarItemViewArr == null || navigationBarItemViewArr.length <= 0) ? this.f24112a : navigationBarItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f24134t;
    }

    @zk0
    public int getItemIconSize() {
        return this.f24131q;
    }

    @e83
    public int getItemPaddingBottom() {
        return this.f24136v;
    }

    @e83
    public int getItemPaddingTop() {
        return this.f24135u;
    }

    @ts2
    public ColorStateList getItemRippleColor() {
        return this.f24126d;
    }

    @e64
    public int getItemTextAppearanceActive() {
        return this.f24133s;
    }

    @e64
    public int getItemTextAppearanceInactive() {
        return this.f24132r;
    }

    @ts2
    public ColorStateList getItemTextColor() {
        return this.f24121b;
    }

    public int getLabelVisibilityMode() {
        return this.f24128n;
    }

    @ts2
    public C0248e getMenu() {
        return this.f24115a;
    }

    public int getSelectedItemId() {
        return this.f24129o;
    }

    public int getSelectedItemPosition() {
        return this.f24130p;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @ts2
    /* renamed from: h */
    public NavigationBarItemView mo28369h(int i) {
        mo28381s(i);
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr == null) {
            return null;
        }
        for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
            if (navigationBarItemView.getId() == i) {
                return navigationBarItemView;
            }
        }
        return null;
    }

    @ts2
    /* renamed from: i */
    public C3516si mo28370i(int i) {
        return this.f24122b.get(i);
    }

    /* renamed from: j */
    public C3516si mo28371j(int i) {
        mo28381s(i);
        C3516si siVar = this.f24122b.get(i);
        if (siVar == null) {
            siVar = C3516si.m27588d(getContext());
            this.f24122b.put(i, siVar);
        }
        NavigationBarItemView h = mo28369h(i);
        if (h != null) {
            h.setBadge(siVar);
        }
        return siVar;
    }

    /* renamed from: k */
    public boolean mo28372k() {
        return this.f24125c;
    }

    /* renamed from: l */
    public boolean mo28373l(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo28374m(int i) {
        return i != -1;
    }

    /* renamed from: n */
    public void mo28375n(int i) {
        mo28381s(i);
        C3516si siVar = this.f24122b.get(i);
        NavigationBarItemView h = mo28369h(i);
        if (h != null) {
            h.mo28311q();
        }
        if (siVar != null) {
            this.f24122b.remove(i);
        }
    }

    /* renamed from: o */
    public final void mo28376o() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f24115a.size(); i++) {
            hashSet.add(Integer.valueOf(this.f24115a.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f24122b.size(); i2++) {
            int keyAt = this.f24122b.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f24122b.delete(keyAt);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(@mr2 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1638a2.m10547X1(accessibilityNodeInfo).mo12553Y0(C1638a2.C1640b.m10703f(1, this.f24115a.mo1291H().size(), false, 1));
    }

    /* renamed from: p */
    public void mo28378p(SparseArray<C3516si> sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            if (this.f24122b.indexOfKey(keyAt) < 0) {
                this.f24122b.append(keyAt, sparseArray.get(keyAt));
            }
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setBadge(this.f24122b.get(navigationBarItemView.getId()));
            }
        }
    }

    /* renamed from: q */
    public void mo28379q(int i) {
        int size = this.f24115a.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f24115a.getItem(i2);
            if (i == item.getItemId()) {
                this.f24129o = i;
                this.f24130p = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    /* renamed from: r */
    public void mo28380r() {
        TransitionSet transitionSet;
        C0248e eVar = this.f24115a;
        if (eVar != null && this.f24120a != null) {
            int size = eVar.size();
            if (size != this.f24120a.length) {
                mo28345c();
                return;
            }
            int i = this.f24129o;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = this.f24115a.getItem(i2);
                if (item.isChecked()) {
                    this.f24129o = item.getItemId();
                    this.f24130p = i2;
                }
            }
            if (!(i == this.f24129o || (transitionSet = this.f24116a) == null)) {
                C1086j.m7185b(this, transitionSet);
            }
            boolean l = mo28373l(this.f24128n, this.f24115a.mo1291H().size());
            for (int i3 = 0; i3 < size; i3++) {
                this.f24117a.mo40721l(true);
                this.f24120a[i3].setLabelVisibilityMode(this.f24128n);
                this.f24120a[i3].setShifting(l);
                this.f24120a[i3].mo1171b((C0253h) this.f24115a.getItem(i3), 0);
                this.f24117a.mo40721l(false);
            }
        }
    }

    /* renamed from: s */
    public final void mo28381s(int i) {
        if (!mo28374m(i)) {
            throw new IllegalArgumentException(i + " is not a valid view id");
        }
    }

    public void setIconTintList(@ts2 ColorStateList colorStateList) {
        this.f24111a = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView iconTintList : navigationBarItemViewArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(@ts2 ColorStateList colorStateList) {
        this.f24127e = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorDrawable : navigationBarItemViewArr) {
                activeIndicatorDrawable.setActiveIndicatorDrawable(mo28347e());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f24123b = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorEnabled : navigationBarItemViewArr) {
                activeIndicatorEnabled.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@e83 int i) {
        this.f24138x = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorHeight : navigationBarItemViewArr) {
                activeIndicatorHeight.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@e83 int i) {
        this.f24139y = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorMarginHorizontal : navigationBarItemViewArr) {
                activeIndicatorMarginHorizontal.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.f24125c = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorResizeable : navigationBarItemViewArr) {
                activeIndicatorResizeable.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@ts2 uw3 uw3) {
        this.f24119a = uw3;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorDrawable : navigationBarItemViewArr) {
                activeIndicatorDrawable.setActiveIndicatorDrawable(mo28347e());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@e83 int i) {
        this.f24137w = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorWidth : navigationBarItemViewArr) {
                activeIndicatorWidth.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(@ts2 Drawable drawable) {
        this.f24112a = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemBackground : navigationBarItemViewArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f24134t = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemBackground : navigationBarItemViewArr) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(@zk0 int i) {
        this.f24131q = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView iconSize : navigationBarItemViewArr) {
                iconSize.setIconSize(i);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i, @ts2 View.OnTouchListener onTouchListener) {
        SparseArray<View.OnTouchListener> sparseArray = this.f24113a;
        if (onTouchListener == null) {
            sparseArray.remove(i);
        } else {
            sparseArray.put(i, onTouchListener);
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView.getItemData().getItemId() == i) {
                    navigationBarItemView.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(@e83 int i) {
        this.f24136v = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemPaddingBottom : navigationBarItemViewArr) {
                itemPaddingBottom.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(@e83 int i) {
        this.f24135u = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemPaddingTop : navigationBarItemViewArr) {
                itemPaddingTop.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(@ts2 ColorStateList colorStateList) {
        this.f24126d = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemRippleColor : navigationBarItemViewArr) {
                itemRippleColor.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(@e64 int i) {
        this.f24133s = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f24121b;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@e64 int i) {
        this.f24132r = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f24121b;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(@ts2 ColorStateList colorStateList) {
        this.f24121b = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24120a;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView textColor : navigationBarItemViewArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f24128n = i;
    }

    public void setPresenter(@mr2 mn2 mn2) {
        this.f24117a = mn2;
    }
}
