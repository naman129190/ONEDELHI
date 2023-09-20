package com.onedelhi.secure;

import com.onedelhi.secure.ak4;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/g;", "", "", "string", "", "a", "", "beginIndex", "endIndex", "b", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
@xj0(message = "changed in Okio 2.x")
/* renamed from: com.onedelhi.secure.g */
public final class C5341g {

    /* renamed from: a */
    public static final C5341g f28781a = new C5341g();

    @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    /* renamed from: a */
    public final long mo36409a(@vr2 String str) {
        jt1.m53777p(str, ak4.C1709b.f9167e);
        return iq4.m52592l(str, 0, 0, 3, (Object) null);
    }

    @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    /* renamed from: b */
    public final long mo36410b(@vr2 String str, int i, int i2) {
        jt1.m53777p(str, ak4.C1709b.f9167e);
        return iq4.m52591k(str, i, i2);
    }
}
