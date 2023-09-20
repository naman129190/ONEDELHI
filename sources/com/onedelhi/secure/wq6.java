package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
public final class wq6 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<wq6> CREATOR = new yq6();
    @SafeParcelable.Field(mo10053id = 8)
    @ts2

    /* renamed from: a */
    public final Double f22253a;
    @SafeParcelable.Field(mo10053id = 4)
    @ts2

    /* renamed from: a */
    public final Long f22254a;
    @SafeParcelable.Field(mo10053id = 3)

    /* renamed from: b */
    public final long f22255b;
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: b */
    public final String f22256b;
    @SafeParcelable.Field(mo10053id = 6)
    @ts2

    /* renamed from: c */
    public final String f22257c;
    @SafeParcelable.Field(mo10053id = 7)

    /* renamed from: d */
    public final String f22258d;
    @SafeParcelable.Field(mo10053id = 1)

    /* renamed from: n */
    public final int f22259n;

    @SafeParcelable.Constructor
    public wq6(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) String str, @SafeParcelable.Param(mo10056id = 3) long j, @SafeParcelable.Param(mo10056id = 4) @ts2 Long l, @SafeParcelable.Param(mo10056id = 5) Float f, @SafeParcelable.Param(mo10056id = 6) @ts2 String str2, @SafeParcelable.Param(mo10056id = 7) String str3, @SafeParcelable.Param(mo10056id = 8) @ts2 Double d) {
        this.f22259n = i;
        this.f22256b = str;
        this.f22255b = j;
        this.f22254a = l;
        if (i == 1) {
            this.f22253a = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f22253a = d;
        }
        this.f22257c = str2;
        this.f22258d = str3;
    }

    public wq6(ar6 ar6) {
        this(ar6.f9510c, ar6.f9506a, ar6.f9507a, ar6.f9509b);
    }

    public wq6(String str, long j, @ts2 Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.f22259n = 2;
        this.f22256b = str;
        this.f22255b = j;
        this.f22258d = str2;
        if (obj == null) {
            this.f22254a = null;
            this.f22253a = null;
            this.f22257c = null;
        } else if (obj instanceof Long) {
            this.f22254a = (Long) obj;
            this.f22253a = null;
            this.f22257c = null;
        } else if (obj instanceof String) {
            this.f22254a = null;
            this.f22253a = null;
            this.f22257c = (String) obj;
        } else if (obj instanceof Double) {
            this.f22254a = null;
            this.f22253a = (Double) obj;
            this.f22257c = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    @ts2
    /* renamed from: K2 */
    public final Object mo26660K2() {
        Long l = this.f22254a;
        if (l != null) {
            return l;
        }
        Double d = this.f22253a;
        if (d != null) {
            return d;
        }
        String str = this.f22257c;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        yq6.m32614a(this, parcel, i);
    }
}
