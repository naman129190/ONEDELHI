package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public final class eh2 {
    @Deprecated

    /* renamed from: a */
    public static final int f11225a = 0;

    /* renamed from: a */
    public static final String f11226a = "MenuItemCompat";
    @Deprecated

    /* renamed from: b */
    public static final int f11227b = 1;
    @Deprecated

    /* renamed from: c */
    public static final int f11228c = 2;
    @Deprecated

    /* renamed from: d */
    public static final int f11229d = 4;
    @Deprecated

    /* renamed from: e */
    public static final int f11230e = 8;

    /* renamed from: com.onedelhi.secure.eh2$a */
    public class C2060a implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final /* synthetic */ C2062c f11231a;

        public C2060a(C2062c cVar) {
            this.f11231a = cVar;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f11231a.onMenuItemActionCollapse(menuItem);
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f11231a.onMenuItemActionExpand(menuItem);
        }
    }

    @sj3(26)
    /* renamed from: com.onedelhi.secure.eh2$b */
    public static class C2061b {
        @pn0
        /* renamed from: a */
        public static int m13781a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        @pn0
        /* renamed from: b */
        public static CharSequence m13782b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        @pn0
        /* renamed from: c */
        public static ColorStateList m13783c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        @pn0
        /* renamed from: d */
        public static PorterDuff.Mode m13784d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        @pn0
        /* renamed from: e */
        public static int m13785e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        @pn0
        /* renamed from: f */
        public static CharSequence m13786f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        @pn0
        /* renamed from: g */
        public static MenuItem m13787g(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        @pn0
        /* renamed from: h */
        public static MenuItem m13788h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        @pn0
        /* renamed from: i */
        public static MenuItem m13789i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        @pn0
        /* renamed from: j */
        public static MenuItem m13790j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        @pn0
        /* renamed from: k */
        public static MenuItem m13791k(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        @pn0
        /* renamed from: l */
        public static MenuItem m13792l(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        @pn0
        /* renamed from: m */
        public static MenuItem m13793m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    @Deprecated
    /* renamed from: com.onedelhi.secure.eh2$c */
    public interface C2062c {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m13758a(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m13759b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @ts2
    /* renamed from: c */
    public static C3665u2 m13760c(@mr2 MenuItem menuItem) {
        if (menuItem instanceof j74) {
            return ((j74) menuItem).mo1396f();
        }
        Log.w(f11226a, "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @Deprecated
    /* renamed from: d */
    public static View m13761d(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    /* renamed from: e */
    public static int m13762e(@mr2 MenuItem menuItem) {
        if (menuItem instanceof j74) {
            return ((j74) menuItem).getAlphabeticModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return C2061b.m13781a(menuItem);
        }
        return 0;
    }

    @ts2
    /* renamed from: f */
    public static CharSequence m13763f(@mr2 MenuItem menuItem) {
        if (menuItem instanceof j74) {
            return ((j74) menuItem).getContentDescription();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return C2061b.m13782b(menuItem);
        }
        return null;
    }

    @ts2
    /* renamed from: g */
    public static ColorStateList m13764g(@mr2 MenuItem menuItem) {
        if (menuItem instanceof j74) {
            return ((j74) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return C2061b.m13783c(menuItem);
        }
        return null;
    }

    @ts2
    /* renamed from: h */
    public static PorterDuff.Mode m13765h(@mr2 MenuItem menuItem) {
        if (menuItem instanceof j74) {
            return ((j74) menuItem).getIconTintMode();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return C2061b.m13784d(menuItem);
        }
        return null;
    }

    /* renamed from: i */
    public static int m13766i(@mr2 MenuItem menuItem) {
        if (menuItem instanceof j74) {
            return ((j74) menuItem).getNumericModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return C2061b.m13785e(menuItem);
        }
        return 0;
    }

    @ts2
    /* renamed from: j */
    public static CharSequence m13767j(@mr2 MenuItem menuItem) {
        if (menuItem instanceof j74) {
            return ((j74) menuItem).getTooltipText();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return C2061b.m13786f(menuItem);
        }
        return null;
    }

    @Deprecated
    /* renamed from: k */
    public static boolean m13768k(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @ts2
    /* renamed from: l */
    public static MenuItem m13769l(@mr2 MenuItem menuItem, @ts2 C3665u2 u2Var) {
        if (menuItem instanceof j74) {
            return ((j74) menuItem).mo1389a(u2Var);
        }
        Log.w(f11226a, "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    @Deprecated
    /* renamed from: m */
    public static MenuItem m13770m(MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }

    @Deprecated
    /* renamed from: n */
    public static MenuItem m13771n(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    /* renamed from: o */
    public static void m13772o(@mr2 MenuItem menuItem, char c, int i) {
        if (menuItem instanceof j74) {
            ((j74) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C2061b.m13787g(menuItem, c, i);
        }
    }

    /* renamed from: p */
    public static void m13773p(@mr2 MenuItem menuItem, @ts2 CharSequence charSequence) {
        if (menuItem instanceof j74) {
            ((j74) menuItem).mo1390b(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C2061b.m13788h(menuItem, charSequence);
        }
    }

    /* renamed from: q */
    public static void m13774q(@mr2 MenuItem menuItem, @ts2 ColorStateList colorStateList) {
        if (menuItem instanceof j74) {
            ((j74) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C2061b.m13789i(menuItem, colorStateList);
        }
    }

    /* renamed from: r */
    public static void m13775r(@mr2 MenuItem menuItem, @ts2 PorterDuff.Mode mode) {
        if (menuItem instanceof j74) {
            ((j74) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C2061b.m13790j(menuItem, mode);
        }
    }

    /* renamed from: s */
    public static void m13776s(@mr2 MenuItem menuItem, char c, int i) {
        if (menuItem instanceof j74) {
            ((j74) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C2061b.m13791k(menuItem, c, i);
        }
    }

    @Deprecated
    /* renamed from: t */
    public static MenuItem m13777t(MenuItem menuItem, C2062c cVar) {
        return menuItem.setOnActionExpandListener(new C2060a(cVar));
    }

    /* renamed from: u */
    public static void m13778u(@mr2 MenuItem menuItem, char c, char c2, int i, int i2) {
        if (menuItem instanceof j74) {
            ((j74) menuItem).setShortcut(c, c2, i, i2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C2061b.m13792l(menuItem, c, c2, i, i2);
        }
    }

    @Deprecated
    /* renamed from: v */
    public static void m13779v(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    /* renamed from: w */
    public static void m13780w(@mr2 MenuItem menuItem, @ts2 CharSequence charSequence) {
        if (menuItem instanceof j74) {
            ((j74) menuItem).mo1391c(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C2061b.m13793m(menuItem, charSequence);
        }
    }
}
