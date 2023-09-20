package com.onedelhi.secure;

import android.app.Activity;
import android.app.Fragment;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.ed2;
import java.util.ArrayList;
import java.util.List;

@VisibleForTesting
public final class jh5 extends bi0 {

    /* renamed from: a */
    public Activity f14159a;

    /* renamed from: a */
    public final Fragment f14160a;

    /* renamed from: a */
    public final List f14161a = new ArrayList();

    /* renamed from: b */
    public su2 f14162b;

    @VisibleForTesting
    public jh5(Fragment fragment) {
        this.f14160a = fragment;
    }

    /* renamed from: v */
    public static /* synthetic */ void m18586v(jh5 jh5, Activity activity) {
        jh5.f14159a = activity;
        jh5.mo18434x();
    }

    /* renamed from: a */
    public final void mo13706a(su2 su2) {
        this.f14162b = su2;
        mo18434x();
    }

    /* renamed from: w */
    public final void mo18433w(fv2 fv2) {
        if (mo13707b() != null) {
            ((bh5) mo13707b()).mo13704i(fv2);
        } else {
            this.f14161a.add(fv2);
        }
    }

    /* renamed from: x */
    public final void mo18434x() {
        if (this.f14159a != null && this.f14162b != null && mo13707b() == null) {
            try {
                ed2.m13700a(this.f14159a);
                this.f14162b.mo18095a(new bh5(this.f14160a, zs5.m33393a(this.f14159a, (ed2.C2056a) null).mo14023R7(nt2.m23166l8(this.f14159a))));
                for (fv2 i : this.f14161a) {
                    ((bh5) mo13707b()).mo13704i(i);
                }
                this.f14161a.clear();
            } catch (RemoteException e) {
                throw new qo3(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
