package com.onedelhi.secure;

import com.onedelhi.secure.l82;
import com.onedelhi.secure.nl3;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u000e\u001a\u00028\u0000\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u000e\u001a\u00028\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/onedelhi/secure/tt3;", "E", "Lcom/onedelhi/secure/rt3;", "Lcom/onedelhi/secure/l82$d;", "otherOp", "Lcom/onedelhi/secure/l84;", "d1", "Lcom/onedelhi/secure/un4;", "a1", "Lcom/onedelhi/secure/iz;", "closed", "c1", "", "toString", "pollResult", "Ljava/lang/Object;", "b1", "()Ljava/lang/Object;", "Lcom/onedelhi/secure/iu;", "cont", "<init>", "(Ljava/lang/Object;Lcom/onedelhi/secure/iu;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class tt3<E> extends rt3 {
    @rw1
    @vr2

    /* renamed from: a */
    public final C5744iu<un4> f35784a;

    /* renamed from: a */
    public final E f35785a;

    public tt3(E e, @vr2 C5744iu<? super un4> iuVar) {
        this.f35785a = e;
        this.f35784a = iuVar;
    }

    /* renamed from: a1 */
    public void mo38289a1() {
        this.f35784a.mo38233N(C5937ku.f31431a);
    }

    /* renamed from: b1 */
    public E mo38290b1() {
        return this.f35785a;
    }

    /* renamed from: c1 */
    public void mo38291c1(@vr2 C5753iz<?> izVar) {
        C5744iu<un4> iuVar = this.f35784a;
        nl3.C6191a aVar = nl3.f32575a;
        iuVar.mo31191m0(nl3.m58187b(pl3.m61423a(izVar.mo38296i1())));
    }

    @ss2
    /* renamed from: d1 */
    public l84 mo38292d1(@ss2 l82.C5974d dVar) {
        if (this.f35784a.mo38243y(un4.f36206a, dVar == null ? null : dVar.f31591a) == null) {
            return null;
        }
        if (dVar != null) {
            dVar.mo39710d();
        }
        return C5937ku.f31431a;
    }

    @vr2
    public String toString() {
        return if0.m52224a(this) + '@' + if0.m52225b(this) + '(' + mo38290b1() + ')';
    }
}
