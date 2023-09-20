package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
public enum ok5 implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");
    
    public static final Parcelable.Creator<ok5> CREATOR = null;
    @mr2

    /* renamed from: b */
    public final String f18003b;

    /* access modifiers changed from: public */
    static {
        CREATOR = new yj5();
    }

    /* access modifiers changed from: public */
    ok5(@mr2 String str) {
        this.f18003b = str;
    }

    /* renamed from: a */
    public static ok5 m23862a(String str) throws gk5 {
        for (ok5 ok5 : values()) {
            if (str.equals(ok5.f18003b)) {
                return ok5;
            }
        }
        throw new gk5(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f18003b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18003b);
    }
}
