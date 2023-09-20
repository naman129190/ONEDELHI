package com.google.android.gms.tasks;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nu2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.w94;

@KeepForSdk
public class NativeOnCompleteListener implements nu2<Object> {

    /* renamed from: a */
    public final long f7591a;

    @KeepForSdk
    public NativeOnCompleteListener(long j) {
        this.f7591a = j;
    }

    @KeepForSdk
    /* renamed from: a */
    public static void m9196a(@mr2 w94<Object> w94, long j) {
        w94.mo17573e(new NativeOnCompleteListener(j));
    }

    @KeepForSdk
    public native void nativeOnComplete(long j, @ts2 Object obj, boolean z, boolean z2, @ts2 String str);

    @KeepForSdk
    public void onComplete(@mr2 w94<Object> w94) {
        String str;
        Object obj;
        Exception q;
        if (w94.mo17590v()) {
            obj = w94.mo17586r();
            str = null;
        } else if (w94.mo17588t() || (q = w94.mo17585q()) == null) {
            obj = null;
            str = null;
        } else {
            str = q.getMessage();
            obj = null;
        }
        nativeOnComplete(this.f7591a, obj, w94.mo17590v(), w94.mo17588t(), str);
    }
}
