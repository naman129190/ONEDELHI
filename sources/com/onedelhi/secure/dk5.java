package com.onedelhi.secure;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

@VisibleForTesting
public final class dk5 implements p44 {

    /* renamed from: a */
    public final Fragment f10800a;

    /* renamed from: a */
    public final ao1 f10801a;

    public dk5(Fragment fragment, ao1 ao1) {
        this.f10801a = (ao1) Preconditions.checkNotNull(ao1);
        this.f10800a = (Fragment) Preconditions.checkNotNull(fragment);
    }

    /* renamed from: a */
    public final void mo13628a(Activity activity, Bundle bundle, @ts2 Bundle bundle2) {
        try {
            Bundle bundle3 = new Bundle();
            us5.m29561b(bundle2, bundle3);
            this.f10801a.mo13210S2(nt2.m23166l8(activity), (StreetViewPanoramaOptions) null, bundle3);
            us5.m29561b(bundle3, bundle2);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: c */
    public final void mo13630c() {
        try {
            this.f10801a.mo13212c();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: d */
    public final void mo13631d() {
        try {
            this.f10801a.mo13213d();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: e */
    public final void mo13632e() {
        try {
            this.f10801a.mo13214e();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: f */
    public final void mo13633f() {
        try {
            this.f10801a.mo13215f();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: g */
    public final void mo13634g() {
        try {
            this.f10801a.mo13217g();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: h */
    public final void mo13635h(@ts2 Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            us5.m29561b(bundle, bundle2);
            Bundle arguments = this.f10800a.getArguments();
            if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                us5.m29562c(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
            }
            this.f10801a.mo13218h(bundle2);
            us5.m29561b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: i */
    public final void mo13704i(fv2 fv2) {
        try {
            this.f10801a.mo13216f0(new vj5(this, fv2));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: j */
    public final void mo13636j(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            us5.m29561b(bundle, bundle2);
            this.f10801a.mo13219j(bundle2);
            us5.m29561b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: k */
    public final View mo13637k(LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            us5.m29561b(bundle, bundle2);
            tn1 Y = this.f10801a.mo13211Y(nt2.m23166l8(layoutInflater), nt2.m23166l8(viewGroup), bundle2);
            us5.m29561b(bundle2, bundle);
            return (View) nt2.m23165k8(Y);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public final void onLowMemory() {
        try {
            this.f10801a.onLowMemory();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: v */
    public final void mo13641v() {
        try {
            this.f10801a.mo13222v();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }
}
