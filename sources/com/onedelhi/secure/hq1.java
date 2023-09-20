package com.onedelhi.secure;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public final class hq1 {

    /* renamed from: a */
    public final g07 f13225a;

    /* renamed from: a */
    public final g26 f13226a;

    public hq1(g07 g07) {
        g26 g26 = g26.f12398a;
        this.f13225a = (g07) Preconditions.checkNotNull(g07, "delegate");
        this.f13226a = (g26) Preconditions.checkNotNull(g26, "shim");
    }

    /* renamed from: a */
    public int mo17374a() {
        try {
            return this.f13225a.mo16241o();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: b */
    public int mo17375b() {
        try {
            return this.f13225a.mo16242s5();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: c */
    public List<iq1> mo17376c() {
        try {
            List<IBinder> e0 = this.f13225a.mo16239e0();
            ArrayList arrayList = new ArrayList(e0.size());
            for (IBinder k8 : e0) {
                arrayList.add(new iq1(t27.m28086k8(k8)));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: d */
    public boolean mo17377d() {
        try {
            return this.f13225a.zzi();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof hq1)) {
            return false;
        }
        try {
            return this.f13225a.mo16243y6(((hq1) obj).f13225a);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public int hashCode() {
        try {
            return this.f13225a.mo16240n();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }
}
