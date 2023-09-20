package com.onedelhi.secure;

import com.onedelhi.secure.l82;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006!"}, d2 = {"Lcom/onedelhi/secure/iz;", "E", "Lcom/onedelhi/secure/rt3;", "Lcom/onedelhi/secure/mg3;", "Lcom/onedelhi/secure/l82$d;", "otherOp", "Lcom/onedelhi/secure/l84;", "d1", "Lcom/onedelhi/secure/un4;", "a1", "value", "e0", "(Ljava/lang/Object;Lcom/onedelhi/secure/l82$d;)Lcom/onedelhi/secure/l84;", "B", "(Ljava/lang/Object;)V", "closed", "c1", "", "toString", "", "i1", "()Ljava/lang/Throwable;", "sendException", "h1", "receiveException", "f1", "()Lcom/onedelhi/secure/iz;", "offerResult", "g1", "pollResult", "closeCause", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.iz */
public final class C5753iz<E> extends rt3 implements mg3<E> {
    @rw1
    @ss2

    /* renamed from: a */
    public final Throwable f30506a;

    public C5753iz(@ss2 Throwable th) {
        this.f30506a = th;
    }

    /* renamed from: B */
    public void mo37722B(E e) {
    }

    /* renamed from: a1 */
    public void mo38289a1() {
    }

    /* renamed from: c1 */
    public void mo38291c1(@vr2 C5753iz<?> izVar) {
    }

    @vr2
    /* renamed from: d1 */
    public l84 mo38292d1(@ss2 l82.C5974d dVar) {
        l84 l84 = C5937ku.f31431a;
        if (dVar != null) {
            dVar.mo39710d();
        }
        return l84;
    }

    @vr2
    /* renamed from: e0 */
    public l84 mo37725e0(E e, @ss2 l82.C5974d dVar) {
        l84 l84 = C5937ku.f31431a;
        if (dVar != null) {
            dVar.mo39710d();
        }
        return l84;
    }

    @vr2
    /* renamed from: f1 */
    public C5753iz<E> mo38297s() {
        return this;
    }

    @vr2
    /* renamed from: g1 */
    public C5753iz<E> mo38290b1() {
        return this;
    }

    @vr2
    /* renamed from: h1 */
    public final Throwable mo38295h1() {
        Throwable th = this.f30506a;
        return th == null ? new C6236nz(C6059lw.f31852a) : th;
    }

    @vr2
    /* renamed from: i1 */
    public final Throwable mo38296i1() {
        Throwable th = this.f30506a;
        return th == null ? new C6351oz(C6059lw.f31852a) : th;
    }

    @vr2
    public String toString() {
        return "Closed@" + if0.m52225b(this) + '[' + this.f30506a + ']';
    }
}
