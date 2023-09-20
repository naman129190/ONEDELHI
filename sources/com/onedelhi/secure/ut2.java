package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.C0510b;
import androidx.databinding.C0519f;
import java.io.Serializable;

public class ut2 extends C0510b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ut2> CREATOR = new C3744a();

    /* renamed from: b */
    public static final long f21520b = 1;

    /* renamed from: a */
    public float f21521a;

    /* renamed from: com.onedelhi.secure.ut2$a */
    public static class C3744a implements Parcelable.Creator<ut2> {
        /* renamed from: a */
        public ut2 createFromParcel(Parcel parcel) {
            return new ut2(parcel.readFloat());
        }

        /* renamed from: b */
        public ut2[] newArray(int i) {
            return new ut2[i];
        }
    }

    public ut2() {
    }

    public ut2(float f) {
        this.f21521a = f;
    }

    public ut2(C0519f... fVarArr) {
        super(fVarArr);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public float mo25726f() {
        return this.f21521a;
    }

    /* renamed from: h */
    public void mo25727h(float f) {
        if (f != this.f21521a) {
            this.f21521a = f;
            mo3972d();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f21521a);
    }
}
