package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.yg1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryCreator")
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new zao();
    @SafeParcelable.VersionField(mo10062id = 1)
    public final int zaa;
    private final HashMap zab;
    @SafeParcelable.Field(getter = "getRootClassName", mo10053id = 3)
    private final String zac;

    @SafeParcelable.Constructor
    public zan(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) ArrayList arrayList, @SafeParcelable.Param(mo10056id = 3) String str) {
        this.zaa = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = (zal) arrayList.get(i2);
            String str2 = zal.zab;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) Preconditions.checkNotNull(zal.zac)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = (zam) zal.zac.get(i3);
                hashMap2.put(zam.zab, zam.zac);
            }
            hashMap.put(str2, hashMap2);
        }
        this.zab = hashMap;
        this.zac = (String) Preconditions.checkNotNull(str);
        zad();
    }

    public zan(Class cls) {
        this.zaa = 1;
        this.zab = new HashMap();
        this.zac = (String) Preconditions.checkNotNull(cls.getCanonicalName());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.zab.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.zab.get(str);
            for (String str2 : map.keySet()) {
                sb.append(yg1.C3999a.f23084c);
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        ArrayList arrayList = new ArrayList();
        for (String str : this.zab.keySet()) {
            arrayList.add(new zal(str, (Map) this.zab.get(str)));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.writeString(parcel, 3, this.zac, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zaa() {
        return this.zac;
    }

    @ts2
    public final Map zab(String str) {
        return (Map) this.zab.get(str);
    }

    public final void zac() {
        for (String str : this.zab.keySet()) {
            Map map = (Map) this.zab.get(str);
            HashMap hashMap = new HashMap();
            for (String str2 : map.keySet()) {
                hashMap.put(str2, ((FastJsonResponse.Field) map.get(str2)).zab());
            }
            this.zab.put(str, hashMap);
        }
    }

    public final void zad() {
        for (String str : this.zab.keySet()) {
            Map map = (Map) this.zab.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).zai(this);
            }
        }
    }

    public final void zae(Class cls, Map map) {
        this.zab.put((String) Preconditions.checkNotNull(cls.getCanonicalName()), map);
    }

    public final boolean zaf(Class cls) {
        return this.zab.containsKey(Preconditions.checkNotNull(cls.getCanonicalName()));
    }
}