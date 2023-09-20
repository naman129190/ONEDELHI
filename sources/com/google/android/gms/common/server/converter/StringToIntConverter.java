package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.onedelhi.secure.C7277xt;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.ArrayList;
import java.util.HashMap;

@KeepForSdk
@SafeParcelable.Class(creator = "StringToIntConverterCreator")
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {
    @mr2
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();
    @SafeParcelable.VersionField(mo10062id = 1)
    public final int zaa;
    private final HashMap zab;
    private final SparseArray zac;

    @KeepForSdk
    public StringToIntConverter() {
        this.zaa = 1;
        this.zab = new HashMap();
        this.zac = new SparseArray();
    }

    @SafeParcelable.Constructor
    public StringToIntConverter(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) ArrayList arrayList) {
        this.zaa = i;
        this.zab = new HashMap();
        this.zac = new SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zac2 = (zac) arrayList.get(i2);
            add(zac2.zab, zac2.zac);
        }
    }

    @mr2
    @KeepForSdk
    @C7277xt
    public StringToIntConverter add(@mr2 String str, int i) {
        this.zab.put(str, Integer.valueOf(i));
        this.zac.put(i, str);
        return this;
    }

    public final void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        ArrayList arrayList = new ArrayList();
        for (String str : this.zab.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.zab.get(str)).intValue()));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zaa() {
        return 7;
    }

    public final int zab() {
        return 0;
    }

    @ts2
    public final /* bridge */ /* synthetic */ Object zac(@mr2 Object obj) {
        Integer num = (Integer) this.zab.get((String) obj);
        return num == null ? (Integer) this.zab.get("gms_unknown") : num;
    }

    @mr2
    public final /* bridge */ /* synthetic */ Object zad(@mr2 Object obj) {
        String str = (String) this.zac.get(((Integer) obj).intValue());
        return (str != null || !this.zab.containsKey("gms_unknown")) ? str : "gms_unknown";
    }
}
