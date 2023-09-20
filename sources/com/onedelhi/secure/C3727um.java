package com.onedelhi.secure;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.onedelhi.secure.C3859wm;

/* renamed from: com.onedelhi.secure.um */
public class C3727um {

    @sj3(29)
    /* renamed from: com.onedelhi.secure.um$a */
    public static class C3728a {
        @pn0
        /* renamed from: a */
        public static ColorFilter m29421a(int i, Object obj) {
            return new BlendModeColorFilter(i, (BlendMode) obj);
        }
    }

    @ts2
    /* renamed from: a */
    public static ColorFilter m29420a(int i, @mr2 C3799vm vmVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object a = C3859wm.C3861b.m30948a(vmVar);
            if (a != null) {
                return C3728a.m29421a(i, a);
            }
            return null;
        }
        PorterDuff.Mode a2 = C3859wm.m30947a(vmVar);
        if (a2 != null) {
            return new PorterDuffColorFilter(i, a2);
        }
        return null;
    }
}
