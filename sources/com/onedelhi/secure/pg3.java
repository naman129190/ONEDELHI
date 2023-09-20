package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\b\u001a\u00020\u0007*\u00020\u0006H\n\u001a\r\u0010\t\u001a\u00020\u0007*\u00020\u0006H\n\u001a\r\u0010\n\u001a\u00020\u0007*\u00020\u0006H\n\u001a\r\u0010\u000b\u001a\u00020\u0007*\u00020\u0006H\n\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\n\u001a\u0015\u0010\u000e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\n\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\n\u001a\u0015\u0010\u0011\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\n\u001a\u0015\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012H\n\u001a\u0015\u0010\u0015\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0014H\n\u001a\u0015\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\n\u001a\u0015\u0010\f\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\n\u001a\u0015\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\n\u001a\u0015\u0010\u0019\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\n\u001a\u0015\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012H\n\u001a\u0015\u0010\u001b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0014H\n\u001a\u0015\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0001H\n\u001a\u0015\u0010\u001e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0001H\n\u001a\u0015\u0010\u001f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0007H\n\u001a\u0015\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\f\u001a\u0015\u0010!\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\f\u001a\u0015\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\f\u001a\u0015\u0010#\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\f\u001a\u0015\u0010$\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\f\u001a\u0015\u0010%\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\f\u001a\u0015\u0010'\u001a\u00020&*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0012H\n\u001a\u0015\u0010(\u001a\u00020&*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0014H\n\u001a\r\u0010)\u001a\u00020\u0006*\u00020\u0000H\b\u001a\r\u0010*\u001a\u00020\u0000*\u00020\u0006H\b\u001a\r\u0010+\u001a\u00020\u0016*\u00020\u0000H\b\u001a\r\u0010,\u001a\u00020\u0016*\u00020\u0006H\b\u001a\u0015\u0010.\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0018\u001a\u00020-H\b¨\u0006/"}, d2 = {"Landroid/graphics/Rect;", "", "d", "f", "h", "j", "Landroid/graphics/RectF;", "", "c", "e", "g", "i", "r", "w", "z", "xy", "u", "x", "Landroid/graphics/Point;", "v", "Landroid/graphics/PointF;", "y", "Landroid/graphics/Region;", "q", "m", "o", "n", "p", "factor", "A", "C", "B", "s", "t", "a", "b", "I", "J", "", "k", "l", "E", "D", "F", "G", "Landroid/graphics/Matrix;", "H", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class pg3 {
    @vr2
    /* renamed from: A */
    public static final Rect m24657A(@vr2 Rect rect, int i) {
        jt1.m53777p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.top *= i;
        rect2.left *= i;
        rect2.right *= i;
        rect2.bottom *= i;
        return rect2;
    }

    @vr2
    /* renamed from: B */
    public static final RectF m24658B(@vr2 RectF rectF, float f) {
        jt1.m53777p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    @vr2
    /* renamed from: C */
    public static final RectF m24659C(@vr2 RectF rectF, int i) {
        jt1.m53777p(rectF, "<this>");
        float f = (float) i;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    @vr2
    /* renamed from: D */
    public static final Rect m24660D(@vr2 RectF rectF) {
        jt1.m53777p(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @vr2
    /* renamed from: E */
    public static final RectF m24661E(@vr2 Rect rect) {
        jt1.m53777p(rect, "<this>");
        return new RectF(rect);
    }

    @vr2
    /* renamed from: F */
    public static final Region m24662F(@vr2 Rect rect) {
        jt1.m53777p(rect, "<this>");
        return new Region(rect);
    }

    @vr2
    /* renamed from: G */
    public static final Region m24663G(@vr2 RectF rectF) {
        jt1.m53777p(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @vr2
    /* renamed from: H */
    public static final RectF m24664H(@vr2 RectF rectF, @vr2 Matrix matrix) {
        jt1.m53777p(rectF, "<this>");
        jt1.m53777p(matrix, by2.f10023b);
        matrix.mapRect(rectF);
        return rectF;
    }

    @vr2
    /* renamed from: I */
    public static final Region m24665I(@vr2 Rect rect, @vr2 Rect rect2) {
        jt1.m53777p(rect, "<this>");
        jt1.m53777p(rect2, "r");
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @vr2
    /* renamed from: J */
    public static final Region m24666J(@vr2 RectF rectF, @vr2 RectF rectF2) {
        jt1.m53777p(rectF, "<this>");
        jt1.m53777p(rectF2, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @SuppressLint({"CheckResult"})
    @vr2
    /* renamed from: a */
    public static final Rect m24667a(@vr2 Rect rect, @vr2 Rect rect2) {
        jt1.m53777p(rect, "<this>");
        jt1.m53777p(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    @SuppressLint({"CheckResult"})
    @vr2
    /* renamed from: b */
    public static final RectF m24668b(@vr2 RectF rectF, @vr2 RectF rectF2) {
        jt1.m53777p(rectF, "<this>");
        jt1.m53777p(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    /* renamed from: c */
    public static final float m24669c(@vr2 RectF rectF) {
        jt1.m53777p(rectF, "<this>");
        return rectF.left;
    }

    /* renamed from: d */
    public static final int m24670d(@vr2 Rect rect) {
        jt1.m53777p(rect, "<this>");
        return rect.left;
    }

    /* renamed from: e */
    public static final float m24671e(@vr2 RectF rectF) {
        jt1.m53777p(rectF, "<this>");
        return rectF.top;
    }

    /* renamed from: f */
    public static final int m24672f(@vr2 Rect rect) {
        jt1.m53777p(rect, "<this>");
        return rect.top;
    }

    /* renamed from: g */
    public static final float m24673g(@vr2 RectF rectF) {
        jt1.m53777p(rectF, "<this>");
        return rectF.right;
    }

    /* renamed from: h */
    public static final int m24674h(@vr2 Rect rect) {
        jt1.m53777p(rect, "<this>");
        return rect.right;
    }

    /* renamed from: i */
    public static final float m24675i(@vr2 RectF rectF) {
        jt1.m53777p(rectF, "<this>");
        return rectF.bottom;
    }

    /* renamed from: j */
    public static final int m24676j(@vr2 Rect rect) {
        jt1.m53777p(rect, "<this>");
        return rect.bottom;
    }

    /* renamed from: k */
    public static final boolean m24677k(@vr2 Rect rect, @vr2 Point point) {
        jt1.m53777p(rect, "<this>");
        jt1.m53777p(point, "p");
        return rect.contains(point.x, point.y);
    }

    /* renamed from: l */
    public static final boolean m24678l(@vr2 RectF rectF, @vr2 PointF pointF) {
        jt1.m53777p(rectF, "<this>");
        jt1.m53777p(pointF, "p");
        return rectF.contains(pointF.x, pointF.y);
    }

    @vr2
    /* renamed from: m */
    public static final Rect m24679m(@vr2 Rect rect, int i) {
        jt1.m53777p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        int i2 = -i;
        rect2.offset(i2, i2);
        return rect2;
    }

    @vr2
    /* renamed from: n */
    public static final Rect m24680n(@vr2 Rect rect, @vr2 Point point) {
        jt1.m53777p(rect, "<this>");
        jt1.m53777p(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    @vr2
    /* renamed from: o */
    public static final RectF m24681o(@vr2 RectF rectF, float f) {
        jt1.m53777p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        float f2 = -f;
        rectF2.offset(f2, f2);
        return rectF2;
    }

    @vr2
    /* renamed from: p */
    public static final RectF m24682p(@vr2 RectF rectF, @vr2 PointF pointF) {
        jt1.m53777p(rectF, "<this>");
        jt1.m53777p(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }

    @vr2
    /* renamed from: q */
    public static final Region m24683q(@vr2 Rect rect, @vr2 Rect rect2) {
        jt1.m53777p(rect, "<this>");
        jt1.m53777p(rect2, "r");
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @vr2
    /* renamed from: r */
    public static final Region m24684r(@vr2 RectF rectF, @vr2 RectF rectF2) {
        jt1.m53777p(rectF, "<this>");
        jt1.m53777p(rectF2, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @vr2
    /* renamed from: s */
    public static final Rect m24685s(@vr2 Rect rect, @vr2 Rect rect2) {
        jt1.m53777p(rect, "<this>");
        jt1.m53777p(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @vr2
    /* renamed from: t */
    public static final RectF m24686t(@vr2 RectF rectF, @vr2 RectF rectF2) {
        jt1.m53777p(rectF, "<this>");
        jt1.m53777p(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @vr2
    /* renamed from: u */
    public static final Rect m24687u(@vr2 Rect rect, int i) {
        jt1.m53777p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.offset(i, i);
        return rect2;
    }

    @vr2
    /* renamed from: v */
    public static final Rect m24688v(@vr2 Rect rect, @vr2 Point point) {
        jt1.m53777p(rect, "<this>");
        jt1.m53777p(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    @vr2
    /* renamed from: w */
    public static final Rect m24689w(@vr2 Rect rect, @vr2 Rect rect2) {
        jt1.m53777p(rect, "<this>");
        jt1.m53777p(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @vr2
    /* renamed from: x */
    public static final RectF m24690x(@vr2 RectF rectF, float f) {
        jt1.m53777p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f, f);
        return rectF2;
    }

    @vr2
    /* renamed from: y */
    public static final RectF m24691y(@vr2 RectF rectF, @vr2 PointF pointF) {
        jt1.m53777p(rectF, "<this>");
        jt1.m53777p(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    @vr2
    /* renamed from: z */
    public static final RectF m24692z(@vr2 RectF rectF, @vr2 RectF rectF2) {
        jt1.m53777p(rectF, "<this>");
        jt1.m53777p(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }
}
