package com.onedelhi.secure;

import android.app.Activity;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.ed2;
import java.util.ArrayList;
import java.util.List;

@VisibleForTesting
public final class nj5 extends bi0 {

    /* renamed from: a */
    public Activity f17474a;

    /* renamed from: a */
    public final Fragment f17475a;

    /* renamed from: a */
    public final List f17476a = new ArrayList();

    /* renamed from: b */
    public su2 f17477b;

    @VisibleForTesting
    public nj5(Fragment fragment) {
        this.f17475a = fragment;
    }

    /* renamed from: v */
    public static /* synthetic */ void m22911v(nj5 nj5, Activity activity) {
        nj5.f17474a = activity;
        nj5.mo21348x();
    }

    /* renamed from: a */
    public final void mo13706a(su2 su2) {
        this.f17477b = su2;
        mo21348x();
    }

    /* renamed from: w */
    public final void mo21347w(wu2 wu2) {
        if (mo13707b() != null) {
            ((fj5) mo13707b()).mo13629b(wu2);
        } else {
            this.f17476a.add(wu2);
        }
    }

    /* renamed from: x */
    public final void mo21348x() {
        if (this.f17474a != null && this.f17477b != null && mo13707b() == null) {
            try {
                ed2.m13700a(this.f17474a);
                pn1 e7 = zs5.m33393a(this.f17474a, (ed2.C2056a) null).mo14025e7(nt2.m23166l8(this.f17474a));
                if (e7 != null) {
                    this.f17477b.mo18095a(new fj5(this.f17475a, e7));
                    for (wu2 b : this.f17476a) {
                        ((fj5) mo13707b()).mo13629b(b);
                    }
                    this.f17476a.clear();
                }
            } catch (RemoteException e) {
                throw new qo3(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
