package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;

public enum w73 implements Parcelable {
    PUBLIC_KEY("public-key");
    
    @mr2
    public static final Parcelable.Creator<w73> CREATOR = null;
    @mr2

    /* renamed from: b */
    public final String f22062b;

    /* renamed from: com.onedelhi.secure.w73$a */
    public static class C3835a extends Exception {
        public C3835a(@mr2 String str) {
            super(str);
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new ci5();
    }

    /* access modifiers changed from: public */
    w73(String str) {
        this.f22062b = "public-key";
    }

    @mr2
    /* renamed from: a */
    public static w73 m30706a(@mr2 String str) throws C3835a {
        for (w73 w73 : values()) {
            if (str.equals(w73.f22062b)) {
                return w73;
            }
        }
        throw new C3835a(String.format("PublicKeyCredentialType %s not supported", new Object[]{str}));
    }

    public int describeContents() {
        return 0;
    }

    @mr2
    public String toString() {
        return this.f22062b;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeString(this.f22062b);
    }
}
