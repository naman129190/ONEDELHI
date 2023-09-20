package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.onedelhi.secure.ay2;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.d81;
import com.onedelhi.secure.jb4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.C1105e
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: a */
    public static final int[] f5782a = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: b */
    public static final float f5783b = 0.6f;

    /* renamed from: b */
    public static final int[] f5784b = {16843660};

    /* renamed from: s */
    public static final int f5785s = 16;

    /* renamed from: a */
    public float f5786a;

    /* renamed from: a */
    public TextView f5787a;

    /* renamed from: a */
    public final C1099a f5788a;

    /* renamed from: a */
    public ViewPager f5789a;

    /* renamed from: a */
    public WeakReference<ay2> f5790a;

    /* renamed from: b */
    public TextView f5791b;

    /* renamed from: b */
    public boolean f5792b;

    /* renamed from: c */
    public TextView f5793c;

    /* renamed from: c */
    public boolean f5794c;

    /* renamed from: n */
    public int f5795n;

    /* renamed from: o */
    public int f5796o;

    /* renamed from: p */
    public int f5797p;

    /* renamed from: q */
    public int f5798q;

    /* renamed from: r */
    public int f5799r;

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$a */
    public class C1099a extends DataSetObserver implements ViewPager.C1109i, ViewPager.C1108h {

        /* renamed from: a */
        public int f5800a;

        public C1099a() {
        }

        /* renamed from: a */
        public void mo7103a(ViewPager viewPager, ay2 ay2, ay2 ay22) {
            PagerTitleStrip.this.mo7091a(ay2, ay22);
        }

        /* renamed from: b */
        public void mo7104b(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.mo7075c(i, f, false);
        }

        /* renamed from: c */
        public void mo7105c(int i) {
            this.f5800a = i;
        }

        /* renamed from: d */
        public void mo7106d(int i) {
            if (this.f5800a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.mo7092b(pagerTitleStrip.f5789a.getCurrentItem(), PagerTitleStrip.this.f5789a.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f = pagerTitleStrip2.f5786a;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                pagerTitleStrip2.mo7075c(pagerTitleStrip2.f5789a.getCurrentItem(), f, true);
            }
        }

        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.mo7092b(pagerTitleStrip.f5789a.getCurrentItem(), PagerTitleStrip.this.f5789a.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f = pagerTitleStrip2.f5786a;
            if (f < 0.0f) {
                f = 0.0f;
            }
            pagerTitleStrip2.mo7075c(pagerTitleStrip2.f5789a.getCurrentItem(), f, true);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$b */
    public static class C1100b extends SingleLineTransformationMethod {

        /* renamed from: a */
        public Locale f5802a;

        public C1100b(Context context) {
            this.f5802a = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f5802a);
            }
            return null;
        }
    }

    public PagerTitleStrip(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public PagerTitleStrip(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5795n = -1;
        this.f5786a = -1.0f;
        this.f5788a = new C1099a();
        TextView textView = new TextView(context);
        this.f5787a = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f5791b = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f5793c = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5782a);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            jb4.m18310E(this.f5787a, resourceId);
            jb4.m18310E(this.f5791b, resourceId);
            jb4.m18310E(this.f5793c, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f5787a.setTextColor(color);
            this.f5791b.setTextColor(color);
            this.f5793c.setTextColor(color);
        }
        this.f5797p = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f5799r = this.f5791b.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f5787a.setEllipsize(TextUtils.TruncateAt.END);
        this.f5791b.setEllipsize(TextUtils.TruncateAt.END);
        this.f5793c.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f5784b);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        TextView textView4 = this.f5787a;
        if (z) {
            setSingleLineAllCaps(textView4);
            setSingleLineAllCaps(this.f5791b);
            setSingleLineAllCaps(this.f5793c);
        } else {
            textView4.setSingleLine();
            this.f5791b.setSingleLine();
            this.f5793c.setSingleLine();
        }
        this.f5796o = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C1100b(textView.getContext()));
    }

    /* renamed from: a */
    public void mo7091a(ay2 ay2, ay2 ay22) {
        if (ay2 != null) {
            ay2.mo13327u(this.f5788a);
            this.f5790a = null;
        }
        if (ay22 != null) {
            ay22.mo13323m(this.f5788a);
            this.f5790a = new WeakReference<>(ay22);
        }
        ViewPager viewPager = this.f5789a;
        if (viewPager != null) {
            this.f5795n = -1;
            this.f5786a = -1.0f;
            mo7092b(viewPager.getCurrentItem(), ay22);
            requestLayout();
        }
    }

    /* renamed from: b */
    public void mo7092b(int i, ay2 ay2) {
        int e = ay2 != null ? ay2.mo13317e() : 0;
        this.f5792b = true;
        CharSequence charSequence = null;
        this.f5787a.setText((i < 1 || ay2 == null) ? null : ay2.mo13319g(i - 1));
        this.f5791b.setText((ay2 == null || i >= e) ? null : ay2.mo13319g(i));
        int i2 = i + 1;
        if (i2 < e && ay2 != null) {
            charSequence = ay2.mo13319g(i2);
        }
        this.f5793c.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f5787a.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f5791b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f5793c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f5795n = i;
        if (!this.f5794c) {
            mo7075c(i, this.f5786a, false);
        }
        this.f5792b = false;
    }

    /* renamed from: c */
    public void mo7075c(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        float f2 = f;
        if (i6 != this.f5795n) {
            mo7092b(i6, this.f5789a.getAdapter());
        } else if (!z && f2 == this.f5786a) {
            return;
        }
        this.f5794c = true;
        int measuredWidth = this.f5787a.getMeasuredWidth();
        int measuredWidth2 = this.f5791b.getMeasuredWidth();
        int measuredWidth3 = this.f5793c.getMeasuredWidth();
        int i7 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i8 = paddingRight + i7;
        int i9 = (width - (paddingLeft + i7)) - i8;
        float f3 = 0.5f + f2;
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        int i10 = ((width - i8) - ((int) (((float) i9) * f3))) - i7;
        int i11 = measuredWidth2 + i10;
        int baseline = this.f5787a.getBaseline();
        int baseline2 = this.f5791b.getBaseline();
        int baseline3 = this.f5793c.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i12 = max - baseline;
        int i13 = max - baseline2;
        int i14 = max - baseline3;
        int i15 = measuredWidth3;
        int max2 = Math.max(Math.max(this.f5787a.getMeasuredHeight() + i12, this.f5791b.getMeasuredHeight() + i13), this.f5793c.getMeasuredHeight() + i14);
        int i16 = this.f5797p & 112;
        if (i16 == 16) {
            i5 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i16 != 80) {
            i4 = i12 + paddingTop;
            i2 = i13 + paddingTop;
            i3 = paddingTop + i14;
            TextView textView = this.f5791b;
            textView.layout(i10, i2, i11, textView.getMeasuredHeight() + i2);
            int min = Math.min(paddingLeft, (i10 - this.f5796o) - measuredWidth);
            TextView textView2 = this.f5787a;
            textView2.layout(min, i4, measuredWidth + min, textView2.getMeasuredHeight() + i4);
            int max3 = Math.max((width - paddingRight) - i15, i11 + this.f5796o);
            TextView textView3 = this.f5793c;
            textView3.layout(max3, i3, max3 + i15, textView3.getMeasuredHeight() + i3);
            this.f5786a = f;
            this.f5794c = false;
        } else {
            i5 = (height - paddingBottom) - max2;
        }
        i4 = i12 + i5;
        i2 = i13 + i5;
        i3 = i5 + i14;
        TextView textView4 = this.f5791b;
        textView4.layout(i10, i2, i11, textView4.getMeasuredHeight() + i2);
        int min2 = Math.min(paddingLeft, (i10 - this.f5796o) - measuredWidth);
        TextView textView22 = this.f5787a;
        textView22.layout(min2, i4, measuredWidth + min2, textView22.getMeasuredHeight() + i4);
        int max32 = Math.max((width - paddingRight) - i15, i11 + this.f5796o);
        TextView textView32 = this.f5793c;
        textView32.layout(max32, i3, max32 + i15, textView32.getMeasuredHeight() + i3);
        this.f5786a = f;
        this.f5794c = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f5796o;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            ay2 adapter = viewPager.getAdapter();
            viewPager.mo7128U(this.f5788a);
            viewPager.mo7136b(this.f5788a);
            this.f5789a = viewPager;
            WeakReference<ay2> weakReference = this.f5790a;
            mo7091a(weakReference != null ? (ay2) weakReference.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f5789a;
        if (viewPager != null) {
            mo7091a(viewPager.getAdapter(), (ay2) null);
            this.f5789a.mo7128U((ViewPager.C1109i) null);
            this.f5789a.mo7121N(this.f5788a);
            this.f5789a = null;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f5789a != null) {
            float f = this.f5786a;
            if (f < 0.0f) {
                f = 0.0f;
            }
            mo7075c(this.f5795n, f, true);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (((float) size) * 0.2f), -2);
            this.f5787a.measure(childMeasureSpec2, childMeasureSpec);
            this.f5791b.measure(childMeasureSpec2, childMeasureSpec);
            this.f5793c.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                i3 = View.MeasureSpec.getSize(i2);
            } else {
                i3 = Math.max(getMinHeight(), this.f5791b.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i3, i2, this.f5791b.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    public void requestLayout() {
        if (!this.f5792b) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.f5797p = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.f5798q = i;
        int i2 = (i << 24) | (this.f5799r & jt4.f14542r);
        this.f5787a.setTextColor(i2);
        this.f5793c.setTextColor(i2);
    }

    public void setTextColor(@d10 int i) {
        this.f5799r = i;
        this.f5791b.setTextColor(i);
        int i2 = (this.f5798q << 24) | (this.f5799r & jt4.f14542r);
        this.f5787a.setTextColor(i2);
        this.f5793c.setTextColor(i2);
    }

    public void setTextSize(int i, float f) {
        this.f5787a.setTextSize(i, f);
        this.f5791b.setTextSize(i, f);
        this.f5793c.setTextSize(i, f);
    }

    public void setTextSpacing(int i) {
        this.f5796o = i;
        requestLayout();
    }
}
