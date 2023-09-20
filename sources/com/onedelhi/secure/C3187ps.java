package com.onedelhi.secure;

import android.widget.CalendarView;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY})
@ut1({@tt1(attribute = "android:date", type = CalendarView.class)})
/* renamed from: com.onedelhi.secure.ps */
public class C3187ps {

    /* renamed from: com.onedelhi.secure.ps$a */
    public static class C3188a implements CalendarView.OnDateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ CalendarView.OnDateChangeListener f18695a;

        /* renamed from: a */
        public final /* synthetic */ st1 f18696a;

        public C3188a(CalendarView.OnDateChangeListener onDateChangeListener, st1 st1) {
            this.f18695a = onDateChangeListener;
            this.f18696a = st1;
        }

        public void onSelectedDayChange(CalendarView calendarView, int i, int i2, int i3) {
            CalendarView.OnDateChangeListener onDateChangeListener = this.f18695a;
            if (onDateChangeListener != null) {
                onDateChangeListener.onSelectedDayChange(calendarView, i, i2, i3);
            }
            this.f18696a.mo24536b();
        }
    }

    @C1717al({"android:date"})
    /* renamed from: a */
    public static void m24999a(CalendarView calendarView, long j) {
        if (calendarView.getDate() != j) {
            calendarView.setDate(j);
        }
    }

    @C1717al(requireAll = false, value = {"android:onSelectedDayChange", "android:dateAttrChanged"})
    /* renamed from: b */
    public static void m25000b(CalendarView calendarView, CalendarView.OnDateChangeListener onDateChangeListener, st1 st1) {
        if (st1 == null) {
            calendarView.setOnDateChangeListener(onDateChangeListener);
        } else {
            calendarView.setOnDateChangeListener(new C3188a(onDateChangeListener, st1));
        }
    }
}
