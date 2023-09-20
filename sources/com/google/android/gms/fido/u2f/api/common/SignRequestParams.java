package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.C2283gw;
import com.onedelhi.secure.hn6;
import com.onedelhi.secure.jh3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@SafeParcelable.Class(creator = "SignRequestParamsCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class SignRequestParams extends RequestParams {
    @mr2
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new hn6();

    /* renamed from: n */
    public static final int f7433n = 80;
    @SafeParcelable.Field(getter = "getAppId", mo10053id = 4)

    /* renamed from: a */
    public final Uri f7434a;
    @SafeParcelable.Field(getter = "getChannelIdValue", mo10053id = 7)

    /* renamed from: a */
    public final C2283gw f7435a;
    @SafeParcelable.Field(getter = "getTimeoutSeconds", mo10053id = 3)
    @ts2

    /* renamed from: a */
    public final Double f7436a;
    @SafeParcelable.Field(getter = "getRequestId", mo10053id = 2)

    /* renamed from: a */
    public final Integer f7437a;
    @SafeParcelable.Field(getter = "getRegisteredKeys", mo10053id = 6)

    /* renamed from: a */
    public final List f7438a;

    /* renamed from: a */
    public final Set f7439a;
    @SafeParcelable.Field(getter = "getDefaultSignChallenge", mo10053id = 5)

    /* renamed from: a */
    public final byte[] f7440a;
    @SafeParcelable.Field(getter = "getDisplayHint", mo10053id = 8)

    /* renamed from: b */
    public final String f7441b;

    /* renamed from: com.google.android.gms.fido.u2f.api.common.SignRequestParams$a */
    public static final class C1430a {

        /* renamed from: a */
        public Uri f7442a;

        /* renamed from: a */
        public C2283gw f7443a;
        @ts2

        /* renamed from: a */
        public Double f7444a;

        /* renamed from: a */
        public Integer f7445a;

        /* renamed from: a */
        public String f7446a;

        /* renamed from: a */
        public List f7447a;

        /* renamed from: a */
        public byte[] f7448a;

        @mr2
        /* renamed from: a */
        public SignRequestParams mo10456a() {
            return new SignRequestParams(this.f7445a, this.f7444a, this.f7442a, this.f7448a, this.f7447a, this.f7443a, this.f7446a);
        }

        @mr2
        /* renamed from: b */
        public C1430a mo10457b(@mr2 Uri uri) {
            this.f7442a = uri;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C1430a mo10458c(@mr2 C2283gw gwVar) {
            this.f7443a = gwVar;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C1430a mo10459d(@mr2 byte[] bArr) {
            this.f7448a = bArr;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C1430a mo10460e(@mr2 String str) {
            this.f7446a = str;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C1430a mo10461f(@mr2 List<jh3> list) {
            this.f7447a = list;
            return this;
        }

        @mr2
        /* renamed from: g */
        public C1430a mo10462g(@mr2 Integer num) {
            this.f7445a = num;
            return this;
        }

        @mr2
        /* renamed from: h */
        public C1430a mo10463h(@ts2 Double d) {
            this.f7444a = d;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public SignRequestParams(@SafeParcelable.Param(mo10056id = 2) Integer num, @SafeParcelable.Param(mo10056id = 3) @ts2 Double d, @SafeParcelable.Param(mo10056id = 4) Uri uri, @SafeParcelable.Param(mo10056id = 5) byte[] bArr, @SafeParcelable.Param(mo10056id = 6) List list, @SafeParcelable.Param(mo10056id = 7) C2283gw gwVar, @SafeParcelable.Param(mo10056id = 8) String str) {
        this.f7437a = num;
        this.f7436a = d;
        this.f7434a = uri;
        this.f7440a = bArr;
        boolean z = false;
        Preconditions.checkArgument(list != null && !list.isEmpty(), "registeredKeys must not be null or empty");
        this.f7438a = list;
        this.f7435a = gwVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jh3 jh3 = (jh3) it.next();
            Preconditions.checkArgument((jh3.mo18424K2() == null && uri == null) ? false : true, "registered key has null appId and no request appId is provided");
            String L2 = jh3.mo18425L2();
            Preconditions.checkArgument(true, "register request has null challenge and no default challenge isprovided");
            if (jh3.mo18424K2() != null) {
                hashSet.add(Uri.parse(jh3.mo18424K2()));
            }
        }
        this.f7439a = hashSet;
        Preconditions.checkArgument((str == null || str.length() <= 80) ? true : z, "Display Hint cannot be longer than 80 characters");
        this.f7441b = str;
    }

    @mr2
    /* renamed from: K2 */
    public Set<Uri> mo10425K2() {
        return this.f7439a;
    }

    @mr2
    /* renamed from: L2 */
    public Uri mo10426L2() {
        return this.f7434a;
    }

    @mr2
    /* renamed from: M2 */
    public C2283gw mo10427M2() {
        return this.f7435a;
    }

    @mr2
    /* renamed from: N2 */
    public String mo10428N2() {
        return this.f7441b;
    }

    @mr2
    /* renamed from: O2 */
    public List<jh3> mo10429O2() {
        return this.f7438a;
    }

    @mr2
    /* renamed from: P2 */
    public Integer mo10430P2() {
        return this.f7437a;
    }

    @ts2
    /* renamed from: Q2 */
    public Double mo10431Q2() {
        return this.f7436a;
    }

    @mr2
    /* renamed from: R2 */
    public byte[] mo10452R2() {
        return this.f7440a;
    }

    public boolean equals(@mr2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        return Objects.equal(this.f7437a, signRequestParams.f7437a) && Objects.equal(this.f7436a, signRequestParams.f7436a) && Objects.equal(this.f7434a, signRequestParams.f7434a) && Arrays.equals(this.f7440a, signRequestParams.f7440a) && this.f7438a.containsAll(signRequestParams.f7438a) && signRequestParams.f7438a.containsAll(this.f7438a) && Objects.equal(this.f7435a, signRequestParams.f7435a) && Objects.equal(this.f7441b, signRequestParams.f7441b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f7437a, this.f7434a, this.f7436a, this.f7438a, this.f7435a, this.f7441b, Integer.valueOf(Arrays.hashCode(this.f7440a)));
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerObject(parcel, 2, mo10430P2(), false);
        SafeParcelWriter.writeDoubleObject(parcel, 3, mo10431Q2(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, mo10426L2(), i, false);
        SafeParcelWriter.writeByteArray(parcel, 5, mo10452R2(), false);
        SafeParcelWriter.writeTypedList(parcel, 6, mo10429O2(), false);
        SafeParcelWriter.writeParcelable(parcel, 7, mo10427M2(), i, false);
        SafeParcelWriter.writeString(parcel, 8, mo10428N2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
