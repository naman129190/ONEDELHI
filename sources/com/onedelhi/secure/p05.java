package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;

public class p05 extends z25 {
    public static final Parcelable.Creator<p05> CREATOR = new C6356a();

    /* renamed from: a */
    public double f33434a;

    /* renamed from: b */
    public double f33435b;

    /* renamed from: com.onedelhi.secure.p05$a */
    public class C6356a implements Parcelable.Creator<p05> {
        public Object createFromParcel(Parcel parcel) {
            return new p05(parcel);
        }

        public Object[] newArray(int i) {
            return new p05[i];
        }
    }

    public p05() {
    }

    public p05(Parcel parcel) {
        super(parcel);
        this.f33434a = parcel.readDouble();
        this.f33435b = parcel.readDouble();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeDouble(this.f33434a);
        parcel.writeDouble(this.f33435b);
    }
}
