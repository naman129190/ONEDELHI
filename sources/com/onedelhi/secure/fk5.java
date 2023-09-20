package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class fk5 implements Parcelable.Creator {
    /* renamed from: a */
    public static void m14999a(xj5 xj5, Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, xj5.f22604b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, xj5.f22602a, i, false);
        SafeParcelWriter.writeString(parcel, 4, xj5.f22605c, false);
        SafeParcelWriter.writeLong(parcel, 5, xj5.f22603b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        hj5 hj5 = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                hj5 = (hj5) SafeParcelReader.createParcelable(parcel, readHeader, hj5.CREATOR);
            } else if (fieldId == 4) {
                str2 = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                j = SafeParcelReader.readLong(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new xj5(str, hj5, str2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new xj5[i];
    }
}
