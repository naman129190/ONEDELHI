package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.C3679ua;
import com.onedelhi.secure.C7277xt;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n35;
import com.onedelhi.secure.s35;
import com.onedelhi.secure.ts2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new s35();
    @mr2
    @VisibleForTesting

    /* renamed from: a */
    public static Clock f7289a = DefaultClock.getInstance();
    @SafeParcelable.Field(getter = "getPhotoUrl", mo10053id = 6)
    @ts2

    /* renamed from: a */
    public Uri f7290a;
    @SafeParcelable.Field(mo10053id = 10)

    /* renamed from: a */
    public List f7291a;

    /* renamed from: a */
    public Set f7292a = new HashSet();
    @SafeParcelable.Field(getter = "getExpirationTimeSecs", mo10053id = 8)

    /* renamed from: b */
    public long f7293b;
    @SafeParcelable.Field(getter = "getId", mo10053id = 2)
    @ts2

    /* renamed from: b */
    public String f7294b;
    @SafeParcelable.Field(getter = "getIdToken", mo10053id = 3)
    @ts2

    /* renamed from: c */
    public String f7295c;
    @SafeParcelable.Field(getter = "getEmail", mo10053id = 4)
    @ts2

    /* renamed from: d */
    public String f7296d;
    @SafeParcelable.Field(getter = "getDisplayName", mo10053id = 5)
    @ts2

    /* renamed from: e */
    public String f7297e;
    @SafeParcelable.Field(getter = "getServerAuthCode", mo10053id = 7)
    @ts2

    /* renamed from: f */
    public String f7298f;
    @SafeParcelable.Field(getter = "getObfuscatedIdentifier", mo10053id = 9)

    /* renamed from: g */
    public String f7299g;
    @SafeParcelable.Field(getter = "getGivenName", mo10053id = 11)
    @ts2

    /* renamed from: h */
    public String f7300h;
    @SafeParcelable.Field(getter = "getFamilyName", mo10053id = 12)
    @ts2

    /* renamed from: i */
    public String f7301i;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f7302n;

    @SafeParcelable.Constructor
    public GoogleSignInAccount(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) @ts2 String str, @SafeParcelable.Param(mo10056id = 3) @ts2 String str2, @SafeParcelable.Param(mo10056id = 4) @ts2 String str3, @SafeParcelable.Param(mo10056id = 5) @ts2 String str4, @SafeParcelable.Param(mo10056id = 6) @ts2 Uri uri, @SafeParcelable.Param(mo10056id = 7) @ts2 String str5, @SafeParcelable.Param(mo10056id = 8) long j, @SafeParcelable.Param(mo10056id = 9) String str6, @SafeParcelable.Param(mo10056id = 10) List list, @SafeParcelable.Param(mo10056id = 11) @ts2 String str7, @SafeParcelable.Param(mo10056id = 12) @ts2 String str8) {
        this.f7302n = i;
        this.f7294b = str;
        this.f7295c = str2;
        this.f7296d = str3;
        this.f7297e = str4;
        this.f7290a = uri;
        this.f7298f = str5;
        this.f7293b = j;
        this.f7299g = str6;
        this.f7291a = list;
        this.f7300h = str7;
        this.f7301i = str8;
    }

    @mr2
    @KeepForSdk
    /* renamed from: K2 */
    public static GoogleSignInAccount m8787K2() {
        return m8791c3(new Account("<<default account>>", "com.google"), new HashSet());
    }

    @mr2
    @KeepForSdk
    /* renamed from: L2 */
    public static GoogleSignInAccount m8788L2(@mr2 Account account) {
        return m8791c3(account, new C3679ua());
    }

    @mr2
    /* renamed from: Y2 */
    public static GoogleSignInAccount m8789Y2(@ts2 String str, @ts2 String str2, @ts2 String str3, @ts2 String str4, @ts2 String str5, @ts2 String str6, @ts2 Uri uri, @ts2 Long l, @mr2 String str7, @mr2 Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l.longValue(), Preconditions.checkNotEmpty(str7), new ArrayList((Collection) Preconditions.checkNotNull(set)), str5, str6);
    }

    @ts2
    /* renamed from: Z2 */
    public static GoogleSignInAccount m8790Z2(@ts2 String str) throws JSONException {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount Y2 = m8789Y2(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has(FileProvider.f3290l) ? jSONObject.optString(FileProvider.f3290l) : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        Y2.f7298f = str2;
        return Y2;
    }

    /* renamed from: c3 */
    public static GoogleSignInAccount m8791c3(Account account, Set set) {
        return m8789Y2((String) null, (String) null, account.name, (String) null, (String) null, (String) null, (Uri) null, 0L, account.name, set);
    }

    @ts2
    /* renamed from: M2 */
    public String mo9201M2() {
        return this.f7297e;
    }

    @ts2
    /* renamed from: N2 */
    public String mo9202N2() {
        return this.f7296d;
    }

    @ts2
    /* renamed from: O2 */
    public String mo9203O2() {
        return this.f7301i;
    }

    @ts2
    /* renamed from: P2 */
    public String mo9204P2() {
        return this.f7300h;
    }

    @mr2
    /* renamed from: Q2 */
    public Set<Scope> mo9205Q2() {
        return new HashSet(this.f7291a);
    }

    @ts2
    /* renamed from: R2 */
    public String mo9206R2() {
        return this.f7294b;
    }

    @ts2
    /* renamed from: S2 */
    public String mo9207S2() {
        return this.f7295c;
    }

    @ts2
    /* renamed from: T2 */
    public Uri mo9208T2() {
        return this.f7290a;
    }

    @mr2
    @KeepForSdk
    /* renamed from: U2 */
    public Set<Scope> mo9209U2() {
        HashSet hashSet = new HashSet(this.f7291a);
        hashSet.addAll(this.f7292a);
        return hashSet;
    }

    @ts2
    /* renamed from: V2 */
    public String mo9210V2() {
        return this.f7298f;
    }

    @KeepForSdk
    /* renamed from: W2 */
    public boolean mo9211W2() {
        return f7289a.currentTimeMillis() / 1000 >= this.f7293b + -300;
    }

    @mr2
    @KeepForSdk
    @C7277xt
    /* renamed from: X2 */
    public GoogleSignInAccount mo9212X2(@mr2 Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.f7292a, scopeArr);
        }
        return this;
    }

    @mr2
    /* renamed from: a3 */
    public final String mo9213a3() {
        return this.f7299g;
    }

    @mr2
    /* renamed from: b3 */
    public final String mo9214b3() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (mo9206R2() != null) {
                jSONObject.put("id", mo9206R2());
            }
            if (mo9207S2() != null) {
                jSONObject.put("tokenId", mo9207S2());
            }
            if (mo9202N2() != null) {
                jSONObject.put("email", mo9202N2());
            }
            if (mo9201M2() != null) {
                jSONObject.put(FileProvider.f3290l, mo9201M2());
            }
            if (mo9204P2() != null) {
                jSONObject.put("givenName", mo9204P2());
            }
            if (mo9203O2() != null) {
                jSONObject.put("familyName", mo9203O2());
            }
            Uri T2 = mo9208T2();
            if (T2 != null) {
                jSONObject.put("photoUrl", T2.toString());
            }
            if (mo9210V2() != null) {
                jSONObject.put("serverAuthCode", mo9210V2());
            }
            jSONObject.put("expirationTime", this.f7293b);
            jSONObject.put("obfuscatedIdentifier", this.f7299g);
            JSONArray jSONArray = new JSONArray();
            List list = this.f7291a;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, n35.f17009a);
            for (Scope scopeUri : scopeArr) {
                jSONArray.put(scopeUri.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(@ts2 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f7299g.equals(this.f7299g) && googleSignInAccount.mo9209U2().equals(mo9209U2());
    }

    @ts2
    public Account getAccount() {
        String str = this.f7296d;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public int hashCode() {
        return ((this.f7299g.hashCode() + 527) * 31) + mo9209U2().hashCode();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f7302n);
        SafeParcelWriter.writeString(parcel, 2, mo9206R2(), false);
        SafeParcelWriter.writeString(parcel, 3, mo9207S2(), false);
        SafeParcelWriter.writeString(parcel, 4, mo9202N2(), false);
        SafeParcelWriter.writeString(parcel, 5, mo9201M2(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, mo9208T2(), i, false);
        SafeParcelWriter.writeString(parcel, 7, mo9210V2(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.f7293b);
        SafeParcelWriter.writeString(parcel, 9, this.f7299g, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.f7291a, false);
        SafeParcelWriter.writeString(parcel, 11, mo9204P2(), false);
        SafeParcelWriter.writeString(parcel, 12, mo9203O2(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
