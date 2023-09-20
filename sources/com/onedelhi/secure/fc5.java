package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConditionalUserPropertyParcelCreator")
public final class fc5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<fc5> CREATOR = new sc5();
    @SafeParcelable.Field(mo10053id = 4)

    /* renamed from: a */
    public wq6 f12016a;
    @SafeParcelable.Field(mo10053id = 8)
    @ts2

    /* renamed from: a */
    public final xj5 f12017a;
    @SafeParcelable.Field(mo10053id = 5)

    /* renamed from: b */
    public long f12018b;
    @SafeParcelable.Field(mo10053id = 10)
    @ts2

    /* renamed from: b */
    public xj5 f12019b;
    @SafeParcelable.Field(mo10053id = 2)
    @ts2

    /* renamed from: b */
    public String f12020b;
    @SafeParcelable.Field(mo10053id = 6)

    /* renamed from: b */
    public boolean f12021b;
    @SafeParcelable.Field(mo10053id = 9)

    /* renamed from: c */
    public long f12022c;
    @SafeParcelable.Field(mo10053id = 12)
    @ts2

    /* renamed from: c */
    public final xj5 f12023c;
    @SafeParcelable.Field(mo10053id = 3)

    /* renamed from: c */
    public String f12024c;
    @SafeParcelable.Field(mo10053id = 11)

    /* renamed from: d */
    public final long f12025d;
    @SafeParcelable.Field(mo10053id = 7)
    @ts2

    /* renamed from: d */
    public String f12026d;

    public fc5(fc5 fc5) {
        Preconditions.checkNotNull(fc5);
        this.f12020b = fc5.f12020b;
        this.f12024c = fc5.f12024c;
        this.f12016a = fc5.f12016a;
        this.f12018b = fc5.f12018b;
        this.f12021b = fc5.f12021b;
        this.f12026d = fc5.f12026d;
        this.f12017a = fc5.f12017a;
        this.f12022c = fc5.f12022c;
        this.f12019b = fc5.f12019b;
        this.f12025d = fc5.f12025d;
        this.f12023c = fc5.f12023c;
    }

    @SafeParcelable.Constructor
    public fc5(@SafeParcelable.Param(mo10056id = 2) @ts2 String str, @SafeParcelable.Param(mo10056id = 3) String str2, @SafeParcelable.Param(mo10056id = 4) wq6 wq6, @SafeParcelable.Param(mo10056id = 5) long j, @SafeParcelable.Param(mo10056id = 6) boolean z, @SafeParcelable.Param(mo10056id = 7) @ts2 String str3, @SafeParcelable.Param(mo10056id = 8) @ts2 xj5 xj5, @SafeParcelable.Param(mo10056id = 9) long j2, @SafeParcelable.Param(mo10056id = 10) @ts2 xj5 xj52, @SafeParcelable.Param(mo10056id = 11) long j3, @SafeParcelable.Param(mo10056id = 12) @ts2 xj5 xj53) {
        this.f12020b = str;
        this.f12024c = str2;
        this.f12016a = wq6;
        this.f12018b = j;
        this.f12021b = z;
        this.f12026d = str3;
        this.f12017a = xj5;
        this.f12022c = j2;
        this.f12019b = xj52;
        this.f12025d = j3;
        this.f12023c = xj53;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f12020b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f12024c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f12016a, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.f12018b);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f12021b);
        SafeParcelWriter.writeString(parcel, 7, this.f12026d, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f12017a, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.f12022c);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f12019b, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.f12025d);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f12023c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
