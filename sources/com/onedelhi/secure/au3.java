package com.onedelhi.secure;

import com.onedelhi.secure.nl3;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b!\u0010\"J\t\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\tJ\b\u0010\u0016\u001a\u00020\u0015H\u0002R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/onedelhi/secure/au3;", "T", "Lcom/onedelhi/secure/bu3;", "", "Lcom/onedelhi/secure/b80;", "Lcom/onedelhi/secure/un4;", "", "hasNext", "next", "()Ljava/lang/Object;", "value", "h", "(Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "iterator", "m", "(Ljava/util/Iterator;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lcom/onedelhi/secure/nl3;", "result", "m0", "(Ljava/lang/Object;)V", "q", "", "o", "nextStep", "Lcom/onedelhi/secure/b80;", "p", "()Lcom/onedelhi/secure/b80;", "r", "(Lcom/onedelhi/secure/b80;)V", "Lcom/onedelhi/secure/b90;", "f", "()Lcom/onedelhi/secure/b90;", "context", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class au3<T> extends bu3<T> implements Iterator<T>, b80<un4>, nx1 {
    @ss2

    /* renamed from: a */
    public b80<? super un4> f26001a;
    @ss2

    /* renamed from: a */
    public T f26002a;
    @ss2

    /* renamed from: a */
    public Iterator<? extends T> f26003a;

    /* renamed from: n */
    public int f26004n;

    @vr2
    /* renamed from: f */
    public b90 mo31187f() {
        return gt0.f29313a;
    }

    @ss2
    /* renamed from: h */
    public Object mo31188h(T t, @vr2 b80<? super un4> b80) {
        this.f26002a = t;
        this.f26004n = 3;
        this.f26001a = b80;
        Object h = mt1.m57558h();
        if (h == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        return h == mt1.m57558h() ? h : un4.f36206a;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.f26004n;
            if (i != 0) {
                if (i == 1) {
                    Iterator<? extends T> it = this.f26003a;
                    jt1.m53774m(it);
                    if (it.hasNext()) {
                        this.f26004n = 2;
                        return true;
                    }
                    this.f26003a = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw mo31193o();
                }
            }
            this.f26004n = 5;
            b80<? super un4> b80 = this.f26001a;
            jt1.m53774m(b80);
            this.f26001a = null;
            nl3.C6191a aVar = nl3.f32575a;
            b80.mo31191m0(nl3.m58187b(un4.f36206a));
        }
    }

    @ss2
    /* renamed from: m */
    public Object mo31190m(@vr2 Iterator<? extends T> it, @vr2 b80<? super un4> b80) {
        if (!it.hasNext()) {
            return un4.f36206a;
        }
        this.f26003a = it;
        this.f26004n = 2;
        this.f26001a = b80;
        Object h = mt1.m57558h();
        if (h == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        return h == mt1.m57558h() ? h : un4.f36206a;
    }

    /* renamed from: m0 */
    public void mo31191m0(@vr2 Object obj) {
        pl3.m61436n(obj);
        this.f26004n = 4;
    }

    public T next() {
        int i = this.f26004n;
        if (i == 0 || i == 1) {
            return mo31195q();
        }
        if (i == 2) {
            this.f26004n = 1;
            Iterator<? extends T> it = this.f26003a;
            jt1.m53774m(it);
            return it.next();
        } else if (i == 3) {
            this.f26004n = 0;
            T t = this.f26002a;
            this.f26002a = null;
            return t;
        } else {
            throw mo31193o();
        }
    }

    /* renamed from: o */
    public final Throwable mo31193o() {
        int i = this.f26004n;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f26004n);
    }

    @ss2
    /* renamed from: p */
    public final b80<un4> mo31194p() {
        return this.f26001a;
    }

    /* renamed from: q */
    public final T mo31195q() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: r */
    public final void mo31196r(@ss2 b80<? super un4> b80) {
        this.f26001a = b80;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
