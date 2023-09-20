package com.onedelhi.secure;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0002j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0003H\b\u001a6\u0010\n\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007H\bø\u0001\u0000\u001a \u0010\f\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a2\u0010\r\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0002j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0003\u001a(\u0010\u000f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00028\u0000H\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\b\u001a!\u0010\u0014\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\b\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0015"}, d2 = {"T", "", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "Lcom/onedelhi/secure/un4;", "m0", "Lkotlin/Function2;", "", "comparison", "l0", "", "k0", "n0", "value", "h0", "(Ljava/util/List;Ljava/lang/Object;)V", "i0", "Ljava/util/Random;", "random", "j0", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/CollectionsKt")
public class w00 extends v00 {
    @gz3(version = "1.2")
    @xq1
    /* renamed from: h0 */
    public static final <T> void m68655h0(List<T> list, T t) {
        jt1.m53777p(list, "<this>");
        Collections.fill(list, t);
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: i0 */
    public static final <T> void m68656i0(List<T> list) {
        jt1.m53777p(list, "<this>");
        Collections.shuffle(list);
    }

    @gz3(version = "1.2")
    @xq1
    /* renamed from: j0 */
    public static final <T> void m68657j0(List<T> list, Random random) {
        jt1.m53777p(list, "<this>");
        jt1.m53777p(random, "random");
        Collections.shuffle(list, random);
    }

    /* renamed from: k0 */
    public static final <T extends Comparable<? super T>> void m68658k0(@vr2 List<T> list) {
        jt1.m53777p(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    @xq1
    @xj0(level = ak0.ERROR, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @oi3(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    /* renamed from: l0 */
    public static final <T> void m68659l0(List<T> list, sc1<? super T, ? super T, Integer> sc1) {
        jt1.m53777p(list, "<this>");
        jt1.m53777p(sc1, "comparison");
        throw new ur2((String) null, 1, (wg0) null);
    }

    @xq1
    @xj0(level = ak0.ERROR, message = "Use sortWith(comparator) instead.", replaceWith = @oi3(expression = "this.sortWith(comparator)", imports = {}))
    /* renamed from: m0 */
    public static final <T> void m68660m0(List<T> list, Comparator<? super T> comparator) {
        jt1.m53777p(list, "<this>");
        jt1.m53777p(comparator, "comparator");
        throw new ur2((String) null, 1, (wg0) null);
    }

    /* renamed from: n0 */
    public static final <T> void m68661n0(@vr2 List<T> list, @vr2 Comparator<? super T> comparator) {
        jt1.m53777p(list, "<this>");
        jt1.m53777p(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
