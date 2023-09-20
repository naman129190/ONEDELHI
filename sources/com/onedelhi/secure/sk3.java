package com.onedelhi.secure;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.onedelhi.secure.c20;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.kb3;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public final class sk3 {

    /* renamed from: a */
    public static final PorterDuff.Mode f20408a = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public static final C3521c f20409a = new C3521c(6);

    /* renamed from: a */
    public static sk3 f20410a = null;

    /* renamed from: a */
    public static final String f20411a = "ResourceManagerInternal";

    /* renamed from: b */
    public static final String f20412b = "appcompat_skip_skip";

    /* renamed from: b */
    public static final boolean f20413b = false;

    /* renamed from: c */
    public static final String f20414c = "android.graphics.drawable.VectorDrawable";

    /* renamed from: a */
    public TypedValue f20415a;

    /* renamed from: a */
    public k14<String> f20416a;

    /* renamed from: a */
    public C3524f f20417a;

    /* renamed from: a */
    public ty3<String, C3523e> f20418a;

    /* renamed from: a */
    public WeakHashMap<Context, k14<ColorStateList>> f20419a;

    /* renamed from: a */
    public boolean f20420a;

    /* renamed from: b */
    public final WeakHashMap<Context, ga2<WeakReference<Drawable.ConstantState>>> f20421b = new WeakHashMap<>(0);

    /* renamed from: com.onedelhi.secure.sk3$a */
    public static class C3519a implements C3523e {
        /* renamed from: a */
        public Drawable mo24473a(@mr2 Context context, @mr2 XmlPullParser xmlPullParser, @mr2 AttributeSet attributeSet, @ts2 Resources.Theme theme) {
            try {
                return C1655a7.m10831C(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: com.onedelhi.secure.sk3$b */
    public static class C3520b implements C3523e {
        /* renamed from: a */
        public Drawable mo24473a(@mr2 Context context, @mr2 XmlPullParser xmlPullParser, @mr2 AttributeSet attributeSet, @ts2 Resources.Theme theme) {
            try {
                return C1748b7.m11580f(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: com.onedelhi.secure.sk3$c */
    public static class C3521c extends mb2<Integer, PorterDuffColorFilter> {
        public C3521c(int i) {
            super(i);
        }

        /* renamed from: s */
        public static int m27697s(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* renamed from: t */
        public PorterDuffColorFilter mo24474t(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo20268f(Integer.valueOf(m27697s(i, mode)));
        }

        /* renamed from: u */
        public PorterDuffColorFilter mo24475u(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo20272j(Integer.valueOf(m27697s(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: com.onedelhi.secure.sk3$d */
    public static class C3522d implements C3523e {
        /* renamed from: a */
        public Drawable mo24473a(@mr2 Context context, @mr2 XmlPullParser xmlPullParser, @mr2 AttributeSet attributeSet, @ts2 Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C3522d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    c20.C1838c.m12267c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            return null;
        }
    }

    /* renamed from: com.onedelhi.secure.sk3$e */
    public interface C3523e {
        /* renamed from: a */
        Drawable mo24473a(@mr2 Context context, @mr2 XmlPullParser xmlPullParser, @mr2 AttributeSet attributeSet, @ts2 Resources.Theme theme);
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: com.onedelhi.secure.sk3$f */
    public interface C3524f {
        @ts2
        /* renamed from: a */
        Drawable mo17668a(@mr2 sk3 sk3, @mr2 Context context, @dp0 int i);

        @ts2
        /* renamed from: b */
        PorterDuff.Mode mo17669b(int i);

        /* renamed from: c */
        boolean mo17670c(@mr2 Context context, @dp0 int i, @mr2 Drawable drawable);

        @ts2
        /* renamed from: d */
        ColorStateList mo17671d(@mr2 Context context, @dp0 int i);

        /* renamed from: e */
        boolean mo17672e(@mr2 Context context, @dp0 int i, @mr2 Drawable drawable);
    }

    /* renamed from: com.onedelhi.secure.sk3$g */
    public static class C3525g implements C3523e {
        /* renamed from: a */
        public Drawable mo24473a(@mr2 Context context, @mr2 XmlPullParser xmlPullParser, @mr2 AttributeSet attributeSet, @ts2 Resources.Theme theme) {
            try {
                return ls4.m20925f(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: e */
    public static long m27671e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: g */
    public static PorterDuffColorFilter m27672g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m27674l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized sk3 m27673h() {
        sk3 sk3;
        synchronized (sk3.class) {
            if (f20410a == null) {
                sk3 sk32 = new sk3();
                f20410a = sk32;
                m27675p(sk32);
            }
            sk3 = f20410a;
        }
        return sk3;
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m27674l(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter t;
        synchronized (sk3.class) {
            C3521c cVar = f20409a;
            t = cVar.mo24474t(i, mode);
            if (t == null) {
                t = new PorterDuffColorFilter(i, mode);
                cVar.mo24475u(i, mode, t);
            }
        }
        return t;
    }

    /* renamed from: p */
    public static void m27675p(@mr2 sk3 sk3) {
        if (Build.VERSION.SDK_INT < 24) {
            sk3.mo24456a(ls4.f15545f, new C3525g());
            sk3.mo24456a(C1748b7.f9674c, new C3520b());
            sk3.mo24456a("animated-selector", new C3519a());
            sk3.mo24456a("drawable", new C3522d());
        }
    }

    /* renamed from: q */
    public static boolean m27676q(@mr2 Drawable drawable) {
        return (drawable instanceof ls4) || f20414c.equals(drawable.getClass().getName());
    }

    /* renamed from: w */
    public static void m27677w(Drawable drawable, ye4 ye4, int[] iArr) {
        int[] state = drawable.getState();
        if (jp0.m18730a(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                Log.d(f20411a, "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = ye4.f23032b;
        if (z || ye4.f23031a) {
            drawable.setColorFilter(m27672g(z ? ye4.f23029a : null, ye4.f23031a ? ye4.f23030a : f20408a, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo24456a(@mr2 String str, @mr2 C3523e eVar) {
        if (this.f20418a == null) {
            this.f20418a = new ty3<>();
        }
        this.f20418a.put(str, eVar);
    }

    /* renamed from: b */
    public final synchronized boolean mo24457b(@mr2 Context context, long j, @mr2 Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            ga2 ga2 = this.f20421b.get(context);
            if (ga2 == null) {
                ga2 = new ga2();
                this.f20421b.put(context, ga2);
            }
            ga2.mo16423n(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public final void mo24458c(@mr2 Context context, @dp0 int i, @mr2 ColorStateList colorStateList) {
        if (this.f20419a == null) {
            this.f20419a = new WeakHashMap<>();
        }
        k14 k14 = this.f20419a.get(context);
        if (k14 == null) {
            k14 = new k14();
            this.f20419a.put(context, k14);
        }
        k14.mo18841a(i, colorStateList);
    }

    /* renamed from: d */
    public final void mo24459d(@mr2 Context context) {
        if (!this.f20420a) {
            this.f20420a = true;
            Drawable j = mo24462j(context, kb3.C2616a.abc_vector_test);
            if (j == null || !m27676q(j)) {
                this.f20420a = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: f */
    public final Drawable mo24460f(@mr2 Context context, @dp0 int i) {
        if (this.f20415a == null) {
            this.f20415a = new TypedValue();
        }
        TypedValue typedValue = this.f20415a;
        context.getResources().getValue(i, typedValue, true);
        long e = m27671e(typedValue);
        Drawable i2 = mo24461i(context, e);
        if (i2 != null) {
            return i2;
        }
        C3524f fVar = this.f20417a;
        Drawable a = fVar == null ? null : fVar.mo17668a(this, context, i);
        if (a != null) {
            a.setChangingConfigurations(typedValue.changingConfigurations);
            mo24457b(context, e, a);
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable mo24461i(@com.onedelhi.secure.mr2 android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, com.onedelhi.secure.ga2<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f20421b     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            com.onedelhi.secure.ga2 r0 = (com.onedelhi.secure.ga2) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo16417h(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo16426q(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.sk3.mo24461i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: j */
    public synchronized Drawable mo24462j(@mr2 Context context, @dp0 int i) {
        return mo24463k(context, i, false);
    }

    /* renamed from: k */
    public synchronized Drawable mo24463k(@mr2 Context context, @dp0 int i, boolean z) {
        Drawable r;
        mo24459d(context);
        r = mo24467r(context, i);
        if (r == null) {
            r = mo24460f(context, i);
        }
        if (r == null) {
            r = r70.m26356i(context, i);
        }
        if (r != null) {
            r = mo24471v(context, i, z, r);
        }
        if (r != null) {
            jp0.m18731b(r);
        }
        return r;
    }

    /* renamed from: m */
    public synchronized ColorStateList mo24464m(@mr2 Context context, @dp0 int i) {
        ColorStateList n;
        n = mo24465n(context, i);
        if (n == null) {
            C3524f fVar = this.f20417a;
            n = fVar == null ? null : fVar.mo17671d(context, i);
            if (n != null) {
                mo24458c(context, i, n);
            }
        }
        return n;
    }

    /* renamed from: n */
    public final ColorStateList mo24465n(@mr2 Context context, @dp0 int i) {
        k14 k14;
        WeakHashMap<Context, k14<ColorStateList>> weakHashMap = this.f20419a;
        if (weakHashMap == null || (k14 = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) k14.mo18849h(i);
    }

    /* renamed from: o */
    public PorterDuff.Mode mo24466o(int i) {
        C3524f fVar = this.f20417a;
        if (fVar == null) {
            return null;
        }
        return fVar.mo17669b(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo24467r(@com.onedelhi.secure.mr2 android.content.Context r11, @com.onedelhi.secure.dp0 int r12) {
        /*
            r10 = this;
            com.onedelhi.secure.ty3<java.lang.String, com.onedelhi.secure.sk3$e> r0 = r10.f20418a
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            com.onedelhi.secure.k14<java.lang.String> r0 = r10.f20416a
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo18849h(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            com.onedelhi.secure.ty3<java.lang.String, com.onedelhi.secure.sk3$e> r3 = r10.f20418a
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            com.onedelhi.secure.k14 r0 = new com.onedelhi.secure.k14
            r0.<init>()
            r10.f20416a = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f20415a
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f20415a = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f20415a
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m27671e(r0)
            android.graphics.drawable.Drawable r6 = r10.mo24461i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            com.onedelhi.secure.k14<java.lang.String> r8 = r10.f20416a     // Catch:{ Exception -> 0x00a2 }
            r8.mo18841a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            com.onedelhi.secure.ty3<java.lang.String, com.onedelhi.secure.sk3$e> r8 = r10.f20418a     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            com.onedelhi.secure.sk3$e r3 = (com.onedelhi.secure.sk3.C3523e) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo24473a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.mo24457b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            com.onedelhi.secure.k14<java.lang.String> r11 = r10.f20416a
            r11.mo18841a(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.sk3.mo24467r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: s */
    public synchronized void mo24468s(@mr2 Context context) {
        ga2 ga2 = this.f20421b.get(context);
        if (ga2 != null) {
            ga2.mo16410b();
        }
    }

    /* renamed from: t */
    public synchronized Drawable mo24469t(@mr2 Context context, @mr2 ms4 ms4, @dp0 int i) {
        Drawable r = mo24467r(context, i);
        if (r == null) {
            r = ms4.mo14742a(i);
        }
        if (r == null) {
            return null;
        }
        return mo24471v(context, i, false, r);
    }

    /* renamed from: u */
    public synchronized void mo24470u(C3524f fVar) {
        this.f20417a = fVar;
    }

    /* renamed from: v */
    public final Drawable mo24471v(@mr2 Context context, @dp0 int i, boolean z, @mr2 Drawable drawable) {
        ColorStateList m = mo24464m(context, i);
        if (m != null) {
            if (jp0.m18730a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = wo0.m30989r(drawable);
            wo0.m30986o(r, m);
            PorterDuff.Mode o = mo24466o(i);
            if (o == null) {
                return r;
            }
            wo0.m30987p(r, o);
            return r;
        }
        C3524f fVar = this.f20417a;
        if ((fVar == null || !fVar.mo17670c(context, i, drawable)) && !mo24472x(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* renamed from: x */
    public boolean mo24472x(@mr2 Context context, @dp0 int i, @mr2 Drawable drawable) {
        C3524f fVar = this.f20417a;
        return fVar != null && fVar.mo17672e(context, i, drawable);
    }
}
