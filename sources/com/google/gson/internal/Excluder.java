package com.google.gson.internal;

import com.onedelhi.secure.cj4;
import com.onedelhi.secure.dj4;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.fz3;
import com.onedelhi.secure.lw1;
import com.onedelhi.secure.po4;
import com.onedelhi.secure.qy0;
import com.onedelhi.secure.s11;
import com.onedelhi.secure.tj4;
import com.onedelhi.secure.uw0;
import com.onedelhi.secure.xv1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Excluder implements dj4, Cloneable {

    /* renamed from: a */
    public static final Excluder f25430a = new Excluder();

    /* renamed from: b */
    public static final double f25431b = -1.0d;

    /* renamed from: a */
    public double f25432a = -1.0d;

    /* renamed from: a */
    public List<uw0> f25433a = Collections.emptyList();

    /* renamed from: b */
    public List<uw0> f25434b = Collections.emptyList();

    /* renamed from: b */
    public boolean f25435b = true;

    /* renamed from: c */
    public boolean f25436c;

    /* renamed from: n */
    public int f25437n = 136;

    /* renamed from: com.google.gson.internal.Excluder$a */
    public class C4383a extends cj4<T> {

        /* renamed from: a */
        public cj4<T> f25439a;

        /* renamed from: a */
        public final /* synthetic */ fj1 f25440a;

        /* renamed from: a */
        public final /* synthetic */ tj4 f25441a;

        /* renamed from: a */
        public final /* synthetic */ boolean f25442a;

        /* renamed from: b */
        public final /* synthetic */ boolean f25443b;

        public C4383a(boolean z, boolean z2, fj1 fj1, tj4 tj4) {
            this.f25442a = z;
            this.f25443b = z2;
            this.f25440a = fj1;
            this.f25441a = tj4;
        }

        /* renamed from: e */
        public T mo30144e(xv1 xv1) throws IOException {
            if (!this.f25442a) {
                return mo30146j().mo30144e(xv1);
            }
            xv1.mo36924R0();
            return null;
        }

        /* renamed from: i */
        public void mo30145i(lw1 lw1, T t) throws IOException {
            if (this.f25443b) {
                lw1.mo37582M();
            } else {
                mo30146j().mo30145i(lw1, t);
            }
        }

        /* renamed from: j */
        public final cj4<T> mo30146j() {
            cj4<T> cj4 = this.f25439a;
            if (cj4 != null) {
                return cj4;
            }
            cj4<T> r = this.f25440a.mo36016r(Excluder.this, this.f25441a);
            this.f25439a = r;
            return r;
        }
    }

    /* renamed from: a */
    public <T> cj4<T> mo30126a(fj1 fj1, tj4<T> tj4) {
        Class<? super T> rawType = tj4.getRawType();
        boolean e = mo30131e(rawType);
        boolean z = e || mo30132f(rawType, true);
        boolean z2 = e || mo30132f(rawType, false);
        if (z || z2) {
            return new C4383a(z2, z, fj1, tj4);
        }
        return null;
    }

    /* renamed from: b */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public Excluder mo30128c() {
        Excluder b = clone();
        b.f25435b = false;
        return b;
    }

    /* renamed from: d */
    public boolean mo30130d(Class<?> cls, boolean z) {
        return mo30131e(cls) || mo30132f(cls, z);
    }

    /* renamed from: e */
    public final boolean mo30131e(Class<?> cls) {
        if (this.f25432a == -1.0d || mo30140n((fz3) cls.getAnnotation(fz3.class), (po4) cls.getAnnotation(po4.class))) {
            return (!this.f25435b && mo30136j(cls)) || mo30135i(cls);
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30132f(Class<?> cls, boolean z) {
        for (uw0 a : z ? this.f25433a : this.f25434b) {
            if (a.mo45808a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo30133g(Field field, boolean z) {
        qy0 qy0;
        if ((this.f25437n & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f25432a != -1.0d && !mo30140n((fz3) field.getAnnotation(fz3.class), (po4) field.getAnnotation(po4.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f25436c && ((qy0 = (qy0) field.getAnnotation(qy0.class)) == null || (!z ? !qy0.deserialize() : !qy0.serialize()))) {
            return true;
        }
        if ((!this.f25435b && mo30136j(field.getType())) || mo30135i(field.getType())) {
            return true;
        }
        List<uw0> list = z ? this.f25433a : this.f25434b;
        if (list.isEmpty()) {
            return false;
        }
        s11 s11 = new s11(field);
        for (uw0 b : list) {
            if (b.mo45809b(s11)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public Excluder mo30134h() {
        Excluder b = clone();
        b.f25436c = true;
        return b;
    }

    /* renamed from: i */
    public final boolean mo30135i(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && !mo30137k(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: j */
    public final boolean mo30136j(Class<?> cls) {
        return cls.isMemberClass() && !mo30137k(cls);
    }

    /* renamed from: k */
    public final boolean mo30137k(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: l */
    public final boolean mo30138l(fz3 fz3) {
        return fz3 == null || fz3.value() <= this.f25432a;
    }

    /* renamed from: m */
    public final boolean mo30139m(po4 po4) {
        return po4 == null || po4.value() > this.f25432a;
    }

    /* renamed from: n */
    public final boolean mo30140n(fz3 fz3, po4 po4) {
        return mo30138l(fz3) && mo30139m(po4);
    }

    /* renamed from: o */
    public Excluder mo30141o(uw0 uw0, boolean z, boolean z2) {
        Excluder b = clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.f25433a);
            b.f25433a = arrayList;
            arrayList.add(uw0);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.f25434b);
            b.f25434b = arrayList2;
            arrayList2.add(uw0);
        }
        return b;
    }

    /* renamed from: p */
    public Excluder mo30142p(int... iArr) {
        Excluder b = clone();
        b.f25437n = 0;
        for (int i : iArr) {
            b.f25437n = i | b.f25437n;
        }
        return b;
    }

    /* renamed from: q */
    public Excluder mo30143q(double d) {
        Excluder b = clone();
        b.f25432a = d;
        return b;
    }
}
