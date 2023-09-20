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

public abstract class rc0<T extends View, Z> implements s94<Z> {

    /* renamed from: b */
    public static final String f19772b = "CustomViewTarget";
    @mo1

    /* renamed from: n */
    public static final int f19773n = jc3.C2499e.glide_custom_view_target_tag;
    @ts2

    /* renamed from: a */
    public View.OnAttachStateChangeListener f19774a;

    /* renamed from: a */
    public final T f19775a;

    /* renamed from: a */
    public final C3402b f19776a;

    /* renamed from: b */
    public boolean f19777b;

    /* renamed from: c */
    public boolean f19778c;

    /* renamed from: com.onedelhi.secure.rc0$a */
    public class C3401a implements View.OnAttachStateChangeListener {
        public C3401a() {
        }

        public void onViewAttachedToWindow(View view) {
            rc0.this.mo23800t();
        }

        public void onViewDetachedFromWindow(View view) {
            rc0.this.mo23799q();
        }
    }

    @hw4
    /* renamed from: com.onedelhi.secure.rc0$b */
    public static final class C3402b {

        /* renamed from: a */
        public static final int f19780a = 0;
        @hw4
        @ts2

        /* renamed from: a */
        public static Integer f19781a;

        /* renamed from: a */
        public final View f19782a;
        @ts2

        /* renamed from: a */
        public C3403a f19783a;

        /* renamed from: a */
        public final List<uz3> f19784a = new ArrayList();

        /* renamed from: a */
        public boolean f19785a;

        /* renamed from: com.onedelhi.secure.rc0$b$a */
        public static final class C3403a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference<C3402b> f19786a;

            public C3403a(@mr2 C3402b bVar) {
                this.f19786a = new WeakReference<>(bVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable(rc0.f19772b, 2)) {
                    Log.v(rc0.f19772b, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C3402b bVar = (C3402b) this.f19786a.get();
                if (bVar == null) {
                    return true;
                }
                bVar.mo23807a();
                return true;
            }
        }

        public C3402b(@mr2 View view) {
            this.f19782a = view;
        }

        /* renamed from: c */
        public static int m26645c(@mr2 Context context) {
            if (f19781a == null) {
                Display defaultDisplay = ((WindowManager) g43.m15509d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f19781a = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f19781a.intValue();
        }

        /* renamed from: a */
        public void mo23807a() {
            if (!this.f19784a.isEmpty()) {
                int g = mo23812g();
                int f = mo23811f();
                if (mo23814i(g, f)) {
                    mo23815j(g, f);
                    mo23808b();
                }
            }
        }

        /* renamed from: b */
        public void mo23808b() {
            ViewTreeObserver viewTreeObserver = this.f19782a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f19783a);
            }
            this.f19783a = null;
            this.f19784a.clear();
        }

        /* renamed from: d */
        public void mo23809d(@mr2 uz3 uz3) {
            int g = mo23812g();
            int f = mo23811f();
            if (mo23814i(g, f)) {
                uz3.mo19958e(g, f);
                return;
            }
            if (!this.f19784a.contains(uz3)) {
                this.f19784a.add(uz3);
            }
            if (this.f19783a == null) {
                ViewTreeObserver viewTreeObserver = this.f19782a.getViewTreeObserver();
                C3403a aVar = new C3403a(this);
                this.f19783a = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* renamed from: e */
        public final int mo23810e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f19785a && this.f19782a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f19782a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable(rc0.f19772b, 4)) {
                Log.i(rc0.f19772b, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m26645c(this.f19782a.getContext());
        }

        /* renamed from: f */
        public final int mo23811f() {
            int paddingTop = this.f19782a.getPaddingTop() + this.f19782a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f19782a.getLayoutParams();
            return mo23810e(this.f19782a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        public final int mo23812g() {
            int paddingLeft = this.f19782a.getPaddingLeft() + this.f19782a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f19782a.getLayoutParams();
            return mo23810e(this.f19782a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        public final boolean mo23813h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean mo23814i(int i, int i2) {
            return mo23813h(i) && mo23813h(i2);
        }

        /* renamed from: j */
        public final void mo23815j(int i, int i2) {
            Iterator it = new ArrayList(this.f19784a).iterator();
            while (it.hasNext()) {
                ((uz3) it.next()).mo19958e(i, i2);
            }
        }

        /* renamed from: k */
        public void mo23816k(@mr2 uz3 uz3) {
            this.f19784a.remove(uz3);
        }
    }

    public rc0(@mr2 T t) {
        this.f19775a = (View) g43.m15509d(t);
        this.f19776a = new C3402b(t);
    }

    /* renamed from: a */
    public final void mo16333a(@ts2 si3 si3) {
        mo23802u(si3);
    }

    /* renamed from: c */
    public void mo15993c() {
    }

    /* renamed from: d */
    public void mo15995d() {
    }

    /* renamed from: e */
    public final void mo14955e(@mr2 uz3 uz3) {
        this.f19776a.mo23809d(uz3);
    }

    @mr2
    /* renamed from: f */
    public final rc0<T, Z> mo23793f() {
        if (this.f19774a != null) {
            return this;
        }
        this.f19774a = new C3401a();
        mo23796k();
        return this;
    }

    /* renamed from: g */
    public void mo15999g() {
    }

    /* renamed from: h */
    public final void mo16334h(@ts2 Drawable drawable) {
        mo23796k();
        mo23798o(drawable);
    }

    @ts2
    /* renamed from: i */
    public final Object mo23794i() {
        return this.f19775a.getTag(f19773n);
    }

    @mr2
    /* renamed from: j */
    public final T mo23795j() {
        return this.f19775a;
    }

    /* renamed from: k */
    public final void mo23796k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f19774a;
        if (onAttachStateChangeListener != null && !this.f19778c) {
            this.f19775a.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f19778c = true;
        }
    }

    /* renamed from: l */
    public final void mo23797l() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f19774a;
        if (onAttachStateChangeListener != null && this.f19778c) {
            this.f19775a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f19778c = false;
        }
    }

    @ts2
    /* renamed from: m */
    public final si3 mo16335m() {
        Object i = mo23794i();
        if (i == null) {
            return null;
        }
        if (i instanceof si3) {
            return (si3) i;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    /* renamed from: n */
    public abstract void mo16020n(@ts2 Drawable drawable);

    /* renamed from: o */
    public void mo23798o(@ts2 Drawable drawable) {
    }

    /* renamed from: p */
    public final void mo16336p(@ts2 Drawable drawable) {
        this.f19776a.mo23808b();
        mo16020n(drawable);
        if (!this.f19777b) {
            mo23797l();
        }
    }

    /* renamed from: q */
    public final void mo23799q() {
        si3 m = mo16335m();
        if (m != null) {
            this.f19777b = true;
            m.clear();
            this.f19777b = false;
        }
    }

    /* renamed from: r */
    public final void mo14956r(@mr2 uz3 uz3) {
        this.f19776a.mo23816k(uz3);
    }

    /* renamed from: t */
    public final void mo23800t() {
        si3 m = mo16335m();
        if (m != null && m.mo19964k()) {
            m.mo19957d();
        }
    }

    public String toString() {
        return "Target for: " + this.f19775a;
    }

    /* renamed from: u */
    public final void mo23802u(@ts2 Object obj) {
        this.f19775a.setTag(f19773n, obj);
    }

    @Deprecated
    /* renamed from: v */
    public final rc0<T, Z> mo23803v(@mo1 int i) {
        return this;
    }

    @mr2
    /* renamed from: w */
    public final rc0<T, Z> mo23804w() {
        this.f19776a.f19785a = true;
        return this;
    }
}
