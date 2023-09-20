package com.onedelhi.secure;

import android.os.Parcel;

public final class ky2 {
    /* renamed from: a */
    public static boolean m20081a(@mr2 Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: b */
    public static void m20082b(@mr2 Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
