package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import com.onedelhi.secure.aa1;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.z91;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class ok4 {

    /* renamed from: a */
    public static final int f17994a = 0;

    /* renamed from: a */
    public static final String f17995a = "TypefaceCompatBaseImpl";
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    public ConcurrentHashMap<Long, z91.C4053d> f17996a = new ConcurrentHashMap<>();

    /* renamed from: com.onedelhi.secure.ok4$a */
    public class C3070a implements C3072c<aa1.C1675c> {
        public C3070a() {
        }

        /* renamed from: c */
        public int mo21968a(aa1.C1675c cVar) {
            return cVar.mo12879e();
        }

        /* renamed from: d */
        public boolean mo21969b(aa1.C1675c cVar) {
            return cVar.mo12880f();
        }
    }

    /* renamed from: com.onedelhi.secure.ok4$b */
    public class C3071b implements C3072c<z91.C4054e> {
        public C3071b() {
        }

        /* renamed from: c */
        public int mo21968a(z91.C4054e eVar) {
            return eVar.mo27848e();
        }

        /* renamed from: d */
        public boolean mo21969b(z91.C4054e eVar) {
            return eVar.mo27849f();
        }
    }

    /* renamed from: com.onedelhi.secure.ok4$c */
    public interface C3072c<T> {
        /* renamed from: a */
        int mo21968a(T t);

        /* renamed from: b */
        boolean mo21969b(T t);
    }

    /* renamed from: g */
    public static <T> T m23842g(T[] tArr, int i, C3072c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo21968a(t2) - i2) * 2) + (cVar.mo21969b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: j */
    public static long m23843j(@ts2 Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e(f17995a, "Could not retrieve font from family.", e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e(f17995a, "Could not retrieve font from family.", e2);
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo21965a(Typeface typeface, z91.C4053d dVar) {
        long j = m23843j(typeface);
        if (j != 0) {
            this.f17996a.put(Long.valueOf(j), dVar);
        }
    }

    @ts2
    /* renamed from: b */
    public Typeface mo18465b(Context context, z91.C4053d dVar, Resources resources, int i) {
        z91.C4054e f = mo21966f(dVar, i);
        if (f == null) {
            return null;
        }
        Typeface g = ik4.m17655g(context, resources, f.mo27845b(), f.mo27844a(), 0, i);
        mo21965a(g, dVar);
        return g;
    }

    @ts2
    /* renamed from: c */
    public Typeface mo18466c(Context context, @ts2 CancellationSignal cancellationSignal, @mr2 aa1.C1675c[] cVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (cVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo21351h(cVarArr, i).mo12878d());
            try {
                Typeface d = mo21350d(context, inputStream);
                pk4.m24790a(inputStream);
                return d;
            } catch (IOException unused) {
                pk4.m24790a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                pk4.m24790a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            pk4.m24790a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            pk4.m24790a(inputStream2);
            throw th;
        }
    }

    /* renamed from: d */
    public Typeface mo21350d(Context context, InputStream inputStream) {
        File e = pk4.m24794e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!pk4.m24793d(e, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    @ts2
    /* renamed from: e */
    public Typeface mo19657e(Context context, Resources resources, int i, String str, int i2) {
        File e = pk4.m24794e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!pk4.m24792c(e, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* renamed from: f */
    public final z91.C4054e mo21966f(z91.C4053d dVar, int i) {
        return (z91.C4054e) m23842g(dVar.mo27843a(), i, new C3071b());
    }

    /* renamed from: h */
    public aa1.C1675c mo21351h(aa1.C1675c[] cVarArr, int i) {
        return (aa1.C1675c) m23842g(cVarArr, i, new C3070a());
    }

    @ts2
    /* renamed from: i */
    public z91.C4053d mo21967i(Typeface typeface) {
        long j = m23843j(typeface);
        if (j == 0) {
            return null;
        }
        return this.f17996a.get(Long.valueOf(j));
    }
}
