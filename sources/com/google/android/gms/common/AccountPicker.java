package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.onedelhi.secure.C7277xt;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.ArrayList;
import java.util.List;

public final class AccountPicker {

    public static class AccountChooserOptions {
        /* access modifiers changed from: private */
        @ts2
        public Account zza;
        /* access modifiers changed from: private */
        public boolean zzb;
        /* access modifiers changed from: private */
        @ts2
        public ArrayList zzc;
        /* access modifiers changed from: private */
        @ts2
        public ArrayList zzd;
        /* access modifiers changed from: private */
        public boolean zze;
        /* access modifiers changed from: private */
        @ts2
        public String zzf;
        /* access modifiers changed from: private */
        @ts2
        public Bundle zzg;
        /* access modifiers changed from: private */
        public boolean zzh;
        /* access modifiers changed from: private */
        public int zzi;
        /* access modifiers changed from: private */
        @ts2
        public String zzj;
        /* access modifiers changed from: private */
        public boolean zzk;
        /* access modifiers changed from: private */
        @ts2
        public zza zzl;
        /* access modifiers changed from: private */
        @ts2
        public String zzm;
        /* access modifiers changed from: private */
        public boolean zzn;
        /* access modifiers changed from: private */
        public boolean zzo;

        public static class Builder {
            @ts2
            private Account zza;
            @ts2
            private ArrayList zzb;
            @ts2
            private ArrayList zzc;
            private boolean zzd = false;
            @ts2
            private String zze;
            @ts2
            private Bundle zzf;

            @mr2
            public AccountChooserOptions build() {
                Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
                Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
                AccountChooserOptions accountChooserOptions = new AccountChooserOptions();
                accountChooserOptions.zzd = this.zzc;
                accountChooserOptions.zzc = this.zzb;
                accountChooserOptions.zze = this.zzd;
                accountChooserOptions.zzl = null;
                accountChooserOptions.zzj = null;
                accountChooserOptions.zzg = this.zzf;
                accountChooserOptions.zza = this.zza;
                accountChooserOptions.zzb = false;
                accountChooserOptions.zzh = false;
                accountChooserOptions.zzm = null;
                accountChooserOptions.zzi = 0;
                accountChooserOptions.zzf = this.zze;
                accountChooserOptions.zzk = false;
                accountChooserOptions.zzn = false;
                accountChooserOptions.zzo = false;
                return accountChooserOptions;
            }

            @mr2
            @C7277xt
            public Builder setAllowableAccounts(@ts2 List<Account> list) {
                this.zzb = list == null ? null : new ArrayList(list);
                return this;
            }

            @mr2
            @C7277xt
            public Builder setAllowableAccountsTypes(@ts2 List<String> list) {
                this.zzc = list == null ? null : new ArrayList(list);
                return this;
            }

            @mr2
            @C7277xt
            public Builder setAlwaysShowAccountPicker(boolean z) {
                this.zzd = z;
                return this;
            }

            @mr2
            @C7277xt
            public Builder setOptionsForAddingAccount(@ts2 Bundle bundle) {
                this.zzf = bundle;
                return this;
            }

            @mr2
            @C7277xt
            public Builder setSelectedAccount(@ts2 Account account) {
                this.zza = account;
                return this;
            }

            @mr2
            @C7277xt
            public Builder setTitleOverrideText(@ts2 String str) {
                this.zze = str;
                return this;
            }
        }
    }

    private AccountPicker() {
    }

    @mr2
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent newChooseAccountIntent(@ts2 Account account, @ts2 ArrayList<Account> arrayList, @ts2 String[] strArr, boolean z, @ts2 String str, @ts2 String str2, @ts2 String[] strArr2, @ts2 Bundle bundle) {
        Intent intent = new Intent();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        return intent;
    }

    @mr2
    public static Intent newChooseAccountIntent(@mr2 AccountChooserOptions accountChooserOptions) {
        Intent intent = new Intent();
        boolean unused = accountChooserOptions.zzk;
        String unused2 = accountChooserOptions.zzj;
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        zza unused3 = accountChooserOptions.zzl;
        Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
        boolean unused4 = accountChooserOptions.zzb;
        Preconditions.checkArgument(true, "Making the selected account non-clickable is only supported for the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes");
        boolean unused5 = accountChooserOptions.zzk;
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", accountChooserOptions.zzc);
        if (accountChooserOptions.zzd != null) {
            intent.putExtra("allowableAccountTypes", (String[]) accountChooserOptions.zzd.toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", accountChooserOptions.zzg);
        intent.putExtra("selectedAccount", accountChooserOptions.zza);
        boolean unused6 = accountChooserOptions.zzb;
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", accountChooserOptions.zze);
        intent.putExtra("descriptionTextOverride", accountChooserOptions.zzf);
        boolean unused7 = accountChooserOptions.zzh;
        intent.putExtra("setGmsCoreAccount", false);
        String unused8 = accountChooserOptions.zzm;
        intent.putExtra("realClientPackage", (String) null);
        int unused9 = accountChooserOptions.zzi;
        intent.putExtra("overrideTheme", 0);
        boolean unused10 = accountChooserOptions.zzk;
        intent.putExtra("overrideCustomTheme", 0);
        String unused11 = accountChooserOptions.zzj;
        intent.putExtra("hostedDomainFilter", (String) null);
        Bundle bundle = new Bundle();
        boolean unused12 = accountChooserOptions.zzk;
        zza unused13 = accountChooserOptions.zzl;
        boolean unused14 = accountChooserOptions.zzn;
        boolean unused15 = accountChooserOptions.zzo;
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
