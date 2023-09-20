package com.onedelhi.secure;

import android.graphics.Insets;
import android.graphics.Rect;
import com.onedelhi.secure.hl3;

public final class gr1 {
    @mr2

    /* renamed from: a */
    public static final gr1 f12721a = new gr1(0, 0, 0, 0);

    /* renamed from: a */
    public final int f12722a;

    /* renamed from: b */
    public final int f12723b;

    /* renamed from: c */
    public final int f12724c;

    /* renamed from: d */
    public final int f12725d;

    @sj3(29)
    /* renamed from: com.onedelhi.secure.gr1$a */
    public static class C2276a {
        @pn0
        /* renamed from: a */
        public static Insets m16165a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public gr1(int i, int i2, int i3, int i4) {
        this.f12722a = i;
        this.f12723b = i2;
        this.f12724c = i3;
        this.f12725d = i4;
    }

    @mr2
    /* renamed from: a */
    public static gr1 m16156a(@mr2 gr1 gr1, @mr2 gr1 gr12) {
        return m16159d(gr1.f12722a + gr12.f12722a, gr1.f12723b + gr12.f12723b, gr1.f12724c + gr12.f12724c, gr1.f12725d + gr12.f12725d);
    }

    @mr2
    /* renamed from: b */
    public static gr1 m16157b(@mr2 gr1 gr1, @mr2 gr1 gr12) {
        return m16159d(Math.max(gr1.f12722a, gr12.f12722a), Math.max(gr1.f12723b, gr12.f12723b), Math.max(gr1.f12724c, gr12.f12724c), Math.max(gr1.f12725d, gr12.f12725d));
    }

    @mr2
    /* renamed from: c */
    public static gr1 m16158c(@mr2 gr1 gr1, @mr2 gr1 gr12) {
        return m16159d(Math.min(gr1.f12722a, gr12.f12722a), Math.min(gr1.f12723b, gr12.f12723b), Math.min(gr1.f12724c, gr12.f12724c), Math.min(gr1.f12725d, gr12.f12725d));
    }

    @mr2
    /* renamed from: d */
    public static gr1 m16159d(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f12721a : new gr1(i, i2, i3, i4);
    }

    @mr2
    /* renamed from: e */
    public static gr1 m16160e(@mr2 Rect rect) {
        return m16159d(rect.left, rect.top, rect.right, rect.bottom);
    }

    @mr2
    /* renamed from: f */
    public static gr1 m16161f(@mr2 gr1 gr1, @mr2 gr1 gr12) {
        return m16159d(gr1.f12722a - gr12.f12722a, gr1.f12723b - gr12.f12723b, gr1.f12724c - gr12.f12724c, gr1.f12725d - gr12.f12725d);
    }

    @mr2
    @sj3(api = 29)
    /* renamed from: g */
    public static gr1 m16162g(@mr2 Insets insets) {
        return m16159d(insets.left, insets.top, insets.right, insets.bottom);
    }

    @mr2
    @sj3(api = 29)
    @hl3({hl3.C2354a.f13188c})
    @Deprecated
    /* renamed from: i */
    public static gr1 m16163i(@mr2 Insets insets) {
        return m16162g(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gr1.class != obj.getClass()) {
            return false;
        }
        gr1 gr1 = (gr1) obj;
        return this.f12725d == gr1.f12725d && this.f12722a == gr1.f12722a && this.f12724c == gr1.f12724c && this.f12723b == gr1.f12723b;
    }

    @mr2
    @sj3(29)
    /* renamed from: h */
    public Insets mo16836h() {
        return C2276a.m16165a(this.f12722a, this.f12723b, this.f12724c, this.f12725d);
    }

    public int hashCode() {
        return (((((this.f12722a * 31) + this.f12723b) * 31) + this.f12724c) * 31) + this.f12725d;
    }

    @mr2
    public String toString() {
        return "Insets{left=" + this.f12722a + ", top=" + this.f12723b + ", right=" + this.f12724c + ", bottom=" + this.f12725d + '}';
    }
}
