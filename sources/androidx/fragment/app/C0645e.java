package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ty3;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.fragment.app.e */
public class C0645e {

    /* renamed from: a */
    public static final ty3<ClassLoader, ty3<String, Class<?>>> f3856a = new ty3<>();

    /* renamed from: b */
    public static boolean m4540b(@mr2 ClassLoader classLoader, @mr2 String str) {
        try {
            return Fragment.class.isAssignableFrom(m4541c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @mr2
    /* renamed from: c */
    public static Class<?> m4541c(@mr2 ClassLoader classLoader, @mr2 String str) throws ClassNotFoundException {
        ty3<ClassLoader, ty3<String, Class<?>>> ty3 = f3856a;
        ty3 ty32 = ty3.get(classLoader);
        if (ty32 == null) {
            ty32 = new ty3();
            ty3.put(classLoader, ty32);
        }
        Class<?> cls = (Class) ty32.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        ty32.put(str, cls2);
        return cls2;
    }

    @mr2
    /* renamed from: d */
    public static Class<? extends Fragment> m4542d(@mr2 ClassLoader classLoader, @mr2 String str) {
        try {
            return m4541c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.C0587j("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new Fragment.C0587j("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    @mr2
    /* renamed from: a */
    public Fragment mo4643a(@mr2 ClassLoader classLoader, @mr2 String str) {
        try {
            return (Fragment) m4542d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            throw new Fragment.C0587j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new Fragment.C0587j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.C0587j("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.C0587j("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }
}
