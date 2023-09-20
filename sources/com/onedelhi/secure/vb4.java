package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import com.onedelhi.secure.sb4;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0017\u001a\u00028\u0000\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\r\u001a\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016J*\u0010\u0010\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u000f*\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001e\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/onedelhi/secure/vb4;", "T", "Lcom/onedelhi/secure/sb4;", "Lcom/onedelhi/secure/b90;", "context", "p0", "(Lcom/onedelhi/secure/b90;)Ljava/lang/Object;", "oldState", "Lcom/onedelhi/secure/un4;", "M", "(Lcom/onedelhi/secure/b90;Ljava/lang/Object;)V", "Lcom/onedelhi/secure/b90$c;", "key", "minusKey", "Lcom/onedelhi/secure/b90$b;", "E", "get", "(Lcom/onedelhi/secure/b90$c;)Lcom/onedelhi/secure/b90$b;", "", "toString", "Lcom/onedelhi/secure/b90$c;", "getKey", "()Lcom/onedelhi/secure/b90$c;", "value", "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class vb4<T> implements sb4<T> {
    @vr2

    /* renamed from: a */
    public final b90.C4636c<?> f36478a;

    /* renamed from: a */
    public final T f36479a;
    @vr2

    /* renamed from: a */
    public final ThreadLocal<T> f36480a;

    public vb4(T t, @vr2 ThreadLocal<T> threadLocal) {
        this.f36479a = t;
        this.f36480a = threadLocal;
        this.f36478a = new xb4(threadLocal);
    }

    /* renamed from: M */
    public void mo37900M(@vr2 b90 b90, T t) {
        this.f36480a.set(t);
    }

    public <R> R fold(R r, @vr2 sc1<? super R, ? super b90.C4634b, ? extends R> sc1) {
        return sb4.C6754a.m64441a(this, r, sc1);
    }

    @ss2
    public <E extends b90.C4634b> E get(@vr2 b90.C4636c<E> cVar) {
        if (jt1.m53768g(getKey(), cVar)) {
            return this;
        }
        return null;
    }

    @vr2
    public b90.C4636c<?> getKey() {
        return this.f36478a;
    }

    @vr2
    public b90 minusKey(@vr2 b90.C4636c<?> cVar) {
        return jt1.m53768g(getKey(), cVar) ? gt0.f29313a : this;
    }

    /* renamed from: p0 */
    public T mo37908p0(@vr2 b90 b90) {
        T t = this.f36480a.get();
        this.f36480a.set(this.f36479a);
        return t;
    }

    @vr2
    public b90 plus(@vr2 b90 b90) {
        return sb4.C6754a.m64444d(this, b90);
    }

    @vr2
    public String toString() {
        return "ThreadLocal(value=" + this.f36479a + ", threadLocal = " + this.f36480a + ')';
    }
}
