package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import com.onedelhi.secure.aa1;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.z91;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

@sj3(24)
@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class kk4 extends ok4 {

    /* renamed from: a */
    public static final Class<?> f14952a;

    /* renamed from: a */
    public static final Constructor<?> f14953a;

    /* renamed from: a */
    public static final Method f14954a;

    /* renamed from: b */
    public static final String f14955b = "TypefaceCompatApi24Impl";

    /* renamed from: b */
    public static final Method f14956b;

    /* renamed from: c */
    public static final String f14957c = "android.graphics.FontFamily";

    /* renamed from: d */
    public static final String f14958d = "addFontWeightStyle";

    /* renamed from: e */
    public static final String f14959e = "createFromFamiliesWithDefault";

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e(f14955b, e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f14953a = constructor;
        f14952a = cls;
        f14954a = method;
        f14956b = method2;
    }

    /* renamed from: k */
    public static boolean m19874k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f14954a.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    public static Typeface m19875l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f14952a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f14956b.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m19876m() {
        Method method = f14954a;
        if (method == null) {
            Log.w(f14955b, "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: n */
    public static Object m19877n() {
        try {
            return f14953a.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @ts2
    /* renamed from: b */
    public Typeface mo18465b(Context context, z91.C4053d dVar, Resources resources, int i) {
        Object n = m19877n();
        if (n == null) {
            return null;
        }
        for (z91.C4054e eVar : dVar.mo27843a()) {
            ByteBuffer b = pk4.m24791b(context, resources, eVar.mo27845b());
            if (b == null || !m19874k(n, b, eVar.mo27846c(), eVar.mo27848e(), eVar.mo27849f())) {
                return null;
            }
        }
        return m19875l(n);
    }

    @ts2
    /* renamed from: c */
    public Typeface mo18466c(Context context, @ts2 CancellationSignal cancellationSignal, @mr2 aa1.C1675c[] cVarArr, int i) {
        Object n = m19877n();
        if (n == null) {
            return null;
        }
        ty3 ty3 = new ty3();
        for (aa1.C1675c cVar : cVarArr) {
            Uri d = cVar.mo12878d();
            ByteBuffer byteBuffer = (ByteBuffer) ty3.get(d);
            if (byteBuffer == null) {
                byteBuffer = pk4.m24795f(context, cancellationSignal, d);
                ty3.put(d, byteBuffer);
            }
            if (byteBuffer == null || !m19874k(n, byteBuffer, cVar.mo12877c(), cVar.mo12879e(), cVar.mo12880f())) {
                return null;
            }
        }
        Typeface l = m19875l(n);
        if (l == null) {
            return null;
        }
        return Typeface.create(l, i);
    }
}
