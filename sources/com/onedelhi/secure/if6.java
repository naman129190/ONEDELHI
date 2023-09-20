package com.onedelhi.secure;

import android.os.Binder;

public final /* synthetic */ class if6 {
    /* renamed from: a */
    public static Object m17516a(lf6 lf6) {
        long clearCallingIdentity;
        try {
            return lf6.mo19544a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object a = lf6.mo19544a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
