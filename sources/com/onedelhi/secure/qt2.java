package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.C0510b;
import androidx.databinding.C0519f;
import java.io.Serializable;

public class qt2 extends C0510b implements Parcelable, Serializable {
    public static final Parcelable.Creator<qt2> CREATOR = new C3344a();

    /* renamed from: b */
    public static final long f19457b = 1;

    /* renamed from: a */
    public byte f19458a;

    /* renamed from: com.onedelhi.secure.qt2$a */
    public static class C3344a implements Parcelable.Creator<qt2> {
        /* renamed from: a */
        public qt2 createFromParcel(Parcel parcel) {
            return new qt2(parcel.readByte());
        }

        /* renamed from: b */
        public qt2[] newArray(int i) {
            return new qt2[i];
        }
    }

    public qt2() {
    }

    public qt2(byte b) {
        this.f19458a = b;
    }

    public qt2(C0519f... fVarArr) {
        super(fVarArr);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public byte mo23431f() {
        return this.f19458a;
    }

    /* renamed from: h */
    public void mo23432h(byte b) {
        if (b != this.f19458a) {
            this.f19458a = b;
            mo3972d();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f19458a);
    }
}
