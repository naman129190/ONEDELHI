package com.onedelhi.secure;

import com.onedelhi.secure.nl3;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "ANDROID_DETECTED", "Z", "a", "()Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class e01 {

    /* renamed from: a */
    public static final boolean f27665a;

    static {
        Object obj;
        try {
            nl3.C6191a aVar = nl3.f32575a;
            obj = nl3.m58187b(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            nl3.C6191a aVar2 = nl3.f32575a;
            obj = nl3.m58187b(pl3.m61423a(th));
        }
        f27665a = nl3.m58195j(obj);
    }

    /* renamed from: a */
    public static final boolean m45748a() {
        return f27665a;
    }
}
