package com.onedelhi.secure;

import android.os.Build;
import android.widget.TimePicker;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY})
public class zd4 {

    /* renamed from: com.onedelhi.secure.zd4$a */
    public static class C4083a implements TimePicker.OnTimeChangedListener {

        /* renamed from: a */
        public final /* synthetic */ TimePicker.OnTimeChangedListener f23575a;

        /* renamed from: a */
        public final /* synthetic */ st1 f23576a;

        /* renamed from: b */
        public final /* synthetic */ st1 f23577b;

        public C4083a(TimePicker.OnTimeChangedListener onTimeChangedListener, st1 st1, st1 st12) {
            this.f23575a = onTimeChangedListener;
            this.f23576a = st1;
            this.f23577b = st12;
        }

        public void onTimeChanged(TimePicker timePicker, int i, int i2) {
            TimePicker.OnTimeChangedListener onTimeChangedListener = this.f23575a;
            if (onTimeChangedListener != null) {
                onTimeChangedListener.onTimeChanged(timePicker, i, i2);
            }
            st1 st1 = this.f23576a;
            if (st1 != null) {
                st1.mo24536b();
            }
            st1 st12 = this.f23577b;
            if (st12 != null) {
                st12.mo24536b();
            }
        }
    }

    @rt1(attribute = "android:hour")
    /* renamed from: a */
    public static int m33071a(TimePicker timePicker) {
        if (Build.VERSION.SDK_INT >= 23) {
            return timePicker.getHour();
        }
        Integer currentHour = timePicker.getCurrentHour();
        if (currentHour == null) {
            return 0;
        }
        return currentHour.intValue();
    }

    @rt1(attribute = "android:minute")
    /* renamed from: b */
    public static int m33072b(TimePicker timePicker) {
        if (Build.VERSION.SDK_INT >= 23) {
            return timePicker.getMinute();
        }
        Integer currentMinute = timePicker.getCurrentMinute();
        if (currentMinute == null) {
            return 0;
        }
        return currentMinute.intValue();
    }

    @C1717al({"android:hour"})
    /* renamed from: c */
    public static void m33073c(TimePicker timePicker, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (timePicker.getHour() != i) {
                timePicker.setHour(i);
            }
        } else if (timePicker.getCurrentHour().intValue() != i) {
            timePicker.setCurrentHour(Integer.valueOf(i));
        }
    }

    @C1717al(requireAll = false, value = {"android:onTimeChanged", "android:hourAttrChanged", "android:minuteAttrChanged"})
    /* renamed from: d */
    public static void m33074d(TimePicker timePicker, TimePicker.OnTimeChangedListener onTimeChangedListener, st1 st1, st1 st12) {
        if (st1 == null && st12 == null) {
            timePicker.setOnTimeChangedListener(onTimeChangedListener);
        } else {
            timePicker.setOnTimeChangedListener(new C4083a(onTimeChangedListener, st1, st12));
        }
    }

    @C1717al({"android:minute"})
    /* renamed from: e */
    public static void m33075e(TimePicker timePicker, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (timePicker.getMinute() != i) {
                timePicker.setMinute(i);
            }
        } else if (timePicker.getCurrentMinute().intValue() != i) {
            timePicker.setCurrentHour(Integer.valueOf(i));
        }
    }
}
