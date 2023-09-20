package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.C0552c;
import com.onedelhi.secure.C2610k8;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3470s4;
import com.onedelhi.secure.C3569t8;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.d81;
import com.onedelhi.secure.jb4;
import com.onedelhi.secure.jp0;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pn0;
import com.onedelhi.secure.ps0;
import com.onedelhi.secure.qb4;
import com.onedelhi.secure.rv4;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.za3;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class SwitchCompat extends CompoundButton implements ps0 {

    /* renamed from: A */
    public static final int f1623A = 250;

    /* renamed from: B */
    public static final int f1624B = 0;

    /* renamed from: C */
    public static final int f1625C = 1;

    /* renamed from: D */
    public static final int f1626D = 2;

    /* renamed from: E */
    public static final int f1627E = 1;

    /* renamed from: F */
    public static final int f1628F = 2;

    /* renamed from: G */
    public static final int f1629G = 3;

    /* renamed from: a */
    public static final Property<SwitchCompat, Float> f1630a = new C0337a(Float.class, "thumbPos");

    /* renamed from: a */
    public static final int[] f1631a = {16842912};

    /* renamed from: b */
    public static final String f1632b = "android.widget.Switch";

    /* renamed from: a */
    public float f1633a;

    /* renamed from: a */
    public ObjectAnimator f1634a;

    /* renamed from: a */
    public ColorStateList f1635a;

    /* renamed from: a */
    public PorterDuff.Mode f1636a;

    /* renamed from: a */
    public final Rect f1637a;

    /* renamed from: a */
    public Drawable f1638a;

    /* renamed from: a */
    public Layout f1639a;

    /* renamed from: a */
    public final TextPaint f1640a;
    @ts2

    /* renamed from: a */
    public TransformationMethod f1641a;

    /* renamed from: a */
    public VelocityTracker f1642a;
    @ts2

    /* renamed from: a */
    public C0339c f1643a;
    @mr2

    /* renamed from: a */
    public C2610k8 f1644a;

    /* renamed from: a */
    public final C3569t8 f1645a;

    /* renamed from: a */
    public CharSequence f1646a;

    /* renamed from: b */
    public float f1647b;

    /* renamed from: b */
    public ColorStateList f1648b;

    /* renamed from: b */
    public PorterDuff.Mode f1649b;

    /* renamed from: b */
    public Drawable f1650b;

    /* renamed from: b */
    public Layout f1651b;

    /* renamed from: b */
    public CharSequence f1652b;

    /* renamed from: b */
    public boolean f1653b;

    /* renamed from: c */
    public float f1654c;

    /* renamed from: c */
    public ColorStateList f1655c;

    /* renamed from: c */
    public CharSequence f1656c;

    /* renamed from: c */
    public boolean f1657c;

    /* renamed from: d */
    public CharSequence f1658d;

    /* renamed from: d */
    public boolean f1659d;

    /* renamed from: e */
    public boolean f1660e;

    /* renamed from: f */
    public boolean f1661f;

    /* renamed from: g */
    public boolean f1662g;

    /* renamed from: h */
    public boolean f1663h;

    /* renamed from: n */
    public int f1664n;

    /* renamed from: o */
    public int f1665o;

    /* renamed from: p */
    public int f1666p;

    /* renamed from: q */
    public int f1667q;

    /* renamed from: r */
    public int f1668r;

    /* renamed from: s */
    public int f1669s;

    /* renamed from: t */
    public int f1670t;

    /* renamed from: u */
    public int f1671u;

    /* renamed from: v */
    public int f1672v;

    /* renamed from: w */
    public int f1673w;

    /* renamed from: x */
    public int f1674x;

    /* renamed from: y */
    public int f1675y;

    /* renamed from: z */
    public int f1676z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    public class C0337a extends Property<SwitchCompat, Float> {
        public C0337a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1654c);
        }

        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    @sj3(18)
    /* renamed from: androidx.appcompat.widget.SwitchCompat$b */
    public static class C0338b {
        @pn0
        /* renamed from: a */
        public static void m2399a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$c */
    public static class C0339c extends C0552c.C0559f {

        /* renamed from: a */
        public final Reference<SwitchCompat> f1677a;

        public C0339c(SwitchCompat switchCompat) {
            this.f1677a = new WeakReference(switchCompat);
        }

        /* renamed from: a */
        public void mo2332a(@ts2 Throwable th) {
            SwitchCompat switchCompat = this.f1677a.get();
            if (switchCompat != null) {
                switchCompat.mo2288k();
            }
        }

        /* renamed from: b */
        public void mo2333b() {
            SwitchCompat switchCompat = this.f1677a.get();
            if (switchCompat != null) {
                switchCompat.mo2288k();
            }
        }
    }

    public SwitchCompat(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public SwitchCompat(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, za3.C4057b.switchStyle);
    }

    public SwitchCompat(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1635a = null;
        this.f1636a = null;
        this.f1653b = false;
        this.f1657c = false;
        this.f1648b = null;
        this.f1649b = null;
        this.f1659d = false;
        this.f1660e = false;
        this.f1642a = VelocityTracker.obtain();
        this.f1663h = true;
        this.f1637a = new Rect();
        qb4.m25632a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1640a = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = za3.C4068m.SwitchCompat;
        af4 G = af4.m11110G(context, attributeSet, iArr, i, 0);
        jt4.m19033z1(this, context, iArr, attributeSet, G.mo13025B(), i, 0);
        Drawable h = G.mo13037h(za3.C4068m.SwitchCompat_android_thumb);
        this.f1638a = h;
        if (h != null) {
            h.setCallback(this);
        }
        Drawable h2 = G.mo13037h(za3.C4068m.SwitchCompat_track);
        this.f1650b = h2;
        if (h2 != null) {
            h2.setCallback(this);
        }
        setTextOnInternal(G.mo13053x(za3.C4068m.SwitchCompat_android_textOn));
        setTextOffInternal(G.mo13053x(za3.C4068m.SwitchCompat_android_textOff));
        this.f1662g = G.mo13030a(za3.C4068m.SwitchCompat_showText, true);
        this.f1664n = G.mo13036g(za3.C4068m.SwitchCompat_thumbTextPadding, 0);
        this.f1665o = G.mo13036g(za3.C4068m.SwitchCompat_switchMinWidth, 0);
        this.f1666p = G.mo13036g(za3.C4068m.SwitchCompat_switchPadding, 0);
        this.f1661f = G.mo13030a(za3.C4068m.SwitchCompat_splitTrack, false);
        ColorStateList d = G.mo13033d(za3.C4068m.SwitchCompat_thumbTint);
        if (d != null) {
            this.f1635a = d;
            this.f1653b = true;
        }
        PorterDuff.Mode e = jp0.m18734e(G.mo13044o(za3.C4068m.SwitchCompat_thumbTintMode, -1), (PorterDuff.Mode) null);
        if (this.f1636a != e) {
            this.f1636a = e;
            this.f1657c = true;
        }
        if (this.f1653b || this.f1657c) {
            mo2260b();
        }
        ColorStateList d2 = G.mo13033d(za3.C4068m.SwitchCompat_trackTint);
        if (d2 != null) {
            this.f1648b = d2;
            this.f1659d = true;
        }
        PorterDuff.Mode e2 = jp0.m18734e(G.mo13044o(za3.C4068m.SwitchCompat_trackTintMode, -1), (PorterDuff.Mode) null);
        if (this.f1649b != e2) {
            this.f1649b = e2;
            this.f1660e = true;
        }
        if (this.f1659d || this.f1660e) {
            mo2261d();
        }
        int u = G.mo13050u(za3.C4068m.SwitchCompat_switchTextAppearance, 0);
        if (u != 0) {
            setSwitchTextAppearance(context, u);
        }
        C3569t8 t8Var = new C3569t8(this);
        this.f1645a = t8Var;
        t8Var.mo24756m(attributeSet, i);
        G.mo13029I();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1668r = viewConfiguration.getScaledTouchSlop();
        this.f1669s = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().mo18949c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: g */
    public static float m2381g(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    @mr2
    private C2610k8 getEmojiTextViewHelper() {
        if (this.f1644a == null) {
            this.f1644a = new C2610k8(this);
        }
        return this.f1644a;
    }

    private boolean getTargetCheckedState() {
        return this.f1654c > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((rv4.m27093b(this) ? 1.0f - this.f1654c : this.f1654c) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1650b;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1637a;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1638a;
        Rect d = drawable2 != null ? jp0.m18733d(drawable2) : jp0.f14363a;
        return ((((this.f1670t - this.f1672v) - rect.left) - rect.right) - d.left) - d.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1656c = charSequence;
        this.f1658d = mo2284h(charSequence);
        this.f1651b = null;
        if (this.f1662g) {
            mo2292o();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1646a = charSequence;
        this.f1652b = mo2284h(charSequence);
        this.f1639a = null;
        if (this.f1662g) {
            mo2292o();
        }
    }

    /* renamed from: a */
    public final void mo2259a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1630a, new float[]{z ? 1.0f : 0.0f});
        this.f1634a = ofFloat;
        ofFloat.setDuration(250);
        C0338b.m2399a(this.f1634a, true);
        this.f1634a.start();
    }

    /* renamed from: b */
    public final void mo2260b() {
        Drawable drawable = this.f1638a;
        if (drawable == null) {
            return;
        }
        if (this.f1653b || this.f1657c) {
            Drawable mutate = wo0.m30989r(drawable).mutate();
            this.f1638a = mutate;
            if (this.f1653b) {
                wo0.m30986o(mutate, this.f1635a);
            }
            if (this.f1657c) {
                wo0.m30987p(this.f1638a, this.f1636a);
            }
            if (this.f1638a.isStateful()) {
                this.f1638a.setState(getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public boolean mo1712c() {
        return getEmojiTextViewHelper().mo18948b();
    }

    /* renamed from: d */
    public final void mo2261d() {
        Drawable drawable = this.f1650b;
        if (drawable == null) {
            return;
        }
        if (this.f1659d || this.f1660e) {
            Drawable mutate = wo0.m30989r(drawable).mutate();
            this.f1650b = mutate;
            if (this.f1659d) {
                wo0.m30986o(mutate, this.f1648b);
            }
            if (this.f1660e) {
                wo0.m30987p(this.f1650b, this.f1649b);
            }
            if (this.f1650b.isStateful()) {
                this.f1650b.setState(getDrawableState());
            }
        }
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f1637a;
        int i3 = this.f1673w;
        int i4 = this.f1674x;
        int i5 = this.f1675y;
        int i6 = this.f1676z;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1638a;
        Rect d = drawable != null ? jp0.m18733d(drawable) : jp0.f14363a;
        Drawable drawable2 = this.f1650b;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (d != null) {
                int i8 = d.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = d.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = d.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = d.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f1650b.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1650b.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1638a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f1672v + rect.right;
            this.f1638a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                wo0.m30983l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f1638a;
        if (drawable != null) {
            wo0.m30982k(drawable, f, f2);
        }
        Drawable drawable2 = this.f1650b;
        if (drawable2 != null) {
            wo0.m30982k(drawable2, f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1638a;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1650b;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void mo2265e() {
        ObjectAnimator objectAnimator = this.f1634a;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: f */
    public final void mo2266f(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    public int getCompoundPaddingLeft() {
        if (!rv4.m27093b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1670t;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1666p : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (rv4.m27093b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1670t;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1666p : compoundPaddingRight;
    }

    @ts2
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return jb4.m18312G(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1662g;
    }

    public boolean getSplitTrack() {
        return this.f1661f;
    }

    public int getSwitchMinWidth() {
        return this.f1665o;
    }

    public int getSwitchPadding() {
        return this.f1666p;
    }

    public CharSequence getTextOff() {
        return this.f1656c;
    }

    public CharSequence getTextOn() {
        return this.f1646a;
    }

    public Drawable getThumbDrawable() {
        return this.f1638a;
    }

    @d81(from = 0.0d, mo14561to = 1.0d)
    public final float getThumbPosition() {
        return this.f1654c;
    }

    public int getThumbTextPadding() {
        return this.f1664n;
    }

    @ts2
    public ColorStateList getThumbTintList() {
        return this.f1635a;
    }

    @ts2
    public PorterDuff.Mode getThumbTintMode() {
        return this.f1636a;
    }

    public Drawable getTrackDrawable() {
        return this.f1650b;
    }

    @ts2
    public ColorStateList getTrackTintList() {
        return this.f1648b;
    }

    @ts2
    public PorterDuff.Mode getTrackTintMode() {
        return this.f1649b;
    }

    @ts2
    /* renamed from: h */
    public final CharSequence mo2284h(@ts2 CharSequence charSequence) {
        TransformationMethod f = getEmojiTextViewHelper().mo18952f(this.f1641a);
        return f != null ? f.getTransformation(charSequence, this) : charSequence;
    }

    /* renamed from: i */
    public final boolean mo2285i(float f, float f2) {
        if (this.f1638a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1638a.getPadding(this.f1637a);
        int i = this.f1674x;
        int i2 = this.f1668r;
        int i3 = i - i2;
        int i4 = (this.f1673w + thumbOffset) - i2;
        Rect rect = this.f1637a;
        return f > ((float) i4) && f < ((float) ((((this.f1672v + i4) + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.f1676z + i2));
    }

    /* renamed from: j */
    public final Layout mo2286j(CharSequence charSequence) {
        TextPaint textPaint = this.f1640a;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1638a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1650b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1634a;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1634a.end();
            this.f1634a = null;
        }
    }

    /* renamed from: k */
    public void mo2288k() {
        setTextOnInternal(this.f1646a);
        setTextOffInternal(this.f1656c);
        requestLayout();
    }

    /* renamed from: l */
    public final void mo2289l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1656c;
            if (charSequence == null) {
                charSequence = getResources().getString(za3.C4066k.abc_capital_off);
            }
            jt4.m18998q2(this, charSequence);
        }
    }

    /* renamed from: m */
    public final void mo2290m() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1646a;
            if (charSequence == null) {
                charSequence = getResources().getString(za3.C4066k.abc_capital_on);
            }
            jt4.m18998q2(this, charSequence);
        }
    }

    /* renamed from: n */
    public final void mo2291n(int i, int i2) {
        setSwitchTypeface(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    /* renamed from: o */
    public final void mo2292o() {
        if (this.f1643a == null && this.f1644a.mo18948b() && C0552c.m4111n()) {
            C0552c b = C0552c.m4105b();
            int f = b.mo4170f();
            if (f == 3 || f == 0) {
                C0339c cVar = new C0339c(this);
                this.f1643a = cVar;
                b.mo4183y(cVar);
            }
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f1631a);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1637a;
        Drawable drawable = this.f1650b;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1674x;
        int i3 = this.f1676z;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1638a;
        if (drawable != null) {
            if (!this.f1661f || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = jp0.m18733d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f1639a : this.f1651b;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1655c;
            if (colorStateList != null) {
                this.f1640a.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1640a.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f1632b);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f1632b);
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1646a : this.f1656c;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f1638a != null) {
            Rect rect = this.f1637a;
            Drawable drawable = this.f1650b;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = jp0.m18733d(this.f1638a);
            i5 = Math.max(0, d.left - rect.left);
            i11 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (rv4.m27093b(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f1670t + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f1670t) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i10 = this.f1671u;
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f1671u;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1671u;
            this.f1673w = i7;
            this.f1674x = i9;
            this.f1676z = i8;
            this.f1675y = i6;
        }
        i8 = i10 + i9;
        this.f1673w = i7;
        this.f1674x = i9;
        this.f1676z = i8;
        this.f1675y = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1662g) {
            if (this.f1639a == null) {
                this.f1639a = mo2286j(this.f1652b);
            }
            if (this.f1651b == null) {
                this.f1651b = mo2286j(this.f1658d);
            }
        }
        Rect rect = this.f1637a;
        Drawable drawable = this.f1638a;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1638a.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1638a.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f1672v = Math.max(this.f1662g ? Math.max(this.f1639a.getWidth(), this.f1651b.getWidth()) + (this.f1664n * 2) : 0, i4);
        Drawable drawable2 = this.f1650b;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f1650b.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f1638a;
        if (drawable3 != null) {
            Rect d = jp0.m18733d(drawable3);
            i6 = Math.max(i6, d.left);
            i7 = Math.max(i7, d.right);
        }
        int max = this.f1663h ? Math.max(this.f1665o, (this.f1672v * 2) + i6 + i7) : this.f1665o;
        int max2 = Math.max(i5, i3);
        this.f1670t = max;
        this.f1671u = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1646a : this.f1656c;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1642a
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009f
            r2 = 2
            if (r0 == r1) goto L_0x008b
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x008b
            goto L_0x00b9
        L_0x0016:
            int r0 = r6.f1667q
            if (r0 == r1) goto L_0x0057
            if (r0 == r2) goto L_0x001e
            goto L_0x00b9
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1633a
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003d
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003d
        L_0x0039:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003d:
            boolean r0 = com.onedelhi.secure.rv4.m27093b(r6)
            if (r0 == 0) goto L_0x0044
            float r2 = -r2
        L_0x0044:
            float r0 = r6.f1654c
            float r0 = r0 + r2
            float r0 = m2381g(r0, r4, r3)
            float r2 = r6.f1654c
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0056
            r6.f1633a = r7
            r6.setThumbPosition(r0)
        L_0x0056:
            return r1
        L_0x0057:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1633a
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1668r
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007d
            float r4 = r6.f1647b
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1668r
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b9
        L_0x007d:
            r6.f1667q = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1633a = r0
            r6.f1647b = r3
            return r1
        L_0x008b:
            int r0 = r6.f1667q
            if (r0 != r2) goto L_0x0096
            r6.mo2301p(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0096:
            r0 = 0
            r6.f1667q = r0
            android.view.VelocityTracker r0 = r6.f1642a
            r0.clear()
            goto L_0x00b9
        L_0x009f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b9
            boolean r3 = r6.mo2285i(r0, r2)
            if (r3 == 0) goto L_0x00b9
            r6.f1667q = r1
            r6.f1633a = r0
            r6.f1647b = r2
        L_0x00b9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void mo2301p(MotionEvent motionEvent) {
        this.f1667q = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.f1642a.computeCurrentVelocity(1000);
            float xVelocity = this.f1642a.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f1669s)) {
                z = getTargetCheckedState();
            } else if (!rv4.m27093b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z = false;
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        mo2266f(motionEvent);
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo18950d(z);
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            mo2290m();
        } else {
            mo2289l();
        }
        if (getWindowToken() == null || !jt4.m18914U0(this)) {
            mo2265e();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        mo2259a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(@ts2 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jb4.m18313H(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo18951e(z);
        setTextOnInternal(this.f1646a);
        setTextOffInternal(this.f1656c);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f1663h = z;
        invalidate();
    }

    public void setFilters(@mr2 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo18947a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f1662g != z) {
            this.f1662g = z;
            requestLayout();
            if (z) {
                mo2292o();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f1661f = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f1665o = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f1666p = i;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i) {
        af4 E = af4.m11108E(context, i, za3.C4068m.TextAppearance);
        ColorStateList d = E.mo13033d(za3.C4068m.TextAppearance_android_textColor);
        if (d == null) {
            d = getTextColors();
        }
        this.f1655c = d;
        int g = E.mo13036g(za3.C4068m.TextAppearance_android_textSize, 0);
        if (g != 0) {
            float f = (float) g;
            if (f != this.f1640a.getTextSize()) {
                this.f1640a.setTextSize(f);
                requestLayout();
            }
        }
        mo2291n(E.mo13044o(za3.C4068m.TextAppearance_android_typeface, -1), E.mo13044o(za3.C4068m.TextAppearance_android_textStyle, -1));
        this.f1641a = E.mo13030a(za3.C4068m.TextAppearance_textAllCaps, false) ? new C3470s4(getContext()) : null;
        setTextOnInternal(this.f1646a);
        setTextOffInternal(this.f1656c);
        E.mo13029I();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1640a.getTypeface() != null && !this.f1640a.getTypeface().equals(typeface)) || (this.f1640a.getTypeface() == null && typeface != null)) {
            this.f1640a.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int i2 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i;
            TextPaint textPaint = this.f1640a;
            if ((i2 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f1640a;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f1640a.setFakeBoldText(false);
        this.f1640a.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            mo2289l();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            mo2290m();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1638a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1638a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f1654c = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C3129p8.m24529b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f1664n = i;
        requestLayout();
    }

    public void setThumbTintList(@ts2 ColorStateList colorStateList) {
        this.f1635a = colorStateList;
        this.f1653b = true;
        mo2260b();
    }

    public void setThumbTintMode(@ts2 PorterDuff.Mode mode) {
        this.f1636a = mode;
        this.f1657c = true;
        mo2260b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1650b;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1650b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C3129p8.m24529b(getContext(), i));
    }

    public void setTrackTintList(@ts2 ColorStateList colorStateList) {
        this.f1648b = colorStateList;
        this.f1659d = true;
        mo2261d();
    }

    public void setTrackTintMode(@ts2 PorterDuff.Mode mode) {
        this.f1649b = mode;
        this.f1660e = true;
        mo2261d();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1638a || drawable == this.f1650b;
    }
}
