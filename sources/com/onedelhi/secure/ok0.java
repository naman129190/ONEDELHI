package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import com.onedelhi.secure.C2218g6;
import com.onedelhi.secure.C6774sj;
import com.onedelhi.secure.pq0;

public final class ok0<S extends C6774sj> extends lp0 {

    /* renamed from: a */
    public static final c81<ok0> f33067a = new C6282a("indicatorLevel");

    /* renamed from: d */
    public static final float f33068d = 50.0f;

    /* renamed from: p */
    public static final int f33069p = 10000;

    /* renamed from: a */
    public final a24 f33070a;

    /* renamed from: a */
    public final b24 f33071a;

    /* renamed from: a */
    public pp0<S> f33072a;

    /* renamed from: c */
    public float f33073c;

    /* renamed from: f */
    public boolean f33074f = false;

    /* renamed from: com.onedelhi.secure.ok0$a */
    public class C6282a extends c81<ok0> {
        public C6282a(String str) {
            super(str);
        }

        /* renamed from: d */
        public float mo14062b(ok0 ok0) {
            return ok0.mo41808D() * 10000.0f;
        }

        /* renamed from: e */
        public void mo14063c(ok0 ok0, float f) {
            ok0.mo41811G(f / 10000.0f);
        }
    }

    public ok0(@mr2 Context context, @mr2 C6774sj sjVar, @mr2 pp0<S> pp0) {
        super(context, sjVar);
        mo41810F(pp0);
        b24 b24 = new b24();
        this.f33071a = b24;
        b24.mo13389g(1.0f);
        b24.mo13391i(50.0f);
        a24 a24 = new a24(this, f33067a);
        this.f33070a = a24;
        a24.mo12661D(b24);
        mo40165p(1.0f);
    }

    @mr2
    /* renamed from: A */
    public static ok0<CircularProgressIndicatorSpec> m59435A(@mr2 Context context, @mr2 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new ok0<>(context, circularProgressIndicatorSpec, new C5455gy(circularProgressIndicatorSpec));
    }

    @mr2
    /* renamed from: B */
    public static ok0<LinearProgressIndicatorSpec> m59436B(@mr2 Context context, @mr2 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new ok0<>(context, linearProgressIndicatorSpec, new k32(linearProgressIndicatorSpec));
    }

    @mr2
    /* renamed from: C */
    public pp0<S> mo41807C() {
        return this.f33072a;
    }

    /* renamed from: D */
    public final float mo41808D() {
        return this.f33073c;
    }

    /* renamed from: E */
    public void mo41809E(@mr2 pq0.C3178q qVar) {
        this.f33070a.mo22540l(qVar);
    }

    /* renamed from: F */
    public void mo41810F(@mr2 pp0<S> pp0) {
        this.f33072a = pp0;
        pp0.mo42834f(this);
    }

    /* renamed from: G */
    public final void mo41811G(float f) {
        this.f33073c = f;
        invalidateSelf();
    }

    /* renamed from: H */
    public void mo41812H(float f) {
        setLevel((int) (f * 10000.0f));
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo13425b() {
        super.mo13425b();
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo13426c(@mr2 C2218g6.C2219a aVar) {
        super.mo13426c(aVar);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo13429d(@mr2 C2218g6.C2219a aVar) {
        return super.mo13429d(aVar);
    }

    public void draw(@mr2 Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f33072a.mo42835g(canvas, getBounds(), mo40159j());
            this.f33072a.mo36977c(canvas, this.f31770a);
            Canvas canvas2 = canvas;
            this.f33072a.mo36976b(canvas2, this.f31770a, 0.0f, mo41808D(), oe2.m23715a(this.f31773a.f35100a[0], getAlpha()));
            canvas.restore();
        }
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public int getIntrinsicHeight() {
        return this.f33072a.mo36978d();
    }

    public int getIntrinsicWidth() {
        return this.f33072a.mo36979e();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    public void jumpToCurrentState() {
        this.f33070a.mo12662E();
        mo41811G(((float) getLevel()) / 10000.0f);
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ boolean mo40161l() {
        return super.mo40161l();
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ boolean mo40162m() {
        return super.mo40162m();
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ boolean mo40163n() {
        return super.mo40163n();
    }

    public boolean onLevelChange(int i) {
        if (this.f33074f) {
            this.f33070a.mo12662E();
            mo41811G(((float) i) / 10000.0f);
            return true;
        }
        this.f33070a.mo22546t(mo41808D() * 10000.0f);
        this.f33070a.mo12668z((float) i);
        return true;
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(@ts2 ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    /* renamed from: v */
    public /* bridge */ /* synthetic */ boolean mo40176v(boolean z, boolean z2, boolean z3) {
        return super.mo40176v(z, z2, z3);
    }

    /* renamed from: w */
    public boolean mo40177w(boolean z, boolean z2, boolean z3) {
        boolean w = super.mo40177w(z, z2, z3);
        float a = this.f31771a.mo35784a(this.f31769a.getContentResolver());
        if (a == 0.0f) {
            this.f33074f = true;
        } else {
            this.f33074f = false;
            this.f33071a.mo13391i(50.0f / a);
        }
        return w;
    }

    /* renamed from: z */
    public void mo41818z(@mr2 pq0.C3178q qVar) {
        this.f33070a.mo22532b(qVar);
    }
}
