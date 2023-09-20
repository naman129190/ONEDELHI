package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.onedelhi.secure.C3837wb;

public final class q95 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C3837wb.m30783a(parcel.readString());
        } catch (C3837wb.C3838a e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3837wb[i];
    }
}
