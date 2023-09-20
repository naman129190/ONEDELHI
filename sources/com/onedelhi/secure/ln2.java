package com.onedelhi.secure;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0253h;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public final class ln2 extends C0248e {
    @mr2

    /* renamed from: a */
    public final Class<?> f31738a;

    /* renamed from: m */
    public final int f31739m;

    public ln2(@mr2 Context context, @mr2 Class<?> cls, int i) {
        super(context);
        this.f31738a = cls;
        this.f31739m = i;
    }

    @mr2
    /* renamed from: a */
    public MenuItem mo1310a(int i, int i2, int i3, @mr2 CharSequence charSequence) {
        if (size() + 1 <= this.f31739m) {
            mo1351m0();
            MenuItem a = super.mo1310a(i, i2, i3, charSequence);
            if (a instanceof C0253h) {
                ((C0253h) a).mo1467y(true);
            }
            mo1349l0();
            return a;
        }
        String simpleName = this.f31738a.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f31739m + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @mr2
    public SubMenu addSubMenu(int i, int i2, int i3, @mr2 CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f31738a.getSimpleName() + " does not support submenus");
    }

    /* renamed from: n0 */
    public int mo40135n0() {
        return this.f31739m;
    }
}
