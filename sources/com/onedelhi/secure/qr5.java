package com.onedelhi.secure;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class qr5 {

    /* renamed from: a */
    public static final ClassLoader f19443a = qr5.class.getClassLoader();

    /* renamed from: a */
    public static <T extends Parcelable> T m26139a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m26140b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: c */
    public static boolean m26141c(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
