package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.onedelhi.secure.zj3;

public final class si5 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        try {
            return zj3.m33180a(readString);
        } catch (zj3.C4100a e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zj3[i];
    }
}
