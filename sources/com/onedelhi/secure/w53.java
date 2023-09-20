package com.onedelhi.secure;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.LatLng;

public final class w53 {

    /* renamed from: a */
    public final un1 f22049a;

    public w53(un1 un1) {
        this.f22049a = un1;
    }

    @mr2
    /* renamed from: a */
    public LatLng mo26442a(@mr2 Point point) {
        Preconditions.checkNotNull(point);
        try {
            return this.f22049a.mo17945i4(nt2.m23166l8(point));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: b */
    public iw4 mo26443b() {
        try {
            return this.f22049a.mo17944L4();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: c */
    public Point mo26444c(@mr2 LatLng latLng) {
        Preconditions.checkNotNull(latLng);
        try {
            return (Point) nt2.m23165k8(this.f22049a.mo17943A5(latLng));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }
}
