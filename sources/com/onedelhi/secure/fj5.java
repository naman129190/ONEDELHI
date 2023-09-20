package com.onedelhi.secure;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.GoogleMapOptions;

@VisibleForTesting
public final class fj5 implements yc2 {

    /* renamed from: a */
    public final Fragment f12095a;

    /* renamed from: a */
    public final pn1 f12096a;

    public fj5(Fragment fragment, pn1 pn1) {
        this.f12096a = (pn1) Preconditions.checkNotNull(pn1);
        this.f12095a = (Fragment) Preconditions.checkNotNull(fragment);
    }

    /* renamed from: a */
    public final void mo13628a(Activity activity, Bundle bundle, @ts2 Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            us5.m29561b(bundle2, bundle3);
            this.f12096a.mo22512D1(nt2.m23166l8(activity), googleMapOptions, bundle3);
            us5.m29561b(bundle3, bundle2);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: b */
    public final void mo13629b(wu2 wu2) {
        try {
            this.f12096a.mo22524r(new xi5(this, wu2));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: c */
    public final void mo13630c() {
        try {
            this.f12096a.mo22515c();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: d */
    public final void mo13631d() {
        try {
            this.f12096a.mo22516d();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: e */
    public final void mo13632e() {
        try {
            this.f12096a.mo22517e();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: f */
    public final void mo13633f() {
        try {
            this.f12096a.mo22518f();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: g */
    public final void mo13634g() {
        try {
            this.f12096a.mo22519g();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: h */
    public final void mo13635h(@ts2 Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            us5.m29561b(bundle, bundle2);
            Bundle arguments = this.f12095a.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                us5.m29562c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.f12096a.mo22520h(bundle2);
            us5.m29561b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: j */
    public final void mo13636j(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            us5.m29561b(bundle, bundle2);
            this.f12096a.mo22521j(bundle2);
            us5.m29561b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: k */
    public final View mo13637k(LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            Bundle bundle2 = new Bundle();
            us5.m29561b(bundle, bundle2);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            tn1 Y = this.f12096a.mo22514Y(nt2.m23166l8(layoutInflater), nt2.m23166l8(viewGroup), bundle2);
            StrictMode.setThreadPolicy(threadPolicy);
            us5.m29561b(bundle2, bundle);
            return (View) nt2.m23165k8(Y);
        } catch (RemoteException e) {
            throw new qo3(e);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    /* renamed from: l */
    public final void mo16023l(@ts2 Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            us5.m29561b(bundle, bundle2);
            this.f12096a.mo22511C(bundle2);
            us5.m29561b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: m */
    public final void mo16024m() {
        try {
            this.f12096a.mo22510B();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public final void onLowMemory() {
        try {
            this.f12096a.onLowMemory();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: v */
    public final void mo13641v() {
        try {
            this.f12096a.mo22525v();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }
}
