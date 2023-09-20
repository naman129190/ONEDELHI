package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

@SafeParcelable.Class(creator = "ClientIdentityCreator")
public final class zw5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zw5> CREATOR = new y16();
    @SafeParcelable.Field(getter = "getImpersonator", mo10053id = 7)
    @ts2

    /* renamed from: a */
    public final zw5 f23929a;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.common.collect.ImmutableList.of()", getter = "getClientFeatures", mo10053id = 8)

    /* renamed from: a */
    public final List f23930a;
    @SafeParcelable.Field(getter = "getPackageName", mo10053id = 3)

    /* renamed from: b */
    public final String f23931b;
    @SafeParcelable.Field(getter = "getAttributionTag", mo10053id = 4)
    @ts2

    /* renamed from: c */
    public final String f23932c;
    @SafeParcelable.Field(getter = "getListenerId", mo10053id = 6)
    @ts2

    /* renamed from: d */
    public final String f23933d;
    @SafeParcelable.Field(getter = "getUid", mo10053id = 1)

    /* renamed from: n */
    public final int f23934n;
    @SafeParcelable.Field(getter = "getPid", mo10053id = 2)

    /* renamed from: o */
    public final int f23935o;
    @SafeParcelable.Field(getter = "getClientSdkVersion", mo10053id = 5)

    /* renamed from: p */
    public final int f23936p;

    static {
        Process.myUid();
        Process.myPid();
    }

    @SafeParcelable.Constructor
    public zw5(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) int i2, @SafeParcelable.Param(mo10056id = 3) String str, @SafeParcelable.Param(mo10056id = 4) @ts2 String str2, @SafeParcelable.Param(mo10056id = 6) @ts2 String str3, @SafeParcelable.Param(mo10056id = 5) int i3, @SafeParcelable.Param(mo10056id = 8) List list, @SafeParcelable.Param(mo10056id = 7) @ts2 zw5 zw5) {
        this.f23934n = i;
        this.f23935o = i2;
        this.f23931b = str;
        this.f23932c = str2;
        this.f23933d = str3;
        this.f23936p = i3;
        this.f23930a = r06.m26252o(list);
        this.f23929a = zw5;
    }

    public final boolean equals(@ts2 Object obj) {
        if (obj instanceof zw5) {
            zw5 zw5 = (zw5) obj;
            return this.f23934n == zw5.f23934n && this.f23935o == zw5.f23935o && this.f23936p == zw5.f23936p && this.f23931b.equals(zw5.f23931b) && pz5.m25230a(this.f23932c, zw5.f23932c) && pz5.m25230a(this.f23933d, zw5.f23933d) && pz5.m25230a(this.f23929a, zw5.f23929a) && this.f23930a.equals(zw5.f23930a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23934n), this.f23931b, this.f23932c, this.f23933d});
    }

    public final String toString() {
        int length = this.f23931b.length() + 18;
        String str = this.f23932c;
        if (str != null) {
            length += str.length();
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(this.f23934n);
        sb.append("/");
        sb.append(this.f23931b);
        if (this.f23932c != null) {
            sb.append("[");
            if (this.f23932c.startsWith(this.f23931b)) {
                sb.append(this.f23932c, this.f23931b.length(), this.f23932c.length());
            } else {
                sb.append(this.f23932c);
            }
            sb.append("]");
        }
        if (this.f23933d != null) {
            sb.append("/");
            sb.append(Integer.toHexString(this.f23933d.hashCode()));
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f23934n);
        SafeParcelWriter.writeInt(parcel, 2, this.f23935o);
        SafeParcelWriter.writeString(parcel, 3, this.f23931b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f23932c, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f23936p);
        SafeParcelWriter.writeString(parcel, 6, this.f23933d, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f23929a, i, false);
        SafeParcelWriter.writeTypedList(parcel, 8, this.f23930a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
