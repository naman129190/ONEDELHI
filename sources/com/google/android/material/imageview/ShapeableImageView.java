package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.k10;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nx3;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.uw3;
import com.onedelhi.secure.vw3;
import com.onedelhi.secure.yk0;
import com.onedelhi.secure.zk0;

public class ShapeableImageView extends AppCompatImageView implements nx3 {

    /* renamed from: t */
    public static final int f8525t = fd3.C2164n.Widget_MaterialComponents_ShapeableImageView;

    /* renamed from: u */
    public static final int f8526u = Integer.MIN_VALUE;
    @zk0

    /* renamed from: a */
    public float f8527a;
    @ts2

    /* renamed from: a */
    public ColorStateList f8528a;

    /* renamed from: a */
    public final Paint f8529a;

    /* renamed from: a */
    public final Path f8530a;

    /* renamed from: a */
    public final RectF f8531a;
    @ts2

    /* renamed from: a */
    public bf2 f8532a;

    /* renamed from: a */
    public uw3 f8533a;

    /* renamed from: a */
    public final vw3 f8534a;

    /* renamed from: b */
    public final Paint f8535b;

    /* renamed from: b */
    public Path f8536b;

    /* renamed from: b */
    public final RectF f8537b;

    /* renamed from: c */
    public boolean f8538c;
    @zk0

    /* renamed from: n */
    public int f8539n;
    @zk0

    /* renamed from: o */
    public int f8540o;
    @zk0

    /* renamed from: p */
    public int f8541p;
    @zk0

    /* renamed from: q */
    public int f8542q;
    @zk0

    /* renamed from: r */
    public int f8543r;
    @zk0

    /* renamed from: s */
    public int f8544s;

    @TargetApi(21)
    /* renamed from: com.google.android.material.imageview.ShapeableImageView$a */
    public class C1637a extends ViewOutlineProvider {

        /* renamed from: a */
        public final Rect f8545a = new Rect();

        public C1637a() {
        }

        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f8533a != null) {
                if (ShapeableImageView.this.f8532a == null) {
                    bf2 unused = ShapeableImageView.this.f8532a = new bf2(ShapeableImageView.this.f8533a);
                }
                ShapeableImageView.this.f8531a.round(this.f8545a);
                ShapeableImageView.this.f8532a.setBounds(this.f8545a);
                ShapeableImageView.this.f8532a.getOutline(outline);
            }
        }
    }

    public ShapeableImageView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public ShapeableImageView(Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShapeableImageView(android.content.Context r7, @com.onedelhi.secure.ts2 android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = f8525t
            android.content.Context r7 = com.onedelhi.secure.hf2.m50488c(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            com.onedelhi.secure.vw3 r7 = com.onedelhi.secure.vw3.m68560k()
            r6.f8534a = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f8530a = r7
            r7 = 0
            r6.f8538c = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f8535b = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f8531a = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f8537b = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f8536b = r2
            int[] r2 = com.onedelhi.secure.fd3.C2165o.ShapeableImageView
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            r4 = 2
            r5 = 0
            r6.setLayerType(r4, r5)
            int r4 = com.onedelhi.secure.fd3.C2165o.ShapeableImageView_strokeColor
            android.content.res.ColorStateList r4 = com.onedelhi.secure.af2.m38610a(r1, r2, r4)
            r6.f8528a = r4
            int r4 = com.onedelhi.secure.fd3.C2165o.ShapeableImageView_strokeWidth
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f8527a = r4
            int r4 = com.onedelhi.secure.fd3.C2165o.ShapeableImageView_contentPadding
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f8539n = r7
            r6.f8540o = r7
            r6.f8541p = r7
            r6.f8542q = r7
            int r4 = com.onedelhi.secure.fd3.C2165o.ShapeableImageView_contentPaddingLeft
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f8539n = r4
            int r4 = com.onedelhi.secure.fd3.C2165o.ShapeableImageView_contentPaddingTop
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f8540o = r4
            int r4 = com.onedelhi.secure.fd3.C2165o.ShapeableImageView_contentPaddingRight
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f8541p = r4
            int r4 = com.onedelhi.secure.fd3.C2165o.ShapeableImageView_contentPaddingBottom
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f8542q = r7
            int r7 = com.onedelhi.secure.fd3.C2165o.ShapeableImageView_contentPaddingStart
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f8543r = r7
            int r7 = com.onedelhi.secure.fd3.C2165o.ShapeableImageView_contentPaddingEnd
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f8544s = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.f8529a = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            com.onedelhi.secure.uw3$b r7 = com.onedelhi.secure.uw3.m67447e(r1, r8, r9, r0)
            com.onedelhi.secure.uw3 r7 = r7.mo45845m()
            r6.f8533a = r7
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>()
            r6.setOutlineProvider(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: g */
    public final void mo12438g(Canvas canvas) {
        if (this.f8528a != null) {
            this.f8529a.setStrokeWidth(this.f8527a);
            int colorForState = this.f8528a.getColorForState(getDrawableState(), this.f8528a.getDefaultColor());
            if (this.f8527a > 0.0f && colorForState != 0) {
                this.f8529a.setColor(colorForState);
                canvas.drawPath(this.f8530a, this.f8529a);
            }
        }
    }

    @zk0
    public int getContentPaddingBottom() {
        return this.f8542q;
    }

    @zk0
    public final int getContentPaddingEnd() {
        int i = this.f8544s;
        return i != Integer.MIN_VALUE ? i : mo12454i() ? this.f8539n : this.f8541p;
    }

    @zk0
    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (mo12453h()) {
            if (mo12454i() && (i2 = this.f8544s) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!mo12454i() && (i = this.f8543r) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f8539n;
    }

    @zk0
    public int getContentPaddingRight() {
        int i;
        int i2;
        if (mo12453h()) {
            if (mo12454i() && (i2 = this.f8543r) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!mo12454i() && (i = this.f8544s) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f8541p;
    }

    @zk0
    public final int getContentPaddingStart() {
        int i = this.f8543r;
        return i != Integer.MIN_VALUE ? i : mo12454i() ? this.f8541p : this.f8539n;
    }

    @zk0
    public int getContentPaddingTop() {
        return this.f8540o;
    }

    @zk0
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @zk0
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @zk0
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @zk0
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @zk0
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @zk0
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @mr2
    public uw3 getShapeAppearanceModel() {
        return this.f8533a;
    }

    @ts2
    public ColorStateList getStrokeColor() {
        return this.f8528a;
    }

    @zk0
    public float getStrokeWidth() {
        return this.f8527a;
    }

    /* renamed from: h */
    public final boolean mo12453h() {
        return (this.f8543r == Integer.MIN_VALUE && this.f8544s == Integer.MIN_VALUE) ? false : true;
    }

    /* renamed from: i */
    public final boolean mo12454i() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: j */
    public final void mo12455j(int i, int i2) {
        this.f8531a.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
        this.f8534a.mo46402d(this.f8533a, 1.0f, this.f8531a, this.f8530a);
        this.f8536b.rewind();
        this.f8536b.addPath(this.f8530a);
        this.f8537b.set(0.0f, 0.0f, (float) i, (float) i2);
        this.f8536b.addRect(this.f8537b, Path.Direction.CCW);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f8536b, this.f8535b);
        mo12438g(canvas);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f8538c && isLayoutDirectionResolved()) {
            this.f8538c = true;
            if (isPaddingRelative() || mo12453h()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo12455j(i, i2);
    }

    public void setContentPadding(@zk0 int i, @zk0 int i2, @zk0 int i3, @zk0 int i4) {
        this.f8543r = Integer.MIN_VALUE;
        this.f8544s = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.f8539n) + i, (super.getPaddingTop() - this.f8540o) + i2, (super.getPaddingRight() - this.f8541p) + i3, (super.getPaddingBottom() - this.f8542q) + i4);
        this.f8539n = i;
        this.f8540o = i2;
        this.f8541p = i3;
        this.f8542q = i4;
    }

    @sj3(17)
    public void setContentPaddingRelative(@zk0 int i, @zk0 int i2, @zk0 int i3, @zk0 int i4) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i, (super.getPaddingTop() - this.f8540o) + i2, (super.getPaddingEnd() - getContentPaddingEnd()) + i3, (super.getPaddingBottom() - this.f8542q) + i4);
        this.f8539n = mo12454i() ? i3 : i;
        this.f8540o = i2;
        if (!mo12454i()) {
            i = i3;
        }
        this.f8541p = i;
        this.f8542q = i4;
    }

    public void setPadding(@zk0 int i, @zk0 int i2, @zk0 int i3, @zk0 int i4) {
        super.setPadding(i + getContentPaddingLeft(), i2 + getContentPaddingTop(), i3 + getContentPaddingRight(), i4 + getContentPaddingBottom());
    }

    public void setPaddingRelative(@zk0 int i, @zk0 int i2, @zk0 int i3, @zk0 int i4) {
        super.setPaddingRelative(i + getContentPaddingStart(), i2 + getContentPaddingTop(), i3 + getContentPaddingEnd(), i4 + getContentPaddingBottom());
    }

    public void setShapeAppearanceModel(@mr2 uw3 uw3) {
        this.f8533a = uw3;
        bf2 bf2 = this.f8532a;
        if (bf2 != null) {
            bf2.setShapeAppearanceModel(uw3);
        }
        mo12455j(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@ts2 ColorStateList colorStateList) {
        this.f8528a = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@k10 int i) {
        setStrokeColor(C3129p8.m24528a(getContext(), i));
    }

    public void setStrokeWidth(@zk0 float f) {
        if (this.f8527a != f) {
            this.f8527a = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@yk0 int i) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i));
    }
}
