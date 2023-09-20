package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.onedelhi.secure.fq4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ot2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.xk2;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.a */
public final class C1563a implements Parcelable {
    public static final Parcelable.Creator<C1563a> CREATOR = new C1564a();
    @mr2

    /* renamed from: a */
    public final C1566c f8207a;
    @mr2

    /* renamed from: a */
    public final xk2 f8208a;
    @mr2

    /* renamed from: b */
    public final xk2 f8209b;
    @ts2

    /* renamed from: c */
    public xk2 f8210c;

    /* renamed from: n */
    public final int f8211n;

    /* renamed from: o */
    public final int f8212o;

    /* renamed from: p */
    public final int f8213p;

    /* renamed from: com.google.android.material.datepicker.a$a */
    public class C1564a implements Parcelable.Creator<C1563a> {
        @mr2
        /* renamed from: a */
        public C1563a createFromParcel(@mr2 Parcel parcel) {
            return new C1563a((xk2) parcel.readParcelable(xk2.class.getClassLoader()), (xk2) parcel.readParcelable(xk2.class.getClassLoader()), (C1566c) parcel.readParcelable(C1566c.class.getClassLoader()), (xk2) parcel.readParcelable(xk2.class.getClassLoader()), parcel.readInt(), (C1564a) null);
        }

        @mr2
        /* renamed from: b */
        public C1563a[] newArray(int i) {
            return new C1563a[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    public static final class C1565b {

        /* renamed from: a */
        public static final String f8214a = "DEEP_COPY_VALIDATOR_KEY";

        /* renamed from: c */
        public static final long f8215c = fq4.m15192a(xk2.m31505b(1900, 0).f22613b);

        /* renamed from: d */
        public static final long f8216d = fq4.m15192a(xk2.m31505b(2100, 11).f22613b);

        /* renamed from: a */
        public int f8217a;

        /* renamed from: a */
        public long f8218a = f8215c;

        /* renamed from: a */
        public C1566c f8219a = C1575e.m10135a(Long.MIN_VALUE);

        /* renamed from: a */
        public Long f8220a;

        /* renamed from: b */
        public long f8221b = f8216d;

        public C1565b() {
        }

        public C1565b(@mr2 C1563a aVar) {
            this.f8218a = aVar.f8208a.f22613b;
            this.f8221b = aVar.f8209b.f22613b;
            this.f8220a = Long.valueOf(aVar.f8210c.f22613b);
            this.f8217a = aVar.f8211n;
            this.f8219a = aVar.f8207a;
        }

        @mr2
        /* renamed from: a */
        public C1563a mo12007a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f8214a, this.f8219a);
            xk2 e = xk2.m31506e(this.f8218a);
            xk2 e2 = xk2.m31506e(this.f8221b);
            C1566c cVar = (C1566c) bundle.getParcelable(f8214a);
            Long l = this.f8220a;
            return new C1563a(e, e2, cVar, l == null ? null : xk2.m31506e(l.longValue()), this.f8217a, (C1564a) null);
        }

        @mr2
        /* renamed from: b */
        public C1565b mo12008b(long j) {
            this.f8221b = j;
            return this;
        }

        @mr2
        @hl3({hl3.C2354a.f13187b})
        /* renamed from: c */
        public C1565b mo12009c(int i) {
            this.f8217a = i;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C1565b mo12010d(long j) {
            this.f8220a = Long.valueOf(j);
            return this;
        }

        @mr2
        /* renamed from: e */
        public C1565b mo12011e(long j) {
            this.f8218a = j;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C1565b mo12012f(@mr2 C1566c cVar) {
            this.f8219a = cVar;
            return this;
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$c */
    public interface C1566c extends Parcelable {
        /* renamed from: Z */
        boolean mo12013Z(long j);
    }

    public C1563a(@mr2 xk2 xk2, @mr2 xk2 xk22, @mr2 C1566c cVar, @ts2 xk2 xk23, int i) {
        this.f8208a = xk2;
        this.f8209b = xk22;
        this.f8210c = xk23;
        this.f8211n = i;
        this.f8207a = cVar;
        if (xk23 != null && xk2.compareTo(xk23) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (xk23 != null && xk23.compareTo(xk22) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i < 0 || i > fq4.m15213v().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else {
            this.f8213p = xk2.mo26976x(xk22) + 1;
            this.f8212o = (xk22.f22616o - xk2.f22616o) + 1;
        }
    }

    public /* synthetic */ C1563a(xk2 xk2, xk2 xk22, C1566c cVar, xk2 xk23, int i, C1564a aVar) {
        this(xk2, xk22, cVar, xk23, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1563a)) {
            return false;
        }
        C1563a aVar = (C1563a) obj;
        return this.f8208a.equals(aVar.f8208a) && this.f8209b.equals(aVar.f8209b) && ot2.m24056a(this.f8210c, aVar.f8210c) && this.f8211n == aVar.f8211n && this.f8207a.equals(aVar.f8207a);
    }

    /* renamed from: f */
    public xk2 mo11991f(xk2 xk2) {
        return xk2.compareTo(this.f8208a) < 0 ? this.f8208a : xk2.compareTo(this.f8209b) > 0 ? this.f8209b : xk2;
    }

    /* renamed from: h */
    public C1566c mo11992h() {
        return this.f8207a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8208a, this.f8209b, this.f8210c, Integer.valueOf(this.f8211n), this.f8207a});
    }

    @mr2
    /* renamed from: i */
    public xk2 mo11994i() {
        return this.f8209b;
    }

    /* renamed from: j */
    public int mo11995j() {
        return this.f8211n;
    }

    /* renamed from: k */
    public int mo11996k() {
        return this.f8213p;
    }

    @ts2
    /* renamed from: m */
    public xk2 mo11997m() {
        return this.f8210c;
    }

    @mr2
    /* renamed from: n */
    public xk2 mo11998n() {
        return this.f8208a;
    }

    /* renamed from: o */
    public int mo11999o() {
        return this.f8212o;
    }

    /* renamed from: p */
    public boolean mo12000p(long j) {
        if (this.f8208a.mo26970s(1) <= j) {
            xk2 xk2 = this.f8209b;
            if (j <= xk2.mo26970s(xk2.f22618q)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public void mo12001q(@ts2 xk2 xk2) {
        this.f8210c = xk2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8208a, 0);
        parcel.writeParcelable(this.f8209b, 0);
        parcel.writeParcelable(this.f8210c, 0);
        parcel.writeParcelable(this.f8207a, 0);
        parcel.writeInt(this.f8211n);
    }
}
