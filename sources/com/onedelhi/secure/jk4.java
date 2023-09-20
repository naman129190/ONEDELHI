package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.onedelhi.secure.aa1;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.z91;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@sj3(21)
@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class jk4 extends ok4 {

    /* renamed from: a */
    public static Class<?> f14215a = null;

    /* renamed from: a */
    public static Constructor<?> f14216a = null;

    /* renamed from: a */
    public static Method f14217a = null;

    /* renamed from: a */
    public static boolean f14218a = false;

    /* renamed from: b */
    public static final String f14219b = "TypefaceCompatApi21Impl";

    /* renamed from: b */
    public static Method f14220b = null;

    /* renamed from: c */
    public static final String f14221c = "android.graphics.FontFamily";

    /* renamed from: d */
    public static final String f14222d = "addFontWeightStyle";

    /* renamed from: e */
    public static final String f14223e = "createFromFamiliesWithDefault";

    /* renamed from: k */
    public static boolean m18629k(Object obj, String str, int i, boolean z) {
        m18631n();
        try {
            return ((Boolean) f14217a.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    public static Typeface mo19658l(Object obj) {
        m18631n();
        try {
            Object newInstance = Array.newInstance(f14215a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f14220b.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: n */
    public static void m18631n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f14218a) {
            f14218a = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e(f14219b, e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f14216a = constructor;
            f14215a = cls;
            f14217a = method;
            f14220b = method2;
        }
    }

    /* renamed from: o */
    public static Object m18632o() {
        m18631n();
        try {
            return f14216a.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public Typeface mo18465b(Context context, z91.C4053d dVar, Resources resources, int i) {
        Object o = m18632o();
        z91.C4054e[] a = dVar.mo27843a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            z91.C4054e eVar = a[i2];
            File e = pk4.m24794e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!pk4.m24792c(e, resources, eVar.mo27845b())) {
                    e.delete();
                    return null;
                } else if (!m18629k(o, e.getPath(), eVar.mo27848e(), eVar.mo27849f())) {
                    return null;
                } else {
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e.delete();
            }
        }
        return mo19658l(o);
    }

    /* renamed from: c */
    public Typeface mo18466c(Context context, CancellationSignal cancellationSignal, @mr2 aa1.C1675c[] cVarArr, int i) {
        FileInputStream fileInputStream;
        if (cVarArr.length < 1) {
            return null;
        }
        aa1.C1675c h = mo21351h(cVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h.mo12878d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File m = mo18467m(openFileDescriptor);
                if (m != null) {
                    if (m.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(m);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface d = super.mo21350d(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return d;
            } catch (Throwable th) {
                openFileDescriptor.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* renamed from: m */
    public final File mo18467m(@mr2 ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
