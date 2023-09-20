package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.onedelhi.secure.fv0;

public final class k47 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return fv0.m15331b(parcel.readInt());
        } catch (fv0.C2204a e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new fv0[i];
    }
}
