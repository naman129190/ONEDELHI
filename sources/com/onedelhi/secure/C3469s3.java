package com.onedelhi.secure;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "ActivityTransitionResultCreator")
@SafeParcelable.Reserved({1000})
/* renamed from: com.onedelhi.secure.s3 */
public class C3469s3 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C3469s3> CREATOR = new lh6();
    @SafeParcelable.Field(getter = "getExtras", mo10053id = 2)
    @ts2

    /* renamed from: a */
    public Bundle f20191a;
    @SafeParcelable.Field(getter = "getTransitionEvents", mo10053id = 1)

    /* renamed from: a */
    public final List f20192a;

    public C3469s3(@SafeParcelable.Param(mo10056id = 1) @mr2 List<C3223q3> list) {
        this.f20191a = null;
        Preconditions.checkNotNull(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                Preconditions.checkArgument(list.get(i).mo22814L2() >= list.get(i + -1).mo22814L2());
            }
        }
        this.f20192a = Collections.unmodifiableList(list);
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public C3469s3(@SafeParcelable.Param(mo10056id = 1) @mr2 List list, @SafeParcelable.Param(mo10056id = 2) @ts2 Bundle bundle) {
        this(list);
        this.f20191a = bundle;
    }

    @ts2
    /* renamed from: K2 */
    public static C3469s3 m27226K2(@mr2 Intent intent) {
        if (!m27227M2(intent)) {
            return null;
        }
        return (C3469s3) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
    }

    /* renamed from: M2 */
    public static boolean m27227M2(@ts2 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    @mr2
    /* renamed from: L2 */
    public List<C3223q3> mo24176L2() {
        return this.f20192a;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f20192a.equals(((C3469s3) obj).f20192a);
    }

    public int hashCode() {
        return this.f20192a.hashCode();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, mo24176L2(), false);
        SafeParcelWriter.writeBundle(parcel, 2, this.f20191a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
