package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.checkerframework.dataflow.qual.Pure;

@SafeParcelable.Class(creator = "LastLocationRequestCreator")
public final class f12 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<f12> CREATOR = new n37();
    @SafeParcelable.Field(getter = "getImpersonation", mo10053id = 5)
    @ts2

    /* renamed from: a */
    public final zw5 f11788a;
    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", mo10053id = 1)

    /* renamed from: b */
    public final long f11789b;
    @SafeParcelable.Field(getter = "getModuleId", mo10053id = 4)
    @ts2

    /* renamed from: b */
    public final String f11790b;
    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", mo10053id = 3)

    /* renamed from: b */
    public final boolean f11791b;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.location.Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", mo10053id = 2)

    /* renamed from: n */
    public final int f11792n;

    /* renamed from: com.onedelhi.secure.f12$a */
    public static final class C2109a {

        /* renamed from: a */
        public int f11793a;

        /* renamed from: a */
        public long f11794a;
        @ts2

        /* renamed from: a */
        public zw5 f11795a;
        @ts2

        /* renamed from: a */
        public String f11796a;

        /* renamed from: a */
        public boolean f11797a;

        public C2109a() {
            this.f11794a = Long.MAX_VALUE;
            this.f11793a = 0;
            this.f11797a = false;
            this.f11796a = null;
            this.f11795a = null;
        }

        public C2109a(@mr2 f12 f12) {
            this.f11794a = f12.mo15686L2();
            this.f11793a = f12.mo15685K2();
            this.f11797a = f12.mo15689c();
            this.f11796a = f12.mo15688N2();
            this.f11795a = f12.mo15687M2();
        }

        @mr2
        /* renamed from: a */
        public f12 mo15694a() {
            return new f12(this.f11794a, this.f11793a, this.f11797a, this.f11796a, this.f11795a);
        }

        @mr2
        /* renamed from: b */
        public C2109a mo15695b(int i) {
            gv6.m16299a(i);
            this.f11793a = i;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C2109a mo15696c(long j) {
            Preconditions.checkArgument(j > 0, "maxUpdateAgeMillis must be greater than 0");
            this.f11794a = j;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public f12(@SafeParcelable.Param(mo10056id = 1) long j, @SafeParcelable.Param(mo10056id = 2) int i, @SafeParcelable.Param(mo10056id = 3) boolean z, @SafeParcelable.Param(mo10056id = 4) @ts2 String str, @SafeParcelable.Param(mo10056id = 5) @ts2 zw5 zw5) {
        this.f11789b = j;
        this.f11792n = i;
        this.f11791b = z;
        this.f11790b = str;
        this.f11788a = zw5;
    }

    @Pure
    /* renamed from: K2 */
    public int mo15685K2() {
        return this.f11792n;
    }

    @Pure
    /* renamed from: L2 */
    public long mo15686L2() {
        return this.f11789b;
    }

    @ts2
    @Pure
    /* renamed from: M2 */
    public final zw5 mo15687M2() {
        return this.f11788a;
    }

    @ts2
    @Deprecated
    @Pure
    /* renamed from: N2 */
    public final String mo15688N2() {
        return this.f11790b;
    }

    @Pure
    /* renamed from: c */
    public final boolean mo15689c() {
        return this.f11791b;
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof f12)) {
            return false;
        }
        f12 f12 = (f12) obj;
        return this.f11789b == f12.f11789b && this.f11792n == f12.f11792n && this.f11791b == f12.f11791b && Objects.equal(this.f11790b, f12.f11790b) && Objects.equal(this.f11788a, f12.f11788a);
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f11789b), Integer.valueOf(this.f11792n), Boolean.valueOf(this.f11791b));
    }

    @mr2
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        if (this.f11789b != Long.MAX_VALUE) {
            sb.append("maxAge=");
            hz5.m17065b(this.f11789b, sb);
        }
        if (this.f11792n != 0) {
            sb.append(", ");
            sb.append(gv6.m16300b(this.f11792n));
        }
        if (this.f11791b) {
            sb.append(", bypass");
        }
        if (this.f11790b != null) {
            sb.append(", moduleId=");
            sb.append(this.f11790b);
        }
        if (this.f11788a != null) {
            sb.append(", impersonation=");
            sb.append(this.f11788a);
        }
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, mo15686L2());
        SafeParcelWriter.writeInt(parcel, 2, mo15685K2());
        SafeParcelWriter.writeBoolean(parcel, 3, this.f11791b);
        SafeParcelWriter.writeString(parcel, 4, this.f11790b, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f11788a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
