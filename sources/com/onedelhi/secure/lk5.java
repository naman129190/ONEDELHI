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
public final class lk5 extends bi0 {

    /* renamed from: a */
    public Activity f15459a;

    /* renamed from: a */
    public final Fragment f15460a;

    /* renamed from: a */
    public final List f15461a = new ArrayList();

    /* renamed from: b */
    public su2 f15462b;

    @VisibleForTesting
    public lk5(Fragment fragment) {
        this.f15460a = fragment;
    }

    /* renamed from: v */
    public static /* synthetic */ void m20797v(lk5 lk5, Activity activity) {
        lk5.f15459a = activity;
        lk5.mo19671x();
    }

    /* renamed from: a */
    public final void mo13706a(su2 su2) {
        this.f15462b = su2;
        mo19671x();
    }

    /* renamed from: w */
    public final void mo19670w(fv2 fv2) {
        if (mo13707b() != null) {
            ((dk5) mo13707b()).mo13704i(fv2);
        } else {
            this.f15461a.add(fv2);
        }
    }

    /* renamed from: x */
    public final void mo19671x() {
        if (this.f15459a != null && this.f15462b != null && mo13707b() == null) {
            try {
                ed2.m13700a(this.f15459a);
                this.f15462b.mo18095a(new dk5(this.f15460a, zs5.m33393a(this.f15459a, (ed2.C2056a) null).mo14023R7(nt2.m23166l8(this.f15459a))));
                for (fv2 i : this.f15461a) {
                    ((dk5) mo13707b()).mo13704i(i);
                }
                this.f15461a.clear();
            } catch (RemoteException e) {
                throw new qo3(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
