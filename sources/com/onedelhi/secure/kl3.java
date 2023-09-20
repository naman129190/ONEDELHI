package com.onedelhi.secure;

import kotlin.Metadata;

@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/kl3;", "Lcom/onedelhi/secure/ij;", "Lcom/onedelhi/secure/b90;", "f", "()Lcom/onedelhi/secure/b90;", "context", "Lcom/onedelhi/secure/b80;", "", "completion", "<init>", "(Lcom/onedelhi/secure/b80;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class kl3 extends C5729ij {
    public kl3(@ss2 b80<Object> b80) {
        super(b80);
        if (b80 != null) {
            if (!(b80.mo31187f() == gt0.f29313a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @vr2
    /* renamed from: f */
    public b90 mo31187f() {
        return gt0.f29313a;
    }
}
