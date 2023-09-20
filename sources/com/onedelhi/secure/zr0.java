package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

public final class zr0 {

    /* renamed from: a */
    public final EdgeEffect f23862a;

    @sj3(21)
    /* renamed from: com.onedelhi.secure.zr0$a */
    public static class C4121a {
        private C4121a() {
        }

        @pn0
        /* renamed from: a */
        public static void m33340a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    @sj3(31)
    /* renamed from: com.onedelhi.secure.zr0$b */
    public static class C4122b {
        private C4122b() {
        }

        @pn0
        /* renamed from: a */
        public static EdgeEffect m33341a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @pn0
        /* renamed from: b */
        public static float m33342b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @pn0
        /* renamed from: c */
        public static float m33343c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public zr0(Context context) {
        this.f23862a = new EdgeEffect(context);
    }

    @mr2
    /* renamed from: a */
    public static EdgeEffect m33328a(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? C4122b.m33341a(context, attributeSet) : new EdgeEffect(context);
    }

    /* renamed from: d */
    public static float m33329d(@mr2 EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C4122b.m33342b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: g */
    public static void m33330g(@mr2 EdgeEffect edgeEffect, float f, float f2) {
        C4121a.m33340a(edgeEffect, f, f2);
    }

    /* renamed from: j */
    public static float m33331j(@mr2 EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C4122b.m33343c(edgeEffect, f, f2);
        }
        m33330g(edgeEffect, f, f2);
        return f;
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo28073b(Canvas canvas) {
        return this.f23862a.draw(canvas);
    }

    @Deprecated
    /* renamed from: c */
    public void mo28074c() {
        this.f23862a.finish();
    }

    @Deprecated
    /* renamed from: e */
    public boolean mo28075e() {
        return this.f23862a.isFinished();
    }

    @Deprecated
    /* renamed from: f */
    public boolean mo28076f(int i) {
        this.f23862a.onAbsorb(i);
        return true;
    }

    @Deprecated
    /* renamed from: h */
    public boolean mo28077h(float f) {
        this.f23862a.onPull(f);
        return true;
    }

    @Deprecated
    /* renamed from: i */
    public boolean mo28078i(float f, float f2) {
        m33330g(this.f23862a, f, f2);
        return true;
    }

    @Deprecated
    /* renamed from: k */
    public boolean mo28079k() {
        this.f23862a.onRelease();
        return this.f23862a.isFinished();
    }

    @Deprecated
    /* renamed from: l */
    public void mo28080l(int i, int i2) {
        this.f23862a.setSize(i, i2);
    }
}
