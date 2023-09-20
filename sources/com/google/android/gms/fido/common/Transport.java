package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.onedelhi.secure.mr2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable");
    
    @mr2
    public static final Parcelable.Creator<Transport> CREATOR = null;

    /* renamed from: b */
    public final String f7409b;

    /* renamed from: com.google.android.gms.fido.common.Transport$a */
    public static class C1427a extends Exception {
        public C1427a(@mr2 String str) {
            super(str);
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new C1428a();
    }

    /* access modifiers changed from: public */
    Transport(String str) {
        this.f7409b = str;
    }

    @mr2
    /* renamed from: a */
    public static Transport m8915a(@mr2 String str) throws C1427a {
        for (Transport transport : values()) {
            if (str.equals(transport.f7409b)) {
                return transport;
            }
        }
        if (str.equals("hybrid")) {
            return HYBRID;
        }
        throw new C1427a(String.format("Transport %s not supported", new Object[]{str}));
    }

    @mr2
    /* renamed from: b */
    public static List<Transport> m8916b(@mr2 JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        HashSet hashSet = new HashSet(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            if (string != null && !string.isEmpty()) {
                try {
                    hashSet.add(m8915a(string));
                } catch (C1427a unused) {
                    Log.w("Transport", "Ignoring unrecognized transport ".concat(string));
                }
            }
        }
        return new ArrayList(hashSet);
    }

    public int describeContents() {
        return 0;
    }

    @mr2
    public String toString() {
        return this.f7409b;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeString(this.f7409b);
    }
}
