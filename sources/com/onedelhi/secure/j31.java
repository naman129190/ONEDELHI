package com.onedelhi.secure;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/j31;", "T", "Lcom/onedelhi/secure/zt3;", "", "iterator", "sequence", "", "sendWhen", "Lkotlin/Function1;", "predicate", "<init>", "(Lcom/onedelhi/secure/zt3;ZLcom/onedelhi/secure/ec1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class j31<T> implements zt3<T> {
    @vr2

    /* renamed from: a */
    public final ec1<T, Boolean> f30563a;
    @vr2

    /* renamed from: a */
    public final zt3<T> f30564a;

    /* renamed from: a */
    public final boolean f30565a;

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0003\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/onedelhi/secure/j31$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "Lcom/onedelhi/secure/un4;", "a", "iterator", "Ljava/util/Iterator;", "b", "()Ljava/util/Iterator;", "", "nextState", "I", "f", "()I", "i", "(I)V", "nextItem", "Ljava/lang/Object;", "d", "h", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.j31$a */
    public static final class C5761a implements Iterator<T>, nx1 {

        /* renamed from: a */
        public final /* synthetic */ j31<T> f30566a;
        @ss2

        /* renamed from: a */
        public T f30567a;
        @vr2

        /* renamed from: a */
        public final Iterator<T> f30568a;

        /* renamed from: n */
        public int f30569n = -1;

        public C5761a(j31<T> j31) {
            this.f30566a = j31;
            this.f30568a = j31.f30564a.iterator();
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38389a() {
            /*
                r3 = this;
            L_0x0000:
                java.util.Iterator<T> r0 = r3.f30568a
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L_0x002c
                java.util.Iterator<T> r0 = r3.f30568a
                java.lang.Object r0 = r0.next()
                com.onedelhi.secure.j31<T> r1 = r3.f30566a
                com.onedelhi.secure.ec1 r1 = r1.f30563a
                java.lang.Object r1 = r1.mo17094X(r0)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                com.onedelhi.secure.j31<T> r2 = r3.f30566a
                boolean r2 = r2.f30565a
                if (r1 != r2) goto L_0x0000
                r3.f30567a = r0
                r0 = 1
            L_0x0029:
                r3.f30569n = r0
                return
            L_0x002c:
                r0 = 0
                goto L_0x0029
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.j31.C5761a.mo38389a():void");
        }

        @vr2
        /* renamed from: b */
        public final Iterator<T> mo38390b() {
            return this.f30568a;
        }

        @ss2
        /* renamed from: d */
        public final T mo38391d() {
            return this.f30567a;
        }

        /* renamed from: f */
        public final int mo38392f() {
            return this.f30569n;
        }

        /* renamed from: h */
        public final void mo38393h(@ss2 T t) {
            this.f30567a = t;
        }

        public boolean hasNext() {
            if (this.f30569n == -1) {
                mo38389a();
            }
            return this.f30569n == 1;
        }

        /* renamed from: i */
        public final void mo38395i(int i) {
            this.f30569n = i;
        }

        public T next() {
            if (this.f30569n == -1) {
                mo38389a();
            }
            if (this.f30569n != 0) {
                T t = this.f30567a;
                this.f30567a = null;
                this.f30569n = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public j31(@vr2 zt3<? extends T> zt3, boolean z, @vr2 ec1<? super T, Boolean> ec1) {
        jt1.m53777p(zt3, "sequence");
        jt1.m53777p(ec1, "predicate");
        this.f30564a = zt3;
        this.f30565a = z;
        this.f30563a = ec1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j31(zt3 zt3, boolean z, ec1 ec1, int i, wg0 wg0) {
        this(zt3, (i & 2) != 0 ? true : z, ec1);
    }

    @vr2
    public Iterator<T> iterator() {
        return new C5761a(this);
    }
}
