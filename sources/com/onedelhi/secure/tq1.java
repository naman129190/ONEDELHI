package com.onedelhi.secure;

import java.util.ArrayList;
import kotlin.Metadata;

@sw1
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0016\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u0001\u0015\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/tq1;", "E", "", "element", "h", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lcom/onedelhi/secure/un4;", "action", "f", "(Ljava/lang/Object;Lcom/onedelhi/secure/ec1;)V", "", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "", "g", "(Ljava/lang/Object;)I", "other", "", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "holder", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class tq1<E> {
    @ss2

    /* renamed from: a */
    public final Object f35761a;

    public /* synthetic */ tq1(Object obj) {
        this.f35761a = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ tq1 m66114a(Object obj) {
        return new tq1(obj);
    }

    @vr2
    /* renamed from: b */
    public static <E> Object m66115b(@ss2 Object obj) {
        return obj;
    }

    /* renamed from: c */
    public static /* synthetic */ Object m66116c(Object obj, int i, wg0 wg0) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m66115b(obj);
    }

    /* renamed from: d */
    public static boolean m66117d(Object obj, Object obj2) {
        return (obj2 instanceof tq1) && jt1.m53768g(obj, ((tq1) obj2).mo45228j());
    }

    /* renamed from: e */
    public static final boolean m66118e(Object obj, Object obj2) {
        return jt1.m53768g(obj, obj2);
    }

    /* renamed from: f */
    public static final void m66119f(Object obj, @vr2 ec1<? super E, un4> ec1) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ec1.mo17094X(obj);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    ec1.mo17094X(arrayList.get(size));
                    if (i >= 0) {
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static int m66120g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @vr2
    /* renamed from: h */
    public static final Object m66121h(Object obj, E e) {
        if (obj == null) {
            return m66115b(e);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e);
            return m66115b(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return m66115b(arrayList);
    }

    /* renamed from: i */
    public static String m66122i(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m66117d(this.f35761a, obj);
    }

    public int hashCode() {
        return m66120g(this.f35761a);
    }

    /* renamed from: j */
    public final /* synthetic */ Object mo45228j() {
        return this.f35761a;
    }

    public String toString() {
        return m66122i(this.f35761a);
    }
}
