package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class(creator = "AuthenticatorTransferInfoCreator")
public final class s47 extends or5 {
    public static final Parcelable.Creator<s47> CREATOR = new i57();

    /* renamed from: a */
    public static final HashMap f20206a;
    @SafeParcelable.Field(getter = "getPendingIntent", mo10053id = 5)

    /* renamed from: a */
    public PendingIntent f20207a;
    @SafeParcelable.Field(getter = "getDeviceMetaData", mo10053id = 6)

    /* renamed from: a */
    public sk0 f20208a;
    @SafeParcelable.Indicator

    /* renamed from: a */
    public final Set f20209a;
    @SafeParcelable.Field(getter = "getTransferBytes", mo10053id = 4)

    /* renamed from: a */
    public byte[] f20210a;
    @SafeParcelable.Field(getter = "getAccountType", mo10053id = 2)

    /* renamed from: b */
    public String f20211b;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f20212n;
    @SafeParcelable.Field(getter = "getStatus", mo10053id = 3)

    /* renamed from: o */
    public int f20213o;

    static {
        HashMap hashMap = new HashMap();
        f20206a = hashMap;
        hashMap.put("accountType", FastJsonResponse.Field.forString("accountType", 2));
        hashMap.put("status", FastJsonResponse.Field.forInteger("status", 3));
        hashMap.put("transferBytes", FastJsonResponse.Field.forBase64("transferBytes", 4));
    }

    public s47() {
        this.f20209a = new C3679ua(3);
        this.f20212n = 1;
    }

    @SafeParcelable.Constructor
    public s47(@SafeParcelable.Indicator Set set, @SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) String str, @SafeParcelable.Param(mo10056id = 3) int i2, @SafeParcelable.Param(mo10056id = 4) byte[] bArr, @SafeParcelable.Param(mo10056id = 5) PendingIntent pendingIntent, @SafeParcelable.Param(mo10056id = 6) sk0 sk0) {
        this.f20209a = set;
        this.f20212n = i;
        this.f20211b = str;
        this.f20213o = i2;
        this.f20210a = bArr;
        this.f20207a = pendingIntent;
        this.f20208a = sk0;
    }

    public final /* synthetic */ Map getFieldMappings() {
        return f20206a;
    }

    public final Object getFieldValue(FastJsonResponse.Field field) {
        int i;
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 1) {
            i = this.f20212n;
        } else if (safeParcelableFieldId == 2) {
            return this.f20211b;
        } else {
            if (safeParcelableFieldId == 3) {
                i = this.f20213o;
            } else if (safeParcelableFieldId == 4) {
                return this.f20210a;
            } else {
                int safeParcelableFieldId2 = field.getSafeParcelableFieldId();
                throw new IllegalStateException("Unknown SafeParcelable id=" + safeParcelableFieldId2);
            }
        }
        return Integer.valueOf(i);
    }

    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.f20209a.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    public final void setDecodedBytesInternal(FastJsonResponse.Field field, String str, byte[] bArr) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 4) {
            this.f20210a = bArr;
            this.f20209a.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new IllegalArgumentException("Field with id=" + safeParcelableFieldId + " is not known to be an byte array.");
    }

    public final void setIntegerInternal(FastJsonResponse.Field field, String str, int i) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 3) {
            this.f20213o = i;
            this.f20209a.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new IllegalArgumentException("Field with id=" + safeParcelableFieldId + " is not known to be an int.");
    }

    public final void setStringInternal(FastJsonResponse.Field field, String str, String str2) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.f20211b = str2;
            this.f20209a.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(safeParcelableFieldId)}));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        Set set = this.f20209a;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.f20212n);
        }
        if (set.contains(2)) {
            SafeParcelWriter.writeString(parcel, 2, this.f20211b, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.writeInt(parcel, 3, this.f20213o);
        }
        if (set.contains(4)) {
            SafeParcelWriter.writeByteArray(parcel, 4, this.f20210a, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.writeParcelable(parcel, 5, this.f20207a, i, true);
        }
        if (set.contains(6)) {
            SafeParcelWriter.writeParcelable(parcel, 6, this.f20208a, i, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
