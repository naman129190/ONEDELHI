package com.onedelhi.secure;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class lv5 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Activity f15640a;

    /* renamed from: b */
    public final /* synthetic */ j36 f15641b;

    /* renamed from: b */
    public final /* synthetic */ String f15642b;

    /* renamed from: c */
    public final /* synthetic */ String f15643c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lv5(j36 j36, Activity activity, String str, String str2) {
        super(j36, true);
        this.f15641b = j36;
        this.f15640a = activity;
        this.f15642b = str;
        this.f15643c = str2;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f15641b.f14000a)).setCurrentScreen(nt2.m23166l8(this.f15640a), this.f15642b, this.f15643c, this.f8559b);
    }
}
