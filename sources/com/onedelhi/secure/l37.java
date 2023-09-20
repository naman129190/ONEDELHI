package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class(creator = "AuthenticatorAnnotatedDataCreator")
public final class l37 extends or5 {
    public static final Parcelable.Creator<l37> CREATOR = new c47();

    /* renamed from: a */
    public static final HashMap f15156a;
    @SafeParcelable.Field(getter = "getInfo", mo10053id = 2)

    /* renamed from: a */
    public s47 f15157a;
    @SafeParcelable.Indicator

    /* renamed from: a */
    public final Set f15158a;
    @SafeParcelable.Field(getter = "getSignature", mo10053id = 3)

    /* renamed from: b */
    public String f15159b;
    @SafeParcelable.Field(getter = "getPackageName", mo10053id = 4)

    /* renamed from: c */
    public String f15160c;
    @SafeParcelable.Field(getter = "getId", mo10053id = 5)

    /* renamed from: d */
    public String f15161d;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f15162n;

    static {
        HashMap hashMap = new HashMap();
        f15156a = hashMap;
        hashMap.put("authenticatorInfo", FastJsonResponse.Field.forConcreteType("authenticatorInfo", 2, s47.class));
        hashMap.put("signature", FastJsonResponse.Field.forString("signature", 3));
        hashMap.put("package", FastJsonResponse.Field.forString("package", 4));
    }

    public l37() {
        this.f15158a = new HashSet(3);
        this.f15162n = 1;
    }

    @SafeParcelable.Constructor
    public l37(@SafeParcelable.Indicator Set set, @SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) s47 s47, @SafeParcelable.Param(mo10056id = 3) String str, @SafeParcelable.Param(mo10056id = 4) String str2, @SafeParcelable.Param(mo10056id = 5) String str3) {
        this.f15158a = set;
        this.f15162n = i;
        this.f15157a = s47;
        this.f15159b = str;
        this.f15160c = str2;
        this.f15161d = str3;
    }

    public final void addConcreteTypeInternal(FastJsonResponse.Field field, String str, FastJsonResponse fastJsonResponse) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.f15157a = (s47) fastJsonResponse;
            this.f15158a.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(safeParcelableFieldId), fastJsonResponse.getClass().getCanonicalName()}));
    }

    public final /* synthetic */ Map getFieldMappings() {
        return f15156a;
    }

    public final Object getFieldValue(FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 1) {
            return Integer.valueOf(this.f15162n);
        }
        if (safeParcelableFieldId == 2) {
            return this.f15157a;
        }
        if (safeParcelableFieldId == 3) {
            return this.f15159b;
        }
        if (safeParcelableFieldId == 4) {
            return this.f15160c;
        }
        int safeParcelableFieldId2 = field.getSafeParcelableFieldId();
        throw new IllegalStateException("Unknown SafeParcelable id=" + safeParcelableFieldId2);
    }

    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.f15158a.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    public final void setStringInternal(FastJsonResponse.Field field, String str, String str2) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 3) {
            this.f15159b = str2;
        } else if (safeParcelableFieldId == 4) {
            this.f15160c = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(safeParcelableFieldId)}));
        }
        this.f15158a.add(Integer.valueOf(safeParcelableFieldId));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        Set set = this.f15158a;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.f15162n);
        }
        if (set.contains(2)) {
            SafeParcelWriter.writeParcelable(parcel, 2, this.f15157a, i, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.writeString(parcel, 3, this.f15159b, true);
        }
        if (set.contains(4)) {
            SafeParcelWriter.writeString(parcel, 4, this.f15160c, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.writeString(parcel, 5, this.f15161d, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
