package com.onedelhi.secure;

import com.onedelhi.secure.C5945kw;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\u0007\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00000\u0002H\bø\u0001\u0000ø\u0001\u0001\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\b\u0010\t\u001a\\\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0002H\bø\u0001\u0000ø\u0001\u0001\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\r\u0010\t\u001a^\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\u0002H\bø\u0001\u0000ø\u0001\u0001\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u000e\u0010\t\u001a^\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\u0002H\bø\u0001\u0000ø\u0001\u0001\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u000f\u0010\t\u001a>\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u001a\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"T", "Lcom/onedelhi/secure/kw;", "Lkotlin/Function1;", "", "Lcom/onedelhi/secure/iy2;", "name", "exception", "onFailure", "e", "(Ljava/lang/Object;Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "value", "Lcom/onedelhi/secure/un4;", "action", "h", "g", "f", "E", "", "capacity", "Lcom/onedelhi/secure/qo;", "onBufferOverflow", "onUndeliveredElement", "Lcom/onedelhi/secure/wv;", "b", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.iw */
public final class C5751iw {
    @vr2
    /* renamed from: b */
    public static final <E> C7184wv<E> m52709b(int i, @vr2 C6593qo qoVar, @ss2 ec1<? super E, un4> ec1) {
        int i2 = 1;
        if (i == -2) {
            if (qoVar == C6593qo.SUSPEND) {
                i2 = C7184wv.f37121a.mo46880a();
            }
            return new C4659ba(i2, qoVar, ec1);
        } else if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? (i == 1 && qoVar == C6593qo.DROP_OLDEST) ? new r50(ec1) : new C4659ba(i, qoVar, ec1) : new s32(ec1) : qoVar == C6593qo.SUSPEND ? new ii3(ec1) : new C4659ba(1, qoVar, ec1);
        } else {
            if (qoVar != C6593qo.SUSPEND) {
                i2 = 0;
            }
            if (i2 != 0) {
                return new r50(ec1);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
    }

    /* renamed from: c */
    public static /* synthetic */ C7184wv m52710c(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m52711d(i, (C6593qo) null, (ec1) null, 6, (Object) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C7184wv m52711d(int i, C6593qo qoVar, ec1 ec1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            qoVar = C6593qo.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            ec1 = null;
        }
        return m52709b(i, qoVar, ec1);
    }

    /* renamed from: e */
    public static final <T> T m52712e(@vr2 Object obj, @vr2 ec1<? super Throwable, ? extends T> ec1) {
        return obj instanceof C5945kw.C5948c ? ec1.mo17094X(C5945kw.m55069f(obj)) : obj;
    }

    @vr2
    /* renamed from: f */
    public static final <T> Object m52713f(@vr2 Object obj, @vr2 ec1<? super Throwable, un4> ec1) {
        if (obj instanceof C5945kw.C5946a) {
            ec1.mo17094X(C5945kw.m55069f(obj));
        }
        return obj;
    }

    @vr2
    /* renamed from: g */
    public static final <T> Object m52714g(@vr2 Object obj, @vr2 ec1<? super Throwable, un4> ec1) {
        if (obj instanceof C5945kw.C5948c) {
            ec1.mo17094X(C5945kw.m55069f(obj));
        }
        return obj;
    }

    @vr2
    /* renamed from: h */
    public static final <T> Object m52715h(@vr2 Object obj, @vr2 ec1<? super T, un4> ec1) {
        if (!(obj instanceof C5945kw.C5948c)) {
            ec1.mo17094X(obj);
        }
        return obj;
    }
}
