package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class qy2 extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<qy2> CREATOR = new C6621a();

    /* renamed from: com.onedelhi.secure.qy2$a */
    public class C6621a implements Parcelable.ClassLoaderCreator<qy2> {
        @ts2
        /* renamed from: a */
        public qy2 createFromParcel(@mr2 Parcel parcel) {
            return new qy2(parcel, (ClassLoader) null);
        }

        @mr2
        /* renamed from: b */
        public qy2 createFromParcel(@mr2 Parcel parcel, ClassLoader classLoader) {
            return new qy2(parcel, classLoader);
        }

        @mr2
        /* renamed from: c */
        public qy2[] newArray(int i) {
            return new qy2[i];
        }
    }

    public qy2() {
    }

    public qy2(@mr2 Parcel parcel, @ts2 ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = (Parcelable) valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
