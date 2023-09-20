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
public final class nd5 extends bi0 {

    /* renamed from: a */
    public Activity f17330a;

    /* renamed from: a */
    public final Fragment f17331a;

    /* renamed from: a */
    public final List f17332a = new ArrayList();

    /* renamed from: b */
    public su2 f17333b;

    @VisibleForTesting
    public nd5(Fragment fragment) {
        this.f17331a = fragment;
    }

    /* renamed from: v */
    public static /* synthetic */ void m22699v(nd5 nd5, Activity activity) {
        nd5.f17330a = activity;
        nd5.mo21170x();
    }

    /* renamed from: a */
    public final void mo13706a(su2 su2) {
        this.f17333b = su2;
        mo21170x();
    }

    /* renamed from: w */
    public final void mo21169w(wu2 wu2) {
        if (mo13707b() != null) {
            ((bd5) mo13707b()).mo13629b(wu2);
        } else {
            this.f17332a.add(wu2);
        }
    }

    /* renamed from: x */
    public final void mo21170x() {
        if (this.f17330a != null && this.f17333b != null && mo13707b() == null) {
            try {
                ed2.m13700a(this.f17330a);
                pn1 e7 = zs5.m33393a(this.f17330a, (ed2.C2056a) null).mo14025e7(nt2.m23166l8(this.f17330a));
                if (e7 != null) {
                    this.f17333b.mo18095a(new bd5(this.f17331a, e7));
                    for (wu2 b : this.f17332a) {
                        ((bd5) mo13707b()).mo13629b(b);
                    }
                    this.f17332a.clear();
                }
            } catch (RemoteException e) {
                throw new qo3(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
