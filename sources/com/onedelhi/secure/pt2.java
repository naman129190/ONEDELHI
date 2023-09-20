package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.C0510b;
import androidx.databinding.C0519f;
import java.io.Serializable;

public class pt2 extends C0510b implements Parcelable, Serializable {
    public static final Parcelable.Creator<pt2> CREATOR = new C3189a();

    /* renamed from: b */
    public static final long f18703b = 1;

    /* renamed from: b */
    public boolean f18704b;

    /* renamed from: com.onedelhi.secure.pt2$a */
    public static class C3189a implements Parcelable.Creator<pt2> {
        /* renamed from: a */
        public pt2 createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new pt2(z);
        }

        /* renamed from: b */
        public pt2[] newArray(int i) {
            return new pt2[i];
        }
    }

    public pt2() {
    }

    public pt2(boolean z) {
        this.f18704b = z;
    }

    public pt2(C0519f... fVarArr) {
        super(fVarArr);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public boolean mo22637f() {
        return this.f18704b;
    }

    /* renamed from: h */
    public void mo22638h(boolean z) {
        if (z != this.f18704b) {
            this.f18704b = z;
            mo3972d();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18704b ? 1 : 0);
    }
}
