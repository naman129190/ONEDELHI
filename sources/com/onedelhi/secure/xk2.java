package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class xk2 implements Comparable<xk2>, Parcelable {
    public static final Parcelable.Creator<xk2> CREATOR = new C3929a();
    @mr2

    /* renamed from: a */
    public final Calendar f22612a;

    /* renamed from: b */
    public final long f22613b;
    @ts2

    /* renamed from: b */
    public String f22614b;

    /* renamed from: n */
    public final int f22615n;

    /* renamed from: o */
    public final int f22616o;

    /* renamed from: p */
    public final int f22617p;

    /* renamed from: q */
    public final int f22618q;

    /* renamed from: com.onedelhi.secure.xk2$a */
    public class C3929a implements Parcelable.Creator<xk2> {
        @mr2
        /* renamed from: a */
        public xk2 createFromParcel(@mr2 Parcel parcel) {
            return xk2.m31505b(parcel.readInt(), parcel.readInt());
        }

        @mr2
        /* renamed from: b */
        public xk2[] newArray(int i) {
            return new xk2[i];
        }
    }

    public xk2(@mr2 Calendar calendar) {
        calendar.set(5, 1);
        Calendar f = fq4.m15197f(calendar);
        this.f22612a = f;
        this.f22615n = f.get(2);
        this.f22616o = f.get(1);
        this.f22617p = f.getMaximum(7);
        this.f22618q = f.getActualMaximum(5);
        this.f22613b = f.getTimeInMillis();
    }

    @mr2
    /* renamed from: b */
    public static xk2 m31505b(int i, int i2) {
        Calendar v = fq4.m15213v();
        v.set(1, i);
        v.set(2, i2);
        return new xk2(v);
    }

    @mr2
    /* renamed from: e */
    public static xk2 m31506e(long j) {
        Calendar v = fq4.m15213v();
        v.setTimeInMillis(j);
        return new xk2(v);
    }

    @mr2
    /* renamed from: q */
    public static xk2 m31507q() {
        return new xk2(fq4.m15211t());
    }

    /* renamed from: a */
    public int compareTo(@mr2 xk2 xk2) {
        return this.f22612a.compareTo(xk2.f22612a);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk2)) {
            return false;
        }
        xk2 xk2 = (xk2) obj;
        return this.f22615n == xk2.f22615n && this.f22616o == xk2.f22616o;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f22615n), Integer.valueOf(this.f22616o)});
    }

    /* renamed from: r */
    public int mo26969r(int i) {
        int i2 = this.f22612a.get(7);
        if (i <= 0) {
            i = this.f22612a.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + this.f22617p : i3;
    }

    /* renamed from: s */
    public long mo26970s(int i) {
        Calendar f = fq4.m15197f(this.f22612a);
        f.set(5, i);
        return f.getTimeInMillis();
    }

    /* renamed from: t */
    public int mo26971t(long j) {
        Calendar f = fq4.m15197f(this.f22612a);
        f.setTimeInMillis(j);
        return f.get(5);
    }

    @mr2
    /* renamed from: u */
    public String mo26972u() {
        if (this.f22614b == null) {
            this.f22614b = ne0.m22713i(this.f22612a.getTimeInMillis());
        }
        return this.f22614b;
    }

    /* renamed from: v */
    public long mo26973v() {
        return this.f22612a.getTimeInMillis();
    }

    @mr2
    /* renamed from: w */
    public xk2 mo26974w(int i) {
        Calendar f = fq4.m15197f(this.f22612a);
        f.add(2, i);
        return new xk2(f);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeInt(this.f22616o);
        parcel.writeInt(this.f22615n);
    }

    /* renamed from: x */
    public int mo26976x(@mr2 xk2 xk2) {
        if (this.f22612a instanceof GregorianCalendar) {
            return ((xk2.f22616o - this.f22616o) * 12) + (xk2.f22615n - this.f22615n);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}
