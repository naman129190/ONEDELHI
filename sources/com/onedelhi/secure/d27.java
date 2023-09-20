package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SafeParcelable.Class(creator = "AccountTransferProgressCreator")
public final class d27 extends or5 {
    public static final Parcelable.Creator<d27> CREATOR = new u27();

    /* renamed from: a */
    public static final C3042oa f10597a;
    @SafeParcelable.Field(getter = "getRegisteredAccountTypes", mo10053id = 2)

    /* renamed from: a */
    public List f10598a;
    @SafeParcelable.Field(getter = "getInProgressAccountTypes", mo10053id = 3)

    /* renamed from: b */
    public List f10599b;
    @SafeParcelable.Field(getter = "getSuccessAccountTypes", mo10053id = 4)

    /* renamed from: c */
    public List f10600c;
    @SafeParcelable.Field(getter = "getFailedAccountTypes", mo10053id = 5)

    /* renamed from: d */
    public List f10601d;
    @SafeParcelable.Field(getter = "getEscrowedAccountTypes", mo10053id = 6)

    /* renamed from: e */
    public List f10602e;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f10603n;

    static {
        C3042oa oaVar = new C3042oa();
        f10597a = oaVar;
        oaVar.put("registered", FastJsonResponse.Field.forStrings("registered", 2));
        oaVar.put("in_progress", FastJsonResponse.Field.forStrings("in_progress", 3));
        oaVar.put("success", FastJsonResponse.Field.forStrings("success", 4));
        oaVar.put("failed", FastJsonResponse.Field.forStrings("failed", 5));
        oaVar.put("escrowed", FastJsonResponse.Field.forStrings("escrowed", 6));
    }

    public d27() {
        this.f10603n = 1;
    }

    @SafeParcelable.Constructor
    public d27(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) @ts2 List list, @SafeParcelable.Param(mo10056id = 3) @ts2 List list2, @SafeParcelable.Param(mo10056id = 4) @ts2 List list3, @SafeParcelable.Param(mo10056id = 5) @ts2 List list4, @SafeParcelable.Param(mo10056id = 6) @ts2 List list5) {
        this.f10603n = i;
        this.f10598a = list;
        this.f10599b = list2;
        this.f10600c = list3;
        this.f10601d = list4;
        this.f10602e = list5;
    }

    public final Map getFieldMappings() {
        return f10597a;
    }

    public final Object getFieldValue(FastJsonResponse.Field field) {
        switch (field.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.f10603n);
            case 2:
                return this.f10598a;
            case 3:
                return this.f10599b;
            case 4:
                return this.f10600c;
            case 5:
                return this.f10601d;
            case 6:
                return this.f10602e;
            default:
                int safeParcelableFieldId = field.getSafeParcelableFieldId();
                throw new IllegalStateException("Unknown SafeParcelable id=" + safeParcelableFieldId);
        }
    }

    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return true;
    }

    public final void setStringsInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.f10598a = arrayList;
        } else if (safeParcelableFieldId == 3) {
            this.f10599b = arrayList;
        } else if (safeParcelableFieldId == 4) {
            this.f10600c = arrayList;
        } else if (safeParcelableFieldId == 5) {
            this.f10601d = arrayList;
        } else if (safeParcelableFieldId == 6) {
            this.f10602e = arrayList;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", new Object[]{Integer.valueOf(safeParcelableFieldId)}));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f10603n);
        SafeParcelWriter.writeStringList(parcel, 2, this.f10598a, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.f10599b, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.f10600c, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.f10601d, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.f10602e, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
