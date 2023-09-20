package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/onedelhi/secure/ew;", "T", "Lcom/onedelhi/secure/dw;", "Lcom/onedelhi/secure/b90;", "context", "", "capacity", "Lcom/onedelhi/secure/qo;", "onBufferOverflow", "Lcom/onedelhi/secure/zv;", "i", "Lcom/onedelhi/secure/m81;", "j", "Lcom/onedelhi/secure/o81;", "collector", "Lcom/onedelhi/secure/un4;", "u", "(Lcom/onedelhi/secure/o81;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "flow", "<init>", "(Lcom/onedelhi/secure/m81;Lcom/onedelhi/secure/b90;ILcom/onedelhi/secure/qo;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.ew */
public final class C5199ew<T> extends C5059dw<T, T> {
    public C5199ew(@vr2 m81<? extends T> m81, @vr2 b90 b90, int i, @vr2 C6593qo qoVar) {
        super(m81, b90, i, qoVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5199ew(m81 m81, b90 b90, int i, C6593qo qoVar, int i2, wg0 wg0) {
        this(m81, (i2 & 2) != 0 ? gt0.f29313a : b90, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? C6593qo.SUSPEND : qoVar);
    }

    @vr2
    /* renamed from: i */
    public C7517zv<T> mo31219i(@vr2 b90 b90, int i, @vr2 C6593qo qoVar) {
        return new C5199ew(this.f27627a, b90, i, qoVar);
    }

    @vr2
    /* renamed from: j */
    public m81<T> mo35647j() {
        return this.f27627a;
    }

    @ss2
    /* renamed from: u */
    public Object mo34635u(@vr2 o81<? super T> o81, @vr2 b80<? super un4> b80) {
        Object a = this.f27627a.mo31451a(o81, b80);
        return a == mt1.m57558h() ? a : un4.f36206a;
    }
}
