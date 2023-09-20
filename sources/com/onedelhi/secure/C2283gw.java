package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "ChannelIdValueCreator")
@SafeParcelable.Reserved({1})
@Deprecated
/* renamed from: com.onedelhi.secure.gw */
public class C2283gw extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C2283gw> CREATOR = new xk5();
    @mr2

    /* renamed from: a */
    public static final C2283gw f12782a = new C2283gw();
    @mr2

    /* renamed from: b */
    public static final C2283gw f12783b = new C2283gw("unavailable");
    @mr2

    /* renamed from: c */
    public static final C2283gw f12784c = new C2283gw("unused");
    @SafeParcelable.Field(getter = "getTypeAsInt", mo10053id = 2, type = "int")

    /* renamed from: a */
    public final C2284a f12785a;
    @SafeParcelable.Field(getter = "getStringValue", mo10053id = 3)

    /* renamed from: b */
    public final String f12786b;
    @SafeParcelable.Field(getter = "getObjectValueAsString", mo10053id = 4)

    /* renamed from: c */
    public final String f12787c;

    /* renamed from: com.onedelhi.secure.gw$a */
    public enum C2284a implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);
        
        @mr2
        public static final Parcelable.Creator<C2284a> CREATOR = null;

        /* renamed from: n */
        public final int f12792n;

        /* access modifiers changed from: public */
        static {
            CREATOR = new s95();
        }

        /* access modifiers changed from: public */
        C2284a(int i) {
            this.f12792n = i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@mr2 Parcel parcel, int i) {
            parcel.writeInt(this.f12792n);
        }
    }

    /* renamed from: com.onedelhi.secure.gw$b */
    public static class C2285b extends Exception {
        public C2285b(int i) {
            super(String.format("ChannelIdValueType %s not supported", new Object[]{Integer.valueOf(i)}));
        }
    }

    public C2283gw() {
        this.f12785a = C2284a.ABSENT;
        this.f12787c = null;
        this.f12786b = null;
    }

    @SafeParcelable.Constructor
    public C2283gw(@SafeParcelable.Param(mo10056id = 2) int i, @SafeParcelable.Param(mo10056id = 3) String str, @SafeParcelable.Param(mo10056id = 4) String str2) {
        try {
            this.f12785a = m16301P2(i);
            this.f12786b = str;
            this.f12787c = str2;
        } catch (C2285b e) {
            throw new IllegalArgumentException(e);
        }
    }

    public C2283gw(String str) {
        this.f12786b = (String) Preconditions.checkNotNull(str);
        this.f12785a = C2284a.STRING;
        this.f12787c = null;
    }

    public C2283gw(@mr2 JSONObject jSONObject) {
        this.f12787c = (String) Preconditions.checkNotNull(jSONObject.toString());
        this.f12785a = C2284a.OBJECT;
        this.f12786b = null;
    }

    @mr2
    /* renamed from: P2 */
    public static C2284a m16301P2(int i) throws C2285b {
        for (C2284a aVar : C2284a.values()) {
            if (i == aVar.f12792n) {
                return aVar;
            }
        }
        throw new C2285b(i);
    }

    @mr2
    /* renamed from: K2 */
    public JSONObject mo16947K2() {
        if (this.f12787c == null) {
            return null;
        }
        try {
            return new JSONObject(this.f12787c);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @mr2
    /* renamed from: L2 */
    public String mo16948L2() {
        return this.f12787c;
    }

    @mr2
    /* renamed from: M2 */
    public String mo16949M2() {
        return this.f12786b;
    }

    @mr2
    /* renamed from: N2 */
    public C2284a mo16950N2() {
        return this.f12785a;
    }

    /* renamed from: O2 */
    public int mo16951O2() {
        return this.f12785a.f12792n;
    }

    public boolean equals(@mr2 Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2283gw)) {
            return false;
        }
        C2283gw gwVar = (C2283gw) obj;
        if (!this.f12785a.equals(gwVar.f12785a)) {
            return false;
        }
        int ordinal = this.f12785a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            str = this.f12786b;
            str2 = gwVar.f12786b;
        } else if (ordinal != 2) {
            return false;
        } else {
            str = this.f12787c;
            str2 = gwVar.f12787c;
        }
        return str.equals(str2);
    }

    public int hashCode() {
        int i;
        String str;
        int hashCode = this.f12785a.hashCode() + 31;
        int ordinal = this.f12785a.ordinal();
        if (ordinal == 1) {
            i = hashCode * 31;
            str = this.f12786b;
        } else if (ordinal != 2) {
            return hashCode;
        } else {
            i = hashCode * 31;
            str = this.f12787c;
        }
        return i + str.hashCode();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, mo16951O2());
        SafeParcelWriter.writeString(parcel, 3, mo16949M2(), false);
        SafeParcelWriter.writeString(parcel, 4, mo16948L2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
