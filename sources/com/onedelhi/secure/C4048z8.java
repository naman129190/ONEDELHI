package com.onedelhi.secure;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import com.onedelhi.secure.yb3;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.onedelhi.secure.z8 */
public final class C4048z8 {

    /* renamed from: a */
    public static volatile C4048z8 f23491a = null;

    /* renamed from: a */
    public static final Object f23492a = new Object();

    /* renamed from: a */
    public static final String f23493a = "Startup";
    @mr2

    /* renamed from: a */
    public final Context f23494a;
    @mr2

    /* renamed from: a */
    public final Map<Class<?>, Object> f23495a = new HashMap();
    @mr2

    /* renamed from: a */
    public final Set<Class<? extends mq1<?>>> f23496a = new HashSet();

    public C4048z8(@mr2 Context context) {
        this.f23494a = context.getApplicationContext();
    }

    @mr2
    /* renamed from: e */
    public static C4048z8 m32904e(@mr2 Context context) {
        if (f23491a == null) {
            synchronized (f23492a) {
                if (f23491a == null) {
                    f23491a = new C4048z8(context);
                }
            }
        }
        return f23491a;
    }

    /* renamed from: h */
    public static void m32905h(@mr2 C4048z8 z8Var) {
        synchronized (f23492a) {
            f23491a = z8Var;
        }
    }

    /* renamed from: a */
    public void mo27834a() {
        try {
            zf4.m33105c(f23493a);
            mo27835b(this.f23494a.getPackageManager().getProviderInfo(new ComponentName(this.f23494a.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            zf4.m33108f();
        } catch (PackageManager.NameNotFoundException e) {
            throw new w24((Throwable) e);
        } catch (Throwable th) {
            zf4.m33108f();
            throw th;
        }
    }

    /* renamed from: b */
    public void mo27835b(@ts2 Bundle bundle) {
        String string = this.f23494a.getString(yb3.C3986a.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, (String) null))) {
                        Class<?> cls = Class.forName(str);
                        if (mq1.class.isAssignableFrom(cls)) {
                            this.f23496a.add(cls);
                        }
                    }
                }
                for (Class<? extends mq1<?>> d : this.f23496a) {
                    mo27837d(d, hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new w24((Throwable) e);
            }
        }
    }

    @mr2
    /* renamed from: c */
    public <T> T mo27836c(@mr2 Class<? extends mq1<?>> cls) {
        T t;
        synchronized (f23492a) {
            t = this.f23495a.get(cls);
            if (t == null) {
                t = mo27837d(cls, new HashSet());
            }
        }
        return t;
    }

    @mr2
    /* renamed from: d */
    public final <T> T mo27837d(@mr2 Class<? extends mq1<?>> cls, @mr2 Set<Class<?>> set) {
        T t;
        if (zf4.m33110h()) {
            try {
                zf4.m33105c(cls.getSimpleName());
            } catch (Throwable th) {
                zf4.m33108f();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f23495a.containsKey(cls)) {
                set.add(cls);
                mq1 mq1 = (mq1) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends mq1<?>>> b = mq1.mo4139b();
                if (!b.isEmpty()) {
                    for (Class next : b) {
                        if (!this.f23495a.containsKey(next)) {
                            mo27837d(next, set);
                        }
                    }
                }
                t = mq1.mo4138a(this.f23494a);
                set.remove(cls);
                this.f23495a.put(cls, t);
            } else {
                t = this.f23495a.get(cls);
            }
            zf4.m33108f();
            return t;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    @mr2
    /* renamed from: f */
    public <T> T mo27838f(@mr2 Class<? extends mq1<T>> cls) {
        return mo27836c(cls);
    }

    /* renamed from: g */
    public boolean mo27839g(@mr2 Class<? extends mq1<?>> cls) {
        return this.f23496a.contains(cls);
    }
}
