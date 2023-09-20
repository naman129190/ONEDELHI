package com.onedelhi.secure;

import com.onedelhi.secure.ip6;
import com.onedelhi.secure.jq6;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class jq6<MessageType extends jq6<MessageType, BuilderType>, BuilderType extends ip6<MessageType, BuilderType>> extends pl6<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    public qu6 zzc = qu6.m26175c();
    private int zzd = -1;

    /* renamed from: l */
    public static jq6 m18742l(Class cls) {
        Map map = zza;
        jq6 jq6 = (jq6) map.get(cls);
        if (jq6 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                jq6 = (jq6) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (jq6 == null) {
            jq6 = (jq6) ((jq6) zu6.m33463j(cls)).mo12815A(6, (Object) null, (Object) null);
            if (jq6 != null) {
                map.put(cls, jq6);
            } else {
                throw new IllegalStateException();
            }
        }
        return jq6;
    }

    /* renamed from: n */
    public static tq6 m18743n() {
        return lq6.m20908f();
    }

    /* renamed from: o */
    public static vq6 m18744o() {
        return rr6.m27033e();
    }

    /* renamed from: p */
    public static vq6 m18745p(vq6 vq6) {
        int size = vq6.size();
        return vq6.mo24067j0(size == 0 ? 10 : size + size);
    }

    /* renamed from: q */
    public static xq6 m18746q() {
        return et6.m14365e();
    }

    /* renamed from: r */
    public static xq6 m18747r(xq6 xq6) {
        int size = xq6.size();
        return xq6.mo14324d2(size == 0 ? 10 : size + size);
    }

    /* renamed from: s */
    public static Object m18748s(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: t */
    public static Object m18749t(vs6 vs6, String str, Object[] objArr) {
        return new ft6(vs6, str, objArr);
    }

    /* renamed from: w */
    public static void m18750w(Class cls, jq6 jq6) {
        jq6.mo18547v();
        zza.put(cls, jq6);
    }

    /* renamed from: A */
    public abstract Object mo12815A(int i, Object obj, Object obj2);

    /* renamed from: a */
    public final void mo18535a(eo6 eo6) throws IOException {
        dt6.m13329a().mo14854b(getClass()).mo16912f(this, go6.m15985K(eo6));
    }

    /* renamed from: b */
    public final int mo18536b() {
        int i;
        if (mo18549y()) {
            i = mo18541i((gt6) null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = mo18541i((gt6) null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }

    /* renamed from: d */
    public final /* synthetic */ vs6 mo17915d() {
        return (jq6) mo12815A(6, (Object) null, (Object) null);
    }

    /* renamed from: e */
    public final /* synthetic */ us6 mo18537e() {
        return (ip6) mo12815A(5, (Object) null, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return dt6.m13329a().mo14854b(getClass()).mo16911e(this, (jq6) obj);
    }

    /* renamed from: f */
    public final int mo18539f(gt6 gt6) {
        if (mo18549y()) {
            int i = mo18541i(gt6);
            if (i >= 0) {
                return i;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
        int i2 = this.zzd & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int i3 = mo18541i(gt6);
        if (i3 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | i3;
            return i3;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i3);
    }

    public final int hashCode() {
        if (mo18549y()) {
            return mo18550z();
        }
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int z = mo18550z();
        this.zzb = z;
        return z;
    }

    /* renamed from: i */
    public final int mo18541i(gt6 gt6) {
        if (gt6 != null) {
            return gt6.mo16907a(this);
        }
        return dt6.m13329a().mo14854b(getClass()).mo16907a(this);
    }

    /* renamed from: j */
    public final ip6 mo18542j() {
        return (ip6) mo12815A(5, (Object) null, (Object) null);
    }

    /* renamed from: k */
    public final ip6 mo18543k() {
        ip6 ip6 = (ip6) mo12815A(5, (Object) null, (Object) null);
        ip6.mo17920k(this);
        return ip6;
    }

    /* renamed from: m */
    public final jq6 mo18544m() {
        return (jq6) mo12815A(4, (Object) null, (Object) null);
    }

    public final String toString() {
        return xs6.m31715a(this, super.toString());
    }

    /* renamed from: u */
    public final void mo18546u() {
        dt6.m13329a().mo14854b(getClass()).mo16909c(this);
        mo18547v();
    }

    /* renamed from: v */
    public final void mo18547v() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* renamed from: x */
    public final void mo18548x(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* renamed from: y */
    public final boolean mo18549y() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: z */
    public final int mo18550z() {
        return dt6.m13329a().mo14854b(getClass()).mo16915i(this);
    }
}
