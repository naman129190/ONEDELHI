package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetPhoneNumberHintIntentRequestCreator")
public class eg1 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<eg1> CREATOR = new h75();
    @SafeParcelable.Field(getter = "getTheme", mo10053id = 1)

    /* renamed from: n */
    public final int f11216n;

    /* renamed from: com.onedelhi.secure.eg1$a */
    public static final class C2058a {
        public C2058a() {
        }

        public /* synthetic */ C2058a(d75 d75) {
        }

        @mr2
        /* renamed from: a */
        public eg1 mo15173a() {
            return new eg1(0);
        }
    }

    @SafeParcelable.Constructor
    public eg1(@SafeParcelable.Param(mo10056id = 1) int i) {
        this.f11216n = i;
    }

    @mr2
    /* renamed from: K2 */
    public static C2058a m13746K2() {
        return new C2058a((d75) null);
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof eg1)) {
            return false;
        }
        return Objects.equal(Integer.valueOf(this.f11216n), Integer.valueOf(((eg1) obj).f11216n));
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f11216n));
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f11216n);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
