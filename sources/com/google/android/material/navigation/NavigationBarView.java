package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0260k;
import com.onedelhi.secure.C2015e0;
import com.onedelhi.secure.C3516si;
import com.onedelhi.secure.C3982yb;
import com.onedelhi.secure.af2;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.cf2;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.h74;
import com.onedelhi.secure.hf2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.ln2;
import com.onedelhi.secure.mn2;
import com.onedelhi.secure.mo1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ob4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.uw3;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.yk0;
import com.onedelhi.secure.zk0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: n */
    public static final int f24141n = -1;

    /* renamed from: o */
    public static final int f24142o = 0;

    /* renamed from: p */
    public static final int f24143p = 1;

    /* renamed from: q */
    public static final int f24144q = 2;

    /* renamed from: r */
    public static final int f24145r = 1;

    /* renamed from: a */
    public MenuInflater f24146a;
    @mr2

    /* renamed from: a */
    public final NavigationBarMenuView f24147a;

    /* renamed from: a */
    public C4159c f24148a;

    /* renamed from: a */
    public C4160d f24149a;
    @mr2

    /* renamed from: a */
    public final ln2 f24150a;
    @mr2

    /* renamed from: a */
    public final mn2 f24151a;

    /* renamed from: com.google.android.material.navigation.NavigationBarView$a */
    public class C4157a implements C0248e.C0249a {
        public C4157a() {
        }

        /* renamed from: a */
        public void mo1031a(C0248e eVar) {
        }

        /* renamed from: b */
        public boolean mo1033b(C0248e eVar, @mr2 MenuItem menuItem) {
            if (NavigationBarView.this.f24148a == null || menuItem.getItemId() != NavigationBarView.this.getSelectedItemId()) {
                return NavigationBarView.this.f24149a != null && !NavigationBarView.this.f24149a.mo28456a(menuItem);
            }
            NavigationBarView.this.f24148a.mo28455a(menuItem);
            return true;
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.navigation.NavigationBarView$b */
    public @interface C4158b {
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$c */
    public interface C4159c {
        /* renamed from: a */
        void mo28455a(@mr2 MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$d */
    public interface C4160d {
        /* renamed from: a */
        boolean mo28456a(@mr2 MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$e */
    public static class C4161e extends C2015e0 {
        public static final Parcelable.Creator<C4161e> CREATOR = new C4162a();
        @ts2

        /* renamed from: a */
        public Bundle f24153a;

        /* renamed from: com.google.android.material.navigation.NavigationBarView$e$a */
        public class C4162a implements Parcelable.ClassLoaderCreator<C4161e> {
            @ts2
            /* renamed from: a */
            public C4161e createFromParcel(@mr2 Parcel parcel) {
                return new C4161e(parcel, (ClassLoader) null);
            }

            @mr2
            /* renamed from: b */
            public C4161e createFromParcel(@mr2 Parcel parcel, ClassLoader classLoader) {
                return new C4161e(parcel, classLoader);
            }

            @mr2
            /* renamed from: c */
            public C4161e[] newArray(int i) {
                return new C4161e[i];
            }
        }

        public C4161e(@mr2 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            mo28457b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        public C4161e(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        public final void mo28457b(@mr2 Parcel parcel, ClassLoader classLoader) {
            this.f24153a = parcel.readBundle(classLoader);
        }

        public void writeToParcel(@mr2 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f24153a);
        }
    }

    public NavigationBarView(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i, @e64 int i2) {
        super(hf2.m50488c(context, attributeSet, i, i2), attributeSet, i);
        mn2 mn2 = new mn2();
        this.f24151a = mn2;
        Context context2 = getContext();
        int[] iArr = fd3.C2165o.NavigationBarView;
        int i3 = fd3.C2165o.NavigationBarView_itemTextAppearanceInactive;
        int i4 = fd3.C2165o.NavigationBarView_itemTextAppearanceActive;
        af4 l = ob4.m59196l(context2, attributeSet, iArr, i, i2, i3, i4);
        ln2 ln2 = new ln2(context2, getClass(), getMaxItemCount());
        this.f24150a = ln2;
        NavigationBarMenuView d = mo11205d(context2);
        this.f24147a = d;
        mn2.mo40720c(d);
        mn2.mo40719a(1);
        d.setPresenter(mn2);
        ln2.mo1321b(mn2);
        mn2.mo1217g(getContext(), ln2);
        int i5 = fd3.C2165o.NavigationBarView_itemIconTint;
        d.setIconTintList(l.mo13026C(i5) ? l.mo13033d(i5) : d.mo28346d(16842808));
        setItemIconSize(l.mo13036g(fd3.C2165o.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(fd3.C2156f.mtrl_navigation_bar_item_default_icon_size)));
        if (l.mo13026C(i3)) {
            setItemTextAppearanceInactive(l.mo13050u(i3, 0));
        }
        if (l.mo13026C(i4)) {
            setItemTextAppearanceActive(l.mo13050u(i4, 0));
        }
        int i6 = fd3.C2165o.NavigationBarView_itemTextColor;
        if (l.mo13026C(i6)) {
            setItemTextColor(l.mo13033d(i6));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            jt4.m18877I1(this, mo28403c(context2));
        }
        int i7 = fd3.C2165o.NavigationBarView_itemPaddingTop;
        if (l.mo13026C(i7)) {
            setItemPaddingTop(l.mo13036g(i7, 0));
        }
        int i8 = fd3.C2165o.NavigationBarView_itemPaddingBottom;
        if (l.mo13026C(i8)) {
            setItemPaddingBottom(l.mo13036g(i8, 0));
        }
        int i9 = fd3.C2165o.NavigationBarView_elevation;
        if (l.mo13026C(i9)) {
            setElevation((float) l.mo13036g(i9, 0));
        }
        wo0.m30986o(getBackground().mutate(), af2.m38611b(context2, l, fd3.C2165o.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(l.mo13045p(fd3.C2165o.NavigationBarView_labelVisibilityMode, -1));
        int u = l.mo13050u(fd3.C2165o.NavigationBarView_itemBackground, 0);
        if (u != 0) {
            d.setItemBackgroundRes(u);
        } else {
            setItemRippleColor(af2.m38611b(context2, l, fd3.C2165o.NavigationBarView_itemRippleColor));
        }
        int u2 = l.mo13050u(fd3.C2165o.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (u2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(u2, fd3.C2165o.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(fd3.C2165o.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(fd3.C2165o.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(fd3.C2165o.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(af2.m38610a(context2, obtainStyledAttributes, fd3.C2165o.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(uw3.m67444b(context2, obtainStyledAttributes.getResourceId(fd3.C2165o.NavigationBarActiveIndicator_shapeAppearance, 0), 0).mo45845m());
            obtainStyledAttributes.recycle();
        }
        int i10 = fd3.C2165o.NavigationBarView_menu;
        if (l.mo13026C(i10)) {
            mo28406g(l.mo13050u(i10, 0));
        }
        l.mo13029I();
        addView(d);
        ln2.mo1307X(new C4157a());
    }

    private MenuInflater getMenuInflater() {
        if (this.f24146a == null) {
            this.f24146a = new h74(getContext());
        }
        return this.f24146a;
    }

    @mr2
    /* renamed from: c */
    public final bf2 mo28403c(Context context) {
        bf2 bf2 = new bf2();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            bf2.mo31626o0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        bf2.mo31599Z(context);
        return bf2;
    }

    @mr2
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: d */
    public abstract NavigationBarMenuView mo11205d(@mr2 Context context);

    @ts2
    /* renamed from: e */
    public C3516si mo28404e(int i) {
        return this.f24147a.mo28370i(i);
    }

    @mr2
    /* renamed from: f */
    public C3516si mo28405f(int i) {
        return this.f24147a.mo28371j(i);
    }

    /* renamed from: g */
    public void mo28406g(int i) {
        this.f24151a.mo40721l(true);
        getMenuInflater().inflate(i, this.f24150a);
        this.f24151a.mo40721l(false);
        this.f24151a.mo1214d(true);
    }

    @ts2
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f24147a.getItemActiveIndicatorColor();
    }

    @e83
    public int getItemActiveIndicatorHeight() {
        return this.f24147a.getItemActiveIndicatorHeight();
    }

    @e83
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f24147a.getItemActiveIndicatorMarginHorizontal();
    }

    @ts2
    public uw3 getItemActiveIndicatorShapeAppearance() {
        return this.f24147a.getItemActiveIndicatorShapeAppearance();
    }

    @e83
    public int getItemActiveIndicatorWidth() {
        return this.f24147a.getItemActiveIndicatorWidth();
    }

    @ts2
    public Drawable getItemBackground() {
        return this.f24147a.getItemBackground();
    }

    @dp0
    @Deprecated
    public int getItemBackgroundResource() {
        return this.f24147a.getItemBackgroundRes();
    }

    @zk0
    public int getItemIconSize() {
        return this.f24147a.getItemIconSize();
    }

    @ts2
    public ColorStateList getItemIconTintList() {
        return this.f24147a.getIconTintList();
    }

    @e83
    public int getItemPaddingBottom() {
        return this.f24147a.getItemPaddingBottom();
    }

    @e83
    public int getItemPaddingTop() {
        return this.f24147a.getItemPaddingTop();
    }

    @ts2
    public ColorStateList getItemRippleColor() {
        return this.f24147a.getItemRippleColor();
    }

    @e64
    public int getItemTextAppearanceActive() {
        return this.f24147a.getItemTextAppearanceActive();
    }

    @e64
    public int getItemTextAppearanceInactive() {
        return this.f24147a.getItemTextAppearanceInactive();
    }

    @ts2
    public ColorStateList getItemTextColor() {
        return this.f24147a.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f24147a.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @mr2
    public Menu getMenu() {
        return this.f24150a;
    }

    @mr2
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    public C0260k getMenuView() {
        return this.f24147a;
    }

    @mr2
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    public mn2 getPresenter() {
        return this.f24151a;
    }

    @mo1
    public int getSelectedItemId() {
        return this.f24147a.getSelectedItemId();
    }

    /* renamed from: h */
    public boolean mo28427h() {
        return this.f24147a.getItemActiveIndicatorEnabled();
    }

    /* renamed from: i */
    public void mo28428i(int i) {
        this.f24147a.mo28375n(i);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cf2.m40864e(this);
    }

    public void onRestoreInstanceState(@ts2 Parcelable parcelable) {
        if (!(parcelable instanceof C4161e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4161e eVar = (C4161e) parcelable;
        super.onRestoreInstanceState(eVar.mo14959a());
        this.f24150a.mo1304U(eVar.f24153a);
    }

    @mr2
    public Parcelable onSaveInstanceState() {
        C4161e eVar = new C4161e(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        eVar.f24153a = bundle;
        this.f24150a.mo1306W(bundle);
        return eVar;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        cf2.m40863d(this, f);
    }

    public void setItemActiveIndicatorColor(@ts2 ColorStateList colorStateList) {
        this.f24147a.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f24147a.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(@e83 int i) {
        this.f24147a.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(@e83 int i) {
        this.f24147a.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(@ts2 uw3 uw3) {
        this.f24147a.setItemActiveIndicatorShapeAppearance(uw3);
    }

    public void setItemActiveIndicatorWidth(@e83 int i) {
        this.f24147a.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(@ts2 Drawable drawable) {
        this.f24147a.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@dp0 int i) {
        this.f24147a.setItemBackgroundRes(i);
    }

    public void setItemIconSize(@zk0 int i) {
        this.f24147a.setItemIconSize(i);
    }

    public void setItemIconSizeRes(@yk0 int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(@ts2 ColorStateList colorStateList) {
        this.f24147a.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i, @ts2 View.OnTouchListener onTouchListener) {
        this.f24147a.setItemOnTouchListener(i, onTouchListener);
    }

    public void setItemPaddingBottom(@e83 int i) {
        this.f24147a.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(@e83 int i) {
        this.f24147a.setItemPaddingTop(i);
    }

    public void setItemRippleColor(@ts2 ColorStateList colorStateList) {
        this.f24147a.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(@e64 int i) {
        this.f24147a.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(@e64 int i) {
        this.f24147a.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(@ts2 ColorStateList colorStateList) {
        this.f24147a.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f24147a.getLabelVisibilityMode() != i) {
            this.f24147a.setLabelVisibilityMode(i);
            this.f24151a.mo1214d(false);
        }
    }

    public void setOnItemReselectedListener(@ts2 C4159c cVar) {
        this.f24148a = cVar;
    }

    public void setOnItemSelectedListener(@ts2 C4160d dVar) {
        this.f24149a = dVar;
    }

    public void setSelectedItemId(@mo1 int i) {
        MenuItem findItem = this.f24150a.findItem(i);
        if (findItem != null && !this.f24150a.mo1299P(findItem, this.f24151a, 0)) {
            findItem.setChecked(true);
        }
    }
}
