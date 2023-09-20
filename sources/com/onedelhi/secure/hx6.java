package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.onedelhi.secure.C4119zr;

public final class hx6 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C4119zr.m33326a(parcel.readInt());
        } catch (C4119zr.C4120a e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4119zr[i];
    }
}
