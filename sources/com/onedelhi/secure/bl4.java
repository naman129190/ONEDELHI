package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@sw1
@oy0
@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0005\b@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0014\b\u0016\u0012\u0006\u0010!\u001a\u00020\u0003ø\u0001\u0001¢\u0006\u0004\b\"\u0010#B\u0014\b\u0001\u0012\u0006\u0010%\u001a\u00020$ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u001e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0002ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0002ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001b\u0001%\u0001\u00020$ø\u0001\u0001\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/onedelhi/secure/bl4;", "", "Lcom/onedelhi/secure/al4;", "", "index", "s", "([BI)B", "value", "Lcom/onedelhi/secure/un4;", "z", "([BIB)V", "", "y", "([B)Ljava/util/Iterator;", "element", "", "l", "([BB)Z", "elements", "n", "([BLjava/util/Collection;)Z", "x", "([B)Z", "", "A", "([B)Ljava/lang/String;", "w", "([B)I", "", "other", "o", "([BLjava/lang/Object;)Z", "u", "size", "g", "(I)[B", "", "storage", "i", "([B)[B", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class bl4 implements Collection<al4>, nx1 {
    @vr2

    /* renamed from: a */
    public final byte[] f26413a;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0005\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0001\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/bl4$a;", "", "Lcom/onedelhi/secure/al4;", "", "hasNext", "a", "()B", "", "array", "<init>", "([B)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.bl4$a */
    public static final class C4682a implements Iterator<al4>, nx1 {
        @vr2

        /* renamed from: a */
        public final byte[] f26414a;

        /* renamed from: n */
        public int f26415n;

        public C4682a(@vr2 byte[] bArr) {
            jt1.m53777p(bArr, "array");
            this.f26414a = bArr;
        }

        /* renamed from: a */
        public byte mo31944a() {
            int i = this.f26415n;
            byte[] bArr = this.f26414a;
            if (i < bArr.length) {
                this.f26415n = i + 1;
                return al4.m38850s(bArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f26415n));
        }

        public boolean hasNext() {
            return this.f26415n < this.f26414a.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return al4.m38830b(mo31944a());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @z73
    public /* synthetic */ bl4(byte[] bArr) {
        this.f26413a = bArr;
    }

    /* renamed from: A */
    public static String m40149A(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    /* renamed from: f */
    public static final /* synthetic */ bl4 m40150f(byte[] bArr) {
        return new bl4(bArr);
    }

    @vr2
    /* renamed from: g */
    public static byte[] m40151g(int i) {
        return m40152i(new byte[i]);
    }

    @vr2
    @z73
    /* renamed from: i */
    public static byte[] m40152i(@vr2 byte[] bArr) {
        jt1.m53777p(bArr, "storage");
        return bArr;
    }

    /* renamed from: l */
    public static boolean m40153l(byte[] bArr, byte b) {
        return C4478ab.m36539N8(bArr, b);
    }

    /* renamed from: n */
    public static boolean m40154n(byte[] bArr, @vr2 Collection<al4> collection) {
        boolean z;
        jt1.m53777p(collection, "elements");
        if (!collection.isEmpty()) {
            for (T next : collection) {
                if (!(next instanceof al4) || !C4478ab.m36539N8(bArr, ((al4) next).mo30974p0())) {
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
    public static boolean m40155o(byte[] bArr, Object obj) {
        return (obj instanceof bl4) && jt1.m53768g(bArr, ((bl4) obj).mo31924B());
    }

    /* renamed from: r */
    public static final boolean m40156r(byte[] bArr, byte[] bArr2) {
        return jt1.m53768g(bArr, bArr2);
    }

    /* renamed from: s */
    public static final byte m40157s(byte[] bArr, int i) {
        return al4.m38850s(bArr[i]);
    }

    /* renamed from: u */
    public static int m40158u(byte[] bArr) {
        return bArr.length;
    }

    @z73
    /* renamed from: v */
    public static /* synthetic */ void m40159v() {
    }

    /* renamed from: w */
    public static int m40160w(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* renamed from: x */
    public static boolean m40161x(byte[] bArr) {
        return bArr.length == 0;
    }

    @vr2
    /* renamed from: y */
    public static Iterator<al4> m40162y(byte[] bArr) {
        return new C4682a(bArr);
    }

    /* renamed from: z */
    public static final void m40163z(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    /* renamed from: B */
    public final /* synthetic */ byte[] mo31924B() {
        return this.f26413a;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends al4> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean mo31927b(byte b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof al4)) {
            return false;
        }
        return mo31935j(((al4) obj).mo30974p0());
    }

    public boolean containsAll(@vr2 Collection<? extends Object> collection) {
        jt1.m53777p(collection, "elements");
        return m40154n(this.f26413a, collection);
    }

    public boolean equals(Object obj) {
        return m40155o(this.f26413a, obj);
    }

    public int hashCode() {
        return m40160w(this.f26413a);
    }

    public boolean isEmpty() {
        return m40161x(this.f26413a);
    }

    @vr2
    public Iterator<al4> iterator() {
        return m40162y(this.f26413a);
    }

    /* renamed from: j */
    public boolean mo31935j(byte b) {
        return m40153l(this.f26413a, b);
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
        return m40158u(this.f26413a);
    }

    public Object[] toArray() {
        return o00.m58878a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        jt1.m53777p(tArr, "array");
        return o00.m58879b(this, tArr);
    }

    public String toString() {
        return m40149A(this.f26413a);
    }
}
