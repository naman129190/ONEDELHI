package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r\u0012\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010%J\u0018\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\n\u001a\u00020\tJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0001\u0010\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0012J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0013\u001a\u00020\u0005J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0005J\u0015\u0010\u0019\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\bR$\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00058\u0016@RX\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006&"}, d2 = {"Lcom/onedelhi/secure/sm3;", "T", "Lcom/onedelhi/secure/t0;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "get", "(I)Ljava/lang/Object;", "", "o", "", "iterator", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "maxCapacity", "l", "element", "Lcom/onedelhi/secure/un4;", "j", "(Ljava/lang/Object;)V", "n", "r", "<set-?>", "size", "I", "b", "()I", "buffer", "filledSize", "<init>", "([Ljava/lang/Object;I)V", "capacity", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class sm3<T> extends C6809t0<T> implements RandomAccess {
    @vr2

    /* renamed from: a */
    public final Object[] f35144a;

    /* renamed from: n */
    public final int f35145n;

    /* renamed from: o */
    public int f35146o;

    /* renamed from: p */
    public int f35147p;

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, d2 = {"com/onedelhi/secure/sm3$a", "Lcom/onedelhi/secure/s0;", "Lcom/onedelhi/secure/un4;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.sm3$a */
    public static final class C6784a extends C6725s0<T> {

        /* renamed from: a */
        public final /* synthetic */ sm3<T> f35148a;

        /* renamed from: n */
        public int f35149n;

        /* renamed from: o */
        public int f35150o;

        public C6784a(sm3<T> sm3) {
            this.f35148a = sm3;
            this.f35149n = sm3.size();
            this.f35150o = sm3.f35146o;
        }

        /* renamed from: a */
        public void mo38786a() {
            if (this.f35149n == 0) {
                mo44120b();
                return;
            }
            mo44121d(this.f35148a.f35144a[this.f35150o]);
            this.f35150o = (this.f35150o + 1) % this.f35148a.f35145n;
            this.f35149n--;
        }
    }

    public sm3(int i) {
        this(new Object[i], 0);
    }

    public sm3(@vr2 Object[] objArr, int i) {
        jt1.m53777p(objArr, "buffer");
        this.f35144a = objArr;
        boolean z = true;
        if (i >= 0) {
            if (i > objArr.length ? false : z) {
                this.f35145n = objArr.length;
                this.f35147p = i;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
    }

    /* renamed from: b */
    public int mo34341b() {
        return this.f35147p;
    }

    public T get(int i) {
        C6809t0.f35278a.mo44670b(i, size());
        return this.f35144a[(this.f35146o + i) % this.f35145n];
    }

    @vr2
    public Iterator<T> iterator() {
        return new C6784a(this);
    }

    /* renamed from: j */
    public final void mo44421j(T t) {
        if (!mo44424o()) {
            this.f35144a[(this.f35146o + size()) % this.f35145n] = t;
            this.f35147p = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    @vr2
    /* renamed from: l */
    public final sm3<T> mo44422l(int i) {
        Object[] objArr;
        int i2 = this.f35145n;
        int u = df3.m45219u(i2 + (i2 >> 1) + 1, i);
        if (this.f35146o == 0) {
            objArr = Arrays.copyOf(this.f35144a, u);
            jt1.m53776o(objArr, "copyOf(this, newSize)");
        } else {
            objArr = toArray(new Object[u]);
        }
        return new sm3<>(objArr, size());
    }

    /* renamed from: n */
    public final int mo44423n(int i, int i2) {
        return (i + i2) % this.f35145n;
    }

    /* renamed from: o */
    public final boolean mo44424o() {
        return size() == this.f35145n;
    }

    /* renamed from: r */
    public final void mo44425r(int i) {
        boolean z = true;
        if (i >= 0) {
            if (i > size()) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
            } else if (i > 0) {
                int i2 = this.f35146o;
                int g = (i2 + i) % this.f35145n;
                if (i2 > g) {
                    C7458za.m72944n2(this.f35144a, null, i2, this.f35145n);
                    C7458za.m72944n2(this.f35144a, null, 0, g);
                } else {
                    C7458za.m72944n2(this.f35144a, null, i2, g);
                }
                this.f35146o = g;
                this.f35147p = size() - i;
            }
        } else {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
    }

    @vr2
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @vr2
    public <T> T[] toArray(@vr2 T[] tArr) {
        jt1.m53777p(tArr, "array");
        if (tArr.length < size()) {
            tArr = Arrays.copyOf(tArr, size());
            jt1.m53776o(tArr, "copyOf(this, newSize)");
        }
        int size = size();
        int i = this.f35146o;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size && i < this.f35145n) {
            tArr[i3] = this.f35144a[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            tArr[i3] = this.f35144a[i2];
            i3++;
            i2++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        jt1.m53775n(tArr, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.RingBuffer.toArray>");
        return tArr;
    }
}
