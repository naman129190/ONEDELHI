package com.onedelhi.secure;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class am6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ om6 f9416a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f9417a;

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f9418a;

    /* renamed from: b */
    public final /* synthetic */ String f9419b;

    /* renamed from: b */
    public final /* synthetic */ boolean f9420b;

    /* renamed from: c */
    public final /* synthetic */ String f9421c;

    public am6(om6 om6, AtomicReference atomicReference, String str, String str2, String str3, uy6 uy6, boolean z) {
        this.f9416a = om6;
        this.f9418a = atomicReference;
        this.f9419b = str2;
        this.f9421c = str3;
        this.f9417a = uy6;
        this.f9420b = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List I4;
        synchronized (this.f9418a) {
            try {
                om6 om6 = this.f9416a;
                w36 H = om6.f18023a;
                if (H == null) {
                    om6.f11205a.mo15136e().mo12726r().mo25382d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f9419b, this.f9421c);
                    this.f9418a.set(Collections.emptyList());
                    this.f9418a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    Preconditions.checkNotNull(this.f9417a);
                    atomicReference2 = this.f9418a;
                    I4 = H.mo13654i7(this.f9419b, this.f9421c, this.f9420b, this.f9417a);
                } else {
                    atomicReference2 = this.f9418a;
                    I4 = H.mo13647I4((String) null, this.f9419b, this.f9421c, this.f9420b);
                }
                atomicReference2.set(I4);
                this.f9416a.mo21996E();
                atomicReference = this.f9418a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f9416a.f11205a.mo15136e().mo12726r().mo25382d("(legacy) Failed to get user properties; remote exception", (Object) null, this.f9419b, e);
                    this.f9418a.set(Collections.emptyList());
                    atomicReference = this.f9418a;
                } catch (Throwable th) {
                    this.f9418a.notify();
                    throw th;
                }
            }
        }
    }
}
