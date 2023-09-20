package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.C0844a;
import androidx.recyclerview.widget.C0859c0;
import androidx.recyclerview.widget.C0869d0;
import androidx.recyclerview.widget.C0872e;
import androidx.recyclerview.widget.C0914l;
import androidx.recyclerview.widget.C0947v;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C2015e0;
import com.onedelhi.secure.C3740us;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.C3958y1;
import com.onedelhi.secure.ao2;
import com.onedelhi.secure.cg4;
import com.onedelhi.secure.co2;
import com.onedelhi.secure.dl2;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.k43;
import com.onedelhi.secure.lt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ns3;
import com.onedelhi.secure.pl2;
import com.onedelhi.secure.sb3;
import com.onedelhi.secure.to1;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.zn2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements ns3, zn2, ao2 {

    /* renamed from: C */
    public static final int f4429C = 0;

    /* renamed from: D */
    public static final int f4430D = 1;

    /* renamed from: E */
    public static final int f4431E = 1;

    /* renamed from: F */
    public static final int f4432F = -1;

    /* renamed from: G */
    public static final int f4433G = -1;

    /* renamed from: H */
    public static final int f4434H = 0;

    /* renamed from: I */
    public static final int f4435I = 1;

    /* renamed from: J */
    public static final int f4436J = Integer.MIN_VALUE;

    /* renamed from: K */
    public static final int f4437K = 2000;

    /* renamed from: L */
    public static final int f4438L = -1;

    /* renamed from: M */
    public static final int f4439M = 0;

    /* renamed from: N */
    public static final int f4440N = 1;

    /* renamed from: O */
    public static final int f4441O = 2;

    /* renamed from: a */
    public static final Interpolator f4442a = new C0796c();

    /* renamed from: a */
    public static final Class<?>[] f4443a;

    /* renamed from: b */
    public static final long f4444b = -1;

    /* renamed from: b */
    public static final String f4445b = "RecyclerView";

    /* renamed from: c */
    public static final long f4446c = Long.MAX_VALUE;

    /* renamed from: c */
    public static final String f4447c = "RV Scroll";

    /* renamed from: d */
    public static final String f4448d = "RV OnLayout";

    /* renamed from: e */
    public static final String f4449e = "RV FullInvalidate";

    /* renamed from: e */
    public static final int[] f4450e = {16843830};

    /* renamed from: f */
    public static final String f4451f = "RV PartialInvalidate";

    /* renamed from: g */
    public static final String f4452g = "RV OnBindView";

    /* renamed from: h */
    public static final String f4453h = "RV Prefetch";

    /* renamed from: i */
    public static final String f4454i = "RV Nested Prefetch";

    /* renamed from: j */
    public static final String f4455j = "RV CreateView";

    /* renamed from: r */
    public static final boolean f4456r = false;

    /* renamed from: s */
    public static final boolean f4457s = false;

    /* renamed from: t */
    public static final boolean f4458t = false;

    /* renamed from: u */
    public static final boolean f4459u;

    /* renamed from: v */
    public static final boolean f4460v = true;

    /* renamed from: w */
    public static final boolean f4461w = true;

    /* renamed from: x */
    public static final boolean f4462x = false;

    /* renamed from: y */
    public static final boolean f4463y = false;

    /* renamed from: z */
    public static final boolean f4464z = false;

    /* renamed from: A */
    public int f4465A;

    /* renamed from: B */
    public int f4466B;

    /* renamed from: a */
    public float f4467a;

    /* renamed from: a */
    public final Rect f4468a;

    /* renamed from: a */
    public final RectF f4469a;

    /* renamed from: a */
    public VelocityTracker f4470a;

    /* renamed from: a */
    public final AccessibilityManager f4471a;

    /* renamed from: a */
    public EdgeEffect f4472a;

    /* renamed from: a */
    public final C0797c0 f4473a;

    /* renamed from: a */
    public final C0801e0 f4474a;

    /* renamed from: a */
    public C0805h f4475a;

    /* renamed from: a */
    public C0809k f4476a;
    @mr2

    /* renamed from: a */
    public C0810l f4477a;

    /* renamed from: a */
    public C0812m.C0815c f4478a;

    /* renamed from: a */
    public C0812m f4479a;
    @hw4

    /* renamed from: a */
    public C0819p f4480a;

    /* renamed from: a */
    public C0825r f4481a;

    /* renamed from: a */
    public C0826s f4482a;

    /* renamed from: a */
    public C0827t f4483a;

    /* renamed from: a */
    public final C0831w f4484a;

    /* renamed from: a */
    public C0832x f4485a;

    /* renamed from: a */
    public final C0833y f4486a;

    /* renamed from: a */
    public C0834z f4487a;

    /* renamed from: a */
    public C0844a f4488a;

    /* renamed from: a */
    public final C0869d0.C0871b f4489a;

    /* renamed from: a */
    public final C0869d0 f4490a;

    /* renamed from: a */
    public C0872e f4491a;

    /* renamed from: a */
    public C0914l.C0916b f4492a;

    /* renamed from: a */
    public C0914l f4493a;

    /* renamed from: a */
    public C0947v f4494a;

    /* renamed from: a */
    public co2 f4495a;

    /* renamed from: a */
    public final Runnable f4496a;

    /* renamed from: a */
    public final ArrayList<C0818o> f4497a;

    /* renamed from: a */
    public final List<C0832x> f4498a;

    /* renamed from: a */
    public final int[] f4499a;

    /* renamed from: b */
    public float f4500b;

    /* renamed from: b */
    public final Rect f4501b;

    /* renamed from: b */
    public EdgeEffect f4502b;

    /* renamed from: b */
    public Runnable f4503b;

    /* renamed from: b */
    public final ArrayList<C0826s> f4504b;

    /* renamed from: b */
    public List<C0824q> f4505b;

    /* renamed from: b */
    public boolean f4506b;

    /* renamed from: b */
    public final int[] f4507b;

    /* renamed from: c */
    public EdgeEffect f4508c;

    /* renamed from: c */
    public List<C0827t> f4509c;

    /* renamed from: c */
    public boolean f4510c;

    /* renamed from: c */
    public final int[] f4511c;

    /* renamed from: d */
    public EdgeEffect f4512d;
    @hw4

    /* renamed from: d */
    public final List<C0803f0> f4513d;

    /* renamed from: d */
    public boolean f4514d;

    /* renamed from: d */
    public final int[] f4515d;

    /* renamed from: e */
    public boolean f4516e;
    @hw4

    /* renamed from: f */
    public boolean f4517f;

    /* renamed from: g */
    public boolean f4518g;

    /* renamed from: h */
    public boolean f4519h;

    /* renamed from: i */
    public boolean f4520i;

    /* renamed from: j */
    public boolean f4521j;

    /* renamed from: k */
    public boolean f4522k;

    /* renamed from: l */
    public boolean f4523l;

    /* renamed from: m */
    public boolean f4524m;

    /* renamed from: n */
    public int f4525n;

    /* renamed from: n */
    public boolean f4526n;

    /* renamed from: o */
    public int f4527o;

    /* renamed from: o */
    public boolean f4528o;

    /* renamed from: p */
    public int f4529p;

    /* renamed from: p */
    public boolean f4530p;

    /* renamed from: q */
    public int f4531q;

    /* renamed from: q */
    public boolean f4532q;

    /* renamed from: r */
    public int f4533r;

    /* renamed from: s */
    public int f4534s;

    /* renamed from: t */
    public int f4535t;

    /* renamed from: u */
    public int f4536u;

    /* renamed from: v */
    public int f4537v;

    /* renamed from: w */
    public int f4538w;

    /* renamed from: x */
    public int f4539x;

    /* renamed from: y */
    public final int f4540y;

    /* renamed from: z */
    public final int f4541z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public final Rect f4542a = new Rect();

        /* renamed from: a */
        public C0803f0 f4543a;

        /* renamed from: a */
        public boolean f4544a = true;

        /* renamed from: b */
        public boolean f4545b = false;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public int mo5559a() {
            return this.f4543a.mo5680j();
        }

        /* renamed from: b */
        public int mo5560b() {
            return this.f4543a.mo5683m();
        }

        @Deprecated
        /* renamed from: c */
        public int mo5561c() {
            return this.f4543a.mo5683m();
        }

        /* renamed from: d */
        public int mo5562d() {
            return this.f4543a.mo5686p();
        }

        @Deprecated
        /* renamed from: e */
        public int mo5563e() {
            return this.f4543a.mo5688r();
        }

        /* renamed from: f */
        public boolean mo5564f() {
            return this.f4543a.mo5656C();
        }

        /* renamed from: g */
        public boolean mo5565g() {
            return this.f4543a.mo5697z();
        }

        /* renamed from: h */
        public boolean mo5566h() {
            return this.f4543a.mo5695x();
        }

        /* renamed from: i */
        public boolean mo5567i() {
            return this.f4543a.mo5657D();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class C0790a implements Runnable {
        public C0790a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4517f && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f4510c) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f4519h) {
                    recyclerView2.f4518g = true;
                } else {
                    recyclerView2.mo5367F();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static class C0791a0 implements C0826s {
        /* renamed from: a */
        public void mo5569a(@mr2 RecyclerView recyclerView, @mr2 MotionEvent motionEvent) {
        }

        /* renamed from: b */
        public boolean mo5570b(@mr2 RecyclerView recyclerView, @mr2 MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: d */
        public void mo5571d(boolean z) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class C0792b implements Runnable {
        public C0792b() {
        }

        public void run() {
            C0812m mVar = RecyclerView.this.f4479a;
            if (mVar != null) {
                mVar.mo5773x();
            }
            RecyclerView.this.f4530p = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class C0793b0 {

        /* renamed from: a */
        public int f4548a = -1;

        /* renamed from: a */
        public View f4549a;

        /* renamed from: a */
        public final C0794a f4550a = new C0794a(0, 0);

        /* renamed from: a */
        public C0819p f4551a;

        /* renamed from: a */
        public RecyclerView f4552a;

        /* renamed from: a */
        public boolean f4553a;

        /* renamed from: b */
        public boolean f4554b;

        /* renamed from: c */
        public boolean f4555c;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$b0$a */
        public static class C0794a {

            /* renamed from: f */
            public static final int f4556f = Integer.MIN_VALUE;

            /* renamed from: a */
            public int f4557a;

            /* renamed from: a */
            public Interpolator f4558a;

            /* renamed from: a */
            public boolean f4559a;

            /* renamed from: b */
            public int f4560b;

            /* renamed from: c */
            public int f4561c;

            /* renamed from: d */
            public int f4562d;

            /* renamed from: e */
            public int f4563e;

            public C0794a(@e83 int i, @e83 int i2) {
                this(i, i2, Integer.MIN_VALUE, (Interpolator) null);
            }

            public C0794a(@e83 int i, @e83 int i2, int i3) {
                this(i, i2, i3, (Interpolator) null);
            }

            public C0794a(@e83 int i, @e83 int i2, int i3, @ts2 Interpolator interpolator) {
                this.f4562d = -1;
                this.f4559a = false;
                this.f4563e = 0;
                this.f4557a = i;
                this.f4560b = i2;
                this.f4561c = i3;
                this.f4558a = interpolator;
            }

            /* renamed from: a */
            public int mo5592a() {
                return this.f4561c;
            }

            @e83
            /* renamed from: b */
            public int mo5593b() {
                return this.f4557a;
            }

            @e83
            /* renamed from: c */
            public int mo5594c() {
                return this.f4560b;
            }

            @ts2
            /* renamed from: d */
            public Interpolator mo5595d() {
                return this.f4558a;
            }

            /* renamed from: e */
            public boolean mo5596e() {
                return this.f4562d >= 0;
            }

            /* renamed from: f */
            public void mo5597f(int i) {
                this.f4562d = i;
            }

            /* renamed from: g */
            public void mo5598g(RecyclerView recyclerView) {
                int i = this.f4562d;
                if (i >= 0) {
                    this.f4562d = -1;
                    recyclerView.mo5401Q0(i);
                    this.f4559a = false;
                } else if (this.f4559a) {
                    mo5604m();
                    recyclerView.f4474a.mo5642e(this.f4557a, this.f4560b, this.f4561c, this.f4558a);
                    int i2 = this.f4563e + 1;
                    this.f4563e = i2;
                    if (i2 > 10) {
                        Log.e(RecyclerView.f4445b, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f4559a = false;
                } else {
                    this.f4563e = 0;
                }
            }

            /* renamed from: h */
            public void mo5599h(int i) {
                this.f4559a = true;
                this.f4561c = i;
            }

            /* renamed from: i */
            public void mo5600i(@e83 int i) {
                this.f4559a = true;
                this.f4557a = i;
            }

            /* renamed from: j */
            public void mo5601j(@e83 int i) {
                this.f4559a = true;
                this.f4560b = i;
            }

            /* renamed from: k */
            public void mo5602k(@ts2 Interpolator interpolator) {
                this.f4559a = true;
                this.f4558a = interpolator;
            }

            /* renamed from: l */
            public void mo5603l(@e83 int i, @e83 int i2, int i3, @ts2 Interpolator interpolator) {
                this.f4557a = i;
                this.f4560b = i2;
                this.f4561c = i3;
                this.f4558a = interpolator;
                this.f4559a = true;
            }

            /* renamed from: m */
            public final void mo5604m() {
                if (this.f4558a != null && this.f4561c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f4561c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$b0$b */
        public interface C0795b {
            @ts2
            /* renamed from: a */
            PointF mo5284a(int i);
        }

        @ts2
        /* renamed from: a */
        public PointF mo5573a(int i) {
            C0819p e = mo5577e();
            if (e instanceof C0795b) {
                return ((C0795b) e).mo5284a(i);
            }
            Log.w(RecyclerView.f4445b, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + C0795b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View mo5574b(int i) {
            return this.f4552a.f4480a.mo5266J(i);
        }

        /* renamed from: c */
        public int mo5575c() {
            return this.f4552a.f4480a.mo5828Q();
        }

        /* renamed from: d */
        public int mo5576d(View view) {
            return this.f4552a.mo5507r0(view);
        }

        @ts2
        /* renamed from: e */
        public C0819p mo5577e() {
            return this.f4551a;
        }

        /* renamed from: f */
        public int mo5578f() {
            return this.f4548a;
        }

        @Deprecated
        /* renamed from: g */
        public void mo5579g(int i) {
            this.f4552a.mo5372G1(i);
        }

        /* renamed from: h */
        public boolean mo5580h() {
            return this.f4553a;
        }

        /* renamed from: i */
        public boolean mo5581i() {
            return this.f4554b;
        }

        /* renamed from: j */
        public void mo5582j(@mr2 PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* renamed from: k */
        public void mo5583k(int i, int i2) {
            PointF a;
            RecyclerView recyclerView = this.f4552a;
            if (this.f4548a == -1 || recyclerView == null) {
                mo5591s();
            }
            if (this.f4553a && this.f4549a == null && this.f4551a != null && (a = mo5573a(this.f4548a)) != null) {
                float f = a.x;
                if (!(f == 0.0f && a.y == 0.0f)) {
                    recyclerView.mo5369F1((int) Math.signum(f), (int) Math.signum(a.y), (int[]) null);
                }
            }
            this.f4553a = false;
            View view = this.f4549a;
            if (view != null) {
                if (mo5576d(view) == this.f4548a) {
                    mo5588p(this.f4549a, recyclerView.f4473a, this.f4550a);
                    this.f4550a.mo5598g(recyclerView);
                    mo5591s();
                } else {
                    Log.e(RecyclerView.f4445b, "Passed over target position while smooth scrolling.");
                    this.f4549a = null;
                }
            }
            if (this.f4554b) {
                mo5585m(i, i2, recyclerView.f4473a, this.f4550a);
                boolean e = this.f4550a.mo5596e();
                this.f4550a.mo5598g(recyclerView);
                if (e && this.f4554b) {
                    this.f4553a = true;
                    recyclerView.f4474a.mo5641d();
                }
            }
        }

        /* renamed from: l */
        public void mo5584l(View view) {
            if (mo5576d(view) == mo5578f()) {
                this.f4549a = view;
            }
        }

        /* renamed from: m */
        public abstract void mo5585m(@e83 int i, @e83 int i2, @mr2 C0797c0 c0Var, @mr2 C0794a aVar);

        /* renamed from: n */
        public abstract void mo5586n();

        /* renamed from: o */
        public abstract void mo5587o();

        /* renamed from: p */
        public abstract void mo5588p(@mr2 View view, @mr2 C0797c0 c0Var, @mr2 C0794a aVar);

        /* renamed from: q */
        public void mo5589q(int i) {
            this.f4548a = i;
        }

        /* renamed from: r */
        public void mo5590r(RecyclerView recyclerView, C0819p pVar) {
            recyclerView.f4474a.mo5643f();
            if (this.f4555c) {
                Log.w(RecyclerView.f4445b, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f4552a = recyclerView;
            this.f4551a = pVar;
            int i = this.f4548a;
            if (i != -1) {
                recyclerView.f4473a.f4567a = i;
                this.f4554b = true;
                this.f4553a = true;
                this.f4549a = mo5574b(mo5578f());
                mo5586n();
                this.f4552a.f4474a.mo5641d();
                this.f4555c = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* renamed from: s */
        public final void mo5591s() {
            if (this.f4554b) {
                this.f4554b = false;
                mo5587o();
                this.f4552a.f4473a.f4567a = -1;
                this.f4549a = null;
                this.f4548a = -1;
                this.f4553a = false;
                this.f4551a.mo5898w1(this);
                this.f4551a = null;
                this.f4552a = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public class C0796c implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    public static class C0797c0 {

        /* renamed from: j */
        public static final int f4564j = 1;

        /* renamed from: k */
        public static final int f4565k = 2;

        /* renamed from: l */
        public static final int f4566l = 4;

        /* renamed from: a */
        public int f4567a = -1;

        /* renamed from: a */
        public long f4568a;

        /* renamed from: a */
        public SparseArray<Object> f4569a;

        /* renamed from: a */
        public boolean f4570a = false;

        /* renamed from: b */
        public int f4571b = 0;

        /* renamed from: b */
        public boolean f4572b = false;

        /* renamed from: c */
        public int f4573c = 0;

        /* renamed from: c */
        public boolean f4574c = false;

        /* renamed from: d */
        public int f4575d = 1;

        /* renamed from: d */
        public boolean f4576d = false;

        /* renamed from: e */
        public int f4577e = 0;

        /* renamed from: e */
        public boolean f4578e = false;

        /* renamed from: f */
        public int f4579f;

        /* renamed from: f */
        public boolean f4580f = false;

        /* renamed from: g */
        public int f4581g;

        /* renamed from: h */
        public int f4582h;

        /* renamed from: i */
        public int f4583i;

        /* renamed from: a */
        public void mo5606a(int i) {
            if ((this.f4575d & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f4575d));
            }
        }

        /* renamed from: b */
        public boolean mo5607b() {
            return this.f4570a;
        }

        /* renamed from: c */
        public <T> T mo5608c(int i) {
            SparseArray<Object> sparseArray = this.f4569a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        /* renamed from: d */
        public int mo5609d() {
            return this.f4572b ? this.f4571b - this.f4573c : this.f4577e;
        }

        /* renamed from: e */
        public int mo5610e() {
            return this.f4582h;
        }

        /* renamed from: f */
        public int mo5611f() {
            return this.f4583i;
        }

        /* renamed from: g */
        public int mo5612g() {
            return this.f4567a;
        }

        /* renamed from: h */
        public boolean mo5613h() {
            return this.f4567a != -1;
        }

        /* renamed from: i */
        public boolean mo5614i() {
            return this.f4576d;
        }

        /* renamed from: j */
        public boolean mo5615j() {
            return this.f4572b;
        }

        /* renamed from: k */
        public void mo5616k(C0805h hVar) {
            this.f4575d = 1;
            this.f4577e = hVar.mo5711g();
            this.f4572b = false;
            this.f4574c = false;
            this.f4576d = false;
        }

        /* renamed from: l */
        public void mo5617l(int i, Object obj) {
            if (this.f4569a == null) {
                this.f4569a = new SparseArray<>();
            }
            this.f4569a.put(i, obj);
        }

        /* renamed from: m */
        public void mo5618m(int i) {
            SparseArray<Object> sparseArray = this.f4569a;
            if (sparseArray != null) {
                sparseArray.remove(i);
            }
        }

        /* renamed from: n */
        public boolean mo5619n() {
            return this.f4580f;
        }

        /* renamed from: o */
        public boolean mo5620o() {
            return this.f4578e;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f4567a + ", mData=" + this.f4569a + ", mItemCount=" + this.f4577e + ", mIsMeasuring=" + this.f4576d + ", mPreviousLayoutItemCount=" + this.f4571b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4573c + ", mStructureChanged=" + this.f4570a + ", mInPreLayout=" + this.f4572b + ", mRunSimpleAnimations=" + this.f4578e + ", mRunPredictiveAnimations=" + this.f4580f + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public class C0798d implements C0869d0.C0871b {
        public C0798d() {
        }

        /* renamed from: a */
        public void mo5622a(C0803f0 f0Var, @mr2 C0812m.C0816d dVar, @mr2 C0812m.C0816d dVar2) {
            f0Var.mo5664K(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.f4522k;
            C0812m mVar = recyclerView.f4479a;
            if (z) {
                if (!mVar.mo5752b(f0Var, f0Var, dVar, dVar2)) {
                    return;
                }
            } else if (!mVar.mo5754d(f0Var, dVar, dVar2)) {
                return;
            }
            RecyclerView.this.mo5470i1();
        }

        /* renamed from: b */
        public void mo5623b(C0803f0 f0Var, @mr2 C0812m.C0816d dVar, @ts2 C0812m.C0816d dVar2) {
            RecyclerView.this.f4484a.mo5942K(f0Var);
            RecyclerView.this.mo5545v(f0Var, dVar, dVar2);
        }

        /* renamed from: c */
        public void mo5624c(C0803f0 f0Var, C0812m.C0816d dVar, C0812m.C0816d dVar2) {
            RecyclerView.this.mo5540t(f0Var, dVar, dVar2);
        }

        /* renamed from: d */
        public void mo5625d(C0803f0 f0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4480a.mo5802F1(f0Var.f4609a, recyclerView.f4484a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public static abstract class C0799d0 {
        @ts2
        /* renamed from: a */
        public abstract View mo5626a(@mr2 C0831w wVar, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public class C0800e implements C0872e.C0874b {
        public C0800e() {
        }

        /* renamed from: a */
        public View mo5627a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        /* renamed from: b */
        public int mo5628b() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: c */
        public int mo5629c(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        /* renamed from: d */
        public void mo5630d(int i) {
            C0803f0 u0;
            View a = mo5627a(i);
            if (!(a == null || (u0 = RecyclerView.m5265u0(a)) == null)) {
                if (!u0.mo5655B() || u0.mo5667N()) {
                    u0.mo5672b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + u0 + RecyclerView.this.mo5421Y());
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        /* renamed from: e */
        public void mo5631e(View view) {
            C0803f0 u0 = RecyclerView.m5265u0(view);
            if (u0 != null) {
                u0.mo5660G(RecyclerView.this);
            }
        }

        /* renamed from: f */
        public void mo5632f(View view, int i, ViewGroup.LayoutParams layoutParams) {
            C0803f0 u0 = RecyclerView.m5265u0(view);
            if (u0 != null) {
                if (u0.mo5655B() || u0.mo5667N()) {
                    u0.mo5676f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + u0 + RecyclerView.this.mo5421Y());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        /* renamed from: g */
        public void mo5633g() {
            int b = mo5628b();
            for (int i = 0; i < b; i++) {
                View a = mo5627a(i);
                RecyclerView.this.mo5382K(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        /* renamed from: h */
        public void mo5634h(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.mo5379J(view);
        }

        /* renamed from: i */
        public void mo5635i(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.mo5382K(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        /* renamed from: j */
        public void mo5636j(View view) {
            C0803f0 u0 = RecyclerView.m5265u0(view);
            if (u0 != null) {
                u0.mo5659F(RecyclerView.this);
            }
        }

        /* renamed from: k */
        public C0803f0 mo5637k(View view) {
            return RecyclerView.m5265u0(view);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e0 */
    public class C0801e0 implements Runnable {

        /* renamed from: a */
        public Interpolator f4586a;

        /* renamed from: a */
        public OverScroller f4587a;

        /* renamed from: b */
        public boolean f4589b = false;

        /* renamed from: c */
        public boolean f4590c = false;

        /* renamed from: n */
        public int f4591n;

        /* renamed from: o */
        public int f4592o;

        public C0801e0() {
            Interpolator interpolator = RecyclerView.f4442a;
            this.f4586a = interpolator;
            this.f4587a = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        public final int mo5638a(int i, int i2) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            return Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
        }

        /* renamed from: b */
        public void mo5639b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f4592o = 0;
            this.f4591n = 0;
            Interpolator interpolator = this.f4586a;
            Interpolator interpolator2 = RecyclerView.f4442a;
            if (interpolator != interpolator2) {
                this.f4586a = interpolator2;
                this.f4587a = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f4587a.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo5641d();
        }

        /* renamed from: c */
        public final void mo5640c() {
            RecyclerView.this.removeCallbacks(this);
            jt4.m18993p1(RecyclerView.this, this);
        }

        /* renamed from: d */
        public void mo5641d() {
            if (this.f4589b) {
                this.f4590c = true;
            } else {
                mo5640c();
            }
        }

        /* renamed from: e */
        public void mo5642e(int i, int i2, int i3, @ts2 Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = mo5638a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f4442a;
            }
            if (this.f4586a != interpolator) {
                this.f4586a = interpolator;
                this.f4587a = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f4592o = 0;
            this.f4591n = 0;
            RecyclerView.this.setScrollState(2);
            this.f4587a.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f4587a.computeScrollOffset();
            }
            mo5641d();
        }

        /* renamed from: f */
        public void mo5643f() {
            RecyclerView.this.removeCallbacks(this);
            this.f4587a.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4480a == null) {
                mo5643f();
                return;
            }
            this.f4590c = false;
            this.f4589b = true;
            recyclerView.mo5367F();
            OverScroller overScroller = this.f4587a;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f4591n;
                int i4 = currY - this.f4592o;
                this.f4591n = currX;
                this.f4592o = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f4515d;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.mo3837d(i3, i4, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f4515d;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.mo5364E(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f4475a != null) {
                    int[] iArr3 = recyclerView3.f4515d;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.mo5369F1(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f4515d;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    C0793b0 b0Var = recyclerView4.f4480a.f4658a;
                    if (b0Var != null && !b0Var.mo5580h() && b0Var.mo5581i()) {
                        int d = RecyclerView.this.f4473a.mo5609d();
                        if (d == 0) {
                            b0Var.mo5591s();
                        } else {
                            if (b0Var.mo5578f() >= d) {
                                b0Var.mo5589q(d - 1);
                            }
                            b0Var.mo5583k(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.f4497a.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f4515d;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.mo3829c(i, i2, i3, i4, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f4515d;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.mo5403R(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                C0793b0 b0Var2 = RecyclerView.this.f4480a.f4658a;
                if ((b0Var2 != null && b0Var2.mo5580h()) || !z) {
                    mo5641d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    C0914l lVar = recyclerView7.f4493a;
                    if (lVar != null) {
                        lVar.mo6375f(recyclerView7, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.mo5428b(i7, currVelocity);
                    }
                    if (RecyclerView.f4461w) {
                        RecyclerView.this.f4492a.mo6383b();
                    }
                }
            }
            C0793b0 b0Var3 = RecyclerView.this.f4480a.f4658a;
            if (b0Var3 != null && b0Var3.mo5580h()) {
                b0Var3.mo5583k(0, 0);
            }
            this.f4589b = false;
            if (this.f4590c) {
                mo5640c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.mo3851h(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public class C0802f implements C0844a.C0845a {
        public C0802f() {
        }

        /* renamed from: a */
        public void mo5645a(int i, int i2) {
            RecyclerView.this.mo5424Z0(i, i2, false);
            RecyclerView.this.f4526n = true;
        }

        /* renamed from: b */
        public void mo5646b(int i, int i2) {
            RecyclerView.this.mo5420X0(i, i2);
            RecyclerView.this.f4526n = true;
        }

        /* renamed from: c */
        public void mo5647c(int i, int i2) {
            RecyclerView.this.mo5424Z0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4526n = true;
            recyclerView.f4473a.f4573c += i2;
        }

        /* renamed from: d */
        public void mo5648d(int i, int i2, Object obj) {
            RecyclerView.this.mo5414U1(i, i2, obj);
            RecyclerView.this.f4528o = true;
        }

        /* renamed from: e */
        public void mo5649e(C0844a.C0846b bVar) {
            mo5653i(bVar);
        }

        /* renamed from: f */
        public C0803f0 mo5650f(int i) {
            C0803f0 l0 = RecyclerView.this.mo5477l0(i, true);
            if (l0 != null && !RecyclerView.this.f4491a.mo6213n(l0.f4609a)) {
                return l0;
            }
            return null;
        }

        /* renamed from: g */
        public void mo5651g(C0844a.C0846b bVar) {
            mo5653i(bVar);
        }

        /* renamed from: h */
        public void mo5652h(int i, int i2) {
            RecyclerView.this.mo5422Y0(i, i2);
            RecyclerView.this.f4526n = true;
        }

        /* renamed from: i */
        public void mo5653i(C0844a.C0846b bVar) {
            int i = bVar.f4785a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f4480a.mo5222i1(recyclerView, bVar.f4787b, bVar.f4788c);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f4480a.mo5227l1(recyclerView2, bVar.f4787b, bVar.f4788c);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f4480a.mo5229n1(recyclerView3, bVar.f4787b, bVar.f4788c, bVar.f4786a);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f4480a.mo5226k1(recyclerView4, bVar.f4787b, bVar.f4788c, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f0 */
    public static abstract class C0803f0 {

        /* renamed from: A */
        public static final int f4594A = 32;

        /* renamed from: B */
        public static final int f4595B = 128;

        /* renamed from: C */
        public static final int f4596C = 256;

        /* renamed from: D */
        public static final int f4597D = 512;

        /* renamed from: E */
        public static final int f4598E = 1024;

        /* renamed from: F */
        public static final int f4599F = 2048;

        /* renamed from: G */
        public static final int f4600G = 4096;

        /* renamed from: H */
        public static final int f4601H = -1;

        /* renamed from: I */
        public static final int f4602I = 8192;

        /* renamed from: c */
        public static final List<Object> f4603c = Collections.emptyList();

        /* renamed from: v */
        public static final int f4604v = 1;

        /* renamed from: w */
        public static final int f4605w = 2;

        /* renamed from: x */
        public static final int f4606x = 4;

        /* renamed from: y */
        public static final int f4607y = 8;

        /* renamed from: z */
        public static final int f4608z = 16;
        @mr2

        /* renamed from: a */
        public final View f4609a;

        /* renamed from: a */
        public C0803f0 f4610a = null;

        /* renamed from: a */
        public C0805h<? extends C0803f0> f4611a;

        /* renamed from: a */
        public C0831w f4612a = null;

        /* renamed from: a */
        public RecyclerView f4613a;

        /* renamed from: a */
        public WeakReference<RecyclerView> f4614a;

        /* renamed from: a */
        public List<Object> f4615a = null;

        /* renamed from: b */
        public long f4616b = -1;

        /* renamed from: b */
        public C0803f0 f4617b = null;

        /* renamed from: b */
        public List<Object> f4618b = null;

        /* renamed from: b */
        public boolean f4619b = false;

        /* renamed from: n */
        public int f4620n = -1;

        /* renamed from: o */
        public int f4621o = -1;

        /* renamed from: p */
        public int f4622p = -1;

        /* renamed from: q */
        public int f4623q = -1;

        /* renamed from: r */
        public int f4624r;

        /* renamed from: s */
        public int f4625s = 0;

        /* renamed from: t */
        public int f4626t = 0;
        @hw4

        /* renamed from: u */
        public int f4627u = -1;

        public C0803f0(@mr2 View view) {
            if (view != null) {
                this.f4609a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: A */
        public boolean mo5654A() {
            return this.f4612a != null;
        }

        /* renamed from: B */
        public boolean mo5655B() {
            return (this.f4624r & 256) != 0;
        }

        /* renamed from: C */
        public boolean mo5656C() {
            return (this.f4624r & 2) != 0;
        }

        /* renamed from: D */
        public boolean mo5657D() {
            return (this.f4624r & 2) != 0;
        }

        /* renamed from: E */
        public void mo5658E(int i, boolean z) {
            if (this.f4621o == -1) {
                this.f4621o = this.f4620n;
            }
            if (this.f4623q == -1) {
                this.f4623q = this.f4620n;
            }
            if (z) {
                this.f4623q += i;
            }
            this.f4620n += i;
            if (this.f4609a.getLayoutParams() != null) {
                ((LayoutParams) this.f4609a.getLayoutParams()).f4544a = true;
            }
        }

        /* renamed from: F */
        public void mo5659F(RecyclerView recyclerView) {
            int i = this.f4627u;
            if (i == -1) {
                i = jt4.m18916V(this.f4609a);
            }
            this.f4626t = i;
            recyclerView.mo5378I1(this, 4);
        }

        /* renamed from: G */
        public void mo5660G(RecyclerView recyclerView) {
            recyclerView.mo5378I1(this, this.f4626t);
            this.f4626t = 0;
        }

        /* renamed from: H */
        public void mo5661H() {
            this.f4624r = 0;
            this.f4620n = -1;
            this.f4621o = -1;
            this.f4616b = -1;
            this.f4623q = -1;
            this.f4625s = 0;
            this.f4610a = null;
            this.f4617b = null;
            mo5674d();
            this.f4626t = 0;
            this.f4627u = -1;
            RecyclerView.m5259A(this);
        }

        /* renamed from: I */
        public void mo5662I() {
            if (this.f4621o == -1) {
                this.f4621o = this.f4620n;
            }
        }

        /* renamed from: J */
        public void mo5663J(int i, int i2) {
            this.f4624r = (i & i2) | (this.f4624r & (~i2));
        }

        /* renamed from: K */
        public final void mo5664K(boolean z) {
            int i;
            int i2 = this.f4625s;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f4625s = i3;
            if (i3 < 0) {
                this.f4625s = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.f4624r | 16;
            } else if (z && i3 == 0) {
                i = this.f4624r & -17;
            } else {
                return;
            }
            this.f4624r = i;
        }

        /* renamed from: L */
        public void mo5665L(C0831w wVar, boolean z) {
            this.f4612a = wVar;
            this.f4619b = z;
        }

        /* renamed from: M */
        public boolean mo5666M() {
            return (this.f4624r & 16) != 0;
        }

        /* renamed from: N */
        public boolean mo5667N() {
            return (this.f4624r & 128) != 0;
        }

        /* renamed from: O */
        public void mo5668O() {
            this.f4624r &= -129;
        }

        /* renamed from: P */
        public void mo5669P() {
            this.f4612a.mo5942K(this);
        }

        /* renamed from: Q */
        public boolean mo5670Q() {
            return (this.f4624r & 32) != 0;
        }

        /* renamed from: a */
        public void mo5671a(Object obj) {
            if (obj == null) {
                mo5672b(1024);
            } else if ((1024 & this.f4624r) == 0) {
                mo5677g();
                this.f4615a.add(obj);
            }
        }

        /* renamed from: b */
        public void mo5672b(int i) {
            this.f4624r = i | this.f4624r;
        }

        /* renamed from: c */
        public void mo5673c() {
            this.f4621o = -1;
            this.f4623q = -1;
        }

        /* renamed from: d */
        public void mo5674d() {
            List<Object> list = this.f4615a;
            if (list != null) {
                list.clear();
            }
            this.f4624r &= -1025;
        }

        /* renamed from: e */
        public void mo5675e() {
            this.f4624r &= -33;
        }

        /* renamed from: f */
        public void mo5676f() {
            this.f4624r &= -257;
        }

        /* renamed from: g */
        public final void mo5677g() {
            if (this.f4615a == null) {
                ArrayList arrayList = new ArrayList();
                this.f4615a = arrayList;
                this.f4618b = Collections.unmodifiableList(arrayList);
            }
        }

        /* renamed from: h */
        public boolean mo5678h() {
            return (this.f4624r & 16) == 0 && jt4.m18890M0(this.f4609a);
        }

        /* renamed from: i */
        public void mo5679i(int i, int i2, boolean z) {
            mo5672b(8);
            mo5658E(i2, z);
            this.f4620n = i;
        }

        /* renamed from: j */
        public final int mo5680j() {
            RecyclerView recyclerView = this.f4613a;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo5483n0(this);
        }

        @Deprecated
        /* renamed from: k */
        public final int mo5681k() {
            return mo5683m();
        }

        @ts2
        /* renamed from: l */
        public final C0805h<? extends C0803f0> mo5682l() {
            return this.f4611a;
        }

        /* renamed from: m */
        public final int mo5683m() {
            RecyclerView recyclerView;
            C0805h adapter;
            int n0;
            if (this.f4611a == null || (recyclerView = this.f4613a) == null || (adapter = recyclerView.getAdapter()) == null || (n0 = this.f4613a.mo5483n0(this)) == -1) {
                return -1;
            }
            return adapter.mo5710f(this.f4611a, this, n0);
        }

        /* renamed from: n */
        public final long mo5684n() {
            return this.f4616b;
        }

        /* renamed from: o */
        public final int mo5685o() {
            return this.f4622p;
        }

        /* renamed from: p */
        public final int mo5686p() {
            int i = this.f4623q;
            return i == -1 ? this.f4620n : i;
        }

        /* renamed from: q */
        public final int mo5687q() {
            return this.f4621o;
        }

        @Deprecated
        /* renamed from: r */
        public final int mo5688r() {
            int i = this.f4623q;
            return i == -1 ? this.f4620n : i;
        }

        /* renamed from: s */
        public List<Object> mo5689s() {
            if ((this.f4624r & 1024) != 0) {
                return f4603c;
            }
            List<Object> list = this.f4615a;
            return (list == null || list.size() == 0) ? f4603c : this.f4618b;
        }

        /* renamed from: t */
        public boolean mo5690t(int i) {
            return (i & this.f4624r) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + to1.f35745h + Integer.toHexString(hashCode()) + " position=" + this.f4620n + " id=" + this.f4616b + ", oldPos=" + this.f4621o + ", pLpos:" + this.f4623q);
            if (mo5654A()) {
                sb.append(" scrap ");
                sb.append(this.f4619b ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo5695x()) {
                sb.append(" invalid");
            }
            if (!mo5694w()) {
                sb.append(" unbound");
            }
            if (mo5657D()) {
                sb.append(" update");
            }
            if (mo5697z()) {
                sb.append(" removed");
            }
            if (mo5667N()) {
                sb.append(" ignored");
            }
            if (mo5655B()) {
                sb.append(" tmpDetached");
            }
            if (!mo5696y()) {
                sb.append(" not recyclable(" + this.f4625s + pl2.f33727d);
            }
            if (mo5692u()) {
                sb.append(" undefined adapter position");
            }
            if (this.f4609a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: u */
        public boolean mo5692u() {
            return (this.f4624r & 512) != 0 || mo5695x();
        }

        /* renamed from: v */
        public boolean mo5693v() {
            return (this.f4609a.getParent() == null || this.f4609a.getParent() == this.f4613a) ? false : true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public boolean mo5694w() {
            return (this.f4624r & 1) != 0;
        }

        /* renamed from: x */
        public boolean mo5695x() {
            return (this.f4624r & 4) != 0;
        }

        /* renamed from: y */
        public final boolean mo5696y() {
            return (this.f4624r & 16) == 0 && !jt4.m18890M0(this.f4609a);
        }

        /* renamed from: z */
        public boolean mo5697z() {
            return (this.f4624r & 8) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static /* synthetic */ class C0804g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4628a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$h$a[] r0 = androidx.recyclerview.widget.RecyclerView.C0805h.C0806a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4628a = r0
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.C0805h.C0806a.PREVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4628a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.C0805h.C0806a.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0804g.<clinit>():void");
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static abstract class C0805h<VH extends C0803f0> {

        /* renamed from: a */
        public C0806a f4629a = C0806a.ALLOW;

        /* renamed from: a */
        public final C0807i f4630a = new C0807i();

        /* renamed from: a */
        public boolean f4631a = false;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$h$a */
        public enum C0806a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* renamed from: A */
        public void mo5698A(@mr2 RecyclerView recyclerView) {
        }

        /* renamed from: B */
        public boolean mo5699B(@mr2 VH vh) {
            return false;
        }

        /* renamed from: C */
        public void mo5700C(@mr2 VH vh) {
        }

        /* renamed from: D */
        public void mo5701D(@mr2 VH vh) {
        }

        /* renamed from: E */
        public void mo5702E(@mr2 VH vh) {
        }

        /* renamed from: F */
        public void mo5703F(@mr2 C0808j jVar) {
            this.f4630a.registerObserver(jVar);
        }

        /* renamed from: G */
        public void mo5704G(boolean z) {
            if (!mo5715k()) {
                this.f4631a = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        /* renamed from: H */
        public void mo5705H(@mr2 C0806a aVar) {
            this.f4629a = aVar;
            this.f4630a.mo5738h();
        }

        /* renamed from: I */
        public void mo5706I(@mr2 C0808j jVar) {
            this.f4630a.unregisterObserver(jVar);
        }

        /* renamed from: c */
        public final void mo5707c(@mr2 VH vh, int i) {
            boolean z = vh.f4611a == null;
            if (z) {
                vh.f4620n = i;
                if (mo5716l()) {
                    vh.f4616b = mo5712h(i);
                }
                vh.mo5663J(1, 519);
                cg4.m12477b(RecyclerView.f4452g);
            }
            vh.f4611a = this;
            mo5729y(vh, i, vh.mo5689s());
            if (z) {
                vh.mo5674d();
                ViewGroup.LayoutParams layoutParams = vh.f4609a.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).f4544a = true;
                }
                cg4.m12479d();
            }
        }

        /* renamed from: d */
        public boolean mo5708d() {
            int i = C0804g.f4628a[this.f4629a.ordinal()];
            if (i != 1) {
                return i != 2 || mo5711g() > 0;
            }
            return false;
        }

        @mr2
        /* renamed from: e */
        public final VH mo5709e(@mr2 ViewGroup viewGroup, int i) {
            try {
                cg4.m12477b(RecyclerView.f4455j);
                VH z = mo5730z(viewGroup, i);
                if (z.f4609a.getParent() == null) {
                    z.f4622p = i;
                    return z;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                cg4.m12479d();
            }
        }

        /* renamed from: f */
        public int mo5710f(@mr2 C0805h<? extends C0803f0> hVar, @mr2 C0803f0 f0Var, int i) {
            if (hVar == this) {
                return i;
            }
            return -1;
        }

        /* renamed from: g */
        public abstract int mo5711g();

        /* renamed from: h */
        public long mo5712h(int i) {
            return -1;
        }

        /* renamed from: i */
        public int mo5713i(int i) {
            return 0;
        }

        @mr2
        /* renamed from: j */
        public final C0806a mo5714j() {
            return this.f4629a;
        }

        /* renamed from: k */
        public final boolean mo5715k() {
            return this.f4630a.mo5731a();
        }

        /* renamed from: l */
        public final boolean mo5716l() {
            return this.f4631a;
        }

        /* renamed from: m */
        public final void mo5717m() {
            this.f4630a.mo5732b();
        }

        /* renamed from: n */
        public final void mo5718n(int i) {
            this.f4630a.mo5734d(i, 1);
        }

        /* renamed from: o */
        public final void mo5719o(int i, @ts2 Object obj) {
            this.f4630a.mo5735e(i, 1, obj);
        }

        /* renamed from: p */
        public final void mo5720p(int i) {
            this.f4630a.mo5736f(i, 1);
        }

        /* renamed from: q */
        public final void mo5721q(int i, int i2) {
            this.f4630a.mo5733c(i, i2);
        }

        /* renamed from: r */
        public final void mo5722r(int i, int i2) {
            this.f4630a.mo5734d(i, i2);
        }

        /* renamed from: s */
        public final void mo5723s(int i, int i2, @ts2 Object obj) {
            this.f4630a.mo5735e(i, i2, obj);
        }

        /* renamed from: t */
        public final void mo5724t(int i, int i2) {
            this.f4630a.mo5736f(i, i2);
        }

        /* renamed from: u */
        public final void mo5725u(int i, int i2) {
            this.f4630a.mo5737g(i, i2);
        }

        /* renamed from: v */
        public final void mo5726v(int i) {
            this.f4630a.mo5737g(i, 1);
        }

        /* renamed from: w */
        public void mo5727w(@mr2 RecyclerView recyclerView) {
        }

        /* renamed from: x */
        public abstract void mo5728x(@mr2 VH vh, int i);

        /* renamed from: y */
        public void mo5729y(@mr2 VH vh, int i, @mr2 List<Object> list) {
            mo5728x(vh, i);
        }

        @mr2
        /* renamed from: z */
        public abstract VH mo5730z(@mr2 ViewGroup viewGroup, int i);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static class C0807i extends Observable<C0808j> {
        /* renamed from: a */
        public boolean mo5731a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo5732b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0808j) this.mObservers.get(size)).mo5739a();
            }
        }

        /* renamed from: c */
        public void mo5733c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0808j) this.mObservers.get(size)).mo5743e(i, i2, 1);
            }
        }

        /* renamed from: d */
        public void mo5734d(int i, int i2) {
            mo5735e(i, i2, (Object) null);
        }

        /* renamed from: e */
        public void mo5735e(int i, int i2, @ts2 Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0808j) this.mObservers.get(size)).mo5741c(i, i2, obj);
            }
        }

        /* renamed from: f */
        public void mo5736f(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0808j) this.mObservers.get(size)).mo5742d(i, i2);
            }
        }

        /* renamed from: g */
        public void mo5737g(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0808j) this.mObservers.get(size)).mo5744f(i, i2);
            }
        }

        /* renamed from: h */
        public void mo5738h() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0808j) this.mObservers.get(size)).mo5745g();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static abstract class C0808j {
        /* renamed from: a */
        public void mo5739a() {
        }

        /* renamed from: b */
        public void mo5740b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo5741c(int i, int i2, @ts2 Object obj) {
            mo5740b(i, i2);
        }

        /* renamed from: d */
        public void mo5742d(int i, int i2) {
        }

        /* renamed from: e */
        public void mo5743e(int i, int i2, int i3) {
        }

        /* renamed from: f */
        public void mo5744f(int i, int i2) {
        }

        /* renamed from: g */
        public void mo5745g() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public interface C0809k {
        /* renamed from: a */
        int mo5746a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static class C0810l {

        /* renamed from: a */
        public static final int f4636a = 0;

        /* renamed from: b */
        public static final int f4637b = 1;

        /* renamed from: c */
        public static final int f4638c = 2;

        /* renamed from: d */
        public static final int f4639d = 3;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public @interface C0811a {
        }

        @mr2
        /* renamed from: a */
        public EdgeEffect mo5747a(@mr2 RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static abstract class C0812m {

        /* renamed from: a */
        public static final int f4640a = 2;

        /* renamed from: b */
        public static final int f4641b = 8;

        /* renamed from: c */
        public static final int f4642c = 4;

        /* renamed from: d */
        public static final int f4643d = 2048;

        /* renamed from: e */
        public static final int f4644e = 4096;

        /* renamed from: a */
        public long f4645a = 120;

        /* renamed from: a */
        public C0815c f4646a = null;

        /* renamed from: a */
        public ArrayList<C0814b> f4647a = new ArrayList<>();

        /* renamed from: b */
        public long f4648b = 120;

        /* renamed from: c */
        public long f4649c = 250;

        /* renamed from: d */
        public long f4650d = 250;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        public @interface C0813a {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        public interface C0814b {
            /* renamed from: a */
            void mo5776a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$c */
        public interface C0815c {
            /* renamed from: a */
            void mo5777a(@mr2 C0803f0 f0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$d */
        public static class C0816d {

            /* renamed from: a */
            public int f4651a;

            /* renamed from: b */
            public int f4652b;

            /* renamed from: c */
            public int f4653c;

            /* renamed from: d */
            public int f4654d;

            /* renamed from: e */
            public int f4655e;

            @mr2
            /* renamed from: a */
            public C0816d mo5778a(@mr2 C0803f0 f0Var) {
                return mo5779b(f0Var, 0);
            }

            @mr2
            /* renamed from: b */
            public C0816d mo5779b(@mr2 C0803f0 f0Var, int i) {
                View view = f0Var.f4609a;
                this.f4651a = view.getLeft();
                this.f4652b = view.getTop();
                this.f4653c = view.getRight();
                this.f4654d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        public static int m5593e(C0803f0 f0Var) {
            int i = f0Var.f4624r & 14;
            if (f0Var.mo5695x()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int q = f0Var.mo5687q();
            int j = f0Var.mo5680j();
            return (q == -1 || j == -1 || q == j) ? i : i | 2048;
        }

        /* renamed from: A */
        public void mo5748A(C0815c cVar) {
            this.f4646a = cVar;
        }

        /* renamed from: B */
        public void mo5749B(long j) {
            this.f4649c = j;
        }

        /* renamed from: C */
        public void mo5750C(long j) {
            this.f4648b = j;
        }

        /* renamed from: a */
        public abstract boolean mo5751a(@mr2 C0803f0 f0Var, @ts2 C0816d dVar, @mr2 C0816d dVar2);

        /* renamed from: b */
        public abstract boolean mo5752b(@mr2 C0803f0 f0Var, @mr2 C0803f0 f0Var2, @mr2 C0816d dVar, @mr2 C0816d dVar2);

        /* renamed from: c */
        public abstract boolean mo5753c(@mr2 C0803f0 f0Var, @mr2 C0816d dVar, @ts2 C0816d dVar2);

        /* renamed from: d */
        public abstract boolean mo5754d(@mr2 C0803f0 f0Var, @mr2 C0816d dVar, @mr2 C0816d dVar2);

        /* renamed from: f */
        public boolean mo5755f(@mr2 C0803f0 f0Var) {
            return true;
        }

        /* renamed from: g */
        public boolean mo5756g(@mr2 C0803f0 f0Var, @mr2 List<Object> list) {
            return mo5755f(f0Var);
        }

        /* renamed from: h */
        public final void mo5757h(@mr2 C0803f0 f0Var) {
            mo5769t(f0Var);
            C0815c cVar = this.f4646a;
            if (cVar != null) {
                cVar.mo5777a(f0Var);
            }
        }

        /* renamed from: i */
        public final void mo5758i(@mr2 C0803f0 f0Var) {
            mo5770u(f0Var);
        }

        /* renamed from: j */
        public final void mo5759j() {
            int size = this.f4647a.size();
            for (int i = 0; i < size; i++) {
                this.f4647a.get(i).mo5776a();
            }
            this.f4647a.clear();
        }

        /* renamed from: k */
        public abstract void mo5760k(@mr2 C0803f0 f0Var);

        /* renamed from: l */
        public abstract void mo5761l();

        /* renamed from: m */
        public long mo5762m() {
            return this.f4645a;
        }

        /* renamed from: n */
        public long mo5763n() {
            return this.f4650d;
        }

        /* renamed from: o */
        public long mo5764o() {
            return this.f4649c;
        }

        /* renamed from: p */
        public long mo5765p() {
            return this.f4648b;
        }

        /* renamed from: q */
        public abstract boolean mo5766q();

        /* renamed from: r */
        public final boolean mo5767r(@ts2 C0814b bVar) {
            boolean q = mo5766q();
            if (bVar != null) {
                if (!q) {
                    bVar.mo5776a();
                } else {
                    this.f4647a.add(bVar);
                }
            }
            return q;
        }

        @mr2
        /* renamed from: s */
        public C0816d mo5768s() {
            return new C0816d();
        }

        /* renamed from: t */
        public void mo5769t(@mr2 C0803f0 f0Var) {
        }

        /* renamed from: u */
        public void mo5770u(@mr2 C0803f0 f0Var) {
        }

        @mr2
        /* renamed from: v */
        public C0816d mo5771v(@mr2 C0797c0 c0Var, @mr2 C0803f0 f0Var) {
            return mo5768s().mo5778a(f0Var);
        }

        @mr2
        /* renamed from: w */
        public C0816d mo5772w(@mr2 C0797c0 c0Var, @mr2 C0803f0 f0Var, int i, @mr2 List<Object> list) {
            return mo5768s().mo5778a(f0Var);
        }

        /* renamed from: x */
        public abstract void mo5773x();

        /* renamed from: y */
        public void mo5774y(long j) {
            this.f4645a = j;
        }

        /* renamed from: z */
        public void mo5775z(long j) {
            this.f4650d = j;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public class C0817n implements C0812m.C0815c {
        public C0817n() {
        }

        /* renamed from: a */
        public void mo5777a(C0803f0 f0Var) {
            f0Var.mo5664K(true);
            if (f0Var.f4610a != null && f0Var.f4617b == null) {
                f0Var.f4610a = null;
            }
            f0Var.f4617b = null;
            if (!f0Var.mo5666M() && !RecyclerView.this.mo5508r1(f0Var.f4609a) && f0Var.mo5655B()) {
                RecyclerView.this.removeDetachedView(f0Var.f4609a, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C0818o {
        @Deprecated
        /* renamed from: f */
        public void mo5780f(@mr2 Rect rect, int i, @mr2 RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: g */
        public void mo5781g(@mr2 Rect rect, @mr2 View view, @mr2 RecyclerView recyclerView, @mr2 C0797c0 c0Var) {
            mo5780f(rect, ((LayoutParams) view.getLayoutParams()).mo5562d(), recyclerView);
        }

        @Deprecated
        /* renamed from: h */
        public void mo5782h(@mr2 Canvas canvas, @mr2 RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo5783i(@mr2 Canvas canvas, @mr2 RecyclerView recyclerView, @mr2 C0797c0 c0Var) {
            mo5782h(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: j */
        public void mo5784j(@mr2 Canvas canvas, @mr2 RecyclerView recyclerView) {
        }

        /* renamed from: k */
        public void mo5785k(@mr2 Canvas canvas, @mr2 RecyclerView recyclerView, @mr2 C0797c0 c0Var) {
            mo5784j(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class C0819p {

        /* renamed from: a */
        public int f4657a;
        @ts2

        /* renamed from: a */
        public C0793b0 f4658a;

        /* renamed from: a */
        public RecyclerView f4659a;

        /* renamed from: a */
        public final C0859c0.C0861b f4660a;

        /* renamed from: a */
        public C0859c0 f4661a;

        /* renamed from: a */
        public C0872e f4662a;

        /* renamed from: a */
        public boolean f4663a = false;

        /* renamed from: b */
        public int f4664b;

        /* renamed from: b */
        public final C0859c0.C0861b f4665b;

        /* renamed from: b */
        public C0859c0 f4666b;

        /* renamed from: b */
        public boolean f4667b = false;

        /* renamed from: c */
        public int f4668c;

        /* renamed from: c */
        public boolean f4669c = false;

        /* renamed from: d */
        public int f4670d;

        /* renamed from: d */
        public boolean f4671d = true;

        /* renamed from: e */
        public int f4672e;

        /* renamed from: e */
        public boolean f4673e = true;

        /* renamed from: f */
        public boolean f4674f;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$a */
        public class C0820a implements C0859c0.C0861b {
            public C0820a() {
            }

            /* renamed from: a */
            public View mo5906a(int i) {
                return C0819p.this.mo5825P(i);
            }

            /* renamed from: b */
            public int mo5907b(View view) {
                return C0819p.this.mo5846Y(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: c */
            public int mo5908c() {
                return C0819p.this.mo5887o0();
            }

            /* renamed from: d */
            public int mo5909d() {
                return C0819p.this.mo5904z0() - C0819p.this.mo5888p0();
            }

            /* renamed from: e */
            public int mo5910e(View view) {
                return C0819p.this.mo5852b0(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$b */
        public class C0821b implements C0859c0.C0861b {
            public C0821b() {
            }

            /* renamed from: a */
            public View mo5906a(int i) {
                return C0819p.this.mo5825P(i);
            }

            /* renamed from: b */
            public int mo5907b(View view) {
                return C0819p.this.mo5855c0(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: c */
            public int mo5908c() {
                return C0819p.this.mo5891r0();
            }

            /* renamed from: d */
            public int mo5909d() {
                return C0819p.this.mo5862e0() - C0819p.this.mo5884m0();
            }

            /* renamed from: e */
            public int mo5910e(View view) {
                return C0819p.this.mo5840W(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$c */
        public interface C0822c {
            /* renamed from: a */
            void mo5911a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$d */
        public static class C0823d {

            /* renamed from: a */
            public int f4677a;

            /* renamed from: a */
            public boolean f4678a;

            /* renamed from: b */
            public int f4679b;

            /* renamed from: b */
            public boolean f4680b;
        }

        public C0819p() {
            C0820a aVar = new C0820a();
            this.f4660a = aVar;
            C0821b bVar = new C0821b();
            this.f4665b = bVar;
            this.f4661a = new C0859c0(aVar);
            this.f4666b = new C0859c0(bVar);
        }

        /* renamed from: L0 */
        public static boolean m5633L0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* renamed from: R */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m5634R(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0819p.m5634R(int, int, int, int, boolean):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            if (r3 >= 0) goto L_0x0011;
         */
        @java.lang.Deprecated
        /* renamed from: S */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m5635S(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L_0x000f
                if (r3 < 0) goto L_0x000d
                goto L_0x0011
            L_0x000d:
                r3 = 0
                goto L_0x0021
            L_0x000f:
                if (r3 < 0) goto L_0x0014
            L_0x0011:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L_0x0021
            L_0x0014:
                r4 = -1
                if (r3 != r4) goto L_0x001b
                r2 = 1073741824(0x40000000, float:2.0)
            L_0x0019:
                r3 = r1
                goto L_0x0021
            L_0x001b:
                r4 = -2
                if (r3 != r4) goto L_0x000d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0019
            L_0x0021:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0819p.m5635S(int, int, int, boolean):int");
        }

        /* renamed from: q */
        public static int m5636q(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: t0 */
        public static C0823d m5637t0(@mr2 Context context, @ts2 AttributeSet attributeSet, int i, int i2) {
            C0823d dVar = new C0823d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sb3.C3494j.RecyclerView, i, i2);
            dVar.f4677a = obtainStyledAttributes.getInt(sb3.C3494j.RecyclerView_android_orientation, 1);
            dVar.f4679b = obtainStyledAttributes.getInt(sb3.C3494j.RecyclerView_spanCount, 1);
            dVar.f4678a = obtainStyledAttributes.getBoolean(sb3.C3494j.RecyclerView_reverseLayout, false);
            dVar.f4680b = obtainStyledAttributes.getBoolean(sb3.C3494j.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: A */
        public void mo5786A(@mr2 View view, @mr2 C0831w wVar) {
            mo5827P1(wVar, this.f4662a.mo6212m(view), view);
        }

        /* renamed from: A0 */
        public int mo5787A0() {
            return this.f4664b;
        }

        /* renamed from: A1 */
        public boolean mo5788A1(@mr2 C0831w wVar, @mr2 C0797c0 c0Var, @mr2 View view, int i, @ts2 Bundle bundle) {
            return false;
        }

        /* renamed from: B */
        public void mo5789B(int i, @mr2 C0831w wVar) {
            mo5827P1(wVar, i, mo5825P(i));
        }

        /* renamed from: B0 */
        public boolean mo5790B0() {
            int Q = mo5828Q();
            for (int i = 0; i < Q; i++) {
                ViewGroup.LayoutParams layoutParams = mo5825P(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: B1 */
        public void mo5791B1(Runnable runnable) {
            RecyclerView recyclerView = this.f4659a;
            if (recyclerView != null) {
                jt4.m18993p1(recyclerView, runnable);
            }
        }

        /* renamed from: C */
        public void mo5792C(@mr2 View view) {
            int m = this.f4662a.mo6212m(view);
            if (m >= 0) {
                mo5798E(m, view);
            }
        }

        /* renamed from: C0 */
        public boolean mo5793C0() {
            RecyclerView recyclerView = this.f4659a;
            return recyclerView != null && recyclerView.hasFocus();
        }

        /* renamed from: C1 */
        public void mo5794C1() {
            for (int Q = mo5828Q() - 1; Q >= 0; Q--) {
                this.f4662a.mo6216q(Q);
            }
        }

        /* renamed from: D */
        public void mo5795D(int i) {
            mo5798E(i, mo5825P(i));
        }

        /* renamed from: D0 */
        public void mo5796D0(@mr2 View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f4659a;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f4659a.mo5421Y());
            }
            C0803f0 u0 = RecyclerView.m5265u0(view);
            u0.mo5672b(128);
            this.f4659a.f4490a.mo6199q(u0);
        }

        /* renamed from: D1 */
        public void mo5797D1(@mr2 C0831w wVar) {
            for (int Q = mo5828Q() - 1; Q >= 0; Q--) {
                if (!RecyclerView.m5265u0(mo5825P(Q)).mo5667N()) {
                    mo5805G1(Q, wVar);
                }
            }
        }

        /* renamed from: E */
        public final void mo5798E(int i, @mr2 View view) {
            this.f4662a.mo6203d(i);
        }

        /* renamed from: E0 */
        public boolean mo5799E0() {
            return this.f4667b;
        }

        /* renamed from: E1 */
        public void mo5800E1(C0831w wVar) {
            int k = wVar.mo5956k();
            for (int i = k - 1; i >= 0; i--) {
                View o = wVar.mo5960o(i);
                C0803f0 u0 = RecyclerView.m5265u0(o);
                if (!u0.mo5667N()) {
                    u0.mo5664K(false);
                    if (u0.mo5655B()) {
                        this.f4659a.removeDetachedView(o, false);
                    }
                    C0812m mVar = this.f4659a.f4479a;
                    if (mVar != null) {
                        mVar.mo5760k(u0);
                    }
                    u0.mo5664K(true);
                    wVar.mo5971z(o);
                }
            }
            wVar.mo5951f();
            if (k > 0) {
                this.f4659a.invalidate();
            }
        }

        /* renamed from: F */
        public void mo5801F(RecyclerView recyclerView) {
            this.f4667b = true;
            mo5844X0(recyclerView);
        }

        /* renamed from: F0 */
        public boolean mo5262F0() {
            return this.f4669c;
        }

        /* renamed from: F1 */
        public void mo5802F1(@mr2 View view, @mr2 C0831w wVar) {
            mo5813J1(view);
            wVar.mo5934C(view);
        }

        /* renamed from: G */
        public void mo5803G(RecyclerView recyclerView, C0831w wVar) {
            this.f4667b = false;
            mo5282Z0(recyclerView, wVar);
        }

        /* renamed from: G0 */
        public boolean mo5804G0() {
            RecyclerView recyclerView = this.f4659a;
            return recyclerView != null && recyclerView.isFocused();
        }

        /* renamed from: G1 */
        public void mo5805G1(int i, @mr2 C0831w wVar) {
            View P = mo5825P(i);
            mo5815K1(i);
            wVar.mo5934C(P);
        }

        /* renamed from: H */
        public void mo5806H(View view) {
            C0812m mVar = this.f4659a.f4479a;
            if (mVar != null) {
                mVar.mo5760k(RecyclerView.m5265u0(view));
            }
        }

        /* renamed from: H0 */
        public final boolean mo5807H0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int o0 = mo5887o0();
            int r0 = mo5891r0();
            int z0 = mo5904z0() - mo5888p0();
            int e0 = mo5862e0() - mo5884m0();
            Rect rect = this.f4659a.f4468a;
            mo5843X(focusedChild, rect);
            return rect.left - i < z0 && rect.right - i > o0 && rect.top - i2 < e0 && rect.bottom - i2 > r0;
        }

        /* renamed from: H1 */
        public boolean mo5808H1(Runnable runnable) {
            RecyclerView recyclerView = this.f4659a;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        @ts2
        /* renamed from: I */
        public View mo5809I(@mr2 View view) {
            View b0;
            RecyclerView recyclerView = this.f4659a;
            if (recyclerView == null || (b0 = recyclerView.mo5429b0(view)) == null || this.f4662a.mo6213n(b0)) {
                return null;
            }
            return b0;
        }

        /* renamed from: I0 */
        public final boolean mo5810I0() {
            return this.f4673e;
        }

        /* renamed from: I1 */
        public void mo5811I1(@mr2 View view) {
            this.f4659a.removeDetachedView(view, false);
        }

        @ts2
        /* renamed from: J */
        public View mo5266J(int i) {
            int Q = mo5828Q();
            for (int i2 = 0; i2 < Q; i2++) {
                View P = mo5825P(i2);
                C0803f0 u0 = RecyclerView.m5265u0(P);
                if (u0 != null && u0.mo5686p() == i && !u0.mo5667N() && (this.f4659a.f4473a.mo5615j() || !u0.mo5697z())) {
                    return P;
                }
            }
            return null;
        }

        /* renamed from: J0 */
        public boolean mo5812J0(@mr2 C0831w wVar, @mr2 C0797c0 c0Var) {
            return false;
        }

        /* renamed from: J1 */
        public void mo5813J1(View view) {
            this.f4662a.mo6215p(view);
        }

        /* renamed from: K */
        public abstract LayoutParams mo5205K();

        /* renamed from: K0 */
        public boolean mo5814K0() {
            return this.f4671d;
        }

        /* renamed from: K1 */
        public void mo5815K1(int i) {
            if (mo5825P(i) != null) {
                this.f4662a.mo6216q(i);
            }
        }

        /* renamed from: L */
        public LayoutParams mo5207L(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        /* renamed from: L1 */
        public boolean mo5816L1(@mr2 RecyclerView recyclerView, @mr2 View view, @mr2 Rect rect, boolean z) {
            return mo5818M1(recyclerView, view, rect, z, false);
        }

        /* renamed from: M */
        public LayoutParams mo5209M(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        /* renamed from: M0 */
        public boolean mo5817M0() {
            C0793b0 b0Var = this.f4658a;
            return b0Var != null && b0Var.mo5581i();
        }

        /* renamed from: M1 */
        public boolean mo5818M1(@mr2 RecyclerView recyclerView, @mr2 View view, @mr2 Rect rect, boolean z, boolean z2) {
            int[] T = mo5832T(view, rect);
            int i = T[0];
            int i2 = T[1];
            if ((z2 && !mo5807H0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo5384K1(i, i2);
            }
            return true;
        }

        /* renamed from: N */
        public int mo5819N() {
            return -1;
        }

        /* renamed from: N0 */
        public boolean mo5820N0(@mr2 View view, boolean z, boolean z2) {
            boolean z3 = this.f4661a.mo6161b(view, 24579) && this.f4666b.mo6161b(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: N1 */
        public void mo5821N1() {
            RecyclerView recyclerView = this.f4659a;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: O */
        public int mo5822O(@mr2 View view) {
            return ((LayoutParams) view.getLayoutParams()).f4542a.bottom;
        }

        /* renamed from: O0 */
        public void mo5823O0(@mr2 View view, int i, int i2, int i3, int i4) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f4542a;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        /* renamed from: O1 */
        public void mo5824O1() {
            this.f4663a = true;
        }

        @ts2
        /* renamed from: P */
        public View mo5825P(int i) {
            C0872e eVar = this.f4662a;
            if (eVar != null) {
                return eVar.mo6205f(i);
            }
            return null;
        }

        /* renamed from: P0 */
        public void mo5826P0(@mr2 View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f4542a;
            view.layout(i + rect.left + layoutParams.leftMargin, i2 + rect.top + layoutParams.topMargin, (i3 - rect.right) - layoutParams.rightMargin, (i4 - rect.bottom) - layoutParams.bottomMargin);
        }

        /* renamed from: P1 */
        public final void mo5827P1(C0831w wVar, int i, View view) {
            C0803f0 u0 = RecyclerView.m5265u0(view);
            if (!u0.mo5667N()) {
                if (!u0.mo5695x() || u0.mo5697z() || this.f4659a.f4475a.mo5716l()) {
                    mo5795D(i);
                    wVar.mo5936E(view);
                    this.f4659a.f4490a.mo6193k(u0);
                    return;
                }
                mo5815K1(i);
                wVar.mo5935D(u0);
            }
        }

        /* renamed from: Q */
        public int mo5828Q() {
            C0872e eVar = this.f4662a;
            if (eVar != null) {
                return eVar.mo6206g();
            }
            return 0;
        }

        /* renamed from: Q0 */
        public void mo5829Q0(@mr2 View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect z0 = this.f4659a.mo5557z0(view);
            int i3 = i + z0.left + z0.right;
            int i4 = i2 + z0.top + z0.bottom;
            int R = m5634R(mo5904z0(), mo5787A0(), mo5887o0() + mo5888p0() + i3, layoutParams.width, mo5304n());
            int R2 = m5634R(mo5862e0(), mo5866f0(), mo5891r0() + mo5884m0() + i4, layoutParams.height, mo5307o());
            if (mo5857c2(view, R, R2, layoutParams)) {
                view.measure(R, R2);
            }
        }

        /* renamed from: Q1 */
        public int mo5214Q1(int i, C0831w wVar, C0797c0 c0Var) {
            return 0;
        }

        /* renamed from: R0 */
        public void mo5830R0(@mr2 View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect z0 = this.f4659a.mo5557z0(view);
            int i3 = i + z0.left + z0.right;
            int i4 = i2 + z0.top + z0.bottom;
            int R = m5634R(mo5904z0(), mo5787A0(), mo5887o0() + mo5888p0() + layoutParams.leftMargin + layoutParams.rightMargin + i3, layoutParams.width, mo5304n());
            int R2 = m5634R(mo5862e0(), mo5866f0(), mo5891r0() + mo5884m0() + layoutParams.topMargin + layoutParams.bottomMargin + i4, layoutParams.height, mo5307o());
            if (mo5857c2(view, R, R2, layoutParams)) {
                view.measure(R, R2);
            }
        }

        /* renamed from: R1 */
        public void mo5275R1(int i) {
        }

        /* renamed from: S0 */
        public void mo5831S0(int i, int i2) {
            View P = mo5825P(i);
            if (P != null) {
                mo5795D(i);
                mo5879k(P, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f4659a.toString());
        }

        /* renamed from: S1 */
        public int mo5215S1(int i, C0831w wVar, C0797c0 c0Var) {
            return 0;
        }

        /* renamed from: T */
        public final int[] mo5832T(View view, Rect rect) {
            int[] iArr = new int[2];
            int o0 = mo5887o0();
            int r0 = mo5891r0();
            int z0 = mo5904z0() - mo5888p0();
            int e0 = mo5862e0() - mo5884m0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - o0;
            int min = Math.min(0, i);
            int i2 = top - r0;
            int min2 = Math.min(0, i2);
            int i3 = width - z0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - e0);
            if (mo5875i0() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: T0 */
        public void mo5833T0(@e83 int i) {
            RecyclerView recyclerView = this.f4659a;
            if (recyclerView != null) {
                recyclerView.mo5416V0(i);
            }
        }

        @Deprecated
        /* renamed from: T1 */
        public void mo5834T1(boolean z) {
            this.f4669c = z;
        }

        /* renamed from: U */
        public boolean mo5835U() {
            RecyclerView recyclerView = this.f4659a;
            return recyclerView != null && recyclerView.f4506b;
        }

        /* renamed from: U0 */
        public void mo5836U0(@e83 int i) {
            RecyclerView recyclerView = this.f4659a;
            if (recyclerView != null) {
                recyclerView.mo5418W0(i);
            }
        }

        /* renamed from: U1 */
        public void mo5837U1(RecyclerView recyclerView) {
            mo5842W1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: V */
        public int mo5217V(@mr2 C0831w wVar, @mr2 C0797c0 c0Var) {
            return -1;
        }

        /* renamed from: V0 */
        public void mo5838V0(@ts2 C0805h hVar, @ts2 C0805h hVar2) {
        }

        /* renamed from: V1 */
        public final void mo5839V1(boolean z) {
            if (z != this.f4673e) {
                this.f4673e = z;
                this.f4657a = 0;
                RecyclerView recyclerView = this.f4659a;
                if (recyclerView != null) {
                    recyclerView.f4484a.mo5943L();
                }
            }
        }

        /* renamed from: W */
        public int mo5840W(@mr2 View view) {
            return view.getBottom() + mo5822O(view);
        }

        /* renamed from: W0 */
        public boolean mo5841W0(@mr2 RecyclerView recyclerView, @mr2 ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: W1 */
        public void mo5842W1(int i, int i2) {
            this.f4670d = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f4664b = mode;
            if (mode == 0 && !RecyclerView.f4459u) {
                this.f4670d = 0;
            }
            this.f4672e = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f4668c = mode2;
            if (mode2 == 0 && !RecyclerView.f4459u) {
                this.f4672e = 0;
            }
        }

        /* renamed from: X */
        public void mo5843X(@mr2 View view, @mr2 Rect rect) {
            RecyclerView.m5266w0(view, rect);
        }

        @C3740us
        /* renamed from: X0 */
        public void mo5844X0(RecyclerView recyclerView) {
        }

        /* renamed from: X1 */
        public void mo5845X1(int i, int i2) {
            this.f4659a.setMeasuredDimension(i, i2);
        }

        /* renamed from: Y */
        public int mo5846Y(@mr2 View view) {
            return view.getLeft() - mo5878j0(view);
        }

        @Deprecated
        /* renamed from: Y0 */
        public void mo5847Y0(RecyclerView recyclerView) {
        }

        /* renamed from: Y1 */
        public void mo5219Y1(Rect rect, int i, int i2) {
            mo5845X1(m5636q(i, rect.width() + mo5887o0() + mo5888p0(), mo5882l0()), m5636q(i2, rect.height() + mo5891r0() + mo5884m0(), mo5880k0()));
        }

        /* renamed from: Z */
        public int mo5848Z(@mr2 View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f4542a;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        @C3740us
        /* renamed from: Z0 */
        public void mo5282Z0(RecyclerView recyclerView, C0831w wVar) {
            mo5847Y0(recyclerView);
        }

        /* renamed from: Z1 */
        public void mo5849Z1(int i, int i2) {
            int Q = mo5828Q();
            if (Q == 0) {
                this.f4659a.mo5373H(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < Q; i7++) {
                View P = mo5825P(i7);
                Rect rect = this.f4659a.f4468a;
                mo5843X(P, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f4659a.f4468a.set(i5, i6, i3, i4);
            mo5219Y1(this.f4659a.f4468a, i, i2);
        }

        /* renamed from: a0 */
        public int mo5850a0(@mr2 View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f4542a;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        @ts2
        /* renamed from: a1 */
        public View mo5220a1(@mr2 View view, int i, @mr2 C0831w wVar, @mr2 C0797c0 c0Var) {
            return null;
        }

        /* renamed from: a2 */
        public void mo5851a2(boolean z) {
            this.f4671d = z;
        }

        /* renamed from: b0 */
        public int mo5852b0(@mr2 View view) {
            return view.getRight() + mo5895u0(view);
        }

        /* renamed from: b1 */
        public void mo5287b1(@mr2 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4659a;
            mo5856c1(recyclerView.f4484a, recyclerView.f4473a, accessibilityEvent);
        }

        /* renamed from: b2 */
        public void mo5853b2(RecyclerView recyclerView) {
            int i;
            if (recyclerView == null) {
                this.f4659a = null;
                this.f4662a = null;
                i = 0;
                this.f4670d = 0;
            } else {
                this.f4659a = recyclerView;
                this.f4662a = recyclerView.f4491a;
                this.f4670d = recyclerView.getWidth();
                i = recyclerView.getHeight();
            }
            this.f4672e = i;
            this.f4664b = 1073741824;
            this.f4668c = 1073741824;
        }

        /* renamed from: c */
        public void mo5854c(View view) {
            mo5858d(view, -1);
        }

        /* renamed from: c0 */
        public int mo5855c0(@mr2 View view) {
            return view.getTop() - mo5899x0(view);
        }

        /* renamed from: c1 */
        public void mo5856c1(@mr2 C0831w wVar, @mr2 C0797c0 c0Var, @mr2 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4659a;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f4659a.canScrollVertically(-1) && !this.f4659a.canScrollHorizontally(-1) && !this.f4659a.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C0805h hVar = this.f4659a.f4475a;
                if (hVar != null) {
                    accessibilityEvent.setItemCount(hVar.mo5711g());
                }
            }
        }

        /* renamed from: c2 */
        public boolean mo5857c2(View view, int i, int i2, LayoutParams layoutParams) {
            return view.isLayoutRequested() || !this.f4671d || !m5633L0(view.getWidth(), i, layoutParams.width) || !m5633L0(view.getHeight(), i2, layoutParams.height);
        }

        /* renamed from: d */
        public void mo5858d(View view, int i) {
            mo5868g(view, i, true);
        }

        @ts2
        /* renamed from: d0 */
        public View mo5859d0() {
            View focusedChild;
            RecyclerView recyclerView = this.f4659a;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f4662a.mo6213n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: d1 */
        public void mo5860d1(@mr2 C0831w wVar, @mr2 C0797c0 c0Var, @mr2 C1638a2 a2Var) {
            if (this.f4659a.canScrollVertically(-1) || this.f4659a.canScrollHorizontally(-1)) {
                a2Var.mo12556a(8192);
                a2Var.mo12498F1(true);
            }
            if (this.f4659a.canScrollVertically(1) || this.f4659a.canScrollHorizontally(1)) {
                a2Var.mo12556a(4096);
                a2Var.mo12498F1(true);
            }
            a2Var.mo12553Y0(C1638a2.C1640b.m10703f(mo5237v0(wVar, c0Var), mo5217V(wVar, c0Var), mo5812J0(wVar, c0Var), mo5897w0(wVar, c0Var)));
        }

        /* renamed from: d2 */
        public boolean mo5290d2() {
            return false;
        }

        /* renamed from: e */
        public void mo5861e(View view) {
            mo5865f(view, -1);
        }

        @e83
        /* renamed from: e0 */
        public int mo5862e0() {
            return this.f4672e;
        }

        /* renamed from: e1 */
        public void mo5863e1(C1638a2 a2Var) {
            RecyclerView recyclerView = this.f4659a;
            mo5860d1(recyclerView.f4484a, recyclerView.f4473a, a2Var);
        }

        /* renamed from: e2 */
        public boolean mo5864e2(View view, int i, int i2, LayoutParams layoutParams) {
            return !this.f4671d || !m5633L0(view.getMeasuredWidth(), i, layoutParams.width) || !m5633L0(view.getMeasuredHeight(), i2, layoutParams.height);
        }

        /* renamed from: f */
        public void mo5865f(View view, int i) {
            mo5868g(view, i, false);
        }

        /* renamed from: f0 */
        public int mo5866f0() {
            return this.f4668c;
        }

        /* renamed from: f1 */
        public void mo5867f1(View view, C1638a2 a2Var) {
            C0803f0 u0 = RecyclerView.m5265u0(view);
            if (u0 != null && !u0.mo5697z() && !this.f4662a.mo6213n(u0.f4609a)) {
                RecyclerView recyclerView = this.f4659a;
                mo5221g1(recyclerView.f4484a, recyclerView.f4473a, view, a2Var);
            }
        }

        /* renamed from: f2 */
        public void mo5293f2(RecyclerView recyclerView, C0797c0 c0Var, int i) {
            Log.e(RecyclerView.f4445b, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: g */
        public final void mo5868g(View view, int i, boolean z) {
            C0803f0 u0 = RecyclerView.m5265u0(view);
            if (z || u0.mo5697z()) {
                this.f4659a.f4490a.mo6184b(u0);
            } else {
                this.f4659a.f4490a.mo6198p(u0);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (u0.mo5670Q() || u0.mo5654A()) {
                if (u0.mo5654A()) {
                    u0.mo5669P();
                } else {
                    u0.mo5675e();
                }
                this.f4662a.mo6202c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f4659a) {
                int m = this.f4662a.mo6212m(view);
                if (i == -1) {
                    i = this.f4662a.mo6206g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f4659a.indexOfChild(view) + this.f4659a.mo5421Y());
                } else if (m != i) {
                    this.f4659a.f4480a.mo5831S0(m, i);
                }
            } else {
                this.f4662a.mo6200a(view, i, false);
                layoutParams.f4544a = true;
                C0793b0 b0Var = this.f4658a;
                if (b0Var != null && b0Var.mo5581i()) {
                    this.f4658a.mo5584l(view);
                }
            }
            if (layoutParams.f4545b) {
                u0.f4609a.invalidate();
                layoutParams.f4545b = false;
            }
        }

        /* renamed from: g0 */
        public int mo5869g0() {
            RecyclerView recyclerView = this.f4659a;
            C0805h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo5711g();
            }
            return 0;
        }

        /* renamed from: g1 */
        public void mo5221g1(@mr2 C0831w wVar, @mr2 C0797c0 c0Var, @mr2 View view, @mr2 C1638a2 a2Var) {
        }

        /* renamed from: g2 */
        public void mo5870g2(C0793b0 b0Var) {
            C0793b0 b0Var2 = this.f4658a;
            if (!(b0Var2 == null || b0Var == b0Var2 || !b0Var2.mo5581i())) {
                this.f4658a.mo5591s();
            }
            this.f4658a = b0Var;
            b0Var.mo5590r(this.f4659a, this);
        }

        /* renamed from: h */
        public void mo5871h(String str) {
            RecyclerView recyclerView = this.f4659a;
            if (recyclerView != null) {
                recyclerView.mo5548w(str);
            }
        }

        /* renamed from: h0 */
        public int mo5872h0(@mr2 View view) {
            return RecyclerView.m5265u0(view).mo5685o();
        }

        @ts2
        /* renamed from: h1 */
        public View mo5873h1(@mr2 View view, int i) {
            return null;
        }

        /* renamed from: h2 */
        public void mo5874h2(@mr2 View view) {
            C0803f0 u0 = RecyclerView.m5265u0(view);
            u0.mo5668O();
            u0.mo5661H();
            u0.mo5672b(4);
        }

        /* renamed from: i */
        public void mo5297i(String str) {
            RecyclerView recyclerView = this.f4659a;
            if (recyclerView != null) {
                recyclerView.mo5550x(str);
            }
        }

        /* renamed from: i0 */
        public int mo5875i0() {
            return jt4.m18928Z(this.f4659a);
        }

        /* renamed from: i1 */
        public void mo5222i1(@mr2 RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: i2 */
        public void mo5876i2() {
            C0793b0 b0Var = this.f4658a;
            if (b0Var != null) {
                b0Var.mo5591s();
            }
        }

        /* renamed from: j */
        public void mo5877j(@mr2 View view) {
            mo5879k(view, -1);
        }

        /* renamed from: j0 */
        public int mo5878j0(@mr2 View view) {
            return ((LayoutParams) view.getLayoutParams()).f4542a.left;
        }

        /* renamed from: j1 */
        public void mo5223j1(@mr2 RecyclerView recyclerView) {
        }

        /* renamed from: j2 */
        public boolean mo5224j2() {
            return false;
        }

        /* renamed from: k */
        public void mo5879k(@mr2 View view, int i) {
            mo5881l(view, i, (LayoutParams) view.getLayoutParams());
        }

        @e83
        /* renamed from: k0 */
        public int mo5880k0() {
            return jt4.m18948e0(this.f4659a);
        }

        /* renamed from: k1 */
        public void mo5226k1(@mr2 RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: l */
        public void mo5881l(@mr2 View view, int i, LayoutParams layoutParams) {
            C0803f0 u0 = RecyclerView.m5265u0(view);
            if (u0.mo5697z()) {
                this.f4659a.f4490a.mo6184b(u0);
            } else {
                this.f4659a.f4490a.mo6198p(u0);
            }
            this.f4662a.mo6202c(view, i, layoutParams, u0.mo5697z());
        }

        @e83
        /* renamed from: l0 */
        public int mo5882l0() {
            return jt4.m18952f0(this.f4659a);
        }

        /* renamed from: l1 */
        public void mo5227l1(@mr2 RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: m */
        public void mo5883m(@mr2 View view, @mr2 Rect rect) {
            RecyclerView recyclerView = this.f4659a;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo5557z0(view));
            }
        }

        @e83
        /* renamed from: m0 */
        public int mo5884m0() {
            RecyclerView recyclerView = this.f4659a;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: m1 */
        public void mo5885m1(@mr2 RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: n */
        public boolean mo5304n() {
            return false;
        }

        @e83
        /* renamed from: n0 */
        public int mo5886n0() {
            RecyclerView recyclerView = this.f4659a;
            if (recyclerView != null) {
                return jt4.m18968j0(recyclerView);
            }
            return 0;
        }

        /* renamed from: n1 */
        public void mo5229n1(@mr2 RecyclerView recyclerView, int i, int i2, @ts2 Object obj) {
            mo5885m1(recyclerView, i, i2);
        }

        /* renamed from: o */
        public boolean mo5307o() {
            return false;
        }

        @e83
        /* renamed from: o0 */
        public int mo5887o0() {
            RecyclerView recyclerView = this.f4659a;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: o1 */
        public void mo5230o1(C0831w wVar, C0797c0 c0Var) {
            Log.e(RecyclerView.f4445b, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: p */
        public boolean mo5231p(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        @e83
        /* renamed from: p0 */
        public int mo5888p0() {
            RecyclerView recyclerView = this.f4659a;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: p1 */
        public void mo5232p1(C0797c0 c0Var) {
        }

        @e83
        /* renamed from: q0 */
        public int mo5889q0() {
            RecyclerView recyclerView = this.f4659a;
            if (recyclerView != null) {
                return jt4.m18972k0(recyclerView);
            }
            return 0;
        }

        /* renamed from: q1 */
        public void mo5890q1(@mr2 C0831w wVar, @mr2 C0797c0 c0Var, int i, int i2) {
            this.f4659a.mo5373H(i, i2);
        }

        /* renamed from: r */
        public void mo5314r(int i, int i2, C0797c0 c0Var, C0822c cVar) {
        }

        @e83
        /* renamed from: r0 */
        public int mo5891r0() {
            RecyclerView recyclerView = this.f4659a;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        @Deprecated
        /* renamed from: r1 */
        public boolean mo5892r1(@mr2 RecyclerView recyclerView, @mr2 View view, @ts2 View view2) {
            return mo5817M0() || recyclerView.mo5392N0();
        }

        /* renamed from: s */
        public void mo5317s(int i, C0822c cVar) {
        }

        /* renamed from: s0 */
        public int mo5893s0(@mr2 View view) {
            return ((LayoutParams) view.getLayoutParams()).mo5562d();
        }

        /* renamed from: s1 */
        public boolean mo5894s1(@mr2 RecyclerView recyclerView, @mr2 C0797c0 c0Var, @mr2 View view, @ts2 View view2) {
            return mo5892r1(recyclerView, view, view2);
        }

        /* renamed from: t */
        public int mo5320t(@mr2 C0797c0 c0Var) {
            return 0;
        }

        /* renamed from: t1 */
        public void mo5321t1(Parcelable parcelable) {
        }

        /* renamed from: u */
        public int mo5234u(@mr2 C0797c0 c0Var) {
            return 0;
        }

        /* renamed from: u0 */
        public int mo5895u0(@mr2 View view) {
            return ((LayoutParams) view.getLayoutParams()).f4542a.right;
        }

        @ts2
        /* renamed from: u1 */
        public Parcelable mo5323u1() {
            return null;
        }

        /* renamed from: v */
        public int mo5236v(@mr2 C0797c0 c0Var) {
            return 0;
        }

        /* renamed from: v0 */
        public int mo5237v0(@mr2 C0831w wVar, @mr2 C0797c0 c0Var) {
            return -1;
        }

        /* renamed from: v1 */
        public void mo5896v1(int i) {
        }

        /* renamed from: w */
        public int mo5326w(@mr2 C0797c0 c0Var) {
            return 0;
        }

        /* renamed from: w0 */
        public int mo5897w0(@mr2 C0831w wVar, @mr2 C0797c0 c0Var) {
            return 0;
        }

        /* renamed from: w1 */
        public void mo5898w1(C0793b0 b0Var) {
            if (this.f4658a == b0Var) {
                this.f4658a = null;
            }
        }

        /* renamed from: x */
        public int mo5239x(@mr2 C0797c0 c0Var) {
            return 0;
        }

        /* renamed from: x0 */
        public int mo5899x0(@mr2 View view) {
            return ((LayoutParams) view.getLayoutParams()).f4542a.top;
        }

        /* renamed from: x1 */
        public boolean mo5900x1(int i, @ts2 Bundle bundle) {
            RecyclerView recyclerView = this.f4659a;
            return mo5902y1(recyclerView.f4484a, recyclerView.f4473a, i, bundle);
        }

        /* renamed from: y */
        public int mo5241y(@mr2 C0797c0 c0Var) {
            return 0;
        }

        /* renamed from: y0 */
        public void mo5901y0(@mr2 View view, boolean z, @mr2 Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f4542a;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f4659a == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f4659a.f4469a;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* renamed from: y1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo5902y1(@com.onedelhi.secure.mr2 androidx.recyclerview.widget.RecyclerView.C0831w r8, @com.onedelhi.secure.mr2 androidx.recyclerview.widget.RecyclerView.C0797c0 r9, int r10, @com.onedelhi.secure.ts2 android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f4659a
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.mo5862e0()
                int r11 = r7.mo5891r0()
                int r8 = r8 - r11
                int r11 = r7.mo5884m0()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f4659a
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo5904z0()
                int r11 = r7.mo5887o0()
                int r10 = r10 - r11
                int r11 = r7.mo5888p0()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.mo5862e0()
                int r10 = r7.mo5891r0()
                int r8 = r8 - r10
                int r10 = r7.mo5884m0()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f4659a
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo5904z0()
                int r11 = r7.mo5887o0()
                int r10 = r10 - r11
                int r11 = r7.mo5888p0()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = 0
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f4659a
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.mo5393N1(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0819p.mo5902y1(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$c0, int, android.os.Bundle):boolean");
        }

        /* renamed from: z */
        public void mo5903z(@mr2 C0831w wVar) {
            for (int Q = mo5828Q() - 1; Q >= 0; Q--) {
                mo5827P1(wVar, Q, mo5825P(Q));
            }
        }

        @e83
        /* renamed from: z0 */
        public int mo5904z0() {
            return this.f4670d;
        }

        /* renamed from: z1 */
        public boolean mo5905z1(@mr2 View view, int i, @ts2 Bundle bundle) {
            RecyclerView recyclerView = this.f4659a;
            return mo5788A1(recyclerView.f4484a, recyclerView.f4473a, view, i, bundle);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface C0824q {
        /* renamed from: c */
        void mo5912c(@mr2 View view);

        /* renamed from: e */
        void mo5913e(@mr2 View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class C0825r {
        /* renamed from: a */
        public abstract boolean mo5914a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C0826s {
        /* renamed from: a */
        void mo5569a(@mr2 RecyclerView recyclerView, @mr2 MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo5570b(@mr2 RecyclerView recyclerView, @mr2 MotionEvent motionEvent);

        /* renamed from: d */
        void mo5571d(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class C0827t {
        /* renamed from: a */
        public void mo5915a(@mr2 RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo5916b(@mr2 RecyclerView recyclerView, int i, int i2) {
        }
    }

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public @interface C0828u {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public static class C0829v {

        /* renamed from: b */
        public static final int f4681b = 5;

        /* renamed from: a */
        public int f4682a = 0;

        /* renamed from: a */
        public SparseArray<C0830a> f4683a = new SparseArray<>();

        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$a */
        public static class C0830a {

            /* renamed from: a */
            public int f4684a = 5;

            /* renamed from: a */
            public long f4685a = 0;

            /* renamed from: a */
            public final ArrayList<C0803f0> f4686a = new ArrayList<>();

            /* renamed from: b */
            public long f4687b = 0;
        }

        /* renamed from: a */
        public void mo5917a() {
            this.f4682a++;
        }

        /* renamed from: b */
        public void mo5918b() {
            for (int i = 0; i < this.f4683a.size(); i++) {
                this.f4683a.valueAt(i).f4686a.clear();
            }
        }

        /* renamed from: c */
        public void mo5919c() {
            this.f4682a--;
        }

        /* renamed from: d */
        public void mo5920d(int i, long j) {
            C0830a h = mo5924h(i);
            h.f4687b = mo5927k(h.f4687b, j);
        }

        /* renamed from: e */
        public void mo5921e(int i, long j) {
            C0830a h = mo5924h(i);
            h.f4685a = mo5927k(h.f4685a, j);
        }

        @ts2
        /* renamed from: f */
        public C0803f0 mo5922f(int i) {
            C0830a aVar = this.f4683a.get(i);
            if (aVar == null || aVar.f4686a.isEmpty()) {
                return null;
            }
            ArrayList<C0803f0> arrayList = aVar.f4686a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).mo5693v()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* renamed from: g */
        public int mo5923g(int i) {
            return mo5924h(i).f4686a.size();
        }

        /* renamed from: h */
        public final C0830a mo5924h(int i) {
            C0830a aVar = this.f4683a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0830a aVar2 = new C0830a();
            this.f4683a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: i */
        public void mo5925i(C0805h hVar, C0805h hVar2, boolean z) {
            if (hVar != null) {
                mo5919c();
            }
            if (!z && this.f4682a == 0) {
                mo5918b();
            }
            if (hVar2 != null) {
                mo5917a();
            }
        }

        /* renamed from: j */
        public void mo5926j(C0803f0 f0Var) {
            int o = f0Var.mo5685o();
            ArrayList<C0803f0> arrayList = mo5924h(o).f4686a;
            if (this.f4683a.get(o).f4684a > arrayList.size()) {
                f0Var.mo5661H();
                arrayList.add(f0Var);
            }
        }

        /* renamed from: k */
        public long mo5927k(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: l */
        public void mo5928l(int i, int i2) {
            C0830a h = mo5924h(i);
            h.f4684a = i2;
            ArrayList<C0803f0> arrayList = h.f4686a;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        /* renamed from: m */
        public int mo5929m() {
            int i = 0;
            for (int i2 = 0; i2 < this.f4683a.size(); i2++) {
                ArrayList<C0803f0> arrayList = this.f4683a.valueAt(i2).f4686a;
                if (arrayList != null) {
                    i += arrayList.size();
                }
            }
            return i;
        }

        /* renamed from: n */
        public boolean mo5930n(int i, long j, long j2) {
            long j3 = mo5924h(i).f4687b;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: o */
        public boolean mo5931o(int i, long j, long j2) {
            long j3 = mo5924h(i).f4685a;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public final class C0831w {

        /* renamed from: c */
        public static final int f4688c = 2;

        /* renamed from: a */
        public int f4689a;

        /* renamed from: a */
        public C0799d0 f4690a;

        /* renamed from: a */
        public C0829v f4691a;

        /* renamed from: a */
        public final ArrayList<C0803f0> f4693a;

        /* renamed from: a */
        public final List<C0803f0> f4694a;

        /* renamed from: b */
        public int f4695b;

        /* renamed from: b */
        public ArrayList<C0803f0> f4696b = null;

        /* renamed from: c */
        public final ArrayList<C0803f0> f4697c = new ArrayList<>();

        public C0831w() {
            ArrayList<C0803f0> arrayList = new ArrayList<>();
            this.f4693a = arrayList;
            this.f4694a = Collections.unmodifiableList(arrayList);
            this.f4689a = 2;
            this.f4695b = 2;
        }

        /* renamed from: A */
        public void mo5932A() {
            for (int size = this.f4697c.size() - 1; size >= 0; size--) {
                mo5933B(size);
            }
            this.f4697c.clear();
            if (RecyclerView.f4461w) {
                RecyclerView.this.f4492a.mo6383b();
            }
        }

        /* renamed from: B */
        public void mo5933B(int i) {
            mo5946a(this.f4697c.get(i), true);
            this.f4697c.remove(i);
        }

        /* renamed from: C */
        public void mo5934C(@mr2 View view) {
            C0803f0 u0 = RecyclerView.m5265u0(view);
            if (u0.mo5655B()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (u0.mo5654A()) {
                u0.mo5669P();
            } else if (u0.mo5670Q()) {
                u0.mo5675e();
            }
            mo5935D(u0);
            if (RecyclerView.this.f4479a != null && !u0.mo5696y()) {
                RecyclerView.this.f4479a.mo5760k(u0);
            }
        }

        /* renamed from: D */
        public void mo5935D(C0803f0 f0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (f0Var.mo5654A() || f0Var.f4609a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(f0Var.mo5654A());
                sb.append(" isAttached:");
                if (f0Var.f4609a.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.mo5421Y());
                throw new IllegalArgumentException(sb.toString());
            } else if (f0Var.mo5655B()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f0Var + RecyclerView.this.mo5421Y());
            } else if (!f0Var.mo5667N()) {
                boolean h = f0Var.mo5678h();
                C0805h hVar = RecyclerView.this.f4475a;
                if ((hVar != null && h && hVar.mo5699B(f0Var)) || f0Var.mo5696y()) {
                    if (this.f4695b <= 0 || f0Var.mo5690t(526)) {
                        z = false;
                    } else {
                        int size = this.f4697c.size();
                        if (size >= this.f4695b && size > 0) {
                            mo5933B(0);
                            size--;
                        }
                        if (RecyclerView.f4461w && size > 0 && !RecyclerView.this.f4492a.mo6385d(f0Var.f4620n)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f4492a.mo6385d(this.f4697c.get(i).f4620n)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f4697c.add(size, f0Var);
                        z = true;
                    }
                    if (!z) {
                        mo5946a(f0Var, true);
                        z2 = z;
                        RecyclerView.this.f4490a.mo6199q(f0Var);
                        if (!z2 && !z3 && h) {
                            f0Var.f4611a = null;
                            f0Var.f4613a = null;
                            return;
                        }
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.f4490a.mo6199q(f0Var);
                if (!z2) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.mo5421Y());
            }
        }

        /* renamed from: E */
        public void mo5936E(View view) {
            ArrayList<C0803f0> arrayList;
            C0803f0 u0 = RecyclerView.m5265u0(view);
            if (!u0.mo5690t(12) && u0.mo5656C() && !RecyclerView.this.mo5553y(u0)) {
                if (this.f4696b == null) {
                    this.f4696b = new ArrayList<>();
                }
                u0.mo5665L(this, true);
                arrayList = this.f4696b;
            } else if (!u0.mo5695x() || u0.mo5697z() || RecyclerView.this.f4475a.mo5716l()) {
                u0.mo5665L(this, false);
                arrayList = this.f4693a;
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.mo5421Y());
            }
            arrayList.add(u0);
        }

        /* renamed from: F */
        public void mo5937F(C0829v vVar) {
            C0829v vVar2 = this.f4691a;
            if (vVar2 != null) {
                vVar2.mo5919c();
            }
            this.f4691a = vVar;
            if (vVar != null && RecyclerView.this.getAdapter() != null) {
                this.f4691a.mo5917a();
            }
        }

        /* renamed from: G */
        public void mo5938G(C0799d0 d0Var) {
            this.f4690a = d0Var;
        }

        /* renamed from: H */
        public void mo5939H(int i) {
            this.f4689a = i;
            mo5943L();
        }

        /* renamed from: I */
        public final boolean mo5940I(@mr2 C0803f0 f0Var, int i, int i2, long j) {
            f0Var.f4611a = null;
            f0Var.f4613a = RecyclerView.this;
            int o = f0Var.mo5685o();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f4691a.mo5930n(o, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f4475a.mo5707c(f0Var, i);
            this.f4691a.mo5920d(f0Var.mo5685o(), RecyclerView.this.getNanoTime() - nanoTime);
            mo5947b(f0Var);
            if (!RecyclerView.this.f4473a.mo5615j()) {
                return true;
            }
            f0Var.f4623q = i2;
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01cb  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01ce  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x01fe  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x020c  */
        @com.onedelhi.secure.ts2
        /* renamed from: J */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C0803f0 mo5941J(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x0228
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$c0 r1 = r1.f4473a
                int r1 = r1.mo5609d()
                if (r3 >= r1) goto L_0x0228
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$c0 r1 = r1.f4473a
                boolean r1 = r1.mo5615j()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$f0 r1 = r16.mo5954i(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$f0 r1 = r16.mo5959n(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo5944M(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.mo5672b(r5)
                boolean r5 = r1.mo5654A()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.f4609a
                r5.removeDetachedView(r9, r8)
                r1.mo5669P()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.mo5670Q()
                if (r5 == 0) goto L_0x0057
                r1.mo5675e()
            L_0x0057:
                r6.mo5935D(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x0181
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f4488a
                int r5 = r5.mo6129n(r3)
                if (r5 < 0) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r9 = r9.f4475a
                int r9 = r9.mo5711g()
                if (r5 >= r9) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r9 = r9.f4475a
                int r9 = r9.mo5713i(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r10 = r10.f4475a
                boolean r10 = r10.mo5716l()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r1 = r1.f4475a
                long r10 = r1.mo5712h(r5)
                androidx.recyclerview.widget.RecyclerView$f0 r1 = r6.mo5958m(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.f4620n = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView$d0 r0 = r6.f4690a
                if (r0 == 0) goto L_0x00eb
                android.view.View r0 = r0.mo5626a(r6, r3, r9)
                if (r0 == 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$f0 r1 = r1.mo5541t0(r0)
                if (r1 == 0) goto L_0x00ce
                boolean r0 = r1.mo5667N()
                if (r0 != 0) goto L_0x00b1
                goto L_0x00eb
            L_0x00b1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo5421Y()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo5421Y()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00eb:
                if (r1 != 0) goto L_0x0102
                androidx.recyclerview.widget.RecyclerView$v r0 = r16.mo5955j()
                androidx.recyclerview.widget.RecyclerView$f0 r0 = r0.mo5922f(r9)
                if (r0 == 0) goto L_0x0101
                r0.mo5661H()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f4458t
                if (r1 == 0) goto L_0x0101
                r6.mo5964s(r0)
            L_0x0101:
                r1 = r0
            L_0x0102:
                if (r1 != 0) goto L_0x0181
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x0120
                androidx.recyclerview.widget.RecyclerView$v r10 = r6.f4691a
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo5931o(r11, r12, r14)
                if (r5 != 0) goto L_0x0120
                return r2
            L_0x0120:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r5 = r2.f4475a
                androidx.recyclerview.widget.RecyclerView$f0 r2 = r5.mo5709e(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f4461w
                if (r5 == 0) goto L_0x013b
                android.view.View r5 = r2.f4609a
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.m5260f0(r5)
                if (r5 == 0) goto L_0x013b
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f4614a = r10
            L_0x013b:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$v r5 = r6.f4691a
                long r10 = r10 - r0
                r5.mo5921e(r9, r10)
                r9 = r2
                goto L_0x0182
            L_0x0149:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$c0 r2 = r2.f4473a
                int r2 = r2.mo5609d()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo5421Y()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0181:
                r9 = r1
            L_0x0182:
                r10 = r4
                if (r10 == 0) goto L_0x01bb
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$c0 r0 = r0.f4473a
                boolean r0 = r0.mo5615j()
                if (r0 != 0) goto L_0x01bb
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.mo5690t(r0)
                if (r1 == 0) goto L_0x01bb
                r9.mo5663J(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$c0 r0 = r0.f4473a
                boolean r0 = r0.f4578e
                if (r0 == 0) goto L_0x01bb
                int r0 = androidx.recyclerview.widget.RecyclerView.C0812m.m5593e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$m r2 = r1.f4479a
                androidx.recyclerview.widget.RecyclerView$c0 r1 = r1.f4473a
                java.util.List r4 = r9.mo5689s()
                androidx.recyclerview.widget.RecyclerView$m$d r0 = r2.mo5772w(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.mo5484n1(r9, r0)
            L_0x01bb:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$c0 r0 = r0.f4473a
                boolean r0 = r0.mo5615j()
                if (r0 == 0) goto L_0x01ce
                boolean r0 = r9.mo5694w()
                if (r0 == 0) goto L_0x01ce
                r9.f4623q = r3
                goto L_0x01e1
            L_0x01ce:
                boolean r0 = r9.mo5694w()
                if (r0 == 0) goto L_0x01e3
                boolean r0 = r9.mo5657D()
                if (r0 != 0) goto L_0x01e3
                boolean r0 = r9.mo5695x()
                if (r0 == 0) goto L_0x01e1
                goto L_0x01e3
            L_0x01e1:
                r0 = 0
                goto L_0x01f6
            L_0x01e3:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f4488a
                int r2 = r0.mo6129n(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.mo5940I(r1, r2, r3, r4)
            L_0x01f6:
                android.view.View r1 = r9.f4609a
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x020c
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
            L_0x0204:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r9.f4609a
                r2.setLayoutParams(r1)
                goto L_0x021d
            L_0x020c:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x021b
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                goto L_0x0204
            L_0x021b:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            L_0x021d:
                r1.f4543a = r9
                if (r10 == 0) goto L_0x0224
                if (r0 == 0) goto L_0x0224
                goto L_0x0225
            L_0x0224:
                r7 = 0
            L_0x0225:
                r1.f4545b = r7
                return r9
            L_0x0228:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$c0 r2 = r2.f4473a
                int r2 = r2.mo5609d()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo5421Y()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0831w.mo5941J(int, boolean, long):androidx.recyclerview.widget.RecyclerView$f0");
        }

        /* renamed from: K */
        public void mo5942K(C0803f0 f0Var) {
            (f0Var.f4619b ? this.f4696b : this.f4693a).remove(f0Var);
            f0Var.f4612a = null;
            f0Var.f4619b = false;
            f0Var.mo5675e();
        }

        /* renamed from: L */
        public void mo5943L() {
            C0819p pVar = RecyclerView.this.f4480a;
            this.f4695b = this.f4689a + (pVar != null ? pVar.f4657a : 0);
            for (int size = this.f4697c.size() - 1; size >= 0 && this.f4697c.size() > this.f4695b; size--) {
                mo5933B(size);
            }
        }

        /* renamed from: M */
        public boolean mo5944M(C0803f0 f0Var) {
            if (f0Var.mo5697z()) {
                return RecyclerView.this.f4473a.mo5615j();
            }
            int i = f0Var.f4620n;
            if (i < 0 || i >= RecyclerView.this.f4475a.mo5711g()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f0Var + RecyclerView.this.mo5421Y());
            } else if (RecyclerView.this.f4473a.mo5615j() || RecyclerView.this.f4475a.mo5713i(f0Var.f4620n) == f0Var.mo5685o()) {
                return !RecyclerView.this.f4475a.mo5716l() || f0Var.mo5684n() == RecyclerView.this.f4475a.mo5712h(f0Var.f4620n);
            } else {
                return false;
            }
        }

        /* renamed from: N */
        public void mo5945N(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f4697c.size() - 1; size >= 0; size--) {
                C0803f0 f0Var = this.f4697c.get(size);
                if (f0Var != null && (i3 = f0Var.f4620n) >= i && i3 < i4) {
                    f0Var.mo5672b(2);
                    mo5933B(size);
                }
            }
        }

        /* renamed from: a */
        public void mo5946a(@mr2 C0803f0 f0Var, boolean z) {
            RecyclerView.m5259A(f0Var);
            View view = f0Var.f4609a;
            C0947v vVar = RecyclerView.this.f4494a;
            if (vVar != null) {
                C3884x1 n = vVar.mo6528n();
                jt4.m18849B1(view, n instanceof C0947v.C0948a ? ((C0947v.C0948a) n).mo6534n(view) : null);
            }
            if (z) {
                mo5953h(f0Var);
            }
            f0Var.f4611a = null;
            f0Var.f4613a = null;
            mo5955j().mo5926j(f0Var);
        }

        /* renamed from: b */
        public final void mo5947b(C0803f0 f0Var) {
            if (RecyclerView.this.mo5386L0()) {
                View view = f0Var.f4609a;
                if (jt4.m18916V(view) == 0) {
                    jt4.m18906R1(view, 1);
                }
                C0947v vVar = RecyclerView.this.f4494a;
                if (vVar != null) {
                    C3884x1 n = vVar.mo6528n();
                    if (n instanceof C0947v.C0948a) {
                        ((C0947v.C0948a) n).mo6535o(view);
                    }
                    jt4.m18849B1(view, n);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo5948c(@com.onedelhi.secure.mr2 android.view.View r7, int r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.RecyclerView$f0 r7 = androidx.recyclerview.widget.RecyclerView.m5265u0(r7)
                if (r7 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f4488a
                int r2 = r0.mo6129n(r8)
                if (r2 < 0) goto L_0x005e
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r0 = r0.f4475a
                int r0 = r0.mo5711g()
                if (r2 >= r0) goto L_0x005e
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0 = r6
                r1 = r7
                r3 = r8
                r0.mo5940I(r1, r2, r3, r4)
                android.view.View r8 = r7.f4609a
                android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
                if (r8 != 0) goto L_0x003b
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r8 = r8.generateDefaultLayoutParams()
            L_0x0033:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r8 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r8
                android.view.View r0 = r7.f4609a
                r0.setLayoutParams(r8)
                goto L_0x004c
            L_0x003b:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                boolean r0 = r0.checkLayoutParams(r8)
                if (r0 != 0) goto L_0x004a
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r8 = r0.generateLayoutParams((android.view.ViewGroup.LayoutParams) r8)
                goto L_0x0033
            L_0x004a:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r8 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r8
            L_0x004c:
                r0 = 1
                r8.f4544a = r0
                r8.f4543a = r7
                android.view.View r7 = r7.f4609a
                android.view.ViewParent r7 = r7.getParent()
                if (r7 != 0) goto L_0x005a
                goto L_0x005b
            L_0x005a:
                r0 = 0
            L_0x005b:
                r8.f4545b = r0
                return
            L_0x005e:
                java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Inconsistency detected. Invalid item position "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = "(offset:"
                r0.append(r8)
                r0.append(r2)
                java.lang.String r8 = ").state:"
                r0.append(r8)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$c0 r8 = r8.f4473a
                int r8 = r8.mo5609d()
                r0.append(r8)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r8 = r8.mo5421Y()
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                r7.<init>(r8)
                throw r7
            L_0x0096:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter"
                r8.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = r0.mo5421Y()
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                r7.<init>(r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0831w.mo5948c(android.view.View, int):void");
        }

        /* renamed from: d */
        public void mo5949d() {
            this.f4693a.clear();
            mo5932A();
        }

        /* renamed from: e */
        public void mo5950e() {
            int size = this.f4697c.size();
            for (int i = 0; i < size; i++) {
                this.f4697c.get(i).mo5673c();
            }
            int size2 = this.f4693a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f4693a.get(i2).mo5673c();
            }
            ArrayList<C0803f0> arrayList = this.f4696b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f4696b.get(i3).mo5673c();
                }
            }
        }

        /* renamed from: f */
        public void mo5951f() {
            this.f4693a.clear();
            ArrayList<C0803f0> arrayList = this.f4696b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: g */
        public int mo5952g(int i) {
            if (i >= 0 && i < RecyclerView.this.f4473a.mo5609d()) {
                return !RecyclerView.this.f4473a.mo5615j() ? i : RecyclerView.this.f4488a.mo6129n(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f4473a.mo5609d() + RecyclerView.this.mo5421Y());
        }

        /* renamed from: h */
        public void mo5953h(@mr2 C0803f0 f0Var) {
            C0832x xVar = RecyclerView.this.f4485a;
            if (xVar != null) {
                xVar.mo5972a(f0Var);
            }
            int size = RecyclerView.this.f4498a.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.this.f4498a.get(i).mo5972a(f0Var);
            }
            C0805h hVar = RecyclerView.this.f4475a;
            if (hVar != null) {
                hVar.mo5702E(f0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4473a != null) {
                recyclerView.f4490a.mo6199q(f0Var);
            }
        }

        /* renamed from: i */
        public C0803f0 mo5954i(int i) {
            int size;
            int n;
            ArrayList<C0803f0> arrayList = this.f4696b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    C0803f0 f0Var = this.f4696b.get(i3);
                    if (f0Var.mo5670Q() || f0Var.mo5686p() != i) {
                        i3++;
                    } else {
                        f0Var.mo5672b(32);
                        return f0Var;
                    }
                }
                if (RecyclerView.this.f4475a.mo5716l() && (n = RecyclerView.this.f4488a.mo6129n(i)) > 0 && n < RecyclerView.this.f4475a.mo5711g()) {
                    long h = RecyclerView.this.f4475a.mo5712h(n);
                    while (i2 < size) {
                        C0803f0 f0Var2 = this.f4696b.get(i2);
                        if (f0Var2.mo5670Q() || f0Var2.mo5684n() != h) {
                            i2++;
                        } else {
                            f0Var2.mo5672b(32);
                            return f0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: j */
        public C0829v mo5955j() {
            if (this.f4691a == null) {
                this.f4691a = new C0829v();
            }
            return this.f4691a;
        }

        /* renamed from: k */
        public int mo5956k() {
            return this.f4693a.size();
        }

        @mr2
        /* renamed from: l */
        public List<C0803f0> mo5957l() {
            return this.f4694a;
        }

        /* renamed from: m */
        public C0803f0 mo5958m(long j, int i, boolean z) {
            for (int size = this.f4693a.size() - 1; size >= 0; size--) {
                C0803f0 f0Var = this.f4693a.get(size);
                if (f0Var.mo5684n() == j && !f0Var.mo5670Q()) {
                    if (i == f0Var.mo5685o()) {
                        f0Var.mo5672b(32);
                        if (f0Var.mo5697z() && !RecyclerView.this.f4473a.mo5615j()) {
                            f0Var.mo5663J(2, 14);
                        }
                        return f0Var;
                    } else if (!z) {
                        this.f4693a.remove(size);
                        RecyclerView.this.removeDetachedView(f0Var.f4609a, false);
                        mo5971z(f0Var.f4609a);
                    }
                }
            }
            int size2 = this.f4697c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C0803f0 f0Var2 = this.f4697c.get(size2);
                if (f0Var2.mo5684n() == j && !f0Var2.mo5693v()) {
                    if (i == f0Var2.mo5685o()) {
                        if (!z) {
                            this.f4697c.remove(size2);
                        }
                        return f0Var2;
                    } else if (!z) {
                        mo5933B(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: n */
        public C0803f0 mo5959n(int i, boolean z) {
            View e;
            int size = this.f4693a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C0803f0 f0Var = this.f4693a.get(i3);
                if (f0Var.mo5670Q() || f0Var.mo5686p() != i || f0Var.mo5695x() || (!RecyclerView.this.f4473a.f4572b && f0Var.mo5697z())) {
                    i3++;
                } else {
                    f0Var.mo5672b(32);
                    return f0Var;
                }
            }
            if (z || (e = RecyclerView.this.f4491a.mo6204e(i)) == null) {
                int size2 = this.f4697c.size();
                while (i2 < size2) {
                    C0803f0 f0Var2 = this.f4697c.get(i2);
                    if (f0Var2.mo5695x() || f0Var2.mo5686p() != i || f0Var2.mo5693v()) {
                        i2++;
                    } else {
                        if (!z) {
                            this.f4697c.remove(i2);
                        }
                        return f0Var2;
                    }
                }
                return null;
            }
            C0803f0 u0 = RecyclerView.m5265u0(e);
            RecyclerView.this.f4491a.mo6218s(e);
            int m = RecyclerView.this.f4491a.mo6212m(e);
            if (m != -1) {
                RecyclerView.this.f4491a.mo6203d(m);
                mo5936E(e);
                u0.mo5672b(8224);
                return u0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + u0 + RecyclerView.this.mo5421Y());
        }

        /* renamed from: o */
        public View mo5960o(int i) {
            return this.f4693a.get(i).f4609a;
        }

        @mr2
        /* renamed from: p */
        public View mo5961p(int i) {
            return mo5962q(i, false);
        }

        /* renamed from: q */
        public View mo5962q(int i, boolean z) {
            return mo5941J(i, z, Long.MAX_VALUE).f4609a;
        }

        /* renamed from: r */
        public final void mo5963r(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    mo5963r((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: s */
        public final void mo5964s(C0803f0 f0Var) {
            View view = f0Var.f4609a;
            if (view instanceof ViewGroup) {
                mo5963r((ViewGroup) view, false);
            }
        }

        /* renamed from: t */
        public void mo5965t() {
            int size = this.f4697c.size();
            for (int i = 0; i < size; i++) {
                LayoutParams layoutParams = (LayoutParams) this.f4697c.get(i).f4609a.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f4544a = true;
                }
            }
        }

        /* renamed from: u */
        public void mo5966u() {
            int size = this.f4697c.size();
            for (int i = 0; i < size; i++) {
                C0803f0 f0Var = this.f4697c.get(i);
                if (f0Var != null) {
                    f0Var.mo5672b(6);
                    f0Var.mo5671a((Object) null);
                }
            }
            C0805h hVar = RecyclerView.this.f4475a;
            if (hVar == null || !hVar.mo5716l()) {
                mo5932A();
            }
        }

        /* renamed from: v */
        public void mo5967v(int i, int i2) {
            int size = this.f4697c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0803f0 f0Var = this.f4697c.get(i3);
                if (f0Var != null && f0Var.f4620n >= i) {
                    f0Var.mo5658E(i2, false);
                }
            }
        }

        /* renamed from: w */
        public void mo5968w(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i5 = -1;
                i4 = i;
                i3 = i2;
            } else {
                i5 = 1;
                i3 = i;
                i4 = i2;
            }
            int size = this.f4697c.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0803f0 f0Var = this.f4697c.get(i7);
                if (f0Var != null && (i6 = f0Var.f4620n) >= i4 && i6 <= i3) {
                    if (i6 == i) {
                        f0Var.mo5658E(i2 - i, false);
                    } else {
                        f0Var.mo5658E(i5, false);
                    }
                }
            }
        }

        /* renamed from: x */
        public void mo5969x(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f4697c.size() - 1; size >= 0; size--) {
                C0803f0 f0Var = this.f4697c.get(size);
                if (f0Var != null) {
                    int i4 = f0Var.f4620n;
                    if (i4 >= i3) {
                        f0Var.mo5658E(-i2, z);
                    } else if (i4 >= i) {
                        f0Var.mo5672b(8);
                        mo5933B(size);
                    }
                }
            }
        }

        /* renamed from: y */
        public void mo5970y(C0805h hVar, C0805h hVar2, boolean z) {
            mo5949d();
            mo5955j().mo5925i(hVar, hVar2, z);
        }

        /* renamed from: z */
        public void mo5971z(View view) {
            C0803f0 u0 = RecyclerView.m5265u0(view);
            u0.f4612a = null;
            u0.f4619b = false;
            u0.mo5675e();
            mo5935D(u0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public interface C0832x {
        /* renamed from: a */
        void mo5972a(@mr2 C0803f0 f0Var);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public class C0833y extends C0808j {
        public C0833y() {
        }

        /* renamed from: a */
        public void mo5739a() {
            RecyclerView.this.mo5550x((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4473a.f4570a = true;
            recyclerView.mo5478l1(true);
            if (!RecyclerView.this.f4488a.mo6132q()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: c */
        public void mo5741c(int i, int i2, Object obj) {
            RecyclerView.this.mo5550x((String) null);
            if (RecyclerView.this.f4488a.mo6134s(i, i2, obj)) {
                mo5973h();
            }
        }

        /* renamed from: d */
        public void mo5742d(int i, int i2) {
            RecyclerView.this.mo5550x((String) null);
            if (RecyclerView.this.f4488a.mo6135t(i, i2)) {
                mo5973h();
            }
        }

        /* renamed from: e */
        public void mo5743e(int i, int i2, int i3) {
            RecyclerView.this.mo5550x((String) null);
            if (RecyclerView.this.f4488a.mo6136u(i, i2, i3)) {
                mo5973h();
            }
        }

        /* renamed from: f */
        public void mo5744f(int i, int i2) {
            RecyclerView.this.mo5550x((String) null);
            if (RecyclerView.this.f4488a.mo6137v(i, i2)) {
                mo5973h();
            }
        }

        /* renamed from: g */
        public void mo5745g() {
            C0805h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4487a != null && (hVar = recyclerView.f4475a) != null && hVar.mo5708d()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: h */
        public void mo5973h() {
            if (RecyclerView.f4460v) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f4514d && recyclerView.f4510c) {
                    jt4.m18993p1(recyclerView, recyclerView.f4496a);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f4521j = true;
            recyclerView2.requestLayout();
        }
    }

    @hl3({hl3.C2354a.f13185a})
    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static class C0834z extends C2015e0 {
        public static final Parcelable.Creator<C0834z> CREATOR = new C0835a();

        /* renamed from: b */
        public Parcelable f4699b;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        public class C0835a implements Parcelable.ClassLoaderCreator<C0834z> {
            /* renamed from: a */
            public C0834z createFromParcel(Parcel parcel) {
                return new C0834z(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0834z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0834z(parcel, classLoader);
            }

            /* renamed from: c */
            public C0834z[] newArray(int i) {
                return new C0834z[i];
            }
        }

        public C0834z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4699b = parcel.readParcelable(classLoader == null ? C0819p.class.getClassLoader() : classLoader);
        }

        public C0834z(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        public void mo5974b(C0834z zVar) {
            this.f4699b = zVar.f4699b;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f4699b, 0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            f4450e = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            f4458t = r3
            r2 = 23
            if (r1 < r2) goto L_0x0015
            r1 = 1
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            f4459u = r1
            f4460v = r0
            f4461w = r0
            f4462x = r3
            f4463y = r3
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            f4443a = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            f4442a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public RecyclerView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, sb3.C3485a.recyclerViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.f4486a = new C0833y();
        this.f4484a = new C0831w();
        this.f4490a = new C0869d0();
        this.f4496a = new C0790a();
        this.f4468a = new Rect();
        this.f4501b = new Rect();
        this.f4469a = new RectF();
        this.f4498a = new ArrayList();
        this.f4497a = new ArrayList<>();
        this.f4504b = new ArrayList<>();
        this.f4525n = 0;
        this.f4522k = false;
        this.f4523l = false;
        this.f4529p = 0;
        this.f4531q = 0;
        this.f4477a = new C0810l();
        this.f4479a = new C0887h();
        this.f4533r = 0;
        this.f4534s = -1;
        this.f4467a = Float.MIN_VALUE;
        this.f4500b = Float.MIN_VALUE;
        this.f4524m = true;
        this.f4474a = new C0801e0();
        this.f4492a = f4461w ? new C0914l.C0916b() : null;
        this.f4473a = new C0797c0();
        this.f4526n = false;
        this.f4528o = false;
        this.f4478a = new C0817n();
        this.f4530p = false;
        this.f4499a = new int[2];
        this.f4507b = new int[2];
        this.f4511c = new int[2];
        this.f4515d = new int[2];
        this.f4513d = new ArrayList();
        this.f4503b = new C0792b();
        this.f4465A = 0;
        this.f4466B = 0;
        this.f4489a = new C0798d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4539x = viewConfiguration.getScaledTouchSlop();
        this.f4467a = lt4.m20978b(viewConfiguration, context2);
        this.f4500b = lt4.m20981e(viewConfiguration, context2);
        this.f4540y = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4541z = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f4479a.mo5748A(this.f4478a);
        mo5368F0();
        mo5374H0();
        mo5371G0();
        if (jt4.m18916V(this) == 0) {
            jt4.m18906R1(this, 1);
        }
        this.f4471a = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0947v(this));
        int[] iArr = sb3.C3494j.RecyclerView;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i2, 0);
        jt4.m19033z1(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(sb3.C3494j.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(sb3.C3494j.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f4506b = obtainStyledAttributes.getBoolean(sb3.C3494j.RecyclerView_android_clipToPadding, true);
        boolean z = obtainStyledAttributes.getBoolean(sb3.C3494j.RecyclerView_fastScrollEnabled, false);
        this.f4516e = z;
        if (z) {
            mo5377I0((StateListDrawable) obtainStyledAttributes.getDrawable(sb3.C3494j.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(sb3.C3494j.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(sb3.C3494j.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(sb3.C3494j.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        mo5370G(context, string, attributeSet, i, 0);
        int[] iArr2 = f4450e;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i2, 0);
        jt4.m19033z1(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    /* renamed from: A */
    public static void m5259A(@mr2 C0803f0 f0Var) {
        WeakReference<RecyclerView> weakReference = f0Var.f4614a;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        f0Var.f4614a = null;
                        return;
                    } else if (view != f0Var.f4609a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @ts2
    /* renamed from: f0 */
    public static RecyclerView m5260f0(@mr2 View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView f0 = m5260f0(viewGroup.getChildAt(i));
            if (f0 != null) {
                return f0;
            }
        }
        return null;
    }

    private co2 getScrollingChildHelper() {
        if (this.f4495a == null) {
            this.f4495a = new co2(this);
        }
        return this.f4495a;
    }

    /* renamed from: u0 */
    public static C0803f0 m5265u0(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f4543a;
    }

    /* renamed from: w0 */
    public static void m5266w0(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f4542a;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    @mr2
    /* renamed from: A0 */
    public C0818o mo5353A0(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.f4497a.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    /* renamed from: A1 */
    public final void mo5354A1() {
        C0797c0 c0Var = this.f4473a;
        c0Var.f4568a = -1;
        c0Var.f4579f = -1;
        c0Var.f4581g = -1;
    }

    /* renamed from: B */
    public void mo5355B() {
        int j = this.f4491a.mo6209j();
        for (int i = 0; i < j; i++) {
            C0803f0 u0 = m5265u0(this.f4491a.mo6208i(i));
            if (!u0.mo5667N()) {
                u0.mo5673c();
            }
        }
        this.f4484a.mo5950e();
    }

    /* renamed from: B0 */
    public final void mo5356B0(long j, C0803f0 f0Var, C0803f0 f0Var2) {
        int g = this.f4491a.mo6206g();
        for (int i = 0; i < g; i++) {
            C0803f0 u0 = m5265u0(this.f4491a.mo6205f(i));
            if (u0 != f0Var && mo5486o0(u0) == j) {
                C0805h hVar = this.f4475a;
                if (hVar == null || !hVar.mo5716l()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + u0 + " \n View Holder 2:" + f0Var + mo5421Y());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + u0 + " \n View Holder 2:" + f0Var + mo5421Y());
            }
        }
        Log.e(f4445b, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f0Var2 + " cannot be found but it is necessary for " + f0Var + mo5421Y());
    }

    /* renamed from: B1 */
    public final void mo5357B1() {
        VelocityTracker velocityTracker = this.f4470a;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo3851h(0);
        mo5502p1();
    }

    /* renamed from: C */
    public void mo5358C() {
        List<C0824q> list = this.f4505b;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: C0 */
    public boolean mo5359C0() {
        return this.f4514d;
    }

    /* renamed from: C1 */
    public final void mo5360C1() {
        C0803f0 f0Var = null;
        View focusedChild = (!this.f4524m || !hasFocus() || this.f4475a == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            f0Var = mo5431c0(focusedChild);
        }
        if (f0Var == null) {
            mo5354A1();
            return;
        }
        this.f4473a.f4568a = this.f4475a.mo5716l() ? f0Var.mo5684n() : -1;
        this.f4473a.f4579f = this.f4522k ? -1 : f0Var.mo5697z() ? f0Var.f4621o : f0Var.mo5680j();
        this.f4473a.f4581g = mo5551x0(f0Var.f4609a);
    }

    /* renamed from: D */
    public void mo5361D() {
        List<C0827t> list = this.f4509c;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: D0 */
    public boolean mo5362D0() {
        return !this.f4517f || this.f4522k || this.f4488a.mo6132q();
    }

    /* renamed from: D1 */
    public void mo5363D1() {
        int j = this.f4491a.mo6209j();
        for (int i = 0; i < j; i++) {
            C0803f0 u0 = m5265u0(this.f4491a.mo6208i(i));
            if (!u0.mo5667N()) {
                u0.mo5662I();
            }
        }
    }

    /* renamed from: E */
    public void mo5364E(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f4472a;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f4472a.onRelease();
            z = this.f4472a.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4508c;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f4508c.onRelease();
            z |= this.f4508c.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4502b;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f4502b.onRelease();
            z |= this.f4502b.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4512d;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f4512d.onRelease();
            z |= this.f4512d.isFinished();
        }
        if (z) {
            jt4.m18985n1(this);
        }
    }

    /* renamed from: E0 */
    public final boolean mo5365E0() {
        int g = this.f4491a.mo6206g();
        for (int i = 0; i < g; i++) {
            C0803f0 u0 = m5265u0(this.f4491a.mo6205f(i));
            if (u0 != null && !u0.mo5667N() && u0.mo5656C()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E1 */
    public boolean mo5366E1(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int i9 = i2;
        MotionEvent motionEvent2 = motionEvent;
        mo5367F();
        if (this.f4475a != null) {
            int[] iArr = this.f4515d;
            iArr[0] = 0;
            iArr[1] = 0;
            mo5369F1(i8, i9, iArr);
            int[] iArr2 = this.f4515d;
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            i7 = i11;
            i6 = i10;
            i5 = i8 - i10;
            i4 = i9 - i11;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.f4497a.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f4515d;
        iArr3[0] = 0;
        iArr3[1] = 0;
        mo3829c(i6, i7, i5, i4, this.f4507b, i3, iArr3);
        int[] iArr4 = this.f4515d;
        int i12 = i5 - iArr4[0];
        int i13 = i4 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i14 = this.f4537v;
        int[] iArr5 = this.f4507b;
        this.f4537v = i14 - iArr5[0];
        this.f4538w -= iArr5[1];
        int[] iArr6 = this.f4511c;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !dl2.m13234l(motionEvent2, 8194)) {
                mo5481m1(motionEvent.getX(), (float) i12, motionEvent.getY(), (float) i13);
            }
            mo5364E(i, i2);
        }
        if (!(i6 == 0 && i7 == 0)) {
            mo5403R(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i6 == 0 && i7 == 0) ? false : true;
    }

    /* renamed from: F */
    public void mo5367F() {
        if (!this.f4517f || this.f4522k) {
            cg4.m12477b(f4449e);
            mo5388M();
            cg4.m12479d();
        } else if (this.f4488a.mo6132q()) {
            if (this.f4488a.mo6131p(4) && !this.f4488a.mo6131p(11)) {
                cg4.m12477b(f4451f);
                mo5399P1();
                mo5432c1();
                this.f4488a.mo6139x();
                if (!this.f4518g) {
                    if (mo5365E0()) {
                        mo5388M();
                    } else {
                        this.f4488a.mo6125j();
                    }
                }
                mo5402Q1(true);
                mo5435d1();
            } else if (this.f4488a.mo6132q()) {
                cg4.m12477b(f4449e);
                mo5388M();
            } else {
                return;
            }
            cg4.m12479d();
        }
    }

    /* renamed from: F0 */
    public void mo5368F0() {
        this.f4488a = new C0844a(new C0802f());
    }

    /* renamed from: F1 */
    public void mo5369F1(int i, int i2, @ts2 int[] iArr) {
        mo5399P1();
        mo5432c1();
        cg4.m12477b(f4447c);
        mo5423Z(this.f4473a);
        int Q1 = i != 0 ? this.f4480a.mo5214Q1(i, this.f4484a, this.f4473a) : 0;
        int S1 = i2 != 0 ? this.f4480a.mo5215S1(i2, this.f4484a, this.f4473a) : 0;
        cg4.m12479d();
        mo5555y1();
        mo5435d1();
        mo5402Q1(false);
        if (iArr != null) {
            iArr[0] = Q1;
            iArr[1] = S1;
        }
    }

    /* renamed from: G */
    public final void mo5370G(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String y0 = mo5554y0(context, trim);
                try {
                    Class<? extends U> asSubclass = Class.forName(y0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(C0819p.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f4443a);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0819p) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + y0, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + y0, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + y0, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + y0, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + y0, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + y0, e7);
                }
            }
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: G0 */
    public final void mo5371G0() {
        if (jt4.m18919W(this) == 0) {
            jt4.m18909S1(this, 8);
        }
    }

    /* renamed from: G1 */
    public void mo5372G1(int i) {
        if (!this.f4519h) {
            mo5405R1();
            C0819p pVar = this.f4480a;
            if (pVar == null) {
                Log.e(f4445b, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            pVar.mo5275R1(i);
            awakenScrollBars();
        }
    }

    /* renamed from: H */
    public void mo5373H(int i, int i2) {
        setMeasuredDimension(C0819p.m5636q(i, getPaddingLeft() + getPaddingRight(), jt4.m18952f0(this)), C0819p.m5636q(i2, getPaddingTop() + getPaddingBottom(), jt4.m18948e0(this)));
    }

    /* renamed from: H0 */
    public final void mo5374H0() {
        this.f4491a = new C0872e(new C0800e());
    }

    /* renamed from: H1 */
    public final void mo5375H1(@ts2 C0805h hVar, boolean z, boolean z2) {
        C0805h hVar2 = this.f4475a;
        if (hVar2 != null) {
            hVar2.mo5706I(this.f4486a);
            this.f4475a.mo5698A(this);
        }
        if (!z || z2) {
            mo5505q1();
        }
        this.f4488a.mo6141z();
        C0805h hVar3 = this.f4475a;
        this.f4475a = hVar;
        if (hVar != null) {
            hVar.mo5703F(this.f4486a);
            hVar.mo5727w(this);
        }
        C0819p pVar = this.f4480a;
        if (pVar != null) {
            pVar.mo5838V0(hVar3, this.f4475a);
        }
        this.f4484a.mo5970y(hVar3, this.f4475a, z);
        this.f4473a.f4570a = true;
    }

    /* renamed from: I */
    public final boolean mo5376I(int i, int i2) {
        mo5441e0(this.f4499a);
        int[] iArr = this.f4499a;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    @hw4
    /* renamed from: I0 */
    public void mo5377I0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + mo5421Y());
        }
        Resources resources = getContext().getResources();
        new C0909k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(sb3.C3487c.fastscroll_default_thickness), resources.getDimensionPixelSize(sb3.C3487c.fastscroll_minimum_range), resources.getDimensionPixelOffset(sb3.C3487c.fastscroll_margin));
    }

    @hw4
    /* renamed from: I1 */
    public boolean mo5378I1(C0803f0 f0Var, int i) {
        if (mo5392N0()) {
            f0Var.f4627u = i;
            this.f4513d.add(f0Var);
            return false;
        }
        jt4.m18906R1(f0Var.f4609a, i);
        return true;
    }

    /* renamed from: J */
    public void mo5379J(View view) {
        C0803f0 u0 = m5265u0(view);
        mo5426a1(view);
        C0805h hVar = this.f4475a;
        if (!(hVar == null || u0 == null)) {
            hVar.mo5700C(u0);
        }
        List<C0824q> list = this.f4505b;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4505b.get(size).mo5913e(view);
            }
        }
    }

    /* renamed from: J0 */
    public void mo5380J0() {
        this.f4512d = null;
        this.f4502b = null;
        this.f4508c = null;
        this.f4472a = null;
    }

    /* renamed from: J1 */
    public boolean mo5381J1(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!mo5392N0()) {
            return false;
        }
        int d = accessibilityEvent != null ? C3958y1.m31835d(accessibilityEvent) : 0;
        if (d != 0) {
            i = d;
        }
        this.f4527o |= i;
        return true;
    }

    /* renamed from: K */
    public void mo5382K(View view) {
        C0803f0 u0 = m5265u0(view);
        mo5430b1(view);
        C0805h hVar = this.f4475a;
        if (!(hVar == null || u0 == null)) {
            hVar.mo5701D(u0);
        }
        List<C0824q> list = this.f4505b;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4505b.get(size).mo5912c(view);
            }
        }
    }

    /* renamed from: K0 */
    public void mo5383K0() {
        if (this.f4497a.size() != 0) {
            C0819p pVar = this.f4480a;
            if (pVar != null) {
                pVar.mo5297i("Cannot invalidate item decorations during a scroll or layout");
            }
            mo5404R0();
            requestLayout();
        }
    }

    /* renamed from: K1 */
    public void mo5384K1(@e83 int i, @e83 int i2) {
        mo5387L1(i, i2, (Interpolator) null);
    }

    /* renamed from: L */
    public final void mo5385L() {
        int i = this.f4527o;
        this.f4527o = 0;
        if (i != 0 && mo5386L0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C3958y1.m31840i(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: L0 */
    public boolean mo5386L0() {
        AccessibilityManager accessibilityManager = this.f4471a;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: L1 */
    public void mo5387L1(@e83 int i, @e83 int i2, @ts2 Interpolator interpolator) {
        mo5390M1(i, i2, interpolator, Integer.MIN_VALUE);
    }

    /* renamed from: M */
    public void mo5388M() {
        if (this.f4475a == null) {
            Log.w(f4445b, "No adapter attached; skipping layout");
        } else if (this.f4480a == null) {
            Log.e(f4445b, "No layout manager attached; skipping layout");
        } else {
            this.f4473a.f4576d = false;
            boolean z = this.f4532q && !(this.f4465A == getWidth() && this.f4466B == getHeight());
            this.f4465A = 0;
            this.f4466B = 0;
            this.f4532q = false;
            if (this.f4473a.f4575d == 1) {
                mo5391N();
            } else if (!this.f4488a.mo6133r() && !z && this.f4480a.mo5904z0() == getWidth() && this.f4480a.mo5862e0() == getHeight()) {
                this.f4480a.mo5837U1(this);
                mo5397P();
            }
            this.f4480a.mo5837U1(this);
            mo5394O();
            mo5397P();
        }
    }

    /* renamed from: M0 */
    public boolean mo5389M0() {
        C0812m mVar = this.f4479a;
        return mVar != null && mVar.mo5766q();
    }

    /* renamed from: M1 */
    public void mo5390M1(@e83 int i, @e83 int i2, @ts2 Interpolator interpolator, int i3) {
        mo5393N1(i, i2, interpolator, i3, false);
    }

    /* renamed from: N */
    public final void mo5391N() {
        boolean z = true;
        this.f4473a.mo5606a(1);
        mo5423Z(this.f4473a);
        this.f4473a.f4576d = false;
        mo5399P1();
        this.f4490a.mo6188f();
        mo5432c1();
        mo5476k1();
        mo5360C1();
        C0797c0 c0Var = this.f4473a;
        if (!c0Var.f4578e || !this.f4528o) {
            z = false;
        }
        c0Var.f4574c = z;
        this.f4528o = false;
        this.f4526n = false;
        c0Var.f4572b = c0Var.f4580f;
        c0Var.f4577e = this.f4475a.mo5711g();
        mo5441e0(this.f4499a);
        if (this.f4473a.f4578e) {
            int g = this.f4491a.mo6206g();
            for (int i = 0; i < g; i++) {
                C0803f0 u0 = m5265u0(this.f4491a.mo6205f(i));
                if (!u0.mo5667N() && (!u0.mo5695x() || this.f4475a.mo5716l())) {
                    this.f4490a.mo6187e(u0, this.f4479a.mo5772w(this.f4473a, u0, C0812m.m5593e(u0), u0.mo5689s()));
                    if (this.f4473a.f4574c && u0.mo5656C() && !u0.mo5697z() && !u0.mo5667N() && !u0.mo5695x()) {
                        this.f4490a.mo6185c(mo5486o0(u0), u0);
                    }
                }
            }
        }
        if (this.f4473a.f4580f) {
            mo5363D1();
            C0797c0 c0Var2 = this.f4473a;
            boolean z2 = c0Var2.f4570a;
            c0Var2.f4570a = false;
            this.f4480a.mo5230o1(this.f4484a, c0Var2);
            this.f4473a.f4570a = z2;
            for (int i2 = 0; i2 < this.f4491a.mo6206g(); i2++) {
                C0803f0 u02 = m5265u0(this.f4491a.mo6205f(i2));
                if (!u02.mo5667N() && !this.f4490a.mo6191i(u02)) {
                    int e = C0812m.m5593e(u02);
                    boolean t = u02.mo5690t(8192);
                    if (!t) {
                        e |= 4096;
                    }
                    C0812m.C0816d w = this.f4479a.mo5772w(this.f4473a, u02, e, u02.mo5689s());
                    if (t) {
                        mo5484n1(u02, w);
                    } else {
                        this.f4490a.mo6183a(u02, w);
                    }
                }
            }
        }
        mo5355B();
        mo5435d1();
        mo5402Q1(false);
        this.f4473a.f4575d = 2;
    }

    /* renamed from: N0 */
    public boolean mo5392N0() {
        return this.f4529p > 0;
    }

    /* renamed from: N1 */
    public void mo5393N1(@e83 int i, @e83 int i2, @ts2 Interpolator interpolator, int i3, boolean z) {
        C0819p pVar = this.f4480a;
        if (pVar == null) {
            Log.e(f4445b, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f4519h) {
            int i4 = 0;
            if (!pVar.mo5304n()) {
                i = 0;
            }
            if (!this.f4480a.mo5307o()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        mo3844e(i4, 1);
                    }
                    this.f4474a.mo5642e(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    /* renamed from: O */
    public final void mo5394O() {
        mo5399P1();
        mo5432c1();
        this.f4473a.mo5606a(6);
        this.f4488a.mo6126k();
        this.f4473a.f4577e = this.f4475a.mo5711g();
        this.f4473a.f4573c = 0;
        if (this.f4487a != null && this.f4475a.mo5708d()) {
            Parcelable parcelable = this.f4487a.f4699b;
            if (parcelable != null) {
                this.f4480a.mo5321t1(parcelable);
            }
            this.f4487a = null;
        }
        C0797c0 c0Var = this.f4473a;
        c0Var.f4572b = false;
        this.f4480a.mo5230o1(this.f4484a, c0Var);
        C0797c0 c0Var2 = this.f4473a;
        c0Var2.f4570a = false;
        c0Var2.f4578e = c0Var2.f4578e && this.f4479a != null;
        c0Var2.f4575d = 4;
        mo5435d1();
        mo5402Q1(false);
    }

    @Deprecated
    /* renamed from: O0 */
    public boolean mo5395O0() {
        return isLayoutSuppressed();
    }

    /* renamed from: O1 */
    public void mo5396O1(int i) {
        if (!this.f4519h) {
            C0819p pVar = this.f4480a;
            if (pVar == null) {
                Log.e(f4445b, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                pVar.mo5293f2(this, this.f4473a, i);
            }
        }
    }

    /* renamed from: P */
    public final void mo5397P() {
        this.f4473a.mo5606a(4);
        mo5399P1();
        mo5432c1();
        C0797c0 c0Var = this.f4473a;
        c0Var.f4575d = 1;
        if (c0Var.f4578e) {
            for (int g = this.f4491a.mo6206g() - 1; g >= 0; g--) {
                C0803f0 u0 = m5265u0(this.f4491a.mo6205f(g));
                if (!u0.mo5667N()) {
                    long o0 = mo5486o0(u0);
                    C0812m.C0816d v = this.f4479a.mo5771v(this.f4473a, u0);
                    C0803f0 g2 = this.f4490a.mo6189g(o0);
                    if (g2 != null && !g2.mo5667N()) {
                        boolean h = this.f4490a.mo6190h(g2);
                        boolean h2 = this.f4490a.mo6190h(u0);
                        if (!h || g2 != u0) {
                            C0812m.C0816d n = this.f4490a.mo6196n(g2);
                            this.f4490a.mo6186d(u0, v);
                            C0812m.C0816d m = this.f4490a.mo6195m(u0);
                            if (n == null) {
                                mo5356B0(o0, u0, g2);
                            } else {
                                mo5543u(g2, u0, n, m, h, h2);
                            }
                        }
                    }
                    this.f4490a.mo6186d(u0, v);
                }
            }
            this.f4490a.mo6197o(this.f4489a);
        }
        this.f4480a.mo5800E1(this.f4484a);
        C0797c0 c0Var2 = this.f4473a;
        c0Var2.f4571b = c0Var2.f4577e;
        this.f4522k = false;
        this.f4523l = false;
        c0Var2.f4578e = false;
        c0Var2.f4580f = false;
        this.f4480a.f4663a = false;
        ArrayList<C0803f0> arrayList = this.f4484a.f4696b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C0819p pVar = this.f4480a;
        if (pVar.f4674f) {
            pVar.f4657a = 0;
            pVar.f4674f = false;
            this.f4484a.mo5943L();
        }
        this.f4480a.mo5232p1(this.f4473a);
        mo5435d1();
        mo5402Q1(false);
        this.f4490a.mo6188f();
        int[] iArr = this.f4499a;
        if (mo5376I(iArr[0], iArr[1])) {
            mo5403R(0, 0);
        }
        mo5487o1();
        mo5354A1();
    }

    /* renamed from: P0 */
    public final boolean mo5398P0(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || mo5429b0(view2) == null) {
            return false;
        }
        if (view == null || mo5429b0(view) == null) {
            return true;
        }
        this.f4468a.set(0, 0, view.getWidth(), view.getHeight());
        this.f4501b.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f4468a);
        offsetDescendantRectToMyCoords(view2, this.f4501b);
        char c = 65535;
        int i3 = this.f4480a.mo5875i0() == 1 ? -1 : 1;
        Rect rect = this.f4468a;
        int i4 = rect.left;
        Rect rect2 = this.f4501b;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 < 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 > 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i + mo5421Y());
    }

    /* renamed from: P1 */
    public void mo5399P1() {
        int i = this.f4525n + 1;
        this.f4525n = i;
        if (i == 1 && !this.f4519h) {
            this.f4518g = false;
        }
    }

    /* renamed from: Q */
    public void mo5400Q(int i) {
        C0819p pVar = this.f4480a;
        if (pVar != null) {
            pVar.mo5896v1(i);
        }
        mo5446g1(i);
        C0827t tVar = this.f4483a;
        if (tVar != null) {
            tVar.mo5915a(this, i);
        }
        List<C0827t> list = this.f4509c;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4509c.get(size).mo5915a(this, i);
            }
        }
    }

    /* renamed from: Q0 */
    public void mo5401Q0(int i) {
        if (this.f4480a != null) {
            setScrollState(2);
            this.f4480a.mo5275R1(i);
            awakenScrollBars();
        }
    }

    /* renamed from: Q1 */
    public void mo5402Q1(boolean z) {
        if (this.f4525n < 1) {
            this.f4525n = 1;
        }
        if (!z && !this.f4519h) {
            this.f4518g = false;
        }
        if (this.f4525n == 1) {
            if (z && this.f4518g && !this.f4519h && this.f4480a != null && this.f4475a != null) {
                mo5388M();
            }
            if (!this.f4519h) {
                this.f4518g = false;
            }
        }
        this.f4525n--;
    }

    /* renamed from: R */
    public void mo5403R(int i, int i2) {
        this.f4531q++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        mo5468h1(i, i2);
        C0827t tVar = this.f4483a;
        if (tVar != null) {
            tVar.mo5916b(this, i, i2);
        }
        List<C0827t> list = this.f4509c;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4509c.get(size).mo5916b(this, i, i2);
            }
        }
        this.f4531q--;
    }

    /* renamed from: R0 */
    public void mo5404R0() {
        int j = this.f4491a.mo6209j();
        for (int i = 0; i < j; i++) {
            ((LayoutParams) this.f4491a.mo6208i(i).getLayoutParams()).f4544a = true;
        }
        this.f4484a.mo5965t();
    }

    /* renamed from: R1 */
    public void mo5405R1() {
        setScrollState(0);
        mo5408S1();
    }

    /* renamed from: S */
    public void mo5406S() {
        int i;
        for (int size = this.f4513d.size() - 1; size >= 0; size--) {
            C0803f0 f0Var = this.f4513d.get(size);
            if (f0Var.f4609a.getParent() == this && !f0Var.mo5667N() && (i = f0Var.f4627u) != -1) {
                jt4.m18906R1(f0Var.f4609a, i);
                f0Var.f4627u = -1;
            }
        }
        this.f4513d.clear();
    }

    /* renamed from: S0 */
    public void mo5407S0() {
        int j = this.f4491a.mo6209j();
        for (int i = 0; i < j; i++) {
            C0803f0 u0 = m5265u0(this.f4491a.mo6208i(i));
            if (u0 != null && !u0.mo5667N()) {
                u0.mo5672b(6);
            }
        }
        mo5404R0();
        this.f4484a.mo5966u();
    }

    /* renamed from: S1 */
    public final void mo5408S1() {
        this.f4474a.mo5643f();
        C0819p pVar = this.f4480a;
        if (pVar != null) {
            pVar.mo5876i2();
        }
    }

    /* renamed from: T */
    public final boolean mo5409T(MotionEvent motionEvent) {
        C0826s sVar = this.f4482a;
        if (sVar != null) {
            sVar.mo5569a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f4482a = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return mo5434d0(motionEvent);
        }
    }

    /* renamed from: T0 */
    public void mo5410T0(int i, int i2) {
        mo5413U0(i, i2, (MotionEvent) null, 1);
    }

    /* renamed from: T1 */
    public void mo5411T1(@ts2 C0805h hVar, boolean z) {
        setLayoutFrozen(false);
        mo5375H1(hVar, true, z);
        mo5478l1(true);
        requestLayout();
    }

    /* renamed from: U */
    public void mo5412U() {
        int i;
        int i2;
        if (this.f4512d == null) {
            EdgeEffect a = this.f4477a.mo5747a(this, 3);
            this.f4512d = a;
            if (this.f4506b) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: U0 */
    public final void mo5413U0(int i, int i2, @ts2 MotionEvent motionEvent, int i3) {
        C0819p pVar = this.f4480a;
        if (pVar == null) {
            Log.e(f4445b, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f4519h) {
            int[] iArr = this.f4515d;
            int i4 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean n = pVar.mo5304n();
            boolean o = this.f4480a.mo5307o();
            mo3844e(o ? n | true : n ? 1 : 0, i3);
            if (mo3837d(n ? i : 0, o ? i2 : 0, this.f4515d, this.f4507b, i3)) {
                int[] iArr2 = this.f4515d;
                i -= iArr2[0];
                i2 -= iArr2[1];
            }
            int i5 = n ? i : 0;
            if (o) {
                i4 = i2;
            }
            mo5366E1(i5, i4, motionEvent, i3);
            C0914l lVar = this.f4493a;
            if (!(lVar == null || (i == 0 && i2 == 0))) {
                lVar.mo6375f(this, i, i2);
            }
            mo3851h(i3);
        }
    }

    /* renamed from: U1 */
    public void mo5414U1(int i, int i2, Object obj) {
        int i3;
        int j = this.f4491a.mo6209j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < j; i5++) {
            View i6 = this.f4491a.mo6208i(i5);
            C0803f0 u0 = m5265u0(i6);
            if (u0 != null && !u0.mo5667N() && (i3 = u0.f4620n) >= i && i3 < i4) {
                u0.mo5672b(2);
                u0.mo5671a(obj);
                ((LayoutParams) i6.getLayoutParams()).f4544a = true;
            }
        }
        this.f4484a.mo5945N(i, i2);
    }

    /* renamed from: V */
    public void mo5415V() {
        int i;
        int i2;
        if (this.f4472a == null) {
            EdgeEffect a = this.f4477a.mo5747a(this, 0);
            this.f4472a = a;
            if (this.f4506b) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: V0 */
    public void mo5416V0(@e83 int i) {
        int g = this.f4491a.mo6206g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f4491a.mo6205f(i2).offsetLeftAndRight(i);
        }
    }

    /* renamed from: W */
    public void mo5417W() {
        int i;
        int i2;
        if (this.f4508c == null) {
            EdgeEffect a = this.f4477a.mo5747a(this, 2);
            this.f4508c = a;
            if (this.f4506b) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: W0 */
    public void mo5418W0(@e83 int i) {
        int g = this.f4491a.mo6206g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f4491a.mo6205f(i2).offsetTopAndBottom(i);
        }
    }

    /* renamed from: X */
    public void mo5419X() {
        int i;
        int i2;
        if (this.f4502b == null) {
            EdgeEffect a = this.f4477a.mo5747a(this, 1);
            this.f4502b = a;
            if (this.f4506b) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    /* renamed from: X0 */
    public void mo5420X0(int i, int i2) {
        int j = this.f4491a.mo6209j();
        for (int i3 = 0; i3 < j; i3++) {
            C0803f0 u0 = m5265u0(this.f4491a.mo6208i(i3));
            if (u0 != null && !u0.mo5667N() && u0.f4620n >= i) {
                u0.mo5658E(i2, false);
                this.f4473a.f4570a = true;
            }
        }
        this.f4484a.mo5967v(i, i2);
        requestLayout();
    }

    /* renamed from: Y */
    public String mo5421Y() {
        return " " + super.toString() + ", adapter:" + this.f4475a + ", layout:" + this.f4480a + ", context:" + getContext();
    }

    /* renamed from: Y0 */
    public void mo5422Y0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int j = this.f4491a.mo6209j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < j; i7++) {
            C0803f0 u0 = m5265u0(this.f4491a.mo6208i(i7));
            if (u0 != null && (i6 = u0.f4620n) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    u0.mo5658E(i2 - i, false);
                } else {
                    u0.mo5658E(i5, false);
                }
                this.f4473a.f4570a = true;
            }
        }
        this.f4484a.mo5968w(i, i2);
        requestLayout();
    }

    /* renamed from: Z */
    public final void mo5423Z(C0797c0 c0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f4474a.f4587a;
            c0Var.f4582h = overScroller.getFinalX() - overScroller.getCurrX();
            c0Var.f4583i = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        c0Var.f4582h = 0;
        c0Var.f4583i = 0;
    }

    /* renamed from: Z0 */
    public void mo5424Z0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int j = this.f4491a.mo6209j();
        for (int i4 = 0; i4 < j; i4++) {
            C0803f0 u0 = m5265u0(this.f4491a.mo6208i(i4));
            if (u0 != null && !u0.mo5667N()) {
                int i5 = u0.f4620n;
                if (i5 >= i3) {
                    u0.mo5658E(-i2, z);
                } else if (i5 >= i) {
                    u0.mo5679i(i - 1, -i2, z);
                }
                this.f4473a.f4570a = true;
            }
        }
        this.f4484a.mo5969x(i, i2, z);
        requestLayout();
    }

    /* renamed from: a */
    public boolean mo3824a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo14294g(i, i2, i3, i4, iArr, i5);
    }

    @ts2
    /* renamed from: a0 */
    public View mo5425a0(float f, float f2) {
        for (int g = this.f4491a.mo6206g() - 1; g >= 0; g--) {
            View f3 = this.f4491a.mo6205f(g);
            float translationX = f3.getTranslationX();
            float translationY = f3.getTranslationY();
            if (f >= ((float) f3.getLeft()) + translationX && f <= ((float) f3.getRight()) + translationX && f2 >= ((float) f3.getTop()) + translationY && f2 <= ((float) f3.getBottom()) + translationY) {
                return f3;
            }
        }
        return null;
    }

    /* renamed from: a1 */
    public void mo5426a1(@mr2 View view) {
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0819p pVar = this.f4480a;
        if (pVar == null || !pVar.mo5841W0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b */
    public void mo5428b(int i, int i2) {
        if (i < 0) {
            mo5415V();
            if (this.f4472a.isFinished()) {
                this.f4472a.onAbsorb(-i);
            }
        } else if (i > 0) {
            mo5417W();
            if (this.f4508c.isFinished()) {
                this.f4508c.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            mo5419X();
            if (this.f4502b.isFinished()) {
                this.f4502b.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            mo5412U();
            if (this.f4512d.isFinished()) {
                this.f4512d.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            jt4.m18985n1(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @com.onedelhi.secure.ts2
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo5429b0(@com.onedelhi.secure.mr2 android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo5429b0(android.view.View):android.view.View");
    }

    /* renamed from: b1 */
    public void mo5430b1(@mr2 View view) {
    }

    /* renamed from: c */
    public final void mo3829c(int i, int i2, int i3, int i4, int[] iArr, int i5, @mr2 int[] iArr2) {
        getScrollingChildHelper().mo14292e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @ts2
    /* renamed from: c0 */
    public C0803f0 mo5431c0(@mr2 View view) {
        View b0 = mo5429b0(view);
        if (b0 == null) {
            return null;
        }
        return mo5541t0(b0);
    }

    /* renamed from: c1 */
    public void mo5432c1() {
        this.f4529p++;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.f4480a.mo5231p((LayoutParams) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        C0819p pVar = this.f4480a;
        if (pVar != null && pVar.mo5304n()) {
            return this.f4480a.mo5320t(this.f4473a);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C0819p pVar = this.f4480a;
        if (pVar != null && pVar.mo5304n()) {
            return this.f4480a.mo5234u(this.f4473a);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C0819p pVar = this.f4480a;
        if (pVar != null && pVar.mo5304n()) {
            return this.f4480a.mo5236v(this.f4473a);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C0819p pVar = this.f4480a;
        if (pVar != null && pVar.mo5307o()) {
            return this.f4480a.mo5326w(this.f4473a);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C0819p pVar = this.f4480a;
        if (pVar != null && pVar.mo5307o()) {
            return this.f4480a.mo5239x(this.f4473a);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C0819p pVar = this.f4480a;
        if (pVar != null && pVar.mo5307o()) {
            return this.f4480a.mo5241y(this.f4473a);
        }
        return 0;
    }

    /* renamed from: d */
    public boolean mo3837d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo14291d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: d0 */
    public final boolean mo5434d0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f4504b.size();
        int i = 0;
        while (i < size) {
            C0826s sVar = this.f4504b.get(i);
            if (!sVar.mo5570b(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f4482a = sVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: d1 */
    public void mo5435d1() {
        mo5442e1(true);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo14288a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo14289b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo14290c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo14293f(i, i2, i3, i4, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        int i;
        float f;
        super.draw(canvas);
        int size = this.f4497a.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.f4497a.get(i2).mo5785k(canvas, this, this.f4473a);
        }
        EdgeEffect edgeEffect = this.f4472a;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f4506b ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f4472a;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f4502b;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f4506b) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f4502b;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f4508c;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f4506b ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.f4508c;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f4512d;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4506b) {
                f = (float) ((-getWidth()) + getPaddingRight());
                i = (-getHeight()) + getPaddingBottom();
            } else {
                f = (float) (-getWidth());
                i = -getHeight();
            }
            canvas.translate(f, (float) i);
            EdgeEffect edgeEffect8 = this.f4512d;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f4479a == null || this.f4497a.size() <= 0 || !this.f4479a.mo5766q()) {
            z3 = z;
        }
        if (z3) {
            jt4.m18985n1(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e */
    public boolean mo3844e(int i, int i2) {
        return getScrollingChildHelper().mo14306s(i, i2);
    }

    /* renamed from: e0 */
    public final void mo5441e0(int[] iArr) {
        int g = this.f4491a.mo6206g();
        if (g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < g; i3++) {
            C0803f0 u0 = m5265u0(this.f4491a.mo6205f(i3));
            if (!u0.mo5667N()) {
                int p = u0.mo5686p();
                if (p < i) {
                    i = p;
                }
                if (p > i2) {
                    i2 = p;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: e1 */
    public void mo5442e1(boolean z) {
        int i = this.f4529p - 1;
        this.f4529p = i;
        if (i < 1) {
            this.f4529p = 0;
            if (z) {
                mo5385L();
                mo5406S();
            }
        }
    }

    /* renamed from: f */
    public boolean mo3845f(int i) {
        return getScrollingChildHelper().mo14299l(i);
    }

    /* renamed from: f1 */
    public final void mo5443f1(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4534s) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4534s = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f4537v = x;
            this.f4535t = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f4538w = y;
            this.f4536u = y;
        }
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View h1 = this.f4480a.mo5873h1(view, i);
        if (h1 != null) {
            return h1;
        }
        boolean z2 = true;
        boolean z3 = this.f4475a != null && this.f4480a != null && !mo5392N0() && !this.f4519h;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                mo5367F();
                if (mo5429b0(view) == null) {
                    return null;
                }
                mo5399P1();
                view2 = this.f4480a.mo5220a1(view, i, this.f4484a, this.f4473a);
                mo5402Q1(false);
            }
        } else {
            if (this.f4480a.mo5307o()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (f4462x) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f4480a.mo5304n()) {
                int i3 = (this.f4480a.mo5875i0() == 1) ^ (i == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i3) != null) {
                    z2 = false;
                }
                if (f4462x) {
                    i = i3;
                }
                z = z2;
            }
            if (z) {
                mo5367F();
                if (mo5429b0(view) == null) {
                    return null;
                }
                mo5399P1();
                this.f4480a.mo5220a1(view, i, this.f4484a, this.f4473a);
                mo5402Q1(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            return mo5398P0(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        mo5558z1(view2, (View) null);
        return view;
    }

    @ts2
    /* renamed from: g0 */
    public final View mo5445g0() {
        C0803f0 h0;
        C0797c0 c0Var = this.f4473a;
        int i = c0Var.f4579f;
        if (i == -1) {
            i = 0;
        }
        int d = c0Var.mo5609d();
        int i2 = i;
        while (i2 < d) {
            C0803f0 h02 = mo5467h0(i2);
            if (h02 == null) {
                break;
            } else if (h02.f4609a.hasFocusable()) {
                return h02.f4609a;
            } else {
                i2++;
            }
        }
        int min = Math.min(d, i);
        while (true) {
            min--;
            if (min < 0 || (h0 = mo5467h0(min)) == null) {
                return null;
            }
            if (h0.f4609a.hasFocusable()) {
                return h0.f4609a;
            }
        }
    }

    /* renamed from: g1 */
    public void mo5446g1(int i) {
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0819p pVar = this.f4480a;
        if (pVar != null) {
            return pVar.mo5205K();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo5421Y());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0819p pVar = this.f4480a;
        if (pVar != null) {
            return pVar.mo5207L(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo5421Y());
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0819p pVar = this.f4480a;
        if (pVar != null) {
            return pVar.mo5209M(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo5421Y());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @ts2
    public C0805h getAdapter() {
        return this.f4475a;
    }

    public int getBaseline() {
        C0819p pVar = this.f4480a;
        return pVar != null ? pVar.mo5819N() : super.getBaseline();
    }

    public int getChildDrawingOrder(int i, int i2) {
        C0809k kVar = this.f4476a;
        return kVar == null ? super.getChildDrawingOrder(i, i2) : kVar.mo5746a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f4506b;
    }

    @ts2
    public C0947v getCompatAccessibilityDelegate() {
        return this.f4494a;
    }

    @mr2
    public C0810l getEdgeEffectFactory() {
        return this.f4477a;
    }

    @ts2
    public C0812m getItemAnimator() {
        return this.f4479a;
    }

    public int getItemDecorationCount() {
        return this.f4497a.size();
    }

    @ts2
    public C0819p getLayoutManager() {
        return this.f4480a;
    }

    public int getMaxFlingVelocity() {
        return this.f4541z;
    }

    public int getMinFlingVelocity() {
        return this.f4540y;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f4461w) {
            return System.nanoTime();
        }
        return 0;
    }

    @ts2
    public C0825r getOnFlingListener() {
        return this.f4481a;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4524m;
    }

    @mr2
    public C0829v getRecycledViewPool() {
        return this.f4484a.mo5955j();
    }

    public int getScrollState() {
        return this.f4533r;
    }

    /* renamed from: h */
    public void mo3851h(int i) {
        getScrollingChildHelper().mo14308u(i);
    }

    @ts2
    /* renamed from: h0 */
    public C0803f0 mo5467h0(int i) {
        C0803f0 f0Var = null;
        if (this.f4522k) {
            return null;
        }
        int j = this.f4491a.mo6209j();
        for (int i2 = 0; i2 < j; i2++) {
            C0803f0 u0 = m5265u0(this.f4491a.mo6208i(i2));
            if (u0 != null && !u0.mo5697z() && mo5483n0(u0) == i) {
                if (!this.f4491a.mo6213n(u0.f4609a)) {
                    return u0;
                }
                f0Var = u0;
            }
        }
        return f0Var;
    }

    /* renamed from: h1 */
    public void mo5468h1(@e83 int i, @e83 int i2) {
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo14298k();
    }

    /* renamed from: i0 */
    public C0803f0 mo5469i0(long j) {
        C0805h hVar = this.f4475a;
        C0803f0 f0Var = null;
        if (hVar != null && hVar.mo5716l()) {
            int j2 = this.f4491a.mo6209j();
            for (int i = 0; i < j2; i++) {
                C0803f0 u0 = m5265u0(this.f4491a.mo6208i(i));
                if (u0 != null && !u0.mo5697z() && u0.mo5684n() == j) {
                    if (!this.f4491a.mo6213n(u0.f4609a)) {
                        return u0;
                    }
                    f0Var = u0;
                }
            }
        }
        return f0Var;
    }

    /* renamed from: i1 */
    public void mo5470i1() {
        if (!this.f4530p && this.f4510c) {
            jt4.m18993p1(this, this.f4503b);
            this.f4530p = true;
        }
    }

    public boolean isAttachedToWindow() {
        return this.f4510c;
    }

    public final boolean isLayoutSuppressed() {
        return this.f4519h;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo14300m();
    }

    @ts2
    /* renamed from: j0 */
    public C0803f0 mo5473j0(int i) {
        return mo5477l0(i, false);
    }

    /* renamed from: j1 */
    public final boolean mo5474j1() {
        return this.f4479a != null && this.f4480a.mo5224j2();
    }

    @ts2
    @Deprecated
    /* renamed from: k0 */
    public C0803f0 mo5475k0(int i) {
        return mo5477l0(i, false);
    }

    /* renamed from: k1 */
    public final void mo5476k1() {
        boolean z;
        if (this.f4522k) {
            this.f4488a.mo6141z();
            if (this.f4523l) {
                this.f4480a.mo5223j1(this);
            }
        }
        if (mo5474j1()) {
            this.f4488a.mo6139x();
        } else {
            this.f4488a.mo6126k();
        }
        boolean z2 = false;
        boolean z3 = this.f4526n || this.f4528o;
        this.f4473a.f4578e = this.f4517f && this.f4479a != null && ((z = this.f4522k) || z3 || this.f4480a.f4663a) && (!z || this.f4475a.mo5716l());
        C0797c0 c0Var = this.f4473a;
        if (c0Var.f4578e && z3 && !this.f4522k && mo5474j1()) {
            z2 = true;
        }
        c0Var.f4580f = z2;
    }

    @ts2
    /* renamed from: l0 */
    public C0803f0 mo5477l0(int i, boolean z) {
        int j = this.f4491a.mo6209j();
        C0803f0 f0Var = null;
        for (int i2 = 0; i2 < j; i2++) {
            C0803f0 u0 = m5265u0(this.f4491a.mo6208i(i2));
            if (u0 != null && !u0.mo5697z()) {
                if (z) {
                    if (u0.f4620n != i) {
                        continue;
                    }
                } else if (u0.mo5686p() != i) {
                    continue;
                }
                if (!this.f4491a.mo6213n(u0.f4609a)) {
                    return u0;
                }
                f0Var = u0;
            }
        }
        return f0Var;
    }

    /* renamed from: l1 */
    public void mo5478l1(boolean z) {
        this.f4523l = z | this.f4523l;
        this.f4522k = true;
        mo5407S0();
    }

    /* renamed from: m */
    public final void mo5479m(C0803f0 f0Var) {
        View view = f0Var.f4609a;
        boolean z = view.getParent() == this;
        this.f4484a.mo5942K(mo5541t0(view));
        if (f0Var.mo5655B()) {
            this.f4491a.mo6202c(view, -1, view.getLayoutParams(), true);
            return;
        }
        C0872e eVar = this.f4491a;
        if (!z) {
            eVar.mo6201b(view, true);
        } else {
            eVar.mo6210k(view);
        }
    }

    /* renamed from: m0 */
    public boolean mo5480m0(int i, int i2) {
        C0819p pVar = this.f4480a;
        if (pVar == null) {
            Log.e(f4445b, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f4519h) {
            return false;
        } else {
            boolean n = pVar.mo5304n();
            boolean o = this.f4480a.mo5307o();
            if (!n || Math.abs(i) < this.f4540y) {
                i = 0;
            }
            if (!o || Math.abs(i2) < this.f4540y) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = (float) i;
            float f2 = (float) i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = n || o;
                dispatchNestedFling(f, f2, z);
                C0825r rVar = this.f4481a;
                if (rVar != null && rVar.mo5914a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (o) {
                        n |= true;
                    }
                    mo3844e(n ? 1 : 0, 1);
                    int i3 = this.f4541z;
                    int max = Math.max(-i3, Math.min(i, i3));
                    int i4 = this.f4541z;
                    this.f4474a.mo5639b(max, Math.max(-i4, Math.min(i2, i4)));
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5481m1(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.mo5415V()
            android.widget.EdgeEffect r3 = r6.f4472a
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L_0x001c:
            com.onedelhi.secure.zr0.m33330g(r3, r4, r9)
            r9 = 1
            goto L_0x0039
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0038
            r6.mo5417W()
            android.widget.EdgeEffect r3 = r6.f4508c
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L_0x001c
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0053
            r6.mo5419X()
            android.widget.EdgeEffect r9 = r6.f4502b
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            com.onedelhi.secure.zr0.m33330g(r9, r0, r7)
            goto L_0x006f
        L_0x0053:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x006e
            r6.mo5412U()
            android.widget.EdgeEffect r9 = r6.f4512d
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            com.onedelhi.secure.zr0.m33330g(r9, r3, r0)
            goto L_0x006f
        L_0x006e:
            r1 = r9
        L_0x006f:
            if (r1 != 0) goto L_0x0079
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
        L_0x0079:
            com.onedelhi.secure.jt4.m18985n1(r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo5481m1(float, float, float, float):void");
    }

    /* renamed from: n */
    public void mo5482n(@mr2 C0818o oVar) {
        mo5485o(oVar, -1);
    }

    /* renamed from: n0 */
    public int mo5483n0(C0803f0 f0Var) {
        if (f0Var.mo5690t(524) || !f0Var.mo5694w()) {
            return -1;
        }
        return this.f4488a.mo6121f(f0Var.f4620n);
    }

    /* renamed from: n1 */
    public void mo5484n1(C0803f0 f0Var, C0812m.C0816d dVar) {
        f0Var.mo5663J(0, 8192);
        if (this.f4473a.f4574c && f0Var.mo5656C() && !f0Var.mo5697z() && !f0Var.mo5667N()) {
            this.f4490a.mo6185c(mo5486o0(f0Var), f0Var);
        }
        this.f4490a.mo6187e(f0Var, dVar);
    }

    /* renamed from: o */
    public void mo5485o(@mr2 C0818o oVar, int i) {
        C0819p pVar = this.f4480a;
        if (pVar != null) {
            pVar.mo5297i("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f4497a.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f4497a.add(oVar);
        } else {
            this.f4497a.add(i, oVar);
        }
        mo5404R0();
        requestLayout();
    }

    /* renamed from: o0 */
    public long mo5486o0(C0803f0 f0Var) {
        return this.f4475a.mo5716l() ? f0Var.mo5684n() : (long) f0Var.f4620n;
    }

    /* renamed from: o1 */
    public final void mo5487o1() {
        View findViewById;
        if (this.f4524m && this.f4475a != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f4463y || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f4491a.mo6213n(focusedChild)) {
                            return;
                        }
                    } else if (this.f4491a.mo6206g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                C0803f0 i0 = (this.f4473a.f4568a == -1 || !this.f4475a.mo5716l()) ? null : mo5469i0(this.f4473a.f4568a);
                if (i0 != null && !this.f4491a.mo6213n(i0.f4609a) && i0.f4609a.hasFocusable()) {
                    view = i0.f4609a;
                } else if (this.f4491a.mo6206g() > 0) {
                    view = mo5445g0();
                }
                if (view != null) {
                    int i = this.f4473a.f4581g;
                    if (!(((long) i) == -1 || (findViewById = view.findViewById(i)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4529p = 0;
        boolean z = true;
        this.f4510c = true;
        if (!this.f4517f || isLayoutRequested()) {
            z = false;
        }
        this.f4517f = z;
        C0819p pVar = this.f4480a;
        if (pVar != null) {
            pVar.mo5801F(this);
        }
        this.f4530p = false;
        if (f4461w) {
            ThreadLocal<C0914l> threadLocal = C0914l.f5047a;
            C0914l lVar = threadLocal.get();
            this.f4493a = lVar;
            if (lVar == null) {
                this.f4493a = new C0914l();
                Display Q = jt4.m18901Q(this);
                float f = 60.0f;
                if (!isInEditMode() && Q != null) {
                    float refreshRate = Q.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                C0914l lVar2 = this.f4493a;
                lVar2.f5052c = (long) (1.0E9f / f);
                threadLocal.set(lVar2);
            }
            this.f4493a.mo6371a(this);
        }
    }

    public void onDetachedFromWindow() {
        C0914l lVar;
        super.onDetachedFromWindow();
        C0812m mVar = this.f4479a;
        if (mVar != null) {
            mVar.mo5761l();
        }
        mo5405R1();
        this.f4510c = false;
        C0819p pVar = this.f4480a;
        if (pVar != null) {
            pVar.mo5803G(this, this.f4484a);
        }
        this.f4513d.clear();
        removeCallbacks(this.f4503b);
        this.f4490a.mo6192j();
        if (f4461w && (lVar = this.f4493a) != null) {
            lVar.mo6379j(this);
            this.f4493a = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f4497a.size();
        for (int i = 0; i < size; i++) {
            this.f4497a.get(i).mo5783i(canvas, this, this.f4473a);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f4480a != null && !this.f4519h && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f4480a.mo5307o() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f4480a.mo5304n()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        mo5413U0((int) (f * this.f4467a), (int) (f2 * this.f4500b), motionEvent, 1);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f4480a.mo5307o()) {
                        f2 = -axisValue;
                    } else if (this.f4480a.mo5304n()) {
                        f = axisValue;
                        f2 = 0.0f;
                        mo5413U0((int) (f * this.f4467a), (int) (f2 * this.f4500b), motionEvent, 1);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            mo5413U0((int) (f * this.f4467a), (int) (f2 * this.f4500b), motionEvent, 1);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f4519h) {
            return false;
        }
        this.f4482a = null;
        if (mo5434d0(motionEvent)) {
            mo5556z();
            return true;
        }
        C0819p pVar = this.f4480a;
        if (pVar == null) {
            return false;
        }
        boolean n = pVar.mo5304n();
        boolean o = this.f4480a.mo5307o();
        if (this.f4470a == null) {
            this.f4470a = VelocityTracker.obtain();
        }
        this.f4470a.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f4520i) {
                this.f4520i = false;
            }
            this.f4534s = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f4537v = x;
            this.f4535t = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f4538w = y;
            this.f4536u = y;
            if (this.f4533r == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                mo3851h(1);
            }
            int[] iArr = this.f4511c;
            iArr[1] = 0;
            iArr[0] = 0;
            if (o) {
                n |= true;
            }
            mo3844e(n ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f4470a.clear();
            mo3851h(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4534s);
            if (findPointerIndex < 0) {
                Log.e(f4445b, "Error processing scroll; pointer index for id " + this.f4534s + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f4533r != 1) {
                int i = x2 - this.f4535t;
                int i2 = y2 - this.f4536u;
                if (!n || Math.abs(i) <= this.f4539x) {
                    z = false;
                } else {
                    this.f4537v = x2;
                    z = true;
                }
                if (o && Math.abs(i2) > this.f4539x) {
                    this.f4538w = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            mo5556z();
        } else if (actionMasked == 5) {
            this.f4534s = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f4537v = x3;
            this.f4535t = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f4538w = y3;
            this.f4536u = y3;
        } else if (actionMasked == 6) {
            mo5443f1(motionEvent);
        }
        return this.f4533r == 1;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        cg4.m12477b(f4448d);
        mo5388M();
        cg4.m12479d();
        this.f4517f = true;
    }

    public void onMeasure(int i, int i2) {
        C0819p pVar = this.f4480a;
        if (pVar == null) {
            mo5373H(i, i2);
            return;
        }
        boolean z = false;
        if (pVar.mo5262F0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f4480a.mo5890q1(this.f4484a, this.f4473a, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f4532q = z;
            if (!z && this.f4475a != null) {
                if (this.f4473a.f4575d == 1) {
                    mo5391N();
                }
                this.f4480a.mo5842W1(i, i2);
                this.f4473a.f4576d = true;
                mo5394O();
                this.f4480a.mo5849Z1(i, i2);
                if (this.f4480a.mo5290d2()) {
                    this.f4480a.mo5842W1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f4473a.f4576d = true;
                    mo5394O();
                    this.f4480a.mo5849Z1(i, i2);
                }
                this.f4465A = getMeasuredWidth();
                this.f4466B = getMeasuredHeight();
            }
        } else if (this.f4514d) {
            this.f4480a.mo5890q1(this.f4484a, this.f4473a, i, i2);
        } else {
            if (this.f4521j) {
                mo5399P1();
                mo5432c1();
                mo5476k1();
                mo5435d1();
                C0797c0 c0Var = this.f4473a;
                if (c0Var.f4580f) {
                    c0Var.f4572b = true;
                } else {
                    this.f4488a.mo6126k();
                    this.f4473a.f4572b = false;
                }
                this.f4521j = false;
                mo5402Q1(false);
            } else if (this.f4473a.f4580f) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0805h hVar = this.f4475a;
            if (hVar != null) {
                this.f4473a.f4577e = hVar.mo5711g();
            } else {
                this.f4473a.f4577e = 0;
            }
            mo5399P1();
            this.f4480a.mo5890q1(this.f4484a, this.f4473a, i, i2);
            mo5402Q1(false);
            this.f4473a.f4572b = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo5392N0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0834z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0834z zVar = (C0834z) parcelable;
        this.f4487a = zVar;
        super.onRestoreInstanceState(zVar.mo14959a());
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C0834z zVar = new C0834z(super.onSaveInstanceState());
        C0834z zVar2 = this.f4487a;
        if (zVar2 != null) {
            zVar.mo5974b(zVar2);
        } else {
            C0819p pVar = this.f4480a;
            zVar.f4699b = pVar != null ? pVar.mo5323u1() : null;
        }
        return zVar;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo5380J0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.f4519h
            r8 = 0
            if (r0 != 0) goto L_0x01db
            boolean r0 = r6.f4520i
            if (r0 == 0) goto L_0x000f
            goto L_0x01db
        L_0x000f:
            boolean r0 = r17.mo5409T(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.mo5556z()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f4480a
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.mo5304n()
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f4480a
            boolean r11 = r0.mo5307o()
            android.view.VelocityTracker r0 = r6.f4470a
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f4470a = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.f4511c
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.f4511c
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01af
            if (r0 == r9) goto L_0x016d
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d0
        L_0x0066:
            r17.mo5443f1(r18)
            goto L_0x01d0
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.f4534s = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f4537v = r0
            r6.f4535t = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f4538w = r0
            r6.f4536u = r0
            goto L_0x01d0
        L_0x0087:
            r17.mo5556z()
            goto L_0x01d0
        L_0x008c:
            int r0 = r6.f4534s
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.f4534s
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.f4537v
            int r0 = r0 - r13
            int r1 = r6.f4538w
            int r1 = r1 - r14
            int r2 = r6.f4533r
            if (r2 == r9) goto L_0x00f7
            if (r10 == 0) goto L_0x00dd
            int r2 = r6.f4539x
            if (r0 <= 0) goto L_0x00d4
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00d9
        L_0x00d4:
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00d9:
            if (r0 == 0) goto L_0x00dd
            r2 = 1
            goto L_0x00de
        L_0x00dd:
            r2 = 0
        L_0x00de:
            if (r11 == 0) goto L_0x00f2
            int r3 = r6.f4539x
            if (r1 <= 0) goto L_0x00ea
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00ef
        L_0x00ea:
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00ef:
            if (r1 == 0) goto L_0x00f2
            r2 = 1
        L_0x00f2:
            if (r2 == 0) goto L_0x00f7
            r6.setScrollState(r9)
        L_0x00f7:
            r15 = r0
            r16 = r1
            int r0 = r6.f4533r
            if (r0 != r9) goto L_0x01d0
            int[] r3 = r6.f4515d
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x0108
            r1 = r15
            goto L_0x0109
        L_0x0108:
            r1 = 0
        L_0x0109:
            if (r11 == 0) goto L_0x010e
            r2 = r16
            goto L_0x010f
        L_0x010e:
            r2 = 0
        L_0x010f:
            int[] r4 = r6.f4507b
            r5 = 0
            r0 = r17
            boolean r0 = r0.mo3837d(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x013c
            int[] r0 = r6.f4515d
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f4511c
            r1 = r0[r8]
            int[] r2 = r6.f4507b
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x013c:
            r0 = r16
            int[] r1 = r6.f4507b
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f4537v = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f4538w = r14
            if (r10 == 0) goto L_0x014e
            r1 = r15
            goto L_0x014f
        L_0x014e:
            r1 = 0
        L_0x014f:
            if (r11 == 0) goto L_0x0153
            r2 = r0
            goto L_0x0154
        L_0x0153:
            r2 = 0
        L_0x0154:
            boolean r1 = r6.mo5366E1(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x0161
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0161:
            androidx.recyclerview.widget.l r1 = r6.f4493a
            if (r1 == 0) goto L_0x01d0
            if (r15 != 0) goto L_0x0169
            if (r0 == 0) goto L_0x01d0
        L_0x0169:
            r1.mo6375f(r6, r15, r0)
            goto L_0x01d0
        L_0x016d:
            android.view.VelocityTracker r0 = r6.f4470a
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f4470a
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.f4541z
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x0189
            android.view.VelocityTracker r1 = r6.f4470a
            int r2 = r6.f4534s
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018a
        L_0x0189:
            r1 = 0
        L_0x018a:
            if (r11 == 0) goto L_0x0196
            android.view.VelocityTracker r2 = r6.f4470a
            int r3 = r6.f4534s
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x0197
        L_0x0196:
            r2 = 0
        L_0x0197:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x019f
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01a7
        L_0x019f:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.mo5480m0(r0, r1)
            if (r0 != 0) goto L_0x01aa
        L_0x01a7:
            r6.setScrollState(r8)
        L_0x01aa:
            r17.mo5357B1()
            r8 = 1
            goto L_0x01d0
        L_0x01af:
            int r0 = r7.getPointerId(r8)
            r6.f4534s = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f4537v = r0
            r6.f4535t = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f4538w = r0
            r6.f4536u = r0
            if (r11 == 0) goto L_0x01cd
            r10 = r10 | 2
        L_0x01cd:
            r6.mo3844e(r10, r8)
        L_0x01d0:
            if (r8 != 0) goto L_0x01d7
            android.view.VelocityTracker r0 = r6.f4470a
            r0.addMovement(r12)
        L_0x01d7:
            r12.recycle()
            return r9
        L_0x01db:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void mo5500p(@mr2 C0824q qVar) {
        if (this.f4505b == null) {
            this.f4505b = new ArrayList();
        }
        this.f4505b.add(qVar);
    }

    /* renamed from: p0 */
    public int mo5501p0(@mr2 View view) {
        C0803f0 u0 = m5265u0(view);
        if (u0 != null) {
            return u0.mo5680j();
        }
        return -1;
    }

    /* renamed from: p1 */
    public final void mo5502p1() {
        boolean z;
        EdgeEffect edgeEffect = this.f4472a;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f4472a.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f4502b;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f4502b.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4508c;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f4508c.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4512d;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f4512d.isFinished();
        }
        if (z) {
            jt4.m18985n1(this);
        }
    }

    /* renamed from: q */
    public void mo5503q(@mr2 C0826s sVar) {
        this.f4504b.add(sVar);
    }

    /* renamed from: q0 */
    public long mo5504q0(@mr2 View view) {
        C0803f0 u0;
        C0805h hVar = this.f4475a;
        if (hVar == null || !hVar.mo5716l() || (u0 = m5265u0(view)) == null) {
            return -1;
        }
        return u0.mo5684n();
    }

    /* renamed from: q1 */
    public void mo5505q1() {
        C0812m mVar = this.f4479a;
        if (mVar != null) {
            mVar.mo5761l();
        }
        C0819p pVar = this.f4480a;
        if (pVar != null) {
            pVar.mo5797D1(this.f4484a);
            this.f4480a.mo5800E1(this.f4484a);
        }
        this.f4484a.mo5949d();
    }

    /* renamed from: r */
    public void mo5506r(@mr2 C0827t tVar) {
        if (this.f4509c == null) {
            this.f4509c = new ArrayList();
        }
        this.f4509c.add(tVar);
    }

    /* renamed from: r0 */
    public int mo5507r0(@mr2 View view) {
        C0803f0 u0 = m5265u0(view);
        if (u0 != null) {
            return u0.mo5686p();
        }
        return -1;
    }

    /* renamed from: r1 */
    public boolean mo5508r1(View view) {
        mo5399P1();
        boolean r = this.f4491a.mo6217r(view);
        if (r) {
            C0803f0 u0 = m5265u0(view);
            this.f4484a.mo5942K(u0);
            this.f4484a.mo5935D(u0);
        }
        mo5402Q1(!r);
        return r;
    }

    public void removeDetachedView(View view, boolean z) {
        C0803f0 u0 = m5265u0(view);
        if (u0 != null) {
            if (u0.mo5655B()) {
                u0.mo5676f();
            } else if (!u0.mo5667N()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + u0 + mo5421Y());
            }
        }
        view.clearAnimation();
        mo5382K(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f4480a.mo5894s1(this, this.f4473a, view, view2) && view2 != null) {
            mo5558z1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f4480a.mo5816L1(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f4504b.size();
        for (int i = 0; i < size; i++) {
            this.f4504b.get(i).mo5571d(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f4525n != 0 || this.f4519h) {
            this.f4518g = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public void mo5514s(@mr2 C0832x xVar) {
        k43.m19445b(xVar != null, "'listener' arg cannot be null.");
        this.f4498a.add(xVar);
    }

    @Deprecated
    /* renamed from: s0 */
    public int mo5515s0(@mr2 View view) {
        return mo5501p0(view);
    }

    /* renamed from: s1 */
    public void mo5516s1(@mr2 C0818o oVar) {
        C0819p pVar = this.f4480a;
        if (pVar != null) {
            pVar.mo5297i("Cannot remove item decoration during a scroll  or layout");
        }
        this.f4497a.remove(oVar);
        if (this.f4497a.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        mo5404R0();
        requestLayout();
    }

    public void scrollBy(int i, int i2) {
        C0819p pVar = this.f4480a;
        if (pVar == null) {
            Log.e(f4445b, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f4519h) {
            boolean n = pVar.mo5304n();
            boolean o = this.f4480a.mo5307o();
            if (n || o) {
                if (!n) {
                    i = 0;
                }
                if (!o) {
                    i2 = 0;
                }
                mo5366E1(i, i2, (MotionEvent) null, 0);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w(f4445b, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!mo5381J1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(@ts2 C0947v vVar) {
        this.f4494a = vVar;
        jt4.m18849B1(this, vVar);
    }

    public void setAdapter(@ts2 C0805h hVar) {
        setLayoutFrozen(false);
        mo5375H1(hVar, false, true);
        mo5478l1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@ts2 C0809k kVar) {
        if (kVar != this.f4476a) {
            this.f4476a = kVar;
            setChildrenDrawingOrderEnabled(kVar != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f4506b) {
            mo5380J0();
        }
        this.f4506b = z;
        super.setClipToPadding(z);
        if (this.f4517f) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@mr2 C0810l lVar) {
        k43.m19455l(lVar);
        this.f4477a = lVar;
        mo5380J0();
    }

    public void setHasFixedSize(boolean z) {
        this.f4514d = z;
    }

    public void setItemAnimator(@ts2 C0812m mVar) {
        C0812m mVar2 = this.f4479a;
        if (mVar2 != null) {
            mVar2.mo5761l();
            this.f4479a.mo5748A((C0812m.C0815c) null);
        }
        this.f4479a = mVar;
        if (mVar != null) {
            mVar.mo5748A(this.f4478a);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f4484a.mo5939H(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(@ts2 C0819p pVar) {
        if (pVar != this.f4480a) {
            mo5405R1();
            if (this.f4480a != null) {
                C0812m mVar = this.f4479a;
                if (mVar != null) {
                    mVar.mo5761l();
                }
                this.f4480a.mo5797D1(this.f4484a);
                this.f4480a.mo5800E1(this.f4484a);
                this.f4484a.mo5949d();
                if (this.f4510c) {
                    this.f4480a.mo5803G(this, this.f4484a);
                }
                this.f4480a.mo5853b2((RecyclerView) null);
                this.f4480a = null;
            } else {
                this.f4484a.mo5949d();
            }
            this.f4491a.mo6214o();
            this.f4480a = pVar;
            if (pVar != null) {
                if (pVar.f4659a == null) {
                    pVar.mo5853b2(this);
                    if (this.f4510c) {
                        this.f4480a.mo5801F(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f4659a.mo5421Y());
                }
            }
            this.f4484a.mo5943L();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo14303p(z);
    }

    public void setOnFlingListener(@ts2 C0825r rVar) {
        this.f4481a = rVar;
    }

    @Deprecated
    public void setOnScrollListener(@ts2 C0827t tVar) {
        this.f4483a = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f4524m = z;
    }

    public void setRecycledViewPool(@ts2 C0829v vVar) {
        this.f4484a.mo5937F(vVar);
    }

    @Deprecated
    public void setRecyclerListener(@ts2 C0832x xVar) {
        this.f4485a = xVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.f4533r) {
            this.f4533r = i;
            if (i != 2) {
                mo5408S1();
            }
            mo5400Q(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w(f4445b, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                this.f4539x = i2;
            }
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.f4539x = i2;
    }

    public void setViewCacheExtension(@ts2 C0799d0 d0Var) {
        this.f4484a.mo5938G(d0Var);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo14305r(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo14307t();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f4519h) {
            mo5550x("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f4519h = false;
                if (!(!this.f4518g || this.f4480a == null || this.f4475a == null)) {
                    requestLayout();
                }
                this.f4518g = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4519h = true;
            this.f4520i = true;
            mo5405R1();
        }
    }

    /* renamed from: t */
    public void mo5540t(@mr2 C0803f0 f0Var, @ts2 C0812m.C0816d dVar, @mr2 C0812m.C0816d dVar2) {
        f0Var.mo5664K(false);
        if (this.f4479a.mo5751a(f0Var, dVar, dVar2)) {
            mo5470i1();
        }
    }

    /* renamed from: t0 */
    public C0803f0 mo5541t0(@mr2 View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m5265u0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: t1 */
    public void mo5542t1(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        mo5516s1(mo5353A0(i));
    }

    /* renamed from: u */
    public final void mo5543u(@mr2 C0803f0 f0Var, @mr2 C0803f0 f0Var2, @mr2 C0812m.C0816d dVar, @mr2 C0812m.C0816d dVar2, boolean z, boolean z2) {
        f0Var.mo5664K(false);
        if (z) {
            mo5479m(f0Var);
        }
        if (f0Var != f0Var2) {
            if (z2) {
                mo5479m(f0Var2);
            }
            f0Var.f4610a = f0Var2;
            mo5479m(f0Var);
            this.f4484a.mo5942K(f0Var);
            f0Var2.mo5664K(false);
            f0Var2.f4617b = f0Var;
        }
        if (this.f4479a.mo5752b(f0Var, f0Var2, dVar, dVar2)) {
            mo5470i1();
        }
    }

    /* renamed from: u1 */
    public void mo5544u1(@mr2 C0824q qVar) {
        List<C0824q> list = this.f4505b;
        if (list != null) {
            list.remove(qVar);
        }
    }

    /* renamed from: v */
    public void mo5545v(@mr2 C0803f0 f0Var, @mr2 C0812m.C0816d dVar, @ts2 C0812m.C0816d dVar2) {
        mo5479m(f0Var);
        f0Var.mo5664K(false);
        if (this.f4479a.mo5753c(f0Var, dVar, dVar2)) {
            mo5470i1();
        }
    }

    /* renamed from: v0 */
    public void mo5546v0(@mr2 View view, @mr2 Rect rect) {
        m5266w0(view, rect);
    }

    /* renamed from: v1 */
    public void mo5547v1(@mr2 C0826s sVar) {
        this.f4504b.remove(sVar);
        if (this.f4482a == sVar) {
            this.f4482a = null;
        }
    }

    /* renamed from: w */
    public void mo5548w(String str) {
        if (mo5392N0()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + mo5421Y());
        }
        throw new IllegalStateException(str + mo5421Y());
    }

    /* renamed from: w1 */
    public void mo5549w1(@mr2 C0827t tVar) {
        List<C0827t> list = this.f4509c;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* renamed from: x */
    public void mo5550x(String str) {
        if (mo5392N0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + mo5421Y());
            }
            throw new IllegalStateException(str);
        } else if (this.f4531q > 0) {
            Log.w(f4445b, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + mo5421Y()));
        }
    }

    /* renamed from: x0 */
    public final int mo5551x0(View view) {
        int id;
        loop0:
        while (true) {
            id = view.getId();
            while (true) {
                if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                    return id;
                }
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
        }
        return id;
    }

    /* renamed from: x1 */
    public void mo5552x1(@mr2 C0832x xVar) {
        this.f4498a.remove(xVar);
    }

    /* renamed from: y */
    public boolean mo5553y(C0803f0 f0Var) {
        C0812m mVar = this.f4479a;
        return mVar == null || mVar.mo5756g(f0Var, f0Var.mo5689s());
    }

    /* renamed from: y0 */
    public final String mo5554y0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    /* renamed from: y1 */
    public void mo5555y1() {
        C0803f0 f0Var;
        int g = this.f4491a.mo6206g();
        for (int i = 0; i < g; i++) {
            View f = this.f4491a.mo6205f(i);
            C0803f0 t0 = mo5541t0(f);
            if (!(t0 == null || (f0Var = t0.f4617b) == null)) {
                View view = f0Var.f4609a;
                int left = f.getLeft();
                int top = f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* renamed from: z */
    public final void mo5556z() {
        mo5357B1();
        setScrollState(0);
    }

    /* renamed from: z0 */
    public Rect mo5557z0(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f4544a) {
            return layoutParams.f4542a;
        }
        if (this.f4473a.mo5615j() && (layoutParams.mo5564f() || layoutParams.mo5566h())) {
            return layoutParams.f4542a;
        }
        Rect rect = layoutParams.f4542a;
        rect.set(0, 0, 0, 0);
        int size = this.f4497a.size();
        for (int i = 0; i < size; i++) {
            this.f4468a.set(0, 0, 0, 0);
            this.f4497a.get(i).mo5781g(this.f4468a, view, this, this.f4473a);
            int i2 = rect.left;
            Rect rect2 = this.f4468a;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f4544a = false;
        return rect;
    }

    /* renamed from: z1 */
    public final void mo5558z1(@mr2 View view, @ts2 View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f4468a.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f4544a) {
                Rect rect = layoutParams2.f4542a;
                Rect rect2 = this.f4468a;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f4468a);
            offsetRectIntoDescendantCoords(view, this.f4468a);
        }
        this.f4480a.mo5818M1(this, view, this.f4468a, !this.f4517f, view2 == null);
    }
}
