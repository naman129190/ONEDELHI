package com.onedelhi.secure;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.f13188c})
public class h64 extends mh2 implements SubMenu {

    /* renamed from: a */
    public final u74 f12922a;

    public h64(Context context, u74 u74) {
        super(context, u74);
        this.f12922a = u74;
    }

    public void clearHeader() {
        this.f12922a.clearHeader();
    }

    public MenuItem getItem() {
        return mo21954g(this.f12922a.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f12922a.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f12922a.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f12922a.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f12922a.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f12922a.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f12922a.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f12922a.setIcon(drawable);
        return this;
    }
}
