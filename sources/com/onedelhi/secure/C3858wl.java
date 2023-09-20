package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.onedelhi.secure.wl */
public final class C3858wl {

    /* renamed from: a */
    public static final float f22199a = 0.0f;

    /* renamed from: a */
    public static ih6 f22200a = null;

    /* renamed from: b */
    public static final float f22201b = 30.0f;

    /* renamed from: c */
    public static final float f22202c = 60.0f;

    /* renamed from: d */
    public static final float f22203d = 120.0f;

    /* renamed from: e */
    public static final float f22204e = 180.0f;

    /* renamed from: f */
    public static final float f22205f = 210.0f;

    /* renamed from: g */
    public static final float f22206g = 240.0f;

    /* renamed from: h */
    public static final float f22207h = 270.0f;

    /* renamed from: i */
    public static final float f22208i = 300.0f;

    /* renamed from: j */
    public static final float f22209j = 330.0f;

    @mr2
    /* renamed from: a */
    public static C3798vl m30938a() {
        try {
            return new C3798vl(m30946i().zzd());
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: b */
    public static C3798vl m30939b(float f) {
        try {
            return new C3798vl(m30946i().mo17811p2(f));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: c */
    public static C3798vl m30940c(@mr2 String str) {
        Preconditions.checkNotNull(str, "assetName must not be null");
        try {
            return new C3798vl(m30946i().mo17806A3(str));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: d */
    public static C3798vl m30941d(@mr2 Bitmap bitmap) {
        Preconditions.checkNotNull(bitmap, "image must not be null");
        try {
            return new C3798vl(m30946i().mo17809Z4(bitmap));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: e */
    public static C3798vl m30942e(@mr2 String str) {
        Preconditions.checkNotNull(str, "fileName must not be null");
        try {
            return new C3798vl(m30946i().mo17808Q3(str));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: f */
    public static C3798vl m30943f(@mr2 String str) {
        Preconditions.checkNotNull(str, "absolutePath must not be null");
        try {
            return new C3798vl(m30946i().mo17807E4(str));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: g */
    public static C3798vl m30944g(int i) {
        try {
            return new C3798vl(m30946i().mo17810h2(i));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: h */
    public static void m30945h(ih6 ih6) {
        if (f22200a == null) {
            f22200a = (ih6) Preconditions.checkNotNull(ih6, "delegate must not be null");
        }
    }

    /* renamed from: i */
    public static ih6 m30946i() {
        return (ih6) Preconditions.checkNotNull(f22200a, "IBitmapDescriptorFactory is not initialized");
    }
}
