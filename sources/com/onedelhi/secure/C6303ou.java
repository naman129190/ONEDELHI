package com.onedelhi.secure;

import com.onedelhi.secure.nl3;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a{\u0010\u0010\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0013\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00022\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001a#\u0010\u0016\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\b\u001a\u001c\u0010\u0017\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"T", "Lkotlin/Function1;", "Lcom/onedelhi/secure/b80;", "", "completion", "Lcom/onedelhi/secure/un4;", "d", "(Lcom/onedelhi/secure/ec1;Lcom/onedelhi/secure/b80;)V", "R", "Lkotlin/Function2;", "receiver", "", "Lcom/onedelhi/secure/iy2;", "name", "cause", "onCancellation", "e", "(Lcom/onedelhi/secure/sc1;Ljava/lang/Object;Lcom/onedelhi/secure/b80;Lcom/onedelhi/secure/ec1;)V", "fatalCompletion", "c", "Lkotlin/Function0;", "block", "b", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.ou */
public final class C6303ou {
    /* renamed from: a */
    public static final void m59633a(b80<?> b80, Throwable th) {
        nl3.C6191a aVar = nl3.f32575a;
        b80.mo31191m0(nl3.m58187b(pl3.m61423a(th)));
        throw th;
    }

    /* renamed from: b */
    public static final void m59634b(b80<?> b80, cc1<un4> cc1) {
        try {
            cc1.invoke();
        } catch (Throwable th) {
            m59633a(b80, th);
        }
    }

    /* renamed from: c */
    public static final void m59635c(@vr2 b80<? super un4> b80, @vr2 b80<?> b802) {
        try {
            b80<? super un4> d = lt1.m56482d(b80);
            nl3.C6191a aVar = nl3.f32575a;
            rm0.m63748g(d, nl3.m58187b(un4.f36206a), (ec1) null, 2, (Object) null);
        } catch (Throwable th) {
            m59633a(b802, th);
        }
    }

    @zs1
    /* renamed from: d */
    public static final <T> void m59636d(@vr2 ec1<? super b80<? super T>, ? extends Object> ec1, @vr2 b80<? super T> b80) {
        try {
            b80<un4> d = lt1.m56482d(lt1.m56480b(ec1, b80));
            nl3.C6191a aVar = nl3.f32575a;
            rm0.m63748g(d, nl3.m58187b(un4.f36206a), (ec1) null, 2, (Object) null);
        } catch (Throwable th) {
            m59633a(b80, th);
        }
    }

    /* renamed from: e */
    public static final <R, T> void m59637e(@vr2 sc1<? super R, ? super b80<? super T>, ? extends Object> sc1, R r, @vr2 b80<? super T> b80, @ss2 ec1<? super Throwable, un4> ec1) {
        try {
            b80<un4> d = lt1.m56482d(lt1.m56481c(sc1, r, b80));
            nl3.C6191a aVar = nl3.f32575a;
            rm0.m63747f(d, nl3.m58187b(un4.f36206a), ec1);
        } catch (Throwable th) {
            m59633a(b80, th);
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m59638f(sc1 sc1, Object obj, b80 b80, ec1 ec1, int i, Object obj2) {
        if ((i & 4) != 0) {
            ec1 = null;
        }
        m59637e(sc1, obj, b80, ec1);
    }
}
