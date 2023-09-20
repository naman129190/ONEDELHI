package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J,\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/kd1;", "T", "Lcom/onedelhi/secure/m81;", "Lcom/onedelhi/secure/b90;", "context", "", "capacity", "Lcom/onedelhi/secure/qo;", "onBufferOverflow", "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@zs1
public interface kd1<T> extends m81<T> {

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.kd1$a */
    public static final class C5885a {
        /* renamed from: a */
        public static /* synthetic */ m81 m54318a(kd1 kd1, b90 b90, int i, C6593qo qoVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    b90 = gt0.f29313a;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    qoVar = C6593qo.SUSPEND;
                }
                return kd1.mo34781d(b90, i, qoVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    @vr2
    /* renamed from: d */
    m81<T> mo34781d(@vr2 b90 b90, int i, @vr2 C6593qo qoVar);
}
