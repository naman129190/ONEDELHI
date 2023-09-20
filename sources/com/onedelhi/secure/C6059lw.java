package com.onedelhi.secure;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"com/onedelhi/secure/mw", "com/onedelhi/secure/nw", "com/onedelhi/secure/ow"}, d2 = {}, k = 4, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.lw */
public final class C6059lw {
    @vr2

    /* renamed from: a */
    public static final String f31852a = "Channel was closed";

    @vr2
    @z73
    /* renamed from: J */
    public static final <E, R> lg3<R> m56541J(@vr2 lg3<? extends E> lg3, @vr2 b90 b90, @vr2 sc1<? super E, ? super b80<? super R>, ? extends Object> sc1) {
        return C6309ow.m60148E(lg3, b90, sc1);
    }

    @vr2
    @z73
    /* renamed from: L */
    public static final <E, R> lg3<R> m56543L(@vr2 lg3<? extends E> lg3, @vr2 b90 b90, @vr2 uc1<? super Integer, ? super E, ? super b80<? super R>, ? extends Object> uc1) {
        return C6309ow.m60150G(lg3, b90, uc1);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    /* renamed from: U */
    public static final <E> gt3<E> m56552U(@vr2 lg3<? extends E> lg3) {
        return C6231nw.m58829h(lg3);
    }

    @ss2
    @xj0(level = ak0.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @oi3(expression = "receiveCatching().getOrNull()", imports = {}))
    /* renamed from: V */
    public static final <E> Object m56553V(@vr2 lg3<? extends E> lg3, @vr2 b80<? super E> b80) {
        return C6231nw.m58830i(lg3, b80);
    }

    @xj0(level = ak0.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @oi3(expression = "trySendBlocking(element)", imports = {}))
    /* renamed from: X */
    public static final <E> void m56555X(@vr2 st3<? super E> st3, E e) {
        C6148mw.m57643a(st3, e);
    }

    @z73
    /* renamed from: b */
    public static final void m56560b(@vr2 lg3<?> lg3, @ss2 Throwable th) {
        C6231nw.m58822a(lg3, th);
    }

    @cu2
    /* renamed from: c */
    public static final <E, R> R m56562c(@vr2 C5168eo<E> eoVar, @vr2 ec1<? super lg3<? extends E>, ? extends R> ec1) {
        return C6231nw.m58823b(eoVar, ec1);
    }

    /* renamed from: d */
    public static final <E, R> R m56564d(@vr2 lg3<? extends E> lg3, @vr2 ec1<? super lg3<? extends E>, ? extends R> ec1) {
        return C6231nw.m58824c(lg3, ec1);
    }

    @cu2
    @ss2
    /* renamed from: e */
    public static final <E> Object m56566e(@vr2 C5168eo<E> eoVar, @vr2 ec1<? super E, un4> ec1, @vr2 b80<? super un4> b80) {
        return C6231nw.m58825d(eoVar, ec1, b80);
    }

    @ss2
    @z73
    /* renamed from: e0 */
    public static final <E, C extends st3<? super E>> Object m56567e0(@vr2 lg3<? extends E> lg3, @vr2 C c, @vr2 b80<? super C> b80) {
        return C6309ow.m60166W(lg3, c, b80);
    }

    @ss2
    /* renamed from: f */
    public static final <E> Object m56568f(@vr2 lg3<? extends E> lg3, @vr2 ec1<? super E, un4> ec1, @vr2 b80<? super un4> b80) {
        return C6231nw.m58826e(lg3, ec1, b80);
    }

    @ss2
    @z73
    /* renamed from: f0 */
    public static final <E, C extends Collection<? super E>> Object m56569f0(@vr2 lg3<? extends E> lg3, @vr2 C c, @vr2 b80<? super C> b80) {
        return C6309ow.m60167X(lg3, c, b80);
    }

    @vr2
    @z73
    /* renamed from: g */
    public static final ec1<Throwable, un4> m56570g(@vr2 lg3<?> lg3) {
        return C6309ow.m60172b(lg3);
    }

    @ss2
    /* renamed from: g0 */
    public static final <E> Object m56571g0(@vr2 lg3<? extends E> lg3, @vr2 b80<? super List<? extends E>> b80) {
        return C6231nw.m58831j(lg3, b80);
    }

    @vr2
    @z73
    /* renamed from: h */
    public static final ec1<Throwable, un4> m56572h(@vr2 lg3<?>... lg3Arr) {
        return C6309ow.m60174c(lg3Arr);
    }

    @ss2
    @z73
    /* renamed from: i0 */
    public static final <K, V, M extends Map<? super K, ? super V>> Object m56575i0(@vr2 lg3<? extends ey2<? extends K, ? extends V>> lg3, @vr2 M m, @vr2 b80<? super M> b80) {
        return C6309ow.m60169Z(lg3, m, b80);
    }

    @vr2
    @z73
    /* renamed from: k */
    public static final <E, K> lg3<E> m56578k(@vr2 lg3<? extends E> lg3, @vr2 b90 b90, @vr2 sc1<? super E, ? super b80<? super K>, ? extends Object> sc1) {
        return C6309ow.m60180f(lg3, b90, sc1);
    }

    @ss2
    @z73
    /* renamed from: k0 */
    public static final <E> Object m56579k0(@vr2 lg3<? extends E> lg3, @vr2 b80<? super Set<E>> b80) {
        return C6309ow.m60173b0(lg3, b80);
    }

    @vr2
    /* renamed from: m0 */
    public static final <E> Object m56583m0(@vr2 st3<? super E> st3, E e) {
        return C6148mw.m57644b(st3, e);
    }

    @vr2
    @z73
    /* renamed from: q0 */
    public static final <E, R, V> lg3<V> m56591q0(@vr2 lg3<? extends E> lg3, @vr2 lg3<? extends R> lg32, @vr2 b90 b90, @vr2 sc1<? super E, ? super R, ? extends V> sc1) {
        return C6309ow.m60183g0(lg3, lg32, b90, sc1);
    }

    @vr2
    @z73
    /* renamed from: s */
    public static final <E> lg3<E> m56594s(@vr2 lg3<? extends E> lg3, @vr2 b90 b90, @vr2 sc1<? super E, ? super b80<? super Boolean>, ? extends Object> sc1) {
        return C6309ow.m60191n(lg3, b90, sc1);
    }

    @vr2
    @z73
    /* renamed from: y */
    public static final <E> lg3<E> m56600y(@vr2 lg3<? extends E> lg3) {
        return C6309ow.m60197t(lg3);
    }
}
