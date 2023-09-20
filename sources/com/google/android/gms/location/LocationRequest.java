package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.onedelhi.secure.ff5;
import com.onedelhi.secure.gv6;
import com.onedelhi.secure.hz5;
import com.onedelhi.secure.md5;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.t47;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wj3;
import com.onedelhi.secure.zw5;
import org.checkerframework.dataflow.qual.Pure;

@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({4, 5, 1000})
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<LocationRequest> CREATOR = new t47();
    @Deprecated

    /* renamed from: r */
    public static final int f7482r = 100;
    @Deprecated

    /* renamed from: s */
    public static final int f7483s = 102;
    @Deprecated

    /* renamed from: t */
    public static final int f7484t = 104;
    @Deprecated

    /* renamed from: u */
    public static final int f7485u = 105;
    @SafeParcelable.Field(defaultValue = "0", getter = "getMinUpdateDistanceMeters", mo10053id = 7)

    /* renamed from: a */
    public float f7486a;
    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", mo10053id = 16)

    /* renamed from: a */
    public final WorkSource f7487a;
    @SafeParcelable.Field(getter = "getImpersonation", mo10053id = 17)
    @ts2

    /* renamed from: a */
    public final zw5 f7488a;
    @SafeParcelable.Field(defaultValue = "3600000", getter = "getIntervalMillis", mo10053id = 2)

    /* renamed from: b */
    public long f7489b;
    @SafeParcelable.Field(getter = "getModuleId", mo10053id = 14)
    @ts2

    /* renamed from: b */
    public final String f7490b;
    @SafeParcelable.Field(defaultValue = "false", getter = "isWaitForAccurateLocation", mo10053id = 9)

    /* renamed from: b */
    public boolean f7491b;
    @SafeParcelable.Field(defaultValue = "600000", getter = "getMinUpdateIntervalMillis", mo10053id = 3)

    /* renamed from: c */
    public long f7492c;
    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", mo10053id = 15)

    /* renamed from: c */
    public final boolean f7493c;
    @SafeParcelable.Field(defaultValue = "0", getter = "getMaxUpdateDelayMillis", mo10053id = 8)

    /* renamed from: d */
    public long f7494d;
    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", mo10053id = 10)

    /* renamed from: e */
    public long f7495e;
    @SafeParcelable.Field(defaultValueUnchecked = "-1", getter = "getMaxUpdateAgeMillis", mo10053id = 11)

    /* renamed from: f */
    public long f7496f;
    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", mo10053id = 1)

    /* renamed from: n */
    public int f7497n;
    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MAX_VALUE", getter = "getMaxUpdates", mo10053id = 6)

    /* renamed from: o */
    public int f7498o;
    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", mo10053id = 12)

    /* renamed from: p */
    public final int f7499p;
    @SafeParcelable.Field(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", mo10053id = 13)

    /* renamed from: q */
    public final int f7500q;

    /* renamed from: com.google.android.gms.location.LocationRequest$a */
    public static final class C1436a {

        /* renamed from: f */
        public static final long f7501f = -1;

        /* renamed from: g */
        public static final long f7502g = -1;

        /* renamed from: a */
        public float f7503a;

        /* renamed from: a */
        public int f7504a;

        /* renamed from: a */
        public long f7505a;
        @ts2

        /* renamed from: a */
        public WorkSource f7506a;
        @ts2

        /* renamed from: a */
        public zw5 f7507a;
        @ts2

        /* renamed from: a */
        public String f7508a;

        /* renamed from: a */
        public boolean f7509a;

        /* renamed from: b */
        public int f7510b;

        /* renamed from: b */
        public long f7511b;

        /* renamed from: b */
        public boolean f7512b;

        /* renamed from: c */
        public int f7513c;

        /* renamed from: c */
        public long f7514c;

        /* renamed from: d */
        public int f7515d;

        /* renamed from: d */
        public long f7516d;

        /* renamed from: e */
        public long f7517e;

        public C1436a(int i, long j) {
            Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
            md5.m21499a(i);
            this.f7504a = i;
            this.f7505a = j;
            this.f7511b = -1;
            this.f7514c = 0;
            this.f7516d = Long.MAX_VALUE;
            this.f7510b = Integer.MAX_VALUE;
            this.f7503a = 0.0f;
            this.f7509a = true;
            this.f7517e = -1;
            this.f7513c = 0;
            this.f7515d = 0;
            this.f7508a = null;
            this.f7512b = false;
            this.f7506a = null;
            this.f7507a = null;
        }

        public C1436a(long j) {
            Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
            this.f7505a = j;
            this.f7504a = 102;
            this.f7511b = -1;
            this.f7514c = 0;
            this.f7516d = Long.MAX_VALUE;
            this.f7510b = Integer.MAX_VALUE;
            this.f7503a = 0.0f;
            this.f7509a = true;
            this.f7517e = -1;
            this.f7513c = 0;
            this.f7515d = 0;
            this.f7508a = null;
            this.f7512b = false;
            this.f7506a = null;
            this.f7507a = null;
        }

        public C1436a(@mr2 LocationRequest locationRequest) {
            this.f7504a = locationRequest.mo10524X2();
            this.f7505a = locationRequest.mo10516P2();
            this.f7511b = locationRequest.mo10522V2();
            this.f7514c = locationRequest.mo10518R2();
            this.f7516d = locationRequest.mo10512L2();
            this.f7510b = locationRequest.mo10519S2();
            this.f7503a = locationRequest.mo10521U2();
            this.f7509a = locationRequest.mo10529c3();
            this.f7517e = locationRequest.mo10517Q2();
            this.f7513c = locationRequest.mo10514N2();
            this.f7515d = locationRequest.zza();
            this.f7508a = locationRequest.mo10543o3();
            this.f7512b = locationRequest.mo10544p3();
            this.f7506a = locationRequest.mo10541m3();
            this.f7507a = locationRequest.mo10542n3();
        }

        @mr2
        /* renamed from: a */
        public LocationRequest mo10548a() {
            int i = this.f7504a;
            long j = this.f7505a;
            long j2 = this.f7511b;
            if (j2 == -1) {
                j2 = j;
            } else if (i != 105) {
                j2 = Math.min(j2, j);
            }
            long max = Math.max(this.f7514c, this.f7505a);
            long j3 = this.f7516d;
            int i2 = this.f7510b;
            float f = this.f7503a;
            boolean z = this.f7509a;
            long j4 = this.f7517e;
            long j5 = j4 == -1 ? this.f7505a : j4;
            int i3 = this.f7513c;
            int i4 = this.f7515d;
            String str = this.f7508a;
            boolean z2 = this.f7512b;
            WorkSource workSource = r7;
            WorkSource workSource2 = new WorkSource(this.f7506a);
            return new LocationRequest(i, j, j2, max, Long.MAX_VALUE, j3, i2, f, z, j5, i3, i4, str, z2, workSource, this.f7507a);
        }

        @mr2
        /* renamed from: b */
        public C1436a mo10549b(long j) {
            Preconditions.checkArgument(j > 0, "durationMillis must be greater than 0");
            this.f7516d = j;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C1436a mo10550c(int i) {
            gv6.m16299a(i);
            this.f7513c = i;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C1436a mo10551d(long j) {
            Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
            this.f7505a = j;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C1436a mo10552e(long j) {
            boolean z = true;
            if (j != -1 && j < 0) {
                z = false;
            }
            Preconditions.checkArgument(z, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.f7517e = j;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C1436a mo10553f(long j) {
            Preconditions.checkArgument(j >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.f7514c = j;
            return this;
        }

        @mr2
        /* renamed from: g */
        public C1436a mo10554g(int i) {
            Preconditions.checkArgument(i > 0, "maxUpdates must be greater than 0");
            this.f7510b = i;
            return this;
        }

        @mr2
        /* renamed from: h */
        public C1436a mo10555h(float f) {
            Preconditions.checkArgument(f >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.f7503a = f;
            return this;
        }

        @mr2
        /* renamed from: i */
        public C1436a mo10556i(long j) {
            boolean z = true;
            if (j != -1 && j < 0) {
                z = false;
            }
            Preconditions.checkArgument(z, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.f7511b = j;
            return this;
        }

        @mr2
        /* renamed from: j */
        public C1436a mo10557j(int i) {
            md5.m21499a(i);
            this.f7504a = i;
            return this;
        }

        @mr2
        /* renamed from: k */
        public C1436a mo10558k(boolean z) {
            this.f7509a = z;
            return this;
        }

        @mr2
        @wj3(anyOf = {"android.permission.WRITE_SECURE_SETTINGS", "android.permission.LOCATION_BYPASS"})
        /* renamed from: l */
        public final C1436a mo10559l(boolean z) {
            this.f7512b = z;
            return this;
        }

        @mr2
        @Deprecated
        /* renamed from: m */
        public final C1436a mo10560m(@ts2 String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.f7508a = str;
            }
            return this;
        }

        @mr2
        /* renamed from: n */
        public final C1436a mo10561n(int i) {
            boolean z;
            int i2 = 2;
            if (i == 0 || i == 1) {
                i2 = i;
            } else if (i == 2) {
                i = 2;
            } else {
                i2 = i;
                z = false;
                Preconditions.checkArgument(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
                this.f7515d = i2;
                return this;
            }
            z = true;
            Preconditions.checkArgument(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
            this.f7515d = i2;
            return this;
        }

        @mr2
        @wj3("android.permission.UPDATE_DEVICE_STATS")
        /* renamed from: o */
        public final C1436a mo10562o(@ts2 WorkSource workSource) {
            this.f7506a = workSource;
            return this;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocationRequest() {
        /*
            r23 = this;
            r0 = r23
            android.os.WorkSource r1 = new android.os.WorkSource
            r21 = r1
            r1.<init>()
            r1 = 102(0x66, float:1.43E-43)
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            r4 = 600000(0x927c0, double:2.964394E-318)
            r6 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            r14 = 1
            r15 = 3600000(0x36ee80, double:1.7786363E-317)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r0.<init>(r1, r2, r4, r6, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.<init>():void");
    }

    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) long j, @SafeParcelable.Param(mo10056id = 3) long j2, @SafeParcelable.Param(mo10056id = 8) long j3, @SafeParcelable.RemovedParam(defaultValueUnchecked = "Long.MAX_VALUE", mo10059id = 5) long j4, @SafeParcelable.Param(mo10056id = 10) long j5, @SafeParcelable.Param(mo10056id = 6) int i2, @SafeParcelable.Param(mo10056id = 7) float f, @SafeParcelable.Param(mo10056id = 9) boolean z, @SafeParcelable.Param(mo10056id = 11) long j6, @SafeParcelable.Param(mo10056id = 12) int i3, @SafeParcelable.Param(mo10056id = 13) int i4, @SafeParcelable.Param(mo10056id = 14) @ts2 String str, @SafeParcelable.Param(mo10056id = 15) boolean z2, @SafeParcelable.Param(mo10056id = 16) WorkSource workSource, @SafeParcelable.Param(mo10056id = 17) @ts2 zw5 zw5) {
        this.f7497n = i;
        long j7 = j;
        this.f7489b = j7;
        this.f7492c = j2;
        this.f7494d = j3;
        this.f7495e = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1, j4 - SystemClock.elapsedRealtime()), j5);
        this.f7498o = i2;
        this.f7486a = f;
        this.f7491b = z;
        this.f7496f = j6 != -1 ? j6 : j7;
        this.f7499p = i3;
        this.f7500q = i4;
        this.f7490b = str;
        this.f7493c = z2;
        this.f7487a = workSource;
        this.f7488a = zw5;
    }

    @mr2
    @Deprecated
    /* renamed from: K2 */
    public static LocationRequest m8995K2() {
        WorkSource workSource = r1;
        WorkSource workSource2 = new WorkSource();
        return new LocationRequest(102, 3600000, 600000, 0, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000, 0, 0, (String) null, false, workSource, (zw5) null);
    }

    /* renamed from: q3 */
    public static String m8996q3(long j) {
        return j == Long.MAX_VALUE ? "∞" : hz5.m17064a(j);
    }

    @Deprecated
    @Pure
    /* renamed from: D1 */
    public long mo10511D1() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f7495e;
        long j2 = elapsedRealtime + j;
        if (((elapsedRealtime ^ j2) & (j ^ j2)) < 0) {
            return Long.MAX_VALUE;
        }
        return j2;
    }

    @Pure
    /* renamed from: L2 */
    public long mo10512L2() {
        return this.f7495e;
    }

    @Deprecated
    @Pure
    /* renamed from: M2 */
    public long mo10513M2() {
        return mo10522V2();
    }

    @Pure
    /* renamed from: N2 */
    public int mo10514N2() {
        return this.f7499p;
    }

    @Deprecated
    @Pure
    /* renamed from: O2 */
    public long mo10515O2() {
        return mo10516P2();
    }

    @Pure
    /* renamed from: P2 */
    public long mo10516P2() {
        return this.f7489b;
    }

    @Pure
    /* renamed from: Q2 */
    public long mo10517Q2() {
        return this.f7496f;
    }

    @Pure
    /* renamed from: R2 */
    public long mo10518R2() {
        return this.f7494d;
    }

    @Pure
    /* renamed from: S2 */
    public int mo10519S2() {
        return this.f7498o;
    }

    @Deprecated
    @Pure
    /* renamed from: T2 */
    public long mo10520T2() {
        return Math.max(this.f7494d, this.f7489b);
    }

    @Pure
    /* renamed from: U2 */
    public float mo10521U2() {
        return this.f7486a;
    }

    @Pure
    /* renamed from: V2 */
    public long mo10522V2() {
        return this.f7492c;
    }

    @Deprecated
    @Pure
    /* renamed from: W2 */
    public int mo10523W2() {
        return mo10519S2();
    }

    @Pure
    /* renamed from: X2 */
    public int mo10524X2() {
        return this.f7497n;
    }

    @Deprecated
    @Pure
    /* renamed from: Y2 */
    public float mo10525Y2() {
        return mo10521U2();
    }

    @Pure
    /* renamed from: Z2 */
    public boolean mo10526Z2() {
        long j = this.f7494d;
        return j > 0 && (j >> 1) >= this.f7489b;
    }

    @Deprecated
    @Pure
    /* renamed from: a3 */
    public boolean mo10527a3() {
        return true;
    }

    @Pure
    /* renamed from: b3 */
    public boolean mo10528b3() {
        return this.f7497n == 105;
    }

    /* renamed from: c3 */
    public boolean mo10529c3() {
        return this.f7491b;
    }

    @mr2
    @Deprecated
    /* renamed from: d3 */
    public LocationRequest mo10530d3(long j) {
        Preconditions.checkArgument(j > 0, "durationMillis must be greater than 0");
        this.f7495e = j;
        return this;
    }

    @mr2
    @Deprecated
    /* renamed from: e3 */
    public LocationRequest mo10531e3(long j) {
        this.f7495e = Math.max(1, j - SystemClock.elapsedRealtime());
        return this;
    }

    public boolean equals(@ts2 Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            return this.f7497n == locationRequest.f7497n && (mo10528b3() || this.f7489b == locationRequest.f7489b) && this.f7492c == locationRequest.f7492c && mo10526Z2() == locationRequest.mo10526Z2() && ((!mo10526Z2() || this.f7494d == locationRequest.f7494d) && this.f7495e == locationRequest.f7495e && this.f7498o == locationRequest.f7498o && this.f7486a == locationRequest.f7486a && this.f7491b == locationRequest.f7491b && this.f7499p == locationRequest.f7499p && this.f7500q == locationRequest.f7500q && this.f7493c == locationRequest.f7493c && this.f7487a.equals(locationRequest.f7487a) && Objects.equal(this.f7490b, locationRequest.f7490b) && Objects.equal(this.f7488a, locationRequest.f7488a));
        }
    }

    @mr2
    @Deprecated
    /* renamed from: f3 */
    public LocationRequest mo10533f3(long j) {
        Preconditions.checkArgument(j >= 0, "illegal fastest interval: %d", Long.valueOf(j));
        this.f7492c = j;
        return this;
    }

    @mr2
    @Deprecated
    /* renamed from: g3 */
    public LocationRequest mo10534g3(long j) {
        Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
        long j2 = this.f7492c;
        long j3 = this.f7489b;
        if (j2 == j3 / 6) {
            this.f7492c = j / 6;
        }
        if (this.f7496f == j3) {
            this.f7496f = j;
        }
        this.f7489b = j;
        return this;
    }

    @mr2
    @Deprecated
    /* renamed from: h3 */
    public LocationRequest mo10535h3(long j) {
        Preconditions.checkArgument(j >= 0, "illegal max wait time: %d", Long.valueOf(j));
        this.f7494d = j;
        return this;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f7497n), Long.valueOf(this.f7489b), Long.valueOf(this.f7492c), this.f7487a);
    }

    @mr2
    @Deprecated
    /* renamed from: i3 */
    public LocationRequest mo10537i3(int i) {
        if (i > 0) {
            this.f7498o = i;
            return this;
        }
        throw new IllegalArgumentException("invalid numUpdates: " + i);
    }

    @mr2
    @Deprecated
    /* renamed from: j3 */
    public LocationRequest mo10538j3(int i) {
        md5.m21499a(i);
        this.f7497n = i;
        return this;
    }

    @mr2
    @Deprecated
    /* renamed from: k3 */
    public LocationRequest mo10539k3(float f) {
        if (f >= 0.0f) {
            this.f7486a = f;
            return this;
        }
        throw new IllegalArgumentException("invalid displacement: " + f);
    }

    @mr2
    @Deprecated
    /* renamed from: l3 */
    public LocationRequest mo10540l3(boolean z) {
        this.f7491b = z;
        return this;
    }

    @mr2
    @Pure
    /* renamed from: m3 */
    public final WorkSource mo10541m3() {
        return this.f7487a;
    }

    @ts2
    @Pure
    /* renamed from: n3 */
    public final zw5 mo10542n3() {
        return this.f7488a;
    }

    @ts2
    @Deprecated
    @Pure
    /* renamed from: o3 */
    public final String mo10543o3() {
        return this.f7490b;
    }

    @Pure
    /* renamed from: p3 */
    public final boolean mo10544p3() {
        return this.f7493c;
    }

    @mr2
    public String toString() {
        long j;
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (!mo10528b3()) {
            sb.append("@");
            if (mo10526Z2()) {
                hz5.m17065b(this.f7489b, sb);
                sb.append("/");
                j = this.f7494d;
            } else {
                j = this.f7489b;
            }
            hz5.m17065b(j, sb);
            sb.append(" ");
        }
        sb.append(md5.m21500b(this.f7497n));
        if (mo10528b3() || this.f7492c != this.f7489b) {
            sb.append(", minUpdateInterval=");
            sb.append(m8996q3(this.f7492c));
        }
        if (((double) this.f7486a) > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.f7486a);
        }
        boolean b3 = mo10528b3();
        long j2 = this.f7496f;
        if (!b3 ? j2 != this.f7489b : j2 != Long.MAX_VALUE) {
            sb.append(", maxUpdateAge=");
            sb.append(m8996q3(this.f7496f));
        }
        if (this.f7495e != Long.MAX_VALUE) {
            sb.append(", duration=");
            hz5.m17065b(this.f7495e, sb);
        }
        if (this.f7498o != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f7498o);
        }
        if (this.f7500q != 0) {
            sb.append(", ");
            sb.append(ff5.m14891a(this.f7500q));
        }
        if (this.f7499p != 0) {
            sb.append(", ");
            sb.append(gv6.m16300b(this.f7499p));
        }
        if (this.f7491b) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.f7493c) {
            sb.append(", bypass");
        }
        if (this.f7490b != null) {
            sb.append(", moduleId=");
            sb.append(this.f7490b);
        }
        if (!WorkSourceUtil.isEmpty(this.f7487a)) {
            sb.append(", ");
            sb.append(this.f7487a);
        }
        if (this.f7488a != null) {
            sb.append(", impersonation=");
            sb.append(this.f7488a);
        }
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, mo10524X2());
        SafeParcelWriter.writeLong(parcel, 2, mo10516P2());
        SafeParcelWriter.writeLong(parcel, 3, mo10522V2());
        SafeParcelWriter.writeInt(parcel, 6, mo10519S2());
        SafeParcelWriter.writeFloat(parcel, 7, mo10521U2());
        SafeParcelWriter.writeLong(parcel, 8, mo10518R2());
        SafeParcelWriter.writeBoolean(parcel, 9, mo10529c3());
        SafeParcelWriter.writeLong(parcel, 10, mo10512L2());
        SafeParcelWriter.writeLong(parcel, 11, mo10517Q2());
        SafeParcelWriter.writeInt(parcel, 12, mo10514N2());
        SafeParcelWriter.writeInt(parcel, 13, this.f7500q);
        SafeParcelWriter.writeString(parcel, 14, this.f7490b, false);
        SafeParcelWriter.writeBoolean(parcel, 15, this.f7493c);
        SafeParcelWriter.writeParcelable(parcel, 16, this.f7487a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.f7488a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Pure
    public final int zza() {
        return this.f7500q;
    }
}
