package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@sw1
@oy0
@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0005\b@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0014\b\u0016\u0012\u0006\u0010!\u001a\u00020\u0003ø\u0001\u0001¢\u0006\u0004\b\"\u0010#B\u0014\b\u0001\u0012\u0006\u0010%\u001a\u00020$ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u001e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0002ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0002ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001b\u0001%\u0001\u00020$ø\u0001\u0001\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/onedelhi/secure/nl4;", "", "Lcom/onedelhi/secure/il4;", "", "index", "s", "([II)I", "value", "Lcom/onedelhi/secure/un4;", "z", "([III)V", "", "y", "([I)Ljava/util/Iterator;", "element", "", "l", "([II)Z", "elements", "n", "([ILjava/util/Collection;)Z", "x", "([I)Z", "", "A", "([I)Ljava/lang/String;", "w", "([I)I", "", "other", "o", "([ILjava/lang/Object;)Z", "u", "size", "g", "(I)[I", "", "storage", "i", "([I)[I", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class nl4 implements Collection<il4>, nx1 {
    @vr2

    /* renamed from: a */
    public final int[] f32578a;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0005\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0001\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/nl4$a;", "", "Lcom/onedelhi/secure/il4;", "", "hasNext", "a", "()I", "", "array", "<init>", "([I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.nl4$a */
    public static final class C6193a implements Iterator<il4>, nx1 {
        @vr2

        /* renamed from: a */
        public final int[] f32579a;

        /* renamed from: n */
        public int f32580n;

        public C6193a(@vr2 int[] iArr) {
            jt1.m53777p(iArr, "array");
            this.f32579a = iArr;
        }

        /* renamed from: a */
        public int mo41133a() {
            int i = this.f32580n;
            int[] iArr = this.f32579a;
            if (i < iArr.length) {
                this.f32580n = i + 1;
                return il4.m52435s(iArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f32580n));
        }

        public boolean hasNext() {
            return this.f32580n < this.f32579a.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return il4.m52414b(mo41133a());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @z73
    public /* synthetic */ nl4(int[] iArr) {
        this.f32578a = iArr;
    }

    /* renamed from: A */
    public static String m58200A(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    /* renamed from: f */
    public static final /* synthetic */ nl4 m58201f(int[] iArr) {
        return new nl4(iArr);
    }

    @vr2
    /* renamed from: g */
    public static int[] m58202g(int i) {
        return m58203i(new int[i]);
    }

    @vr2
    @z73
    /* renamed from: i */
    public static int[] m58203i(@vr2 int[] iArr) {
        jt1.m53777p(iArr, "storage");
        return iArr;
    }

    /* renamed from: l */
    public static boolean m58204l(int[] iArr, int i) {
        return C4478ab.m36667R8(iArr, i);
    }

    /* renamed from: n */
    public static boolean m58205n(int[] iArr, @vr2 Collection<il4> collection) {
        boolean z;
        jt1.m53777p(collection, "elements");
        if (!collection.isEmpty()) {
            for (T next : collection) {
                if (!(next instanceof il4) || !C4478ab.m36667R8(iArr, ((il4) next).mo38158r0())) {
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
    public static boolean m58206o(int[] iArr, Object obj) {
        return (obj instanceof nl4) && jt1.m53768g(iArr, ((nl4) obj).mo41113B());
    }

    /* renamed from: r */
    public static final boolean m58207r(int[] iArr, int[] iArr2) {
        return jt1.m53768g(iArr, iArr2);
    }

    /* renamed from: s */
    public static final int m58208s(int[] iArr, int i) {
        return il4.m52435s(iArr[i]);
    }

    /* renamed from: u */
    public static int m58209u(int[] iArr) {
        return iArr.length;
    }

    @z73
    /* renamed from: v */
    public static /* synthetic */ void m58210v() {
    }

    /* renamed from: w */
    public static int m58211w(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: x */
    public static boolean m58212x(int[] iArr) {
        return iArr.length == 0;
    }

    @vr2
    /* renamed from: y */
    public static Iterator<il4> m58213y(int[] iArr) {
        return new C6193a(iArr);
    }

    /* renamed from: z */
    public static final void m58214z(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    /* renamed from: B */
    public final /* synthetic */ int[] mo41113B() {
        return this.f32578a;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends il4> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean mo41116b(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof il4)) {
            return false;
        }
        return mo41124j(((il4) obj).mo38158r0());
    }

    public boolean containsAll(@vr2 Collection<? extends Object> collection) {
        jt1.m53777p(collection, "elements");
        return m58205n(this.f32578a, collection);
    }

    public boolean equals(Object obj) {
        return m58206o(this.f32578a, obj);
    }

    public int hashCode() {
        return m58211w(this.f32578a);
    }

    public boolean isEmpty() {
        return m58212x(this.f32578a);
    }

    @vr2
    public Iterator<il4> iterator() {
        return m58213y(this.f32578a);
    }

    /* renamed from: j */
    public boolean mo41124j(int i) {
        return m58204l(this.f32578a, i);
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
        return m58209u(this.f32578a);
    }

    public Object[] toArray() {
        return o00.m58878a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        jt1.m53777p(tArr, "array");
        return o00.m58879b(this, tArr);
    }

    public String toString() {
        return m58200A(this.f32578a);
    }
}
