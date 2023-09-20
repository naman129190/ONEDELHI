package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.onedelhi.secure.xb */
public enum C3914xb implements Parcelable {
    NONE(tk0.f20956o),
    INDIRECT(tk0.f20957p),
    DIRECT(tk0.f20958q);
    
    @mr2
    public static final Parcelable.Creator<C3914xb> CREATOR = null;
    @mr2

    /* renamed from: b */
    public final String f22511b;

    /* renamed from: com.onedelhi.secure.xb$a */
    public static class C3915a extends Exception {
        public C3915a(@mr2 String str) {
            super(String.format("Attestation conveyance preference %s not supported", new Object[]{str}));
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new bm5();
    }

    /* access modifiers changed from: public */
    C3914xb(String str) {
        this.f22511b = str;
    }

    @mr2
    /* renamed from: a */
    public static C3914xb m31388a(@mr2 String str) throws C3915a {
        for (C3914xb xbVar : values()) {
            if (str.equals(xbVar.f22511b)) {
                return xbVar;
            }
        }
        throw new C3915a(str);
    }

    public int describeContents() {
        return 0;
    }

    @mr2
    public String toString() {
        return this.f22511b;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeString(this.f22511b);
    }
}
