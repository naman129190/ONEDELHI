package com.onedelhi.secure;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/fq;", "", "Landroid/os/Bundle;", "bundle", "", "key", "Landroid/util/Size;", "value", "Lcom/onedelhi/secure/un4;", "a", "Landroid/util/SizeF;", "b", "<init>", "()V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
@sj3(21)
/* renamed from: com.onedelhi.secure.fq */
public final class C2192fq {
    @vr2

    /* renamed from: a */
    public static final C2192fq f12267a = new C2192fq();

    @zw1
    @pn0
    /* renamed from: a */
    public static final void m15189a(@vr2 Bundle bundle, @vr2 String str, @ss2 Size size) {
        jt1.m53777p(bundle, "bundle");
        jt1.m53777p(str, "key");
        bundle.putSize(str, size);
    }

    @zw1
    @pn0
    /* renamed from: b */
    public static final void m15190b(@vr2 Bundle bundle, @vr2 String str, @ss2 SizeF sizeF) {
        jt1.m53777p(bundle, "bundle");
        jt1.m53777p(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
