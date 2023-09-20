package com.onedelhi.secure;

import android.widget.CompoundButton;
import com.onedelhi.secure.hl3;

@C2065el({@C1983dl(attribute = "android:buttonTint", method = "setButtonTintList", type = CompoundButton.class), @C1983dl(attribute = "android:onCheckedChanged", method = "setOnCheckedChangeListener", type = CompoundButton.class)})
@hl3({hl3.C2354a.f13185a})
@ut1({@tt1(attribute = "android:checked", type = CompoundButton.class)})
public class b40 {

    /* renamed from: com.onedelhi.secure.b40$a */
    public static class C1746a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ CompoundButton.OnCheckedChangeListener f9654a;

        /* renamed from: a */
        public final /* synthetic */ st1 f9655a;

        public C1746a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, st1 st1) {
            this.f9654a = onCheckedChangeListener;
            this.f9655a = st1;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f9654a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
            }
            this.f9655a.mo24536b();
        }
    }

    @C1717al({"android:checked"})
    /* renamed from: a */
    public static void m11551a(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isChecked() != z) {
            compoundButton.setChecked(z);
        }
    }

    @C1717al(requireAll = false, value = {"android:onCheckedChanged", "android:checkedAttrChanged"})
    /* renamed from: b */
    public static void m11552b(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, st1 st1) {
        if (st1 == null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            compoundButton.setOnCheckedChangeListener(new C1746a(onCheckedChangeListener, st1));
        }
    }
}
