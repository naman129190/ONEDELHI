package com.onedelhi.secure;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;

public final class us5 {
    @ts2
    /* renamed from: a */
    public static Parcelable m29560a(@ts2 Bundle bundle, String str) {
        ClassLoader d = m29563d();
        bundle.setClassLoader(d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(d);
        return bundle2.getParcelable(str);
    }

    /* renamed from: b */
    public static void m29561b(@ts2 Bundle bundle, @ts2 Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable a = m29560a(bundle, "MapOptions");
            if (a != null) {
                m29562c(bundle2, "MapOptions", a);
            }
            Parcelable a2 = m29560a(bundle, "StreetViewPanoramaOptions");
            if (a2 != null) {
                m29562c(bundle2, "StreetViewPanoramaOptions", a2);
            }
            Parcelable a3 = m29560a(bundle, "camera");
            if (a3 != null) {
                m29562c(bundle2, "camera", a3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    /* renamed from: c */
    public static void m29562c(Bundle bundle, String str, @ts2 Parcelable parcelable) {
        ClassLoader d = m29563d();
        bundle.setClassLoader(d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(d);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    /* renamed from: d */
    public static ClassLoader m29563d() {
        return (ClassLoader) Preconditions.checkNotNull(us5.class.getClassLoader());
    }
}
