package com.onedelhi.secure;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class pv4 {

    /* renamed from: com.onedelhi.secure.pv4$a */
    public class C6474a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f33785a;

        public C6474a(View view) {
            this.f33785a = view;
        }

        public void run() {
            ((InputMethodManager) this.f33785a.getContext().getSystemService("input_method")).showSoftInput(this.f33785a, 1);
        }
    }

    /* renamed from: com.onedelhi.secure.pv4$b */
    public class C6475b implements C6478e {

        /* renamed from: a */
        public final /* synthetic */ C6478e f33786a;

        /* renamed from: a */
        public final /* synthetic */ boolean f33787a;

        /* renamed from: b */
        public final /* synthetic */ boolean f33788b;

        /* renamed from: c */
        public final /* synthetic */ boolean f33789c;

        public C6475b(boolean z, boolean z2, boolean z3, C6478e eVar) {
            this.f33787a = z;
            this.f33788b = z2;
            this.f33789c = z3;
            this.f33786a = eVar;
        }

        @mr2
        /* renamed from: a */
        public sx4 mo11179a(View view, @mr2 sx4 sx4, @mr2 C6479f fVar) {
            if (this.f33787a) {
                fVar.f33795d += sx4.mo24602o();
            }
            boolean l = pv4.m61672l(view);
            if (this.f33788b) {
                if (l) {
                    fVar.f33794c += sx4.mo24603p();
                } else {
                    fVar.f33792a += sx4.mo24603p();
                }
            }
            if (this.f33789c) {
                if (l) {
                    fVar.f33792a += sx4.mo24604q();
                } else {
                    fVar.f33794c += sx4.mo24604q();
                }
            }
            fVar.mo42928a(view);
            C6478e eVar = this.f33786a;
            return eVar != null ? eVar.mo11179a(view, sx4, fVar) : sx4;
        }
    }

    /* renamed from: com.onedelhi.secure.pv4$c */
    public class C6476c implements ju2 {

        /* renamed from: a */
        public final /* synthetic */ C6478e f33790a;

        /* renamed from: a */
        public final /* synthetic */ C6479f f33791a;

        public C6476c(C6478e eVar, C6479f fVar) {
            this.f33790a = eVar;
            this.f33791a = fVar;
        }

        /* renamed from: a */
        public sx4 mo1063a(View view, sx4 sx4) {
            return this.f33790a.mo11179a(view, sx4, new C6479f(this.f33791a));
        }
    }

    /* renamed from: com.onedelhi.secure.pv4$d */
    public class C6477d implements View.OnAttachStateChangeListener {
        public void onViewAttachedToWindow(@mr2 View view) {
            view.removeOnAttachStateChangeListener(this);
            jt4.m19017v1(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.onedelhi.secure.pv4$e */
    public interface C6478e {
        /* renamed from: a */
        sx4 mo11179a(View view, sx4 sx4, C6479f fVar);
    }

    /* renamed from: com.onedelhi.secure.pv4$f */
    public static class C6479f {

        /* renamed from: a */
        public int f33792a;

        /* renamed from: b */
        public int f33793b;

        /* renamed from: c */
        public int f33794c;

        /* renamed from: d */
        public int f33795d;

        public C6479f(int i, int i2, int i3, int i4) {
            this.f33792a = i;
            this.f33793b = i2;
            this.f33794c = i3;
            this.f33795d = i4;
        }

        public C6479f(@mr2 C6479f fVar) {
            this.f33792a = fVar.f33792a;
            this.f33793b = fVar.f33793b;
            this.f33794c = fVar.f33794c;
            this.f33795d = fVar.f33795d;
        }

        /* renamed from: a */
        public void mo42928a(View view) {
            jt4.m18946d2(view, this.f33792a, this.f33793b, this.f33794c, this.f33795d);
        }
    }

    /* renamed from: a */
    public static void m61661a(@ts2 View view, @mr2 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: b */
    public static void m61662b(@mr2 View view, @ts2 AttributeSet attributeSet, int i, int i2) {
        m61663c(view, attributeSet, i, i2, (C6478e) null);
    }

    /* renamed from: c */
    public static void m61663c(@mr2 View view, @ts2 AttributeSet attributeSet, int i, int i2, @ts2 C6478e eVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, fd3.C2165o.Insets, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(fd3.C2165o.Insets_paddingBottomSystemWindowInsets, false);
        boolean z2 = obtainStyledAttributes.getBoolean(fd3.C2165o.Insets_paddingLeftSystemWindowInsets, false);
        boolean z3 = obtainStyledAttributes.getBoolean(fd3.C2165o.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        m61664d(view, new C6475b(z, z2, z3, eVar));
    }

    /* renamed from: d */
    public static void m61664d(@mr2 View view, @mr2 C6478e eVar) {
        jt4.m18934a2(view, new C6476c(eVar, new C6479f(jt4.m18972k0(view), view.getPaddingTop(), jt4.m18968j0(view), view.getPaddingBottom())));
        m61676p(view);
    }

    /* renamed from: e */
    public static float m61665e(@mr2 Context context, @zk0(unit = 0) int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    @ts2
    /* renamed from: f */
    public static Integer m61666f(@mr2 View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    @ts2
    /* renamed from: g */
    public static ViewGroup m61667g(@ts2 View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @ts2
    /* renamed from: h */
    public static pu4 m61668h(@mr2 View view) {
        return m61669i(m61667g(view));
    }

    @ts2
    /* renamed from: i */
    public static pu4 m61669i(@ts2 View view) {
        if (view == null) {
            return null;
        }
        return new nu4(view);
    }

    /* renamed from: j */
    public static float m61670j(@mr2 View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += jt4.m18904R((View) parent);
        }
        return f;
    }

    /* renamed from: k */
    public static void m61671k(@mr2 View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) r70.m26362o(view.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: l */
    public static boolean m61672l(View view) {
        return jt4.m18928Z(view) == 1;
    }

    /* renamed from: m */
    public static PorterDuff.Mode m61673m(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: n */
    public static void m61674n(@ts2 View view, @mr2 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            m61675o(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    /* renamed from: o */
    public static void m61675o(@mr2 ViewTreeObserver viewTreeObserver, @mr2 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: p */
    public static void m61676p(@mr2 View view) {
        if (jt4.m18896O0(view)) {
            jt4.m19017v1(view);
        } else {
            view.addOnAttachStateChangeListener(new C6477d());
        }
    }

    /* renamed from: q */
    public static void m61677q(@mr2 View view) {
        view.requestFocus();
        view.post(new C6474a(view));
    }
}
