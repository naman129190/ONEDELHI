package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.common.C1410R;

public class ag1 {
    /* renamed from: a */
    public static Bitmap m11151a(Context context, String str, String str2, Boolean bool, String str3, String str4) {
        io1 io1 = new io1(context);
        io1.mo38184l(((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C1410R.layout.cluster_view, (ViewGroup) null, false));
        if (!str3.equalsIgnoreCase("bus")) {
            return null;
        }
        io1.mo38180h(C3129p8.m24529b(context, str2.equalsIgnoreCase("DTC") ? bool.booleanValue() ? C1410R.C1411drawable.bus_marker_red : C1410R.C1411drawable.bus_marker_green : bool.booleanValue() ? C1410R.C1411drawable.bus_marker_blue : C1410R.C1411drawable.bus_marker_orange));
        if (str4.contains("DL51GD")) {
            io1.mo38180h(C3129p8.m24529b(context, C1410R.C1411drawable.bus_marker_light_blue));
        }
        String a = fg1.m14893a(str);
        io1.mo38187o(C1410R.style.iconGenText);
        io1.mo38182j(0, 0, 0, 0);
        return io1.mo38178f(a);
    }
}
