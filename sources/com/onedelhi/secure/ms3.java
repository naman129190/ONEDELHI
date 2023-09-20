package com.onedelhi.secure;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

@Deprecated
public final class ms3 {

    /* renamed from: a */
    public OverScroller f16277a;

    public ms3(Context context, Interpolator interpolator) {
        OverScroller overScroller;
        if (interpolator == null) {
            overScroller = new OverScroller(context);
        }
        this.f16277a = overScroller;
    }

    @Deprecated
    /* renamed from: c */
    public static ms3 m21919c(Context context) {
        return m21920d(context, (Interpolator) null);
    }

    @Deprecated
    /* renamed from: d */
    public static ms3 m21920d(Context context, Interpolator interpolator) {
        return new ms3(context, interpolator);
    }

    @Deprecated
    /* renamed from: a */
    public void mo20593a() {
        this.f16277a.abortAnimation();
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo20594b() {
        return this.f16277a.computeScrollOffset();
    }

    @Deprecated
    /* renamed from: e */
    public void mo20595e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f16277a.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Deprecated
    /* renamed from: f */
    public void mo20596f(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f16277a.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    @Deprecated
    /* renamed from: g */
    public float mo20597g() {
        return this.f16277a.getCurrVelocity();
    }

    @Deprecated
    /* renamed from: h */
    public int mo20598h() {
        return this.f16277a.getCurrX();
    }

    @Deprecated
    /* renamed from: i */
    public int mo20599i() {
        return this.f16277a.getCurrY();
    }

    @Deprecated
    /* renamed from: j */
    public int mo20600j() {
        return this.f16277a.getFinalX();
    }

    @Deprecated
    /* renamed from: k */
    public int mo20601k() {
        return this.f16277a.getFinalY();
    }

    @Deprecated
    /* renamed from: l */
    public boolean mo20602l() {
        return this.f16277a.isFinished();
    }

    @Deprecated
    /* renamed from: m */
    public boolean mo20603m() {
        return this.f16277a.isOverScrolled();
    }

    @Deprecated
    /* renamed from: n */
    public void mo20604n(int i, int i2, int i3) {
        this.f16277a.notifyHorizontalEdgeReached(i, i2, i3);
    }

    @Deprecated
    /* renamed from: o */
    public void mo20605o(int i, int i2, int i3) {
        this.f16277a.notifyVerticalEdgeReached(i, i2, i3);
    }

    @Deprecated
    /* renamed from: p */
    public boolean mo20606p(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.f16277a.springBack(i, i2, i3, i4, i5, i6);
    }

    @Deprecated
    /* renamed from: q */
    public void mo20607q(int i, int i2, int i3, int i4) {
        this.f16277a.startScroll(i, i2, i3, i4);
    }

    @Deprecated
    /* renamed from: r */
    public void mo20608r(int i, int i2, int i3, int i4, int i5) {
        this.f16277a.startScroll(i, i2, i3, i4, i5);
    }
}
