package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@KeepForSdkWithMembers
@ShowFirstParty
@SafeParcelable.Class(creator = "ProxyResponseCreator")
public class o73 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<o73> CREATOR = new wl5();

    /* renamed from: q */
    public static final int f17861q = -1;
    @SafeParcelable.Field(mo10053id = 2)
    @mr2

    /* renamed from: a */
    public final PendingIntent f17862a;
    @SafeParcelable.Field(mo10053id = 4)

    /* renamed from: a */
    public final Bundle f17863a;
    @SafeParcelable.Field(mo10053id = 5)
    @mr2

    /* renamed from: a */
    public final byte[] f17864a;
    @SafeParcelable.Field(mo10053id = 1)

    /* renamed from: n */
    public final int f17865n;
    @SafeParcelable.Field(mo10053id = 3)

    /* renamed from: o */
    public final int f17866o;
    @SafeParcelable.VersionField(mo10062id = 1000)

    /* renamed from: p */
    public final int f17867p;

    @SafeParcelable.Constructor
    public o73(@SafeParcelable.Param(mo10056id = 1000) int i, @SafeParcelable.Param(mo10056id = 1) int i2, @SafeParcelable.Param(mo10056id = 2) PendingIntent pendingIntent, @SafeParcelable.Param(mo10056id = 3) int i3, @SafeParcelable.Param(mo10056id = 4) Bundle bundle, @SafeParcelable.Param(mo10056id = 5) byte[] bArr) {
        this.f17867p = i;
        this.f17865n = i2;
        this.f17866o = i3;
        this.f17863a = bundle;
        this.f17864a = bArr;
        this.f17862a = pendingIntent;
    }

    public o73(int i, @mr2 PendingIntent pendingIntent, int i2, @mr2 Bundle bundle, @mr2 byte[] bArr) {
        this(1, i, pendingIntent, i2, bundle, bArr);
    }

    public o73(int i, @mr2 Map<String, String> map, @mr2 byte[] bArr) {
        this(1, 0, (PendingIntent) null, i, m23586M2(map), bArr);
    }

    @mr2
    /* renamed from: K2 */
    public static o73 m23585K2(int i, @mr2 PendingIntent pendingIntent, int i2, @mr2 Map<String, String> map, @mr2 byte[] bArr) {
        return new o73(1, i, pendingIntent, i2, m23586M2(map), bArr);
    }

    /* renamed from: M2 */
    public static Bundle m23586M2(Map map) {
        Bundle bundle = new Bundle();
        if (map == null) {
            return bundle;
        }
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    @mr2
    /* renamed from: L2 */
    public Map<String, String> mo21823L2() {
        if (this.f17863a == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : this.f17863a.keySet()) {
            hashMap.put(str, this.f17863a.getString(str));
        }
        return hashMap;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f17865n);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f17862a, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f17866o);
        SafeParcelWriter.writeBundle(parcel, 4, this.f17863a, false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.f17864a, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f17867p);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
