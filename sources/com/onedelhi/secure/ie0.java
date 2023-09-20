package com.onedelhi.secure;

import android.widget.DatePicker;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.ra3;

@hl3({hl3.C2354a.LIBRARY})
@ut1({@tt1(attribute = "android:year", type = DatePicker.class), @tt1(attribute = "android:month", type = DatePicker.class), @tt1(attribute = "android:day", method = "getDayOfMonth", type = DatePicker.class)})
public class ie0 {

    /* renamed from: com.onedelhi.secure.ie0$b */
    public static class C2443b implements DatePicker.OnDateChangedListener {

        /* renamed from: a */
        public DatePicker.OnDateChangedListener f13657a;

        /* renamed from: a */
        public st1 f13658a;

        /* renamed from: b */
        public st1 f13659b;

        /* renamed from: c */
        public st1 f13660c;

        public C2443b() {
        }

        /* renamed from: a */
        public void mo17735a(DatePicker.OnDateChangedListener onDateChangedListener, st1 st1, st1 st12, st1 st13) {
            this.f13657a = onDateChangedListener;
            this.f13658a = st1;
            this.f13659b = st12;
            this.f13660c = st13;
        }

        public void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
            DatePicker.OnDateChangedListener onDateChangedListener = this.f13657a;
            if (onDateChangedListener != null) {
                onDateChangedListener.onDateChanged(datePicker, i, i2, i3);
            }
            st1 st1 = this.f13658a;
            if (st1 != null) {
                st1.mo24536b();
            }
            st1 st12 = this.f13659b;
            if (st12 != null) {
                st12.mo24536b();
            }
            st1 st13 = this.f13660c;
            if (st13 != null) {
                st13.mo24536b();
            }
        }
    }

    @C1717al(requireAll = false, value = {"android:year", "android:month", "android:day", "android:onDateChanged", "android:yearAttrChanged", "android:monthAttrChanged", "android:dayAttrChanged"})
    /* renamed from: a */
    public static void m17486a(DatePicker datePicker, int i, int i2, int i3, DatePicker.OnDateChangedListener onDateChangedListener, st1 st1, st1 st12, st1 st13) {
        if (i == 0) {
            i = datePicker.getYear();
        }
        if (i3 == 0) {
            i3 = datePicker.getDayOfMonth();
        }
        if (st1 == null && st12 == null && st13 == null) {
            datePicker.init(i, i2, i3, onDateChangedListener);
            return;
        }
        int i4 = ra3.C3391g.onDateChanged;
        C2443b bVar = (C2443b) n42.m22334a(datePicker, i4);
        if (bVar == null) {
            bVar = new C2443b();
            n42.m22335b(datePicker, bVar, i4);
        }
        bVar.mo17735a(onDateChangedListener, st1, st12, st13);
        datePicker.init(i, i2, i3, bVar);
    }
}
