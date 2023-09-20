package com.onedelhi.secure;

import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0003H\u0007\u001a \u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u001a\b\u0010\u000e\u001a\u00020\rH\u0000¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/yb2;", "", "factories", "Lcom/onedelhi/secure/xb2;", "f", "", "d", "", "cause", "", "errorHint", "Lcom/onedelhi/secure/jj2;", "a", "", "e", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class ac2 {
    @vr2

    /* renamed from: a */
    public static final String f25814a = "kotlinx.coroutines.fast.service.loader";

    /* renamed from: a */
    public static final boolean f25815a = true;

    /* renamed from: a */
    public static final jj2 m38563a(Throwable th, String str) {
        if (f25815a) {
            return new jj2(th, str);
        }
        if (th == null) {
            m38567e();
            throw new b02();
        }
        throw th;
    }

    /* renamed from: b */
    public static /* synthetic */ jj2 m38564b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m38563a(th, str);
    }

    /* renamed from: c */
    public static /* synthetic */ void m38565c() {
    }

    @zs1
    /* renamed from: d */
    public static final boolean m38566d(@vr2 xb2 xb2) {
        return xb2.mo31905c1() instanceof jj2;
    }

    @vr2
    /* renamed from: e */
    public static final Void m38567e() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @zs1
    @vr2
    /* renamed from: f */
    public static final xb2 m38568f(@vr2 yb2 yb2, @vr2 List<? extends yb2> list) {
        try {
            return yb2.createDispatcher(list);
        } catch (Throwable th) {
            return m38563a(th, yb2.hintOnError());
        }
    }
}
