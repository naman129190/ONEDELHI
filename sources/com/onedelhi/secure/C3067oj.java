package com.onedelhi.secure;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: com.onedelhi.secure.oj */
public abstract class C3067oj {

    /* renamed from: a */
    public final Context f17984a;

    /* renamed from: a */
    public ty3<j74, MenuItem> f17985a;

    /* renamed from: b */
    public ty3<u74, SubMenu> f17986b;

    public C3067oj(Context context) {
        this.f17984a = context;
    }

    /* renamed from: g */
    public final MenuItem mo21954g(MenuItem menuItem) {
        if (!(menuItem instanceof j74)) {
            return menuItem;
        }
        j74 j74 = (j74) menuItem;
        if (this.f17985a == null) {
            this.f17985a = new ty3<>();
        }
        MenuItem menuItem2 = this.f17985a.get(j74);
        if (menuItem2 != null) {
            return menuItem2;
        }
        gh2 gh2 = new gh2(this.f17984a, j74);
        this.f17985a.put(j74, gh2);
        return gh2;
    }

    /* renamed from: h */
    public final SubMenu mo21955h(SubMenu subMenu) {
        if (!(subMenu instanceof u74)) {
            return subMenu;
        }
        u74 u74 = (u74) subMenu;
        if (this.f17986b == null) {
            this.f17986b = new ty3<>();
        }
        SubMenu subMenu2 = this.f17986b.get(u74);
        if (subMenu2 != null) {
            return subMenu2;
        }
        h64 h64 = new h64(this.f17984a, u74);
        this.f17986b.put(u74, h64);
        return h64;
    }

    /* renamed from: i */
    public final void mo21956i() {
        ty3<j74, MenuItem> ty3 = this.f17985a;
        if (ty3 != null) {
            ty3.clear();
        }
        ty3<u74, SubMenu> ty32 = this.f17986b;
        if (ty32 != null) {
            ty32.clear();
        }
    }

    /* renamed from: j */
    public final void mo21957j(int i) {
        if (this.f17985a != null) {
            int i2 = 0;
            while (i2 < this.f17985a.size()) {
                if (this.f17985a.mo25350m(i2).getGroupId() == i) {
                    this.f17985a.mo4015o(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    /* renamed from: k */
    public final void mo21958k(int i) {
        if (this.f17985a != null) {
            for (int i2 = 0; i2 < this.f17985a.size(); i2++) {
                if (this.f17985a.mo25350m(i2).getItemId() == i) {
                    this.f17985a.mo4015o(i2);
                    return;
                }
            }
        }
    }
}
