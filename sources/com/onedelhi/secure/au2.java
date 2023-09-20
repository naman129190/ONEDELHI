package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.C0510b;
import androidx.databinding.C0519f;
import java.io.Serializable;

public class au2 extends C0510b implements Parcelable, Serializable {
    public static final Parcelable.Creator<au2> CREATOR = new C1735a();

    /* renamed from: b */
    public static final long f9534b = 1;

    /* renamed from: a */
    public short f9535a;

    /* renamed from: com.onedelhi.secure.au2$a */
    public static class C1735a implements Parcelable.Creator<au2> {
        /* renamed from: a */
        public au2 createFromParcel(Parcel parcel) {
            return new au2((short) parcel.readInt());
        }

        /* renamed from: b */
        public au2[] newArray(int i) {
            return new au2[i];
        }
    }

    public au2() {
    }

    public au2(short s) {
        this.f9535a = s;
    }

    public au2(C0519f... fVarArr) {
        super(fVarArr);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public short mo13275f() {
        return this.f9535a;
    }

    /* renamed from: h */
    public void mo13276h(short s) {
        if (s != this.f9535a) {
            this.f9535a = s;
            mo3972d();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9535a);
    }
}
