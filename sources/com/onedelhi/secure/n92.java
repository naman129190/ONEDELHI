package com.onedelhi.secure;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

public class n92 implements ya2 {

    /* renamed from: a */
    public static final Set<String> f17229a = new HashSet();

    /* renamed from: a */
    public void mo20998a(String str) {
        mo21001d(str, (Throwable) null);
    }

    /* renamed from: b */
    public void mo20999b(String str, Throwable th) {
        if (h02.f12851a) {
            Log.d(h02.f12850a, str, th);
        }
    }

    /* renamed from: c */
    public void mo21000c(String str) {
        mo21002e(str, (Throwable) null);
    }

    /* renamed from: d */
    public void mo21001d(String str, Throwable th) {
        Set<String> set = f17229a;
        if (!set.contains(str)) {
            Log.w(h02.f12850a, str, th);
            set.add(str);
        }
    }

    /* renamed from: e */
    public void mo21002e(String str, Throwable th) {
        if (h02.f12851a) {
            Log.d(h02.f12850a, str, th);
        }
    }
}
