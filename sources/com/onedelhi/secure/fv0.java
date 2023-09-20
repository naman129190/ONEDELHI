package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

public enum fv0 implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);
    
    @mr2
    public static final Parcelable.Creator<fv0> CREATOR = null;

    /* renamed from: n */
    public final int f12350n;

    /* renamed from: com.onedelhi.secure.fv0$a */
    public static class C2204a extends Exception {
        public C2204a(int i) {
            super(String.format(Locale.US, "Error code %d is not supported", new Object[]{Integer.valueOf(i)}));
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new k47();
    }

    /* access modifiers changed from: public */
    fv0(int i) {
        this.f12350n = i;
    }

    @mr2
    /* renamed from: b */
    public static fv0 m15331b(int i) throws C2204a {
        for (fv0 fv0 : values()) {
            if (i == fv0.f12350n) {
                return fv0;
            }
        }
        throw new C2204a(i);
    }

    /* renamed from: a */
    public int mo16186a() {
        return this.f12350n;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeInt(this.f12350n);
    }
}
