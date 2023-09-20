package com.onedelhi.secure;

import android.graphics.PointF;

public final class b03 {

    /* renamed from: a */
    public final float f9591a;

    /* renamed from: a */
    public final PointF f9592a;

    /* renamed from: b */
    public final float f9593b;

    /* renamed from: b */
    public final PointF f9594b;

    public b03(@mr2 PointF pointF, float f, @mr2 PointF pointF2, float f2) {
        this.f9592a = (PointF) k43.m19456m(pointF, "start == null");
        this.f9591a = f;
        this.f9594b = (PointF) k43.m19456m(pointF2, "end == null");
        this.f9593b = f2;
    }

    @mr2
    /* renamed from: a */
    public PointF mo13352a() {
        return this.f9594b;
    }

    /* renamed from: b */
    public float mo13353b() {
        return this.f9593b;
    }

    @mr2
    /* renamed from: c */
    public PointF mo13354c() {
        return this.f9592a;
    }

    /* renamed from: d */
    public float mo13355d() {
        return this.f9591a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b03)) {
            return false;
        }
        b03 b03 = (b03) obj;
        return Float.compare(this.f9591a, b03.f9591a) == 0 && Float.compare(this.f9593b, b03.f9593b) == 0 && this.f9592a.equals(b03.f9592a) && this.f9594b.equals(b03.f9594b);
    }

    public int hashCode() {
        int hashCode = this.f9592a.hashCode() * 31;
        float f = this.f9591a;
        int i = 0;
        int floatToIntBits = (((hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f9594b.hashCode()) * 31;
        float f2 = this.f9593b;
        if (f2 != 0.0f) {
            i = Float.floatToIntBits(f2);
        }
        return floatToIntBits + i;
    }

    public String toString() {
        return "PathSegment{start=" + this.f9592a + ", startFraction=" + this.f9591a + ", end=" + this.f9594b + ", endFraction=" + this.f9593b + '}';
    }
}
