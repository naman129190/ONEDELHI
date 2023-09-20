package com.onedelhi.secure;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.ya4;
import easypay.appinvoke.manager.Constants;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class sf4 extends bf2 implements ya4.C7322b {
    @e64

    /* renamed from: x */
    public static final int f35026x = fd3.C2164n.Widget_MaterialComponents_Tooltip;
    @C3982yb

    /* renamed from: y */
    public static final int f35027y = fd3.C2153c.tooltipStyle;
    @mr2

    /* renamed from: a */
    public final Context f35028a;
    @ts2

    /* renamed from: a */
    public final Paint.FontMetrics f35029a = new Paint.FontMetrics();
    @mr2

    /* renamed from: a */
    public final Rect f35030a;
    @mr2

    /* renamed from: a */
    public final View.OnLayoutChangeListener f35031a;
    @mr2

    /* renamed from: a */
    public final ya4 f35032a;
    @ts2

    /* renamed from: a */
    public CharSequence f35033a;

    /* renamed from: c */
    public float f35034c;

    /* renamed from: d */
    public float f35035d;

    /* renamed from: e */
    public final float f35036e;

    /* renamed from: f */
    public float f35037f;

    /* renamed from: g */
    public float f35038g;

    /* renamed from: r */
    public int f35039r;

    /* renamed from: s */
    public int f35040s;

    /* renamed from: t */
    public int f35041t;

    /* renamed from: u */
    public int f35042u;

    /* renamed from: v */
    public int f35043v;

    /* renamed from: w */
    public int f35044w;

    /* renamed from: com.onedelhi.secure.sf4$a */
    public class C6763a implements View.OnLayoutChangeListener {
        public C6763a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            sf4.this.mo44343r1(view);
        }
    }

    public sf4(@mr2 Context context, AttributeSet attributeSet, @C3982yb int i, @e64 int i2) {
        super(context, attributeSet, i, i2);
        ya4 ya4 = new ya4(this);
        this.f35032a = ya4;
        this.f35031a = new C6763a();
        this.f35030a = new Rect();
        this.f35034c = 1.0f;
        this.f35035d = 1.0f;
        this.f35036e = 0.5f;
        this.f35037f = 0.5f;
        this.f35038g = 1.0f;
        this.f35028a = context;
        ya4.mo47666e().density = context.getResources().getDisplayMetrics().density;
        ya4.mo47666e().setTextAlign(Paint.Align.CENTER);
    }

    @mr2
    /* renamed from: T0 */
    public static sf4 m64530T0(@mr2 Context context) {
        return m64532V0(context, (AttributeSet) null, f35027y, f35026x);
    }

    @mr2
    /* renamed from: U0 */
    public static sf4 m64531U0(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        return m64532V0(context, attributeSet, f35027y, f35026x);
    }

    @mr2
    /* renamed from: V0 */
    public static sf4 m64532V0(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i, @e64 int i2) {
        sf4 sf4 = new sf4(context, attributeSet, i, i2);
        sf4.mo44330g1(attributeSet, i, i2);
        return sf4;
    }

    /* renamed from: Q0 */
    public final float mo44317Q0() {
        int i;
        if (((this.f35030a.right - getBounds().right) - this.f35044w) - this.f35042u < 0) {
            i = ((this.f35030a.right - getBounds().right) - this.f35044w) - this.f35042u;
        } else if (((this.f35030a.left - getBounds().left) - this.f35044w) + this.f35042u <= 0) {
            return 0.0f;
        } else {
            i = ((this.f35030a.left - getBounds().left) - this.f35044w) + this.f35042u;
        }
        return (float) i;
    }

    /* renamed from: R0 */
    public final float mo44318R0() {
        this.f35032a.mo47666e().getFontMetrics(this.f35029a);
        Paint.FontMetrics fontMetrics = this.f35029a;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: S0 */
    public final float mo44319S0(@mr2 Rect rect) {
        return ((float) rect.centerY()) - mo44318R0();
    }

    /* renamed from: W0 */
    public final bs0 mo44320W0() {
        float width = ((float) (((double) getBounds().width()) - (((double) this.f35043v) * Math.sqrt(2.0d)))) / 2.0f;
        return new du2(new qd2((float) this.f35043v), Math.min(Math.max(-mo44317Q0(), -width), width));
    }

    /* renamed from: X0 */
    public void mo44321X0(@ts2 View view) {
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f35031a);
        }
    }

    /* renamed from: Y0 */
    public final void mo44322Y0(@mr2 Canvas canvas) {
        if (this.f35033a != null) {
            Rect bounds = getBounds();
            int S0 = (int) mo44319S0(bounds);
            if (this.f35032a.mo47665d() != null) {
                this.f35032a.mo47666e().drawableState = getState();
                this.f35032a.mo47672k(this.f35028a);
                this.f35032a.mo47666e().setAlpha((int) (this.f35038g * 255.0f));
            }
            CharSequence charSequence = this.f35033a;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) S0, this.f35032a.mo47666e());
        }
    }

    /* renamed from: Z0 */
    public int mo44323Z0() {
        return this.f35042u;
    }

    /* renamed from: a */
    public void mo11839a() {
        invalidateSelf();
    }

    /* renamed from: a1 */
    public int mo44324a1() {
        return this.f35041t;
    }

    /* renamed from: b1 */
    public int mo44325b1() {
        return this.f35040s;
    }

    @ts2
    /* renamed from: c1 */
    public CharSequence mo44326c1() {
        return this.f35033a;
    }

    @ts2
    /* renamed from: d1 */
    public sa4 mo44327d1() {
        return this.f35032a.mo47665d();
    }

    public void draw(@mr2 Canvas canvas) {
        canvas.save();
        canvas.scale(this.f35034c, this.f35035d, ((float) getBounds().left) + (((float) getBounds().width()) * 0.5f), ((float) getBounds().top) + (((float) getBounds().height()) * this.f35037f));
        canvas.translate(mo44317Q0(), (float) (-((((double) this.f35043v) * Math.sqrt(2.0d)) - ((double) this.f35043v))));
        super.draw(canvas);
        mo44322Y0(canvas);
        canvas.restore();
    }

    /* renamed from: e1 */
    public int mo44328e1() {
        return this.f35039r;
    }

    /* renamed from: f1 */
    public final float mo44329f1() {
        CharSequence charSequence = this.f35033a;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f35032a.mo47667f(charSequence.toString());
    }

    /* renamed from: g1 */
    public final void mo44330g1(@ts2 AttributeSet attributeSet, @C3982yb int i, @e64 int i2) {
        TypedArray k = ob4.m59195k(this.f35028a, attributeSet, fd3.C2165o.Tooltip, i, i2, new int[0]);
        this.f35043v = this.f35028a.getResources().getDimensionPixelSize(fd3.C2156f.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(getShapeAppearanceModel().mo45824v().mo45851t(mo44320W0()).mo45845m());
        mo44338m1(k.getText(fd3.C2165o.Tooltip_android_text));
        sa4 g = af2.m38616g(this.f35028a, k, fd3.C2165o.Tooltip_android_textAppearance);
        if (g != null) {
            int i3 = fd3.C2165o.Tooltip_android_textColor;
            if (k.hasValue(i3)) {
                g.mo44263k(af2.m38610a(this.f35028a, k, i3));
            }
        }
        mo44339n1(g);
        mo31626o0(ColorStateList.valueOf(k.getColor(fd3.C2165o.Tooltip_backgroundTint, oe2.m23727m(p10.m24299B(oe2.m23717c(this.f35028a, 16842801, sf4.class.getCanonicalName()), 229), p10.m24299B(oe2.m23717c(this.f35028a, fd3.C2153c.colorOnBackground, sf4.class.getCanonicalName()), Constants.ACTION_REMOVE_NB_LAYOUT)))));
        mo31570F0(ColorStateList.valueOf(oe2.m23717c(this.f35028a, fd3.C2153c.colorSurface, sf4.class.getCanonicalName())));
        this.f35039r = k.getDimensionPixelSize(fd3.C2165o.Tooltip_android_padding, 0);
        this.f35040s = k.getDimensionPixelSize(fd3.C2165o.Tooltip_android_minWidth, 0);
        this.f35041t = k.getDimensionPixelSize(fd3.C2165o.Tooltip_android_minHeight, 0);
        this.f35042u = k.getDimensionPixelSize(fd3.C2165o.Tooltip_android_layout_margin, 0);
        k.recycle();
    }

    public int getIntrinsicHeight() {
        return (int) Math.max(this.f35032a.mo47666e().getTextSize(), (float) this.f35041t);
    }

    public int getIntrinsicWidth() {
        return (int) Math.max(((float) (this.f35039r * 2)) + mo44329f1(), (float) this.f35040s);
    }

    /* renamed from: h1 */
    public void mo44333h1(@e83 int i) {
        this.f35042u = i;
        invalidateSelf();
    }

    /* renamed from: i1 */
    public void mo44334i1(@e83 int i) {
        this.f35041t = i;
        invalidateSelf();
    }

    /* renamed from: j1 */
    public void mo44335j1(@e83 int i) {
        this.f35040s = i;
        invalidateSelf();
    }

    /* renamed from: k1 */
    public void mo44336k1(@ts2 View view) {
        if (view != null) {
            mo44343r1(view);
            view.addOnLayoutChangeListener(this.f35031a);
        }
    }

    /* renamed from: l1 */
    public void mo44337l1(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        this.f35037f = 1.2f;
        this.f35034c = f;
        this.f35035d = f;
        this.f35038g = C1947d7.m12986b(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    /* renamed from: m1 */
    public void mo44338m1(@ts2 CharSequence charSequence) {
        if (!TextUtils.equals(this.f35033a, charSequence)) {
            this.f35033a = charSequence;
            this.f35032a.mo47671j(true);
            invalidateSelf();
        }
    }

    /* renamed from: n1 */
    public void mo44339n1(@ts2 sa4 sa4) {
        this.f35032a.mo47670i(sa4, this.f35028a);
    }

    /* renamed from: o1 */
    public void mo44340o1(@e64 int i) {
        mo44339n1(new sa4(this.f35028a, i));
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(getShapeAppearanceModel().mo45824v().mo45851t(mo44320W0()).mo45845m());
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: p1 */
    public void mo44341p1(@e83 int i) {
        this.f35039r = i;
        invalidateSelf();
    }

    /* renamed from: q1 */
    public void mo44342q1(@e54 int i) {
        mo44338m1(this.f35028a.getResources().getString(i));
    }

    /* renamed from: r1 */
    public final void mo44343r1(@mr2 View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f35044w = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f35030a);
    }
}
