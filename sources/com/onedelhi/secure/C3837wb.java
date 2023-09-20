package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.onedelhi.secure.wb */
public enum C3837wb implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");
    
    @mr2
    public static final Parcelable.Creator<C3837wb> CREATOR = null;
    @mr2

    /* renamed from: b */
    public final String f22084b;

    /* renamed from: com.onedelhi.secure.wb$a */
    public static class C3838a extends Exception {
        public C3838a(@mr2 String str) {
            super(String.format("Attachment %s not supported", new Object[]{str}));
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new q95();
    }

    /* access modifiers changed from: public */
    C3837wb(String str) {
        this.f22084b = str;
    }

    @mr2
    /* renamed from: a */
    public static C3837wb m30783a(@mr2 String str) throws C3838a {
        for (C3837wb wbVar : values()) {
            if (str.equals(wbVar.f22084b)) {
                return wbVar;
            }
        }
        throw new C3838a(str);
    }

    public int describeContents() {
        return 0;
    }

    @mr2
    public String toString() {
        return this.f22084b;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeString(this.f22084b);
    }
}
