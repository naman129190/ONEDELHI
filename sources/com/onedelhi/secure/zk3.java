package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import com.onedelhi.secure.hl3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;

public final class zk3 {
    @C3476s7

    /* renamed from: a */
    public static final int f23789a = 0;

    /* renamed from: a */
    public static final Object f23790a = new Object();

    /* renamed from: a */
    public static final String f23791a = "ResourcesCompat";

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f23792a = new ThreadLocal<>();
    @mj1("sColorStateCacheLock")

    /* renamed from: a */
    public static final WeakHashMap<C4108f, SparseArray<C4107e>> f23793a = new WeakHashMap<>(0);

    @sj3(15)
    /* renamed from: com.onedelhi.secure.zk3$a */
    public static class C4103a {
        @pn0
        /* renamed from: a */
        public static Drawable m33215a(Resources resources, int i, int i2) {
            return resources.getDrawableForDensity(i, i2);
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.zk3$b */
    public static class C4104b {
        @pn0
        /* renamed from: a */
        public static Drawable m33216a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        @pn0
        /* renamed from: b */
        public static Drawable m33217b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    @sj3(23)
    /* renamed from: com.onedelhi.secure.zk3$c */
    public static class C4105c {
        @pn0
        /* renamed from: a */
        public static int m33218a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        @mr2
        @pn0
        /* renamed from: b */
        public static ColorStateList m33219b(@mr2 Resources resources, @k10 int i, @ts2 Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    @sj3(29)
    /* renamed from: com.onedelhi.secure.zk3$d */
    public static class C4106d {
        @pn0
        /* renamed from: a */
        public static float m33220a(@mr2 Resources resources, @yk0 int i) {
            return resources.getFloat(i);
        }
    }

    /* renamed from: com.onedelhi.secure.zk3$e */
    public static class C4107e {

        /* renamed from: a */
        public final int f23794a;

        /* renamed from: a */
        public final ColorStateList f23795a;

        /* renamed from: a */
        public final Configuration f23796a;

        public C4107e(@mr2 ColorStateList colorStateList, @mr2 Configuration configuration, @ts2 Resources.Theme theme) {
            this.f23795a = colorStateList;
            this.f23796a = configuration;
            this.f23794a = theme == null ? 0 : theme.hashCode();
        }
    }

    /* renamed from: com.onedelhi.secure.zk3$f */
    public static final class C4108f {

        /* renamed from: a */
        public final Resources.Theme f23797a;

        /* renamed from: a */
        public final Resources f23798a;

        public C4108f(@mr2 Resources resources, @ts2 Resources.Theme theme) {
            this.f23798a = resources;
            this.f23797a = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4108f.class != obj.getClass()) {
                return false;
            }
            C4108f fVar = (C4108f) obj;
            return this.f23798a.equals(fVar.f23798a) && ot2.m24056a(this.f23797a, fVar.f23797a);
        }

        public int hashCode() {
            return ot2.m24057b(this.f23798a, this.f23797a);
        }
    }

    /* renamed from: com.onedelhi.secure.zk3$g */
    public static abstract class C4109g {
        @mr2
        @hl3({hl3.C2354a.LIBRARY})
        /* renamed from: e */
        public static Handler m33223e(@ts2 Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
        /* renamed from: c */
        public final void mo28032c(int i, @ts2 Handler handler) {
            m33223e(handler).post(new al3(this, i));
        }

        @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
        /* renamed from: d */
        public final void mo28033d(@mr2 Typeface typeface, @ts2 Handler handler) {
            m33223e(handler).post(new bl3(this, typeface));
        }

        /* renamed from: h */
        public abstract void m33224f(int i);

        /* renamed from: i */
        public abstract void m33225g(@mr2 Typeface typeface);
    }

    /* renamed from: com.onedelhi.secure.zk3$h */
    public static final class C4110h {

        @sj3(23)
        /* renamed from: com.onedelhi.secure.zk3$h$a */
        public static class C4111a {

            /* renamed from: a */
            public static final Object f23799a = new Object();

            /* renamed from: a */
            public static Method f23800a;

            /* renamed from: a */
            public static boolean f23801a;

            @SuppressLint({"BanUncheckedReflection"})
            /* renamed from: a */
            public static void m33231a(@mr2 Resources.Theme theme) {
                synchronized (f23799a) {
                    if (!f23801a) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f23800a = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i(zk3.f23791a, "Failed to retrieve rebase() method", e);
                        }
                        f23801a = true;
                    }
                    Method method = f23800a;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i(zk3.f23791a, "Failed to invoke rebase() method via reflection", e2);
                            f23800a = null;
                        }
                    }
                }
            }
        }

        @sj3(29)
        /* renamed from: com.onedelhi.secure.zk3$h$b */
        public static class C4112b {
            @pn0
            /* renamed from: a */
            public static void m33232a(@mr2 Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m33230a(@mr2 Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                C4112b.m33232a(theme);
            } else if (i >= 23) {
                C4111a.m33231a(theme);
            }
        }
    }

    /* renamed from: a */
    public static void m33198a(@mr2 C4108f fVar, @k10 int i, @mr2 ColorStateList colorStateList, @ts2 Resources.Theme theme) {
        synchronized (f23790a) {
            WeakHashMap<C4108f, SparseArray<C4107e>> weakHashMap = f23793a;
            SparseArray sparseArray = weakHashMap.get(fVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(fVar, sparseArray);
            }
            sparseArray.append(i, new C4107e(colorStateList, fVar.f23798a.getConfiguration(), theme));
        }
    }

    /* renamed from: b */
    public static void m33199b(@mr2 Resources.Theme theme) {
        synchronized (f23790a) {
            Iterator<C4108f> it = f23793a.keySet().iterator();
            while (it.hasNext()) {
                C4108f next = it.next();
                if (next != null && theme.equals(next.f23797a)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        return null;
     */
    @com.onedelhi.secure.ts2
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m33200c(@com.onedelhi.secure.mr2 com.onedelhi.secure.zk3.C4108f r5, @com.onedelhi.secure.k10 int r6) {
        /*
            java.lang.Object r0 = f23790a
            monitor-enter(r0)
            java.util.WeakHashMap<com.onedelhi.secure.zk3$f, android.util.SparseArray<com.onedelhi.secure.zk3$e>> r1 = f23793a     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0042
            int r2 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r2 <= 0) goto L_0x0042
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0045 }
            com.onedelhi.secure.zk3$e r2 = (com.onedelhi.secure.zk3.C4107e) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0042
            android.content.res.Configuration r3 = r2.f23796a     // Catch:{ all -> 0x0045 }
            android.content.res.Resources r4 = r5.f23798a     // Catch:{ all -> 0x0045 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0045 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003f
            android.content.res.Resources$Theme r5 = r5.f23797a     // Catch:{ all -> 0x0045 }
            if (r5 != 0) goto L_0x0031
            int r3 = r2.f23794a     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003b
        L_0x0031:
            if (r5 == 0) goto L_0x003f
            int r3 = r2.f23794a     // Catch:{ all -> 0x0045 }
            int r5 = r5.hashCode()     // Catch:{ all -> 0x0045 }
            if (r3 != r5) goto L_0x003f
        L_0x003b:
            android.content.res.ColorStateList r5 = r2.f23795a     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r5
        L_0x003f:
            r1.remove(r6)     // Catch:{ all -> 0x0045 }
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r5 = 0
            return r5
        L_0x0045:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.zk3.m33200c(com.onedelhi.secure.zk3$f, int):android.content.res.ColorStateList");
    }

    @ts2
    /* renamed from: d */
    public static Typeface m33201d(@mr2 Context context, @y91 int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m33213p(context, i, new TypedValue(), 0, (C4109g) null, (Handler) null, false, true);
    }

    @d10
    /* renamed from: e */
    public static int m33202e(@mr2 Resources resources, @k10 int i, @ts2 Resources.Theme theme) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 23 ? C4105c.m33218a(resources, i, theme) : resources.getColor(i);
    }

    @ts2
    /* renamed from: f */
    public static ColorStateList m33203f(@mr2 Resources resources, @k10 int i, @ts2 Resources.Theme theme) throws Resources.NotFoundException {
        C4108f fVar = new C4108f(resources, theme);
        ColorStateList c = m33200c(fVar, i);
        if (c != null) {
            return c;
        }
        ColorStateList n = m33211n(resources, i, theme);
        if (n == null) {
            return Build.VERSION.SDK_INT >= 23 ? C4105c.m33219b(resources, i, theme) : resources.getColorStateList(i);
        }
        m33198a(fVar, i, n, theme);
        return n;
    }

    @ts2
    /* renamed from: g */
    public static Drawable m33204g(@mr2 Resources resources, @dp0 int i, @ts2 Resources.Theme theme) throws Resources.NotFoundException {
        return C4104b.m33216a(resources, i, theme);
    }

    @ts2
    /* renamed from: h */
    public static Drawable m33205h(@mr2 Resources resources, @dp0 int i, int i2, @ts2 Resources.Theme theme) throws Resources.NotFoundException {
        return C4104b.m33217b(resources, i, i2, theme);
    }

    /* renamed from: i */
    public static float m33206i(@mr2 Resources resources, @yk0 int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C4106d.m33220a(resources, i);
        }
        TypedValue m = m33210m();
        resources.getValue(i, m, true);
        if (m.type == 4) {
            return m.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(m.type) + " is not valid");
    }

    @ts2
    /* renamed from: j */
    public static Typeface m33207j(@mr2 Context context, @y91 int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m33213p(context, i, new TypedValue(), 0, (C4109g) null, (Handler) null, false, false);
    }

    @ts2
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: k */
    public static Typeface m33208k(@mr2 Context context, @y91 int i, @mr2 TypedValue typedValue, int i2, @ts2 C4109g gVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m33213p(context, i, typedValue, i2, gVar, (Handler) null, true, false);
    }

    /* renamed from: l */
    public static void m33209l(@mr2 Context context, @y91 int i, @mr2 C4109g gVar, @ts2 Handler handler) throws Resources.NotFoundException {
        k43.m19455l(gVar);
        if (context.isRestricted()) {
            gVar.mo28032c(-4, handler);
            return;
        }
        m33213p(context, i, new TypedValue(), 0, gVar, handler, false, false);
    }

    @mr2
    /* renamed from: m */
    public static TypedValue m33210m() {
        ThreadLocal<TypedValue> threadLocal = f23792a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @ts2
    /* renamed from: n */
    public static ColorStateList m33211n(Resources resources, int i, @ts2 Resources.Theme theme) {
        if (m33212o(resources, i)) {
            return null;
        }
        try {
            return o10.m23247a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.w(f23791a, "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: o */
    public static boolean m33212o(@mr2 Resources resources, @k10 int i) {
        TypedValue m = m33210m();
        resources.getValue(i, m, true);
        int i2 = m.type;
        return i2 >= 28 && i2 <= 31;
    }

    /* renamed from: p */
    public static Typeface m33213p(@mr2 Context context, int i, @mr2 TypedValue typedValue, int i2, @ts2 C4109g gVar, @ts2 Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        int i3 = i;
        resources.getValue(i, typedValue, true);
        Typeface q = m33214q(context, resources, typedValue, i, i2, gVar, handler, z, z2);
        if (q != null || gVar != null || z2) {
            return q;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00aa  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m33214q(@com.onedelhi.secure.mr2 android.content.Context r17, android.content.res.Resources r18, @com.onedelhi.secure.mr2 android.util.TypedValue r19, int r20, int r21, @com.onedelhi.secure.ts2 com.onedelhi.secure.zk3.C4109g r22, @com.onedelhi.secure.ts2 android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00ae
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L_0x0025
            if (r11 == 0) goto L_0x0024
            r11.mo28032c(r15, r12)
        L_0x0024:
            return r16
        L_0x0025:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = com.onedelhi.secure.ik4.m17658j(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L_0x0035
            if (r11 == 0) goto L_0x0034
            r11.mo28033d(r2, r12)
        L_0x0034:
            return r2
        L_0x0035:
            if (r25 == 0) goto L_0x0038
            return r16
        L_0x0038:
            java.lang.String r2 = r14.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            if (r2 == 0) goto L_0x006f
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            com.onedelhi.secure.z91$b r2 = com.onedelhi.secure.z91.m32936b(r2, r0)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            if (r2 != 0) goto L_0x0059
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            if (r11 == 0) goto L_0x0058
            r11.mo28032c(r15, r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
        L_0x0058:
            return r16
        L_0x0059:
            int r6 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = com.onedelhi.secure.ik4.m17653e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            return r0
        L_0x006f:
            int r5 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = com.onedelhi.secure.ik4.m17655g(r1, r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            if (r11 == 0) goto L_0x0089
            if (r0 == 0) goto L_0x0086
            r11.mo28033d(r0, r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            goto L_0x0089
        L_0x0086:
            r11.mo28032c(r15, r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
        L_0x0089:
            return r0
        L_0x008a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L_0x009b
        L_0x0093:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L_0x009b:
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            if (r11 == 0) goto L_0x00ad
            r11.mo28032c(r15, r12)
        L_0x00ad:
            return r16
        L_0x00ae:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.zk3.m33214q(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, com.onedelhi.secure.zk3$g, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
