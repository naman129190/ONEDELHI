package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public final class yl6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ om6 f23210a;

    /* renamed from: a */
    public final /* synthetic */ pt5 f23211a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f23212a;

    /* renamed from: b */
    public final /* synthetic */ String f23213b;

    /* renamed from: c */
    public final /* synthetic */ String f23214c;

    public yl6(om6 om6, String str, String str2, uy6 uy6, pt5 pt5) {
        this.f23210a = om6;
        this.f23213b = str;
        this.f23214c = str2;
        this.f23212a = uy6;
        this.f23211a = pt5;
    }

    public final void run() {
        ArrayList arrayList = new ArrayList();
        try {
            om6 om6 = this.f23210a;
            w36 H = om6.f18023a;
            if (H == null) {
                om6.f11205a.mo15136e().mo12726r().mo25381c("Failed to get conditional properties; not connected to service", this.f23213b, this.f23214c);
            } else {
                Preconditions.checkNotNull(this.f23212a);
                arrayList = gr6.m16186v(H.mo13644D2(this.f23213b, this.f23214c, this.f23212a));
                this.f23210a.mo21996E();
            }
        } catch (RemoteException e) {
            this.f23210a.f11205a.mo15136e().mo12726r().mo25382d("Failed to get conditional properties; remote exception", this.f23213b, this.f23214c, e);
        } catch (Throwable th) {
            this.f23210a.f11205a.mo27871N().mo16855F(this.f23211a, arrayList);
            throw th;
        }
        this.f23210a.f11205a.mo27871N().mo16855F(this.f23211a, arrayList);
    }
}
