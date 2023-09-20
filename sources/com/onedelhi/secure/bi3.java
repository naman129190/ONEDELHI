package com.onedelhi.secure;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.messaging.C4323g;

public class bi3 implements Parcelable.Creator<C4323g> {

    /* renamed from: a */
    public static final int f26380a = 0;

    /* renamed from: c */
    public static void m39966c(C4323g gVar, Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, gVar.f25170a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @ts2
    /* renamed from: a */
    public C4323g createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) != 2) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                bundle = SafeParcelReader.createBundle(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new C4323g(bundle);
    }

    @ts2
    /* renamed from: b */
    public C4323g[] newArray(int i) {
        return new C4323g[i];
    }
}
