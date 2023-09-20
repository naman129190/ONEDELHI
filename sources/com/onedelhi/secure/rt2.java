package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.C0510b;
import androidx.databinding.C0519f;
import java.io.Serializable;

public class rt2 extends C0510b implements Parcelable, Serializable {
    public static final Parcelable.Creator<rt2> CREATOR = new C3451a();

    /* renamed from: b */
    public static final long f20094b = 1;

    /* renamed from: a */
    public char f20095a;

    /* renamed from: com.onedelhi.secure.rt2$a */
    public static class C3451a implements Parcelable.Creator<rt2> {
        /* renamed from: a */
        public rt2 createFromParcel(Parcel parcel) {
            return new rt2((char) parcel.readInt());
        }

        /* renamed from: b */
        public rt2[] newArray(int i) {
            return new rt2[i];
        }
    }

    public rt2() {
    }

    public rt2(char c) {
        this.f20095a = c;
    }

    public rt2(C0519f... fVarArr) {
        super(fVarArr);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public char mo24076f() {
        return this.f20095a;
    }

    /* renamed from: h */
    public void mo24077h(char c) {
        if (c != this.f20095a) {
            this.f20095a = c;
            mo3972d();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20095a);
    }
}
