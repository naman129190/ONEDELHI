package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.eu1;
import com.onedelhi.secure.fu1;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sb3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.yf1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.m */
public class C0918m extends RecyclerView.C0818o implements RecyclerView.C0824q {

    /* renamed from: a */
    public static final String f5062a = "ItemTouchHelper";

    /* renamed from: a */
    public static final boolean f5063a = false;

    /* renamed from: f */
    public static final int f5064f = 1;

    /* renamed from: g */
    public static final int f5065g = 2;

    /* renamed from: h */
    public static final int f5066h = 4;

    /* renamed from: i */
    public static final int f5067i = 8;

    /* renamed from: j */
    public static final int f5068j = 16;

    /* renamed from: k */
    public static final int f5069k = 32;

    /* renamed from: l */
    public static final int f5070l = 0;

    /* renamed from: m */
    public static final int f5071m = 1;

    /* renamed from: n */
    public static final int f5072n = 2;

    /* renamed from: o */
    public static final int f5073o = 2;

    /* renamed from: p */
    public static final int f5074p = 4;

    /* renamed from: q */
    public static final int f5075q = 8;

    /* renamed from: r */
    public static final int f5076r = -1;

    /* renamed from: s */
    public static final int f5077s = 8;

    /* renamed from: t */
    public static final int f5078t = 255;

    /* renamed from: u */
    public static final int f5079u = 65280;

    /* renamed from: v */
    public static final int f5080v = 16711680;

    /* renamed from: w */
    public static final int f5081w = 1000;

    /* renamed from: a */
    public float f5082a;

    /* renamed from: a */
    public int f5083a = -1;

    /* renamed from: a */
    public long f5084a;

    /* renamed from: a */
    public Rect f5085a;

    /* renamed from: a */
    public VelocityTracker f5086a;

    /* renamed from: a */
    public View f5087a = null;

    /* renamed from: a */
    public RecyclerView.C0803f0 f5088a = null;

    /* renamed from: a */
    public RecyclerView.C0809k f5089a = null;

    /* renamed from: a */
    public final RecyclerView.C0826s f5090a = new C0920b();

    /* renamed from: a */
    public RecyclerView f5091a;
    @mr2

    /* renamed from: a */
    public C0924f f5092a;

    /* renamed from: a */
    public C0927g f5093a;

    /* renamed from: a */
    public yf1 f5094a;

    /* renamed from: a */
    public final Runnable f5095a = new C0919a();

    /* renamed from: a */
    public final List<View> f5096a = new ArrayList();

    /* renamed from: a */
    public final float[] f5097a = new float[2];

    /* renamed from: b */
    public float f5098b;

    /* renamed from: b */
    public int f5099b = 0;
    @hw4

    /* renamed from: b */
    public List<C0928h> f5100b = new ArrayList();

    /* renamed from: c */
    public float f5101c;

    /* renamed from: c */
    public int f5102c;

    /* renamed from: c */
    public List<RecyclerView.C0803f0> f5103c;

    /* renamed from: d */
    public float f5104d;

    /* renamed from: d */
    public int f5105d;

    /* renamed from: d */
    public List<Integer> f5106d;

    /* renamed from: e */
    public float f5107e;

    /* renamed from: e */
    public int f5108e = -1;

    /* renamed from: f */
    public float f5109f;

    /* renamed from: g */
    public float f5110g;

    /* renamed from: h */
    public float f5111h;

    /* renamed from: androidx.recyclerview.widget.m$a */
    public class C0919a implements Runnable {
        public C0919a() {
        }

        public void run() {
            C0918m mVar = C0918m.this;
            if (mVar.f5088a != null && mVar.mo6392E()) {
                C0918m mVar2 = C0918m.this;
                RecyclerView.C0803f0 f0Var = mVar2.f5088a;
                if (f0Var != null) {
                    mVar2.mo6414z(f0Var);
                }
                C0918m mVar3 = C0918m.this;
                mVar3.f5091a.removeCallbacks(mVar3.f5095a);
                jt4.m18993p1(C0918m.this.f5091a, this);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$b */
    public class C0920b implements RecyclerView.C0826s {
        public C0920b() {
        }

        /* renamed from: a */
        public void mo5569a(@mr2 RecyclerView recyclerView, @mr2 MotionEvent motionEvent) {
            C0918m.this.f5094a.mo27444b(motionEvent);
            VelocityTracker velocityTracker = C0918m.this.f5086a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C0918m.this.f5083a != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(C0918m.this.f5083a);
                if (findPointerIndex >= 0) {
                    C0918m.this.mo6404o(actionMasked, motionEvent, findPointerIndex);
                }
                C0918m mVar = C0918m.this;
                RecyclerView.C0803f0 f0Var = mVar.f5088a;
                if (f0Var != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = mVar.f5086a;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                C0918m mVar2 = C0918m.this;
                                if (pointerId == mVar2.f5083a) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    mVar2.f5083a = motionEvent.getPointerId(i);
                                    C0918m mVar3 = C0918m.this;
                                    mVar3.mo6400M(motionEvent, mVar3.f5102c, actionIndex);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (findPointerIndex >= 0) {
                            mVar.mo6400M(motionEvent, mVar.f5102c, findPointerIndex);
                            C0918m.this.mo6414z(f0Var);
                            C0918m mVar4 = C0918m.this;
                            mVar4.f5091a.removeCallbacks(mVar4.f5095a);
                            C0918m.this.f5095a.run();
                            C0918m.this.f5091a.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    C0918m.this.mo6393F((RecyclerView.C0803f0) null, 0);
                    C0918m.this.f5083a = -1;
                }
            }
        }

        /* renamed from: b */
        public boolean mo5570b(@mr2 RecyclerView recyclerView, @mr2 MotionEvent motionEvent) {
            int findPointerIndex;
            C0928h s;
            C0918m.this.f5094a.mo27444b(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C0918m.this.f5083a = motionEvent.getPointerId(0);
                C0918m.this.f5082a = motionEvent.getX();
                C0918m.this.f5098b = motionEvent.getY();
                C0918m.this.mo6388A();
                C0918m mVar = C0918m.this;
                if (mVar.f5088a == null && (s = mVar.mo6408s(motionEvent)) != null) {
                    C0918m mVar2 = C0918m.this;
                    mVar2.f5082a -= s.f5142e;
                    mVar2.f5098b -= s.f5143f;
                    mVar2.mo6407r(s.f5134a, true);
                    if (C0918m.this.f5096a.remove(s.f5134a.f4609a)) {
                        C0918m mVar3 = C0918m.this;
                        mVar3.f5092a.mo6424c(mVar3.f5091a, s.f5134a);
                    }
                    C0918m.this.mo6393F(s.f5134a, s.f5132a);
                    C0918m mVar4 = C0918m.this;
                    mVar4.mo6400M(motionEvent, mVar4.f5102c, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C0918m mVar5 = C0918m.this;
                mVar5.f5083a = -1;
                mVar5.mo6393F((RecyclerView.C0803f0) null, 0);
            } else {
                int i = C0918m.this.f5083a;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    C0918m.this.mo6404o(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = C0918m.this.f5086a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return C0918m.this.f5088a != null;
        }

        /* renamed from: d */
        public void mo5571d(boolean z) {
            if (z) {
                C0918m.this.mo6393F((RecyclerView.C0803f0) null, 0);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$c */
    public class C0921c extends C0928h {

        /* renamed from: a */
        public final /* synthetic */ C0918m f5114a;

        /* renamed from: b */
        public final /* synthetic */ RecyclerView.C0803f0 f5115b;

        /* renamed from: c */
        public final /* synthetic */ int f5116c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0921c(C0918m mVar, RecyclerView.C0803f0 f0Var, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.C0803f0 f0Var2) {
            super(f0Var, i, i2, f, f2, f3, f4);
            this.f5114a = mVar;
            this.f5116c = i3;
            this.f5115b = f0Var2;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f5138b) {
                if (this.f5116c <= 0) {
                    C0918m mVar = this.f5114a;
                    mVar.f5092a.mo6424c(mVar.f5091a, this.f5115b);
                } else {
                    this.f5114a.f5096a.add(this.f5115b.f4609a);
                    this.f5135a = true;
                    int i = this.f5116c;
                    if (i > 0) {
                        this.f5114a.mo6389B(this, i);
                    }
                }
                C0918m mVar2 = this.f5114a;
                View view = mVar2.f5087a;
                View view2 = this.f5115b.f4609a;
                if (view == view2) {
                    mVar2.mo6391D(view2);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$d */
    public class C0922d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C0928h f5117a;

        /* renamed from: n */
        public final /* synthetic */ int f5119n;

        public C0922d(C0928h hVar, int i) {
            this.f5117a = hVar;
            this.f5119n = i;
        }

        public void run() {
            RecyclerView recyclerView = C0918m.this.f5091a;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                C0928h hVar = this.f5117a;
                if (!hVar.f5138b && hVar.f5134a.mo5680j() != -1) {
                    RecyclerView.C0812m itemAnimator = C0918m.this.f5091a.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.mo5767r((RecyclerView.C0812m.C0814b) null)) && !C0918m.this.mo6413x()) {
                        C0918m.this.f5092a.mo6421D(this.f5117a.f5134a, this.f5119n);
                    } else {
                        C0918m.this.f5091a.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$e */
    public class C0923e implements RecyclerView.C0809k {
        public C0923e() {
        }

        /* renamed from: a */
        public int mo5746a(int i, int i2) {
            C0918m mVar = C0918m.this;
            View view = mVar.f5087a;
            if (view == null) {
                return i2;
            }
            int i3 = mVar.f5108e;
            if (i3 == -1) {
                i3 = mVar.f5091a.indexOfChild(view);
                C0918m.this.f5108e = i3;
            }
            return i2 == i + -1 ? i3 : i2 < i3 ? i2 : i2 + 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$f */
    public static abstract class C0924f {

        /* renamed from: a */
        public static final long f5121a = 2000;

        /* renamed from: a */
        public static final Interpolator f5122a = new C0925a();

        /* renamed from: b */
        public static final int f5123b = 200;

        /* renamed from: b */
        public static final Interpolator f5124b = new C0926b();

        /* renamed from: c */
        public static final int f5125c = 250;

        /* renamed from: d */
        public static final int f5126d = 3158064;

        /* renamed from: e */
        public static final int f5127e = 789516;

        /* renamed from: a */
        public int f5128a = -1;

        /* renamed from: androidx.recyclerview.widget.m$f$a */
        public class C0925a implements Interpolator {
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: androidx.recyclerview.widget.m$f$b */
        public class C0926b implements Interpolator {
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        /* renamed from: e */
        public static int m6414e(int i, int i2) {
            int i3;
            int i4 = i & f5127e;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= -789517 & i6;
                i3 = (i6 & f5127e) << 2;
            }
            return i5 | i3;
        }

        @mr2
        /* renamed from: i */
        public static eu1 m6415i() {
            return fu1.f12331a;
        }

        /* renamed from: u */
        public static int m6416u(int i, int i2) {
            return i2 << (i * 8);
        }

        /* renamed from: v */
        public static int m6417v(int i, int i2) {
            int u = m6416u(0, i2 | i);
            return m6416u(2, i) | m6416u(1, i2) | u;
        }

        /* renamed from: A */
        public abstract boolean mo6418A(@mr2 RecyclerView recyclerView, @mr2 RecyclerView.C0803f0 f0Var, @mr2 RecyclerView.C0803f0 f0Var2);

        /* renamed from: B */
        public void mo6419B(@mr2 RecyclerView recyclerView, @mr2 RecyclerView.C0803f0 f0Var, int i, @mr2 RecyclerView.C0803f0 f0Var2, int i2, int i3, int i4) {
            RecyclerView.C0819p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof C0931j) {
                ((C0931j) layoutManager).mo5286b(f0Var.f4609a, f0Var2.f4609a, i3, i4);
                return;
            }
            if (layoutManager.mo5304n()) {
                if (layoutManager.mo5846Y(f0Var2.f4609a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.mo5372G1(i2);
                }
                if (layoutManager.mo5852b0(f0Var2.f4609a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.mo5372G1(i2);
                }
            }
            if (layoutManager.mo5307o()) {
                if (layoutManager.mo5855c0(f0Var2.f4609a) <= recyclerView.getPaddingTop()) {
                    recyclerView.mo5372G1(i2);
                }
                if (layoutManager.mo5840W(f0Var2.f4609a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.mo5372G1(i2);
                }
            }
        }

        /* renamed from: C */
        public void mo6420C(@ts2 RecyclerView.C0803f0 f0Var, int i) {
            if (f0Var != null) {
                fu1.f12331a.mo15594a(f0Var.f4609a);
            }
        }

        /* renamed from: D */
        public abstract void mo6421D(@mr2 RecyclerView.C0803f0 f0Var, int i);

        /* renamed from: a */
        public boolean mo6422a(@mr2 RecyclerView recyclerView, @mr2 RecyclerView.C0803f0 f0Var, @mr2 RecyclerView.C0803f0 f0Var2) {
            return true;
        }

        /* renamed from: b */
        public RecyclerView.C0803f0 mo6423b(@mr2 RecyclerView.C0803f0 f0Var, @mr2 List<RecyclerView.C0803f0> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            RecyclerView.C0803f0 f0Var2 = f0Var;
            int width = i + f0Var2.f4609a.getWidth();
            int height = i2 + f0Var2.f4609a.getHeight();
            int left2 = i - f0Var2.f4609a.getLeft();
            int top2 = i2 - f0Var2.f4609a.getTop();
            int size = list.size();
            RecyclerView.C0803f0 f0Var3 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.C0803f0 f0Var4 = list.get(i4);
                if (left2 > 0 && (right = f0Var4.f4609a.getRight() - width) < 0 && f0Var4.f4609a.getRight() > f0Var2.f4609a.getRight() && (abs4 = Math.abs(right)) > i3) {
                    f0Var3 = f0Var4;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = f0Var4.f4609a.getLeft() - i) > 0 && f0Var4.f4609a.getLeft() < f0Var2.f4609a.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    f0Var3 = f0Var4;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = f0Var4.f4609a.getTop() - i2) > 0 && f0Var4.f4609a.getTop() < f0Var2.f4609a.getTop() && (abs2 = Math.abs(top)) > i3) {
                    f0Var3 = f0Var4;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = f0Var4.f4609a.getBottom() - height) < 0 && f0Var4.f4609a.getBottom() > f0Var2.f4609a.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    f0Var3 = f0Var4;
                    i3 = abs;
                }
            }
            return f0Var3;
        }

        /* renamed from: c */
        public void mo6424c(@mr2 RecyclerView recyclerView, @mr2 RecyclerView.C0803f0 f0Var) {
            fu1.f12331a.mo15595b(f0Var.f4609a);
        }

        /* renamed from: d */
        public int mo6425d(int i, int i2) {
            int i3;
            int i4 = i & f5126d;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= -3158065 & i6;
                i3 = (i6 & f5126d) >> 2;
            }
            return i5 | i3;
        }

        /* renamed from: f */
        public final int mo6426f(RecyclerView recyclerView, RecyclerView.C0803f0 f0Var) {
            return mo6425d(mo6431l(recyclerView, f0Var), jt4.m18928Z(recyclerView));
        }

        /* renamed from: g */
        public long mo6427g(@mr2 RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.C0812m itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i == 8 ? 200 : 250 : i == 8 ? itemAnimator.mo5764o() : itemAnimator.mo5765p();
        }

        /* renamed from: h */
        public int mo6428h() {
            return 0;
        }

        /* renamed from: j */
        public final int mo6429j(RecyclerView recyclerView) {
            if (this.f5128a == -1) {
                this.f5128a = recyclerView.getResources().getDimensionPixelSize(sb3.C3487c.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f5128a;
        }

        /* renamed from: k */
        public float mo6430k(@mr2 RecyclerView.C0803f0 f0Var) {
            return 0.5f;
        }

        /* renamed from: l */
        public abstract int mo6431l(@mr2 RecyclerView recyclerView, @mr2 RecyclerView.C0803f0 f0Var);

        /* renamed from: m */
        public float mo6432m(float f) {
            return f;
        }

        /* renamed from: n */
        public float mo6433n(@mr2 RecyclerView.C0803f0 f0Var) {
            return 0.5f;
        }

        /* renamed from: o */
        public float mo6434o(float f) {
            return f;
        }

        /* renamed from: p */
        public boolean mo6435p(RecyclerView recyclerView, RecyclerView.C0803f0 f0Var) {
            return (mo6426f(recyclerView, f0Var) & C0918m.f5080v) != 0;
        }

        /* renamed from: q */
        public boolean mo6436q(RecyclerView recyclerView, RecyclerView.C0803f0 f0Var) {
            return (mo6426f(recyclerView, f0Var) & 65280) != 0;
        }

        /* renamed from: r */
        public int mo6437r(@mr2 RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i2)) * mo6429j(recyclerView))) * f5124b.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
            if (j <= 2000) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (((float) signum) * f5122a.getInterpolation(f));
            return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
        }

        /* renamed from: s */
        public boolean mo6438s() {
            return true;
        }

        /* renamed from: t */
        public boolean mo6439t() {
            return true;
        }

        /* renamed from: w */
        public void mo6440w(@mr2 Canvas canvas, @mr2 RecyclerView recyclerView, @mr2 RecyclerView.C0803f0 f0Var, float f, float f2, int i, boolean z) {
            fu1.f12331a.mo15597d(canvas, recyclerView, f0Var.f4609a, f, f2, i, z);
        }

        /* renamed from: x */
        public void mo6441x(@mr2 Canvas canvas, @mr2 RecyclerView recyclerView, RecyclerView.C0803f0 f0Var, float f, float f2, int i, boolean z) {
            fu1.f12331a.mo15596c(canvas, recyclerView, f0Var.f4609a, f, f2, i, z);
        }

        /* renamed from: y */
        public void mo6442y(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0803f0 f0Var, List<C0928h> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0928h hVar = list.get(i2);
                hVar.mo6453e();
                int save = canvas.save();
                mo6440w(canvas, recyclerView, hVar.f5134a, hVar.f5142e, hVar.f5143f, hVar.f5132a, false);
                canvas.restoreToCount(save);
            }
            if (f0Var != null) {
                int save2 = canvas.save();
                mo6440w(canvas, recyclerView, f0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        /* renamed from: z */
        public void mo6443z(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0803f0 f0Var, List<C0928h> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            List<C0928h> list2 = list;
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C0928h hVar = list2.get(i2);
                int save = canvas.save();
                mo6441x(canvas, recyclerView, hVar.f5134a, hVar.f5142e, hVar.f5143f, hVar.f5132a, false);
                canvas.restoreToCount(save);
            }
            if (f0Var != null) {
                int save2 = canvas.save();
                mo6441x(canvas, recyclerView, f0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C0928h hVar2 = list2.get(i3);
                boolean z2 = hVar2.f5140c;
                if (z2 && !hVar2.f5135a) {
                    list2.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$g */
    public class C0927g extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        public boolean f5130a = true;

        public C0927g() {
        }

        /* renamed from: a */
        public void mo6446a() {
            this.f5130a = false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View t;
            RecyclerView.C0803f0 t0;
            int i;
            if (this.f5130a && (t = C0918m.this.mo6409t(motionEvent)) != null && (t0 = C0918m.this.f5091a.mo5541t0(t)) != null) {
                C0918m mVar = C0918m.this;
                if (mVar.f5092a.mo6435p(mVar.f5091a, t0) && motionEvent.getPointerId(0) == (i = C0918m.this.f5083a)) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    C0918m mVar2 = C0918m.this;
                    mVar2.f5082a = x;
                    mVar2.f5098b = y;
                    mVar2.f5109f = 0.0f;
                    mVar2.f5107e = 0.0f;
                    if (mVar2.f5092a.mo6439t()) {
                        C0918m.this.mo6393F(t0, 2);
                    }
                }
            }
        }
    }

    @hw4
    /* renamed from: androidx.recyclerview.widget.m$h */
    public static class C0928h implements Animator.AnimatorListener {

        /* renamed from: a */
        public final float f5131a;

        /* renamed from: a */
        public final int f5132a;
        @hw4

        /* renamed from: a */
        public final ValueAnimator f5133a;

        /* renamed from: a */
        public final RecyclerView.C0803f0 f5134a;

        /* renamed from: a */
        public boolean f5135a;

        /* renamed from: b */
        public final float f5136b;

        /* renamed from: b */
        public final int f5137b;

        /* renamed from: b */
        public boolean f5138b = false;

        /* renamed from: c */
        public final float f5139c;

        /* renamed from: c */
        public boolean f5140c = false;

        /* renamed from: d */
        public final float f5141d;

        /* renamed from: e */
        public float f5142e;

        /* renamed from: f */
        public float f5143f;

        /* renamed from: g */
        public float f5144g;

        /* renamed from: androidx.recyclerview.widget.m$h$a */
        public class C0929a implements ValueAnimator.AnimatorUpdateListener {
            public C0929a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0928h.this.mo6451c(valueAnimator.getAnimatedFraction());
            }
        }

        public C0928h(RecyclerView.C0803f0 f0Var, int i, int i2, float f, float f2, float f3, float f4) {
            this.f5132a = i2;
            this.f5137b = i;
            this.f5134a = f0Var;
            this.f5131a = f;
            this.f5136b = f2;
            this.f5139c = f3;
            this.f5141d = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f5133a = ofFloat;
            ofFloat.addUpdateListener(new C0929a());
            ofFloat.setTarget(f0Var.f4609a);
            ofFloat.addListener(this);
            mo6451c(0.0f);
        }

        /* renamed from: a */
        public void mo6449a() {
            this.f5133a.cancel();
        }

        /* renamed from: b */
        public void mo6450b(long j) {
            this.f5133a.setDuration(j);
        }

        /* renamed from: c */
        public void mo6451c(float f) {
            this.f5144g = f;
        }

        /* renamed from: d */
        public void mo6452d() {
            this.f5134a.mo5664K(false);
            this.f5133a.start();
        }

        /* renamed from: e */
        public void mo6453e() {
            float f = this.f5131a;
            float f2 = this.f5139c;
            this.f5142e = f == f2 ? this.f5134a.f4609a.getTranslationX() : f + (this.f5144g * (f2 - f));
            float f3 = this.f5136b;
            float f4 = this.f5141d;
            this.f5143f = f3 == f4 ? this.f5134a.f4609a.getTranslationY() : f3 + (this.f5144g * (f4 - f3));
        }

        public void onAnimationCancel(Animator animator) {
            mo6451c(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f5140c) {
                this.f5134a.mo5664K(true);
            }
            this.f5140c = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$i */
    public static abstract class C0930i extends C0924f {

        /* renamed from: f */
        public int f5146f;

        /* renamed from: g */
        public int f5147g;

        public C0930i(int i, int i2) {
            this.f5146f = i2;
            this.f5147g = i;
        }

        /* renamed from: E */
        public int mo6458E(@mr2 RecyclerView recyclerView, @mr2 RecyclerView.C0803f0 f0Var) {
            return this.f5147g;
        }

        /* renamed from: F */
        public int mo6459F(@mr2 RecyclerView recyclerView, @mr2 RecyclerView.C0803f0 f0Var) {
            return this.f5146f;
        }

        /* renamed from: G */
        public void mo6460G(int i) {
            this.f5147g = i;
        }

        /* renamed from: H */
        public void mo6461H(int i) {
            this.f5146f = i;
        }

        /* renamed from: l */
        public int mo6431l(@mr2 RecyclerView recyclerView, @mr2 RecyclerView.C0803f0 f0Var) {
            return C0924f.m6417v(mo6458E(recyclerView, f0Var), mo6459F(recyclerView, f0Var));
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$j */
    public interface C0931j {
        /* renamed from: b */
        void mo5286b(@mr2 View view, @mr2 View view2, int i, int i2);
    }

    public C0918m(@mr2 C0924f fVar) {
        this.f5092a = fVar;
    }

    /* renamed from: y */
    public static boolean m6377y(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* renamed from: A */
    public void mo6388A() {
        VelocityTracker velocityTracker = this.f5086a;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f5086a = VelocityTracker.obtain();
    }

    /* renamed from: B */
    public void mo6389B(C0928h hVar, int i) {
        this.f5091a.post(new C0922d(hVar, i));
    }

    /* renamed from: C */
    public final void mo6390C() {
        VelocityTracker velocityTracker = this.f5086a;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5086a = null;
        }
    }

    /* renamed from: D */
    public void mo6391D(View view) {
        if (view == this.f5087a) {
            this.f5087a = null;
            if (this.f5089a != null) {
                this.f5091a.setChildDrawingOrderCallback((RecyclerView.C0809k) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c1, code lost:
        if (r1 > 0) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010c  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6392E() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.RecyclerView$f0 r1 = r0.f5088a
            r2 = 0
            r3 = -9223372036854775808
            if (r1 != 0) goto L_0x000c
            r0.f5084a = r3
            return r2
        L_0x000c:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.f5084a
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0019
            r7 = 0
            goto L_0x001b
        L_0x0019:
            long r7 = r5 - r7
        L_0x001b:
            androidx.recyclerview.widget.RecyclerView r1 = r0.f5091a
            androidx.recyclerview.widget.RecyclerView$p r1 = r1.getLayoutManager()
            android.graphics.Rect r9 = r0.f5085a
            if (r9 != 0) goto L_0x002c
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r0.f5085a = r9
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView$f0 r9 = r0.f5088a
            android.view.View r9 = r9.f4609a
            android.graphics.Rect r10 = r0.f5085a
            r1.mo5883m(r9, r10)
            boolean r9 = r1.mo5304n()
            r10 = 0
            if (r9 == 0) goto L_0x007d
            float r9 = r0.f5110g
            float r11 = r0.f5107e
            float r9 = r9 + r11
            int r9 = (int) r9
            android.graphics.Rect r11 = r0.f5085a
            int r11 = r11.left
            int r11 = r9 - r11
            androidx.recyclerview.widget.RecyclerView r12 = r0.f5091a
            int r12 = r12.getPaddingLeft()
            int r11 = r11 - r12
            float r12 = r0.f5107e
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x0059
            if (r11 >= 0) goto L_0x0059
            r12 = r11
            goto L_0x007e
        L_0x0059:
            int r11 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x007d
            androidx.recyclerview.widget.RecyclerView$f0 r11 = r0.f5088a
            android.view.View r11 = r11.f4609a
            int r11 = r11.getWidth()
            int r9 = r9 + r11
            android.graphics.Rect r11 = r0.f5085a
            int r11 = r11.right
            int r9 = r9 + r11
            androidx.recyclerview.widget.RecyclerView r11 = r0.f5091a
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f5091a
            int r12 = r12.getPaddingRight()
            int r11 = r11 - r12
            int r9 = r9 - r11
            if (r9 <= 0) goto L_0x007d
            r12 = r9
            goto L_0x007e
        L_0x007d:
            r12 = 0
        L_0x007e:
            boolean r1 = r1.mo5307o()
            if (r1 == 0) goto L_0x00c4
            float r1 = r0.f5111h
            float r9 = r0.f5109f
            float r1 = r1 + r9
            int r1 = (int) r1
            android.graphics.Rect r9 = r0.f5085a
            int r9 = r9.top
            int r9 = r1 - r9
            androidx.recyclerview.widget.RecyclerView r11 = r0.f5091a
            int r11 = r11.getPaddingTop()
            int r9 = r9 - r11
            float r11 = r0.f5109f
            int r13 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x00a1
            if (r9 >= 0) goto L_0x00a1
            r1 = r9
            goto L_0x00c5
        L_0x00a1:
            int r9 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c4
            androidx.recyclerview.widget.RecyclerView$f0 r9 = r0.f5088a
            android.view.View r9 = r9.f4609a
            int r9 = r9.getHeight()
            int r1 = r1 + r9
            android.graphics.Rect r9 = r0.f5085a
            int r9 = r9.bottom
            int r1 = r1 + r9
            androidx.recyclerview.widget.RecyclerView r9 = r0.f5091a
            int r9 = r9.getHeight()
            androidx.recyclerview.widget.RecyclerView r10 = r0.f5091a
            int r10 = r10.getPaddingBottom()
            int r9 = r9 - r10
            int r1 = r1 - r9
            if (r1 <= 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r1 = 0
        L_0x00c5:
            if (r12 == 0) goto L_0x00de
            androidx.recyclerview.widget.m$f r9 = r0.f5092a
            androidx.recyclerview.widget.RecyclerView r10 = r0.f5091a
            androidx.recyclerview.widget.RecyclerView$f0 r11 = r0.f5088a
            android.view.View r11 = r11.f4609a
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r13 = r0.f5091a
            int r13 = r13.getWidth()
            r14 = r7
            int r12 = r9.mo6437r(r10, r11, r12, r13, r14)
        L_0x00de:
            r14 = r12
            if (r1 == 0) goto L_0x00fd
            androidx.recyclerview.widget.m$f r9 = r0.f5092a
            androidx.recyclerview.widget.RecyclerView r10 = r0.f5091a
            androidx.recyclerview.widget.RecyclerView$f0 r11 = r0.f5088a
            android.view.View r11 = r11.f4609a
            int r11 = r11.getHeight()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f5091a
            int r13 = r12.getHeight()
            r12 = r1
            r1 = r14
            r14 = r7
            int r7 = r9.mo6437r(r10, r11, r12, r13, r14)
            r12 = r1
            r1 = r7
            goto L_0x00fe
        L_0x00fd:
            r12 = r14
        L_0x00fe:
            if (r12 != 0) goto L_0x0106
            if (r1 == 0) goto L_0x0103
            goto L_0x0106
        L_0x0103:
            r0.f5084a = r3
            return r2
        L_0x0106:
            long r7 = r0.f5084a
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x010e
            r0.f5084a = r5
        L_0x010e:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f5091a
            r2.scrollBy(r12, r1)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0918m.mo6392E():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0137  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6393F(@com.onedelhi.secure.ts2 androidx.recyclerview.widget.RecyclerView.C0803f0 r24, int r25) {
        /*
            r23 = this;
            r11 = r23
            r12 = r24
            r13 = r25
            androidx.recyclerview.widget.RecyclerView$f0 r0 = r11.f5088a
            if (r12 != r0) goto L_0x000f
            int r0 = r11.f5099b
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.f5084a = r0
            int r4 = r11.f5099b
            r14 = 1
            r11.mo6407r(r12, r14)
            r11.f5099b = r13
            r15 = 2
            if (r13 != r15) goto L_0x0030
            if (r12 == 0) goto L_0x0028
            android.view.View r0 = r12.f4609a
            r11.f5087a = r0
            r23.mo6401l()
            goto L_0x0030
        L_0x0028:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + -1
            androidx.recyclerview.widget.RecyclerView$f0 r9 = r11.f5088a
            r8 = 0
            if (r9 == 0) goto L_0x00ee
            android.view.View r0 = r9.f4609a
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x00da
            if (r4 != r15) goto L_0x004a
            r7 = 0
            goto L_0x004f
        L_0x004a:
            int r0 = r11.mo6399L(r9)
            r7 = r0
        L_0x004f:
            r23.mo6390C()
            r0 = 4
            r1 = 0
            if (r7 == r14) goto L_0x007b
            if (r7 == r15) goto L_0x007b
            if (r7 == r0) goto L_0x0067
            if (r7 == r10) goto L_0x0067
            r2 = 16
            if (r7 == r2) goto L_0x0067
            r2 = 32
            if (r7 == r2) goto L_0x0067
            r17 = 0
            goto L_0x0078
        L_0x0067:
            float r2 = r11.f5107e
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f5091a
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            r17 = r2
        L_0x0078:
            r18 = 0
            goto L_0x008e
        L_0x007b:
            float r2 = r11.f5109f
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f5091a
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r18 = r2
            r17 = 0
        L_0x008e:
            if (r4 != r15) goto L_0x0093
            r6 = 8
            goto L_0x0098
        L_0x0093:
            if (r7 <= 0) goto L_0x0097
            r6 = 2
            goto L_0x0098
        L_0x0097:
            r6 = 4
        L_0x0098:
            float[] r0 = r11.f5097a
            r11.mo6412w(r0)
            float[] r0 = r11.f5097a
            r19 = r0[r8]
            r20 = r0[r14]
            androidx.recyclerview.widget.m$c r5 = new androidx.recyclerview.widget.m$c
            r0 = r5
            r1 = r23
            r2 = r9
            r3 = r6
            r14 = r5
            r5 = r19
            r15 = r6
            r6 = r20
            r21 = r7
            r7 = r17
            r8 = r18
            r22 = r9
            r9 = r21
            r21 = 8
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.recyclerview.widget.m$f r0 = r11.f5092a
            androidx.recyclerview.widget.RecyclerView r1 = r11.f5091a
            float r2 = r17 - r19
            float r3 = r18 - r20
            long r0 = r0.mo6427g(r1, r15, r2, r3)
            r14.mo6450b(r0)
            java.util.List<androidx.recyclerview.widget.m$h> r0 = r11.f5100b
            r0.add(r14)
            r14.mo6452d()
            r8 = 1
            goto L_0x00ea
        L_0x00da:
            r0 = r9
            r21 = 8
            android.view.View r1 = r0.f4609a
            r11.mo6391D(r1)
            androidx.recyclerview.widget.m$f r1 = r11.f5092a
            androidx.recyclerview.widget.RecyclerView r2 = r11.f5091a
            r1.mo6424c(r2, r0)
            r8 = 0
        L_0x00ea:
            r0 = 0
            r11.f5088a = r0
            goto L_0x00f1
        L_0x00ee:
            r21 = 8
            r8 = 0
        L_0x00f1:
            if (r12 == 0) goto L_0x0122
            androidx.recyclerview.widget.m$f r0 = r11.f5092a
            androidx.recyclerview.widget.RecyclerView r1 = r11.f5091a
            int r0 = r0.mo6426f(r1, r12)
            r0 = r0 & r16
            int r1 = r11.f5099b
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.f5102c = r0
            android.view.View r0 = r12.f4609a
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.f5110g = r0
            android.view.View r0 = r12.f4609a
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.f5111h = r0
            r11.f5088a = r12
            r0 = 2
            if (r13 != r0) goto L_0x0122
            android.view.View r0 = r12.f4609a
            r1 = 0
            r0.performHapticFeedback(r1)
            goto L_0x0123
        L_0x0122:
            r1 = 0
        L_0x0123:
            androidx.recyclerview.widget.RecyclerView r0 = r11.f5091a
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0135
            androidx.recyclerview.widget.RecyclerView$f0 r2 = r11.f5088a
            if (r2 == 0) goto L_0x0131
            r14 = 1
            goto L_0x0132
        L_0x0131:
            r14 = 0
        L_0x0132:
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x0135:
            if (r8 != 0) goto L_0x0140
            androidx.recyclerview.widget.RecyclerView r0 = r11.f5091a
            androidx.recyclerview.widget.RecyclerView$p r0 = r0.getLayoutManager()
            r0.mo5824O1()
        L_0x0140:
            androidx.recyclerview.widget.m$f r0 = r11.f5092a
            androidx.recyclerview.widget.RecyclerView$f0 r1 = r11.f5088a
            int r2 = r11.f5099b
            r0.mo6420C(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.f5091a
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0918m.mo6393F(androidx.recyclerview.widget.RecyclerView$f0, int):void");
    }

    /* renamed from: G */
    public final void mo6394G() {
        this.f5105d = ViewConfiguration.get(this.f5091a.getContext()).getScaledTouchSlop();
        this.f5091a.mo5482n(this);
        this.f5091a.mo5503q(this.f5090a);
        this.f5091a.mo5500p(this);
        mo6396I();
    }

    /* renamed from: H */
    public void mo6395H(@mr2 RecyclerView.C0803f0 f0Var) {
        if (!this.f5092a.mo6435p(this.f5091a, f0Var)) {
            Log.e(f5062a, "Start drag has been called but dragging is not enabled");
        } else if (f0Var.f4609a.getParent() != this.f5091a) {
            Log.e(f5062a, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            mo6388A();
            this.f5109f = 0.0f;
            this.f5107e = 0.0f;
            mo6393F(f0Var, 2);
        }
    }

    /* renamed from: I */
    public final void mo6396I() {
        this.f5093a = new C0927g();
        this.f5094a = new yf1(this.f5091a.getContext(), this.f5093a);
    }

    /* renamed from: J */
    public void mo6397J(@mr2 RecyclerView.C0803f0 f0Var) {
        if (!this.f5092a.mo6436q(this.f5091a, f0Var)) {
            Log.e(f5062a, "Start swipe has been called but swiping is not enabled");
        } else if (f0Var.f4609a.getParent() != this.f5091a) {
            Log.e(f5062a, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
        } else {
            mo6388A();
            this.f5109f = 0.0f;
            this.f5107e = 0.0f;
            mo6393F(f0Var, 1);
        }
    }

    /* renamed from: K */
    public final void mo6398K() {
        C0927g gVar = this.f5093a;
        if (gVar != null) {
            gVar.mo6446a();
            this.f5093a = null;
        }
        if (this.f5094a != null) {
            this.f5094a = null;
        }
    }

    /* renamed from: L */
    public final int mo6399L(RecyclerView.C0803f0 f0Var) {
        if (this.f5099b == 2) {
            return 0;
        }
        int l = this.f5092a.mo6431l(this.f5091a, f0Var);
        int d = (this.f5092a.mo6425d(l, jt4.m18928Z(this.f5091a)) & 65280) >> 8;
        if (d == 0) {
            return 0;
        }
        int i = (l & 65280) >> 8;
        if (Math.abs(this.f5107e) > Math.abs(this.f5109f)) {
            int n = mo6403n(f0Var, d);
            if (n > 0) {
                return (i & n) == 0 ? C0924f.m6414e(n, jt4.m18928Z(this.f5091a)) : n;
            }
            int p = mo6405p(f0Var, d);
            if (p > 0) {
                return p;
            }
        } else {
            int p2 = mo6405p(f0Var, d);
            if (p2 > 0) {
                return p2;
            }
            int n2 = mo6403n(f0Var, d);
            if (n2 > 0) {
                return (i & n2) == 0 ? C0924f.m6414e(n2, jt4.m18928Z(this.f5091a)) : n2;
            }
        }
        return 0;
    }

    /* renamed from: M */
    public void mo6400M(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f5082a;
        this.f5107e = f;
        this.f5109f = y - this.f5098b;
        if ((i & 4) == 0) {
            this.f5107e = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f5107e = Math.min(0.0f, this.f5107e);
        }
        if ((i & 1) == 0) {
            this.f5109f = Math.max(0.0f, this.f5109f);
        }
        if ((i & 2) == 0) {
            this.f5109f = Math.min(0.0f, this.f5109f);
        }
    }

    /* renamed from: c */
    public void mo5912c(@mr2 View view) {
        mo6391D(view);
        RecyclerView.C0803f0 t0 = this.f5091a.mo5541t0(view);
        if (t0 != null) {
            RecyclerView.C0803f0 f0Var = this.f5088a;
            if (f0Var == null || t0 != f0Var) {
                mo6407r(t0, false);
                if (this.f5096a.remove(t0.f4609a)) {
                    this.f5092a.mo6424c(this.f5091a, t0);
                    return;
                }
                return;
            }
            mo6393F((RecyclerView.C0803f0) null, 0);
        }
    }

    /* renamed from: e */
    public void mo5913e(@mr2 View view) {
    }

    /* renamed from: g */
    public void mo5781g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0797c0 c0Var) {
        rect.setEmpty();
    }

    /* renamed from: i */
    public void mo5783i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0797c0 c0Var) {
        float f;
        float f2;
        this.f5108e = -1;
        if (this.f5088a != null) {
            mo6412w(this.f5097a);
            float[] fArr = this.f5097a;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f5092a.mo6442y(canvas, recyclerView, this.f5088a, this.f5100b, this.f5099b, f2, f);
    }

    /* renamed from: k */
    public void mo5785k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0797c0 c0Var) {
        float f;
        float f2;
        if (this.f5088a != null) {
            mo6412w(this.f5097a);
            float[] fArr = this.f5097a;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f5092a.mo6443z(canvas, recyclerView, this.f5088a, this.f5100b, this.f5099b, f2, f);
    }

    /* renamed from: l */
    public final void mo6401l() {
    }

    /* renamed from: m */
    public void mo6402m(@ts2 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5091a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                mo6406q();
            }
            this.f5091a = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f5101c = resources.getDimension(sb3.C3487c.item_touch_helper_swipe_escape_velocity);
                this.f5104d = resources.getDimension(sb3.C3487c.item_touch_helper_swipe_escape_max_velocity);
                mo6394G();
            }
        }
    }

    /* renamed from: n */
    public final int mo6403n(RecyclerView.C0803f0 f0Var, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = 8;
        int i3 = this.f5107e > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f5086a;
        if (velocityTracker != null && this.f5083a > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f5092a.mo6434o(this.f5104d));
            float xVelocity = this.f5086a.getXVelocity(this.f5083a);
            float yVelocity = this.f5086a.getYVelocity(this.f5083a);
            if (xVelocity <= 0.0f) {
                i2 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i2 & i) != 0 && i3 == i2 && abs >= this.f5092a.mo6432m(this.f5101c) && abs > Math.abs(yVelocity)) {
                return i2;
            }
        }
        float width = ((float) this.f5091a.getWidth()) * this.f5092a.mo6433n(f0Var);
        if ((i & i3) == 0 || Math.abs(this.f5107e) <= width) {
            return 0;
        }
        return i3;
    }

    /* renamed from: o */
    public void mo6404o(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.C0803f0 v;
        int f;
        if (this.f5088a == null && i == 2 && this.f5099b != 2 && this.f5092a.mo6438s() && this.f5091a.getScrollState() != 1 && (v = mo6411v(motionEvent)) != null && (f = (this.f5092a.mo6426f(this.f5091a, v) & 65280) >> 8) != 0) {
            float x = motionEvent.getX(i2);
            float y = motionEvent.getY(i2);
            float f2 = x - this.f5082a;
            float f3 = y - this.f5098b;
            float abs = Math.abs(f2);
            float abs2 = Math.abs(f3);
            int i3 = this.f5105d;
            if (abs >= ((float) i3) || abs2 >= ((float) i3)) {
                if (abs > abs2) {
                    if (f2 < 0.0f && (f & 4) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (f & 8) == 0) {
                        return;
                    }
                } else if (f3 < 0.0f && (f & 1) == 0) {
                    return;
                } else {
                    if (f3 > 0.0f && (f & 2) == 0) {
                        return;
                    }
                }
                this.f5109f = 0.0f;
                this.f5107e = 0.0f;
                this.f5083a = motionEvent.getPointerId(0);
                mo6393F(v, 1);
            }
        }
    }

    /* renamed from: p */
    public final int mo6405p(RecyclerView.C0803f0 f0Var, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = 2;
        int i3 = this.f5109f > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f5086a;
        if (velocityTracker != null && this.f5083a > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f5092a.mo6434o(this.f5104d));
            float xVelocity = this.f5086a.getXVelocity(this.f5083a);
            float yVelocity = this.f5086a.getYVelocity(this.f5083a);
            if (yVelocity <= 0.0f) {
                i2 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i2 & i) != 0 && i2 == i3 && abs >= this.f5092a.mo6432m(this.f5101c) && abs > Math.abs(xVelocity)) {
                return i2;
            }
        }
        float height = ((float) this.f5091a.getHeight()) * this.f5092a.mo6433n(f0Var);
        if ((i & i3) == 0 || Math.abs(this.f5109f) <= height) {
            return 0;
        }
        return i3;
    }

    /* renamed from: q */
    public final void mo6406q() {
        this.f5091a.mo5516s1(this);
        this.f5091a.mo5547v1(this.f5090a);
        this.f5091a.mo5544u1(this);
        for (int size = this.f5100b.size() - 1; size >= 0; size--) {
            C0928h hVar = this.f5100b.get(0);
            hVar.mo6449a();
            this.f5092a.mo6424c(this.f5091a, hVar.f5134a);
        }
        this.f5100b.clear();
        this.f5087a = null;
        this.f5108e = -1;
        mo6390C();
        mo6398K();
    }

    /* renamed from: r */
    public void mo6407r(RecyclerView.C0803f0 f0Var, boolean z) {
        for (int size = this.f5100b.size() - 1; size >= 0; size--) {
            C0928h hVar = this.f5100b.get(size);
            if (hVar.f5134a == f0Var) {
                hVar.f5138b |= z;
                if (!hVar.f5140c) {
                    hVar.mo6449a();
                }
                this.f5100b.remove(size);
                return;
            }
        }
    }

    /* renamed from: s */
    public C0928h mo6408s(MotionEvent motionEvent) {
        if (this.f5100b.isEmpty()) {
            return null;
        }
        View t = mo6409t(motionEvent);
        for (int size = this.f5100b.size() - 1; size >= 0; size--) {
            C0928h hVar = this.f5100b.get(size);
            if (hVar.f5134a.f4609a == t) {
                return hVar;
            }
        }
        return null;
    }

    /* renamed from: t */
    public View mo6409t(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.C0803f0 f0Var = this.f5088a;
        if (f0Var != null) {
            View view = f0Var.f4609a;
            if (m6377y(view, x, y, this.f5110g + this.f5107e, this.f5111h + this.f5109f)) {
                return view;
            }
        }
        for (int size = this.f5100b.size() - 1; size >= 0; size--) {
            C0928h hVar = this.f5100b.get(size);
            View view2 = hVar.f5134a.f4609a;
            if (m6377y(view2, x, y, hVar.f5142e, hVar.f5143f)) {
                return view2;
            }
        }
        return this.f5091a.mo5425a0(x, y);
    }

    /* renamed from: u */
    public final List<RecyclerView.C0803f0> mo6410u(RecyclerView.C0803f0 f0Var) {
        RecyclerView.C0803f0 f0Var2 = f0Var;
        List<RecyclerView.C0803f0> list = this.f5103c;
        if (list == null) {
            this.f5103c = new ArrayList();
            this.f5106d = new ArrayList();
        } else {
            list.clear();
            this.f5106d.clear();
        }
        int h = this.f5092a.mo6428h();
        int round = Math.round(this.f5110g + this.f5107e) - h;
        int round2 = Math.round(this.f5111h + this.f5109f) - h;
        int i = h * 2;
        int width = f0Var2.f4609a.getWidth() + round + i;
        int height = f0Var2.f4609a.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        RecyclerView.C0819p layoutManager = this.f5091a.getLayoutManager();
        int Q = layoutManager.mo5828Q();
        int i4 = 0;
        while (i4 < Q) {
            View P = layoutManager.mo5825P(i4);
            if (P != f0Var2.f4609a && P.getBottom() >= round2 && P.getTop() <= height && P.getRight() >= round && P.getLeft() <= width) {
                RecyclerView.C0803f0 t0 = this.f5091a.mo5541t0(P);
                if (this.f5092a.mo6422a(this.f5091a, this.f5088a, t0)) {
                    int abs = Math.abs(i2 - ((P.getLeft() + P.getRight()) / 2));
                    int abs2 = Math.abs(i3 - ((P.getTop() + P.getBottom()) / 2));
                    int i5 = (abs * abs) + (abs2 * abs2);
                    int size = this.f5103c.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < size && i5 > this.f5106d.get(i6).intValue()) {
                        i7++;
                        i6++;
                        RecyclerView.C0803f0 f0Var3 = f0Var;
                    }
                    this.f5103c.add(i7, t0);
                    this.f5106d.add(i7, Integer.valueOf(i5));
                }
            }
            i4++;
            f0Var2 = f0Var;
        }
        return this.f5103c;
    }

    /* renamed from: v */
    public final RecyclerView.C0803f0 mo6411v(MotionEvent motionEvent) {
        View t;
        RecyclerView.C0819p layoutManager = this.f5091a.getLayoutManager();
        int i = this.f5083a;
        if (i == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f5082a);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f5098b);
        int i2 = this.f5105d;
        if (abs < ((float) i2) && abs2 < ((float) i2)) {
            return null;
        }
        if (abs > abs2 && layoutManager.mo5304n()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.mo5307o()) && (t = mo6409t(motionEvent)) != null) {
            return this.f5091a.mo5541t0(t);
        }
        return null;
    }

    /* renamed from: w */
    public final void mo6412w(float[] fArr) {
        if ((this.f5102c & 12) != 0) {
            fArr[0] = (this.f5110g + this.f5107e) - ((float) this.f5088a.f4609a.getLeft());
        } else {
            fArr[0] = this.f5088a.f4609a.getTranslationX();
        }
        if ((this.f5102c & 3) != 0) {
            fArr[1] = (this.f5111h + this.f5109f) - ((float) this.f5088a.f4609a.getTop());
        } else {
            fArr[1] = this.f5088a.f4609a.getTranslationY();
        }
    }

    /* renamed from: x */
    public boolean mo6413x() {
        int size = this.f5100b.size();
        for (int i = 0; i < size; i++) {
            if (!this.f5100b.get(i).f5140c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public void mo6414z(RecyclerView.C0803f0 f0Var) {
        if (!this.f5091a.isLayoutRequested() && this.f5099b == 2) {
            float k = this.f5092a.mo6430k(f0Var);
            int i = (int) (this.f5110g + this.f5107e);
            int i2 = (int) (this.f5111h + this.f5109f);
            if (((float) Math.abs(i2 - f0Var.f4609a.getTop())) >= ((float) f0Var.f4609a.getHeight()) * k || ((float) Math.abs(i - f0Var.f4609a.getLeft())) >= ((float) f0Var.f4609a.getWidth()) * k) {
                List<RecyclerView.C0803f0> u = mo6410u(f0Var);
                if (u.size() != 0) {
                    RecyclerView.C0803f0 b = this.f5092a.mo6423b(f0Var, u, i, i2);
                    if (b == null) {
                        this.f5103c.clear();
                        this.f5106d.clear();
                        return;
                    }
                    int j = b.mo5680j();
                    int j2 = f0Var.mo5680j();
                    if (this.f5092a.mo6418A(this.f5091a, f0Var, b)) {
                        this.f5092a.mo6419B(this.f5091a, f0Var, j2, b, j, i, i2);
                    }
                }
            }
        }
    }
}
