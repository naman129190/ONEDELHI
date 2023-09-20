package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.onedelhi.secure.jf4;

public final class aj5 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return jf4.C2513a.m18536a(parcel.readString());
        } catch (jf4.C2514b e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new jf4.C2513a[i];
    }
}
