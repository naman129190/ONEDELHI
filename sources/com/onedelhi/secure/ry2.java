package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class ry2 extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator<ry2> CREATOR = new C6722a();

    /* renamed from: com.onedelhi.secure.ry2$a */
    public class C6722a implements Parcelable.Creator<ry2> {
        @mr2
        /* renamed from: a */
        public ry2 createFromParcel(@mr2 Parcel parcel) {
            int readInt = parcel.readInt();
            ry2 ry2 = new ry2(readInt);
            int[] iArr = new int[readInt];
            boolean[] zArr = new boolean[readInt];
            parcel.readIntArray(iArr);
            parcel.readBooleanArray(zArr);
            for (int i = 0; i < readInt; i++) {
                ry2.put(iArr[i], zArr[i]);
            }
            return ry2;
        }

        @mr2
        /* renamed from: b */
        public ry2[] newArray(int i) {
            return new ry2[i];
        }
    }

    public ry2() {
    }

    public ry2(int i) {
        super(i);
    }

    public ry2(@mr2 SparseBooleanArray sparseBooleanArray) {
        super(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            put(sparseBooleanArray.keyAt(i), sparseBooleanArray.valueAt(i));
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int[] iArr = new int[size()];
        boolean[] zArr = new boolean[size()];
        for (int i2 = 0; i2 < size(); i2++) {
            iArr[i2] = keyAt(i2);
            zArr[i2] = valueAt(i2);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeBooleanArray(zArr);
    }
}
