package com.google.gson.internal.bind;

import com.google.gson.internal.Excluder;
import com.onedelhi.secure.C4602b;
import com.onedelhi.secure.c21;
import com.onedelhi.secure.ch3;
import com.onedelhi.secure.cj4;
import com.onedelhi.secure.dj4;
import com.onedelhi.secure.ew1;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.fv1;
import com.onedelhi.secure.fw1;
import com.onedelhi.secure.jt2;
import com.onedelhi.secure.lw1;
import com.onedelhi.secure.nu3;
import com.onedelhi.secure.r60;
import com.onedelhi.secure.tj4;
import com.onedelhi.secure.xv1;
import com.onedelhi.secure.z43;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements dj4 {

    /* renamed from: a */
    public final Excluder f25468a;

    /* renamed from: a */
    public final JsonAdapterAnnotationTypeAdapterFactory f25469a;

    /* renamed from: a */
    public final c21 f25470a;

    /* renamed from: a */
    public final r60 f25471a;

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a */
    public class C4392a extends C4394c {

        /* renamed from: a */
        public final /* synthetic */ cj4 f25473a;

        /* renamed from: a */
        public final /* synthetic */ fj1 f25474a;

        /* renamed from: a */
        public final /* synthetic */ tj4 f25475a;

        /* renamed from: a */
        public final /* synthetic */ Field f25476a;

        /* renamed from: c */
        public final /* synthetic */ boolean f25477c;

        /* renamed from: d */
        public final /* synthetic */ boolean f25478d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4392a(String str, boolean z, boolean z2, Field field, boolean z3, cj4 cj4, fj1 fj1, tj4 tj4, boolean z4) {
            super(str, z, z2);
            this.f25476a = field;
            this.f25477c = z3;
            this.f25473a = cj4;
            this.f25474a = fj1;
            this.f25475a = tj4;
            this.f25478d = z4;
        }

        /* renamed from: a */
        public void mo30163a(xv1 xv1, Object obj) throws IOException, IllegalAccessException {
            Object e = this.f25473a.mo30144e(xv1);
            if (e != null || !this.f25478d) {
                this.f25476a.set(obj, e);
            }
        }

        /* renamed from: b */
        public void mo30164b(lw1 lw1, Object obj) throws IOException, IllegalAccessException {
            (this.f25477c ? this.f25473a : new C4435a(this.f25474a, this.f25473a, this.f25475a.getType())).mo30145i(lw1, this.f25476a.get(obj));
        }

        /* renamed from: c */
        public boolean mo30165c(Object obj) throws IOException, IllegalAccessException {
            return this.f25482a && this.f25476a.get(obj) != obj;
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b */
    public static final class C4393b<T> extends cj4<T> {

        /* renamed from: a */
        public final jt2<T> f25479a;

        /* renamed from: a */
        public final Map<String, C4394c> f25480a;

        public C4393b(jt2<T> jt2, Map<String, C4394c> map) {
            this.f25479a = jt2;
            this.f25480a = map;
        }

        /* renamed from: e */
        public T mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() == fw1.NULL) {
                xv1.mo36940j0();
                return null;
            }
            T a = this.f25479a.mo38879a();
            try {
                xv1.mo36930b();
                while (xv1.mo36922A()) {
                    C4394c cVar = this.f25480a.get(xv1.mo36932c0());
                    if (cVar != null) {
                        if (cVar.f25483b) {
                            cVar.mo30163a(xv1, a);
                        }
                    }
                    xv1.mo36924R0();
                }
                xv1.mo36941l();
                return a;
            } catch (IllegalStateException e) {
                throw new ew1((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: i */
        public void mo30145i(lw1 lw1, T t) throws IOException {
            if (t == null) {
                lw1.mo37582M();
                return;
            }
            lw1.mo37589d();
            try {
                for (C4394c next : this.f25480a.values()) {
                    if (next.mo30165c(t)) {
                        lw1.mo37581H(next.f25481a);
                        next.mo30164b(lw1, t);
                    }
                }
                lw1.mo37592l();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$c */
    public static abstract class C4394c {

        /* renamed from: a */
        public final String f25481a;

        /* renamed from: a */
        public final boolean f25482a;

        /* renamed from: b */
        public final boolean f25483b;

        public C4394c(String str, boolean z, boolean z2) {
            this.f25481a = str;
            this.f25482a = z;
            this.f25483b = z2;
        }

        /* renamed from: a */
        public abstract void mo30163a(xv1 xv1, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: b */
        public abstract void mo30164b(lw1 lw1, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: c */
        public abstract boolean mo30165c(Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(r60 r60, c21 c21, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f25471a = r60;
        this.f25470a = c21;
        this.f25468a = excluder;
        this.f25469a = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* renamed from: d */
    public static boolean m35339d(Field field, boolean z, Excluder excluder) {
        return !excluder.mo30130d(field.getType(), z) && !excluder.mo30133g(field, z);
    }

    /* renamed from: a */
    public <T> cj4<T> mo30126a(fj1 fj1, tj4<T> tj4) {
        Class<? super T> rawType = tj4.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        return new C4393b(this.f25471a.mo43820a(tj4), mo30161e(fj1, tj4, rawType));
    }

    /* renamed from: b */
    public final C4394c mo30159b(fj1 fj1, Field field, String str, tj4<?> tj4, boolean z, boolean z2) {
        fj1 fj12 = fj1;
        tj4<?> tj42 = tj4;
        boolean a = z43.m72546a(tj4.getRawType());
        Field field2 = field;
        fv1 fv1 = (fv1) field.getAnnotation(fv1.class);
        cj4<?> b = fv1 != null ? this.f25469a.mo30152b(this.f25471a, fj1, tj42, fv1) : null;
        boolean z3 = b != null;
        if (b == null) {
            b = fj1.mo36014p(tj42);
        }
        return new C4392a(str, z, z2, field, z3, b, fj1, tj4, a);
    }

    /* renamed from: c */
    public boolean mo30160c(Field field, boolean z) {
        return m35339d(field, z, this.f25468a);
    }

    /* renamed from: e */
    public final Map<String, C4394c> mo30161e(fj1 fj1, tj4<?> tj4, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = tj4.getType();
        tj4<?> tj42 = tj4;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean c = mo30160c(field, true);
                boolean c2 = mo30160c(field, z);
                if (c || c2) {
                    ch3.m40966b(field);
                    Type p = C4602b.m39229p(tj42.getType(), cls2, field.getGenericType());
                    List<String> f = mo30162f(field);
                    int size = f.size();
                    C4394c cVar = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = f.get(i2);
                        boolean z2 = i2 != 0 ? false : c;
                        String str2 = str;
                        int i3 = i2;
                        C4394c cVar2 = cVar;
                        int i4 = size;
                        List<String> list = f;
                        Field field2 = field;
                        cVar = cVar2 == null ? (C4394c) linkedHashMap.put(str2, mo30159b(fj1, field, str2, tj4.get(p), z2, c2)) : cVar2;
                        i2 = i3 + 1;
                        c = z2;
                        f = list;
                        size = i4;
                        field = field2;
                    }
                    C4394c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + cVar3.f25481a);
                    }
                }
                i++;
                z = false;
            }
            tj42 = tj4.get(C4602b.m39229p(tj42.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = tj42.getRawType();
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    public final List<String> mo30162f(Field field) {
        nu3 nu3 = (nu3) field.getAnnotation(nu3.class);
        if (nu3 == null) {
            return Collections.singletonList(this.f25470a.mo31347a(field));
        }
        String value = nu3.value();
        String[] alternate = nu3.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
