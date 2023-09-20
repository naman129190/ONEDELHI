package com.onedelhi.secure;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

public final class jw5 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Context f14582a;

    /* renamed from: a */
    public final /* synthetic */ Bundle f14583a;

    /* renamed from: b */
    public final /* synthetic */ j36 f14584b;

    /* renamed from: b */
    public final /* synthetic */ String f14585b;

    /* renamed from: c */
    public final /* synthetic */ String f14586c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jw5(j36 j36, String str, String str2, Context context, Bundle bundle) {
        super(j36, true);
        this.f14584b = j36;
        this.f14585b = str;
        this.f14586c = str2;
        this.f14582a = context;
        this.f14583a = bundle;
    }

    /* renamed from: a */
    public final void mo12479a() {
        String str;
        String str2;
        String str3;
        try {
            if (this.f14584b.mo18133w(this.f14585b, this.f14586c)) {
                String str4 = this.f14586c;
                str2 = this.f14585b;
                str = str4;
                str3 = this.f14584b.f14001a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            Preconditions.checkNotNull(this.f14582a);
            j36 j36 = this.f14584b;
            j36.f14000a = j36.mo18097C(this.f14582a, true);
            if (this.f14584b.f14000a == null) {
                Log.w(this.f14584b.f14001a, "Failed to connect to measurement client.");
                return;
            }
            int a = DynamiteModule.m8889a(this.f14582a, ModuleDescriptor.MODULE_ID);
            int c = DynamiteModule.m8890c(this.f14582a, ModuleDescriptor.MODULE_ID);
            ((dt5) Preconditions.checkNotNull(this.f14584b.f14000a)).initialize(nt2.m23166l8(this.f14582a), new nu5(76003, (long) Math.max(a, c), c < a, str3, str2, str, this.f14583a, e96.m13645a(this.f14582a)), this.f8559b);
        } catch (Exception e) {
            this.f14584b.mo18130t(e, true, false);
        }
    }
}
