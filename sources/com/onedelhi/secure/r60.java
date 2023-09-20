package com.onedelhi.secure;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class r60 {

    /* renamed from: a */
    public final Map<Type, mr1<?>> f34510a;

    /* renamed from: a */
    public final boolean f34511a;

    /* renamed from: com.onedelhi.secure.r60$a */
    public class C6638a implements jt2<T> {

        /* renamed from: a */
        public final /* synthetic */ Type f34513a;

        public C6638a(Type type) {
            this.f34513a = type;
        }

        /* renamed from: a */
        public T mo38879a() {
            Type type = this.f34513a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return new EnumMap((Class) type2);
                }
                throw new qv1("Invalid EnumMap type: " + this.f34513a.toString());
            }
            throw new qv1("Invalid EnumMap type: " + this.f34513a.toString());
        }
    }

    /* renamed from: com.onedelhi.secure.r60$b */
    public class C6639b implements jt2<T> {
        public C6639b() {
        }

        /* renamed from: a */
        public T mo38879a() {
            return new ConcurrentSkipListMap();
        }
    }

    /* renamed from: com.onedelhi.secure.r60$c */
    public class C6640c implements jt2<T> {
        public C6640c() {
        }

        /* renamed from: a */
        public T mo38879a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.onedelhi.secure.r60$d */
    public class C6641d implements jt2<T> {
        public C6641d() {
        }

        /* renamed from: a */
        public T mo38879a() {
            return new TreeMap();
        }
    }

    /* renamed from: com.onedelhi.secure.r60$e */
    public class C6642e implements jt2<T> {
        public C6642e() {
        }

        /* renamed from: a */
        public T mo38879a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.onedelhi.secure.r60$f */
    public class C6643f implements jt2<T> {
        public C6643f() {
        }

        /* renamed from: a */
        public T mo38879a() {
            return new t32();
        }
    }

    /* renamed from: com.onedelhi.secure.r60$g */
    public class C6644g implements jt2<T> {

        /* renamed from: a */
        public final ho4 f34519a = ho4.m50740b();

        /* renamed from: a */
        public final /* synthetic */ Class f34521a;

        public C6644g(Class cls) {
            this.f34521a = cls;
        }

        /* renamed from: a */
        public T mo38879a() {
            try {
                return this.f34519a.mo37487c(this.f34521a);
            } catch (Exception e) {
                throw new RuntimeException("Unable to create instance of " + this.f34521a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.r60$h */
    public class C6645h implements jt2<T> {

        /* renamed from: a */
        public final /* synthetic */ String f34523a;

        public C6645h(String str) {
            this.f34523a = str;
        }

        /* renamed from: a */
        public T mo38879a() {
            throw new qv1(this.f34523a);
        }
    }

    /* renamed from: com.onedelhi.secure.r60$i */
    public class C6646i implements jt2<T> {

        /* renamed from: a */
        public final /* synthetic */ mr1 f34524a;

        /* renamed from: a */
        public final /* synthetic */ Type f34526a;

        public C6646i(mr1 mr1, Type type) {
            this.f34524a = mr1;
            this.f34526a = type;
        }

        /* renamed from: a */
        public T mo38879a() {
            return this.f34524a.mo40746a(this.f34526a);
        }
    }

    /* renamed from: com.onedelhi.secure.r60$j */
    public class C6647j implements jt2<T> {

        /* renamed from: a */
        public final /* synthetic */ mr1 f34527a;

        /* renamed from: a */
        public final /* synthetic */ Type f34529a;

        public C6647j(mr1 mr1, Type type) {
            this.f34527a = mr1;
            this.f34529a = type;
        }

        /* renamed from: a */
        public T mo38879a() {
            return this.f34527a.mo40746a(this.f34529a);
        }
    }

    /* renamed from: com.onedelhi.secure.r60$k */
    public class C6648k implements jt2<T> {

        /* renamed from: a */
        public final /* synthetic */ String f34531a;

        public C6648k(String str) {
            this.f34531a = str;
        }

        /* renamed from: a */
        public T mo38879a() {
            throw new qv1(this.f34531a);
        }
    }

    /* renamed from: com.onedelhi.secure.r60$l */
    public class C6649l implements jt2<T> {

        /* renamed from: a */
        public final /* synthetic */ Constructor f34533a;

        public C6649l(Constructor constructor) {
            this.f34533a = constructor;
        }

        /* renamed from: a */
        public T mo38879a() {
            try {
                return this.f34533a.newInstance(new Object[0]);
            } catch (InstantiationException e) {
                throw new RuntimeException("Failed to invoke " + this.f34533a + " with no args", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to invoke " + this.f34533a + " with no args", e2.getTargetException());
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.r60$m */
    public class C6650m implements jt2<T> {
        public C6650m() {
        }

        /* renamed from: a */
        public T mo38879a() {
            return new TreeSet();
        }
    }

    /* renamed from: com.onedelhi.secure.r60$n */
    public class C6651n implements jt2<T> {

        /* renamed from: a */
        public final /* synthetic */ Type f34536a;

        public C6651n(Type type) {
            this.f34536a = type;
        }

        /* renamed from: a */
        public T mo38879a() {
            Type type = this.f34536a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new qv1("Invalid EnumSet type: " + this.f34536a.toString());
            }
            throw new qv1("Invalid EnumSet type: " + this.f34536a.toString());
        }
    }

    /* renamed from: com.onedelhi.secure.r60$o */
    public class C6652o implements jt2<T> {
        public C6652o() {
        }

        /* renamed from: a */
        public T mo38879a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.onedelhi.secure.r60$p */
    public class C6653p implements jt2<T> {
        public C6653p() {
        }

        /* renamed from: a */
        public T mo38879a() {
            return new ArrayDeque();
        }
    }

    /* renamed from: com.onedelhi.secure.r60$q */
    public class C6654q implements jt2<T> {
        public C6654q() {
        }

        /* renamed from: a */
        public T mo38879a() {
            return new ArrayList();
        }
    }

    public r60(Map<Type, mr1<?>> map, boolean z) {
        this.f34510a = map;
        this.f34511a = z;
    }

    /* renamed from: a */
    public <T> jt2<T> mo43820a(tj4<T> tj4) {
        Type type = tj4.getType();
        Class<? super T> rawType = tj4.getRawType();
        mr1 mr1 = this.f34510a.get(type);
        if (mr1 != null) {
            return new C6646i(mr1, type);
        }
        mr1 mr12 = this.f34510a.get(rawType);
        if (mr12 != null) {
            return new C6647j(mr12, type);
        }
        jt2<T> b = mo43821b(rawType);
        if (b != null) {
            return b;
        }
        jt2<T> c = mo43822c(type, rawType);
        return c != null ? c : mo43823d(rawType);
    }

    /* renamed from: b */
    public final <T> jt2<T> mo43821b(Class<? super T> cls) {
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            String c = ch3.m40967c(declaredConstructor);
            return c != null ? new C6648k(c) : new C6649l(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final <T> jt2<T> mo43822c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new C6650m() : EnumSet.class.isAssignableFrom(cls) ? new C6651n(type) : Set.class.isAssignableFrom(cls) ? new C6652o() : Queue.class.isAssignableFrom(cls) ? new C6653p() : new C6654q();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return cls == EnumMap.class ? new C6638a(type) : ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new C6639b() : ConcurrentMap.class.isAssignableFrom(cls) ? new C6640c() : SortedMap.class.isAssignableFrom(cls) ? new C6641d() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(tj4.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new C6643f() : new C6642e();
        }
        return null;
    }

    /* renamed from: d */
    public final <T> jt2<T> mo43823d(Class<? super T> cls) {
        if (this.f34511a) {
            return new C6644g(cls);
        }
        return new C6645h("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public String toString() {
        return this.f34510a.toString();
    }
}
