package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "PrfExtensionCreator")
public final class if5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<if5> CREATOR = new tf5();
    @SafeParcelable.Field(getter = "getEvaluationPoints", mo10053id = 1)
    @mr2

    /* renamed from: a */
    public final byte[][] f13666a;

    @SafeParcelable.Constructor
    public if5(@SafeParcelable.Param(mo10056id = 1) @mr2 byte[][] bArr) {
        Preconditions.checkArgument(bArr != null);
        Preconditions.checkArgument(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            Preconditions.checkArgument(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            Preconditions.checkArgument(bArr[i2] != null);
            int length = bArr[i2].length;
            Preconditions.checkArgument(length == 32 || length == 64);
            i += 2;
        }
        this.f13666a = bArr;
    }

    public final boolean equals(@ts2 Object obj) {
        if (!(obj instanceof if5)) {
            return false;
        }
        return Arrays.deepEquals(this.f13666a, ((if5) obj).f13666a);
    }

    public final int hashCode() {
        Object[] objArr = this.f13666a;
        int length = objArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i ^= Objects.hashCode(objArr[i2]);
        }
        return i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArrayArray(parcel, 1, this.f13666a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
