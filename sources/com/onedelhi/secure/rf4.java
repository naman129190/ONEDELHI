package com.onedelhi.secure;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class rf4 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public static rf4 f19820a = null;

    /* renamed from: b */
    public static final long f19821b = 2500;

    /* renamed from: b */
    public static rf4 f19822b = null;

    /* renamed from: b */
    public static final String f19823b = "TooltipCompatHandler";

    /* renamed from: c */
    public static final long f19824c = 15000;

    /* renamed from: d */
    public static final long f19825d = 3000;

    /* renamed from: a */
    public final View f19826a;

    /* renamed from: a */
    public tf4 f19827a;

    /* renamed from: a */
    public final CharSequence f19828a;

    /* renamed from: a */
    public final Runnable f19829a = new qf4(this);

    /* renamed from: b */
    public final Runnable f19830b = new pf4(this);

    /* renamed from: b */
    public boolean f19831b;

    /* renamed from: c */
    public boolean f19832c;

    /* renamed from: n */
    public final int f19833n;

    /* renamed from: o */
    public int f19834o;

    /* renamed from: p */
    public int f19835p;

    public rf4(View view, CharSequence charSequence) {
        this.f19826a = view;
        this.f19828a = charSequence;
        this.f19833n = lt4.m20979c(ViewConfiguration.get(view.getContext()));
        mo23842c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m26713e() {
        mo23845i(false);
    }

    /* renamed from: g */
    public static void m26714g(rf4 rf4) {
        rf4 rf42 = f19820a;
        if (rf42 != null) {
            rf42.mo23841b();
        }
        f19820a = rf4;
        if (rf4 != null) {
            rf4.mo23844f();
        }
    }

    /* renamed from: h */
    public static void m26715h(View view, CharSequence charSequence) {
        rf4 rf4 = f19820a;
        if (rf4 != null && rf4.f19826a == view) {
            m26714g((rf4) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            rf4 rf42 = f19822b;
            if (rf42 != null && rf42.f19826a == view) {
                rf42.mo23843d();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new rf4(view, charSequence);
    }

    /* renamed from: b */
    public final void mo23841b() {
        this.f19826a.removeCallbacks(this.f19829a);
    }

    /* renamed from: c */
    public final void mo23842c() {
        this.f19832c = true;
    }

    /* renamed from: d */
    public void mo23843d() {
        if (f19822b == this) {
            f19822b = null;
            tf4 tf4 = this.f19827a;
            if (tf4 != null) {
                tf4.mo24896c();
                this.f19827a = null;
                mo23842c();
                this.f19826a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e(f19823b, "sActiveHandler.mPopup == null");
            }
        }
        if (f19820a == this) {
            m26714g((rf4) null);
        }
        this.f19826a.removeCallbacks(this.f19830b);
    }

    /* renamed from: f */
    public final void mo23844f() {
        this.f19826a.postDelayed(this.f19829a, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: i */
    public void mo23845i(boolean z) {
        long j;
        if (jt4.m18896O0(this.f19826a)) {
            m26714g((rf4) null);
            rf4 rf4 = f19822b;
            if (rf4 != null) {
                rf4.mo23843d();
            }
            f19822b = this;
            this.f19831b = z;
            tf4 tf4 = new tf4(this.f19826a.getContext());
            this.f19827a = tf4;
            tf4.mo24898e(this.f19826a, this.f19834o, this.f19835p, this.f19831b, this.f19828a);
            this.f19826a.addOnAttachStateChangeListener(this);
            if (this.f19831b) {
                j = f19821b;
            } else {
                j = ((jt4.m18852C0(this.f19826a) & 1) == 1 ? f19825d : f19824c) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f19826a.removeCallbacks(this.f19830b);
            this.f19826a.postDelayed(this.f19830b, j);
        }
    }

    /* renamed from: j */
    public final boolean mo23846j(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f19832c && Math.abs(x - this.f19834o) <= this.f19833n && Math.abs(y - this.f19835p) <= this.f19833n) {
            return false;
        }
        this.f19834o = x;
        this.f19835p = y;
        this.f19832c = false;
        return true;
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f19827a != null && this.f19831b) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f19826a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                mo23842c();
                mo23843d();
            }
        } else if (this.f19826a.isEnabled() && this.f19827a == null && mo23846j(motionEvent)) {
            m26714g(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f19834o = view.getWidth() / 2;
        this.f19835p = view.getHeight() / 2;
        mo23845i(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo23843d();
    }
}
