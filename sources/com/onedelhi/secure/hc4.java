package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aJ\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u001a5\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0014"}, d2 = {"", "start", "isDaemon", "Ljava/lang/ClassLoader;", "contextClassLoader", "", "name", "", "priority", "Lkotlin/Function0;", "Lcom/onedelhi/secure/un4;", "block", "Ljava/lang/Thread;", "b", "", "T", "Ljava/lang/ThreadLocal;", "default", "a", "(Ljava/lang/ThreadLocal;Lcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
@uw1(name = "ThreadsKt")
public final class hc4 {

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/onedelhi/secure/hc4$a", "Ljava/lang/Thread;", "Lcom/onedelhi/secure/un4;", "run", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.hc4$a */
    public static final class C5501a extends Thread {

        /* renamed from: a */
        public final /* synthetic */ cc1<un4> f29573a;

        public C5501a(cc1<un4> cc1) {
            this.f29573a = cc1;
        }

        public void run() {
            this.f29573a.invoke();
        }
    }

    @xq1
    /* renamed from: a */
    public static final <T> T m50444a(ThreadLocal<T> threadLocal, cc1<? extends T> cc1) {
        jt1.m53777p(threadLocal, "<this>");
        jt1.m53777p(cc1, "default");
        T t = threadLocal.get();
        if (t != null) {
            return t;
        }
        T invoke = cc1.invoke();
        threadLocal.set(invoke);
        return invoke;
    }

    @vr2
    /* renamed from: b */
    public static final Thread m50445b(boolean z, boolean z2, @ss2 ClassLoader classLoader, @ss2 String str, int i, @vr2 cc1<un4> cc1) {
        jt1.m53777p(cc1, "block");
        C5501a aVar = new C5501a(cc1);
        if (z2) {
            aVar.setDaemon(true);
        }
        if (i > 0) {
            aVar.setPriority(i);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z) {
            aVar.start();
        }
        return aVar;
    }

    /* renamed from: c */
    public static /* synthetic */ Thread m50446c(boolean z, boolean z2, ClassLoader classLoader, String str, int i, cc1 cc1, int i2, Object obj) {
        return m50445b((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : classLoader, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? -1 : i, cc1);
    }
}
