package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.onedelhi.secure.C2218g6;
import java.util.ArrayList;
import java.util.List;

public abstract class lp0 extends Drawable implements C2218g6 {

    /* renamed from: a */
    public static final Property<lp0, Float> f31764a = new C6043c(Float.class, "growFraction");

    /* renamed from: e */
    public static final boolean f31765e = false;

    /* renamed from: o */
    public static final int f31766o = 500;

    /* renamed from: a */
    public float f31767a;

    /* renamed from: a */
    public ValueAnimator f31768a;

    /* renamed from: a */
    public final Context f31769a;

    /* renamed from: a */
    public final Paint f31770a = new Paint();

    /* renamed from: a */
    public C5214f7 f31771a;

    /* renamed from: a */
    public C2218g6.C2219a f31772a;

    /* renamed from: a */
    public final C6774sj f31773a;

    /* renamed from: a */
    public List<C2218g6.C2219a> f31774a;

    /* renamed from: b */
    public float f31775b;

    /* renamed from: b */
    public ValueAnimator f31776b;

    /* renamed from: b */
    public boolean f31777b;

    /* renamed from: c */
    public boolean f31778c;

    /* renamed from: d */
    public boolean f31779d;

    /* renamed from: n */
    public int f31780n;

    /* renamed from: com.onedelhi.secure.lp0$a */
    public class C6041a extends AnimatorListenerAdapter {
        public C6041a() {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            lp0.this.mo40156h();
        }
    }

    /* renamed from: com.onedelhi.secure.lp0$b */
    public class C6042b extends AnimatorListenerAdapter {
        public C6042b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            boolean unused = lp0.super.setVisible(false, false);
            lp0.this.mo40153g();
        }
    }

    /* renamed from: com.onedelhi.secure.lp0$c */
    public class C6043c extends Property<lp0, Float> {
        public C6043c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(lp0 lp0) {
            return Float.valueOf(lp0.mo40159j());
        }

        /* renamed from: b */
        public void set(lp0 lp0, Float f) {
            lp0.mo40165p(f.floatValue());
        }
    }

    public lp0(@mr2 Context context, @mr2 C6774sj sjVar) {
        this.f31769a = context;
        this.f31773a = sjVar;
        this.f31771a = new C5214f7();
        setAlpha(255);
    }

    /* renamed from: b */
    public void mo13425b() {
        this.f31774a.clear();
        this.f31774a = null;
    }

    /* renamed from: c */
    public void mo13426c(@mr2 C2218g6.C2219a aVar) {
        if (this.f31774a == null) {
            this.f31774a = new ArrayList();
        }
        if (!this.f31774a.contains(aVar)) {
            this.f31774a.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean mo13429d(@mr2 C2218g6.C2219a aVar) {
        List<C2218g6.C2219a> list = this.f31774a;
        if (list == null || !list.contains(aVar)) {
            return false;
        }
        this.f31774a.remove(aVar);
        if (!this.f31774a.isEmpty()) {
            return true;
        }
        this.f31774a = null;
        return true;
    }

    /* renamed from: g */
    public final void mo40153g() {
        C2218g6.C2219a aVar = this.f31772a;
        if (aVar != null) {
            aVar.mo11537b(this);
        }
        List<C2218g6.C2219a> list = this.f31774a;
        if (list != null && !this.f31779d) {
            for (C2218g6.C2219a b : list) {
                b.mo11537b(this);
            }
        }
    }

    public int getAlpha() {
        return this.f31780n;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final void mo40156h() {
        C2218g6.C2219a aVar = this.f31772a;
        if (aVar != null) {
            aVar.mo11538c(this);
        }
        List<C2218g6.C2219a> list = this.f31774a;
        if (list != null && !this.f31779d) {
            for (C2218g6.C2219a c : list) {
                c.mo11538c(this);
            }
        }
    }

    /* renamed from: i */
    public final void mo40157i(@mr2 ValueAnimator... valueAnimatorArr) {
        boolean z = this.f31779d;
        this.f31779d = true;
        for (ValueAnimator end : valueAnimatorArr) {
            end.end();
        }
        this.f31779d = z;
    }

    public boolean isRunning() {
        return mo40163n() || mo40162m();
    }

    /* renamed from: j */
    public float mo40159j() {
        if (this.f31773a.mo44380b() || this.f31773a.mo44379a()) {
            return (this.f31778c || this.f31777b) ? this.f31767a : this.f31775b;
        }
        return 1.0f;
    }

    @mr2
    /* renamed from: k */
    public ValueAnimator mo40160k() {
        return this.f31776b;
    }

    /* renamed from: l */
    public boolean mo40161l() {
        return mo40176v(false, false, false);
    }

    /* renamed from: m */
    public boolean mo40162m() {
        ValueAnimator valueAnimator = this.f31776b;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f31778c;
    }

    /* renamed from: n */
    public boolean mo40163n() {
        ValueAnimator valueAnimator = this.f31768a;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f31777b;
    }

    /* renamed from: o */
    public final void mo40164o() {
        if (this.f31768a == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f31764a, new float[]{0.0f, 1.0f});
            this.f31768a = ofFloat;
            ofFloat.setDuration(500);
            this.f31768a.setInterpolator(C1947d7.f10650b);
            mo40175u(this.f31768a);
        }
        if (this.f31776b == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f31764a, new float[]{1.0f, 0.0f});
            this.f31776b = ofFloat2;
            ofFloat2.setDuration(500);
            this.f31776b.setInterpolator(C1947d7.f10650b);
            mo40166q(this.f31776b);
        }
    }

    /* renamed from: p */
    public void mo40165p(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        if (this.f31775b != f) {
            this.f31775b = f;
            invalidateSelf();
        }
    }

    /* renamed from: q */
    public final void mo40166q(@mr2 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f31776b;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.f31776b = valueAnimator;
            valueAnimator.addListener(new C6042b());
            return;
        }
        throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
    }

    /* renamed from: r */
    public void mo40167r(@mr2 C2218g6.C2219a aVar) {
        this.f31772a = aVar;
    }

    @hw4
    /* renamed from: s */
    public void mo40168s(boolean z, @d81(from = 0.0d, mo14561to = 1.0d) float f) {
        this.f31778c = z;
        this.f31767a = f;
    }

    public void setAlpha(int i) {
        this.f31780n = i;
        invalidateSelf();
    }

    public void setColorFilter(@ts2 ColorFilter colorFilter) {
        this.f31770a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return mo40176v(z, z2, true);
    }

    public void start() {
        mo40177w(true, true, false);
    }

    public void stop() {
        mo40177w(false, true, false);
    }

    @hw4
    /* renamed from: t */
    public void mo40174t(boolean z, @d81(from = 0.0d, mo14561to = 1.0d) float f) {
        this.f31777b = z;
        this.f31767a = f;
    }

    /* renamed from: u */
    public final void mo40175u(@mr2 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f31768a;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.f31768a = valueAnimator;
            valueAnimator.addListener(new C6041a());
            return;
        }
        throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
    }

    /* renamed from: v */
    public boolean mo40176v(boolean z, boolean z2, boolean z3) {
        return mo40177w(z, z2, z3 && this.f31771a.mo35784a(this.f31769a.getContentResolver()) > 0.0f);
    }

    /* renamed from: w */
    public boolean mo40177w(boolean z, boolean z2, boolean z3) {
        mo40164o();
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator = z ? this.f31768a : this.f31776b;
        if (!z3) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                mo40157i(valueAnimator);
            }
            return super.setVisible(z, false);
        } else if (z3 && valueAnimator.isRunning()) {
            return false;
        } else {
            boolean z4 = !z || super.setVisible(z, false);
            if (!(z ? this.f31773a.mo44380b() : this.f31773a.mo44379a())) {
                mo40157i(valueAnimator);
                return z4;
            }
            if (z2 || !valueAnimator.isPaused()) {
                valueAnimator.start();
            } else {
                valueAnimator.resume();
            }
            return z4;
        }
    }
}
