package com.onedelhi.secure;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.onedelhi.secure.hl3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@hl3({hl3.C2354a.LIBRARY})
public class nf4 {

    /* renamed from: a */
    public static final Comparator<View> f32497a = new C6184a();

    /* renamed from: com.onedelhi.secure.nf4$a */
    public class C6184a implements Comparator<View> {
        /* renamed from: a */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    @ts2
    /* renamed from: a */
    public static ActionMenuItemView m58061a(@mr2 Toolbar toolbar, @mo1 int i) {
        ActionMenuView b = m58062b(toolbar);
        if (b == null) {
            return null;
        }
        for (int i2 = 0; i2 < b.getChildCount(); i2++) {
            View childAt = b.getChildAt(i2);
            if (childAt instanceof ActionMenuItemView) {
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) childAt;
                if (actionMenuItemView.getItemData().getItemId() == i) {
                    return actionMenuItemView;
                }
            }
        }
        return null;
    }

    @ts2
    /* renamed from: b */
    public static ActionMenuView m58062b(@mr2 Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r2 = (android.widget.ImageView) r2;
     */
    @com.onedelhi.secure.ts2
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.widget.ImageView m58063c(@com.onedelhi.secure.mr2 androidx.appcompat.widget.Toolbar r5, @com.onedelhi.secure.ts2 android.graphics.drawable.Drawable r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
        L_0x0005:
            int r2 = r5.getChildCount()
            if (r1 >= r2) goto L_0x0033
            android.view.View r2 = r5.getChildAt(r1)
            boolean r3 = r2 instanceof android.widget.ImageView
            if (r3 == 0) goto L_0x0030
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.graphics.drawable.Drawable r3 = r2.getDrawable()
            if (r3 == 0) goto L_0x0030
            android.graphics.drawable.Drawable$ConstantState r4 = r3.getConstantState()
            if (r4 == 0) goto L_0x0030
            android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
            android.graphics.drawable.Drawable$ConstantState r4 = r6.getConstantState()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0030
            return r2
        L_0x0030:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.nf4.m58063c(androidx.appcompat.widget.Toolbar, android.graphics.drawable.Drawable):android.widget.ImageView");
    }

    @ts2
    /* renamed from: d */
    public static ImageView m58064d(@mr2 Toolbar toolbar) {
        return m58063c(toolbar, toolbar.getLogo());
    }

    @ts2
    /* renamed from: e */
    public static ImageButton m58065e(@mr2 Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    @ts2
    /* renamed from: f */
    public static View m58066f(@mr2 Toolbar toolbar) {
        ActionMenuView b = m58062b(toolbar);
        if (b == null || b.getChildCount() <= 1) {
            return null;
        }
        return b.getChildAt(0);
    }

    @ts2
    /* renamed from: g */
    public static TextView m58067g(@mr2 Toolbar toolbar) {
        List<TextView> h = m58068h(toolbar, toolbar.getSubtitle());
        if (h.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(h, f32497a);
    }

    /* renamed from: h */
    public static List<TextView> m58068h(@mr2 Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    @ts2
    /* renamed from: i */
    public static TextView m58069i(@mr2 Toolbar toolbar) {
        List<TextView> h = m58068h(toolbar, toolbar.getTitle());
        if (h.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(h, f32497a);
    }
}
