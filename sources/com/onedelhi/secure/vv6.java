package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class(creator = "AccountTransferMsgCreator")
public final class vv6 extends or5 {
    public static final Parcelable.Creator<vv6> CREATOR = new nx6();

    /* renamed from: a */
    public static final HashMap f21982a;
    @SafeParcelable.Field(getter = "getProgress", mo10053id = 4)

    /* renamed from: a */
    public d27 f21983a;
    @SafeParcelable.Field(getter = "getAuthenticatorDatas", mo10053id = 2)

    /* renamed from: a */
    public ArrayList f21984a;
    @SafeParcelable.Indicator

    /* renamed from: a */
    public final Set f21985a;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f21986n;
    @SafeParcelable.Field(getter = "getRequestType", mo10053id = 3)

    /* renamed from: o */
    public int f21987o;

    static {
        HashMap hashMap = new HashMap();
        f21982a = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse.Field.forConcreteTypeArray("authenticatorData", 2, l37.class));
        hashMap.put("progress", FastJsonResponse.Field.forConcreteType("progress", 4, d27.class));
    }

    public vv6() {
        this.f21985a = new HashSet(1);
        this.f21986n = 1;
    }

    @SafeParcelable.Constructor
    public vv6(@SafeParcelable.Indicator Set set, @SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) ArrayList arrayList, @SafeParcelable.Param(mo10056id = 3) int i2, @SafeParcelable.Param(mo10056id = 4) d27 d27) {
        this.f21985a = set;
        this.f21986n = i;
        this.f21984a = arrayList;
        this.f21987o = i2;
        this.f21983a = d27;
    }

    public final void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.f21984a = arrayList;
            this.f21985a.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", new Object[]{Integer.valueOf(safeParcelableFieldId), arrayList.getClass().getCanonicalName()}));
    }

    public final void addConcreteTypeInternal(FastJsonResponse.Field field, String str, FastJsonResponse fastJsonResponse) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 4) {
            this.f21983a = (d27) fastJsonResponse;
            this.f21985a.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(safeParcelableFieldId), fastJsonResponse.getClass().getCanonicalName()}));
    }

    public final /* synthetic */ Map getFieldMappings() {
        return f21982a;
    }

    public final Object getFieldValue(FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 1) {
            return Integer.valueOf(this.f21986n);
        }
        if (safeParcelableFieldId == 2) {
            return this.f21984a;
        }
        if (safeParcelableFieldId == 4) {
            return this.f21983a;
        }
        int safeParcelableFieldId2 = field.getSafeParcelableFieldId();
        throw new IllegalStateException("Unknown SafeParcelable id=" + safeParcelableFieldId2);
    }

    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.f21985a.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        Set set = this.f21985a;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.f21986n);
        }
        if (set.contains(2)) {
            SafeParcelWriter.writeTypedList(parcel, 2, this.f21984a, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.writeInt(parcel, 3, this.f21987o);
        }
        if (set.contains(4)) {
            SafeParcelWriter.writeParcelable(parcel, 4, this.f21983a, i, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
