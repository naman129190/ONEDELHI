package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import kotlin.Metadata;

@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/m0;", "Lcom/onedelhi/secure/b90$b;", "Lcom/onedelhi/secure/b90$c;", "key", "Lcom/onedelhi/secure/b90$c;", "getKey", "()Lcom/onedelhi/secure/b90$c;", "<init>", "(Lcom/onedelhi/secure/b90$c;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.m0 */
public abstract class C6072m0 implements b90.C4634b {
    @vr2
    private final b90.C4636c<?> key;

    public C6072m0(@vr2 b90.C4636c<?> cVar) {
        jt1.m53777p(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r, @vr2 sc1<? super R, ? super b90.C4634b, ? extends R> sc1) {
        return b90.C4634b.C4635a.m39502a(this, r, sc1);
    }

    @ss2
    public <E extends b90.C4634b> E get(@vr2 b90.C4636c<E> cVar) {
        return b90.C4634b.C4635a.m39503b(this, cVar);
    }

    @vr2
    public b90.C4636c<?> getKey() {
        return this.key;
    }

    @vr2
    public b90 minusKey(@vr2 b90.C4636c<?> cVar) {
        return b90.C4634b.C4635a.m39504c(this, cVar);
    }

    @vr2
    public b90 plus(@vr2 b90 b90) {
        return b90.C4634b.C4635a.m39505d(this, b90);
    }
}
