package com.onedelhi.secure;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import org.checkerframework.dataflow.qual.Pure;

@SafeParcelable.Class(creator = "CurrentLocationRequestCreator")
public final class ub0 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<ub0> CREATOR = new ek6();
    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", mo10053id = 6)

    /* renamed from: a */
    public final WorkSource f21296a;
    @SafeParcelable.Field(getter = "getImpersonation", mo10053id = 9)
    @ts2

    /* renamed from: a */
    public final zw5 f21297a;
    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", mo10053id = 1)

    /* renamed from: b */
    public final long f21298b;
    @SafeParcelable.Field(getter = "getModuleId", mo10053id = 8)
    @ts2

    /* renamed from: b */
    public final String f21299b;
    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", mo10053id = 5)

    /* renamed from: b */
    public final boolean f21300b;
    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", mo10053id = 4)

    /* renamed from: c */
    public final long f21301c;
    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", mo10053id = 2)

    /* renamed from: n */
    public final int f21302n;
    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", mo10053id = 3)

    /* renamed from: o */
    public final int f21303o;
    @SafeParcelable.Field(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", mo10053id = 7)

    /* renamed from: p */
    public final int f21304p;

    /* renamed from: com.onedelhi.secure.ub0$a */
    public static final class C3691a {

        /* renamed from: a */
        public int f21305a;

        /* renamed from: a */
        public long f21306a;
        @ts2

        /* renamed from: a */
        public WorkSource f21307a;
        @ts2

        /* renamed from: a */
        public zw5 f21308a;
        @ts2

        /* renamed from: a */
        public String f21309a;

        /* renamed from: a */
        public boolean f21310a;

        /* renamed from: b */
        public int f21311b;

        /* renamed from: b */
        public long f21312b;

        /* renamed from: c */
        public int f21313c;

        public C3691a() {
            this.f21306a = jg3.f30769e;
            this.f21305a = 0;
            this.f21311b = 102;
            this.f21312b = Long.MAX_VALUE;
            this.f21310a = false;
            this.f21313c = 0;
            this.f21309a = null;
            this.f21307a = null;
            this.f21308a = null;
        }

        public C3691a(@mr2 ub0 ub0) {
            this.f21306a = ub0.mo25543M2();
            this.f21305a = ub0.mo25542L2();
            this.f21311b = ub0.mo25544N2();
            this.f21312b = ub0.mo25541K2();
            this.f21310a = ub0.mo25548R2();
            this.f21313c = ub0.zza();
            this.f21309a = ub0.mo25547Q2();
            this.f21307a = new WorkSource(ub0.mo25545O2());
            this.f21308a = ub0.mo25546P2();
        }

        @mr2
        /* renamed from: a */
        public ub0 mo25554a() {
            return new ub0(this.f21306a, this.f21305a, this.f21311b, this.f21312b, this.f21310a, this.f21313c, this.f21309a, new WorkSource(this.f21307a), this.f21308a);
        }

        @mr2
        /* renamed from: b */
        public C3691a mo25555b(long j) {
            Preconditions.checkArgument(j > 0, "durationMillis must be greater than 0");
            this.f21312b = j;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C3691a mo25556c(int i) {
            gv6.m16299a(i);
            this.f21305a = i;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C3691a mo25557d(long j) {
            Preconditions.checkArgument(j >= 0, "maxUpdateAgeMillis must be greater than or equal to 0");
            this.f21306a = j;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C3691a mo25558e(int i) {
            md5.m21499a(i);
            this.f21311b = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public ub0(@SafeParcelable.Param(mo10056id = 1) long j, @SafeParcelable.Param(mo10056id = 2) int i, @SafeParcelable.Param(mo10056id = 3) int i2, @SafeParcelable.Param(mo10056id = 4) long j2, @SafeParcelable.Param(mo10056id = 5) boolean z, @SafeParcelable.Param(mo10056id = 7) int i3, @SafeParcelable.Param(mo10056id = 8) @ts2 String str, @SafeParcelable.Param(mo10056id = 6) WorkSource workSource, @SafeParcelable.Param(mo10056id = 9) @ts2 zw5 zw5) {
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        this.f21298b = j;
        this.f21302n = i;
        this.f21303o = i2;
        this.f21301c = j2;
        this.f21300b = z;
        this.f21304p = i3;
        this.f21299b = str;
        this.f21296a = workSource;
        this.f21297a = zw5;
    }

    @Pure
    /* renamed from: K2 */
    public long mo25541K2() {
        return this.f21301c;
    }

    @Pure
    /* renamed from: L2 */
    public int mo25542L2() {
        return this.f21302n;
    }

    @Pure
    /* renamed from: M2 */
    public long mo25543M2() {
        return this.f21298b;
    }

    @Pure
    /* renamed from: N2 */
    public int mo25544N2() {
        return this.f21303o;
    }

    @mr2
    @Pure
    /* renamed from: O2 */
    public final WorkSource mo25545O2() {
        return this.f21296a;
    }

    @ts2
    @Pure
    /* renamed from: P2 */
    public final zw5 mo25546P2() {
        return this.f21297a;
    }

    @ts2
    @Deprecated
    @Pure
    /* renamed from: Q2 */
    public final String mo25547Q2() {
        return this.f21299b;
    }

    @Pure
    /* renamed from: R2 */
    public final boolean mo25548R2() {
        return this.f21300b;
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof ub0)) {
            return false;
        }
        ub0 ub0 = (ub0) obj;
        return this.f21298b == ub0.f21298b && this.f21302n == ub0.f21302n && this.f21303o == ub0.f21303o && this.f21301c == ub0.f21301c && this.f21300b == ub0.f21300b && this.f21304p == ub0.f21304p && Objects.equal(this.f21299b, ub0.f21299b) && Objects.equal(this.f21296a, ub0.f21296a) && Objects.equal(this.f21297a, ub0.f21297a);
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f21298b), Integer.valueOf(this.f21302n), Integer.valueOf(this.f21303o), Long.valueOf(this.f21301c));
    }

    @mr2
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CurrentLocationRequest[");
        sb.append(md5.m21500b(this.f21303o));
        if (this.f21298b != Long.MAX_VALUE) {
            sb.append(", maxAge=");
            hz5.m17065b(this.f21298b, sb);
        }
        if (this.f21301c != Long.MAX_VALUE) {
            sb.append(", duration=");
            sb.append(this.f21301c);
            sb.append("ms");
        }
        if (this.f21302n != 0) {
            sb.append(", ");
            sb.append(gv6.m16300b(this.f21302n));
        }
        if (this.f21300b) {
            sb.append(", bypass");
        }
        if (this.f21304p != 0) {
            sb.append(", ");
            sb.append(ff5.m14891a(this.f21304p));
        }
        if (this.f21299b != null) {
            sb.append(", moduleId=");
            sb.append(this.f21299b);
        }
        if (!WorkSourceUtil.isEmpty(this.f21296a)) {
            sb.append(", workSource=");
            sb.append(this.f21296a);
        }
        if (this.f21297a != null) {
            sb.append(", impersonation=");
            sb.append(this.f21297a);
        }
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, mo25543M2());
        SafeParcelWriter.writeInt(parcel, 2, mo25542L2());
        SafeParcelWriter.writeInt(parcel, 3, mo25544N2());
        SafeParcelWriter.writeLong(parcel, 4, mo25541K2());
        SafeParcelWriter.writeBoolean(parcel, 5, this.f21300b);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f21296a, i, false);
        SafeParcelWriter.writeInt(parcel, 7, this.f21304p);
        SafeParcelWriter.writeString(parcel, 8, this.f21299b, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f21297a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Pure
    public final int zza() {
        return this.f21304p;
    }
}
