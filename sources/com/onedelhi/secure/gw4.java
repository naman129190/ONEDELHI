package com.onedelhi.secure;

import android.view.View;
import androidx.transition.Visibility;

public abstract class gw4 extends ph4 {

    /* renamed from: a */
    public static final String f12794a = "android:visibilityPropagation:visibility";

    /* renamed from: a */
    public static final String[] f12795a = {f12794a, f12796b};

    /* renamed from: b */
    public static final String f12796b = "android:visibilityPropagation:center";

    /* renamed from: d */
    public static int m16312d(th4 th4, int i) {
        int[] iArr;
        if (th4 == null || (iArr = (int[]) th4.f20846a.get(f12796b)) == null) {
            return -1;
        }
        return iArr[i];
    }

    /* renamed from: a */
    public void mo16958a(th4 th4) {
        View view = th4.f20844a;
        Integer num = (Integer) th4.f20846a.get(Visibility.f5626h);
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        th4.f20846a.put(f12794a, num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        th4.f20846a.put(f12796b, iArr);
    }

    /* renamed from: b */
    public String[] mo16959b() {
        return f12795a;
    }

    /* renamed from: e */
    public int mo16960e(th4 th4) {
        Integer num;
        if (th4 == null || (num = (Integer) th4.f20846a.get(f12794a)) == null) {
            return 8;
        }
        return num.intValue();
    }

    /* renamed from: f */
    public int mo16961f(th4 th4) {
        return m16312d(th4, 0);
    }

    /* renamed from: g */
    public int mo16962g(th4 th4) {
        return m16312d(th4, 1);
    }
}
