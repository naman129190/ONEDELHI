package com.onedelhi.secure;

import android.widget.NumberPicker;
import com.onedelhi.secure.hl3;

@C2065el({@C1983dl(attribute = "android:format", method = "setFormatter", type = NumberPicker.class), @C1983dl(attribute = "android:onScrollStateChange", method = "setOnScrollListener", type = NumberPicker.class)})
@hl3({hl3.C2354a.LIBRARY})
@ut1({@tt1(attribute = "android:value", type = NumberPicker.class)})
public class us2 {

    /* renamed from: com.onedelhi.secure.us2$a */
    public static class C3742a implements NumberPicker.OnValueChangeListener {

        /* renamed from: a */
        public final /* synthetic */ NumberPicker.OnValueChangeListener f21517a;

        /* renamed from: a */
        public final /* synthetic */ st1 f21518a;

        public C3742a(NumberPicker.OnValueChangeListener onValueChangeListener, st1 st1) {
            this.f21517a = onValueChangeListener;
            this.f21518a = st1;
        }

        public void onValueChange(NumberPicker numberPicker, int i, int i2) {
            NumberPicker.OnValueChangeListener onValueChangeListener = this.f21517a;
            if (onValueChangeListener != null) {
                onValueChangeListener.onValueChange(numberPicker, i, i2);
            }
            this.f21518a.mo24536b();
        }
    }

    @C1717al(requireAll = false, value = {"android:onValueChange", "android:valueAttrChanged"})
    /* renamed from: a */
    public static void m29558a(NumberPicker numberPicker, NumberPicker.OnValueChangeListener onValueChangeListener, st1 st1) {
        if (st1 == null) {
            numberPicker.setOnValueChangedListener(onValueChangeListener);
        } else {
            numberPicker.setOnValueChangedListener(new C3742a(onValueChangeListener, st1));
        }
    }

    @C1717al({"android:value"})
    /* renamed from: b */
    public static void m29559b(NumberPicker numberPicker, int i) {
        if (numberPicker.getValue() != i) {
            numberPicker.setValue(i);
        }
    }
}
