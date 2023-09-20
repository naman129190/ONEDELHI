package androidx.lifecycle;

import androidx.lifecycle.C0690e;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.ac1;
import com.onedelhi.secure.db0;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.we1;
import com.onedelhi.secure.z22;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@hl3({hl3.C2354a.f13188c})
public class Lifecycling {

    /* renamed from: a */
    public static final int f4031a = 1;

    /* renamed from: a */
    public static Map<Class<?>, Integer> f4032a = new HashMap();

    /* renamed from: b */
    public static final int f4033b = 2;

    /* renamed from: b */
    public static Map<Class<?>, List<Constructor<? extends C0688c>>> f4034b = new HashMap();

    /* renamed from: a */
    public static C0688c m4729a(Constructor<? extends C0688c> constructor, Object obj) {
        try {
            return (C0688c) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @ts2
    /* renamed from: b */
    public static Constructor<? extends C0688c> m4730b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c = m4731c(canonicalName);
            if (!name.isEmpty()) {
                c = name + "." + c;
            }
            Constructor<?> declaredConstructor = Class.forName(c).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m4731c(String str) {
        return str.replace(".", db0.f27369e) + "_LifecycleAdapter";
    }

    @mr2
    @Deprecated
    /* renamed from: d */
    public static we1 m4732d(Object obj) {
        final C0694f g = m4735g(obj);
        return new we1() {
            /* renamed from: g */
            public void mo669g(@mr2 a32 a32, @mr2 C0690e.C0692b bVar) {
                C0694f.this.mo669g(a32, bVar);
            }
        };
    }

    /* renamed from: e */
    public static int m4733e(Class<?> cls) {
        Integer num = f4032a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int h = m4736h(cls);
        f4032a.put(cls, Integer.valueOf(h));
        return h;
    }

    /* renamed from: f */
    public static boolean m4734f(Class<?> cls) {
        return cls != null && z22.class.isAssignableFrom(cls);
    }

    @mr2
    /* renamed from: g */
    public static C0694f m4735g(Object obj) {
        boolean z = obj instanceof C0694f;
        boolean z2 = obj instanceof ac1;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((ac1) obj, (C0694f) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((ac1) obj, (C0694f) null);
        }
        if (z) {
            return (C0694f) obj;
        }
        Class<?> cls = obj.getClass();
        if (m4733e(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f4034b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m4729a((Constructor) list.get(0), obj));
        }
        C0688c[] cVarArr = new C0688c[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cVarArr[i] = m4729a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    /* renamed from: h */
    public static int m4736h(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C0688c> b = m4730b(cls);
        if (b != null) {
            f4034b.put(cls, Collections.singletonList(b));
            return 2;
        } else if (C0685b.f4068a.mo4951d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m4734f(superclass)) {
                if (m4733e(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f4034b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m4734f(cls2)) {
                    if (m4733e(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f4034b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f4034b.put(cls, arrayList);
            return 2;
        }
    }
}
