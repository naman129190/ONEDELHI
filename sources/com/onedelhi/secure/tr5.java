package com.onedelhi.secure;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class tr5 {

    /* renamed from: a */
    public static final /* synthetic */ int f21115a = 0;

    /* renamed from: a */
    public static final ClassLoader f21116a = tr5.class.getClassLoader();

    /* renamed from: a */
    public static Parcelable m28928a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static ArrayList m28929b(Parcel parcel) {
        return parcel.readArrayList(f21116a);
    }

    /* renamed from: c */
    public static void m28930c(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
        }
    }

    /* renamed from: d */
    public static void m28931d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
