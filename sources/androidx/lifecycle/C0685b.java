package androidx.lifecycle;

import androidx.lifecycle.C0690e;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.ts2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.b */
public final class C0685b {

    /* renamed from: a */
    public static final int f4067a = 0;

    /* renamed from: a */
    public static C0685b f4068a = new C0685b();

    /* renamed from: b */
    public static final int f4069b = 1;

    /* renamed from: c */
    public static final int f4070c = 2;

    /* renamed from: a */
    public final Map<Class<?>, C0686a> f4071a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, Boolean> f4072b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.b$a */
    public static class C0686a {

        /* renamed from: a */
        public final Map<C0690e.C0692b, List<C0687b>> f4073a = new HashMap();

        /* renamed from: b */
        public final Map<C0687b, C0690e.C0692b> f4074b;

        public C0686a(Map<C0687b, C0690e.C0692b> map) {
            this.f4074b = map;
            for (Map.Entry next : map.entrySet()) {
                C0690e.C0692b bVar = (C0690e.C0692b) next.getValue();
                List list = this.f4073a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f4073a.put(bVar, list);
                }
                list.add((C0687b) next.getKey());
            }
        }

        /* renamed from: b */
        public static void m4783b(List<C0687b> list, a32 a32, C0690e.C0692b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).mo4954a(a32, bVar, obj);
                }
            }
        }

        /* renamed from: a */
        public void mo4953a(a32 a32, C0690e.C0692b bVar, Object obj) {
            m4783b(this.f4073a.get(bVar), a32, bVar, obj);
            m4783b(this.f4073a.get(C0690e.C0692b.ON_ANY), a32, bVar, obj);
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.b$b */
    public static final class C0687b {

        /* renamed from: a */
        public final int f4075a;

        /* renamed from: a */
        public final Method f4076a;

        public C0687b(int i, Method method) {
            this.f4075a = i;
            this.f4076a = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        public void mo4954a(a32 a32, C0690e.C0692b bVar, Object obj) {
            try {
                int i = this.f4075a;
                if (i == 0) {
                    this.f4076a.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f4076a.invoke(obj, new Object[]{a32});
                } else if (i == 2) {
                    this.f4076a.invoke(obj, new Object[]{a32, bVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0687b)) {
                return false;
            }
            C0687b bVar = (C0687b) obj;
            return this.f4075a == bVar.f4075a && this.f4076a.getName().equals(bVar.f4076a.getName());
        }

        public int hashCode() {
            return (this.f4075a * 31) + this.f4076a.getName().hashCode();
        }
    }

    /* renamed from: a */
    public final C0686a mo4948a(Class<?> cls, @ts2 Method[] methodArr) {
        int i;
        C0686a c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c = mo4950c(superclass)) == null)) {
            hashMap.putAll(c.f4074b);
        }
        for (Class c2 : cls.getInterfaces()) {
            for (Map.Entry next : mo4950c(c2).f4074b.entrySet()) {
                mo4952e(hashMap, (C0687b) next.getKey(), (C0690e.C0692b) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = mo4949b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0697h hVar = (C0697h) method.getAnnotation(C0697h.class);
            if (hVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(a32.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0690e.C0692b value = hVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0690e.C0692b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0690e.C0692b.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    mo4952e(hashMap, new C0687b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0686a aVar = new C0686a(hashMap);
        this.f4071a.put(cls, aVar);
        this.f4072b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    public final Method[] mo4949b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: c */
    public C0686a mo4950c(Class<?> cls) {
        C0686a aVar = this.f4071a.get(cls);
        return aVar != null ? aVar : mo4948a(cls, (Method[]) null);
    }

    /* renamed from: d */
    public boolean mo4951d(Class<?> cls) {
        Boolean bool = this.f4072b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b = mo4949b(cls);
        for (Method annotation : b) {
            if (((C0697h) annotation.getAnnotation(C0697h.class)) != null) {
                mo4948a(cls, b);
                return true;
            }
        }
        this.f4072b.put(cls, Boolean.FALSE);
        return false;
    }

    /* renamed from: e */
    public final void mo4952e(Map<C0687b, C0690e.C0692b> map, C0687b bVar, C0690e.C0692b bVar2, Class<?> cls) {
        C0690e.C0692b bVar3 = map.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f4076a;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
        } else if (bVar3 == null) {
            map.put(bVar, bVar2);
        }
    }
}
