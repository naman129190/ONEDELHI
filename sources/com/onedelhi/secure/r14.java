package com.onedelhi.secure;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public class r14 {
    /* renamed from: a */
    public static double m63339a(LatLng latLng, LatLng latLng2) {
        return m63348j(Math.toRadians(latLng.f7562a), Math.toRadians(latLng.f7563b), Math.toRadians(latLng2.f7562a), Math.toRadians(latLng2.f7563b));
    }

    /* renamed from: b */
    public static double m63340b(List<LatLng> list) {
        return Math.abs(m63346h(list));
    }

    /* renamed from: c */
    public static double m63341c(LatLng latLng, LatLng latLng2) {
        return m63339a(latLng, latLng2) * 6371009.0d;
    }

    /* renamed from: d */
    public static double m63342d(LatLng latLng, LatLng latLng2) {
        double radians = Math.toRadians(latLng.f7562a);
        double radians2 = Math.toRadians(latLng.f7563b);
        double radians3 = Math.toRadians(latLng2.f7562a);
        double radians4 = Math.toRadians(latLng2.f7563b) - radians2;
        return nf2.m58060k(Math.toDegrees(Math.atan2(Math.sin(radians4) * Math.cos(radians3), (Math.cos(radians) * Math.sin(radians3)) - ((Math.sin(radians) * Math.cos(radians3)) * Math.cos(radians4)))), -180.0d, 180.0d);
    }

    /* renamed from: e */
    public static double m63343e(List<LatLng> list) {
        double d = 0.0d;
        if (list.size() < 2) {
            return 0.0d;
        }
        LatLng latLng = list.get(0);
        double radians = Math.toRadians(latLng.f7562a);
        double radians2 = Math.toRadians(latLng.f7563b);
        for (LatLng next : list) {
            double radians3 = Math.toRadians(next.f7562a);
            double radians4 = Math.toRadians(next.f7563b);
            d += m63348j(radians, radians2, radians3, radians4);
            radians = radians3;
            radians2 = radians4;
        }
        return d * 6371009.0d;
    }

    /* renamed from: f */
    public static LatLng m63344f(LatLng latLng, double d, double d2) {
        double d3 = d / 6371009.0d;
        double radians = Math.toRadians(d2);
        double radians2 = Math.toRadians(latLng.f7562a);
        double radians3 = Math.toRadians(latLng.f7563b);
        double cos = Math.cos(d3);
        double sin = Math.sin(d3);
        double sin2 = Math.sin(radians2);
        double cos2 = sin * Math.cos(radians2);
        double cos3 = (cos * sin2) + (Math.cos(radians) * cos2);
        return new LatLng(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(radians3 + Math.atan2(cos2 * Math.sin(radians), cos - (sin2 * cos3))));
    }

    /* renamed from: g */
    public static LatLng m63345g(LatLng latLng, double d, double d2) {
        LatLng latLng2 = latLng;
        double radians = Math.toRadians(d2);
        double d3 = d / 6371009.0d;
        double cos = Math.cos(d3);
        double sin = Math.sin(d3) * Math.cos(radians);
        double sin2 = Math.sin(d3) * Math.sin(radians);
        double sin3 = Math.sin(Math.toRadians(latLng2.f7562a));
        double d4 = cos * cos;
        double d5 = sin * sin;
        double d6 = ((d5 * d4) + (d4 * d4)) - ((d4 * sin3) * sin3);
        if (d6 < 0.0d) {
            return null;
        }
        double d7 = sin * sin3;
        double d8 = d4 + d5;
        double sqrt = (d7 + Math.sqrt(d6)) / d8;
        double d9 = (sin3 - (sin * sqrt)) / cos;
        double atan2 = Math.atan2(d9, sqrt);
        if (atan2 < -1.5707963267948966d || atan2 > 1.5707963267948966d) {
            atan2 = Math.atan2(d9, (d7 - Math.sqrt(d6)) / d8);
        }
        if (atan2 < -1.5707963267948966d || atan2 > 1.5707963267948966d) {
            return null;
        }
        return new LatLng(Math.toDegrees(atan2), Math.toDegrees(Math.toRadians(latLng2.f7563b) - Math.atan2(sin2, (cos * Math.cos(atan2)) - (sin * Math.sin(atan2)))));
    }

    /* renamed from: h */
    public static double m63346h(List<LatLng> list) {
        return m63347i(list, 6371009.0d);
    }

    /* renamed from: i */
    public static double m63347i(List<LatLng> list, double d) {
        int size = list.size();
        double d2 = 0.0d;
        if (size < 3) {
            return 0.0d;
        }
        LatLng latLng = list.get(size - 1);
        double tan = Math.tan((1.5707963267948966d - Math.toRadians(latLng.f7562a)) / 2.0d);
        double radians = Math.toRadians(latLng.f7563b);
        double d3 = tan;
        double d4 = radians;
        for (LatLng next : list) {
            double tan2 = Math.tan((1.5707963267948966d - Math.toRadians(next.f7562a)) / 2.0d);
            double radians2 = Math.toRadians(next.f7563b);
            d2 += m63350l(tan2, radians2, d3, d4);
            d3 = tan2;
            d4 = radians2;
        }
        return d2 * d * d;
    }

    /* renamed from: j */
    public static double m63348j(double d, double d2, double d3, double d4) {
        return nf2.m58050a(nf2.m58053d(d, d3, d2 - d4));
    }

    /* renamed from: k */
    public static LatLng m63349k(LatLng latLng, LatLng latLng2, double d) {
        LatLng latLng3 = latLng;
        LatLng latLng4 = latLng2;
        double radians = Math.toRadians(latLng3.f7562a);
        double radians2 = Math.toRadians(latLng3.f7563b);
        double radians3 = Math.toRadians(latLng4.f7562a);
        double radians4 = Math.toRadians(latLng4.f7563b);
        double cos = Math.cos(radians);
        double cos2 = Math.cos(radians3);
        double a = m63339a(latLng, latLng2);
        double sin = Math.sin(a);
        if (sin < 1.0E-6d) {
            return latLng3;
        }
        double sin2 = Math.sin((1.0d - d) * a) / sin;
        double sin3 = Math.sin(a * d) / sin;
        double d2 = cos * sin2;
        double d3 = cos2 * sin3;
        double d4 = sin3;
        double cos3 = (Math.cos(radians2) * d2) + (Math.cos(radians4) * d3);
        double sin4 = (d2 * Math.sin(radians2)) + (d3 * Math.sin(radians4));
        return new LatLng(Math.toDegrees(Math.atan2((sin2 * Math.sin(radians)) + (Math.sin(radians3) * d4), Math.sqrt((cos3 * cos3) + (sin4 * sin4)))), Math.toDegrees(Math.atan2(sin4, cos3)));
    }

    /* renamed from: l */
    public static double m63350l(double d, double d2, double d3, double d4) {
        double d5 = d2 - d4;
        double d6 = d * d3;
        return Math.atan2(Math.sin(d5) * d6, (d6 * Math.cos(d5)) + 1.0d) * 2.0d;
    }
}
