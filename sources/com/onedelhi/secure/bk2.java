package com.onedelhi.secure;

import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/bk2;", "", "Lcom/onedelhi/secure/ij;", "continuation", "", "b", "Lcom/onedelhi/secure/bk2$a;", "a", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class bk2 {
    @vr2

    /* renamed from: a */
    public static final C4680a f26397a = new C4680a((Method) null, (Method) null, (Method) null);
    @vr2

    /* renamed from: a */
    public static final bk2 f26398a = new bk2();
    @ss2

    /* renamed from: b */
    public static C4680a f26399b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/bk2$a;", "", "Ljava/lang/reflect/Method;", "getModuleMethod", "getDescriptorMethod", "nameMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.bk2$a */
    public static final class C4680a {
        @rw1
        @ss2

        /* renamed from: a */
        public final Method f26400a;
        @rw1
        @ss2

        /* renamed from: b */
        public final Method f26401b;
        @rw1
        @ss2

        /* renamed from: c */
        public final Method f26402c;

        public C4680a(@ss2 Method method, @ss2 Method method2, @ss2 Method method3) {
            this.f26400a = method;
            this.f26401b = method2;
            this.f26402c = method3;
        }
    }

    /* renamed from: a */
    public final C4680a mo31914a(C5729ij ijVar) {
        try {
            C4680a aVar = new C4680a(Class.class.getDeclaredMethod("getModule", new Class[0]), ijVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), ijVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f26399b = aVar;
            return aVar;
        } catch (Exception unused) {
            C4680a aVar2 = f26397a;
            f26399b = aVar2;
            return aVar2;
        }
    }

    @ss2
    /* renamed from: b */
    public final String mo31915b(@vr2 C5729ij ijVar) {
        jt1.m53777p(ijVar, "continuation");
        C4680a aVar = f26399b;
        if (aVar == null) {
            aVar = mo31914a(ijVar);
        }
        if (aVar == f26397a) {
            return null;
        }
        Method method = aVar.f26400a;
        Object invoke = method != null ? method.invoke(ijVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar.f26401b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar.f26402c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
