package com.onedelhi.secure;

import com.onedelhi.secure.lg3;
import com.onedelhi.secure.st3;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/onedelhi/secure/wv;", "E", "Lcom/onedelhi/secure/st3;", "Lcom/onedelhi/secure/lg3;", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.wv */
public interface C7184wv<E> extends st3<E>, lg3<E> {

    /* renamed from: a */
    public static final int f37120a = Integer.MAX_VALUE;
    @vr2

    /* renamed from: a */
    public static final C7186b f37121a = C7186b.f37128a;
    @vr2

    /* renamed from: a */
    public static final String f37122a = "kotlinx.coroutines.channels.defaultBuffer";

    /* renamed from: b */
    public static final int f37123b = 0;

    /* renamed from: c */
    public static final int f37124c = -1;

    /* renamed from: d */
    public static final int f37125d = -2;

    /* renamed from: e */
    public static final int f37126e = -3;

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.wv$a */
    public static final class C7185a {
        @vr2
        /* renamed from: b */
        public static <E> gt3<E> m69644b(@vr2 C7184wv<E> wvVar) {
            return lg3.C6006a.m55598d(wvVar);
        }

        @xj0(level = ak0.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @oi3(expression = "trySend(element).isSuccess", imports = {}))
        /* renamed from: c */
        public static <E> boolean m69645c(@vr2 C7184wv<E> wvVar, E e) {
            return st3.C6793a.m64881c(wvVar, e);
        }

        @ss2
        @xj0(level = ak0.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @oi3(expression = "tryReceive().getOrNull()", imports = {}))
        /* renamed from: d */
        public static <E> E m69646d(@vr2 C7184wv<E> wvVar) {
            return lg3.C6006a.m55602h(wvVar);
        }

        @xj0(level = ak0.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @oi3(expression = "receiveCatching().getOrNull()", imports = {}))
        @ib2
        @ss2
        /* renamed from: e */
        public static <E> Object m69647e(@vr2 C7184wv<E> wvVar, @vr2 b80<? super E> b80) {
            return lg3.C6006a.m55603i(wvVar, b80);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/wv$b;", "", "", "CHANNEL_DEFAULT_CAPACITY", "I", "a", "()I", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.wv$b */
    public static final class C7186b {

        /* renamed from: a */
        public static final int f37127a = Integer.MAX_VALUE;

        /* renamed from: a */
        public static final /* synthetic */ C7186b f37128a = new C7186b();
        @vr2

        /* renamed from: a */
        public static final String f37129a = "kotlinx.coroutines.channels.defaultBuffer";

        /* renamed from: b */
        public static final int f37130b = 0;

        /* renamed from: c */
        public static final int f37131c = -1;

        /* renamed from: d */
        public static final int f37132d = -2;

        /* renamed from: e */
        public static final int f37133e = -3;

        /* renamed from: f */
        public static final int f37134f = g94.m49183b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        /* renamed from: a */
        public final int mo46880a() {
            return f37134f;
        }
    }
}
