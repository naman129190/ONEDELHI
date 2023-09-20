package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.C1563a;
import com.onedelhi.secure.fq4;
import com.onedelhi.secure.mr2;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.e */
public class C1575e implements C1563a.C1566c {
    public static final Parcelable.Creator<C1575e> CREATOR = new C1576a();

    /* renamed from: b */
    public final long f8236b;

    /* renamed from: com.google.android.material.datepicker.e$a */
    public class C1576a implements Parcelable.Creator<C1575e> {
        @mr2
        /* renamed from: a */
        public C1575e createFromParcel(@mr2 Parcel parcel) {
            return new C1575e(parcel.readLong(), (C1576a) null);
        }

        @mr2
        /* renamed from: b */
        public C1575e[] newArray(int i) {
            return new C1575e[i];
        }
    }

    public C1575e(long j) {
        this.f8236b = j;
    }

    public /* synthetic */ C1575e(long j, C1576a aVar) {
        this(j);
    }

    @mr2
    /* renamed from: a */
    public static C1575e m10135a(long j) {
        return new C1575e(j);
    }

    @mr2
    /* renamed from: b */
    public static C1575e m10136b() {
        return m10135a(fq4.m15211t().getTimeInMillis());
    }

    /* renamed from: Z */
    public boolean mo12013Z(long j) {
        return j >= this.f8236b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1575e) && this.f8236b == ((C1575e) obj).f8236b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f8236b)});
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeLong(this.f8236b);
    }
}
