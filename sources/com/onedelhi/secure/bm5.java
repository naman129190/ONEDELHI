package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.onedelhi.secure.C3914xb;

public final class bm5 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C3914xb.m31388a(parcel.readString());
        } catch (C3914xb.C3915a e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3914xb[i];
    }
}
