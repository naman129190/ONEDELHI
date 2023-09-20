package com.onedelhi.secure;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class mb1 {

    /* renamed from: a */
    public static final int f16019a = 0;

    /* renamed from: b */
    public static final int f16020b = 1;

    /* renamed from: c */
    public static final int f16021c = 2;

    /* renamed from: d */
    public static final int f16022d = 3;

    /* renamed from: e */
    public static final int f16023e = 4;

    /* renamed from: f */
    public static final int f16024f = 5;

    /* renamed from: g */
    public static final int f16025g = 6;

    /* renamed from: h */
    public static final int f16026h = 7;

    /* renamed from: i */
    public static final int f16027i = 8;

    /* renamed from: j */
    public static final int f16028j = 8;

    /* renamed from: k */
    public static final int f16029k = 1;

    /* renamed from: l */
    public static final int f16030l = 2;

    /* renamed from: m */
    public static final int f16031m = 4;

    /* renamed from: n */
    public static final int f16032n = 8;

    /* renamed from: o */
    public static final int f16033o = 16;

    /* renamed from: p */
    public static final int f16034p = 32;

    /* renamed from: q */
    public static final int f16035q = 64;

    /* renamed from: r */
    public static final int f16036r = 128;

    /* renamed from: s */
    public static final int f16037s = 256;

    /* renamed from: t */
    public static final int f16038t = 511;

    /* renamed from: a */
    public final C2851b f16039a;

    @sj3(24)
    /* renamed from: com.onedelhi.secure.mb1$a */
    public static class C2849a extends C2851b {

        /* renamed from: a */
        public static Handler f16040a = null;

        /* renamed from: a */
        public static HandlerThread f16041a = null;

        /* renamed from: b */
        public static final int f16042b = 1000000;

        /* renamed from: c */
        public static final int f16043c = 500000;

        /* renamed from: a */
        public int f16044a;

        /* renamed from: a */
        public Window.OnFrameMetricsAvailableListener f16045a = new C2850a();

        /* renamed from: a */
        public final ArrayList<WeakReference<Activity>> f16046a = new ArrayList<>();

        /* renamed from: a */
        public SparseIntArray[] f16047a = new SparseIntArray[9];

        /* renamed from: com.onedelhi.secure.mb1$a$a */
        public class C2850a implements Window.OnFrameMetricsAvailableListener {
            public C2850a() {
            }

            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                C2849a aVar = C2849a.this;
                if ((aVar.f16044a & 1) != 0) {
                    aVar.mo20261f(aVar.f16047a[0], frameMetrics.getMetric(8));
                }
                C2849a aVar2 = C2849a.this;
                if ((aVar2.f16044a & 2) != 0) {
                    aVar2.mo20261f(aVar2.f16047a[1], frameMetrics.getMetric(1));
                }
                C2849a aVar3 = C2849a.this;
                if ((aVar3.f16044a & 4) != 0) {
                    aVar3.mo20261f(aVar3.f16047a[2], frameMetrics.getMetric(3));
                }
                C2849a aVar4 = C2849a.this;
                if ((aVar4.f16044a & 8) != 0) {
                    aVar4.mo20261f(aVar4.f16047a[3], frameMetrics.getMetric(4));
                }
                C2849a aVar5 = C2849a.this;
                if ((aVar5.f16044a & 16) != 0) {
                    aVar5.mo20261f(aVar5.f16047a[4], frameMetrics.getMetric(5));
                }
                C2849a aVar6 = C2849a.this;
                if ((aVar6.f16044a & 64) != 0) {
                    aVar6.mo20261f(aVar6.f16047a[6], frameMetrics.getMetric(7));
                }
                C2849a aVar7 = C2849a.this;
                if ((aVar7.f16044a & 32) != 0) {
                    aVar7.mo20261f(aVar7.f16047a[5], frameMetrics.getMetric(6));
                }
                C2849a aVar8 = C2849a.this;
                if ((aVar8.f16044a & 128) != 0) {
                    aVar8.mo20261f(aVar8.f16047a[7], frameMetrics.getMetric(0));
                }
                C2849a aVar9 = C2849a.this;
                if ((aVar9.f16044a & 256) != 0) {
                    aVar9.mo20261f(aVar9.f16047a[8], frameMetrics.getMetric(2));
                }
            }
        }

        public C2849a(int i) {
            this.f16044a = i;
        }

        /* renamed from: a */
        public void mo20256a(Activity activity) {
            if (f16041a == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f16041a = handlerThread;
                handlerThread.start();
                f16040a = new Handler(f16041a.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f16047a;
                if (sparseIntArrayArr[i] == null && (this.f16044a & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f16045a, f16040a);
            this.f16046a.add(new WeakReference(activity));
        }

        /* renamed from: b */
        public SparseIntArray[] mo20257b() {
            return this.f16047a;
        }

        /* renamed from: c */
        public SparseIntArray[] mo20258c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f16046a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference next = it.next();
                if (next.get() == activity) {
                    this.f16046a.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f16045a);
            return this.f16047a;
        }

        /* renamed from: d */
        public SparseIntArray[] mo20259d() {
            SparseIntArray[] sparseIntArrayArr = this.f16047a;
            this.f16047a = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        /* renamed from: e */
        public SparseIntArray[] mo20260e() {
            for (int size = this.f16046a.size() - 1; size >= 0; size--) {
                WeakReference weakReference = this.f16046a.get(size);
                Activity activity = (Activity) weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f16045a);
                    this.f16046a.remove(size);
                }
            }
            return this.f16047a;
        }

        /* renamed from: f */
        public void mo20261f(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / zv0.f38454a);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.mb1$b */
    public static class C2851b {
        /* renamed from: a */
        public void mo20256a(Activity activity) {
        }

        /* renamed from: b */
        public SparseIntArray[] mo20257b() {
            return null;
        }

        /* renamed from: c */
        public SparseIntArray[] mo20258c(Activity activity) {
            return null;
        }

        /* renamed from: d */
        public SparseIntArray[] mo20259d() {
            return null;
        }

        /* renamed from: e */
        public SparseIntArray[] mo20260e() {
            return null;
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.mb1$c */
    public @interface C2852c {
    }

    public mb1() {
        this(1);
    }

    public mb1(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f16039a = new C2849a(i);
        } else {
            this.f16039a = new C2851b();
        }
    }

    /* renamed from: a */
    public void mo20251a(@mr2 Activity activity) {
        this.f16039a.mo20256a(activity);
    }

    @ts2
    /* renamed from: b */
    public SparseIntArray[] mo20252b() {
        return this.f16039a.mo20257b();
    }

    @ts2
    /* renamed from: c */
    public SparseIntArray[] mo20253c(@mr2 Activity activity) {
        return this.f16039a.mo20258c(activity);
    }

    @ts2
    /* renamed from: d */
    public SparseIntArray[] mo20254d() {
        return this.f16039a.mo20259d();
    }

    @ts2
    /* renamed from: e */
    public SparseIntArray[] mo20255e() {
        return this.f16039a.mo20260e();
    }
}
