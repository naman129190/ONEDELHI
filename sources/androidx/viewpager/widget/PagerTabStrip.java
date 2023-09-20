package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.k10;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.ts2;

public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: C */
    public static final int f5756C = 3;

    /* renamed from: D */
    public static final int f5757D = 6;

    /* renamed from: E */
    public static final int f5758E = 16;

    /* renamed from: F */
    public static final int f5759F = 32;

    /* renamed from: G */
    public static final int f5760G = 64;

    /* renamed from: H */
    public static final int f5761H = 1;

    /* renamed from: I */
    public static final int f5762I = 32;

    /* renamed from: b */
    public static final String f5763b = "PagerTabStrip";

    /* renamed from: A */
    public int f5764A;

    /* renamed from: B */
    public int f5765B;

    /* renamed from: a */
    public final Paint f5766a;

    /* renamed from: a */
    public final Rect f5767a;

    /* renamed from: c */
    public float f5768c;

    /* renamed from: d */
    public float f5769d;

    /* renamed from: d */
    public boolean f5770d;

    /* renamed from: e */
    public boolean f5771e;

    /* renamed from: f */
    public boolean f5772f;

    /* renamed from: t */
    public int f5773t;

    /* renamed from: u */
    public int f5774u;

    /* renamed from: v */
    public int f5775v;

    /* renamed from: w */
    public int f5776w;

    /* renamed from: x */
    public int f5777x;

    /* renamed from: y */
    public int f5778y;

    /* renamed from: z */
    public int f5779z;

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$a */
    public class C1097a implements View.OnClickListener {
        public C1097a() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f5789a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$b */
    public class C1098b implements View.OnClickListener {
        public C1098b() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f5789a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public PagerTabStrip(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f5766a = paint;
        this.f5767a = new Rect();
        this.f5779z = 255;
        this.f5770d = false;
        this.f5771e = false;
        int i = this.f5799r;
        this.f5773t = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f5774u = (int) ((3.0f * f) + 0.5f);
        this.f5775v = (int) ((6.0f * f) + 0.5f);
        this.f5776w = (int) (64.0f * f);
        this.f5778y = (int) ((16.0f * f) + 0.5f);
        this.f5764A = (int) ((1.0f * f) + 0.5f);
        this.f5777x = (int) ((f * 32.0f) + 0.5f);
        this.f5765B = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f5787a.setFocusable(true);
        this.f5787a.setOnClickListener(new C1097a());
        this.f5793c.setFocusable(true);
        this.f5793c.setOnClickListener(new C1098b());
        if (getBackground() == null) {
            this.f5770d = true;
        }
    }

    /* renamed from: c */
    public void mo7075c(int i, float f, boolean z) {
        Rect rect = this.f5767a;
        int height = getHeight();
        int left = this.f5791b.getLeft() - this.f5778y;
        int right = this.f5791b.getRight() + this.f5778y;
        int i2 = height - this.f5774u;
        rect.set(left, i2, right, height);
        super.mo7075c(i, f, z);
        this.f5779z = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f5791b.getLeft() - this.f5778y, i2, this.f5791b.getRight() + this.f5778y, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f5770d;
    }

    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f5777x);
    }

    @d10
    public int getTabIndicatorColor() {
        return this.f5773t;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f5791b.getLeft() - this.f5778y;
        int right = this.f5791b.getRight() + this.f5778y;
        this.f5766a.setColor((this.f5779z << 24) | (this.f5773t & jt4.f14542r));
        float f = (float) height;
        canvas.drawRect((float) left, (float) (height - this.f5774u), (float) right, f, this.f5766a);
        if (this.f5770d) {
            this.f5766a.setColor(-16777216 | (this.f5773t & jt4.f14542r));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f5764A), (float) (getWidth() - getPaddingRight()), f, this.f5766a);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewPager viewPager;
        int currentItem;
        int action = motionEvent.getAction();
        if (action != 0 && this.f5772f) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f5768c = x;
            this.f5769d = y;
            this.f5772f = false;
        } else if (action == 1) {
            if (x < ((float) (this.f5791b.getLeft() - this.f5778y))) {
                viewPager = this.f5789a;
                currentItem = viewPager.getCurrentItem() - 1;
            } else if (x > ((float) (this.f5791b.getRight() + this.f5778y))) {
                viewPager = this.f5789a;
                currentItem = viewPager.getCurrentItem() + 1;
            }
            viewPager.setCurrentItem(currentItem);
        } else if (action == 2 && (Math.abs(x - this.f5768c) > ((float) this.f5765B) || Math.abs(y - this.f5769d) > ((float) this.f5765B))) {
            this.f5772f = true;
        }
        return true;
    }

    public void setBackgroundColor(@d10 int i) {
        super.setBackgroundColor(i);
        if (!this.f5771e) {
            this.f5770d = (i & -16777216) == 0;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.f5771e) {
            this.f5770d = drawable == null;
        }
    }

    public void setBackgroundResource(@dp0 int i) {
        super.setBackgroundResource(i);
        if (!this.f5771e) {
            this.f5770d = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f5770d = z;
        this.f5771e = true;
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f5775v;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(@d10 int i) {
        this.f5773t = i;
        this.f5766a.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(@k10 int i) {
        setTabIndicatorColor(r70.m26353f(getContext(), i));
    }

    public void setTextSpacing(int i) {
        int i2 = this.f5776w;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }
}
