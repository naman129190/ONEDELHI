package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SavePasswordRequestCreator")
public class sq3 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<sq3> CREATOR = new j85();
    @SafeParcelable.Field(getter = "getSignInPassword", mo10053id = 1)

    /* renamed from: a */
    public final sy3 f20487a;
    @SafeParcelable.Field(getter = "getSessionId", mo10053id = 2)
    @ts2

    /* renamed from: b */
    public final String f20488b;
    @SafeParcelable.Field(getter = "getTheme", mo10053id = 3)

    /* renamed from: n */
    public final int f20489n;

    /* renamed from: com.onedelhi.secure.sq3$a */
    public static final class C3534a {

        /* renamed from: a */
        public int f20490a;

        /* renamed from: a */
        public sy3 f20491a;
        @ts2

        /* renamed from: a */
        public String f20492a;

        @mr2
        /* renamed from: a */
        public sq3 mo24510a() {
            return new sq3(this.f20491a, this.f20492a, this.f20490a);
        }

        @mr2
        /* renamed from: b */
        public C3534a mo24511b(@mr2 sy3 sy3) {
            this.f20491a = sy3;
            return this;
        }

        @mr2
        /* renamed from: c */
        public final C3534a mo24512c(@mr2 String str) {
            this.f20492a = str;
            return this;
        }

        @mr2
        /* renamed from: d */
        public final C3534a mo24513d(int i) {
            this.f20490a = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public sq3(@SafeParcelable.Param(mo10056id = 1) sy3 sy3, @SafeParcelable.Param(mo10056id = 2) @ts2 String str, @SafeParcelable.Param(mo10056id = 3) int i) {
        this.f20487a = (sy3) Preconditions.checkNotNull(sy3);
        this.f20488b = str;
        this.f20489n = i;
    }

    @mr2
    /* renamed from: K2 */
    public static C3534a m27785K2() {
        return new C3534a();
    }

    @mr2
    /* renamed from: M2 */
    public static C3534a m27786M2(@mr2 sq3 sq3) {
        Preconditions.checkNotNull(sq3);
        C3534a K2 = m27785K2();
        K2.mo24511b(sq3.mo24506L2());
        K2.mo24513d(sq3.f20489n);
        String str = sq3.f20488b;
        if (str != null) {
            K2.mo24512c(str);
        }
        return K2;
    }

    @mr2
    /* renamed from: L2 */
    public sy3 mo24506L2() {
        return this.f20487a;
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof sq3)) {
            return false;
        }
        sq3 sq3 = (sq3) obj;
        return Objects.equal(this.f20487a, sq3.f20487a) && Objects.equal(this.f20488b, sq3.f20488b) && this.f20489n == sq3.f20489n;
    }

    public int hashCode() {
        return Objects.hashCode(this.f20487a, this.f20488b);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, mo24506L2(), i, false);
        SafeParcelWriter.writeString(parcel, 2, this.f20488b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f20489n);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
