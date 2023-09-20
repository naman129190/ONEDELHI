package com.onedelhi.secure;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

@SafeParcelable.Class(creator = "EventParamsCreator")
@SafeParcelable.Reserved({1})
public final class hj5 extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<hj5> CREATOR = new pj5();
    @SafeParcelable.Field(getter = "z", mo10053id = 2)

    /* renamed from: a */
    public final Bundle f13145a;

    @SafeParcelable.Constructor
    public hj5(@SafeParcelable.Param(mo10056id = 2) Bundle bundle) {
        this.f13145a = bundle;
    }

    /* renamed from: L2 */
    public final Bundle mo17314L2() {
        return new Bundle(this.f13145a);
    }

    /* renamed from: M2 */
    public final Double mo17315M2(String str) {
        return Double.valueOf(this.f13145a.getDouble("value"));
    }

    /* renamed from: N2 */
    public final Long mo17316N2(String str) {
        return Long.valueOf(this.f13145a.getLong("value"));
    }

    /* renamed from: O2 */
    public final Object mo17317O2(String str) {
        return this.f13145a.get(str);
    }

    /* renamed from: P2 */
    public final String mo17318P2(String str) {
        return this.f13145a.getString(str);
    }

    public final Iterator iterator() {
        return new zi5(this);
    }

    public final String toString() {
        return this.f13145a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, mo17314L2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f13145a.size();
    }
}
