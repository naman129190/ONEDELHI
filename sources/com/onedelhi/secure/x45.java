package com.onedelhi.secure;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class x45 extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public Drawable f22429a;

    /* renamed from: a */
    public v45 f22430a;

    /* renamed from: b */
    public long f22431b;

    /* renamed from: b */
    public Drawable f22432b;

    /* renamed from: b */
    public boolean f22433b;

    /* renamed from: c */
    public boolean f22434c;

    /* renamed from: d */
    public boolean f22435d;

    /* renamed from: e */
    public boolean f22436e;

    /* renamed from: f */
    public boolean f22437f;

    /* renamed from: n */
    public int f22438n;

    /* renamed from: o */
    public int f22439o;

    /* renamed from: p */
    public int f22440p;

    /* renamed from: q */
    public int f22441q;

    /* renamed from: r */
    public int f22442r;

    /* renamed from: s */
    public int f22443s;

    public x45(@ts2 Drawable drawable, @ts2 Drawable drawable2) {
        this((v45) null);
        drawable = drawable == null ? t45.f20652a : drawable;
        this.f22429a = drawable;
        drawable.setCallback(this);
        v45 v45 = this.f22430a;
        v45.f21664b = drawable.getChangingConfigurations() | v45.f21664b;
        drawable2 = drawable2 == null ? t45.f20652a : drawable2;
        this.f22432b = drawable2;
        drawable2.setCallback(this);
        v45 v452 = this.f22430a;
        v452.f21664b = drawable2.getChangingConfigurations() | v452.f21664b;
    }

    public x45(@ts2 v45 v45) {
        this.f22438n = 0;
        this.f22440p = 255;
        this.f22442r = 0;
        this.f22433b = true;
        this.f22430a = new v45(v45);
    }

    /* renamed from: a */
    public final Drawable mo26775a() {
        return this.f22432b;
    }

    /* renamed from: b */
    public final void mo26776b(int i) {
        this.f22439o = this.f22440p;
        this.f22442r = 0;
        this.f22441q = 250;
        this.f22438n = 1;
        invalidateSelf();
    }

    /* renamed from: c */
    public final boolean mo26777c() {
        if (!this.f22435d) {
            boolean z = false;
            if (!(this.f22429a.getConstantState() == null || this.f22432b.getConstantState() == null)) {
                z = true;
            }
            this.f22436e = z;
            this.f22435d = true;
        }
        return this.f22436e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r0 == 0) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            int r0 = r7.f22438n
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L_0x0039
            if (r0 == r1) goto L_0x000a
            goto L_0x0042
        L_0x000a:
            long r0 = r7.f22431b
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0042
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r7.f22431b
            long r0 = r0 - r4
            float r0 = (float) r0
            int r1 = r7.f22441q
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            if (r3 == 0) goto L_0x002a
            r7.f22438n = r2
        L_0x002a:
            float r0 = java.lang.Math.min(r0, r1)
            int r1 = r7.f22439o
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 0
            float r1 = r1 + r0
            int r0 = (int) r1
            r7.f22442r = r0
            goto L_0x0042
        L_0x0039:
            long r3 = android.os.SystemClock.uptimeMillis()
            r7.f22431b = r3
            r7.f22438n = r1
            r3 = 0
        L_0x0042:
            int r0 = r7.f22442r
            boolean r1 = r7.f22433b
            android.graphics.drawable.Drawable r4 = r7.f22429a
            android.graphics.drawable.Drawable r5 = r7.f22432b
            if (r3 == 0) goto L_0x0061
            if (r1 == 0) goto L_0x0051
            if (r0 != 0) goto L_0x0056
            goto L_0x0052
        L_0x0051:
            r2 = r0
        L_0x0052:
            r4.draw(r8)
            r0 = r2
        L_0x0056:
            int r1 = r7.f22440p
            if (r0 != r1) goto L_0x0060
            r5.setAlpha(r1)
            r5.draw(r8)
        L_0x0060:
            return
        L_0x0061:
            if (r1 == 0) goto L_0x0069
            int r2 = r7.f22440p
            int r2 = r2 - r0
            r4.setAlpha(r2)
        L_0x0069:
            r4.draw(r8)
            if (r1 == 0) goto L_0x0073
            int r1 = r7.f22440p
            r4.setAlpha(r1)
        L_0x0073:
            if (r0 <= 0) goto L_0x0080
            r5.setAlpha(r0)
            r5.draw(r8)
            int r8 = r7.f22440p
            r5.setAlpha(r8)
        L_0x0080:
            r7.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.x45.draw(android.graphics.Canvas):void");
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        v45 v45 = this.f22430a;
        return changingConfigurations | v45.f21663a | v45.f21664b;
    }

    @ts2
    public final Drawable.ConstantState getConstantState() {
        if (!mo26777c()) {
            return null;
        }
        this.f22430a.f21663a = getChangingConfigurations();
        return this.f22430a;
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.f22429a.getIntrinsicHeight(), this.f22432b.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.f22429a.getIntrinsicWidth(), this.f22432b.getIntrinsicWidth());
    }

    public final int getOpacity() {
        if (!this.f22437f) {
            this.f22443s = Drawable.resolveOpacity(this.f22429a.getOpacity(), this.f22432b.getOpacity());
            this.f22437f = true;
        }
        return this.f22443s;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @C7277xt
    public final Drawable mutate() {
        if (!this.f22434c && super.mutate() == this) {
            if (mo26777c()) {
                this.f22429a.mutate();
                this.f22432b.mutate();
                this.f22434c = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        this.f22429a.setBounds(rect);
        this.f22432b.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.f22442r == this.f22440p) {
            this.f22442r = i;
        }
        this.f22440p = i;
        invalidateSelf();
    }

    public final void setColorFilter(@ts2 ColorFilter colorFilter) {
        this.f22429a.setColorFilter(colorFilter);
        this.f22432b.setColorFilter(colorFilter);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
