package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.onedelhi.secure.C2104ev;
import com.onedelhi.secure.C2366hv;
import com.onedelhi.secure.C2461iv;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.rc3;
import com.onedelhi.secure.ts2;

public class CardView extends FrameLayout {

    /* renamed from: a */
    public static final C2461iv f1842a;

    /* renamed from: a */
    public static final int[] f1843a = {16842801};

    /* renamed from: a */
    public final Rect f1844a;

    /* renamed from: a */
    public final C2366hv f1845a;

    /* renamed from: b */
    public final Rect f1846b;

    /* renamed from: b */
    public boolean f1847b;

    /* renamed from: c */
    public boolean f1848c;

    /* renamed from: n */
    public int f1849n;

    /* renamed from: o */
    public int f1850o;

    /* renamed from: androidx.cardview.widget.CardView$a */
    public class C0375a implements C2366hv {

        /* renamed from: a */
        public Drawable f1851a;

        public C0375a() {
        }

        /* renamed from: a */
        public void mo2631a(int i, int i2, int i3, int i4) {
            CardView.this.f1846b.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1844a;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        /* renamed from: b */
        public boolean mo2632b() {
            return CardView.this.getPreventCornerOverlap();
        }

        /* renamed from: c */
        public Drawable mo2633c() {
            return this.f1851a;
        }

        /* renamed from: d */
        public void mo2634d(Drawable drawable) {
            this.f1851a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        /* renamed from: e */
        public boolean mo2635e() {
            return CardView.this.getUseCompatPadding();
        }

        /* renamed from: f */
        public View mo2636f() {
            return CardView.this;
        }

        /* renamed from: g */
        public void mo2637g(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.f1849n) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.f1850o) {
                CardView.super.setMinimumHeight(i2);
            }
        }
    }

    static {
        C2104ev evVar = new C2104ev();
        f1842a = evVar;
        evVar.mo14884e();
    }

    public CardView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public CardView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, rc3.C3404a.cardViewStyle);
    }

    public CardView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources;
        int i2;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1844a = rect;
        this.f1846b = new Rect();
        C0375a aVar = new C0375a();
        this.f1845a = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rc3.C3408e.CardView, i, rc3.C3407d.CardView);
        int i3 = rc3.C3408e.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i3)) {
            valueOf = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1843a);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i2 = rc3.C3405b.cardview_light_background;
            } else {
                resources = getResources();
                i2 = rc3.C3405b.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i2));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(rc3.C3408e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(rc3.C3408e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(rc3.C3408e.CardView_cardMaxElevation, 0.0f);
        this.f1847b = obtainStyledAttributes.getBoolean(rc3.C3408e.CardView_cardUseCompatPadding, false);
        this.f1848c = obtainStyledAttributes.getBoolean(rc3.C3408e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(rc3.C3408e.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(rc3.C3408e.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(rc3.C3408e.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(rc3.C3408e.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(rc3.C3408e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1849n = obtainStyledAttributes.getDimensionPixelSize(rc3.C3408e.CardView_android_minWidth, 0);
        this.f1850o = obtainStyledAttributes.getDimensionPixelSize(rc3.C3408e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f1842a.mo15600c(aVar, context, colorStateList, dimension, dimension2, f);
    }

    @mr2
    public ColorStateList getCardBackgroundColor() {
        return f1842a.mo15609m(this.f1845a);
    }

    public float getCardElevation() {
        return f1842a.mo15603g(this.f1845a);
    }

    @e83
    public int getContentPaddingBottom() {
        return this.f1844a.bottom;
    }

    @e83
    public int getContentPaddingLeft() {
        return this.f1844a.left;
    }

    @e83
    public int getContentPaddingRight() {
        return this.f1844a.right;
    }

    @e83
    public int getContentPaddingTop() {
        return this.f1844a.top;
    }

    public float getMaxCardElevation() {
        return f1842a.mo15608l(this.f1845a);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1848c;
    }

    public float getRadius() {
        return f1842a.mo15605i(this.f1845a);
    }

    public boolean getUseCompatPadding() {
        return this.f1847b;
    }

    public void onMeasure(int i, int i2) {
        C2461iv ivVar = f1842a;
        if (!(ivVar instanceof C2104ev)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) ivVar.mo15611o(this.f1845a)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) ivVar.mo15607k(this.f1845a)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(@d10 int i) {
        f1842a.mo15610n(this.f1845a, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(@ts2 ColorStateList colorStateList) {
        f1842a.mo15610n(this.f1845a, colorStateList);
    }

    public void setCardElevation(float f) {
        f1842a.mo15606j(this.f1845a, f);
    }

    public void setContentPadding(@e83 int i, @e83 int i2, @e83 int i3, @e83 int i4) {
        this.f1844a.set(i, i2, i3, i4);
        f1842a.mo15602f(this.f1845a);
    }

    public void setMaxCardElevation(float f) {
        f1842a.mo15601d(this.f1845a, f);
    }

    public void setMinimumHeight(int i) {
        this.f1850o = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f1849n = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1848c) {
            this.f1848c = z;
            f1842a.mo15599b(this.f1845a);
        }
    }

    public void setRadius(float f) {
        f1842a.mo15604h(this.f1845a, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1847b != z) {
            this.f1847b = z;
            f1842a.mo15598a(this.f1845a);
        }
    }
}
