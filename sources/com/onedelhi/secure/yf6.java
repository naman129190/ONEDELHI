package com.onedelhi.secure;

import android.os.Bundle;

public final class yf6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f23066a;

    /* renamed from: a */
    public final /* synthetic */ ri6 f23067a;

    /* renamed from: b */
    public final /* synthetic */ long f23068b;

    /* renamed from: b */
    public final /* synthetic */ String f23069b;

    /* renamed from: b */
    public final /* synthetic */ boolean f23070b;

    /* renamed from: c */
    public final /* synthetic */ String f23071c;

    /* renamed from: c */
    public final /* synthetic */ boolean f23072c;

    /* renamed from: d */
    public final /* synthetic */ String f23073d;

    /* renamed from: d */
    public final /* synthetic */ boolean f23074d;

    public yf6(ri6 ri6, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f23067a = ri6;
        this.f23069b = str;
        this.f23071c = str2;
        this.f23068b = j;
        this.f23066a = bundle;
        this.f23070b = z;
        this.f23072c = z2;
        this.f23074d = z3;
        this.f23073d = str3;
    }

    public final void run() {
        this.f23067a.mo23912w(this.f23069b, this.f23071c, this.f23068b, this.f23066a, this.f23070b, this.f23072c, this.f23074d, this.f23073d);
    }
}
