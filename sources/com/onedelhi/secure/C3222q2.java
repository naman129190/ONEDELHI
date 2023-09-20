package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.za3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
/* renamed from: com.onedelhi.secure.q2 */
public class C3222q2 {

    /* renamed from: a */
    public Context f18855a;

    public C3222q2(Context context) {
        this.f18855a = context;
    }

    /* renamed from: b */
    public static C3222q2 m25257b(Context context) {
        return new C3222q2(context);
    }

    /* renamed from: a */
    public boolean mo22806a() {
        return this.f18855a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int mo22807c() {
        return this.f18855a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int mo22808d() {
        Configuration configuration = this.f18855a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: e */
    public int mo22809e() {
        return this.f18855a.getResources().getDimensionPixelSize(za3.C4060e.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: f */
    public int mo22810f() {
        TypedArray obtainStyledAttributes = this.f18855a.obtainStyledAttributes((AttributeSet) null, za3.C4068m.ActionBar, za3.C4057b.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(za3.C4068m.ActionBar_height, 0);
        Resources resources = this.f18855a.getResources();
        if (!mo22811g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(za3.C4060e.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean mo22811g() {
        return this.f18855a.getResources().getBoolean(za3.C4058c.abc_action_bar_embed_tabs);
    }

    /* renamed from: h */
    public boolean mo22812h() {
        return true;
    }
}
