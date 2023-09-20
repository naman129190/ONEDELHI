package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;

public final class yj5 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return ok5.m23862a(parcel.readString());
        } catch (gk5 e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ok5[i];
    }
}
