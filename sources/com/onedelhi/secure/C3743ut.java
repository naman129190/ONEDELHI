package com.onedelhi.secure;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: com.onedelhi.secure.ut */
public final class C3743ut {

    /* renamed from: a */
    public static ln1 f21519a;

    @mr2
    /* renamed from: a */
    public static C3663tt m29567a(@mr2 CameraPosition cameraPosition) {
        Preconditions.checkNotNull(cameraPosition, "cameraPosition must not be null");
        try {
            return new C3663tt(m29579m().mo19706s4(cameraPosition));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: b */
    public static C3663tt m29568b(@mr2 LatLng latLng) {
        Preconditions.checkNotNull(latLng, "latLng must not be null");
        try {
            return new C3663tt(m29579m().mo19700Y1(latLng));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: c */
    public static C3663tt m29569c(@mr2 LatLngBounds latLngBounds, int i) {
        Preconditions.checkNotNull(latLngBounds, "bounds must not be null");
        try {
            return new C3663tt(m29579m().mo19704a6(latLngBounds, i));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: d */
    public static C3663tt m29570d(@mr2 LatLngBounds latLngBounds, int i, int i2, int i3) {
        Preconditions.checkNotNull(latLngBounds, "bounds must not be null");
        try {
            return new C3663tt(m29579m().mo19702Y5(latLngBounds, i, i2, i3));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: e */
    public static C3663tt m29571e(@mr2 LatLng latLng, float f) {
        Preconditions.checkNotNull(latLng, "latLng must not be null");
        try {
            return new C3663tt(m29579m().mo19698H2(latLng, f));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: f */
    public static C3663tt m29572f(float f, float f2) {
        try {
            return new C3663tt(m29579m().mo19697E5(f, f2));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: g */
    public static C3663tt m29573g(float f) {
        try {
            return new C3663tt(m29579m().mo19699Q0(f));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: h */
    public static C3663tt m29574h(float f, @mr2 Point point) {
        Preconditions.checkNotNull(point, "focus must not be null");
        try {
            return new C3663tt(m29579m().mo19705h4(f, point.x, point.y));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: i */
    public static C3663tt m29575i() {
        try {
            return new C3663tt(m29579m().mo19703Z2());
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: j */
    public static C3663tt m29576j() {
        try {
            return new C3663tt(m29579m().mo19707u7());
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: k */
    public static C3663tt m29577k(float f) {
        try {
            return new C3663tt(m29579m().mo19701Y2(f));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: l */
    public static void m29578l(@mr2 ln1 ln1) {
        f21519a = (ln1) Preconditions.checkNotNull(ln1);
    }

    /* renamed from: m */
    public static ln1 m29579m() {
        return (ln1) Preconditions.checkNotNull(f21519a, "CameraUpdateFactory is not initialized");
    }
}
