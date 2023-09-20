package com.onedelhi.secure;

import android.app.Application;
import com.onedelhi.secure.hl3;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001aK\u0010\t\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a6\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0010\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000bH\u0000¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/au4;", "T", "Ljava/lang/Class;", "modelClass", "Ljava/lang/reflect/Constructor;", "constructor", "", "", "params", "d", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Lcom/onedelhi/secure/au4;", "", "signature", "c", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 6, 0})
@hl3({hl3.C2354a.LIBRARY})
public final class er3 {
    @vr2

    /* renamed from: a */
    public static final List<Class<?>> f11330a;
    @vr2

    /* renamed from: b */
    public static final List<Class<?>> f11331b;

    static {
        Class<wq3> cls = wq3.class;
        f11330a = s00.m64044M(Application.class, cls);
        f11331b = r00.m63300l(cls);
    }

    @ss2
    /* renamed from: c */
    public static final <T> Constructor<T> m13944c(@vr2 Class<T> cls, @vr2 List<? extends Class<?>> list) {
        jt1.m53777p(cls, "modelClass");
        jt1.m53777p(list, "signature");
        Constructor<T>[] constructors = cls.getConstructors();
        jt1.m53776o(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor<T> constructor = constructors[i];
            Class[] parameterTypes = constructor.getParameterTypes();
            jt1.m53776o(parameterTypes, "constructor.parameterTypes");
            List iz = C4478ab.m37236iz(parameterTypes);
            if (jt1.m53768g(list, iz)) {
                return constructor;
            }
            if (list.size() != iz.size() || !iz.containsAll(list)) {
                i++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final <T extends au4> T m13945d(@vr2 Class<T> cls, @vr2 Constructor<T> constructor, @vr2 Object... objArr) {
        jt1.m53777p(cls, "modelClass");
        jt1.m53777p(constructor, "constructor");
        jt1.m53777p(objArr, ba0.f26252c);
        try {
            return (au4) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
