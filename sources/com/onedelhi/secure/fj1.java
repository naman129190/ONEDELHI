package com.onedelhi.secure;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.onedelhi.secure.yg1;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class fj1 {

    /* renamed from: a */
    public static final tj4<?> f28518a = tj4.get(Object.class);

    /* renamed from: b */
    public static final c21 f28519b = b21.IDENTITY;

    /* renamed from: b */
    public static final String f28520b = null;

    /* renamed from: c */
    public static final hf4 f28521c = gf4.DOUBLE;

    /* renamed from: c */
    public static final String f28522c = ")]}'\n";

    /* renamed from: d */
    public static final hf4 f28523d = gf4.LAZILY_PARSED_NUMBER;

    /* renamed from: i */
    public static final boolean f28524i = false;

    /* renamed from: j */
    public static final boolean f28525j = false;

    /* renamed from: k */
    public static final boolean f28526k = false;

    /* renamed from: l */
    public static final boolean f28527l = true;

    /* renamed from: m */
    public static final boolean f28528m = false;

    /* renamed from: n */
    public static final boolean f28529n = false;

    /* renamed from: o */
    public static final boolean f28530o = false;

    /* renamed from: p */
    public static final boolean f28531p = true;

    /* renamed from: a */
    public final int f28532a;

    /* renamed from: a */
    public final Excluder f28533a;

    /* renamed from: a */
    public final JsonAdapterAnnotationTypeAdapterFactory f28534a;

    /* renamed from: a */
    public final c21 f28535a;

    /* renamed from: a */
    public final fa2 f28536a;

    /* renamed from: a */
    public final hf4 f28537a;

    /* renamed from: a */
    public final r60 f28538a;

    /* renamed from: a */
    public final String f28539a;

    /* renamed from: a */
    public final ThreadLocal<Map<tj4<?>, C5280f<?>>> f28540a;

    /* renamed from: a */
    public final List<dj4> f28541a;

    /* renamed from: a */
    public final Map<tj4<?>, cj4<?>> f28542a;

    /* renamed from: a */
    public final boolean f28543a;

    /* renamed from: b */
    public final int f28544b;

    /* renamed from: b */
    public final hf4 f28545b;

    /* renamed from: b */
    public final List<dj4> f28546b;

    /* renamed from: b */
    public final Map<Type, mr1<?>> f28547b;

    /* renamed from: b */
    public final boolean f28548b;

    /* renamed from: c */
    public final List<dj4> f28549c;

    /* renamed from: c */
    public final boolean f28550c;

    /* renamed from: d */
    public final boolean f28551d;

    /* renamed from: e */
    public final boolean f28552e;

    /* renamed from: f */
    public final boolean f28553f;

    /* renamed from: g */
    public final boolean f28554g;

    /* renamed from: h */
    public final boolean f28555h;

    /* renamed from: com.onedelhi.secure.fj1$a */
    public class C5275a extends cj4<Number> {
        public C5275a() {
        }

        /* renamed from: j */
        public Double mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() != fw1.NULL) {
                return Double.valueOf(xv1.mo36926X());
            }
            xv1.mo36940j0();
            return null;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, Number number) throws IOException {
            if (number == null) {
                lw1.mo37582M();
                return;
            }
            fj1.m47930d(number.doubleValue());
            lw1.mo37579F0(number);
        }
    }

    /* renamed from: com.onedelhi.secure.fj1$b */
    public class C5276b extends cj4<Number> {
        public C5276b() {
        }

        /* renamed from: j */
        public Float mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() != fw1.NULL) {
                return Float.valueOf((float) xv1.mo36926X());
            }
            xv1.mo36940j0();
            return null;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, Number number) throws IOException {
            if (number == null) {
                lw1.mo37582M();
                return;
            }
            fj1.m47930d((double) number.floatValue());
            lw1.mo37579F0(number);
        }
    }

    /* renamed from: com.onedelhi.secure.fj1$c */
    public class C5277c extends cj4<Number> {
        /* renamed from: j */
        public Number mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() != fw1.NULL) {
                return Long.valueOf(xv1.mo36928Z());
            }
            xv1.mo36940j0();
            return null;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, Number number) throws IOException {
            if (number == null) {
                lw1.mo37582M();
            } else {
                lw1.mo37580G0(number.toString());
            }
        }
    }

    /* renamed from: com.onedelhi.secure.fj1$d */
    public class C5278d extends cj4<AtomicLong> {

        /* renamed from: a */
        public final /* synthetic */ cj4 f28558a;

        public C5278d(cj4 cj4) {
            this.f28558a = cj4;
        }

        /* renamed from: j */
        public AtomicLong mo30144e(xv1 xv1) throws IOException {
            return new AtomicLong(((Number) this.f28558a.mo30144e(xv1)).longValue());
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, AtomicLong atomicLong) throws IOException {
            this.f28558a.mo30145i(lw1, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: com.onedelhi.secure.fj1$e */
    public class C5279e extends cj4<AtomicLongArray> {

        /* renamed from: a */
        public final /* synthetic */ cj4 f28559a;

        public C5279e(cj4 cj4) {
            this.f28559a = cj4;
        }

        /* renamed from: j */
        public AtomicLongArray mo30144e(xv1 xv1) throws IOException {
            ArrayList arrayList = new ArrayList();
            xv1.mo36929a();
            while (xv1.mo36922A()) {
                arrayList.add(Long.valueOf(((Number) this.f28559a.mo30144e(xv1)).longValue()));
            }
            xv1.mo36937h();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, AtomicLongArray atomicLongArray) throws IOException {
            lw1.mo37587c();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f28559a.mo30145i(lw1, Long.valueOf(atomicLongArray.get(i)));
            }
            lw1.mo37591h();
        }
    }

    /* renamed from: com.onedelhi.secure.fj1$f */
    public static class C5280f<T> extends cj4<T> {

        /* renamed from: a */
        public cj4<T> f28560a;

        /* renamed from: e */
        public T mo30144e(xv1 xv1) throws IOException {
            cj4<T> cj4 = this.f28560a;
            if (cj4 != null) {
                return cj4.mo30144e(xv1);
            }
            throw new IllegalStateException();
        }

        /* renamed from: i */
        public void mo30145i(lw1 lw1, T t) throws IOException {
            cj4<T> cj4 = this.f28560a;
            if (cj4 != null) {
                cj4.mo30145i(lw1, t);
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: j */
        public void mo36035j(cj4<T> cj4) {
            if (this.f28560a == null) {
                this.f28560a = cj4;
                return;
            }
            throw new AssertionError();
        }
    }

    public fj1() {
        this(Excluder.f25430a, f28519b, Collections.emptyMap(), false, false, false, true, false, false, false, true, fa2.DEFAULT, f28520b, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f28521c, f28523d);
    }

    public fj1(Excluder excluder, c21 c21, Map<Type, mr1<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, fa2 fa2, String str, int i, int i2, List<dj4> list, List<dj4> list2, List<dj4> list3, hf4 hf4, hf4 hf42) {
        boolean z9 = z2;
        boolean z10 = z7;
        boolean z11 = z8;
        this.f28540a = new ThreadLocal<>();
        this.f28542a = new ConcurrentHashMap();
        this.f28533a = excluder;
        this.f28535a = c21;
        this.f28547b = map;
        r60 r60 = new r60(map, z11);
        this.f28538a = r60;
        this.f28543a = z;
        this.f28548b = z9;
        this.f28550c = z3;
        this.f28551d = z4;
        this.f28552e = z5;
        this.f28553f = z6;
        this.f28554g = z10;
        this.f28555h = z11;
        this.f28536a = fa2;
        this.f28539a = str;
        this.f28532a = i;
        this.f28544b = i2;
        this.f28546b = list;
        this.f28549c = list2;
        this.f28537a = hf4;
        this.f28545b = hf42;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f25540u);
        arrayList.add(ObjectTypeAdapter.m35334j(hf4));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f25520k);
        arrayList.add(TypeAdapters.f25510f);
        arrayList.add(TypeAdapters.f25504c);
        arrayList.add(TypeAdapters.f25506d);
        arrayList.add(TypeAdapters.f25508e);
        cj4<Number> t = m47931t(fa2);
        arrayList.add(TypeAdapters.m35365c(Long.TYPE, Long.class, t));
        arrayList.add(TypeAdapters.m35365c(Double.TYPE, Double.class, mo36003e(z10)));
        arrayList.add(TypeAdapters.m35365c(Float.TYPE, Float.class, mo36006h(z10)));
        arrayList.add(NumberTypeAdapter.m35327j(hf42));
        arrayList.add(TypeAdapters.f25512g);
        arrayList.add(TypeAdapters.f25514h);
        arrayList.add(TypeAdapters.m35364b(AtomicLong.class, m47928b(t)));
        arrayList.add(TypeAdapters.m35364b(AtomicLongArray.class, m47929c(t)));
        arrayList.add(TypeAdapters.f25516i);
        arrayList.add(TypeAdapters.f25518j);
        arrayList.add(TypeAdapters.f25522l);
        arrayList.add(TypeAdapters.f25524m);
        arrayList.add(TypeAdapters.m35364b(BigDecimal.class, TypeAdapters.f25529p));
        arrayList.add(TypeAdapters.m35364b(BigInteger.class, TypeAdapters.f25531q));
        arrayList.add(TypeAdapters.m35364b(t12.class, TypeAdapters.f25533r));
        arrayList.add(TypeAdapters.f25526n);
        arrayList.add(TypeAdapters.f25528o);
        arrayList.add(TypeAdapters.f25532q);
        arrayList.add(TypeAdapters.f25534r);
        arrayList.add(TypeAdapters.f25538t);
        arrayList.add(TypeAdapters.f25530p);
        arrayList.add(TypeAdapters.f25502b);
        arrayList.add(DateTypeAdapter.f25450a);
        arrayList.add(TypeAdapters.f25536s);
        if (e24.f27677a) {
            arrayList.add(e24.f27678b);
            arrayList.add(e24.f27675a);
            arrayList.add(e24.f27680c);
        }
        arrayList.add(ArrayTypeAdapter.f25444a);
        arrayList.add(TypeAdapters.f25500a);
        arrayList.add(new CollectionTypeAdapterFactory(r60));
        arrayList.add(new MapTypeAdapterFactory(r60, z9));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(r60);
        this.f28534a = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f25542v);
        arrayList.add(new ReflectiveTypeAdapterFactory(r60, c21, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f28541a = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m47927a(Object obj, xv1 xv1) {
        if (obj != null) {
            try {
                if (xv1.mo36944q0() != fw1.END_DOCUMENT) {
                    throw new qv1("JSON document was not fully consumed.");
                }
            } catch (cc2 e) {
                throw new ew1((Throwable) e);
            } catch (IOException e2) {
                throw new qv1((Throwable) e2);
            }
        }
    }

    /* renamed from: b */
    public static cj4<AtomicLong> m47928b(cj4<Number> cj4) {
        return new C5278d(cj4).mo32407d();
    }

    /* renamed from: c */
    public static cj4<AtomicLongArray> m47929c(cj4<Number> cj4) {
        return new C5279e(cj4).mo32407d();
    }

    /* renamed from: d */
    public static void m47930d(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: t */
    public static cj4<Number> m47931t(fa2 fa2) {
        return fa2 == fa2.DEFAULT ? TypeAdapters.f25519k : new C5277c();
    }

    /* renamed from: A */
    public String mo35995A(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        mo36000F(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: B */
    public void mo35996B(ov1 ov1, lw1 lw1) throws qv1 {
        boolean q = lw1.mo40304q();
        lw1.mo40299l0(true);
        boolean p = lw1.mo40302p();
        lw1.mo40296e0(this.f28551d);
        boolean m = lw1.mo40300m();
        lw1.mo40301o0(this.f28543a);
        try {
            m44.m56910b(ov1, lw1);
            lw1.mo40299l0(q);
            lw1.mo40296e0(p);
            lw1.mo40301o0(m);
        } catch (IOException e) {
            throw new qv1((Throwable) e);
        } catch (AssertionError e2) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e2.getMessage());
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            lw1.mo40299l0(q);
            lw1.mo40296e0(p);
            lw1.mo40301o0(m);
            throw th;
        }
    }

    /* renamed from: C */
    public void mo35997C(ov1 ov1, Appendable appendable) throws qv1 {
        try {
            mo35996B(ov1, mo36021w(m44.m56911c(appendable)));
        } catch (IOException e) {
            throw new qv1((Throwable) e);
        }
    }

    /* renamed from: D */
    public void mo35998D(Object obj, Appendable appendable) throws qv1 {
        if (obj != null) {
            mo36000F(obj, obj.getClass(), appendable);
        } else {
            mo35997C(rv1.f34755a, appendable);
        }
    }

    /* renamed from: E */
    public void mo35999E(Object obj, Type type, lw1 lw1) throws qv1 {
        cj4<?> p = mo36014p(tj4.get(type));
        boolean q = lw1.mo40304q();
        lw1.mo40299l0(true);
        boolean p2 = lw1.mo40302p();
        lw1.mo40296e0(this.f28551d);
        boolean m = lw1.mo40300m();
        lw1.mo40301o0(this.f28543a);
        try {
            p.mo30145i(lw1, obj);
            lw1.mo40299l0(q);
            lw1.mo40296e0(p2);
            lw1.mo40301o0(m);
        } catch (IOException e) {
            throw new qv1((Throwable) e);
        } catch (AssertionError e2) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e2.getMessage());
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            lw1.mo40299l0(q);
            lw1.mo40296e0(p2);
            lw1.mo40301o0(m);
            throw th;
        }
    }

    /* renamed from: F */
    public void mo36000F(Object obj, Type type, Appendable appendable) throws qv1 {
        try {
            mo35999E(obj, type, mo36021w(m44.m56911c(appendable)));
        } catch (IOException e) {
            throw new qv1((Throwable) e);
        }
    }

    /* renamed from: G */
    public ov1 mo36001G(Object obj) {
        return obj == null ? rv1.f34755a : mo36002H(obj, obj.getClass());
    }

    /* renamed from: H */
    public ov1 mo36002H(Object obj, Type type) {
        hw1 hw1 = new hw1();
        mo35999E(obj, type, hw1);
        return hw1.mo37584O0();
    }

    /* renamed from: e */
    public final cj4<Number> mo36003e(boolean z) {
        return z ? TypeAdapters.f25523m : new C5275a();
    }

    @Deprecated
    /* renamed from: f */
    public Excluder mo36004f() {
        return this.f28533a;
    }

    /* renamed from: g */
    public c21 mo36005g() {
        return this.f28535a;
    }

    /* renamed from: h */
    public final cj4<Number> mo36006h(boolean z) {
        return z ? TypeAdapters.f25521l : new C5276b();
    }

    /* renamed from: i */
    public <T> T mo36007i(ov1 ov1, Class<T> cls) throws ew1 {
        return z43.m72549d(cls).cast(mo36008j(ov1, cls));
    }

    /* renamed from: j */
    public <T> T mo36008j(ov1 ov1, Type type) throws ew1 {
        if (ov1 == null) {
            return null;
        }
        return mo36009k(new gw1(ov1), type);
    }

    /* renamed from: k */
    public <T> T mo36009k(xv1 xv1, Type type) throws qv1, ew1 {
        boolean E = xv1.mo47399E();
        xv1.mo47404M0(true);
        try {
            xv1.mo36944q0();
            T e = mo36014p(tj4.get(type)).mo30144e(xv1);
            xv1.mo47404M0(E);
            return e;
        } catch (EOFException e2) {
            if (1 != 0) {
                xv1.mo47404M0(E);
                return null;
            }
            throw new ew1((Throwable) e2);
        } catch (IllegalStateException e3) {
            throw new ew1((Throwable) e3);
        } catch (IOException e4) {
            throw new ew1((Throwable) e4);
        } catch (AssertionError e5) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e5.getMessage());
            assertionError.initCause(e5);
            throw assertionError;
        } catch (Throwable th) {
            xv1.mo47404M0(E);
            throw th;
        }
    }

    /* renamed from: l */
    public <T> T mo36010l(Reader reader, Class<T> cls) throws ew1, qv1 {
        xv1 v = mo36020v(reader);
        T k = mo36009k(v, cls);
        m47927a(k, v);
        return z43.m72549d(cls).cast(k);
    }

    /* renamed from: m */
    public <T> T mo36011m(Reader reader, Type type) throws qv1, ew1 {
        xv1 v = mo36020v(reader);
        T k = mo36009k(v, type);
        m47927a(k, v);
        return k;
    }

    /* renamed from: n */
    public <T> T mo36012n(String str, Class<T> cls) throws ew1 {
        return z43.m72549d(cls).cast(mo36013o(str, cls));
    }

    /* renamed from: o */
    public <T> T mo36013o(String str, Type type) throws ew1 {
        if (str == null) {
            return null;
        }
        return mo36011m(new StringReader(str), type);
    }

    /* renamed from: p */
    public <T> cj4<T> mo36014p(tj4<T> tj4) {
        cj4<T> cj4 = this.f28542a.get(tj4 == null ? f28518a : tj4);
        if (cj4 != null) {
            return cj4;
        }
        Map map = this.f28540a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.f28540a.set(map);
            z = true;
        }
        C5280f fVar = (C5280f) map.get(tj4);
        if (fVar != null) {
            return fVar;
        }
        try {
            C5280f fVar2 = new C5280f();
            map.put(tj4, fVar2);
            for (dj4 a : this.f28541a) {
                cj4<T> a2 = a.mo30126a(this, tj4);
                if (a2 != null) {
                    fVar2.mo36035j(a2);
                    this.f28542a.put(tj4, a2);
                    return a2;
                }
            }
            throw new IllegalArgumentException("GSON (2.9.0) cannot handle " + tj4);
        } finally {
            map.remove(tj4);
            if (z) {
                this.f28540a.remove();
            }
        }
    }

    /* renamed from: q */
    public <T> cj4<T> mo36015q(Class<T> cls) {
        return mo36014p(tj4.get(cls));
    }

    /* renamed from: r */
    public <T> cj4<T> mo36016r(dj4 dj4, tj4<T> tj4) {
        if (!this.f28541a.contains(dj4)) {
            dj4 = this.f28534a;
        }
        boolean z = false;
        for (dj4 next : this.f28541a) {
            if (z) {
                cj4<T> a = next.mo30126a(this, tj4);
                if (a != null) {
                    return a;
                }
            } else if (next == dj4) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + tj4);
    }

    /* renamed from: s */
    public boolean mo36017s() {
        return this.f28551d;
    }

    public String toString() {
        return "{serializeNulls:" + this.f28543a + ",factories:" + this.f28541a + ",instanceCreators:" + this.f28538a + "}";
    }

    /* renamed from: u */
    public hj1 mo36019u() {
        return new hj1(this);
    }

    /* renamed from: v */
    public xv1 mo36020v(Reader reader) {
        xv1 xv1 = new xv1(reader);
        xv1.mo47404M0(this.f28553f);
        return xv1;
    }

    /* renamed from: w */
    public lw1 mo36021w(Writer writer) throws IOException {
        if (this.f28550c) {
            writer.write(f28522c);
        }
        lw1 lw1 = new lw1(writer);
        if (this.f28552e) {
            lw1.mo40298j0(yg1.C3999a.f23084c);
        }
        lw1.mo40296e0(this.f28551d);
        lw1.mo40299l0(this.f28553f);
        lw1.mo40301o0(this.f28543a);
        return lw1;
    }

    /* renamed from: x */
    public boolean mo36022x() {
        return this.f28543a;
    }

    /* renamed from: y */
    public String mo36023y(ov1 ov1) {
        StringWriter stringWriter = new StringWriter();
        mo35997C(ov1, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: z */
    public String mo36024z(Object obj) {
        return obj == null ? mo36023y(rv1.f34755a) : mo35995A(obj, obj.getClass());
    }
}
