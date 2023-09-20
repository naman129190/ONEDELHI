package com.onedelhi.secure;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0253h;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class nn2 extends C0248e {
    public nn2(Context context) {
        super(context);
    }

    @mr2
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0253h hVar = (C0253h) mo1310a(i, i2, i3, charSequence);
        rn2 rn2 = new rn2(mo1371x(), this, hVar);
        hVar.mo1384C(rn2);
        return rn2;
    }
}
