package com.onedelhi.secure;

import android.os.SystemClock;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class y24 {
    @mr2
    /* renamed from: a */
    public static y24 m71158a(long j, long j2, long j3) {
        return new C5903kh(j, j2, j3);
    }

    @mr2
    /* renamed from: e */
    public static y24 m71159e() {
        return m71158a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    /* renamed from: b */
    public abstract long mo39258b();

    /* renamed from: c */
    public abstract long mo39259c();

    /* renamed from: d */
    public abstract long mo39260d();
}
