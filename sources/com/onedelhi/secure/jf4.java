package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "TokenBindingCreator")
@SafeParcelable.Reserved({1})
public class jf4 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<jf4> CREATOR = new ij5();
    @mr2

    /* renamed from: a */
    public static final jf4 f14118a = new jf4(C2513a.SUPPORTED.toString(), (String) null);
    @mr2

    /* renamed from: b */
    public static final jf4 f14119b = new jf4(C2513a.NOT_SUPPORTED.toString(), (String) null);
    @SafeParcelable.Field(getter = "getTokenBindingStatusAsString", mo10053id = 2, type = "java.lang.String")
    @mr2

    /* renamed from: a */
    public final C2513a f14120a;
    @SafeParcelable.Field(getter = "getTokenBindingId", mo10053id = 3)
    @ts2

    /* renamed from: b */
    public final String f14121b;

    /* renamed from: com.onedelhi.secure.jf4$a */
    public enum C2513a implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");
        
        @mr2
        public static final Parcelable.Creator<C2513a> CREATOR = null;
        @mr2

        /* renamed from: b */
        public final String f14126b;

        /* access modifiers changed from: public */
        static {
            CREATOR = new aj5();
        }

        /* access modifiers changed from: public */
        C2513a(@mr2 String str) {
            this.f14126b = str;
        }

        @mr2
        /* renamed from: a */
        public static C2513a m18536a(@mr2 String str) throws C2514b {
            for (C2513a aVar : values()) {
                if (str.equals(aVar.f14126b)) {
                    return aVar;
                }
            }
            throw new C2514b(str);
        }

        public int describeContents() {
            return 0;
        }

        @mr2
        public String toString() {
            return this.f14126b;
        }

        public void writeToParcel(@mr2 Parcel parcel, int i) {
            parcel.writeString(this.f14126b);
        }
    }

    /* renamed from: com.onedelhi.secure.jf4$b */
    public static class C2514b extends Exception {
        public C2514b(@mr2 String str) {
            super(String.format("TokenBindingStatus %s not supported", new Object[]{str}));
        }
    }

    public jf4(@mr2 String str) {
        this(C2513a.PRESENT.toString(), (String) Preconditions.checkNotNull(str));
    }

    @SafeParcelable.Constructor
    public jf4(@SafeParcelable.Param(mo10056id = 2) @mr2 String str, @SafeParcelable.Param(mo10056id = 3) @ts2 String str2) {
        Preconditions.checkNotNull(str);
        try {
            this.f14120a = C2513a.m18536a(str);
            this.f14121b = str2;
        } catch (C2514b e) {
            throw new IllegalArgumentException(e);
        }
    }

    @ts2
    /* renamed from: K2 */
    public String mo18392K2() {
        return this.f14121b;
    }

    @mr2
    /* renamed from: L2 */
    public String mo18393L2() {
        return this.f14120a.toString();
    }

    @mr2
    /* renamed from: M2 */
    public JSONObject mo18394M2() throws JSONException {
        try {
            return new JSONObject().put("status", this.f14120a).put("id", this.f14121b);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(@mr2 Object obj) {
        if (!(obj instanceof jf4)) {
            return false;
        }
        jf4 jf4 = (jf4) obj;
        return gg5.m15835a(this.f14120a, jf4.f14120a) && gg5.m15835a(this.f14121b, jf4.f14121b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14120a, this.f14121b});
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, mo18393L2(), false);
        SafeParcelWriter.writeString(parcel, 3, mo18392K2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
