package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "AppMetadataCreator")
@SafeParcelable.Reserved({1, 17, 20})
public final class uy6 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<uy6> CREATOR = new m07();
    @SafeParcelable.Field(mo10053id = 21)
    @ts2

    /* renamed from: a */
    public final Boolean f21554a;
    @SafeParcelable.Field(mo10053id = 23)
    @ts2

    /* renamed from: a */
    public final List f21555a;
    @SafeParcelable.Field(mo10053id = 6)

    /* renamed from: b */
    public final long f21556b;
    @SafeParcelable.Field(mo10053id = 2)
    @ts2

    /* renamed from: b */
    public final String f21557b;
    @SafeParcelable.Field(defaultValue = "true", mo10053id = 9)

    /* renamed from: b */
    public final boolean f21558b;
    @SafeParcelable.Field(mo10053id = 7)

    /* renamed from: c */
    public final long f21559c;
    @SafeParcelable.Field(mo10053id = 3)
    @ts2

    /* renamed from: c */
    public final String f21560c;
    @SafeParcelable.Field(mo10053id = 10)

    /* renamed from: c */
    public final boolean f21561c;
    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MIN_VALUE", mo10053id = 11)

    /* renamed from: d */
    public final long f21562d;
    @SafeParcelable.Field(mo10053id = 4)
    @ts2

    /* renamed from: d */
    public final String f21563d;
    @SafeParcelable.Field(defaultValue = "true", mo10053id = 16)

    /* renamed from: d */
    public final boolean f21564d;
    @SafeParcelable.Field(mo10053id = 13)
    @Deprecated

    /* renamed from: e */
    public final long f21565e;
    @SafeParcelable.Field(mo10053id = 5)
    @ts2

    /* renamed from: e */
    public final String f21566e;
    @SafeParcelable.Field(mo10053id = 18)

    /* renamed from: e */
    public final boolean f21567e;
    @SafeParcelable.Field(mo10053id = 14)

    /* renamed from: f */
    public final long f21568f;
    @SafeParcelable.Field(mo10053id = 8)
    @ts2

    /* renamed from: f */
    public final String f21569f;
    @SafeParcelable.Field(defaultValue = "false", mo10053id = 28)

    /* renamed from: f */
    public final boolean f21570f;
    @SafeParcelable.Field(mo10053id = 22)

    /* renamed from: g */
    public final long f21571g;
    @SafeParcelable.Field(mo10053id = 12)
    @ts2

    /* renamed from: g */
    public final String f21572g;
    @SafeParcelable.Field(mo10053id = 29)

    /* renamed from: h */
    public final long f21573h;
    @SafeParcelable.Field(mo10053id = 19)
    @ts2

    /* renamed from: h */
    public final String f21574h;
    @SafeParcelable.Field(mo10053id = 24)
    @ts2

    /* renamed from: i */
    public final String f21575i;
    @SafeParcelable.Field(defaultValue = "", mo10053id = 25)

    /* renamed from: j */
    public final String f21576j;
    @SafeParcelable.Field(defaultValue = "", mo10053id = 26)

    /* renamed from: k */
    public final String f21577k;
    @SafeParcelable.Field(mo10053id = 27)
    @ts2

    /* renamed from: l */
    public final String f21578l;
    @SafeParcelable.Field(mo10053id = 15)

    /* renamed from: n */
    public final int f21579n;

    public uy6(@ts2 String str, @ts2 String str2, @ts2 String str3, long j, @ts2 String str4, long j2, long j3, @ts2 String str5, boolean z, boolean z2, @ts2 String str6, long j4, long j5, int i, boolean z3, boolean z4, @ts2 String str7, @ts2 Boolean bool, long j6, @ts2 List list, @ts2 String str8, String str9, String str10, @ts2 String str11, boolean z5, long j7) {
        Preconditions.checkNotEmpty(str);
        this.f21557b = str;
        this.f21560c = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f21563d = str3;
        this.f21562d = j;
        this.f21566e = str4;
        this.f21556b = j2;
        this.f21559c = j3;
        this.f21569f = str5;
        this.f21558b = z;
        this.f21561c = z2;
        this.f21572g = str6;
        this.f21565e = 0;
        this.f21568f = j5;
        this.f21579n = i;
        this.f21564d = z3;
        this.f21567e = z4;
        this.f21574h = str7;
        this.f21554a = bool;
        this.f21571g = j6;
        this.f21555a = list;
        this.f21575i = null;
        this.f21576j = str9;
        this.f21577k = str10;
        this.f21578l = str11;
        this.f21570f = z5;
        this.f21573h = j7;
    }

    @SafeParcelable.Constructor
    public uy6(@SafeParcelable.Param(mo10056id = 2) @ts2 String str, @SafeParcelable.Param(mo10056id = 3) @ts2 String str2, @SafeParcelable.Param(mo10056id = 4) @ts2 String str3, @SafeParcelable.Param(mo10056id = 5) @ts2 String str4, @SafeParcelable.Param(mo10056id = 6) long j, @SafeParcelable.Param(mo10056id = 7) long j2, @SafeParcelable.Param(mo10056id = 8) @ts2 String str5, @SafeParcelable.Param(mo10056id = 9) boolean z, @SafeParcelable.Param(mo10056id = 10) boolean z2, @SafeParcelable.Param(mo10056id = 11) long j3, @SafeParcelable.Param(mo10056id = 12) @ts2 String str6, @SafeParcelable.Param(mo10056id = 13) long j4, @SafeParcelable.Param(mo10056id = 14) long j5, @SafeParcelable.Param(mo10056id = 15) int i, @SafeParcelable.Param(mo10056id = 16) boolean z3, @SafeParcelable.Param(mo10056id = 18) boolean z4, @SafeParcelable.Param(mo10056id = 19) @ts2 String str7, @SafeParcelable.Param(mo10056id = 21) @ts2 Boolean bool, @SafeParcelable.Param(mo10056id = 22) long j6, @SafeParcelable.Param(mo10056id = 23) @ts2 List list, @SafeParcelable.Param(mo10056id = 24) @ts2 String str8, @SafeParcelable.Param(mo10056id = 25) String str9, @SafeParcelable.Param(mo10056id = 26) String str10, @SafeParcelable.Param(mo10056id = 27) String str11, @SafeParcelable.Param(mo10056id = 28) boolean z5, @SafeParcelable.Param(mo10056id = 29) long j7) {
        this.f21557b = str;
        this.f21560c = str2;
        this.f21563d = str3;
        this.f21562d = j3;
        this.f21566e = str4;
        this.f21556b = j;
        this.f21559c = j2;
        this.f21569f = str5;
        this.f21558b = z;
        this.f21561c = z2;
        this.f21572g = str6;
        this.f21565e = j4;
        this.f21568f = j5;
        this.f21579n = i;
        this.f21564d = z3;
        this.f21567e = z4;
        this.f21574h = str7;
        this.f21554a = bool;
        this.f21571g = j6;
        this.f21555a = list;
        this.f21575i = str8;
        this.f21576j = str9;
        this.f21577k = str10;
        this.f21578l = str11;
        this.f21570f = z5;
        this.f21573h = j7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f21557b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f21560c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f21563d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f21566e, false);
        SafeParcelWriter.writeLong(parcel, 6, this.f21556b);
        SafeParcelWriter.writeLong(parcel, 7, this.f21559c);
        SafeParcelWriter.writeString(parcel, 8, this.f21569f, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f21558b);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f21561c);
        SafeParcelWriter.writeLong(parcel, 11, this.f21562d);
        SafeParcelWriter.writeString(parcel, 12, this.f21572g, false);
        SafeParcelWriter.writeLong(parcel, 13, this.f21565e);
        SafeParcelWriter.writeLong(parcel, 14, this.f21568f);
        SafeParcelWriter.writeInt(parcel, 15, this.f21579n);
        SafeParcelWriter.writeBoolean(parcel, 16, this.f21564d);
        SafeParcelWriter.writeBoolean(parcel, 18, this.f21567e);
        SafeParcelWriter.writeString(parcel, 19, this.f21574h, false);
        SafeParcelWriter.writeBooleanObject(parcel, 21, this.f21554a, false);
        SafeParcelWriter.writeLong(parcel, 22, this.f21571g);
        SafeParcelWriter.writeStringList(parcel, 23, this.f21555a, false);
        SafeParcelWriter.writeString(parcel, 24, this.f21575i, false);
        SafeParcelWriter.writeString(parcel, 25, this.f21576j, false);
        SafeParcelWriter.writeString(parcel, 26, this.f21577k, false);
        SafeParcelWriter.writeString(parcel, 27, this.f21578l, false);
        SafeParcelWriter.writeBoolean(parcel, 28, this.f21570f);
        SafeParcelWriter.writeLong(parcel, 29, this.f21573h);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
