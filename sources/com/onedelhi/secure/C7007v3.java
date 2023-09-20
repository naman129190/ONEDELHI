package com.onedelhi.secure;

import com.onedelhi.secure.lg3;
import kotlin.Metadata;

@cu2
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/v3;", "E", "Lcom/onedelhi/secure/m90;", "Lcom/onedelhi/secure/lg3;", "Lcom/onedelhi/secure/wv;", "v", "()Lcom/onedelhi/secure/wv;", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.v3 */
public interface C7007v3<E> extends m90, lg3<E> {

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.v3$a */
    public static final class C7008a {
        @vr2
        /* renamed from: b */
        public static <E> gt3<E> m67606b(@vr2 C7007v3<E> v3Var) {
            return lg3.C6006a.m55598d(v3Var);
        }

        @ss2
        @xj0(level = ak0.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @oi3(expression = "tryReceive().getOrNull()", imports = {}))
        /* renamed from: c */
        public static <E> E m67607c(@vr2 C7007v3<E> v3Var) {
            return lg3.C6006a.m55602h(v3Var);
        }

        @xj0(level = ak0.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @oi3(expression = "receiveCatching().getOrNull()", imports = {}))
        @ib2
        @ss2
        /* renamed from: d */
        public static <E> Object m67608d(@vr2 C7007v3<E> v3Var, @vr2 b80<? super E> b80) {
            return lg3.C6006a.m55603i(v3Var, b80);
        }
    }

    @vr2
    /* renamed from: v */
    C7184wv<E> mo45943v();
}
