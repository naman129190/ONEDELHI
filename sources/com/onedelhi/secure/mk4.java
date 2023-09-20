package com.onedelhi.secure;

import android.graphics.Typeface;
import com.onedelhi.secure.hl3;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@sj3(28)
@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class mk4 extends lk4 {

    /* renamed from: c */
    public static final int f16175c = -1;

    /* renamed from: m */
    public static final String f16176m = "createFromFamiliesWithDefault";

    /* renamed from: n */
    public static final String f16177n = "sans-serif";

    /* renamed from: l */
    public Typeface mo19658l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f15452b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f15458g.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: x */
    public Method mo19667x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
