package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.C3837wb;
import com.onedelhi.secure.zj3;

@SafeParcelable.Class(creator = "AuthenticatorSelectionCriteriaCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.onedelhi.secure.ed */
public class C2054ed extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<C2054ed> CREATOR = new hs6();
    @SafeParcelable.Field(getter = "getRequireUserVerificationAsString", mo10053id = 4, type = "java.lang.String")
    @ts2

    /* renamed from: a */
    public final ok5 f11189a;
    @SafeParcelable.Field(getter = "getAttachmentAsString", mo10053id = 2, type = "java.lang.String")
    @ts2

    /* renamed from: a */
    public final C3837wb f11190a;
    @SafeParcelable.Field(getter = "getResidentKeyRequirementAsString", mo10053id = 5, type = "java.lang.String")
    @ts2

    /* renamed from: a */
    public final zj3 f11191a;
    @SafeParcelable.Field(getter = "getRequireResidentKey", mo10053id = 3)
    @ts2

    /* renamed from: a */
    public final Boolean f11192a;

    /* renamed from: com.onedelhi.secure.ed$a */
    public static class C2055a {

        /* renamed from: a */
        public C3837wb f11193a;

        /* renamed from: a */
        public zj3 f11194a;

        /* renamed from: a */
        public Boolean f11195a;

        @mr2
        /* renamed from: a */
        public C2054ed mo15129a() {
            C3837wb wbVar = this.f11193a;
            String wbVar2 = wbVar == null ? null : wbVar.toString();
            Boolean bool = this.f11195a;
            zj3 zj3 = this.f11194a;
            return new C2054ed(wbVar2, bool, (String) null, zj3 == null ? null : zj3.toString());
        }

        @mr2
        /* renamed from: b */
        public C2055a mo15130b(@ts2 C3837wb wbVar) {
            this.f11193a = wbVar;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C2055a mo15131c(@ts2 Boolean bool) {
            this.f11195a = bool;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C2055a mo15132d(@ts2 zj3 zj3) {
            this.f11194a = zj3;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public C2054ed(@SafeParcelable.Param(mo10056id = 2) @ts2 String str, @SafeParcelable.Param(mo10056id = 3) @ts2 Boolean bool, @SafeParcelable.Param(mo10056id = 4) @ts2 String str2, @SafeParcelable.Param(mo10056id = 5) @ts2 String str3) {
        C3837wb wbVar;
        zj3 zj3 = null;
        if (str == null) {
            wbVar = null;
        } else {
            try {
                wbVar = C3837wb.m30783a(str);
            } catch (gk5 | C3837wb.C3838a | zj3.C4100a e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.f11190a = wbVar;
        this.f11192a = bool;
        this.f11189a = str2 == null ? null : ok5.m23862a(str2);
        if (str3 != null) {
            zj3 = zj3.m33180a(str3);
        }
        this.f11191a = zj3;
    }

    @ts2
    /* renamed from: K2 */
    public C3837wb mo15121K2() {
        return this.f11190a;
    }

    @ts2
    /* renamed from: L2 */
    public String mo15122L2() {
        C3837wb wbVar = this.f11190a;
        if (wbVar == null) {
            return null;
        }
        return wbVar.toString();
    }

    @ts2
    /* renamed from: M2 */
    public Boolean mo15123M2() {
        return this.f11192a;
    }

    @ts2
    /* renamed from: N2 */
    public zj3 mo15124N2() {
        return this.f11191a;
    }

    @ts2
    /* renamed from: O2 */
    public String mo15125O2() {
        zj3 zj3 = this.f11191a;
        if (zj3 == null) {
            return null;
        }
        return zj3.toString();
    }

    public boolean equals(@mr2 Object obj) {
        if (!(obj instanceof C2054ed)) {
            return false;
        }
        C2054ed edVar = (C2054ed) obj;
        return Objects.equal(this.f11190a, edVar.f11190a) && Objects.equal(this.f11192a, edVar.f11192a) && Objects.equal(this.f11189a, edVar.f11189a) && Objects.equal(this.f11191a, edVar.f11191a);
    }

    public int hashCode() {
        return Objects.hashCode(this.f11190a, this.f11192a, this.f11189a, this.f11191a);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, mo15122L2(), false);
        SafeParcelWriter.writeBooleanObject(parcel, 3, mo15123M2(), false);
        ok5 ok5 = this.f11189a;
        SafeParcelWriter.writeString(parcel, 4, ok5 == null ? null : ok5.toString(), false);
        SafeParcelWriter.writeString(parcel, 5, mo15125O2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
