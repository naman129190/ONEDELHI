package com.onedelhi.secure;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

public class hj2 {

    /* renamed from: a */
    public static PointF f13129a = new PointF();

    /* renamed from: a */
    public static PointF m16786a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static float m16787b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: c */
    public static int m16788c(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: d */
    public static boolean m16789d(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: e */
    public static int m16790e(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    /* renamed from: f */
    public static int m16791f(float f, float f2) {
        return m16792g((int) f, (int) f2);
    }

    /* renamed from: g */
    public static int m16792g(int i, int i2) {
        return i - (i2 * m16790e(i, i2));
    }

    /* renamed from: h */
    public static void m16793h(xw3 xw3, Path path) {
        path.reset();
        PointF b = xw3.mo27118b();
        path.moveTo(b.x, b.y);
        f13129a.set(b.x, b.y);
        for (int i = 0; i < xw3.mo27117a().size(); i++) {
            tb0 tb0 = xw3.mo27117a().get(i);
            PointF a = tb0.mo24819a();
            PointF b2 = tb0.mo24820b();
            PointF c = tb0.mo24821c();
            if (!a.equals(f13129a) || !b2.equals(c)) {
                path.cubicTo(a.x, a.y, b2.x, b2.y, c.x, c.y);
            } else {
                path.lineTo(c.x, c.y);
            }
            f13129a.set(c.x, c.y);
        }
        if (xw3.mo27120d()) {
            path.close();
        }
    }

    /* renamed from: i */
    public static double m16794i(double d, double d2, @d81(from = 0.0d, mo14561to = 1.0d) double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: j */
    public static float m16795j(float f, float f2, @d81(from = 0.0d, mo14561to = 1.0d) float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: k */
    public static int m16796k(int i, int i2, @d81(from = 0.0d, mo14561to = 1.0d) float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    /* renamed from: l */
    public static void m16797l(wy1 wy1, int i, List<wy1> list, wy1 wy12, yy1 yy1) {
        if (wy1.mo26720c(yy1.getName(), i)) {
            list.add(wy12.mo26718a(yy1.getName()).mo26727j(yy1));
        }
    }
}
