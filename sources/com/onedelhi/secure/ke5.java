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
public final class ke5 implements yc2 {

    /* renamed from: a */
    public View f14867a;

    /* renamed from: a */
    public final ViewGroup f14868a;

    /* renamed from: a */
    public final qn1 f14869a;

    public ke5(ViewGroup viewGroup, qn1 qn1) {
        this.f14869a = (qn1) Preconditions.checkNotNull(qn1);
        this.f14868a = (ViewGroup) Preconditions.checkNotNull(viewGroup);
    }

    /* renamed from: a */
    public final void mo13628a(Activity activity, Bundle bundle, @ts2 Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
    }

    /* renamed from: b */
    public final void mo13629b(wu2 wu2) {
        try {
            this.f14869a.mo23269r(new zd5(this, wu2));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: c */
    public final void mo13630c() {
        try {
            this.f14869a.mo23261c();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: d */
    public final void mo13631d() {
        try {
            this.f14869a.mo23262d();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: e */
    public final void mo13632e() {
        try {
            this.f14869a.mo23263e();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: f */
    public final void mo13633f() {
        try {
            this.f14869a.mo23264f();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: g */
    public final void mo13634g() {
        try {
            this.f14869a.mo23265g();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: h */
    public final void mo13635h(@ts2 Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            us5.m29561b(bundle, bundle2);
            this.f14869a.mo23266h(bundle2);
            us5.m29561b(bundle2, bundle);
            this.f14867a = (View) nt2.m23165k8(this.f14869a.mo23260b0());
            this.f14868a.removeAllViews();
            this.f14868a.addView(this.f14867a);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: j */
    public final void mo13636j(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            us5.m29561b(bundle, bundle2);
            this.f14869a.mo23267j(bundle2);
            us5.m29561b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: k */
    public final View mo13637k(LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }

    /* renamed from: l */
    public final void mo19056l(@ts2 Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            us5.m29561b(bundle, bundle2);
            this.f14869a.mo23258C(bundle2);
            us5.m29561b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: m */
    public final void mo19057m() {
        try {
            this.f14869a.mo23257B();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public final void onLowMemory() {
        try {
            this.f14869a.onLowMemory();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: v */
    public final void mo13641v() {
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
    }
}
