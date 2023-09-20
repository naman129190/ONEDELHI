package com.onedelhi.secure;

import android.os.Bundle;

public final class d56 {

    /* renamed from: a */
    public final long f10636a;
    @mr2

    /* renamed from: a */
    public final Bundle f10637a;
    @mr2

    /* renamed from: a */
    public final String f10638a;
    @mr2

    /* renamed from: b */
    public final String f10639b;

    public d56(@mr2 String str, @mr2 String str2, @ts2 Bundle bundle, long j) {
        this.f10638a = str;
        this.f10639b = str2;
        this.f10637a = bundle;
        this.f10636a = j;
    }

    /* renamed from: b */
    public static d56 m12971b(xj5 xj5) {
        return new d56(xj5.f22604b, xj5.f22605c, xj5.f22602a.mo17314L2(), xj5.f22603b);
    }

    /* renamed from: a */
    public final xj5 mo14531a() {
        return new xj5(this.f10638a, new hj5(new Bundle(this.f10637a)), this.f10639b, this.f10636a);
    }

    public final String toString() {
        String str = this.f10639b;
        String str2 = this.f10638a;
        String obj = this.f10637a.toString();
        return "origin=" + str + ",name=" + str2 + ",params=" + obj;
    }
}
