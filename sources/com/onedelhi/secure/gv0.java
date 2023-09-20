package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public enum gv0 implements Parcelable {
    OK(0),
    OTHER_ERROR(1),
    BAD_REQUEST(2),
    CONFIGURATION_UNSUPPORTED(3),
    DEVICE_INELIGIBLE(4),
    TIMEOUT(5);
    
    @mr2
    public static final Parcelable.Creator<gv0> CREATOR = null;

    /* renamed from: b */
    public static final String f12759b = null;

    /* renamed from: n */
    public final int f12764n;

    /* access modifiers changed from: public */
    static {
        f12759b = gv0.class.getSimpleName();
        CREATOR = new ps5();
    }

    /* access modifiers changed from: public */
    gv0(int i) {
        this.f12764n = i;
    }

    @mr2
    /* renamed from: b */
    public static gv0 m16268b(int i) {
        for (gv0 gv0 : values()) {
            if (i == gv0.f12764n) {
                return gv0;
            }
        }
        return OTHER_ERROR;
    }

    /* renamed from: a */
    public int mo16921a() {
        return this.f12764n;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeInt(this.f12764n);
    }
}
