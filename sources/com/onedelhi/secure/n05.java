package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;

public class n05 extends z25 {
    public static final Parcelable.Creator<n05> CREATOR = new C6162a();

    /* renamed from: com.onedelhi.secure.n05$a */
    public class C6162a implements Parcelable.Creator<n05> {
        public Object createFromParcel(Parcel parcel) {
            return new n05(parcel);
        }

        public Object[] newArray(int i) {
            return new n05[i];
        }
    }

    public n05() {
    }

    public n05(Parcel parcel) {
        super(parcel);
    }

    public int describeContents() {
        return super.describeContents();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
