package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/onedelhi/secure/xv;", "T", "Lcom/onedelhi/secure/zv;", "Lcom/onedelhi/secure/b90;", "context", "", "capacity", "Lcom/onedelhi/secure/qo;", "onBufferOverflow", "i", "(Lcom/onedelhi/secure/b90;ILcom/onedelhi/secure/qo;)Lcom/onedelhi/secure/zv;", "Lcom/onedelhi/secure/m81;", "j", "()Lcom/onedelhi/secure/m81;", "Lcom/onedelhi/secure/p53;", "scope", "Lcom/onedelhi/secure/un4;", "h", "(Lcom/onedelhi/secure/p53;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lcom/onedelhi/secure/m90;", "Lcom/onedelhi/secure/lg3;", "n", "(Lcom/onedelhi/secure/m90;)Lcom/onedelhi/secure/lg3;", "Lcom/onedelhi/secure/o81;", "collector", "a", "(Lcom/onedelhi/secure/o81;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "", "f", "()Ljava/lang/String;", "o", "()V", "channel", "", "consume", "<init>", "(Lcom/onedelhi/secure/lg3;ZLcom/onedelhi/secure/b90;ILcom/onedelhi/secure/qo;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.xv */
public final class C7278xv<T> extends C7517zv<T> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f37599a = AtomicIntegerFieldUpdater.newUpdater(C7278xv.class, "consumed");
    @vr2

    /* renamed from: a */
    public final lg3<T> f37600a;

    /* renamed from: b */
    public final boolean f37601b;
    @vr2
    private volatile /* synthetic */ int consumed;

    public C7278xv(@vr2 lg3<? extends T> lg3, boolean z, @vr2 b90 b90, int i, @vr2 C6593qo qoVar) {
        super(b90, i, qoVar);
        this.f37600a = lg3;
        this.f37601b = z;
        this.consumed = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7278xv(lg3 lg3, boolean z, b90 b90, int i, C6593qo qoVar, int i2, wg0 wg0) {
        this(lg3, z, (i2 & 4) != 0 ? gt0.f29313a : b90, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? C6593qo.SUSPEND : qoVar);
    }

    @ss2
    /* renamed from: a */
    public Object mo31451a(@vr2 o81<? super T> o81, @vr2 b80<? super un4> b80) {
        if (this.f38445n == -3) {
            mo47395o();
            Object a = u81.m66891e(o81, this.f37600a, this.f37601b, b80);
            return a == mt1.m57558h() ? a : un4.f36206a;
        }
        Object a2 = super.mo31451a(o81, b80);
        return a2 == mt1.m57558h() ? a2 : un4.f36206a;
    }

    @vr2
    /* renamed from: f */
    public String mo33947f() {
        return jt1.m53745C("channel=", this.f37600a);
    }

    @ss2
    /* renamed from: h */
    public Object mo31218h(@vr2 p53<? super T> p53, @vr2 b80<? super un4> b80) {
        Object a = u81.m66891e(new xt3(p53), this.f37600a, this.f37601b, b80);
        return a == mt1.m57558h() ? a : un4.f36206a;
    }

    @vr2
    /* renamed from: i */
    public C7517zv<T> mo31219i(@vr2 b90 b90, int i, @vr2 C6593qo qoVar) {
        return new C7278xv(this.f37600a, this.f37601b, b90, i, qoVar);
    }

    @vr2
    /* renamed from: j */
    public m81<T> mo35647j() {
        return new C7278xv(this.f37600a, this.f37601b, (b90) null, 0, (C6593qo) null, 28, (wg0) null);
    }

    @vr2
    /* renamed from: n */
    public lg3<T> mo33948n(@vr2 m90 m90) {
        mo47395o();
        return this.f38445n == -3 ? this.f37600a : super.mo33948n(m90);
    }

    /* renamed from: o */
    public final void mo47395o() {
        if (this.f37601b) {
            boolean z = true;
            if (f37599a.getAndSet(this, 1) != 0) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }
}
