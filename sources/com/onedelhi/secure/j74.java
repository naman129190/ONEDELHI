package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public interface j74 extends MenuItem {

    /* renamed from: g */
    public static final int f14031g = 0;

    /* renamed from: h */
    public static final int f14032h = 1;

    /* renamed from: i */
    public static final int f14033i = 2;

    /* renamed from: j */
    public static final int f14034j = 4;

    /* renamed from: k */
    public static final int f14035k = 8;

    @mr2
    /* renamed from: a */
    j74 mo1389a(@ts2 C3665u2 u2Var);

    @mr2
    /* renamed from: b */
    j74 mo1390b(@ts2 CharSequence charSequence);

    @mr2
    /* renamed from: c */
    j74 mo1391c(@ts2 CharSequence charSequence);

    boolean collapseActionView();

    /* renamed from: d */
    boolean mo1393d();

    /* renamed from: e */
    boolean mo1394e();

    boolean expandActionView();

    @ts2
    /* renamed from: f */
    C3665u2 mo1396f();

    @ts2
    View getActionView();

    int getAlphabeticModifiers();

    @ts2
    CharSequence getContentDescription();

    @ts2
    ColorStateList getIconTintList();

    @ts2
    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    @ts2
    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    @mr2
    MenuItem setActionView(int i);

    @mr2
    MenuItem setActionView(@ts2 View view);

    @mr2
    MenuItem setAlphabeticShortcut(char c, int i);

    @mr2
    /* bridge */ /* synthetic */ MenuItem setContentDescription(@ts2 CharSequence charSequence);

    @mr2
    MenuItem setIconTintList(@ts2 ColorStateList colorStateList);

    @mr2
    MenuItem setIconTintMode(@ts2 PorterDuff.Mode mode);

    @mr2
    MenuItem setNumericShortcut(char c, int i);

    @mr2
    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    @mr2
    MenuItem setShowAsActionFlags(int i);

    @mr2
    /* bridge */ /* synthetic */ MenuItem setTooltipText(@ts2 CharSequence charSequence);
}
