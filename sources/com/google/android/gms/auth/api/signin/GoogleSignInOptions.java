package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.C7277xt;
import com.onedelhi.secure.c45;
import com.onedelhi.secure.h45;
import com.onedelhi.secure.mk1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.x35;
import com.onedelhi.secure.xh1;
import com.onedelhi.secure.yh1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "GoogleSignInOptionsCreator")
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new h45();
    @mr2

    /* renamed from: a */
    public static final GoogleSignInOptions f7303a;
    @mr2
    @VisibleForTesting

    /* renamed from: a */
    public static final Scope f7304a = new Scope(Scopes.PROFILE);

    /* renamed from: a */
    public static Comparator f7305a = new x35();
    @mr2

    /* renamed from: b */
    public static final GoogleSignInOptions f7306b;
    @mr2
    @VisibleForTesting

    /* renamed from: b */
    public static final Scope f7307b = new Scope("email");
    @mr2
    @VisibleForTesting

    /* renamed from: c */
    public static final Scope f7308c = new Scope(Scopes.OPEN_ID);
    @mr2
    @VisibleForTesting

    /* renamed from: d */
    public static final Scope f7309d;
    @mr2
    @VisibleForTesting

    /* renamed from: e */
    public static final Scope f7310e = new Scope(Scopes.GAMES);
    @SafeParcelable.Field(getter = "getAccount", mo10053id = 3)
    @ts2

    /* renamed from: a */
    public Account f7311a;
    @SafeParcelable.Field(getter = "getScopes", mo10053id = 2)

    /* renamed from: a */
    public final ArrayList f7312a;

    /* renamed from: a */
    public Map f7313a;
    @SafeParcelable.Field(getter = "getServerClientId", mo10053id = 7)
    @ts2

    /* renamed from: b */
    public String f7314b;
    @SafeParcelable.Field(getter = "getExtensions", mo10053id = 9)

    /* renamed from: b */
    public ArrayList f7315b;
    @SafeParcelable.Field(getter = "isIdTokenRequested", mo10053id = 4)

    /* renamed from: b */
    public boolean f7316b;
    @SafeParcelable.Field(getter = "getHostedDomain", mo10053id = 8)
    @ts2

    /* renamed from: c */
    public String f7317c;
    @SafeParcelable.Field(getter = "isServerAuthCodeRequested", mo10053id = 5)

    /* renamed from: c */
    public final boolean f7318c;
    @SafeParcelable.Field(getter = "getLogSessionId", mo10053id = 10)
    @ts2

    /* renamed from: d */
    public String f7319d;
    @SafeParcelable.Field(getter = "isForceCodeForRefreshToken", mo10053id = 6)

    /* renamed from: d */
    public final boolean f7320d;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f7321n;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C1406a {
        @ts2

        /* renamed from: a */
        public Account f7322a;
        @ts2

        /* renamed from: a */
        public String f7323a;

        /* renamed from: a */
        public Map f7324a = new HashMap();

        /* renamed from: a */
        public Set f7325a = new HashSet();

        /* renamed from: a */
        public boolean f7326a;
        @ts2

        /* renamed from: b */
        public String f7327b;

        /* renamed from: b */
        public boolean f7328b;
        @ts2

        /* renamed from: c */
        public String f7329c;

        /* renamed from: c */
        public boolean f7330c;

        public C1406a() {
        }

        public C1406a(@mr2 GoogleSignInOptions googleSignInOptions) {
            Preconditions.checkNotNull(googleSignInOptions);
            this.f7325a = new HashSet(googleSignInOptions.f7312a);
            this.f7326a = googleSignInOptions.f7318c;
            this.f7328b = googleSignInOptions.f7320d;
            this.f7330c = googleSignInOptions.f7316b;
            this.f7323a = googleSignInOptions.f7314b;
            this.f7322a = googleSignInOptions.f7311a;
            this.f7327b = googleSignInOptions.f7317c;
            this.f7324a = GoogleSignInOptions.m8817e3(googleSignInOptions.f7315b);
            this.f7329c = googleSignInOptions.f7319d;
        }

        @mr2
        @C7277xt
        /* renamed from: a */
        public C1406a mo9232a(@mr2 xh1 xh1) {
            if (!this.f7324a.containsKey(Integer.valueOf(xh1.mo26922c()))) {
                List<Scope> b = xh1.mo26921b();
                if (b != null) {
                    this.f7325a.addAll(b);
                }
                this.f7324a.put(Integer.valueOf(xh1.mo26922c()), new yh1(xh1));
                return this;
            }
            throw new IllegalStateException("Only one extension per type may be added");
        }

        @mr2
        /* renamed from: b */
        public GoogleSignInOptions mo9233b() {
            if (this.f7325a.contains(GoogleSignInOptions.f7310e)) {
                Set set = this.f7325a;
                Scope scope = GoogleSignInOptions.f7309d;
                if (set.contains(scope)) {
                    this.f7325a.remove(scope);
                }
            }
            if (this.f7330c && (this.f7322a == null || !this.f7325a.isEmpty())) {
                mo9235d();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f7325a), this.f7322a, this.f7330c, this.f7326a, this.f7328b, this.f7323a, this.f7327b, this.f7324a, this.f7329c, (c45) null);
        }

        @mr2
        @C7277xt
        /* renamed from: c */
        public C1406a mo9234c() {
            this.f7325a.add(GoogleSignInOptions.f7307b);
            return this;
        }

        @mr2
        @C7277xt
        /* renamed from: d */
        public C1406a mo9235d() {
            this.f7325a.add(GoogleSignInOptions.f7308c);
            return this;
        }

        @mr2
        @C7277xt
        /* renamed from: e */
        public C1406a mo9236e(@mr2 String str) {
            this.f7330c = true;
            mo9244m(str);
            this.f7323a = str;
            return this;
        }

        @mr2
        @C7277xt
        /* renamed from: f */
        public C1406a mo9237f() {
            this.f7325a.add(GoogleSignInOptions.f7304a);
            return this;
        }

        @mr2
        @C7277xt
        /* renamed from: g */
        public C1406a mo9238g(@mr2 Scope scope, @mr2 Scope... scopeArr) {
            this.f7325a.add(scope);
            this.f7325a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @mr2
        /* renamed from: h */
        public C1406a mo9239h(@mr2 String str) {
            mo9240i(str, false);
            return this;
        }

        @mr2
        @C7277xt
        /* renamed from: i */
        public C1406a mo9240i(@mr2 String str, boolean z) {
            this.f7326a = true;
            mo9244m(str);
            this.f7323a = str;
            this.f7328b = z;
            return this;
        }

        @mr2
        @C7277xt
        /* renamed from: j */
        public C1406a mo9241j(@mr2 String str) {
            this.f7322a = new Account(Preconditions.checkNotEmpty(str), "com.google");
            return this;
        }

        @mr2
        @C7277xt
        /* renamed from: k */
        public C1406a mo9242k(@mr2 String str) {
            this.f7327b = Preconditions.checkNotEmpty(str);
            return this;
        }

        @mr2
        @KeepForSdk
        @C7277xt
        /* renamed from: l */
        public C1406a mo9243l(@mr2 String str) {
            this.f7329c = str;
            return this;
        }

        /* renamed from: m */
        public final String mo9244m(String str) {
            Preconditions.checkNotEmpty(str);
            String str2 = this.f7323a;
            boolean z = true;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            Preconditions.checkArgument(z, "two different server client ids provided");
            return str;
        }
    }

    static {
        Scope scope = new Scope(Scopes.GAMES_LITE);
        f7309d = scope;
        C1406a aVar = new C1406a();
        aVar.mo9235d();
        aVar.mo9237f();
        f7303a = aVar.mo9233b();
        C1406a aVar2 = new C1406a();
        aVar2.mo9238g(scope, new Scope[0]);
        f7306b = aVar2.mo9233b();
    }

    @SafeParcelable.Constructor
    public GoogleSignInOptions(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) ArrayList arrayList, @SafeParcelable.Param(mo10056id = 3) @ts2 Account account, @SafeParcelable.Param(mo10056id = 4) boolean z, @SafeParcelable.Param(mo10056id = 5) boolean z2, @SafeParcelable.Param(mo10056id = 6) boolean z3, @SafeParcelable.Param(mo10056id = 7) @ts2 String str, @SafeParcelable.Param(mo10056id = 8) @ts2 String str2, @SafeParcelable.Param(mo10056id = 9) ArrayList arrayList2, @SafeParcelable.Param(mo10056id = 10) @ts2 String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m8817e3(arrayList2), str3);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, @ts2 Account account, boolean z, boolean z2, boolean z3, @ts2 String str, @ts2 String str2, Map map, @ts2 String str3) {
        this.f7321n = i;
        this.f7312a = arrayList;
        this.f7311a = account;
        this.f7316b = z;
        this.f7318c = z2;
        this.f7320d = z3;
        this.f7314b = str;
        this.f7317c = str2;
        this.f7315b = new ArrayList(map.values());
        this.f7313a = map;
        this.f7319d = str3;
    }

    public /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, c45 c45) {
        this(3, arrayList, account, z, z2, z3, str, str2, map, str3);
    }

    @ts2
    /* renamed from: T2 */
    public static GoogleSignInOptions m8807T2(@ts2 String str) throws JSONException {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        Account account = !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null;
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            str2 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z, z2, z3, optString2, str2, (Map) new HashMap(), (String) null);
    }

    /* renamed from: e3 */
    public static Map m8817e3(@ts2 List list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yh1 yh1 = (yh1) it.next();
            hashMap.put(Integer.valueOf(yh1.mo27491K2()), yh1);
        }
        return hashMap;
    }

    @mr2
    @KeepForSdk
    /* renamed from: K2 */
    public ArrayList<yh1> mo9219K2() {
        return this.f7315b;
    }

    @KeepForSdk
    @ts2
    /* renamed from: L2 */
    public String mo9220L2() {
        return this.f7319d;
    }

    @mr2
    /* renamed from: M2 */
    public Scope[] mo9221M2() {
        ArrayList arrayList = this.f7312a;
        return (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
    }

    @mr2
    @KeepForSdk
    /* renamed from: N2 */
    public ArrayList<Scope> mo9222N2() {
        return new ArrayList<>(this.f7312a);
    }

    @KeepForSdk
    @ts2
    /* renamed from: O2 */
    public String mo9223O2() {
        return this.f7314b;
    }

    @KeepForSdk
    /* renamed from: P2 */
    public boolean mo9224P2() {
        return this.f7320d;
    }

    @KeepForSdk
    /* renamed from: Q2 */
    public boolean mo9225Q2() {
        return this.f7316b;
    }

    @KeepForSdk
    /* renamed from: R2 */
    public boolean mo9226R2() {
        return this.f7318c;
    }

    @mr2
    /* renamed from: X2 */
    public final String mo9227X2() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f7312a, f7305a);
            Iterator it = this.f7312a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).getScopeUri());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f7311a;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f7316b);
            jSONObject.put("forceCodeForRefreshToken", this.f7320d);
            jSONObject.put("serverAuthRequested", this.f7318c);
            if (!TextUtils.isEmpty(this.f7314b)) {
                jSONObject.put("serverClientId", this.f7314b);
            }
            if (!TextUtils.isEmpty(this.f7317c)) {
                jSONObject.put("hostedDomain", this.f7317c);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.equals(r4.getAccount()) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@com.onedelhi.secure.ts2 java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r1 = r3.f7315b     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 > 0) goto L_0x0090
            java.util.ArrayList r1 = r4.f7315b     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.util.ArrayList r1 = r3.f7312a     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo9222N2()     // Catch:{ ClassCastException -> 0x0090 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.util.ArrayList r1 = r3.f7312a     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo9222N2()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            android.accounts.Account r1 = r3.f7311a     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.getAccount()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.getAccount()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
        L_0x004a:
            java.lang.String r1 = r3.f7314b     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.mo9223O2()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            goto L_0x006a
        L_0x005d:
            java.lang.String r1 = r3.f7314b     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r2 = r4.mo9223O2()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            boolean r1 = r3.f7320d     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo9224P2()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f7316b     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo9225Q2()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f7318c     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo9226R2()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.lang.String r1 = r3.f7319d     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r4 = r4.mo9220L2()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0090 }
            if (r4 == 0) goto L_0x0090
            r4 = 1
            return r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    @KeepForSdk
    @ts2
    public Account getAccount() {
        return this.f7311a;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f7312a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).getScopeUri());
        }
        Collections.sort(arrayList);
        mk1 mk1 = new mk1();
        mk1.mo20455a(arrayList);
        mk1.mo20455a(this.f7311a);
        mk1.mo20455a(this.f7314b);
        mk1.mo20457c(this.f7320d);
        mk1.mo20457c(this.f7316b);
        mk1.mo20457c(this.f7318c);
        mk1.mo20455a(this.f7319d);
        return mk1.mo20456b();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f7321n);
        SafeParcelWriter.writeTypedList(parcel, 2, mo9222N2(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getAccount(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, mo9225Q2());
        SafeParcelWriter.writeBoolean(parcel, 5, mo9226R2());
        SafeParcelWriter.writeBoolean(parcel, 6, mo9224P2());
        SafeParcelWriter.writeString(parcel, 7, mo9223O2(), false);
        SafeParcelWriter.writeString(parcel, 8, this.f7317c, false);
        SafeParcelWriter.writeTypedList(parcel, 9, mo9219K2(), false);
        SafeParcelWriter.writeString(parcel, 10, mo9220L2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
