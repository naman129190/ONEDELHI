package com.onedelhi.secure;

import android.os.Binder;

public final /* synthetic */ class hu5 {
    /* renamed from: a */
    public static Object m16941a(lu5 lu5) {
        long clearCallingIdentity;
        try {
            return lu5.mo19900a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object a = lu5.mo19900a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
