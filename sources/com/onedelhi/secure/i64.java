package com.onedelhi.secure;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002R\u0014\u0010\f\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/onedelhi/secure/i64;", "T", "Lcom/onedelhi/secure/zt3;", "Lcom/onedelhi/secure/sp0;", "", "n", "a", "b", "", "iterator", "f", "()I", "count", "sequence", "startIndex", "endIndex", "<init>", "(Lcom/onedelhi/secure/zt3;II)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class i64<T> implements zt3<T>, sp0<T> {

    /* renamed from: a */
    public final int f30089a;
    @vr2

    /* renamed from: a */
    public final zt3<T> f30090a;

    /* renamed from: b */
    public final int f30091b;

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"com/onedelhi/secure/i64$a", "", "", "hasNext", "next", "()Ljava/lang/Object;", "Lcom/onedelhi/secure/un4;", "a", "iterator", "Ljava/util/Iterator;", "b", "()Ljava/util/Iterator;", "", "position", "I", "d", "()I", "f", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.i64$a */
    public static final class C5664a implements Iterator<T>, nx1 {

        /* renamed from: a */
        public final /* synthetic */ i64<T> f30092a;
        @vr2

        /* renamed from: a */
        public final Iterator<T> f30093a;

        /* renamed from: n */
        public int f30094n;

        public C5664a(i64<T> i64) {
            this.f30092a = i64;
            this.f30093a = i64.f30090a.iterator();
        }

        /* renamed from: a */
        public final void mo37861a() {
            while (this.f30094n < this.f30092a.f30089a && this.f30093a.hasNext()) {
                this.f30093a.next();
                this.f30094n++;
            }
        }

        @vr2
        /* renamed from: b */
        public final Iterator<T> mo37862b() {
            return this.f30093a;
        }

        /* renamed from: d */
        public final int mo37863d() {
            return this.f30094n;
        }

        /* renamed from: f */
        public final void mo37864f(int i) {
            this.f30094n = i;
        }

        public boolean hasNext() {
            mo37861a();
            return this.f30094n < this.f30092a.f30091b && this.f30093a.hasNext();
        }

        public T next() {
            mo37861a();
            if (this.f30094n < this.f30092a.f30091b) {
                this.f30094n++;
                return this.f30093a.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i64(@vr2 zt3<? extends T> zt3, int i, int i2) {
        jt1.m53777p(zt3, "sequence");
        this.f30090a = zt3;
        this.f30089a = i;
        this.f30091b = i2;
        boolean z = true;
        if (i >= 0) {
            if (i2 >= 0) {
                if (!(i2 < i ? false : z)) {
                    throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i2 + " < " + i).toString());
                }
                return;
            }
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i2).toString());
        }
        throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i).toString());
    }

    @vr2
    /* renamed from: a */
    public zt3<T> mo37858a(int i) {
        return i >= mo37860f() ? fu3.m48489g() : new i64(this.f30090a, this.f30089a + i, this.f30091b);
    }

    @vr2
    /* renamed from: b */
    public zt3<T> mo37859b(int i) {
        if (i >= mo37860f()) {
            return this;
        }
        zt3<T> zt3 = this.f30090a;
        int i2 = this.f30089a;
        return new i64(zt3, i2, i + i2);
    }

    /* renamed from: f */
    public final int mo37860f() {
        return this.f30091b - this.f30089a;
    }

    @vr2
    public Iterator<T> iterator() {
        return new C5664a(this);
    }
}
