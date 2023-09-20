package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;

public final class ar6 {

    /* renamed from: a */
    public final long f9506a;

    /* renamed from: a */
    public final Object f9507a;

    /* renamed from: a */
    public final String f9508a;

    /* renamed from: b */
    public final String f9509b;

    /* renamed from: c */
    public final String f9510c;

    public ar6(String str, String str2, String str3, long j, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(obj);
        this.f9508a = str;
        this.f9509b = str2;
        this.f9510c = str3;
        this.f9506a = j;
        this.f9507a = obj;
    }
}
