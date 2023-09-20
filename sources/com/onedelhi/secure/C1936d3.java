package com.onedelhi.secure;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* renamed from: com.onedelhi.secure.d3 */
public class C1936d3 {

    /* renamed from: a */
    public static final String f10604a = "android.activity.usage_time";

    /* renamed from: b */
    public static final String f10605b = "android.usage_time_packages";

    @sj3(16)
    /* renamed from: com.onedelhi.secure.d3$a */
    public static class C1937a extends C1936d3 {

        /* renamed from: a */
        public final ActivityOptions f10606a;

        public C1937a(ActivityOptions activityOptions) {
            this.f10606a = activityOptions;
        }

        /* renamed from: a */
        public Rect mo14456a() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return C1941e.m12915a(this.f10606a);
        }

        /* renamed from: j */
        public void mo14457j(@mr2 PendingIntent pendingIntent) {
            if (Build.VERSION.SDK_INT >= 23) {
                C1940d.m12914c(this.f10606a, pendingIntent);
            }
        }

        @mr2
        /* renamed from: k */
        public C1936d3 mo14458k(@ts2 Rect rect) {
            return Build.VERSION.SDK_INT < 24 ? this : new C1937a(C1941e.m12916b(this.f10606a, rect));
        }

        /* renamed from: l */
        public Bundle mo14459l() {
            return this.f10606a.toBundle();
        }

        /* renamed from: m */
        public void mo14460m(@mr2 C1936d3 d3Var) {
            if (d3Var instanceof C1937a) {
                this.f10606a.update(((C1937a) d3Var).f10606a);
            }
        }
    }

    @sj3(16)
    /* renamed from: com.onedelhi.secure.d3$b */
    public static class C1938b {
        @pn0
        /* renamed from: a */
        public static ActivityOptions m12906a(Context context, int i, int i2) {
            return ActivityOptions.makeCustomAnimation(context, i, i2);
        }

        @pn0
        /* renamed from: b */
        public static ActivityOptions m12907b(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4);
        }

        @pn0
        /* renamed from: c */
        public static ActivityOptions m12908c(View view, Bitmap bitmap, int i, int i2) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2);
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.d3$c */
    public static class C1939c {
        @pn0
        /* renamed from: a */
        public static ActivityOptions m12909a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @pn0
        @SafeVarargs
        /* renamed from: b */
        public static ActivityOptions m12910b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        @pn0
        /* renamed from: c */
        public static ActivityOptions m12911c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    @sj3(23)
    /* renamed from: com.onedelhi.secure.d3$d */
    public static class C1940d {
        @pn0
        /* renamed from: a */
        public static ActivityOptions m12912a() {
            return ActivityOptions.makeBasic();
        }

        @pn0
        /* renamed from: b */
        public static ActivityOptions m12913b(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4);
        }

        @pn0
        /* renamed from: c */
        public static void m12914c(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    @sj3(24)
    /* renamed from: com.onedelhi.secure.d3$e */
    public static class C1941e {
        @pn0
        /* renamed from: a */
        public static Rect m12915a(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        @pn0
        /* renamed from: b */
        public static ActivityOptions m12916b(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    @mr2
    /* renamed from: b */
    public static C1936d3 m12888b() {
        return Build.VERSION.SDK_INT >= 23 ? new C1937a(C1940d.m12912a()) : new C1936d3();
    }

    @mr2
    /* renamed from: c */
    public static C1936d3 m12889c(@mr2 View view, int i, int i2, int i3, int i4) {
        return Build.VERSION.SDK_INT >= 23 ? new C1937a(C1940d.m12913b(view, i, i2, i3, i4)) : new C1936d3();
    }

    @mr2
    /* renamed from: d */
    public static C1936d3 m12890d(@mr2 Context context, int i, int i2) {
        return new C1937a(C1938b.m12906a(context, i, i2));
    }

    @mr2
    /* renamed from: e */
    public static C1936d3 m12891e(@mr2 View view, int i, int i2, int i3, int i4) {
        return new C1937a(C1938b.m12907b(view, i, i2, i3, i4));
    }

    @mr2
    /* renamed from: f */
    public static C1936d3 m12892f(@mr2 Activity activity, @mr2 View view, @mr2 String str) {
        return new C1937a(C1939c.m12909a(activity, view, str));
    }

    @mr2
    /* renamed from: g */
    public static C1936d3 m12893g(@mr2 Activity activity, @ts2 fy2<View, String>... fy2Arr) {
        Pair[] pairArr = null;
        if (fy2Arr != null) {
            pairArr = new Pair[fy2Arr.length];
            for (int i = 0; i < fy2Arr.length; i++) {
                pairArr[i] = Pair.create((View) fy2Arr[i].f12385a, (String) fy2Arr[i].f12386b);
            }
        }
        return new C1937a(C1939c.m12910b(activity, pairArr));
    }

    @mr2
    /* renamed from: h */
    public static C1936d3 m12894h() {
        return new C1937a(C1939c.m12911c());
    }

    @mr2
    /* renamed from: i */
    public static C1936d3 m12895i(@mr2 View view, @mr2 Bitmap bitmap, int i, int i2) {
        return new C1937a(C1938b.m12908c(view, bitmap, i, i2));
    }

    @ts2
    /* renamed from: a */
    public Rect mo14456a() {
        return null;
    }

    /* renamed from: j */
    public void mo14457j(@mr2 PendingIntent pendingIntent) {
    }

    @mr2
    /* renamed from: k */
    public C1936d3 mo14458k(@ts2 Rect rect) {
        return this;
    }

    @ts2
    /* renamed from: l */
    public Bundle mo14459l() {
        return null;
    }

    /* renamed from: m */
    public void mo14460m(@mr2 C1936d3 d3Var) {
    }
}
