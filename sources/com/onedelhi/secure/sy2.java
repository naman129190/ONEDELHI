package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class sy2 extends SparseIntArray implements Parcelable {
    public static final Parcelable.Creator<sy2> CREATOR = new C6800a();

    /* renamed from: com.onedelhi.secure.sy2$a */
    public class C6800a implements Parcelable.Creator<sy2> {
        @mr2
        /* renamed from: a */
        public sy2 createFromParcel(@mr2 Parcel parcel) {
            int readInt = parcel.readInt();
            sy2 sy2 = new sy2(readInt);
            int[] iArr = new int[readInt];
            int[] iArr2 = new int[readInt];
            parcel.readIntArray(iArr);
            parcel.readIntArray(iArr2);
            for (int i = 0; i < readInt; i++) {
                sy2.put(iArr[i], iArr2[i]);
            }
            return sy2;
        }

        @mr2
        /* renamed from: b */
        public sy2[] newArray(int i) {
            return new sy2[i];
        }
    }

    public sy2() {
    }

    public sy2(int i) {
        super(i);
    }

    public sy2(@mr2 SparseIntArray sparseIntArray) {
        for (int i = 0; i < sparseIntArray.size(); i++) {
            put(sparseIntArray.keyAt(i), sparseIntArray.valueAt(i));
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int[] iArr = new int[size()];
        int[] iArr2 = new int[size()];
        for (int i2 = 0; i2 < size(); i2++) {
            iArr[i2] = keyAt(i2);
            iArr2[i2] = valueAt(i2);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeIntArray(iArr2);
    }
}
