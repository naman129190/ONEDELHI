package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class iq1 {

    /* renamed from: a */
    public final k37 f13806a;

    public iq1(k37 k37) {
        this.f13806a = (k37) Preconditions.checkNotNull(k37);
    }

    /* renamed from: a */
    public void mo17938a() {
        try {
            this.f13806a.mo13967q3();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: b */
    public String mo17939b() {
        try {
            return this.f13806a.mo13965O1();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: c */
    public String mo17940c() {
        try {
            return this.f13806a.mo13963J2();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof iq1)) {
            return false;
        }
        try {
            return this.f13806a.mo13964K6(((iq1) obj).f13806a);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    public int hashCode() {
        try {
            return this.f13806a.mo13966o();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }
}
