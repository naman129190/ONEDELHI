package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.C3679ua;
import com.onedelhi.secure.C7277xt;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ry3;
import com.onedelhi.secure.ts2;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@KeepForSdk
@VisibleForTesting
public final class ClientSettings {
    @Nullable
    private final Account zaa;
    private final Set zab;
    private final Set zac;
    private final Map zad;
    private final int zae;
    @Nullable
    private final View zaf;
    private final String zag;
    private final String zah;
    private final ry3 zai;
    private Integer zaj;

    @KeepForSdk
    public static final class Builder {
        @Nullable
        private Account zaa;
        private C3679ua zab;
        private String zac;
        private String zad;
        private ry3 zae = ry3.f20125a;

        @mr2
        @KeepForSdk
        public ClientSettings build() {
            return new ClientSettings(this.zaa, this.zab, (Map) null, 0, (View) null, this.zac, this.zad, this.zae, false);
        }

        @mr2
        @KeepForSdk
        @C7277xt
        public Builder setRealClientPackageName(@mr2 String str) {
            this.zac = str;
            return this;
        }

        @mr2
        @C7277xt
        public final Builder zaa(@mr2 Collection collection) {
            if (this.zab == null) {
                this.zab = new C3679ua();
            }
            this.zab.addAll(collection);
            return this;
        }

        @mr2
        @C7277xt
        public final Builder zab(@Nullable Account account) {
            this.zaa = account;
            return this;
        }

        @mr2
        @C7277xt
        public final Builder zac(@mr2 String str) {
            this.zad = str;
            return this;
        }
    }

    @KeepForSdk
    public ClientSettings(@mr2 Account account, @mr2 Set<Scope> set, @mr2 Map<Api<?>, zab> map, int i, @Nullable View view, @mr2 String str, @mr2 String str2, @Nullable ry3 ry3) {
        this(account, set, map, i, view, str, str2, ry3, false);
    }

    public ClientSettings(@Nullable Account account, @mr2 Set set, @mr2 Map map, int i, @Nullable View view, @mr2 String str, @mr2 String str2, @Nullable ry3 ry3, boolean z) {
        this.zaa = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.zab = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.zad = map;
        this.zaf = view;
        this.zae = i;
        this.zag = str;
        this.zah = str2;
        this.zai = ry3 == null ? ry3.f20125a : ry3;
        HashSet hashSet = new HashSet(emptySet);
        for (zab zab2 : map.values()) {
            hashSet.addAll(zab2.zaa);
        }
        this.zac = Collections.unmodifiableSet(hashSet);
    }

    @mr2
    @KeepForSdk
    public static ClientSettings createDefault(@mr2 Context context) {
        return new GoogleApiClient.Builder(context).zaa();
    }

    @KeepForSdk
    @ts2
    public Account getAccount() {
        return this.zaa;
    }

    @KeepForSdk
    @ts2
    @Deprecated
    public String getAccountName() {
        Account account = this.zaa;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @mr2
    @KeepForSdk
    public Account getAccountOrDefault() {
        Account account = this.zaa;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @mr2
    @KeepForSdk
    public Set<Scope> getAllRequestedScopes() {
        return this.zac;
    }

    @mr2
    @KeepForSdk
    public Set<Scope> getApplicableScopes(@mr2 Api<?> api) {
        zab zab2 = (zab) this.zad.get(api);
        if (zab2 == null || zab2.zaa.isEmpty()) {
            return this.zab;
        }
        HashSet hashSet = new HashSet(this.zab);
        hashSet.addAll(zab2.zaa);
        return hashSet;
    }

    @KeepForSdk
    public int getGravityForPopups() {
        return this.zae;
    }

    @mr2
    @KeepForSdk
    public String getRealClientPackageName() {
        return this.zag;
    }

    @mr2
    @KeepForSdk
    public Set<Scope> getRequiredScopes() {
        return this.zab;
    }

    @KeepForSdk
    @ts2
    public View getViewForPopups() {
        return this.zaf;
    }

    @mr2
    public final ry3 zaa() {
        return this.zai;
    }

    @ts2
    public final Integer zab() {
        return this.zaj;
    }

    @ts2
    public final String zac() {
        return this.zah;
    }

    @mr2
    public final Map zad() {
        return this.zad;
    }

    public final void zae(@mr2 Integer num) {
        this.zaj = num;
    }
}
