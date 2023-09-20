package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u0006R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/onedelhi/secure/vb;", "T", "Lcom/onedelhi/secure/wv2;", "", "decision", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "affected", "i", "failure", "Lcom/onedelhi/secure/un4;", "d", "(Ljava/lang/Object;Ljava/lang/Object;)V", "c", "f", "()Ljava/lang/Object;", "consensus", "", "h", "()Z", "isDecided", "", "g", "()J", "opSequence", "a", "()Lcom/onedelhi/secure/vb;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@zs1
/* renamed from: com.onedelhi.secure.vb */
public abstract class C7022vb<T> extends wv2 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f36470a = AtomicReferenceFieldUpdater.newUpdater(C7022vb.class, Object.class, "_consensus");
    @vr2
    private volatile /* synthetic */ Object _consensus = C6944ub.f36018a;

    @vr2
    /* renamed from: a */
    public C7022vb<?> mo31081a() {
        return this;
    }

    @ss2
    /* renamed from: c */
    public final Object mo31082c(@ss2 Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C6944ub.f36018a) {
            obj2 = mo46061e(mo31084i(obj));
        }
        mo31083d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo31083d(T t, @ss2 Object obj);

    @ss2
    /* renamed from: e */
    public final Object mo46061e(@ss2 Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = C6944ub.f36018a;
        return obj2 != obj3 ? obj2 : C5759j1.m52871a(f36470a, this, obj3, obj) ? obj : this._consensus;
    }

    @ss2
    /* renamed from: f */
    public final Object mo46062f() {
        return this._consensus;
    }

    /* renamed from: g */
    public long mo35607g() {
        return 0;
    }

    /* renamed from: h */
    public final boolean mo46063h() {
        return this._consensus != C6944ub.f36018a;
    }

    @ss2
    /* renamed from: i */
    public abstract Object mo31084i(T t);
}
