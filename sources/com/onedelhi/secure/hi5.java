package com.onedelhi.secure;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class hi5 implements p44 {

    /* renamed from: a */
    public View f13118a;

    /* renamed from: a */
    public final ViewGroup f13119a;

    /* renamed from: a */
    public final bo1 f13120a;

    public hi5(ViewGroup viewGroup, bo1 bo1) {
        this.f13120a = (bo1) Preconditions.checkNotNull(bo1);
        this.f13119a = (ViewGroup) Preconditions.checkNotNull(viewGroup);
    }

    /* renamed from: a */
    public final void mo13628a(Activity activity, Bundle bundle, @ts2 Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
    }

    /* renamed from: c */
    public final void mo13630c() {
        try {
            this.f13120a.mo13779c();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: d */
    public final void mo13631d() {
        try {
            this.f13120a.mo13780d();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: e */
    public final void mo13632e() {
        try {
            this.f13120a.mo13781e();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: f */
    public final void mo13633f() {
        try {
            this.f13120a.mo13782f();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: g */
    public final void mo13634g() {
        try {
            this.f13120a.mo13784g();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: h */
    public final void mo13635h(@ts2 Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            us5.m29561b(bundle, bundle2);
            this.f13120a.mo13785h(bundle2);
            us5.m29561b(bundle2, bundle);
            this.f13118a = (View) nt2.m23165k8(this.f13120a.mo13778b0());
            this.f13119a.removeAllViews();
            this.f13119a.addView(this.f13118a);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: i */
    public final void mo13704i(fv2 fv2) {
        try {
            this.f13120a.mo13783f0(new zh5(this, fv2));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: j */
    public final void mo13636j(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            us5.m29561b(bundle, bundle2);
            this.f13120a.mo13786j(bundle2);
            us5.m29561b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: k */
    public final View mo13637k(LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
    }

    public final void onLowMemory() {
        try {
            this.f13120a.onLowMemory();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: v */
    public final void mo13641v() {
        throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
    }
}
