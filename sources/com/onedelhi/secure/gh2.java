package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import com.onedelhi.secure.C3665u2;
import com.onedelhi.secure.hl3;
import java.lang.reflect.Method;

@hl3({hl3.C2354a.f13188c})
public class gh2 extends C3067oj implements MenuItem {

    /* renamed from: a */
    public static final String f12584a = "MenuItemWrapper";

    /* renamed from: a */
    public final j74 f12585a;

    /* renamed from: a */
    public Method f12586a;

    /* renamed from: com.onedelhi.secure.gh2$a */
    public class C2248a extends C3665u2 {

        /* renamed from: a */
        public final ActionProvider f12587a;

        public C2248a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f12587a = actionProvider;
        }

        /* renamed from: b */
        public boolean mo2533b() {
            return this.f12587a.hasSubMenu();
        }

        /* renamed from: d */
        public View mo2534d() {
            return this.f12587a.onCreateActionView();
        }

        /* renamed from: f */
        public boolean mo16638f() {
            return this.f12587a.onPerformDefaultAction();
        }

        /* renamed from: g */
        public void mo2535g(SubMenu subMenu) {
            this.f12587a.onPrepareSubMenu(gh2.this.mo21955h(subMenu));
        }
    }

    @sj3(16)
    /* renamed from: com.onedelhi.secure.gh2$b */
    public class C2249b extends C2248a implements ActionProvider.VisibilityListener {

        /* renamed from: b */
        public C3665u2.C3667b f12590b;

        public C2249b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: c */
        public boolean mo16639c() {
            return this.f12587a.isVisible();
        }

        /* renamed from: e */
        public View mo16640e(MenuItem menuItem) {
            return this.f12587a.onCreateActionView(menuItem);
        }

        /* renamed from: h */
        public boolean mo16641h() {
            return this.f12587a.overridesItemVisibility();
        }

        /* renamed from: i */
        public void mo16642i() {
            this.f12587a.refreshVisibility();
        }

        /* renamed from: l */
        public void mo16643l(C3665u2.C3667b bVar) {
            this.f12590b = bVar;
            this.f12587a.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C3665u2.C3667b bVar = this.f12590b;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.gh2$c */
    public static class C2250c extends FrameLayout implements l00 {

        /* renamed from: a */
        public final CollapsibleActionView f12591a;

        public C2250c(View view) {
            super(view.getContext());
            this.f12591a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public View mo16645a() {
            return (View) this.f12591a;
        }

        /* renamed from: c */
        public void mo2166c() {
            this.f12591a.onActionViewExpanded();
        }

        /* renamed from: e */
        public void mo2170e() {
            this.f12591a.onActionViewCollapsed();
        }
    }

    /* renamed from: com.onedelhi.secure.gh2$d */
    public class C2251d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f12592a;

        public C2251d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f12592a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f12592a.onMenuItemActionCollapse(gh2.this.mo21954g(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f12592a.onMenuItemActionExpand(gh2.this.mo21954g(menuItem));
        }
    }

    /* renamed from: com.onedelhi.secure.gh2$e */
    public class C2252e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public final MenuItem.OnMenuItemClickListener f12594a;

        public C2252e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f12594a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f12594a.onMenuItemClick(gh2.this.mo21954g(menuItem));
        }
    }

    public gh2(Context context, j74 j74) {
        super(context);
        if (j74 != null) {
            this.f12585a = j74;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f12585a.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f12585a.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C3665u2 f = this.f12585a.mo1396f();
        if (f instanceof C2248a) {
            return ((C2248a) f).f12587a;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f12585a.getActionView();
        return actionView instanceof C2250c ? ((C2250c) actionView).mo16645a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f12585a.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f12585a.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f12585a.getContentDescription();
    }

    public int getGroupId() {
        return this.f12585a.getGroupId();
    }

    public Drawable getIcon() {
        return this.f12585a.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f12585a.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f12585a.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f12585a.getIntent();
    }

    public int getItemId() {
        return this.f12585a.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f12585a.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f12585a.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f12585a.getNumericShortcut();
    }

    public int getOrder() {
        return this.f12585a.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo21955h(this.f12585a.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f12585a.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f12585a.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f12585a.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f12585a.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f12585a.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f12585a.isCheckable();
    }

    public boolean isChecked() {
        return this.f12585a.isChecked();
    }

    public boolean isEnabled() {
        return this.f12585a.isEnabled();
    }

    public boolean isVisible() {
        return this.f12585a.isVisible();
    }

    /* renamed from: l */
    public void mo16610l(boolean z) {
        try {
            if (this.f12586a == null) {
                this.f12586a = this.f12585a.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f12586a.invoke(this.f12585a, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w(f12584a, "Error while calling setExclusiveCheckable", e);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C2249b bVar = new C2249b(this.f17984a, actionProvider);
        j74 j74 = this.f12585a;
        if (actionProvider == null) {
            bVar = null;
        }
        j74.mo1389a(bVar);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f12585a.setActionView(i);
        View actionView = this.f12585a.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f12585a.setActionView((View) new C2250c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C2250c(view);
        }
        this.f12585a.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f12585a.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f12585a.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f12585a.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f12585a.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f12585a.mo1390b(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f12585a.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f12585a.setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f12585a.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f12585a.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f12585a.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f12585a.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f12585a.setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f12585a.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f12585a.setOnActionExpandListener(onActionExpandListener != null ? new C2251d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f12585a.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C2252e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f12585a.setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f12585a.setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f12585a.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f12585a.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f12585a.setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f12585a.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f12585a.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f12585a.mo1391c(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f12585a.setVisible(z);
    }
}
