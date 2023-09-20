package com.onedelhi.secure;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "InitializationParamsCreator")
public final class nu5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<nu5> CREATOR = new ru5();
    @SafeParcelable.Field(mo10053id = 7)
    @ts2

    /* renamed from: a */
    public final Bundle f17599a;
    @SafeParcelable.Field(mo10053id = 1)

    /* renamed from: b */
    public final long f17600b;
    @SafeParcelable.Field(mo10053id = 4)
    @ts2

    /* renamed from: b */
    public final String f17601b;
    @SafeParcelable.Field(mo10053id = 3)

    /* renamed from: b */
    public final boolean f17602b;
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: c */
    public final long f17603c;
    @SafeParcelable.Field(mo10053id = 5)
    @ts2

    /* renamed from: c */
    public final String f17604c;
    @SafeParcelable.Field(mo10053id = 6)
    @ts2

    /* renamed from: d */
    public final String f17605d;
    @SafeParcelable.Field(mo10053id = 8)
    @ts2

    /* renamed from: e */
    public final String f17606e;

    @SafeParcelable.Constructor
    public nu5(@SafeParcelable.Param(mo10056id = 1) long j, @SafeParcelable.Param(mo10056id = 2) long j2, @SafeParcelable.Param(mo10056id = 3) boolean z, @SafeParcelable.Param(mo10056id = 4) @ts2 String str, @SafeParcelable.Param(mo10056id = 5) @ts2 String str2, @SafeParcelable.Param(mo10056id = 6) @ts2 String str3, @SafeParcelable.Param(mo10056id = 7) @ts2 Bundle bundle, @SafeParcelable.Param(mo10056id = 8) @ts2 String str4) {
        this.f17600b = j;
        this.f17603c = j2;
        this.f17602b = z;
        this.f17601b = str;
        this.f17604c = str2;
        this.f17605d = str3;
        this.f17599a = bundle;
        this.f17606e = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f17600b);
        SafeParcelWriter.writeLong(parcel, 2, this.f17603c);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f17602b);
        SafeParcelWriter.writeString(parcel, 4, this.f17601b, false);
        SafeParcelWriter.writeString(parcel, 5, this.f17604c, false);
        SafeParcelWriter.writeString(parcel, 6, this.f17605d, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.f17599a, false);
        SafeParcelWriter.writeString(parcel, 8, this.f17606e, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
