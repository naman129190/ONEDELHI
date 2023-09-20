package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.C2283gw;
import com.onedelhi.secure.ee6;
import com.onedelhi.secure.jh3;
import com.onedelhi.secure.mr2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@SafeParcelable.Class(creator = "RegisterRequestParamsCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class RegisterRequestParams extends RequestParams {
    @mr2
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new ee6();

    /* renamed from: n */
    public static final int f7414n = 80;
    @SafeParcelable.Field(getter = "getAppId", mo10053id = 4)

    /* renamed from: a */
    public final Uri f7415a;
    @SafeParcelable.Field(getter = "getChannelIdValue", mo10053id = 7)

    /* renamed from: a */
    public final C2283gw f7416a;
    @SafeParcelable.Field(getter = "getTimeoutSeconds", mo10053id = 3)

    /* renamed from: a */
    public final Double f7417a;
    @SafeParcelable.Field(getter = "getRequestId", mo10053id = 2)

    /* renamed from: a */
    public final Integer f7418a;
    @SafeParcelable.Field(getter = "getRegisterRequests", mo10053id = 5)

    /* renamed from: a */
    public final List f7419a;

    /* renamed from: a */
    public Set f7420a;
    @SafeParcelable.Field(getter = "getDisplayHint", mo10053id = 8)

    /* renamed from: b */
    public final String f7421b;
    @SafeParcelable.Field(getter = "getRegisteredKeys", mo10053id = 6)

    /* renamed from: b */
    public final List f7422b;

    /* renamed from: com.google.android.gms.fido.u2f.api.common.RegisterRequestParams$a */
    public static final class C1429a {

        /* renamed from: a */
        public Uri f7423a;

        /* renamed from: a */
        public C2283gw f7424a;

        /* renamed from: a */
        public Double f7425a;

        /* renamed from: a */
        public Integer f7426a;

        /* renamed from: a */
        public String f7427a;

        /* renamed from: a */
        public List f7428a;

        /* renamed from: b */
        public List f7429b;

        @mr2
        /* renamed from: a */
        public RegisterRequestParams mo10436a() {
            return new RegisterRequestParams(this.f7426a, this.f7425a, this.f7423a, this.f7428a, this.f7429b, this.f7424a, this.f7427a);
        }

        @mr2
        /* renamed from: b */
        public C1429a mo10437b(@mr2 Uri uri) {
            this.f7423a = uri;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C1429a mo10438c(@mr2 C2283gw gwVar) {
            this.f7424a = gwVar;
            return this;
        }

        @mr2
        /* renamed from: d */
        public C1429a mo10439d(@mr2 String str) {
            this.f7427a = str;
            return this;
        }

        @mr2
        /* renamed from: e */
        public C1429a mo10440e(@mr2 List<C1434c> list) {
            this.f7428a = list;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C1429a mo10441f(@mr2 List<jh3> list) {
            this.f7429b = list;
            return this;
        }

        @mr2
        /* renamed from: g */
        public C1429a mo10442g(@mr2 Integer num) {
            this.f7426a = num;
            return this;
        }

        @mr2
        /* renamed from: h */
        public C1429a mo10443h(@mr2 Double d) {
            this.f7425a = d;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public RegisterRequestParams(@SafeParcelable.Param(mo10056id = 2) Integer num, @SafeParcelable.Param(mo10056id = 3) Double d, @SafeParcelable.Param(mo10056id = 4) Uri uri, @SafeParcelable.Param(mo10056id = 5) List list, @SafeParcelable.Param(mo10056id = 6) List list2, @SafeParcelable.Param(mo10056id = 7) C2283gw gwVar, @SafeParcelable.Param(mo10056id = 8) String str) {
        this.f7418a = num;
        this.f7417a = d;
        this.f7415a = uri;
        boolean z = false;
        Preconditions.checkArgument(list != null && !list.isEmpty(), "empty list of register requests is provided");
        this.f7419a = list;
        this.f7422b = list2;
        this.f7416a = gwVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1434c cVar = (C1434c) it.next();
            Preconditions.checkArgument((uri == null && cVar.mo10485K2() == null) ? false : true, "register request has null appId and no request appId is provided");
            if (cVar.mo10485K2() != null) {
                hashSet.add(Uri.parse(cVar.mo10485K2()));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            jh3 jh3 = (jh3) it2.next();
            Preconditions.checkArgument((uri == null && jh3.mo18424K2() == null) ? false : true, "registered key has null appId and no request appId is provided");
            if (jh3.mo18424K2() != null) {
                hashSet.add(Uri.parse(jh3.mo18424K2()));
            }
        }
        this.f7420a = hashSet;
        Preconditions.checkArgument((str == null || str.length() <= 80) ? true : z, "Display Hint cannot be longer than 80 characters");
        this.f7421b = str;
    }

    @mr2
    /* renamed from: K2 */
    public Set<Uri> mo10425K2() {
        return this.f7420a;
    }

    @mr2
    /* renamed from: L2 */
    public Uri mo10426L2() {
        return this.f7415a;
    }

    @mr2
    /* renamed from: M2 */
    public C2283gw mo10427M2() {
        return this.f7416a;
    }

    @mr2
    /* renamed from: N2 */
    public String mo10428N2() {
        return this.f7421b;
    }

    @mr2
    /* renamed from: O2 */
    public List<jh3> mo10429O2() {
        return this.f7422b;
    }

    @mr2
    /* renamed from: P2 */
    public Integer mo10430P2() {
        return this.f7418a;
    }

    @mr2
    /* renamed from: Q2 */
    public Double mo10431Q2() {
        return this.f7417a;
    }

    @mr2
    /* renamed from: R2 */
    public List<C1434c> mo10432R2() {
        return this.f7419a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r1 = r4.f7422b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        r3 = r5.f7422b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@com.onedelhi.secure.mr2 java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.fido.u2f.api.common.RegisterRequestParams
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.google.android.gms.fido.u2f.api.common.RegisterRequestParams r5 = (com.google.android.gms.fido.u2f.api.common.RegisterRequestParams) r5
            java.lang.Integer r1 = r4.f7418a
            java.lang.Integer r3 = r5.f7418a
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L_0x0067
            java.lang.Double r1 = r4.f7417a
            java.lang.Double r3 = r5.f7417a
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L_0x0067
            android.net.Uri r1 = r4.f7415a
            android.net.Uri r3 = r5.f7415a
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L_0x0067
            java.util.List r1 = r4.f7419a
            java.util.List r3 = r5.f7419a
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L_0x0067
            java.util.List r1 = r4.f7422b
            if (r1 != 0) goto L_0x003c
            java.util.List r3 = r5.f7422b
            if (r3 == 0) goto L_0x0052
        L_0x003c:
            if (r1 == 0) goto L_0x0067
            java.util.List r3 = r5.f7422b
            if (r3 == 0) goto L_0x0067
            boolean r1 = r1.containsAll(r3)
            if (r1 == 0) goto L_0x0067
            java.util.List r1 = r5.f7422b
            java.util.List r3 = r4.f7422b
            boolean r1 = r1.containsAll(r3)
            if (r1 == 0) goto L_0x0067
        L_0x0052:
            com.onedelhi.secure.gw r1 = r4.f7416a
            com.onedelhi.secure.gw r3 = r5.f7416a
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = r4.f7421b
            java.lang.String r5 = r5.f7421b
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r1, r5)
            if (r5 == 0) goto L_0x0067
            return r0
        L_0x0067:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return Objects.hashCode(this.f7418a, this.f7415a, this.f7417a, this.f7419a, this.f7422b, this.f7416a, this.f7421b);
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerObject(parcel, 2, mo10430P2(), false);
        SafeParcelWriter.writeDoubleObject(parcel, 3, mo10431Q2(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, mo10426L2(), i, false);
        SafeParcelWriter.writeTypedList(parcel, 5, mo10432R2(), false);
        SafeParcelWriter.writeTypedList(parcel, 6, mo10429O2(), false);
        SafeParcelWriter.writeParcelable(parcel, 7, mo10427M2(), i, false);
        SafeParcelWriter.writeString(parcel, 8, mo10428N2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
