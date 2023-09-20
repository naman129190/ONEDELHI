package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
/* renamed from: com.onedelhi.secure.r2 */
public class C3353r2 implements j74 {

    /* renamed from: r */
    public static final int f19541r = 1;

    /* renamed from: s */
    public static final int f19542s = 2;

    /* renamed from: t */
    public static final int f19543t = 4;

    /* renamed from: u */
    public static final int f19544u = 8;

    /* renamed from: v */
    public static final int f19545v = 16;

    /* renamed from: a */
    public char f19546a;

    /* renamed from: a */
    public Context f19547a;

    /* renamed from: a */
    public Intent f19548a;

    /* renamed from: a */
    public ColorStateList f19549a = null;

    /* renamed from: a */
    public PorterDuff.Mode f19550a = null;

    /* renamed from: a */
    public Drawable f19551a;

    /* renamed from: a */
    public MenuItem.OnMenuItemClickListener f19552a;

    /* renamed from: a */
    public CharSequence f19553a;

    /* renamed from: a */
    public boolean f19554a = false;

    /* renamed from: b */
    public char f19555b;

    /* renamed from: b */
    public CharSequence f19556b;

    /* renamed from: b */
    public boolean f19557b = false;

    /* renamed from: c */
    public CharSequence f19558c;

    /* renamed from: d */
    public CharSequence f19559d;

    /* renamed from: l */
    public final int f19560l;

    /* renamed from: m */
    public final int f19561m;

    /* renamed from: n */
    public final int f19562n;

    /* renamed from: o */
    public int f19563o = 4096;

    /* renamed from: p */
    public int f19564p = 4096;

    /* renamed from: q */
    public int f19565q = 16;

    public C3353r2(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f19547a = context;
        this.f19560l = i2;
        this.f19561m = i;
        this.f19562n = i4;
        this.f19553a = charSequence;
    }

    @mr2
    /* renamed from: a */
    public j74 mo1389a(C3665u2 u2Var) {
        throw new UnsupportedOperationException();
    }

    @mr2
    /* renamed from: b */
    public j74 setContentDescription(CharSequence charSequence) {
        this.f19558c = charSequence;
        return this;
    }

    @mr2
    /* renamed from: c */
    public j74 setTooltipText(CharSequence charSequence) {
        this.f19559d = charSequence;
        return this;
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public boolean mo1393d() {
        return true;
    }

    /* renamed from: e */
    public boolean mo1394e() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public C3665u2 mo1396f() {
        return null;
    }

    /* renamed from: g */
    public final void mo23516g() {
        Drawable drawable = this.f19551a;
        if (drawable == null) {
            return;
        }
        if (this.f19554a || this.f19557b) {
            Drawable r = wo0.m30989r(drawable);
            this.f19551a = r;
            Drawable mutate = r.mutate();
            this.f19551a = mutate;
            if (this.f19554a) {
                wo0.m30986o(mutate, this.f19549a);
            }
            if (this.f19557b) {
                wo0.m30987p(this.f19551a, this.f19550a);
            }
        }
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f19564p;
    }

    public char getAlphabeticShortcut() {
        return this.f19555b;
    }

    public CharSequence getContentDescription() {
        return this.f19558c;
    }

    public int getGroupId() {
        return this.f19561m;
    }

    public Drawable getIcon() {
        return this.f19551a;
    }

    public ColorStateList getIconTintList() {
        return this.f19549a;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f19550a;
    }

    public Intent getIntent() {
        return this.f19548a;
    }

    public int getItemId() {
        return this.f19560l;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f19563o;
    }

    public char getNumericShortcut() {
        return this.f19546a;
    }

    public int getOrder() {
        return this.f19562n;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f19553a;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f19556b;
        return charSequence != null ? charSequence : this.f19553a;
    }

    public CharSequence getTooltipText() {
        return this.f19559d;
    }

    /* renamed from: h */
    public boolean mo23529h() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f19552a;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f19548a;
        if (intent == null) {
            return false;
        }
        this.f19547a.startActivity(intent);
        return true;
    }

    public boolean hasSubMenu() {
        return false;
    }

    @mr2
    /* renamed from: i */
    public j74 setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f19565q & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f19565q & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f19565q & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f19565q & 8) == 0;
    }

    @mr2
    /* renamed from: j */
    public j74 setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public C3353r2 mo23537k(boolean z) {
        this.f19565q = (z ? 4 : 0) | (this.f19565q & -5);
        return this;
    }

    @mr2
    /* renamed from: l */
    public j74 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f19555b = Character.toLowerCase(c);
        return this;
    }

    @mr2
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f19555b = Character.toLowerCase(c);
        this.f19564p = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f19565q = z | (this.f19565q & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f19565q = (z ? 2 : 0) | (this.f19565q & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f19565q = (z ? 16 : 0) | (this.f19565q & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f19551a = r70.m26356i(this.f19547a, i);
        mo23516g();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f19551a = drawable;
        mo23516g();
        return this;
    }

    @mr2
    public MenuItem setIconTintList(@ts2 ColorStateList colorStateList) {
        this.f19549a = colorStateList;
        this.f19554a = true;
        mo23516g();
        return this;
    }

    @mr2
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f19550a = mode;
        this.f19557b = true;
        mo23516g();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f19548a = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f19546a = c;
        return this;
    }

    @mr2
    public MenuItem setNumericShortcut(char c, int i) {
        this.f19546a = c;
        this.f19563o = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f19552a = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f19546a = c;
        this.f19555b = Character.toLowerCase(c2);
        return this;
    }

    @mr2
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f19546a = c;
        this.f19563o = KeyEvent.normalizeMetaState(i);
        this.f19555b = Character.toLowerCase(c2);
        this.f19564p = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setTitle(int i) {
        this.f19553a = this.f19547a.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f19553a = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f19556b = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f19565q & 8;
        if (z) {
            i = 0;
        }
        this.f19565q = i2 | i;
        return this;
    }
}
