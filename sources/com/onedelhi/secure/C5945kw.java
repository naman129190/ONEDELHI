package com.onedelhi.secure;

import kotlin.Metadata;

@sw1
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u001c\u001d\u001bB\u0016\b\u0001\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014\u0001\u001a\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/onedelhi/secure/kw;", "T", "", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "i", "", "f", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "n", "(Ljava/lang/Object;)Ljava/lang/String;", "", "j", "(Ljava/lang/Object;)I", "other", "", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "m", "(Ljava/lang/Object;)Z", "isSuccess", "l", "isFailure", "k", "isClosed", "holder", "c", "a", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.kw */
public final class C5945kw<T> {
    @vr2

    /* renamed from: a */
    public static final C5947b f31471a = new C5947b((wg0) null);
    @vr2

    /* renamed from: a */
    public static final C5948c f31472a = new C5948c();
    @ss2

    /* renamed from: a */
    public final Object f31473a;

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/kw$a;", "Lcom/onedelhi/secure/kw$c;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.kw$a */
    public static final class C5946a extends C5948c {
        @rw1
        @ss2

        /* renamed from: a */
        public final Throwable f31474a;

        public C5946a(@ss2 Throwable th) {
            this.f31474a = th;
        }

        public boolean equals(@ss2 Object obj) {
            return (obj instanceof C5946a) && jt1.m53768g(this.f31474a, ((C5946a) obj).f31474a);
        }

        public int hashCode() {
            Throwable th = this.f31474a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        @vr2
        public String toString() {
            return "Closed(" + this.f31474a + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u0002H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lcom/onedelhi/secure/kw$b;", "", "E", "value", "Lcom/onedelhi/secure/kw;", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "", "cause", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lcom/onedelhi/secure/kw$c;", "failed", "Lcom/onedelhi/secure/kw$c;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    @zs1
    /* renamed from: com.onedelhi.secure.kw$b */
    public static final class C5947b {
        public C5947b() {
        }

        public /* synthetic */ C5947b(wg0 wg0) {
            this();
        }

        @zs1
        @vr2
        /* renamed from: a */
        public final <E> Object mo39548a(@ss2 Throwable th) {
            return C5945kw.m55066c(new C5946a(th));
        }

        @zs1
        @vr2
        /* renamed from: b */
        public final <E> Object mo39549b() {
            return C5945kw.m55066c(C5945kw.f31472a);
        }

        @zs1
        @vr2
        /* renamed from: c */
        public final <E> Object mo39550c(E e) {
            return C5945kw.m55066c(e);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/kw$c;", "", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.kw$c */
    public static class C5948c {
        @vr2
        public String toString() {
            return "Failed";
        }
    }

    @z73
    public /* synthetic */ C5945kw(Object obj) {
        this.f31473a = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ C5945kw m55065b(Object obj) {
        return new C5945kw(obj);
    }

    @vr2
    @z73
    /* renamed from: c */
    public static <T> Object m55066c(@ss2 Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static boolean m55067d(Object obj, Object obj2) {
        return (obj2 instanceof C5945kw) && jt1.m53768g(obj, ((C5945kw) obj2).mo39543o());
    }

    /* renamed from: e */
    public static final boolean m55068e(Object obj, Object obj2) {
        return jt1.m53768g(obj, obj2);
    }

    @ss2
    /* renamed from: f */
    public static final Throwable m55069f(Object obj) {
        C5946a aVar = obj instanceof C5946a ? (C5946a) obj : null;
        if (aVar == null) {
            return null;
        }
        return aVar.f31474a;
    }

    @z73
    /* renamed from: g */
    public static /* synthetic */ void m55070g() {
    }

    @ss2
    /* renamed from: h */
    public static final T m55071h(Object obj) {
        if (!(obj instanceof C5948c)) {
            return obj;
        }
        return null;
    }

    /* renamed from: i */
    public static final T m55072i(Object obj) {
        Throwable th;
        if (!(obj instanceof C5948c)) {
            return obj;
        }
        if (!(obj instanceof C5946a) || (th = ((C5946a) obj).f31474a) == null) {
            throw new IllegalStateException(jt1.m53745C("Trying to call 'getOrThrow' on a failed channel result: ", obj).toString());
        }
        throw th;
    }

    /* renamed from: j */
    public static int m55073j(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: k */
    public static final boolean m55074k(Object obj) {
        return obj instanceof C5946a;
    }

    /* renamed from: l */
    public static final boolean m55075l(Object obj) {
        return obj instanceof C5948c;
    }

    /* renamed from: m */
    public static final boolean m55076m(Object obj) {
        return !(obj instanceof C5948c);
    }

    @vr2
    /* renamed from: n */
    public static String m55077n(Object obj) {
        if (obj instanceof C5946a) {
            return ((C5946a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m55067d(this.f31473a, obj);
    }

    public int hashCode() {
        return m55073j(this.f31473a);
    }

    /* renamed from: o */
    public final /* synthetic */ Object mo39543o() {
        return this.f31473a;
    }

    @vr2
    public String toString() {
        return m55077n(this.f31473a);
    }
}
