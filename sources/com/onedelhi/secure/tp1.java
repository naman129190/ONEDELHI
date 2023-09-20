package com.onedelhi.secure;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import com.onedelhi.secure.C2218g6;
import com.onedelhi.secure.C6774sj;

public final class tp1<S extends C6774sj> extends lp0 {

    /* renamed from: a */
    public pp0<S> f35755a;

    /* renamed from: a */
    public sp1<ObjectAnimator> f35756a;

    public tp1(@mr2 Context context, @mr2 C6774sj sjVar, @mr2 pp0<S> pp0, @mr2 sp1<ObjectAnimator> sp1) {
        super(context, sjVar);
        mo45220C(pp0);
        mo45219B(sp1);
    }

    @mr2
    /* renamed from: x */
    public static tp1<CircularProgressIndicatorSpec> m66092x(@mr2 Context context, @mr2 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new tp1<>(context, circularProgressIndicatorSpec, new C5455gy(circularProgressIndicatorSpec), new C5606hy(circularProgressIndicatorSpec));
    }

    @mr2
    /* renamed from: y */
    public static tp1<LinearProgressIndicatorSpec> m66093y(@mr2 Context context, @mr2 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new tp1<>(context, linearProgressIndicatorSpec, new k32(linearProgressIndicatorSpec), linearProgressIndicatorSpec.f24227f == 0 ? new l32(linearProgressIndicatorSpec) : new m32(context, linearProgressIndicatorSpec));
    }

    @mr2
    /* renamed from: A */
    public pp0<S> mo45218A() {
        return this.f35755a;
    }

    /* renamed from: B */
    public void mo45219B(@mr2 sp1<ObjectAnimator> sp1) {
        this.f35756a = sp1;
        sp1.mo44431e(this);
    }

    /* renamed from: C */
    public void mo45220C(@mr2 pp0<S> pp0) {
        this.f35755a = pp0;
        pp0.mo42834f(this);
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
            this.f35755a.mo42835g(canvas, getBounds(), mo40159j());
            this.f35755a.mo36977c(canvas, this.f31770a);
            int i = 0;
            while (true) {
                sp1<ObjectAnimator> sp1 = this.f35756a;
                int[] iArr = sp1.f35159a;
                if (i < iArr.length) {
                    pp0<S> pp0 = this.f35755a;
                    Paint paint = this.f31770a;
                    float[] fArr = sp1.f35158a;
                    int i2 = i * 2;
                    pp0.mo36976b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public int getIntrinsicHeight() {
        return this.f35755a.mo36978d();
    }

    public int getIntrinsicWidth() {
        return this.f35755a.mo36979e();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
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
        if (!isRunning()) {
            this.f35756a.mo37645a();
        }
        float a = this.f31771a.mo35784a(this.f31769a.getContentResolver());
        if (z && (z3 || (Build.VERSION.SDK_INT <= 22 && a > 0.0f))) {
            this.f35756a.mo37649g();
        }
        return w;
    }

    @mr2
    /* renamed from: z */
    public sp1<ObjectAnimator> mo45224z() {
        return this.f35756a;
    }
}
