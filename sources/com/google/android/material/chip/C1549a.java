package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.onedelhi.secure.C2402i7;
import com.onedelhi.secure.C2530jn;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3155pk;
import com.onedelhi.secure.C3745uu;
import com.onedelhi.secure.C3982yb;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.ez4;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.g74;
import com.onedelhi.secure.k10;
import com.onedelhi.secure.kp0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nl2;
import com.onedelhi.secure.p10;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.sa4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.um3;
import com.onedelhi.secure.we4;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.ya4;
import com.onedelhi.secure.yk0;
import com.onedelhi.secure.zk0;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.google.android.material.chip.a */
public class C1549a extends bf2 implements we4, Drawable.Callback, ya4.C7322b {

    /* renamed from: A */
    public static final int f8107A = 24;

    /* renamed from: a */
    public static final ShapeDrawable f8108a = new ShapeDrawable(new OvalShape());

    /* renamed from: b */
    public static final int[] f8109b = {16842910};

    /* renamed from: c */
    public static final String f8110c = "http://schemas.android.com/apk/res-auto";

    /* renamed from: m */
    public static final boolean f8111m = false;
    @mr2

    /* renamed from: a */
    public final Context f8112a;
    @ts2

    /* renamed from: a */
    public ColorStateList f8113a;
    @ts2

    /* renamed from: a */
    public ColorFilter f8114a;

    /* renamed from: a */
    public final Paint.FontMetrics f8115a = new Paint.FontMetrics();

    /* renamed from: a */
    public final PointF f8116a = new PointF();
    @ts2

    /* renamed from: a */
    public PorterDuff.Mode f8117a = PorterDuff.Mode.SRC_IN;
    @ts2

    /* renamed from: a */
    public Drawable f8118a;

    /* renamed from: a */
    public TextUtils.TruncateAt f8119a;
    @ts2

    /* renamed from: a */
    public nl2 f8120a;
    @mr2

    /* renamed from: a */
    public final ya4 f8121a;
    @ts2

    /* renamed from: a */
    public CharSequence f8122a;
    @mr2

    /* renamed from: a */
    public WeakReference<C1550a> f8123a = new WeakReference<>((Object) null);

    /* renamed from: a */
    public int[] f8124a;
    @ts2

    /* renamed from: b */
    public ColorStateList f8125b;
    @ts2

    /* renamed from: b */
    public Drawable f8126b;
    @ts2

    /* renamed from: b */
    public nl2 f8127b;
    @ts2

    /* renamed from: b */
    public CharSequence f8128b;

    /* renamed from: c */
    public float f8129c;
    @ts2

    /* renamed from: c */
    public ColorStateList f8130c;

    /* renamed from: c */
    public final Path f8131c = new Path();
    @ts2

    /* renamed from: c */
    public PorterDuffColorFilter f8132c;
    @ts2

    /* renamed from: c */
    public Drawable f8133c;

    /* renamed from: d */
    public float f8134d = -1.0f;
    @ts2

    /* renamed from: d */
    public ColorStateList f8135d;

    /* renamed from: d */
    public final Paint f8136d = new Paint(1);

    /* renamed from: d */
    public final RectF f8137d = new RectF();
    @ts2

    /* renamed from: d */
    public Drawable f8138d;

    /* renamed from: d */
    public boolean f8139d;

    /* renamed from: e */
    public float f8140e;
    @ts2

    /* renamed from: e */
    public ColorStateList f8141e;
    @ts2

    /* renamed from: e */
    public final Paint f8142e;

    /* renamed from: e */
    public boolean f8143e;

    /* renamed from: f */
    public float f8144f;
    @ts2

    /* renamed from: f */
    public ColorStateList f8145f;

    /* renamed from: f */
    public boolean f8146f;

    /* renamed from: g */
    public float f8147g;
    @ts2

    /* renamed from: g */
    public ColorStateList f8148g;

    /* renamed from: g */
    public boolean f8149g;

    /* renamed from: h */
    public float f8150h;
    @ts2

    /* renamed from: h */
    public ColorStateList f8151h;

    /* renamed from: h */
    public boolean f8152h;

    /* renamed from: i */
    public float f8153i;
    @ts2

    /* renamed from: i */
    public ColorStateList f8154i;

    /* renamed from: i */
    public boolean f8155i;

    /* renamed from: j */
    public float f8156j;

    /* renamed from: j */
    public boolean f8157j;

    /* renamed from: k */
    public float f8158k;

    /* renamed from: k */
    public boolean f8159k;

    /* renamed from: l */
    public float f8160l;

    /* renamed from: l */
    public boolean f8161l;

    /* renamed from: m */
    public float f8162m;

    /* renamed from: n */
    public float f8163n;

    /* renamed from: o */
    public float f8164o;
    @d10

    /* renamed from: r */
    public int f8165r;
    @d10

    /* renamed from: s */
    public int f8166s;
    @d10

    /* renamed from: t */
    public int f8167t;
    @d10

    /* renamed from: u */
    public int f8168u;
    @d10

    /* renamed from: v */
    public int f8169v;
    @d10

    /* renamed from: w */
    public int f8170w;
    @d10

    /* renamed from: x */
    public int f8171x;

    /* renamed from: y */
    public int f8172y = 255;

    /* renamed from: z */
    public int f8173z;

    /* renamed from: com.google.android.material.chip.a$a */
    public interface C1550a {
        /* renamed from: a */
        void mo11558a();
    }

    public C1549a(@mr2 Context context, AttributeSet attributeSet, @C3982yb int i, @e64 int i2) {
        super(context, attributeSet, i, i2);
        mo31599Z(context);
        this.f8112a = context;
        ya4 ya4 = new ya4(this);
        this.f8121a = ya4;
        this.f8122a = "";
        ya4.mo47666e().density = context.getResources().getDisplayMetrics().density;
        this.f8142e = null;
        int[] iArr = f8109b;
        setState(iArr);
        mo11855f3(iArr);
        this.f8159k = true;
        if (um3.f36190a) {
            f8108a.setTint(-1);
        }
    }

    /* renamed from: V1 */
    public static boolean m9864V1(@ts2 int[] iArr, @C3982yb int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    @mr2
    /* renamed from: a1 */
    public static C1549a m9865a1(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i, @e64 int i2) {
        C1549a aVar = new C1549a(context, attributeSet, i, i2);
        aVar.mo11867i2(attributeSet, i, i2);
        return aVar;
    }

    @mr2
    /* renamed from: b1 */
    public static C1549a m9866b1(@mr2 Context context, @ez4 int i) {
        AttributeSet g = kp0.m19972g(context, i, "chip");
        int styleAttribute = g.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = fd3.C2164n.Widget_MaterialComponents_Chip_Entry;
        }
        return m9865a1(context, g, fd3.C2153c.chipStandaloneStyle, styleAttribute);
    }

    /* renamed from: f2 */
    public static boolean m9867f2(@ts2 ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: g2 */
    public static boolean m9868g2(@ts2 Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: h2 */
    public static boolean m9869h2(@ts2 sa4 sa4) {
        return (sa4 == null || sa4.mo44261i() == null || !sa4.mo44261i().isStateful()) ? false : true;
    }

    /* renamed from: A1 */
    public float mo11760A1() {
        return this.f8163n;
    }

    /* renamed from: A2 */
    public void mo11761A2(@yk0 int i) {
        mo11930z2(this.f8112a.getResources().getDimension(i));
    }

    /* renamed from: A3 */
    public void mo11762A3(@e64 int i) {
        mo11931z3(new sa4(this.f8112a, i));
    }

    /* renamed from: B1 */
    public float mo11763B1() {
        return this.f8147g;
    }

    /* renamed from: B2 */
    public void mo11764B2(@ts2 Drawable drawable) {
        Drawable q1 = mo11895q1();
        if (q1 != drawable) {
            float R0 = mo11813R0();
            this.f8118a = drawable != null ? wo0.m30989r(drawable).mutate() : null;
            float R02 = mo11813R0();
            mo11804O3(q1);
            if (mo11798M3()) {
                mo11805P0(this.f8118a);
            }
            invalidateSelf();
            if (R0 != R02) {
                mo11872j2();
            }
        }
    }

    /* renamed from: B3 */
    public void mo11765B3(@d10 int i) {
        mo11768C3(ColorStateList.valueOf(i));
    }

    /* renamed from: C1 */
    public float mo11766C1() {
        return this.f8162m;
    }

    @Deprecated
    /* renamed from: C2 */
    public void mo11767C2(boolean z) {
        mo11791K2(z);
    }

    /* renamed from: C3 */
    public void mo11768C3(@ts2 ColorStateList colorStateList) {
        sa4 Q1 = mo11810Q1();
        if (Q1 != null) {
            Q1.mo44263k(colorStateList);
            invalidateSelf();
        }
    }

    @mr2
    /* renamed from: D1 */
    public int[] mo11769D1() {
        return this.f8124a;
    }

    @Deprecated
    /* renamed from: D2 */
    public void mo11770D2(@C2530jn int i) {
        mo11788J2(i);
    }

    /* renamed from: D3 */
    public void mo11771D3(float f) {
        if (this.f8160l != f) {
            this.f8160l = f;
            invalidateSelf();
            mo11872j2();
        }
    }

    @ts2
    /* renamed from: E1 */
    public ColorStateList mo11772E1() {
        return this.f8145f;
    }

    /* renamed from: E2 */
    public void mo11773E2(@dp0 int i) {
        mo11764B2(C3129p8.m24529b(this.f8112a, i));
    }

    /* renamed from: E3 */
    public void mo11774E3(@yk0 int i) {
        mo11771D3(this.f8112a.getResources().getDimension(i));
    }

    /* renamed from: F1 */
    public void mo11775F1(@mr2 RectF rectF) {
        mo11822U0(getBounds(), rectF);
    }

    /* renamed from: F2 */
    public void mo11776F2(float f) {
        if (this.f8144f != f) {
            float R0 = mo11813R0();
            this.f8144f = f;
            float R02 = mo11813R0();
            invalidateSelf();
            if (R0 != R02) {
                mo11872j2();
            }
        }
    }

    /* renamed from: F3 */
    public void mo11777F3(@e54 int i) {
        mo11928y3(this.f8112a.getResources().getString(i));
    }

    /* renamed from: G1 */
    public final float mo11778G1() {
        Drawable drawable = this.f8155i ? this.f8138d : this.f8118a;
        float f = this.f8144f;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil((double) pv4.m61665e(this.f8112a, 24));
            if (((float) drawable.getIntrinsicHeight()) <= f) {
                return (float) drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    /* renamed from: G2 */
    public void mo11779G2(@yk0 int i) {
        mo11776F2(this.f8112a.getResources().getDimension(i));
    }

    /* renamed from: G3 */
    public void mo11780G3(@zk0 float f) {
        sa4 Q1 = mo11810Q1();
        if (Q1 != null) {
            Q1.mo44264l(f);
            this.f8121a.mo47666e().setTextSize(f);
            mo11839a();
        }
    }

    /* renamed from: H1 */
    public final float mo11781H1() {
        Drawable drawable = this.f8155i ? this.f8138d : this.f8118a;
        float f = this.f8144f;
        return (f > 0.0f || drawable == null) ? f : (float) drawable.getIntrinsicWidth();
    }

    /* renamed from: H2 */
    public void mo11782H2(@ts2 ColorStateList colorStateList) {
        this.f8143e = true;
        if (this.f8141e != colorStateList) {
            this.f8141e = colorStateList;
            if (mo11798M3()) {
                wo0.m30986o(this.f8118a, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: H3 */
    public void mo11783H3(float f) {
        if (this.f8158k != f) {
            this.f8158k = f;
            invalidateSelf();
            mo11872j2();
        }
    }

    /* renamed from: I1 */
    public TextUtils.TruncateAt mo11784I1() {
        return this.f8119a;
    }

    /* renamed from: I2 */
    public void mo11785I2(@k10 int i) {
        mo11782H2(C3129p8.m24528a(this.f8112a, i));
    }

    /* renamed from: I3 */
    public void mo11786I3(@yk0 int i) {
        mo11783H3(this.f8112a.getResources().getDimension(i));
    }

    @ts2
    /* renamed from: J1 */
    public nl2 mo11787J1() {
        return this.f8127b;
    }

    /* renamed from: J2 */
    public void mo11788J2(@C2530jn int i) {
        mo11791K2(this.f8112a.getResources().getBoolean(i));
    }

    /* renamed from: J3 */
    public void mo11789J3(boolean z) {
        if (this.f8157j != z) {
            this.f8157j = z;
            mo11808P3();
            onStateChange(getState());
        }
    }

    /* renamed from: K1 */
    public float mo11790K1() {
        return this.f8156j;
    }

    /* renamed from: K2 */
    public void mo11791K2(boolean z) {
        if (this.f8139d != z) {
            boolean M3 = mo11798M3();
            this.f8139d = z;
            boolean M32 = mo11798M3();
            if (M3 != M32) {
                if (M32) {
                    mo11805P0(this.f8118a);
                } else {
                    mo11804O3(this.f8118a);
                }
                invalidateSelf();
                mo11872j2();
            }
        }
    }

    /* renamed from: K3 */
    public boolean mo11792K3() {
        return this.f8159k;
    }

    /* renamed from: L1 */
    public float mo11793L1() {
        return this.f8153i;
    }

    /* renamed from: L2 */
    public void mo11794L2(float f) {
        if (this.f8129c != f) {
            this.f8129c = f;
            invalidateSelf();
            mo11872j2();
        }
    }

    /* renamed from: L3 */
    public final boolean mo11795L3() {
        return this.f8152h && this.f8138d != null && this.f8155i;
    }

    @e83
    /* renamed from: M1 */
    public int mo11796M1() {
        return this.f8173z;
    }

    /* renamed from: M2 */
    public void mo11797M2(@yk0 int i) {
        mo11794L2(this.f8112a.getResources().getDimension(i));
    }

    /* renamed from: M3 */
    public final boolean mo11798M3() {
        return this.f8139d && this.f8118a != null;
    }

    @ts2
    /* renamed from: N1 */
    public ColorStateList mo11799N1() {
        return this.f8135d;
    }

    /* renamed from: N2 */
    public void mo11800N2(float f) {
        if (this.f8150h != f) {
            this.f8150h = f;
            invalidateSelf();
            mo11872j2();
        }
    }

    /* renamed from: N3 */
    public final boolean mo11801N3() {
        return this.f8146f && this.f8126b != null;
    }

    @ts2
    /* renamed from: O1 */
    public nl2 mo11802O1() {
        return this.f8120a;
    }

    /* renamed from: O2 */
    public void mo11803O2(@yk0 int i) {
        mo11800N2(this.f8112a.getResources().getDimension(i));
    }

    /* renamed from: O3 */
    public final void mo11804O3(@ts2 Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    /* renamed from: P0 */
    public final void mo11805P0(@ts2 Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            wo0.m30984m(drawable, wo0.m30977f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f8126b) {
                if (drawable.isStateful()) {
                    drawable.setState(mo11769D1());
                }
                wo0.m30986o(drawable, this.f8145f);
                return;
            }
            Drawable drawable2 = this.f8118a;
            if (drawable == drawable2 && this.f8143e) {
                wo0.m30986o(drawable2, this.f8141e);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    @ts2
    /* renamed from: P1 */
    public CharSequence mo11806P1() {
        return this.f8122a;
    }

    /* renamed from: P2 */
    public void mo11807P2(@ts2 ColorStateList colorStateList) {
        if (this.f8130c != colorStateList) {
            this.f8130c = colorStateList;
            if (this.f8161l) {
                mo31570F0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: P3 */
    public final void mo11808P3() {
        this.f8154i = this.f8157j ? um3.m67327e(this.f8135d) : null;
    }

    /* renamed from: Q0 */
    public final void mo11809Q0(@mr2 Rect rect, @mr2 RectF rectF) {
        rectF.setEmpty();
        if (mo11798M3() || mo11795L3()) {
            float f = this.f8150h + this.f8153i;
            float H1 = mo11781H1();
            if (wo0.m30977f(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + H1;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - H1;
            }
            float G1 = mo11778G1();
            float exactCenterY = rect.exactCenterY() - (G1 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + G1;
        }
    }

    @ts2
    /* renamed from: Q1 */
    public sa4 mo11810Q1() {
        return this.f8121a.mo47665d();
    }

    /* renamed from: Q2 */
    public void mo11811Q2(@k10 int i) {
        mo11807P2(C3129p8.m24528a(this.f8112a, i));
    }

    @TargetApi(21)
    /* renamed from: Q3 */
    public final void mo11812Q3() {
        this.f8133c = new RippleDrawable(um3.m67327e(mo11799N1()), this.f8126b, f8108a);
    }

    /* renamed from: R0 */
    public float mo11813R0() {
        if (mo11798M3() || mo11795L3()) {
            return this.f8153i + mo11781H1() + this.f8156j;
        }
        return 0.0f;
    }

    /* renamed from: R1 */
    public float mo11814R1() {
        return this.f8160l;
    }

    /* renamed from: R2 */
    public void mo11815R2(float f) {
        if (this.f8140e != f) {
            this.f8140e = f;
            this.f8136d.setStrokeWidth(f);
            if (this.f8161l) {
                super.mo31576I0(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: S0 */
    public final void mo11816S0(@mr2 Rect rect, @mr2 RectF rectF) {
        rectF.set(rect);
        if (mo11801N3()) {
            float f = this.f8164o + this.f8163n + this.f8147g + this.f8162m + this.f8160l;
            if (wo0.m30977f(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* renamed from: S1 */
    public float mo11817S1() {
        return this.f8158k;
    }

    /* renamed from: S2 */
    public void mo11818S2(@yk0 int i) {
        mo11815R2(this.f8112a.getResources().getDimension(i));
    }

    /* renamed from: T0 */
    public final void mo11819T0(@mr2 Rect rect, @mr2 RectF rectF) {
        rectF.setEmpty();
        if (mo11801N3()) {
            float f = this.f8164o + this.f8163n;
            if (wo0.m30977f(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f8147g;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f8147g;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f8147g;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    @ts2
    /* renamed from: T1 */
    public final ColorFilter mo11820T1() {
        ColorFilter colorFilter = this.f8114a;
        return colorFilter != null ? colorFilter : this.f8132c;
    }

    /* renamed from: T2 */
    public final void mo11821T2(@ts2 ColorStateList colorStateList) {
        if (this.f8113a != colorStateList) {
            this.f8113a = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: U0 */
    public final void mo11822U0(@mr2 Rect rect, @mr2 RectF rectF) {
        rectF.setEmpty();
        if (mo11801N3()) {
            float f = this.f8164o + this.f8163n + this.f8147g + this.f8162m + this.f8160l;
            if (wo0.m30977f(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: U1 */
    public boolean mo11823U1() {
        return this.f8157j;
    }

    /* renamed from: U2 */
    public void mo11824U2(@ts2 Drawable drawable) {
        Drawable y1 = mo11926y1();
        if (y1 != drawable) {
            float V0 = mo11825V0();
            this.f8126b = drawable != null ? wo0.m30989r(drawable).mutate() : null;
            if (um3.f36190a) {
                mo11812Q3();
            }
            float V02 = mo11825V0();
            mo11804O3(y1);
            if (mo11801N3()) {
                mo11805P0(this.f8126b);
            }
            invalidateSelf();
            if (V0 != V02) {
                mo11872j2();
            }
        }
    }

    /* renamed from: V0 */
    public float mo11825V0() {
        if (mo11801N3()) {
            return this.f8162m + this.f8147g + this.f8163n;
        }
        return 0.0f;
    }

    /* renamed from: V2 */
    public void mo11826V2(@ts2 CharSequence charSequence) {
        if (this.f8128b != charSequence) {
            this.f8128b = C3155pk.m24758c().mo22475m(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: W0 */
    public final void mo11827W0(@mr2 Rect rect, @mr2 RectF rectF) {
        rectF.setEmpty();
        if (this.f8122a != null) {
            float R0 = this.f8150h + mo11813R0() + this.f8158k;
            float V0 = this.f8164o + mo11825V0() + this.f8160l;
            if (wo0.m30977f(this) == 0) {
                rectF.left = ((float) rect.left) + R0;
                rectF.right = ((float) rect.right) - V0;
            } else {
                rectF.left = ((float) rect.left) + V0;
                rectF.right = ((float) rect.right) - R0;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: W1 */
    public boolean mo11828W1() {
        return this.f8149g;
    }

    @Deprecated
    /* renamed from: W2 */
    public void mo11829W2(boolean z) {
        mo11873j3(z);
    }

    /* renamed from: X0 */
    public final float mo11830X0() {
        this.f8121a.mo47666e().getFontMetrics(this.f8115a);
        Paint.FontMetrics fontMetrics = this.f8115a;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    @Deprecated
    /* renamed from: X1 */
    public boolean mo11831X1() {
        return mo11834Y1();
    }

    @Deprecated
    /* renamed from: X2 */
    public void mo11832X2(@C2530jn int i) {
        mo11868i3(i);
    }

    @mr2
    /* renamed from: Y0 */
    public Paint.Align mo11833Y0(@mr2 Rect rect, @mr2 PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f8122a != null) {
            float R0 = this.f8150h + mo11813R0() + this.f8158k;
            if (wo0.m30977f(this) == 0) {
                pointF.x = ((float) rect.left) + R0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - R0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - mo11830X0();
        }
        return align;
    }

    /* renamed from: Y1 */
    public boolean mo11834Y1() {
        return this.f8152h;
    }

    /* renamed from: Y2 */
    public void mo11835Y2(float f) {
        if (this.f8163n != f) {
            this.f8163n = f;
            invalidateSelf();
            if (mo11801N3()) {
                mo11872j2();
            }
        }
    }

    /* renamed from: Z0 */
    public final boolean mo11836Z0() {
        return this.f8152h && this.f8138d != null && this.f8149g;
    }

    @Deprecated
    /* renamed from: Z1 */
    public boolean mo11837Z1() {
        return mo11840a2();
    }

    /* renamed from: Z2 */
    public void mo11838Z2(@yk0 int i) {
        mo11835Y2(this.f8112a.getResources().getDimension(i));
    }

    /* renamed from: a */
    public void mo11839a() {
        mo11872j2();
        invalidateSelf();
    }

    /* renamed from: a2 */
    public boolean mo11840a2() {
        return this.f8139d;
    }

    /* renamed from: a3 */
    public void mo11841a3(@dp0 int i) {
        mo11824U2(C3129p8.m24529b(this.f8112a, i));
    }

    @Deprecated
    /* renamed from: b2 */
    public boolean mo11842b2() {
        return mo11848d2();
    }

    /* renamed from: b3 */
    public void mo11843b3(float f) {
        if (this.f8147g != f) {
            this.f8147g = f;
            invalidateSelf();
            if (mo11801N3()) {
                mo11872j2();
            }
        }
    }

    /* renamed from: c1 */
    public final void mo11844c1(@mr2 Canvas canvas, @mr2 Rect rect) {
        if (mo11795L3()) {
            mo11809Q0(rect, this.f8137d);
            RectF rectF = this.f8137d;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f8138d.setBounds(0, 0, (int) this.f8137d.width(), (int) this.f8137d.height());
            this.f8138d.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: c2 */
    public boolean mo11845c2() {
        return m9868g2(this.f8126b);
    }

    /* renamed from: c3 */
    public void mo11846c3(@yk0 int i) {
        mo11843b3(this.f8112a.getResources().getDimension(i));
    }

    /* renamed from: d1 */
    public final void mo11847d1(@mr2 Canvas canvas, @mr2 Rect rect) {
        if (!this.f8161l) {
            this.f8136d.setColor(this.f8166s);
            this.f8136d.setStyle(Paint.Style.FILL);
            this.f8136d.setColorFilter(mo11820T1());
            this.f8137d.set(rect);
            canvas.drawRoundRect(this.f8137d, mo11886o1(), mo11886o1(), this.f8136d);
        }
    }

    /* renamed from: d2 */
    public boolean mo11848d2() {
        return this.f8146f;
    }

    /* renamed from: d3 */
    public void mo11849d3(float f) {
        if (this.f8162m != f) {
            this.f8162m = f;
            invalidateSelf();
            if (mo11801N3()) {
                mo11872j2();
            }
        }
    }

    public void draw(@mr2 Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.f8172y;
            if (i2 < 255) {
                i = C3745uu.m29589a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            mo11856g1(canvas, bounds);
            mo11847d1(canvas, bounds);
            if (this.f8161l) {
                super.draw(canvas);
            }
            mo11854f1(canvas, bounds);
            mo11866i1(canvas, bounds);
            mo11851e1(canvas, bounds);
            mo11844c1(canvas, bounds);
            if (this.f8159k) {
                mo11874k1(canvas, bounds);
            }
            mo11864h1(canvas, bounds);
            mo11871j1(canvas, bounds);
            if (this.f8172y < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e1 */
    public final void mo11851e1(@mr2 Canvas canvas, @mr2 Rect rect) {
        if (mo11798M3()) {
            mo11809Q0(rect, this.f8137d);
            RectF rectF = this.f8137d;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f8118a.setBounds(0, 0, (int) this.f8137d.width(), (int) this.f8137d.height());
            this.f8118a.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: e2 */
    public boolean mo11852e2() {
        return this.f8161l;
    }

    /* renamed from: e3 */
    public void mo11853e3(@yk0 int i) {
        mo11849d3(this.f8112a.getResources().getDimension(i));
    }

    /* renamed from: f1 */
    public final void mo11854f1(@mr2 Canvas canvas, @mr2 Rect rect) {
        if (this.f8140e > 0.0f && !this.f8161l) {
            this.f8136d.setColor(this.f8168u);
            this.f8136d.setStyle(Paint.Style.STROKE);
            if (!this.f8161l) {
                this.f8136d.setColorFilter(mo11820T1());
            }
            RectF rectF = this.f8137d;
            float f = this.f8140e;
            rectF.set(((float) rect.left) + (f / 2.0f), ((float) rect.top) + (f / 2.0f), ((float) rect.right) - (f / 2.0f), ((float) rect.bottom) - (f / 2.0f));
            float f2 = this.f8134d - (this.f8140e / 2.0f);
            canvas.drawRoundRect(this.f8137d, f2, f2, this.f8136d);
        }
    }

    /* renamed from: f3 */
    public boolean mo11855f3(@mr2 int[] iArr) {
        if (Arrays.equals(this.f8124a, iArr)) {
            return false;
        }
        this.f8124a = iArr;
        if (mo11801N3()) {
            return mo11875k2(getState(), iArr);
        }
        return false;
    }

    /* renamed from: g1 */
    public final void mo11856g1(@mr2 Canvas canvas, @mr2 Rect rect) {
        if (!this.f8161l) {
            this.f8136d.setColor(this.f8165r);
            this.f8136d.setStyle(Paint.Style.FILL);
            this.f8137d.set(rect);
            canvas.drawRoundRect(this.f8137d, mo11886o1(), mo11886o1(), this.f8136d);
        }
    }

    /* renamed from: g3 */
    public void mo11857g3(@ts2 ColorStateList colorStateList) {
        if (this.f8145f != colorStateList) {
            this.f8145f = colorStateList;
            if (mo11801N3()) {
                wo0.m30986o(this.f8126b, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public int getAlpha() {
        return this.f8172y;
    }

    @ts2
    public ColorFilter getColorFilter() {
        return this.f8114a;
    }

    public int getIntrinsicHeight() {
        return (int) this.f8129c;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f8150h + mo11813R0() + this.f8158k + this.f8121a.mo47667f(mo11806P1().toString()) + this.f8160l + mo11825V0() + this.f8164o), this.f8173z);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(@mr2 Outline outline) {
        if (this.f8161l) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f8134d);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f8134d);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* renamed from: h1 */
    public final void mo11864h1(@mr2 Canvas canvas, @mr2 Rect rect) {
        Drawable drawable;
        if (mo11801N3()) {
            mo11819T0(rect, this.f8137d);
            RectF rectF = this.f8137d;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f8126b.setBounds(0, 0, (int) this.f8137d.width(), (int) this.f8137d.height());
            if (um3.f36190a) {
                this.f8133c.setBounds(this.f8126b.getBounds());
                this.f8133c.jumpToCurrentState();
                drawable = this.f8133c;
            } else {
                drawable = this.f8126b;
            }
            drawable.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: h3 */
    public void mo11865h3(@k10 int i) {
        mo11857g3(C3129p8.m24528a(this.f8112a, i));
    }

    /* renamed from: i1 */
    public final void mo11866i1(@mr2 Canvas canvas, @mr2 Rect rect) {
        this.f8136d.setColor(this.f8169v);
        this.f8136d.setStyle(Paint.Style.FILL);
        this.f8137d.set(rect);
        if (!this.f8161l) {
            canvas.drawRoundRect(this.f8137d, mo11886o1(), mo11886o1(), this.f8136d);
            return;
        }
        mo31612h(new RectF(rect), this.f8131c);
        super.mo31630q(canvas, this.f8136d, this.f8131c, mo31640v());
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0181  */
    /* renamed from: i2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11867i2(@com.onedelhi.secure.ts2 android.util.AttributeSet r8, @com.onedelhi.secure.C3982yb int r9, @com.onedelhi.secure.e64 int r10) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f8112a
            int[] r2 = com.onedelhi.secure.fd3.C2165o.Chip
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r8
            r3 = r9
            r4 = r10
            android.content.res.TypedArray r9 = com.onedelhi.secure.ob4.m59195k(r0, r1, r2, r3, r4, r5)
            int r10 = com.onedelhi.secure.fd3.C2165o.Chip_shapeAppearance
            boolean r10 = r9.hasValue(r10)
            r7.f8161l = r10
            android.content.Context r10 = r7.f8112a
            int r0 = com.onedelhi.secure.fd3.C2165o.Chip_chipSurfaceColor
            android.content.res.ColorStateList r10 = com.onedelhi.secure.af2.m38610a(r10, r9, r0)
            r7.mo11821T2(r10)
            android.content.Context r10 = r7.f8112a
            int r0 = com.onedelhi.secure.fd3.C2165o.Chip_chipBackgroundColor
            android.content.res.ColorStateList r10 = com.onedelhi.secure.af2.m38610a(r10, r9, r0)
            r7.mo11918v2(r10)
            int r10 = com.onedelhi.secure.fd3.C2165o.Chip_chipMinHeight
            r0 = 0
            float r10 = r9.getDimension(r10, r0)
            r7.mo11794L2(r10)
            int r10 = com.onedelhi.secure.fd3.C2165o.Chip_chipCornerRadius
            boolean r1 = r9.hasValue(r10)
            if (r1 == 0) goto L_0x0045
            float r10 = r9.getDimension(r10, r0)
            r7.mo11924x2(r10)
        L_0x0045:
            android.content.Context r10 = r7.f8112a
            int r1 = com.onedelhi.secure.fd3.C2165o.Chip_chipStrokeColor
            android.content.res.ColorStateList r10 = com.onedelhi.secure.af2.m38610a(r10, r9, r1)
            r7.mo11807P2(r10)
            int r10 = com.onedelhi.secure.fd3.C2165o.Chip_chipStrokeWidth
            float r10 = r9.getDimension(r10, r0)
            r7.mo11815R2(r10)
            android.content.Context r10 = r7.f8112a
            int r1 = com.onedelhi.secure.fd3.C2165o.Chip_rippleColor
            android.content.res.ColorStateList r10 = com.onedelhi.secure.af2.m38610a(r10, r9, r1)
            r7.mo11912t3(r10)
            int r10 = com.onedelhi.secure.fd3.C2165o.Chip_android_text
            java.lang.CharSequence r10 = r9.getText(r10)
            r7.mo11928y3(r10)
            android.content.Context r10 = r7.f8112a
            int r1 = com.onedelhi.secure.fd3.C2165o.Chip_android_textAppearance
            com.onedelhi.secure.sa4 r10 = com.onedelhi.secure.af2.m38616g(r10, r9, r1)
            int r1 = com.onedelhi.secure.fd3.C2165o.Chip_android_textSize
            float r2 = r10.mo44262j()
            float r1 = r9.getDimension(r1, r2)
            r10.mo44264l(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 >= r2) goto L_0x0093
            android.content.Context r1 = r7.f8112a
            int r2 = com.onedelhi.secure.fd3.C2165o.Chip_android_textColor
            android.content.res.ColorStateList r1 = com.onedelhi.secure.af2.m38610a(r1, r9, r2)
            r10.mo44263k(r1)
        L_0x0093:
            r7.mo11931z3(r10)
            int r10 = com.onedelhi.secure.fd3.C2165o.Chip_android_ellipsize
            int r10 = r9.getInt(r10, r6)
            r1 = 1
            if (r10 == r1) goto L_0x00ac
            r1 = 2
            if (r10 == r1) goto L_0x00a9
            r1 = 3
            if (r10 == r1) goto L_0x00a6
            goto L_0x00b1
        L_0x00a6:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END
            goto L_0x00ae
        L_0x00a9:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x00ae
        L_0x00ac:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.START
        L_0x00ae:
            r7.mo11879l3(r10)
        L_0x00b1:
            int r10 = com.onedelhi.secure.fd3.C2165o.Chip_chipIconVisible
            boolean r10 = r9.getBoolean(r10, r6)
            r7.mo11791K2(r10)
            java.lang.String r10 = "http://schemas.android.com/apk/res-auto"
            if (r8 == 0) goto L_0x00d7
            java.lang.String r1 = "chipIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x00d7
            java.lang.String r1 = "chipIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto L_0x00d7
            int r1 = com.onedelhi.secure.fd3.C2165o.Chip_chipIconEnabled
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo11791K2(r1)
        L_0x00d7:
            android.content.Context r1 = r7.f8112a
            int r2 = com.onedelhi.secure.fd3.C2165o.Chip_chipIcon
            android.graphics.drawable.Drawable r1 = com.onedelhi.secure.af2.m38614e(r1, r9, r2)
            r7.mo11764B2(r1)
            int r1 = com.onedelhi.secure.fd3.C2165o.Chip_chipIconTint
            boolean r2 = r9.hasValue(r1)
            if (r2 == 0) goto L_0x00f3
            android.content.Context r2 = r7.f8112a
            android.content.res.ColorStateList r1 = com.onedelhi.secure.af2.m38610a(r2, r9, r1)
            r7.mo11782H2(r1)
        L_0x00f3:
            int r1 = com.onedelhi.secure.fd3.C2165o.Chip_chipIconSize
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r9.getDimension(r1, r2)
            r7.mo11776F2(r1)
            int r1 = com.onedelhi.secure.fd3.C2165o.Chip_closeIconVisible
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo11873j3(r1)
            if (r8 == 0) goto L_0x0122
            java.lang.String r1 = "closeIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x0122
            java.lang.String r1 = "closeIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto L_0x0122
            int r1 = com.onedelhi.secure.fd3.C2165o.Chip_closeIconEnabled
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo11873j3(r1)
        L_0x0122:
            android.content.Context r1 = r7.f8112a
            int r2 = com.onedelhi.secure.fd3.C2165o.Chip_closeIcon
            android.graphics.drawable.Drawable r1 = com.onedelhi.secure.af2.m38614e(r1, r9, r2)
            r7.mo11824U2(r1)
            android.content.Context r1 = r7.f8112a
            int r2 = com.onedelhi.secure.fd3.C2165o.Chip_closeIconTint
            android.content.res.ColorStateList r1 = com.onedelhi.secure.af2.m38610a(r1, r9, r2)
            r7.mo11857g3(r1)
            int r1 = com.onedelhi.secure.fd3.C2165o.Chip_closeIconSize
            float r1 = r9.getDimension(r1, r0)
            r7.mo11843b3(r1)
            int r1 = com.onedelhi.secure.fd3.C2165o.Chip_android_checkable
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo11878l2(r1)
            int r1 = com.onedelhi.secure.fd3.C2165o.Chip_checkedIconVisible
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo11914u2(r1)
            if (r8 == 0) goto L_0x016e
            java.lang.String r1 = "checkedIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x016e
            java.lang.String r1 = "checkedIconVisible"
            java.lang.String r8 = r8.getAttributeValue(r10, r1)
            if (r8 != 0) goto L_0x016e
            int r8 = com.onedelhi.secure.fd3.C2165o.Chip_checkedIconEnabled
            boolean r8 = r9.getBoolean(r8, r6)
            r7.mo11914u2(r8)
        L_0x016e:
            android.content.Context r8 = r7.f8112a
            int r10 = com.onedelhi.secure.fd3.C2165o.Chip_checkedIcon
            android.graphics.drawable.Drawable r8 = com.onedelhi.secure.af2.m38614e(r8, r9, r10)
            r7.mo11884n2(r8)
            int r8 = com.onedelhi.secure.fd3.C2165o.Chip_checkedIconTint
            boolean r10 = r9.hasValue(r8)
            if (r10 == 0) goto L_0x018a
            android.content.Context r10 = r7.f8112a
            android.content.res.ColorStateList r8 = com.onedelhi.secure.af2.m38610a(r10, r9, r8)
            r7.mo11899r2(r8)
        L_0x018a:
            android.content.Context r8 = r7.f8112a
            int r10 = com.onedelhi.secure.fd3.C2165o.Chip_showMotionSpec
            com.onedelhi.secure.nl2 r8 = com.onedelhi.secure.nl2.m22934c(r8, r9, r10)
            r7.mo11922w3(r8)
            android.content.Context r8 = r7.f8112a
            int r10 = com.onedelhi.secure.fd3.C2165o.Chip_hideMotionSpec
            com.onedelhi.secure.nl2 r8 = com.onedelhi.secure.nl2.m22934c(r8, r9, r10)
            r7.mo11882m3(r8)
            int r8 = com.onedelhi.secure.fd3.C2165o.Chip_chipStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo11800N2(r8)
            int r8 = com.onedelhi.secure.fd3.C2165o.Chip_iconStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo11897q3(r8)
            int r8 = com.onedelhi.secure.fd3.C2165o.Chip_iconEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo11888o3(r8)
            int r8 = com.onedelhi.secure.fd3.C2165o.Chip_textStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo11783H3(r8)
            int r8 = com.onedelhi.secure.fd3.C2165o.Chip_textEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo11771D3(r8)
            int r8 = com.onedelhi.secure.fd3.C2165o.Chip_closeIconStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo11849d3(r8)
            int r8 = com.onedelhi.secure.fd3.C2165o.Chip_closeIconEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo11835Y2(r8)
            int r8 = com.onedelhi.secure.fd3.C2165o.Chip_chipEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo11930z2(r8)
            int r8 = com.onedelhi.secure.fd3.C2165o.Chip_android_maxWidth
            r10 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r9.getDimensionPixelSize(r8, r10)
            r7.mo11903s3(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C1549a.mo11867i2(android.util.AttributeSet, int, int):void");
    }

    /* renamed from: i3 */
    public void mo11868i3(@C2530jn int i) {
        mo11873j3(this.f8112a.getResources().getBoolean(i));
    }

    public void invalidateDrawable(@mr2 Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return m9867f2(this.f8113a) || m9867f2(this.f8125b) || m9867f2(this.f8130c) || (this.f8157j && m9867f2(this.f8154i)) || m9869h2(this.f8121a.mo47665d()) || mo11836Z0() || m9868g2(this.f8118a) || m9868g2(this.f8138d) || m9867f2(this.f8151h);
    }

    /* renamed from: j1 */
    public final void mo11871j1(@mr2 Canvas canvas, @mr2 Rect rect) {
        Paint paint = this.f8142e;
        if (paint != null) {
            paint.setColor(p10.m24299B(-16777216, 127));
            canvas.drawRect(rect, this.f8142e);
            if (mo11798M3() || mo11795L3()) {
                mo11809Q0(rect, this.f8137d);
                canvas.drawRect(this.f8137d, this.f8142e);
            }
            if (this.f8122a != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f8142e);
            }
            if (mo11801N3()) {
                mo11819T0(rect, this.f8137d);
                canvas.drawRect(this.f8137d, this.f8142e);
            }
            this.f8142e.setColor(p10.m24299B(g74.f12468c, 127));
            mo11816S0(rect, this.f8137d);
            canvas.drawRect(this.f8137d, this.f8142e);
            this.f8142e.setColor(p10.m24299B(-16711936, 127));
            mo11822U0(rect, this.f8137d);
            canvas.drawRect(this.f8137d, this.f8142e);
        }
    }

    /* renamed from: j2 */
    public void mo11872j2() {
        C1550a aVar = (C1550a) this.f8123a.get();
        if (aVar != null) {
            aVar.mo11558a();
        }
    }

    /* renamed from: j3 */
    public void mo11873j3(boolean z) {
        if (this.f8146f != z) {
            boolean N3 = mo11801N3();
            this.f8146f = z;
            boolean N32 = mo11801N3();
            if (N3 != N32) {
                if (N32) {
                    mo11805P0(this.f8126b);
                } else {
                    mo11804O3(this.f8126b);
                }
                invalidateSelf();
                mo11872j2();
            }
        }
    }

    /* renamed from: k1 */
    public final void mo11874k1(@mr2 Canvas canvas, @mr2 Rect rect) {
        if (this.f8122a != null) {
            Paint.Align Y0 = mo11833Y0(rect, this.f8116a);
            mo11827W0(rect, this.f8137d);
            if (this.f8121a.mo47665d() != null) {
                this.f8121a.mo47666e().drawableState = getState();
                this.f8121a.mo47672k(this.f8112a);
            }
            this.f8121a.mo47666e().setTextAlign(Y0);
            int i = 0;
            boolean z = Math.round(this.f8121a.mo47667f(mo11806P1().toString())) > Math.round(this.f8137d.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f8137d);
            }
            CharSequence charSequence = this.f8122a;
            if (z && this.f8119a != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f8121a.mo47666e(), this.f8137d.width(), this.f8119a);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f8116a;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f8121a.mo47666e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0156  */
    /* renamed from: k2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11875k2(@com.onedelhi.secure.mr2 int[] r7, @com.onedelhi.secure.mr2 int[] r8) {
        /*
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.f8113a
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r6.f8165r
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r1 = r6.mo31620l(r1)
            int r3 = r6.f8165r
            r4 = 1
            if (r3 == r1) goto L_0x001d
            r6.f8165r = r1
            r0 = 1
        L_0x001d:
            android.content.res.ColorStateList r3 = r6.f8125b
            if (r3 == 0) goto L_0x0028
            int r5 = r6.f8166s
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            int r3 = r6.mo31620l(r3)
            int r5 = r6.f8166s
            if (r5 == r3) goto L_0x0034
            r6.f8166s = r3
            r0 = 1
        L_0x0034:
            int r1 = com.onedelhi.secure.oe2.m23727m(r1, r3)
            int r3 = r6.f8167t
            if (r3 == r1) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            android.content.res.ColorStateList r5 = r6.mo31646y()
            if (r5 != 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x0055
            r6.f8167t = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r6.mo31626o0(r0)
            r0 = 1
        L_0x0055:
            android.content.res.ColorStateList r1 = r6.f8130c
            if (r1 == 0) goto L_0x0060
            int r3 = r6.f8168u
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            int r3 = r6.f8168u
            if (r3 == r1) goto L_0x0068
            r6.f8168u = r1
            r0 = 1
        L_0x0068:
            android.content.res.ColorStateList r1 = r6.f8154i
            if (r1 == 0) goto L_0x007b
            boolean r1 = com.onedelhi.secure.um3.m67328f(r7)
            if (r1 == 0) goto L_0x007b
            android.content.res.ColorStateList r1 = r6.f8154i
            int r3 = r6.f8169v
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            int r3 = r6.f8169v
            if (r3 == r1) goto L_0x0087
            r6.f8169v = r1
            boolean r1 = r6.f8157j
            if (r1 == 0) goto L_0x0087
            r0 = 1
        L_0x0087:
            com.onedelhi.secure.ya4 r1 = r6.f8121a
            com.onedelhi.secure.sa4 r1 = r1.mo47665d()
            if (r1 == 0) goto L_0x00ac
            com.onedelhi.secure.ya4 r1 = r6.f8121a
            com.onedelhi.secure.sa4 r1 = r1.mo47665d()
            android.content.res.ColorStateList r1 = r1.mo44261i()
            if (r1 == 0) goto L_0x00ac
            com.onedelhi.secure.ya4 r1 = r6.f8121a
            com.onedelhi.secure.sa4 r1 = r1.mo47665d()
            android.content.res.ColorStateList r1 = r1.mo44261i()
            int r3 = r6.f8170w
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x00ad
        L_0x00ac:
            r1 = 0
        L_0x00ad:
            int r3 = r6.f8170w
            if (r3 == r1) goto L_0x00b4
            r6.f8170w = r1
            r0 = 1
        L_0x00b4:
            int[] r1 = r6.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = m9864V1(r1, r3)
            if (r1 == 0) goto L_0x00c7
            boolean r1 = r6.f8149g
            if (r1 == 0) goto L_0x00c7
            r1 = 1
            goto L_0x00c8
        L_0x00c7:
            r1 = 0
        L_0x00c8:
            boolean r3 = r6.f8155i
            if (r3 == r1) goto L_0x00e2
            android.graphics.drawable.Drawable r3 = r6.f8138d
            if (r3 == 0) goto L_0x00e2
            float r0 = r6.mo11813R0()
            r6.f8155i = r1
            float r1 = r6.mo11813R0()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00e1
            r0 = 1
            r1 = 1
            goto L_0x00e3
        L_0x00e1:
            r0 = 1
        L_0x00e2:
            r1 = 0
        L_0x00e3:
            android.content.res.ColorStateList r3 = r6.f8151h
            if (r3 == 0) goto L_0x00ee
            int r5 = r6.f8171x
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x00ef
        L_0x00ee:
            r3 = 0
        L_0x00ef:
            int r5 = r6.f8171x
            if (r5 == r3) goto L_0x0100
            r6.f8171x = r3
            android.content.res.ColorStateList r0 = r6.f8151h
            android.graphics.PorterDuff$Mode r3 = r6.f8117a
            android.graphics.PorterDuffColorFilter r0 = com.onedelhi.secure.kp0.m19975j(r6, r0, r3)
            r6.f8132c = r0
            goto L_0x0101
        L_0x0100:
            r4 = r0
        L_0x0101:
            android.graphics.drawable.Drawable r0 = r6.f8118a
            boolean r0 = m9868g2(r0)
            if (r0 == 0) goto L_0x0110
            android.graphics.drawable.Drawable r0 = r6.f8118a
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0110:
            android.graphics.drawable.Drawable r0 = r6.f8138d
            boolean r0 = m9868g2(r0)
            if (r0 == 0) goto L_0x011f
            android.graphics.drawable.Drawable r0 = r6.f8138d
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x011f:
            android.graphics.drawable.Drawable r0 = r6.f8126b
            boolean r0 = m9868g2(r0)
            if (r0 == 0) goto L_0x013c
            int r0 = r7.length
            int r3 = r8.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r2, r3)
            int r7 = r7.length
            int r3 = r8.length
            java.lang.System.arraycopy(r8, r2, r0, r7, r3)
            android.graphics.drawable.Drawable r7 = r6.f8126b
            boolean r7 = r7.setState(r0)
            r4 = r4 | r7
        L_0x013c:
            boolean r7 = com.onedelhi.secure.um3.f36190a
            if (r7 == 0) goto L_0x014f
            android.graphics.drawable.Drawable r7 = r6.f8133c
            boolean r7 = m9868g2(r7)
            if (r7 == 0) goto L_0x014f
            android.graphics.drawable.Drawable r7 = r6.f8133c
            boolean r7 = r7.setState(r8)
            r4 = r4 | r7
        L_0x014f:
            if (r4 == 0) goto L_0x0154
            r6.invalidateSelf()
        L_0x0154:
            if (r1 == 0) goto L_0x0159
            r6.mo11872j2()
        L_0x0159:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C1549a.mo11875k2(int[], int[]):boolean");
    }

    /* renamed from: k3 */
    public void mo11876k3(@ts2 C1550a aVar) {
        this.f8123a = new WeakReference<>(aVar);
    }

    @ts2
    /* renamed from: l1 */
    public Drawable mo11877l1() {
        return this.f8138d;
    }

    /* renamed from: l2 */
    public void mo11878l2(boolean z) {
        if (this.f8149g != z) {
            this.f8149g = z;
            float R0 = mo11813R0();
            if (!z && this.f8155i) {
                this.f8155i = false;
            }
            float R02 = mo11813R0();
            invalidateSelf();
            if (R0 != R02) {
                mo11872j2();
            }
        }
    }

    /* renamed from: l3 */
    public void mo11879l3(@ts2 TextUtils.TruncateAt truncateAt) {
        this.f8119a = truncateAt;
    }

    @ts2
    /* renamed from: m1 */
    public ColorStateList mo11880m1() {
        return this.f8148g;
    }

    /* renamed from: m2 */
    public void mo11881m2(@C2530jn int i) {
        mo11878l2(this.f8112a.getResources().getBoolean(i));
    }

    /* renamed from: m3 */
    public void mo11882m3(@ts2 nl2 nl2) {
        this.f8127b = nl2;
    }

    @ts2
    /* renamed from: n1 */
    public ColorStateList mo11883n1() {
        return this.f8125b;
    }

    /* renamed from: n2 */
    public void mo11884n2(@ts2 Drawable drawable) {
        if (this.f8138d != drawable) {
            float R0 = mo11813R0();
            this.f8138d = drawable;
            float R02 = mo11813R0();
            mo11804O3(this.f8138d);
            mo11805P0(this.f8138d);
            invalidateSelf();
            if (R0 != R02) {
                mo11872j2();
            }
        }
    }

    /* renamed from: n3 */
    public void mo11885n3(@C2402i7 int i) {
        mo11882m3(nl2.m22935d(this.f8112a, i));
    }

    /* renamed from: o1 */
    public float mo11886o1() {
        return this.f8161l ? mo31592S() : this.f8134d;
    }

    @Deprecated
    /* renamed from: o2 */
    public void mo11887o2(boolean z) {
        mo11914u2(z);
    }

    /* renamed from: o3 */
    public void mo11888o3(float f) {
        if (this.f8156j != f) {
            float R0 = mo11813R0();
            this.f8156j = f;
            float R02 = mo11813R0();
            invalidateSelf();
            if (R0 != R02) {
                mo11872j2();
            }
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (mo11798M3()) {
            onLayoutDirectionChanged |= wo0.m30984m(this.f8118a, i);
        }
        if (mo11795L3()) {
            onLayoutDirectionChanged |= wo0.m30984m(this.f8138d, i);
        }
        if (mo11801N3()) {
            onLayoutDirectionChanged |= wo0.m30984m(this.f8126b, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (mo11798M3()) {
            onLevelChange |= this.f8118a.setLevel(i);
        }
        if (mo11795L3()) {
            onLevelChange |= this.f8138d.setLevel(i);
        }
        if (mo11801N3()) {
            onLevelChange |= this.f8126b.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(@mr2 int[] iArr) {
        if (this.f8161l) {
            super.onStateChange(iArr);
        }
        return mo11875k2(iArr, mo11769D1());
    }

    /* renamed from: p1 */
    public float mo11892p1() {
        return this.f8164o;
    }

    @Deprecated
    /* renamed from: p2 */
    public void mo11893p2(@C2530jn int i) {
        mo11914u2(this.f8112a.getResources().getBoolean(i));
    }

    /* renamed from: p3 */
    public void mo11894p3(@yk0 int i) {
        mo11888o3(this.f8112a.getResources().getDimension(i));
    }

    @ts2
    /* renamed from: q1 */
    public Drawable mo11895q1() {
        Drawable drawable = this.f8118a;
        if (drawable != null) {
            return wo0.m30988q(drawable);
        }
        return null;
    }

    /* renamed from: q2 */
    public void mo11896q2(@dp0 int i) {
        mo11884n2(C3129p8.m24529b(this.f8112a, i));
    }

    /* renamed from: q3 */
    public void mo11897q3(float f) {
        if (this.f8153i != f) {
            float R0 = mo11813R0();
            this.f8153i = f;
            float R02 = mo11813R0();
            invalidateSelf();
            if (R0 != R02) {
                mo11872j2();
            }
        }
    }

    /* renamed from: r1 */
    public float mo11898r1() {
        return this.f8144f;
    }

    /* renamed from: r2 */
    public void mo11899r2(@ts2 ColorStateList colorStateList) {
        if (this.f8148g != colorStateList) {
            this.f8148g = colorStateList;
            if (mo11836Z0()) {
                wo0.m30986o(this.f8138d, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: r3 */
    public void mo11900r3(@yk0 int i) {
        mo11897q3(this.f8112a.getResources().getDimension(i));
    }

    @ts2
    /* renamed from: s1 */
    public ColorStateList mo11901s1() {
        return this.f8141e;
    }

    /* renamed from: s2 */
    public void mo11902s2(@k10 int i) {
        mo11899r2(C3129p8.m24528a(this.f8112a, i));
    }

    /* renamed from: s3 */
    public void mo11903s3(@e83 int i) {
        this.f8173z = i;
    }

    public void scheduleDrawable(@mr2 Drawable drawable, @mr2 Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f8172y != i) {
            this.f8172y = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(@ts2 ColorFilter colorFilter) {
        if (this.f8114a != colorFilter) {
            this.f8114a = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(@ts2 ColorStateList colorStateList) {
        if (this.f8151h != colorStateList) {
            this.f8151h = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(@mr2 PorterDuff.Mode mode) {
        if (this.f8117a != mode) {
            this.f8117a = mode;
            this.f8132c = kp0.m19975j(this, this.f8151h, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (mo11798M3()) {
            visible |= this.f8118a.setVisible(z, z2);
        }
        if (mo11795L3()) {
            visible |= this.f8138d.setVisible(z, z2);
        }
        if (mo11801N3()) {
            visible |= this.f8126b.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t1 */
    public float mo11910t1() {
        return this.f8129c;
    }

    /* renamed from: t2 */
    public void mo11911t2(@C2530jn int i) {
        mo11914u2(this.f8112a.getResources().getBoolean(i));
    }

    /* renamed from: t3 */
    public void mo11912t3(@ts2 ColorStateList colorStateList) {
        if (this.f8135d != colorStateList) {
            this.f8135d = colorStateList;
            mo11808P3();
            onStateChange(getState());
        }
    }

    /* renamed from: u1 */
    public float mo11913u1() {
        return this.f8150h;
    }

    /* renamed from: u2 */
    public void mo11914u2(boolean z) {
        if (this.f8152h != z) {
            boolean L3 = mo11795L3();
            this.f8152h = z;
            boolean L32 = mo11795L3();
            if (L3 != L32) {
                if (L32) {
                    mo11805P0(this.f8138d);
                } else {
                    mo11804O3(this.f8138d);
                }
                invalidateSelf();
                mo11872j2();
            }
        }
    }

    /* renamed from: u3 */
    public void mo11915u3(@k10 int i) {
        mo11912t3(C3129p8.m24528a(this.f8112a, i));
    }

    public void unscheduleDrawable(@mr2 Drawable drawable, @mr2 Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @ts2
    /* renamed from: v1 */
    public ColorStateList mo11917v1() {
        return this.f8130c;
    }

    /* renamed from: v2 */
    public void mo11918v2(@ts2 ColorStateList colorStateList) {
        if (this.f8125b != colorStateList) {
            this.f8125b = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: v3 */
    public void mo11919v3(boolean z) {
        this.f8159k = z;
    }

    /* renamed from: w1 */
    public float mo11920w1() {
        return this.f8140e;
    }

    /* renamed from: w2 */
    public void mo11921w2(@k10 int i) {
        mo11918v2(C3129p8.m24528a(this.f8112a, i));
    }

    /* renamed from: w3 */
    public void mo11922w3(@ts2 nl2 nl2) {
        this.f8120a = nl2;
    }

    /* renamed from: x1 */
    public void mo11923x1(@mr2 RectF rectF) {
        mo11816S0(getBounds(), rectF);
    }

    @Deprecated
    /* renamed from: x2 */
    public void mo11924x2(float f) {
        if (this.f8134d != f) {
            this.f8134d = f;
            setShapeAppearanceModel(getShapeAppearanceModel().mo45825w(f));
        }
    }

    /* renamed from: x3 */
    public void mo11925x3(@C2402i7 int i) {
        mo11922w3(nl2.m22935d(this.f8112a, i));
    }

    @ts2
    /* renamed from: y1 */
    public Drawable mo11926y1() {
        Drawable drawable = this.f8126b;
        if (drawable != null) {
            return wo0.m30988q(drawable);
        }
        return null;
    }

    @Deprecated
    /* renamed from: y2 */
    public void mo11927y2(@yk0 int i) {
        mo11924x2(this.f8112a.getResources().getDimension(i));
    }

    /* renamed from: y3 */
    public void mo11928y3(@ts2 CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f8122a, charSequence)) {
            this.f8122a = charSequence;
            this.f8121a.mo47671j(true);
            invalidateSelf();
            mo11872j2();
        }
    }

    @ts2
    /* renamed from: z1 */
    public CharSequence mo11929z1() {
        return this.f8128b;
    }

    /* renamed from: z2 */
    public void mo11930z2(float f) {
        if (this.f8164o != f) {
            this.f8164o = f;
            invalidateSelf();
            mo11872j2();
        }
    }

    /* renamed from: z3 */
    public void mo11931z3(@ts2 sa4 sa4) {
        this.f8121a.mo47670i(sa4, this.f8112a);
    }
}
