package com.onedelhi.secure;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AccountChangeEventsRequestCreator")
/* renamed from: com.onedelhi.secure.i2 */
public class C2393i2 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C2393i2> CREATOR = new cm5();
    @SafeParcelable.Field(mo10053id = 4)

    /* renamed from: a */
    public Account f13450a;
    @SafeParcelable.Field(mo10053id = 3)
    @Deprecated

    /* renamed from: b */
    public String f13451b;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f13452n;
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: o */
    public int f13453o;

    public C2393i2() {
        this.f13452n = 1;
    }

    @SafeParcelable.Constructor
    public C2393i2(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) int i2, @SafeParcelable.Param(mo10056id = 3) String str, @SafeParcelable.Param(mo10056id = 4) Account account) {
        this.f13452n = i;
        this.f13453o = i2;
        this.f13451b = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f13450a = account;
        } else {
            this.f13450a = new Account(str, "com.google");
        }
    }

    @mr2
    @Deprecated
    /* renamed from: K2 */
    public String mo17505K2() {
        return this.f13451b;
    }

    /* renamed from: L2 */
    public int mo17506L2() {
        return this.f13453o;
    }

    @mr2
    /* renamed from: M2 */
    public C2393i2 mo17507M2(@mr2 Account account) {
        this.f13450a = account;
        return this;
    }

    @mr2
    @Deprecated
    /* renamed from: N2 */
    public C2393i2 mo17508N2(@mr2 String str) {
        this.f13451b = str;
        return this;
    }

    @mr2
    /* renamed from: O2 */
    public C2393i2 mo17509O2(int i) {
        this.f13453o = i;
        return this;
    }

    @mr2
    public Account getAccount() {
        return this.f13450a;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f13452n);
        SafeParcelWriter.writeInt(parcel, 2, this.f13453o);
        SafeParcelWriter.writeString(parcel, 3, this.f13451b, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f13450a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
