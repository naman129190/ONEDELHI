package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J)\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/tx3;", "Lcom/onedelhi/secure/o1;", "Lcom/onedelhi/secure/rx3;", "flow", "", "c", "", "Lcom/onedelhi/secure/b80;", "Lcom/onedelhi/secure/un4;", "d", "(Lcom/onedelhi/secure/rx3;)[Lcom/onedelhi/secure/b80;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class tx3 extends C6239o1<rx3<?>> {
    @rw1

    /* renamed from: a */
    public long f35834a = -1;
    @rw1
    @ss2

    /* renamed from: a */
    public b80<? super un4> f35835a;

    /* renamed from: c */
    public boolean mo36555a(@vr2 rx3<?> rx3) {
        if (this.f35834a >= 0) {
            return false;
        }
        this.f35834a = rx3.mo44107g0();
        return true;
    }

    @vr2
    /* renamed from: d */
    public b80<un4>[] mo36556b(@vr2 rx3<?> rx3) {
        long j = this.f35834a;
        this.f35834a = -1;
        this.f35835a = null;
        return rx3.mo44106f0(j);
    }
}
