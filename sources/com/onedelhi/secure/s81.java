package com.onedelhi.secure;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"com/onedelhi/secure/t81", "com/onedelhi/secure/u81", "com/onedelhi/secure/v81", "com/onedelhi/secure/w81", "com/onedelhi/secure/x81", "com/onedelhi/secure/y81", "com/onedelhi/secure/z81", "com/onedelhi/secure/a91", "com/onedelhi/secure/b91", "com/onedelhi/secure/c91", "com/onedelhi/secure/d91", "com/onedelhi/secure/e91", "com/onedelhi/secure/f91", "com/onedelhi/secure/g91", "com/onedelhi/secure/h91", "com/onedelhi/secure/i91", "com/onedelhi/secure/j91"}, d2 = {}, k = 4, mv = {1, 6, 0})
public final class s81 {
    @vr2

    /* renamed from: a */
    public static final String f34935a = "kotlinx.coroutines.flow.defaultConcurrency";

    @ss2
    /* renamed from: A */
    public static final <T> Object m64249A(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super un4>, ? extends Object> sc1, @vr2 b80<? super un4> b80) {
        return v81.m67778f(m81, sc1, b80);
    }

    @k91
    @vr2
    /* renamed from: A0 */
    public static final <T, R> m81<R> m64250A0(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super m81<? extends R>>, ? extends Object> sc1) {
        return e91.m46064a(m81, sc1);
    }

    @k91
    @vr2
    /* renamed from: A1 */
    public static final <T> m81<T> m64251A1(@vr2 m81<? extends T> m81, long j) {
        return z81.m72605h(m81, j);
    }

    @ss2
    /* renamed from: B */
    public static final <T> Object m64252B(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super Boolean>, ? extends Object> sc1, @vr2 b80<? super un4> b80) {
        return d91.m44821b(m81, sc1, b80);
    }

    @fy0
    @vr2
    /* renamed from: B0 */
    public static final <T, R> m81<R> m64253B0(@vr2 m81<? extends T> m81, @C7381yp @vr2 sc1<? super T, ? super b80<? super m81<? extends R>>, ? extends Object> sc1) {
        return e91.m46065b(m81, sc1);
    }

    @k91
    @vr2
    /* renamed from: B1 */
    public static final <T> m81<T> m64254B1(@vr2 m81<? extends T> m81, long j) {
        return z81.m72606i(m81, j);
    }

    @vr2
    /* renamed from: C */
    public static final <T1, T2, T3, T4, T5, R> m81<R> m64255C(@vr2 m81<? extends T1> m81, @vr2 m81<? extends T2> m812, @vr2 m81<? extends T3> m813, @vr2 m81<? extends T4> m814, @vr2 m81<? extends T5> m815, @vr2 xc1<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super b80<? super R>, ? extends Object> xc1) {
        return j91.m52975b(m81, m812, m813, m814, m815, xc1);
    }

    @k91
    @vr2
    /* renamed from: C0 */
    public static final <T, R> m81<R> m64256C0(@vr2 m81<? extends T> m81, int i, @vr2 sc1<? super T, ? super b80<? super m81<? extends R>>, ? extends Object> sc1) {
        return e91.m46066c(m81, i, sc1);
    }

    @vr2
    /* renamed from: C1 */
    public static final <T, R> m81<R> m64257C1(@vr2 m81<? extends T> m81, R r, @C7381yp @vr2 uc1<? super R, ? super T, ? super b80<? super R>, ? extends Object> uc1) {
        return i91.m51907j(m81, r, uc1);
    }

    @vr2
    /* renamed from: D */
    public static final <T1, T2, T3, T4, R> m81<R> m64258D(@vr2 m81<? extends T1> m81, @vr2 m81<? extends T2> m812, @vr2 m81<? extends T3> m813, @vr2 m81<? extends T4> m814, @vr2 wc1<? super T1, ? super T2, ? super T3, ? super T4, ? super b80<? super R>, ? extends Object> wc1) {
        return j91.m52976c(m81, m812, m813, m814, wc1);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @oi3(expression = "scan(initial, operation)", imports = {}))
    /* renamed from: D1 */
    public static final <T, R> m81<R> m64260D1(@vr2 m81<? extends T> m81, R r, @C7381yp @vr2 uc1<? super R, ? super T, ? super b80<? super R>, ? extends Object> uc1) {
        return f91.m47609B(m81, r, uc1);
    }

    @vr2
    /* renamed from: E */
    public static final <T1, T2, T3, R> m81<R> m64261E(@vr2 m81<? extends T1> m81, @vr2 m81<? extends T2> m812, @vr2 m81<? extends T3> m813, @C7381yp @vr2 vc1<? super T1, ? super T2, ? super T3, ? super b80<? super R>, ? extends Object> vc1) {
        return j91.m52977d(m81, m812, m813, vc1);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @oi3(expression = "flattenConcat()", imports = {}))
    /* renamed from: E0 */
    public static final <T> m81<T> m64262E0(@vr2 m81<? extends m81<? extends T>> m81) {
        return f91.m47631m(m81);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @oi3(expression = "runningReduce(operation)", imports = {}))
    /* renamed from: E1 */
    public static final <T> m81<T> m64263E1(@vr2 m81<? extends T> m81, @vr2 uc1<? super T, ? super T, ? super b80<? super T>, ? extends Object> uc1) {
        return f91.m47610C(m81, uc1);
    }

    @vr2
    /* renamed from: F */
    public static final <T1, T2, R> m81<R> m64264F(@vr2 m81<? extends T1> m81, @vr2 m81<? extends T2> m812, @vr2 uc1<? super T1, ? super T2, ? super b80<? super R>, ? extends Object> uc1) {
        return j91.m52978e(m81, m812, uc1);
    }

    @k91
    @vr2
    /* renamed from: F0 */
    public static final <T> m81<T> m64265F0(@vr2 m81<? extends m81<? extends T>> m81) {
        return e91.m46068e(m81);
    }

    @vr2
    /* renamed from: F1 */
    public static final <T> qx3<T> m64266F1(@vr2 m81<? extends T> m81, @vr2 m90 m90, @vr2 by3 by3, int i) {
        return h91.m50312g(m81, m90, by3, i);
    }

    @k91
    @vr2
    /* renamed from: G0 */
    public static final <T> m81<T> m64268G0(@vr2 m81<? extends m81<? extends T>> m81, int i) {
        return e91.m46069f(m81, i);
    }

    @ss2
    /* renamed from: H1 */
    public static final <T> Object m64272H1(@vr2 m81<? extends T> m81, @vr2 b80<? super T> b80) {
        return g91.m49147j(m81, b80);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @oi3(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    /* renamed from: I */
    public static final <T1, T2, T3, T4, T5, R> m81<R> m64273I(@vr2 m81<? extends T1> m81, @vr2 m81<? extends T2> m812, @vr2 m81<? extends T3> m813, @vr2 m81<? extends T4> m814, @vr2 m81<? extends T5> m815, @vr2 xc1<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super b80<? super R>, ? extends Object> xc1) {
        return f91.m47620b(m81, m812, m813, m814, m815, xc1);
    }

    @vr2
    /* renamed from: I0 */
    public static final <T> m81<T> m64274I0(@C7381yp @vr2 sc1<? super o81<? super T>, ? super b80<? super un4>, ? extends Object> sc1) {
        return t81.m65504n(sc1);
    }

    @ss2
    /* renamed from: I1 */
    public static final <T> Object m64275I1(@vr2 m81<? extends T> m81, @vr2 b80<? super T> b80) {
        return g91.m49148k(m81, b80);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @oi3(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    /* renamed from: J */
    public static final <T1, T2, T3, T4, R> m81<R> m64276J(@vr2 m81<? extends T1> m81, @vr2 m81<? extends T2> m812, @vr2 m81<? extends T3> m813, @vr2 m81<? extends T4> m814, @vr2 wc1<? super T1, ? super T2, ? super T3, ? super T4, ? super b80<? super R>, ? extends Object> wc1) {
        return f91.m47621c(m81, m812, m813, m814, wc1);
    }

    @uw1(name = "flowCombine")
    @vr2
    /* renamed from: J0 */
    public static final <T1, T2, R> m81<R> m64277J0(@vr2 m81<? extends T1> m81, @vr2 m81<? extends T2> m812, @vr2 uc1<? super T1, ? super T2, ? super b80<? super R>, ? extends Object> uc1) {
        return j91.m52989p(m81, m812, uc1);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @oi3(expression = "drop(count)", imports = {}))
    /* renamed from: J1 */
    public static final <T> m81<T> m64278J1(@vr2 m81<? extends T> m81, int i) {
        return f91.m47611D(m81, i);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @oi3(expression = "combine(this, other, other2, transform)", imports = {}))
    /* renamed from: K */
    public static final <T1, T2, T3, R> m81<R> m64279K(@vr2 m81<? extends T1> m81, @vr2 m81<? extends T2> m812, @vr2 m81<? extends T3> m813, @vr2 vc1<? super T1, ? super T2, ? super T3, ? super b80<? super R>, ? extends Object> vc1) {
        return f91.m47622d(m81, m812, m813, vc1);
    }

    @uw1(name = "flowCombineTransform")
    @vr2
    /* renamed from: K0 */
    public static final <T1, T2, R> m81<R> m64280K0(@vr2 m81<? extends T1> m81, @vr2 m81<? extends T2> m812, @C7381yp @vr2 vc1<? super o81<? super R>, ? super T1, ? super T2, ? super b80<? super un4>, ? extends Object> vc1) {
        return j91.m52990q(m81, m812, vc1);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @oi3(expression = "onStart { emitAll(other) }", imports = {}))
    /* renamed from: K1 */
    public static final <T> m81<T> m64281K1(@vr2 m81<? extends T> m81, @vr2 m81<? extends T> m812) {
        return f91.m47612E(m81, m812);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @oi3(expression = "this.combine(other, transform)", imports = {}))
    /* renamed from: L */
    public static final <T1, T2, R> m81<R> m64282L(@vr2 m81<? extends T1> m81, @vr2 m81<? extends T2> m812, @vr2 uc1<? super T1, ? super T2, ? super b80<? super R>, ? extends Object> uc1) {
        return f91.m47623e(m81, m812, uc1);
    }

    @vr2
    /* renamed from: L0 */
    public static final <T> m81<T> m64283L0(T t) {
        return t81.m65505o(t);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @oi3(expression = "onStart { emit(value) }", imports = {}))
    /* renamed from: L1 */
    public static final <T> m81<T> m64284L1(@vr2 m81<? extends T> m81, T t) {
        return f91.m47613F(m81, t);
    }

    @vr2
    /* renamed from: M */
    public static final <T1, T2, T3, T4, T5, R> m81<R> m64285M(@vr2 m81<? extends T1> m81, @vr2 m81<? extends T2> m812, @vr2 m81<? extends T3> m813, @vr2 m81<? extends T4> m814, @vr2 m81<? extends T5> m815, @C7381yp @vr2 yc1<? super o81<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super b80<? super un4>, ? extends Object> yc1) {
        return j91.m52981h(m81, m812, m813, m814, m815, yc1);
    }

    @vr2
    /* renamed from: M0 */
    public static final <T> m81<T> m64286M0(@vr2 T... tArr) {
        return t81.m65506p(tArr);
    }

    @vr2
    /* renamed from: M1 */
    public static final <T> d34<T> m64287M1(@vr2 m81<? extends T> m81, @vr2 m90 m90, @vr2 by3 by3, T t) {
        return h91.m50314i(m81, m90, by3, t);
    }

    @vr2
    /* renamed from: N */
    public static final <T1, T2, T3, T4, R> m81<R> m64288N(@vr2 m81<? extends T1> m81, @vr2 m81<? extends T2> m812, @vr2 m81<? extends T3> m813, @vr2 m81<? extends T4> m814, @C7381yp @vr2 xc1<? super o81<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super b80<? super un4>, ? extends Object> xc1) {
        return j91.m52982i(m81, m812, m813, m814, xc1);
    }

    @vr2
    /* renamed from: N0 */
    public static final <T> m81<T> m64289N0(@vr2 m81<? extends T> m81, @vr2 b90 b90) {
        return x81.m70019h(m81, b90);
    }

    @ss2
    /* renamed from: N1 */
    public static final <T> Object m64290N1(@vr2 m81<? extends T> m81, @vr2 m90 m90, @vr2 b80<? super d34<? extends T>> b80) {
        return h91.m50315j(m81, m90, b80);
    }

    @vr2
    /* renamed from: O */
    public static final <T1, T2, T3, R> m81<R> m64291O(@vr2 m81<? extends T1> m81, @vr2 m81<? extends T2> m812, @vr2 m81<? extends T3> m813, @C7381yp @vr2 wc1<? super o81<? super R>, ? super T1, ? super T2, ? super T3, ? super b80<? super un4>, ? extends Object> wc1) {
        return j91.m52983j(m81, m812, m813, wc1);
    }

    @ss2
    /* renamed from: O0 */
    public static final <T, R> Object m64292O0(@vr2 m81<? extends T> m81, R r, @vr2 uc1<? super R, ? super T, ? super b80<? super R>, ? extends Object> uc1, @vr2 b80<? super R> b80) {
        return g91.m49142e(m81, r, uc1, b80);
    }

    @xj0(level = ak0.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    /* renamed from: O1 */
    public static final <T> void m64293O1(@vr2 m81<? extends T> m81) {
        f91.m47614G(m81);
    }

    @vr2
    /* renamed from: P */
    public static final <T1, T2, R> m81<R> m64294P(@vr2 m81<? extends T1> m81, @vr2 m81<? extends T2> m812, @C7381yp @vr2 vc1<? super o81<? super R>, ? super T1, ? super T2, ? super b80<? super un4>, ? extends Object> vc1) {
        return j91.m52984k(m81, m812, vc1);
    }

    @xj0(level = ak0.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @oi3(expression = "collect(action)", imports = {}))
    /* renamed from: P0 */
    public static final <T> void m64295P0(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super un4>, ? extends Object> sc1) {
        f91.m47632n(m81, sc1);
    }

    @xj0(level = ak0.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    /* renamed from: P1 */
    public static final <T> void m64296P1(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super un4>, ? extends Object> sc1) {
        f91.m47615H(m81, sc1);
    }

    /* renamed from: Q0 */
    public static final int m64298Q0() {
        return e91.m46071h();
    }

    @xj0(level = ak0.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    /* renamed from: Q1 */
    public static final <T> void m64299Q1(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super un4>, ? extends Object> sc1, @vr2 sc1<? super Throwable, ? super b80<? super un4>, ? extends Object> sc12) {
        f91.m47616I(m81, sc1, sc12);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Use 'flowOn' instead")
    /* renamed from: R1 */
    public static final <T> m81<T> m64302R1(@vr2 m81<? extends T> m81, @vr2 b90 b90) {
        return f91.m47617J(m81, b90);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @oi3(expression = "let(transformer)", imports = {}))
    /* renamed from: S */
    public static final <T, R> m81<R> m64303S(@vr2 m81<? extends T> m81, @vr2 ec1<? super m81<? extends T>, ? extends m81<? extends R>> ec1) {
        return f91.m47624f(m81, ec1);
    }

    @ss2
    /* renamed from: S0 */
    public static final <T> Object m64304S0(@vr2 m81<? extends T> m81, @vr2 b80<? super T> b80) {
        return g91.m49144g(m81, b80);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @oi3(expression = "this.flatMapLatest(transform)", imports = {}))
    /* renamed from: S1 */
    public static final <T, R> m81<R> m64305S1(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super m81<? extends R>>, ? extends Object> sc1) {
        return f91.m47618K(m81, sc1);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @oi3(expression = "flatMapConcat(mapper)", imports = {}))
    /* renamed from: T */
    public static final <T, R> m81<R> m64306T(@vr2 m81<? extends T> m81, @vr2 ec1<? super T, ? extends m81<? extends R>> ec1) {
        return f91.m47625g(m81, ec1);
    }

    @ss2
    /* renamed from: T0 */
    public static final <T> Object m64307T0(@vr2 m81<? extends T> m81, @vr2 b80<? super T> b80) {
        return g91.m49145h(m81, b80);
    }

    @vr2
    /* renamed from: T1 */
    public static final <T> m81<T> m64308T1(@vr2 m81<? extends T> m81, int i) {
        return d91.m44826g(m81, i);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @oi3(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    /* renamed from: U */
    public static final <T> m81<T> m64309U(@vr2 m81<? extends T> m81, @vr2 m81<? extends T> m812) {
        return f91.m47626h(m81, m812);
    }

    @vr2
    /* renamed from: U0 */
    public static final <T> ru1 m64310U0(@vr2 m81<? extends T> m81, @vr2 m90 m90) {
        return v81.m67780h(m81, m90);
    }

    @vr2
    /* renamed from: U1 */
    public static final <T> m81<T> m64311U1(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super Boolean>, ? extends Object> sc1) {
        return d91.m44827h(m81, sc1);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @oi3(expression = "onCompletion { emit(value) }", imports = {}))
    /* renamed from: V */
    public static final <T> m81<T> m64312V(@vr2 m81<? extends T> m81, T t) {
        return f91.m47627i(m81, t);
    }

    @vr2
    /* renamed from: V0 */
    public static final <T, R> m81<R> m64313V0(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super R>, ? extends Object> sc1) {
        return i91.m51902e(m81, sc1);
    }

    @ss2
    /* renamed from: V1 */
    public static final <T, C extends Collection<? super T>> Object m64314V1(@vr2 m81<? extends T> m81, @vr2 C c, @vr2 b80<? super C> b80) {
        return w81.m69207a(m81, c, b80);
    }

    @vr2
    /* renamed from: W */
    public static final <T> m81<T> m64315W(@vr2 m81<? extends T> m81) {
        return x81.m70018g(m81);
    }

    @fy0
    @vr2
    /* renamed from: W0 */
    public static final <T, R> m81<R> m64316W0(@vr2 m81<? extends T> m81, @C7381yp @vr2 sc1<? super T, ? super b80<? super R>, ? extends Object> sc1) {
        return e91.m46074k(m81, sc1);
    }

    @ss2
    /* renamed from: W1 */
    public static final <T> Object m64317W1(@vr2 m81<? extends T> m81, @vr2 List<T> list, @vr2 b80<? super List<? extends T>> b80) {
        return w81.m69208b(m81, list, b80);
    }

    @vr2
    /* renamed from: X */
    public static final <T> m81<T> m64318X(@vr2 lg3<? extends T> lg3) {
        return u81.m66889c(lg3);
    }

    @vr2
    /* renamed from: X0 */
    public static final <T, R> m81<R> m64319X0(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super R>, ? extends Object> sc1) {
        return i91.m51903f(m81, sc1);
    }

    @ss2
    /* renamed from: Y */
    public static final <T> Object m64321Y(@vr2 m81<? extends T> m81, @vr2 b80<? super Integer> b80) {
        return y81.m71304a(m81, b80);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @oi3(expression = "flattenConcat()", imports = {}))
    /* renamed from: Y0 */
    public static final <T> m81<T> m64322Y0(@vr2 m81<? extends m81<? extends T>> m81) {
        return f91.m47633o(m81);
    }

    @ss2
    /* renamed from: Y1 */
    public static final <T> Object m64323Y1(@vr2 m81<? extends T> m81, @vr2 Set<T> set, @vr2 b80<? super Set<? extends T>> b80) {
        return w81.m69210d(m81, set, b80);
    }

    @ss2
    /* renamed from: Z */
    public static final <T> Object m64324Z(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super Boolean>, ? extends Object> sc1, @vr2 b80<? super Integer> b80) {
        return y81.m71305b(m81, sc1, b80);
    }

    @vr2
    /* renamed from: Z0 */
    public static final <T> m81<T> m64325Z0(@vr2 Iterable<? extends m81<? extends T>> iterable) {
        return e91.m46075l(iterable);
    }

    @vr2
    @xj0(level = ak0.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    /* renamed from: a */
    public static final <T> m81<T> m64327a(@vr2 C5168eo<T> eoVar) {
        return u81.m66888b(eoVar);
    }

    @k91
    @vr2
    /* renamed from: a0 */
    public static final <T> m81<T> m64328a0(@vr2 m81<? extends T> m81, long j) {
        return z81.m72598a(m81, j);
    }

    @vr2
    /* renamed from: a1 */
    public static final <T> m81<T> m64329a1(@vr2 m81<? extends T>... m81Arr) {
        return e91.m46076m(m81Arr);
    }

    @vr2
    /* renamed from: a2 */
    public static final <T, R> m81<R> m64330a2(@vr2 m81<? extends T> m81, @C7381yp @vr2 uc1<? super o81<? super R>, ? super T, ? super b80<? super un4>, ? extends Object> uc1) {
        return b91.m39512g(m81, uc1);
    }

    @k91
    @vr2
    /* renamed from: b */
    public static final <T> m81<T> m64331b(@vr2 cc1<? extends T> cc1) {
        return t81.m65491a(cc1);
    }

    @vr2
    @fx2
    @k91
    /* renamed from: b0 */
    public static final <T> m81<T> m64332b0(@vr2 m81<? extends T> m81, @vr2 ec1<? super T, Long> ec1) {
        return z81.m72599b(m81, ec1);
    }

    @vr2
    /* renamed from: b1 */
    public static final Void m64333b1() {
        return f91.m47634p();
    }

    @fy0
    @vr2
    /* renamed from: b2 */
    public static final <T, R> m81<R> m64334b2(@vr2 m81<? extends T> m81, @C7381yp @vr2 uc1<? super o81<? super R>, ? super T, ? super b80<? super un4>, ? extends Object> uc1) {
        return e91.m46077n(m81, uc1);
    }

    @k91
    @vr2
    /* renamed from: c */
    public static final <T> m81<T> m64335c(@vr2 ec1<? super b80<? super T>, ? extends Object> ec1) {
        return t81.m65492b(ec1);
    }

    @k91
    @vr2
    /* renamed from: c0 */
    public static final <T> m81<T> m64336c0(@vr2 m81<? extends T> m81, long j) {
        return z81.m72600c(m81, j);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Collect flow in the desired context instead")
    /* renamed from: c1 */
    public static final <T> m81<T> m64337c1(@vr2 m81<? extends T> m81, @vr2 b90 b90) {
        return f91.m47635q(m81, b90);
    }

    @vr2
    /* renamed from: c2 */
    public static final <T, R> m81<R> m64338c2(@vr2 m81<? extends T> m81, @C7381yp @vr2 uc1<? super o81<? super R>, ? super T, ? super b80<? super Boolean>, ? extends Object> uc1) {
        return d91.m44828i(m81, uc1);
    }

    @vr2
    /* renamed from: d */
    public static final m81<Integer> m64339d(@vr2 is1 is1) {
        return t81.m65493c(is1);
    }

    @uw1(name = "debounceDuration")
    @vr2
    @fx2
    @k91
    /* renamed from: d0 */
    public static final <T> m81<T> m64340d0(@vr2 m81<? extends T> m81, @vr2 ec1<? super T, fq0> ec1) {
        return z81.m72601d(m81, ec1);
    }

    @vr2
    /* renamed from: d1 */
    public static final <T> m81<T> m64341d1(@vr2 m81<? extends T> m81, @vr2 uc1<? super o81<? super T>, ? super Throwable, ? super b80<? super un4>, ? extends Object> uc1) {
        return b91.m39509d(m81, uc1);
    }

    @vr2
    @z73
    /* renamed from: d2 */
    public static final <T, R> m81<R> m64342d2(@vr2 m81<? extends T> m81, @C7381yp @vr2 uc1<? super o81<? super R>, ? super T, ? super b80<? super un4>, ? extends Object> uc1) {
        return b91.m39513h(m81, uc1);
    }

    @vr2
    /* renamed from: e */
    public static final m81<Long> m64343e(@vr2 da2 da2) {
        return t81.m65494d(da2);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @oi3(expression = "onEach { delay(timeMillis) }", imports = {}))
    /* renamed from: e0 */
    public static final <T> m81<T> m64344e0(@vr2 m81<? extends T> m81, long j) {
        return f91.m47628j(m81, j);
    }

    @vr2
    /* renamed from: e1 */
    public static final <T> m81<T> m64345e1(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super un4>, ? extends Object> sc1) {
        return i91.m51904g(m81, sc1);
    }

    @vr2
    /* renamed from: e2 */
    public static final <T> m81<cq1<T>> m64346e2(@vr2 m81<? extends T> m81) {
        return i91.m51908k(m81);
    }

    @vr2
    /* renamed from: f */
    public static final <T> m81<T> m64347f(@vr2 zt3<? extends T> zt3) {
        return t81.m65495e(zt3);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @oi3(expression = "onStart { delay(timeMillis) }", imports = {}))
    /* renamed from: f0 */
    public static final <T> m81<T> m64348f0(@vr2 m81<? extends T> m81, long j) {
        return f91.m47629k(m81, j);
    }

    @vr2
    /* renamed from: f1 */
    public static final <T> m81<T> m64349f1(@vr2 m81<? extends T> m81, @vr2 sc1<? super o81<? super T>, ? super b80<? super un4>, ? extends Object> sc1) {
        return b91.m39510e(m81, sc1);
    }

    @vr2
    /* renamed from: f2 */
    public static final <T1, T2, R> m81<R> m64350f2(@vr2 m81<? extends T1> m81, @vr2 m81<? extends T2> m812, @vr2 uc1<? super T1, ? super T2, ? super b80<? super R>, ? extends Object> uc1) {
        return j91.m52992s(m81, m812, uc1);
    }

    @vr2
    /* renamed from: g */
    public static final <T> m81<T> m64351g(@vr2 Iterable<? extends T> iterable) {
        return t81.m65496f(iterable);
    }

    @vr2
    /* renamed from: g0 */
    public static final <T> m81<T> m64352g0(@vr2 m81<? extends T> m81) {
        return a91.m36097a(m81);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @oi3(expression = "catch { emitAll(fallback) }", imports = {}))
    /* renamed from: g1 */
    public static final <T> m81<T> m64353g1(@vr2 m81<? extends T> m81, @vr2 m81<? extends T> m812) {
        return f91.m47636r(m81, m812);
    }

    @vr2
    /* renamed from: h */
    public static final <T> m81<T> m64354h(@vr2 Iterator<? extends T> it) {
        return t81.m65497g(it);
    }

    @vr2
    /* renamed from: h0 */
    public static final <T> m81<T> m64355h0(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super T, Boolean> sc1) {
        return a91.m36098b(m81, sc1);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @oi3(expression = "catch { emitAll(fallback) }", imports = {}))
    /* renamed from: h1 */
    public static final <T> m81<T> m64356h1(@vr2 m81<? extends T> m81, @vr2 m81<? extends T> m812) {
        return f91.m47637s(m81, m812);
    }

    @vr2
    /* renamed from: i */
    public static final m81<Integer> m64357i(@vr2 int[] iArr) {
        return t81.m65498h(iArr);
    }

    @vr2
    /* renamed from: i0 */
    public static final <T, K> m81<T> m64358i0(@vr2 m81<? extends T> m81, @vr2 ec1<? super T, ? extends K> ec1) {
        return a91.m36099c(m81, ec1);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @oi3(expression = "catch { emit(fallback) }", imports = {}))
    /* renamed from: i1 */
    public static final <T> m81<T> m64359i1(@vr2 m81<? extends T> m81, T t) {
        return f91.m47638t(m81, t);
    }

    @vr2
    /* renamed from: j */
    public static final m81<Long> m64360j(@vr2 long[] jArr) {
        return t81.m65499i(jArr);
    }

    @vr2
    /* renamed from: j0 */
    public static final <T> m81<T> m64361j0(@vr2 m81<? extends T> m81, int i) {
        return d91.m44823d(m81, i);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @oi3(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    /* renamed from: j1 */
    public static final <T> m81<T> m64362j1(@vr2 m81<? extends T> m81, T t, @vr2 ec1<? super Throwable, Boolean> ec1) {
        return f91.m47639u(m81, t, ec1);
    }

    @vr2
    /* renamed from: k */
    public static final <T> m81<T> m64363k(@vr2 T[] tArr) {
        return t81.m65500j(tArr);
    }

    @vr2
    /* renamed from: k0 */
    public static final <T> m81<T> m64364k0(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super Boolean>, ? extends Object> sc1) {
        return d91.m44824e(m81, sc1);
    }

    @vr2
    /* renamed from: l */
    public static final <T> qx3<T> m64366l(@vr2 xm2<T> xm2) {
        return h91.m50306a(xm2);
    }

    @ss2
    /* renamed from: l0 */
    public static final <T> Object m64367l0(@vr2 o81<? super T> o81, @vr2 m81<? extends T> m81, @vr2 b80<? super un4> b80) {
        return v81.m67779g(o81, m81, b80);
    }

    @vr2
    /* renamed from: l1 */
    public static final <T> m81<T> m64368l1(@vr2 m81<? extends T> m81, @vr2 sc1<? super o81<? super T>, ? super b80<? super un4>, ? extends Object> sc1) {
        return b91.m39511f(m81, sc1);
    }

    @vr2
    /* renamed from: m */
    public static final <T> d34<T> m64369m(@vr2 ym2<T> ym2) {
        return h91.m50307b(ym2);
    }

    @ss2
    /* renamed from: m0 */
    public static final <T> Object m64370m0(@vr2 o81<? super T> o81, @vr2 lg3<? extends T> lg3, @vr2 b80<? super un4> b80) {
        return u81.m66890d(o81, lg3, b80);
    }

    @vr2
    /* renamed from: m1 */
    public static final <T> qx3<T> m64371m1(@vr2 qx3<? extends T> qx3, @vr2 sc1<? super o81<? super T>, ? super b80<? super un4>, ? extends Object> sc1) {
        return h91.m50311f(qx3, sc1);
    }

    @vr2
    /* renamed from: n0 */
    public static final <T> m81<T> m64373n0() {
        return t81.m65503m();
    }

    @k91
    @vr2
    /* renamed from: n1 */
    public static final <T> lg3<T> m64374n1(@vr2 m81<? extends T> m81, @vr2 m90 m90) {
        return u81.m66892f(m81, m90);
    }

    @vr2
    /* renamed from: o */
    public static final <T> m81<T> m64375o(@vr2 m81<? extends T> m81, int i, @vr2 C6593qo qoVar) {
        return x81.m70013b(m81, i, qoVar);
    }

    /* renamed from: o0 */
    public static final void m64376o0(@vr2 o81<?> o81) {
        b91.m39507b(o81);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @oi3(expression = "this.shareIn(scope, 0)", imports = {}))
    /* renamed from: o1 */
    public static final <T> m81<T> m64377o1(@vr2 m81<? extends T> m81) {
        return f91.m47641w(m81);
    }

    @vr2
    /* renamed from: p0 */
    public static final <T> m81<T> m64379p0(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super Boolean>, ? extends Object> sc1) {
        return i91.m51898a(m81, sc1);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @oi3(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    /* renamed from: p1 */
    public static final <T> m81<T> m64380p1(@vr2 m81<? extends T> m81, int i) {
        return f91.m47642x(m81, i);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Collect flow in the desired context instead")
    /* renamed from: q1 */
    public static final <T> m81<T> m64383q1(@vr2 m81<? extends T> m81, @vr2 b90 b90) {
        return f91.m47643y(m81, b90);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @oi3(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    /* renamed from: r */
    public static final <T> m81<T> m64384r(@vr2 m81<? extends T> m81) {
        return f91.m47619a(m81);
    }

    @vr2
    /* renamed from: r0 */
    public static final <T> m81<T> m64385r0(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super Boolean>, ? extends Object> sc1) {
        return i91.m51900c(m81, sc1);
    }

    @vr2
    /* renamed from: r1 */
    public static final <T> m81<T> m64386r1(@vr2 lg3<? extends T> lg3) {
        return u81.m66893g(lg3);
    }

    @vr2
    /* renamed from: s */
    public static final <T> m81<T> m64387s(@C7381yp @vr2 sc1<? super p53<? super T>, ? super b80<? super un4>, ? extends Object> sc1) {
        return t81.m65501k(sc1);
    }

    @vr2
    /* renamed from: s0 */
    public static final <T> m81<T> m64388s0(@vr2 m81<? extends T> m81) {
        return i91.m51901d(m81);
    }

    @ss2
    /* renamed from: s1 */
    public static final <S, T extends S> Object m64389s1(@vr2 m81<? extends T> m81, @vr2 uc1<? super S, ? super T, ? super b80<? super S>, ? extends Object> uc1, @vr2 b80<? super S> b80) {
        return g91.m49146i(m81, uc1, b80);
    }

    @vr2
    /* renamed from: t */
    public static final <T> m81<T> m64390t(@vr2 m81<? extends T> m81) {
        return x81.m70016e(m81);
    }

    @ss2
    /* renamed from: t0 */
    public static final <T> Object m64391t0(@vr2 m81<? extends T> m81, @vr2 b80<? super T> b80) {
        return g91.m49138a(m81, b80);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @oi3(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    /* renamed from: t1 */
    public static final <T> m81<T> m64392t1(@vr2 m81<? extends T> m81) {
        return f91.m47644z(m81);
    }

    @vr2
    /* renamed from: u */
    public static final <T> m81<T> m64393u(@vr2 m81<? extends T> m81, @vr2 uc1<? super o81<? super T>, ? super Throwable, ? super b80<? super un4>, ? extends Object> uc1) {
        return c91.m40764a(m81, uc1);
    }

    @ss2
    /* renamed from: u0 */
    public static final <T> Object m64394u0(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super Boolean>, ? extends Object> sc1, @vr2 b80<? super T> b80) {
        return g91.m49139b(m81, sc1, b80);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @oi3(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    /* renamed from: u1 */
    public static final <T> m81<T> m64395u1(@vr2 m81<? extends T> m81, int i) {
        return f91.m47608A(m81, i);
    }

    @ss2
    /* renamed from: v */
    public static final <T> Object m64396v(@vr2 m81<? extends T> m81, @vr2 o81<? super T> o81, @vr2 b80<? super Throwable> b80) {
        return c91.m40765b(m81, o81, b80);
    }

    @ss2
    /* renamed from: v0 */
    public static final <T> Object m64397v0(@vr2 m81<? extends T> m81, @vr2 b80<? super T> b80) {
        return g91.m49140c(m81, b80);
    }

    @vr2
    /* renamed from: v1 */
    public static final <T> m81<T> m64398v1(@vr2 m81<? extends T> m81, long j, @vr2 sc1<? super Throwable, ? super b80<? super Boolean>, ? extends Object> sc1) {
        return c91.m40768e(m81, j, sc1);
    }

    @vr2
    /* renamed from: w */
    public static final <T> m81<T> m64399w(@C7381yp @vr2 sc1<? super p53<? super T>, ? super b80<? super un4>, ? extends Object> sc1) {
        return t81.m65502l(sc1);
    }

    @ss2
    /* renamed from: w0 */
    public static final <T> Object m64400w0(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super Boolean>, ? extends Object> sc1, @vr2 b80<? super T> b80) {
        return g91.m49141d(m81, sc1, b80);
    }

    @ss2
    /* renamed from: x */
    public static final Object m64402x(@vr2 m81<?> m81, @vr2 b80<? super un4> b80) {
        return v81.m67773a(m81, b80);
    }

    @vr2
    /* renamed from: x0 */
    public static final lg3<un4> m64403x0(@vr2 m90 m90, long j, long j2) {
        return z81.m72603f(m90, j, j2);
    }

    @vr2
    /* renamed from: x1 */
    public static final <T> m81<T> m64404x1(@vr2 m81<? extends T> m81, @vr2 vc1<? super o81<? super T>, ? super Throwable, ? super Long, ? super b80<? super Boolean>, ? extends Object> vc1) {
        return c91.m40770g(m81, vc1);
    }

    @vr2
    /* renamed from: y1 */
    public static final <T, R> m81<R> m64407y1(@vr2 m81<? extends T> m81, R r, @C7381yp @vr2 uc1<? super R, ? super T, ? super b80<? super R>, ? extends Object> uc1) {
        return i91.m51905h(m81, r, uc1);
    }

    @ss2
    /* renamed from: z */
    public static final <T> Object m64408z(@vr2 m81<? extends T> m81, @vr2 uc1<? super Integer, ? super T, ? super b80<? super un4>, ? extends Object> uc1, @vr2 b80<? super un4> b80) {
        return v81.m67776d(m81, uc1, b80);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @oi3(expression = "flatMapConcat(mapper)", imports = {}))
    /* renamed from: z0 */
    public static final <T, R> m81<R> m64409z0(@vr2 m81<? extends T> m81, @vr2 sc1<? super T, ? super b80<? super m81<? extends R>>, ? extends Object> sc1) {
        return f91.m47630l(m81, sc1);
    }

    @vr2
    /* renamed from: z1 */
    public static final <T> m81<T> m64410z1(@vr2 m81<? extends T> m81, @vr2 uc1<? super T, ? super T, ? super b80<? super T>, ? extends Object> uc1) {
        return i91.m51906i(m81, uc1);
    }
}
