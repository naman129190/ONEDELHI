package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@sw1
@oy0
@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0017\n\u0002\b\u0005\b@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0014\b\u0016\u0012\u0006\u0010!\u001a\u00020\u0003ø\u0001\u0001¢\u0006\u0004\b\"\u0010#B\u0014\b\u0001\u0012\u0006\u0010%\u001a\u00020$ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u001e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0002ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0002ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001b\u0001%\u0001\u00020$ø\u0001\u0001\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/onedelhi/secure/ym4;", "", "Lcom/onedelhi/secure/xm4;", "", "index", "s", "([SI)S", "value", "Lcom/onedelhi/secure/un4;", "z", "([SIS)V", "", "y", "([S)Ljava/util/Iterator;", "element", "", "l", "([SS)Z", "elements", "n", "([SLjava/util/Collection;)Z", "x", "([S)Z", "", "A", "([S)Ljava/lang/String;", "w", "([S)I", "", "other", "o", "([SLjava/lang/Object;)Z", "u", "size", "g", "(I)[S", "", "storage", "i", "([S)[S", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class ym4 implements Collection<xm4>, nx1 {
    @vr2

    /* renamed from: a */
    public final short[] f38014a;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0005\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0001\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/ym4$a;", "", "Lcom/onedelhi/secure/xm4;", "", "hasNext", "a", "()S", "", "array", "<init>", "([S)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.ym4$a */
    public static final class C7376a implements Iterator<xm4>, nx1 {
        @vr2

        /* renamed from: a */
        public final short[] f38015a;

        /* renamed from: n */
        public int f38016n;

        public C7376a(@vr2 short[] sArr) {
            jt1.m53777p(sArr, "array");
            this.f38015a = sArr;
        }

        /* renamed from: a */
        public short mo47885a() {
            int i = this.f38016n;
            short[] sArr = this.f38015a;
            if (i < sArr.length) {
                this.f38016n = i + 1;
                return xm4.m70712s(sArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f38016n));
        }

        public boolean hasNext() {
            return this.f38016n < this.f38015a.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return xm4.m70692b(mo47885a());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @z73
    public /* synthetic */ ym4(short[] sArr) {
        this.f38014a = sArr;
    }

    /* renamed from: A */
    public static String m71892A(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    /* renamed from: f */
    public static final /* synthetic */ ym4 m71893f(short[] sArr) {
        return new ym4(sArr);
    }

    @vr2
    /* renamed from: g */
    public static short[] m71894g(int i) {
        return m71895i(new short[i]);
    }

    @vr2
    @z73
    /* renamed from: i */
    public static short[] m71895i(@vr2 short[] sArr) {
        jt1.m53777p(sArr, "storage");
        return sArr;
    }

    /* renamed from: l */
    public static boolean m71896l(short[] sArr, short s) {
        return C4478ab.m36763U8(sArr, s);
    }

    /* renamed from: n */
    public static boolean m71897n(short[] sArr, @vr2 Collection<xm4> collection) {
        boolean z;
        jt1.m53777p(collection, "elements");
        if (!collection.isEmpty()) {
            for (T next : collection) {
                if (!(next instanceof xm4) || !C4478ab.m36763U8(sArr, ((xm4) next).mo47362p0())) {
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
    public static boolean m71898o(short[] sArr, Object obj) {
        return (obj instanceof ym4) && jt1.m53768g(sArr, ((ym4) obj).mo47865B());
    }

    /* renamed from: r */
    public static final boolean m71899r(short[] sArr, short[] sArr2) {
        return jt1.m53768g(sArr, sArr2);
    }

    /* renamed from: s */
    public static final short m71900s(short[] sArr, int i) {
        return xm4.m70712s(sArr[i]);
    }

    /* renamed from: u */
    public static int m71901u(short[] sArr) {
        return sArr.length;
    }

    @z73
    /* renamed from: v */
    public static /* synthetic */ void m71902v() {
    }

    /* renamed from: w */
    public static int m71903w(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* renamed from: x */
    public static boolean m71904x(short[] sArr) {
        return sArr.length == 0;
    }

    @vr2
    /* renamed from: y */
    public static Iterator<xm4> m71905y(short[] sArr) {
        return new C7376a(sArr);
    }

    /* renamed from: z */
    public static final void m71906z(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    /* renamed from: B */
    public final /* synthetic */ short[] mo47865B() {
        return this.f38014a;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends xm4> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean mo47868b(short s) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof xm4)) {
            return false;
        }
        return mo47876j(((xm4) obj).mo47362p0());
    }

    public boolean containsAll(@vr2 Collection<? extends Object> collection) {
        jt1.m53777p(collection, "elements");
        return m71897n(this.f38014a, collection);
    }

    public boolean equals(Object obj) {
        return m71898o(this.f38014a, obj);
    }

    public int hashCode() {
        return m71903w(this.f38014a);
    }

    public boolean isEmpty() {
        return m71904x(this.f38014a);
    }

    @vr2
    public Iterator<xm4> iterator() {
        return m71905y(this.f38014a);
    }

    /* renamed from: j */
    public boolean mo47876j(short s) {
        return m71896l(this.f38014a, s);
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
        return m71901u(this.f38014a);
    }

    public Object[] toArray() {
        return o00.m58878a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        jt1.m53777p(tArr, "array");
        return o00.m58879b(this, tArr);
    }

    public String toString() {
        return m71892A(this.f38014a);
    }
}
