package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.C0510b;
import androidx.databinding.C0519f;
import java.io.Serializable;

public class st2 extends C0510b implements Parcelable, Serializable {
    public static final Parcelable.Creator<st2> CREATOR = new C3542a();

    /* renamed from: b */
    public static final long f20507b = 1;

    /* renamed from: a */
    public double f20508a;

    /* renamed from: com.onedelhi.secure.st2$a */
    public static class C3542a implements Parcelable.Creator<st2> {
        /* renamed from: a */
        public st2 createFromParcel(Parcel parcel) {
            return new st2(parcel.readDouble());
        }

        /* renamed from: b */
        public st2[] newArray(int i) {
            return new st2[i];
        }
    }

    public st2() {
    }

    public st2(double d) {
        this.f20508a = d;
    }

    public st2(C0519f... fVarArr) {
        super(fVarArr);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public double mo24538f() {
        return this.f20508a;
    }

    /* renamed from: h */
    public void mo24539h(double d) {
        if (d != this.f20508a) {
            this.f20508a = d;
            mo3972d();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f20508a);
    }
}
