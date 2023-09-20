package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;

public interface sf1 {

    /* renamed from: a */
    public static final long f20326a = -1;

    /* renamed from: j */
    public static final int f20327j = 1;

    /* renamed from: k */
    public static final int f20328k = 2;

    /* renamed from: l */
    public static final int f20329l = 4;

    /* renamed from: com.onedelhi.secure.sf1$a */
    public static final class C3512a {

        /* renamed from: a */
        public double f20330a;

        /* renamed from: a */
        public float f20331a;
        @C3514c

        /* renamed from: a */
        public int f20332a = 0;

        /* renamed from: a */
        public long f20333a = Long.MIN_VALUE;

        /* renamed from: a */
        public String f20334a = null;

        /* renamed from: a */
        public short f20335a = -1;

        /* renamed from: b */
        public double f20336b;

        /* renamed from: b */
        public int f20337b = 0;

        /* renamed from: c */
        public int f20338c = -1;

        @mr2
        /* renamed from: a */
        public sf1 mo24357a() {
            if (this.f20334a != null) {
                int i = this.f20332a;
                if (i == 0) {
                    throw new IllegalArgumentException("Transitions types not set.");
                } else if ((i & 4) != 0 && this.f20338c < 0) {
                    throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
                } else if (this.f20333a == Long.MIN_VALUE) {
                    throw new IllegalArgumentException("Expiration not set.");
                } else if (this.f20335a == -1) {
                    throw new IllegalArgumentException("Geofence region not set.");
                } else if (this.f20337b >= 0) {
                    return new zy5(this.f20334a, this.f20332a, 1, this.f20330a, this.f20336b, this.f20331a, this.f20333a, this.f20337b, this.f20338c);
                } else {
                    throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                }
            } else {
                throw new IllegalArgumentException("Request ID not set.");
            }
        }

        @mr2
        /* renamed from: b */
        public C3512a mo24358b(@d81(from = -90.0d, mo14561to = 90.0d) double d, @d81(from = -180.0d, mo14561to = 180.0d) double d2, @d81(from = 0.0d, fromInclusive = false) float f) {
            boolean z = false;
            boolean z2 = d >= -90.0d && d <= 90.0d;
            Preconditions.checkArgument(z2, "Invalid latitude: " + d);
            boolean z3 = d2 >= -180.0d && d2 <= 180.0d;
            Preconditions.checkArgument(z3, "Invalid longitude: " + d2);
            if (f > 0.0f) {
                z = true;
            }
            Preconditions.checkArgument(z, "Invalid radius: " + f);
            this.f20335a = 1;
            this.f20330a = d;
            this.f20336b = d2;
            this.f20331a = f;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C3512a mo24359c(long j) {
            if (j < 0) {
                this.f20333a = -1;
            } else {
                this.f20333a = DefaultClock.getInstance().elapsedRealtime() + j;
            }
            return this;
        }

        @mr2
        /* renamed from: d */
        public C3512a mo24360d(int i) {
            this.f20338c = i;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C3512a mo24361e(@js1(from = 0) int i) {
            this.f20337b = i;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C3512a mo24362f(@mr2 String str) {
            this.f20334a = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        @mr2
        /* renamed from: g */
        public C3512a mo24363g(@C3514c int i) {
            this.f20332a = i;
            return this;
        }
    }

    /* renamed from: com.onedelhi.secure.sf1$b */
    public @interface C3513b {
    }

    /* renamed from: com.onedelhi.secure.sf1$c */
    public @interface C3514c {
    }

    @mr2
    /* renamed from: A1 */
    String mo24349A1();

    /* renamed from: B1 */
    int mo24350B1();

    /* renamed from: C1 */
    int mo24351C1();

    /* renamed from: D1 */
    long mo24352D1();

    @C3514c
    /* renamed from: i2 */
    int mo24353i2();

    /* renamed from: o0 */
    double mo24354o0();

    /* renamed from: p0 */
    float mo24355p0();

    /* renamed from: w1 */
    double mo24356w1();
}
