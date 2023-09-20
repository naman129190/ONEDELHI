package com.onedelhi.secure;

import android.os.Bundle;
import android.os.IBinder;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/eq;", "", "Landroid/os/Bundle;", "bundle", "", "key", "Landroid/os/IBinder;", "value", "Lcom/onedelhi/secure/un4;", "a", "<init>", "()V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
@sj3(18)
/* renamed from: com.onedelhi.secure.eq */
public final class C2069eq {
    @vr2

    /* renamed from: a */
    public static final C2069eq f11317a = new C2069eq();

    @zw1
    @pn0
    /* renamed from: a */
    public static final void m13939a(@vr2 Bundle bundle, @vr2 String str, @ss2 IBinder iBinder) {
        jt1.m53777p(bundle, "bundle");
        jt1.m53777p(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
