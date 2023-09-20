package com.onedelhi.secure;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* renamed from: com.onedelhi.secure.vs */
public abstract class C7077vs implements gx1, Serializable {
    @gz3(version = "1.1")

    /* renamed from: b */
    public static final Object f36654b = C7078a.f36661a;

    /* renamed from: a */
    public transient gx1 f36655a;
    @gz3(version = "1.4")

    /* renamed from: a */
    public final Class f36656a;
    @gz3(version = "1.1")

    /* renamed from: a */
    public final Object f36657a;
    @gz3(version = "1.4")

    /* renamed from: b */
    public final String f36658b;
    @gz3(version = "1.4")

    /* renamed from: b */
    public final boolean f36659b;
    @gz3(version = "1.4")

    /* renamed from: c */
    public final String f36660c;

    @gz3(version = "1.2")
    /* renamed from: com.onedelhi.secure.vs$a */
    public static class C7078a implements Serializable {

        /* renamed from: a */
        public static final C7078a f36661a = new C7078a();

        /* renamed from: b */
        public final Object mo46322b() throws ObjectStreamException {
            return f36661a;
        }
    }

    public C7077vs() {
        this(f36654b);
    }

    @gz3(version = "1.1")
    public C7077vs(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    @gz3(version = "1.4")
    public C7077vs(Object obj, Class cls, String str, String str2, boolean z) {
        this.f36657a = obj;
        this.f36656a = cls;
        this.f36658b = str;
        this.f36660c = str2;
        this.f36659b = z;
    }

    /* renamed from: A0 */
    public abstract gx1 mo31435A0();

    @gz3(version = "1.1")
    /* renamed from: B0 */
    public Object mo46319B0() {
        return this.f36657a;
    }

    /* renamed from: C0 */
    public lx1 mo40700C0() {
        Class cls = this.f36656a;
        if (cls == null) {
            return null;
        }
        return this.f36659b ? ah3.m38684g(cls) : ah3.m38681d(cls);
    }

    @gz3(version = "1.1")
    /* renamed from: D0 */
    public gx1 mo31550D0() {
        gx1 z0 = mo46321z0();
        if (z0 != this) {
            return z0;
        }
        throw new e02();
    }

    /* renamed from: E0 */
    public String mo46320E0() {
        return this.f36660c;
    }

    /* renamed from: L */
    public Object mo36965L(Object... objArr) {
        return mo31550D0().mo36965L(objArr);
    }

    /* renamed from: P */
    public Object mo36966P(Map map) {
        return mo31550D0().mo36966P(map);
    }

    /* renamed from: T */
    public List<zx1> mo36967T() {
        return mo31550D0().mo36967T();
    }

    @gz3(version = "1.1")
    /* renamed from: b */
    public List<gy1> mo36968b() {
        return mo31550D0().mo36968b();
    }

    @gz3(version = "1.1")
    /* renamed from: c */
    public jy1 mo36969c() {
        return mo31550D0().mo36969c();
    }

    @gz3(version = "1.1")
    /* renamed from: d */
    public boolean mo36970d() {
        return mo31550D0().mo36970d();
    }

    @gz3(version = "1.1")
    /* renamed from: f */
    public boolean mo36971f() {
        return mo31550D0().mo36971f();
    }

    @gz3(version = "1.3")
    /* renamed from: g */
    public boolean mo36683g() {
        return mo31550D0().mo36683g();
    }

    public String getName() {
        return this.f36658b;
    }

    @gz3(version = "1.1")
    public boolean isOpen() {
        return mo31550D0().isOpen();
    }

    /* renamed from: l */
    public List<Annotation> mo36334l() {
        return mo31550D0().mo36334l();
    }

    /* renamed from: n0 */
    public ey1 mo36974n0() {
        return mo31550D0().mo36974n0();
    }

    @gz3(version = "1.1")
    /* renamed from: z0 */
    public gx1 mo46321z0() {
        gx1 gx1 = this.f36655a;
        if (gx1 != null) {
            return gx1;
        }
        gx1 A0 = mo31435A0();
        this.f36655a = A0;
        return A0;
    }
}
