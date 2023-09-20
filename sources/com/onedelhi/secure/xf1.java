package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class(creator = "GeofencingRequestCreator")
@SafeParcelable.Reserved({1000})
public class xf1 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<xf1> CREATOR = new pt6();

    /* renamed from: o */
    public static final int f22540o = 1;

    /* renamed from: p */
    public static final int f22541p = 2;

    /* renamed from: q */
    public static final int f22542q = 4;
    @SafeParcelable.Field(getter = "getParcelableGeofences", mo10053id = 1)

    /* renamed from: a */
    public final List f22543a;
    @SafeParcelable.Field(defaultValue = "", getter = "getTag", mo10053id = 3)

    /* renamed from: b */
    public final String f22544b;
    @SafeParcelable.Field(getter = "getContextAttributionTag", mo10053id = 4)
    @ts2

    /* renamed from: c */
    public final String f22545c;
    @SafeParcelable.Field(getter = "getInitialTrigger", mo10053id = 2)
    @C3921b

    /* renamed from: n */
    public final int f22546n;

    /* renamed from: com.onedelhi.secure.xf1$a */
    public static final class C3920a {
        @C3921b

        /* renamed from: a */
        public int f22547a = 5;

        /* renamed from: a */
        public String f22548a = "";

        /* renamed from: a */
        public final List f22549a = new ArrayList();

        @mr2
        /* renamed from: a */
        public C3920a mo26914a(@mr2 sf1 sf1) {
            Preconditions.checkNotNull(sf1, "geofence can't be null.");
            Preconditions.checkArgument(sf1 instanceof zy5, "Geofence must be created using Geofence.Builder.");
            this.f22549a.add((zy5) sf1);
            return this;
        }

        @mr2
        /* renamed from: b */
        public C3920a mo26915b(@mr2 List<sf1> list) {
            if (list != null && !list.isEmpty()) {
                for (sf1 next : list) {
                    if (next != null) {
                        mo26914a(next);
                    }
                }
            }
            return this;
        }

        @mr2
        /* renamed from: c */
        public xf1 mo26916c() {
            Preconditions.checkArgument(!this.f22549a.isEmpty(), "No geofence has been added to this request.");
            return new xf1(this.f22549a, this.f22547a, this.f22548a, (String) null);
        }

        @mr2
        /* renamed from: d */
        public C3920a mo26917d(@C3921b int i) {
            this.f22547a = i & 7;
            return this;
        }
    }

    /* renamed from: com.onedelhi.secure.xf1$b */
    public @interface C3921b {
    }

    @SafeParcelable.Constructor
    public xf1(@SafeParcelable.Param(mo10056id = 1) List list, @SafeParcelable.Param(mo10056id = 2) @C3921b int i, @SafeParcelable.Param(mo10056id = 3) String str, @SafeParcelable.Param(mo10056id = 4) @ts2 String str2) {
        this.f22543a = list;
        this.f22546n = i;
        this.f22544b = str;
        this.f22545c = str2;
    }

    @mr2
    /* renamed from: K2 */
    public List<sf1> mo26909K2() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f22543a);
        return arrayList;
    }

    @C3921b
    /* renamed from: L2 */
    public int mo26910L2() {
        return this.f22546n;
    }

    @mr2
    /* renamed from: M2 */
    public final xf1 mo26911M2(@ts2 String str) {
        return new xf1(this.f22543a, this.f22546n, this.f22544b, str);
    }

    @mr2
    public String toString() {
        return "GeofencingRequest[geofences=" + this.f22543a + ", initialTrigger=" + this.f22546n + ", tag=" + this.f22544b + ", attributionTag=" + this.f22545c + "]";
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f22543a, false);
        SafeParcelWriter.writeInt(parcel, 2, mo26910L2());
        SafeParcelWriter.writeString(parcel, 3, this.f22544b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f22545c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
