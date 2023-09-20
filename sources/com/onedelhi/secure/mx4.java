package com.onedelhi.secure;

import android.os.IBinder;

public class mx4 implements ox4 {

    /* renamed from: a */
    public final IBinder f16903a;

    public mx4(IBinder iBinder) {
        this.f16903a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof mx4) && ((mx4) obj).f16903a.equals(this.f16903a);
    }

    public int hashCode() {
        return this.f16903a.hashCode();
    }
}
