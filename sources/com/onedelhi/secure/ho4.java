package com.onedelhi.secure;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class ho4 {

    /* renamed from: com.onedelhi.secure.ho4$a */
    public class C5550a extends ho4 {

        /* renamed from: a */
        public final /* synthetic */ Object f29722a;

        /* renamed from: a */
        public final /* synthetic */ Method f29723a;

        public C5550a(Method method, Object obj) {
            this.f29723a = method;
            this.f29722a = obj;
        }

        /* renamed from: c */
        public <T> T mo37487c(Class<T> cls) throws Exception {
            ho4.m50739a(cls);
            return this.f29723a.invoke(this.f29722a, new Object[]{cls});
        }
    }

    /* renamed from: com.onedelhi.secure.ho4$b */
    public class C5551b extends ho4 {

        /* renamed from: a */
        public final /* synthetic */ int f29724a;

        /* renamed from: a */
        public final /* synthetic */ Method f29725a;

        public C5551b(Method method, int i) {
            this.f29725a = method;
            this.f29724a = i;
        }

        /* renamed from: c */
        public <T> T mo37487c(Class<T> cls) throws Exception {
            ho4.m50739a(cls);
            return this.f29725a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f29724a)});
        }
    }

    /* renamed from: com.onedelhi.secure.ho4$c */
    public class C5552c extends ho4 {

        /* renamed from: a */
        public final /* synthetic */ Method f29726a;

        public C5552c(Method method) {
            this.f29726a = method;
        }

        /* renamed from: c */
        public <T> T mo37487c(Class<T> cls) throws Exception {
            ho4.m50739a(cls);
            return this.f29726a.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    /* renamed from: com.onedelhi.secure.ho4$d */
    public class C5553d extends ho4 {
        /* renamed from: c */
        public <T> T mo37487c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* renamed from: a */
    public static void m50739a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    /* renamed from: b */
    public static ho4 m50740b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C5550a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C5551b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new C5552c(declaredMethod3);
                } catch (Exception unused3) {
                    return new C5553d();
                }
            }
        }
    }

    /* renamed from: c */
    public abstract <T> T mo37487c(Class<T> cls) throws Exception;
}
