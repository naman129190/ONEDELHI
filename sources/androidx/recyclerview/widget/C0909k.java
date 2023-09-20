package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@hw4
/* renamed from: androidx.recyclerview.widget.k */
public class C0909k extends RecyclerView.C0818o implements RecyclerView.C0826s {

    /* renamed from: A */
    public static final int f4996A = 1500;

    /* renamed from: B */
    public static final int f4997B = 1200;

    /* renamed from: C */
    public static final int f4998C = 500;

    /* renamed from: D */
    public static final int f4999D = 255;

    /* renamed from: c */
    public static final int[] f5000c = {16842919};

    /* renamed from: d */
    public static final int[] f5001d = new int[0];

    /* renamed from: p */
    public static final int f5002p = 0;

    /* renamed from: q */
    public static final int f5003q = 1;

    /* renamed from: r */
    public static final int f5004r = 2;

    /* renamed from: s */
    public static final int f5005s = 0;

    /* renamed from: t */
    public static final int f5006t = 1;

    /* renamed from: u */
    public static final int f5007u = 2;

    /* renamed from: v */
    public static final int f5008v = 0;

    /* renamed from: w */
    public static final int f5009w = 1;

    /* renamed from: x */
    public static final int f5010x = 2;

    /* renamed from: y */
    public static final int f5011y = 3;

    /* renamed from: z */
    public static final int f5012z = 500;
    @hw4

    /* renamed from: a */
    public float f5013a;

    /* renamed from: a */
    public final int f5014a;

    /* renamed from: a */
    public final ValueAnimator f5015a;

    /* renamed from: a */
    public final Drawable f5016a;

    /* renamed from: a */
    public final StateListDrawable f5017a;

    /* renamed from: a */
    public final RecyclerView.C0827t f5018a;

    /* renamed from: a */
    public RecyclerView f5019a;

    /* renamed from: a */
    public final Runnable f5020a;

    /* renamed from: a */
    public boolean f5021a = false;

    /* renamed from: a */
    public final int[] f5022a = new int[2];
    @hw4

    /* renamed from: b */
    public float f5023b;

    /* renamed from: b */
    public final int f5024b;

    /* renamed from: b */
    public final Drawable f5025b;

    /* renamed from: b */
    public final StateListDrawable f5026b;

    /* renamed from: b */
    public boolean f5027b = false;

    /* renamed from: b */
    public final int[] f5028b = new int[2];

    /* renamed from: c */
    public final int f5029c;

    /* renamed from: d */
    public final int f5030d;

    /* renamed from: e */
    public final int f5031e;

    /* renamed from: f */
    public final int f5032f;
    @hw4

    /* renamed from: g */
    public int f5033g;
    @hw4

    /* renamed from: h */
    public int f5034h;
    @hw4

    /* renamed from: i */
    public int f5035i;
    @hw4

    /* renamed from: j */
    public int f5036j;

    /* renamed from: k */
    public int f5037k = 0;

    /* renamed from: l */
    public int f5038l = 0;

    /* renamed from: m */
    public int f5039m = 0;

    /* renamed from: n */
    public int f5040n = 0;

    /* renamed from: o */
    public int f5041o;

    /* renamed from: androidx.recyclerview.widget.k$a */
    public class C0910a implements Runnable {
        public C0910a() {
        }

        public void run() {
            C0909k.this.mo6363w(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$b */
    public class C0911b extends RecyclerView.C0827t {
        public C0911b() {
        }

        /* renamed from: b */
        public void mo5916b(RecyclerView recyclerView, int i, int i2) {
            C0909k.this.mo6350J(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$c */
    public class C0912c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f5045a = false;

        public C0912c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f5045a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f5045a) {
                this.f5045a = false;
            } else if (((Float) C0909k.this.f5015a.getAnimatedValue()).floatValue() == 0.0f) {
                C0909k kVar = C0909k.this;
                kVar.f5041o = 0;
                kVar.mo6347G(0);
            } else {
                C0909k kVar2 = C0909k.this;
                kVar2.f5041o = 2;
                kVar2.mo6344D();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$d */
    public class C0913d implements ValueAnimator.AnimatorUpdateListener {
        public C0913d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0909k.this.f5017a.setAlpha(floatValue);
            C0909k.this.f5016a.setAlpha(floatValue);
            C0909k.this.mo6344D();
        }
    }

    public C0909k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f5015a = ofFloat;
        this.f5041o = 0;
        this.f5020a = new C0910a();
        this.f5018a = new C0911b();
        this.f5017a = stateListDrawable;
        this.f5016a = drawable;
        this.f5026b = stateListDrawable2;
        this.f5025b = drawable2;
        this.f5029c = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f5030d = Math.max(i, drawable.getIntrinsicWidth());
        this.f5031e = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f5032f = Math.max(i, drawable2.getIntrinsicWidth());
        this.f5014a = i2;
        this.f5024b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0912c());
        ofFloat.addUpdateListener(new C0913d());
        mo6352l(recyclerView);
    }

    @hw4
    /* renamed from: A */
    public boolean mo6341A(float f, float f2) {
        if (f2 >= ((float) (this.f5038l - this.f5031e))) {
            int i = this.f5036j;
            int i2 = this.f5035i;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }

    @hw4
    /* renamed from: B */
    public boolean mo6342B(float f, float f2) {
        if (!mo6366z() ? f >= ((float) (this.f5037k - this.f5029c)) : f <= ((float) this.f5029c)) {
            int i = this.f5034h;
            int i2 = this.f5033g;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }

    @hw4
    /* renamed from: C */
    public boolean mo6343C() {
        return this.f5039m == 1;
    }

    /* renamed from: D */
    public void mo6344D() {
        this.f5019a.invalidate();
    }

    /* renamed from: E */
    public final void mo6345E(int i) {
        mo6353m();
        this.f5019a.postDelayed(this.f5020a, (long) i);
    }

    /* renamed from: F */
    public final int mo6346F(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: G */
    public void mo6347G(int i) {
        int i2;
        if (i == 2 && this.f5039m != 2) {
            this.f5017a.setState(f5000c);
            mo6353m();
        }
        if (i == 0) {
            mo6344D();
        } else {
            mo6349I();
        }
        if (this.f5039m != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.f5039m = i;
        }
        this.f5017a.setState(f5001d);
        i2 = f4997B;
        mo6345E(i2);
        this.f5039m = i;
    }

    /* renamed from: H */
    public final void mo6348H() {
        this.f5019a.mo5482n(this);
        this.f5019a.mo5503q(this);
        this.f5019a.mo5506r(this.f5018a);
    }

    /* renamed from: I */
    public void mo6349I() {
        int i = this.f5041o;
        if (i != 0) {
            if (i == 3) {
                this.f5015a.cancel();
            } else {
                return;
            }
        }
        this.f5041o = 1;
        ValueAnimator valueAnimator = this.f5015a;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f5015a.setDuration(500);
        this.f5015a.setStartDelay(0);
        this.f5015a.start();
    }

    /* renamed from: J */
    public void mo6350J(int i, int i2) {
        int computeVerticalScrollRange = this.f5019a.computeVerticalScrollRange();
        int i3 = this.f5038l;
        this.f5021a = computeVerticalScrollRange - i3 > 0 && i3 >= this.f5014a;
        int computeHorizontalScrollRange = this.f5019a.computeHorizontalScrollRange();
        int i4 = this.f5037k;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f5014a;
        this.f5027b = z;
        boolean z2 = this.f5021a;
        if (z2 || z) {
            if (z2) {
                float f = (float) i3;
                this.f5034h = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f5033g = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f5027b) {
                float f2 = (float) i4;
                this.f5036j = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f5035i = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f5039m;
            if (i5 == 0 || i5 == 1) {
                mo6347G(1);
            }
        } else if (this.f5039m != 0) {
            mo6347G(0);
        }
    }

    /* renamed from: K */
    public final void mo6351K(float f) {
        int[] t = mo6360t();
        float max = Math.max((float) t[0], Math.min((float) t[1], f));
        if (Math.abs(((float) this.f5034h) - max) >= 2.0f) {
            int F = mo6346F(this.f5013a, max, t, this.f5019a.computeVerticalScrollRange(), this.f5019a.computeVerticalScrollOffset(), this.f5038l);
            if (F != 0) {
                this.f5019a.scrollBy(0, F);
            }
            this.f5013a = max;
        }
    }

    /* renamed from: a */
    public void mo5569a(@mr2 RecyclerView recyclerView, @mr2 MotionEvent motionEvent) {
        if (this.f5039m != 0) {
            if (motionEvent.getAction() == 0) {
                boolean B = mo6342B(motionEvent.getX(), motionEvent.getY());
                boolean A = mo6341A(motionEvent.getX(), motionEvent.getY());
                if (B || A) {
                    if (A) {
                        this.f5040n = 1;
                        this.f5023b = (float) ((int) motionEvent.getX());
                    } else if (B) {
                        this.f5040n = 2;
                        this.f5013a = (float) ((int) motionEvent.getY());
                    }
                    mo6347G(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f5039m == 2) {
                this.f5013a = 0.0f;
                this.f5023b = 0.0f;
                mo6347G(1);
                this.f5040n = 0;
            } else if (motionEvent.getAction() == 2 && this.f5039m == 2) {
                mo6349I();
                if (this.f5040n == 1) {
                    mo6364x(motionEvent.getX());
                }
                if (this.f5040n == 2) {
                    mo6351K(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo5570b(@mr2 RecyclerView recyclerView, @mr2 MotionEvent motionEvent) {
        int i = this.f5039m;
        if (i != 1) {
            return i == 2;
        }
        boolean B = mo6342B(motionEvent.getX(), motionEvent.getY());
        boolean A = mo6341A(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!B && !A) {
            return false;
        }
        if (A) {
            this.f5040n = 1;
            this.f5023b = (float) ((int) motionEvent.getX());
        } else if (B) {
            this.f5040n = 2;
            this.f5013a = (float) ((int) motionEvent.getY());
        }
        mo6347G(2);
    }

    /* renamed from: d */
    public void mo5571d(boolean z) {
    }

    /* renamed from: k */
    public void mo5785k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0797c0 c0Var) {
        if (this.f5037k != this.f5019a.getWidth() || this.f5038l != this.f5019a.getHeight()) {
            this.f5037k = this.f5019a.getWidth();
            this.f5038l = this.f5019a.getHeight();
            mo6347G(0);
        } else if (this.f5041o != 0) {
            if (this.f5021a) {
                mo6356p(canvas);
            }
            if (this.f5027b) {
                mo6355o(canvas);
            }
        }
    }

    /* renamed from: l */
    public void mo6352l(@ts2 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5019a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                mo6354n();
            }
            this.f5019a = recyclerView;
            if (recyclerView != null) {
                mo6348H();
            }
        }
    }

    /* renamed from: m */
    public final void mo6353m() {
        this.f5019a.removeCallbacks(this.f5020a);
    }

    /* renamed from: n */
    public final void mo6354n() {
        this.f5019a.mo5516s1(this);
        this.f5019a.mo5547v1(this);
        this.f5019a.mo5549w1(this.f5018a);
        mo6353m();
    }

    /* renamed from: o */
    public final void mo6355o(Canvas canvas) {
        int i = this.f5038l;
        int i2 = this.f5031e;
        int i3 = i - i2;
        int i4 = this.f5036j;
        int i5 = this.f5035i;
        int i6 = i4 - (i5 / 2);
        this.f5026b.setBounds(0, 0, i5, i2);
        this.f5025b.setBounds(0, 0, this.f5037k, this.f5032f);
        canvas.translate(0.0f, (float) i3);
        this.f5025b.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f5026b.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: p */
    public final void mo6356p(Canvas canvas) {
        int i = this.f5037k;
        int i2 = this.f5029c;
        int i3 = i - i2;
        int i4 = this.f5034h;
        int i5 = this.f5033g;
        int i6 = i4 - (i5 / 2);
        this.f5017a.setBounds(0, 0, i2, i5);
        this.f5016a.setBounds(0, 0, this.f5030d, this.f5038l);
        if (mo6366z()) {
            this.f5016a.draw(canvas);
            canvas.translate((float) this.f5029c, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f5017a.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            i3 = this.f5029c;
        } else {
            canvas.translate((float) i3, 0.0f);
            this.f5016a.draw(canvas);
            canvas.translate(0.0f, (float) i6);
            this.f5017a.draw(canvas);
        }
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: q */
    public final int[] mo6357q() {
        int[] iArr = this.f5028b;
        int i = this.f5024b;
        iArr[0] = i;
        iArr[1] = this.f5037k - i;
        return iArr;
    }

    @hw4
    /* renamed from: r */
    public Drawable mo6358r() {
        return this.f5026b;
    }

    @hw4
    /* renamed from: s */
    public Drawable mo6359s() {
        return this.f5025b;
    }

    /* renamed from: t */
    public final int[] mo6360t() {
        int[] iArr = this.f5022a;
        int i = this.f5024b;
        iArr[0] = i;
        iArr[1] = this.f5038l - i;
        return iArr;
    }

    @hw4
    /* renamed from: u */
    public Drawable mo6361u() {
        return this.f5017a;
    }

    @hw4
    /* renamed from: v */
    public Drawable mo6362v() {
        return this.f5016a;
    }

    @hw4
    /* renamed from: w */
    public void mo6363w(int i) {
        int i2 = this.f5041o;
        if (i2 == 1) {
            this.f5015a.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f5041o = 3;
        ValueAnimator valueAnimator = this.f5015a;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f5015a.setDuration((long) i);
        this.f5015a.start();
    }

    /* renamed from: x */
    public final void mo6364x(float f) {
        int[] q = mo6357q();
        float max = Math.max((float) q[0], Math.min((float) q[1], f));
        if (Math.abs(((float) this.f5036j) - max) >= 2.0f) {
            int F = mo6346F(this.f5023b, max, q, this.f5019a.computeHorizontalScrollRange(), this.f5019a.computeHorizontalScrollOffset(), this.f5037k);
            if (F != 0) {
                this.f5019a.scrollBy(F, 0);
            }
            this.f5023b = max;
        }
    }

    /* renamed from: y */
    public boolean mo6365y() {
        return this.f5039m == 2;
    }

    /* renamed from: z */
    public final boolean mo6366z() {
        return jt4.m18928Z(this.f5019a) == 1;
    }
}
