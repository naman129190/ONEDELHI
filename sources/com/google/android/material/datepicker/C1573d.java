package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.C1563a;
import com.onedelhi.secure.fq4;
import com.onedelhi.secure.mr2;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.d */
public class C1573d implements C1563a.C1566c {
    public static final Parcelable.Creator<C1573d> CREATOR = new C1574a();

    /* renamed from: b */
    public final long f8235b;

    /* renamed from: com.google.android.material.datepicker.d$a */
    public class C1574a implements Parcelable.Creator<C1573d> {
        @mr2
        /* renamed from: a */
        public C1573d createFromParcel(@mr2 Parcel parcel) {
            return new C1573d(parcel.readLong(), (C1574a) null);
        }

        @mr2
        /* renamed from: b */
        public C1573d[] newArray(int i) {
            return new C1573d[i];
        }
    }

    public C1573d(long j) {
        this.f8235b = j;
    }

    public /* synthetic */ C1573d(long j, C1574a aVar) {
        this(j);
    }

    @mr2
    /* renamed from: a */
    public static C1573d m10130a(long j) {
        return new C1573d(j);
    }

    @mr2
    /* renamed from: b */
    public static C1573d m10131b() {
        return m10130a(fq4.m15211t().getTimeInMillis());
    }

    /* renamed from: Z */
    public boolean mo12013Z(long j) {
        return j <= this.f8235b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1573d) && this.f8235b == ((C1573d) obj).f8235b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f8235b)});
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeLong(this.f8235b);
    }
}
