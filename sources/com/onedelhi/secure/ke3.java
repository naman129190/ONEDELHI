package com.onedelhi.secure;

import android.widget.RadioGroup;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY})
@ut1({@tt1(attribute = "android:checkedButton", method = "getCheckedRadioButtonId", type = RadioGroup.class)})
public class ke3 {

    /* renamed from: com.onedelhi.secure.ke3$a */
    public static class C2628a implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ RadioGroup.OnCheckedChangeListener f14865a;

        /* renamed from: a */
        public final /* synthetic */ st1 f14866a;

        public C2628a(RadioGroup.OnCheckedChangeListener onCheckedChangeListener, st1 st1) {
            this.f14865a = onCheckedChangeListener;
            this.f14866a = st1;
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            RadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f14865a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(radioGroup, i);
            }
            this.f14866a.mo24536b();
        }
    }

    @C1717al({"android:checkedButton"})
    /* renamed from: a */
    public static void m19726a(RadioGroup radioGroup, int i) {
        if (i != radioGroup.getCheckedRadioButtonId()) {
            radioGroup.check(i);
        }
    }

    @C1717al(requireAll = false, value = {"android:onCheckedChanged", "android:checkedButtonAttrChanged"})
    /* renamed from: b */
    public static void m19727b(RadioGroup radioGroup, RadioGroup.OnCheckedChangeListener onCheckedChangeListener, st1 st1) {
        if (st1 == null) {
            radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            radioGroup.setOnCheckedChangeListener(new C2628a(onCheckedChangeListener, st1));
        }
    }
}
