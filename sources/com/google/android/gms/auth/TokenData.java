package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ms6;
import com.onedelhi.secure.ts2;
import java.util.List;

@ShowFirstParty
@SafeParcelable.Class(creator = "TokenDataCreator")
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<TokenData> CREATOR = new ms6();
    @SafeParcelable.Field(getter = "getExpirationTimeSecs", mo10053id = 3)
    @ts2

    /* renamed from: a */
    public final Long f7207a;
    @SafeParcelable.Field(getter = "getGrantedScopes", mo10053id = 6)
    @ts2

    /* renamed from: a */
    public final List f7208a;
    @SafeParcelable.Field(getter = "getToken", mo10053id = 2)

    /* renamed from: b */
    public final String f7209b;
    @SafeParcelable.Field(getter = "isCached", mo10053id = 4)

    /* renamed from: b */
    public final boolean f7210b;
    @SafeParcelable.Field(getter = "getScopeData", mo10053id = 7)
    @ts2

    /* renamed from: c */
    public final String f7211c;
    @SafeParcelable.Field(getter = "isSnowballed", mo10053id = 5)

    /* renamed from: c */
    public final boolean f7212c;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f7213n;

    @SafeParcelable.Constructor
    public TokenData(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) String str, @SafeParcelable.Param(mo10056id = 3) @ts2 Long l, @SafeParcelable.Param(mo10056id = 4) boolean z, @SafeParcelable.Param(mo10056id = 5) boolean z2, @SafeParcelable.Param(mo10056id = 6) @ts2 List list, @SafeParcelable.Param(mo10056id = 7) @ts2 String str2) {
        this.f7213n = i;
        this.f7209b = Preconditions.checkNotEmpty(str);
        this.f7207a = l;
        this.f7210b = z;
        this.f7212c = z2;
        this.f7208a = list;
        this.f7211c = str2;
    }

    public final boolean equals(@ts2 Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f7209b, tokenData.f7209b) && Objects.equal(this.f7207a, tokenData.f7207a) && this.f7210b == tokenData.f7210b && this.f7212c == tokenData.f7212c && Objects.equal(this.f7208a, tokenData.f7208a) && Objects.equal(this.f7211c, tokenData.f7211c);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f7209b, this.f7207a, Boolean.valueOf(this.f7210b), Boolean.valueOf(this.f7212c), this.f7208a, this.f7211c);
    }

    public final void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f7213n);
        SafeParcelWriter.writeString(parcel, 2, this.f7209b, false);
        SafeParcelWriter.writeLongObject(parcel, 3, this.f7207a, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f7210b);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f7212c);
        SafeParcelWriter.writeStringList(parcel, 6, this.f7208a, false);
        SafeParcelWriter.writeString(parcel, 7, this.f7211c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @mr2
    public final String zza() {
        return this.f7209b;
    }
}
