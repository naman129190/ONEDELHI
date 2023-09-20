package com.onedelhi.secure;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class wl6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ om6 f22210a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f22211a;

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f22212a;

    /* renamed from: b */
    public final /* synthetic */ String f22213b;

    /* renamed from: c */
    public final /* synthetic */ String f22214c;

    public wl6(om6 om6, AtomicReference atomicReference, String str, String str2, String str3, uy6 uy6) {
        this.f22210a = om6;
        this.f22212a = atomicReference;
        this.f22213b = str2;
        this.f22214c = str3;
        this.f22211a = uy6;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List f7;
        synchronized (this.f22212a) {
            try {
                om6 om6 = this.f22210a;
                w36 H = om6.f18023a;
                if (H == null) {
                    om6.f11205a.mo15136e().mo12726r().mo25382d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f22213b, this.f22214c);
                    this.f22212a.set(Collections.emptyList());
                    this.f22212a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    Preconditions.checkNotNull(this.f22211a);
                    atomicReference2 = this.f22212a;
                    f7 = H.mo13644D2(this.f22213b, this.f22214c, this.f22211a);
                } else {
                    atomicReference2 = this.f22212a;
                    f7 = H.mo13653f7((String) null, this.f22213b, this.f22214c);
                }
                atomicReference2.set(f7);
                this.f22210a.mo21996E();
                atomicReference = this.f22212a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f22210a.f11205a.mo15136e().mo12726r().mo25382d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f22213b, e);
                    this.f22212a.set(Collections.emptyList());
                    atomicReference = this.f22212a;
                } catch (Throwable th) {
                    this.f22212a.notify();
                    throw th;
                }
            }
        }
    }
}
