package com.onedelhi.secure;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class bn0 {

    /* renamed from: a */
    public final DisplayCutout f9890a;

    @sj3(28)
    /* renamed from: com.onedelhi.secure.bn0$a */
    public static class C1793a {
        @pn0
        /* renamed from: a */
        public static DisplayCutout m11961a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        @pn0
        /* renamed from: b */
        public static List<Rect> m11962b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        @pn0
        /* renamed from: c */
        public static int m11963c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        @pn0
        /* renamed from: d */
        public static int m11964d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        @pn0
        /* renamed from: e */
        public static int m11965e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        @pn0
        /* renamed from: f */
        public static int m11966f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    @sj3(29)
    /* renamed from: com.onedelhi.secure.bn0$b */
    public static class C1794b {
        @pn0
        /* renamed from: a */
        public static DisplayCutout m11967a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    @sj3(30)
    /* renamed from: com.onedelhi.secure.bn0$c */
    public static class C1795c {
        @pn0
        /* renamed from: a */
        public static DisplayCutout m11968a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        @pn0
        /* renamed from: b */
        public static Insets m11969b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public bn0(@ts2 Rect rect, @ts2 List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? C1793a.m11961a(rect, list) : null);
    }

    public bn0(DisplayCutout displayCutout) {
        this.f9890a = displayCutout;
    }

    public bn0(@mr2 gr1 gr1, @ts2 Rect rect, @ts2 Rect rect2, @ts2 Rect rect3, @ts2 Rect rect4, @mr2 gr1 gr12) {
        this(m11952a(gr1, rect, rect2, rect3, rect4, gr12));
    }

    /* renamed from: a */
    public static DisplayCutout m11952a(@mr2 gr1 gr1, @ts2 Rect rect, @ts2 Rect rect2, @ts2 Rect rect3, @ts2 Rect rect4, @mr2 gr1 gr12) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return C1795c.m11968a(gr1.mo16836h(), rect, rect2, rect3, rect4, gr12.mo16836h());
        } else if (i >= 29) {
            return C1794b.m11967a(gr1.mo16836h(), rect, rect2, rect3, rect4);
        } else {
            if (i < 28) {
                return null;
            }
            Rect rect5 = new Rect(gr1.f12722a, gr1.f12723b, gr1.f12724c, gr1.f12725d);
            ArrayList arrayList = new ArrayList();
            if (rect != null) {
                arrayList.add(rect);
            }
            if (rect2 != null) {
                arrayList.add(rect2);
            }
            if (rect3 != null) {
                arrayList.add(rect3);
            }
            if (rect4 != null) {
                arrayList.add(rect4);
            }
            return C1793a.m11961a(rect5, arrayList);
        }
    }

    /* renamed from: i */
    public static bn0 m11953i(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new bn0(displayCutout);
    }

    @mr2
    /* renamed from: b */
    public List<Rect> mo13757b() {
        return Build.VERSION.SDK_INT >= 28 ? C1793a.m11962b(this.f9890a) : Collections.emptyList();
    }

    /* renamed from: c */
    public int mo13758c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1793a.m11963c(this.f9890a);
        }
        return 0;
    }

    /* renamed from: d */
    public int mo13759d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1793a.m11964d(this.f9890a);
        }
        return 0;
    }

    /* renamed from: e */
    public int mo13760e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1793a.m11965e(this.f9890a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bn0.class != obj.getClass()) {
            return false;
        }
        return ot2.m24056a(this.f9890a, ((bn0) obj).f9890a);
    }

    /* renamed from: f */
    public int mo13762f() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1793a.m11966f(this.f9890a);
        }
        return 0;
    }

    @mr2
    /* renamed from: g */
    public gr1 mo13763g() {
        return Build.VERSION.SDK_INT >= 30 ? gr1.m16162g(C1795c.m11969b(this.f9890a)) : gr1.f12721a;
    }

    @sj3(28)
    /* renamed from: h */
    public DisplayCutout mo13764h() {
        return this.f9890a;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f9890a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    @mr2
    public String toString() {
        return "DisplayCutoutCompat{" + this.f9890a + "}";
    }
}
