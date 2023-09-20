package com.onedelhi.secure;

import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.nb1;
import java.util.HashMap;
import java.util.Map;

public class ob1 {

    /* renamed from: a */
    public static final C7012v5 f32971a = C7012v5.m67717e();

    /* renamed from: a */
    public static final String f32972a = "androidx.core.app.FrameMetricsAggregator";

    /* renamed from: a */
    public final Activity f32973a;

    /* renamed from: a */
    public final mb1 f32974a;

    /* renamed from: a */
    public final Map<Fragment, nb1.C6180a> f32975a;

    /* renamed from: a */
    public boolean f32976a;

    public ob1(Activity activity) {
        this(activity, new mb1(), new HashMap());
    }

    @VisibleForTesting
    public ob1(Activity activity, mb1 mb1, Map<Fragment, nb1.C6180a> map) {
        this.f32976a = false;
        this.f32973a = activity;
        this.f32974a = mb1;
        this.f32975a = map;
    }

    /* renamed from: a */
    public static boolean m59179a() {
        return true;
    }

    /* renamed from: b */
    public final rw2<nb1.C6180a> mo41648b() {
        if (!this.f32976a) {
            f32971a.mo46000a("No recording has been started.");
            return rw2.m63941a();
        }
        SparseIntArray[] b = this.f32974a.mo20252b();
        if (b == null) {
            f32971a.mo46000a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return rw2.m63941a();
        } else if (b[0] != null) {
            return rw2.m63943e(nb1.m58022a(b));
        } else {
            f32971a.mo46000a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return rw2.m63941a();
        }
    }

    /* renamed from: c */
    public void mo41649c() {
        if (this.f32976a) {
            f32971a.mo46001b("FrameMetricsAggregator is already recording %s", this.f32973a.getClass().getSimpleName());
            return;
        }
        this.f32974a.mo20251a(this.f32973a);
        this.f32976a = true;
    }

    /* renamed from: d */
    public void mo41650d(Fragment fragment) {
        if (!this.f32976a) {
            f32971a.mo46000a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
        } else if (this.f32975a.containsKey(fragment)) {
            f32971a.mo46001b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
        } else {
            rw2<nb1.C6180a> b = mo41648b();
            if (!b.mo44068d()) {
                f32971a.mo46001b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                return;
            }
            this.f32975a.put(fragment, b.mo44067c());
        }
    }

    /* renamed from: e */
    public rw2<nb1.C6180a> mo41651e() {
        if (!this.f32976a) {
            f32971a.mo46000a("Cannot stop because no recording was started");
            return rw2.m63941a();
        }
        if (!this.f32975a.isEmpty()) {
            f32971a.mo46000a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f32975a.clear();
        }
        rw2<nb1.C6180a> b = mo41648b();
        try {
            this.f32974a.mo20253c(this.f32973a);
        } catch (IllegalArgumentException | NullPointerException e) {
            if (!(e instanceof NullPointerException) || Build.VERSION.SDK_INT <= 28) {
                f32971a.mo46011m("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                b = rw2.m63941a();
            } else {
                throw e;
            }
        }
        this.f32974a.mo20254d();
        this.f32976a = false;
        return b;
    }

    /* renamed from: f */
    public rw2<nb1.C6180a> mo41652f(Fragment fragment) {
        if (!this.f32976a) {
            f32971a.mo46000a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return rw2.m63941a();
        } else if (!this.f32975a.containsKey(fragment)) {
            f32971a.mo46001b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return rw2.m63941a();
        } else {
            nb1.C6180a remove = this.f32975a.remove(fragment);
            rw2<nb1.C6180a> b = mo41648b();
            if (b.mo44068d()) {
                return rw2.m63943e(b.mo44067c().mo41014a(remove));
            }
            f32971a.mo46001b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
            return rw2.m63941a();
        }
    }
}
