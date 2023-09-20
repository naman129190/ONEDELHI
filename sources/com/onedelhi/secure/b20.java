package com.onedelhi.secure;

import java.util.Comparator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0007\u001aI\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001aM\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b\"\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aI\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\b\u001aA\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\n\u001aM\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b\"\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"T", "a", "b", "c", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "p0", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "q0", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "", "other", "r0", "(Ljava/lang/Object;[Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "s0", "t0", "u0", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/comparisons/ComparisonsKt")
public class b20 extends a20 {
    @gz3(version = "1.1")
    /* renamed from: p0 */
    public static final <T> T m39318p0(T t, T t2, T t3, @vr2 Comparator<? super T> comparator) {
        jt1.m53777p(comparator, "comparator");
        return m39319q0(t, m39319q0(t2, t3, comparator), comparator);
    }

    @gz3(version = "1.1")
    /* renamed from: q0 */
    public static final <T> T m39319q0(T t, T t2, @vr2 Comparator<? super T> comparator) {
        jt1.m53777p(comparator, "comparator");
        return comparator.compare(t, t2) >= 0 ? t : t2;
    }

    @gz3(version = "1.4")
    /* renamed from: r0 */
    public static final <T> T m39320r0(T t, @vr2 T[] tArr, @vr2 Comparator<? super T> comparator) {
        jt1.m53777p(tArr, "other");
        jt1.m53777p(comparator, "comparator");
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    @gz3(version = "1.1")
    /* renamed from: s0 */
    public static final <T> T m39321s0(T t, T t2, T t3, @vr2 Comparator<? super T> comparator) {
        jt1.m53777p(comparator, "comparator");
        return m39322t0(t, m39322t0(t2, t3, comparator), comparator);
    }

    @gz3(version = "1.1")
    /* renamed from: t0 */
    public static final <T> T m39322t0(T t, T t2, @vr2 Comparator<? super T> comparator) {
        jt1.m53777p(comparator, "comparator");
        return comparator.compare(t, t2) <= 0 ? t : t2;
    }

    @gz3(version = "1.4")
    /* renamed from: u0 */
    public static final <T> T m39323u0(T t, @vr2 T[] tArr, @vr2 Comparator<? super T> comparator) {
        jt1.m53777p(tArr, "other");
        jt1.m53777p(comparator, "comparator");
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) > 0) {
                t = t2;
            }
        }
        return t;
    }
}
