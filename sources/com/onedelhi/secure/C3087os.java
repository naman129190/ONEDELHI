package com.onedelhi.secure;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.C1577f;
import com.onedelhi.secure.fd3;

/* renamed from: com.onedelhi.secure.os */
public final class C3087os {
    @mr2

    /* renamed from: a */
    public final Paint f18084a;
    @mr2

    /* renamed from: a */
    public final C2660ks f18085a;
    @mr2

    /* renamed from: b */
    public final C2660ks f18086b;
    @mr2

    /* renamed from: c */
    public final C2660ks f18087c;
    @mr2

    /* renamed from: d */
    public final C2660ks f18088d;
    @mr2

    /* renamed from: e */
    public final C2660ks f18089e;
    @mr2

    /* renamed from: f */
    public final C2660ks f18090f;
    @mr2

    /* renamed from: g */
    public final C2660ks f18091g;

    public C3087os(@mr2 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(je2.m53278g(context, fd3.C2153c.materialCalendarStyle, C1577f.class.getCanonicalName()), fd3.C2165o.MaterialCalendar);
        this.f18085a = C2660ks.m20005a(context, obtainStyledAttributes.getResourceId(fd3.C2165o.MaterialCalendar_dayStyle, 0));
        this.f18091g = C2660ks.m20005a(context, obtainStyledAttributes.getResourceId(fd3.C2165o.MaterialCalendar_dayInvalidStyle, 0));
        this.f18086b = C2660ks.m20005a(context, obtainStyledAttributes.getResourceId(fd3.C2165o.MaterialCalendar_daySelectedStyle, 0));
        this.f18087c = C2660ks.m20005a(context, obtainStyledAttributes.getResourceId(fd3.C2165o.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a = af2.m38610a(context, obtainStyledAttributes, fd3.C2165o.MaterialCalendar_rangeFillColor);
        this.f18088d = C2660ks.m20005a(context, obtainStyledAttributes.getResourceId(fd3.C2165o.MaterialCalendar_yearStyle, 0));
        this.f18089e = C2660ks.m20005a(context, obtainStyledAttributes.getResourceId(fd3.C2165o.MaterialCalendar_yearSelectedStyle, 0));
        this.f18090f = C2660ks.m20005a(context, obtainStyledAttributes.getResourceId(fd3.C2165o.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f18084a = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
