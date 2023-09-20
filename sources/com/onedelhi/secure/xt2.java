package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.C0510b;
import androidx.databinding.C0519f;
import java.io.Serializable;

public class xt2 extends C0510b implements Parcelable, Serializable {
    public static final Parcelable.Creator<xt2> CREATOR = new C3951a();

    /* renamed from: c */
    public static final long f22770c = 1;

    /* renamed from: b */
    public long f22771b;

    /* renamed from: com.onedelhi.secure.xt2$a */
    public static class C3951a implements Parcelable.Creator<xt2> {
        /* renamed from: a */
        public xt2 createFromParcel(Parcel parcel) {
            return new xt2(parcel.readLong());
        }

        /* renamed from: b */
        public xt2[] newArray(int i) {
            return new xt2[i];
        }
    }

    public xt2() {
    }

    public xt2(long j) {
        this.f22771b = j;
    }

    public xt2(C0519f... fVarArr) {
        super(fVarArr);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public long mo27093f() {
        return this.f22771b;
    }

    /* renamed from: h */
    public void mo27094h(long j) {
        if (j != this.f22771b) {
            this.f22771b = j;
            mo3972d();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f22771b);
    }
}
