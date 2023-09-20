package com.onedelhi.secure;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Patterns;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

@KeepForSdkWithMembers
@ShowFirstParty
@SafeParcelable.Class(creator = "ProxyRequestCreator")
public class n73 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<n73> CREATOR = new ua5();

    /* renamed from: p */
    public static final int f17200p = 2;

    /* renamed from: q */
    public static final int f17201q = 0;

    /* renamed from: r */
    public static final int f17202r = 1;

    /* renamed from: s */
    public static final int f17203s = 2;

    /* renamed from: t */
    public static final int f17204t = 3;

    /* renamed from: u */
    public static final int f17205u = 4;

    /* renamed from: v */
    public static final int f17206v = 5;

    /* renamed from: w */
    public static final int f17207w = 6;

    /* renamed from: x */
    public static final int f17208x = 7;

    /* renamed from: y */
    public static final int f17209y = 7;
    @SafeParcelable.Field(mo10053id = 5)

    /* renamed from: a */
    public Bundle f17210a;
    @SafeParcelable.Field(mo10053id = 4)
    @mr2

    /* renamed from: a */
    public final byte[] f17211a;
    @SafeParcelable.Field(mo10053id = 3)

    /* renamed from: b */
    public final long f17212b;
    @SafeParcelable.Field(mo10053id = 1)
    @mr2

    /* renamed from: b */
    public final String f17213b;
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: n */
    public final int f17214n;
    @SafeParcelable.VersionField(mo10062id = 1000)

    /* renamed from: o */
    public final int f17215o;

    @KeepForSdkWithMembers
    @ShowFirstParty
    /* renamed from: com.onedelhi.secure.n73$a */
    public static class C2933a {

        /* renamed from: a */
        public int f17216a = n73.f17201q;

        /* renamed from: a */
        public long f17217a = rf4.f19825d;

        /* renamed from: a */
        public final Bundle f17218a = new Bundle();

        /* renamed from: a */
        public final String f17219a;

        /* renamed from: a */
        public byte[] f17220a = new byte[0];

        public C2933a(@mr2 String str) {
            Preconditions.checkNotEmpty(str);
            if (Patterns.WEB_URL.matcher(str).matches()) {
                this.f17219a = str;
                return;
            }
            throw new IllegalArgumentException("The supplied url [ " + str + "] is not match Patterns.WEB_URL!");
        }

        @mr2
        /* renamed from: a */
        public n73 mo20984a() {
            if (this.f17220a == null) {
                this.f17220a = new byte[0];
            }
            return new n73(2, this.f17219a, this.f17216a, this.f17217a, this.f17220a, this.f17218a);
        }

        @mr2
        /* renamed from: b */
        public C2933a mo20985b(@mr2 String str, @mr2 String str2) {
            Preconditions.checkNotEmpty(str, "Header name cannot be null or empty!");
            Bundle bundle = this.f17218a;
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString(str, str2);
            return this;
        }

        @mr2
        /* renamed from: c */
        public C2933a mo20986c(@mr2 byte[] bArr) {
            this.f17220a = bArr;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C2933a mo20987d(int i) {
            boolean z = false;
            if (i >= 0 && i <= n73.f17209y) {
                z = true;
            }
            Preconditions.checkArgument(z, "Unrecognized http method code.");
            this.f17216a = i;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C2933a mo20988e(long j) {
            Preconditions.checkArgument(j >= 0, "The specified timeout must be non-negative.");
            this.f17217a = j;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public n73(@SafeParcelable.Param(mo10056id = 1000) int i, @SafeParcelable.Param(mo10056id = 1) String str, @SafeParcelable.Param(mo10056id = 2) int i2, @SafeParcelable.Param(mo10056id = 3) long j, @SafeParcelable.Param(mo10056id = 4) byte[] bArr, @SafeParcelable.Param(mo10056id = 5) Bundle bundle) {
        this.f17215o = i;
        this.f17213b = str;
        this.f17214n = i2;
        this.f17212b = j;
        this.f17211a = bArr;
        this.f17210a = bundle;
    }

    @mr2
    /* renamed from: K2 */
    public Map<String, String> mo20981K2() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f17210a.size());
        for (String str : this.f17210a.keySet()) {
            String string = this.f17210a.getString(str);
            if (string == null) {
                string = "";
            }
            linkedHashMap.put(str, string);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    @mr2
    public String toString() {
        String str = this.f17213b;
        int i = this.f17214n;
        return "ProxyRequest[ url: " + str + ", method: " + i + " ]";
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f17213b, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f17214n);
        SafeParcelWriter.writeLong(parcel, 3, this.f17212b);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f17211a, false);
        SafeParcelWriter.writeBundle(parcel, 5, this.f17210a, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f17215o);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
