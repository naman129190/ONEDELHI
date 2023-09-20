package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.onedelhi.secure.mr2;
import java.io.UnsupportedEncodingException;

@Deprecated
/* renamed from: com.google.android.gms.fido.u2f.api.common.b */
public enum C1432b implements Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");
    
    @mr2
    public static final Parcelable.Creator<C1432b> CREATOR = null;

    /* renamed from: b */
    public final String f7464b;

    /* renamed from: com.google.android.gms.fido.u2f.api.common.b$a */
    public static class C1433a extends Exception {
        public C1433a(@mr2 String str) {
            super(String.format("Protocol version %s not supported", new Object[]{str}));
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new C1435d();
    }

    /* access modifiers changed from: public */
    C1432b(String str) {
        this.f7464b = str;
    }

    @mr2
    /* renamed from: a */
    public static C1432b m8975a(@mr2 byte[] bArr) throws C1433a {
        try {
            return m8976b(new String(bArr, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @mr2
    /* renamed from: b */
    public static C1432b m8976b(@mr2 String str) throws C1433a {
        if (str == null) {
            return UNKNOWN;
        }
        for (C1432b bVar : values()) {
            if (str.equals(bVar.f7464b)) {
                return bVar;
            }
        }
        throw new C1433a(str);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean mo10482e(@mr2 C1432b bVar) {
        C1432b bVar2 = UNKNOWN;
        if (equals(bVar2) || bVar.equals(bVar2)) {
            return true;
        }
        return equals(bVar);
    }

    @mr2
    public String toString() {
        return this.f7464b;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeString(this.f7464b);
    }
}
