package com.onedelhi.secure;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¨\u0006\u0004"}, d2 = {"T", "Ljava/util/Enumeration;", "", "d0", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/CollectionsKt")
public class u00 extends t00 {

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/onedelhi/secure/u00$a", "", "", "hasNext", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.u00$a */
    public static final class C6915a implements Iterator<T>, nx1 {

        /* renamed from: a */
        public final /* synthetic */ Enumeration<T> f35860a;

        public C6915a(Enumeration<T> enumeration) {
            this.f35860a = enumeration;
        }

        public boolean hasNext() {
            return this.f35860a.hasMoreElements();
        }

        public T next() {
            return this.f35860a.nextElement();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @vr2
    /* renamed from: d0 */
    public static final <T> Iterator<T> m66321d0(@vr2 Enumeration<T> enumeration) {
        jt1.m53777p(enumeration, "<this>");
        return new C6915a(enumeration);
    }
}
