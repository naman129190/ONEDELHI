package com.onedelhi.secure;

import android.graphics.Point;
import android.graphics.PointF;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\n\u001a\r\u0010\u0007\u001a\u00020\u0005*\u00020\u0004H\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\n\u001a\u0015\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\n\u001a\u0015\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\n\u001a\u0015\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0005H\n\u001a\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\n\u001a\u0015\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\n\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\n\u001a\u0015\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0005H\n\u001a\r\u0010\u0012\u001a\u00020\u0000*\u00020\u0000H\n\u001a\r\u0010\b\u001a\u00020\u0004*\u00020\u0004H\n\u001a\r\u0010\u0013\u001a\u00020\u0004*\u00020\u0000H\b\u001a\r\u0010\u0014\u001a\u00020\u0000*\u00020\u0004H\b¨\u0006\u0015"}, d2 = {"Landroid/graphics/Point;", "", "b", "d", "Landroid/graphics/PointF;", "", "a", "c", "p", "j", "l", "xy", "i", "k", "f", "h", "e", "g", "o", "n", "m", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class y23 {
    /* renamed from: a */
    public static final float m31898a(@vr2 PointF pointF) {
        jt1.m53777p(pointF, "<this>");
        return pointF.x;
    }

    /* renamed from: b */
    public static final int m31899b(@vr2 Point point) {
        jt1.m53777p(point, "<this>");
        return point.x;
    }

    /* renamed from: c */
    public static final float m31900c(@vr2 PointF pointF) {
        jt1.m53777p(pointF, "<this>");
        return pointF.y;
    }

    /* renamed from: d */
    public static final int m31901d(@vr2 Point point) {
        jt1.m53777p(point, "<this>");
        return point.y;
    }

    @vr2
    /* renamed from: e */
    public static final Point m31902e(@vr2 Point point, int i) {
        jt1.m53777p(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        int i2 = -i;
        point2.offset(i2, i2);
        return point2;
    }

    @vr2
    /* renamed from: f */
    public static final Point m31903f(@vr2 Point point, @vr2 Point point2) {
        jt1.m53777p(point, "<this>");
        jt1.m53777p(point2, "p");
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    @vr2
    /* renamed from: g */
    public static final PointF m31904g(@vr2 PointF pointF, float f) {
        jt1.m53777p(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f2 = -f;
        pointF2.offset(f2, f2);
        return pointF2;
    }

    @vr2
    /* renamed from: h */
    public static final PointF m31905h(@vr2 PointF pointF, @vr2 PointF pointF2) {
        jt1.m53777p(pointF, "<this>");
        jt1.m53777p(pointF2, "p");
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    @vr2
    /* renamed from: i */
    public static final Point m31906i(@vr2 Point point, int i) {
        jt1.m53777p(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        point2.offset(i, i);
        return point2;
    }

    @vr2
    /* renamed from: j */
    public static final Point m31907j(@vr2 Point point, @vr2 Point point2) {
        jt1.m53777p(point, "<this>");
        jt1.m53777p(point2, "p");
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    @vr2
    /* renamed from: k */
    public static final PointF m31908k(@vr2 PointF pointF, float f) {
        jt1.m53777p(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f, f);
        return pointF2;
    }

    @vr2
    /* renamed from: l */
    public static final PointF m31909l(@vr2 PointF pointF, @vr2 PointF pointF2) {
        jt1.m53777p(pointF, "<this>");
        jt1.m53777p(pointF2, "p");
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    @vr2
    /* renamed from: m */
    public static final Point m31910m(@vr2 PointF pointF) {
        jt1.m53777p(pointF, "<this>");
        return new Point((int) pointF.x, (int) pointF.y);
    }

    @vr2
    /* renamed from: n */
    public static final PointF m31911n(@vr2 Point point) {
        jt1.m53777p(point, "<this>");
        return new PointF(point);
    }

    @vr2
    /* renamed from: o */
    public static final Point m31912o(@vr2 Point point) {
        jt1.m53777p(point, "<this>");
        return new Point(-point.x, -point.y);
    }

    @vr2
    /* renamed from: p */
    public static final PointF m31913p(@vr2 PointF pointF) {
        jt1.m53777p(pointF, "<this>");
        return new PointF(-pointF.x, -pointF.y);
    }
}
