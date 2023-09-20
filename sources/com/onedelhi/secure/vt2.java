package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.C0510b;
import androidx.databinding.C0519f;
import java.io.Serializable;

public class vt2 extends C0510b implements Parcelable, Serializable {
    public static final Parcelable.Creator<vt2> CREATOR = new C3809a();

    /* renamed from: b */
    public static final long f21947b = 1;

    /* renamed from: n */
    public int f21948n;

    /* renamed from: com.onedelhi.secure.vt2$a */
    public static class C3809a implements Parcelable.Creator<vt2> {
        /* renamed from: a */
        public vt2 createFromParcel(Parcel parcel) {
            return new vt2(parcel.readInt());
        }

        /* renamed from: b */
        public vt2[] newArray(int i) {
            return new vt2[i];
        }
    }

    public vt2() {
    }

    public vt2(int i) {
        this.f21948n = i;
    }

    public vt2(C0519f... fVarArr) {
        super(fVarArr);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public int mo26322f() {
        return this.f21948n;
    }

    /* renamed from: h */
    public void mo26323h(int i) {
        if (i != this.f21948n) {
            this.f21948n = i;
            mo3972d();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f21948n);
    }
}
