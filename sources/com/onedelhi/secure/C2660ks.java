package com.onedelhi.secure;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import com.onedelhi.secure.fd3;

/* renamed from: com.onedelhi.secure.ks */
public final class C2660ks {

    /* renamed from: a */
    public final int f15052a;

    /* renamed from: a */
    public final ColorStateList f15053a;
    @mr2

    /* renamed from: a */
    public final Rect f15054a;

    /* renamed from: a */
    public final uw3 f15055a;

    /* renamed from: b */
    public final ColorStateList f15056b;

    /* renamed from: c */
    public final ColorStateList f15057c;

    public C2660ks(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, uw3 uw3, @mr2 Rect rect) {
        k43.m19452i(rect.left);
        k43.m19452i(rect.top);
        k43.m19452i(rect.right);
        k43.m19452i(rect.bottom);
        this.f15054a = rect;
        this.f15053a = colorStateList2;
        this.f15056b = colorStateList;
        this.f15057c = colorStateList3;
        this.f15052a = i;
        this.f15055a = uw3;
    }

    @mr2
    /* renamed from: a */
    public static C2660ks m20005a(@mr2 Context context, @e64 int i) {
        k43.m19445b(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, fd3.C2165o.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(fd3.C2165o.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(fd3.C2165o.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(fd3.C2165o.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(fd3.C2165o.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a = af2.m38610a(context, obtainStyledAttributes, fd3.C2165o.MaterialCalendarItem_itemFillColor);
        ColorStateList a2 = af2.m38610a(context, obtainStyledAttributes, fd3.C2165o.MaterialCalendarItem_itemTextColor);
        ColorStateList a3 = af2.m38610a(context, obtainStyledAttributes, fd3.C2165o.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(fd3.C2165o.MaterialCalendarItem_itemStrokeWidth, 0);
        uw3 m = uw3.m67444b(context, obtainStyledAttributes.getResourceId(fd3.C2165o.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(fd3.C2165o.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).mo45845m();
        obtainStyledAttributes.recycle();
        return new C2660ks(a, a2, a3, dimensionPixelSize, m, rect);
    }

    /* renamed from: b */
    public int mo19181b() {
        return this.f15054a.bottom;
    }

    /* renamed from: c */
    public int mo19182c() {
        return this.f15054a.left;
    }

    /* renamed from: d */
    public int mo19183d() {
        return this.f15054a.right;
    }

    /* renamed from: e */
    public int mo19184e() {
        return this.f15054a.top;
    }

    /* renamed from: f */
    public void mo19185f(@mr2 TextView textView) {
        bf2 bf2 = new bf2();
        bf2 bf22 = new bf2();
        bf2.setShapeAppearanceModel(this.f15055a);
        bf22.setShapeAppearanceModel(this.f15055a);
        bf2.mo31626o0(this.f15056b);
        bf2.mo31568E0((float) this.f15052a, this.f15057c);
        textView.setTextColor(this.f15053a);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f15053a.withAlpha(30), bf2, bf22);
        Rect rect = this.f15054a;
        jt4.m18877I1(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
