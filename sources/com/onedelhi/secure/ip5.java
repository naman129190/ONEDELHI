package com.onedelhi.secure;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

public final class ip5 {

    /* renamed from: a */
    public static final /* synthetic */ int f13795a = 0;

    /* renamed from: a */
    public static final ClassLoader f13796a = ip5.class.getClassLoader();

    /* renamed from: a */
    public static Parcelable m17763a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static HashMap m17764b(Parcel parcel) {
        return parcel.readHashMap(f13796a);
    }

    /* renamed from: c */
    public static void m17765c(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
        }
    }

    /* renamed from: d */
    public static void m17766d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: e */
    public static void m17767e(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: f */
    public static boolean m17768f(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
