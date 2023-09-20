package com.onedelhi.secure;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.onedelhi.secure.aa1;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.z91;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

@sj3(26)
@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class lk4 extends jk4 {

    /* renamed from: b */
    public static final int f15444b = -1;

    /* renamed from: f */
    public static final String f15445f = "TypefaceCompatApi26Impl";

    /* renamed from: g */
    public static final String f15446g = "android.graphics.FontFamily";

    /* renamed from: h */
    public static final String f15447h = "addFontFromAssetManager";

    /* renamed from: i */
    public static final String f15448i = "addFontFromBuffer";

    /* renamed from: j */
    public static final String f15449j = "createFromFamiliesWithDefault";

    /* renamed from: k */
    public static final String f15450k = "freeze";

    /* renamed from: l */
    public static final String f15451l = "abortCreation";

    /* renamed from: b */
    public final Class<?> f15452b;

    /* renamed from: b */
    public final Constructor<?> f15453b;

    /* renamed from: c */
    public final Method f15454c;

    /* renamed from: d */
    public final Method f15455d;

    /* renamed from: e */
    public final Method f15456e;

    /* renamed from: f */
    public final Method f15457f;

    /* renamed from: g */
    public final Method f15458g;

    public lk4() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y = mo19668y();
            constructor = mo19669z(y);
            method4 = mo19665v(y);
            method3 = mo19666w(y);
            method2 = mo19656A(y);
            method = mo19664u(y);
            Class<?> cls2 = y;
            method5 = mo19667x(y);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e(f15445f, "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f15452b = cls;
        this.f15453b = constructor;
        this.f15454c = method4;
        this.f15455d = method3;
        this.f15456e = method2;
        this.f15457f = method;
        this.f15458g = method5;
    }

    @ts2
    /* renamed from: o */
    private Object m20780o() {
        try {
            return this.f15453b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: A */
    public Method mo19656A(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f15450k, new Class[0]);
    }

    @ts2
    /* renamed from: b */
    public Typeface mo18465b(Context context, z91.C4053d dVar, Resources resources, int i) {
        if (!mo19663t()) {
            return super.mo18465b(context, dVar, resources, i);
        }
        Object o = m20780o();
        if (o == null) {
            return null;
        }
        for (z91.C4054e eVar : dVar.mo27843a()) {
            if (!mo19660q(context, o, eVar.mo27844a(), eVar.mo27846c(), eVar.mo27848e(), eVar.mo27849f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(eVar.mo27847d()))) {
                mo19659p(o);
                return null;
            }
        }
        if (!mo19662s(o)) {
            return null;
        }
        return mo19658l(o);
    }

    @ts2
    /* renamed from: c */
    public Typeface mo18466c(Context context, @ts2 CancellationSignal cancellationSignal, @mr2 aa1.C1675c[] cVarArr, int i) {
        Typeface l;
        ParcelFileDescriptor openFileDescriptor;
        if (cVarArr.length < 1) {
            return null;
        }
        if (!mo19663t()) {
            aa1.C1675c h = mo21351h(cVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(h.mo12878d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h.mo12879e()).setItalic(h.mo12880f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map<Uri, ByteBuffer> h2 = pk4.m24797h(context, cVarArr, cancellationSignal);
            Object o = m20780o();
            if (o == null) {
                return null;
            }
            boolean z = false;
            for (aa1.C1675c cVar : cVarArr) {
                ByteBuffer byteBuffer = h2.get(cVar.mo12878d());
                if (byteBuffer != null) {
                    if (!mo19661r(o, byteBuffer, cVar.mo12877c(), cVar.mo12879e(), cVar.mo12880f() ? 1 : 0)) {
                        mo19659p(o);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                mo19659p(o);
                return null;
            } else if (mo19662s(o) && (l = mo19658l(o)) != null) {
                return Typeface.create(l, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    @ts2
    /* renamed from: e */
    public Typeface mo19657e(Context context, Resources resources, int i, String str, int i2) {
        if (!mo19663t()) {
            return super.mo19657e(context, resources, i, str, i2);
        }
        Object o = m20780o();
        if (o == null) {
            return null;
        }
        if (!mo19660q(context, o, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            mo19659p(o);
            return null;
        } else if (!mo19662s(o)) {
            return null;
        } else {
            return mo19658l(o);
        }
    }

    @ts2
    /* renamed from: l */
    public Typeface mo19658l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f15452b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f15458g.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: p */
    public final void mo19659p(Object obj) {
        try {
            this.f15457f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: q */
    public final boolean mo19660q(Context context, Object obj, String str, int i, int i2, int i3, @ts2 FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f15454c.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: r */
    public final boolean mo19661r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f15455d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    public final boolean mo19662s(Object obj) {
        try {
            return ((Boolean) this.f15456e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public final boolean mo19663t() {
        if (this.f15454c == null) {
            Log.w(f15445f, "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f15454c != null;
    }

    /* renamed from: u */
    public Method mo19664u(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f15451l, new Class[0]);
    }

    /* renamed from: v */
    public Method mo19665v(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod(f15447h, new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* renamed from: w */
    public Method mo19666w(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod(f15448i, new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* renamed from: x */
    public Method mo19667x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: y */
    public Class<?> mo19668y() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: z */
    public Constructor<?> mo19669z(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }
}
