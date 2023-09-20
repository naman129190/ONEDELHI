package com.onedelhi.secure;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@gz3(version = "1.4")
@tw4(markerClass = {ly0.class})
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001PB\u0011\b\u0016\u0012\u0006\u0010K\u001a\u00020\u0003¢\u0006\u0004\bL\u0010MB\t\b\u0016¢\u0006\u0004\bL\u0010NB\u0017\b\u0016\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\bL\u0010OJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0011\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\bJ\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u001e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0002J\u001d\u0010\u0018\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u0015H\bJ\b\u0010\u0019\u001a\u00020\u0016H\u0016J\r\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001e\u0010\u001bJ\u0015\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00028\u0000¢\u0006\u0004\b#\u0010\u001bJ\u000f\u0010$\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b$\u0010\u001bJ\r\u0010%\u001a\u00028\u0000¢\u0006\u0004\b%\u0010\u001bJ\u000f\u0010&\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b&\u0010\u001bJ\u0017\u0010'\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010'\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010)J\u0016\u0010*\u001a\u00020\u00162\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016J\u001e\u0010*\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016J\u0018\u0010+\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b+\u0010\u000bJ \u0010,\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b.\u0010(J\u0017\u0010/\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b2\u0010(J\u0017\u00103\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b3\u0010\u000bJ\u0016\u00104\u001a\u00020\u00162\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016J\u0016\u00105\u001a\u00020\u00162\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016J\b\u00106\u001a\u00020\u0005H\u0016J)\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000108\"\u0004\b\u0001\u001072\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u000108H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<08H\u0016¢\u0006\u0004\b:\u0010=J)\u0010>\u001a\b\u0012\u0004\u0012\u00028\u000108\"\u0004\b\u0001\u001072\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u000108H\u0000¢\u0006\u0004\b>\u0010;J\u0017\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<08H\u0000¢\u0006\u0004\b?\u0010=JO\u0010E\u001a\u00020\u00052>\u0010D\u001a:\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010<08¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00050@H\u0000¢\u0006\u0004\bE\u0010FR$\u0010H\u001a\u00020\u00032\u0006\u0010G\u001a\u00020\u00038\u0016@RX\u000e¢\u0006\f\n\u0004\bH\u0010?\u001a\u0004\bI\u0010J¨\u0006Q"}, d2 = {"Lcom/onedelhi/secure/ea;", "E", "Lcom/onedelhi/secure/b1;", "", "minCapacity", "Lcom/onedelhi/secure/un4;", "o", "newCapacity", "l", "internalIndex", "v", "(I)Ljava/lang/Object;", "index", "B", "A", "w", "u", "n", "", "elements", "j", "Lkotlin/Function1;", "", "predicate", "r", "isEmpty", "s", "()Ljava/lang/Object;", "t", "y", "z", "element", "g", "(Ljava/lang/Object;)V", "i", "C", "D", "F", "G", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "f", "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "J", "I", "Lkotlin/Function2;", "Lcom/onedelhi/secure/iy2;", "name", "head", "structure", "x", "(Lcom/onedelhi/secure/sc1;)V", "<set-?>", "size", "b", "()I", "initialCapacity", "<init>", "(I)V", "()V", "(Ljava/util/Collection;)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.ea */
public final class C5097ea<E> extends C4607b1<E> {
    @vr2

    /* renamed from: a */
    public static final C5098a f27749a = new C5098a((wg0) null);
    @vr2

    /* renamed from: b */
    public static final Object[] f27750b = new Object[0];

    /* renamed from: p */
    public static final int f27751p = 2147483639;

    /* renamed from: q */
    public static final int f27752q = 10;
    @vr2

    /* renamed from: a */
    public Object[] f27753a;

    /* renamed from: n */
    public int f27754n;

    /* renamed from: o */
    public int f27755o;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/ea$a;", "", "", "oldCapacity", "minCapacity", "a", "(II)I", "defaultMinCapacity", "I", "", "emptyElementData", "[Ljava/lang/Object;", "maxArraySize", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.ea$a */
    public static final class C5098a {
        public C5098a() {
        }

        public /* synthetic */ C5098a(wg0 wg0) {
            this();
        }

        /* renamed from: a */
        public final int mo34913a(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
        }
    }

    public C5097ea() {
        this.f27753a = f27750b;
    }

    public C5097ea(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f27750b;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
        this.f27753a = objArr;
    }

    public C5097ea(@vr2 Collection<? extends E> collection) {
        jt1.m53777p(collection, "elements");
        boolean z = false;
        Object[] array = collection.toArray(new Object[0]);
        jt1.m53775n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f27753a = array;
        this.f27755o = array.length;
        if (array.length == 0 ? true : z) {
            this.f27753a = f27750b;
        }
    }

    /* renamed from: A */
    public final int mo34876A(int i) {
        return i < 0 ? i + this.f27753a.length : i;
    }

    /* renamed from: B */
    public final int mo34877B(int i) {
        Object[] objArr = this.f27753a;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* renamed from: C */
    public final E mo34878C() {
        if (!isEmpty()) {
            E[] eArr = this.f27753a;
            int i = this.f27754n;
            E e = eArr[i];
            eArr[i] = null;
            this.f27754n = mo34907u(i);
            this.f27755o = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @ss2
    /* renamed from: D */
    public final E mo34879D() {
        if (isEmpty()) {
            return null;
        }
        return mo34878C();
    }

    /* renamed from: F */
    public final E mo34880F() {
        if (!isEmpty()) {
            int B = mo34877B(this.f27754n + s00.m64039H(this));
            E[] eArr = this.f27753a;
            E e = eArr[B];
            eArr[B] = null;
            this.f27755o = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @ss2
    /* renamed from: G */
    public final E mo34881G() {
        if (isEmpty()) {
            return null;
        }
        return mo34880F();
    }

    @vr2
    /* renamed from: I */
    public final Object[] mo34882I() {
        return toArray();
    }

    @vr2
    /* renamed from: J */
    public final <T> T[] mo34883J(@vr2 T[] tArr) {
        jt1.m53777p(tArr, "array");
        return toArray(tArr);
    }

    public void add(int i, E e) {
        C6809t0.f35278a.mo44671c(i, size());
        if (i == size()) {
            mo34891i(e);
        } else if (i == 0) {
            mo34889g(e);
        } else {
            mo34898o(size() + 1);
            int B = mo34877B(this.f27754n + i);
            if (i < ((size() + 1) >> 1)) {
                int n = mo34897n(B);
                int n2 = mo34897n(this.f27754n);
                int i2 = this.f27754n;
                if (n >= i2) {
                    Object[] objArr = this.f27753a;
                    objArr[n2] = objArr[i2];
                    C7458za.m72876c1(objArr, objArr, i2, i2 + 1, n + 1);
                } else {
                    Object[] objArr2 = this.f27753a;
                    C7458za.m72876c1(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.f27753a;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C7458za.m72876c1(objArr3, objArr3, 0, 1, n + 1);
                }
                this.f27753a[n] = e;
                this.f27754n = n2;
            } else {
                int B2 = mo34877B(this.f27754n + size());
                Object[] objArr4 = this.f27753a;
                if (B < B2) {
                    C7458za.m72876c1(objArr4, objArr4, B + 1, B, B2);
                } else {
                    C7458za.m72876c1(objArr4, objArr4, 1, 0, B2);
                    Object[] objArr5 = this.f27753a;
                    objArr5[0] = objArr5[objArr5.length - 1];
                    C7458za.m72876c1(objArr5, objArr5, B + 1, B, objArr5.length - 1);
                }
                this.f27753a[B] = e;
            }
            this.f27755o = size() + 1;
        }
    }

    public boolean add(E e) {
        mo34891i(e);
        return true;
    }

    public boolean addAll(int i, @vr2 Collection<? extends E> collection) {
        jt1.m53777p(collection, "elements");
        C6809t0.f35278a.mo44671c(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        mo34898o(size() + collection.size());
        int B = mo34877B(this.f27754n + size());
        int B2 = mo34877B(this.f27754n + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f27754n;
            int i3 = i2 - size;
            if (B2 < i2) {
                Object[] objArr = this.f27753a;
                C7458za.m72876c1(objArr, objArr, i3, i2, objArr.length);
                Object[] objArr2 = this.f27753a;
                if (size >= B2) {
                    C7458za.m72876c1(objArr2, objArr2, objArr2.length - size, 0, B2);
                } else {
                    C7458za.m72876c1(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f27753a;
                    C7458za.m72876c1(objArr3, objArr3, 0, size, B2);
                }
            } else if (i3 >= 0) {
                Object[] objArr4 = this.f27753a;
                C7458za.m72876c1(objArr4, objArr4, i3, i2, B2);
            } else {
                Object[] objArr5 = this.f27753a;
                i3 += objArr5.length;
                int i4 = B2 - i2;
                int length = objArr5.length - i3;
                if (length >= i4) {
                    C7458za.m72876c1(objArr5, objArr5, i3, i2, B2);
                } else {
                    C7458za.m72876c1(objArr5, objArr5, i3, i2, i2 + length);
                    Object[] objArr6 = this.f27753a;
                    C7458za.m72876c1(objArr6, objArr6, 0, this.f27754n + length, B2);
                }
            }
            this.f27754n = i3;
            mo34894j(mo34876A(B2 - size), collection);
        } else {
            int i5 = B2 + size;
            if (B2 < B) {
                int i6 = size + B;
                Object[] objArr7 = this.f27753a;
                if (i6 > objArr7.length) {
                    if (i5 >= objArr7.length) {
                        i5 -= objArr7.length;
                    } else {
                        int length2 = B - (i6 - objArr7.length);
                        C7458za.m72876c1(objArr7, objArr7, 0, length2, B);
                        Object[] objArr8 = this.f27753a;
                        C7458za.m72876c1(objArr8, objArr8, i5, B2, length2);
                    }
                }
                C7458za.m72876c1(objArr7, objArr7, i5, B2, B);
            } else {
                Object[] objArr9 = this.f27753a;
                C7458za.m72876c1(objArr9, objArr9, size, 0, B);
                Object[] objArr10 = this.f27753a;
                if (i5 >= objArr10.length) {
                    C7458za.m72876c1(objArr10, objArr10, i5 - objArr10.length, B2, objArr10.length);
                } else {
                    C7458za.m72876c1(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f27753a;
                    C7458za.m72876c1(objArr11, objArr11, i5, B2, objArr11.length - size);
                }
            }
            mo34894j(B2, collection);
        }
        return true;
    }

    public boolean addAll(@vr2 Collection<? extends E> collection) {
        jt1.m53777p(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        mo34898o(size() + collection.size());
        mo34894j(mo34877B(this.f27754n + size()), collection);
        return true;
    }

    /* renamed from: b */
    public int mo31300b() {
        return this.f27755o;
    }

    public void clear() {
        int B = mo34877B(this.f27754n + size());
        int i = this.f27754n;
        if (i < B) {
            C7458za.m72944n2(this.f27753a, null, i, B);
        } else if (!isEmpty()) {
            Object[] objArr = this.f27753a;
            C7458za.m72944n2(objArr, null, this.f27754n, objArr.length);
            C7458za.m72944n2(this.f27753a, null, 0, B);
        }
        this.f27754n = 0;
        this.f27755o = 0;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: f */
    public E mo31301f(int i) {
        C6809t0.f35278a.mo44670b(i, size());
        if (i == s00.m64039H(this)) {
            return mo34880F();
        }
        if (i == 0) {
            return mo34878C();
        }
        int B = mo34877B(this.f27754n + i);
        E e = this.f27753a[B];
        if (i < (size() >> 1)) {
            int i2 = this.f27754n;
            if (B >= i2) {
                Object[] objArr = this.f27753a;
                C7458za.m72876c1(objArr, objArr, i2 + 1, i2, B);
            } else {
                Object[] objArr2 = this.f27753a;
                C7458za.m72876c1(objArr2, objArr2, 1, 0, B);
                Object[] objArr3 = this.f27753a;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f27754n;
                C7458za.m72876c1(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.f27753a;
            int i4 = this.f27754n;
            objArr4[i4] = null;
            this.f27754n = mo34907u(i4);
        } else {
            int B2 = mo34877B(this.f27754n + s00.m64039H(this));
            Object[] objArr5 = this.f27753a;
            if (B <= B2) {
                C7458za.m72876c1(objArr5, objArr5, B, B + 1, B2 + 1);
            } else {
                C7458za.m72876c1(objArr5, objArr5, B, B + 1, objArr5.length);
                Object[] objArr6 = this.f27753a;
                objArr6[objArr6.length - 1] = objArr6[0];
                C7458za.m72876c1(objArr6, objArr6, 0, 1, B2 + 1);
            }
            this.f27753a[B2] = null;
        }
        this.f27755o = size() - 1;
        return e;
    }

    /* renamed from: g */
    public final void mo34889g(E e) {
        mo34898o(size() + 1);
        int n = mo34897n(this.f27754n);
        this.f27754n = n;
        this.f27753a[n] = e;
        this.f27755o = size() + 1;
    }

    public E get(int i) {
        C6809t0.f35278a.mo44670b(i, size());
        return this.f27753a[mo34877B(this.f27754n + i)];
    }

    /* renamed from: i */
    public final void mo34891i(E e) {
        mo34898o(size() + 1);
        this.f27753a[mo34877B(this.f27754n + size())] = e;
        this.f27755o = size() + 1;
    }

    public int indexOf(Object obj) {
        int B = mo34877B(this.f27754n + size());
        int i = this.f27754n;
        if (i < B) {
            while (i < B) {
                if (!jt1.m53768g(obj, this.f27753a[i])) {
                    i++;
                }
            }
            return -1;
        } else if (i < B) {
            return -1;
        } else {
            int length = this.f27753a.length;
            while (true) {
                if (i >= length) {
                    int i2 = 0;
                    while (i2 < B) {
                        if (jt1.m53768g(obj, this.f27753a[i2])) {
                            i = i2 + this.f27753a.length;
                        } else {
                            i2++;
                        }
                    }
                    return -1;
                } else if (jt1.m53768g(obj, this.f27753a[i])) {
                    break;
                } else {
                    i++;
                }
            }
        }
        return i - this.f27754n;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final void mo34894j(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f27753a.length;
        while (i < length && it.hasNext()) {
            this.f27753a[i] = it.next();
            i++;
        }
        int i2 = this.f27754n;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f27753a[i3] = it.next();
        }
        this.f27755o = size() + collection.size();
    }

    /* renamed from: l */
    public final void mo34895l(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f27753a;
        C7458za.m72876c1(objArr2, objArr, 0, this.f27754n, objArr2.length);
        Object[] objArr3 = this.f27753a;
        int length = objArr3.length;
        int i2 = this.f27754n;
        C7458za.m72876c1(objArr3, objArr, length - i2, 0, i2);
        this.f27754n = 0;
        this.f27753a = objArr;
    }

    public int lastIndexOf(Object obj) {
        int i;
        int B = mo34877B(this.f27754n + size());
        int i2 = this.f27754n;
        if (i2 < B) {
            i = B - 1;
            if (i2 <= i) {
                while (!jt1.m53768g(obj, this.f27753a[i])) {
                    if (i != i2) {
                        i--;
                    }
                }
            }
            return -1;
        }
        if (i2 > B) {
            int i3 = B - 1;
            while (true) {
                if (-1 >= i3) {
                    int Xe = C4478ab.m36866Xe(this.f27753a);
                    int i4 = this.f27754n;
                    if (i4 <= Xe) {
                        while (!jt1.m53768g(obj, this.f27753a[i])) {
                            if (i != i4) {
                                Xe = i - 1;
                            }
                        }
                    }
                } else if (jt1.m53768g(obj, this.f27753a[i3])) {
                    i = i3 + this.f27753a.length;
                    break;
                } else {
                    i3--;
                }
            }
        }
        return -1;
        return i - this.f27754n;
    }

    /* renamed from: n */
    public final int mo34897n(int i) {
        return i == 0 ? C4478ab.m36866Xe(this.f27753a) : i - 1;
    }

    /* renamed from: o */
    public final void mo34898o(int i) {
        if (i >= 0) {
            Object[] objArr = this.f27753a;
            if (i > objArr.length) {
                if (objArr == f27750b) {
                    this.f27753a = new Object[df3.m45198n(i, 10)];
                } else {
                    mo34895l(f27749a.mo34913a(objArr.length, i));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo34899r(com.onedelhi.secure.ec1<? super E, java.lang.Boolean> r12) {
        /*
            r11 = this;
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x00a0
            java.lang.Object[] r0 = r11.f27753a
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 == 0) goto L_0x0014
            goto L_0x00a0
        L_0x0014:
            int r0 = r11.f27754n
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.mo34877B(r0)
            int r3 = r11.f27754n
            r4 = 0
            if (r3 >= r0) goto L_0x0049
            r5 = r3
        L_0x0025:
            if (r3 >= r0) goto L_0x0043
            java.lang.Object[] r6 = r11.f27753a
            r6 = r6[r3]
            java.lang.Object r7 = r12.mo17094X(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x003f
            java.lang.Object[] r7 = r11.f27753a
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r1 = 1
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x0025
        L_0x0043:
            java.lang.Object[] r12 = r11.f27753a
            com.onedelhi.secure.C7458za.m72944n2(r12, r4, r5, r0)
            goto L_0x0095
        L_0x0049:
            java.lang.Object[] r5 = r11.f27753a
            int r5 = r5.length
            r6 = r3
            r7 = 0
        L_0x004e:
            if (r3 >= r5) goto L_0x006e
            java.lang.Object[] r8 = r11.f27753a
            r9 = r8[r3]
            r8[r3] = r4
            java.lang.Object r8 = r12.mo17094X(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x006a
            java.lang.Object[] r8 = r11.f27753a
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x006b
        L_0x006a:
            r7 = 1
        L_0x006b:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x006e:
            int r3 = r11.mo34877B(r6)
            r5 = r3
        L_0x0073:
            if (r1 >= r0) goto L_0x0094
            java.lang.Object[] r3 = r11.f27753a
            r6 = r3[r1]
            r3[r1] = r4
            java.lang.Object r3 = r12.mo17094X(r6)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0090
            java.lang.Object[] r3 = r11.f27753a
            r3[r5] = r6
            int r5 = r11.mo34907u(r5)
            goto L_0x0091
        L_0x0090:
            r7 = 1
        L_0x0091:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x0094:
            r1 = r7
        L_0x0095:
            if (r1 == 0) goto L_0x00a0
            int r12 = r11.f27754n
            int r5 = r5 - r12
            int r12 = r11.mo34876A(r5)
            r11.f27755o = r12
        L_0x00a0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5097ea.mo34899r(com.onedelhi.secure.ec1):boolean");
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(@com.onedelhi.secure.vr2 java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            com.onedelhi.secure.jt1.m53777p(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0096
            java.lang.Object[] r0 = r11.f27753a
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0096
        L_0x0019:
            int r0 = r11.f27754n
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.mo34877B(r0)
            int r3 = r11.f27754n
            r4 = 0
            if (r3 >= r0) goto L_0x0049
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0043
            java.lang.Object[] r6 = r11.f27753a
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x003f
            java.lang.Object[] r7 = r11.f27753a
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r1 = 1
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0043:
            java.lang.Object[] r12 = r11.f27753a
            com.onedelhi.secure.C7458za.m72944n2(r12, r4, r5, r0)
            goto L_0x008b
        L_0x0049:
            java.lang.Object[] r5 = r11.f27753a
            int r5 = r5.length
            r6 = r3
            r7 = 0
        L_0x004e:
            if (r3 >= r5) goto L_0x0069
            java.lang.Object[] r8 = r11.f27753a
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0065
            java.lang.Object[] r8 = r11.f27753a
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0069:
            int r3 = r11.mo34877B(r6)
            r5 = r3
        L_0x006e:
            if (r1 >= r0) goto L_0x008a
            java.lang.Object[] r3 = r11.f27753a
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0086
            java.lang.Object[] r3 = r11.f27753a
            r3[r5] = r6
            int r5 = r11.mo34907u(r5)
            goto L_0x0087
        L_0x0086:
            r7 = 1
        L_0x0087:
            int r1 = r1 + 1
            goto L_0x006e
        L_0x008a:
            r1 = r7
        L_0x008b:
            if (r1 == 0) goto L_0x0096
            int r12 = r11.f27754n
            int r5 = r5 - r12
            int r12 = r11.mo34876A(r5)
            r11.f27755o = r12
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5097ea.removeAll(java.util.Collection):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(@com.onedelhi.secure.vr2 java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            com.onedelhi.secure.jt1.m53777p(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r11.f27753a
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0093
        L_0x0019:
            int r0 = r11.f27754n
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.mo34877B(r0)
            int r3 = r11.f27754n
            r4 = 0
            if (r3 >= r0) goto L_0x0048
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0042
            java.lang.Object[] r6 = r11.f27753a
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x003e
            java.lang.Object[] r7 = r11.f27753a
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0042:
            java.lang.Object[] r12 = r11.f27753a
            com.onedelhi.secure.C7458za.m72944n2(r12, r4, r5, r0)
            goto L_0x0088
        L_0x0048:
            java.lang.Object[] r5 = r11.f27753a
            int r5 = r5.length
            r6 = r3
            r7 = 0
        L_0x004d:
            if (r3 >= r5) goto L_0x0067
            java.lang.Object[] r8 = r11.f27753a
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0063
            java.lang.Object[] r8 = r11.f27753a
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0064
        L_0x0063:
            r7 = 1
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0067:
            int r3 = r11.mo34877B(r6)
            r5 = r3
        L_0x006c:
            if (r1 >= r0) goto L_0x0087
            java.lang.Object[] r3 = r11.f27753a
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            if (r3 == 0) goto L_0x0083
            java.lang.Object[] r3 = r11.f27753a
            r3[r5] = r6
            int r5 = r11.mo34907u(r5)
            goto L_0x0084
        L_0x0083:
            r7 = 1
        L_0x0084:
            int r1 = r1 + 1
            goto L_0x006c
        L_0x0087:
            r1 = r7
        L_0x0088:
            if (r1 == 0) goto L_0x0093
            int r12 = r11.f27754n
            int r5 = r5 - r12
            int r12 = r11.mo34876A(r5)
            r11.f27755o = r12
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5097ea.retainAll(java.util.Collection):boolean");
    }

    /* renamed from: s */
    public final E mo34903s() {
        if (!isEmpty()) {
            return this.f27753a[this.f27754n];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public E set(int i, E e) {
        C6809t0.f35278a.mo44670b(i, size());
        int B = mo34877B(this.f27754n + i);
        E[] eArr = this.f27753a;
        E e2 = eArr[B];
        eArr[B] = e;
        return e2;
    }

    @ss2
    /* renamed from: t */
    public final E mo34904t() {
        if (isEmpty()) {
            return null;
        }
        return this.f27753a[this.f27754n];
    }

    @vr2
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @vr2
    public <T> T[] toArray(@vr2 T[] tArr) {
        jt1.m53777p(tArr, "array");
        if (tArr.length < size()) {
            tArr = C7229xa.m70110a(tArr, size());
        }
        jt1.m53775n(tArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int B = mo34877B(this.f27754n + size());
        int i = this.f27754n;
        if (i < B) {
            C7458za.m72930l1(this.f27753a, tArr, 0, i, B, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f27753a;
            C7458za.m72876c1(objArr, tArr, 0, this.f27754n, objArr.length);
            Object[] objArr2 = this.f27753a;
            C7458za.m72876c1(objArr2, tArr, objArr2.length - this.f27754n, 0, B);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    /* renamed from: u */
    public final int mo34907u(int i) {
        if (i == C4478ab.m36866Xe(this.f27753a)) {
            return 0;
        }
        return i + 1;
    }

    @xq1
    /* renamed from: v */
    public final E mo34908v(int i) {
        return this.f27753a[i];
    }

    @xq1
    /* renamed from: w */
    public final int mo34909w(int i) {
        return mo34877B(this.f27754n + i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r1 = r2.f27754n;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34910x(@com.onedelhi.secure.vr2 com.onedelhi.secure.sc1<? super java.lang.Integer, ? super java.lang.Object[], com.onedelhi.secure.un4> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "structure"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            int r0 = r2.f27754n
            int r1 = r2.size()
            int r0 = r0 + r1
            int r0 = r2.mo34877B(r0)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0020
            int r1 = r2.f27754n
            if (r1 >= r0) goto L_0x001b
            goto L_0x0020
        L_0x001b:
            java.lang.Object[] r0 = r2.f27753a
            int r0 = r0.length
            int r1 = r1 - r0
            goto L_0x0022
        L_0x0020:
            int r1 = r2.f27754n
        L_0x0022:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = r2.toArray()
            r3.mo21054h0(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5097ea.mo34910x(com.onedelhi.secure.sc1):void");
    }

    /* renamed from: y */
    public final E mo34911y() {
        if (!isEmpty()) {
            return this.f27753a[mo34877B(this.f27754n + s00.m64039H(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @ss2
    /* renamed from: z */
    public final E mo34912z() {
        if (isEmpty()) {
            return null;
        }
        return this.f27753a[mo34877B(this.f27754n + s00.m64039H(this))];
    }
}
