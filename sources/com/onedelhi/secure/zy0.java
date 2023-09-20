package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zy0 {

    /* renamed from: a */
    public static volatile zy0 f38494a = null;

    /* renamed from: a */
    public static final String f38495a = "com.google.protobuf.Extension";

    /* renamed from: a */
    public static volatile boolean f38496a = false;

    /* renamed from: b */
    public static final zy0 f38497b = new zy0(true);

    /* renamed from: b */
    public static boolean f38498b = true;

    /* renamed from: a */
    public final Map<C7524b, qe1.C6553h<?, ?>> f38499a;

    /* renamed from: com.onedelhi.secure.zy0$a */
    public static class C7523a {

        /* renamed from: a */
        public static final Class<?> f38500a = m74401a();

        /* renamed from: a */
        public static Class<?> m74401a() {
            try {
                return Class.forName(zy0.f38495a);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    /* renamed from: com.onedelhi.secure.zy0$b */
    public static final class C7524b {

        /* renamed from: a */
        public final int f38501a;

        /* renamed from: a */
        public final Object f38502a;

        public C7524b(Object obj, int i) {
            this.f38502a = obj;
            this.f38501a = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7524b)) {
                return false;
            }
            C7524b bVar = (C7524b) obj;
            return this.f38502a == bVar.f38502a && this.f38501a == bVar.f38501a;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f38502a) * 65535) + this.f38501a;
        }
    }

    public zy0() {
        this.f38499a = new HashMap();
    }

    public zy0(zy0 zy0) {
        this.f38499a = zy0 == f38497b ? Collections.emptyMap() : Collections.unmodifiableMap(zy0.f38499a);
    }

    public zy0(boolean z) {
        this.f38499a = Collections.emptyMap();
    }

    /* renamed from: d */
    public static zy0 m74393d() {
        zy0 zy0 = f38494a;
        if (zy0 == null) {
            synchronized (zy0.class) {
                zy0 = f38494a;
                if (zy0 == null) {
                    zy0 = f38498b ? yy0.m72376b() : f38497b;
                    f38494a = zy0;
                }
            }
        }
        return zy0;
    }

    /* renamed from: f */
    public static boolean m74394f() {
        return f38496a;
    }

    /* renamed from: g */
    public static zy0 m74395g() {
        return f38498b ? yy0.m72375a() : new zy0();
    }

    /* renamed from: h */
    public static void m74396h(boolean z) {
        f38496a = z;
    }

    /* renamed from: a */
    public final void mo48469a(xy0<?, ?> xy0) {
        if (qe1.C6553h.class.isAssignableFrom(xy0.getClass())) {
            mo48470b((qe1.C6553h) xy0);
        }
        if (f38498b && yy0.m72378d(this)) {
            try {
                getClass().getMethod("add", new Class[]{C7523a.f38500a}).invoke(this, new Object[]{xy0});
            } catch (Exception e) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", new Object[]{xy0}), e);
            }
        }
    }

    /* renamed from: b */
    public final void mo48470b(qe1.C6553h<?, ?> hVar) {
        this.f38499a.put(new C7524b(hVar.mo43431h(), hVar.mo43428d()), hVar);
    }

    /* renamed from: c */
    public <ContainingType extends yh2> qe1.C6553h<ContainingType, ?> mo48471c(ContainingType containingtype, int i) {
        return this.f38499a.get(new C7524b(containingtype, i));
    }

    /* renamed from: e */
    public zy0 mo48472e() {
        return new zy0(this);
    }
}
