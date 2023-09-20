package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class yt2<T extends Parcelable> extends tt2<T> implements Parcelable, Serializable {
    public static final Parcelable.Creator<yt2> CREATOR = new C4025a();

    /* renamed from: c */
    public static final long f23335c = 1;

    /* renamed from: com.onedelhi.secure.yt2$a */
    public static class C4025a implements Parcelable.Creator<yt2> {
        /* renamed from: a */
        public yt2 createFromParcel(Parcel parcel) {
            return new yt2(parcel.readParcelable(C4025a.class.getClassLoader()));
        }

        /* renamed from: b */
        public yt2[] newArray(int i) {
            return new yt2[i];
        }
    }

    public yt2() {
    }

    public yt2(T t) {
        super(t);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) mo25309f(), 0);
    }
}
