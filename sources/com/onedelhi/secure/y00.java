package com.onedelhi.secure;

import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0000\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "", "index", "Y0", "(Ljava/util/List;I)I", "Z0", "T", "W0", "", "X0", "(Ljava/util/List;)Ljava/util/List;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/CollectionsKt")
public class y00 extends x00 {
    @vr2
    /* renamed from: W0 */
    public static final <T> List<T> m71006W0(@vr2 List<? extends T> list) {
        jt1.m53777p(list, "<this>");
        return new qm3(list);
    }

    @uw1(name = "asReversedMutable")
    @vr2
    /* renamed from: X0 */
    public static final <T> List<T> m71007X0(@vr2 List<T> list) {
        jt1.m53777p(list, "<this>");
        return new pm3(list);
    }

    /* renamed from: Y0 */
    public static final int m71008Y0(List<?> list, int i) {
        if (new is1(0, s00.m64039H(list)).mo38213s(i)) {
            return s00.m64039H(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new is1(0, s00.m64039H(list)) + "].");
    }

    /* renamed from: Z0 */
    public static final int m71009Z0(List<?> list, int i) {
        if (new is1(0, list.size()).mo38213s(i)) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new is1(0, list.size()) + "].");
    }
}
