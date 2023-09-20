package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\u0015\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u0014\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J!\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/aw;", "T", "Lcom/onedelhi/secure/zv;", "Lcom/onedelhi/secure/b90;", "context", "", "capacity", "Lcom/onedelhi/secure/qo;", "onBufferOverflow", "i", "Lcom/onedelhi/secure/p53;", "scope", "Lcom/onedelhi/secure/un4;", "h", "(Lcom/onedelhi/secure/p53;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "", "toString", "Lkotlin/Function2;", "Lcom/onedelhi/secure/b80;", "", "Lcom/onedelhi/secure/wy0;", "block", "<init>", "(Lcom/onedelhi/secure/sc1;Lcom/onedelhi/secure/b90;ILcom/onedelhi/secure/qo;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.aw */
public class C4594aw<T> extends C7517zv<T> {
    @vr2

    /* renamed from: a */
    public final sc1<p53<? super T>, b80<? super un4>, Object> f26009a;

    public C4594aw(@vr2 sc1<? super p53<? super T>, ? super b80<? super un4>, ? extends Object> sc1, @vr2 b90 b90, int i, @vr2 C6593qo qoVar) {
        super(b90, i, qoVar);
        this.f26009a = sc1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4594aw(sc1 sc1, b90 b90, int i, C6593qo qoVar, int i2, wg0 wg0) {
        this(sc1, (i2 & 2) != 0 ? gt0.f29313a : b90, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? C6593qo.SUSPEND : qoVar);
    }

    /* renamed from: o */
    public static /* synthetic */ Object m39125o(C4594aw awVar, p53 p53, b80 b80) {
        Object h0 = awVar.f26009a.mo21054h0(p53, b80);
        return h0 == mt1.m57558h() ? h0 : un4.f36206a;
    }

    @ss2
    /* renamed from: h */
    public Object mo31218h(@vr2 p53<? super T> p53, @vr2 b80<? super un4> b80) {
        return m39125o(this, p53, b80);
    }

    @vr2
    /* renamed from: i */
    public C7517zv<T> mo31219i(@vr2 b90 b90, int i, @vr2 C6593qo qoVar) {
        return new C4594aw(this.f26009a, b90, i, qoVar);
    }

    @vr2
    public String toString() {
        return "block[" + this.f26009a + "] -> " + super.toString();
    }
}
