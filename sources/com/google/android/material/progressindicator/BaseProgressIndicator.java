package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import com.onedelhi.secure.C2218g6;
import com.onedelhi.secure.C3982yb;
import com.onedelhi.secure.C5214f7;
import com.onedelhi.secure.C6774sj;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hf2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.lp0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ob4;
import com.onedelhi.secure.oe2;
import com.onedelhi.secure.ok0;
import com.onedelhi.secure.pp0;
import com.onedelhi.secure.tp1;
import com.onedelhi.secure.ts2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public abstract class BaseProgressIndicator<S extends C6774sj> extends ProgressBar {

    /* renamed from: a */
    public static final float f24185a = 0.2f;

    /* renamed from: r */
    public static final int f24186r = 0;

    /* renamed from: s */
    public static final int f24187s = 1;

    /* renamed from: t */
    public static final int f24188t = 2;

    /* renamed from: u */
    public static final int f24189u = 0;

    /* renamed from: v */
    public static final int f24190v = 1;

    /* renamed from: w */
    public static final int f24191w = 2;

    /* renamed from: x */
    public static final int f24192x = fd3.C2164n.Widget_MaterialComponents_ProgressIndicator;

    /* renamed from: y */
    public static final int f24193y = 255;

    /* renamed from: z */
    public static final int f24194z = 1000;

    /* renamed from: a */
    public C5214f7 f24195a;

    /* renamed from: a */
    public final C2218g6.C2219a f24196a = new C4171c();

    /* renamed from: a */
    public S f24197a;

    /* renamed from: a */
    public final Runnable f24198a = new C4169a();

    /* renamed from: b */
    public long f24199b = -1;

    /* renamed from: b */
    public final C2218g6.C2219a f24200b = new C4172d();

    /* renamed from: b */
    public final Runnable f24201b = new C4170b();

    /* renamed from: b */
    public boolean f24202b;

    /* renamed from: c */
    public boolean f24203c;

    /* renamed from: d */
    public boolean f24204d = false;

    /* renamed from: n */
    public int f24205n;

    /* renamed from: o */
    public final int f24206o;

    /* renamed from: p */
    public final int f24207p;

    /* renamed from: q */
    public int f24208q = 4;

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$a */
    public class C4169a implements Runnable {
        public C4169a() {
        }

        public void run() {
            BaseProgressIndicator.this.mo28568l();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$b */
    public class C4170b implements Runnable {
        public C4170b() {
        }

        public void run() {
            BaseProgressIndicator.this.mo28567k();
            long unused = BaseProgressIndicator.this.f24199b = -1;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$c */
    public class C4171c extends C2218g6.C2219a {
        public C4171c() {
        }

        /* renamed from: b */
        public void mo11537b(Drawable drawable) {
            BaseProgressIndicator.this.setIndeterminate(false);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setProgressCompat(baseProgressIndicator.f24205n, BaseProgressIndicator.this.f24202b);
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$d */
    public class C4172d extends C2218g6.C2219a {
        public C4172d() {
        }

        /* renamed from: b */
        public void mo11537b(Drawable drawable) {
            super.mo11537b(drawable);
            if (!BaseProgressIndicator.this.f24204d) {
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setVisibility(baseProgressIndicator.f24208q);
            }
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$e */
    public @interface C4173e {
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$f */
    public @interface C4174f {
    }

    public BaseProgressIndicator(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i, @e64 int i2) {
        super(hf2.m50488c(context, attributeSet, i, f24192x), attributeSet, i);
        Context context2 = getContext();
        this.f24197a = mo28564i(context2, attributeSet);
        TypedArray k = ob4.m59195k(context2, attributeSet, fd3.C2165o.BaseProgressIndicator, i, i2, new int[0]);
        this.f24206o = k.getInt(fd3.C2165o.BaseProgressIndicator_showDelay, -1);
        this.f24207p = Math.min(k.getInt(fd3.C2165o.BaseProgressIndicator_minHideDelay, -1), 1000);
        k.recycle();
        this.f24195a = new C5214f7();
        this.f24203c = true;
    }

    @ts2
    private pp0<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().mo45218A();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().mo41807C();
        }
    }

    @ts2
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f24197a.f35104e;
    }

    @ts2
    public tp1<S> getIndeterminateDrawable() {
        return (tp1) super.getIndeterminateDrawable();
    }

    @mr2
    public int[] getIndicatorColor() {
        return this.f24197a.f35100a;
    }

    @ts2
    public ok0<S> getProgressDrawable() {
        return (ok0) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.f24197a.f35103d;
    }

    @d10
    public int getTrackColor() {
        return this.f24197a.f35102c;
    }

    @e83
    public int getTrackCornerRadius() {
        return this.f24197a.f35101b;
    }

    @e83
    public int getTrackThickness() {
        return this.f24197a.f35099a;
    }

    /* renamed from: h */
    public void mo28563h(boolean z) {
        if (this.f24203c) {
            ((lp0) getCurrentDrawable()).mo40176v(mo28580r(), false, z);
        }
    }

    /* renamed from: i */
    public abstract S mo28564i(@mr2 Context context, @mr2 AttributeSet attributeSet);

    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* renamed from: j */
    public void mo28566j() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f24198a);
            return;
        }
        removeCallbacks(this.f24201b);
        long uptimeMillis = SystemClock.uptimeMillis() - this.f24199b;
        int i = this.f24207p;
        if (uptimeMillis >= ((long) i)) {
            this.f24201b.run();
        } else {
            postDelayed(this.f24201b, ((long) i) - uptimeMillis);
        }
    }

    /* renamed from: k */
    public final void mo28567k() {
        ((lp0) getCurrentDrawable()).mo40176v(false, false, true);
        if (mo28570n()) {
            setVisibility(4);
        }
    }

    /* renamed from: l */
    public final void mo28568l() {
        if (this.f24207p > 0) {
            this.f24199b = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* renamed from: m */
    public boolean mo28569m() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo28570n() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    /* renamed from: o */
    public final void mo28571o() {
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().mo45224z().mo37647d(this.f24196a);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo13426c(this.f24200b);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo13426c(this.f24200b);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo28571o();
        if (mo28580r()) {
            mo28568l();
        }
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f24201b);
        removeCallbacks(this.f24198a);
        ((lp0) getCurrentDrawable()).mo40161l();
        mo28579q();
        super.onDetachedFromWindow();
    }

    public synchronized void onDraw(@mr2 Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    public synchronized void onMeasure(int i, int i2) {
        pp0 currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate != null) {
            setMeasuredDimension(currentDrawingDelegate.mo36979e() < 0 ? ProgressBar.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.mo36979e() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.mo36978d() < 0 ? ProgressBar.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.mo36978d() + getPaddingTop() + getPaddingBottom());
        }
    }

    public void onVisibilityChanged(@mr2 View view, int i) {
        super.onVisibilityChanged(view, i);
        mo28563h(i == 0);
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        mo28563h(false);
    }

    /* renamed from: p */
    public void mo28578p() {
        if (this.f24206o > 0) {
            removeCallbacks(this.f24198a);
            postDelayed(this.f24198a, (long) this.f24206o);
            return;
        }
        this.f24198a.run();
    }

    /* renamed from: q */
    public final void mo28579q() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo13429d(this.f24200b);
            getIndeterminateDrawable().mo45224z().mo37650h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo13429d(this.f24200b);
        }
    }

    /* renamed from: r */
    public boolean mo28580r() {
        return jt4.m18896O0(this) && getWindowVisibility() == 0 && mo28569m();
    }

    @hw4
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    public void setAnimatorDurationScaleProvider(@mr2 C5214f7 f7Var) {
        this.f24195a = f7Var;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f31771a = f7Var;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f31771a = f7Var;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f24197a.f35104e = i;
        invalidate();
    }

    public synchronized void setIndeterminate(boolean z) {
        if (z != isIndeterminate()) {
            lp0 lp0 = (lp0) getCurrentDrawable();
            if (lp0 != null) {
                lp0.mo40161l();
            }
            super.setIndeterminate(z);
            lp0 lp02 = (lp0) getCurrentDrawable();
            if (lp02 != null) {
                lp02.mo40176v(mo28580r(), false, false);
            }
            if ((lp02 instanceof tp1) && mo28580r()) {
                ((tp1) lp02).mo45224z().mo37649g();
            }
            this.f24204d = false;
        }
    }

    public void setIndeterminateDrawable(@ts2 Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof tp1) {
            ((lp0) drawable).mo40161l();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(@d10 int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{oe2.m23716b(getContext(), fd3.C2153c.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f24197a.f35100a = iArr;
            getIndeterminateDrawable().mo45224z().mo37646c();
            invalidate();
        }
    }

    public synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            setProgressCompat(i, false);
        }
    }

    public void setProgressCompat(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null && !z) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.f24205n = i;
            this.f24202b = z;
            this.f24204d = true;
            if (!getIndeterminateDrawable().isVisible() || this.f24195a.mo35784a(getContext().getContentResolver()) == 0.0f) {
                this.f24196a.mo11537b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().mo45224z().mo37648f();
            }
        }
    }

    public void setProgressDrawable(@ts2 Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof ok0) {
            ok0 ok0 = (ok0) drawable;
            ok0.mo40161l();
            super.setProgressDrawable(ok0);
            ok0.mo41812H(((float) getProgress()) / ((float) getMax()));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f24197a.f35103d = i;
        invalidate();
    }

    public void setTrackColor(@d10 int i) {
        S s = this.f24197a;
        if (s.f35102c != i) {
            s.f35102c = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@e83 int i) {
        S s = this.f24197a;
        if (s.f35101b != i) {
            s.f35101b = Math.min(i, s.f35099a / 2);
        }
    }

    public void setTrackThickness(@e83 int i) {
        S s = this.f24197a;
        if (s.f35099a != i) {
            s.f35099a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.f24208q = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }
}
