package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\bø\u0001\u0000\u001a!\u0010\u0007\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a \u0010\n\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0001\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004\u001a@\u0010\u000f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\u000e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\r*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\u0004\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0010"}, d2 = {"T", "Lkotlin/Function0;", "", "iterator", "", "Y", "", "a0", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "default", "Z", "", "b0", "R", "Lcom/onedelhi/secure/ey2;", "c0", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/CollectionsKt")
public class t00 extends s00 {

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004"}, d2 = {"com/onedelhi/secure/t00$a", "", "", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.t00$a */
    public static final class C6814a implements Iterable<T>, nx1 {

        /* renamed from: a */
        public final /* synthetic */ cc1<Iterator<T>> f35285a;

        public C6814a(cc1<? extends Iterator<? extends T>> cc1) {
            this.f35285a = cc1;
        }

        @vr2
        public Iterator<T> iterator() {
            return this.f35285a.invoke();
        }
    }

    @xq1
    /* renamed from: Y */
    public static final <T> Iterable<T> m65072Y(cc1<? extends Iterator<? extends T>> cc1) {
        jt1.m53777p(cc1, "iterator");
        return new C6814a(cc1);
    }

    @z73
    /* renamed from: Z */
    public static final <T> int m65073Z(@vr2 Iterable<? extends T> iterable, int i) {
        jt1.m53777p(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    @ss2
    @z73
    /* renamed from: a0 */
    public static final <T> Integer m65074a0(@vr2 Iterable<? extends T> iterable) {
        jt1.m53777p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @vr2
    /* renamed from: b0 */
    public static final <T> List<T> m65075b0(@vr2 Iterable<? extends Iterable<? extends T>> iterable) {
        jt1.m53777p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Iterable p0 : iterable) {
            x00.m69813p0(arrayList, p0);
        }
        return arrayList;
    }

    @vr2
    /* renamed from: c0 */
    public static final <T, R> ey2<List<T>, List<R>> m65076c0(@vr2 Iterable<? extends ey2<? extends T, ? extends R>> iterable) {
        jt1.m53777p(iterable, "<this>");
        int Z = m65073Z(iterable, 10);
        ArrayList arrayList = new ArrayList(Z);
        ArrayList arrayList2 = new ArrayList(Z);
        for (ey2 ey2 : iterable) {
            arrayList.add(ey2.mo35668e());
            arrayList2.add(ey2.mo35670f());
        }
        return yi4.m71797a(arrayList, arrayList2);
    }
}
