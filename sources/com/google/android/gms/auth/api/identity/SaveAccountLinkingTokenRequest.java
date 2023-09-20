package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.d85;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class(creator = "SaveAccountLinkingTokenRequestCreator")
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new d85();
    @mr2

    /* renamed from: e */
    public static final String f7275e = "auth_code";
    @mr2

    /* renamed from: f */
    public static final String f7276f = "extra_token";
    @SafeParcelable.Field(getter = "getConsentPendingIntent", mo10053id = 1)

    /* renamed from: a */
    public final PendingIntent f7277a;
    @SafeParcelable.Field(getter = "getScopes", mo10053id = 4)

    /* renamed from: a */
    public final List f7278a;
    @SafeParcelable.Field(getter = "getTokenType", mo10053id = 2)

    /* renamed from: b */
    public final String f7279b;
    @SafeParcelable.Field(getter = "getServiceId", mo10053id = 3)

    /* renamed from: c */
    public final String f7280c;
    @SafeParcelable.Field(getter = "getSessionId", mo10053id = 5)
    @ts2

    /* renamed from: d */
    public final String f7281d;
    @SafeParcelable.Field(getter = "getTheme", mo10053id = 6)

    /* renamed from: n */
    public final int f7282n;

    /* renamed from: com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$a */
    public static final class C1405a {

        /* renamed from: a */
        public int f7283a;

        /* renamed from: a */
        public PendingIntent f7284a;

        /* renamed from: a */
        public String f7285a;

        /* renamed from: a */
        public List f7286a = new ArrayList();

        /* renamed from: b */
        public String f7287b;

        /* renamed from: c */
        public String f7288c;

        @mr2
        /* renamed from: a */
        public SaveAccountLinkingTokenRequest mo9194a() {
            boolean z = false;
            Preconditions.checkArgument(this.f7284a != null, "Consent PendingIntent cannot be null");
            Preconditions.checkArgument("auth_code".equals(this.f7285a), "Invalid tokenType");
            Preconditions.checkArgument(!TextUtils.isEmpty(this.f7287b), "serviceId cannot be null or empty");
            if (this.f7286a != null) {
                z = true;
            }
            Preconditions.checkArgument(z, "scopes cannot be null");
            return new SaveAccountLinkingTokenRequest(this.f7284a, this.f7285a, this.f7287b, this.f7286a, this.f7288c, this.f7283a);
        }

        @mr2
        /* renamed from: b */
        public C1405a mo9195b(@mr2 PendingIntent pendingIntent) {
            this.f7284a = pendingIntent;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C1405a mo9196c(@mr2 List<String> list) {
            this.f7286a = list;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C1405a mo9197d(@mr2 String str) {
            this.f7287b = str;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C1405a mo9198e(@mr2 String str) {
            this.f7285a = str;
            return this;
        }

        @mr2
        /* renamed from: f */
        public final C1405a mo9199f(@mr2 String str) {
            this.f7288c = str;
            return this;
        }

        @mr2
        /* renamed from: g */
        public final C1405a mo9200g(int i) {
            this.f7283a = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public SaveAccountLinkingTokenRequest(@SafeParcelable.Param(mo10056id = 1) PendingIntent pendingIntent, @SafeParcelable.Param(mo10056id = 2) String str, @SafeParcelable.Param(mo10056id = 3) String str2, @SafeParcelable.Param(mo10056id = 4) List list, @SafeParcelable.Param(mo10056id = 5) @ts2 String str3, @SafeParcelable.Param(mo10056id = 6) int i) {
        this.f7277a = pendingIntent;
        this.f7279b = str;
        this.f7280c = str2;
        this.f7278a = list;
        this.f7281d = str3;
        this.f7282n = i;
    }

    @mr2
    /* renamed from: K2 */
    public static C1405a m8774K2() {
        return new C1405a();
    }

    @mr2
    /* renamed from: P2 */
    public static C1405a m8775P2(@mr2 SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Preconditions.checkNotNull(saveAccountLinkingTokenRequest);
        C1405a K2 = m8774K2();
        K2.mo9196c(saveAccountLinkingTokenRequest.mo9188M2());
        K2.mo9197d(saveAccountLinkingTokenRequest.mo9189N2());
        K2.mo9195b(saveAccountLinkingTokenRequest.mo9187L2());
        K2.mo9198e(saveAccountLinkingTokenRequest.mo9190O2());
        K2.mo9200g(saveAccountLinkingTokenRequest.f7282n);
        String str = saveAccountLinkingTokenRequest.f7281d;
        if (!TextUtils.isEmpty(str)) {
            K2.mo9199f(str);
        }
        return K2;
    }

    @mr2
    /* renamed from: L2 */
    public PendingIntent mo9187L2() {
        return this.f7277a;
    }

    @mr2
    /* renamed from: M2 */
    public List<String> mo9188M2() {
        return this.f7278a;
    }

    @mr2
    /* renamed from: N2 */
    public String mo9189N2() {
        return this.f7280c;
    }

    @mr2
    /* renamed from: O2 */
    public String mo9190O2() {
        return this.f7279b;
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        return this.f7278a.size() == saveAccountLinkingTokenRequest.f7278a.size() && this.f7278a.containsAll(saveAccountLinkingTokenRequest.f7278a) && Objects.equal(this.f7277a, saveAccountLinkingTokenRequest.f7277a) && Objects.equal(this.f7279b, saveAccountLinkingTokenRequest.f7279b) && Objects.equal(this.f7280c, saveAccountLinkingTokenRequest.f7280c) && Objects.equal(this.f7281d, saveAccountLinkingTokenRequest.f7281d) && this.f7282n == saveAccountLinkingTokenRequest.f7282n;
    }

    public int hashCode() {
        return Objects.hashCode(this.f7277a, this.f7279b, this.f7280c, this.f7278a, this.f7281d);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, mo9187L2(), i, false);
        SafeParcelWriter.writeString(parcel, 2, mo9190O2(), false);
        SafeParcelWriter.writeString(parcel, 3, mo9189N2(), false);
        SafeParcelWriter.writeStringList(parcel, 4, mo9188M2(), false);
        SafeParcelWriter.writeString(parcel, 5, this.f7281d, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f7282n);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
