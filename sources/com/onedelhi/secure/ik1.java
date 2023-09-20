package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.content.res.loader.ResourcesLoader;
import android.os.Build;
import android.view.ContextThemeWrapper;
import com.onedelhi.secure.fd3;
import java.util.HashMap;
import java.util.Map;

public class ik1 {

    /* renamed from: a */
    public static final String f13723a = "ik1";

    @sj3(api = 21)
    /* renamed from: a */
    public static void m17640a(@mr2 Map<Integer, Integer> map, @mr2 TypedArray typedArray, @ts2 TypedArray typedArray2, @d10 int i) {
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i2 = 0; i2 < typedArray.getIndexCount(); i2++) {
            int resourceId = typedArray2.getResourceId(i2, 0);
            if (resourceId != 0 && typedArray.hasValue(i2) && m17644e(typedArray.getType(i2))) {
                map.put(Integer.valueOf(resourceId), Integer.valueOf(oe2.m23724j(typedArray.getColor(i2, 0), i)));
            }
        }
    }

    @sj3(api = 30)
    /* renamed from: b */
    public static boolean m17641b(Context context, Map<Integer, Integer> map) {
        ResourcesLoader a = l10.m20147a(context, map);
        if (a == null) {
            return false;
        }
        context.getResources().addLoaders(new ResourcesLoader[]{a});
        return true;
    }

    @mr2
    /* renamed from: c */
    public static void m17642c(@mr2 Context context, @mr2 jk1 jk1) {
        if (m17645f()) {
            Map<Integer, Integer> d = m17643d(context, jk1);
            int e = jk1.mo18453e(0);
            if (m17641b(context, d) && e != 0) {
                pb4.m24572a(context, e);
            }
        }
    }

    @sj3(api = 21)
    /* renamed from: d */
    public static Map<Integer, Integer> m17643d(Context context, jk1 jk1) {
        HashMap hashMap = new HashMap();
        int c = oe2.m23717c(context, jk1.mo18450b(), f13723a);
        for (int i : jk1.mo18452d()) {
            hashMap.put(Integer.valueOf(i), Integer.valueOf(oe2.m23724j(r70.m26353f(context, i), c)));
        }
        hk1 c2 = jk1.mo18451c();
        if (c2 != null) {
            int[] d = c2.mo17323d();
            if (d.length > 0) {
                int e = c2.mo17324e();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d);
                TypedArray obtainStyledAttributes2 = e != 0 ? new ContextThemeWrapper(context, e).obtainStyledAttributes(d) : null;
                m17640a(hashMap, obtainStyledAttributes, obtainStyledAttributes2, c);
                obtainStyledAttributes.recycle();
                if (obtainStyledAttributes2 != null) {
                    obtainStyledAttributes2.recycle();
                }
            }
        }
        return hashMap;
    }

    /* renamed from: e */
    public static boolean m17644e(int i) {
        return 28 <= i && i <= 31;
    }

    @C3196px(api = 30)
    /* renamed from: f */
    public static boolean m17645f() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @mr2
    /* renamed from: g */
    public static Context m17646g(@mr2 Context context, @mr2 jk1 jk1) {
        if (!m17645f()) {
            return context;
        }
        Map<Integer, Integer> d = m17643d(context, jk1);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, jk1.mo18453e(fd3.C2164n.ThemeOverlay_Material3_HarmonizedColors_Empty));
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return m17641b(contextThemeWrapper, d) ? contextThemeWrapper : context;
    }
}
