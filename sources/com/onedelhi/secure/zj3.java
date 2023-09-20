package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;

public enum zj3 implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");
    
    @mr2
    public static final Parcelable.Creator<zj3> CREATOR = null;
    @mr2

    /* renamed from: b */
    public final String f23740b;

    /* renamed from: com.onedelhi.secure.zj3$a */
    public static class C4100a extends Exception {
        public C4100a(@mr2 String str) {
            super(String.format("Resident key requirement %s not supported", new Object[]{str}));
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new si5();
    }

    /* access modifiers changed from: public */
    zj3(String str) {
        this.f23740b = str;
    }

    @mr2
    /* renamed from: a */
    public static zj3 m33180a(@mr2 String str) throws C4100a {
        for (zj3 zj3 : values()) {
            if (str.equals(zj3.f23740b)) {
                return zj3;
            }
        }
        throw new C4100a(str);
    }

    public int describeContents() {
        return 0;
    }

    @mr2
    public String toString() {
        return this.f23740b;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeString(this.f23740b);
    }
}
