package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class sx4 {
    @mr2

    /* renamed from: a */
    public static final sx4 f20549a = (Build.VERSION.SDK_INT >= 30 ? C3557k.f20580d : C3558l.f20581b);

    /* renamed from: a */
    public static final String f20550a = "WindowInsetsCompat";

    /* renamed from: a */
    public final C3558l f20551a;

    @sj3(21)
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: com.onedelhi.secure.sx4$a */
    public static class C3547a {

        /* renamed from: a */
        public static Field f20552a;

        /* renamed from: a */
        public static boolean f20553a = true;

        /* renamed from: b */
        public static Field f20554b;

        /* renamed from: c */
        public static Field f20555c;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f20552a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f20554b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f20555c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.w(sx4.f20550a, "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        @ts2
        /* renamed from: a */
        public static sx4 m27917a(@mr2 View view) {
            if (f20553a && view.isAttachedToWindow()) {
                try {
                    Object obj = f20552a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f20554b.get(obj);
                        Rect rect2 = (Rect) f20555c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            sx4 a = new C3548b().mo24618f(gr1.m16160e(rect)).mo24620h(gr1.m16160e(rect2)).mo24613a();
                            a.mo24583H(a);
                            a.mo24589d(view.getRootView());
                            return a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w(sx4.f20550a, "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* renamed from: com.onedelhi.secure.sx4$b */
    public static final class C3548b {

        /* renamed from: a */
        public final C3552f f20556a;

        public C3548b() {
            int i = Build.VERSION.SDK_INT;
            this.f20556a = i >= 30 ? new C3551e() : i >= 29 ? new C3550d() : new C3549c();
        }

        public C3548b(@mr2 sx4 sx4) {
            int i = Build.VERSION.SDK_INT;
            this.f20556a = i >= 30 ? new C3551e(sx4) : i >= 29 ? new C3550d(sx4) : new C3549c(sx4);
        }

        @mr2
        /* renamed from: a */
        public sx4 mo24613a() {
            return this.f20556a.mo24623b();
        }

        @mr2
        /* renamed from: b */
        public C3548b mo24614b(@ts2 bn0 bn0) {
            this.f20556a.mo24626c(bn0);
            return this;
        }

        @mr2
        /* renamed from: c */
        public C3548b mo24615c(int i, @mr2 gr1 gr1) {
            this.f20556a.mo24630d(i, gr1);
            return this;
        }

        @mr2
        /* renamed from: d */
        public C3548b mo24616d(int i, @mr2 gr1 gr1) {
            this.f20556a.mo24631e(i, gr1);
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: e */
        public C3548b mo24617e(@mr2 gr1 gr1) {
            this.f20556a.mo24627f(gr1);
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: f */
        public C3548b mo24618f(@mr2 gr1 gr1) {
            this.f20556a.mo24624g(gr1);
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: g */
        public C3548b mo24619g(@mr2 gr1 gr1) {
            this.f20556a.mo24628h(gr1);
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: h */
        public C3548b mo24620h(@mr2 gr1 gr1) {
            this.f20556a.mo24625i(gr1);
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: i */
        public C3548b mo24621i(@mr2 gr1 gr1) {
            this.f20556a.mo24629j(gr1);
            return this;
        }

        @mr2
        /* renamed from: j */
        public C3548b mo24622j(int i, boolean z) {
            this.f20556a.mo24632k(i, z);
            return this;
        }
    }

    @sj3(api = 20)
    /* renamed from: com.onedelhi.secure.sx4$c */
    public static class C3549c extends C3552f {

        /* renamed from: a */
        public static Constructor<WindowInsets> f20557a = null;

        /* renamed from: a */
        public static Field f20558a = null;

        /* renamed from: a */
        public static boolean f20559a = false;

        /* renamed from: b */
        public static boolean f20560b = false;

        /* renamed from: a */
        public WindowInsets f20561a;

        /* renamed from: a */
        public gr1 f20562a;

        public C3549c() {
            this.f20561a = m27928l();
        }

        public C3549c(@mr2 sx4 sx4) {
            super(sx4);
            this.f20561a = sx4.mo24585J();
        }

        @ts2
        /* renamed from: l */
        private static WindowInsets m27928l() {
            if (!f20559a) {
                try {
                    f20558a = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i(sx4.f20550a, "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f20559a = true;
            }
            Field field = f20558a;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i(sx4.f20550a, "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f20560b) {
                try {
                    f20557a = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e3) {
                    Log.i(sx4.f20550a, "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f20560b = true;
            }
            Constructor<WindowInsets> constructor = f20557a;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e4) {
                    Log.i(sx4.f20550a, "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        @mr2
        /* renamed from: b */
        public sx4 mo24623b() {
            mo24633a();
            sx4 K = sx4.m27879K(this.f20561a);
            K.mo24581F(this.f20565a);
            K.mo24584I(this.f20562a);
            return K;
        }

        /* renamed from: g */
        public void mo24624g(@ts2 gr1 gr1) {
            this.f20562a = gr1;
        }

        /* renamed from: i */
        public void mo24625i(@mr2 gr1 gr1) {
            WindowInsets windowInsets = this.f20561a;
            if (windowInsets != null) {
                this.f20561a = windowInsets.replaceSystemWindowInsets(gr1.f12722a, gr1.f12723b, gr1.f12724c, gr1.f12725d);
            }
        }
    }

    @sj3(api = 29)
    /* renamed from: com.onedelhi.secure.sx4$d */
    public static class C3550d extends C3552f {

        /* renamed from: a */
        public final WindowInsets.Builder f20563a;

        public C3550d() {
            this.f20563a = new WindowInsets.Builder();
        }

        public C3550d(@mr2 sx4 sx4) {
            super(sx4);
            WindowInsets.Builder builder;
            WindowInsets J = sx4.mo24585J();
            if (J == null) {
                builder = new WindowInsets.Builder();
            }
            this.f20563a = builder;
        }

        @mr2
        /* renamed from: b */
        public sx4 mo24623b() {
            mo24633a();
            sx4 K = sx4.m27879K(this.f20563a.build());
            K.mo24581F(this.f20565a);
            return K;
        }

        /* renamed from: c */
        public void mo24626c(@ts2 bn0 bn0) {
            this.f20563a.setDisplayCutout(bn0 != null ? bn0.mo13764h() : null);
        }

        /* renamed from: f */
        public void mo24627f(@mr2 gr1 gr1) {
            this.f20563a.setMandatorySystemGestureInsets(gr1.mo16836h());
        }

        /* renamed from: g */
        public void mo24624g(@mr2 gr1 gr1) {
            this.f20563a.setStableInsets(gr1.mo16836h());
        }

        /* renamed from: h */
        public void mo24628h(@mr2 gr1 gr1) {
            this.f20563a.setSystemGestureInsets(gr1.mo16836h());
        }

        /* renamed from: i */
        public void mo24625i(@mr2 gr1 gr1) {
            this.f20563a.setSystemWindowInsets(gr1.mo16836h());
        }

        /* renamed from: j */
        public void mo24629j(@mr2 gr1 gr1) {
            this.f20563a.setTappableElementInsets(gr1.mo16836h());
        }
    }

    @sj3(30)
    /* renamed from: com.onedelhi.secure.sx4$e */
    public static class C3551e extends C3550d {
        public C3551e() {
        }

        public C3551e(@mr2 sx4 sx4) {
            super(sx4);
        }

        /* renamed from: d */
        public void mo24630d(int i, @mr2 gr1 gr1) {
            this.f20563a.setInsets(C3561n.m28018a(i), gr1.mo16836h());
        }

        /* renamed from: e */
        public void mo24631e(int i, @mr2 gr1 gr1) {
            this.f20563a.setInsetsIgnoringVisibility(C3561n.m28018a(i), gr1.mo16836h());
        }

        /* renamed from: k */
        public void mo24632k(int i, boolean z) {
            this.f20563a.setVisible(C3561n.m28018a(i), z);
        }
    }

    /* renamed from: com.onedelhi.secure.sx4$f */
    public static class C3552f {

        /* renamed from: a */
        public final sx4 f20564a;

        /* renamed from: a */
        public gr1[] f20565a;

        public C3552f() {
            this(new sx4((sx4) null));
        }

        public C3552f(@mr2 sx4 sx4) {
            this.f20564a = sx4;
        }

        /* renamed from: a */
        public final void mo24633a() {
            gr1[] gr1Arr = this.f20565a;
            if (gr1Arr != null) {
                gr1 gr1 = gr1Arr[C3559m.m28011e(1)];
                gr1 gr12 = this.f20565a[C3559m.m28011e(2)];
                if (gr12 == null) {
                    gr12 = this.f20564a.mo24592f(2);
                }
                if (gr1 == null) {
                    gr1 = this.f20564a.mo24592f(1);
                }
                mo24625i(gr1.m16157b(gr1, gr12));
                gr1 gr13 = this.f20565a[C3559m.m28011e(16)];
                if (gr13 != null) {
                    mo24628h(gr13);
                }
                gr1 gr14 = this.f20565a[C3559m.m28011e(32)];
                if (gr14 != null) {
                    mo24627f(gr14);
                }
                gr1 gr15 = this.f20565a[C3559m.m28011e(64)];
                if (gr15 != null) {
                    mo24629j(gr15);
                }
            }
        }

        @mr2
        /* renamed from: b */
        public sx4 mo24623b() {
            mo24633a();
            return this.f20564a;
        }

        /* renamed from: c */
        public void mo24626c(@ts2 bn0 bn0) {
        }

        /* renamed from: d */
        public void mo24630d(int i, @mr2 gr1 gr1) {
            if (this.f20565a == null) {
                this.f20565a = new gr1[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f20565a[C3559m.m28011e(i2)] = gr1;
                }
            }
        }

        /* renamed from: e */
        public void mo24631e(int i, @mr2 gr1 gr1) {
            if (i == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        /* renamed from: f */
        public void mo24627f(@mr2 gr1 gr1) {
        }

        /* renamed from: g */
        public void mo24624g(@mr2 gr1 gr1) {
        }

        /* renamed from: h */
        public void mo24628h(@mr2 gr1 gr1) {
        }

        /* renamed from: i */
        public void mo24625i(@mr2 gr1 gr1) {
        }

        /* renamed from: j */
        public void mo24629j(@mr2 gr1 gr1) {
        }

        /* renamed from: k */
        public void mo24632k(int i, boolean z) {
        }
    }

    @sj3(20)
    /* renamed from: com.onedelhi.secure.sx4$g */
    public static class C3553g extends C3558l {

        /* renamed from: a */
        public static Class<?> f20566a = null;

        /* renamed from: a */
        public static Field f20567a = null;

        /* renamed from: a */
        public static Method f20568a = null;

        /* renamed from: a */
        public static boolean f20569a = false;

        /* renamed from: b */
        public static Field f20570b;
        @mr2

        /* renamed from: a */
        public final WindowInsets f20571a;

        /* renamed from: a */
        public gr1 f20572a;

        /* renamed from: a */
        public gr1[] f20573a;

        /* renamed from: b */
        public gr1 f20574b;

        /* renamed from: c */
        public sx4 f20575c;

        public C3553g(@mr2 sx4 sx4, @mr2 WindowInsets windowInsets) {
            super(sx4);
            this.f20572a = null;
            this.f20571a = windowInsets;
        }

        public C3553g(@mr2 sx4 sx4, @mr2 C3553g gVar) {
            this(sx4, new WindowInsets(gVar.f20571a));
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: A */
        private static void m27953A() {
            try {
                f20568a = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f20566a = cls;
                f20567a = cls.getDeclaredField("mVisibleInsets");
                f20570b = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f20567a.setAccessible(true);
                f20570b.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e(sx4.f20550a, "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f20569a = true;
        }

        @mr2
        @SuppressLint({"WrongConstant"})
        /* renamed from: v */
        private gr1 m27954v(int i, boolean z) {
            gr1 gr1 = gr1.f12721a;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    gr1 = gr1.m16157b(gr1, mo24646w(i2, z));
                }
            }
            return gr1;
        }

        /* renamed from: x */
        private gr1 m27955x() {
            sx4 sx4 = this.f20575c;
            return sx4 != null ? sx4.mo24600m() : gr1.f12721a;
        }

        @ts2
        /* renamed from: y */
        private gr1 m27956y(@mr2 View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f20569a) {
                    m27953A();
                }
                Method method = f20568a;
                if (!(method == null || f20566a == null || f20567a == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w(sx4.f20550a, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f20567a.get(f20570b.get(invoke));
                        if (rect != null) {
                            return gr1.m16160e(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        Log.e(sx4.f20550a, "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        /* renamed from: d */
        public void mo24634d(@mr2 View view) {
            gr1 y = m27956y(view);
            if (y == null) {
                y = gr1.f12721a;
            }
            mo24644s(y);
        }

        /* renamed from: e */
        public void mo24635e(@mr2 sx4 sx4) {
            sx4.mo24583H(this.f20575c);
            sx4.mo24582G(this.f20574b);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f20574b, ((C3553g) obj).f20574b);
        }

        @mr2
        /* renamed from: g */
        public gr1 mo24637g(int i) {
            return m27954v(i, false);
        }

        @mr2
        /* renamed from: h */
        public gr1 mo24638h(int i) {
            return m27954v(i, true);
        }

        @mr2
        /* renamed from: l */
        public final gr1 mo24639l() {
            if (this.f20572a == null) {
                this.f20572a = gr1.m16159d(this.f20571a.getSystemWindowInsetLeft(), this.f20571a.getSystemWindowInsetTop(), this.f20571a.getSystemWindowInsetRight(), this.f20571a.getSystemWindowInsetBottom());
            }
            return this.f20572a;
        }

        @mr2
        /* renamed from: n */
        public sx4 mo24640n(int i, int i2, int i3, int i4) {
            C3548b bVar = new C3548b(sx4.m27879K(this.f20571a));
            bVar.mo24620h(sx4.m27881z(mo24639l(), i, i2, i3, i4));
            bVar.mo24618f(sx4.m27881z(mo24650j(), i, i2, i3, i4));
            return bVar.mo24613a();
        }

        /* renamed from: p */
        public boolean mo24641p() {
            return this.f20571a.isRound();
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: q */
        public boolean mo24642q(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !mo24647z(i2)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: r */
        public void mo24643r(gr1[] gr1Arr) {
            this.f20573a = gr1Arr;
        }

        /* renamed from: s */
        public void mo24644s(@mr2 gr1 gr1) {
            this.f20574b = gr1;
        }

        /* renamed from: t */
        public void mo24645t(@ts2 sx4 sx4) {
            this.f20575c = sx4;
        }

        @mr2
        /* renamed from: w */
        public gr1 mo24646w(int i, boolean z) {
            int i2;
            if (i == 1) {
                return z ? gr1.m16159d(0, Math.max(m27955x().f12723b, mo24639l().f12723b), 0, 0) : gr1.m16159d(0, mo24639l().f12723b, 0, 0);
            }
            gr1 gr1 = null;
            if (i != 2) {
                if (i == 8) {
                    gr1[] gr1Arr = this.f20573a;
                    if (gr1Arr != null) {
                        gr1 = gr1Arr[C3559m.m28011e(8)];
                    }
                    if (gr1 != null) {
                        return gr1;
                    }
                    gr1 l = mo24639l();
                    gr1 x = m27955x();
                    int i3 = l.f12725d;
                    if (i3 > x.f12725d) {
                        return gr1.m16159d(0, 0, 0, i3);
                    }
                    gr1 gr12 = this.f20574b;
                    return (gr12 == null || gr12.equals(gr1.f12721a) || (i2 = this.f20574b.f12725d) <= x.f12725d) ? gr1.f12721a : gr1.m16159d(0, 0, 0, i2);
                } else if (i == 16) {
                    return mo24657k();
                } else {
                    if (i == 32) {
                        return mo24656i();
                    }
                    if (i == 64) {
                        return mo24658m();
                    }
                    if (i != 128) {
                        return gr1.f12721a;
                    }
                    sx4 sx4 = this.f20575c;
                    bn0 e = sx4 != null ? sx4.mo24590e() : mo24654f();
                    return e != null ? gr1.m16159d(e.mo13759d(), e.mo13762f(), e.mo13760e(), e.mo13758c()) : gr1.f12721a;
                }
            } else if (z) {
                gr1 x2 = m27955x();
                gr1 j = mo24650j();
                return gr1.m16159d(Math.max(x2.f12722a, j.f12722a), 0, Math.max(x2.f12724c, j.f12724c), Math.max(x2.f12725d, j.f12725d));
            } else {
                gr1 l2 = mo24639l();
                sx4 sx42 = this.f20575c;
                if (sx42 != null) {
                    gr1 = sx42.mo24600m();
                }
                int i4 = l2.f12725d;
                if (gr1 != null) {
                    i4 = Math.min(i4, gr1.f12725d);
                }
                return gr1.m16159d(l2.f12722a, 0, l2.f12724c, i4);
            }
        }

        /* renamed from: z */
        public boolean mo24647z(int i) {
            if (!(i == 1 || i == 2)) {
                if (i == 4) {
                    return false;
                }
                if (!(i == 8 || i == 128)) {
                    return true;
                }
            }
            return !mo24646w(i, false).equals(gr1.f12721a);
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.sx4$h */
    public static class C3554h extends C3553g {

        /* renamed from: c */
        public gr1 f20576c = null;

        public C3554h(@mr2 sx4 sx4, @mr2 WindowInsets windowInsets) {
            super(sx4, windowInsets);
        }

        public C3554h(@mr2 sx4 sx4, @mr2 C3554h hVar) {
            super(sx4, (C3553g) hVar);
            this.f20576c = hVar.f20576c;
        }

        @mr2
        /* renamed from: b */
        public sx4 mo24648b() {
            return sx4.m27879K(this.f20571a.consumeStableInsets());
        }

        @mr2
        /* renamed from: c */
        public sx4 mo24649c() {
            return sx4.m27879K(this.f20571a.consumeSystemWindowInsets());
        }

        @mr2
        /* renamed from: j */
        public final gr1 mo24650j() {
            if (this.f20576c == null) {
                this.f20576c = gr1.m16159d(this.f20571a.getStableInsetLeft(), this.f20571a.getStableInsetTop(), this.f20571a.getStableInsetRight(), this.f20571a.getStableInsetBottom());
            }
            return this.f20576c;
        }

        /* renamed from: o */
        public boolean mo24651o() {
            return this.f20571a.isConsumed();
        }

        /* renamed from: u */
        public void mo24652u(@ts2 gr1 gr1) {
            this.f20576c = gr1;
        }
    }

    @sj3(28)
    /* renamed from: com.onedelhi.secure.sx4$i */
    public static class C3555i extends C3554h {
        public C3555i(@mr2 sx4 sx4, @mr2 WindowInsets windowInsets) {
            super(sx4, windowInsets);
        }

        public C3555i(@mr2 sx4 sx4, @mr2 C3555i iVar) {
            super(sx4, (C3554h) iVar);
        }

        @mr2
        /* renamed from: a */
        public sx4 mo24653a() {
            return sx4.m27879K(this.f20571a.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3555i)) {
                return false;
            }
            C3555i iVar = (C3555i) obj;
            return Objects.equals(this.f20571a, iVar.f20571a) && Objects.equals(this.f20574b, iVar.f20574b);
        }

        @ts2
        /* renamed from: f */
        public bn0 mo24654f() {
            return bn0.m11953i(this.f20571a.getDisplayCutout());
        }

        public int hashCode() {
            return this.f20571a.hashCode();
        }
    }

    @sj3(29)
    /* renamed from: com.onedelhi.secure.sx4$j */
    public static class C3556j extends C3555i {

        /* renamed from: d */
        public gr1 f20577d = null;

        /* renamed from: e */
        public gr1 f20578e = null;

        /* renamed from: f */
        public gr1 f20579f = null;

        public C3556j(@mr2 sx4 sx4, @mr2 WindowInsets windowInsets) {
            super(sx4, windowInsets);
        }

        public C3556j(@mr2 sx4 sx4, @mr2 C3556j jVar) {
            super(sx4, (C3555i) jVar);
        }

        @mr2
        /* renamed from: i */
        public gr1 mo24656i() {
            if (this.f20578e == null) {
                this.f20578e = gr1.m16162g(this.f20571a.getMandatorySystemGestureInsets());
            }
            return this.f20578e;
        }

        @mr2
        /* renamed from: k */
        public gr1 mo24657k() {
            if (this.f20577d == null) {
                this.f20577d = gr1.m16162g(this.f20571a.getSystemGestureInsets());
            }
            return this.f20577d;
        }

        @mr2
        /* renamed from: m */
        public gr1 mo24658m() {
            if (this.f20579f == null) {
                this.f20579f = gr1.m16162g(this.f20571a.getTappableElementInsets());
            }
            return this.f20579f;
        }

        @mr2
        /* renamed from: n */
        public sx4 mo24640n(int i, int i2, int i3, int i4) {
            return sx4.m27879K(this.f20571a.inset(i, i2, i3, i4));
        }

        /* renamed from: u */
        public void mo24652u(@ts2 gr1 gr1) {
        }
    }

    @sj3(30)
    /* renamed from: com.onedelhi.secure.sx4$k */
    public static class C3557k extends C3556j {
        @mr2

        /* renamed from: d */
        public static final sx4 f20580d = sx4.m27879K(WindowInsets.CONSUMED);

        public C3557k(@mr2 sx4 sx4, @mr2 WindowInsets windowInsets) {
            super(sx4, windowInsets);
        }

        public C3557k(@mr2 sx4 sx4, @mr2 C3557k kVar) {
            super(sx4, (C3556j) kVar);
        }

        /* renamed from: d */
        public final void mo24634d(@mr2 View view) {
        }

        @mr2
        /* renamed from: g */
        public gr1 mo24637g(int i) {
            return gr1.m16162g(this.f20571a.getInsets(C3561n.m28018a(i)));
        }

        @mr2
        /* renamed from: h */
        public gr1 mo24638h(int i) {
            return gr1.m16162g(this.f20571a.getInsetsIgnoringVisibility(C3561n.m28018a(i)));
        }

        /* renamed from: q */
        public boolean mo24642q(int i) {
            return this.f20571a.isVisible(C3561n.m28018a(i));
        }
    }

    /* renamed from: com.onedelhi.secure.sx4$l */
    public static class C3558l {
        @mr2

        /* renamed from: b */
        public static final sx4 f20581b = new C3548b().mo24613a().mo24586a().mo24587b().mo24588c();

        /* renamed from: a */
        public final sx4 f20582a;

        public C3558l(@mr2 sx4 sx4) {
            this.f20582a = sx4;
        }

        @mr2
        /* renamed from: a */
        public sx4 mo24653a() {
            return this.f20582a;
        }

        @mr2
        /* renamed from: b */
        public sx4 mo24648b() {
            return this.f20582a;
        }

        @mr2
        /* renamed from: c */
        public sx4 mo24649c() {
            return this.f20582a;
        }

        /* renamed from: d */
        public void mo24634d(@mr2 View view) {
        }

        /* renamed from: e */
        public void mo24635e(@mr2 sx4 sx4) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3558l)) {
                return false;
            }
            C3558l lVar = (C3558l) obj;
            return mo24641p() == lVar.mo24641p() && mo24651o() == lVar.mo24651o() && ot2.m24056a(mo24639l(), lVar.mo24639l()) && ot2.m24056a(mo24650j(), lVar.mo24650j()) && ot2.m24056a(mo24654f(), lVar.mo24654f());
        }

        @ts2
        /* renamed from: f */
        public bn0 mo24654f() {
            return null;
        }

        @mr2
        /* renamed from: g */
        public gr1 mo24637g(int i) {
            return gr1.f12721a;
        }

        @mr2
        /* renamed from: h */
        public gr1 mo24638h(int i) {
            if ((i & 8) == 0) {
                return gr1.f12721a;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return ot2.m24057b(Boolean.valueOf(mo24641p()), Boolean.valueOf(mo24651o()), mo24639l(), mo24650j(), mo24654f());
        }

        @mr2
        /* renamed from: i */
        public gr1 mo24656i() {
            return mo24639l();
        }

        @mr2
        /* renamed from: j */
        public gr1 mo24650j() {
            return gr1.f12721a;
        }

        @mr2
        /* renamed from: k */
        public gr1 mo24657k() {
            return mo24639l();
        }

        @mr2
        /* renamed from: l */
        public gr1 mo24639l() {
            return gr1.f12721a;
        }

        @mr2
        /* renamed from: m */
        public gr1 mo24658m() {
            return mo24639l();
        }

        @mr2
        /* renamed from: n */
        public sx4 mo24640n(int i, int i2, int i3, int i4) {
            return f20581b;
        }

        /* renamed from: o */
        public boolean mo24651o() {
            return false;
        }

        /* renamed from: p */
        public boolean mo24641p() {
            return false;
        }

        /* renamed from: q */
        public boolean mo24642q(int i) {
            return true;
        }

        /* renamed from: r */
        public void mo24643r(gr1[] gr1Arr) {
        }

        /* renamed from: s */
        public void mo24644s(@mr2 gr1 gr1) {
        }

        /* renamed from: t */
        public void mo24645t(@ts2 sx4 sx4) {
        }

        /* renamed from: u */
        public void mo24652u(gr1 gr1) {
        }
    }

    /* renamed from: com.onedelhi.secure.sx4$m */
    public static final class C3559m {

        /* renamed from: a */
        public static final int f20583a = 1;

        /* renamed from: b */
        public static final int f20584b = 1;

        /* renamed from: c */
        public static final int f20585c = 2;

        /* renamed from: d */
        public static final int f20586d = 4;

        /* renamed from: e */
        public static final int f20587e = 8;

        /* renamed from: f */
        public static final int f20588f = 16;

        /* renamed from: g */
        public static final int f20589g = 32;

        /* renamed from: h */
        public static final int f20590h = 64;

        /* renamed from: i */
        public static final int f20591i = 128;

        /* renamed from: j */
        public static final int f20592j = 256;

        /* renamed from: k */
        public static final int f20593k = 9;

        /* renamed from: l */
        public static final int f20594l = 256;

        @hl3({hl3.C2354a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.onedelhi.secure.sx4$m$a */
        public @interface C3560a {
        }

        @SuppressLint({"WrongConstant"})
        @hl3({hl3.C2354a.LIBRARY_GROUP})
        /* renamed from: a */
        public static int m28007a() {
            return -1;
        }

        /* renamed from: b */
        public static int m28008b() {
            return 4;
        }

        /* renamed from: c */
        public static int m28009c() {
            return 128;
        }

        /* renamed from: d */
        public static int m28010d() {
            return 8;
        }

        /* renamed from: e */
        public static int m28011e(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }

        /* renamed from: f */
        public static int m28012f() {
            return 32;
        }

        /* renamed from: g */
        public static int m28013g() {
            return 2;
        }

        /* renamed from: h */
        public static int m28014h() {
            return 1;
        }

        /* renamed from: i */
        public static int m28015i() {
            return 7;
        }

        /* renamed from: j */
        public static int m28016j() {
            return 16;
        }

        /* renamed from: k */
        public static int m28017k() {
            return 64;
        }
    }

    @sj3(30)
    /* renamed from: com.onedelhi.secure.sx4$n */
    public static final class C3561n {
        private C3561n() {
        }

        /* renamed from: a */
        public static int m28018a(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        i2 = WindowInsets.Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    @sj3(20)
    public sx4(@mr2 WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        this.f20551a = i >= 30 ? new C3557k(this, windowInsets) : i >= 29 ? new C3556j(this, windowInsets) : i >= 28 ? new C3555i(this, windowInsets) : new C3554h(this, windowInsets);
    }

    public sx4(@ts2 sx4 sx4) {
        if (sx4 != null) {
            C3558l lVar = sx4.f20551a;
            int i = Build.VERSION.SDK_INT;
            this.f20551a = (i < 30 || !(lVar instanceof C3557k)) ? (i < 29 || !(lVar instanceof C3556j)) ? (i < 28 || !(lVar instanceof C3555i)) ? lVar instanceof C3554h ? new C3554h(this, (C3554h) lVar) : lVar instanceof C3553g ? new C3553g(this, (C3553g) lVar) : new C3558l(this) : new C3555i(this, (C3555i) lVar) : new C3556j(this, (C3556j) lVar) : new C3557k(this, (C3557k) lVar);
            lVar.mo24635e(this);
            return;
        }
        this.f20551a = new C3558l(this);
    }

    @mr2
    @sj3(20)
    /* renamed from: K */
    public static sx4 m27879K(@mr2 WindowInsets windowInsets) {
        return m27880L(windowInsets, (View) null);
    }

    @mr2
    @sj3(20)
    /* renamed from: L */
    public static sx4 m27880L(@mr2 WindowInsets windowInsets, @ts2 View view) {
        sx4 sx4 = new sx4((WindowInsets) k43.m19455l(windowInsets));
        if (view != null && jt4.m18896O0(view)) {
            sx4.mo24583H(jt4.m18988o0(view));
            sx4.mo24589d(view.getRootView());
        }
        return sx4;
    }

    /* renamed from: z */
    public static gr1 m27881z(@mr2 gr1 gr1, int i, int i2, int i3, int i4) {
        int max = Math.max(0, gr1.f12722a - i);
        int max2 = Math.max(0, gr1.f12723b - i2);
        int max3 = Math.max(0, gr1.f12724c - i3);
        int max4 = Math.max(0, gr1.f12725d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? gr1 : gr1.m16159d(max, max2, max3, max4);
    }

    /* renamed from: A */
    public boolean mo24576A() {
        return this.f20551a.mo24651o();
    }

    /* renamed from: B */
    public boolean mo24577B() {
        return this.f20551a.mo24641p();
    }

    /* renamed from: C */
    public boolean mo24578C(int i) {
        return this.f20551a.mo24642q(i);
    }

    @mr2
    @Deprecated
    /* renamed from: D */
    public sx4 mo24579D(int i, int i2, int i3, int i4) {
        return new C3548b(this).mo24620h(gr1.m16159d(i, i2, i3, i4)).mo24613a();
    }

    @mr2
    @Deprecated
    /* renamed from: E */
    public sx4 mo24580E(@mr2 Rect rect) {
        return new C3548b(this).mo24620h(gr1.m16160e(rect)).mo24613a();
    }

    /* renamed from: F */
    public void mo24581F(gr1[] gr1Arr) {
        this.f20551a.mo24643r(gr1Arr);
    }

    /* renamed from: G */
    public void mo24582G(@mr2 gr1 gr1) {
        this.f20551a.mo24644s(gr1);
    }

    /* renamed from: H */
    public void mo24583H(@ts2 sx4 sx4) {
        this.f20551a.mo24645t(sx4);
    }

    /* renamed from: I */
    public void mo24584I(@ts2 gr1 gr1) {
        this.f20551a.mo24652u(gr1);
    }

    @sj3(20)
    @ts2
    /* renamed from: J */
    public WindowInsets mo24585J() {
        C3558l lVar = this.f20551a;
        if (lVar instanceof C3553g) {
            return ((C3553g) lVar).f20571a;
        }
        return null;
    }

    @mr2
    @Deprecated
    /* renamed from: a */
    public sx4 mo24586a() {
        return this.f20551a.mo24653a();
    }

    @mr2
    @Deprecated
    /* renamed from: b */
    public sx4 mo24587b() {
        return this.f20551a.mo24648b();
    }

    @mr2
    @Deprecated
    /* renamed from: c */
    public sx4 mo24588c() {
        return this.f20551a.mo24649c();
    }

    /* renamed from: d */
    public void mo24589d(@mr2 View view) {
        this.f20551a.mo24634d(view);
    }

    @ts2
    /* renamed from: e */
    public bn0 mo24590e() {
        return this.f20551a.mo24654f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx4)) {
            return false;
        }
        return ot2.m24056a(this.f20551a, ((sx4) obj).f20551a);
    }

    @mr2
    /* renamed from: f */
    public gr1 mo24592f(int i) {
        return this.f20551a.mo24637g(i);
    }

    @mr2
    /* renamed from: g */
    public gr1 mo24593g(int i) {
        return this.f20551a.mo24638h(i);
    }

    @mr2
    @Deprecated
    /* renamed from: h */
    public gr1 mo24594h() {
        return this.f20551a.mo24656i();
    }

    public int hashCode() {
        C3558l lVar = this.f20551a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int mo24596i() {
        return this.f20551a.mo24650j().f12725d;
    }

    @Deprecated
    /* renamed from: j */
    public int mo24597j() {
        return this.f20551a.mo24650j().f12722a;
    }

    @Deprecated
    /* renamed from: k */
    public int mo24598k() {
        return this.f20551a.mo24650j().f12724c;
    }

    @Deprecated
    /* renamed from: l */
    public int mo24599l() {
        return this.f20551a.mo24650j().f12723b;
    }

    @mr2
    @Deprecated
    /* renamed from: m */
    public gr1 mo24600m() {
        return this.f20551a.mo24650j();
    }

    @mr2
    @Deprecated
    /* renamed from: n */
    public gr1 mo24601n() {
        return this.f20551a.mo24657k();
    }

    @Deprecated
    /* renamed from: o */
    public int mo24602o() {
        return this.f20551a.mo24639l().f12725d;
    }

    @Deprecated
    /* renamed from: p */
    public int mo24603p() {
        return this.f20551a.mo24639l().f12722a;
    }

    @Deprecated
    /* renamed from: q */
    public int mo24604q() {
        return this.f20551a.mo24639l().f12724c;
    }

    @Deprecated
    /* renamed from: r */
    public int mo24605r() {
        return this.f20551a.mo24639l().f12723b;
    }

    @mr2
    @Deprecated
    /* renamed from: s */
    public gr1 mo24606s() {
        return this.f20551a.mo24639l();
    }

    @mr2
    @Deprecated
    /* renamed from: t */
    public gr1 mo24607t() {
        return this.f20551a.mo24658m();
    }

    /* renamed from: u */
    public boolean mo24608u() {
        gr1 f = mo24592f(C3559m.m28007a());
        gr1 gr1 = gr1.f12721a;
        return !f.equals(gr1) || !mo24593g(C3559m.m28007a() ^ C3559m.m28010d()).equals(gr1) || mo24590e() != null;
    }

    @Deprecated
    /* renamed from: v */
    public boolean mo24609v() {
        return !this.f20551a.mo24650j().equals(gr1.f12721a);
    }

    @Deprecated
    /* renamed from: w */
    public boolean mo24610w() {
        return !this.f20551a.mo24639l().equals(gr1.f12721a);
    }

    @mr2
    /* renamed from: x */
    public sx4 mo24611x(@js1(from = 0) int i, @js1(from = 0) int i2, @js1(from = 0) int i3, @js1(from = 0) int i4) {
        return this.f20551a.mo24640n(i, i2, i3, i4);
    }

    @mr2
    /* renamed from: y */
    public sx4 mo24612y(@mr2 gr1 gr1) {
        return mo24611x(gr1.f12722a, gr1.f12723b, gr1.f12724c, gr1.f12725d);
    }
}
