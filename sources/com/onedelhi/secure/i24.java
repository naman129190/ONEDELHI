package com.onedelhi.secure;

import com.onedelhi.secure.nl3;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a.\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\b¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u0004\u001a;\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0010\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00180\u0017\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010\u001d\u001a\u00020\u001c2\u0010\u0010\u001b\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00182\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u0000HHø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\"\u0010\"\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\b¢\u0006\u0004\b\"\u0010\u0004\u001a!\u0010#\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b#\u0010\u0004\u001a\u001e\u0010$\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002\u001a\u0014\u0010'\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010&\u001a\u00020%H\u0007\u001a\u0010\u0010)\u001a\u00020(*\u00060\u0012j\u0002`\u0013H\u0000\u001a%\u0010,\u001a\u00020+*\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00182\u0006\u0010*\u001a\u00020%H\u0002¢\u0006\u0004\b,\u0010-\u001a\u001c\u0010.\u001a\u00020(*\u00060\u0012j\u0002`\u00132\n\u0010\u0019\u001a\u00060\u0012j\u0002`\u0013H\u0002\u001a\u0014\u0010/\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0000*\f\b\u0000\u00100\"\u00020\n2\u00020\n*\f\b\u0000\u00101\"\u00020\u00122\u00020\u0012\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"", "E", "exception", "p", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "r", "Lcom/onedelhi/secure/b80;", "continuation", "q", "(Ljava/lang/Throwable;Lcom/onedelhi/secure/b80;)Ljava/lang/Throwable;", "Lcom/onedelhi/secure/p90;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "o", "(Ljava/lang/Throwable;Lcom/onedelhi/secure/p90;)Ljava/lang/Throwable;", "s", "cause", "result", "Ljava/util/ArrayDeque;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "resultStackTrace", "f", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "Lcom/onedelhi/secure/ey2;", "", "e", "(Ljava/lang/Throwable;)Lcom/onedelhi/secure/ey2;", "recoveredStacktrace", "Lcom/onedelhi/secure/un4;", "l", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "", "m", "(Ljava/lang/Throwable;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "t", "u", "g", "", "message", "d", "", "k", "methodName", "", "i", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "h", "j", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class i24 {
    @vr2

    /* renamed from: a */
    public static final String f30059a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    @vr2

    /* renamed from: b */
    public static final String f30060b = "kotlinx.coroutines.internal.StackTraceRecoveryKt";

    /* renamed from: c */
    public static final String f30061c;

    /* renamed from: d */
    public static final String f30062d;

    static {
        Object obj;
        Object obj2;
        try {
            nl3.C6191a aVar = nl3.f32575a;
            obj = nl3.m58187b(Class.forName("com.onedelhi.secure.ij").getCanonicalName());
        } catch (Throwable th) {
            nl3.C6191a aVar2 = nl3.f32575a;
            obj = nl3.m58187b(pl3.m61423a(th));
        }
        if (nl3.m58190e(obj) != null) {
            obj = f30059a;
        }
        f30061c = (String) obj;
        try {
            nl3.C6191a aVar3 = nl3.f32575a;
            obj2 = nl3.m58187b(i24.class.getCanonicalName());
        } catch (Throwable th2) {
            nl3.C6191a aVar4 = nl3.f32575a;
            obj2 = nl3.m58187b(pl3.m61423a(th2));
        }
        if (nl3.m58190e(obj2) != null) {
            obj2 = f30060b;
        }
        f30062d = (String) obj2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m51742a() {
    }

    /* renamed from: b */
    public static /* synthetic */ void m51743b() {
    }

    @zs1
    @vr2
    /* renamed from: d */
    public static final StackTraceElement m51745d(@vr2 String str) {
        return new StackTraceElement(jt1.m53745C("\b\b\b(", str), "\b", "\b", -1);
    }

    /* renamed from: e */
    public static final <E extends Throwable> ey2<E, StackTraceElement[]> m51746e(E e) {
        boolean z;
        Throwable cause = e.getCause();
        if (cause == null || !jt1.m53768g(cause.getClass(), e.getClass())) {
            return yi4.m71797a(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            i++;
            if (m51752k(stackTraceElement)) {
                z = true;
                break;
            }
        }
        return z ? yi4.m71797a(cause, stackTrace) : yi4.m71797a(e, new StackTraceElement[0]);
    }

    /* renamed from: f */
    public static final <E extends Throwable> E m51747f(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(m51745d("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        int i = m51750i(stackTrace, f30061c);
        int i2 = 0;
        if (i == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            e2.setStackTrace((StackTraceElement[]) array);
            return e2;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + i)];
        for (int i3 = 0; i3 < i; i3++) {
            stackTraceElementArr[i3] = stackTrace[i3];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i4 = i2 + 1;
            stackTraceElementArr[i2 + i] = it.next();
            i2 = i4;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0016  */
    /* renamed from: g */
    public static final java.util.ArrayDeque<java.lang.StackTraceElement> m51748g(com.onedelhi.secure.p90 r2) {
        /*
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            java.lang.StackTraceElement r1 = r2.mo35201P()
            if (r1 != 0) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            r0.add(r1)
        L_0x000f:
            com.onedelhi.secure.p90 r2 = r2.mo35202i()
            if (r2 != 0) goto L_0x0016
            return r0
        L_0x0016:
            java.lang.StackTraceElement r1 = r2.mo35201P()
            if (r1 != 0) goto L_0x000c
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.i24.m51748g(com.onedelhi.secure.p90):java.util.ArrayDeque");
    }

    /* renamed from: h */
    public static final boolean m51749h(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && jt1.m53768g(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && jt1.m53768g(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && jt1.m53768g(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    /* renamed from: i */
    public static final int m51750i(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (jt1.m53768g(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: j */
    public static final void m51751j(@vr2 Throwable th, @vr2 Throwable th2) {
        th.initCause(th2);
    }

    /* renamed from: k */
    public static final boolean m51752k(@vr2 StackTraceElement stackTraceElement) {
        return t54.m65466u2(stackTraceElement.getClassName(), "\b\b\b", false, 2, (Object) null);
    }

    /* renamed from: l */
    public static final void m51753l(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            int i2 = i + 1;
            if (m51752k(stackTraceElementArr[i])) {
                break;
            }
            i = i2;
        }
        int i3 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i3 <= length2) {
            while (true) {
                int i4 = length2 - 1;
                if (m51749h(stackTraceElementArr[length2], arrayDeque.getLast())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i3) {
                    length2 = i4;
                } else {
                    return;
                }
            }
        }
    }

    @ss2
    /* renamed from: m */
    public static final Object m51754m(@vr2 Throwable th, @vr2 b80<?> b80) {
        throw th;
    }

    /* renamed from: n */
    public static final Object m51755n(Throwable th, b80<?> b80) {
        throw th;
    }

    /* renamed from: o */
    public static final <E extends Throwable> E m51756o(E e, p90 p90) {
        ey2 e2 = m51746e(e);
        E e3 = (Throwable) e2.mo35665a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) e2.mo35666b();
        Throwable s = m51760s(e3);
        if (s == null) {
            return e;
        }
        ArrayDeque g = m51748g(p90);
        if (g.isEmpty()) {
            return e;
        }
        if (e3 != e) {
            m51753l(stackTraceElementArr, g);
        }
        return m51747f(e3, s, g);
    }

    @vr2
    /* renamed from: p */
    public static final <E extends Throwable> E m51757p(@vr2 E e) {
        return e;
    }

    @vr2
    /* renamed from: q */
    public static final <E extends Throwable> E m51758q(@vr2 E e, @vr2 b80<?> b80) {
        return e;
    }

    /* renamed from: r */
    public static final <E extends Throwable> E m51759r(E e) {
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int i = m51750i(stackTrace, f30062d);
        int i2 = i + 1;
        int i3 = m51750i(stackTrace, f30061c);
        int i4 = 0;
        int i5 = (length - i) - (i3 == -1 ? 0 : length - i3);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i5];
        while (i4 < i5) {
            stackTraceElementArr[i4] = i4 == 0 ? m51745d("Coroutine boundary") : stackTrace[(i2 + i4) - 1];
            i4++;
        }
        e.setStackTrace(stackTraceElementArr);
        return e;
    }

    /* renamed from: s */
    public static final <E extends Throwable> E m51760s(E e) {
        E h = lw0.m56609h(e);
        if (h == null) {
            return null;
        }
        if ((e instanceof x80) || jt1.m53768g(h.getMessage(), e.getMessage())) {
            return h;
        }
        return null;
    }

    @vr2
    /* renamed from: t */
    public static final <E extends Throwable> E m51761t(@vr2 E e) {
        return e;
    }

    @vr2
    /* renamed from: u */
    public static final <E extends Throwable> E m51762u(@vr2 E e) {
        E cause = e.getCause();
        if (cause != null && jt1.m53768g(cause.getClass(), e.getClass())) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                i++;
                if (m51752k(stackTraceElement)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return cause;
            }
        }
        return e;
    }
}
