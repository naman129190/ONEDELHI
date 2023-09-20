package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "LocationSettingsRequestCreator")
@SafeParcelable.Reserved({4, 5, 1000})
public final class c82 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<c82> CREATOR = new m67();
    @SafeParcelable.Field(getter = "getLocationRequests", mo10053id = 1)

    /* renamed from: a */
    public final List f10191a;
    @SafeParcelable.Field(defaultValue = "false", getter = "alwaysShow", mo10053id = 2)

    /* renamed from: b */
    public final boolean f10192b;
    @SafeParcelable.Field(getter = "needBle", mo10053id = 3)

    /* renamed from: c */
    public final boolean f10193c;

    /* renamed from: com.onedelhi.secure.c82$a */
    public static final class C1864a {

        /* renamed from: a */
        public final ArrayList f10194a = new ArrayList();

        /* renamed from: a */
        public boolean f10195a = false;

        /* renamed from: b */
        public boolean f10196b = false;

        @mr2
        /* renamed from: a */
        public C1864a mo14065a(@mr2 Collection<LocationRequest> collection) {
            for (LocationRequest next : collection) {
                if (next != null) {
                    this.f10194a.add(next);
                }
            }
            return this;
        }

        @mr2
        /* renamed from: b */
        public C1864a mo14066b(@mr2 LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f10194a.add(locationRequest);
            }
            return this;
        }

        @mr2
        /* renamed from: c */
        public c82 mo14067c() {
            return new c82(this.f10194a, this.f10195a, this.f10196b);
        }

        @mr2
        /* renamed from: d */
        public C1864a mo14068d(boolean z) {
            this.f10195a = z;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C1864a mo14069e(boolean z) {
            this.f10196b = z;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public c82(@SafeParcelable.Param(mo10056id = 1) List list, @SafeParcelable.Param(mo10056id = 2) boolean z, @SafeParcelable.Param(mo10056id = 3) boolean z2) {
        this.f10191a = list;
        this.f10192b = z;
        this.f10193c = z2;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, Collections.unmodifiableList(this.f10191a), false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f10192b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f10193c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
