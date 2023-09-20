package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0260k;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3665u2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.j74;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.za3;

@hl3({hl3.C2354a.f13188c})
/* renamed from: androidx.appcompat.view.menu.h */
public final class C0253h implements j74 {

    /* renamed from: A */
    public static final int f1135A = 32;

    /* renamed from: B */
    public static final int f1136B = 0;

    /* renamed from: a */
    public static final String f1137a = "MenuItemImpl";

    /* renamed from: u */
    public static final int f1138u = 3;

    /* renamed from: v */
    public static final int f1139v = 1;

    /* renamed from: w */
    public static final int f1140w = 2;

    /* renamed from: x */
    public static final int f1141x = 4;

    /* renamed from: y */
    public static final int f1142y = 8;

    /* renamed from: z */
    public static final int f1143z = 16;

    /* renamed from: a */
    public char f1144a;

    /* renamed from: a */
    public Intent f1145a;

    /* renamed from: a */
    public ColorStateList f1146a = null;

    /* renamed from: a */
    public PorterDuff.Mode f1147a = null;

    /* renamed from: a */
    public Drawable f1148a;

    /* renamed from: a */
    public ContextMenu.ContextMenuInfo f1149a;

    /* renamed from: a */
    public MenuItem.OnActionExpandListener f1150a;

    /* renamed from: a */
    public MenuItem.OnMenuItemClickListener f1151a;

    /* renamed from: a */
    public View f1152a;

    /* renamed from: a */
    public C0248e f1153a;

    /* renamed from: a */
    public C0265m f1154a;

    /* renamed from: a */
    public C3665u2 f1155a;

    /* renamed from: a */
    public CharSequence f1156a;

    /* renamed from: a */
    public Runnable f1157a;

    /* renamed from: a */
    public boolean f1158a = false;

    /* renamed from: b */
    public char f1159b;

    /* renamed from: b */
    public CharSequence f1160b;

    /* renamed from: b */
    public boolean f1161b = false;

    /* renamed from: c */
    public CharSequence f1162c;

    /* renamed from: c */
    public boolean f1163c = false;

    /* renamed from: d */
    public CharSequence f1164d;

    /* renamed from: d */
    public boolean f1165d = false;

    /* renamed from: l */
    public final int f1166l;

    /* renamed from: m */
    public final int f1167m;

    /* renamed from: n */
    public final int f1168n;

    /* renamed from: o */
    public final int f1169o;

    /* renamed from: p */
    public int f1170p = 4096;

    /* renamed from: q */
    public int f1171q = 4096;

    /* renamed from: r */
    public int f1172r = 0;

    /* renamed from: s */
    public int f1173s = 16;

    /* renamed from: t */
    public int f1174t;

    /* renamed from: androidx.appcompat.view.menu.h$a */
    public class C0254a implements C3665u2.C3667b {
        public C0254a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0253h hVar = C0253h.this;
            hVar.f1153a.mo1296M(hVar);
        }
    }

    public C0253h(C0248e eVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1153a = eVar;
        this.f1166l = i2;
        this.f1167m = i;
        this.f1168n = i3;
        this.f1169o = i4;
        this.f1156a = charSequence;
        this.f1174t = i5;
    }

    /* renamed from: h */
    public static void m1939h(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: A */
    public void mo1382A(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1149a = contextMenuInfo;
    }

    @mr2
    /* renamed from: B */
    public j74 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: C */
    public void mo1384C(C0265m mVar) {
        this.f1154a = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    /* renamed from: D */
    public boolean mo1385D(boolean z) {
        int i = this.f1173s;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.f1173s = i2;
        return i != i2;
    }

    /* renamed from: E */
    public boolean mo1386E() {
        return this.f1153a.mo1288D();
    }

    /* renamed from: F */
    public boolean mo1387F() {
        return this.f1153a.mo1294K() && mo1426l() != 0;
    }

    /* renamed from: G */
    public boolean mo1388G() {
        return (this.f1174t & 4) == 4;
    }

    @mr2
    /* renamed from: a */
    public j74 mo1389a(C3665u2 u2Var) {
        C3665u2 u2Var2 = this.f1155a;
        if (u2Var2 != null) {
            u2Var2.mo25368j();
        }
        this.f1152a = null;
        this.f1155a = u2Var;
        this.f1153a.mo1297N(true);
        C3665u2 u2Var3 = this.f1155a;
        if (u2Var3 != null) {
            u2Var3.mo16643l(new C0254a());
        }
        return this;
    }

    @mr2
    /* renamed from: b */
    public j74 setContentDescription(CharSequence charSequence) {
        this.f1162c = charSequence;
        this.f1153a.mo1297N(false);
        return this;
    }

    @mr2
    /* renamed from: c */
    public j74 setTooltipText(CharSequence charSequence) {
        this.f1164d = charSequence;
        this.f1153a.mo1297N(false);
        return this;
    }

    public boolean collapseActionView() {
        if ((this.f1174t & 8) == 0) {
            return false;
        }
        if (this.f1152a == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1150a;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1153a.mo1335g(this);
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo1393d() {
        return (this.f1174t & 2) == 2;
    }

    /* renamed from: e */
    public boolean mo1394e() {
        return !mo1393d() && !mo1433s();
    }

    public boolean expandActionView() {
        if (!mo1429o()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1150a;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1153a.mo1352n(this);
        }
        return false;
    }

    /* renamed from: f */
    public C3665u2 mo1396f() {
        return this.f1155a;
    }

    /* renamed from: g */
    public void mo1397g() {
        this.f1153a.mo1295L(this);
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f1152a;
        if (view != null) {
            return view;
        }
        C3665u2 u2Var = this.f1155a;
        if (u2Var == null) {
            return null;
        }
        View e = u2Var.mo16640e(this);
        this.f1152a = e;
        return e;
    }

    public int getAlphabeticModifiers() {
        return this.f1171q;
    }

    public char getAlphabeticShortcut() {
        return this.f1159b;
    }

    public CharSequence getContentDescription() {
        return this.f1162c;
    }

    public int getGroupId() {
        return this.f1167m;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f1148a;
        if (drawable != null) {
            return mo1418i(drawable);
        }
        if (this.f1172r == 0) {
            return null;
        }
        Drawable b = C3129p8.m24529b(this.f1153a.mo1371x(), this.f1172r);
        this.f1172r = 0;
        this.f1148a = b;
        return mo1418i(b);
    }

    public ColorStateList getIconTintList() {
        return this.f1146a;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1147a;
    }

    public Intent getIntent() {
        return this.f1145a;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1166l;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1149a;
    }

    public int getNumericModifiers() {
        return this.f1170p;
    }

    public char getNumericShortcut() {
        return this.f1144a;
    }

    public int getOrder() {
        return this.f1168n;
    }

    public SubMenu getSubMenu() {
        return this.f1154a;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1156a;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1160b;
        return charSequence != null ? charSequence : this.f1156a;
    }

    public CharSequence getTooltipText() {
        return this.f1164d;
    }

    public boolean hasSubMenu() {
        return this.f1154a != null;
    }

    /* renamed from: i */
    public final Drawable mo1418i(Drawable drawable) {
        if (drawable != null && this.f1163c && (this.f1158a || this.f1161b)) {
            drawable = wo0.m30989r(drawable).mutate();
            if (this.f1158a) {
                wo0.m30986o(drawable, this.f1146a);
            }
            if (this.f1161b) {
                wo0.m30987p(drawable, this.f1147a);
            }
            this.f1163c = false;
        }
        return drawable;
    }

    public boolean isActionViewExpanded() {
        return this.f1165d;
    }

    public boolean isCheckable() {
        return (this.f1173s & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f1173s & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f1173s & 16) != 0;
    }

    public boolean isVisible() {
        C3665u2 u2Var = this.f1155a;
        return (u2Var == null || !u2Var.mo16641h()) ? (this.f1173s & 8) == 0 : (this.f1173s & 8) == 0 && this.f1155a.mo16639c();
    }

    /* renamed from: j */
    public Runnable mo1424j() {
        return this.f1157a;
    }

    /* renamed from: k */
    public int mo1425k() {
        return this.f1169o;
    }

    /* renamed from: l */
    public char mo1426l() {
        return this.f1153a.mo1293J() ? this.f1159b : this.f1144a;
    }

    /* renamed from: m */
    public String mo1427m() {
        int i;
        char l = mo1426l();
        if (l == 0) {
            return "";
        }
        Resources resources = this.f1153a.mo1371x().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1153a.mo1371x()).hasPermanentMenuKey()) {
            sb.append(resources.getString(za3.C4066k.abc_prepend_shortcut_label));
        }
        int i2 = this.f1153a.mo1293J() ? this.f1171q : this.f1170p;
        m1939h(sb, i2, 65536, resources.getString(za3.C4066k.abc_menu_meta_shortcut_label));
        m1939h(sb, i2, 4096, resources.getString(za3.C4066k.abc_menu_ctrl_shortcut_label));
        m1939h(sb, i2, 2, resources.getString(za3.C4066k.abc_menu_alt_shortcut_label));
        m1939h(sb, i2, 1, resources.getString(za3.C4066k.abc_menu_shift_shortcut_label));
        m1939h(sb, i2, 4, resources.getString(za3.C4066k.abc_menu_sym_shortcut_label));
        m1939h(sb, i2, 8, resources.getString(za3.C4066k.abc_menu_function_shortcut_label));
        if (l == 8) {
            i = za3.C4066k.abc_menu_delete_shortcut_label;
        } else if (l == 10) {
            i = za3.C4066k.abc_menu_enter_shortcut_label;
        } else if (l != ' ') {
            sb.append(l);
            return sb.toString();
        } else {
            i = za3.C4066k.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    /* renamed from: n */
    public CharSequence mo1428n(C0260k.C0261a aVar) {
        return (aVar == null || !aVar.mo1172d()) ? getTitle() : getTitleCondensed();
    }

    /* renamed from: o */
    public boolean mo1429o() {
        C3665u2 u2Var;
        if ((this.f1174t & 8) == 0) {
            return false;
        }
        if (this.f1152a == null && (u2Var = this.f1155a) != null) {
            this.f1152a = u2Var.mo16640e(this);
        }
        return this.f1152a != null;
    }

    /* renamed from: p */
    public boolean mo1430p() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1151a;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0248e eVar = this.f1153a;
        if (eVar.mo1341i(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f1157a;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1145a != null) {
            try {
                this.f1153a.mo1371x().startActivity(this.f1145a);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e(f1137a, "Can't find activity to handle intent; ignoring", e);
            }
        }
        C3665u2 u2Var = this.f1155a;
        return u2Var != null && u2Var.mo16638f();
    }

    /* renamed from: q */
    public boolean mo1431q() {
        return (this.f1173s & 32) == 32;
    }

    /* renamed from: r */
    public boolean mo1432r() {
        return (this.f1173s & 4) != 0;
    }

    /* renamed from: s */
    public boolean mo1433s() {
        return (this.f1174t & 1) == 1;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1159b == c) {
            return this;
        }
        this.f1159b = Character.toLowerCase(c);
        this.f1153a.mo1297N(false);
        return this;
    }

    @mr2
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1159b == c && this.f1171q == i) {
            return this;
        }
        this.f1159b = Character.toLowerCase(c);
        this.f1171q = KeyEvent.normalizeMetaState(i);
        this.f1153a.mo1297N(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f1173s;
        boolean z2 = z | (i & true);
        this.f1173s = z2 ? 1 : 0;
        if (i != z2) {
            this.f1153a.mo1297N(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f1173s & 4) != 0) {
            this.f1153a.mo1311a0(this);
        } else {
            mo1466x(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1173s = z ? this.f1173s | 16 : this.f1173s & -17;
        this.f1153a.mo1297N(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1148a = null;
        this.f1172r = i;
        this.f1163c = true;
        this.f1153a.mo1297N(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1172r = 0;
        this.f1148a = drawable;
        this.f1163c = true;
        this.f1153a.mo1297N(false);
        return this;
    }

    @mr2
    public MenuItem setIconTintList(@ts2 ColorStateList colorStateList) {
        this.f1146a = colorStateList;
        this.f1158a = true;
        this.f1163c = true;
        this.f1153a.mo1297N(false);
        return this;
    }

    @mr2
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1147a = mode;
        this.f1161b = true;
        this.f1163c = true;
        this.f1153a.mo1297N(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1145a = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f1144a == c) {
            return this;
        }
        this.f1144a = c;
        this.f1153a.mo1297N(false);
        return this;
    }

    @mr2
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1144a == c && this.f1170p == i) {
            return this;
        }
        this.f1144a = c;
        this.f1170p = KeyEvent.normalizeMetaState(i);
        this.f1153a.mo1297N(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1150a = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1151a = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1144a = c;
        this.f1159b = Character.toLowerCase(c2);
        this.f1153a.mo1297N(false);
        return this;
    }

    @mr2
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1144a = c;
        this.f1170p = KeyEvent.normalizeMetaState(i);
        this.f1159b = Character.toLowerCase(c2);
        this.f1171q = KeyEvent.normalizeMetaState(i2);
        this.f1153a.mo1297N(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f1174t = i;
            this.f1153a.mo1295L(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f1153a.mo1371x().getString(i));
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1156a = charSequence;
        this.f1153a.mo1297N(false);
        C0265m mVar = this.f1154a;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1160b = charSequence;
        this.f1153a.mo1297N(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo1385D(z)) {
            this.f1153a.mo1296M(this);
        }
        return this;
    }

    @mr2
    /* renamed from: t */
    public j74 setActionView(int i) {
        Context x = this.f1153a.mo1371x();
        setActionView(LayoutInflater.from(x).inflate(i, new LinearLayout(x), false));
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f1156a;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @mr2
    /* renamed from: u */
    public j74 setActionView(View view) {
        int i;
        this.f1152a = view;
        this.f1155a = null;
        if (view != null && view.getId() == -1 && (i = this.f1166l) > 0) {
            view.setId(i);
        }
        this.f1153a.mo1295L(this);
        return this;
    }

    /* renamed from: v */
    public void mo1464v(boolean z) {
        this.f1165d = z;
        this.f1153a.mo1297N(false);
    }

    /* renamed from: w */
    public MenuItem mo1465w(Runnable runnable) {
        this.f1157a = runnable;
        return this;
    }

    /* renamed from: x */
    public void mo1466x(boolean z) {
        int i = this.f1173s;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.f1173s = i2;
        if (i != i2) {
            this.f1153a.mo1297N(false);
        }
    }

    /* renamed from: y */
    public void mo1467y(boolean z) {
        this.f1173s = (z ? 4 : 0) | (this.f1173s & -5);
    }

    /* renamed from: z */
    public void mo1468z(boolean z) {
        this.f1173s = z ? this.f1173s | 32 : this.f1173s & -33;
    }
}
