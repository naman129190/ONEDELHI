package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@sw1
@oy0
@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0005\b@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0014\b\u0016\u0012\u0006\u0010!\u001a\u00020\u0003ø\u0001\u0001¢\u0006\u0004\b\"\u0010#B\u0014\b\u0001\u0012\u0006\u0010%\u001a\u00020$ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u001e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0002ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0002ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001b\u0001%\u0001\u00020$ø\u0001\u0001\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/onedelhi/secure/ul4;", "", "Lcom/onedelhi/secure/tl4;", "", "index", "s", "([JI)J", "value", "Lcom/onedelhi/secure/un4;", "z", "([JIJ)V", "", "y", "([J)Ljava/util/Iterator;", "element", "", "l", "([JJ)Z", "elements", "n", "([JLjava/util/Collection;)Z", "x", "([J)Z", "", "A", "([J)Ljava/lang/String;", "w", "([J)I", "", "other", "o", "([JLjava/lang/Object;)Z", "u", "size", "g", "(I)[J", "", "storage", "i", "([J)[J", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class ul4 implements Collection<tl4>, nx1 {
    @vr2

    /* renamed from: a */
    public final long[] f36179a;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0005\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0001\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/ul4$a;", "", "Lcom/onedelhi/secure/tl4;", "", "hasNext", "a", "()J", "", "array", "<init>", "([J)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.ul4$a */
    public static final class C6972a implements Iterator<tl4>, nx1 {
        @vr2

        /* renamed from: a */
        public final long[] f36180a;

        /* renamed from: n */
        public int f36181n;

        public C6972a(@vr2 long[] jArr) {
            jt1.m53777p(jArr, "array");
            this.f36180a = jArr;
        }

        /* renamed from: a */
        public long mo45669a() {
            int i = this.f36181n;
            long[] jArr = this.f36180a;
            if (i < jArr.length) {
                this.f36181n = i + 1;
                return tl4.m66012s(jArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f36181n));
        }

        public boolean hasNext() {
            return this.f36181n < this.f36180a.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return tl4.m65991b(mo45669a());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @z73
    public /* synthetic */ ul4(long[] jArr) {
        this.f36179a = jArr;
    }

    /* renamed from: A */
    public static String m67108A(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    /* renamed from: f */
    public static final /* synthetic */ ul4 m67109f(long[] jArr) {
        return new ul4(jArr);
    }

    @vr2
    /* renamed from: g */
    public static long[] m67110g(int i) {
        return m67111i(new long[i]);
    }

    @vr2
    @z73
    /* renamed from: i */
    public static long[] m67111i(@vr2 long[] jArr) {
        jt1.m53777p(jArr, "storage");
        return jArr;
    }

    /* renamed from: l */
    public static boolean m67112l(long[] jArr, long j) {
        return C4478ab.m36699S8(jArr, j);
    }

    /* renamed from: n */
    public static boolean m67113n(long[] jArr, @vr2 Collection<tl4> collection) {
        boolean z;
        jt1.m53777p(collection, "elements");
        if (!collection.isEmpty()) {
            for (T next : collection) {
                if (!(next instanceof tl4) || !C4478ab.m36699S8(jArr, ((tl4) next).mo45180r0())) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: o */
    public static boolean m67114o(long[] jArr, Object obj) {
        return (obj instanceof ul4) && jt1.m53768g(jArr, ((ul4) obj).mo45649B());
    }

    /* renamed from: r */
    public static final boolean m67115r(long[] jArr, long[] jArr2) {
        return jt1.m53768g(jArr, jArr2);
    }

    /* renamed from: s */
    public static final long m67116s(long[] jArr, int i) {
        return tl4.m66012s(jArr[i]);
    }

    /* renamed from: u */
    public static int m67117u(long[] jArr) {
        return jArr.length;
    }

    @z73
    /* renamed from: v */
    public static /* synthetic */ void m67118v() {
    }

    /* renamed from: w */
    public static int m67119w(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* renamed from: x */
    public static boolean m67120x(long[] jArr) {
        return jArr.length == 0;
    }

    @vr2
    /* renamed from: y */
    public static Iterator<tl4> m67121y(long[] jArr) {
        return new C6972a(jArr);
    }

    /* renamed from: z */
    public static final void m67122z(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    /* renamed from: B */
    public final /* synthetic */ long[] mo45649B() {
        return this.f36179a;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends tl4> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean mo45652b(long j) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof tl4)) {
            return false;
        }
        return mo45660j(((tl4) obj).mo45180r0());
    }

    public boolean containsAll(@vr2 Collection<? extends Object> collection) {
        jt1.m53777p(collection, "elements");
        return m67113n(this.f36179a, collection);
    }

    public boolean equals(Object obj) {
        return m67114o(this.f36179a, obj);
    }

    public int hashCode() {
        return m67119w(this.f36179a);
    }

    public boolean isEmpty() {
        return m67120x(this.f36179a);
    }

    @vr2
    public Iterator<tl4> iterator() {
        return m67121y(this.f36179a);
    }

    /* renamed from: j */
    public boolean mo45660j(long j) {
        return m67112l(this.f36179a, j);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: t */
    public int size() {
        return m67117u(this.f36179a);
    }

    public Object[] toArray() {
        return o00.m58878a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        jt1.m53777p(tArr, "array");
        return o00.m58879b(this, tArr);
    }

    public String toString() {
        return m67108A(this.f36179a);
    }
}
