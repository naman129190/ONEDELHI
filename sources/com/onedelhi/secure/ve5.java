package com.onedelhi.secure;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.GoogleMapOptions;
import com.onedelhi.secure.ed2;
import java.util.ArrayList;
import java.util.List;

@VisibleForTesting
public final class ve5 extends bi0 {

    /* renamed from: a */
    public final Context f21736a;

    /* renamed from: a */
    public final ViewGroup f21737a;
    @ts2

    /* renamed from: a */
    public final GoogleMapOptions f21738a;

    /* renamed from: a */
    public final List f21739a = new ArrayList();

    /* renamed from: b */
    public su2 f21740b;

    @VisibleForTesting
    public ve5(ViewGroup viewGroup, Context context, @ts2 GoogleMapOptions googleMapOptions) {
        this.f21737a = viewGroup;
        this.f21736a = context;
        this.f21738a = googleMapOptions;
    }

    /* renamed from: a */
    public final void mo13706a(su2 su2) {
        this.f21740b = su2;
        mo26009w();
    }

    /* renamed from: v */
    public final void mo26008v(wu2 wu2) {
        if (mo13707b() != null) {
            ((ke5) mo13707b()).mo13629b(wu2);
        } else {
            this.f21739a.add(wu2);
        }
    }

    /* renamed from: w */
    public final void mo26009w() {
        if (this.f21740b != null && mo13707b() == null) {
            try {
                ed2.m13700a(this.f21736a);
                qn1 D3 = zs5.m33393a(this.f21736a, (ed2.C2056a) null).mo14020D3(nt2.m23166l8(this.f21736a), this.f21738a);
                if (D3 != null) {
                    this.f21740b.mo18095a(new ke5(this.f21737a, D3));
                    for (wu2 b : this.f21739a) {
                        ((ke5) mo13707b()).mo13629b(b);
                    }
                    this.f21739a.clear();
                }
            } catch (RemoteException e) {
                throw new qo3(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
