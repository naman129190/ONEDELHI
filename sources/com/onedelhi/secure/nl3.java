package com.onedelhi.secure;

import java.io.Serializable;
import kotlin.Metadata;

@sw1
@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u001b\u001aB\u0016\b\u0001\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u0012\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\b¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\u0001\u0019\u0001\u0004\u0018\u00010\u000fø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/onedelhi/secure/nl3;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "k", "(Ljava/lang/Object;)Ljava/lang/String;", "", "h", "(Ljava/lang/Object;)I", "", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "j", "(Ljava/lang/Object;)Z", "isSuccess", "i", "isFailure", "value", "b", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class nl3<T> implements Serializable {
    @vr2

    /* renamed from: a */
    public static final C6191a f32575a = new C6191a((wg0) null);
    @ss2

    /* renamed from: a */
    public final Object f32576a;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\b\u001a\u00020\u0007H\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/nl3$a;", "", "T", "value", "Lcom/onedelhi/secure/nl3;", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "exception", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.nl3$a */
    public static final class C6191a {
        public C6191a() {
        }

        public /* synthetic */ C6191a(wg0 wg0) {
            this();
        }

        @xq1
        @uw1(name = "failure")
        /* renamed from: a */
        public final <T> Object mo41108a(Throwable th) {
            jt1.m53777p(th, "exception");
            return nl3.m58187b(pl3.m61423a(th));
        }

        @xq1
        @uw1(name = "success")
        /* renamed from: b */
        public final <T> Object mo41109b(T t) {
            return nl3.m58187b(t);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/nl3$b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "exception", "<init>", "(Ljava/lang/Throwable;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.nl3$b */
    public static final class C6192b implements Serializable {
        @rw1
        @vr2

        /* renamed from: a */
        public final Throwable f32577a;

        public C6192b(@vr2 Throwable th) {
            jt1.m53777p(th, "exception");
            this.f32577a = th;
        }

        public boolean equals(@ss2 Object obj) {
            return (obj instanceof C6192b) && jt1.m53768g(this.f32577a, ((C6192b) obj).f32577a);
        }

        public int hashCode() {
            return this.f32577a.hashCode();
        }

        @vr2
        public String toString() {
            return "Failure(" + this.f32577a + ')';
        }
    }

    @z73
    public /* synthetic */ nl3(Object obj) {
        this.f32576a = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ nl3 m58186a(Object obj) {
        return new nl3(obj);
    }

    @vr2
    @z73
    /* renamed from: b */
    public static <T> Object m58187b(@ss2 Object obj) {
        return obj;
    }

    /* renamed from: c */
    public static boolean m58188c(Object obj, Object obj2) {
        return (obj2 instanceof nl3) && jt1.m53768g(obj, ((nl3) obj2).mo41106l());
    }

    /* renamed from: d */
    public static final boolean m58189d(Object obj, Object obj2) {
        return jt1.m53768g(obj, obj2);
    }

    @ss2
    /* renamed from: e */
    public static final Throwable m58190e(Object obj) {
        if (obj instanceof C6192b) {
            return ((C6192b) obj).f32577a;
        }
        return null;
    }

    @xq1
    /* renamed from: f */
    public static final T m58191f(Object obj) {
        if (m58194i(obj)) {
            return null;
        }
        return obj;
    }

    @z73
    /* renamed from: g */
    public static /* synthetic */ void m58192g() {
    }

    /* renamed from: h */
    public static int m58193h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: i */
    public static final boolean m58194i(Object obj) {
        return obj instanceof C6192b;
    }

    /* renamed from: j */
    public static final boolean m58195j(Object obj) {
        return !(obj instanceof C6192b);
    }

    @vr2
    /* renamed from: k */
    public static String m58196k(Object obj) {
        if (obj instanceof C6192b) {
            return ((C6192b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m58188c(this.f32576a, obj);
    }

    public int hashCode() {
        return m58193h(this.f32576a);
    }

    /* renamed from: l */
    public final /* synthetic */ Object mo41106l() {
        return this.f32576a;
    }

    @vr2
    public String toString() {
        return m58196k(this.f32576a);
    }
}
