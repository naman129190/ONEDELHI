package com.onedelhi.secure;

import com.onedelhi.secure.nl3;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u001a#\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a2\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002\u001a*\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002\u001a1\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b2\u0014\b\u0004\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007H\b\u001a\u0018\u0010\u0011\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a\u001b\u0010\u0013\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u000fH\u0010*(\b\u0002\u0010\u0014\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007¨\u0006\u0015"}, d2 = {"", "E", "exception", "h", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/Class;", "clz", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "b", "Ljava/lang/reflect/Constructor;", "constructor", "c", "block", "g", "", "defaultValue", "f", "accumulator", "d", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class lw0 {

    /* renamed from: a */
    public static final int f31853a = m56607f(Throwable.class, -1);
    @vr2

    /* renamed from: a */
    public static final sb0 f31854a;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "com/onedelhi/secure/z10$d", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.lw0$a */
    public static final class C6060a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return z10.m72495g(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "E", "it", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/Void;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.lw0$b */
    public static final class C6061b extends d12 implements ec1 {

        /* renamed from: a */
        public static final C6061b f31855a = new C6061b();

        public C6061b() {
            super(1);
        }

        @ss2
        /* renamed from: a */
        public final Void mo17094X(@vr2 Throwable th) {
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "com/onedelhi/secure/lw0$g"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.lw0$c */
    public static final class C6062c extends d12 implements ec1<Throwable, Throwable> {

        /* renamed from: a */
        public final /* synthetic */ Constructor f31856a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6062c(Constructor constructor) {
            super(1);
            this.f31856a = constructor;
        }

        @ss2
        /* renamed from: a */
        public final Throwable mo17094X(@vr2 Throwable th) {
            Object obj;
            try {
                nl3.C6191a aVar = nl3.f32575a;
                Object newInstance = this.f31856a.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    obj = nl3.m58187b((Throwable) newInstance);
                    if (nl3.m58194i(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                nl3.C6191a aVar2 = nl3.f32575a;
                obj = nl3.m58187b(pl3.m61423a(th2));
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "com/onedelhi/secure/lw0$g"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.lw0$d */
    public static final class C6063d extends d12 implements ec1<Throwable, Throwable> {

        /* renamed from: a */
        public final /* synthetic */ Constructor f31857a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6063d(Constructor constructor) {
            super(1);
            this.f31857a = constructor;
        }

        @ss2
        /* renamed from: a */
        public final Throwable mo17094X(@vr2 Throwable th) {
            Object obj;
            try {
                nl3.C6191a aVar = nl3.f32575a;
                Object newInstance = this.f31857a.newInstance(new Object[]{th});
                if (newInstance != null) {
                    obj = nl3.m58187b((Throwable) newInstance);
                    if (nl3.m58194i(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                nl3.C6191a aVar2 = nl3.f32575a;
                obj = nl3.m58187b(pl3.m61423a(th2));
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "com/onedelhi/secure/lw0$g"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.lw0$e */
    public static final class C6064e extends d12 implements ec1<Throwable, Throwable> {

        /* renamed from: a */
        public final /* synthetic */ Constructor f31858a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6064e(Constructor constructor) {
            super(1);
            this.f31858a = constructor;
        }

        @ss2
        /* renamed from: a */
        public final Throwable mo17094X(@vr2 Throwable th) {
            Object obj;
            try {
                nl3.C6191a aVar = nl3.f32575a;
                Object newInstance = this.f31858a.newInstance(new Object[]{th.getMessage()});
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = nl3.m58187b(th2);
                    if (nl3.m58194i(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                nl3.C6191a aVar2 = nl3.f32575a;
                obj = nl3.m58187b(pl3.m61423a(th3));
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "com/onedelhi/secure/lw0$g"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.lw0$f */
    public static final class C6065f extends d12 implements ec1<Throwable, Throwable> {

        /* renamed from: a */
        public final /* synthetic */ Constructor f31859a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6065f(Constructor constructor) {
            super(1);
            this.f31859a = constructor;
        }

        @ss2
        /* renamed from: a */
        public final Throwable mo17094X(@vr2 Throwable th) {
            Object obj;
            try {
                nl3.C6191a aVar = nl3.f32575a;
                Object newInstance = this.f31859a.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = nl3.m58187b(th2);
                    if (nl3.m58194i(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                nl3.C6191a aVar2 = nl3.f32575a;
                obj = nl3.m58187b(pl3.m61423a(th3));
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.lw0$g */
    public static final class C6066g extends d12 implements ec1<Throwable, Throwable> {

        /* renamed from: a */
        public final /* synthetic */ ec1<Throwable, Throwable> f31860a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6066g(ec1<? super Throwable, ? extends Throwable> ec1) {
            super(1);
            this.f31860a = ec1;
        }

        @ss2
        /* renamed from: a */
        public final Throwable mo17094X(@vr2 Throwable th) {
            Object obj;
            ec1<Throwable, Throwable> ec1 = this.f31860a;
            try {
                nl3.C6191a aVar = nl3.f32575a;
                obj = nl3.m58187b(ec1.mo17094X(th));
            } catch (Throwable th2) {
                nl3.C6191a aVar2 = nl3.f32575a;
                obj = nl3.m58187b(pl3.m61423a(th2));
            }
            if (nl3.m58194i(obj)) {
                obj = null;
            }
            return (Throwable) obj;
        }
    }

    static {
        sb0 sb0;
        try {
            sb0 = e01.m45748a() ? uw4.f36329a : C6484py.f33844a;
        } catch (Throwable unused) {
            sb0 = uw4.f36329a;
        }
        f31854a = sb0;
    }

    /* renamed from: b */
    public static final <E extends Throwable> ec1<Throwable, Throwable> m56603b(Class<E> cls) {
        C6061b bVar = C6061b.f31855a;
        if (f31853a != m56607f(cls, 0)) {
            return bVar;
        }
        for (Constructor c : C4478ab.m37326lw(cls.getConstructors(), new C6060a())) {
            ec1<Throwable, Throwable> c2 = m56604c(c);
            if (c2 != null) {
                return c2;
            }
        }
        return bVar;
    }

    /* renamed from: c */
    public static final ec1<Throwable, Throwable> m56604c(Constructor<?> constructor) {
        Class<String> cls = String.class;
        Class[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new C6065f(constructor);
        }
        if (length == 1) {
            Class cls2 = parameterTypes[0];
            if (jt1.m53768g(cls2, Throwable.class)) {
                return new C6063d(constructor);
            }
            if (jt1.m53768g(cls2, cls)) {
                return new C6064e(constructor);
            }
            return null;
        } else if (length == 2 && jt1.m53768g(parameterTypes[0], cls) && jt1.m53768g(parameterTypes[1], Throwable.class)) {
            return new C6062c(constructor);
        } else {
            return null;
        }
    }

    /* renamed from: d */
    public static final int m56605d(Class<?> cls, int i) {
        Class<? super Object> superclass;
        do {
            Field[] declaredFields = r5.getDeclaredFields();
            int length = declaredFields.length;
            int i2 = 0;
            int i3 = 0;
            Class<? super Object> cls2 = cls;
            while (i2 < length) {
                Field field = declaredFields[i2];
                i2++;
                if (!Modifier.isStatic(field.getModifiers())) {
                    i3++;
                }
            }
            i += i3;
            superclass = cls2.getSuperclass();
            cls2 = superclass;
        } while (superclass != null);
        return i;
    }

    /* renamed from: e */
    public static /* synthetic */ int m56606e(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m56605d(cls, i);
    }

    /* renamed from: f */
    public static final int m56607f(Class<?> cls, int i) {
        Integer num;
        nw1.m58845i(cls);
        try {
            nl3.C6191a aVar = nl3.f32575a;
            num = nl3.m58187b(Integer.valueOf(m56606e(cls, 0, 1, (Object) null)));
        } catch (Throwable th) {
            nl3.C6191a aVar2 = nl3.f32575a;
            num = nl3.m58187b(pl3.m61423a(th));
        }
        Integer valueOf = Integer.valueOf(i);
        if (nl3.m58194i(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    /* renamed from: g */
    public static final ec1<Throwable, Throwable> m56608g(ec1<? super Throwable, ? extends Throwable> ec1) {
        return new C6066g(ec1);
    }

    @ss2
    /* renamed from: h */
    public static final <E extends Throwable> E m56609h(@vr2 E e) {
        E e2;
        if (!(e instanceof x80)) {
            return (Throwable) f31854a.mo42972a(e.getClass()).mo17094X(e);
        }
        try {
            nl3.C6191a aVar = nl3.f32575a;
            e2 = nl3.m58187b(((x80) e).mo41021a());
        } catch (Throwable th) {
            nl3.C6191a aVar2 = nl3.f32575a;
            e2 = nl3.m58187b(pl3.m61423a(th));
        }
        if (nl3.m58194i(e2)) {
            e2 = null;
        }
        return (Throwable) e2;
    }
}
