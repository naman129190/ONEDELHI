package com.onedelhi.secure;

import com.onedelhi.secure.nl3;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00038@X\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00038@X\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/b80;", "", "c", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "a", "classSimpleName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class if0 {
    @vr2
    /* renamed from: a */
    public static final String m52224a(@vr2 Object obj) {
        return obj.getClass().getSimpleName();
    }

    @vr2
    /* renamed from: b */
    public static final String m52225b(@vr2 Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @vr2
    /* renamed from: c */
    public static final String m52226c(@vr2 b80<?> b80) {
        Object obj;
        if (b80 instanceof qm0) {
            return b80.toString();
        }
        try {
            nl3.C6191a aVar = nl3.f32575a;
            obj = nl3.m58187b(b80 + '@' + m52225b(b80));
        } catch (Throwable th) {
            nl3.C6191a aVar2 = nl3.f32575a;
            obj = nl3.m58187b(pl3.m61423a(th));
        }
        Throwable e = nl3.m58190e(obj);
        String str = obj;
        if (e != null) {
            str = b80.getClass().getName() + '@' + m52225b(b80);
        }
        return (String) str;
    }
}
