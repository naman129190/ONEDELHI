package com.onedelhi.secure;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleSignInOptionsExtensionCreator")
public class yh1 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<yh1> CREATOR = new i35();
    @SafeParcelable.Field(getter = "getBundle", mo10053id = 3)

    /* renamed from: a */
    public Bundle f23110a;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f23111n;
    @SafeParcelable.Field(getter = "getType", mo10053id = 2)

    /* renamed from: o */
    public int f23112o;

    @SafeParcelable.Constructor
    public yh1(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) int i2, @SafeParcelable.Param(mo10056id = 3) Bundle bundle) {
        this.f23111n = i;
        this.f23112o = i2;
        this.f23110a = bundle;
    }

    public yh1(@mr2 xh1 xh1) {
        this(1, xh1.mo26922c(), xh1.mo26920a());
    }

    @KeepForSdk
    /* renamed from: K2 */
    public int mo27491K2() {
        return this.f23112o;
    }

    public final void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f23111n);
        SafeParcelWriter.writeInt(parcel, 2, mo27491K2());
        SafeParcelWriter.writeBundle(parcel, 3, this.f23110a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
