package com.onedelhi.secure;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.onedelhi.secure.ed2;
import java.util.ArrayList;
import java.util.List;

@VisibleForTesting
public final class pi5 extends bi0 {

    /* renamed from: a */
    public final Context f18548a;

    /* renamed from: a */
    public final ViewGroup f18549a;
    @ts2

    /* renamed from: a */
    public final StreetViewPanoramaOptions f18550a;

    /* renamed from: a */
    public final List f18551a = new ArrayList();

    /* renamed from: b */
    public su2 f18552b;

    @VisibleForTesting
    public pi5(ViewGroup viewGroup, Context context, @ts2 StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.f18549a = viewGroup;
        this.f18548a = context;
        this.f18550a = streetViewPanoramaOptions;
    }

    /* renamed from: a */
    public final void mo13706a(su2 su2) {
        this.f18552b = su2;
        mo22447w();
    }

    /* renamed from: v */
    public final void mo22446v(fv2 fv2) {
        if (mo13707b() != null) {
            ((hi5) mo13707b()).mo13704i(fv2);
        } else {
            this.f18551a.add(fv2);
        }
    }

    /* renamed from: w */
    public final void mo22447w() {
        if (this.f18552b != null && mo13707b() == null) {
            try {
                ed2.m13700a(this.f18548a);
                this.f18552b.mo18095a(new hi5(this.f18549a, zs5.m33393a(this.f18548a, (ed2.C2056a) null).mo14027l6(nt2.m23166l8(this.f18548a), this.f18550a)));
                for (fv2 i : this.f18551a) {
                    ((hi5) mo13707b()).mo13704i(i);
                }
                this.f18551a.clear();
            } catch (RemoteException e) {
                throw new qo3(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
