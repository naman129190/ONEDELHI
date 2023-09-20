package com.onedelhi.secure;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\n\u001a\u0015\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\n\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\n\u001a\r\u0010\u000b\u001a\u00020\u0000*\u00020\u0000H\n\u001a\r\u0010\f\u001a\u00020\u0000*\u00020\u0000H\n\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\f\u001a\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\f\u001a\u0015\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\f\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\f\u001a\u0015\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\f\u001a\u0015\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\f\u001a3\u0010\u0019\u001a\u00020\u0017*\u00020\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0013H\bø\u0001\u0000\u001a\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a*\u00020\u0000H\u0002\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001c"}, d2 = {"Landroid/graphics/Region;", "Landroid/graphics/Point;", "p", "", "c", "Landroid/graphics/Rect;", "r", "k", "l", "f", "g", "m", "h", "i", "j", "a", "b", "n", "o", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iy2;", "name", "rect", "Lcom/onedelhi/secure/un4;", "action", "d", "", "e", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class ih3 {

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, d2 = {"com/onedelhi/secure/ih3$a", "", "Landroid/graphics/Rect;", "", "hasNext", "a", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ih3$a */
    public static final class C2445a implements Iterator<Rect>, nx1 {
        @vr2

        /* renamed from: a */
        public final Rect f13670a;
        @vr2

        /* renamed from: a */
        public final RegionIterator f13671a;

        /* renamed from: b */
        public boolean f13672b;

        public C2445a(Region region) {
            RegionIterator regionIterator = new RegionIterator(region);
            this.f13671a = regionIterator;
            Rect rect = new Rect();
            this.f13670a = rect;
            this.f13672b = regionIterator.next(rect);
        }

        @vr2
        /* renamed from: a */
        public Rect next() {
            if (this.f13672b) {
                Rect rect = new Rect(this.f13670a);
                this.f13672b = this.f13671a.next(this.f13670a);
                return rect;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            return this.f13672b;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @vr2
    /* renamed from: a */
    public static final Region m17543a(@vr2 Region region, @vr2 Rect rect) {
        jt1.m53777p(region, "<this>");
        jt1.m53777p(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    @vr2
    /* renamed from: b */
    public static final Region m17544b(@vr2 Region region, @vr2 Region region2) {
        jt1.m53777p(region, "<this>");
        jt1.m53777p(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    /* renamed from: c */
    public static final boolean m17545c(@vr2 Region region, @vr2 Point point) {
        jt1.m53777p(region, "<this>");
        jt1.m53777p(point, "p");
        return region.contains(point.x, point.y);
    }

    /* renamed from: d */
    public static final void m17546d(@vr2 Region region, @vr2 ec1<? super Rect, un4> ec1) {
        jt1.m53777p(region, "<this>");
        jt1.m53777p(ec1, "action");
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (regionIterator.next(rect)) {
                ec1.mo17094X(rect);
            } else {
                return;
            }
        }
    }

    @vr2
    /* renamed from: e */
    public static final Iterator<Rect> m17547e(@vr2 Region region) {
        jt1.m53777p(region, "<this>");
        return new C2445a(region);
    }

    @vr2
    /* renamed from: f */
    public static final Region m17548f(@vr2 Region region, @vr2 Rect rect) {
        jt1.m53777p(region, "<this>");
        jt1.m53777p(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    @vr2
    /* renamed from: g */
    public static final Region m17549g(@vr2 Region region, @vr2 Region region2) {
        jt1.m53777p(region, "<this>");
        jt1.m53777p(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    @vr2
    /* renamed from: h */
    public static final Region m17550h(@vr2 Region region) {
        jt1.m53777p(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @vr2
    /* renamed from: i */
    public static final Region m17551i(@vr2 Region region, @vr2 Rect rect) {
        jt1.m53777p(region, "<this>");
        jt1.m53777p(rect, "r");
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @vr2
    /* renamed from: j */
    public static final Region m17552j(@vr2 Region region, @vr2 Region region2) {
        jt1.m53777p(region, "<this>");
        jt1.m53777p(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @vr2
    /* renamed from: k */
    public static final Region m17553k(@vr2 Region region, @vr2 Rect rect) {
        jt1.m53777p(region, "<this>");
        jt1.m53777p(rect, "r");
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @vr2
    /* renamed from: l */
    public static final Region m17554l(@vr2 Region region, @vr2 Region region2) {
        jt1.m53777p(region, "<this>");
        jt1.m53777p(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @vr2
    /* renamed from: m */
    public static final Region m17555m(@vr2 Region region) {
        jt1.m53777p(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @vr2
    /* renamed from: n */
    public static final Region m17556n(@vr2 Region region, @vr2 Rect rect) {
        jt1.m53777p(region, "<this>");
        jt1.m53777p(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    @vr2
    /* renamed from: o */
    public static final Region m17557o(@vr2 Region region, @vr2 Region region2) {
        jt1.m53777p(region, "<this>");
        jt1.m53777p(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }
}
