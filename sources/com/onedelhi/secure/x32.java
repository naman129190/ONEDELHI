package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0001VBO\b\u0002\u0012\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0010L\u001a\u00020\n\u0012\u0006\u0010M\u001a\u00020\n\u0012\u0006\u0010N\u001a\u00020\u0013\u0012\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\bQ\u0010RB\t\b\u0016¢\u0006\u0004\bQ\u0010SB\u0011\b\u0016\u0012\u0006\u0010T\u001a\u00020\n¢\u0006\u0004\bQ\u0010UJ\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0014\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0018J&\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0017\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0002J.\u0010\"\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010!\u001a\u00020\u0013H\u0002J\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\b\u0010$\u001a\u00020\u0013H\u0016J\u0018\u0010&\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010\u001dJ \u0010'\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0002J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0016J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010%\u001a\u00020\nH\u0016J\u0017\u00100\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00100\u001a\u00020\f2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u0010\u0018J\u0016\u00102\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u001e\u00102\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\b\u00103\u001a\u00020\fH\u0016J\u0017\u00104\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u0010\u001dJ\u0017\u00105\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b5\u00101J\u0016\u00106\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u0016\u00107\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u001e\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020\nH\u0016J)\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010<\"\u0004\b\u0001\u0010;2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00010<H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0<H\u0016¢\u0006\u0004\b>\u0010@J\u0013\u0010A\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010B\u001a\u00020\nH\u0016J\b\u0010D\u001a\u00020CH\u0016R\u0014\u0010G\u001a\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006W"}, d2 = {"Lcom/onedelhi/secure/x32;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lcom/onedelhi/secure/b1;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "A", "", "minCapacity", "Lcom/onedelhi/secure/un4;", "t", "r", "n", "u", "", "other", "", "s", "i", "v", "element", "(ILjava/lang/Object;)V", "", "elements", "l", "x", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "y", "retain", "z", "o", "isEmpty", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "", "listIterator", "add", "(Ljava/lang/Object;)Z", "addAll", "clear", "f", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "T", "", "destination", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "", "toString", "w", "()Z", "isEffectivelyReadOnly", "b", "()I", "size", "array", "offset", "length", "isReadOnly", "backing", "root", "<init>", "([Ljava/lang/Object;IIZLcom/onedelhi/secure/x32;Lcom/onedelhi/secure/x32;)V", "()V", "initialCapacity", "(I)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class x32<E> extends C4607b1<E> implements List<E>, RandomAccess, Serializable, rx1 {
    @ss2

    /* renamed from: a */
    public final x32<E> f37314a;
    @vr2

    /* renamed from: a */
    public E[] f37315a;
    @ss2

    /* renamed from: b */
    public final x32<E> f37316b;

    /* renamed from: b */
    public boolean f37317b;

    /* renamed from: n */
    public int f37318n;

    /* renamed from: o */
    public int f37319o;

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\b\u0016\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\b\u0010\u0011\u001a\u00020\rH\u0016¨\u0006\u0017"}, d2 = {"Lcom/onedelhi/secure/x32$a;", "E", "", "", "hasPrevious", "hasNext", "", "previousIndex", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "Lcom/onedelhi/secure/un4;", "set", "(Ljava/lang/Object;)V", "add", "remove", "Lcom/onedelhi/secure/x32;", "list", "index", "<init>", "(Lcom/onedelhi/secure/x32;I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.x32$a */
    public static final class C7216a<E> implements ListIterator<E>, sx1 {
        @vr2

        /* renamed from: a */
        public final x32<E> f37320a;

        /* renamed from: n */
        public int f37321n;

        /* renamed from: o */
        public int f37322o = -1;

        public C7216a(@vr2 x32<E> x32, int i) {
            jt1.m53777p(x32, "list");
            this.f37320a = x32;
            this.f37321n = i;
        }

        public void add(E e) {
            x32<E> x32 = this.f37320a;
            int i = this.f37321n;
            this.f37321n = i + 1;
            x32.add(i, e);
            this.f37322o = -1;
        }

        public boolean hasNext() {
            return this.f37321n < this.f37320a.f37319o;
        }

        public boolean hasPrevious() {
            return this.f37321n > 0;
        }

        public E next() {
            if (this.f37321n < this.f37320a.f37319o) {
                int i = this.f37321n;
                this.f37321n = i + 1;
                this.f37322o = i;
                return this.f37320a.f37315a[this.f37320a.f37318n + this.f37322o];
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.f37321n;
        }

        public E previous() {
            int i = this.f37321n;
            if (i > 0) {
                int i2 = i - 1;
                this.f37321n = i2;
                this.f37322o = i2;
                return this.f37320a.f37315a[this.f37320a.f37318n + this.f37322o];
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f37321n - 1;
        }

        public void remove() {
            int i = this.f37322o;
            if (i != -1) {
                this.f37320a.remove(i);
                this.f37321n = this.f37322o;
                this.f37322o = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        public void set(E e) {
            int i = this.f37322o;
            if (i != -1) {
                this.f37320a.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public x32() {
        this(10);
    }

    public x32(int i) {
        this(y32.m71205d(i), 0, 0, false, (x32) null, (x32) null);
    }

    public x32(E[] eArr, int i, int i2, boolean z, x32<E> x32, x32<E> x322) {
        this.f37315a = eArr;
        this.f37318n = i;
        this.f37319o = i2;
        this.f37317b = z;
        this.f37314a = x32;
        this.f37316b = x322;
    }

    /* renamed from: A */
    public final Object mo46987A() {
        if (mo47016w()) {
            return new ku3(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public void add(int i, E e) {
        mo47004r();
        C6809t0.f35278a.mo44671c(i, this.f37319o);
        mo47002n(this.f37318n + i, e);
    }

    public boolean add(E e) {
        mo47004r();
        mo47002n(this.f37318n + this.f37319o, e);
        return true;
    }

    public boolean addAll(int i, @vr2 Collection<? extends E> collection) {
        jt1.m53777p(collection, "elements");
        mo47004r();
        C6809t0.f35278a.mo44671c(i, this.f37319o);
        int size = collection.size();
        mo46998l(this.f37318n + i, collection, size);
        return size > 0;
    }

    public boolean addAll(@vr2 Collection<? extends E> collection) {
        jt1.m53777p(collection, "elements");
        mo47004r();
        int size = collection.size();
        mo46998l(this.f37318n + this.f37319o, collection, size);
        return size > 0;
    }

    /* renamed from: b */
    public int mo31300b() {
        return this.f37319o;
    }

    public void clear() {
        mo47004r();
        mo47018y(this.f37318n, this.f37319o);
    }

    public boolean equals(@ss2 Object obj) {
        return obj == this || ((obj instanceof List) && mo47008s((List) obj));
    }

    /* renamed from: f */
    public E mo31301f(int i) {
        mo47004r();
        C6809t0.f35278a.mo44670b(i, this.f37319o);
        return mo47017x(this.f37318n + i);
    }

    public E get(int i) {
        C6809t0.f35278a.mo44670b(i, this.f37319o);
        return this.f37315a[this.f37318n + i];
    }

    public int hashCode() {
        return y32.m71210i(this.f37315a, this.f37318n, this.f37319o);
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < this.f37319o; i++) {
            if (jt1.m53768g(this.f37315a[this.f37318n + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f37319o == 0;
    }

    @vr2
    public Iterator<E> iterator() {
        return new C7216a(this, 0);
    }

    /* renamed from: l */
    public final void mo46998l(int i, Collection<? extends E> collection, int i2) {
        x32<E> x32 = this.f37314a;
        if (x32 != null) {
            x32.mo46998l(i, collection, i2);
            this.f37315a = this.f37314a.f37315a;
            this.f37319o += i2;
            return;
        }
        mo47015v(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f37315a[i + i3] = it.next();
        }
    }

    public int lastIndexOf(Object obj) {
        for (int i = this.f37319o - 1; i >= 0; i--) {
            if (jt1.m53768g(this.f37315a[this.f37318n + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @vr2
    public ListIterator<E> listIterator() {
        return new C7216a(this, 0);
    }

    @vr2
    public ListIterator<E> listIterator(int i) {
        C6809t0.f35278a.mo44671c(i, this.f37319o);
        return new C7216a(this, i);
    }

    /* renamed from: n */
    public final void mo47002n(int i, E e) {
        x32<E> x32 = this.f37314a;
        if (x32 != null) {
            x32.mo47002n(i, e);
            this.f37315a = this.f37314a.f37315a;
            this.f37319o++;
            return;
        }
        mo47015v(i, 1);
        this.f37315a[i] = e;
    }

    @vr2
    /* renamed from: o */
    public final List<E> mo47003o() {
        if (this.f37314a == null) {
            mo47004r();
            this.f37317b = true;
            return this;
        }
        throw new IllegalStateException();
    }

    /* renamed from: r */
    public final void mo47004r() {
        if (mo47016w()) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean remove(Object obj) {
        mo47004r();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    public boolean removeAll(@vr2 Collection<? extends Object> collection) {
        jt1.m53777p(collection, "elements");
        mo47004r();
        return mo47019z(this.f37318n, this.f37319o, collection, false) > 0;
    }

    public boolean retainAll(@vr2 Collection<? extends Object> collection) {
        jt1.m53777p(collection, "elements");
        mo47004r();
        return mo47019z(this.f37318n, this.f37319o, collection, true) > 0;
    }

    /* renamed from: s */
    public final boolean mo47008s(List<?> list) {
        return y32.m71209h(this.f37315a, this.f37318n, this.f37319o, list);
    }

    public E set(int i, E e) {
        mo47004r();
        C6809t0.f35278a.mo44670b(i, this.f37319o);
        E[] eArr = this.f37315a;
        int i2 = this.f37318n;
        E e2 = eArr[i2 + i];
        eArr[i2 + i] = e;
        return e2;
    }

    @vr2
    public List<E> subList(int i, int i2) {
        C6809t0.f35278a.mo44672d(i, i2, this.f37319o);
        E[] eArr = this.f37315a;
        int i3 = this.f37318n + i;
        int i4 = i2 - i;
        boolean z = this.f37317b;
        x32<E> x32 = this.f37316b;
        return new x32(eArr, i3, i4, z, this, x32 == null ? this : x32);
    }

    /* renamed from: t */
    public final void mo47010t(int i) {
        if (this.f37314a != null) {
            throw new IllegalStateException();
        } else if (i >= 0) {
            E[] eArr = this.f37315a;
            if (i > eArr.length) {
                this.f37315a = y32.m71206e(this.f37315a, C5097ea.f27749a.mo34913a(eArr.length, i));
            }
        } else {
            throw new OutOfMemoryError();
        }
    }

    @vr2
    public Object[] toArray() {
        E[] eArr = this.f37315a;
        int i = this.f37318n;
        Object[] M1 = C7458za.m72781M1(eArr, i, this.f37319o + i);
        jt1.m53775n(M1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return M1;
    }

    @vr2
    public <T> T[] toArray(@vr2 T[] tArr) {
        jt1.m53777p(tArr, FirebaseAnalytics.C4305d.f24996z);
        int length = tArr.length;
        int i = this.f37319o;
        if (length < i) {
            E[] eArr = this.f37315a;
            int i2 = this.f37318n;
            T[] copyOfRange = Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
            jt1.m53776o(copyOfRange, "copyOfRange(array, offse…h, destination.javaClass)");
            return copyOfRange;
        }
        E[] eArr2 = this.f37315a;
        jt1.m53775n(eArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilder.toArray>");
        int i3 = this.f37318n;
        C7458za.m72876c1(eArr2, tArr, 0, i3, this.f37319o + i3);
        int length2 = tArr.length;
        int i4 = this.f37319o;
        if (length2 > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    @vr2
    public String toString() {
        return y32.m71211j(this.f37315a, this.f37318n, this.f37319o);
    }

    /* renamed from: u */
    public final void mo47014u(int i) {
        mo47010t(this.f37319o + i);
    }

    /* renamed from: v */
    public final void mo47015v(int i, int i2) {
        mo47014u(i2);
        E[] eArr = this.f37315a;
        C7458za.m72876c1(eArr, eArr, i + i2, i, this.f37318n + this.f37319o);
        this.f37319o += i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f37316b;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47016w() {
        /*
            r1 = this;
            boolean r0 = r1.f37317b
            if (r0 != 0) goto L_0x000f
            com.onedelhi.secure.x32<E> r0 = r1.f37316b
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.f37317b
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.x32.mo47016w():boolean");
    }

    /* renamed from: x */
    public final E mo47017x(int i) {
        x32<E> x32 = this.f37314a;
        if (x32 != null) {
            this.f37319o--;
            return x32.mo47017x(i);
        }
        E[] eArr = this.f37315a;
        E e = eArr[i];
        C7458za.m72876c1(eArr, eArr, i, i + 1, this.f37318n + this.f37319o);
        y32.m71207f(this.f37315a, (this.f37318n + this.f37319o) - 1);
        this.f37319o--;
        return e;
    }

    /* renamed from: y */
    public final void mo47018y(int i, int i2) {
        x32<E> x32 = this.f37314a;
        if (x32 != null) {
            x32.mo47018y(i, i2);
        } else {
            E[] eArr = this.f37315a;
            C7458za.m72876c1(eArr, eArr, i, i + i2, this.f37319o);
            E[] eArr2 = this.f37315a;
            int i3 = this.f37319o;
            y32.m71208g(eArr2, i3 - i2, i3);
        }
        this.f37319o -= i2;
    }

    /* renamed from: z */
    public final int mo47019z(int i, int i2, Collection<? extends E> collection, boolean z) {
        x32<E> x32 = this.f37314a;
        if (x32 != null) {
            int z2 = x32.mo47019z(i, i2, collection, z);
            this.f37319o -= z2;
            return z2;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f37315a[i5]) == z) {
                E[] eArr = this.f37315a;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.f37315a;
        C7458za.m72876c1(eArr2, eArr2, i + i4, i2 + i, this.f37319o);
        E[] eArr3 = this.f37315a;
        int i7 = this.f37319o;
        y32.m71208g(eArr3, i7 - i6, i7);
        this.f37319o -= i6;
        return i6;
    }
}
