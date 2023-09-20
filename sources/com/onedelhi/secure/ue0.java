package com.onedelhi.secure;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

public class ue0 extends BaseAdapter {

    /* renamed from: p */
    public static final int f21325p = 4;

    /* renamed from: q */
    public static final int f21326q = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);
    @mr2

    /* renamed from: a */
    public final Calendar f21327a;

    /* renamed from: n */
    public final int f21328n;

    /* renamed from: o */
    public final int f21329o;

    public ue0() {
        Calendar v = fq4.m15213v();
        this.f21327a = v;
        this.f21328n = v.getMaximum(7);
        this.f21329o = v.getFirstDayOfWeek();
    }

    public ue0(int i) {
        Calendar v = fq4.m15213v();
        this.f21327a = v;
        this.f21328n = v.getMaximum(7);
        this.f21329o = i;
    }

    @ts2
    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f21328n) {
            return null;
        }
        return Integer.valueOf(mo25572b(i));
    }

    /* renamed from: b */
    public final int mo25572b(int i) {
        int i2 = i + this.f21329o;
        int i3 = this.f21328n;
        return i2 > i3 ? i2 - i3 : i2;
    }

    public int getCount() {
        return this.f21328n;
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    @com.onedelhi.secure.ts2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, @com.onedelhi.secure.ts2 android.view.View r7, @com.onedelhi.secure.mr2 android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0017
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.onedelhi.secure.fd3.C2161k.mtrl_calendar_day_of_week
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r7 = r5.f21327a
            int r6 = r5.mo25572b(r6)
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            java.util.Calendar r7 = r5.f21327a
            int r3 = f21326q
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            int r7 = com.onedelhi.secure.fd3.C2163m.mtrl_picker_day_of_week_column_header
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f21327a
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ue0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
