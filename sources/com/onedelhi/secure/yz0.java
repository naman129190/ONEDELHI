package com.onedelhi.secure;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C1151e;
import androidx.viewpager2.widget.ViewPager2;

public final class yz0 {

    /* renamed from: a */
    public float f23364a;

    /* renamed from: a */
    public int f23365a;

    /* renamed from: a */
    public long f23366a;

    /* renamed from: a */
    public VelocityTracker f23367a;

    /* renamed from: a */
    public final RecyclerView f23368a;

    /* renamed from: a */
    public final ViewPager2 f23369a;

    /* renamed from: a */
    public final C1151e f23370a;

    /* renamed from: b */
    public int f23371b;

    public yz0(ViewPager2 viewPager2, C1151e eVar, RecyclerView recyclerView) {
        this.f23369a = viewPager2;
        this.f23370a = eVar;
        this.f23368a = recyclerView;
    }

    /* renamed from: a */
    public final void mo27736a(long j, int i, float f, float f2) {
        MotionEvent obtain = MotionEvent.obtain(this.f23366a, j, i, f, f2, 0);
        this.f23367a.addMovement(obtain);
        obtain.recycle();
    }

    @hn4
    /* renamed from: b */
    public boolean mo27737b() {
        if (this.f23370a.mo7343i()) {
            return false;
        }
        this.f23371b = 0;
        this.f23364a = (float) 0;
        this.f23366a = SystemClock.uptimeMillis();
        mo27738c();
        this.f23370a.mo7347m();
        if (!this.f23370a.mo7345k()) {
            this.f23368a.mo5405R1();
        }
        mo27736a(this.f23366a, 0, 0.0f, 0.0f);
        return true;
    }

    /* renamed from: c */
    public final void mo27738c() {
        VelocityTracker velocityTracker = this.f23367a;
        if (velocityTracker == null) {
            this.f23367a = VelocityTracker.obtain();
            this.f23365a = ViewConfiguration.get(this.f23369a.getContext()).getScaledMaximumFlingVelocity();
            return;
        }
        velocityTracker.clear();
    }

    @hn4
    /* renamed from: d */
    public boolean mo27739d() {
        if (!this.f23370a.mo7344j()) {
            return false;
        }
        this.f23370a.mo7349o();
        VelocityTracker velocityTracker = this.f23367a;
        velocityTracker.computeCurrentVelocity(1000, (float) this.f23365a);
        if (this.f23368a.mo5480m0((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            return true;
        }
        this.f23369a.mo7290u();
        return true;
    }

    @hn4
    /* renamed from: e */
    public boolean mo27740e(float f) {
        int i = 0;
        if (!this.f23370a.mo7344j()) {
            return false;
        }
        float f2 = this.f23364a - f;
        this.f23364a = f2;
        int round = Math.round(f2 - ((float) this.f23371b));
        this.f23371b += round;
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z = this.f23369a.getOrientation() == 0;
        int i2 = z ? round : 0;
        if (!z) {
            i = round;
        }
        float f3 = z ? this.f23364a : 0.0f;
        float f4 = z ? 0.0f : this.f23364a;
        this.f23368a.scrollBy(i2, i);
        mo27736a(uptimeMillis, 2, f3, f4);
        return true;
    }

    /* renamed from: f */
    public boolean mo27741f() {
        return this.f23370a.mo7344j();
    }
}
