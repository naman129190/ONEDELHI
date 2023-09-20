package com.onedelhi.secure;

import android.os.Parcel;

@Deprecated
public interface py2<T> {
    T createFromParcel(Parcel parcel, ClassLoader classLoader);

    T[] newArray(int i);
}
