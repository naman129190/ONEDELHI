package com.onedelhi.secure;

import com.onedelhi.secure.st3;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/p53;", "E", "Lcom/onedelhi/secure/m90;", "Lcom/onedelhi/secure/st3;", "S", "()Lcom/onedelhi/secure/st3;", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface p53<E> extends m90, st3<E> {

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.p53$a */
    public static final class C6366a {
        @xj0(level = ak0.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @oi3(expression = "trySend(element).isSuccess", imports = {}))
        /* renamed from: a */
        public static <E> boolean m60457a(@vr2 p53<? super E> p53, E e) {
            return st3.C6793a.m64881c(p53, e);
        }
    }

    @vr2
    /* renamed from: S */
    st3<E> mo36809S();
}
