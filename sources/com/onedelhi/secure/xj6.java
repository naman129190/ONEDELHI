package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

public final class xj6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ om6 f22606a;

    /* renamed from: a */
    public final /* synthetic */ pt5 f22607a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f22608a;

    /* renamed from: b */
    public final /* synthetic */ String f22609b;

    /* renamed from: b */
    public final /* synthetic */ boolean f22610b;

    /* renamed from: c */
    public final /* synthetic */ String f22611c;

    public xj6(om6 om6, String str, String str2, uy6 uy6, boolean z, pt5 pt5) {
        this.f22606a = om6;
        this.f22609b = str;
        this.f22611c = str2;
        this.f22608a = uy6;
        this.f22610b = z;
        this.f22607a = pt5;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            om6 om6 = this.f22606a;
            w36 H = om6.f18023a;
            if (H == null) {
                om6.f11205a.mo15136e().mo12726r().mo25381c("Failed to get user properties; not connected to service", this.f22609b, this.f22611c);
                this.f22606a.f11205a.mo27871N().mo16856G(this.f22607a, bundle2);
                return;
            }
            Preconditions.checkNotNull(this.f22608a);
            List<wq6> i7 = H.mo13654i7(this.f22609b, this.f22611c, this.f22610b, this.f22608a);
            bundle = new Bundle();
            if (i7 != null) {
                for (wq6 wq6 : i7) {
                    String str = wq6.f22257c;
                    if (str != null) {
                        bundle.putString(wq6.f22256b, str);
                    } else {
                        Long l = wq6.f22254a;
                        if (l != null) {
                            bundle.putLong(wq6.f22256b, l.longValue());
                        } else {
                            Double d = wq6.f22253a;
                            if (d != null) {
                                bundle.putDouble(wq6.f22256b, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.f22606a.mo21996E();
                this.f22606a.f11205a.mo27871N().mo16856G(this.f22607a, bundle);
            } catch (RemoteException e2) {
                e = e2;
                try {
                    this.f22606a.f11205a.mo15136e().mo12726r().mo25381c("Failed to get user properties; remote exception", this.f22609b, e);
                    this.f22606a.f11205a.mo27871N().mo16856G(this.f22607a, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f22606a.f11205a.mo27871N().mo16856G(this.f22607a, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
            this.f22606a.f11205a.mo15136e().mo12726r().mo25381c("Failed to get user properties; remote exception", this.f22609b, e);
            this.f22606a.f11205a.mo27871N().mo16856G(this.f22607a, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.f22606a.f11205a.mo27871N().mo16856G(this.f22607a, bundle2);
            throw th;
        }
    }
}
