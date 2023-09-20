package com.onedelhi.secure;

import com.onedelhi.secure.nl3;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\n\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a0\u0010\u000e\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"T", "Lcom/onedelhi/secure/nl3;", "Lkotlin/Function1;", "", "Lcom/onedelhi/secure/iy2;", "name", "cause", "Lcom/onedelhi/secure/un4;", "onCancellation", "", "c", "(Ljava/lang/Object;Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "Lcom/onedelhi/secure/iu;", "caller", "b", "(Ljava/lang/Object;Lcom/onedelhi/secure/iu;)Ljava/lang/Object;", "state", "Lcom/onedelhi/secure/b80;", "uCont", "a", "(Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class s20 {
    @vr2
    /* renamed from: a */
    public static final <T> Object m64133a(@ss2 Object obj, @vr2 b80<? super T> b80) {
        if (obj instanceof m20) {
            nl3.C6191a aVar = nl3.f32575a;
            obj = pl3.m61423a(((m20) obj).f31975a);
        } else {
            nl3.C6191a aVar2 = nl3.f32575a;
        }
        return nl3.m58187b(obj);
    }

    @ss2
    /* renamed from: b */
    public static final <T> Object m64134b(@vr2 Object obj, @vr2 C5744iu<?> iuVar) {
        Throwable e = nl3.m58190e(obj);
        return e == null ? obj : new m20(e, false, 2, (wg0) null);
    }

    @ss2
    /* renamed from: c */
    public static final <T> Object m64135c(@vr2 Object obj, @ss2 ec1<? super Throwable, un4> ec1) {
        Throwable e = nl3.m58190e(obj);
        return e == null ? ec1 != null ? new n20(obj, ec1) : obj : new m20(e, false, 2, (wg0) null);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m64136d(Object obj, ec1 ec1, int i, Object obj2) {
        if ((i & 1) != 0) {
            ec1 = null;
        }
        return m64135c(obj, ec1);
    }
}
