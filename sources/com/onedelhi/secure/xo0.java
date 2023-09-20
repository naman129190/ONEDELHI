package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class xo0 extends Drawable implements Drawable.Callback {

    /* renamed from: b */
    public static final String f22639b = "DrawableContainer";

    /* renamed from: d */
    public static final boolean f22640d = false;

    /* renamed from: e */
    public static final boolean f22641e = true;

    /* renamed from: a */
    public Rect f22642a;

    /* renamed from: a */
    public Drawable f22643a;

    /* renamed from: a */
    public C3936c f22644a;

    /* renamed from: a */
    public C3937d f22645a;

    /* renamed from: a */
    public Runnable f22646a;

    /* renamed from: b */
    public long f22647b;

    /* renamed from: b */
    public Drawable f22648b;

    /* renamed from: b */
    public boolean f22649b;

    /* renamed from: c */
    public long f22650c;

    /* renamed from: c */
    public boolean f22651c;

    /* renamed from: n */
    public int f22652n = 255;

    /* renamed from: o */
    public int f22653o = -1;

    /* renamed from: com.onedelhi.secure.xo0$a */
    public class C3934a implements Runnable {
        public C3934a() {
        }

        public void run() {
            xo0.this.mo26989a(true);
            xo0.this.invalidateSelf();
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.xo0$b */
    public static class C3935b {
        /* renamed from: a */
        public static boolean m31575a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m31576b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m31577c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: com.onedelhi.secure.xo0$c */
    public static class C3936c implements Drawable.Callback {

        /* renamed from: a */
        public Drawable.Callback f22655a;

        /* renamed from: a */
        public Drawable.Callback mo27000a() {
            Drawable.Callback callback = this.f22655a;
            this.f22655a = null;
            return callback;
        }

        /* renamed from: b */
        public C3936c mo27001b(Drawable.Callback callback) {
            this.f22655a = callback;
            return this;
        }

        public void invalidateDrawable(@mr2 Drawable drawable) {
        }

        public void scheduleDrawable(@mr2 Drawable drawable, @mr2 Runnable runnable, long j) {
            Drawable.Callback callback = this.f22655a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(@mr2 Drawable drawable, @mr2 Runnable runnable) {
            Drawable.Callback callback = this.f22655a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.xo0$d */
    public static abstract class C3937d extends Drawable.ConstantState {

        /* renamed from: a */
        public int f22656a;

        /* renamed from: a */
        public ColorStateList f22657a;

        /* renamed from: a */
        public Resources f22658a;

        /* renamed from: a */
        public ColorFilter f22659a;

        /* renamed from: a */
        public PorterDuff.Mode f22660a;

        /* renamed from: a */
        public Rect f22661a;

        /* renamed from: a */
        public SparseArray<Drawable.ConstantState> f22662a;

        /* renamed from: a */
        public final xo0 f22663a;

        /* renamed from: a */
        public boolean f22664a = false;

        /* renamed from: a */
        public Drawable[] f22665a;

        /* renamed from: b */
        public int f22666b;

        /* renamed from: b */
        public boolean f22667b;

        /* renamed from: c */
        public int f22668c;

        /* renamed from: c */
        public boolean f22669c = false;

        /* renamed from: d */
        public int f22670d;

        /* renamed from: d */
        public boolean f22671d;

        /* renamed from: e */
        public int f22672e;

        /* renamed from: e */
        public boolean f22673e;

        /* renamed from: f */
        public int f22674f;

        /* renamed from: f */
        public boolean f22675f;

        /* renamed from: g */
        public int f22676g;

        /* renamed from: g */
        public boolean f22677g;

        /* renamed from: h */
        public int f22678h;

        /* renamed from: h */
        public boolean f22679h;

        /* renamed from: i */
        public int f22680i;

        /* renamed from: i */
        public boolean f22681i;

        /* renamed from: j */
        public int f22682j;

        /* renamed from: j */
        public boolean f22683j = true;

        /* renamed from: k */
        public int f22684k = 0;

        /* renamed from: k */
        public boolean f22685k;

        /* renamed from: l */
        public int f22686l = 0;

        /* renamed from: l */
        public boolean f22687l;

        /* renamed from: m */
        public boolean f22688m;

        /* renamed from: n */
        public boolean f22689n;

        /* renamed from: o */
        public boolean f22690o;

        public C3937d(C3937d dVar, xo0 xo0, Resources resources) {
            this.f22663a = xo0;
            Rect rect = null;
            this.f22658a = resources != null ? resources : dVar != null ? dVar.f22658a : null;
            int g = xo0.m31562g(resources, dVar != null ? dVar.f22656a : 0);
            this.f22656a = g;
            if (dVar != null) {
                this.f22666b = dVar.f22666b;
                this.f22668c = dVar.f22668c;
                this.f22679h = true;
                this.f22681i = true;
                this.f22664a = dVar.f22664a;
                this.f22669c = dVar.f22669c;
                this.f22683j = dVar.f22683j;
                this.f22685k = dVar.f22685k;
                this.f22682j = dVar.f22682j;
                this.f22684k = dVar.f22684k;
                this.f22686l = dVar.f22686l;
                this.f22687l = dVar.f22687l;
                this.f22659a = dVar.f22659a;
                this.f22688m = dVar.f22688m;
                this.f22657a = dVar.f22657a;
                this.f22660a = dVar.f22660a;
                this.f22689n = dVar.f22689n;
                this.f22690o = dVar.f22690o;
                if (dVar.f22656a == g) {
                    if (dVar.f22667b) {
                        this.f22661a = dVar.f22661a != null ? new Rect(dVar.f22661a) : rect;
                        this.f22667b = true;
                    }
                    if (dVar.f22671d) {
                        this.f22672e = dVar.f22672e;
                        this.f22674f = dVar.f22674f;
                        this.f22676g = dVar.f22676g;
                        this.f22678h = dVar.f22678h;
                        this.f22671d = true;
                    }
                }
                if (dVar.f22673e) {
                    this.f22680i = dVar.f22680i;
                    this.f22673e = true;
                }
                if (dVar.f22675f) {
                    this.f22677g = dVar.f22677g;
                    this.f22675f = true;
                }
                Drawable[] drawableArr = dVar.f22665a;
                this.f22665a = new Drawable[drawableArr.length];
                this.f22670d = dVar.f22670d;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f22662a;
                this.f22662a = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f22670d);
                int i = this.f22670d;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f22662a.put(i2, constantState);
                        } else {
                            this.f22665a[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f22665a = new Drawable[10];
            this.f22670d = 0;
        }

        /* renamed from: A */
        public final boolean mo27005A(int i, int i2) {
            int i3 = this.f22670d;
            Drawable[] drawableArr = this.f22665a;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean m = Build.VERSION.SDK_INT >= 23 ? wo0.m30984m(drawableArr[i4], i) : false;
                    if (i4 == i2) {
                        z = m;
                    }
                }
            }
            this.f22682j = i;
            return z;
        }

        /* renamed from: B */
        public final void mo27006B(boolean z) {
            this.f22664a = z;
        }

        /* renamed from: C */
        public final void mo27007C(Resources resources) {
            if (resources != null) {
                this.f22658a = resources;
                int g = xo0.m31562g(resources, this.f22656a);
                int i = this.f22656a;
                this.f22656a = g;
                if (i != g) {
                    this.f22671d = false;
                    this.f22667b = false;
                }
            }
        }

        /* renamed from: a */
        public final int mo27008a(Drawable drawable) {
            int i = this.f22670d;
            if (i >= this.f22665a.length) {
                mo17544r(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f22663a);
            this.f22665a[i] = drawable;
            this.f22670d++;
            this.f22668c = drawable.getChangingConfigurations() | this.f22668c;
            mo27027s();
            this.f22661a = null;
            this.f22667b = false;
            this.f22671d = false;
            this.f22679h = false;
            return i;
        }

        @sj3(21)
        /* renamed from: b */
        public final void mo27009b(Resources.Theme theme) {
            if (theme != null) {
                mo27014f();
                int i = this.f22670d;
                Drawable[] drawableArr = this.f22665a;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && wo0.m30973b(drawableArr[i2])) {
                        wo0.m30972a(drawableArr[i2], theme);
                        this.f22668c |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo27007C(C3935b.m31577c(theme));
            }
        }

        /* renamed from: c */
        public boolean mo27010c() {
            if (this.f22679h) {
                return this.f22681i;
            }
            mo27014f();
            this.f22679h = true;
            int i = this.f22670d;
            Drawable[] drawableArr = this.f22665a;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f22681i = false;
                    return false;
                }
            }
            this.f22681i = true;
            return true;
        }

        @sj3(21)
        public boolean canApplyTheme() {
            int i = this.f22670d;
            Drawable[] drawableArr = this.f22665a;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f22662a.get(i2);
                    if (constantState != null && C3935b.m31575a(constantState)) {
                        return true;
                    }
                } else if (wo0.m30973b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final void mo27012d() {
            this.f22685k = false;
        }

        /* renamed from: e */
        public void mo27013e() {
            this.f22671d = true;
            mo27014f();
            int i = this.f22670d;
            Drawable[] drawableArr = this.f22665a;
            this.f22674f = -1;
            this.f22672e = -1;
            this.f22678h = 0;
            this.f22676g = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f22672e) {
                    this.f22672e = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f22674f) {
                    this.f22674f = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f22676g) {
                    this.f22676g = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f22678h) {
                    this.f22678h = minimumHeight;
                }
            }
        }

        /* renamed from: f */
        public final void mo27014f() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f22662a;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f22665a[this.f22662a.keyAt(i)] = mo27030w(this.f22662a.valueAt(i).newDrawable(this.f22658a));
                }
                this.f22662a = null;
            }
        }

        /* renamed from: g */
        public final int mo27015g() {
            return this.f22665a.length;
        }

        public int getChangingConfigurations() {
            return this.f22666b | this.f22668c;
        }

        /* renamed from: h */
        public final Drawable mo27017h(int i) {
            int indexOfKey;
            Drawable drawable = this.f22665a[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f22662a;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable w = mo27030w(this.f22662a.valueAt(indexOfKey).newDrawable(this.f22658a));
            this.f22665a[i] = w;
            this.f22662a.removeAt(indexOfKey);
            if (this.f22662a.size() == 0) {
                this.f22662a = null;
            }
            return w;
        }

        /* renamed from: i */
        public final int mo27018i() {
            return this.f22670d;
        }

        /* renamed from: j */
        public final int mo27019j() {
            if (!this.f22671d) {
                mo27013e();
            }
            return this.f22674f;
        }

        /* renamed from: k */
        public final int mo27020k() {
            if (!this.f22671d) {
                mo27013e();
            }
            return this.f22678h;
        }

        /* renamed from: l */
        public final int mo27021l() {
            if (!this.f22671d) {
                mo27013e();
            }
            return this.f22676g;
        }

        /* renamed from: m */
        public final Rect mo27022m() {
            Rect rect = null;
            if (this.f22664a) {
                return null;
            }
            Rect rect2 = this.f22661a;
            if (rect2 != null || this.f22667b) {
                return rect2;
            }
            mo27014f();
            Rect rect3 = new Rect();
            int i = this.f22670d;
            Drawable[] drawableArr = this.f22665a;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f22667b = true;
            this.f22661a = rect;
            return rect;
        }

        /* renamed from: n */
        public final int mo27023n() {
            if (!this.f22671d) {
                mo27013e();
            }
            return this.f22672e;
        }

        /* renamed from: o */
        public final int mo27024o() {
            return this.f22684k;
        }

        /* renamed from: p */
        public final int mo27025p() {
            return this.f22686l;
        }

        /* renamed from: q */
        public final int mo27026q() {
            if (this.f22673e) {
                return this.f22680i;
            }
            mo27014f();
            int i = this.f22670d;
            Drawable[] drawableArr = this.f22665a;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f22680i = opacity;
            this.f22673e = true;
            return opacity;
        }

        /* renamed from: r */
        public void mo17544r(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f22665a;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f22665a = drawableArr;
        }

        /* renamed from: s */
        public void mo27027s() {
            this.f22673e = false;
            this.f22675f = false;
        }

        /* renamed from: t */
        public final boolean mo27028t() {
            return this.f22669c;
        }

        /* renamed from: u */
        public final boolean mo27029u() {
            if (this.f22675f) {
                return this.f22677g;
            }
            mo27014f();
            int i = this.f22670d;
            Drawable[] drawableArr = this.f22665a;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f22677g = z;
            this.f22675f = true;
            return z;
        }

        /* renamed from: v */
        public void mo12803v() {
            int i = this.f22670d;
            Drawable[] drawableArr = this.f22665a;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    drawableArr[i2].mutate();
                }
            }
            this.f22685k = true;
        }

        /* renamed from: w */
        public final Drawable mo27030w(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                wo0.m30984m(drawable, this.f22682j);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f22663a);
            return mutate;
        }

        /* renamed from: x */
        public final void mo27031x(boolean z) {
            this.f22669c = z;
        }

        /* renamed from: y */
        public final void mo27032y(int i) {
            this.f22684k = i;
        }

        /* renamed from: z */
        public final void mo27033z(int i) {
            this.f22686l = i;
        }
    }

    /* renamed from: g */
    public static int m31562g(@ts2 Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26989a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f22649b = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f22643a
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f22647b
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f22652n
            r3.setAlpha(r9)
            goto L_0x0036
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            com.onedelhi.secure.xo0$d r9 = r13.f22645a
            int r9 = r9.f22684k
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f22652n
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x0039
        L_0x0036:
            r13.f22647b = r7
        L_0x0038:
            r3 = 0
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f22648b
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f22650c
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x004e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f22648b = r0
            goto L_0x0061
        L_0x004e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            com.onedelhi.secure.xo0$d r4 = r13.f22645a
            int r4 = r4.f22686l
            int r3 = r3 / r4
            int r4 = r13.f22652n
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f22650c = r7
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f22646a
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xo0.mo26989a(boolean):void");
    }

    @sj3(21)
    public void applyTheme(@mr2 Resources.Theme theme) {
        this.f22645a.mo27009b(theme);
    }

    /* renamed from: b */
    public void mo12752b() {
        this.f22645a.mo27012d();
        this.f22651c = false;
    }

    /* renamed from: c */
    public C3937d mo12753c() {
        return this.f22645a;
    }

    @sj3(21)
    public boolean canApplyTheme() {
        return this.f22645a.canApplyTheme();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo26990d() {
        return this.f22653o;
    }

    public void draw(@mr2 Canvas canvas) {
        Drawable drawable = this.f22643a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f22648b;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public final void mo26991e(Drawable drawable) {
        if (this.f22644a == null) {
            this.f22644a = new C3936c();
        }
        drawable.setCallback(this.f22644a.mo27001b(drawable.getCallback()));
        try {
            if (this.f22645a.f22684k <= 0 && this.f22649b) {
                drawable.setAlpha(this.f22652n);
            }
            C3937d dVar = this.f22645a;
            if (dVar.f22688m) {
                drawable.setColorFilter(dVar.f22659a);
            } else {
                if (dVar.f22689n) {
                    wo0.m30986o(drawable, dVar.f22657a);
                }
                C3937d dVar2 = this.f22645a;
                if (dVar2.f22690o) {
                    wo0.m30987p(drawable, dVar2.f22660a);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f22645a.f22683j);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                wo0.m30984m(drawable, wo0.m30977f(this));
            }
            wo0.m30981j(drawable, this.f22645a.f22687l);
            Rect rect = this.f22642a;
            if (rect != null) {
                wo0.m30983l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f22644a.mo27000a());
        }
    }

    /* renamed from: f */
    public final boolean mo26992f() {
        return isAutoMirrored() && wo0.m30977f(this) == 1;
    }

    public int getAlpha() {
        return this.f22652n;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f22645a.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f22645a.mo27010c()) {
            return null;
        }
        this.f22645a.f22666b = getChangingConfigurations();
        return this.f22645a;
    }

    @mr2
    public Drawable getCurrent() {
        return this.f22643a;
    }

    public void getHotspotBounds(@mr2 Rect rect) {
        Rect rect2 = this.f22642a;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f22645a.mo27028t()) {
            return this.f22645a.mo27019j();
        }
        Drawable drawable = this.f22643a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f22645a.mo27028t()) {
            return this.f22645a.mo27023n();
        }
        Drawable drawable = this.f22643a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f22645a.mo27028t()) {
            return this.f22645a.mo27020k();
        }
        Drawable drawable = this.f22643a;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f22645a.mo27028t()) {
            return this.f22645a.mo27021l();
        }
        Drawable drawable = this.f22643a;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f22643a;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f22645a.mo27026q();
    }

    @sj3(21)
    public void getOutline(@mr2 Outline outline) {
        Drawable drawable = this.f22643a;
        if (drawable != null) {
            C3935b.m31576b(drawable, outline);
        }
    }

    public boolean getPadding(@mr2 Rect rect) {
        boolean z;
        Rect m = this.f22645a.mo27022m();
        if (m != null) {
            rect.set(m);
            z = (m.right | ((m.left | m.top) | m.bottom)) != 0;
        } else {
            Drawable drawable = this.f22643a;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (mo26992f()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo26994h(int r10) {
        /*
            r9 = this;
            int r0 = r9.f22653o
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            com.onedelhi.secure.xo0$d r0 = r9.f22645a
            int r0 = r0.f22686l
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f22648b
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f22643a
            if (r0 == 0) goto L_0x0029
            r9.f22648b = r0
            com.onedelhi.secure.xo0$d r0 = r9.f22645a
            int r0 = r0.f22686l
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f22650c = r0
            goto L_0x0035
        L_0x0029:
            r9.f22648b = r4
            r9.f22650c = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f22643a
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            com.onedelhi.secure.xo0$d r0 = r9.f22645a
            int r1 = r0.f22670d
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo27017h(r10)
            r9.f22643a = r0
            r9.f22653o = r10
            if (r0 == 0) goto L_0x005a
            com.onedelhi.secure.xo0$d r10 = r9.f22645a
            int r10 = r10.f22684k
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f22647b = r2
        L_0x0051:
            r9.mo26991e(r0)
            goto L_0x005a
        L_0x0055:
            r9.f22643a = r4
            r10 = -1
            r9.f22653o = r10
        L_0x005a:
            long r0 = r9.f22647b
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f22650c
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f22646a
            if (r0 != 0) goto L_0x0073
            com.onedelhi.secure.xo0$a r0 = new com.onedelhi.secure.xo0$a
            r0.<init>()
            r9.f22646a = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.mo26989a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xo0.mo26994h(int):boolean");
    }

    /* renamed from: i */
    public void mo12767i(C3937d dVar) {
        this.f22645a = dVar;
        int i = this.f22653o;
        if (i >= 0) {
            Drawable h = dVar.mo27017h(i);
            this.f22643a = h;
            if (h != null) {
                mo26991e(h);
            }
        }
        this.f22648b = null;
    }

    public void invalidateDrawable(@mr2 Drawable drawable) {
        C3937d dVar = this.f22645a;
        if (dVar != null) {
            dVar.mo27027s();
        }
        if (drawable == this.f22643a && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f22645a.f22687l;
    }

    public boolean isStateful() {
        return this.f22645a.mo27029u();
    }

    /* renamed from: j */
    public void mo26995j(int i) {
        mo26994h(i);
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f22648b;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f22648b = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f22643a;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f22649b) {
                this.f22643a.setAlpha(this.f22652n);
            }
        }
        if (this.f22650c != 0) {
            this.f22650c = 0;
            z = true;
        }
        if (this.f22647b != 0) {
            this.f22647b = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    /* renamed from: k */
    public void mo12772k(int i) {
        this.f22645a.f22684k = i;
    }

    /* renamed from: l */
    public void mo12773l(int i) {
        this.f22645a.f22686l = i;
    }

    /* renamed from: m */
    public final void mo26996m(Resources resources) {
        this.f22645a.mo27007C(resources);
    }

    public Drawable mutate() {
        if (!this.f22651c && super.mutate() == this) {
            C3937d c = mo12753c();
            c.mo12803v();
            mo12767i(c);
            this.f22651c = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f22648b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f22643a;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f22645a.mo27005A(i, mo26990d());
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.f22648b;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f22643a;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    public boolean onStateChange(@mr2 int[] iArr) {
        Drawable drawable = this.f22648b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f22643a;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(@mr2 Drawable drawable, @mr2 Runnable runnable, long j) {
        if (drawable == this.f22643a && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f22649b || this.f22652n != i) {
            this.f22649b = true;
            this.f22652n = i;
            Drawable drawable = this.f22643a;
            if (drawable == null) {
                return;
            }
            if (this.f22647b == 0) {
                drawable.setAlpha(i);
            } else {
                mo26989a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C3937d dVar = this.f22645a;
        if (dVar.f22687l != z) {
            dVar.f22687l = z;
            Drawable drawable = this.f22643a;
            if (drawable != null) {
                wo0.m30981j(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C3937d dVar = this.f22645a;
        dVar.f22688m = true;
        if (dVar.f22659a != colorFilter) {
            dVar.f22659a = colorFilter;
            Drawable drawable = this.f22643a;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C3937d dVar = this.f22645a;
        if (dVar.f22683j != z) {
            dVar.f22683j = z;
            Drawable drawable = this.f22643a;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f22643a;
        if (drawable != null) {
            wo0.m30982k(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f22642a;
        if (rect == null) {
            this.f22642a = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f22643a;
        if (drawable != null) {
            wo0.m30983l(drawable, i, i2, i3, i4);
        }
    }

    public void setTint(@d10 int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        C3937d dVar = this.f22645a;
        dVar.f22689n = true;
        if (dVar.f22657a != colorStateList) {
            dVar.f22657a = colorStateList;
            wo0.m30986o(this.f22643a, colorStateList);
        }
    }

    public void setTintMode(@mr2 PorterDuff.Mode mode) {
        C3937d dVar = this.f22645a;
        dVar.f22690o = true;
        if (dVar.f22660a != mode) {
            dVar.f22660a = mode;
            wo0.m30987p(this.f22643a, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f22648b;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f22643a;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(@mr2 Drawable drawable, @mr2 Runnable runnable) {
        if (drawable == this.f22643a && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
