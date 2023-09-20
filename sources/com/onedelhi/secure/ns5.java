package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class ns5 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        fr4 fr4 = null;
        l66 l66 = null;
        C3693uc ucVar = null;
        de6 de6 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                fr4 = (fr4) SafeParcelReader.createParcelable(parcel, readHeader, fr4.CREATOR);
            } else if (fieldId == 2) {
                l66 = (l66) SafeParcelReader.createParcelable(parcel, readHeader, l66.CREATOR);
            } else if (fieldId == 3) {
                ucVar = (C3693uc) SafeParcelReader.createParcelable(parcel, readHeader, C3693uc.CREATOR);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                de6 = (de6) SafeParcelReader.createParcelable(parcel, readHeader, de6.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new C3593tc(fr4, l66, ucVar, de6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3593tc[i];
    }
}
