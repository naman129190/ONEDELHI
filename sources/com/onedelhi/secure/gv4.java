package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.onedelhi.secure.jc3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
public abstract class gv4<T extends View, Z> extends C3795vj<Z> {

    /* renamed from: b */
    public static final String f12765b = "ViewTarget";

    /* renamed from: d */
    public static boolean f12766d;

    /* renamed from: n */
    public static int f12767n = jc3.C2499e.glide_custom_view_target_tag;
    @ts2

    /* renamed from: a */
    public View.OnAttachStateChangeListener f12768a;

    /* renamed from: a */
    public final T f12769a;

    /* renamed from: a */
    public final C2281b f12770a;

    /* renamed from: b */
    public boolean f12771b;

    /* renamed from: c */
    public boolean f12772c;

    /* renamed from: com.onedelhi.secure.gv4$a */
    public class C2280a implements View.OnAttachStateChangeListener {
        public C2280a() {
        }

        public void onViewAttachedToWindow(View view) {
            gv4.this.mo16930t();
        }

        public void onViewDetachedFromWindow(View view) {
            gv4.this.mo16929q();
        }
    }

    @hw4
    /* renamed from: com.onedelhi.secure.gv4$b */
    public static final class C2281b {

        /* renamed from: a */
        public static final int f12774a = 0;
        @hw4
        @ts2

        /* renamed from: a */
        public static Integer f12775a;

        /* renamed from: a */
        public final View f12776a;
        @ts2

        /* renamed from: a */
        public C2282a f12777a;

        /* renamed from: a */
        public final List<uz3> f12778a = new ArrayList();

        /* renamed from: a */
        public boolean f12779a;

        /* renamed from: com.onedelhi.secure.gv4$b$a */
        public static final class C2282a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference<C2281b> f12780a;

            public C2282a(@mr2 C2281b bVar) {
                this.f12780a = new WeakReference<>(bVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable(gv4.f12765b, 2)) {
                    Log.v(gv4.f12765b, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C2281b bVar = (C2281b) this.f12780a.get();
                if (bVar == null) {
                    return true;
                }
                bVar.mo16936a();
                return true;
            }
        }

        public C2281b(@mr2 View view) {
            this.f12776a = view;
        }

        /* renamed from: c */
        public static int m16287c(@mr2 Context context) {
            if (f12775a == null) {
                Display defaultDisplay = ((WindowManager) g43.m15509d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f12775a = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f12775a.intValue();
        }

        /* renamed from: a */
        public void mo16936a() {
            if (!this.f12778a.isEmpty()) {
                int g = mo16941g();
                int f = mo16940f();
                if (mo16943i(g, f)) {
                    mo16944j(g, f);
                    mo16937b();
                }
            }
        }

        /* renamed from: b */
        public void mo16937b() {
            ViewTreeObserver viewTreeObserver = this.f12776a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f12777a);
            }
            this.f12777a = null;
            this.f12778a.clear();
        }

        /* renamed from: d */
        public void mo16938d(@mr2 uz3 uz3) {
            int g = mo16941g();
            int f = mo16940f();
            if (mo16943i(g, f)) {
                uz3.mo19958e(g, f);
                return;
            }
            if (!this.f12778a.contains(uz3)) {
                this.f12778a.add(uz3);
            }
            if (this.f12777a == null) {
                ViewTreeObserver viewTreeObserver = this.f12776a.getViewTreeObserver();
                C2282a aVar = new C2282a(this);
                this.f12777a = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* renamed from: e */
        public final int mo16939e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f12779a && this.f12776a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f12776a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable(gv4.f12765b, 4)) {
                Log.i(gv4.f12765b, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m16287c(this.f12776a.getContext());
        }

        /* renamed from: f */
        public final int mo16940f() {
            int paddingTop = this.f12776a.getPaddingTop() + this.f12776a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f12776a.getLayoutParams();
            return mo16939e(this.f12776a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        public final int mo16941g() {
            int paddingLeft = this.f12776a.getPaddingLeft() + this.f12776a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f12776a.getLayoutParams();
            return mo16939e(this.f12776a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        public final boolean mo16942h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean mo16943i(int i, int i2) {
            return mo16942h(i) && mo16942h(i2);
        }

        /* renamed from: j */
        public final void mo16944j(int i, int i2) {
            Iterator it = new ArrayList(this.f12778a).iterator();
            while (it.hasNext()) {
                ((uz3) it.next()).mo19958e(i, i2);
            }
        }

        /* renamed from: k */
        public void mo16945k(@mr2 uz3 uz3) {
            this.f12778a.remove(uz3);
        }
    }

    public gv4(@mr2 T t) {
        this.f12769a = (View) g43.m15509d(t);
        this.f12770a = new C2281b(t);
    }

    @Deprecated
    public gv4(@mr2 T t, boolean z) {
        this(t);
        if (z) {
            mo16933w();
        }
    }

    @Deprecated
    /* renamed from: v */
    public static void m16271v(int i) {
        if (!f12766d) {
            f12767n = i;
            return;
        }
        throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
    }

    /* renamed from: a */
    public void mo16333a(@ts2 si3 si3) {
        mo16932u(si3);
    }

    @C3740us
    /* renamed from: e */
    public void mo14955e(@mr2 uz3 uz3) {
        this.f12770a.mo16938d(uz3);
    }

    @mr2
    /* renamed from: f */
    public T mo16924f() {
        return this.f12769a;
    }

    @C3740us
    /* renamed from: h */
    public void mo16334h(@ts2 Drawable drawable) {
        super.mo16334h(drawable);
        mo16927n();
    }

    @mr2
    /* renamed from: k */
    public final gv4<T, Z> mo16925k() {
        if (this.f12768a != null) {
            return this;
        }
        this.f12768a = new C2280a();
        mo16927n();
        return this;
    }

    @ts2
    /* renamed from: l */
    public final Object mo16926l() {
        return this.f12769a.getTag(f12767n);
    }

    @ts2
    /* renamed from: m */
    public si3 mo16335m() {
        Object l = mo16926l();
        if (l == null) {
            return null;
        }
        if (l instanceof si3) {
            return (si3) l;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: n */
    public final void mo16927n() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f12768a;
        if (onAttachStateChangeListener != null && !this.f12772c) {
            this.f12769a.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f12772c = true;
        }
    }

    /* renamed from: o */
    public final void mo16928o() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f12768a;
        if (onAttachStateChangeListener != null && this.f12772c) {
            this.f12769a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f12772c = false;
        }
    }

    @C3740us
    /* renamed from: p */
    public void mo16336p(@ts2 Drawable drawable) {
        super.mo16336p(drawable);
        this.f12770a.mo16937b();
        if (!this.f12771b) {
            mo16928o();
        }
    }

    /* renamed from: q */
    public void mo16929q() {
        si3 m = mo16335m();
        if (m != null) {
            this.f12771b = true;
            m.clear();
            this.f12771b = false;
        }
    }

    @C3740us
    /* renamed from: r */
    public void mo14956r(@mr2 uz3 uz3) {
        this.f12770a.mo16945k(uz3);
    }

    /* renamed from: t */
    public void mo16930t() {
        si3 m = mo16335m();
        if (m != null && m.mo19964k()) {
            m.mo19957d();
        }
    }

    public String toString() {
        return "Target for: " + this.f12769a;
    }

    /* renamed from: u */
    public final void mo16932u(@ts2 Object obj) {
        f12766d = true;
        this.f12769a.setTag(f12767n, obj);
    }

    @mr2
    /* renamed from: w */
    public final gv4<T, Z> mo16933w() {
        this.f12770a.f12779a = true;
        return this;
    }
}
