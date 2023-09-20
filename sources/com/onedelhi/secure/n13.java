package com.onedelhi.secure;

import android.os.PersistableBundle;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\nH\u0007¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/n13;", "", "Landroid/os/PersistableBundle;", "persistableBundle", "", "key", "", "value", "Lcom/onedelhi/secure/un4;", "a", "", "b", "<init>", "()V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
@sj3(22)
public final class n13 {
    @vr2

    /* renamed from: a */
    public static final n13 f16984a = new n13();

    @zw1
    @pn0
    /* renamed from: a */
    public static final void m22272a(@vr2 PersistableBundle persistableBundle, @ss2 String str, boolean z) {
        jt1.m53777p(persistableBundle, "persistableBundle");
        persistableBundle.putBoolean(str, z);
    }

    @zw1
    @pn0
    /* renamed from: b */
    public static final void m22273b(@vr2 PersistableBundle persistableBundle, @ss2 String str, @vr2 boolean[] zArr) {
        jt1.m53777p(persistableBundle, "persistableBundle");
        jt1.m53777p(zArr, "value");
        persistableBundle.putBooleanArray(str, zArr);
    }
}
